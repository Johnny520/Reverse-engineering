package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: vl */
/* JADX INFO: loaded from: classes.dex */
public final class C0822vl {

    /* JADX INFO: renamed from: b */
    public static final b40 f4963b = new b40();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0023am f4964a;

    public C0822vl(C0023am c0023am) {
        this.f4964a = c0023am;
    }

    /* JADX INFO: renamed from: b */
    public static Class m2571b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        b40 b40Var = f4963b;
        b40 b40Var2 = (b40) b40Var.getOrDefault(classLoader, null);
        if (b40Var2 == null) {
            b40Var2 = new b40();
            b40Var.put(classLoader, b40Var2);
        }
        Class cls = (Class) b40Var2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        b40Var2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: c */
    public static Class m2572c(ClassLoader classLoader, String str) {
        try {
            return m2571b(classLoader, str);
        } catch (ClassCastException e) {
            throw new C0924yb(g40.m1147j("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C0924yb(g40.m1147j("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC0563ol m2573a(String str) {
        try {
            return (AbstractComponentCallbacksC0563ol) m2572c(this.f4964a.f107n.f3728z.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new C0924yb(g40.m1147j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C0924yb(g40.m1147j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C0924yb(g40.m1147j("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C0924yb(g40.m1147j("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
