package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import p009E0.C0102b;
import p022L.AbstractC0174d;
import p075l.C0753k;

/* JADX INFO: renamed from: androidx.fragment.app.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0444v {

    /* JADX INFO: renamed from: b */
    public static final C0753k f1417b = new C0753k();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0448z f1418a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0444v(C0448z c0448z) {
        this.f1418a = c0448z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Class m853b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C0753k c0753k = f1417b;
        C0753k c0753k2 = (C0753k) c0753k.getOrDefault(classLoader, null);
        if (c0753k2 == null) {
            c0753k2 = new C0753k();
            c0753k.put(classLoader, c0753k2);
        }
        Class cls = (Class) c0753k2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0753k2.put(str, cls2);
        return cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Class m854c(ClassLoader classLoader, String str) {
        try {
            return m853b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new C0102b(AbstractC0174d.m353i("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new C0102b(AbstractC0174d.m353i("Unable to instantiate fragment ", str, ": make sure class name exists"), e3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC0434l m855a(String str) {
        try {
            return (AbstractComponentCallbacksC0434l) m854c(this.f1418a.f1443n.f1395e.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new C0102b(AbstractC0174d.m353i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new C0102b(AbstractC0174d.m353i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new C0102b(AbstractC0174d.m353i("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new C0102b(AbstractC0174d.m353i("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }
}
