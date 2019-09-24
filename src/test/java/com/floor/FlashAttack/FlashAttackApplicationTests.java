package com.floor.FlashAttack;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class FlashAttackApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	public FlashAttackApplication flashAttack;
	@Test
	public void test() {
		String s=flashAttack.home();
		assertEquals(s,"Hello World!");
	}

}
