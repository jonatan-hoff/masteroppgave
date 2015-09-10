// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 09/09/2015 14:42:37
// ******************************************************* 
package javabot.jbt;

/**
 * BT library that includes the trees read from the following files:
 * <ul>
 * <li>
 * C:\Users\Jonatan\masteroppgave\defcon_default\AI\javabot\source\java\javabot
 * \jbt\defconBasic.xbt</li>
 * </ul>
 */
public class defconLib implements jbt.execution.core.IBTLibrary {
	/**
	 * Tree generated from file
	 * C:\Users\Jonatan\masteroppgave\defcon_default\AI\
	 * javabot\source\java\javabot\jbt\defconBasic.xbt.
	 */
	private static jbt.model.core.ModelTask PlaceSilo;

	/* Static initialization of all the trees. */
	static {
		PlaceSilo = new jbt.model.task.composite.ModelSequence(null,
				new javabot.jbt.bts.conditions.IsDefcon5(null));

	}

	/**
	 * Returns a behaviour tree by its name, or null in case it cannot be found.
	 * It must be noted that the trees that are retrieved belong to the class,
	 * not to the instance (that is, the trees are static members of the class),
	 * so they are shared among all the instances of this class.
	 */
	public jbt.model.core.ModelTask getBT(java.lang.String name) {
		if (name.equals("PlaceSilo")) {
			return PlaceSilo;
		}
		return null;
	}

	/**
	 * Returns an Iterator that is able to iterate through all the elements in
	 * the library. It must be noted that the iterator does not support the
	 * "remove()" operation. It must be noted that the trees that are retrieved
	 * belong to the class, not to the instance (that is, the trees are static
	 * members of the class), so they are shared among all the instances of this
	 * class.
	 */
	public java.util.Iterator<jbt.util.Pair<java.lang.String, jbt.model.core.ModelTask>> iterator() {
		return new BTLibraryIterator();
	}

	private class BTLibraryIterator
			implements
			java.util.Iterator<jbt.util.Pair<java.lang.String, jbt.model.core.ModelTask>> {
		static final long numTrees = 1;
		long currentTree = 0;

		public boolean hasNext() {
			return this.currentTree < numTrees;
		}

		public jbt.util.Pair<java.lang.String, jbt.model.core.ModelTask> next() {
			this.currentTree++;

			if ((this.currentTree - 1) == 0) {
				return new jbt.util.Pair<java.lang.String, jbt.model.core.ModelTask>(
						"PlaceSilo", PlaceSilo);
			}

			throw new java.util.NoSuchElementException();
		}

		public void remove() {
			throw new java.lang.UnsupportedOperationException();
		}
	}
}