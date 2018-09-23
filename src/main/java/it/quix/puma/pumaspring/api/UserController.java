package it.quix.puma.pumaspring.api;

import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

import it.quix.puma.pumaspring.dto.SearchUserDTO;
import it.quix.puma.pumaspring.dto.UserDTO;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @GetMapping(path = "")
    public Set<UserDTO> searchUser(SearchUserDTO searchUserDTO) {
        throw new NotYetImplementedException("");
    }

    @PostMapping(path = "")
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        throw new NotYetImplementedException("");
    }

    @PutMapping(path = "/{id}")
    public UserDTO updateUser(@PathVariable(name = "id") String id, @RequestBody UserDTO newUserDTO) {
        throw new NotYetImplementedException("");
    }

    @DeleteMapping(path = "/{id}")
    public void deleteUser(@PathVariable(name = "id") String id) {

    }

}


