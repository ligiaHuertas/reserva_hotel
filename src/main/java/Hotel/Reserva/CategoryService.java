/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel.Reserva;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * Maria Ligia Huertas
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getAll(){
        return categoryRepository.getAll();
        
    }
    public Optional<Category> getCategory(int categoryid){
        return categoryRepository.getCategory(categoryid);
    
    }
    public Category save(Category category){
        if(category.getId()==null){
            return categoryRepository.save(category);  
        }else{
            Optional<Category> categoria=categoryRepository.getCategory(category.getId());
            if(categoria.isEmpty()){
                return categoryRepository.save(category);
                
            }else{
                return category;
            
            }
        }
    
    }
    public Category update(Category category){
        if(category.getId()!=null){
            Optional<Category>g=categoryRepository.getCategory(category.getId());
            if(!g.isEmpty()){
                if(category.getDescription()!=null){
                    g.get().setDescription(category.getDescription());
                }
                if(category.getName()!=null){
                    g.get().setName(category.getName());
                }
                return categoryRepository.save(g.get());
            }
        }
        return category;
        
    }
    public boolean deletecategory(int categoryId){
        Boolean dBoolean=getCategory(categoryId).map(category -> {
            categoryRepository.delete(category);
            return true;
        }).orElse(false);
        return dBoolean;
    }
    
    
}


