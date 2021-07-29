/**
 * generated by Xtext 2.25.0
 */
package su.nsk.iae.post.poST.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import su.nsk.iae.post.poST.GlobalVarDeclaration;
import su.nsk.iae.post.poST.PoSTPackage;
import su.nsk.iae.post.poST.Resource;
import su.nsk.iae.post.poST.SingleResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.impl.ResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.impl.ResourceImpl#getResGlobVars <em>Res Glob Vars</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.impl.ResourceImpl#getResStatement <em>Res Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getResGlobVars() <em>Res Glob Vars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResGlobVars()
   * @generated
   * @ordered
   */
  protected EList<GlobalVarDeclaration> resGlobVars;

  /**
   * The cached value of the '{@link #getResStatement() <em>Res Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResStatement()
   * @generated
   * @ordered
   */
  protected SingleResource resStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceImpl()
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
    return PoSTPackage.Literals.RESOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PoSTPackage.RESOURCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PoSTPackage.RESOURCE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GlobalVarDeclaration> getResGlobVars()
  {
    if (resGlobVars == null)
    {
      resGlobVars = new EObjectContainmentEList<GlobalVarDeclaration>(GlobalVarDeclaration.class, this, PoSTPackage.RESOURCE__RES_GLOB_VARS);
    }
    return resGlobVars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SingleResource getResStatement()
  {
    return resStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResStatement(SingleResource newResStatement, NotificationChain msgs)
  {
    SingleResource oldResStatement = resStatement;
    resStatement = newResStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PoSTPackage.RESOURCE__RES_STATEMENT, oldResStatement, newResStatement);
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
  public void setResStatement(SingleResource newResStatement)
  {
    if (newResStatement != resStatement)
    {
      NotificationChain msgs = null;
      if (resStatement != null)
        msgs = ((InternalEObject)resStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PoSTPackage.RESOURCE__RES_STATEMENT, null, msgs);
      if (newResStatement != null)
        msgs = ((InternalEObject)newResStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PoSTPackage.RESOURCE__RES_STATEMENT, null, msgs);
      msgs = basicSetResStatement(newResStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PoSTPackage.RESOURCE__RES_STATEMENT, newResStatement, newResStatement));
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
      case PoSTPackage.RESOURCE__RES_GLOB_VARS:
        return ((InternalEList<?>)getResGlobVars()).basicRemove(otherEnd, msgs);
      case PoSTPackage.RESOURCE__RES_STATEMENT:
        return basicSetResStatement(null, msgs);
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
      case PoSTPackage.RESOURCE__NAME:
        return getName();
      case PoSTPackage.RESOURCE__TYPE:
        return getType();
      case PoSTPackage.RESOURCE__RES_GLOB_VARS:
        return getResGlobVars();
      case PoSTPackage.RESOURCE__RES_STATEMENT:
        return getResStatement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PoSTPackage.RESOURCE__NAME:
        setName((String)newValue);
        return;
      case PoSTPackage.RESOURCE__TYPE:
        setType((String)newValue);
        return;
      case PoSTPackage.RESOURCE__RES_GLOB_VARS:
        getResGlobVars().clear();
        getResGlobVars().addAll((Collection<? extends GlobalVarDeclaration>)newValue);
        return;
      case PoSTPackage.RESOURCE__RES_STATEMENT:
        setResStatement((SingleResource)newValue);
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
      case PoSTPackage.RESOURCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PoSTPackage.RESOURCE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case PoSTPackage.RESOURCE__RES_GLOB_VARS:
        getResGlobVars().clear();
        return;
      case PoSTPackage.RESOURCE__RES_STATEMENT:
        setResStatement((SingleResource)null);
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
      case PoSTPackage.RESOURCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PoSTPackage.RESOURCE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case PoSTPackage.RESOURCE__RES_GLOB_VARS:
        return resGlobVars != null && !resGlobVars.isEmpty();
      case PoSTPackage.RESOURCE__RES_STATEMENT:
        return resStatement != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ResourceImpl
