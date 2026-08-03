package p000;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: iG */
/* JADX INFO: loaded from: classes.dex */
public final class C1538iG {

    /* JADX INFO: renamed from: a */
    public final Object f5419a;

    /* JADX INFO: renamed from: b */
    public final Class f5420b;

    /* JADX INFO: renamed from: c */
    public final Method f5421c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1416fj f5422d;

    /* JADX INFO: renamed from: e */
    public C0352I7 f5423e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1416fj f5424f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1416fj f5425g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1416fj f5426h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1416fj f5427i;

    public C1538iG(Object obj) {
        if (obj != null) {
            if (obj instanceof Class) {
                this.f5420b = (Class) obj;
            } else if (obj instanceof Method) {
                this.f5421c = (Method) obj;
            } else {
                this.f5420b = obj.getClass();
                this.f5419a = obj;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2916a(InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-576290121840693L);
        this.f5427i = interfaceC1416fj;
        m2925j();
    }

    /* JADX INFO: renamed from: b */
    public final void m2917b(InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-576251467135029L);
        this.f5426h = interfaceC1416fj;
        m2925j();
    }

    /* JADX INFO: renamed from: c */
    public final Object m2918c(Object obj, Object... objArr) {
        AbstractC0295Gu.m625r(-577076100855861L);
        Method methodM2920e = m2920e();
        if (methodM2920e == null) {
            return null;
        }
        if (obj == null) {
            try {
                obj = this.f5419a;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return methodM2920e.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: d */
    public final Object m2919d(Object... objArr) {
        AbstractC0295Gu.m625r(-577097575692341L);
        Method methodM2920e = m2920e();
        if (methodM2920e != null) {
            try {
                return methodM2920e.invoke(null, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final Method m2920e() {
        Method method = null;
        Class cls = this.f5420b;
        if (cls == null) {
            return null;
        }
        InterfaceC1416fj interfaceC1416fj = this.f5422d;
        C0352I7 c0352i7 = this.f5423e;
        InterfaceC1416fj interfaceC1416fj2 = this.f5424f;
        InterfaceC1416fj interfaceC1416fj3 = this.f5425g;
        Method[] declaredMethods = cls.getDeclaredMethods();
        int i = 0;
        while (i < declaredMethods.length) {
            int i2 = i + 1;
            try {
                Method method2 = declaredMethods[i];
                if (c0352i7 != null) {
                    Class<?> returnType = method2.getReturnType();
                    AbstractC0295Gu.m625r(-577119050528821L);
                    if (!((Boolean) c0352i7.mo90g(returnType)).booleanValue()) {
                        continue;
                    }
                    i = i2;
                }
                if (interfaceC1416fj == null || ((Boolean) interfaceC1416fj.mo90g(Integer.valueOf(method2.getModifiers()))).booleanValue()) {
                    if (interfaceC1416fj2 != null) {
                        String name = method2.getName();
                        AbstractC0295Gu.m625r(-577200654907445L);
                        if (!((Boolean) interfaceC1416fj2.mo90g(name)).booleanValue()) {
                            continue;
                        }
                    }
                    if (interfaceC1416fj3 == null) {
                        method2.setAccessible(true);
                    } else {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        AbstractC0295Gu.m625r(-576706733668405L);
                        if (((Boolean) interfaceC1416fj3.mo90g(parameterTypes)).booleanValue()) {
                            method2.setAccessible(true);
                        }
                    }
                    method = method2;
                    break;
                }
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
        if (method != null) {
            return method;
        }
        throw new NullPointerException(AbstractC0295Gu.m625r(-576663783995445L) + cls + AbstractC0295Gu.m625r(-576187042625589L) + this.f5424f);
    }

    /* JADX INFO: renamed from: f */
    public final void m2921f(String str) {
        AbstractC0295Gu.m625r(-576491985303605L);
        this.f5424f = new C2488s8(str, 1);
    }

    /* JADX INFO: renamed from: g */
    public final void m2922g(Object... objArr) {
        AbstractC0295Gu.m625r(-576534934976565L);
        this.f5425g = new C1319dG(objArr, 1);
    }

    /* JADX INFO: renamed from: h */
    public final void m2923h(Object obj) {
        this.f5426h = new C2479s(8, obj);
        m2925j();
    }

    /* JADX INFO: renamed from: i */
    public final void m2924i(Class cls) {
        AbstractC0295Gu.m625r(-578046763464757L);
        C0352I7 c0352i7 = new C0352I7(2, cls);
        AbstractC0295Gu.m625r(-576444740663349L);
        this.f5423e = c0352i7;
    }

    /* JADX INFO: renamed from: j */
    public final void m2925j() {
        Method methodM2920e = this.f5421c;
        if (methodM2920e == null) {
            methodM2920e = m2920e();
        }
        if (methodM2920e != null) {
            XposedBridge.hookMethod(methodM2920e, new C1362eG(1, this));
            return;
        }
        throw new NullPointerException(AbstractC0295Gu.m625r(-576384611121205L) + this.f5420b + AbstractC0295Gu.m625r(-577011676346421L) + this.f5424f);
    }
}
