package net.polyv.live.service.interactive;

import net.polyv.live.bean.request.interactive.GetChannelLotteryRecordRequest;
import net.polyv.live.bean.request.interactive.GetChannelQuestionnaireListRequest;
import net.polyv.live.bean.request.interactive.GetCheckInsRequest;
import net.polyv.live.bean.request.interactive.GetCheckResultRequest;
import net.polyv.live.bean.request.interactive.GetQuestionnaireDetailsRequest;
import net.polyv.live.bean.request.interactive.GetWinnerDetailRequest;
import net.polyv.live.bean.request.interactive.GiveLikeRequest;
import net.polyv.live.bean.request.interactive.SendRewardMessageRequest;
import net.polyv.live.bean.request.interactive.SetChannelQuestionnaireRequest;
import net.polyv.live.bean.request.interactive.SetLotteryWinnersRequest;
import net.polyv.live.bean.result.PolyvLiveCommonResult;

/**
 * 直播互动 Service
 * @author lamdaer
 * @createTime 2020/5/6
 */
public interface PolyvLiveInteractiveService {
    
    /**
     * 获取频道抽奖记录列表
     * @param request 请求
     * @return 查询结果
     */
    PolyvLiveCommonResult getLotteryRecord(GetChannelLotteryRecordRequest request);
    
    /**
     * 获取频道单场抽奖的中奖记录
     * @param request
     * @return 查询结果
     */
    PolyvLiveCommonResult getWinnerDetail(GetWinnerDetailRequest request);
    
    /**
     * 发送点赞
     * @param request
     * @return 响应结果
     */
    PolyvLiveCommonResult giveLike(GiveLikeRequest request);
    
    /**
     * 发送打赏消息
     * @param request
     * @return 响应结果
     */
    PolyvLiveCommonResult sendRewardMessage(SendRewardMessageRequest request);
    
    /**
     * 查询频道问卷详情
     * http://dev.polyv.net/2019/liveproduct/l-api/zbhd/get-questionnaire-detail/
     * @param request
     * @return 查询结果
     */
    PolyvLiveCommonResult getDetailsQuestionnaire(GetQuestionnaireDetailsRequest request);
    
    /**
     * 查询频道问卷列表
     * http://dev.polyv.net/2019/liveproduct/l-api/zbhd/list-questionaire/
     * @param request
     * @return 查询结果
     */
    PolyvLiveCommonResult getChannelQuestionnaireList(GetChannelQuestionnaireListRequest request);
    
    /**
     * 设置抽奖中奖者信息
     * http://dev.polyv.net/2019/liveproduct/l-api/zbhd/tjzjxx/
     * @param request
     * @return PolyvLiveCommonResult
     */
    PolyvLiveCommonResult setLotteryWinners(SetLotteryWinnersRequest request);
    
    /**
     * 设置频道问卷信息
     * http://dev.polyv.net/2019/liveproduct/l-api/zbhd/add-edit-questionnaire/
     * @param request
     * @return
     */
    PolyvLiveCommonResult setChannelQuestionnaire(SetChannelQuestionnaireRequest request);
    
    /**
     * 查询签到结果
     * http://dev.polyv.net/2018/liveproduct/l-api/zbhd/checkin-list/
     * @param resultRequest
     * @return
     */
    PolyvLiveCommonResult getCheckResultRequest(GetCheckResultRequest resultRequest);
    
    /**
     * 查询指定签到ID的签到记录
     * https://dev.polyv.net/2019/liveproduct/l-api/zbhd/get-checkin/
     * @param getCheckInsRequest
     * @return
     */
    PolyvLiveCommonResult getCheckIns(GetCheckInsRequest getCheckInsRequest);
    
    
}
