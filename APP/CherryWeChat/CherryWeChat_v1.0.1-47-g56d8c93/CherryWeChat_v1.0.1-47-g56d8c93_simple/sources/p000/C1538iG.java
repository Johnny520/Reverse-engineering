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

    public C1538iG(Object r2) {
        if (r2 != null) goto L5;
        return;
    L5:
        if ((r2 instanceof Class) == false) goto L9;
        this.f5420b = (Class) r2;
        return;
    L9:
        if ((r2 instanceof Method) == false) goto L12;
        this.f5421c = (Method) r2;
        return;
    L12:
        this.f5420b = r2.getClass();
        this.f5419a = r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2916a(InterfaceC1416fj r3) {
        AbstractC0295Gu.m625r(-576290121840693L);
        this.f5427i = r3;
        m2925j();
    }

    /* JADX INFO: renamed from: b */
    public final void m2917b(InterfaceC1416fj r3) {
        AbstractC0295Gu.m625r(-576251467135029L);
        this.f5426h = r3;
        m2925j();
    }

    /* JADX INFO: renamed from: c */
    public final Object m2918c(Object r3, Object... r4) {
        AbstractC0295Gu.m625r(-577076100855861L);
        Method r0 = m2920e();
        if (r0 == null) goto L18;
        if (r3 == null) goto L16;
    L10:
        return r0.invoke(r3, Arrays.copyOf(r4, r4.length));
    L8:
        e = move-exception;
        e.printStackTrace();
        return null;
    L6:
        e = move-exception;
        e.printStackTrace();
        return null;
    L16:
        r3 = this.f5419a;     // Catch: InvocationTargetException -> L6 IllegalAccessException -> L8
        goto L10
    L18:
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Object m2919d(Object... r4) {
        AbstractC0295Gu.m625r(-577097575692341L);
        Method r0 = m2920e();
        if (r0 != null) goto L13;
    L12:
        return null;
    L13:
        return r0.invoke(null, Arrays.copyOf(r4, r4.length));
    L8:
        e = move-exception;
        e.printStackTrace();
    L6:
        e = move-exception;
        e.printStackTrace();
        goto L12
    }

    /* JADX INFO: renamed from: e */
    public final Method m2920e() {
        Method r0 = null;
        Class r1 = this.f5420b;
        if (r1 != null) goto L5;
        return null;
    L5:
        InterfaceC1416fj r2 = this.f5422d;
        C0352I7 r3 = this.f5423e;
        InterfaceC1416fj r4 = this.f5424f;
        InterfaceC1416fj r5 = this.f5425g;
        Method[] r6 = r1.getDeclaredMethods();
        int r7 = 0;
    L7:
        if (r7 >= r6.length) goto L32;
        int r8 = r7 + 1;
        Method r72 = r6[r7];     // Catch: ArrayIndexOutOfBoundsException -> L29
        if (r3 == null) goto L15;
        Class<?> r9 = r72.getReturnType();
        AbstractC0295Gu.m625r(-577119050528821L);
        if (((Boolean) r3.mo90g(r9)).booleanValue() == true) goto L15;
    L14:
        r7 = r8;
    L15:
        if (r2 != null) goto L17;
    L18:
        if (r4 == null) goto L23;
        String r92 = r72.getName();
        AbstractC0295Gu.m625r(-577200654907445L);
        if (((Boolean) r4.mo90g(r92)).booleanValue() == false) goto L14;
    L23:
        if (r5 == null) goto L24;
        Class<?>[] r10 = r72.getParameterTypes();
        AbstractC0295Gu.m625r(-576706733668405L);
        if (((Boolean) r5.mo90g(r10)).booleanValue() == false) goto L14;
        r72.setAccessible(true);
    L25:
        r0 = r72;
        goto L32
    L24:
        r72.setAccessible(true);
        goto L25
    L17:
        if (((Boolean) r2.mo90g(Integer.valueOf(r72.getModifiers()))).booleanValue() == false) goto L14;
    L29:
        e = move-exception;
        throw new NoSuchElementException(e.getMessage());
    L32:
        if (r0 == null) goto L35;
        return r0;
    L35:
        throw new NullPointerException(AbstractC0295Gu.m625r(-576663783995445L) + r1 + AbstractC0295Gu.m625r(-576187042625589L) + this.f5424f);
    }

    /* JADX INFO: renamed from: f */
    public final void m2921f(String r3) {
        AbstractC0295Gu.m625r(-576491985303605L);
        this.f5424f = new C2488s8(r3, 1);
    }

    /* JADX INFO: renamed from: g */
    public final void m2922g(Object... r3) {
        AbstractC0295Gu.m625r(-576534934976565L);
        this.f5425g = new C1319dG(r3, 1);
    }

    /* JADX INFO: renamed from: h */
    public final void m2923h(Object r3) {
        this.f5426h = new C2479s(8, r3);
        m2925j();
    }

    /* JADX INFO: renamed from: i */
    public final void m2924i(Class r4) {
        AbstractC0295Gu.m625r(-578046763464757L);
        C0352I7 r0 = new C0352I7(2, r4);
        AbstractC0295Gu.m625r(-576444740663349L);
        this.f5423e = r0;
    }

    /* JADX INFO: renamed from: j */
    public final void m2925j() {
        Method r0 = this.f5421c;
        if (r0 != null) goto L6;
        r0 = m2920e();
    L6:
        if (r0 == null) goto L10;
        XposedBridge.hookMethod(r0, new C1362eG(1, this));
        return;
    L10:
        throw new NullPointerException(AbstractC0295Gu.m625r(-576384611121205L) + this.f5420b + AbstractC0295Gu.m625r(-577011676346421L) + this.f5424f);
    }
}
