package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: co */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1272co {

    /* JADX INFO: renamed from: a */
    public static final HashMap f4333a = null;

    /* JADX INFO: renamed from: b */
    public static final HashMap f4334b = null;

    static {
        f4333a = new HashMap();
        f4334b = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m2410a(Constructor r0, InterfaceC1018Xn r1) {
        r0.newInstance(new Object[]{r1});     // Catch: InvocationTargetException -> L4 InstantiationException -> L7 IllegalAccessException -> L10
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

    /* JADX INFO: renamed from: b */
    public static int m2411b(Class r13) {
        HashMap r0 = f4333a;
        Integer r1 = (Integer) r0.get(r13);
        if (r1 != null) goto L5;
        int r2 = 1;
        if (r13.getCanonicalName() == null) goto L77;
        ArrayList r12 = null;
        Package r3 = r13.getPackage();     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
        String r4 = r13.getCanonicalName();     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
        if (r3 == null) goto L13;
        String r32 = r3.getName();     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
    L15:
        if (r32.length() == 0) goto L18;
        r4 = r4.substring(r32.length() + 1);     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
    L18:
        String r42 = AbstractC0085Bz.m133K(r4, ".", "_").concat("_LifecycleAdapter");     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
        if (r32.length() == 0) goto L22;
        r42 = r32 + '.' + r42;     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
    L22:
        Constructor<?> r33 = Class.forName(r42).getDeclaredConstructor(new Class[]{r13});     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
        if (r33.isAccessible() == true) goto L30;
        r33.setAccessible(true);     // Catch: NoSuchMethodException -> L26 ClassNotFoundException -> L29
    L30:
        HashMap r5 = f4334b;
        if (r33 == null) goto L34;
        r5.put(r13, Collections.singletonList(r33));
    L33:
        r2 = 2;
        goto L77
    L34:
        C0397J9 r34 = C0397J9.f1340c;
        HashMap r6 = r34.f1342b;
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
        if (r72 == true) goto L55;
    L58:
        Class<?>[] r37 = r13.getInterfaces();
        int r73 = r37.length;
        int r9 = 0;
    L59:
        if (r9 >= r73) goto L75;
        Class<?> r10 = r37[r9];
        if (r10 != null) goto L63;
    L65:
        boolean r11 = false;
    L66:
        if (r11 == false) goto L74;
        if (m2411b(r10) == 1) goto L77;
        if (r12 != null) goto L73;
        r12 = new ArrayList();
    L73:
        r12.addAll((Collection) r5.get(r10));
    L74:
        r9 = r9 + 1;
        goto L59
    L63:
        if (InterfaceC1018Xn.class.isAssignableFrom(r10) == false) goto L65;
        r11 = true;
        goto L66
    L75:
        if (r12 == null) goto L77;
        r5.put(r13, r12);
        goto L33
    L55:
        if (m2411b(r36) == 1) goto L77;
        r12 = new ArrayList((Collection) r5.get(r36));
        goto L58
    L50:
        if (InterfaceC1018Xn.class.isAssignableFrom(r36) == false) goto L52;
        r72 = true;
        goto L53
    L82:
        Method[] r74 = r13.getDeclaredMethods();     // Catch: NoClassDefFoundError -> L79
        int r92 = r74.length;
        int r102 = 0;
    L39:
        if (r102 >= r92) goto L44;
        if (((InterfaceC2429qt) r74[r102].getAnnotation(InterfaceC2429qt.class)) != null) goto L42;
        r102 = r102 + 1;
        goto L39
    L42:
        r34.m835a(r13, r74);
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
