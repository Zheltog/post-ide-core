/**
 * generated by Xtext 2.25.0
 */
package su.nsk.iae.post.poST;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Var List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.ProcessVarList#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.post.poST.PoSTPackage#getProcessVarList()
 * @model
 * @generated
 */
public interface ProcessVarList extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link su.nsk.iae.post.poST.ProcessVariable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see su.nsk.iae.post.poST.PoSTPackage#getProcessVarList_Vars()
   * @model containment="true"
   * @generated
   */
  EList<ProcessVariable> getVars();

} // ProcessVarList
