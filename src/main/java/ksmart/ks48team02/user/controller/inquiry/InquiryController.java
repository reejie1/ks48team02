package ksmart.ks48team02.user.controller.inquiry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("userInquiryController")
@RequestMapping("/user/inquiry")
public class InquiryController {
    // 1:1문의
    @GetMapping(value = {"","/"})
    public String userInquiryMainPage(){

        return "user/inquiry/main";
    }

    // 신고하기
    @GetMapping("/report")
    public String userReportMainPag(){

        return "user/inquiry/report";
    }

    // 플로키 문의하기
    @GetMapping("/add")
    public String userFlockyInquiryPage(){

        return "user/inquiry/add";
    }

    //스토어 문의하기
    @GetMapping("/store")
    public String userStoreInquiryPage(){

        return "user/inquiry/store";
    }
}
