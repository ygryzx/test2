package com.yzx.test;

import com.yzx.service.JavaWork;
import com.yzx.service.LiSi;
import com.yzx.service.ZhangSan;
/**
 * 测试类
 * @author m1795
 *
 */
public class Test {
	/**
	 * 相当于主管命令管理
	 * @param yzx
	 */
	public static void main(String[] args) {
		JavaWork javawork=new JavaWork();
		javawork.setTester(new LiSi());
		javawork.doTest();
	}
}
