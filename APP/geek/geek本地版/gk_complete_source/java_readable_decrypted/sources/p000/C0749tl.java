package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: tl */
/* JADX INFO: loaded from: classes.dex */
public final class C0749tl {

    /* JADX INFO: renamed from: b */
    public static final u30 f4580b = new u30();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0934yl f4581a;

    public C0749tl(C0934yl c0934yl) {
        this.f4581a = c0934yl;
    }

    /* JADX INFO: renamed from: b */
    public static Class m2379b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        u30 u30Var = f4580b;
        u30 u30Var2 = (u30) u30Var.getOrDefault(classLoader, null);
        if (u30Var2 == null) {
            u30Var2 = new u30();
            u30Var.put(classLoader, u30Var2);
        }
        Class cls = (Class) u30Var2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        u30Var2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: c */
    public static Class m2380c(ClassLoader classLoader, String str) {
        try {
            return m2379b(classLoader, str);
        } catch (ClassCastException e) {
            throw new C0591pb(z30.m2765j("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C0591pb(z30.m2765j("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC0489ml m2381a(String str) {
        try {
            return (AbstractComponentCallbacksC0489ml) m2380c(this.f4581a.f5365n.f3428D.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new C0591pb(z30.m2765j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C0591pb(z30.m2765j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C0591pb(z30.m2765j("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C0591pb(z30.m2765j("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
