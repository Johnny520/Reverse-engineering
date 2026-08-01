package bsh;

import androidx.profileinstaller.AbstractC3275;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class This implements Serializable, Runnable {
    transient Interpreter declaringInterpreter;
    private Map<Integer, Object> interfaces;
    private final InvocationHandler invocationHandler = new Handler();
    final NameSpace namespace;
    public static final Map<String, NameSpace> contextStore = new ConcurrentHashMap();
    private static final ThreadLocal<NameSpace> CONTEXT_NAMESPACE = new ThreadLocal<>();
    private static final ThreadLocal<Interpreter> CONTEXT_INTERPRETER = new ThreadLocal<>();
    static final ThreadLocal<Map<String, Object[]>> CONTEXT_ARGS = ThreadLocal.withInitial(new C3465(1));

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public class Handler implements InvocationHandler, Serializable {
        public Handler() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return invokeImpl(obj, method, objArr);
            } catch (TargetError e) {
                System.err.println("[BeanShell] TargetError in scripted interface: " + e);
                return null;
            } catch (EvalError e2) {
                System.err.println("[BeanShell] EvalError in scripted interface: " + e2);
                return null;
            }
        }

        public Object invokeImpl(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            BshMethod bshMethodM6010 = AbstractC3500.m6010(This.this.namespace, "equals", new Class[]{Object.class}, true);
            if (name.equals("equals") && bshMethodM6010 == null) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            BshMethod bshMethodM60102 = AbstractC3500.m6010(This.this.namespace, "toString", new Class[0], true);
            if (!name.equals("toString") || bshMethodM60102 != null) {
                return Primitive.unwrap(This.this.invokeMethod(name, Primitive.wrap(objArr, method.getParameterTypes())));
            }
            Class<?>[] interfaces = obj.getClass().getInterfaces();
            StringBuilder sb = new StringBuilder(This.this.toString() + "\nimplements:");
            for (Class<?> cls : interfaces) {
                StringBuilder sb2 = new StringBuilder(" ");
                sb2.append(cls.getName());
                sb2.append(interfaces.length > 1 ? "," : "");
                sb.append(sb2.toString());
            }
            return sb.toString();
        }
    }

    public This(NameSpace nameSpace, Interpreter interpreter) {
        this.namespace = nameSpace;
        this.declaringInterpreter = interpreter;
    }

    public static void bind(This r1, NameSpace nameSpace, Interpreter interpreter) {
        r1.namespace.setParent(nameSpace);
        r1.declaringInterpreter = interpreter;
    }

    public static ConstructorArgs getConstructorArgs(Class<?> cls, This r17, Object[] objArr, int i) {
        if (r17 == null) {
            C3466.m5902("Unititialized class: no static");
            return null;
        }
        if (i == -1) {
            return ConstructorArgs.DEFAULT;
        }
        try {
            Object variable = r17.getNameSpace().getVariable(Keys.BSHCONSTRUCTORS.toString());
            if (variable == Primitive.VOID) {
                throw new InterpreterError("Unable to find constructors array in class");
            }
            DelayedEvalBshMethod[] delayedEvalBshMethodArr = (DelayedEvalBshMethod[]) variable;
            DelayedEvalBshMethod delayedEvalBshMethod = delayedEvalBshMethodArr[i];
            String altConstructor = delayedEvalBshMethod.getAltConstructor();
            if (altConstructor == null) {
                return ConstructorArgs.DEFAULT;
            }
            BSHArguments argsNode = delayedEvalBshMethod.getArgsNode();
            NameSpace nameSpace = new NameSpace(r17.getNameSpace(), "consArgs");
            String[] parameterNames = delayedEvalBshMethod.getParameterNames();
            Class<?>[] parameterTypes = delayedEvalBshMethod.getParameterTypes();
            for (int i2 = 0; i2 < objArr.length; i2++) {
                try {
                    nameSpace.setTypedVariable(parameterNames[i2], parameterTypes[i2], objArr[i2], (Modifiers) null);
                } catch (UtilEvalError e) {
                    C3466.m5898("err setting local cons arg:", e);
                    return null;
                }
            }
            CallStack callStack = new CallStack();
            callStack.push(nameSpace);
            Object[] constructorArgs = delayedEvalBshMethod.getConstructorArgs();
            Interpreter interpreter = r17.declaringInterpreter;
            if (argsNode != null) {
                try {
                    constructorArgs = argsNode.getArguments(callStack, interpreter);
                } catch (EvalError e2) {
                    C3466.m5898("Error evaluating constructor args: ", e2);
                    return null;
                }
            }
            Class[] clsArrM5956 = AbstractC3495.m5956(constructorArgs);
            Object[] objArrUnwrap = Primitive.unwrap(constructorArgs);
            if (altConstructor.equals("super")) {
                int iM6000 = AbstractC3500.m6000(clsArrM5956, ((C3489) C3493.f8305.m14429(cls)).m5921(cls.getName()));
                if (iM6000 != -1) {
                    return new ConstructorArgs(iM6000, objArrUnwrap);
                }
                C3466.m5902("can't find super constructor for args!");
                return null;
            }
            int iM6001 = AbstractC3500.m6001(clsArrM5956, Arrays.asList(delayedEvalBshMethodArr));
            if (iM6001 == -1) {
                C3466.m5902("can't find this constructor for args!");
                return null;
            }
            int size = ((C3489) C3493.f8305.m14429(cls)).m5921(cls.getName()).size();
            int i3 = iM6001 + size;
            if (i3 != size + i) {
                return new ConstructorArgs(i3, objArrUnwrap);
            }
            C3466.m5902("Recursive constructor call.");
            return null;
        } catch (Exception e3) {
            C3466.m5898("Unable to get instance initializers: ", e3);
            return null;
        }
    }

    public static This getThis(NameSpace nameSpace, Interpreter interpreter) {
        return new This(nameSpace, interpreter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static This initClassInstanceThis(Object obj, String str) {
        This thisM5998 = AbstractC3500.m5998(obj, str);
        if (thisM5998 != null) {
            return thisM5998;
        }
        This thisM6016 = AbstractC3500.m6016(obj.getClass(), str);
        NameSpace nameSpaceCopy = thisM6016.getNameSpace().copy();
        ThreadLocal<NameSpace> threadLocal = CONTEXT_NAMESPACE;
        if (threadLocal.get() != null) {
            nameSpaceCopy.setParent(threadLocal.get());
        }
        ThreadLocal<Interpreter> threadLocal2 = CONTEXT_INTERPRETER;
        This r2 = threadLocal2.get() != null ? nameSpaceCopy.getThis(threadLocal2.get()) : nameSpaceCopy.getThis(thisM6016.declaringInterpreter);
        try {
            AbstractC3500.m6019(obj, Keys.BSHTHIS + str).assign(r2, false);
            nameSpaceCopy.setClassInstance(obj);
            try {
                BSHBlock bSHBlock = (BSHBlock) thisM6016.getNameSpace().getVariable(Keys.BSHINIT.toString());
                try {
                    CallStack callStack = new CallStack(nameSpaceCopy);
                    Interpreter interpreter = r2.declaringInterpreter;
                    Boolean bool = Boolean.TRUE;
                    bSHBlock.evalBlock(callStack, interpreter, bool, C3485.f8282);
                    bSHBlock.evalBlock(new CallStack(nameSpaceCopy), r2.declaringInterpreter, bool, C3485.f8283);
                    return r2;
                } catch (Exception e) {
                    C3466.m5898("Error in class instance This initialization: ", e);
                    return null;
                }
            } catch (Exception e2) {
                C3466.m5898("unable to get instance initializer: ", e2);
                return null;
            }
        } catch (Exception e3) {
            C3466.m5898("Error in class gen setup: ", e3);
            return null;
        }
    }

    public static void initInstance(GeneratedClass generatedClass, String str, Object[] objArr) {
        int i;
        try {
            This thisInitClassInstanceThis = initClassInstanceThis(generatedClass, str);
            NameSpace nameSpace = thisInitClassInstanceThis.getNameSpace();
            ArrayList arrayList = new ArrayList();
            Class<?> superclass = generatedClass.getClass();
            while (true) {
                i = 0;
                if (superclass == null || superclass.getSimpleName().equals(str)) {
                    break;
                }
                arrayList.add(0, superclass.getSimpleName());
                superclass = superclass.getSuperclass();
            }
            arrayList.forEach(new C3497(generatedClass, i));
            if (nameSpace.isEnum) {
                ThreadLocal<Map<String, Object[]>> threadLocal = CONTEXT_ARGS;
                if (threadLocal.get().containsKey(generatedClass.toString())) {
                    objArr = threadLocal.get().remove(generatedClass.toString());
                }
            }
            BshMethod method = nameSpace.getMethod(AbstractC3495.m5952(str), AbstractC3495.m5956(objArr), true);
            if (objArr.length > 0 && method == null) {
                throw new InterpreterError("Can't find constructor: " + AbstractC3462.m5894(str, AbstractC3495.m5956(objArr)));
            }
            if (method != null) {
                method.invoke(objArr, thisInitClassInstanceThis.declaringInterpreter);
            }
            for (Variable variable : AbstractC3500.m6008(AbstractC3500.m6004(generatedClass))) {
                variable.validateFinalIsSet(false);
            }
        } catch (Exception e) {
            e = e;
            if (e instanceof TargetError) {
                e = (Exception) ((TargetError) e).getTarget();
            }
            if (e instanceof InvocationTargetException) {
                e = (Exception) e.getCause();
            }
            C3466.m5898("Error in class instance initialization: ", e);
        }
    }

    public static void initStatic(Class<?> cls) throws UtilEvalError {
        String simpleName = cls.getSimpleName();
        try {
            This thisM6016 = AbstractC3500.m6016(cls, simpleName);
            NameSpace nameSpace = thisM6016.getNameSpace();
            Interpreter interpreter = thisM6016.declaringInterpreter;
            if (interpreter == null) {
                throw new UtilEvalError("No namespace or interpreter for statitc This. Start interpreter for class not implemented yet.");
            }
            BSHBlock bSHBlock = (BSHBlock) nameSpace.getVariable(Keys.BSHINIT.toString());
            CallStack callStack = new CallStack(nameSpace);
            Boolean bool = Boolean.TRUE;
            bSHBlock.evalBlock(callStack, interpreter, bool, C3485.f8284);
            bSHBlock.evalBlock(callStack, interpreter, bool, C3485.f8285);
            for (Variable variable : AbstractC3500.m6008(nameSpace)) {
                variable.validateFinalIsSet(true);
            }
        } catch (Exception e) {
            StringBuilder sbM12144 = AbstractC7012.m12144("Exception in static init block <clinit> for class ", simpleName, ". With message: ");
            sbM12144.append(e.getMessage());
            throw new UtilEvalError(sbM12144.toString(), e);
        }
    }

    public static boolean isExposedThisMethod(String str) {
        return str.equals("invokeMethod") || str.equals("getInterface") || str.equals("wait") || str.equals("notify") || str.equals("notifyAll");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$static$1() {
        return new HashMap();
    }

    public static This pullBshStatic(String str) {
        Map<String, NameSpace> map = contextStore;
        return map.containsKey(str) ? map.remove(str).getThis(null) : getThis(null, null);
    }

    public static void registerConstructorContext(CallStack callStack, Interpreter interpreter) {
        if (callStack != null) {
            CONTEXT_NAMESPACE.set(callStack.top());
        } else {
            CONTEXT_NAMESPACE.remove();
        }
        if (interpreter != null) {
            CONTEXT_INTERPRETER.set(interpreter);
        } else {
            CONTEXT_INTERPRETER.remove();
        }
    }

    public Object cloneMethodImpl(InterfaceC3452 interfaceC3452, CallStack callStack, Object obj) throws EvalError {
        NameSpace nameSpace = new NameSpace(this.namespace.getParent(), this.namespace.getName() + " clone");
        if (obj == null) {
            try {
                Class<?> cls = this.namespace.classStatic;
                if (cls == null) {
                    return nameSpace.getThis(this.declaringInterpreter);
                }
                obj = cls.getConstructor(null).newInstance(null);
            } catch (UtilEvalError e) {
                throw e.toEvalError("Unable to assign clone instance This: " + e.getMessage(), interfaceC3452, callStack);
            } catch (IllegalAccessException e2) {
                e = e2;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), interfaceC3452, callStack);
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), interfaceC3452, callStack);
            } catch (InstantiationException e4) {
                e = e4;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), interfaceC3452, callStack);
            } catch (NoSuchMethodException e5) {
                e = e5;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), interfaceC3452, callStack);
            } catch (SecurityException e6) {
                e = e6;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), interfaceC3452, callStack);
            } catch (InvocationTargetException e7) {
                e = e7;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), interfaceC3452, callStack);
            }
        }
        nameSpace.setClassInstance(obj);
        nameSpace.setClassStatic(this.namespace.classStatic);
        nameSpace.isClass = true;
        nameSpace.isMethod = true;
        for (Variable variable : this.namespace.getVariables()) {
            nameSpace.setVariableImpl(variable);
        }
        NameSpace nameSpace2 = new NameSpace(nameSpace, (String) null);
        nameSpace2.setClassInstance(obj);
        nameSpace2.setClassStatic(nameSpace.classStatic);
        nameSpace2.isClass = true;
        nameSpace2.isMethod = true;
        for (BshMethod bshMethod : this.namespace.getMethods()) {
            BshMethod bshMethodClone = bshMethod.m5679clone();
            bshMethodClone.declaringNameSpace = nameSpace2;
            nameSpace.setMethod(bshMethodClone);
        }
        AbstractC3500.m6019(obj, Keys.BSHTHIS + nameSpace.classStatic.getSimpleName()).assign(nameSpace.getThis(this.declaringInterpreter));
        return obj;
    }

    public Object[] enumValues() {
        Class<?> cls = getNameSpace().classStatic;
        Object[] objArr = AbstractC3500.f8347;
        return Stream.of((Object[]) cls.getFields()).filter(new C3477(cls, 1)).map(new C3474(14)).filter(new C3475(5)).toArray(new C3503(cls, 0));
    }

    public Object getInterface(Class<?>[] clsArr) {
        if (this.interfaces == null) {
            this.interfaces = new HashMap();
        }
        int iM5129 = 21;
        for (Class<?> cls : clsArr) {
            iM5129 = AbstractC3275.m5129(3, iM5129, cls);
        }
        Integer numValueOf = Integer.valueOf(iM5129);
        Object obj = this.interfaces.get(numValueOf);
        if (obj != null) {
            return obj;
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(clsArr[0].getClassLoader(), clsArr, this.invocationHandler);
        this.interfaces.put(numValueOf, objNewProxyInstance);
        return objNewProxyInstance;
    }

    public NameSpace getNameSpace() {
        return this.namespace;
    }

    public Object invokeMethod(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC3452 interfaceC3452, boolean z) throws EvalException {
        if (objArr == null) {
            objArr = AbstractC3500.f8347;
        }
        Object[] objArr2 = objArr;
        if (interpreter == null) {
            interpreter = this.declaringInterpreter;
        }
        Interpreter interpreter2 = interpreter;
        if (interpreter2.getNameSpace() == null) {
            interpreter2.setNameSpace(this.namespace);
        }
        if (callStack == null) {
            callStack = new CallStack(this.namespace);
        }
        CallStack callStack2 = callStack;
        if (interfaceC3452 == null) {
            interfaceC3452 = InterfaceC3452.f8196;
        }
        InterfaceC3452 interfaceC34522 = interfaceC3452;
        Class[] clsArrM5956 = AbstractC3495.m5956(objArr2);
        BshMethod bshMethodM6010 = AbstractC3500.m6010(this.namespace, str, clsArrM5956, z);
        if (bshMethodM6010 != null) {
            return bshMethodM6010.invoke(objArr2, interpreter2, callStack2, interfaceC34522);
        }
        if (str.equals("getClass") && objArr2.length == 0) {
            return This.class;
        }
        if (str.equals("toString") && objArr2.length == 0) {
            return toString();
        }
        if (str.equals("hashCode") && objArr2.length == 0) {
            return Integer.valueOf(hashCode());
        }
        if (str.equals("equals") && objArr2.length == 1) {
            return this == objArr2[0] ? Boolean.TRUE : Boolean.FALSE;
        }
        if (str.equals("clone") && objArr2.length == 0) {
            return cloneMethodImpl(interfaceC34522, callStack2);
        }
        boolean[] zArr = new boolean[1];
        Object objInvokeDefaultInvokeMethod = this.namespace.invokeDefaultInvokeMethod(str, objArr2, interpreter2, callStack2, interfaceC34522, zArr);
        if (zArr[0]) {
            return objInvokeDefaultInvokeMethod;
        }
        try {
            return this.namespace.invokeCommand(str, objArr2, interpreter2, callStack2, interfaceC34522, true);
        } catch (EvalError e) {
            throw new EvalException("Method " + AbstractC3462.m5894(str, clsArrM5956) + " not found in bsh scripted object: " + this.namespace.getName(), interfaceC34522, callStack2, e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            invokeMethod("run", AbstractC3500.f8347);
        } catch (EvalError e) {
            this.declaringInterpreter.error("Exception in runnable:" + e);
        }
    }

    public String toString() {
        BshMethod bshMethodM6010 = AbstractC3500.m6010(this.namespace, "toString", new Class[0], true);
        if (bshMethodM6010 != null) {
            try {
                return (String) bshMethodM6010.invoke(new Object[0], this.declaringInterpreter);
            } catch (EvalError unused) {
            }
        }
        return "'this' reference to Bsh object: " + this.namespace;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Keys {
        public static final Keys BSHSTATIC = new C02331();
        public static final Keys BSHTHIS = new C02342();
        public static final Keys BSHSUPER = new C02353();
        public static final Keys BSHINIT = new C02364();
        public static final Keys BSHCONSTRUCTORS = new C02375();
        public static final Keys BSHCLASSMODIFIERS = new C02386();
        public static final Keys BSHEXTENSIONMETHODRECEIVER = new C02397();
        private static final /* synthetic */ Keys[] $VALUES = $values();

        private static /* synthetic */ Keys[] $values() {
            return new Keys[]{BSHSTATIC, BSHTHIS, BSHSUPER, BSHINIT, BSHCONSTRUCTORS, BSHCLASSMODIFIERS, BSHEXTENSIONMETHODRECEIVER};
        }

        public /* synthetic */ Keys(String str, int i, int i2) {
            this(str, i);
        }

        public static Keys valueOf(String str) {
            return (Keys) Enum.valueOf(Keys.class, str);
        }

        public static Keys[] values() {
            return (Keys[]) $VALUES.clone();
        }

        private Keys(String str, int i) {
        }

        /* JADX INFO: renamed from: bsh.This$Keys$1 */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum C02331 extends Keys {
            public /* synthetic */ C02331() {
                this("BSHSTATIC", 0);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshStatic";
            }

            private C02331(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$2 */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum C02342 extends Keys {
            public /* synthetic */ C02342() {
                this("BSHTHIS", 1);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshThis";
            }

            private C02342(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$3 */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum C02353 extends Keys {
            public /* synthetic */ C02353() {
                this("BSHSUPER", 2);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshSuper";
            }

            private C02353(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$4 */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum C02364 extends Keys {
            public /* synthetic */ C02364() {
                this("BSHINIT", 3);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshInstanceInitializer";
            }

            private C02364(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$5 */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum C02375 extends Keys {
            public /* synthetic */ C02375() {
                this("BSHCONSTRUCTORS", 4);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshConstructors";
            }

            private C02375(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$6 */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum C02386 extends Keys {
            public /* synthetic */ C02386() {
                this("BSHCLASSMODIFIERS", 5);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshClassModifiers";
            }

            private C02386(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$7 */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum C02397 extends Keys {
            public /* synthetic */ C02397() {
                this("BSHEXTENSIONMETHODRECEIVER", 6);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshExtensionMethodReceiver";
            }

            private C02397(String str, int i) {
                super(str, i, 0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class ConstructorArgs {
        public static final ConstructorArgs DEFAULT = new ConstructorArgs();
        int arg;
        Object[] args;
        public int selector;

        public ConstructorArgs(int i, Object[] objArr) {
            this.selector = i;
            this.args = objArr;
        }

        public boolean getBoolean() {
            return ((Boolean) next()).booleanValue();
        }

        public byte getByte() {
            return ((Number) next()).byteValue();
        }

        public char getChar() {
            return ((Character) next()).charValue();
        }

        public double getDouble() {
            return ((Number) next()).doubleValue();
        }

        public float getFloat() {
            return ((Number) next()).floatValue();
        }

        public int getInt() {
            return ((Number) next()).intValue();
        }

        public long getLong() {
            return ((Number) next()).longValue();
        }

        public Object getObject() {
            return next();
        }

        public short getShort() {
            return ((Number) next()).shortValue();
        }

        public Object next() {
            Object[] objArr = this.args;
            int i = this.arg;
            this.arg = i + 1;
            return objArr[i];
        }

        public ConstructorArgs() {
            this.selector = -1;
        }
    }

    public Object getInterface(Class<?> cls) {
        return getInterface(new Class[]{cls});
    }

    public Object invokeMethod(String str, Object[] objArr, boolean z) throws EvalException {
        CallStack callStack = new CallStack(this.namespace);
        InterfaceC3452 node = this.namespace.getNode();
        this.namespace.setNode(null);
        try {
            Object objInvokeMethod = invokeMethod(str, objArr, this.declaringInterpreter, callStack, node, z);
            return (!(objInvokeMethod instanceof Primitive) || objInvokeMethod == Primitive.VOID) ? objInvokeMethod : ((Primitive) objInvokeMethod).getValue();
        } catch (Exception e) {
            throw new EvalException(e.getMessage(), node, callStack, e);
        }
    }

    public Object invokeMethod(String str, Object[] objArr) {
        return invokeMethod(str, objArr, null, null, null, false);
    }

    public Object cloneMethodImpl(InterfaceC3452 interfaceC3452, CallStack callStack) {
        return cloneMethodImpl(interfaceC3452, callStack, null);
    }
}
