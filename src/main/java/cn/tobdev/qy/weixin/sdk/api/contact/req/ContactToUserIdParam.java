package cn.tobdev.qy.weixin.sdk.api.contact.req;

import java.io.Serializable;

import lombok.Data;

/**
 *
 *
 * @author : Hui.Wang [huzi.wh@gmail.com]
 * @version : 1.0
 * @date  : 2021/6/5
 */
@Data
public class ContactToUserIdParam implements Serializable {
  private String openid;
}
