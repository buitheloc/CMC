package cmc.com.vn.rest.response;

import lombok.*;

@Builder
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserInfoResponse {
    private String id;
    private String userId;
    private String userCode;
	private String userName;
	private String password;
}
