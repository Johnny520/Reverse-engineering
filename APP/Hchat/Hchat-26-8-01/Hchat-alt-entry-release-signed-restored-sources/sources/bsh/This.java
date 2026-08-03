package bsh;

import ae.C0076g;
import bsh.ClassGenerator;
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
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class This implements Serializable, Runnable {
    transient Interpreter declaringInterpreter;
    private Map<Integer, Object> interfaces;
    private final InvocationHandler invocationHandler = new Handler();
    final NameSpace namespace;
    public static final Map<String, NameSpace> contextStore = new ConcurrentHashMap();
    private static final ThreadLocal<NameSpace> CONTEXT_NAMESPACE = new ThreadLocal<>();
    private static final ThreadLocal<Interpreter> CONTEXT_INTERPRETER = new ThreadLocal<>();
    static final ThreadLocal<Map<String, Object[]>> CONTEXT_ARGS = ThreadLocal.withInitial(new C0351h(1));

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public class Handler implements InvocationHandler, Serializable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Handler() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return invokeImpl(obj, method, objArr);
            } catch (TargetError e6) {
                System.err.println("[BeanShell] TargetError in scripted interface: " + e6);
                return null;
            } catch (EvalError e7) {
                System.err.println("[BeanShell] EvalError in scripted interface: " + e7);
                return null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Object invokeImpl(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            BshMethod method2 = Reflect.getMethod(This.this.namespace, "equals", (Class<?>[]) new Class[]{Object.class});
            if (name.equals("equals") && method2 == null) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            BshMethod method3 = Reflect.getMethod(This.this.namespace, "toString", (Class<?>[]) new Class[0]);
            if (!name.equals("toString") || method3 != null) {
                return Primitive.unwrap(This.this.invokeMethod(name, Primitive.wrap(objArr, method.getParameterTypes())));
            }
            Class<?>[] interfaces = obj.getClass().getInterfaces();
            StringBuilder sb2 = new StringBuilder(This.this.toString() + "\nimplements:");
            for (Class<?> cls : interfaces) {
                StringBuilder sb3 = new StringBuilder(" ");
                sb3.append(cls.getName());
                sb3.append(interfaces.length > 1 ? "," : HttpUrl.FRAGMENT_ENCODE_SET);
                sb2.append(sb3.toString());
            }
            return sb2.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public This(NameSpace nameSpace, Interpreter interpreter) {
        this.namespace = nameSpace;
        this.declaringInterpreter = interpreter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void bind(This r12, NameSpace nameSpace, Interpreter interpreter) {
        r12.namespace.setParent(nameSpace);
        r12.declaringInterpreter = interpreter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ConstructorArgs getConstructorArgs(Class<?> cls, This r17, Object[] objArr, int i9) {
        if (r17 == null) {
            C0353j.m1308f("Unititialized class: no static");
            return null;
        }
        if (i9 == -1) {
            return ConstructorArgs.DEFAULT;
        }
        try {
            Object variable = r17.getNameSpace().getVariable(Keys.BSHCONSTRUCTORS.toString());
            if (variable == Primitive.VOID) {
                throw new InterpreterError("Unable to find constructors array in class");
            }
            DelayedEvalBshMethod[] delayedEvalBshMethodArr = (DelayedEvalBshMethod[]) variable;
            DelayedEvalBshMethod delayedEvalBshMethod = delayedEvalBshMethodArr[i9];
            String altConstructor = delayedEvalBshMethod.getAltConstructor();
            if (altConstructor == null) {
                return ConstructorArgs.DEFAULT;
            }
            BSHArguments argsNode = delayedEvalBshMethod.getArgsNode();
            NameSpace nameSpace = new NameSpace(r17.getNameSpace(), "consArgs");
            String[] parameterNames = delayedEvalBshMethod.getParameterNames();
            Class<?>[] parameterTypes = delayedEvalBshMethod.getParameterTypes();
            for (int i10 = 0; i10 < objArr.length; i10++) {
                try {
                    nameSpace.setTypedVariable(parameterNames[i10], parameterTypes[i10], objArr[i10], (Modifiers) null);
                } catch (UtilEvalError e6) {
                    C0353j.m1306d("err setting local cons arg:", e6);
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
                } catch (EvalError e7) {
                    C0353j.m1306d("Error evaluating constructor args: ", e7);
                    return null;
                }
            }
            Class<?>[] types = Types.getTypes(constructorArgs);
            Object[] objArrUnwrap = Primitive.unwrap(constructorArgs);
            if (altConstructor.equals("super")) {
                int iFindMemberIndex = BshClassManager.memberCache.get(cls).findMemberIndex(cls.getName(), types);
                if (iFindMemberIndex != -1) {
                    return new ConstructorArgs(iFindMemberIndex, objArrUnwrap);
                }
                C0353j.m1308f("can't find super constructor for args!");
                return null;
            }
            int iFindMostSpecificBshMethodIndex = Reflect.findMostSpecificBshMethodIndex(types, Arrays.asList(delayedEvalBshMethodArr));
            if (iFindMostSpecificBshMethodIndex == -1) {
                C0353j.m1308f("can't find this constructor for args!");
                return null;
            }
            int iMemberCount = BshClassManager.memberCache.get(cls).memberCount(cls.getName());
            int i11 = iFindMostSpecificBshMethodIndex + iMemberCount;
            if (i11 != iMemberCount + i9) {
                return new ConstructorArgs(i11, objArrUnwrap);
            }
            C0353j.m1308f("Recursive constructor call.");
            return null;
        } catch (Exception e10) {
            C0353j.m1306d("Unable to get instance initializers: ", e10);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static This getThis(NameSpace nameSpace, Interpreter interpreter) {
        return new This(nameSpace, interpreter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static This initClassInstanceThis(Object obj, String str) {
        This classInstanceThis = Reflect.getClassInstanceThis(obj, str);
        if (classInstanceThis != null) {
            return classInstanceThis;
        }
        This classStaticThis = Reflect.getClassStaticThis(obj.getClass(), str);
        NameSpace nameSpaceCopy = classStaticThis.getNameSpace().copy();
        ThreadLocal<NameSpace> threadLocal = CONTEXT_NAMESPACE;
        if (threadLocal.get() != null) {
            nameSpaceCopy.setParent(threadLocal.get());
        }
        ThreadLocal<Interpreter> threadLocal2 = CONTEXT_INTERPRETER;
        This r2 = threadLocal2.get() != null ? nameSpaceCopy.getThis(threadLocal2.get()) : nameSpaceCopy.getThis(classStaticThis.declaringInterpreter);
        try {
            Reflect.getLHSObjectField(obj, Keys.BSHTHIS + str).assign(r2, false);
            nameSpaceCopy.setClassInstance(obj);
            try {
                BSHBlock bSHBlock = (BSHBlock) classStaticThis.getNameSpace().getVariable(Keys.BSHINIT.toString());
                try {
                    CallStack callStack = new CallStack(nameSpaceCopy);
                    Interpreter interpreter = r2.declaringInterpreter;
                    Boolean bool = Boolean.TRUE;
                    bSHBlock.evalBlock(callStack, interpreter, bool, ClassGenerator.ClassNodeFilter.CLASSINSTANCEMETHODS);
                    bSHBlock.evalBlock(new CallStack(nameSpaceCopy), r2.declaringInterpreter, bool, ClassGenerator.ClassNodeFilter.CLASSINSTANCEFIELDS);
                    return r2;
                } catch (Exception e6) {
                    C0353j.m1306d("Error in class instance This initialization: ", e6);
                    return null;
                }
            } catch (Exception e7) {
                C0353j.m1306d("unable to get instance initializer: ", e7);
                return null;
            }
        } catch (Exception e10) {
            C0353j.m1306d("Error in class gen setup: ", e10);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void initInstance(GeneratedClass generatedClass, String str, Object[] objArr) {
        try {
            This thisInitClassInstanceThis = initClassInstanceThis(generatedClass, str);
            NameSpace nameSpace = thisInitClassInstanceThis.getNameSpace();
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = generatedClass.getClass(); superclass != null && !superclass.getSimpleName().equals(str); superclass = superclass.getSuperclass()) {
                arrayList.add(0, superclass.getSimpleName());
            }
            arrayList.forEach(new C0076g(generatedClass, 5));
            if (nameSpace.isEnum) {
                ThreadLocal<Map<String, Object[]>> threadLocal = CONTEXT_ARGS;
                if (threadLocal.get().containsKey(generatedClass.toString())) {
                    objArr = threadLocal.get().remove(generatedClass.toString());
                }
            }
            BshMethod method = nameSpace.getMethod(Types.getBaseName(str), Types.getTypes(objArr), true);
            if (objArr.length > 0 && method == null) {
                throw new InterpreterError("Can't find constructor: " + StringUtil.methodString(str, objArr));
            }
            if (method != null) {
                method.invoke(objArr, thisInitClassInstanceThis.declaringInterpreter);
            }
            for (Variable variable : Reflect.getVariables(generatedClass)) {
                variable.validateFinalIsSet(false);
            }
        } catch (Exception e6) {
            e = e6;
            if (e instanceof TargetError) {
                e = (Exception) ((TargetError) e).getTarget();
            }
            if (e instanceof InvocationTargetException) {
                e = (Exception) e.getCause();
            }
            C0353j.m1306d("Error in class instance initialization: ", e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void initStatic(Class<?> cls) throws UtilEvalError {
        String simpleName = cls.getSimpleName();
        try {
            This classStaticThis = Reflect.getClassStaticThis(cls, simpleName);
            NameSpace nameSpace = classStaticThis.getNameSpace();
            Interpreter interpreter = classStaticThis.declaringInterpreter;
            if (interpreter == null) {
                throw new UtilEvalError("No namespace or interpreter for statitc This. Start interpreter for class not implemented yet.");
            }
            BSHBlock bSHBlock = (BSHBlock) nameSpace.getVariable(Keys.BSHINIT.toString());
            CallStack callStack = new CallStack(nameSpace);
            Boolean bool = Boolean.TRUE;
            bSHBlock.evalBlock(callStack, interpreter, bool, ClassGenerator.ClassNodeFilter.CLASSSTATICMETHODS);
            bSHBlock.evalBlock(callStack, interpreter, bool, ClassGenerator.ClassNodeFilter.CLASSSTATICFIELDS);
            for (Variable variable : Reflect.getVariables(nameSpace)) {
                variable.validateFinalIsSet(true);
            }
        } catch (Exception e6) {
            StringBuilder sbM1026o = AbstractC0255e.m1026o("Exception in static init block <clinit> for class ", simpleName, ". With message: ");
            sbM1026o.append(e6.getMessage());
            throw new UtilEvalError(sbM1026o.toString(), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isExposedThisMethod(String str) {
        return str.equals("invokeMethod") || str.equals("getInterface") || str.equals("wait") || str.equals("notify") || str.equals("notifyAll");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$static$1() {
        return new HashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static This pullBshStatic(String str) {
        Map<String, NameSpace> map = contextStore;
        return map.containsKey(str) ? map.remove(str).getThis(null) : getThis(null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object cloneMethodImpl(Node node, CallStack callStack, Object obj) throws EvalError {
        NameSpace nameSpace = new NameSpace(this.namespace.getParent(), this.namespace.getName() + " clone");
        if (obj == null) {
            try {
                Class<?> cls = this.namespace.classStatic;
                if (cls == null) {
                    return nameSpace.getThis(this.declaringInterpreter);
                }
                obj = cls.getConstructor(null).newInstance(null);
            } catch (UtilEvalError e6) {
                throw e6.toEvalError("Unable to assign clone instance This: " + e6.getMessage(), node, callStack);
            } catch (IllegalAccessException e7) {
                e = e7;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), node, callStack);
            } catch (IllegalArgumentException e10) {
                e = e10;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), node, callStack);
            } catch (InstantiationException e11) {
                e = e11;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), node, callStack);
            } catch (NoSuchMethodException e12) {
                e = e12;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), node, callStack);
            } catch (SecurityException e13) {
                e = e13;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), node, callStack);
            } catch (InvocationTargetException e14) {
                e = e14;
                throw new EvalError("Unable to clone from This reference: " + e.getMessage(), node, callStack);
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
            BshMethod bshMethodClone = bshMethod.m10910clone();
            bshMethodClone.declaringNameSpace = nameSpace2;
            nameSpace.setMethod(bshMethodClone);
        }
        Reflect.getLHSObjectField(obj, Keys.BSHTHIS + nameSpace.classStatic.getSimpleName()).assign(nameSpace.getThis(this.declaringInterpreter));
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object[] enumValues() {
        return Reflect.getEnumConstants(getNameSpace().classStatic);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getInterface(Class<?>[] clsArr) {
        if (this.interfaces == null) {
            this.interfaces = new HashMap();
        }
        int iHashCode = 21;
        for (Class<?> cls : clsArr) {
            iHashCode *= cls.hashCode() + 3;
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object obj = this.interfaces.get(numValueOf);
        if (obj != null) {
            return obj;
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(clsArr[0].getClassLoader(), clsArr, this.invocationHandler);
        this.interfaces.put(numValueOf, objNewProxyInstance);
        return objNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NameSpace getNameSpace() {
        return this.namespace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object invokeMethod(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, Node node, boolean z9) throws EvalException {
        if (objArr == null) {
            objArr = Reflect.ZERO_ARGS;
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
        if (node == null) {
            node = Node.JAVACODE;
        }
        Node node2 = node;
        Class<?>[] types = Types.getTypes(objArr2);
        BshMethod method = Reflect.getMethod(this.namespace, str, types, z9);
        if (method != null) {
            return method.invoke(objArr2, interpreter2, callStack2, node2);
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
            return cloneMethodImpl(node2, callStack2);
        }
        boolean[] zArr = new boolean[1];
        Object objInvokeDefaultInvokeMethod = this.namespace.invokeDefaultInvokeMethod(str, objArr2, interpreter2, callStack2, node2, zArr);
        if (zArr[0]) {
            return objInvokeDefaultInvokeMethod;
        }
        try {
            return this.namespace.invokeCommand(str, objArr2, interpreter2, callStack2, node2, true);
        } catch (EvalError e6) {
            throw new EvalException("Method " + StringUtil.methodString(str, types) + " not found in bsh scripted object: " + this.namespace.getName(), node2, callStack2, e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public void run() {
        try {
            invokeMethod("run", Reflect.ZERO_ARGS);
        } catch (EvalError e6) {
            this.declaringInterpreter.error("Exception in runnable:" + e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        BshMethod method = Reflect.getMethod(this.namespace, "toString", (Class<?>[]) new Class[0]);
        if (method != null) {
            try {
                return (String) method.invoke(new Object[0], this.declaringInterpreter);
            } catch (EvalError unused) {
            }
        }
        return "'this' reference to Bsh object: " + this.namespace;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Keys {
        public static final Keys BSHSTATIC = new C03311();
        public static final Keys BSHTHIS = new C03322();
        public static final Keys BSHSUPER = new C03333();
        public static final Keys BSHINIT = new C03344();
        public static final Keys BSHCONSTRUCTORS = new C03355();
        public static final Keys BSHCLASSMODIFIERS = new C03366();
        public static final Keys BSHEXTENSIONMETHODRECEIVER = new C03377();
        private static final /* synthetic */ Keys[] $VALUES = $values();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static /* synthetic */ Keys[] $values() {
            return new Keys[]{BSHSTATIC, BSHTHIS, BSHSUPER, BSHINIT, BSHCONSTRUCTORS, BSHCLASSMODIFIERS, BSHEXTENSIONMETHODRECEIVER};
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int) A[MD:(java.lang.String, int):void (m)] (LINE:1) call: bsh.This.Keys.<init>(java.lang.String, int):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Keys(String str, int i9, int i10) {
            this(str, i9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static Keys valueOf(String str) {
            return (Keys) Enum.valueOf(Keys.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static Keys[] values() {
            return (Keys[]) $VALUES.clone();
        }

        private Keys(String str, int i9) {
        }

        /* JADX INFO: renamed from: bsh.This$Keys$1 */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum C03311 extends Keys {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR ("BSHSTATIC"), (0 int) A[MD:(java.lang.String, int):void (m)] (LINE:4) call: bsh.This.Keys.1.<init>(java.lang.String, int):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C03311() {
                this("BSHSTATIC", 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Enum
            public String toString() {
                return "_bshStatic";
            }

            private C03311(String str, int i9) {
                super(str, i9, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$2 */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum C03322 extends Keys {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR ("BSHTHIS"), (1 int) A[MD:(java.lang.String, int):void (m)] (LINE:4) call: bsh.This.Keys.2.<init>(java.lang.String, int):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C03322() {
                this("BSHTHIS", 1);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Enum
            public String toString() {
                return "_bshThis";
            }

            private C03322(String str, int i9) {
                super(str, i9, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$3 */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum C03333 extends Keys {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR ("BSHSUPER"), (2 int) A[MD:(java.lang.String, int):void (m)] (LINE:4) call: bsh.This.Keys.3.<init>(java.lang.String, int):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C03333() {
                this("BSHSUPER", 2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Enum
            public String toString() {
                return "_bshSuper";
            }

            private C03333(String str, int i9) {
                super(str, i9, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$4 */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum C03344 extends Keys {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR ("BSHINIT"), (3 int) A[MD:(java.lang.String, int):void (m)] (LINE:4) call: bsh.This.Keys.4.<init>(java.lang.String, int):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C03344() {
                this("BSHINIT", 3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Enum
            public String toString() {
                return "_bshInstanceInitializer";
            }

            private C03344(String str, int i9) {
                super(str, i9, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$5 */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum C03355 extends Keys {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR ("BSHCONSTRUCTORS"), (4 int) A[MD:(java.lang.String, int):void (m)] (LINE:4) call: bsh.This.Keys.5.<init>(java.lang.String, int):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C03355() {
                this("BSHCONSTRUCTORS", 4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Enum
            public String toString() {
                return "_bshConstructors";
            }

            private C03355(String str, int i9) {
                super(str, i9, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$6 */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum C03366 extends Keys {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR ("BSHCLASSMODIFIERS"), (5 int) A[MD:(java.lang.String, int):void (m)] (LINE:4) call: bsh.This.Keys.6.<init>(java.lang.String, int):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C03366() {
                this("BSHCLASSMODIFIERS", 5);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Enum
            public String toString() {
                return "_bshClassModifiers";
            }

            private C03366(String str, int i9) {
                super(str, i9, 0);
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$7 */
        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum C03377 extends Keys {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR ("BSHEXTENSIONMETHODRECEIVER"), (6 int) A[MD:(java.lang.String, int):void (m)] (LINE:4) call: bsh.This.Keys.7.<init>(java.lang.String, int):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C03377() {
                this("BSHEXTENSIONMETHODRECEIVER", 6);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Enum
            public String toString() {
                return "_bshExtensionMethodReceiver";
            }

            private C03377(String str, int i9) {
                super(str, i9, 0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ConstructorArgs {
        public static final ConstructorArgs DEFAULT = new ConstructorArgs();
        int arg;
        Object[] args;
        public int selector;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ConstructorArgs(int i9, Object[] objArr) {
            this.selector = i9;
            this.args = objArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean getBoolean() {
            return ((Boolean) next()).booleanValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public byte getByte() {
            return ((Number) next()).byteValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public char getChar() {
            return ((Character) next()).charValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public double getDouble() {
            return ((Number) next()).doubleValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public float getFloat() {
            return ((Number) next()).floatValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int getInt() {
            return ((Number) next()).intValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public long getLong() {
            return ((Number) next()).longValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Object getObject() {
            return next();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public short getShort() {
            return ((Number) next()).shortValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Object next() {
            Object[] objArr = this.args;
            int i9 = this.arg;
            this.arg = i9 + 1;
            return objArr[i9];
        }

        public ConstructorArgs() {
            this.selector = -1;
        }
    }

    public Object getInterface(Class<?> cls) {
        return getInterface(new Class[]{cls});
    }

    public Object invokeMethod(String str, Object[] objArr, boolean z9) throws EvalException {
        CallStack callStack = new CallStack(this.namespace);
        Node node = this.namespace.getNode();
        this.namespace.setNode(null);
        try {
            Object objInvokeMethod = invokeMethod(str, objArr, this.declaringInterpreter, callStack, node, z9);
            return (!(objInvokeMethod instanceof Primitive) || objInvokeMethod == Primitive.VOID) ? objInvokeMethod : ((Primitive) objInvokeMethod).getValue();
        } catch (Exception e6) {
            throw new EvalException(e6.getMessage(), node, callStack, e6);
        }
    }

    public Object invokeMethod(String str, Object[] objArr) {
        return invokeMethod(str, objArr, null, null, null, false);
    }

    public Object cloneMethodImpl(Node node, CallStack callStack) {
        return cloneMethodImpl(node, callStack, null);
    }
}
