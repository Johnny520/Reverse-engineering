package bsh;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: bsh.a1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1128a1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1188h3 f3438a;

    /* JADX INFO: renamed from: b */
    public final RunnableC1205k2 f3439b;

    /* JADX INFO: renamed from: bsh.a1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC1128a1 {

        /* JADX INFO: renamed from: c */
        public final C1182g3 f3440c;

        /* JADX INFO: renamed from: d */
        public final String[] f3441d;

        /* JADX INFO: renamed from: e */
        public final InterfaceC1188h3 f3442e;

        public a(InterfaceC1188h3 interfaceC1188h3, C1182g3 c1182g3, C1283x2[] c1283x2Arr, Class[] clsArr, String[] strArr, InterfaceC1188h3 interfaceC1188h32, RunnableC1205k2 runnableC1205k2) {
            super(interfaceC1188h3, runnableC1205k2);
            this.f3440c = c1182g3;
            this.f3441d = strArr;
            this.f3442e = interfaceC1188h32;
        }

        @Override // bsh.AbstractC1128a1
        /* JADX INFO: renamed from: g */
        public Object mo4062g(Object[] objArr) {
            C1182g3 c1182g3 = new C1182g3(this.f3440c, "LambdaContext");
            int i10 = 0;
            while (true) {
                String[] strArr = this.f3441d;
                if (i10 >= strArr.length) {
                    break;
                }
                if (i10 < objArr.length) {
                    c1182g3.m4399u0(strArr[i10], objArr[i10], false);
                }
                i10++;
            }
            Object objMo4048p = this.f3442e.mo4048p(new C1174f1(c1182g3), this.f3439b);
            return objMo4048p instanceof C1171e4 ? ((C1171e4) objMo4048p).f3543s : objMo4048p;
        }
    }

    /* JADX INFO: renamed from: bsh.a1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b extends AbstractC1128a1 {

        /* JADX INFO: renamed from: c */
        public final Object f3443c;

        /* JADX INFO: renamed from: d */
        public final String f3444d;

        public b(InterfaceC1188h3 interfaceC1188h3, Object obj, String str, RunnableC1205k2 runnableC1205k2) {
            super(interfaceC1188h3, runnableC1205k2);
            this.f3443c = obj;
            this.f3444d = str;
        }

        @Override // bsh.AbstractC1128a1
        /* JADX INFO: renamed from: g */
        public Object mo4062g(Object[] objArr) {
            return AbstractC1143c4.m4170g0(this.f3443c, this.f3444d, objArr, this.f3439b, new C1174f1(), this.f3438a);
        }
    }

    public AbstractC1128a1(InterfaceC1188h3 interfaceC1188h3, RunnableC1205k2 runnableC1205k2) {
        this.f3438a = interfaceC1188h3;
        this.f3439b = runnableC1205k2;
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC1128a1 m4056d(InterfaceC1188h3 interfaceC1188h3, C1182g3 c1182g3, C1283x2[] c1283x2Arr, Class[] clsArr, String[] strArr, InterfaceC1188h3 interfaceC1188h32, RunnableC1205k2 runnableC1205k2) {
        return new a(interfaceC1188h3, c1182g3, c1283x2Arr, clsArr, strArr, interfaceC1188h32, runnableC1205k2);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC1128a1 m4057e(InterfaceC1188h3 interfaceC1188h3, Object obj, String str, RunnableC1205k2 runnableC1205k2) {
        return new b(interfaceC1188h3, obj, str, runnableC1205k2);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m4058h(Class cls, Class cls2, int i10) {
        return AbstractC1273v4.m5148r(cls2);
    }

    /* JADX INFO: renamed from: b */
    public final Object m4059b(Object obj, Class cls) {
        Class cls2 = Void.TYPE;
        if (cls == cls2 || cls == cls2) {
            return null;
        }
        Object objUnwrap = Primitive.unwrap(obj);
        if (objUnwrap != null) {
            return Primitive.unwrap(AbstractC1273v4.m5138h(objUnwrap, cls, 1));
        }
        if (cls.isPrimitive()) {
            return Primitive.unwrap(Primitive.getDefaultValue(cls));
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public Object m4060c(Class cls) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: bsh.z0
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return this.f3894q.m4063i(obj, method, objArr);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final Object m4061f(Object obj, Method method, Object[] objArr) throws NoSuchMethodException {
        Class<?> declaringClass = method.getDeclaringClass();
        try {
            return MethodHandles.lookup().findSpecial(declaringClass, method.getName(), MethodType.methodType(method.getReturnType(), method.getParameterTypes()), declaringClass).bindTo(obj).invokeWithArguments(objArr);
        } catch (IllegalAccessException unused) {
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(declaringClass, 2)).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo4062g(Object[] objArr);

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object m4063i(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getDeclaringClass() == Object.class) {
            String name = method.getName();
            name.getClass();
            switch (name) {
                case "toString":
                    return "BshLambdaProxy[" + this + "]";
                case "equals":
                    return Boolean.valueOf(obj == objArr[0]);
                case "hashCode":
                    return Integer.valueOf(System.identityHashCode(obj));
            }
        }
        if (method.isDefault()) {
            return m4061f(obj, method, objArr);
        }
        if (objArr == null) {
            try {
                objArr = AbstractC1143c4.f3483a;
            } catch (C1231o4 e10) {
                throw e10.m4995g();
            } catch (Throwable th) {
                throw new C1177f4("Lambda execution error: " + th.getMessage(), this.f3438a, null, th);
            }
        }
        return m4059b(mo4062g(objArr), method.getReturnType());
    }
}
