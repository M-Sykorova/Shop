package sk.macuska.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import sk.macuska.shop.model.TShirt;
import sk.macuska.shop.repository.TShirtRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final TShirtRepository tShirtRepository;

    @Autowired
    public ProductServiceImpl(TShirtRepository tShirtRepository) {
        this.tShirtRepository = tShirtRepository;
    }

    @Override
    public List<TShirt> getAllProducts() {
        return tShirtRepository.findAll();
    }

    @Override
    public Page<TShirt> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() : Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(pageNo -1, pageSize, sort);
        return this.tShirtRepository.findAll(pageable);
    }

}
