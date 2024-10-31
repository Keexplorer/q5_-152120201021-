package q5.example.demo.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import q5.example.demo.Repository.TestRepository;

@RequiredArgsConstructor
@Service
public class TestService {
    private final TestRepository testRepository;
}
