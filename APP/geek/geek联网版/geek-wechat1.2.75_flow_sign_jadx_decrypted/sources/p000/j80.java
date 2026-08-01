package p000;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class j80 extends i80 {
    @Override // p000.i80
    /* JADX INFO: renamed from: A */
    public final Typeface mo1483A(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f2350c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2356i.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000.i80
    /* JADX INFO: renamed from: E */
    public final Method mo1485E(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
