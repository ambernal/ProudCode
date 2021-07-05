package com.example.tech.interview.receptcontroller.service.impl;

import org.springframework.stereotype.Service;
import com.example.tech.interview.receptcontroller.service.utils.bean.ActionsType;
import com.example.tech.interview.receptcontroller.service.utils.bean.AnswerBean;
import com.example.tech.interview.receptcontroller.service.utils.bean.InputVarsEnum;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AnswersHandlingServiceImpl implements AnswersHandlingService {


	@Override
	public ActionsType chooseActions(final AnswerBean answerBean) {

		LOGGER.debug("chooseActions->");
		final ActionsType actionsType = ActionsType.builder().build();


		LOGGER.debug("Search options to combination");
		InputVarsEnum enumVar = InputVarsEnum.asForCombinationVars(answerBean.isExternalPersistent(),
		answerBean.isInternalPersistent(), answerBean.isFinalExternalResponse(), answerBean.getIsFinalInternalStep().name(), 
		answerBean.getIsOk().name());

		if (enumVar != null && enumVar.name() != null) {
			LOGGER.debug("Combination choosen: " + enumVar.name());

			actionsType.setCloseSession(enumVar.isCloseSession());
			if (enumVar.getYesType().equalsIgnoreCase("partial")) {
				actionsType.setFinalYes(false);
				actionsType.setPartialYes(true);
			} else {
				actionsType.setFinalYes(true);
				actionsType.setPartialYes(false);
			}
		} else {
			LOGGER.info("Combination dont exist ");
		}
		LOGGER.debug("<-chooseActions");
		return actionsType;

	}



}
