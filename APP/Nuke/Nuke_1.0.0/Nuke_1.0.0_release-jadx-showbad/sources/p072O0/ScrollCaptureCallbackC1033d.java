package p072O0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import com.bumptech.glide.AbstractC1926h;
import java.util.function.Consumer;
import p000A.C0039U;
import p000A.C0066i0;
import p007B0.C0172E;
import p011B4.AbstractC0231b;
import p047I0.AbstractC0740k;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p051J.C0810b;
import p051J.C0820l;
import p056K2.C0891q;
import p074O2.InterfaceC1051i;
import p077P0.C1128o;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p095T.AbstractC1385s;
import p095T.C1366i0;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p153e1.C2015k;
import p160f3.AbstractC2162v;
import p160f3.C2128c0;
import p160f3.C2136g0;
import p190k3.C2455c;
import p211o0.AbstractC2767z;

/* JADX INFO: renamed from: O0.d */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollCaptureCallbackC1033d implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a */
    public final C1128o f3218a;

    /* JADX INFO: renamed from: b */
    public final C2015k f3219b;

    /* JADX INFO: renamed from: c */
    public final C0066i0 f3220c;

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772y f3221d;

    /* JADX INFO: renamed from: e */
    public final C2455c f3222e;

    /* JADX INFO: renamed from: f */
    public final C1036g f3223f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ScrollCaptureCallbackC1033d(C1128o c1128o, C2015k c2015k, C2455c c2455c, C0066i0 c0066i0, ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y) {
        this.f3218a = c1128o;
        this.f3219b = c2015k;
        this.f3220c = c0066i0;
        this.f3221d = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f3222e = new C2455c(c2455c.f7926d.mo1168m(C1034e.f3224d));
        this.f3223f = new C1036g(c2015k.f6740d - c2015k.f6738b, new C1032c(this, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r10 == r5) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2110a(ScrollCaptureCallbackC1033d scrollCaptureCallbackC1033d, ScrollCaptureSession scrollCaptureSession, C2015k c2015k, AbstractC1178c abstractC1178c) {
        C1030a c1030a;
        int i5;
        int i6;
        ScrollCaptureSession scrollCaptureSessionM1244h;
        int i7;
        C2015k c2015k2;
        int i8;
        C1031b c1031b;
        InterfaceC1051i interfaceC1051i;
        ScrollCaptureSession scrollCaptureSessionM1244h2;
        int iM3568k;
        int iM3568k2;
        if (abstractC1178c instanceof C1030a) {
            c1030a = (C1030a) abstractC1178c;
            int i9 = c1030a.f3210m;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1030a.f3210m = i9 - Integer.MIN_VALUE;
            } else {
                c1030a = new C1030a(scrollCaptureCallbackC1033d, abstractC1178c);
            }
        }
        Object obj = c1030a.f3208k;
        int i10 = c1030a.f3210m;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i10 == 0) {
            AbstractC1784a.m3205S(obj);
            i5 = c2015k.f6738b;
            i6 = c2015k.f6740d;
            C1036g c1036g = scrollCaptureCallbackC1033d.f3223f;
            c1030a.f3204g = scrollCaptureSession;
            c1030a.f3205h = c2015k;
            c1030a.f3206i = i5;
            c1030a.f3207j = i6;
            c1030a.f3210m = 1;
            int i11 = c1036g.f3228a;
            if (i5 > i6) {
                throw new IllegalArgumentException(AbstractC0231b.m399j("Expected min=", i5, " ≤ max=", i6).toString());
            }
            int i12 = i6 - i5;
            if (i12 > i11) {
                throw new IllegalArgumentException(AbstractC0231b.m399j("Expected range (", i12, ") to be ≤ viewportSize=", i11).toString());
            }
            float f2 = i5;
            float f5 = c1036g.f3229b;
            Object obj2 = C0891q.f2780a;
            if (f2 < f5 || i6 > i11 + f5) {
                Object objM2112b = c1036g.m2112b((((i12 / 2) + i5) - (i11 / 2)) - f5, c1030a);
                if (objM2112b != enumC1152a) {
                    objM2112b = obj2;
                }
                if (objM2112b == enumC1152a) {
                    obj2 = objM2112b;
                }
            }
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    i7 = c1030a.f3207j;
                    i8 = c1030a.f3206i;
                    c2015k2 = c1030a.f3205h;
                    scrollCaptureSessionM1244h = AbstractC0740k.m1244h(c1030a.f3204g);
                    AbstractC1784a.m3205S(obj);
                    c1031b = C1031b.f3211f;
                    c1030a.f3204g = scrollCaptureSessionM1244h;
                    c1030a.f3205h = c2015k2;
                    c1030a.f3206i = i8;
                    c1030a.f3207j = i7;
                    c1030a.f3210m = 3;
                    interfaceC1051i = c1030a.f3866e;
                    AbstractC1665j.m2982b(interfaceC1051i);
                    if (AbstractC1385s.m2626p(interfaceC1051i).m1209a(c1031b, c1030a) != enumC1152a) {
                        scrollCaptureSessionM1244h2 = scrollCaptureSessionM1244h;
                        C1036g c1036g2 = scrollCaptureCallbackC1033d.f3223f;
                        iM3568k = AbstractC1926h.m3568k(i8 - AbstractC1784a.m3200N(c1036g2.f3229b), 0, c1036g2.f3228a);
                        C1036g c1036g3 = scrollCaptureCallbackC1033d.f3223f;
                        iM3568k2 = AbstractC1926h.m3568k(i7 - AbstractC1784a.m3200N(c1036g3.f3229b), 0, c1036g3.f3228a);
                        int i13 = c2015k2.f6737a;
                        int i14 = c2015k2.f6739c;
                        if (iM3568k != iM3568k2) {
                        }
                    }
                    return enumC1152a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i7 = c1030a.f3207j;
                i8 = c1030a.f3206i;
                c2015k2 = c1030a.f3205h;
                scrollCaptureSessionM1244h2 = AbstractC0740k.m1244h(c1030a.f3204g);
                AbstractC1784a.m3205S(obj);
                C1036g c1036g22 = scrollCaptureCallbackC1033d.f3223f;
                iM3568k = AbstractC1926h.m3568k(i8 - AbstractC1784a.m3200N(c1036g22.f3229b), 0, c1036g22.f3228a);
                C1036g c1036g32 = scrollCaptureCallbackC1033d.f3223f;
                iM3568k2 = AbstractC1926h.m3568k(i7 - AbstractC1784a.m3200N(c1036g32.f3229b), 0, c1036g32.f3228a);
                int i132 = c2015k2.f6737a;
                int i142 = c2015k2.f6739c;
                if (iM3568k != iM3568k2) {
                    return C2015k.f6736e;
                }
                Canvas canvasLockHardwareCanvas = scrollCaptureSessionM1244h2.getSurface().lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.save();
                    canvasLockHardwareCanvas.translate(-i132, -iM3568k);
                    C2015k c2015k3 = scrollCaptureCallbackC1033d.f3219b;
                    canvasLockHardwareCanvas.translate(-c2015k3.f6737a, -c2015k3.f6738b);
                    scrollCaptureCallbackC1033d.f3221d.getRootView().draw(canvasLockHardwareCanvas);
                    scrollCaptureSessionM1244h2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                    int iM3200N = AbstractC1784a.m3200N(scrollCaptureCallbackC1033d.f3223f.f3229b);
                    return new C2015k(i132, iM3568k + iM3200N, i142, iM3568k2 + iM3200N);
                } catch (Throwable th) {
                    scrollCaptureSessionM1244h2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                    throw th;
                }
            }
            int i15 = c1030a.f3207j;
            int i16 = c1030a.f3206i;
            C2015k c2015k4 = c1030a.f3205h;
            ScrollCaptureSession scrollCaptureSessionM1244h3 = AbstractC0740k.m1244h(c1030a.f3204g);
            AbstractC1784a.m3205S(obj);
            i5 = i16;
            c2015k = c2015k4;
            i6 = i15;
            scrollCaptureSession = scrollCaptureSessionM1244h3;
        }
        scrollCaptureSessionM1244h = scrollCaptureSession;
        i7 = i6;
        c2015k2 = c2015k;
        i8 = i5;
        c1031b = C1031b.f3211f;
        c1030a.f3204g = scrollCaptureSessionM1244h;
        c1030a.f3205h = c2015k2;
        c1030a.f3206i = i8;
        c1030a.f3207j = i7;
        c1030a.f3210m = 3;
        interfaceC1051i = c1030a.f3866e;
        AbstractC1665j.m2982b(interfaceC1051i);
        if (AbstractC1385s.m2626p(interfaceC1051i).m1209a(c1031b, c1030a) != enumC1152a) {
        }
        return enumC1152a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC2162v.m3994p(this.f3222e, C2128c0.f7069e, new C0039U(this, runnable, null, 10), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        C2136g0 c2136g0M3994p = AbstractC2162v.m3994p(this.f3222e, null, new C0810b(this, scrollCaptureSession, rect, consumer, null, 2), 3);
        c2136g0M3994p.mo3909w(new C0172E(12, cancellationSignal));
        cancellationSignal.setOnCancelListener(new C0820l(1, c2136g0M3994p));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC2767z.m4949t(this.f3219b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f3223f.f3229b = 0.0f;
        ((C1366i0) this.f3220c.f297e).setValue(Boolean.TRUE);
        runnable.run();
    }
}
