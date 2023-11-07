package ksmart.ks48team02.user.controller;

import ksmart.ks48team02.admin.dto.TotalCategory;
import ksmart.ks48team02.admin.mapper.TotalCategoryMapper;
import ksmart.ks48team02.admin.service.TotalCategoryService;
import ksmart.ks48team02.user.dto.donation.DonationRegistration;
import ksmart.ks48team02.user.service.donation.DonationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user/projectRegistration")
public class PojectRegistrationContoller {

    private final DonationService donationService;
    private final TotalCategoryService totalCategoryService;

    public PojectRegistrationContoller(DonationService donationService, TotalCategoryService totalCategoryService){
        this.donationService = donationService;
        this.totalCategoryService = totalCategoryService;
    }

    //프로젝트 등록 메인 페이지
    @GetMapping(value = {"" , "/"})
    public String mainPage(Model model) {

        return "user/projectRegistration/main";
    }

    //리워드 프로젝트 등록 페이지
    @GetMapping(value = {"/reward"})
    public String rewardRegistrationPage(Model model) {

        List<TotalCategory> categoryList = totalCategoryService.categoryByPatition("reward");

        model.addAttribute("categoryList",categoryList);


        return "user/projectRegistration/reward/reward_insert";
    }
    //투자 프로젝트 등록 페이지


    // 기부 프로젝트 완료 포스트맵핑으로 받기
    @PostMapping("/donation")
    public String donationRegistrationPage(DonationRegistration donationRegistration){
        donationService.addDonation(donationRegistration);
        return "redirect:/user/projectRegistration/donation/success";
    }
    // 기부 프로젝트 완료 페이지
    @GetMapping("/donation/success")
    public String donationRegistrationSuccessPage(){
        return "user/projectRegistration/donation/donation_insert_success";
    }
    // 기부 프로젝트 등록 폼
    @GetMapping("/donation")
    public String donationRegistrationPage(Model model) {
        List<TotalCategory> categoryList = totalCategoryService.categoryByPatition("donation");
        model.addAttribute("categoryList",categoryList);

        return "user/projectRegistration/donation/donation_insert";
    }

}