package p000a;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: a.Pf */
/* JADX INFO: loaded from: classes.dex */
public final class C0288Pf extends C0270Of {
    @Override // p000a.C0270Of
    /* JADX INFO: renamed from: i */
    public final Typeface mo757i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f952f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f958l.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000a.C0270Of
    /* JADX INFO: renamed from: m */
    public final Method mo760m(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
