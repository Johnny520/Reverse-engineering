package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class NameSpace implements java.io.Serializable, bsh.BshClassManager.Listener, bsh.NameSource, java.lang.Cloneable {
    public static final bsh.NameSpace JAVACODE = null;
    private static final long serialVersionUID = 1;
    bsh.Node callerInfoNode;
    private transient java.util.Map<java.lang.String, java.lang.Class<?>> classCache;
    java.lang.Object classInstance;
    private transient bsh.BshClassManager classManager;
    java.lang.Class<?> classStatic;
    protected java.util.Map<java.lang.String, java.lang.String> importedClasses;
    private java.util.List<java.lang.String> importedCommands;
    private java.util.List<java.lang.Object> importedObjects;
    private java.util.List<java.lang.String> importedPackages;
    private java.util.List<java.lang.Class<?>> importedStatic;
    boolean isClass;
    boolean isEnum;
    boolean isInterface;
    boolean isMethod;
    private java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> methods;
    private java.util.List<bsh.NameSource.Listener> nameSourceListeners;
    private java.util.Map<java.lang.String, bsh.Name> names;
    private java.lang.String nsName;
    private java.lang.String packageName;
    private bsh.NameSpace parent;
    private bsh.This thisReference;
    private java.util.Map<java.lang.String, bsh.Variable> variables;

    static {
            bsh.NameSpace r0 = new bsh.NameSpace
            r1 = 0
            java.lang.String r2 = "Called from compiled Java code."
            r0.<init>(r1, r1, r2)
            bsh.NameSpace.JAVACODE = r0
            r1 = 1
            r0.isMethod = r1
            return
    }

    public NameSpace(bsh.NameSpace r2, bsh.BshClassManager r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.variables = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.methods = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.importedClasses = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.importedPackages = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.importedCommands = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.importedObjects = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.importedStatic = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.nameSourceListeners = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.names = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.classCache = r0
            r1.setName(r4)
            r1.setParent(r2)
            r1.setClassManager(r3)
            bsh.BshClassManager r2 = r1.getClassManager()
            r2.addListener(r1)
            return
    }

    public NameSpace(bsh.NameSpace r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public NameSpace(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0, r2)
            return
    }

    public NameSpace(java.lang.String r2, bsh.BshClassManager r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r3, r2)
            return
    }

    public static /* synthetic */ bsh.Variable[] a(int r0) {
            bsh.Variable[] r0 = lambda$getVariables$1(r0)
            return r0
    }

    public static /* synthetic */ bsh.BshMethod[] b(int r0) {
            bsh.BshMethod[] r0 = lambda$getMethods$4(r0)
            return r0
    }

    public static /* synthetic */ java.lang.String[] c(int r0) {
            java.lang.String[] r0 = lambda$getMethodNames$2(r0)
            return r0
    }

    private java.lang.Class<?> classForName(java.lang.String r2) {
            r1 = this;
            bsh.BshClassManager r0 = r1.getClassManager()
            java.lang.Class r2 = r0.classForName(r2)
            return r2
    }

    private <T> java.util.List<T> clone(java.util.List<T> r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            return r0
    }

    private <K, V> java.util.Map<K, V> clone(java.util.Map<K, V> r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            return r0
    }

    private void collectExtensionMatches(java.util.List<bsh.BshMethod> r3, java.lang.Class<?> r4, java.util.List<bsh.BshMethod> r5) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L25
        L3:
            java.util.Iterator r3 = r3.iterator()
        L7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            bsh.BshMethod r0 = (bsh.BshMethod) r0
            boolean r1 = r0.isExtension
            if (r1 == 0) goto L7
            java.lang.Class<?> r1 = r0.receiverType
            if (r1 == 0) goto L7
            boolean r1 = bsh.Types.isJavaBoxTypesAssignable(r1, r4)
            if (r1 == 0) goto L7
            r5.add(r0)
            goto L7
        L25:
            return
    }

    public static /* synthetic */ java.lang.String[] d(int r0) {
            java.lang.String[] r0 = lambda$getVariableNames$0(r0)
            return r0
    }

    public static /* synthetic */ bsh.Variable e(java.lang.String r0, bsh.Variable r1) {
            bsh.Variable r0 = lambda$toLambdaNameSpace$6(r0, r1)
            return r0
    }

    public static /* synthetic */ bsh.Variable[] f(int r0) {
            bsh.Variable[] r0 = lambda$getDeclaredVariables$5(r0)
            return r0
    }

    public static /* synthetic */ java.util.stream.Stream g(java.util.List r0) {
            java.util.stream.Stream r0 = lambda$getMethods$3(r0)
            return r0
    }

    private java.lang.Class<?> getClassImpl(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r2.classCache
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L11
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r2.classCache
            java.lang.Object r3 = r0.get(r3)
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L11:
            boolean r0 = bsh.Name.isCompound(r3)
            if (r0 != 0) goto L27
            java.lang.Class r0 = r2.getImportedClassImpl(r3)
            if (r0 != 0) goto L21
            java.lang.Class r0 = r2.classForName(r3)
        L21:
            if (r0 == 0) goto L27
            r2.cacheClass(r3, r0)
            return r0
        L27:
            java.lang.Class r0 = r2.classForName(r3)
            if (r0 == 0) goto L2e
            return r0
        L2e:
            java.lang.String r0 = "getClass(): "
            java.lang.String r1 = " not found in "
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3, r1, r2}
            bsh.Interpreter.debug(r3)
            r3 = 0
            return r3
    }

    private java.lang.Class<?> getImportedClassImpl(java.lang.String r5) {
            r4 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.importedClasses
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            if (r0 == 0) goto L34
            java.lang.Class r5 = r4.classForName(r0)
            if (r5 == 0) goto L12
            return r5
        L12:
            boolean r2 = bsh.Name.isCompound(r0)
            if (r2 == 0) goto L20
            bsh.Name r2 = r4.getNameResolver(r0)     // Catch: java.lang.ClassNotFoundException -> L20
            java.lang.Class r5 = r2.toClass()     // Catch: java.lang.ClassNotFoundException -> L20
        L20:
            java.lang.String r2 = "imported unpackaged name not found:"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
            bsh.Interpreter.debug(r2)
            if (r5 == 0) goto L33
            bsh.BshClassManager r1 = r4.getClassManager()
            r1.cacheClassInfo(r0, r5)
            return r5
        L33:
            return r1
        L34:
            java.util.List<java.lang.String> r0 = r4.importedPackages
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "."
            java.lang.String r2 = wb.en.h(r2, r3, r5)
            java.lang.Class r2 = r4.classForName(r2)
            if (r2 == 0) goto L3a
            return r2
        L53:
            bsh.BshClassManager r0 = r4.getClassManager()
            boolean r2 = r0.hasSuperImport()
            if (r2 == 0) goto L68
            java.lang.String r5 = r0.getClassNameByUnqName(r5)
            if (r5 == 0) goto L68
            java.lang.Class r5 = r4.classForName(r5)
            return r5
        L68:
            return r1
    }

    public static java.lang.Class<?> identifierToClass(bsh.ClassIdentifier r0) {
            java.lang.Class r0 = r0.getTargetClass()
            return r0
    }

    private static /* synthetic */ bsh.Variable[] lambda$getDeclaredVariables$5(int r0) {
            bsh.Variable[] r0 = new bsh.Variable[r0]
            return r0
    }

    private static /* synthetic */ java.lang.String[] lambda$getMethodNames$2(int r0) {
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    private static /* synthetic */ java.util.stream.Stream lambda$getMethods$3(java.util.List r0) {
            java.util.stream.Stream r0 = r0.stream()
            return r0
    }

    private static /* synthetic */ bsh.BshMethod[] lambda$getMethods$4(int r0) {
            bsh.BshMethod[] r0 = new bsh.BshMethod[r0]
            return r0
    }

    private static /* synthetic */ java.lang.String[] lambda$getVariableNames$0(int r0) {
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    private static /* synthetic */ bsh.Variable[] lambda$getVariables$1(int r0) {
            bsh.Variable[] r0 = new bsh.Variable[r0]
            return r0
    }

    private static /* synthetic */ bsh.Variable lambda$toLambdaNameSpace$6(java.lang.String r1, bsh.Variable r2) {
            bsh.Variable r1 = r2.clone()
            bsh.Modifiers r2 = r1.modifiers
            java.lang.String r0 = "final"
            r2.addModifier(r0)
            return r1
    }

    private bsh.BshMethod loadScriptedCommand(java.io.InputStream r2, java.lang.String r3, java.lang.Class<?>[] r4, java.lang.String r5, bsh.Interpreter r6) {
            r1 = this;
            bsh.FileReader r0 = new bsh.FileReader     // Catch: bsh.EvalError -> L10 java.io.IOException -> L12
            r0.<init>(r2)     // Catch: bsh.EvalError -> L10 java.io.IOException -> L12
            r6.eval(r0, r1, r5)     // Catch: java.lang.Throwable -> L14
            r0.close()     // Catch: bsh.EvalError -> L10 java.io.IOException -> L12
            bsh.BshMethod r2 = r1.getMethod(r3, r4)
            return r2
        L10:
            r2 = move-exception
            goto L1e
        L12:
            r2 = move-exception
            goto L1e
        L14:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: bsh.EvalError -> L10 java.io.IOException -> L12
        L1d:
            throw r2     // Catch: bsh.EvalError -> L10 java.io.IOException -> L12
        L1e:
            java.lang.String r3 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            bsh.Interpreter.debug(r3)
            bsh.UtilEvalError r3 = new bsh.UtilEvalError
            java.lang.String r4 = r2.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Error loading script: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4, r2)
            throw r3
    }

    private void readObject(java.io.ObjectInputStream r1) {
            r0 = this;
            r1.defaultReadObject()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.classCache = r1
            return
    }

    private bsh.BshMethod selectMethod(java.lang.Class<?>[] r3, java.util.List<bsh.BshMethod> r4, boolean r5) {
            r2 = this;
            if (r5 == 0) goto L3
            goto L25
        L3:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = r4.size()
            r5.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L10:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r4.next()
            bsh.BshMethod r0 = (bsh.BshMethod) r0
            boolean r1 = r0.isExtension
            if (r1 != 0) goto L10
            r5.add(r0)
            goto L10
        L24:
            r4 = r5
        L25:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L2d
            r3 = 0
            return r3
        L2d:
            bsh.BshMethod r3 = bsh.Reflect.findMostSpecificBshMethod(r3, r4)
            return r3
    }

    private synchronized void writeObject(java.io.ObjectOutputStream r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map<java.lang.String, bsh.Name> r0 = r1.names     // Catch: java.lang.Throwable -> Lb
            r0.clear()     // Catch: java.lang.Throwable -> Lb
            r2.defaultWriteObject()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // bsh.NameSource
    public void addNameSourceListener(bsh.NameSource.Listener r2) {
            r1 = this;
            java.util.List<bsh.NameSource$Listener> r0 = r1.nameSourceListeners
            r0.add(r2)
            return
    }

    public boolean attemptSetPropertyValue(java.lang.String r3, java.lang.Object r4, bsh.Interpreter r5) {
            r2 = this;
            java.lang.String r0 = "set"
            java.lang.String r3 = bsh.Reflect.accessorName(r0, r3)
            java.lang.Object r0 = bsh.Primitive.unwrap(r4)
            if (r0 != 0) goto Le
            r0 = 0
            goto L12
        Le:
            java.lang.Class r0 = r0.getClass()
        L12:
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            bsh.BshMethod r0 = r2.getMethod(r3, r0)
            if (r0 == 0) goto L3e
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: bsh.EvalError -> L25
            r2.invokeMethod(r3, r4, r5)     // Catch: bsh.EvalError -> L25
            r3 = 1
            return r3
        L25:
            r3 = move-exception
            bsh.UtilEvalError r4 = new bsh.UtilEvalError
            java.lang.String r5 = r3.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "'This' property accessor threw exception: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5, r3)
            throw r4
        L3e:
            r3 = 0
            return r3
    }

    public void cacheClass(java.lang.String r2, java.lang.Class<?> r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r1.classCache
            r0.put(r2, r3)
            return
    }

    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
            r0 = this;
            r0.nameSpaceChanged()
            return
    }

    public void clear() {
            r1 = this;
            java.util.Map<java.lang.String, bsh.Variable> r0 = r1.variables
            r0.clear()
            java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> r0 = r1.methods
            r0.clear()
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.importedClasses
            r0.clear()
            java.util.List<java.lang.String> r0 = r1.importedPackages
            r0.clear()
            java.util.List<java.lang.String> r0 = r1.importedCommands
            r0.clear()
            java.util.List<java.lang.Object> r0 = r1.importedObjects
            r0.clear()
            bsh.NameSpace r0 = r1.parent
            if (r0 != 0) goto L25
            r1.loadDefaultImports()
        L25:
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r1.classCache
            r0.clear()
            java.util.Map<java.lang.String, bsh.Name> r0 = r1.names
            r0.clear()
            return
    }

    public bsh.NameSpace copy() {
            r2 = this;
            java.lang.Object r0 = r2.clone()     // Catch: java.lang.CloneNotSupportedException -> L4a
            bsh.NameSpace r0 = (bsh.NameSpace) r0     // Catch: java.lang.CloneNotSupportedException -> L4a
            r1 = 0
            r0.thisReference = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.Map<java.lang.String, bsh.Variable> r1 = r2.variables     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.Map r1 = r2.clone(r1)     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0.variables = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> r1 = r2.methods     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.Map r1 = r2.clone(r1)     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0.methods = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.importedClasses     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.Map r1 = r2.clone(r1)     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0.importedClasses = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.List<java.lang.String> r1 = r2.importedPackages     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.List r1 = r2.clone(r1)     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0.importedPackages = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.List<java.lang.String> r1 = r2.importedCommands     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.List r1 = r2.clone(r1)     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0.importedCommands = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.List<java.lang.Object> r1 = r2.importedObjects     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.List r1 = r2.clone(r1)     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0.importedObjects = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.List<java.lang.Class<?>> r1 = r2.importedStatic     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.List r1 = r2.clone(r1)     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0.importedStatic = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.Map<java.lang.String, bsh.Name> r1 = r2.names     // Catch: java.lang.CloneNotSupportedException -> L4a
            java.util.Map r1 = r2.clone(r1)     // Catch: java.lang.CloneNotSupportedException -> L4a
            r0.names = r1     // Catch: java.lang.CloneNotSupportedException -> L4a
            return r0
        L4a:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }

    public bsh.Variable createVariable(java.lang.String r2, java.lang.Class<?> r3, bsh.LHS r4) {
            r1 = this;
            bsh.Variable r0 = new bsh.Variable
            r0.<init>(r2, r3, r4)
            return r0
    }

    public bsh.Variable createVariable(java.lang.String r2, java.lang.Class<?> r3, java.lang.Object r4, bsh.Modifiers r5) {
            r1 = this;
            bsh.Variable r0 = new bsh.Variable
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public bsh.Variable createVariable(java.lang.String r2, java.lang.Object r3, bsh.Modifiers r4) {
            r1 = this;
            r0 = 0
            bsh.Variable r2 = r1.createVariable(r2, r0, r3, r4)
            return r2
    }

    public void doSuperImport() {
            r1 = this;
            bsh.BshClassManager r0 = r1.getClassManager()
            r0.doSuperImport()
            return
    }

    public java.lang.Object get(java.lang.String r2, bsh.Interpreter r3) {
            r1 = this;
            bsh.CallStack r0 = new bsh.CallStack
            r0.<init>(r1)
            bsh.Name r2 = r1.getNameResolver(r2)
            java.lang.Object r2 = r2.toObject(r0, r3)
            return r2
    }

    @Override // bsh.NameSource
    public java.lang.String[] getAllNames() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.getAllNamesAux(r0)
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public void getAllNamesAux(java.util.List<java.lang.String> r2) {
            r1 = this;
            java.util.Map<java.lang.String, bsh.Variable> r0 = r1.variables
            java.util.Set r0 = r0.keySet()
            r2.addAll(r0)
            java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> r0 = r1.methods
            if (r0 == 0) goto L14
            java.util.Set r0 = r0.keySet()
            r2.addAll(r0)
        L14:
            bsh.NameSpace r0 = r1.parent
            if (r0 == 0) goto L1b
            r0.getAllNamesAux(r2)
        L1b:
            return
    }

    public java.lang.Class<?> getClass(java.lang.String r2) {
            r1 = this;
            java.lang.Class r0 = r1.getClassImpl(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            bsh.NameSpace r0 = r1.parent
            if (r0 == 0) goto L10
            java.lang.Class r2 = r0.getClass(r2)
            return r2
        L10:
            bsh.BshClassManager r0 = r1.classManager
            bsh.loader.BshLoaderManager r0 = r0.loaderManager
            java.lang.Class r2 = r0.getLoaderClass(r2)
            if (r2 == 0) goto L1b
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public java.lang.Object getClassInstance() {
            r3 = this;
            java.lang.Object r0 = r3.classInstance
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class<?> r0 = r3.classStatic
            if (r0 == 0) goto L11
            bsh.UtilEvalError r0 = new bsh.UtilEvalError
            java.lang.String r1 = "Can't refer to class instance from static context."
            r0.<init>(r1)
            throw r0
        L11:
            bsh.InterpreterError r0 = new bsh.InterpreterError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't resolve class instance 'this' in: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public bsh.BshClassManager getClassManager() {
            r2 = this;
            bsh.BshClassManager r0 = r2.classManager
            if (r0 == 0) goto L5
            return r0
        L5:
            bsh.NameSpace r0 = r2.parent
            if (r0 == 0) goto L12
            bsh.NameSpace r1 = bsh.NameSpace.JAVACODE
            if (r0 == r1) goto L12
            bsh.BshClassManager r0 = r0.getClassManager()
            return r0
        L12:
            r0 = 0
            bsh.BshClassManager r0 = bsh.BshClassManager.createClassManager(r0)
            r2.setClassManager(r0)
            bsh.BshClassManager r0 = r2.classManager
            return r0
    }

    public java.lang.Object getCommand(java.lang.String r12, java.lang.Class<?>[] r13, bsh.Interpreter r14) {
            r11 = this;
            java.lang.String r0 = "Get command: "
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r12}
            bsh.Interpreter.debug(r0)
            bsh.BshClassManager r0 = r14.getClassManager()
            java.util.List<java.lang.String> r1 = r11.importedCommands
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L97
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "/"
            boolean r4 = r2.equals(r3)
            java.lang.String r5 = ".bsh"
            if (r4 == 0) goto L2f
            java.lang.String r4 = wb.en.h(r2, r12, r5)
        L2d:
            r9 = r4
            goto L34
        L2f:
            java.lang.String r4 = wb.en.i(r2, r3, r12, r5)
            goto L2d
        L34:
            java.lang.String r4 = "searching for script: "
            java.lang.String r4 = r4.concat(r9)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            bsh.Interpreter.debug(r4)
            java.net.URL r4 = r0.getResource(r9)
            if (r4 == 0) goto L57
            java.lang.Object r4 = r4.getContent()     // Catch: java.io.IOException -> L57
            r6 = r4
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch: java.io.IOException -> L57
            r5 = r11
            r7 = r12
            r8 = r13
            r10 = r14
            bsh.BshMethod r12 = r5.loadScriptedCommand(r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L5b
            return r12
        L57:
            r5 = r11
            r7 = r12
            r8 = r13
            r10 = r14
        L5b:
            boolean r12 = r2.equals(r3)
            if (r12 == 0) goto L63
            r12 = r7
            goto L7e
        L63:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r13 = 1
            java.lang.String r13 = r2.substring(r13)
            r14 = 47
            r2 = 46
            java.lang.String r13 = r13.replace(r14, r2)
            r12.append(r13)
            java.lang.String r13 = "."
            java.lang.String r12 = eh.a.r(r12, r13, r7)
        L7e:
            java.lang.String r13 = "searching for class: "
            java.lang.String r13 = wb.en.g(r13, r12)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            bsh.Interpreter.debug(r13)
            java.lang.Class r12 = r0.classForName(r12)
            if (r12 == 0) goto L92
            return r12
        L92:
            r12 = r7
            r13 = r8
            r14 = r10
            goto L13
        L97:
            r5 = r11
            r7 = r12
            r8 = r13
            r10 = r14
            bsh.NameSpace r12 = r5.parent
            if (r12 == 0) goto La4
            java.lang.Object r12 = r12.getCommand(r7, r8, r10)
            return r12
        La4:
            r12 = 0
            return r12
    }

    public bsh.Variable[] getDeclaredVariables() {
            r3 = this;
            java.util.Map<java.lang.String, bsh.Variable> r0 = r3.variables
            java.util.Collection r0 = r0.values()
            java.util.stream.Stream r0 = r0.stream()
            bsh.e r1 = new bsh.e
            r2 = 5
            r1.<init>(r2)
            java.lang.Object[] r0 = r0.toArray(r1)
            bsh.Variable[] r0 = (bsh.Variable[]) r0
            return r0
    }

    public bsh.BshMethod getExtensionMethod(java.lang.Class<?> r7, java.lang.String r8, java.lang.Class<?>[] r9) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r6
        L6:
            if (r1 == 0) goto L56
            java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> r2 = r1.methods
            java.lang.Object r2 = r2.get(r8)
            java.util.List r2 = (java.util.List) r2
            r6.collectExtensionMatches(r2, r7, r0)
            java.util.List<java.lang.Object> r2 = r1.importedObjects
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r2.next()
            if (r3 != 0) goto L26
            goto L19
        L26:
            java.lang.Class r4 = r3.getClass()
        L2a:
            if (r4 == 0) goto L19
            boolean r5 = bsh.Reflect.isGeneratedClass(r4)
            if (r5 == 0) goto L19
            java.lang.String r5 = r4.getSimpleName()
            bsh.This r5 = bsh.Reflect.getClassInstanceThis(r3, r5)
            if (r5 != 0) goto L3d
            goto L4c
        L3d:
            bsh.NameSpace r5 = r5.getNameSpace()
            java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> r5 = r5.methods
            java.lang.Object r5 = r5.get(r8)
            java.util.List r5 = (java.util.List) r5
            r6.collectExtensionMatches(r5, r7, r0)
        L4c:
            java.lang.Class r4 = r4.getSuperclass()
            goto L2a
        L51:
            bsh.NameSpace r1 = r1.getParent()
            goto L6
        L56:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L5e
            r7 = 0
            return r7
        L5e:
            bsh.BshMethod r7 = bsh.Reflect.findMostSpecificExtensionMethod(r7, r9, r0)
            return r7
    }

    public bsh.This getGlobal(bsh.Interpreter r2) {
            r1 = this;
            bsh.NameSpace r0 = r1.parent
            if (r0 == 0) goto L9
            bsh.This r2 = r0.getGlobal(r2)
            return r2
        L9:
            bsh.This r2 = r1.getThis(r2)
            return r2
    }

    public bsh.BshMethod getImportedMethod(java.lang.String r5, java.lang.Class<?>[] r6) {
            r4 = this;
            java.util.List<java.lang.Object> r0 = r4.importedObjects
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            java.lang.Class r2 = r1.getClass()
            r3 = 0
            bsh.Invocable r2 = bsh.Reflect.resolveJavaMethod(r2, r5, r6, r3)
            if (r2 == 0) goto L6
            bsh.BshMethod r5 = new bsh.BshMethod
            r5.<init>(r2, r1)
            return r5
        L21:
            java.util.List<java.lang.Class<?>> r0 = r4.importedStatic
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            r3 = 1
            bsh.Invocable r1 = bsh.Reflect.resolveJavaMethod(r1, r5, r6, r3)
            if (r1 == 0) goto L27
            bsh.BshMethod r5 = new bsh.BshMethod
            r5.<init>(r1, r2)
            return r5
        L41:
            return r2
    }

    public bsh.Variable getImportedVar(java.lang.String r7) {
            r6 = this;
            java.util.List<java.lang.Object> r0 = r6.importedObjects
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r0.next()
            java.lang.Class r4 = r3.getClass()
            r5 = 0
            bsh.Invocable r4 = bsh.Reflect.resolveJavaField(r4, r7, r5)
            if (r4 == 0) goto L2b
            java.lang.Class r2 = r4.getReturnType()
            bsh.LHS r5 = new bsh.LHS
            r5.<init>(r3, r4)
            bsh.Variable r2 = r6.createVariable(r7, r2, r5)
            goto L55
        L2b:
            boolean r4 = r6.isClass
            if (r4 == 0) goto L55
            java.lang.Class r4 = r3.getClass()
        L33:
            java.lang.Class r4 = r4.getSuperclass()
            boolean r5 = bsh.Reflect.isGeneratedClass(r4)
            if (r5 == 0) goto L55
            java.lang.String r5 = r4.getSimpleName()
            bsh.This r5 = bsh.Reflect.getClassInstanceThis(r3, r5)
            if (r5 == 0) goto L33
            bsh.NameSpace r2 = r5.getNameSpace()
            java.util.Map<java.lang.String, bsh.Variable> r2 = r2.variables
            java.lang.Object r2 = r2.get(r7)
            bsh.Variable r2 = (bsh.Variable) r2
            if (r2 == 0) goto L33
        L55:
            if (r2 == 0) goto L8
            java.util.Map<java.lang.String, bsh.Variable> r0 = r6.variables
            r0.put(r7, r2)
            return r2
        L5d:
            java.util.List<java.lang.Class<?>> r0 = r6.importedStatic
            java.util.Iterator r0 = r0.iterator()
        L63:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r2 = r0.next()
            java.lang.Class r2 = (java.lang.Class) r2
            r3 = 1
            bsh.Invocable r2 = bsh.Reflect.resolveJavaField(r2, r7, r3)
            if (r2 == 0) goto L63
            java.lang.Class r0 = r2.getReturnType()
            bsh.LHS r1 = new bsh.LHS
            r1.<init>(r2)
            bsh.Variable r0 = r6.createVariable(r7, r0, r1)
            java.util.Map<java.lang.String, bsh.Variable> r1 = r6.variables
            r1.put(r7, r0)
            return r0
        L89:
            return r1
    }

    public int getInvocationLine() {
            r1 = this;
            bsh.Node r0 = r1.getNode()
            if (r0 == 0) goto Lb
            int r0 = r0.getLineNumber()
            return r0
        Lb:
            r0 = -1
            return r0
    }

    public java.lang.String getInvocationText() {
            r1 = this;
            bsh.Node r0 = r1.getNode()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.getText()
            return r0
        Lb:
            java.lang.String r0 = "<invoked from Java code>"
            return r0
    }

    public bsh.BshMethod getMethod(java.lang.String r2, java.lang.Class<?>[] r3) {
            r1 = this;
            r0 = 0
            bsh.BshMethod r2 = r1.getMethod(r2, r3, r0)
            return r2
    }

    public bsh.BshMethod getMethod(java.lang.String r2, java.lang.Class<?>[] r3, boolean r4) {
            r1 = this;
            r0 = 0
            bsh.BshMethod r2 = r1.getMethod(r2, r3, r4, r0)
            return r2
    }

    public bsh.BshMethod getMethod(java.lang.String r3, java.lang.Class<?>[] r4, boolean r5, boolean r6) {
            r2 = this;
            java.lang.String r0 = "Get method: "
            java.lang.String r1 = " "
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3, r1, r2}
            bsh.Interpreter.debug(r0)
            boolean r0 = r2.isClass
            if (r0 == 0) goto L1a
            boolean r0 = r2.isEnum
            if (r0 != 0) goto L1a
            if (r5 != 0) goto L1a
            bsh.BshMethod r0 = r2.getImportedMethod(r3, r4)
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L31
            java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> r1 = r2.methods
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L31
            java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> r0 = r2.methods
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            bsh.BshMethod r0 = r2.selectMethod(r4, r0, r6)
        L31:
            if (r0 != 0) goto L3d
            boolean r1 = r2.isClass
            if (r1 != 0) goto L3d
            if (r5 != 0) goto L3d
            bsh.BshMethod r0 = r2.getImportedMethod(r3, r4)
        L3d:
            if (r0 != 0) goto L4b
            if (r5 != 0) goto L4b
            bsh.NameSpace r5 = r2.parent
            if (r5 == 0) goto L4b
            r0 = 0
            bsh.BshMethod r3 = r5.getMethod(r3, r4, r0, r6)
            return r3
        L4b:
            return r0
    }

    public java.lang.String[] getMethodNames() {
            r3 = this;
            java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> r0 = r3.methods
            java.util.Set r0 = r0.keySet()
            java.util.stream.Stream r0 = r0.stream()
            bsh.e r1 = new bsh.e
            r2 = 8
            r1.<init>(r2)
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public bsh.BshMethod[] getMethods() {
            r3 = this;
            java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> r0 = r3.methods
            java.util.Collection r0 = r0.values()
            java.util.stream.Stream r0 = r0.stream()
            bsh.b r1 = new bsh.b
            r2 = 12
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.flatMap(r1)
            bsh.e r1 = new bsh.e
            r2 = 7
            r1.<init>(r2)
            java.lang.Object[] r0 = r0.toArray(r1)
            bsh.BshMethod[] r0 = (bsh.BshMethod[]) r0
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.nsName
            return r0
    }

    public bsh.Name getNameResolver(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, bsh.Name> r0 = r2.names
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L12
            java.util.Map<java.lang.String, bsh.Name> r0 = r2.names
            bsh.Name r1 = new bsh.Name
            r1.<init>(r2, r3)
            r0.put(r3, r1)
        L12:
            java.util.Map<java.lang.String, bsh.Name> r0 = r2.names
            java.lang.Object r3 = r0.get(r3)
            bsh.Name r3 = (bsh.Name) r3
            return r3
    }

    public bsh.Node getNode() {
            r1 = this;
            bsh.Node r0 = r1.callerInfoNode
            if (r0 == 0) goto L5
            return r0
        L5:
            bsh.NameSpace r0 = r1.parent
            if (r0 == 0) goto Le
            bsh.Node r0 = r0.getNode()
            return r0
        Le:
            r0 = 0
            return r0
    }

    public java.lang.String getPackage() {
            r1 = this;
            java.lang.String r0 = r1.packageName
            if (r0 == 0) goto L5
            return r0
        L5:
            bsh.NameSpace r0 = r1.parent
            if (r0 == 0) goto Le
            java.lang.String r0 = r0.getPackage()
            return r0
        Le:
            r0 = 0
            return r0
    }

    public bsh.NameSpace getParent() {
            r1 = this;
            bsh.NameSpace r0 = r1.parent
            return r0
    }

    public java.lang.Object getPropertyValue(java.lang.String r4, bsh.Interpreter r5) {
            r3 = this;
            java.lang.String r0 = "get"
            java.lang.String r0 = bsh.Reflect.accessorName(r0, r4)
            java.lang.Class<?>[] r1 = bsh.Reflect.ZERO_TYPES
            bsh.BshMethod r0 = r3.getMethod(r0, r1)
            r2 = 0
            if (r0 == 0) goto L16
            java.lang.Object r4 = r0.invoke(r2, r5)     // Catch: bsh.EvalError -> L14
            return r4
        L14:
            r4 = move-exception
            goto L32
        L16:
            java.lang.String r0 = "is"
            java.lang.String r4 = bsh.Reflect.accessorName(r0, r4)     // Catch: bsh.EvalError -> L14
            bsh.BshMethod r4 = r3.getMethod(r4, r1)     // Catch: bsh.EvalError -> L14
            if (r4 == 0) goto L2f
            java.lang.Class r0 = r4.getReturnType()     // Catch: bsh.EvalError -> L14
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: bsh.EvalError -> L14
            if (r0 != r1) goto L2f
            java.lang.Object r4 = r4.invoke(r2, r5)     // Catch: bsh.EvalError -> L14
            return r4
        L2f:
            bsh.Primitive r4 = bsh.Primitive.VOID     // Catch: bsh.EvalError -> L14
            return r4
        L32:
            bsh.UtilEvalError r5 = new bsh.UtilEvalError
            java.lang.String r0 = r4.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "'This' property accessor threw exception: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0, r4)
            throw r5
    }

    public bsh.This getSuper(bsh.Interpreter r3) {
            r2 = this;
            boolean r0 = r2.isClass
            if (r0 == 0) goto L1d
            java.lang.Class<?> r0 = r2.classStatic
            if (r0 == 0) goto L1d
            java.lang.Class r0 = r0.getSuperclass()
            boolean r1 = bsh.Reflect.isGeneratedClass(r0)
            if (r1 == 0) goto L1d
            java.lang.Object r3 = r2.classInstance
            java.lang.String r0 = r0.getSimpleName()
            bsh.This r3 = bsh.Reflect.getClassInstanceThis(r3, r0)
            return r3
        L1d:
            bsh.NameSpace r0 = r2.parent
            if (r0 == 0) goto L2f
            boolean r1 = r0.isClass
            if (r1 == 0) goto L2a
            bsh.This r3 = r0.getSuper(r3)
            return r3
        L2a:
            bsh.This r3 = r0.getThis(r3)
            return r3
        L2f:
            bsh.This r3 = r2.getThis(r3)
            return r3
    }

    public bsh.This getThis(bsh.Interpreter r2) {
            r1 = this;
            bsh.This r0 = r1.thisReference
            if (r0 != 0) goto La
            bsh.This r2 = bsh.This.getThis(r1, r2)
            r1.thisReference = r2
        La:
            bsh.This r2 = r1.thisReference
            return r2
    }

    public java.lang.Object getVariable(java.lang.String r2) {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.getVariable(r2, r0)
            return r2
    }

    public java.lang.Object getVariable(java.lang.String r3, boolean r4) {
            r2 = this;
            bsh.Variable r4 = r2.getVariableImpl(r3, r4)
            java.lang.String r0 = "Get variable: "
            java.lang.String r1 = " = "
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3, r1, r4}
            bsh.Interpreter.debug(r3)
            java.lang.Object r3 = r2.unwrapVariable(r4)
            return r3
    }

    public bsh.Variable getVariableImpl(java.lang.String r3, boolean r4) {
            r2 = this;
            java.util.Map<java.lang.String, bsh.Variable> r0 = r2.variables
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L11
            java.util.Map<java.lang.String, bsh.Variable> r4 = r2.variables
            java.lang.Object r3 = r4.get(r3)
            bsh.Variable r3 = (bsh.Variable) r3
            return r3
        L11:
            bsh.Variable r0 = r2.getImportedVar(r3)
            if (r4 == 0) goto L22
            if (r0 != 0) goto L22
            bsh.NameSpace r1 = r2.parent
            if (r1 == 0) goto L22
            bsh.Variable r3 = r1.getVariableImpl(r3, r4)
            return r3
        L22:
            return r0
    }

    public java.lang.String[] getVariableNames() {
            r3 = this;
            java.util.Map<java.lang.String, bsh.Variable> r0 = r3.variables
            java.util.Set r0 = r0.keySet()
            java.util.stream.Stream r0 = r0.stream()
            bsh.e r1 = new bsh.e
            r2 = 6
            r1.<init>(r2)
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public java.lang.Object getVariableOrProperty(java.lang.String r3, bsh.Interpreter r4) {
            r2 = this;
            r0 = 1
            java.lang.Object r0 = r2.getVariable(r3, r0)
            bsh.Primitive r1 = bsh.Primitive.VOID
            if (r0 != r1) goto Le
            java.lang.Object r3 = r2.getPropertyValue(r3, r4)
            return r3
        Le:
            return r0
    }

    public bsh.Variable[] getVariables() {
            r3 = this;
            java.util.Map<java.lang.String, bsh.Variable> r0 = r3.variables
            java.util.Collection r0 = r0.values()
            java.util.stream.Stream r0 = r0.stream()
            bsh.e r1 = new bsh.e
            r2 = 4
            r1.<init>(r2)
            java.lang.Object[] r0 = r0.toArray(r1)
            bsh.Variable[] r0 = (bsh.Variable[]) r0
            return r0
    }

    public void importClass(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.importedClasses
            r1 = 1
            java.lang.String r1 = bsh.Name.suffix(r3, r1)
            r0.put(r1, r3)
            r2.nameSpaceChanged()
            return
    }

    public void importCommands(java.lang.String r5) {
            r4 = this;
            r0 = 46
            r1 = 47
            java.lang.String r5 = r5.replace(r0, r1)
            java.lang.String r0 = "/"
            boolean r1 = r5.startsWith(r0)
            if (r1 != 0) goto L14
            java.lang.String r5 = r0.concat(r5)
        L14:
            int r1 = r5.length()
            r2 = 0
            r3 = 1
            if (r1 <= r3) goto L26
            boolean r0 = r5.endsWith(r0)
            if (r0 == 0) goto L26
            java.lang.String r5 = wb.en.f(r3, r2, r5)
        L26:
            java.util.List<java.lang.String> r0 = r4.importedCommands
            r0.remove(r5)
            java.util.List<java.lang.String> r0 = r4.importedCommands
            r0.add(r2, r5)
            r4.nameSpaceChanged()
            return
    }

    public void importObject(java.lang.Object r3) {
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.importedObjects
            r0.remove(r3)
            java.util.List<java.lang.Object> r0 = r2.importedObjects
            r1 = 0
            r0.add(r1, r3)
            r2.nameSpaceChanged()
            return
    }

    public void importPackage(java.lang.String r3) {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.importedPackages
            r0.remove(r3)
            java.util.List<java.lang.String> r0 = r2.importedPackages
            r1 = 0
            r0.add(r1, r3)
            r2.nameSpaceChanged()
            return
    }

    public void importStatic(java.lang.Class<?> r3) {
            r2 = this;
            java.util.List<java.lang.Class<?>> r0 = r2.importedStatic
            r0.remove(r3)
            java.util.List<java.lang.Class<?>> r0 = r2.importedStatic
            r1 = 0
            r0.add(r1, r3)
            r2.nameSpaceChanged()
            return
    }

    public java.lang.Object invokeCommand(java.lang.String r8, java.lang.Object[] r9, bsh.Interpreter r10, bsh.CallStack r11, bsh.Node r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r8 = r0.invokeCommand(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public java.lang.Object invokeCommand(java.lang.String r9, java.lang.Object[] r10, bsh.Interpreter r11, bsh.CallStack r12, bsh.Node r13, boolean r14) {
            r8 = this;
            java.lang.Class[] r0 = bsh.Types.getTypes(r10)
            java.lang.Object r1 = r8.getCommand(r9, r0, r11)     // Catch: bsh.UtilEvalError -> L59
            if (r1 != 0) goto L3a
            if (r14 != 0) goto L1f
            r14 = 1
            boolean[] r7 = new boolean[r14]
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r9 = r1.invokeDefaultInvokeMethod(r2, r3, r4, r5, r6, r7)
            r10 = 0
            boolean r10 = r7[r10]
            if (r10 == 0) goto L22
            return r9
        L1f:
            r2 = r9
            r5 = r12
            r6 = r13
        L22:
            bsh.EvalException r9 = new bsh.EvalException
            java.lang.String r10 = bsh.StringUtil.methodString(r2, r0)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Command not found: "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10, r6, r5)
            throw r9
        L3a:
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r9 = r1 instanceof bsh.BshMethod
            if (r9 == 0) goto L49
            bsh.BshMethod r1 = (bsh.BshMethod) r1
            java.lang.Object r9 = r1.invoke(r3, r4, r5, r6)
            return r9
        L49:
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: bsh.UtilEvalError -> L50
            java.lang.Object r9 = bsh.Reflect.invokeCompiledCommand(r1, r3, r4, r5, r6)     // Catch: bsh.UtilEvalError -> L50
            return r9
        L50:
            r0 = move-exception
            r9 = r0
            java.lang.String r10 = "Error invoking compiled command: "
            bsh.EvalError r9 = r9.toEvalError(r10, r6, r5)
            throw r9
        L59:
            r0 = move-exception
            r5 = r12
            r6 = r13
            r9 = r0
            java.lang.String r10 = "Error loading command: "
            bsh.EvalError r9 = r9.toEvalError(r10, r6, r5)
            throw r9
    }

    public java.lang.Object invokeDefaultInvokeMethod(java.lang.String r5, java.lang.Object[] r6, bsh.Interpreter r7, bsh.CallStack r8, bsh.Node r9, boolean[] r10) {
            r4 = this;
            java.lang.String r0 = "invoke"
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[]{r1, r1}     // Catch: bsh.UtilEvalError -> L1f
            bsh.BshMethod r0 = r4.getMethod(r0, r2)     // Catch: bsh.UtilEvalError -> L1f
            r2 = 0
            if (r0 == 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = r2
        L11:
            r10[r2] = r3
            if (r3 == 0) goto L1e
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            java.lang.Object r5 = r0.invoke(r5, r7, r8, r9)
            return r5
        L1e:
            return r1
        L1f:
            r5 = move-exception
            java.lang.String r6 = "Local method invocation"
            bsh.EvalError r5 = r5.toEvalError(r6, r9, r8)
            throw r5
    }

    public java.lang.Object invokeMethod(java.lang.String r7, java.lang.Object[] r8, bsh.Interpreter r9) {
            r6 = this;
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.Object r7 = r0.invokeMethod(r1, r2, r3, r4, r5)
            return r7
    }

    public java.lang.Object invokeMethod(java.lang.String r8, java.lang.Object[] r9, bsh.Interpreter r10, bsh.CallStack r11, bsh.Node r12) {
            r7 = this;
            bsh.This r0 = r7.getThis(r10)
            r6 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r8 = r0.invokeMethod(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public boolean isChildOf(bsh.NameSpace r2) {
            r1 = this;
            bsh.NameSpace r0 = r1.getParent()
            if (r0 == 0) goto L1c
            bsh.NameSpace r0 = r1.getParent()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1a
            bsh.NameSpace r0 = r1.getParent()
            boolean r2 = r0.isChildOf(r2)
            if (r2 == 0) goto L1c
        L1a:
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public void loadDefaultImports() {
            r1 = this;
            java.lang.String r0 = "org.json"
            r1.importPackage(r0)
            java.lang.String r0 = "android.widget"
            r1.importPackage(r0)
            java.lang.String r0 = "android.view"
            r1.importPackage(r0)
            java.lang.String r0 = "android.text"
            r1.importPackage(r0)
            java.lang.String r0 = "android.os"
            r1.importPackage(r0)
            java.lang.String r0 = "android.graphics"
            r1.importPackage(r0)
            java.lang.String r0 = "android.content"
            r1.importPackage(r0)
            java.lang.String r0 = "android.app"
            r1.importPackage(r0)
            java.lang.String r0 = "java.util.stream"
            r1.importPackage(r0)
            java.lang.String r0 = "java.util.regex"
            r1.importPackage(r0)
            java.lang.String r0 = "java.util.function"
            r1.importPackage(r0)
            java.lang.String r0 = "java.util"
            r1.importPackage(r0)
            java.lang.String r0 = "java.net"
            r1.importPackage(r0)
            java.lang.String r0 = "java.math"
            r1.importPackage(r0)
            java.lang.String r0 = "java.io"
            r1.importPackage(r0)
            java.lang.String r0 = "java.lang"
            r1.importPackage(r0)
            java.lang.String r0 = "/bsh/commands"
            r1.importCommands(r0)
            return
    }

    public void nameSpaceChanged() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r1.classCache
            r0.clear()
            java.util.Map<java.lang.String, bsh.Name> r0 = r1.names
            r0.clear()
            return
    }

    public void prune() {
            r1 = this;
            r1.getClassManager()
            r0 = 0
            r1.setParent(r0)
            return
    }

    public void setClassInstance(java.lang.Object r1) {
            r0 = this;
            r0.classInstance = r1
            r0.importObject(r1)
            return
    }

    public void setClassManager(bsh.BshClassManager r1) {
            r0 = this;
            r0.classManager = r1
            return
    }

    public void setClassStatic(java.lang.Class<?> r1) {
            r0 = this;
            r0.classStatic = r1
            r0.importStatic(r1)
            return
    }

    public bsh.Variable setLocalVariable(java.lang.String r2, java.lang.Object r3, boolean r4) {
            r1 = this;
            r0 = 0
            bsh.Variable r2 = r1.setVariable(r2, r3, r4, r0)
            return r2
    }

    public void setLocalVariableOrProperty(java.lang.String r2, java.lang.Object r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.setVariableOrProperty(r2, r3, r4, r0)
            return
    }

    public void setMethod(bsh.BshMethod r5) {
            r4 = this;
            java.lang.String r0 = r5.getName()
            java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> r1 = r4.methods
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L17
            java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> r1 = r4.methods
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 1
            r2.<init>(r3)
            r1.put(r0, r2)
        L17:
            java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> r1 = r4.methods
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            r1.remove(r5)
            java.util.Map<java.lang.String, java.util.List<bsh.BshMethod>> r1 = r4.methods
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            r0.add(r1, r5)
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.nsName = r1
            return
    }

    public void setNode(bsh.Node r1) {
            r0 = this;
            r0.callerInfoNode = r1
            return
    }

    public void setPackage(java.lang.String r1) {
            r0 = this;
            r0.packageName = r1
            return
    }

    public void setParent(bsh.NameSpace r1) {
            r0 = this;
            r0.parent = r1
            if (r1 != 0) goto L7
            r0.loadDefaultImports()
        L7:
            return
    }

    public void setTypedVariable(java.lang.String r4, java.lang.Class<?> r5, java.lang.Object r6, bsh.Modifiers r7) {
            r3 = this;
            r0 = 0
            bsh.Variable r1 = r3.getVariableImpl(r4, r0)
            if (r1 == 0) goto L36
            java.lang.Class r2 = r1.getType()
            if (r2 == 0) goto L36
            java.lang.Class r2 = r1.getType()
            if (r2 != r5) goto L1d
            bsh.Modifiers r4 = r1.modifiers
            if (r4 != 0) goto L19
            r1.modifiers = r7
        L19:
            r1.setValue(r6, r0)
            return
        L1d:
            bsh.UtilEvalError r5 = new bsh.UtilEvalError
            java.lang.String r6 = "Typed variable: "
            java.lang.String r7 = " was previously declared with type: "
            java.lang.StringBuilder r4 = bc.e.o(r6, r4, r7)
            java.lang.Class r6 = r1.getType()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L36:
            java.util.Map<java.lang.String, bsh.Variable> r0 = r3.variables
            bsh.Variable r5 = r3.createVariable(r4, r5, r6, r7)
            r0.put(r4, r5)
            return
    }

    @java.lang.Deprecated
    public void setTypedVariable(java.lang.String r3, java.lang.Class<?> r4, java.lang.Object r5, boolean r6) {
            r2 = this;
            bsh.Modifiers r0 = new bsh.Modifiers
            r1 = 3
            r0.<init>(r1)
            if (r6 == 0) goto Ld
            java.lang.String r6 = "final"
            r0.addModifier(r6)
        Ld:
            r2.setTypedVariable(r3, r4, r5, r0)
            return
    }

    public bsh.Variable setVariable(java.lang.String r1, java.lang.Object r2, boolean r3, boolean r4) {
            r0 = this;
            if (r2 != 0) goto L4
            bsh.Primitive r2 = bsh.Primitive.NULL
        L4:
            bsh.Variable r4 = r0.getVariableImpl(r1, r4)
            if (r4 == 0) goto Lf
            r1 = 1
            r4.setValue(r2, r1)
            return r4
        Lf:
            if (r3 != 0) goto L1f
            r3 = 0
            bsh.Variable r2 = r0.createVariable(r1, r2, r3)
            java.util.Map<java.lang.String, bsh.Variable> r3 = r0.variables
            r3.put(r1, r2)
            r0.nameSpaceChanged()
            return r2
        L1f:
            bsh.UtilEvalError r2 = new bsh.UtilEvalError
            java.lang.String r3 = "(Strict Java mode) Assignment to undeclared variable: "
            java.lang.String r1 = wb.en.g(r3, r1)
            r2.<init>(r1)
            throw r2
    }

    public void setVariable(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            r1.setVariable(r2, r3, r0)
            return
    }

    public void setVariable(java.lang.String r2, java.lang.Object r3, boolean r4) {
            r1 = this;
            r0 = 1
            r1.setVariable(r2, r3, r4, r0)
            return
    }

    public void setVariableImpl(bsh.Variable r3) {
            r2 = this;
            java.util.Map<java.lang.String, bsh.Variable> r0 = r2.variables
            java.lang.String r1 = r3.getName()
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L15
            java.util.Map<java.lang.String, bsh.Variable> r0 = r2.variables
            java.lang.String r1 = r3.getName()
            r0.put(r1, r3)
        L15:
            return
    }

    public void setVariableOrProperty(java.lang.String r2, java.lang.Object r3, boolean r4) {
            r1 = this;
            r0 = 1
            r1.setVariableOrProperty(r2, r3, r4, r0)
            return
    }

    public void setVariableOrProperty(java.lang.String r2, java.lang.Object r3, boolean r4, boolean r5) {
            r1 = this;
            if (r3 == 0) goto L52
            bsh.Variable r5 = r1.getVariableImpl(r2, r5)
            if (r5 == 0) goto L27
            r4 = 1
            r5.setValue(r3, r4)     // Catch: bsh.UtilEvalError -> Ld
            return
        Ld:
            r3 = move-exception
            bsh.UtilEvalError r4 = new bsh.UtilEvalError
            java.lang.String r5 = "Variable assignment: "
            java.lang.String r0 = ": "
            java.lang.StringBuilder r2 = bc.e.o(r5, r2, r0)
            java.lang.String r5 = r3.getMessage()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r4.<init>(r2, r3)
            throw r4
        L27:
            if (r4 != 0) goto L46
            bsh.This r4 = r1.thisReference
            r5 = 0
            if (r4 == 0) goto L31
            bsh.Interpreter r4 = r4.declaringInterpreter
            goto L32
        L31:
            r4 = r5
        L32:
            boolean r4 = r1.attemptSetPropertyValue(r2, r3, r4)
            if (r4 == 0) goto L39
            return
        L39:
            java.util.Map<java.lang.String, bsh.Variable> r4 = r1.variables
            bsh.Variable r3 = r1.createVariable(r2, r3, r5)
            r4.put(r2, r3)
            r1.nameSpaceChanged()
            return
        L46:
            bsh.UtilEvalError r3 = new bsh.UtilEvalError
            java.lang.String r4 = "(Strict Java mode) Assignment to undeclared variable: "
            java.lang.String r2 = wb.en.g(r4, r2)
            r3.<init>(r2)
            throw r3
        L52:
            java.lang.String r2 = "null variable value"
            bsh.j.f(r2)
            return
    }

    public bsh.NameSpace toLambdaNameSpace() {
            r4 = this;
            bsh.NameSpace r0 = r4.copy()
            java.util.Stack r1 = new java.util.Stack
            r1.<init>()
            bsh.NameSpace r2 = r4.parent
        Lb:
            if (r2 == 0) goto L13
            r1.add(r2)
            bsh.NameSpace r2 = r2.parent
            goto Lb
        L13:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L30
            java.lang.Object r2 = r1.pop()
            bsh.NameSpace r2 = (bsh.NameSpace) r2
            boolean r3 = r2.isClass
            if (r3 != 0) goto L13
            boolean r3 = r2.isEnum
            if (r3 == 0) goto L28
            goto L13
        L28:
            java.util.Map<java.lang.String, bsh.Variable> r3 = r0.variables
            java.util.Map<java.lang.String, bsh.Variable> r2 = r2.variables
            r3.putAll(r2)
            goto L13
        L30:
            java.util.Map<java.lang.String, bsh.Variable> r1 = r0.variables
            bsh.k r2 = new bsh.k
            r2.<init>()
            r1.replaceAll(r2)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NameSpace: "
            r0.<init>(r1)
            java.lang.String r1 = r4.nsName
            if (r1 != 0) goto L10
            java.lang.String r1 = super.toString()
            goto L29
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.nsName
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            java.lang.String r2 = super.toString()
            java.lang.String r3 = ")"
            java.lang.String r1 = eh.a.r(r1, r2, r3)
        L29:
            r0.append(r1)
            boolean r1 = r4.isClass
            java.lang.String r2 = ""
            if (r1 == 0) goto L35
            java.lang.String r1 = " (class) "
            goto L36
        L35:
            r1 = r2
        L36:
            r0.append(r1)
            boolean r1 = r4.isInterface
            if (r1 == 0) goto L40
            java.lang.String r1 = " (interface) "
            goto L41
        L40:
            r1 = r2
        L41:
            r0.append(r1)
            boolean r1 = r4.isEnum
            if (r1 == 0) goto L4b
            java.lang.String r1 = " (enum) "
            goto L4c
        L4b:
            r1 = r2
        L4c:
            r0.append(r1)
            boolean r1 = r4.isMethod
            if (r1 == 0) goto L56
            java.lang.String r1 = " (method) "
            goto L57
        L56:
            r1 = r2
        L57:
            r0.append(r1)
            java.lang.Class<?> r1 = r4.classStatic
            if (r1 == 0) goto L61
            java.lang.String r1 = " (class static) "
            goto L62
        L61:
            r1 = r2
        L62:
            r0.append(r1)
            java.lang.Object r1 = r4.classInstance
            if (r1 == 0) goto L6b
            java.lang.String r2 = " (class instance) "
        L6b:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void unsetVariable(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, bsh.Variable> r0 = r1.variables
            r0.remove(r2)
            r1.nameSpaceChanged()
            return
    }

    public java.lang.Object unwrapVariable(bsh.Variable r1) {
            r0 = this;
            if (r1 != 0) goto L5
            bsh.Primitive r1 = bsh.Primitive.VOID
            return r1
        L5:
            java.lang.Object r1 = r1.getValue()
            return r1
    }
}
