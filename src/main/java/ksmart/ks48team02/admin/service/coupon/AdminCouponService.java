package ksmart.ks48team02.admin.service.coupon;

import ksmart.ks48team02.admin.dto.coupon.Coupon;
import ksmart.ks48team02.admin.mapper.coupon.AdminCouponMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminCouponService {
    // DI 의존성
    private final AdminCouponMapper adminCouponMapper;
    public Coupon getCouponCodeById;

    // 생성자 메소드를 통한 DI
    public AdminCouponService(AdminCouponMapper adminCouponMapper){
        this.adminCouponMapper = adminCouponMapper;
    }

    // 쿠폰 목록
    public List<Coupon> getCouponList(){
        List<Coupon> couponList = adminCouponMapper.getCouponList();

        return couponList;
    }

    // 쿠폰 수정
    public Coupon getCouponCodeById(String CouponCode){
        Coupon coupon = adminCouponMapper.getCouponCodeById(CouponCode);
        
        return coupon;
    }
    
}
