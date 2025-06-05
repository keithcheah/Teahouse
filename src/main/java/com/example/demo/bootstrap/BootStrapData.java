package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }
        */


        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        if (productRepository.count() == 0 && partRepository.count() == 0 && outsourcedPartRepository.count() == 0) {
            //5 parts
            List<OutsourcedPart> outsourcedParts = new ArrayList<OutsourcedPart>();
            outsourcedParts.add(new OutsourcedPart("Dragon Pearl Jasmine Yunan 2023", 5.00, 100));
            outsourcedParts.add(new OutsourcedPart("First Flush Darjeeling 2021", 5.00, 100));
            outsourcedParts.add(new OutsourcedPart("White Peony (Bai Mu Dan) Fujian 2024", 5.00, 100));
            outsourcedParts.add(new OutsourcedPart("Baozhong (Pouchong) Taipei 2022", 5.00, 100));
            outsourcedParts.add(new OutsourcedPart("Honey Orchid Dancong Oolong Guangdong 2022", 5.00, 100));
            outsourcedPartRepository.saveAll(outsourcedParts);


            //5 products
            List<Product> products = new ArrayList<Product>();
            products.add(new Product("Green Tea Service", 20.00, 50));
            products.add(new Product("Black Tea Service", 20.00, 50));
            products.add(new Product("White Tea Service", 20.00, 50));
            products.add(new Product("Pu Erh Tea Service", 20.00, 50));
            products.add(new Product("Oolong Tea Service", 20.00, 50));
            productRepository.saveAll(products);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
