package p357y1;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import gg.AbstractC1416l;
import p002a1.EnumC0004b;
import p002a1.ViewOnAttachStateChangeListenerC0011i;
import p069f.AbstractC0942k;
import p069f.C0943k0;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1058u;
import p072f2.C1038a;
import p072f2.C1055r;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: y1.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC5867c0 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a */
    public static final ViewTranslationCallbackC5867c0 f23831a = new ViewTranslationCallbackC5867c0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onClearTranslation(View view) {
        InterfaceC1220a interfaceC1220a;
        view.getClass();
        ViewOnAttachStateChangeListenerC0011i contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f33l = EnumC0004b.f12g;
        AbstractC0942k abstractC0942kM157h = contentCaptureManager$ui.m157h();
        Object[] objArr = abstractC0942kM157h.f2965c;
        long[] jArr = abstractC0942kM157h.f2963a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i9 = 0;
        while (true) {
            long j3 = jArr[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j3) < 128) {
                        C0943k0 c0943k0 = ((C1055r) objArr[(i9 << 3) + i11]).f3353a.f3350d.f3341g;
                        Object objM2320g = c0943k0.m2320g(AbstractC1058u.f3363D);
                        if (objM2320g == null) {
                            objM2320g = null;
                        }
                        if (objM2320g != null) {
                            Object objM2320g2 = c0943k0.m2320g(AbstractC1049l.f3328n);
                            C1038a c1038a = (C1038a) (objM2320g2 != null ? objM2320g2 : null);
                            if (c1038a != null && (interfaceC1220a = (InterfaceC1220a) c1038a.f3270b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i9 == length) {
                return true;
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onHideTranslation(View view) {
        InterfaceC1231l interfaceC1231l;
        view.getClass();
        ViewOnAttachStateChangeListenerC0011i contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f33l = EnumC0004b.f12g;
        AbstractC0942k abstractC0942kM157h = contentCaptureManager$ui.m157h();
        Object[] objArr = abstractC0942kM157h.f2965c;
        long[] jArr = abstractC0942kM157h.f2963a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i9 = 0;
        while (true) {
            long j3 = jArr[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j3) < 128) {
                        C0943k0 c0943k0 = ((C1055r) objArr[(i9 << 3) + i11]).f3353a.f3350d.f3341g;
                        Object objM2320g = c0943k0.m2320g(AbstractC1058u.f3363D);
                        if (objM2320g == null) {
                            objM2320g = null;
                        }
                        if (AbstractC1416l.m3825a(objM2320g, Boolean.TRUE)) {
                            Object objM2320g2 = c0943k0.m2320g(AbstractC1049l.f3327m);
                            C1038a c1038a = (C1038a) (objM2320g2 != null ? objM2320g2 : null);
                            if (c1038a != null && (interfaceC1231l = (InterfaceC1231l) c1038a.f3270b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i9 == length) {
                return true;
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onShowTranslation(View view) {
        InterfaceC1231l interfaceC1231l;
        view.getClass();
        ViewOnAttachStateChangeListenerC0011i contentCaptureManager$ui = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f33l = EnumC0004b.f13h;
        AbstractC0942k abstractC0942kM157h = contentCaptureManager$ui.m157h();
        Object[] objArr = abstractC0942kM157h.f2965c;
        long[] jArr = abstractC0942kM157h.f2963a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i9 = 0;
        while (true) {
            long j3 = jArr[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j3) < 128) {
                        C0943k0 c0943k0 = ((C1055r) objArr[(i9 << 3) + i11]).f3353a.f3350d.f3341g;
                        Object objM2320g = c0943k0.m2320g(AbstractC1058u.f3363D);
                        if (objM2320g == null) {
                            objM2320g = null;
                        }
                        if (AbstractC1416l.m3825a(objM2320g, Boolean.FALSE)) {
                            Object objM2320g2 = c0943k0.m2320g(AbstractC1049l.f3327m);
                            C1038a c1038a = (C1038a) (objM2320g2 != null ? objM2320g2 : null);
                            if (c1038a != null && (interfaceC1231l = (InterfaceC1231l) c1038a.f3270b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i9 == length) {
                return true;
            }
            i9++;
        }
    }
}
