package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: androidx.lifecycle.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0544u {

    /* JADX INFO: renamed from: a */
    public static final HashMap f1499a = null;

    /* JADX INFO: renamed from: b */
    public static final HashMap f1500b = null;

    static {
        f1499a = new HashMap();
        f1500b = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static void m1260a(Constructor r02, Object r1) {
        Object r03 = r02.newInstance(new Object[]{r1});     // Catch: InvocationTargetException -> L4 InstantiationException -> L6 IllegalAccessException -> L8
        AbstractC0307g.m702d(r03, "{\n            constructo…tance(`object`)\n        }");     // Catch: InvocationTargetException -> L4 InstantiationException -> L6 IllegalAccessException -> L8
        AbstractC0324d.m724g(r03);     // Catch: InvocationTargetException -> L4 InstantiationException -> L6 IllegalAccessException -> L8
        throw null;     // Catch: InvocationTargetException -> L4 InstantiationException -> L6 IllegalAccessException -> L8
    L8:
        e = move-exception;
        throw new RuntimeException(e);
    L6:
        e = move-exception;
        throw new RuntimeException(e);
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    /* JADX INFO: renamed from: b */
    public static int m1261b(Class r13) {
        HashMap r02 = f1499a;
        Integer r1 = (Integer) r02.get(r13);
        if (r1 != null) goto L5;
        int r2 = 1;
        if (r13.getCanonicalName() == null) goto L78;
        ArrayList r3 = null;
        Package r4 = r13.getPackage();     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        String r5 = r13.getCanonicalName();     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        if (r4 == null) goto L15;
        String r42 = r4.getName();     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
    L16:
        AbstractC0307g.m702d(r42, "fullPackage");     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        if (r42.length() == 0) goto L20;
        AbstractC0307g.m702d(r5, "name");     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        r5 = r5.substring(r42.length() + 1);     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        AbstractC0307g.m702d(r5, "this as java.lang.String).substring(startIndex)");     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
    L20:
        AbstractC0307g.m702d(r5, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        String r52 = AbstractC0433r.m1031F0(r5, ".", "_", false).concat("_LifecycleAdapter");     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        if (r42.length() == 0) goto L24;
        r52 = r42 + '.' + r52;     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
    L24:
        Constructor<?> r43 = Class.forName(r52).getDeclaredConstructor(new Class[]{r13});     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
        if (r43.isAccessible() == true) goto L31;
        r43.setAccessible(true);     // Catch: NoSuchMethodException -> L13 ClassNotFoundException -> L30
    L31:
        HashMap r53 = f1500b;
        if (r43 == null) goto L35;
        r53.put(r13, AbstractC0040p.m82F(r43));
    L34:
        r2 = 2;
        goto L78
    L35:
        C0526c r44 = C0526c.f1477c;
        HashMap r7 = r44.f1479b;
        Boolean r8 = (Boolean) r7.get(r13);
        if (r8 == null) goto L83;
        boolean r45 = r8.booleanValue();
    L46:
        if (r45 == true) goto L78;
        Class r46 = r13.getSuperclass();
        if (r46 != null) goto L51;
    L53:
        boolean r82 = false;
    L54:
        if (r82 == false) goto L59;
        AbstractC0307g.m702d(r46, "superclass");
        if (m1261b(r46) == 1) goto L78;
        Object r47 = r53.get(r46);
        AbstractC0307g.m700b(r47);
        r3 = new ArrayList((Collection) r47);
    L59:
        Class<?>[] r48 = r13.getInterfaces();
        AbstractC0307g.m702d(r48, "klass.interfaces");
        int r83 = r48.length;
        int r9 = 0;
    L60:
        if (r9 >= r83) goto L76;
        Class<?> r10 = r48[r9];
        if (r10 != null) goto L64;
    L66:
        boolean r11 = false;
    L67:
        if (r11 == false) goto L75;
        AbstractC0307g.m702d(r10, "intrface");
        if (m1261b(r10) == 1) goto L78;
        if (r3 != null) goto L74;
        r3 = new ArrayList();
    L74:
        Object r102 = r53.get(r10);
        AbstractC0307g.m700b(r102);
        r3.addAll((Collection) r102);
    L75:
        r9 = r9 + 1;
        goto L60
    L64:
        if (InterfaceC0540q.class.isAssignableFrom(r10) == false) goto L66;
        r11 = true;
        goto L67
    L76:
        if (r3 == null) goto L78;
        r53.put(r13, r3);
        goto L34
    L51:
        if (InterfaceC0540q.class.isAssignableFrom(r46) == false) goto L53;
        r82 = true;
        goto L54
    L83:
        Method[] r84 = r13.getDeclaredMethods();     // Catch: NoClassDefFoundError -> L80
        int r92 = r84.length;
        int r103 = 0;
    L40:
        if (r103 >= r92) goto L45;
        if (((InterfaceC0546w) r84[r103].getAnnotation(InterfaceC0546w.class)) != null) goto L43;
        r103 = r103 + 1;
        goto L40
    L43:
        r44.m1250a(r13, r84);
        r45 = true;
        goto L46
    L45:
        r7.put(r13, Boolean.FALSE);
        r45 = false;
    L80:
        e = move-exception;
        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
    L15:
        r42 = "";
    L30:
        r43 = null;
    L13:
        e = move-exception;
        throw new RuntimeException(e);
    L78:
        r02.put(r13, Integer.valueOf(r2));
        return r2;
    L5:
        return r1.intValue();
    }
}
