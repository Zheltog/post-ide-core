/**
 * generated by Xtext 2.25.0
 */
package su.nsk.iae.post.poST;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Conf Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.ProgramConfElement#getProgramVar <em>Program Var</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.ProgramConfElement#getAssig <em>Assig</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.ProgramConfElement#getGlobVar <em>Glob Var</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.post.poST.PoSTPackage#getProgramConfElement()
 * @model
 * @generated
 */
public interface ProgramConfElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Program Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Program Var</em>' reference.
   * @see #setProgramVar(SymbolicVariable)
   * @see su.nsk.iae.post.poST.PoSTPackage#getProgramConfElement_ProgramVar()
   * @model
   * @generated
   */
  SymbolicVariable getProgramVar();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.ProgramConfElement#getProgramVar <em>Program Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Program Var</em>' reference.
   * @see #getProgramVar()
   * @generated
   */
  void setProgramVar(SymbolicVariable value);

  /**
   * Returns the value of the '<em><b>Assig</b></em>' attribute.
   * The literals are from the enumeration {@link su.nsk.iae.post.poST.AssignmentType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assig</em>' attribute.
   * @see su.nsk.iae.post.poST.AssignmentType
   * @see #setAssig(AssignmentType)
   * @see su.nsk.iae.post.poST.PoSTPackage#getProgramConfElement_Assig()
   * @model
   * @generated
   */
  AssignmentType getAssig();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.ProgramConfElement#getAssig <em>Assig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assig</em>' attribute.
   * @see su.nsk.iae.post.poST.AssignmentType
   * @see #getAssig()
   * @generated
   */
  void setAssig(AssignmentType value);

  /**
   * Returns the value of the '<em><b>Glob Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Glob Var</em>' reference.
   * @see #setGlobVar(SymbolicVariable)
   * @see su.nsk.iae.post.poST.PoSTPackage#getProgramConfElement_GlobVar()
   * @model
   * @generated
   */
  SymbolicVariable getGlobVar();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.ProgramConfElement#getGlobVar <em>Glob Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Glob Var</em>' reference.
   * @see #getGlobVar()
   * @generated
   */
  void setGlobVar(SymbolicVariable value);

} // ProgramConfElement
