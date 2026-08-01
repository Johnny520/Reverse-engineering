package bsh;

import androidx.activity.AbstractC0053;
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
import p009.AbstractC6183;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class NameSpace implements Serializable, InterfaceC2657, Cloneable {
    public static final NameSpace JAVACODE;
    private static final long serialVersionUID = 1;
    InterfaceC2619 callerInfoNode;
    private transient Map<String, Class<?>> classCache;
    Object classInstance;
    private transient C2660 classManager;
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
    private List<InterfaceC2617> nameSourceListeners;
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

    public NameSpace(NameSpace nameSpace, C2660 c2660, String str) {
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
        setClassManager(c2660);
        getClassManager().mo5135(this);
    }

    private Class<?> classForName(String str) {
        return getClassManager().mo5134(str);
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
            if (bshMethod.isExtension && (cls2 = bshMethod.receiverType) != null && AbstractC2662.m5380(cls2, cls)) {
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
        String strMo5142;
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
            getClassManager().m5370(clsClassForName, str2);
            return clsClassForName;
        }
        Iterator<String> it = this.importedPackages.iterator();
        while (it.hasNext()) {
            Class<?> clsClassForName2 = classForName(it.next() + "." + str);
            if (clsClassForName2 != null) {
                return clsClassForName2;
            }
        }
        C2660 classManager = getClassManager();
        if (!classManager.mo5141() || (strMo5142 = classManager.mo5142(str)) == null) {
            return null;
        }
        return classForName(strMo5142);
    }

    public static Class<?> identifierToClass(C2646 c2646) {
        return c2646.f7919;
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
        Variable variableClone = variable.m5132clone();
        variableClone.modifiers.addModifier("final");
        return variableClone;
    }

    private BshMethod loadScriptedCommand(InputStream inputStream, String str, Class<?>[] clsArr, String str2, Interpreter interpreter) throws UtilEvalError {
        try {
            C2634 c2634 = new C2634(inputStream);
            try {
                interpreter.eval(c2634, this, str2);
                c2634.close();
                return getMethod(str, clsArr);
            } catch (Throwable th) {
                try {
                    c2634.close();
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
        Object[] objArr = AbstractC2667.f8002;
        Interpreter.debug("find most specific BshMethod for: " + Arrays.toString(clsArr));
        int iM5441 = AbstractC2667.m5441(clsArr, list);
        if (iM5441 == -1) {
            return null;
        }
        return list.get(iM5441);
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        this.names.clear();
        objectOutputStream.defaultWriteObject();
    }

    public void addNameSourceListener(InterfaceC2617 interfaceC2617) {
        this.nameSourceListeners.add(interfaceC2617);
    }

    public boolean attemptSetPropertyValue(String str, Object obj, Interpreter interpreter) throws UtilEvalError {
        String strM5443 = AbstractC2667.m5443("set", str);
        Object objUnwrap = Primitive.unwrap(obj);
        if (getMethod(strM5443, new Class[]{objUnwrap == null ? null : objUnwrap.getClass()}) == null) {
            return false;
        }
        try {
            invokeMethod(strM5443, new Object[]{obj}, interpreter);
            return true;
        } catch (EvalError e) {
            throw new UtilEvalError("'This' property accessor threw exception: " + e.getMessage(), e);
        }
    }

    public void cacheClass(String str, Class<?> cls) {
        this.classCache.put(str, cls);
    }

    @Override // bsh.InterfaceC2657
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
            C2633.m5337(e);
            return null;
        }
    }

    public Variable createVariable(String str, Object obj, Modifiers modifiers) {
        return createVariable(str, null, obj, modifiers);
    }

    public void doSuperImport() throws Capabilities$Unavailable {
        getClassManager().mo5139();
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
        Iterator it = this.classManager.f7964.f19369.iterator();
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

    public C2660 getClassManager() {
        C2660 c2660 = this.classManager;
        if (c2660 != null) {
            return c2660;
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null && nameSpace != JAVACODE) {
            return nameSpace.getClassManager();
        }
        setClassManager(C2660.m5368(null));
        return this.classManager;
    }

    public Object getCommand(String str, Class<?>[] clsArr, Interpreter interpreter) {
        NameSpace nameSpace;
        String str2;
        Class<?>[] clsArr2;
        Interpreter interpreter2;
        String strM151;
        Interpreter.debug("Get command: ", str);
        C2660 classManager = interpreter.getClassManager();
        for (String str3 : this.importedCommands) {
            String str4 = str3.equals("/") ? str3 + str + ".bsh" : str3 + "/" + str + ".bsh";
            Interpreter.debug("searching for script: ".concat(str4));
            URL urlMo5143 = classManager.mo5143(str4);
            if (urlMo5143 != null) {
                try {
                    nameSpace = this;
                    str2 = str;
                    clsArr2 = clsArr;
                    interpreter2 = interpreter;
                    try {
                        return nameSpace.loadScriptedCommand((InputStream) urlMo5143.getContent(), str2, clsArr2, str4, interpreter2);
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
                strM151 = str2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str3.substring(1).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                strM151 = AbstractC0053.m151(sb, ".", str2);
            }
            Interpreter.debug(AbstractC0053.m157("searching for class: ", strM151));
            Class clsMo5134 = classManager.mo5134(strM151);
            if (clsMo5134 != null) {
                return clsMo5134;
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
        return (Variable[]) this.variables.values().stream().toArray(new C2650(5));
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
                    for (Class<?> superclass = obj.getClass(); superclass != null && AbstractC2667.m5432(superclass); superclass = superclass.getSuperclass()) {
                        This thisM5438 = AbstractC2667.m5438(obj, superclass.getSimpleName());
                        if (thisM5438 != null) {
                            collectExtensionMatches(thisM5438.getNameSpace().methods.get(str), cls, arrayList);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Object[] objArr = AbstractC2667.f8002;
        Interpreter.debug("find most specific extension method for: receiver: " + cls + " args: " + Arrays.toString(clsArr));
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            BshMethod bshMethod = (BshMethod) arrayList.get(i);
            if (bshMethod.isExtension && (cls3 = bshMethod.receiverType) != null && AbstractC2662.m5380(cls3, cls)) {
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
                int iM5441 = AbstractC2667.m5441(clsArr, arrayList4);
                iIntValue = iM5441 >= 0 ? ((Integer) arrayList3.get(iM5441)).intValue() : ((Integer) arrayList3.get(0)).intValue();
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
            AbstractC2625 abstractC2625M5437 = AbstractC2667.m5437(obj.getClass(), str, clsArr, false);
            if (abstractC2625M5437 != null) {
                return new BshMethod(abstractC2625M5437, obj);
            }
        }
        Iterator<Class<?>> it = this.importedStatic.iterator();
        while (it.hasNext()) {
            AbstractC2625 abstractC2625M54372 = AbstractC2667.m5437(it.next(), str, clsArr, true);
            if (abstractC2625M54372 != null) {
                return new BshMethod(abstractC2625M54372, (Object) null);
            }
        }
        return null;
    }

    public Variable getImportedVar(String str) {
        AbstractC2625 abstractC2625M5429;
        AbstractC2625 abstractC2625M54292;
        This thisM5438;
        Variable variableCreateVariable = null;
        for (Object obj : this.importedObjects) {
            try {
                abstractC2625M54292 = AbstractC2667.m5429(obj.getClass(), str, false);
            } catch (ReflectError unused) {
                abstractC2625M54292 = null;
            }
            if (abstractC2625M54292 != null) {
                variableCreateVariable = createVariable(str, (Class<?>) abstractC2625M54292.mo5296(), new LHS(obj, abstractC2625M54292));
            } else if (this.isClass) {
                Class<?> superclass = obj.getClass();
                while (true) {
                    superclass = superclass.getSuperclass();
                    if (!AbstractC2667.m5432(superclass) || ((thisM5438 = AbstractC2667.m5438(obj, superclass.getSimpleName())) != null && (variableCreateVariable = thisM5438.getNameSpace().variables.get(str)) != null)) {
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
                abstractC2625M5429 = AbstractC2667.m5429(it.next(), str, true);
            } catch (ReflectError unused2) {
                abstractC2625M5429 = null;
            }
            if (abstractC2625M5429 != null) {
                Variable variableCreateVariable2 = createVariable(str, (Class<?>) abstractC2625M5429.mo5296(), new LHS(abstractC2625M5429));
                this.variables.put(str, variableCreateVariable2);
                return variableCreateVariable2;
            }
        }
        return null;
    }

    public int getInvocationLine() {
        InterfaceC2619 node = getNode();
        if (node != null) {
            return node.getLineNumber();
        }
        return -1;
    }

    public String getInvocationText() {
        InterfaceC2619 node = getNode();
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
        return (String[]) this.methods.keySet().stream().toArray(new C2650(8));
    }

    public BshMethod[] getMethods() {
        return (BshMethod[]) this.methods.values().stream().flatMap(new C2641(12)).toArray(new C2650(7));
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

    public InterfaceC2619 getNode() {
        InterfaceC2619 interfaceC2619 = this.callerInfoNode;
        if (interfaceC2619 != null) {
            return interfaceC2619;
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
        String strM5443 = AbstractC2667.m5443("get", str);
        Class<?>[] clsArr = AbstractC2667.f8001;
        BshMethod method = getMethod(strM5443, clsArr);
        try {
            if (method != null) {
                return method.invoke(null, interpreter);
            }
            BshMethod method2 = getMethod(AbstractC2667.m5443("is", str), clsArr);
            return (method2 == null || method2.getReturnType() != Boolean.TYPE) ? Primitive.VOID : method2.invoke(null, interpreter);
        } catch (EvalError e) {
            throw new UtilEvalError("'This' property accessor threw exception: " + e.getMessage(), e);
        }
    }

    public This getSuper(Interpreter interpreter) {
        Class<?> cls;
        if (this.isClass && (cls = this.classStatic) != null) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (AbstractC2667.m5432(superclass)) {
                return AbstractC2667.m5438(this.classInstance, superclass.getSimpleName());
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
        return (String[]) this.variables.keySet().stream().toArray(new C2650(6));
    }

    public Object getVariableOrProperty(String str, Interpreter interpreter) {
        Object variable = getVariable(str, true);
        return variable == Primitive.VOID ? getPropertyValue(str, interpreter) : variable;
    }

    public Variable[] getVariables() {
        return (Variable[]) this.variables.values().stream().toArray(new C2650(4));
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
            strReplace = AbstractC0053.m161(1, 0, strReplace);
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

    public Object invokeCommand(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2619 interfaceC2619, boolean z) throws EvalError {
        String str2;
        CallStack callStack2;
        InterfaceC2619 interfaceC26192;
        Class<?>[] clsArrM5396 = AbstractC2662.m5396(objArr);
        try {
            Object command = getCommand(str, clsArrM5396, interpreter);
            if (command != null) {
                if (command instanceof BshMethod) {
                    return ((BshMethod) command).invoke(objArr, interpreter, callStack, interfaceC2619);
                }
                try {
                    return AbstractC2667.m5446((Class) command, objArr, interpreter, callStack, interfaceC2619);
                } catch (UtilEvalError e) {
                    throw e.toEvalError("Error invoking compiled command: ", interfaceC2619, callStack);
                }
            }
            if (z) {
                str2 = str;
                callStack2 = callStack;
                interfaceC26192 = interfaceC2619;
            } else {
                boolean[] zArr = new boolean[1];
                str2 = str;
                callStack2 = callStack;
                interfaceC26192 = interfaceC2619;
                Object objInvokeDefaultInvokeMethod = invokeDefaultInvokeMethod(str2, objArr, interpreter, callStack2, interfaceC26192, zArr);
                if (zArr[0]) {
                    return objInvokeDefaultInvokeMethod;
                }
            }
            throw new EvalException("Command not found: ".concat(AbstractC2629.m5334(str2, clsArrM5396)), interfaceC26192, callStack2);
        } catch (UtilEvalError e2) {
            throw e2.toEvalError("Error loading command: ", interfaceC2619, callStack);
        }
    }

    public Object invokeDefaultInvokeMethod(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2619 interfaceC2619, boolean[] zArr) {
        try {
            BshMethod method = getMethod("invoke", new Class[]{null, null});
            boolean z = method != null;
            zArr[0] = z;
            if (z) {
                return method.invoke(new Object[]{str, objArr}, interpreter, callStack, interfaceC2619);
            }
            return null;
        } catch (UtilEvalError e) {
            throw e.toEvalError("Local method invocation", interfaceC2619, callStack);
        }
    }

    public Object invokeMethod(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2619 interfaceC2619) {
        return getThis(interpreter).invokeMethod(str, objArr, interpreter, callStack, interfaceC2619, false);
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

    public void setClassManager(C2660 c2660) {
        this.classManager = c2660;
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

    public void setNode(InterfaceC2619 interfaceC2619) {
        this.callerInfoNode = interfaceC2619;
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
            StringBuilder sbM11585 = AbstractC6183.m11585("Typed variable: ", str, " was previously declared with type: ");
            sbM11585.append(variableImpl.getType());
            throw new UtilEvalError(sbM11585.toString());
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
            throw new UtilEvalError(AbstractC0053.m157("(Strict Java mode) Assignment to undeclared variable: ", str));
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
            C2633.m5342("null variable value");
            return;
        }
        Variable variableImpl = getVariableImpl(str, z2);
        if (variableImpl != null) {
            try {
                variableImpl.setValue(obj, 1);
                return;
            } catch (UtilEvalError e) {
                StringBuilder sbM11585 = AbstractC6183.m11585("Variable assignment: ", str, ": ");
                sbM11585.append(e.getMessage());
                throw new UtilEvalError(sbM11585.toString(), e);
            }
        }
        if (z) {
            throw new UtilEvalError(AbstractC0053.m157("(Strict Java mode) Assignment to undeclared variable: ", str));
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
        nameSpaceCopy.variables.replaceAll(new C2616());
        return nameSpaceCopy;
    }

    public String toString() {
        String strM151;
        StringBuilder sb = new StringBuilder("NameSpace: ");
        if (this.nsName == null) {
            strM151 = super.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.nsName);
            sb2.append(" (");
            strM151 = AbstractC0053.m151(sb2, super.toString(), ")");
        }
        sb.append(strM151);
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

    public NameSpace(String str, C2660 c2660) {
        this(null, c2660, str);
    }

    public NameSpace(NameSpace nameSpace, String str) {
        this(nameSpace, null, str);
    }

    public Object invokeCommand(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2619 interfaceC2619) {
        return invokeCommand(str, objArr, interpreter, callStack, interfaceC2619, false);
    }
}
