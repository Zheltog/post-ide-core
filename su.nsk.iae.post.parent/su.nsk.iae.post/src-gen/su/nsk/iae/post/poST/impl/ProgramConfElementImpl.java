/**
 * generated by Xtext 2.25.0
 */
package su.nsk.iae.post.poST.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import su.nsk.iae.post.poST.AssignmentType;
import su.nsk.iae.post.poST.PoSTPackage;
import su.nsk.iae.post.poST.ProgramConfElement;
import su.nsk.iae.post.poST.SymbolicVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Conf Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.impl.ProgramConfElementImpl#getProgramVar <em>Program Var</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.impl.ProgramConfElementImpl#getAssig <em>Assig</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.impl.ProgramConfElementImpl#getGlobVar <em>Glob Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramConfElementImpl extends MinimalEObjectImpl.Container implements ProgramConfElement
{
  /**
   * The cached value of the '{@link #getProgramVar() <em>Program Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProgramVar()
   * @generated
   * @ordered
   */
  protected SymbolicVariable programVar;

  /**
   * The default value of the '{@link #getAssig() <em>Assig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssig()
   * @generated
   * @ordered
   */
  protected static final AssignmentType ASSIG_EDEFAULT = AssignmentType.IN;

  /**
   * The cached value of the '{@link #getAssig() <em>Assig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssig()
   * @generated
   * @ordered
   */
  protected AssignmentType assig = ASSIG_EDEFAULT;

  /**
   * The cached value of the '{@link #getGlobVar() <em>Glob Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlobVar()
   * @generated
   * @ordered
   */
  protected SymbolicVariable globVar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramConfElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PoSTPackage.Literals.PROGRAM_CONF_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SymbolicVariable getProgramVar()
  {
    if (programVar != null && programVar.eIsProxy())
    {
      InternalEObject oldProgramVar = (InternalEObject)programVar;
      programVar = (SymbolicVariable)eResolveProxy(oldProgramVar);
      if (programVar != oldProgramVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoSTPackage.PROGRAM_CONF_ELEMENT__PROGRAM_VAR, oldProgramVar, programVar));
      }
    }
    return programVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolicVariable basicGetProgramVar()
  {
    return programVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProgramVar(SymbolicVariable newProgramVar)
  {
    SymbolicVariable oldProgramVar = programVar;
    programVar = newProgramVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PoSTPackage.PROGRAM_CONF_ELEMENT__PROGRAM_VAR, oldProgramVar, programVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssignmentType getAssig()
  {
    return assig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAssig(AssignmentType newAssig)
  {
    AssignmentType oldAssig = assig;
    assig = newAssig == null ? ASSIG_EDEFAULT : newAssig;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PoSTPackage.PROGRAM_CONF_ELEMENT__ASSIG, oldAssig, assig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SymbolicVariable getGlobVar()
  {
    if (globVar != null && globVar.eIsProxy())
    {
      InternalEObject oldGlobVar = (InternalEObject)globVar;
      globVar = (SymbolicVariable)eResolveProxy(oldGlobVar);
      if (globVar != oldGlobVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoSTPackage.PROGRAM_CONF_ELEMENT__GLOB_VAR, oldGlobVar, globVar));
      }
    }
    return globVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolicVariable basicGetGlobVar()
  {
    return globVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGlobVar(SymbolicVariable newGlobVar)
  {
    SymbolicVariable oldGlobVar = globVar;
    globVar = newGlobVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PoSTPackage.PROGRAM_CONF_ELEMENT__GLOB_VAR, oldGlobVar, globVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PoSTPackage.PROGRAM_CONF_ELEMENT__PROGRAM_VAR:
        if (resolve) return getProgramVar();
        return basicGetProgramVar();
      case PoSTPackage.PROGRAM_CONF_ELEMENT__ASSIG:
        return getAssig();
      case PoSTPackage.PROGRAM_CONF_ELEMENT__GLOB_VAR:
        if (resolve) return getGlobVar();
        return basicGetGlobVar();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PoSTPackage.PROGRAM_CONF_ELEMENT__PROGRAM_VAR:
        setProgramVar((SymbolicVariable)newValue);
        return;
      case PoSTPackage.PROGRAM_CONF_ELEMENT__ASSIG:
        setAssig((AssignmentType)newValue);
        return;
      case PoSTPackage.PROGRAM_CONF_ELEMENT__GLOB_VAR:
        setGlobVar((SymbolicVariable)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PoSTPackage.PROGRAM_CONF_ELEMENT__PROGRAM_VAR:
        setProgramVar((SymbolicVariable)null);
        return;
      case PoSTPackage.PROGRAM_CONF_ELEMENT__ASSIG:
        setAssig(ASSIG_EDEFAULT);
        return;
      case PoSTPackage.PROGRAM_CONF_ELEMENT__GLOB_VAR:
        setGlobVar((SymbolicVariable)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PoSTPackage.PROGRAM_CONF_ELEMENT__PROGRAM_VAR:
        return programVar != null;
      case PoSTPackage.PROGRAM_CONF_ELEMENT__ASSIG:
        return assig != ASSIG_EDEFAULT;
      case PoSTPackage.PROGRAM_CONF_ELEMENT__GLOB_VAR:
        return globVar != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (assig: ");
    result.append(assig);
    result.append(')');
    return result.toString();
  }

} //ProgramConfElementImpl