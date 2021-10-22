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
public class RoomRepository {
    @Autowired    
    private RoomInterface RoomCrud;
    
    public List<Room> getAll(){
        return (List<Room>) RoomCrud.findAll();
        
    }
    public Optional<Room> getRoom(int id){
        return RoomCrud.findById(id);
    
    }
    public Room save(Room room){
        return RoomCrud.save(room);
    
    }
    public void delete(Room room){
        RoomCrud.delete(room);
    
    }
    
}

