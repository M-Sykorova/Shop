package sk.macuska.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import sk.macuska.shop.model.TShirt;
import sk.macuska.shop.service.ProductService;

import java.util.List;

@Controller
public class ShopController {

    @Autowired
    private ProductService productService;

    @GetMapping("/shop")
    public String mainShopPage(Model model){
        return findPaginated(1, "name", "asc", model);
    }

    @GetMapping("/shop/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
                                @RequestParam("sortField") String sortField,
                                @RequestParam("sortDir") String sortDir,
                                Model model){
        int pageSize = 5;

        Page<TShirt> page = productService.findPaginated(pageNo, pageSize, sortField, sortDir);
        List<TShirt> tShirts = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDirection", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
        model.addAttribute("tShirts", tShirts);
        return "index";
    }


}
