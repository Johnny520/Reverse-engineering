package bsh;

import bsh.BshClassManager;
import bsh.NameSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class NameSpace implements Serializable, BshClassManager.Listener, NameSource, Cloneable {
    public static final NameSpace JAVACODE;
    private static final long serialVersionUID = 1;
    Node callerInfoNode;
    private transient Map<String, Class<?>> classCache;
    Object classInstance;
    private transient BshClassManager classManager;
    Class<?> classStatic;
    protected Map<String, String> importedClasses;
    private List<String> importedCommands;
    private List<Object> importedObjects;
    private List<String> importedPackages;
    private List<Class<?>> importedStatic;
    boolean isClass;
    boolean isEnum;
    boolean isInterface;
    boolean isMethod;
    private Map<String, List<BshMethod>> methods;
    private List<NameSource.Listener> nameSourceListeners;
    private Map<String, Name> names;
    private String nsName;
    private String packageName;
    private NameSpace parent;
    private This thisReference;
    private Map<String, Variable> variables;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        NameSpace nameSpace = new NameSpace(null, null, "Called from compiled Java code.");
        JAVACODE = nameSpace;
        nameSpace.isMethod = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NameSpace(NameSpace nameSpace, BshClassManager bshClassManager, String str) {
        this.variables = new HashMap();
        this.methods = new HashMap();
        this.importedClasses = new HashMap();
        this.importedPackages = new ArrayList();
        this.importedCommands = new ArrayList();
        this.importedObjects = new ArrayList();
        this.importedStatic = new ArrayList();
        this.nameSourceListeners = new ArrayList();
        this.names = new HashMap();
        this.classCache = new HashMap();
        setName(str);
        setParent(nameSpace);
        setClassManager(bshClassManager);
        getClassManager().addListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> classForName(String str) {
        return getClassManager().classForName(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private <K, V> Map<K, V> clone(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void collectExtensionMatches(List<BshMethod> list, Class<?> cls, List<BshMethod> list2) {
        Class<?> cls2;
        if (list == null) {
            return;
        }
        for (BshMethod bshMethod : list) {
            if (bshMethod.isExtension && (cls2 = bshMethod.receiverType) != null && Types.isJavaBoxTypesAssignable(cls2, cls)) {
                list2.add(bshMethod);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> getClassImpl(String str) {
        if (this.classCache.containsKey(str)) {
            return this.classCache.get(str);
        }
        if (!Name.isCompound(str)) {
            Class<?> importedClassImpl = getImportedClassImpl(str);
            if (importedClassImpl == null) {
                importedClassImpl = classForName(str);
            }
            if (importedClassImpl != null) {
                cacheClass(str, importedClassImpl);
                return importedClassImpl;
            }
        }
        Class<?> clsClassForName = classForName(str);
        if (clsClassForName != null) {
            return clsClassForName;
        }
        Interpreter.debug("getClass(): ", str, " not found in ", this);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> getImportedClassImpl(String str) {
        String classNameByUnqName;
        String str2 = this.importedClasses.get(str);
        if (str2 != null) {
            Class<?> clsClassForName = classForName(str2);
            if (clsClassForName != null) {
                return clsClassForName;
            }
            if (Name.isCompound(str2)) {
                try {
                    clsClassForName = getNameResolver(str2).toClass();
                } catch (ClassNotFoundException unused) {
                }
            }
            Interpreter.debug("imported unpackaged name not found:", str2);
            if (clsClassForName == null) {
                return null;
            }
            getClassManager().cacheClassInfo(str2, clsClassForName);
            return clsClassForName;
        }
        Iterator<String> it = this.importedPackages.iterator();
        while (it.hasNext()) {
            Class<?> clsClassForName2 = classForName(AbstractC4855en.m9264h(it.next(), ".", str));
            if (clsClassForName2 != null) {
                return clsClassForName2;
            }
        }
        BshClassManager classManager = getClassManager();
        if (!classManager.hasSuperImport() || (classNameByUnqName = classManager.getClassNameByUnqName(str)) == null) {
            return null;
        }
        return classForName(classNameByUnqName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> identifierToClass(ClassIdentifier classIdentifier) {
        return classIdentifier.getTargetClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Variable[] lambda$getDeclaredVariables$5(int i9) {
        return new Variable[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$getMethodNames$2(int i9) {
        return new String[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BshMethod[] lambda$getMethods$4(int i9) {
        return new BshMethod[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$getVariableNames$0(int i9) {
        return new String[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Variable[] lambda$getVariables$1(int i9) {
        return new Variable[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Variable lambda$toLambdaNameSpace$6(String str, Variable variable) {
        Variable variableClone = variable.m10912clone();
        variableClone.modifiers.addModifier("final");
        return variableClone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private BshMethod loadScriptedCommand(InputStream inputStream, String str, Class<?>[] clsArr, String str2, Interpreter interpreter) throws UtilEvalError {
        try {
            FileReader fileReader = new FileReader(inputStream);
            try {
                interpreter.eval(fileReader, this, str2);
                fileReader.close();
                return getMethod(str, clsArr);
            } finally {
            }
        } catch (EvalError | IOException e6) {
            Interpreter.debug(e6.toString());
            throw new UtilEvalError("Error loading script: " + e6.getMessage(), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.classCache = new HashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private BshMethod selectMethod(Class<?>[] clsArr, List<BshMethod> list, boolean z9) {
        if (!z9) {
            ArrayList arrayList = new ArrayList(list.size());
            for (BshMethod bshMethod : list) {
                if (!bshMethod.isExtension) {
                    arrayList.add(bshMethod);
                }
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return null;
        }
        return Reflect.findMostSpecificBshMethod(clsArr, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        this.names.clear();
        objectOutputStream.defaultWriteObject();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSource
    public void addNameSourceListener(NameSource.Listener listener) {
        this.nameSourceListeners.add(listener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean attemptSetPropertyValue(String str, Object obj, Interpreter interpreter) throws UtilEvalError {
        String strAccessorName = Reflect.accessorName("set", str);
        Object objUnwrap = Primitive.unwrap(obj);
        if (getMethod(strAccessorName, new Class[]{objUnwrap == null ? null : objUnwrap.getClass()}) == null) {
            return false;
        }
        try {
            invokeMethod(strAccessorName, new Object[]{obj}, interpreter);
            return true;
        } catch (EvalError e6) {
            throw new UtilEvalError("'This' property accessor threw exception: " + e6.getMessage(), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void cacheClass(String str, Class<?> cls) {
        this.classCache.put(str, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
        nameSpaceChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void clear() {
        this.variables.clear();
        this.methods.clear();
        this.importedClasses.clear();
        this.importedPackages.clear();
        this.importedCommands.clear();
        this.importedObjects.clear();
        if (this.parent == null) {
            loadDefaultImports();
        }
        this.classCache.clear();
        this.names.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NameSpace copy() {
        try {
            NameSpace nameSpace = (NameSpace) clone();
            nameSpace.thisReference = null;
            nameSpace.variables = clone(this.variables);
            nameSpace.methods = clone(this.methods);
            nameSpace.importedClasses = clone(this.importedClasses);
            nameSpace.importedPackages = clone(this.importedPackages);
            nameSpace.importedCommands = clone(this.importedCommands);
            nameSpace.importedObjects = clone(this.importedObjects);
            nameSpace.importedStatic = clone(this.importedStatic);
            nameSpace.names = clone(this.names);
            return nameSpace;
        } catch (CloneNotSupportedException e6) {
            throw new IllegalStateException(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Variable createVariable(String str, Object obj, Modifiers modifiers) {
        return createVariable(str, null, obj, modifiers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void doSuperImport() {
        getClassManager().doSuperImport();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object get(String str, Interpreter interpreter) {
        return getNameResolver(str).toObject(new CallStack(this), interpreter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSource
    public String[] getAllNames() {
        ArrayList arrayList = new ArrayList();
        getAllNamesAux(arrayList);
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void getAllNamesAux(List<String> list) {
        list.addAll(this.variables.keySet());
        Map<String, List<BshMethod>> map = this.methods;
        if (map != null) {
            list.addAll(map.keySet());
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null) {
            nameSpace.getAllNamesAux(list);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getClass(String str) {
        Class<?> classImpl = getClassImpl(str);
        if (classImpl != null) {
            return classImpl;
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null) {
            return nameSpace.getClass(str);
        }
        Class<?> loaderClass = this.classManager.loaderManager.getLoaderClass(str);
        if (loaderClass != null) {
            return loaderClass;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getClassInstance() throws UtilEvalError {
        Object obj = this.classInstance;
        if (obj != null) {
            return obj;
        }
        if (this.classStatic != null) {
            throw new UtilEvalError("Can't refer to class instance from static context.");
        }
        throw new InterpreterError("Can't resolve class instance 'this' in: " + this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BshClassManager getClassManager() {
        BshClassManager bshClassManager = this.classManager;
        if (bshClassManager != null) {
            return bshClassManager;
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null && nameSpace != JAVACODE) {
            return nameSpace.getClassManager();
        }
        setClassManager(BshClassManager.createClassManager(null));
        return this.classManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getCommand(String str, Class<?>[] clsArr, Interpreter interpreter) {
        String str2;
        Class<?>[] clsArr2;
        Interpreter interpreter2;
        String strM2255r;
        Interpreter.debug("Get command: ", str);
        BshClassManager classManager = interpreter.getClassManager();
        for (String str3 : this.importedCommands) {
            String strM9264h = str3.equals("/") ? AbstractC4855en.m9264h(str3, str, ".bsh") : AbstractC4855en.m9265i(str3, "/", str, ".bsh");
            Interpreter.debug("searching for script: ".concat(strM9264h));
            URL resource = classManager.getResource(strM9264h);
            if (resource != null) {
                try {
                    str2 = str;
                    clsArr2 = clsArr;
                    interpreter2 = interpreter;
                    try {
                        return loadScriptedCommand((InputStream) resource.getContent(), str2, clsArr2, strM9264h, interpreter2);
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    str2 = str;
                    clsArr2 = clsArr;
                    interpreter2 = interpreter;
                }
            } else {
                str2 = str;
                clsArr2 = clsArr;
                interpreter2 = interpreter;
            }
            if (str3.equals("/")) {
                strM2255r = str2;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3.substring(1).replace('/', '.'));
                strM2255r = AbstractC0921a.m2255r(sb2, ".", str2);
            }
            Interpreter.debug(AbstractC4855en.m9263g("searching for class: ", strM2255r));
            Class<?> clsClassForName = classManager.classForName(strM2255r);
            if (clsClassForName != null) {
                return clsClassForName;
            }
            str = str2;
            clsArr = clsArr2;
            interpreter = interpreter2;
        }
        String str4 = str;
        Class<?>[] clsArr3 = clsArr;
        Interpreter interpreter3 = interpreter;
        NameSpace nameSpace = this.parent;
        if (nameSpace != null) {
            return nameSpace.getCommand(str4, clsArr3, interpreter3);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Variable[] getDeclaredVariables() {
        return (Variable[]) this.variables.values().stream().toArray(new C0348e(5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BshMethod getExtensionMethod(Class<?> cls, String str, Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList();
        for (NameSpace parent = this; parent != null; parent = parent.getParent()) {
            collectExtensionMatches(parent.methods.get(str), cls, arrayList);
            for (Object obj : parent.importedObjects) {
                if (obj != null) {
                    for (Class<?> superclass = obj.getClass(); superclass != null && Reflect.isGeneratedClass(superclass); superclass = superclass.getSuperclass()) {
                        This classInstanceThis = Reflect.getClassInstanceThis(obj, superclass.getSimpleName());
                        if (classInstanceThis != null) {
                            collectExtensionMatches(classInstanceThis.getNameSpace().methods.get(str), cls, arrayList);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return Reflect.findMostSpecificExtensionMethod(cls, clsArr, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public This getGlobal(Interpreter interpreter) {
        NameSpace nameSpace = this.parent;
        return nameSpace != null ? nameSpace.getGlobal(interpreter) : getThis(interpreter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BshMethod getImportedMethod(String str, Class<?>[] clsArr) {
        for (Object obj : this.importedObjects) {
            Invocable invocableResolveJavaMethod = Reflect.resolveJavaMethod(obj.getClass(), str, clsArr, false);
            if (invocableResolveJavaMethod != null) {
                return new BshMethod(invocableResolveJavaMethod, obj);
            }
        }
        Iterator<Class<?>> it = this.importedStatic.iterator();
        while (it.hasNext()) {
            Invocable invocableResolveJavaMethod2 = Reflect.resolveJavaMethod(it.next(), str, clsArr, true);
            if (invocableResolveJavaMethod2 != null) {
                return new BshMethod(invocableResolveJavaMethod2, (Object) null);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Variable getImportedVar(String str) {
        This classInstanceThis;
        Variable variableCreateVariable = null;
        for (Object obj : this.importedObjects) {
            Invocable invocableResolveJavaField = Reflect.resolveJavaField(obj.getClass(), str, false);
            if (invocableResolveJavaField != null) {
                variableCreateVariable = createVariable(str, invocableResolveJavaField.getReturnType(), new LHS(obj, invocableResolveJavaField));
            } else if (this.isClass) {
                Class<?> superclass = obj.getClass();
                while (true) {
                    superclass = superclass.getSuperclass();
                    if (!Reflect.isGeneratedClass(superclass) || ((classInstanceThis = Reflect.getClassInstanceThis(obj, superclass.getSimpleName())) != null && (variableCreateVariable = classInstanceThis.getNameSpace().variables.get(str)) != null)) {
                        break;
                    }
                }
            }
            if (variableCreateVariable != null) {
                this.variables.put(str, variableCreateVariable);
                return variableCreateVariable;
            }
        }
        Iterator<Class<?>> it = this.importedStatic.iterator();
        while (it.hasNext()) {
            Invocable invocableResolveJavaField2 = Reflect.resolveJavaField(it.next(), str, true);
            if (invocableResolveJavaField2 != null) {
                Variable variableCreateVariable2 = createVariable(str, invocableResolveJavaField2.getReturnType(), new LHS(invocableResolveJavaField2));
                this.variables.put(str, variableCreateVariable2);
                return variableCreateVariable2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getInvocationLine() {
        Node node = getNode();
        if (node != null) {
            return node.getLineNumber();
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getInvocationText() {
        Node node = getNode();
        return node != null ? node.getText() : "<invoked from Java code>";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BshMethod getMethod(String str, Class<?>[] clsArr, boolean z9, boolean z10) {
        NameSpace nameSpace;
        Interpreter.debug("Get method: ", str, " ", this);
        BshMethod importedMethod = (!this.isClass || this.isEnum || z9) ? null : getImportedMethod(str, clsArr);
        if (importedMethod == null && this.methods.containsKey(str)) {
            importedMethod = selectMethod(clsArr, this.methods.get(str), z10);
        }
        if (importedMethod == null && !this.isClass && !z9) {
            importedMethod = getImportedMethod(str, clsArr);
        }
        return (importedMethod != null || z9 || (nameSpace = this.parent) == null) ? importedMethod : nameSpace.getMethod(str, clsArr, false, z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String[] getMethodNames() {
        return (String[]) this.methods.keySet().stream().toArray(new C0348e(8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BshMethod[] getMethods() {
        return (BshMethod[]) this.methods.values().stream().flatMap(new C0342b(12)).toArray(new C0348e(7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getName() {
        return this.nsName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Name getNameResolver(String str) {
        if (!this.names.containsKey(str)) {
            this.names.put(str, new Name(this, str));
        }
        return this.names.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Node getNode() {
        Node node = this.callerInfoNode;
        if (node != null) {
            return node;
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null) {
            return nameSpace.getNode();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getPackage() {
        String str = this.packageName;
        if (str != null) {
            return str;
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null) {
            return nameSpace.getPackage();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NameSpace getParent() {
        return this.parent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getPropertyValue(String str, Interpreter interpreter) throws UtilEvalError {
        String strAccessorName = Reflect.accessorName("get", str);
        Class<?>[] clsArr = Reflect.ZERO_TYPES;
        BshMethod method = getMethod(strAccessorName, clsArr);
        try {
            if (method != null) {
                return method.invoke(null, interpreter);
            }
            BshMethod method2 = getMethod(Reflect.accessorName("is", str), clsArr);
            return (method2 == null || method2.getReturnType() != Boolean.TYPE) ? Primitive.VOID : method2.invoke(null, interpreter);
        } catch (EvalError e6) {
            throw new UtilEvalError("'This' property accessor threw exception: " + e6.getMessage(), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public This getSuper(Interpreter interpreter) {
        Class<?> cls;
        if (this.isClass && (cls = this.classStatic) != null) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (Reflect.isGeneratedClass(superclass)) {
                return Reflect.getClassInstanceThis(this.classInstance, superclass.getSimpleName());
            }
        }
        NameSpace nameSpace = this.parent;
        return nameSpace != null ? nameSpace.isClass ? nameSpace.getSuper(interpreter) : nameSpace.getThis(interpreter) : getThis(interpreter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public This getThis(Interpreter interpreter) {
        if (this.thisReference == null) {
            this.thisReference = This.getThis(this, interpreter);
        }
        return this.thisReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getVariable(String str, boolean z9) {
        Variable variableImpl = getVariableImpl(str, z9);
        Interpreter.debug("Get variable: ", str, " = ", variableImpl);
        return unwrapVariable(variableImpl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Variable getVariableImpl(String str, boolean z9) {
        NameSpace nameSpace;
        if (this.variables.containsKey(str)) {
            return this.variables.get(str);
        }
        Variable importedVar = getImportedVar(str);
        return (z9 && importedVar == null && (nameSpace = this.parent) != null) ? nameSpace.getVariableImpl(str, z9) : importedVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String[] getVariableNames() {
        return (String[]) this.variables.keySet().stream().toArray(new C0348e(6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getVariableOrProperty(String str, Interpreter interpreter) {
        Object variable = getVariable(str, true);
        return variable == Primitive.VOID ? getPropertyValue(str, interpreter) : variable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Variable[] getVariables() {
        return (Variable[]) this.variables.values().stream().toArray(new C0348e(4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void importClass(String str) {
        this.importedClasses.put(Name.suffix(str, 1), str);
        nameSpaceChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void importCommands(String str) {
        String strReplace = str.replace('.', '/');
        if (!strReplace.startsWith("/")) {
            strReplace = "/".concat(strReplace);
        }
        if (strReplace.length() > 1 && strReplace.endsWith("/")) {
            strReplace = AbstractC4855en.m9262f(1, 0, strReplace);
        }
        this.importedCommands.remove(strReplace);
        this.importedCommands.add(0, strReplace);
        nameSpaceChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void importObject(Object obj) {
        this.importedObjects.remove(obj);
        this.importedObjects.add(0, obj);
        nameSpaceChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void importPackage(String str) {
        this.importedPackages.remove(str);
        this.importedPackages.add(0, str);
        nameSpaceChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void importStatic(Class<?> cls) {
        this.importedStatic.remove(cls);
        this.importedStatic.add(0, cls);
        nameSpaceChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object invokeCommand(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, Node node, boolean z9) throws EvalError {
        String str2;
        CallStack callStack2;
        Node node2;
        Class<?>[] types = Types.getTypes(objArr);
        try {
            Object command = getCommand(str, types, interpreter);
            if (command != null) {
                if (command instanceof BshMethod) {
                    return ((BshMethod) command).invoke(objArr, interpreter, callStack, node);
                }
                try {
                    return Reflect.invokeCompiledCommand((Class) command, objArr, interpreter, callStack, node);
                } catch (UtilEvalError e6) {
                    throw e6.toEvalError("Error invoking compiled command: ", node, callStack);
                }
            }
            if (z9) {
                str2 = str;
                callStack2 = callStack;
                node2 = node;
            } else {
                boolean[] zArr = new boolean[1];
                str2 = str;
                callStack2 = callStack;
                node2 = node;
                Object objInvokeDefaultInvokeMethod = invokeDefaultInvokeMethod(str2, objArr, interpreter, callStack2, node2, zArr);
                if (zArr[0]) {
                    return objInvokeDefaultInvokeMethod;
                }
            }
            throw new EvalException("Command not found: " + StringUtil.methodString(str2, types), node2, callStack2);
        } catch (UtilEvalError e7) {
            throw e7.toEvalError("Error loading command: ", node, callStack);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object invokeDefaultInvokeMethod(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, Node node, boolean[] zArr) {
        try {
            BshMethod method = getMethod("invoke", new Class[]{null, null});
            boolean z9 = method != null;
            zArr[0] = z9;
            if (z9) {
                return method.invoke(new Object[]{str, objArr}, interpreter, callStack, node);
            }
            return null;
        } catch (UtilEvalError e6) {
            throw e6.toEvalError("Local method invocation", node, callStack);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object invokeMethod(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, Node node) {
        return getThis(interpreter).invokeMethod(str, objArr, interpreter, callStack, node, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isChildOf(NameSpace nameSpace) {
        if (getParent() != null) {
            return getParent().equals(nameSpace) || getParent().isChildOf(nameSpace);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void loadDefaultImports() {
        importPackage("org.json");
        importPackage("android.widget");
        importPackage("android.view");
        importPackage("android.text");
        importPackage("android.os");
        importPackage("android.graphics");
        importPackage("android.content");
        importPackage("android.app");
        importPackage("java.util.stream");
        importPackage("java.util.regex");
        importPackage("java.util.function");
        importPackage("java.util");
        importPackage("java.net");
        importPackage("java.math");
        importPackage("java.io");
        importPackage("java.lang");
        importCommands("/bsh/commands");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void nameSpaceChanged() {
        this.classCache.clear();
        this.names.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void prune() {
        getClassManager();
        setParent(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setClassInstance(Object obj) {
        this.classInstance = obj;
        importObject(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setClassManager(BshClassManager bshClassManager) {
        this.classManager = bshClassManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setClassStatic(Class<?> cls) {
        this.classStatic = cls;
        importStatic(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Variable setLocalVariable(String str, Object obj, boolean z9) {
        return setVariable(str, obj, z9, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLocalVariableOrProperty(String str, Object obj, boolean z9) throws UtilEvalError {
        setVariableOrProperty(str, obj, z9, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMethod(BshMethod bshMethod) {
        String name = bshMethod.getName();
        if (!this.methods.containsKey(name)) {
            this.methods.put(name, new ArrayList(1));
        }
        this.methods.get(name).remove(bshMethod);
        this.methods.get(name).add(0, bshMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setName(String str) {
        this.nsName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNode(Node node) {
        this.callerInfoNode = node;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPackage(String str) {
        this.packageName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setParent(NameSpace nameSpace) {
        this.parent = nameSpace;
        if (nameSpace == null) {
            loadDefaultImports();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTypedVariable(String str, Class<?> cls, Object obj, Modifiers modifiers) {
        Variable variableImpl = getVariableImpl(str, false);
        if (variableImpl == null || variableImpl.getType() == null) {
            this.variables.put(str, createVariable(str, cls, obj, modifiers));
            return;
        }
        if (variableImpl.getType() != cls) {
            StringBuilder sbM1026o = AbstractC0255e.m1026o("Typed variable: ", str, " was previously declared with type: ");
            sbM1026o.append(variableImpl.getType());
            throw new UtilEvalError(sbM1026o.toString());
        }
        if (variableImpl.modifiers == null) {
            variableImpl.modifiers = modifiers;
        }
        variableImpl.setValue(obj, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Variable setVariable(String str, Object obj, boolean z9, boolean z10) throws UtilEvalError {
        if (obj == null) {
            obj = Primitive.NULL;
        }
        Variable variableImpl = getVariableImpl(str, z10);
        if (variableImpl != null) {
            variableImpl.setValue(obj, 1);
            return variableImpl;
        }
        if (z9) {
            throw new UtilEvalError(AbstractC4855en.m9263g("(Strict Java mode) Assignment to undeclared variable: ", str));
        }
        Variable variableCreateVariable = createVariable(str, obj, (Modifiers) null);
        this.variables.put(str, variableCreateVariable);
        nameSpaceChanged();
        return variableCreateVariable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setVariableImpl(Variable variable) {
        if (this.variables.containsKey(variable.getName())) {
            return;
        }
        this.variables.put(variable.getName(), variable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setVariableOrProperty(String str, Object obj, boolean z9, boolean z10) throws UtilEvalError {
        if (obj == null) {
            C0353j.m1308f("null variable value");
            return;
        }
        Variable variableImpl = getVariableImpl(str, z10);
        if (variableImpl != null) {
            try {
                variableImpl.setValue(obj, 1);
                return;
            } catch (UtilEvalError e6) {
                StringBuilder sbM1026o = AbstractC0255e.m1026o("Variable assignment: ", str, ": ");
                sbM1026o.append(e6.getMessage());
                throw new UtilEvalError(sbM1026o.toString(), e6);
            }
        }
        if (z9) {
            throw new UtilEvalError(AbstractC4855en.m9263g("(Strict Java mode) Assignment to undeclared variable: ", str));
        }
        This r42 = this.thisReference;
        if (attemptSetPropertyValue(str, obj, r42 != null ? r42.declaringInterpreter : null)) {
            return;
        }
        this.variables.put(str, createVariable(str, obj, (Modifiers) null));
        nameSpaceChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NameSpace toLambdaNameSpace() {
        NameSpace nameSpaceCopy = copy();
        Stack stack = new Stack();
        for (NameSpace nameSpace = this.parent; nameSpace != null; nameSpace = nameSpace.parent) {
            stack.add(nameSpace);
        }
        while (!stack.isEmpty()) {
            NameSpace nameSpace2 = (NameSpace) stack.pop();
            if (!nameSpace2.isClass && !nameSpace2.isEnum) {
                nameSpaceCopy.variables.putAll(nameSpace2.variables);
            }
        }
        nameSpaceCopy.variables.replaceAll(new C0354k());
        return nameSpaceCopy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String strM2255r;
        StringBuilder sb2 = new StringBuilder("NameSpace: ");
        if (this.nsName == null) {
            strM2255r = super.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.nsName);
            sb3.append(" (");
            strM2255r = AbstractC0921a.m2255r(sb3, super.toString(), ")");
        }
        sb2.append(strM2255r);
        boolean z9 = this.isClass;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        sb2.append(z9 ? " (class) " : HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append(this.isInterface ? " (interface) " : HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append(this.isEnum ? " (enum) " : HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append(this.isMethod ? " (method) " : HttpUrl.FRAGMENT_ENCODE_SET);
        sb2.append(this.classStatic != null ? " (class static) " : HttpUrl.FRAGMENT_ENCODE_SET);
        if (this.classInstance != null) {
            str = " (class instance) ";
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void unsetVariable(String str) {
        this.variables.remove(str);
        nameSpaceChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object unwrapVariable(Variable variable) {
        return variable == null ? Primitive.VOID : variable.getValue();
    }

    public Variable createVariable(String str, Class<?> cls, Object obj, Modifiers modifiers) {
        return new Variable(str, cls, obj, modifiers);
    }

    public Variable createVariable(String str, Class<?> cls, LHS lhs) {
        return new Variable(str, cls, lhs);
    }

    private <T> List<T> clone(List<T> list) {
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    public Object invokeMethod(String str, Object[] objArr, Interpreter interpreter) {
        return invokeMethod(str, objArr, interpreter, null, null);
    }

    public Object getVariable(String str) {
        return getVariable(str, true);
    }

    public void setVariable(String str, Object obj) {
        setVariable(str, obj, false);
    }

    public void setVariable(String str, Object obj, boolean z9) {
        setVariable(str, obj, z9, true);
    }

    @Deprecated
    public void setTypedVariable(String str, Class<?> cls, Object obj, boolean z9) {
        Modifiers modifiers = new Modifiers(3);
        if (z9) {
            modifiers.addModifier("final");
        }
        setTypedVariable(str, cls, obj, modifiers);
    }

    public BshMethod getMethod(String str, Class<?>[] clsArr, boolean z9) {
        return getMethod(str, clsArr, z9, false);
    }

    public BshMethod getMethod(String str, Class<?>[] clsArr) {
        return getMethod(str, clsArr, false);
    }

    public void setVariableOrProperty(String str, Object obj, boolean z9) throws UtilEvalError {
        setVariableOrProperty(str, obj, z9, true);
    }

    public NameSpace(String str) {
        this(null, null, str);
    }

    public NameSpace(String str, BshClassManager bshClassManager) {
        this(null, bshClassManager, str);
    }

    public NameSpace(NameSpace nameSpace, String str) {
        this(nameSpace, null, str);
    }

    public Object invokeCommand(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, Node node) {
        return invokeCommand(str, objArr, interpreter, callStack, node, false);
    }
}
