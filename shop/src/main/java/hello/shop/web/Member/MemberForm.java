package hello.shop.web.Member;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수 입니다.")
    private String name;

    @NotEmpty(message = "회원 아이디는 필수 입니다.")
    private String userId;

    @NotEmpty(message = "회원 비밀번호는 필수 입니다.")
    private String password;

    private String city;
    private String street;
    private String zipcode;
}
