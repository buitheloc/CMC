package cmc.com.vn.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_info")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class UserInfoEntity extends Audit<String> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "user_code")
	private String userCode;
	
	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_type")
	private String userType;

	@Column(name = "identity_type")
	private String identityType;

	@Column(name = "identity_number")
	private String identityNumber;

	@Column(name = "date_of_identity")
	private String dateOfIdentity;

	@Column(name = "issued_by_identity")
	private String issuedByIdentity;

	@Column(name = "department")
	private String department;

	@Column(name = "branch")
	private String branch;
	
	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "authentication")
	private String authentication;

	@Column(name = "user_status")
	private Integer userStatus;

	@Column(name = "channel_init")
	private String channelInit;

	@Column(name = "position")
	private String position;
	
}
