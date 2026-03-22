package shop.kenneth820.demo;  // 패키지명 꼭 맞춰야 함

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")  // 루트 경로 요청 처리
    public String home() {
        return "index";   // resources/templates/index.html 연결
    }
}
