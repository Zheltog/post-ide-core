package su.nsk.iae.post;

/**
* Interface to be implemented in any DSM-core for DSM-wrapper could invoke execution of DSM-core logic
*/
public interface IDsmExecutor {
	/**
	* Starts DSM-core logic execution
	* @param request represents request for DSM to work with
	* @return result message
	*/
	String execute(Object request);
}
