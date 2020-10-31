package com.lohith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathsUtilTest {

	@Test
	void test() {
	MathsUtil m=new MathsUtil();
	int actual=m.add(9, 9);
	assertEquals(18, actual);
		
	}

}
