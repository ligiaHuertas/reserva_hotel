/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel.Reserva;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * Maria Ligia Huertas
 */
@Repository
public class CategoryRepository {
    @Autowired
    private CategoryInterface categoryCrud;
    
    public List<Category> getAll(){
       return (List<Category>)categoryCrud.findAll();
    
    }
    public Optional<Category> getCategory(int id){
        return categoryCrud.findById(id);
    
    }
    public Category save (Category category){
        return categoryCrud.save(category);
    
    }
    public void delete (Category category){
        categoryCrud.delete(category);
        
    
    }
    
}


