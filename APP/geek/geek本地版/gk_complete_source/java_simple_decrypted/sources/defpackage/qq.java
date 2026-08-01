package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class qq {
    public static final HashMap a = null;
    public static final HashMap b = null;

    static {
        a = new HashMap();
        b = new HashMap();
    }

    public static void a(Constructor r0, nq r1) {
        ip.n("{\n            constructo…tance(`object`)\n        }", r0.newInstance(new Object[]{r1}));     // Catch: InvocationTargetException -> L4 InstantiationException -> L7 IllegalAccessException -> L10
        throw new ClassCastException();     // Catch: InvocationTargetException -> L4 InstantiationException -> L7 IllegalAccessException -> L10
    L10:
        e = move-exception;
        throw new RuntimeException(e);
    L7:
        e = move-exception;
        throw new RuntimeException(e);
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public static int b(Class r13) {
        HashMap r0 = a;
        Integer r1 = (Integer) r0.get(r13);
        if (r1 != null) goto L5;
        int r2 = 1;
        if (r13.getCanonicalName() == null) goto L77;
        ArrayList r12 = null;
        Package r3 = r13.getPackage();     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
        String r4 = r13.getCanonicalName();     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
        if (r3 == null) goto L13;
        String r32 = r3.getName();     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
    L14:
        ip.n("fullPackage", r32);     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
        if (r32.length() == 0) goto L18;
        ip.n("name", r4);     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
        r4 = r4.substring(r32.length() + 1);     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
        ip.n("this as java.lang.String).substring(startIndex)", r4);     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
    L18:
        ip.n("if (fullPackage.isEmpty(…g(fullPackage.length + 1)", r4);     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
        String r42 = b50.L(r4, ".", "_").concat("_LifecycleAdapter");     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
        if (r32.length() == 0) goto L22;
        r42 = r32 + '.' + r42;     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
    L22:
        Constructor<?> r33 = Class.forName(r42).getDeclaredConstructor(new Class[]{r13});     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
        if (r33.isAccessible() == true) goto L30;
        r33.setAccessible(true);     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
    L30:
        HashMap r5 = b;
        if (r33 == null) goto L34;
        r5.put(r13, ip.C(r33));
    L33:
        r2 = 2;
        goto L77
    L34:
        pa r34 = pa.c;
        HashMap r6 = r34.b;
        Boolean r7 = (Boolean) r6.get(r13);
        if (r7 == null) goto L82;
        boolean r35 = r7.booleanValue();
    L45:
        if (r35 == true) goto L77;
        Class r36 = r13.getSuperclass();
        if (r36 != null) goto L50;
    L52:
        boolean r72 = false;
    L53:
        if (r72 == false) goto L58;
        ip.n("superclass", r36);
        if (b(r36) == 1) goto L77;
        Object r37 = r5.get(r36);
        ip.l(r37);
        r12 = new ArrayList((Collection) r37);
    L58:
        Class<?>[] r38 = r13.getInterfaces();
        ip.n("klass.interfaces", r38);
        int r73 = r38.length;
        int r9 = 0;
    L59:
        if (r9 >= r73) goto L75;
        Class<?> r10 = r38[r9];
        if (r10 != null) goto L63;
    L65:
        boolean r11 = false;
    L66:
        if (r11 == false) goto L74;
        ip.n("intrface", r10);
        if (b(r10) == 1) goto L77;
        if (r12 != null) goto L73;
        r12 = new ArrayList();
    L73:
        Object r102 = r5.get(r10);
        ip.l(r102);
        r12.addAll((Collection) r102);
    L74:
        r9 = r9 + 1;
        goto L59
    L63:
        if (nq.class.isAssignableFrom(r10) == false) goto L65;
        r11 = true;
        goto L66
    L75:
        if (r12 == null) goto L77;
        r5.put(r13, r12);
        goto L33
    L50:
        if (nq.class.isAssignableFrom(r36) == false) goto L52;
        r72 = true;
        goto L53
    L82:
        Method[] r74 = r13.getDeclaredMethods();     // Catch: NoClassDefFoundError -> L79
        int r92 = r74.length;
        int r103 = 0;
    L39:
        if (r103 >= r92) goto L44;
        if (((zw) r74[r103].getAnnotation(zw.class)) != null) goto L42;
        r103 = r103 + 1;
        goto L39
    L42:
        r34.a(r13, r74);
        r35 = true;
        goto L45
    L44:
        r6.put(r13, Boolean.FALSE);
        r35 = false;
    L79:
        e = move-exception;
        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
    L13:
        r32 = "";
    L29:
        r33 = null;
    L26:
        e = move-exception;
        throw new RuntimeException(e);
    L77:
        r0.put(r13, Integer.valueOf(r2));
        return r2;
    L5:
        return r1.intValue();
    }
}
