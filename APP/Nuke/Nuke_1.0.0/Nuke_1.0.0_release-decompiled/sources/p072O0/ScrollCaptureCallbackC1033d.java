package p072O0;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import p000A.C0039U;
import p000A.C0066i0;
import p007B0.C0172E;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p051J.C0810b;
import p051J.C0820l;
import p077P0.C1128o;
import p095T.C1366i0;
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

    public ScrollCaptureCallbackC1033d(C1128o c1128o, C2015k c2015k, C2455c c2455c, C0066i0 c0066i0, ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y) {
        this.f3218a = c1128o;
        this.f3219b = c2015k;
        this.f3220c = c0066i0;
        this.f3221d = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f3222e = new C2455c(c2455c.f7926d.mo1168m(C1034e.f3224d));
        this.f3223f = new C1036g(c2015k.f6740d - c2015k.f6738b, new C1032c(this, null));
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2110a(p072O0.ScrollCaptureCallbackC1033d r12, android.view.ScrollCaptureSession r13, p153e1.C2015k r14, p084Q2.AbstractC1178c r15) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p072O0.ScrollCaptureCallbackC1033d.m2110a(O0.d, android.view.ScrollCaptureSession, e1.k, Q2.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC2162v.m3994p(this.f3222e, C2128c0.f7069e, new C0039U(this, runnable, null, 10), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        C2136g0 c2136g0M3994p = AbstractC2162v.m3994p(this.f3222e, null, new C0810b(this, scrollCaptureSession, rect, consumer, null, 2), 3);
        c2136g0M3994p.mo3909w(new C0172E(12, cancellationSignal));
        cancellationSignal.setOnCancelListener(new C0820l(1, c2136g0M3994p));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC2767z.m4949t(this.f3219b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f3223f.f3229b = 0.0f;
        ((C1366i0) this.f3220c.f297e).setValue(Boolean.TRUE);
        runnable.run();
    }
}
