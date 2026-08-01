package p047I0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1132s;
import p077P0.C1114a;
import p077P0.C1129p;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p181j0.EnumC2366a;
import p181j0.ViewOnAttachStateChangeListenerC2369d;
import p186k.AbstractC2428j;
import p186k.C2408E;

/* JADX INFO: renamed from: I0.H */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC0673H implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a */
    public static final ViewTranslationCallbackC0673H f2153a = new ViewTranslationCallbackC0673H();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onClearTranslation(View view) {
        InterfaceC1599a interfaceC1599a;
        AbstractC1665j.m2983c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC2369d contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f7686i = EnumC2366a.f7673d;
        AbstractC2428j abstractC2428jM4220g = contentCaptureManager$ui.m4220g();
        Object[] objArr = abstractC2428jM4220g.f7847c;
        long[] jArr = abstractC2428jM4220g.f7845a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        C2408E c2408e = ((C1129p) objArr[(i5 << 3) + i7]).f3715a.f3711d.f3702d;
                        Object objM4272g = c2408e.m4272g(AbstractC1132s.f3725D);
                        if (objM4272g == null) {
                            objM4272g = null;
                        }
                        if (objM4272g != null) {
                            Object objM4272g2 = c2408e.m4272g(AbstractC1124k.f3689n);
                            C1114a c1114a = (C1114a) (objM4272g2 != null ? objM4272g2 : null);
                            if (c1114a != null && (interfaceC1599a = (InterfaceC1599a) c1114a.f3634b) != null) {
                            }
                        }
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return true;
                }
            }
            if (i5 == length) {
                return true;
            }
            i5++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onHideTranslation(View view) {
        InterfaceC1601c interfaceC1601c;
        AbstractC1665j.m2983c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC2369d contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f7686i = EnumC2366a.f7673d;
        AbstractC2428j abstractC2428jM4220g = contentCaptureManager$ui.m4220g();
        Object[] objArr = abstractC2428jM4220g.f7847c;
        long[] jArr = abstractC2428jM4220g.f7845a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        C2408E c2408e = ((C1129p) objArr[(i5 << 3) + i7]).f3715a.f3711d.f3702d;
                        Object objM4272g = c2408e.m4272g(AbstractC1132s.f3725D);
                        if (objM4272g == null) {
                            objM4272g = null;
                        }
                        if (AbstractC1665j.m2981a(objM4272g, Boolean.TRUE)) {
                            Object objM4272g2 = c2408e.m4272g(AbstractC1124k.f3688m);
                            C1114a c1114a = (C1114a) (objM4272g2 != null ? objM4272g2 : null);
                            if (c1114a != null && (interfaceC1601c = (InterfaceC1601c) c1114a.f3634b) != null) {
                            }
                        }
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return true;
                }
            }
            if (i5 == length) {
                return true;
            }
            i5++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onShowTranslation(View view) {
        InterfaceC1601c interfaceC1601c;
        AbstractC1665j.m2983c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC2369d contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f7686i = EnumC2366a.f7674e;
        AbstractC2428j abstractC2428jM4220g = contentCaptureManager$ui.m4220g();
        Object[] objArr = abstractC2428jM4220g.f7847c;
        long[] jArr = abstractC2428jM4220g.f7845a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        C2408E c2408e = ((C1129p) objArr[(i5 << 3) + i7]).f3715a.f3711d.f3702d;
                        Object objM4272g = c2408e.m4272g(AbstractC1132s.f3725D);
                        if (objM4272g == null) {
                            objM4272g = null;
                        }
                        if (AbstractC1665j.m2981a(objM4272g, Boolean.FALSE)) {
                            Object objM4272g2 = c2408e.m4272g(AbstractC1124k.f3688m);
                            C1114a c1114a = (C1114a) (objM4272g2 != null ? objM4272g2 : null);
                            if (c1114a != null && (interfaceC1601c = (InterfaceC1601c) c1114a.f3634b) != null) {
                            }
                        }
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return true;
                }
            }
            if (i5 == length) {
                return true;
            }
            i5++;
        }
    }
}
