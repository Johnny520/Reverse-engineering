package p085v;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: v.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1108i extends C1107h {
    @Override // p085v.C1107h
    /* JADX INFO: renamed from: b0 */
    public final Typeface mo2611b0(Object r5) {
        Object r02 = Array.newInstance(this.f4263b, 1);     // Catch: Throwable -> L4 IllegalAccessException -> L6
        Array.set(r02, 0, r5);     // Catch: Throwable -> L4 IllegalAccessException -> L6
        return (Typeface) this.f4269h.invoke(null, new Object[]{r02, "sans-serif", -1, -1});
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // p085v.C1107h
    /* JADX INFO: renamed from: h0 */
    public final Method mo2615h0(Class r4) {
        Class<?> r42 = Array.newInstance(r4, 1).getClass();
        Class r2 = Integer.TYPE;
        Method r43 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{r42, String.class, r2, r2});
        r43.setAccessible(true);
        return r43;
    }
}
