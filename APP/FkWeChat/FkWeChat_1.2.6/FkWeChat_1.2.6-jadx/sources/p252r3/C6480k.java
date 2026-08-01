package p252r3;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.C5750e;

/* JADX INFO: renamed from: r3.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C6480k extends C6479j {
    @Override // p252r3.C6479j
    /* JADX INFO: renamed from: g */
    public Typeface mo25663g(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f20354b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f20360h.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            C5750e.m23251a(e10);
            return null;
        }
    }

    @Override // p252r3.C6479j
    /* JADX INFO: renamed from: n */
    public Method mo25670n(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
