package ksmart.ks48team02.common.mapper.order;


import ksmart.ks48team02.common.dto.OrderTotal;
import ksmart.ks48team02.common.dto.RewardOrderDetail;
import ksmart.ks48team02.user.dto.RewardOption;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {
    // 주문 목록 조회
    public List<OrderTotal> getOrderList(Map<String, Object> paramMap);

    // 전체 주문 목록 행 조회
    public int getOrderCnt(Map<String, Object> paramMap);

    // 특정 주문 조회
    public OrderTotal getOrderInfoById(String orderCode);

    // 주문 코드에 따른 주문 상세 조회
    public List<RewardOrderDetail> getRewardOptionByOrderCode(String orderCode);

}
