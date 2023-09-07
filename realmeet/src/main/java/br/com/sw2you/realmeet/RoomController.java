package br.com.sw2you.realmeet;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController("/room")
public class RoomController {

    @GetMapping
    public CompletableFuture<ResponseEntity<Room>> listRoom(@Validated Long id){
        Room r1 = new Room();
        r1.setId(1L);
        r1.setNome("ROOM #1");
       return CompletableFuture.supplyAsync(() -> ResponseEntity.ok(r1));
    }
}
