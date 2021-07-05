package com.example.tech.interview.receptcontroller.service.utils.bean;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ActionsType {

	boolean isFinalYes = false;
	boolean isPartialYes= false;
	boolean closeSession = false;
	
}
