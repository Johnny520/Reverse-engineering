package bsh;

import bsh.C1186h1;
import bsh.C1281x0;
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
import java.util.function.Consumer;
import java.util.function.Supplier;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class This implements Serializable, Runnable {
    transient RunnableC1205k2 declaringInterpreter;
    private Map<Integer, Object> interfaces;
    private final InvocationHandler invocationHandler = new Handler();
    final C1182g3 namespace;
    public static final Map<String, C1182g3> contextStore = new ConcurrentHashMap();
    private static final ThreadLocal<C1182g3> CONTEXT_NAMESPACE = new ThreadLocal<>();
    private static final ThreadLocal<RunnableC1205k2> CONTEXT_INTERPRETER = new ThreadLocal<>();
    static final ThreadLocal<Map<String, Object[]>> CONTEXT_ARGS = ThreadLocal.withInitial(new Supplier() { // from class: bsh.q4
        @Override // java.util.function.Supplier
        public final Object get() {
            return This.m4021b();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class Handler implements InvocationHandler, Serializable {
        public Handler() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return invokeImpl(obj, method, objArr);
            } catch (C1231o4 e10) {
                System.err.println("[BeanShell] TargetError in scripted interface: " + e10);
                return null;
            } catch (C1163d2 e11) {
                System.err.println("[BeanShell] EvalError in scripted interface: " + e11);
                return null;
            }
        }

        public Object invokeImpl(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            C1168e1 c1168e1M4135E = AbstractC1143c4.m4135E(This.this.namespace, "equals", new Class[]{Object.class});
            if (name.equals("equals") && c1168e1M4135E == null) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            C1168e1 c1168e1M4135E2 = AbstractC1143c4.m4135E(This.this.namespace, "toString", new Class[0]);
            if (!name.equals("toString") || c1168e1M4135E2 != null) {
                return Primitive.unwrap(This.this.invokeMethod(name, Primitive.wrap(objArr, method.getParameterTypes())));
            }
            Class<?>[] interfaces = obj.getClass().getInterfaces();
            StringBuilder sb2 = new StringBuilder(This.this.toString() + "\nimplements:");
            for (Class<?> cls : interfaces) {
                StringBuilder sb3 = new StringBuilder(" ");
                sb3.append(cls.getName());
                sb3.append(interfaces.length > 1 ? "," : _UrlKt.FRAGMENT_ENCODE_SET);
                sb2.append(sb3.toString());
            }
            return sb2.toString();
        }
    }

    public This(C1182g3 c1182g3, RunnableC1205k2 runnableC1205k2) {
        this.namespace = c1182g3;
        this.declaringInterpreter = runnableC1205k2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Map m4021b() {
        return new HashMap();
    }

    public static void bind(This r12, C1182g3 c1182g3, RunnableC1205k2 runnableC1205k2) {
        r12.namespace.m4391q0(c1182g3);
        r12.declaringInterpreter = runnableC1205k2;
    }

    public static ConstructorArgs getConstructorArgs(Class<?> cls, This r17, Object[] objArr, int i10) {
        if (r17 == null) {
            throw new C1211l2("Unititialized class: no static");
        }
        if (i10 == -1) {
            return ConstructorArgs.DEFAULT;
        }
        try {
            Object objM4352N = r17.getNameSpace().m4352N(Keys.BSHCONSTRUCTORS.toString());
            if (objM4352N == Primitive.VOID) {
                throw new C1211l2("Unable to find constructors array in class");
            }
            C1141c2[] c1141c2Arr = (C1141c2[]) objM4352N;
            C1141c2 c1141c2 = c1141c2Arr[i10];
            String strM4125t = c1141c2.m4125t();
            if (strM4125t == null) {
                return ConstructorArgs.DEFAULT;
            }
            C1160d c1160dM4126u = c1141c2.m4126u();
            C1182g3 c1182g3 = new C1182g3(r17.getNameSpace(), "consArgs");
            String[] strArrM4288j = c1141c2.m4288j();
            Class[] clsArrMo4123k = c1141c2.mo4123k();
            for (int i11 = 0; i11 < objArr.length; i11++) {
                try {
                    c1182g3.m4393r0(strArrM4288j[i11], clsArrMo4123k[i11], objArr[i11], null);
                } catch (C1279w4 e10) {
                    C1237p4.m5045a("err setting local cons arg:", e10);
                    return null;
                }
            }
            C1174f1 c1174f1 = new C1174f1();
            c1174f1.m4317f(c1182g3);
            Object[] objArrM4127v = c1141c2.m4127v();
            RunnableC1205k2 runnableC1205k2 = r17.declaringInterpreter;
            if (c1160dM4126u != null) {
                try {
                    objArrM4127v = c1160dM4126u.m4269k(c1174f1, runnableC1205k2);
                } catch (C1163d2 e11) {
                    C1237p4.m5045a("Error evaluating constructor args: ", e11);
                    return null;
                }
            }
            Class[] clsArrM5143m = AbstractC1273v4.m5143m(objArrM4127v);
            Object[] objArrUnwrap = Primitive.unwrap(objArrM4127v);
            if (strM4125t.equals("super")) {
                int iM5182g = ((C1281x0.b) C1281x0.memberCache.m38264c(cls)).m5182g(cls.getName(), clsArrM5143m);
                if (iM5182g != -1) {
                    return new ConstructorArgs(iM5182g, objArrUnwrap);
                }
                throw new C1211l2("can't find super constructor for args!");
            }
            int iM4187p = AbstractC1143c4.m4187p(clsArrM5143m, Arrays.asList(c1141c2Arr));
            if (iM4187p == -1) {
                throw new C1211l2("can't find this constructor for args!");
            }
            int iM5189n = ((C1281x0.b) C1281x0.memberCache.m38264c(cls)).m5189n(cls.getName());
            int i12 = iM4187p + iM5189n;
            if (i12 != iM5189n + i10) {
                return new ConstructorArgs(i12, objArrUnwrap);
            }
            throw new C1211l2("Recursive constructor call.");
        } catch (Exception e12) {
            C1237p4.m5045a("Unable to get instance initializers: ", e12);
            return null;
        }
    }

    public static This getThis(C1182g3 c1182g3, RunnableC1205k2 runnableC1205k2) {
        return new This(c1182g3, runnableC1205k2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static This initClassInstanceThis(Object obj, String str) {
        This thisM4195t = AbstractC1143c4.m4195t(obj, str);
        if (thisM4195t != null) {
            return thisM4195t;
        }
        This thisM4199v = AbstractC1143c4.m4199v(obj.getClass(), str);
        C1182g3 c1182g3M4384n = thisM4199v.getNameSpace().m4384n();
        ThreadLocal<C1182g3> threadLocal = CONTEXT_NAMESPACE;
        if (threadLocal.get() != null) {
            c1182g3M4384n.m4391q0(threadLocal.get());
        }
        ThreadLocal<RunnableC1205k2> threadLocal2 = CONTEXT_INTERPRETER;
        This thisMo4351M = threadLocal2.get() != null ? c1182g3M4384n.mo4351M(threadLocal2.get()) : c1182g3M4384n.mo4351M(thisM4199v.declaringInterpreter);
        try {
            AbstractC1143c4.m4133C(obj, Keys.BSHTHIS + str).m5099b(thisMo4351M, false);
            c1182g3M4384n.m4373h0(obj);
            try {
                C1196j c1196j = (C1196j) thisM4199v.getNameSpace().m4352N(Keys.BSHINIT.toString());
                try {
                    C1174f1 c1174f1 = new C1174f1(c1182g3M4384n);
                    RunnableC1205k2 runnableC1205k2 = thisMo4351M.declaringInterpreter;
                    Boolean bool = Boolean.TRUE;
                    c1196j.m4440l(c1174f1, runnableC1205k2, bool, C1186h1.a.f3596f);
                    c1196j.m4440l(new C1174f1(c1182g3M4384n), thisMo4351M.declaringInterpreter, bool, C1186h1.a.f3595e);
                    return thisMo4351M;
                } catch (Exception e10) {
                    C1237p4.m5045a("Error in class instance This initialization: ", e10);
                    return null;
                }
            } catch (Exception e11) {
                C1237p4.m5045a("unable to get instance initializer: ", e11);
                return null;
            }
        } catch (Exception e12) {
            C1237p4.m5045a("Error in class gen setup: ", e12);
            return null;
        }
    }

    public static void initInstance(final GeneratedClass generatedClass, String str, Object[] objArr) {
        try {
            This thisInitClassInstanceThis = initClassInstanceThis(generatedClass, str);
            C1182g3 nameSpace = thisInitClassInstanceThis.getNameSpace();
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = generatedClass.getClass(); superclass != null && !superclass.getSimpleName().equals(str); superclass = superclass.getSuperclass()) {
                arrayList.add(0, superclass.getSimpleName());
            }
            arrayList.forEach(new Consumer() { // from class: bsh.r4
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    This.initClassInstanceThis(generatedClass, (String) obj);
                }
            });
            if (nameSpace.f3572I) {
                ThreadLocal<Map<String, Object[]>> threadLocal = CONTEXT_ARGS;
                if (threadLocal.get().containsKey(generatedClass.toString())) {
                    objArr = threadLocal.get().remove(generatedClass.toString());
                }
            }
            C1168e1 c1168e1M4342D = nameSpace.m4342D(AbstractC1273v4.m5139i(str), AbstractC1273v4.m5143m(objArr), true);
            if (objArr.length > 0 && c1168e1M4342D == null) {
                throw new C1211l2("Can't find constructor: " + AbstractC1225n4.m4978q(str, objArr));
            }
            if (c1168e1M4342D != null) {
                c1168e1M4342D.m4290n(objArr, thisInitClassInstanceThis.declaringInterpreter);
            }
            for (C1291y4 c1291y4 : AbstractC1143c4.m4158a0(generatedClass)) {
                c1291y4.m5230l(false);
            }
        } catch (Exception e10) {
            e = e10;
            if (e instanceof C1231o4) {
                e = (Exception) ((C1231o4) e).m4995g();
            }
            if (e instanceof InvocationTargetException) {
                e = (Exception) e.getCause();
            }
            C1237p4.m5045a("Error in class instance initialization: ", e);
        }
    }

    public static void initStatic(Class<?> cls) throws C1279w4 {
        String simpleName = cls.getSimpleName();
        try {
            This thisM4199v = AbstractC1143c4.m4199v(cls, simpleName);
            C1182g3 nameSpace = thisM4199v.getNameSpace();
            RunnableC1205k2 runnableC1205k2 = thisM4199v.declaringInterpreter;
            if (runnableC1205k2 == null) {
                throw new C1279w4("No namespace or interpreter for statitc This. Start interpreter for class not implemented yet.");
            }
            C1196j c1196j = (C1196j) nameSpace.m4352N(Keys.BSHINIT.toString());
            C1174f1 c1174f1 = new C1174f1(nameSpace);
            Boolean bool = Boolean.TRUE;
            c1196j.m4440l(c1174f1, runnableC1205k2, bool, C1186h1.a.f3594d);
            c1196j.m4440l(c1174f1, runnableC1205k2, bool, C1186h1.a.f3593c);
            for (C1291y4 c1291y4 : AbstractC1143c4.m4154X(nameSpace)) {
                c1291y4.m5230l(true);
            }
        } catch (Exception e10) {
            throw new C1279w4("Exception in static init block <clinit> for class " + simpleName + ". With message: " + e10.getMessage(), e10);
        }
    }

    public static boolean isExposedThisMethod(String str) {
        return str.equals("invokeMethod") || str.equals("getInterface") || str.equals("wait") || str.equals("notify") || str.equals("notifyAll");
    }

    public static This pullBshStatic(String str) {
        Map<String, C1182g3> map = contextStore;
        return map.containsKey(str) ? map.remove(str).mo4351M(null) : getThis(null, null);
    }

    public static void registerConstructorContext(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        if (c1174f1 != null) {
            CONTEXT_NAMESPACE.set(c1174f1.m4319h());
        } else {
            CONTEXT_NAMESPACE.remove();
        }
        if (runnableC1205k2 != null) {
            CONTEXT_INTERPRETER.set(runnableC1205k2);
        } else {
            CONTEXT_INTERPRETER.remove();
        }
    }

    public Object cloneMethodImpl(InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1, Object obj) throws C1163d2 {
        C1182g3 c1182g3 = new C1182g3(this.namespace.m4348J(), this.namespace.getName() + " clone");
        if (obj == null) {
            try {
                Class cls = this.namespace.f3573J;
                if (cls == null) {
                    return c1182g3.mo4351M(this.declaringInterpreter);
                }
                obj = cls.getConstructor(null).newInstance(null);
            } catch (C1279w4 e10) {
                throw e10.mo5168b("Unable to assign clone instance This: " + e10.getMessage(), interfaceC1188h3, c1174f1);
            } catch (IllegalAccessException e11) {
                e = e11;
                throw new C1163d2("Unable to clone from This reference: " + e.getMessage(), interfaceC1188h3, c1174f1);
            } catch (IllegalArgumentException e12) {
                e = e12;
                throw new C1163d2("Unable to clone from This reference: " + e.getMessage(), interfaceC1188h3, c1174f1);
            } catch (InstantiationException e13) {
                e = e13;
                throw new C1163d2("Unable to clone from This reference: " + e.getMessage(), interfaceC1188h3, c1174f1);
            } catch (NoSuchMethodException e14) {
                e = e14;
                throw new C1163d2("Unable to clone from This reference: " + e.getMessage(), interfaceC1188h3, c1174f1);
            } catch (SecurityException e15) {
                e = e15;
                throw new C1163d2("Unable to clone from This reference: " + e.getMessage(), interfaceC1188h3, c1174f1);
            } catch (InvocationTargetException e16) {
                e = e16;
                throw new C1163d2("Unable to clone from This reference: " + e.getMessage(), interfaceC1188h3, c1174f1);
            }
        }
        c1182g3.m4373h0(obj);
        c1182g3.m4377j0(this.namespace.f3573J);
        c1182g3.f3570G = true;
        c1182g3.f3569F = true;
        for (C1291y4 c1291y4 : this.namespace.m4357S()) {
            c1182g3.m4401v0(c1291y4);
        }
        C1182g3 c1182g32 = new C1182g3(c1182g3, null);
        c1182g32.m4373h0(obj);
        c1182g32.m4377j0(c1182g3.f3573J);
        c1182g32.f3570G = true;
        c1182g32.f3569F = true;
        for (C1168e1 c1168e1 : this.namespace.m4344F()) {
            C1168e1 c1168e1M4284d = c1168e1.clone();
            c1168e1M4284d.f3531q = c1182g32;
            c1182g3.mo4383m0(c1168e1M4284d);
        }
        AbstractC1143c4.m4133C(obj, Keys.BSHTHIS + c1182g3.f3573J.getSimpleName()).m5098a(c1182g3.mo4351M(this.declaringInterpreter));
        return obj;
    }

    public Object[] enumValues() {
        return AbstractC1143c4.m4130A(getNameSpace().f3573J);
    }

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

    public C1182g3 getNameSpace() {
        return this.namespace;
    }

    public Object invokeMethod(String str, Object[] objArr, RunnableC1205k2 runnableC1205k2, C1174f1 c1174f1, InterfaceC1188h3 interfaceC1188h3, boolean z10) throws C1163d2 {
        if (objArr == null) {
            objArr = AbstractC1143c4.f3483a;
        }
        Object[] objArr2 = objArr;
        if (runnableC1205k2 == null) {
            runnableC1205k2 = this.declaringInterpreter;
        }
        RunnableC1205k2 runnableC1205k22 = runnableC1205k2;
        if (runnableC1205k22.m4496q() == null) {
            runnableC1205k22.m4474J(this.namespace);
        }
        if (c1174f1 == null) {
            c1174f1 = new C1174f1(this.namespace);
        }
        C1174f1 c1174f12 = c1174f1;
        if (interfaceC1188h3 == null) {
            interfaceC1188h3 = InterfaceC1188h3.f3612c;
        }
        InterfaceC1188h3 interfaceC1188h32 = interfaceC1188h3;
        Class[] clsArrM5143m = AbstractC1273v4.m5143m(objArr2);
        C1168e1 c1168e1M4136F = AbstractC1143c4.m4136F(this.namespace, str, clsArrM5143m, z10);
        if (c1168e1M4136F != null) {
            return c1168e1M4136F.m4291o(objArr2, runnableC1205k22, c1174f12, interfaceC1188h32);
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
            return cloneMethodImpl(interfaceC1188h32, c1174f12);
        }
        boolean[] zArr = new boolean[1];
        Object objM4365a0 = this.namespace.m4365a0(str, objArr2, runnableC1205k22, c1174f12, interfaceC1188h32, zArr);
        if (zArr[0]) {
            return objM4365a0;
        }
        try {
            return this.namespace.m4364Z(str, objArr2, runnableC1205k22, c1174f12, interfaceC1188h32, true);
        } catch (C1163d2 e10) {
            throw new C1169e2("Method " + AbstractC1225n4.m4976o(str, clsArrM5143m) + " not found in bsh scripted object: " + this.namespace.getName(), interfaceC1188h32, c1174f12, e10);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            invokeMethod("run", AbstractC1143c4.f3483a);
        } catch (C1163d2 e10) {
            this.declaringInterpreter.m4485f("Exception in runnable:" + e10);
        }
    }

    public String toString() {
        C1168e1 c1168e1M4135E = AbstractC1143c4.m4135E(this.namespace, "toString", new Class[0]);
        if (c1168e1M4135E != null) {
            try {
                return (String) c1168e1M4135E.m4290n(new Object[0], this.declaringInterpreter);
            } catch (C1163d2 unused) {
            }
        }
        return "'this' reference to Bsh object: " + this.namespace;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class Keys {
        private static final /* synthetic */ Keys[] $VALUES = $values();
        public static final Keys BSHCLASSMODIFIERS;
        public static final Keys BSHCONSTRUCTORS;
        public static final Keys BSHINIT;
        public static final Keys BSHSTATIC;
        public static final Keys BSHSUPER;
        public static final Keys BSHTHIS;

        /* JADX INFO: renamed from: bsh.This$Keys$1 */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public enum C11201 extends Keys {
            private C11201(String str, int i10) {
                super(str, i10);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshStatic";
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$2 */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public enum C11212 extends Keys {
            private C11212(String str, int i10) {
                super(str, i10);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshThis";
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$3 */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public enum C11223 extends Keys {
            private C11223(String str, int i10) {
                super(str, i10);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshSuper";
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$4 */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public enum C11234 extends Keys {
            private C11234(String str, int i10) {
                super(str, i10);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshInstanceInitializer";
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$5 */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public enum C11245 extends Keys {
            private C11245(String str, int i10) {
                super(str, i10);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshConstructors";
            }
        }

        /* JADX INFO: renamed from: bsh.This$Keys$6 */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public enum C11256 extends Keys {
            private C11256(String str, int i10) {
                super(str, i10);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "_bshClassModifiers";
            }
        }

        private static /* synthetic */ Keys[] $values() {
            return new Keys[]{BSHSTATIC, BSHTHIS, BSHSUPER, BSHINIT, BSHCONSTRUCTORS, BSHCLASSMODIFIERS};
        }

        static {
            BSHSTATIC = new C11201("BSHSTATIC", 0);
            BSHTHIS = new C11212("BSHTHIS", 1);
            BSHSUPER = new C11223("BSHSUPER", 2);
            BSHINIT = new C11234("BSHINIT", 3);
            BSHCONSTRUCTORS = new C11245("BSHCONSTRUCTORS", 4);
            BSHCLASSMODIFIERS = new C11256("BSHCLASSMODIFIERS", 5);
        }

        public static Keys valueOf(String str) {
            return (Keys) Enum.valueOf(Keys.class, str);
        }

        public static Keys[] values() {
            return (Keys[]) $VALUES.clone();
        }

        private Keys(String str, int i10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class ConstructorArgs {
        public static final ConstructorArgs DEFAULT = new ConstructorArgs();
        int arg;
        Object[] args;
        public int selector;

        public ConstructorArgs(int i10, Object[] objArr) {
            this.selector = i10;
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
            int i10 = this.arg;
            this.arg = i10 + 1;
            return objArr[i10];
        }

        public ConstructorArgs() {
            this.selector = -1;
        }
    }

    public Object getInterface(Class<?> cls) {
        return getInterface(new Class[]{cls});
    }

    public Object invokeMethod(String str, Object[] objArr, boolean z10) throws C1169e2 {
        C1174f1 c1174f1 = new C1174f1(this.namespace);
        InterfaceC1188h3 interfaceC1188h3M4346H = this.namespace.m4346H();
        this.namespace.m4387o0(null);
        try {
            Object objInvokeMethod = invokeMethod(str, objArr, this.declaringInterpreter, c1174f1, interfaceC1188h3M4346H, z10);
            return (!(objInvokeMethod instanceof Primitive) || objInvokeMethod == Primitive.VOID) ? objInvokeMethod : ((Primitive) objInvokeMethod).getValue();
        } catch (Exception e10) {
            throw new C1169e2(e10.getMessage(), interfaceC1188h3M4346H, c1174f1, e10);
        }
    }

    public Object invokeMethod(String str, Object[] objArr) {
        return invokeMethod(str, objArr, null, null, null, false);
    }

    public Object cloneMethodImpl(InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1) {
        return cloneMethodImpl(interfaceC1188h3, c1174f1, null);
    }
}
