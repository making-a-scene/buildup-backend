package buildup.buildupback.domain.user;

import lombok.Getter;

@Getter
public enum Role {
    ROLE_MEMBER("ROLE_MEMBER"),
    ROLE_ADMIN("ROLE_ADMIN");
    private final String value;
    Role(String value) {
        this.value = value;
    }
}
