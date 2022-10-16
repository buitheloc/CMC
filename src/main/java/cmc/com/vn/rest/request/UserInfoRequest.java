package cmc.com.vn.rest.request;

import lombok.*;

@Builder
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserInfoRequest {
    private String id;
    private String userId;
    private String userCode;
	private String userName;
	private String password;
}
