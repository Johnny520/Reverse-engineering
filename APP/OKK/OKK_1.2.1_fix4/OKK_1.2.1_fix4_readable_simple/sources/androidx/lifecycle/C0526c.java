package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0526c {

    /* JADX INFO: renamed from: c */
    public static final C0526c f1477c = null;

    /* JADX INFO: renamed from: a */
    public final HashMap f1478a;

    /* JADX INFO: renamed from: b */
    public final HashMap f1479b;

    static {
        f1477c = new C0526c();
    }

    public C0526c() {
        this.f1478a = new HashMap();
        this.f1479b = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static void m1249b(HashMap r3, C0525b r4, EnumC0535l r5, Class r6) {
        EnumC0535l r02 = (EnumC0535l) r3.get(r4);
        if (r02 == null) goto L8;
        if (r5 == r02) goto L8;
        throw new IllegalArgumentException("Method " + r4.f1476b.getName() + " in " + r6.getName() + " already declared with different @OnLifecycleEvent value: previous value " + r02 + ", new value " + r5);
    L8:
        if (r02 != null) goto L11;
        r3.put(r4, r5);
        return;
    }

    /* JADX INFO: renamed from: a */
    public final C0524a m1250a(Class r13, Method[] r14) {
        Class r02 = r13.getSuperclass();
        HashMap r1 = new HashMap();
        HashMap r3 = this.f1478a;
        if (r02 == null) goto L9;
        C0524a r4 = (C0524a) r3.get(r02);
        if (r4 != null) goto L8;
        r4 = m1250a(r02, null);
    L8:
        r1.putAll(r4.f1474b);
    L9:
        Class<?>[] r03 = r13.getInterfaces();
        int r42 = r03.length;
        int r6 = 0;
    L10:
        if (r6 >= r42) goto L20;
        Class<?> r7 = r03[r6];
        C0524a r8 = (C0524a) r3.get(r7);
        if (r8 != null) goto L15;
        r8 = m1250a(r7, null);
    L15:
        Iterator r72 = r8.f1474b.entrySet().iterator();
    L17:
        if (r72.hasNext() == false) goto L19;
        Map.Entry r82 = (Map.Entry) r72.next();
        m1249b(r1, (C0525b) r82.getKey(), (EnumC0535l) r82.getValue(), r13);
        goto L17
    L19:
        r6 = r6 + 1;
        goto L10
    L20:
        if (r14 == null) goto L58;
    L23:
        int r04 = r14.length;
        int r2 = 0;
        boolean r43 = false;
    L24:
        if (r2 >= r04) goto L53;
        Method r62 = r14[r2];
        InterfaceC0546w r73 = (InterfaceC0546w) r62.getAnnotation(InterfaceC0546w.class);
        if (r73 == null) goto L50;
        Class<?>[] r44 = r62.getParameterTypes();
        if (r44.length > 0) goto L31;
        int r83 = 0;
    L36:
        EnumC0535l r74 = r73.value();
        if (r44.length <= 1) goto L48;
        if (EnumC0535l.class.isAssignableFrom(r44[1]) == false) goto L46;
        if (r74 != EnumC0535l.ON_ANY) goto L44;
        r83 = 2;
        goto L48
    L44:
        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
    L46:
        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
    L48:
        if (r44.length > 2) goto L52;
        m1249b(r1, new C0525b(r83, r62), r74, r13);
        r43 = true;
        goto L50
    L52:
        throw new IllegalArgumentException("cannot have more than 2 params");
    L31:
        if (InterfaceC0541r.class.isAssignableFrom(r44[0]) == false) goto L34;
        r83 = 1;
        goto L36
    L34:
        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
    L50:
        r2 = r2 + 1;
        goto L24
    L53:
        C0524a r142 = new C0524a(r1);
        r3.put(r13, r142);
        this.f1479b.put(r13, Boolean.valueOf(r43));
        return r142;
    L58:
        r14 = r13.getDeclaredMethods();     // Catch: NoClassDefFoundError -> L55
    L55:
        e = move-exception;
        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
    }
}
