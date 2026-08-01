package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pa {
    public static final pa c = null;
    public final HashMap a;
    public final HashMap b;

    static {
        c = new pa();
    }

    public pa() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public static void b(HashMap r3, oa r4, iq r5, Class r6) {
        iq r0 = (iq) r3.get(r4);
        if (r0 == null) goto L8;
        if (r5 == r0) goto L8;
        throw new IllegalArgumentException("Method " + r4.b.getName() + " in " + r6.getName() + " already declared with different @OnLifecycleEvent value: previous value " + r0 + ", new value " + r5);
    L8:
        if (r0 != null) goto L11;
        r3.put(r4, r5);
        return;
    }

    public final na a(Class r13, Method[] r14) {
        Class r0 = r13.getSuperclass();
        HashMap r1 = new HashMap();
        HashMap r3 = this.a;
        if (r0 == null) goto L9;
        na r4 = (na) r3.get(r0);
        if (r4 != null) goto L8;
        r4 = a(r0, null);
    L8:
        r1.putAll(r4.b);
    L9:
        Class<?>[] r02 = r13.getInterfaces();
        int r42 = r02.length;
        int r6 = 0;
    L10:
        if (r6 >= r42) goto L20;
        Class<?> r7 = r02[r6];
        na r8 = (na) r3.get(r7);
        if (r8 != null) goto L15;
        r8 = a(r7, null);
    L15:
        Iterator r72 = r8.b.entrySet().iterator();
    L17:
        if (r72.hasNext() == false) goto L19;
        Map.Entry r82 = (Map.Entry) r72.next();
        b(r1, (oa) r82.getKey(), (iq) r82.getValue(), r13);
        goto L17
    L19:
        r6 = r6 + 1;
        goto L10
    L20:
        if (r14 == null) goto L58;
    L23:
        int r03 = r14.length;
        int r2 = 0;
        boolean r43 = false;
    L24:
        if (r2 >= r03) goto L53;
        Method r62 = r14[r2];
        zw r73 = (zw) r62.getAnnotation(zw.class);
        if (r73 == null) goto L50;
        Class<?>[] r44 = r62.getParameterTypes();
        if (r44.length > 0) goto L31;
        int r83 = 0;
    L36:
        iq r74 = r73.value();
        if (r44.length <= 1) goto L48;
        if (iq.class.isAssignableFrom(r44[1]) == false) goto L46;
        if (r74 != iq.ON_ANY) goto L44;
        r83 = 2;
        goto L48
    L44:
        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
    L46:
        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
    L48:
        if (r44.length > 2) goto L52;
        b(r1, new oa(r83, r62), r74, r13);
        r43 = true;
        goto L50
    L52:
        throw new IllegalArgumentException("cannot have more than 2 params");
    L31:
        if (oq.class.isAssignableFrom(r44[0]) == false) goto L34;
        r83 = 1;
        goto L36
    L34:
        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
    L50:
        r2 = r2 + 1;
        goto L24
    L53:
        na r142 = new na(r1);
        r3.put(r13, r142);
        this.b.put(r13, Boolean.valueOf(r43));
        return r142;
    L58:
        r14 = r13.getDeclaredMethods();     // Catch: NoClassDefFoundError -> L55
    L55:
        e = move-exception;
        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
    }
}
