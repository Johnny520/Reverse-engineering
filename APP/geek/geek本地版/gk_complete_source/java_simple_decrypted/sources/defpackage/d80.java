package defpackage;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class d80 extends c80 {
    @Override // defpackage.c80
    public final Typeface B(Object r4) {
        Object r1 = Array.newInstance(this.d, 1);     // Catch: Throwable -> L5 IllegalAccessException -> L7
        Array.set(r1, 0, r4);     // Catch: Throwable -> L5 IllegalAccessException -> L7
        return (Typeface) this.j.invoke(null, new Object[]{r1, "sans-serif", -1, -1});
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // defpackage.c80
    public final Method F(Class r4) {
        Class<?> r42 = Array.newInstance(r4, 1).getClass();
        Class r2 = Integer.TYPE;
        Method r43 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{r42, String.class, r2, r2});
        r43.setAccessible(true);
        return r43;
    }
}
