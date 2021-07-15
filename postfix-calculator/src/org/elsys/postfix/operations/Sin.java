package org.elsys.postfix.operations;

import org.elsys.postfix.Calculator;

public class Sin extends AbstractOperation  implements Operation {

	public Sin(Calculator calculator) {
		super(calculator, "sin");
		
	}
	@Override
	public void calculate() {
		double value = getCalculator().popValue();
		getCalculator().addValue(value);
		
		getCalculator().addValue(Math.sin(value));		
	}

}
