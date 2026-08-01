package androidx.fragment.app;

import androidx.activity.AbstractC0900;
import androidx.collection.C1130;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3157 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1130 f7169 = new C1130(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3146 f7170;

    public C3157(AbstractC3146 abstractC3146) {
        this.f7170 = abstractC3146;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Class m4981(ClassLoader classLoader, String str) {
        try {
            return m4982(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment$InstantiationException(AbstractC0900.m718("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment$InstantiationException(AbstractC0900.m718("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class m4982(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C1130 c1130 = f7169;
        C1130 c11302 = (C1130) c1130.get(classLoader);
        if (c11302 == null) {
            c11302 = new C1130(0);
            c1130.put(classLoader, c11302);
        }
        Class cls = (Class) c11302.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c11302.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractComponentCallbacksC3171 m4983(String str) {
        try {
            return (AbstractComponentCallbacksC3171) m4981(this.f7170.f7136.f7161.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment$InstantiationException(AbstractC0900.m718("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment$InstantiationException(AbstractC0900.m718("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment$InstantiationException(AbstractC0900.m718("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment$InstantiationException(AbstractC0900.m718("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
