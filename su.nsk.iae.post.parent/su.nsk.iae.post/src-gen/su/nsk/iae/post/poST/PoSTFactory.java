/**
 * generated by Xtext 2.25.0
 */
package su.nsk.iae.post.poST;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see su.nsk.iae.post.poST.PoSTPackage
 * @generated
 */
public interface PoSTFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PoSTFactory eINSTANCE = su.nsk.iae.post.poST.impl.PoSTFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration</em>'.
   * @generated
   */
  Configuration createConfiguration();

  /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
  Resource createResource();

  /**
   * Returns a new object of class '<em>Single Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Resource</em>'.
   * @generated
   */
  SingleResource createSingleResource();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  Task createTask();

  /**
   * Returns a new object of class '<em>Task Initialization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Initialization</em>'.
   * @generated
   */
  TaskInitialization createTaskInitialization();

  /**
   * Returns a new object of class '<em>Program Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program Configuration</em>'.
   * @generated
   */
  ProgramConfiguration createProgramConfiguration();

  /**
   * Returns a new object of class '<em>Program Conf Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program Conf Elements</em>'.
   * @generated
   */
  ProgramConfElements createProgramConfElements();

  /**
   * Returns a new object of class '<em>Program Conf Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program Conf Element</em>'.
   * @generated
   */
  ProgramConfElement createProgramConfElement();

  /**
   * Returns a new object of class '<em>Attach Variable Conf Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attach Variable Conf Element</em>'.
   * @generated
   */
  AttachVariableConfElement createAttachVariableConfElement();

  /**
   * Returns a new object of class '<em>Template Process Conf Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template Process Conf Element</em>'.
   * @generated
   */
  TemplateProcessConfElement createTemplateProcessConfElement();

  /**
   * Returns a new object of class '<em>Process Template Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Template Elements</em>'.
   * @generated
   */
  ProcessTemplateElements createProcessTemplateElements();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Function Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Block</em>'.
   * @generated
   */
  FunctionBlock createFunctionBlock();

  /**
   * Returns a new object of class '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process</em>'.
   * @generated
   */
  Process createProcess();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Set State Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set State Statement</em>'.
   * @generated
   */
  SetStateStatement createSetStateStatement();

  /**
   * Returns a new object of class '<em>Process Statements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Statements</em>'.
   * @generated
   */
  ProcessStatements createProcessStatements();

  /**
   * Returns a new object of class '<em>Process Status Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Status Expression</em>'.
   * @generated
   */
  ProcessStatusExpression createProcessStatusExpression();

  /**
   * Returns a new object of class '<em>Start Process Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Process Statement</em>'.
   * @generated
   */
  StartProcessStatement createStartProcessStatement();

  /**
   * Returns a new object of class '<em>Stop Process Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stop Process Statement</em>'.
   * @generated
   */
  StopProcessStatement createStopProcessStatement();

  /**
   * Returns a new object of class '<em>Error Process Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Error Process Statement</em>'.
   * @generated
   */
  ErrorProcessStatement createErrorProcessStatement();

  /**
   * Returns a new object of class '<em>Timeout Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timeout Statement</em>'.
   * @generated
   */
  TimeoutStatement createTimeoutStatement();

  /**
   * Returns a new object of class '<em>Reset Timer Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reset Timer Statement</em>'.
   * @generated
   */
  ResetTimerStatement createResetTimerStatement();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Xor Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Xor Expression</em>'.
   * @generated
   */
  XorExpression createXorExpression();

  /**
   * Returns a new object of class '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expression</em>'.
   * @generated
   */
  AndExpression createAndExpression();

  /**
   * Returns a new object of class '<em>Comp Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comp Expression</em>'.
   * @generated
   */
  CompExpression createCompExpression();

  /**
   * Returns a new object of class '<em>Equ Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equ Expression</em>'.
   * @generated
   */
  EquExpression createEquExpression();

  /**
   * Returns a new object of class '<em>Add Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Expression</em>'.
   * @generated
   */
  AddExpression createAddExpression();

  /**
   * Returns a new object of class '<em>Mul Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mul Expression</em>'.
   * @generated
   */
  MulExpression createMulExpression();

  /**
   * Returns a new object of class '<em>Power Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Power Expression</em>'.
   * @generated
   */
  PowerExpression createPowerExpression();

  /**
   * Returns a new object of class '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expression</em>'.
   * @generated
   */
  UnaryExpression createUnaryExpression();

  /**
   * Returns a new object of class '<em>Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Expression</em>'.
   * @generated
   */
  PrimaryExpression createPrimaryExpression();

  /**
   * Returns a new object of class '<em>Statement List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement List</em>'.
   * @generated
   */
  StatementList createStatementList();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Assignment Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment Statement</em>'.
   * @generated
   */
  AssignmentStatement createAssignmentStatement();

  /**
   * Returns a new object of class '<em>Selection Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection Statement</em>'.
   * @generated
   */
  SelectionStatement createSelectionStatement();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>Case Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Statement</em>'.
   * @generated
   */
  CaseStatement createCaseStatement();

  /**
   * Returns a new object of class '<em>Case Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Element</em>'.
   * @generated
   */
  CaseElement createCaseElement();

  /**
   * Returns a new object of class '<em>Case List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case List</em>'.
   * @generated
   */
  CaseList createCaseList();

  /**
   * Returns a new object of class '<em>Iteration Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iteration Statement</em>'.
   * @generated
   */
  IterationStatement createIterationStatement();

  /**
   * Returns a new object of class '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Statement</em>'.
   * @generated
   */
  ForStatement createForStatement();

  /**
   * Returns a new object of class '<em>For List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For List</em>'.
   * @generated
   */
  ForList createForList();

  /**
   * Returns a new object of class '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Statement</em>'.
   * @generated
   */
  WhileStatement createWhileStatement();

  /**
   * Returns a new object of class '<em>Repeat Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repeat Statement</em>'.
   * @generated
   */
  RepeatStatement createRepeatStatement();

  /**
   * Returns a new object of class '<em>Subprogram Control Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subprogram Control Statement</em>'.
   * @generated
   */
  SubprogramControlStatement createSubprogramControlStatement();

  /**
   * Returns a new object of class '<em>Exit Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit Statement</em>'.
   * @generated
   */
  ExitStatement createExitStatement();

  /**
   * Returns a new object of class '<em>Array Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Variable</em>'.
   * @generated
   */
  ArrayVariable createArrayVariable();

  /**
   * Returns a new object of class '<em>Symbolic Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbolic Variable</em>'.
   * @generated
   */
  SymbolicVariable createSymbolicVariable();

  /**
   * Returns a new object of class '<em>Var Init Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Init Declaration</em>'.
   * @generated
   */
  VarInitDeclaration createVarInitDeclaration();

  /**
   * Returns a new object of class '<em>Var List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var List</em>'.
   * @generated
   */
  VarList createVarList();

  /**
   * Returns a new object of class '<em>Input Var Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Var Declaration</em>'.
   * @generated
   */
  InputVarDeclaration createInputVarDeclaration();

  /**
   * Returns a new object of class '<em>Output Var Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Var Declaration</em>'.
   * @generated
   */
  OutputVarDeclaration createOutputVarDeclaration();

  /**
   * Returns a new object of class '<em>Input Output Var Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Output Var Declaration</em>'.
   * @generated
   */
  InputOutputVarDeclaration createInputOutputVarDeclaration();

  /**
   * Returns a new object of class '<em>Var Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Declaration</em>'.
   * @generated
   */
  VarDeclaration createVarDeclaration();

  /**
   * Returns a new object of class '<em>Temp Var Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Temp Var Declaration</em>'.
   * @generated
   */
  TempVarDeclaration createTempVarDeclaration();

  /**
   * Returns a new object of class '<em>External Var Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Var Declaration</em>'.
   * @generated
   */
  ExternalVarDeclaration createExternalVarDeclaration();

  /**
   * Returns a new object of class '<em>External Var Init Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Var Init Declaration</em>'.
   * @generated
   */
  ExternalVarInitDeclaration createExternalVarInitDeclaration();

  /**
   * Returns a new object of class '<em>Global Var Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Var Declaration</em>'.
   * @generated
   */
  GlobalVarDeclaration createGlobalVarDeclaration();

  /**
   * Returns a new object of class '<em>Global Var Init Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Var Init Declaration</em>'.
   * @generated
   */
  GlobalVarInitDeclaration createGlobalVarInitDeclaration();

  /**
   * Returns a new object of class '<em>Array Spec Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Spec Init</em>'.
   * @generated
   */
  ArraySpecInit createArraySpecInit();

  /**
   * Returns a new object of class '<em>Array Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Specification</em>'.
   * @generated
   */
  ArraySpecification createArraySpecification();

  /**
   * Returns a new object of class '<em>Array Initialization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Initialization</em>'.
   * @generated
   */
  ArrayInitialization createArrayInitialization();

  /**
   * Returns a new object of class '<em>Time Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Literal</em>'.
   * @generated
   */
  TimeLiteral createTimeLiteral();

  /**
   * Returns a new object of class '<em>Simple Specification Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Specification Init</em>'.
   * @generated
   */
  SimpleSpecificationInit createSimpleSpecificationInit();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns a new object of class '<em>Signed Integer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signed Integer</em>'.
   * @generated
   */
  SignedInteger createSignedInteger();

  /**
   * Returns a new object of class '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Literal</em>'.
   * @generated
   */
  NumericLiteral createNumericLiteral();

  /**
   * Returns a new object of class '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Literal</em>'.
   * @generated
   */
  IntegerLiteral createIntegerLiteral();

  /**
   * Returns a new object of class '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Literal</em>'.
   * @generated
   */
  RealLiteral createRealLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PoSTPackage getPoSTPackage();

} //PoSTFactory
