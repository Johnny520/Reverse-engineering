package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ti */
/* JADX INFO: loaded from: classes.dex */
public final class C2547ti {

    /* JADX INFO: renamed from: b */
    public static final C2520sy f8868b = new C2520sy(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC2805zi f8869a;

    public C2547ti(AbstractC2805zi abstractC2805zi) {
        this.f8869a = abstractC2805zi;
    }

    /* JADX INFO: renamed from: b */
    public static Class m5031b(String str, ClassLoader classLoader) throws ClassNotFoundException {
        C2520sy c2520sy = f8868b;
        C2520sy c2520sy2 = (C2520sy) c2520sy.get(classLoader);
        if (c2520sy2 == null) {
            c2520sy2 = new C2520sy(0);
            c2520sy.put(classLoader, c2520sy2);
        }
        Class cls = (Class) c2520sy2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c2520sy2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: c */
    public static Class m5032c(String str, ClassLoader classLoader) {
        try {
            return m5031b(str, classLoader);
        } catch (ClassCastException e) {
            throw new C0232Fa(AbstractC2374ph.m4814k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C0232Fa(AbstractC2374ph.m4814k("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC1503hi m5033a(String str) {
        try {
            return (AbstractComponentCallbacksC1503hi) m5032c(str, this.f8869a.f9512u.f7401m.getClassLoader()).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new C0232Fa(AbstractC2374ph.m4814k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C0232Fa(AbstractC2374ph.m4814k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C0232Fa(AbstractC2374ph.m4814k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C0232Fa(AbstractC2374ph.m4814k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
