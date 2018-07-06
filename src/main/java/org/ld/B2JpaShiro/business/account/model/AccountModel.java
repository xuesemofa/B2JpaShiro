package org.ld.B2JpaShiro.business.account.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
@Entity
@Table(name = "account_table")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountModel implements Serializable {
    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "uuid", columnDefinition = "char(32)")
    private String uuid;

    @NotBlank(message = "账户不能为空")
    @Size(min = 6, max = 32, message = "账户长度为6-32位")
    @Email(message = "账户不是标准的email格式")
    @Column(name = "account", columnDefinition = "varchar(32)")
    private String account;

    @NotBlank(message = "密码不能为空")
    @Size(min = 6, max = 32, message = "密码长度为6-32位")
    @Pattern(regexp = "^[a-zA-Z0-9_-]$", message = "密码可以是字母、数字、下划线、－")
    @Column(name = "password", columnDefinition = "varchar(32)")
    private String password;

    @Column(name = "register_times", columnDefinition = "bigint(20)")
    private long registerTimes;

    @Column(name = "is_login", columnDefinition = "char(1)")
    private String isLogin;

    @Column(name = "types", columnDefinition = "char(10)")
    private String types;

    @Version
    private long version;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegisterTimes() {
        return registerTimes;
    }

    public void setRegisterTimes(long registerTimes) {
        this.registerTimes = registerTimes;
    }

    public String getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(String isLogin) {
        this.isLogin = isLogin;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public AccountModel() {
        super();
    }

    public AccountModel(String uuid, @NotBlank(message = "账户不能为空") @Size(min = 6, max = 32, message = "账户长度为6-32位") @Email(message = "账户不是标准的email格式") String account, @NotBlank(message = "密码不能为空") @Size(min = 6, max = 32, message = "密码长度为6-32位") @Pattern(regexp = "^[a-zA-Z0-9_-]$", message = "密码可以是字母、数字、下划线、－") String password, long registerTimes, String isLogin, String types, long version) {
        this.uuid = uuid;
        this.account = account;
        this.password = password;
        this.registerTimes = registerTimes;
        this.isLogin = isLogin;
        this.types = types;
        this.version = version;
    }

    @Override
    public String toString() {
        return "AccountModel{" +
                "uuid='" + uuid + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", registerTimes=" + registerTimes +
                ", isLogin='" + isLogin + '\'' +
                ", types='" + types + '\'' +
                ", version=" + version +
                '}';
    }
}
