package com.example.tech.interview.receptcontroller.service.utils.bean;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class AnswerBean {

	private boolean isNewClient = false;

	private AnswerTypeEnum isFinalInternalStep = AnswerTypeEnum.ND; // true - false - NotDefined
	
	private boolean isFinalExternalResponse = false;

	private boolean isExternalPersistent = false; // Persist session
	
	private boolean isInternalPersistent = false; // you are in the middle of a MOP order
	
	private boolean isSimpleOrder = false;

	private AnswerTypeEnum isOk = AnswerTypeEnum.ND; // true - false - NotDefined
	
	private boolean isMultiple = false;

}
