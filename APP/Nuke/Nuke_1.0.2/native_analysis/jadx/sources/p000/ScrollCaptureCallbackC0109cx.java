package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: renamed from: cx */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollCaptureCallbackC0109cx implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a */
    public final qn2 f1759a;

    /* JADX INFO: renamed from: b */
    public final d11 f1760b;

    /* JADX INFO: renamed from: c */
    public final hh1 f1761c;

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserverOnGlobalLayoutListenerC0045b7 f1762d;

    /* JADX INFO: renamed from: e */
    public final s00 f1763e;

    /* JADX INFO: renamed from: f */
    public final eu0 f1764f;

    public ScrollCaptureCallbackC0109cx(qn2 qn2Var, d11 d11Var, s00 s00Var, hh1 hh1Var, ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7) {
        this.f1759a = qn2Var;
        this.f1760b = d11Var;
        this.f1761c = hh1Var;
        this.f1762d = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        this.f1763e = new s00(s00Var.f9850h.mo14k(x80.f12872i));
        this.f1764f = new eu0(d11Var.f1810d - d11Var.f1808b, new C0071bx(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m911a(ScrollCaptureCallbackC0109cx scrollCaptureCallbackC0109cx, ScrollCaptureSession scrollCaptureSession, d11 d11Var, u00 u00Var) {
        C0034ax c0034ax;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionM2853e;
        int i3;
        d11 d11Var2;
        int i4;
        int iM779D;
        int iM779D2;
        if (u00Var instanceof C0034ax) {
            c0034ax = (C0034ax) u00Var;
            int i5 = c0034ax.f430q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0034ax.f430q = i5 - Integer.MIN_VALUE;
            } else {
                c0034ax = new C0034ax(scrollCaptureCallbackC0109cx, u00Var);
            }
        }
        Object obj = c0034ax.f428o;
        int i6 = c0034ax.f430q;
        k20 k20Var = k20.f5323h;
        if (i6 == 0) {
            fg1.m1627T(obj);
            i = d11Var.f1808b;
            i2 = d11Var.f1810d;
            eu0 eu0Var = scrollCaptureCallbackC0109cx.f1764f;
            c0034ax.f424k = scrollCaptureSession;
            c0034ax.f425l = d11Var;
            c0034ax.f426m = i;
            c0034ax.f427n = i2;
            c0034ax.f430q = 1;
            int i7 = eu0Var.f2641a;
            if (i > i2) {
                C0676s.m4645c(vi0.m5689h("Expected min=", i, " ≤ max=", i2));
                return null;
            }
            int i8 = i2 - i;
            if (i8 > i7) {
                C0676s.m4645c(vi0.m5689h("Expected range (", i8, ") to be ≤ viewportSize=", i7));
                return null;
            }
            float f = i;
            float f2 = eu0Var.f2642b;
            Object obj2 = a83.f116a;
            if (f < f2 || i2 > i7 + f2) {
                Object objM1478b = eu0Var.m1478b((((i8 / 2) + i) - (i7 / 2)) - f2, c0034ax);
                if (objM1478b != k20Var) {
                    objM1478b = obj2;
                }
                if (objM1478b == k20Var) {
                    obj2 = objM1478b;
                }
            }
            if (obj2 != k20Var) {
            }
            return k20Var;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = c0034ax.f427n;
            i4 = c0034ax.f426m;
            d11Var2 = c0034ax.f425l;
            scrollCaptureSessionM2853e = AbstractC0414l7.m2853e(c0034ax.f424k);
            fg1.m1627T(obj);
            eu0 eu0Var2 = scrollCaptureCallbackC0109cx.f1764f;
            iM779D = ci0.m779D(i4 - gf1.m1869Q(eu0Var2.f2642b), 0, eu0Var2.f2641a);
            eu0 eu0Var3 = scrollCaptureCallbackC0109cx.f1764f;
            iM779D2 = ci0.m779D(i3 - gf1.m1869Q(eu0Var3.f2642b), 0, eu0Var3.f2641a);
            int i9 = d11Var2.f1807a;
            int i10 = d11Var2.f1809c;
            if (iM779D != iM779D2) {
                return d11.f1806e;
            }
            Canvas canvasLockHardwareCanvas = scrollCaptureSessionM2853e.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-i9, -iM779D);
                d11 d11Var3 = scrollCaptureCallbackC0109cx.f1760b;
                canvasLockHardwareCanvas.translate(-d11Var3.f1807a, -d11Var3.f1808b);
                scrollCaptureCallbackC0109cx.f1762d.getRootView().draw(canvasLockHardwareCanvas);
                scrollCaptureSessionM2853e.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                int iM1869Q = gf1.m1869Q(scrollCaptureCallbackC0109cx.f1764f.f2642b);
                return new d11(i9, iM779D + iM1869Q, i10, iM779D2 + iM1869Q);
            } catch (Throwable th) {
                scrollCaptureSessionM2853e.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th;
            }
        }
        int i11 = c0034ax.f427n;
        int i12 = c0034ax.f426m;
        d11 d11Var4 = c0034ax.f425l;
        ScrollCaptureSession scrollCaptureSessionM2853e2 = AbstractC0414l7.m2853e(c0034ax.f424k);
        fg1.m1627T(obj);
        i = i12;
        d11Var = d11Var4;
        i2 = i11;
        scrollCaptureSession = scrollCaptureSessionM2853e2;
        C0799v6 c0799v6 = C0799v6.f11777z;
        c0034ax.f424k = scrollCaptureSession;
        c0034ax.f425l = d11Var;
        c0034ax.f426m = i;
        c0034ax.f427n = i2;
        c0034ax.f430q = 2;
        a20 a20Var = c0034ax.f11029i;
        a20Var.getClass();
        if (qp0.m4220A(a20Var).m6080a(c0799v6, c0034ax) != k20Var) {
            scrollCaptureSessionM2853e = scrollCaptureSession;
            i3 = i2;
            d11Var2 = d11Var;
            i4 = i;
            eu0 eu0Var22 = scrollCaptureCallbackC0109cx.f1764f;
            iM779D = ci0.m779D(i4 - gf1.m1869Q(eu0Var22.f2642b), 0, eu0Var22.f2641a);
            eu0 eu0Var32 = scrollCaptureCallbackC0109cx.f1764f;
            iM779D2 = ci0.m779D(i3 - gf1.m1869Q(eu0Var32.f2642b), 0, eu0Var32.f2641a);
            int i92 = d11Var2.f1807a;
            int i102 = d11Var2.f1809c;
            if (iM779D != iM779D2) {
            }
        }
        return k20Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC0570p7.m3745A(this.f1763e, fo1.f3079i, new C0003a2(this, runnable, null, 11), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        zt2 zt2VarM3745A = AbstractC0570p7.m3745A(this.f1763e, null, new C0379k9(this, scrollCaptureSession, rect, consumer, null, 3), 3);
        zt2VarM3745A.mo1707t(new C0798v5(8, cancellationSignal));
        cancellationSignal.setOnCancelListener(new C0145dx(0, zt2VarM3745A));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(rp0.m4553n0(this.f1760b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f1764f.f2642b = 0.0f;
        ((nx1) this.f1761c.f4019i).setValue(Boolean.TRUE);
        runnable.run();
    }
}
