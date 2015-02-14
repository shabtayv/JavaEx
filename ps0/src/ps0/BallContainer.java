/**
 * This is part of the Problem Set 0: Introduction for 6.170 Fall 2005.
 */
package ps0;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * This is a container can be used to contain Balls.
 */
public class BallContainer {

    // Contents of the box.
	public LinkedList<Ball> contents;

    /**
     * Constructor that creates a new ballcontainer.
     */
    public BallContainer() {
    	contents = new LinkedList<Ball>();
    }

    /**
     * Adds a ball to the container. This method returns <tt>true</tt>
     * if ball was successfully added to the container, i.e. ball is
     * not already in the container. Of course, you are allowed to put
     * a Ball into a container only once. Hence, this method returns
     * <tt>false</tt>, if ball is already in the container.
     * @param b Ball to be added.
     * @return true if ball was successfully added to the container,
     * i.e. ball is not already in the container. Returns false, if ball is
     * already in the container.
     */
    public boolean add(Ball b) {
    	if (contents.contains(b))
    		return false;
    	return contents.add(b); 
    }

    /**
     * Removes a ball from the container. This method returns
     * <tt>true</tt> if ball was successfully removed from the
     * container, i.e. ball is actually in the container. You cannot
     * remove a Ball if it is not already in the container and so ths
     * method will return <tt>false</tt>, otherwise.
     * @param b Ball to be removed.
     * @return true if ball was successfully removed from the container,
     * i.e. ball is actually in the container. Returns false, if ball is not
     * in the container.
     */
    public boolean remove(Ball b) {
    	return contents.remove(b);
    }

    /**
     * Each Ball has a capacity. This method returns the total capacity of
     * all the Balls in the container.
     * @return the capacity of the contents of the container.
     */
    public double getCapacity() {
	
    	double capacity = 0;
    	Iterator<Ball> it = contents.iterator();
    	while (it.hasNext()) {
    		Ball b = it.next();
    		capacity += b.getCapacity();
    	}
    	return capacity;
    }

    /**
     * Returns the number of Balls in this container.
     * @return the number of Balls in this container.
     */
    public int size() {
    	return contents.size();
    }

    /**
     * Empties the container, i.e. removes all its contents.
     */
    public void clear() {
    	contents.clear();
    }

    /**
     * This method returns <tt>true</tt> if this container contains
     * the specified Ball. It will return <tt>false</tt> otherwise.
     * @param b Ball to be checked if its in container
     * @return true if this container contains the specified Ball. Returns
     * false, otherwise.
     */
    public boolean contains(Ball b) {
    	return contents.contains(b);
    }

}
