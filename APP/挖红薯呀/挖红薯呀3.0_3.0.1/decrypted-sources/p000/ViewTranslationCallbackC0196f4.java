package p000;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: renamed from: f4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC0196f4 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a */
    public static final ViewTranslationCallbackC0196f4 f1575a = new ViewTranslationCallbackC0196f4();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onClearTranslation(View view) {
        InterfaceC0298hw interfaceC0298hw;
        view.getClass();
        ViewOnAttachStateChangeListenerC0827v4 contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f6399i = EnumC0713s4.f5633d;
        u20 u20VarM4390h = contentCaptureManager$ui.m4390h();
        Object[] objArr = u20VarM4390h.f6113c;
        long[] jArr = u20VarM4390h.f6111a;
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
                        jh0 jh0Var = ((zz0) objArr[(i << 3) + i3]).f8062a.f7471d.f5877d;
                        Object objM1701g = jh0Var.m1701g(b01.f310C);
                        if (objM1701g == null) {
                            objM1701g = null;
                        }
                        if (objM1701g != null) {
                            Object objM1701g2 = jh0Var.m1701g(rz0.f5601n);
                            C0533o0 c0533o0 = (C0533o0) (objM1701g2 != null ? objM1701g2 : null);
                            if (c0533o0 != null && (interfaceC0298hw = (InterfaceC0298hw) c0533o0.f4378b) != null) {
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
        InterfaceC0742sw interfaceC0742sw;
        view.getClass();
        ViewOnAttachStateChangeListenerC0827v4 contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f6399i = EnumC0713s4.f5633d;
        u20 u20VarM4390h = contentCaptureManager$ui.m4390h();
        Object[] objArr = u20VarM4390h.f6113c;
        long[] jArr = u20VarM4390h.f6111a;
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
                        jh0 jh0Var = ((zz0) objArr[(i << 3) + i3]).f8062a.f7471d.f5877d;
                        Object objM1701g = jh0Var.m1701g(b01.f310C);
                        if (objM1701g == null) {
                            objM1701g = null;
                        }
                        if (p30.m3002l(objM1701g, Boolean.TRUE)) {
                            Object objM1701g2 = jh0Var.m1701g(rz0.f5600m);
                            C0533o0 c0533o0 = (C0533o0) (objM1701g2 != null ? objM1701g2 : null);
                            if (c0533o0 != null && (interfaceC0742sw = (InterfaceC0742sw) c0533o0.f4378b) != null) {
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
        InterfaceC0742sw interfaceC0742sw;
        view.getClass();
        ViewOnAttachStateChangeListenerC0827v4 contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f6399i = EnumC0713s4.f5634e;
        u20 u20VarM4390h = contentCaptureManager$ui.m4390h();
        Object[] objArr = u20VarM4390h.f6113c;
        long[] jArr = u20VarM4390h.f6111a;
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
                        jh0 jh0Var = ((zz0) objArr[(i << 3) + i3]).f8062a.f7471d.f5877d;
                        Object objM1701g = jh0Var.m1701g(b01.f310C);
                        if (objM1701g == null) {
                            objM1701g = null;
                        }
                        if (p30.m3002l(objM1701g, Boolean.FALSE)) {
                            Object objM1701g2 = jh0Var.m1701g(rz0.f5600m);
                            C0533o0 c0533o0 = (C0533o0) (objM1701g2 != null ? objM1701g2 : null);
                            if (c0533o0 != null && (interfaceC0742sw = (InterfaceC0742sw) c0533o0.f4378b) != null) {
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
