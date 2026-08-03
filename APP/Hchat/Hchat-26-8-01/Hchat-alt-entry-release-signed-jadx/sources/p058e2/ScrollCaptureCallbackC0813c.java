package p058e2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.lifecycle.C0119x;
import ci.C0579e;
import ci.C0589j;
import ci.C0596m0;
import java.util.function.Consumer;
import p002a1.AbstractC0005c;
import p016b1.C0166f;
import p071f1.AbstractC0996c0;
import p072f2.C1054q;
import p077f8.AbstractC1089i;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p222p.AbstractC3199a;
import p249qg.AbstractC3603v;
import p249qg.C3551b1;
import p249qg.C3560e1;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p293u2.C4241k;
import p352xf.EnumC5799a;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import p370yf.AbstractC6038c;
import vg.C4554c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: e2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollCaptureCallbackC0813c implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a */
    public final C1054q f2440a;

    /* JADX INFO: renamed from: b */
    public final C4241k f2441b;

    /* JADX INFO: renamed from: c */
    public final C0119x f2442c;

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserverOnGlobalLayoutListenerC5934t f2443d;

    /* JADX INFO: renamed from: e */
    public final C4554c f2444e;

    /* JADX INFO: renamed from: f */
    public final C0817g f2445f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ScrollCaptureCallbackC0813c(C1054q c1054q, C4241k c4241k, C4554c c4554c, C0119x c0119x, ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t) {
        this.f2440a = c1054q;
        this.f2441b = c4241k;
        this.f2442c = c0119x;
        this.f2443d = viewTreeObserverOnGlobalLayoutListenerC5934t;
        this.f2444e = new C4554c(c4554c.f15022g.mo2059e(C0815e.f2448g));
        this.f2445f = new C0817g(c4241k.m8532a(), new C0596m0(this, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2058a(ScrollCaptureCallbackC0813c scrollCaptureCallbackC0813c, ScrollCaptureSession scrollCaptureSession, C4241k c4241k, AbstractC6038c abstractC6038c) {
        C0811a c0811a;
        int i9;
        int i10;
        ScrollCaptureSession scrollCaptureSessionM126j;
        int i11;
        C4241k c4241k2;
        int i12;
        int iM7909r;
        int iM7909r2;
        if (abstractC6038c instanceof C0811a) {
            c0811a = (C0811a) abstractC6038c;
            int i13 = c0811a.f2435m;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0811a.f2435m = i13 - Integer.MIN_VALUE;
            } else {
                c0811a = new C0811a(scrollCaptureCallbackC0813c, abstractC6038c);
            }
        }
        Object obj = c0811a.f2433k;
        int i14 = c0811a.f2435m;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i14 == 0) {
            AbstractC1089i.m2732I0(obj);
            i9 = c4241k.f13915b;
            i10 = c4241k.f13917d;
            C0817g c0817g = scrollCaptureCallbackC0813c.f2445f;
            c0811a.f2429g = scrollCaptureSession;
            c0811a.f2430h = c4241k;
            c0811a.f2431i = i9;
            c0811a.f2432j = i10;
            c0811a.f2435m = 1;
            int i15 = c0817g.f2452a;
            if (i9 > i10) {
                C2104o.m5291q(AbstractC3199a.m6837j(i9, "Expected min=", " ≤ max=", i10));
                return null;
            }
            int i16 = i10 - i9;
            if (i16 > i15) {
                C2104o.m5291q(AbstractC3199a.m6837j(i16, "Expected range (", ") to be ≤ viewportSize=", i15));
                return null;
            }
            float f3 = i9;
            float f10 = c0817g.f2453b;
            Object obj2 = C3967n.f12976a;
            if (f3 < f10 || i10 > i15 + f10) {
                Object objM2065b = c0817g.m2065b((((i16 / 2) + i9) - (i15 / 2)) - f10, c0811a);
                if (objM2065b != enumC5799a) {
                    objM2065b = obj2;
                }
                if (objM2065b == enumC5799a) {
                    obj2 = objM2065b;
                }
            }
            if (obj2 != enumC5799a) {
            }
            return enumC5799a;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i11 = c0811a.f2432j;
            i12 = c0811a.f2431i;
            c4241k2 = c0811a.f2430h;
            scrollCaptureSessionM126j = AbstractC0005c.m126j(c0811a.f2429g);
            AbstractC1089i.m2732I0(obj);
            C0817g c0817g2 = scrollCaptureCallbackC0813c.f2445f;
            iM7909r = AbstractC3754e0.m7909r(i12 - AbstractC2043a.m5018X(c0817g2.f2453b), 0, c0817g2.f2452a);
            C0817g c0817g3 = scrollCaptureCallbackC0813c.f2445f;
            iM7909r2 = AbstractC3754e0.m7909r(i11 - AbstractC2043a.m5018X(c0817g3.f2453b), 0, c0817g3.f2452a);
            int i17 = c4241k2.f13914a;
            int i18 = c4241k2.f13916c;
            if (iM7909r != iM7909r2) {
                return C4241k.f13913e;
            }
            Canvas canvasLockHardwareCanvas = scrollCaptureSessionM126j.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-i17, -iM7909r);
                C4241k c4241k3 = scrollCaptureCallbackC0813c.f2441b;
                canvasLockHardwareCanvas.translate(-c4241k3.f13914a, -c4241k3.f13915b);
                scrollCaptureCallbackC0813c.f2443d.getRootView().draw(canvasLockHardwareCanvas);
                scrollCaptureSessionM126j.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                int iM5018X = AbstractC2043a.m5018X(scrollCaptureCallbackC0813c.f2445f.f2453b);
                return new C4241k(i17, iM7909r + iM5018X, i18, iM7909r2 + iM5018X);
            } catch (Throwable th2) {
                scrollCaptureSessionM126j.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th2;
            }
        }
        int i19 = c0811a.f2432j;
        int i20 = c0811a.f2431i;
        C4241k c4241k4 = c0811a.f2430h;
        ScrollCaptureSession scrollCaptureSessionM126j2 = AbstractC0005c.m126j(c0811a.f2429g);
        AbstractC1089i.m2732I0(obj);
        i9 = i20;
        c4241k = c4241k4;
        i10 = i19;
        scrollCaptureSession = scrollCaptureSessionM126j2;
        C0812b c0812b = C0812b.f2436h;
        c0811a.f2429g = scrollCaptureSession;
        c0811a.f2430h = c4241k;
        c0811a.f2431i = i9;
        c0811a.f2432j = i10;
        c0811a.f2435m = 2;
        if (AbstractC1874r.m4637s(c0811a.getContext()).m4458d(c0812b, c0811a) != enumC5799a) {
            scrollCaptureSessionM126j = scrollCaptureSession;
            i11 = i10;
            c4241k2 = c4241k;
            i12 = i9;
            C0817g c0817g22 = scrollCaptureCallbackC0813c.f2445f;
            iM7909r = AbstractC3754e0.m7909r(i12 - AbstractC2043a.m5018X(c0817g22.f2453b), 0, c0817g22.f2452a);
            C0817g c0817g32 = scrollCaptureCallbackC0813c.f2445f;
            iM7909r2 = AbstractC3754e0.m7909r(i11 - AbstractC2043a.m5018X(c0817g32.f2453b), 0, c0817g32.f2452a);
            int i172 = c4241k2.f13914a;
            int i182 = c4241k2.f13916c;
            if (iM7909r != iM7909r2) {
            }
        }
        return enumC5799a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC3603v.m7563q(this.f2444e, C3551b1.f11552h, new C0589j(this, runnable, (InterfaceC5557c) null, 1), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        C3560e1 c3560e1M7563q = AbstractC3603v.m7563q(this.f2444e, null, new C0579e(this, scrollCaptureSession, rect, consumer, null, 1), 3);
        c3560e1M7563q.mo7491o(new C0166f(cancellationSignal, 3));
        cancellationSignal.setOnCancelListener(new C0814d(c3560e1M7563q, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC0996c0.m2523t(this.f2441b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f2445f.f2453b = 0.0f;
        ((C1845j1) this.f2442c.f310h).setValue(Boolean.TRUE);
        runnable.run();
    }
}
