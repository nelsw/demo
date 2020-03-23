package io.siliconswamp.aladin.api.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "pools")
public class UserEntity {

	@Id
	private String id;

	private String email;

	private String subDomain;

	private Integer time;

}
