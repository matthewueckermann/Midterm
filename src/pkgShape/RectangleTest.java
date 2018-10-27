package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import pkgShape.Rectangle;

class RectangleTest {

	@Test
	public void ConstructorTest(){
		Rectangle rec1 = new Rectangle(1,3);
		assertTrue(rec1.getiWidth()==1 && rec1.getiLength()==3);
	}
	
	@Test
	public void getiWidthTest() {
		Rectangle rec1 = new Rectangle(4,7);
		assertTrue(rec1.getiWidth()==4);
	}
	@Test
	public void getiLengthTest() {
		Rectangle rec1 = new Rectangle(4,7);
		assertTrue(rec1.getiLength()==7);
	}
	@Test
	public void setiWidthTest() {
		Rectangle rec1 = new Rectangle(4,7);
		rec1.setiWidth(43);
		assertTrue(rec1.getiWidth()==43);
	}
	@Test
	public void setiLengthTest() {
		Rectangle rec1 = new Rectangle(4,7);
		rec1.setiLength(24);
		assertTrue(rec1.getiLength()==24);
	}
	@Test
	public void areaTest() {
		Rectangle rec1 = new Rectangle(4,7);
		assertTrue(rec1.area()==28);
	}
	@Test
	public void perimeterTest() {
		Rectangle rec1 = new Rectangle(4,7);
		assertTrue(rec1.perimeter()==22);
	}
	@Test
	public void compareToTestGreater(){ //Tests to see if a larger rectangle will return 1
		Rectangle rec1 = new Rectangle(4,7);
		Rectangle rec2 = new Rectangle(2,2);
		assertTrue(rec1.compareTo(rec2)==1);
	}
	@Test
	public void compareToTestLess(){ //Tests to see if smaller rectangle will return -1
		Rectangle rec1 = new Rectangle(4,7);
		Rectangle rec2 = new Rectangle(2,2);
		assertTrue(rec2.compareTo(rec1)==-1);
	}
	@Test
	public void compareToTestSort() { //Test to see if rectangles are sorted in ascending order
		Rectangle rec1 = new Rectangle(4,7);
		Rectangle rec2 = new Rectangle(2,2);
		Rectangle rec3 = new Rectangle(10,10);
		ArrayList<Rectangle> listRect = new ArrayList<Rectangle>();
		listRect.add(rec1);
		listRect.add(rec2);
		listRect.add(rec3);
		Collections.sort(listRect);
		assertTrue(listRect.get(0)==rec2 && listRect.get(1)==rec1 && listRect.get(2)==rec3);
	}
}
