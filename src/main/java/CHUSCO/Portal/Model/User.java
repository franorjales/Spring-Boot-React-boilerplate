package CHUSCO.Portal.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "modifiedAt", "createdBy", "createdAt"}, 
        allowGetters = true)
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;
	
	@NotBlank
	private String userName;
	
	@NotBlank
	private String userBirthday;
	
    @Column(nullable = false, updatable = false)
	private String createdBy;
    
    @Column(nullable = false)
	private String modifiedBy;
    
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
	private Date createdAt;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
	private Date modifiedAt;
	
	/**
	 * @return the idUser
	 */
	public Long getIdUser() {
		return idUser;
	}

	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userBirthday
	 */
	public String getUserBirthday() {
		return userBirthday;
	}

	/**
	 * @param userBirthday the userBirthday to set
	 */
	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the modifiedAt
	 */
	public Date getModifiedAt() {
		return modifiedAt;
	}

	/**
	 * @param modifiedAt the modifiedAt to set
	 */
	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	
}
