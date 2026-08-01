package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ai */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollCaptureCallbackC0019ai implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a */
    public final xz0 f169a;

    /* JADX INFO: renamed from: b */
    public final a30 f170b;

    /* JADX INFO: renamed from: c */
    public final i90 f171c;

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserverOnGlobalLayoutListenerC0875w3 f172d;

    /* JADX INFO: renamed from: e */
    public final C0286hk f173e;

    /* JADX INFO: renamed from: f */
    public final hu0 f174f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ScrollCaptureCallbackC0019ai(xz0 xz0Var, a30 a30Var, C0286hk c0286hk, i90 i90Var, ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3) {
        this.f169a = xz0Var;
        this.f170b = a30Var;
        this.f171c = i90Var;
        this.f172d = viewTreeObserverOnGlobalLayoutListenerC0875w3;
        this.f173e = new C0286hk(c0286hk.f2274d.mo63h(C0099co.f863e));
        this.f174f = new hu0(a30Var.f42d - a30Var.f40b, new h81(this, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (r10 == r5) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m175a(ScrollCaptureCallbackC0019ai scrollCaptureCallbackC0019ai, ScrollCaptureSession scrollCaptureSession, a30 a30Var, AbstractC0358jk abstractC0358jk) {
        C1004zh c1004zh;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionM1012j;
        int i3;
        a30 a30Var2;
        int i4;
        C0601p3 c0601p3;
        ScrollCaptureSession scrollCaptureSessionM1012j2;
        int iM4907n;
        int iM4907n2;
        if (abstractC0358jk instanceof C1004zh) {
            c1004zh = (C1004zh) abstractC0358jk;
            int i5 = c1004zh.f7899m;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c1004zh.f7899m = i5 - Integer.MIN_VALUE;
            } else {
                c1004zh = new C1004zh(scrollCaptureCallbackC0019ai, abstractC0358jk);
            }
        }
        Object obj = c1004zh.f7897k;
        int i6 = c1004zh.f7899m;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i6 == 0) {
            w60.m4891M(obj);
            i = a30Var.f40b;
            i2 = a30Var.f42d;
            hu0 hu0Var = scrollCaptureCallbackC0019ai.f174f;
            c1004zh.f7893g = scrollCaptureSession;
            c1004zh.f7894h = a30Var;
            c1004zh.f7895i = i;
            c1004zh.f7896j = i2;
            c1004zh.f7899m = 1;
            int i7 = hu0Var.f2366a;
            if (i > i2) {
                throw new IllegalArgumentException(AbstractC0748t1.m4153k(i, i2, "Expected min=", " ≤ max=").toString());
            }
            int i8 = i2 - i;
            if (i8 > i7) {
                throw new IllegalArgumentException(AbstractC0748t1.m4153k(i8, i7, "Expected range (", ") to be ≤ viewportSize=").toString());
            }
            float f = i;
            float f2 = hu0Var.f2368c;
            Object obj2 = na1.f4229a;
            if (f < f2 || i2 > i7 + f2) {
                Object objM1507a = hu0Var.m1507a((((i8 / 2) + i) - (i7 / 2)) - f2, c1004zh);
                if (objM1507a != enumC1007zk) {
                    objM1507a = obj2;
                }
                if (objM1507a == enumC1007zk) {
                    obj2 = objM1507a;
                }
            }
        } else {
            if (i6 != 1) {
                if (i6 == 2) {
                    i3 = c1004zh.f7896j;
                    i4 = c1004zh.f7895i;
                    a30Var2 = c1004zh.f7894h;
                    scrollCaptureSessionM1012j = AbstractC0195f3.m1012j(c1004zh.f7893g);
                    w60.m4891M(obj);
                    c0601p3 = C0601p3.f4717k;
                    c1004zh.f7893g = scrollCaptureSessionM1012j;
                    c1004zh.f7894h = a30Var2;
                    c1004zh.f7895i = i4;
                    c1004zh.f7896j = i3;
                    c1004zh.f7899m = 3;
                    if (v50.m4406l(c1004zh.mo540e()).m4008c(c0601p3, c1004zh) != enumC1007zk) {
                        scrollCaptureSessionM1012j2 = scrollCaptureSessionM1012j;
                        hu0 hu0Var2 = scrollCaptureCallbackC0019ai.f174f;
                        iM4907n = w60.m4907n(i4 - rd0.m3458Q(hu0Var2.f2368c), 0, hu0Var2.f2366a);
                        hu0 hu0Var3 = scrollCaptureCallbackC0019ai.f174f;
                        iM4907n2 = w60.m4907n(i3 - rd0.m3458Q(hu0Var3.f2368c), 0, hu0Var3.f2366a);
                        int i9 = a30Var2.f39a;
                        int i10 = a30Var2.f41c;
                        if (iM4907n != iM4907n2) {
                        }
                    }
                    return enumC1007zk;
                }
                if (i6 != 3) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = c1004zh.f7896j;
                i4 = c1004zh.f7895i;
                a30Var2 = c1004zh.f7894h;
                scrollCaptureSessionM1012j2 = AbstractC0195f3.m1012j(c1004zh.f7893g);
                w60.m4891M(obj);
                hu0 hu0Var22 = scrollCaptureCallbackC0019ai.f174f;
                iM4907n = w60.m4907n(i4 - rd0.m3458Q(hu0Var22.f2368c), 0, hu0Var22.f2366a);
                hu0 hu0Var32 = scrollCaptureCallbackC0019ai.f174f;
                iM4907n2 = w60.m4907n(i3 - rd0.m3458Q(hu0Var32.f2368c), 0, hu0Var32.f2366a);
                int i92 = a30Var2.f39a;
                int i102 = a30Var2.f41c;
                if (iM4907n != iM4907n2) {
                    return a30.f38e;
                }
                Canvas canvasLockHardwareCanvas = scrollCaptureSessionM1012j2.getSurface().lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.save();
                    canvasLockHardwareCanvas.translate(-i92, -iM4907n);
                    a30 a30Var3 = scrollCaptureCallbackC0019ai.f170b;
                    canvasLockHardwareCanvas.translate(-a30Var3.f39a, -a30Var3.f40b);
                    scrollCaptureCallbackC0019ai.f172d.getRootView().draw(canvasLockHardwareCanvas);
                    scrollCaptureSessionM1012j2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                    int iM3458Q = rd0.m3458Q(scrollCaptureCallbackC0019ai.f174f.f2368c);
                    return new a30(i92, iM4907n + iM3458Q, i102, iM4907n2 + iM3458Q);
                } catch (Throwable th) {
                    scrollCaptureSessionM1012j2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                    throw th;
                }
            }
            int i11 = c1004zh.f7896j;
            int i12 = c1004zh.f7895i;
            a30 a30Var4 = c1004zh.f7894h;
            ScrollCaptureSession scrollCaptureSessionM1012j3 = AbstractC0195f3.m1012j(c1004zh.f7893g);
            w60.m4891M(obj);
            i = i12;
            a30Var = a30Var4;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSessionM1012j3;
        }
        scrollCaptureSessionM1012j = scrollCaptureSession;
        i3 = i2;
        a30Var2 = a30Var;
        i4 = i;
        c0601p3 = C0601p3.f4717k;
        c1004zh.f7893g = scrollCaptureSessionM1012j;
        c1004zh.f7894h = a30Var2;
        c1004zh.f7895i = i4;
        c1004zh.f7896j = i3;
        c1004zh.f7899m = 3;
        if (v50.m4406l(c1004zh.mo540e()).m4008c(c0601p3, c1004zh) != enumC1007zk) {
        }
        return enumC1007zk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC0307i4.m1547w(this.f173e, wj0.f7137e, new C0154e(this, runnable, null, 4), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final r31 r31VarM1547w = AbstractC0307i4.m1547w(this.f173e, null, new C0119d7(this, scrollCaptureSession, rect, consumer, null, 1), 3);
        r31VarM1547w.mo482r(new C0711s2(7, cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: bi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                r31VarM1547w.mo478a(null);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(u50.m4258B(this.f170b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f174f.f2368c = 0.0f;
        this.f171c.f2490a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
