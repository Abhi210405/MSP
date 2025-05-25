import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.msp.construction.model.ContactMessage;
import com.msp.construction.service.ContactService;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/send")
    public ResponseEntity<String> sendContactMessage(@RequestBody ContactMessage contactMessage) {
        contactService.saveContactMessage(contactMessage);
        return ResponseEntity.ok("Contact message sent successfully!");
    }
}