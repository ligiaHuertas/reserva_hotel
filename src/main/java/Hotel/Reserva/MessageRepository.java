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
 * Maria LIgia Huertas
 */
@Repository
public class MessageRepository {
     @Autowired
    private MessageInterface messageCrud;
    
    public List<Message> getAll(){
       return (List<Message>) messageCrud.findAll();
    
    }
    public Optional<Message> getMessage(int id){
        return messageCrud.findById(id);
    
    }
    public Message save (Message message){
        return messageCrud.save(message);
    
    }
    public void delete (Message message){
        messageCrud.delete(message);
        
    
    }
    
}
