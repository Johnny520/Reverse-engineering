package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k7 implements ViewTranslationCallback {
    public static final k7 a = new k7();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onClearTranslation(View view) {
        xm0 xm0Var;
        view.getClass();
        w7 contentCaptureManager$ui = ((b7) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.m = s7.h;
        x01 x01VarF = contentCaptureManager$ui.f();
        Object[] objArr = x01VarF.c;
        long[] jArr = x01VarF.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        rk1 rk1Var = ((sn2) objArr[(i << 3) + i3]).a.d.h;
                        Object objG = rk1Var.g(vn2.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = rk1Var.g(kn2.n);
                            q3 q3Var = (q3) (objG2 != null ? objG2 : null);
                            if (q3Var != null && (xm0Var = (xm0) q3Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onHideTranslation(View view) {
        in0 in0Var;
        view.getClass();
        w7 contentCaptureManager$ui = ((b7) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.m = s7.h;
        x01 x01VarF = contentCaptureManager$ui.f();
        Object[] objArr = x01VarF.c;
        long[] jArr = x01VarF.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        rk1 rk1Var = ((sn2) objArr[(i << 3) + i3]).a.d.h;
                        Object objG = rk1Var.g(vn2.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (t11.l(objG, Boolean.TRUE)) {
                            Object objG2 = rk1Var.g(kn2.m);
                            q3 q3Var = (q3) (objG2 != null ? objG2 : null);
                            if (q3Var != null && (in0Var = (in0) q3Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onShowTranslation(View view) {
        in0 in0Var;
        view.getClass();
        w7 contentCaptureManager$ui = ((b7) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.m = s7.i;
        x01 x01VarF = contentCaptureManager$ui.f();
        Object[] objArr = x01VarF.c;
        long[] jArr = x01VarF.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        rk1 rk1Var = ((sn2) objArr[(i << 3) + i3]).a.d.h;
                        Object objG = rk1Var.g(vn2.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (t11.l(objG, Boolean.FALSE)) {
                            Object objG2 = rk1Var.g(kn2.m);
                            q3 q3Var = (q3) (objG2 != null ? objG2 : null);
                            if (q3Var != null && (in0Var = (in0) q3Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
