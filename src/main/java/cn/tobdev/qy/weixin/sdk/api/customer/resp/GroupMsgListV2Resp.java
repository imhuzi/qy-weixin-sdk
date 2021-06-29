package cn.tobdev.qy.weixin.sdk.api.customer.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import cn.tobdev.qy.weixin.sdk.api.customer.dto.GroupMsgListDto;
import cn.tobdev.qy.weixin.sdk.common.RespStatus;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/29
 */
@Getter
@Setter
@ToString
public class GroupMsgListV2Resp  extends RespStatus implements Serializable {

  /**
   * nextCursor
   */
  @JsonProperty("next_cursor")
  private String nextCursor;

  /**
   * groupMsgList
   */
  @JsonProperty("group_msg_list")
  private List<GroupMsgListDto> groupMsgList;
}
