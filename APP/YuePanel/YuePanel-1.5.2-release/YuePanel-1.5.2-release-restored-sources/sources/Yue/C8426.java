package Yue;

import Yue.C5053;
import Yue.InterfaceC7144;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: Yue.ۥۢۥۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public final class C8426 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3486 = "WeightTypeface";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f3487 = "native_instance";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Field f25237;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC5225("sWeightCacheLock")
    public static final C5885<SparseArray<Typeface>> f25238;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Object f25239;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
        } catch (Exception e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
            declaredField = null;
        }
        f25237 = declaredField;
        f25238 = new C5885<>(3);
        f25239 = new Object();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static Typeface m4402(@InterfaceC6391 C8029 c8029, @InterfaceC6391 Context context, @InterfaceC6391 Typeface typeface, int i, boolean z) {
        if (!m28182()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (f25239) {
            try {
                long jM28181 = m28181(typeface);
                C5885<SparseArray<Typeface>> c5885 = f25238;
                SparseArray<Typeface> sparseArrayM18216 = c5885.m18216(jM28181);
                if (sparseArrayM18216 == null) {
                    sparseArrayM18216 = new SparseArray<>(4);
                    c5885.m18222(jM28181, sparseArrayM18216);
                } else {
                    Typeface typeface2 = sparseArrayM18216.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface typefaceM4403 = m4403(c8029, context, typeface, i, z);
                if (typefaceM4403 == null) {
                    typefaceM4403 = m28183(typeface, i, z);
                }
                sparseArrayM18216.put(i2, typefaceM4403);
                return typefaceM4403;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static Typeface m4403(@InterfaceC6391 C8029 c8029, @InterfaceC6391 Context context, @InterfaceC6391 Typeface typeface, int i, boolean z) {
        C5053.C5055 c5055M25383 = c8029.m25383(typeface);
        if (c5055M25383 == null) {
            return null;
        }
        return c8029.m25380(context, c5055M25383, context.getResources(), i, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static long m28181(@InterfaceC6391 Typeface typeface) {
        try {
            return ((Number) f25237.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m28182() {
        return f25237 != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Typeface m28183(Typeface typeface, int i, boolean z) {
        boolean z2 = i >= 600;
        return Typeface.create(typeface, (z2 || z) ? !z2 ? 2 : !z ? 1 : 3 : 0);
    }
}
