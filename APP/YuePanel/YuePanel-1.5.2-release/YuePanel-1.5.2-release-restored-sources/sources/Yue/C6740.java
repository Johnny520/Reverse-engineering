package Yue;

import Yue.InterfaceC7144;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۡۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public final class C6740 {
    /* JADX INFO: renamed from: ۥ */
    public static void m3226(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3227(boolean z, @InterfaceC6391 Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m21406(boolean z, @InterfaceC6391 String str, @InterfaceC6391 Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static float m21407(float f, @InterfaceC6391 String str) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f)) {
            return f;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static double m21408(double d, double d2, double d3, @InterfaceC6391 String str) {
        if (d < d2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d2), Double.valueOf(d3)));
        }
        if (d <= d3) {
            return d;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d2), Double.valueOf(d3)));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static float m21409(float f, float f2, float f3, @InterfaceC6391 String str) {
        if (f < f2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f2), Float.valueOf(f3)));
        }
        if (f <= f3) {
            return f;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f2), Float.valueOf(f3)));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m21410(int i, int i2, int i3, @InterfaceC6391 String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        if (i <= i3) {
            return i;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static long m21411(long j, long j2, long j3, @InterfaceC6391 String str) {
        if (j < j2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j2), Long.valueOf(j3)));
        }
        if (j <= j3) {
            return j;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    @InterfaceC5459(from = 0)
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static int m21412(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    @InterfaceC5459(from = 0)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m21413(int i, @InterfaceC6490 String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m21414(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i2) + " are allowed");
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static <T> T m21415(@InterfaceC6490 T t) {
        t.getClass();
        return t;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static <T> T m21416(@InterfaceC6490 T t, @InterfaceC6391 Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m21417(boolean z) {
        m21418(z, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m21418(boolean z, @InterfaceC6490 String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static <T extends CharSequence> T m21419(@InterfaceC6490 T t) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException();
        }
        return t;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static <T extends CharSequence> T m21420(@InterfaceC6490 T t, @InterfaceC6391 Object obj) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static <T extends CharSequence> T m21421(@InterfaceC6490 T t, @InterfaceC6391 String str, @InterfaceC6391 Object... objArr) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t;
    }
}
