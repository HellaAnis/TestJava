package test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import com.company.Main;
import org.junit.Before;
import org.junit.Test;

public class MainTest
{
	ArrayList<Integer> arrayList = new ArrayList<>();

	@Before
	public void init()
	{
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
	}

	// when size is 1
	@Test
	public void testPartition()
	{
		assertThat(Main.partition(arrayList, 1).size(),
			is(5));
	}
	// when size is 2

	@Test
	public void testPartitionTaille2()
	{


		assertThat(Main.partition(arrayList, 2).size(),
			is(3));
	}
	// when size is 3

	@Test
	public void testPartitionTaille3()
	{


		assertThat(Main.partition(arrayList, 3).size(),
			is(3));
	}


}
