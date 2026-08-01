package androidx.fragment.app;

import androidx.activity.AbstractC0053;
import androidx.collection.C0283;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2324 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0283 f6824 = new C0283(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2313 f6825;

    public C2324(AbstractC2313 abstractC2313) {
        this.f6825 = abstractC2313;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Class m4421(ClassLoader classLoader, String str) {
        try {
            return m4422(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment$InstantiationException(AbstractC0053.m158("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment$InstantiationException(AbstractC0053.m158("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class m4422(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C0283 c0283 = f6824;
        C0283 c02832 = (C0283) c0283.get(classLoader);
        if (c02832 == null) {
            c02832 = new C0283(0);
            c0283.put(classLoader, c02832);
        }
        Class cls = (Class) c02832.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c02832.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractComponentCallbacksC2338 m4423(String str) {
        try {
            return (AbstractComponentCallbacksC2338) m4421(this.f6825.f6791.f6816.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment$InstantiationException(AbstractC0053.m158("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment$InstantiationException(AbstractC0053.m158("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment$InstantiationException(AbstractC0053.m158("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment$InstantiationException(AbstractC0053.m158("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
