package bsh;

import androidx.activity.AbstractC0900;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class NameSpace implements Serializable, InterfaceC3490, Cloneable {
    public static final NameSpace JAVACODE;
    private static final long serialVersionUID = 1;
    InterfaceC3452 callerInfoNode;
    private transient Map<String, Class<?>> classCache;
    Object classInstance;
    private transient C3493 classManager;
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
    private List<InterfaceC3450> nameSourceListeners;
    private Map<String, Name> names;
    private String nsName;
    private String packageName;
    private NameSpace parent;
    private This thisReference;
    private Map<String, Variable> variables;

    static {
        NameSpace nameSpace = new NameSpace(null, null, "Called from compiled Java code.");
        JAVACODE = nameSpace;
        nameSpace.isMethod = true;
    }

    public NameSpace(NameSpace nameSpace, C3493 c3493, String str) {
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
        setClassManager(c3493);
        getClassManager().mo5695(this);
    }

    private Class<?> classForName(String str) {
        return getClassManager().mo5694(str);
    }

    private <K, V> Map<K, V> clone(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    private void collectExtensionMatches(List<BshMethod> list, Class<?> cls, List<BshMethod> list2) {
        Class<?> cls2;
        if (list == null) {
            return;
        }
        for (BshMethod bshMethod : list) {
            if (bshMethod.isExtension && (cls2 = bshMethod.receiverType) != null && AbstractC3495.m5940(cls2, cls)) {
                list2.add(bshMethod);
            }
        }
    }

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

    private Class<?> getImportedClassImpl(String str) {
        String strMo5702;
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
            getClassManager().m5930(clsClassForName, str2);
            return clsClassForName;
        }
        Iterator<String> it = this.importedPackages.iterator();
        while (it.hasNext()) {
            Class<?> clsClassForName2 = classForName(it.next() + "." + str);
            if (clsClassForName2 != null) {
                return clsClassForName2;
            }
        }
        C3493 classManager = getClassManager();
        if (!classManager.mo5701() || (strMo5702 = classManager.mo5702(str)) == null) {
            return null;
        }
        return classForName(strMo5702);
    }

    public static Class<?> identifierToClass(C3479 c3479) {
        return c3479.f8264;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Variable[] lambda$getDeclaredVariables$5(int i) {
        return new Variable[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$getMethodNames$2(int i) {
        return new String[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BshMethod[] lambda$getMethods$4(int i) {
        return new BshMethod[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$getVariableNames$0(int i) {
        return new String[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Variable[] lambda$getVariables$1(int i) {
        return new Variable[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Variable lambda$toLambdaNameSpace$6(String str, Variable variable) {
        Variable variableClone = variable.m5692clone();
        variableClone.modifiers.addModifier("final");
        return variableClone;
    }

    private BshMethod loadScriptedCommand(InputStream inputStream, String str, Class<?>[] clsArr, String str2, Interpreter interpreter) throws UtilEvalError {
        try {
            C3467 c3467 = new C3467(inputStream);
            try {
                interpreter.eval(c3467, this, str2);
                c3467.close();
                return getMethod(str, clsArr);
            } catch (Throwable th) {
                try {
                    c3467.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (EvalError | IOException e) {
            Interpreter.debug(e.toString());
            throw new UtilEvalError("Error loading script: " + e.getMessage(), e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.classCache = new HashMap();
    }

    private BshMethod selectMethod(Class<?>[] clsArr, List<BshMethod> list, boolean z) {
        if (!z) {
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
        Object[] objArr = AbstractC3500.f8347;
        Interpreter.debug("find most specific BshMethod for: " + Arrays.toString(clsArr));
        int iM6001 = AbstractC3500.m6001(clsArr, list);
        if (iM6001 == -1) {
            return null;
        }
        return list.get(iM6001);
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        this.names.clear();
        objectOutputStream.defaultWriteObject();
    }

    public void addNameSourceListener(InterfaceC3450 interfaceC3450) {
        this.nameSourceListeners.add(interfaceC3450);
    }

    public boolean attemptSetPropertyValue(String str, Object obj, Interpreter interpreter) throws UtilEvalError {
        String strM6003 = AbstractC3500.m6003("set", str);
        Object objUnwrap = Primitive.unwrap(obj);
        if (getMethod(strM6003, new Class[]{objUnwrap == null ? null : objUnwrap.getClass()}) == null) {
            return false;
        }
        try {
            invokeMethod(strM6003, new Object[]{obj}, interpreter);
            return true;
        } catch (EvalError e) {
            throw new UtilEvalError("'This' property accessor threw exception: " + e.getMessage(), e);
        }
    }

    public void cacheClass(String str, Class<?> cls) {
        this.classCache.put(str, cls);
    }

    @Override // bsh.InterfaceC3490
    public void classLoaderChanged() {
        nameSpaceChanged();
    }

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
        } catch (CloneNotSupportedException e) {
            C3466.m5897(e);
            return null;
        }
    }

    public Variable createVariable(String str, Object obj, Modifiers modifiers) {
        return createVariable(str, null, obj, modifiers);
    }

    public void doSuperImport() throws Capabilities$Unavailable {
        getClassManager().mo5699();
    }

    public Object get(String str, Interpreter interpreter) {
        return getNameResolver(str).toObject(new CallStack(this), interpreter);
    }

    public String[] getAllNames() {
        ArrayList arrayList = new ArrayList();
        getAllNamesAux(arrayList);
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

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

    public Class<?> getClass(String str) {
        Class<?> clsLoadClass;
        Class<?> classImpl = getClassImpl(str);
        if (classImpl != null) {
            return classImpl;
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null) {
            return nameSpace.getClass(str);
        }
        Iterator it = this.classManager.f8309.f19714.iterator();
        while (true) {
            if (!it.hasNext()) {
                System.err.println("[BeanShell] GetLoaderClass: " + str + " is null");
                clsLoadClass = null;
                break;
            }
            try {
                clsLoadClass = ((ClassLoader) it.next()).loadClass(str);
                break;
            } catch (ClassNotFoundException unused) {
            }
        }
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        return null;
    }

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

    public C3493 getClassManager() {
        C3493 c3493 = this.classManager;
        if (c3493 != null) {
            return c3493;
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null && nameSpace != JAVACODE) {
            return nameSpace.getClassManager();
        }
        setClassManager(C3493.m5928(null));
        return this.classManager;
    }

    public Object getCommand(String str, Class<?>[] clsArr, Interpreter interpreter) {
        NameSpace nameSpace;
        String str2;
        Class<?>[] clsArr2;
        Interpreter interpreter2;
        String strM711;
        Interpreter.debug("Get command: ", str);
        C3493 classManager = interpreter.getClassManager();
        for (String str3 : this.importedCommands) {
            String str4 = str3.equals("/") ? str3 + str + ".bsh" : str3 + "/" + str + ".bsh";
            Interpreter.debug("searching for script: ".concat(str4));
            URL urlMo5703 = classManager.mo5703(str4);
            if (urlMo5703 != null) {
                try {
                    nameSpace = this;
                    str2 = str;
                    clsArr2 = clsArr;
                    interpreter2 = interpreter;
                    try {
                        return nameSpace.loadScriptedCommand((InputStream) urlMo5703.getContent(), str2, clsArr2, str4, interpreter2);
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    nameSpace = this;
                    str2 = str;
                    clsArr2 = clsArr;
                    interpreter2 = interpreter;
                }
            } else {
                nameSpace = this;
                str2 = str;
                clsArr2 = clsArr;
                interpreter2 = interpreter;
            }
            if (str3.equals("/")) {
                strM711 = str2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str3.substring(1).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                strM711 = AbstractC0900.m711(sb, ".", str2);
            }
            Interpreter.debug(AbstractC0900.m717("searching for class: ", strM711));
            Class clsMo5694 = classManager.mo5694(strM711);
            if (clsMo5694 != null) {
                return clsMo5694;
            }
            this = nameSpace;
            str = str2;
            clsArr = clsArr2;
            interpreter = interpreter2;
        }
        String str5 = str;
        Class<?>[] clsArr3 = clsArr;
        Interpreter interpreter3 = interpreter;
        NameSpace nameSpace2 = this.parent;
        if (nameSpace2 != null) {
            return nameSpace2.getCommand(str5, clsArr3, interpreter3);
        }
        return null;
    }

    public Variable[] getDeclaredVariables() {
        return (Variable[]) this.variables.values().stream().toArray(new C3483(5));
    }

    public BshMethod getExtensionMethod(Class<?> cls, String str, Class<?>[] clsArr) {
        int iIntValue;
        Class<?> cls2;
        Class<?> cls3;
        ArrayList arrayList = new ArrayList();
        for (NameSpace parent = this; parent != null; parent = parent.getParent()) {
            collectExtensionMatches(parent.methods.get(str), cls, arrayList);
            for (Object obj : parent.importedObjects) {
                if (obj != null) {
                    for (Class<?> superclass = obj.getClass(); superclass != null && AbstractC3500.m5992(superclass); superclass = superclass.getSuperclass()) {
                        This thisM5998 = AbstractC3500.m5998(obj, superclass.getSimpleName());
                        if (thisM5998 != null) {
                            collectExtensionMatches(thisM5998.getNameSpace().methods.get(str), cls, arrayList);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Object[] objArr = AbstractC3500.f8347;
        Interpreter.debug("find most specific extension method for: receiver: " + cls + " args: " + Arrays.toString(clsArr));
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            BshMethod bshMethod = (BshMethod) arrayList.get(i);
            if (bshMethod.isExtension && (cls3 = bshMethod.receiverType) != null && AbstractC3495.m5940(cls3, cls)) {
                arrayList2.add(Integer.valueOf(i));
            }
        }
        if (arrayList2.isEmpty()) {
            iIntValue = -1;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                Integer num = (Integer) arrayList2.get(i2);
                Class<?> cls4 = ((BshMethod) arrayList.get(num.intValue())).receiverType;
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList2.size()) {
                        break;
                    }
                    if (i2 != i3 && cls4 != (cls2 = ((BshMethod) arrayList.get(((Integer) arrayList2.get(i3)).intValue())).receiverType) && cls4.isAssignableFrom(cls2)) {
                        arrayList3.remove(num);
                        break;
                    }
                    i3++;
                }
            }
            if (arrayList3.size() == 1) {
                iIntValue = ((Integer) arrayList3.get(0)).intValue();
            } else {
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add((BshMethod) arrayList.get(((Integer) it.next()).intValue()));
                }
                int iM6001 = AbstractC3500.m6001(clsArr, arrayList4);
                iIntValue = iM6001 >= 0 ? ((Integer) arrayList3.get(iM6001)).intValue() : ((Integer) arrayList3.get(0)).intValue();
            }
        }
        if (iIntValue == -1) {
            return null;
        }
        return (BshMethod) arrayList.get(iIntValue);
    }

    public This getGlobal(Interpreter interpreter) {
        NameSpace nameSpace = this.parent;
        return nameSpace != null ? nameSpace.getGlobal(interpreter) : getThis(interpreter);
    }

    public BshMethod getImportedMethod(String str, Class<?>[] clsArr) {
        for (Object obj : this.importedObjects) {
            AbstractC3458 abstractC3458M5997 = AbstractC3500.m5997(obj.getClass(), str, clsArr, false);
            if (abstractC3458M5997 != null) {
                return new BshMethod(abstractC3458M5997, obj);
            }
        }
        Iterator<Class<?>> it = this.importedStatic.iterator();
        while (it.hasNext()) {
            AbstractC3458 abstractC3458M59972 = AbstractC3500.m5997(it.next(), str, clsArr, true);
            if (abstractC3458M59972 != null) {
                return new BshMethod(abstractC3458M59972, (Object) null);
            }
        }
        return null;
    }

    public Variable getImportedVar(String str) {
        AbstractC3458 abstractC3458M5989;
        AbstractC3458 abstractC3458M59892;
        This thisM5998;
        Variable variableCreateVariable = null;
        for (Object obj : this.importedObjects) {
            try {
                abstractC3458M59892 = AbstractC3500.m5989(obj.getClass(), str, false);
            } catch (ReflectError unused) {
                abstractC3458M59892 = null;
            }
            if (abstractC3458M59892 != null) {
                variableCreateVariable = createVariable(str, (Class<?>) abstractC3458M59892.mo5856(), new LHS(obj, abstractC3458M59892));
            } else if (this.isClass) {
                Class<?> superclass = obj.getClass();
                while (true) {
                    superclass = superclass.getSuperclass();
                    if (!AbstractC3500.m5992(superclass) || ((thisM5998 = AbstractC3500.m5998(obj, superclass.getSimpleName())) != null && (variableCreateVariable = thisM5998.getNameSpace().variables.get(str)) != null)) {
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
            try {
                abstractC3458M5989 = AbstractC3500.m5989(it.next(), str, true);
            } catch (ReflectError unused2) {
                abstractC3458M5989 = null;
            }
            if (abstractC3458M5989 != null) {
                Variable variableCreateVariable2 = createVariable(str, (Class<?>) abstractC3458M5989.mo5856(), new LHS(abstractC3458M5989));
                this.variables.put(str, variableCreateVariable2);
                return variableCreateVariable2;
            }
        }
        return null;
    }

    public int getInvocationLine() {
        InterfaceC3452 node = getNode();
        if (node != null) {
            return node.getLineNumber();
        }
        return -1;
    }

    public String getInvocationText() {
        InterfaceC3452 node = getNode();
        return node != null ? node.getText() : "<invoked from Java code>";
    }

    public BshMethod getMethod(String str, Class<?>[] clsArr, boolean z, boolean z2) {
        NameSpace nameSpace;
        Interpreter.debug("Get method: ", str, " ", this);
        BshMethod importedMethod = (!this.isClass || this.isEnum || z) ? null : getImportedMethod(str, clsArr);
        if (importedMethod == null && this.methods.containsKey(str)) {
            importedMethod = selectMethod(clsArr, this.methods.get(str), z2);
        }
        if (importedMethod == null && !this.isClass && !z) {
            importedMethod = getImportedMethod(str, clsArr);
        }
        return (importedMethod != null || z || (nameSpace = this.parent) == null) ? importedMethod : nameSpace.getMethod(str, clsArr, false, z2);
    }

    public String[] getMethodNames() {
        return (String[]) this.methods.keySet().stream().toArray(new C3483(8));
    }

    public BshMethod[] getMethods() {
        return (BshMethod[]) this.methods.values().stream().flatMap(new C3474(12)).toArray(new C3483(7));
    }

    public String getName() {
        return this.nsName;
    }

    public Name getNameResolver(String str) {
        if (!this.names.containsKey(str)) {
            this.names.put(str, new Name(this, str));
        }
        return this.names.get(str);
    }

    public InterfaceC3452 getNode() {
        InterfaceC3452 interfaceC3452 = this.callerInfoNode;
        if (interfaceC3452 != null) {
            return interfaceC3452;
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null) {
            return nameSpace.getNode();
        }
        return null;
    }

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

    public NameSpace getParent() {
        return this.parent;
    }

    public Object getPropertyValue(String str, Interpreter interpreter) throws UtilEvalError {
        String strM6003 = AbstractC3500.m6003("get", str);
        Class<?>[] clsArr = AbstractC3500.f8346;
        BshMethod method = getMethod(strM6003, clsArr);
        try {
            if (method != null) {
                return method.invoke(null, interpreter);
            }
            BshMethod method2 = getMethod(AbstractC3500.m6003("is", str), clsArr);
            return (method2 == null || method2.getReturnType() != Boolean.TYPE) ? Primitive.VOID : method2.invoke(null, interpreter);
        } catch (EvalError e) {
            throw new UtilEvalError("'This' property accessor threw exception: " + e.getMessage(), e);
        }
    }

    public This getSuper(Interpreter interpreter) {
        Class<?> cls;
        if (this.isClass && (cls = this.classStatic) != null) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (AbstractC3500.m5992(superclass)) {
                return AbstractC3500.m5998(this.classInstance, superclass.getSimpleName());
            }
        }
        NameSpace nameSpace = this.parent;
        return nameSpace != null ? nameSpace.isClass ? nameSpace.getSuper(interpreter) : nameSpace.getThis(interpreter) : getThis(interpreter);
    }

    public This getThis(Interpreter interpreter) {
        if (this.thisReference == null) {
            this.thisReference = This.getThis(this, interpreter);
        }
        return this.thisReference;
    }

    public Object getVariable(String str, boolean z) {
        Variable variableImpl = getVariableImpl(str, z);
        Interpreter.debug("Get variable: ", str, " = ", variableImpl);
        return unwrapVariable(variableImpl);
    }

    public Variable getVariableImpl(String str, boolean z) {
        NameSpace nameSpace;
        if (this.variables.containsKey(str)) {
            return this.variables.get(str);
        }
        Variable importedVar = getImportedVar(str);
        return (z && importedVar == null && (nameSpace = this.parent) != null) ? nameSpace.getVariableImpl(str, z) : importedVar;
    }

    public String[] getVariableNames() {
        return (String[]) this.variables.keySet().stream().toArray(new C3483(6));
    }

    public Object getVariableOrProperty(String str, Interpreter interpreter) {
        Object variable = getVariable(str, true);
        return variable == Primitive.VOID ? getPropertyValue(str, interpreter) : variable;
    }

    public Variable[] getVariables() {
        return (Variable[]) this.variables.values().stream().toArray(new C3483(4));
    }

    public void importClass(String str) {
        this.importedClasses.put(Name.suffix(str, 1), str);
        nameSpaceChanged();
    }

    public void importCommands(String str) {
        String strReplace = str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        if (!strReplace.startsWith("/")) {
            strReplace = "/".concat(strReplace);
        }
        if (strReplace.length() > 1 && strReplace.endsWith("/")) {
            strReplace = AbstractC0900.m721(1, 0, strReplace);
        }
        this.importedCommands.remove(strReplace);
        this.importedCommands.add(0, strReplace);
        nameSpaceChanged();
    }

    public void importObject(Object obj) {
        this.importedObjects.remove(obj);
        this.importedObjects.add(0, obj);
        nameSpaceChanged();
    }

    public void importPackage(String str) {
        this.importedPackages.remove(str);
        this.importedPackages.add(0, str);
        nameSpaceChanged();
    }

    public void importStatic(Class<?> cls) {
        this.importedStatic.remove(cls);
        this.importedStatic.add(0, cls);
        nameSpaceChanged();
    }

    public Object invokeCommand(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC3452 interfaceC3452, boolean z) throws EvalError {
        String str2;
        CallStack callStack2;
        InterfaceC3452 interfaceC34522;
        Class<?>[] clsArrM5956 = AbstractC3495.m5956(objArr);
        try {
            Object command = getCommand(str, clsArrM5956, interpreter);
            if (command != null) {
                if (command instanceof BshMethod) {
                    return ((BshMethod) command).invoke(objArr, interpreter, callStack, interfaceC3452);
                }
                try {
                    return AbstractC3500.m6006((Class) command, objArr, interpreter, callStack, interfaceC3452);
                } catch (UtilEvalError e) {
                    throw e.toEvalError("Error invoking compiled command: ", interfaceC3452, callStack);
                }
            }
            if (z) {
                str2 = str;
                callStack2 = callStack;
                interfaceC34522 = interfaceC3452;
            } else {
                boolean[] zArr = new boolean[1];
                str2 = str;
                callStack2 = callStack;
                interfaceC34522 = interfaceC3452;
                Object objInvokeDefaultInvokeMethod = invokeDefaultInvokeMethod(str2, objArr, interpreter, callStack2, interfaceC34522, zArr);
                if (zArr[0]) {
                    return objInvokeDefaultInvokeMethod;
                }
            }
            throw new EvalException("Command not found: ".concat(AbstractC3462.m5894(str2, clsArrM5956)), interfaceC34522, callStack2);
        } catch (UtilEvalError e2) {
            throw e2.toEvalError("Error loading command: ", interfaceC3452, callStack);
        }
    }

    public Object invokeDefaultInvokeMethod(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC3452 interfaceC3452, boolean[] zArr) {
        try {
            BshMethod method = getMethod("invoke", new Class[]{null, null});
            boolean z = method != null;
            zArr[0] = z;
            if (z) {
                return method.invoke(new Object[]{str, objArr}, interpreter, callStack, interfaceC3452);
            }
            return null;
        } catch (UtilEvalError e) {
            throw e.toEvalError("Local method invocation", interfaceC3452, callStack);
        }
    }

    public Object invokeMethod(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC3452 interfaceC3452) {
        return getThis(interpreter).invokeMethod(str, objArr, interpreter, callStack, interfaceC3452, false);
    }

    public boolean isChildOf(NameSpace nameSpace) {
        if (getParent() != null) {
            return getParent().equals(nameSpace) || getParent().isChildOf(nameSpace);
        }
        return false;
    }

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

    public void nameSpaceChanged() {
        this.classCache.clear();
        this.names.clear();
    }

    public void prune() {
        getClassManager();
        setParent(null);
    }

    public void setClassInstance(Object obj) {
        this.classInstance = obj;
        importObject(obj);
    }

    public void setClassManager(C3493 c3493) {
        this.classManager = c3493;
    }

    public void setClassStatic(Class<?> cls) {
        this.classStatic = cls;
        importStatic(cls);
    }

    public Variable setLocalVariable(String str, Object obj, boolean z) {
        return setVariable(str, obj, z, false);
    }

    public void setLocalVariableOrProperty(String str, Object obj, boolean z) throws UtilEvalError {
        setVariableOrProperty(str, obj, z, false);
    }

    public void setMethod(BshMethod bshMethod) {
        String name = bshMethod.getName();
        if (!this.methods.containsKey(name)) {
            this.methods.put(name, new ArrayList(1));
        }
        this.methods.get(name).remove(bshMethod);
        this.methods.get(name).add(0, bshMethod);
    }

    public void setName(String str) {
        this.nsName = str;
    }

    public void setNode(InterfaceC3452 interfaceC3452) {
        this.callerInfoNode = interfaceC3452;
    }

    public void setPackage(String str) {
        this.packageName = str;
    }

    public void setParent(NameSpace nameSpace) {
        this.parent = nameSpace;
        if (nameSpace == null) {
            loadDefaultImports();
        }
    }

    public void setTypedVariable(String str, Class<?> cls, Object obj, Modifiers modifiers) {
        Variable variableImpl = getVariableImpl(str, false);
        if (variableImpl == null || variableImpl.getType() == null) {
            this.variables.put(str, createVariable(str, cls, obj, modifiers));
            return;
        }
        if (variableImpl.getType() != cls) {
            StringBuilder sbM12144 = AbstractC7012.m12144("Typed variable: ", str, " was previously declared with type: ");
            sbM12144.append(variableImpl.getType());
            throw new UtilEvalError(sbM12144.toString());
        }
        if (variableImpl.modifiers == null) {
            variableImpl.modifiers = modifiers;
        }
        variableImpl.setValue(obj, 0);
    }

    public Variable setVariable(String str, Object obj, boolean z, boolean z2) throws UtilEvalError {
        if (obj == null) {
            obj = Primitive.NULL;
        }
        Variable variableImpl = getVariableImpl(str, z2);
        if (variableImpl != null) {
            variableImpl.setValue(obj, 1);
            return variableImpl;
        }
        if (z) {
            throw new UtilEvalError(AbstractC0900.m717("(Strict Java mode) Assignment to undeclared variable: ", str));
        }
        Variable variableCreateVariable = createVariable(str, obj, (Modifiers) null);
        this.variables.put(str, variableCreateVariable);
        nameSpaceChanged();
        return variableCreateVariable;
    }

    public void setVariableImpl(Variable variable) {
        if (this.variables.containsKey(variable.getName())) {
            return;
        }
        this.variables.put(variable.getName(), variable);
    }

    public void setVariableOrProperty(String str, Object obj, boolean z, boolean z2) throws UtilEvalError {
        if (obj == null) {
            C3466.m5902("null variable value");
            return;
        }
        Variable variableImpl = getVariableImpl(str, z2);
        if (variableImpl != null) {
            try {
                variableImpl.setValue(obj, 1);
                return;
            } catch (UtilEvalError e) {
                StringBuilder sbM12144 = AbstractC7012.m12144("Variable assignment: ", str, ": ");
                sbM12144.append(e.getMessage());
                throw new UtilEvalError(sbM12144.toString(), e);
            }
        }
        if (z) {
            throw new UtilEvalError(AbstractC0900.m717("(Strict Java mode) Assignment to undeclared variable: ", str));
        }
        This r3 = this.thisReference;
        if (attemptSetPropertyValue(str, obj, r3 != null ? r3.declaringInterpreter : null)) {
            return;
        }
        this.variables.put(str, createVariable(str, obj, (Modifiers) null));
        nameSpaceChanged();
    }

    public NameSpace toLambdaNameSpace() {
        NameSpace nameSpaceCopy = copy();
        Stack stack = new Stack();
        while (true) {
            this = this.parent;
            if (this == null) {
                break;
            }
            stack.add(this);
        }
        while (!stack.isEmpty()) {
            NameSpace nameSpace = (NameSpace) stack.pop();
            if (!nameSpace.isClass && !nameSpace.isEnum) {
                nameSpaceCopy.variables.putAll(nameSpace.variables);
            }
        }
        nameSpaceCopy.variables.replaceAll(new C3449());
        return nameSpaceCopy;
    }

    public String toString() {
        String strM711;
        StringBuilder sb = new StringBuilder("NameSpace: ");
        if (this.nsName == null) {
            strM711 = super.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.nsName);
            sb2.append(" (");
            strM711 = AbstractC0900.m711(sb2, super.toString(), ")");
        }
        sb.append(strM711);
        sb.append(this.isClass ? " (class) " : "");
        sb.append(this.isInterface ? " (interface) " : "");
        sb.append(this.isEnum ? " (enum) " : "");
        sb.append(this.isMethod ? " (method) " : "");
        sb.append(this.classStatic != null ? " (class static) " : "");
        sb.append(this.classInstance != null ? " (class instance) " : "");
        return sb.toString();
    }

    public void unsetVariable(String str) {
        this.variables.remove(str);
        nameSpaceChanged();
    }

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

    public void setVariable(String str, Object obj, boolean z) {
        setVariable(str, obj, z, true);
    }

    @Deprecated
    public void setTypedVariable(String str, Class<?> cls, Object obj, boolean z) {
        Modifiers modifiers = new Modifiers(3);
        if (z) {
            modifiers.addModifier("final");
        }
        setTypedVariable(str, cls, obj, modifiers);
    }

    public BshMethod getMethod(String str, Class<?>[] clsArr, boolean z) {
        return getMethod(str, clsArr, z, false);
    }

    public BshMethod getMethod(String str, Class<?>[] clsArr) {
        return getMethod(str, clsArr, false);
    }

    public void setVariableOrProperty(String str, Object obj, boolean z) throws UtilEvalError {
        setVariableOrProperty(str, obj, z, true);
    }

    public NameSpace(String str) {
        this(null, null, str);
    }

    public NameSpace(String str, C3493 c3493) {
        this(null, c3493, str);
    }

    public NameSpace(NameSpace nameSpace, String str) {
        this(nameSpace, null, str);
    }

    public Object invokeCommand(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC3452 interfaceC3452) {
        return invokeCommand(str, objArr, interpreter, callStack, interfaceC3452, false);
    }
}
