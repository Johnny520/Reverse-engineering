package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8022 {

    /* JADX INFO: renamed from: ۥ */
    public static final float f3197 = 0.013888889f;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final float f3198 = 0.03937008f;

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۧ$ۥ */
    @InterfaceC7113(34)
    public static class C1406 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static float m4041(int i, float f, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i, f, displayMetrics);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۧ$ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1407 {
    }

    /* JADX INFO: renamed from: ۥ */
    public static float m4039(int i, float f, @InterfaceC6391 DisplayMetrics displayMetrics) {
        float f2;
        float f3;
        if (Build.VERSION.SDK_INT >= 34) {
            return C1406.m4041(i, f, displayMetrics);
        }
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            float f4 = displayMetrics.density;
            if (f4 == 0.0f) {
                return 0.0f;
            }
            return f / f4;
        }
        if (i == 2) {
            float f5 = displayMetrics.scaledDensity;
            if (f5 == 0.0f) {
                return 0.0f;
            }
            return f / f5;
        }
        if (i == 3) {
            float f6 = displayMetrics.xdpi;
            if (f6 == 0.0f) {
                return 0.0f;
            }
            f2 = f / f6;
            f3 = 0.013888889f;
        } else {
            if (i == 4) {
                float f7 = displayMetrics.xdpi;
                if (f7 == 0.0f) {
                    return 0.0f;
                }
                return f / f7;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Invalid unitToConvertTo " + i);
            }
            float f8 = displayMetrics.xdpi;
            if (f8 == 0.0f) {
                return 0.0f;
            }
            f2 = f / f8;
            f3 = 0.03937008f;
        }
        return f2 / f3;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static float m4040(float f, @InterfaceC6391 DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m25332(int i) {
        return i & 15;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static float m25333(float f, @InterfaceC6391 DisplayMetrics displayMetrics) {
        return m4039(1, f, displayMetrics);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static float m25334(float f, @InterfaceC6391 DisplayMetrics displayMetrics) {
        return m4039(2, f, displayMetrics);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static float m25335(float f, @InterfaceC6391 DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f, displayMetrics);
    }
}
