package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "passage")
public class Room1Service implements RoomService {

    public String entreeSalle() {
        return "Bravo, vous avez trouvé la deuxième salle !";
    }

}
