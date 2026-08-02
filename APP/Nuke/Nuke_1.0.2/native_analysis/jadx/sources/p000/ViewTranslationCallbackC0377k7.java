package p000;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: renamed from: k7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC0377k7 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a */
    public static final ViewTranslationCallbackC0377k7 f5362a = new ViewTranslationCallbackC0377k7();

    public final boolean onClearTranslation(View view) {
        xm0 xm0Var;
        view.getClass();
        ViewOnAttachStateChangeListenerC0837w7 contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f12373m = EnumC0684s7.f9949h;
        x01 x01VarM5852f = contentCaptureManager$ui.m5852f();
        Object[] objArr = x01VarM5852f.f12751c;
        long[] jArr = x01VarM5852f.f12749a;
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
                        rk1 rk1Var = ((sn2) objArr[(i << 3) + i3]).f10248a.f9050d.f6221h;
                        Object objM4505g = rk1Var.m4505g(vn2.f12045E);
                        if (objM4505g == null) {
                            objM4505g = null;
                        }
                        if (objM4505g != null) {
                            Object objM4505g2 = rk1Var.m4505g(kn2.f5672n);
                            C0603q3 c0603q3 = (C0603q3) (objM4505g2 != null ? objM4505g2 : null);
                            if (c0603q3 != null && (xm0Var = (xm0) c0603q3.f8713b) != null) {
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

    public final boolean onHideTranslation(View view) {
        in0 in0Var;
        view.getClass();
        ViewOnAttachStateChangeListenerC0837w7 contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f12373m = EnumC0684s7.f9949h;
        x01 x01VarM5852f = contentCaptureManager$ui.m5852f();
        Object[] objArr = x01VarM5852f.f12751c;
        long[] jArr = x01VarM5852f.f12749a;
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
                        rk1 rk1Var = ((sn2) objArr[(i << 3) + i3]).f10248a.f9050d.f6221h;
                        Object objM4505g = rk1Var.m4505g(vn2.f12045E);
                        if (objM4505g == null) {
                            objM4505g = null;
                        }
                        if (t11.m5086l(objM4505g, Boolean.TRUE)) {
                            Object objM4505g2 = rk1Var.m4505g(kn2.f5671m);
                            C0603q3 c0603q3 = (C0603q3) (objM4505g2 != null ? objM4505g2 : null);
                            if (c0603q3 != null && (in0Var = (in0) c0603q3.f8713b) != null) {
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

    public final boolean onShowTranslation(View view) {
        in0 in0Var;
        view.getClass();
        ViewOnAttachStateChangeListenerC0837w7 contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f12373m = EnumC0684s7.f9950i;
        x01 x01VarM5852f = contentCaptureManager$ui.m5852f();
        Object[] objArr = x01VarM5852f.f12751c;
        long[] jArr = x01VarM5852f.f12749a;
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
                        rk1 rk1Var = ((sn2) objArr[(i << 3) + i3]).f10248a.f9050d.f6221h;
                        Object objM4505g = rk1Var.m4505g(vn2.f12045E);
                        if (objM4505g == null) {
                            objM4505g = null;
                        }
                        if (t11.m5086l(objM4505g, Boolean.FALSE)) {
                            Object objM4505g2 = rk1Var.m4505g(kn2.f5671m);
                            C0603q3 c0603q3 = (C0603q3) (objM4505g2 != null ? objM4505g2 : null);
                            if (c0603q3 != null && (in0Var = (in0) c0603q3.f8713b) != null) {
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
