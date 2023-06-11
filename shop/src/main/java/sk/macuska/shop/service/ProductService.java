package sk.macuska.shop.service;

import org.springframework.data.domain.Page;
import sk.macuska.shop.model.TShirt;

import java.util.List;

public interface ProductService {

    List<TShirt> getAllProducts();

    Page<TShirt> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
