/**
 * generated by Xtext 2.25.0
 */
package su.nsk.iae.post.poST.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import su.nsk.iae.post.poST.ForList;
import su.nsk.iae.post.poST.ForStatement;
import su.nsk.iae.post.poST.PoSTPackage;
import su.nsk.iae.post.poST.SymbolicVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.impl.ForStatementImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.impl.ForStatementImpl#getForList <em>For List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStatementImpl extends IterationStatementImpl implements ForStatement
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected SymbolicVariable variable;

  /**
   * The cached value of the '{@link #getForList() <em>For List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForList()
   * @generated
   * @ordered
   */
  protected ForList forList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForStatementImpl()
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
    return PoSTPackage.Literals.FOR_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SymbolicVariable getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (SymbolicVariable)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoSTPackage.FOR_STATEMENT__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolicVariable basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariable(SymbolicVariable newVariable)
  {
    SymbolicVariable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PoSTPackage.FOR_STATEMENT__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForList getForList()
  {
    return forList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForList(ForList newForList, NotificationChain msgs)
  {
    ForList oldForList = forList;
    forList = newForList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PoSTPackage.FOR_STATEMENT__FOR_LIST, oldForList, newForList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setForList(ForList newForList)
  {
    if (newForList != forList)
    {
      NotificationChain msgs = null;
      if (forList != null)
        msgs = ((InternalEObject)forList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PoSTPackage.FOR_STATEMENT__FOR_LIST, null, msgs);
      if (newForList != null)
        msgs = ((InternalEObject)newForList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PoSTPackage.FOR_STATEMENT__FOR_LIST, null, msgs);
      msgs = basicSetForList(newForList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PoSTPackage.FOR_STATEMENT__FOR_LIST, newForList, newForList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PoSTPackage.FOR_STATEMENT__FOR_LIST:
        return basicSetForList(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PoSTPackage.FOR_STATEMENT__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case PoSTPackage.FOR_STATEMENT__FOR_LIST:
        return getForList();
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
      case PoSTPackage.FOR_STATEMENT__VARIABLE:
        setVariable((SymbolicVariable)newValue);
        return;
      case PoSTPackage.FOR_STATEMENT__FOR_LIST:
        setForList((ForList)newValue);
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
      case PoSTPackage.FOR_STATEMENT__VARIABLE:
        setVariable((SymbolicVariable)null);
        return;
      case PoSTPackage.FOR_STATEMENT__FOR_LIST:
        setForList((ForList)null);
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
      case PoSTPackage.FOR_STATEMENT__VARIABLE:
        return variable != null;
      case PoSTPackage.FOR_STATEMENT__FOR_LIST:
        return forList != null;
    }
    return super.eIsSet(featureID);
  }

} //ForStatementImpl
