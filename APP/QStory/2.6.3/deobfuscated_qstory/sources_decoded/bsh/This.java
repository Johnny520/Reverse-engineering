package bsh;

import androidx.profileinstaller.AbstractC2442;
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
import p009.AbstractC6183;

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
    static final ThreadLocal<Map<String, Object[]>> CONTEXT_ARGS = ThreadLocal.withInitial(new C2632(1));

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
            BshMethod bshMethodM5450 = AbstractC2667.m5450(This.this.namespace, "equals", new Class[]{Object.class}, true);
            if (name.equals("equals") && bshMethodM5450 == null) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            BshMethod bshMethodM54502 = AbstractC2667.m5450(This.this.namespace, "toString", new Class[0], true);
            if (!name.equals("toString") || bshMethodM54502 != null) {
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
            C2633.m5342("Unititialized class: no static");
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
                    C2633.m5338("err setting local cons arg:", e);
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
                    C2633.m5338("Error evaluating constructor args: ", e2);
                    return null;
                }
            }
            Class[] clsArrM5396 = AbstractC2662.m5396(constructorArgs);
            Object[] objArrUnwrap = Primitive.unwrap(constructorArgs);
            if (altConstructor.equals("super")) {
                int iM5440 = AbstractC2667.m5440(clsArrM5396, ((C2656) C2660.f7960.m13870(cls)).m5361(cls.getName()));
                if (iM5440 != -1) {
                    return new ConstructorArgs(iM5440, objArrUnwrap);
                }
                C2633.m5342("can't find super constructor for args!");
                return null;
            }
            int iM5441 = AbstractC2667.m5441(clsArrM5396, Arrays.asList(delayedEvalBshMethodArr));
            if (iM5441 == -1) {
                C2633.m5342("can't find this constructor for args!");
                return null;
            }
            int size = ((C2656) C2660.f7960.m13870(cls)).m5361(cls.getName()).size();
            int i3 = iM5441 + size;
            if (i3 != size + i) {
                return new ConstructorArgs(i3, objArrUnwrap);
            }
            C2633.m5342("Recursive constructor call.");
            return null;
        } catch (Exception e3) {
            C2633.m5338("Unable to get instance initializers: ", e3);
            return null;
        }
    }

    public static This getThis(NameSpace nameSpace, Interpreter interpreter) {
        return new This(nameSpace, interpreter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static This initClassInstanceThis(Object obj, String str) {
        This thisM5438 = AbstractC2667.m5438(obj, str);
        if (thisM5438 != null) {
            return thisM5438;
        }
        This thisM5456 = AbstractC2667.m5456(obj.getClass(), str);
        NameSpace nameSpaceCopy = thisM5456.getNameSpace().copy();
        ThreadLocal<NameSpace> threadLocal = CONTEXT_NAMESPACE;
        if (threadLocal.get() != null) {
            nameSpaceCopy.setParent(threadLocal.get());
        }
        ThreadLocal<Interpreter> threadLocal2 = CONTEXT_INTERPRETER;
        This r2 = threadLocal2.get() != null ? nameSpaceCopy.getThis(threadLocal2.get()) : nameSpaceCopy.getThis(thisM5456.declaringInterpreter);
        try {
            AbstractC2667.m5459(obj, Keys.BSHTHIS + str).assign(r2, false);
            nameSpaceCopy.setClassInstance(obj);
            try {
                BSHBlock bSHBlock = (BSHBlock) thisM5456.getNameSpace().getVariable(Keys.BSHINIT.toString());
                try {
                    CallStack callStack = new CallStack(nameSpaceCopy);
                    Interpreter interpreter = r2.declaringInterpreter;
                    Boolean bool = Boolean.TRUE;
                    bSHBlock.evalBlock(callStack, interpreter, bool, C2652.f7937);
                    bSHBlock.evalBlock(new CallStack(nameSpaceCopy), r2.declaringInterpreter, bool, C2652.f7938);
                    return r2;
                } catch (Exception e) {
                    C2633.m5338("Error in class instance This initialization: ", e);
                    return null;
                }
            } catch (Exception e2) {
                C2633.m5338("unable to get instance initializer: ", e2);
                return null;
            }
        } catch (Exception e3) {
            C2633.m5338("Error in class gen setup: ", e3);
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
            arrayList.forEach(new C2664(generatedClass, i));
            if (nameSpace.isEnum) {
                ThreadLocal<Map<String, Object[]>> threadLocal = CONTEXT_ARGS;
                if (threadLocal.get().containsKey(generatedClass.toString())) {
                    objArr = threadLocal.get().remove(generatedClass.toString());
                }
            }
            BshMethod method = nameSpace.getMethod(AbstractC2662.m5392(str), AbstractC2662.m5396(objArr), true);
            if (objArr.length > 0 && method == null) {
                throw new InterpreterError("Can't find constructor: " + AbstractC2629.m5334(str, AbstractC2662.m5396(objArr)));
            }
            if (method != null) {
                method.invoke(objArr, thisInitClassInstanceThis.declaringInterpreter);
            }
            for (Variable variable : AbstractC2667.m5448(AbstractC2667.m5444(generatedClass))) {
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
            C2633.m5338("Error in class instance initialization: ", e);
        }
    }

    public static void initStatic(Class<?> cls) throws UtilEvalError {
        String simpleName = cls.getSimpleName();
        try {
            This thisM5456 = AbstractC2667.m5456(cls, simpleName);
            NameSpace nameSpace = thisM5456.getNameSpace();
            Interpreter interpreter = thisM5456.declaringInterpreter;
            if (interpreter == null) {
                throw new UtilEvalError("No namespace or interpreter for statitc This. Start interpreter for class not implemented yet.");
            }
            BSHBlock bSHBlock = (BSHBlock) nameSpace.getVariable(Keys.BSHINIT.toString());
            CallStack callStack = new CallStack(nameSpace);
            Boolean bool = Boolean.TRUE;
            bSHBlock.evalBlock(callStack, interpreter, bool, C2652.f7939);
            bSHBlock.evalBlock(callStack, interpreter, bool, C2652.f7940);
            for (Variable variable : AbstractC2667.m5448(nameSpace)) {
                variable.validateFinalIsSet(true);
            }
        } catch (Exception e) {
            StringBuilder sbM11585 = AbstractC6183.m11585("Exception in static init block <clinit> for class ", simpleName, ". With message: ");
            sbM11585.append(e.getMessage());
            throw new UtilEvalError(sbM11585.toString(), e);
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

    public Object cloneMethodImpl(InterfaceC2619 interfaceC2619, CallStack callStack, Object obj) throws EvalError {
        NameSpace nameSpace = new NameSpace(this.namespace.getParent(), this.namespace.getName() + " clone");
        if (obj == null) {
            try {
                Class<?> cls = this.namespace.classStatic;
                if (cls == null) {
                    return nameSpace.getThis(this.declaringInterpreter);
                }
                obj = cls.getConstructor(null).newInstance(null);
            } catch (UtilEvalError e) {
                throw e.toEvalError("Unable to assign clone instance This: " + e.getMessage(), interfaceC2619, callStack);
            } catch (IllegalAccessException e2) {
                e = e2;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), interfaceC2619, callStack);
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), interfaceC2619, callStack);
            } catch (InstantiationException e4) {
                e = e4;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), interfaceC2619, callStack);
            } catch (NoSuchMethodException e5) {
                e = e5;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), interfaceC2619, callStack);
            } catch (SecurityException e6) {
                e = e6;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), interfaceC2619, callStack);
            } catch (InvocationTargetException e7) {
                e = e7;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), interfaceC2619, callStack);
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
            BshMethod bshMethodClone = bshMethod.m5119clone();
            bshMethodClone.declaringNameSpace = nameSpace2;
            nameSpace.setMethod(bshMethodClone);
        }
        AbstractC2667.m5459(obj, Keys.BSHTHIS + nameSpace.classStatic.getSimpleName()).assign(nameSpace.getThis(this.declaringInterpreter));
        return obj;
    }

    public Object[] enumValues() {
        Class<?> cls = getNameSpace().classStatic;
        Object[] objArr = AbstractC2667.f8002;
        return Stream.of((Object[]) cls.getFields()).filter(new C2644(cls, 1)).map(new C2641(14)).filter(new C2642(5)).toArray(new C2670(cls, 0));
    }

    public Object getInterface(Class<?>[] clsArr) {
        if (this.interfaces == null) {
            this.interfaces = new HashMap();
        }
        int iM4569 = 21;
        for (Class<?> cls : clsArr) {
            iM4569 = AbstractC2442.m4569(3, iM4569, cls);
        }
        Integer numValueOf = Integer.valueOf(iM4569);
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

    public Object invokeMethod(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2619 interfaceC2619, boolean z) throws EvalException {
        if (objArr == null) {
            objArr = AbstractC2667.f8002;
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
        if (interfaceC2619 == null) {
            interfaceC2619 = InterfaceC2619.f7851;
        }
        InterfaceC2619 interfaceC26192 = interfaceC2619;
        Class[] clsArrM5396 = AbstractC2662.m5396(objArr2);
        BshMethod bshMethodM5450 = AbstractC2667.m5450(this.namespace, str, clsArrM5396, z);
        if (bshMethodM5450 != null) {
            return bshMethodM5450.invoke(objArr2, interpreter2, callStack2, interfaceC26192);
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
            return cloneMethodImpl(interfaceC26192, callStack2);
        }
        boolean[] zArr = new boolean[1];
        Object objInvokeDefaultInvokeMethod = this.namespace.invokeDefaultInvokeMethod(str, objArr2, interpreter2, callStack2, interfaceC26192, zArr);
        if (zArr[0]) {
            return objInvokeDefaultInvokeMethod;
        }
        try {
            return this.namespace.invokeCommand(str, objArr2, interpreter2, callStack2, interfaceC26192, true);
        } catch (EvalError e) {
            throw new EvalException("Method " + AbstractC2629.m5334(str, clsArrM5396) + " not found in bsh scripted object: " + this.namespace.getName(), interfaceC26192, callStack2, e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            invokeMethod("run", AbstractC2667.f8002);
        } catch (EvalError e) {
            this.declaringInterpreter.error("Exception in runnable:" + e);
        }
    }

    public String toString() {
        BshMethod bshMethodM5450 = AbstractC2667.m5450(this.namespace, "toString", new Class[0], true);
        if (bshMethodM5450 != null) {
            try {
                return (String) bshMethodM5450.invoke(new Object[0], this.declaringInterpreter);
            } catch (EvalError unused) {
            }
        }
        return "'this' reference to Bsh object: " + this.namespace;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Keys {
        public static final Keys BSHSTATIC = new AnonymousClass1();
        public static final Keys BSHTHIS = new AnonymousClass2();
        public static final Keys BSHSUPER = new AnonymousClass3();
        public static final Keys BSHINIT = new AnonymousClass4();
        public static final Keys BSHCONSTRUCTORS = new AnonymousClass5();
        public static final Keys BSHCLASSMODIFIERS = new AnonymousClass6();
        public static final Keys BSHEXTENSIONMETHODRECEIVER = new AnonymousClass7();
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

        /* JADX INFO: renamed from: bsh.This$Keys$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum AnonymousClass1 extends Keys {
            public /* synthetic */ AnonymousClass1() {
                this("BSHSTATIC", 0);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshStatic";
            }

            private AnonymousClass1(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum AnonymousClass2 extends Keys {
            public /* synthetic */ AnonymousClass2() {
                this("BSHTHIS", 1);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshThis";
            }

            private AnonymousClass2(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum AnonymousClass3 extends Keys {
            public /* synthetic */ AnonymousClass3() {
                this("BSHSUPER", 2);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshSuper";
            }

            private AnonymousClass3(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum AnonymousClass4 extends Keys {
            public /* synthetic */ AnonymousClass4() {
                this("BSHINIT", 3);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshInstanceInitializer";
            }

            private AnonymousClass4(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum AnonymousClass5 extends Keys {
            public /* synthetic */ AnonymousClass5() {
                this("BSHCONSTRUCTORS", 4);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshConstructors";
            }

            private AnonymousClass5(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$6, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum AnonymousClass6 extends Keys {
            public /* synthetic */ AnonymousClass6() {
                this("BSHCLASSMODIFIERS", 5);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshClassModifiers";
            }

            private AnonymousClass6(String str, int i) {
                super(str, i, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$7, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum AnonymousClass7 extends Keys {
            public /* synthetic */ AnonymousClass7() {
                this("BSHEXTENSIONMETHODRECEIVER", 6);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshExtensionMethodReceiver";
            }

            private AnonymousClass7(String str, int i) {
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
        InterfaceC2619 node = this.namespace.getNode();
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

    public Object cloneMethodImpl(InterfaceC2619 interfaceC2619, CallStack callStack) {
        return cloneMethodImpl(interfaceC2619, callStack, null);
    }
}
