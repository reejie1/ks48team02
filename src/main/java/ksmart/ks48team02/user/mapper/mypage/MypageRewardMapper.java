package ksmart.ks48team02.user.mapper.mypage;

import ksmart.ks48team02.user.dto.MypageReward;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MypageRewardMapper {

    //리워드 주문, 결제 정보 조회.
    public MypageReward rewardOrderInfo (String orderCode);

    //리워드 주문 취소,환불,교환 시 주문 테이블 업데이트
    public int orderCategoryChange(MypageReward orderInfo);

    //리워드 주문 취소,환불 시 환불 테이블 인서트
    public int refundInsert(MypageReward orderInfo);

    //리워드 주문 취소,환불,교환 시 결제 테이블 업데이트
    public int paymentUpdate(MypageReward orderInfo);

    //프로젝트 달성금액, 달성률 업데이트
    public int projectAchievementMoney(MypageReward orderInfo);

    //포인트 사용내역 업데이트
    public int returnPointLogInsert(MypageReward orderInfo);

    //주문 취소 시 포인트 되돌려주기, 주문 확정시 포인트 적립
    public int customerPoint(MypageReward orderInfo);

    //사용한 쿠폰 되돌려주기
    public int couponReturn(MypageReward orderInfo);

    //주문 확정 시 주문확정 로그 테이블 update
    public int orderConfirmLogUpdate(MypageReward orderInfo);

    //적립률 조회
//    public double savingPointRate(MypageReward orderInfo);

    //주문 확정 시 플로버 적립
    public int cumstomerFolver(MypageReward orderInfo);

    //플로버 적립 내역 인서트
    public int savingFloverLogInsert(MypageReward orderInfo);




}
