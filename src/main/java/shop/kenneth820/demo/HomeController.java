<<<<<<< HEAD
package shop.kenneth820.demo;  // 패키지명 꼭 맞춰야 함
=======
package shop.kenneth820.demo;
>>>>>>> a54a166 (Implement real CI: Java setup and Maven build)

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

<<<<<<< HEAD
    @GetMapping("/")  // 루트 경로 요청 처리
    public String home() {
        return "index";  // templates/index.html 반환
=======
    @GetMapping("/")
    public String home() {
        return "index";   // resources/templates/index.html 연결
>>>>>>> a54a166 (Implement real CI: Java setup and Maven build)
    }
}
