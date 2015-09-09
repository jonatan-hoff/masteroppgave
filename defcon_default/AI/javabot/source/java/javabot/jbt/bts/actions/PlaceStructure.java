// ******************************************************* 
//                   MACHINE GENERATED CODE                
//                       DO NOT MODIFY                     
//                                                         
// Generated on 09/09/2015 14:44:09
// ******************************************************* 
package javabot.jbt.bts.actions;

/** ModelAction class created from MMPM action PlaceStructure. */
public class PlaceStructure extends jbt.model.task.leaf.action.ModelAction {
	/**
	 * Value of the parameter "longitude" in case its value is specified at
	 * construction time. null otherwise.
	 */
	private java.lang.Float longitude;
	/**
	 * Location, in the context, of the parameter "longitude" in case its value
	 * is not specified at construction time. null otherwise.
	 */
	private java.lang.String longitudeLoc;
	/**
	 * Value of the parameter "latitude" in case its value is specified at
	 * construction time. null otherwise.
	 */
	private java.lang.Float latitude;
	/**
	 * Location, in the context, of the parameter "latitude" in case its value
	 * is not specified at construction time. null otherwise.
	 */
	private java.lang.String latitudeLoc;
	/**
	 * Value of the parameter "typeId" in case its value is specified at
	 * construction time. null otherwise.
	 */
	private java.lang.Integer typeId;
	/**
	 * Location, in the context, of the parameter "typeId" in case its value is
	 * not specified at construction time. null otherwise.
	 */
	private java.lang.String typeIdLoc;

	/**
	 * Constructor. Constructs an instance of PlaceStructure.
	 * 
	 * @param longitude
	 *            value of the parameter "longitude", or null in case it should
	 *            be read from the context. If null, <code>longitudeLoc</code>
	 *            cannot be null.
	 * @param longitudeLoc
	 *            in case <code>longitude</code> is null, this variable
	 *            represents the place in the context where the parameter's
	 *            value will be retrieved from.
	 * @param latitude
	 *            value of the parameter "latitude", or null in case it should
	 *            be read from the context. If null, <code>latitudeLoc</code>
	 *            cannot be null.
	 * @param latitudeLoc
	 *            in case <code>latitude</code> is null, this variable
	 *            represents the place in the context where the parameter's
	 *            value will be retrieved from.
	 * @param typeId
	 *            value of the parameter "typeId", or null in case it should be
	 *            read from the context. If null, <code>typeIdLoc</code> cannot
	 *            be null.
	 * @param typeIdLoc
	 *            in case <code>typeId</code> is null, this variable represents
	 *            the place in the context where the parameter's value will be
	 *            retrieved from.
	 */
	public PlaceStructure(jbt.model.core.ModelTask guard,
			java.lang.Float longitude, java.lang.String longitudeLoc,
			java.lang.Float latitude, java.lang.String latitudeLoc,
			java.lang.Integer typeId, java.lang.String typeIdLoc) {
		super(guard);
		this.longitude = longitude;
		this.longitudeLoc = longitudeLoc;
		this.latitude = latitude;
		this.latitudeLoc = latitudeLoc;
		this.typeId = typeId;
		this.typeIdLoc = typeIdLoc;
	}

	/**
	 * Returns a javabot.jbt.bts.actions.execution.PlaceStructure task that is
	 * able to run this task.
	 */
	public jbt.execution.core.ExecutionTask createExecutor(
			jbt.execution.core.BTExecutor executor,
			jbt.execution.core.ExecutionTask parent) {
		return new javabot.jbt.bts.actions.execution.PlaceStructure(this,
				executor, parent, this.longitude, this.longitudeLoc,
				this.latitude, this.latitudeLoc, this.typeId, this.typeIdLoc);
	}
}