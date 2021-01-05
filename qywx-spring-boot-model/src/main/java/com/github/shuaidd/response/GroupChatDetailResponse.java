package com.github.shuaidd.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.shuaidd.dto.GroupChatDetail;

/**
 * 描述
 *
 * @author ddshuai
 * @date 2021-01-05 21:06
 **/
public class GroupChatDetailResponse extends AbstractBaseResponse {

    @JsonProperty("group_chat")
    private GroupChatDetail detail;

    public GroupChatDetail getDetail() {
        return detail;
    }

    public void setDetail(GroupChatDetail detail) {
        this.detail = detail;
    }
}
