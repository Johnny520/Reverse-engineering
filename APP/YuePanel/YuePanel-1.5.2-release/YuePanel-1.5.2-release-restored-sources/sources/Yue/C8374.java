package Yue;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۢۤۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8374 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f3444 = "ViewUtilsApi19";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f24975 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Method f24976 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean f24977 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Field f24978 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean f24979 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f24980 = 12;

    /* JADX INFO: renamed from: ۥ */
    public float[] f3445;

    /* JADX INFO: renamed from: Yue.ۥۢۤۨۡ$ۥ */
    @InterfaceC7113(29)
    public static class C1510 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static float m4356(View view) {
            return view.getTransitionAlpha();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m4357(View view, float f) {
            view.setTransitionAlpha(f);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4354(@InterfaceC6391 View view) {
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟ */
    public final void m4355() {
        if (f24977) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f24976 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i(f3444, "Failed to retrieve setFrame method", e);
        }
        f24977 = true;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float mo27938(@InterfaceC6391 View view) {
        if (f24975) {
            try {
                return C1510.m4356(view);
            } catch (NoSuchMethodError unused) {
                f24975 = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m27939(@InterfaceC6391 View view) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo27940(@InterfaceC6391 View view, @InterfaceC6490 Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f3445;
        if (fArr == null) {
            fArr = new float[9];
            this.f3445 = fArr;
        }
        matrix.getValues(fArr);
        float f = fArr[3];
        float fSqrt = ((float) Math.sqrt(1.0f - (f * f))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f, fSqrt));
        float f2 = fArr[0] / fSqrt;
        float f3 = fArr[4] / fSqrt;
        float f4 = fArr[2];
        float f5 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f4);
        view.setTranslationY(f5);
        view.setRotation(degrees);
        view.setScaleX(f2);
        view.setScaleY(f3);
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo27941(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
        m4355();
        Method method = f24976;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo27942(@InterfaceC6391 View view, float f) {
        if (f24975) {
            try {
                C1510.m4357(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f24975 = false;
            }
        }
        view.setAlpha(f);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void mo27943(@InterfaceC6391 View view, int i) {
        if (!f24979) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f24978 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(f3444, "fetchViewFlagsField: ");
            }
            f24979 = true;
        }
        Field field = f24978;
        if (field != null) {
            try {
                f24978.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void mo27944(@InterfaceC6391 View view, @InterfaceC6391 Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo27944((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo27945(@InterfaceC6391 View view, @InterfaceC6391 Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo27945((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
