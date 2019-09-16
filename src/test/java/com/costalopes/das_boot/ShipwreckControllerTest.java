package com.costalopes.das_boot;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.costalopes.das_boot.controller.ShipwreckController;
import com.costalopes.das_boot.model.Shipwreck;
import com.costalopes.das_boot.repository.ShipwreckRepository;

public class ShipwreckControllerTest {

	@InjectMocks
	private ShipwreckController sc;
	
	@Mock
	private ShipwreckRepository repository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testShipwreckGet() {
		Shipwreck sw = new Shipwreck();
		sw.setId(1L);
		when(repository.getOne(1L)).thenReturn(sw);
		
		Shipwreck wreck = sc.get(1L);
		verify(repository).getOne(1L);
		
		// Usando JUnit para assertion		
		// assertEquals(1L, wreck.getId().longValue());
		
		assertThat(wreck.getId(), is(1L));
	}
	
}
