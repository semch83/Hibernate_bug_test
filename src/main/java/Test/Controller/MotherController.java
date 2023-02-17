package Test.Controller;

import Test.Entities.Mother;
import Test.repository.MotherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MotherController {
    final MotherRepository repository;

    @GetMapping("/inheritors/{id}")
    public Mother get(@PathVariable int id) {
        return repository.findById(id).orElseThrow(NumberFormatException::new);
    }
}