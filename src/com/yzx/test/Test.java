package com.yzx.test;

import com.yzx.service.JavaWork;
import com.yzx.service.LiSi;
import com.yzx.service.ZhangSan;
/**
 * ������
 * @author m1795
 *
 */
public class Test {
	/**
	 * �൱�������������
	 * @param yzx
	 */
	public static void main(String[] args) {
		JavaWork javawork=new JavaWork();
		javawork.setTester(new LiSi());
		javawork.doTest();
	}
}
