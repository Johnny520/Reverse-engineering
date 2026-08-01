package p085r;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: r.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0818j extends C0817i {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085r.C0817i
    /* JADX INFO: renamed from: U */
    public final Typeface mo1491U(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f2729u, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2728A.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085r.C0817i
    /* JADX INFO: renamed from: Y */
    public final Method mo1494Y(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
