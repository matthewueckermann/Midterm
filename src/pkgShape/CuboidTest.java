package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class CuboidTest {

	@Test
	public void ConstructorTest() {
		Cuboid c1 = new Cuboid(2,4,6);
		assertTrue(c1.getiWidth()==2 && c1.getiLength()==4 && c1.getiDepth()==6);
	}
	
	@Test
	public void getiDepthTest() {
		Cuboid c1 = new Cuboid(2,4,3);
		assertTrue(c1.getiDepth()==3);
	}
	
	@Test
	public void setiDepthTest() {
		Cuboid c1 = new Cuboid(2,4,3);
		c1.setiDepth(34);
		assertTrue(c1.getiDepth()==34);
	}
	
	@Test
	public void areaTest() {
		Cuboid c1 = new Cuboid(2,4,3);
		assertTrue(c1.area()==52);
	}
			  
	@Test
	public void perimeterTest() {
		Cuboid c1 = new Cuboid(2,4,3);
		assertThrows(UnsupportedOperationException.class, () -> {
	        c1.perimeter();});
	}
		
	@Test
	public void SortByVolumeTest() {
		Cuboid c1 = new Cuboid(1,1,1);
		Cuboid c2 = new Cuboid(2,9,7);
		Cuboid c3 = new Cuboid(2,5,1);
		Cuboid c4 = new Cuboid(2,1,1);
		ArrayList<Cuboid> listCub = new ArrayList<Cuboid>();
		Cuboid.SortByVolume sortVol = c1.new SortByVolume();
		listCub.add(c1);
		listCub.add(c2);
		listCub.add(c3);
		listCub.add(c4);
		Collections.sort(listCub, sortVol);
		assertTrue(listCub.get(0)==c1 && listCub.get(1)==c4 && listCub.get(2)==c3 && listCub.get(3)==c2);
	}
	
	@Test
	public void SortByAreaTest() {
		Cuboid c1 = new Cuboid(2,5,1); // SA 34
		Cuboid c2 = new Cuboid(4,4,4); //96
		Cuboid c3 = new Cuboid(1,1,1);  //SA 6
		Cuboid c4 = new Cuboid(5,5,2); //SA 90
		ArrayList<Cuboid> listCub = new ArrayList<Cuboid>();
		Cuboid.SortByArea sortArea = c1.new SortByArea();
		listCub.add(c1);
		listCub.add(c2);
		listCub.add(c3);
		listCub.add(c4);
		Collections.sort(listCub, sortArea);
		assertTrue(listCub.get(0)==c3 && listCub.get(1)==c1 && listCub.get(2)==c4 && listCub.get(3) == c2);
	}
	
}
