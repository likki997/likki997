package com.Constructor;

import static org.junit.Assert.*;

import org.junit.Test;

public class junittest1 {

			public junittest1(Address1 add) {
				assertEquals(1,add.getStreet());
			
		}
			@Test 
			void set(Address1 add) {
				assertEquals("set(add)",add.getStreet());
			}
		
	}

