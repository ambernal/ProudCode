package com.example.tech.interview.receptcontroller.service.utils.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InputVarsEnum {
    
	 

	 
	//ExternalPersistent , InternalPersistent , FinalExternalStep ,isFinalInternalStep , ok , closeSession , yesType
	CASE_4 (true, false, true, Constants.ND, Constants.TRUE,true,  Constants.FINAL),
	CASE_5 (true, false, true, Constants.TRUE,Constants.FALSE, false,  Constants.FINAL),
	CASE_6 (true, false, true, Constants.FALSE,Constants.ND, false,  Constants.PARTIAL),
	CASE_7 (true, true, true, Constants.TRUE,Constants.TRUE, true,  Constants.FINAL),
	CASE_8 (true, true, true, Constants.ND,Constants.TRUE, false,  Constants.PARTIAL),
	CASE_9 (true, true, true, Constants.TRUE,Constants.FALSE, false,  Constants.FINAL),
	CASE_10 (true, true, true, Constants.FALSE,Constants.ND, false,  Constants.PARTIAL),
	CASE_11 (true, false, false, Constants.ND,Constants.TRUE, false,  Constants.FINAL),
	CASE_12 (true, false, false, Constants.TRUE,Constants.FALSE, false,  Constants.FINAL),
	CASE_13 (true, false, false, Constants.FALSE,Constants.ND, false,  Constants.PARTIAL),
	CASE_14 (true, true, false, Constants.ND,Constants.TRUE, false,  Constants.FINAL),
	CASE_15 (true, true, false, Constants.TRUE,Constants.FALSE, false,  Constants.FINAL),
	CASE_16 (true, true, false, Constants.FALSE,Constants.ND, false,  Constants.PARTIAL),
	CASE_17 (false, false, false, Constants.TRUE,Constants.FALSE, true,  Constants.FINAL),
	CASE_18 (false, false, false, Constants.ND,Constants.TRUE, true,  Constants.FINAL),
	CASE_19 (false, false, false, Constants.FALSE,Constants.ND, false,  Constants.PARTIAL),
	CASE_20 (false, true, false, Constants.ND, Constants.FALSE, true,  Constants.FINAL),
	CASE_21 (false, true, false, Constants.TRUE,Constants.TRUE, true,  Constants.FINAL),
	CASE_22 (false, true, false, Constants.ND, Constants.TRUE,false,  Constants.PARTIAL),
	CASE_23 (false, true, false, Constants.FALSE,Constants.ND, false,  Constants.PARTIAL),
	CASE_24 (false, false, true, Constants.ND,Constants.FALSE, false,  Constants.FINAL),
	CASE_25 (false, false, true, Constants.ND, Constants.TRUE,true,  Constants.FINAL),
	CASE_26 (false, false, true, Constants.FALSE,Constants.ND, false,  Constants.PARTIAL),
	CASE_27 (false, true, true, Constants.TRUE,Constants.FALSE, false,  Constants.FINAL),
	CASE_28 (false, true, true, Constants.TRUE,Constants.TRUE, true,  Constants.FINAL),
	CASE_29 (false, true, true, Constants.ND, Constants.TRUE,false, Constants.PARTIAL),
	CASE_30 (false, true, true, Constants.FALSE,Constants.ND, false, Constants.PARTIAL);
	
	
	boolean isExternalPersistent;
	boolean isInternalPersistent;
	boolean isFinalExternalStep;
	String finalInternalStep;
	String ok;
	boolean closeSession;
	String yesType;
	
	
	public static InputVarsEnum asForCombinationVars(boolean isExternalPersistent, boolean isInternalPersistent, boolean isFinalExternalStep, String finalInternalStep, String ok) {
        if(finalInternalStep ==null || ok ==null) return null;

        for (InputVarsEnum value : InputVarsEnum.values()) {
            if (value.isExternalPersistent()==isExternalPersistent && 
        		value.isInternalPersistent()==isInternalPersistent &&
        		value.isFinalExternalStep()==isFinalExternalStep &&
        		value.getFinalInternalStep().equalsIgnoreCase(finalInternalStep) &&
        		value.getOk().equalsIgnoreCase(ok))
             {
                return value;
            }
        }
        return null;
        
}
	

	public static class Constants {
	    public static final String FINAL = "final";
	    public static final String PARTIAL = "partial";
	    
	    public static final String TRUE = AnswerTypeEnum.T.name();
	    public static final String FALSE = AnswerTypeEnum.F.name();
	    public static final String ND = AnswerTypeEnum.ND.name();
	}
	
}


