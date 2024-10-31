package q5.example.demo.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import q5.example.demo.Service.TestService;

@RequestMapping("/API/V1/Test")
@RequiredArgsConstructor
@RestController
public class TestController {
    private TestService testService;
}
