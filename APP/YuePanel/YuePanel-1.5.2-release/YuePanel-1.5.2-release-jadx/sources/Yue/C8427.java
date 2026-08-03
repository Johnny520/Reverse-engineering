package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۢۥۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(21)
@SuppressLint({"SoonBlockedPrivateApi"})
public final class C8427 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3488 = "WeightTypeface";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f3489 = "native_instance";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f25240 = "nativeCreateFromTypeface";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f25241 = "nativeCreateWeightAlias";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Field f25242;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Method f25243;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Method f25244;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Constructor<Typeface> f25245;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC5225("sWeightCacheLock")
    public static final C5885<SparseArray<Typeface>> f25246;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Object f25247;

    static {
        Field declaredField;
        Constructor<Typeface> declaredConstructor;
        Method declaredMethod;
        Method declaredMethod2;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod(f25240, cls, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod2 = Typeface.class.getDeclaredMethod(f25241, cls, cls2);
            declaredMethod2.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
            declaredMethod2 = null;
        }
        f25242 = declaredField;
        f25243 = declaredMethod;
        f25244 = declaredMethod2;
        f25245 = declaredConstructor;
        f25246 = new C5885<>(3);
        f25247 = new Object();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static Typeface m4404(long j) {
        try {
            return f25245.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static Typeface m4405(@InterfaceC6391 Typeface typeface, int i, boolean z) {
        if (!m28185()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (f25247) {
            try {
                long jM28184 = m28184(typeface);
                C5885<SparseArray<Typeface>> c5885 = f25246;
                SparseArray<Typeface> sparseArrayM18216 = c5885.m18216(jM28184);
                if (sparseArrayM18216 == null) {
                    sparseArrayM18216 = new SparseArray<>(4);
                    c5885.m18222(jM28184, sparseArrayM18216);
                } else {
                    Typeface typeface2 = sparseArrayM18216.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface typefaceM4404 = z == typeface.isItalic() ? m4404(m28187(jM28184, i)) : m4404(m28186(jM28184, i, z));
                sparseArrayM18216.put(i2, typefaceM4404);
                return typefaceM4404;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static long m28184(@InterfaceC6391 Typeface typeface) {
        try {
            return f25242.getLong(typeface);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m28185() {
        return f25242 != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static long m28186(long j, int i, boolean z) {
        try {
            Long l = (Long) f25243.invoke(null, Long.valueOf(j), Integer.valueOf(z ? 2 : 0));
            l.longValue();
            return ((Long) f25244.invoke(null, l, Integer.valueOf(i))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static long m28187(long j, int i) {
        try {
            return ((Long) f25244.invoke(null, Long.valueOf(j), Integer.valueOf(i))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
