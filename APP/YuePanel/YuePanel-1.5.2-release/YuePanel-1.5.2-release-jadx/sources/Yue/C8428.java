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

/* JADX INFO: renamed from: Yue.ۥۢۥۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(26)
@SuppressLint({"SoonBlockedPrivateApi"})
public final class C8428 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3490 = "WeightTypeface";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f3491 = "native_instance";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f25248 = "nativeCreateFromTypefaceWithExactStyle";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Field f25249;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Method f25250;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Constructor<Typeface> f25251;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC5225("sWeightCacheLock")
    public static final C5885<SparseArray<Typeface>> f25252;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Object f25253;

    static {
        Field declaredField;
        Constructor<Typeface> declaredConstructor;
        Method declaredMethod;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod(f25248, cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
        }
        f25249 = declaredField;
        f25250 = declaredMethod;
        f25251 = declaredConstructor;
        f25252 = new C5885<>(3);
        f25253 = new Object();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static Typeface m4406(long j) {
        try {
            return f25251.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static Typeface m4407(@InterfaceC6391 Typeface typeface, int i, boolean z) {
        if (!m28189()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (f25253) {
            try {
                long jM28188 = m28188(typeface);
                C5885<SparseArray<Typeface>> c5885 = f25252;
                SparseArray<Typeface> sparseArrayM18216 = c5885.m18216(jM28188);
                if (sparseArrayM18216 == null) {
                    sparseArrayM18216 = new SparseArray<>(4);
                    c5885.m18222(jM28188, sparseArrayM18216);
                } else {
                    Typeface typeface2 = sparseArrayM18216.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface typefaceM4406 = m4406(m28190(jM28188, i, z));
                sparseArrayM18216.put(i2, typefaceM4406);
                return typefaceM4406;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static long m28188(@InterfaceC6391 Typeface typeface) {
        try {
            return f25249.getLong(typeface);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m28189() {
        return f25249 != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static long m28190(long j, int i, boolean z) {
        try {
            return ((Long) f25250.invoke(null, Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
