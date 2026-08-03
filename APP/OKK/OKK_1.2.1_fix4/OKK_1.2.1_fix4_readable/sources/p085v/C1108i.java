package p085v;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: v.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1108i extends C1107h {
    @Override // p085v.C1107h
    /* JADX INFO: renamed from: b0 */
    public final Typeface mo2611b0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f4263b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f4269h.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p085v.C1107h
    /* JADX INFO: renamed from: h0 */
    public final Method mo2615h0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
