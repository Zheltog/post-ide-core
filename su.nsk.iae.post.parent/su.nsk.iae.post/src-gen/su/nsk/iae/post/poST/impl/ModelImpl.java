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

import su.nsk.iae.post.poST.Configuration;
import su.nsk.iae.post.poST.FunctionBlock;
import su.nsk.iae.post.poST.GlobalVarDeclaration;
import su.nsk.iae.post.poST.Model;
import su.nsk.iae.post.poST.PoSTPackage;
import su.nsk.iae.post.poST.Program;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.impl.ModelImpl#getConfs <em>Confs</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.impl.ModelImpl#getGlobVars <em>Glob Vars</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.impl.ModelImpl#getPrograms <em>Programs</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.impl.ModelImpl#getFbs <em>Fbs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getConfs() <em>Confs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfs()
   * @generated
   * @ordered
   */
  protected Configuration confs;

  /**
   * The cached value of the '{@link #getGlobVars() <em>Glob Vars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlobVars()
   * @generated
   * @ordered
   */
  protected EList<GlobalVarDeclaration> globVars;

  /**
   * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrograms()
   * @generated
   * @ordered
   */
  protected EList<Program> programs;

  /**
   * The cached value of the '{@link #getFbs() <em>Fbs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFbs()
   * @generated
   * @ordered
   */
  protected EList<FunctionBlock> fbs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return PoSTPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Configuration getConfs()
  {
    return confs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfs(Configuration newConfs, NotificationChain msgs)
  {
    Configuration oldConfs = confs;
    confs = newConfs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PoSTPackage.MODEL__CONFS, oldConfs, newConfs);
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
  public void setConfs(Configuration newConfs)
  {
    if (newConfs != confs)
    {
      NotificationChain msgs = null;
      if (confs != null)
        msgs = ((InternalEObject)confs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PoSTPackage.MODEL__CONFS, null, msgs);
      if (newConfs != null)
        msgs = ((InternalEObject)newConfs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PoSTPackage.MODEL__CONFS, null, msgs);
      msgs = basicSetConfs(newConfs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PoSTPackage.MODEL__CONFS, newConfs, newConfs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GlobalVarDeclaration> getGlobVars()
  {
    if (globVars == null)
    {
      globVars = new EObjectContainmentEList<GlobalVarDeclaration>(GlobalVarDeclaration.class, this, PoSTPackage.MODEL__GLOB_VARS);
    }
    return globVars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Program> getPrograms()
  {
    if (programs == null)
    {
      programs = new EObjectContainmentEList<Program>(Program.class, this, PoSTPackage.MODEL__PROGRAMS);
    }
    return programs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FunctionBlock> getFbs()
  {
    if (fbs == null)
    {
      fbs = new EObjectContainmentEList<FunctionBlock>(FunctionBlock.class, this, PoSTPackage.MODEL__FBS);
    }
    return fbs;
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
      case PoSTPackage.MODEL__CONFS:
        return basicSetConfs(null, msgs);
      case PoSTPackage.MODEL__GLOB_VARS:
        return ((InternalEList<?>)getGlobVars()).basicRemove(otherEnd, msgs);
      case PoSTPackage.MODEL__PROGRAMS:
        return ((InternalEList<?>)getPrograms()).basicRemove(otherEnd, msgs);
      case PoSTPackage.MODEL__FBS:
        return ((InternalEList<?>)getFbs()).basicRemove(otherEnd, msgs);
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
      case PoSTPackage.MODEL__CONFS:
        return getConfs();
      case PoSTPackage.MODEL__GLOB_VARS:
        return getGlobVars();
      case PoSTPackage.MODEL__PROGRAMS:
        return getPrograms();
      case PoSTPackage.MODEL__FBS:
        return getFbs();
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
      case PoSTPackage.MODEL__CONFS:
        setConfs((Configuration)newValue);
        return;
      case PoSTPackage.MODEL__GLOB_VARS:
        getGlobVars().clear();
        getGlobVars().addAll((Collection<? extends GlobalVarDeclaration>)newValue);
        return;
      case PoSTPackage.MODEL__PROGRAMS:
        getPrograms().clear();
        getPrograms().addAll((Collection<? extends Program>)newValue);
        return;
      case PoSTPackage.MODEL__FBS:
        getFbs().clear();
        getFbs().addAll((Collection<? extends FunctionBlock>)newValue);
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
      case PoSTPackage.MODEL__CONFS:
        setConfs((Configuration)null);
        return;
      case PoSTPackage.MODEL__GLOB_VARS:
        getGlobVars().clear();
        return;
      case PoSTPackage.MODEL__PROGRAMS:
        getPrograms().clear();
        return;
      case PoSTPackage.MODEL__FBS:
        getFbs().clear();
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
      case PoSTPackage.MODEL__CONFS:
        return confs != null;
      case PoSTPackage.MODEL__GLOB_VARS:
        return globVars != null && !globVars.isEmpty();
      case PoSTPackage.MODEL__PROGRAMS:
        return programs != null && !programs.isEmpty();
      case PoSTPackage.MODEL__FBS:
        return fbs != null && !fbs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
