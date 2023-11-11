package ksmart.ks48team02.user.dto;


import ksmart.ks48team02.user.dto.RewardOption;
import lombok.Data;

import java.util.List;

@Data
public class RewardProject {

    private String rewardProjectCode;
    private String rewardCategoryCode;
    private String projectJudgementReasonCode;
    private String RegMemberId;
    private String adminMemberId;
    private String storeCode;
    private String projectSubject;
    private String projectContents;
    private int rewardLike;
    private String projectThumbnailImage;
    private int projectAchievementMoney;
    private int projectGoalMoney;
    private int projectAchievementPercent;
    private String RegCompany;
    private String projectRegDate;
    private int searchCount;
    private String projectJudgmentReason;
    private String projectJudgementDate;
    private String projectStartDate;
    private String projectEndDate;
    private int projectCondition;

    private List<RewardOption> rewardOptionList;

}