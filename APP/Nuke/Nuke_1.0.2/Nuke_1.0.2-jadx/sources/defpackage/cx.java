package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cx implements ScrollCaptureCallback {
    public final qn2 a;
    public final d11 b;
    public final hh1 c;
    public final b7 d;
    public final s00 e;
    public final eu0 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cx(qn2 qn2Var, d11 d11Var, s00 s00Var, hh1 hh1Var, b7 b7Var) {
        this.a = qn2Var;
        this.b = d11Var;
        this.c = hh1Var;
        this.d = b7Var;
        this.e = new s00(s00Var.h.k(x80.i));
        this.f = new eu0(d11Var.d - d11Var.b, new bx(this, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(cx cxVar, ScrollCaptureSession scrollCaptureSession, d11 d11Var, u00 u00Var) {
        ax axVar;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionE;
        int i3;
        d11 d11Var2;
        int i4;
        int iD;
        int iD2;
        if (u00Var instanceof ax) {
            axVar = (ax) u00Var;
            int i5 = axVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                axVar.q = i5 - Integer.MIN_VALUE;
            } else {
                axVar = new ax(cxVar, u00Var);
            }
        }
        Object obj = axVar.o;
        int i6 = axVar.q;
        k20 k20Var = k20.h;
        if (i6 == 0) {
            fg1.T(obj);
            i = d11Var.b;
            i2 = d11Var.d;
            eu0 eu0Var = cxVar.f;
            axVar.k = scrollCaptureSession;
            axVar.l = d11Var;
            axVar.m = i;
            axVar.n = i2;
            axVar.q = 1;
            int i7 = eu0Var.a;
            if (i > i2) {
                s.c(vi0.h("Expected min=", i, " ≤ max=", i2));
                return null;
            }
            int i8 = i2 - i;
            if (i8 > i7) {
                s.c(vi0.h("Expected range (", i8, ") to be ≤ viewportSize=", i7));
                return null;
            }
            float f = i;
            float f2 = eu0Var.b;
            Object obj2 = a83.a;
            if (f < f2 || i2 > i7 + f2) {
                Object objB = eu0Var.b((((i8 / 2) + i) - (i7 / 2)) - f2, axVar);
                if (objB != k20Var) {
                    objB = obj2;
                }
                if (objB == k20Var) {
                    obj2 = objB;
                }
            }
            if (obj2 != k20Var) {
            }
            return k20Var;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = axVar.n;
            i4 = axVar.m;
            d11Var2 = axVar.l;
            scrollCaptureSessionE = l7.e(axVar.k);
            fg1.T(obj);
            eu0 eu0Var2 = cxVar.f;
            iD = ci0.D(i4 - gf1.Q(eu0Var2.b), 0, eu0Var2.a);
            eu0 eu0Var3 = cxVar.f;
            iD2 = ci0.D(i3 - gf1.Q(eu0Var3.b), 0, eu0Var3.a);
            int i9 = d11Var2.a;
            int i10 = d11Var2.c;
            if (iD != iD2) {
                return d11.e;
            }
            Canvas canvasLockHardwareCanvas = scrollCaptureSessionE.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-i9, -iD);
                d11 d11Var3 = cxVar.b;
                canvasLockHardwareCanvas.translate(-d11Var3.a, -d11Var3.b);
                cxVar.d.getRootView().draw(canvasLockHardwareCanvas);
                scrollCaptureSessionE.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                int iQ = gf1.Q(cxVar.f.b);
                return new d11(i9, iD + iQ, i10, iD2 + iQ);
            } catch (Throwable th) {
                scrollCaptureSessionE.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th;
            }
        }
        int i11 = axVar.n;
        int i12 = axVar.m;
        d11 d11Var4 = axVar.l;
        ScrollCaptureSession scrollCaptureSessionE2 = l7.e(axVar.k);
        fg1.T(obj);
        i = i12;
        d11Var = d11Var4;
        i2 = i11;
        scrollCaptureSession = scrollCaptureSessionE2;
        v6 v6Var = v6.z;
        axVar.k = scrollCaptureSession;
        axVar.l = d11Var;
        axVar.m = i;
        axVar.n = i2;
        axVar.q = 2;
        a20 a20Var = axVar.i;
        a20Var.getClass();
        if (qp0.A(a20Var).a(v6Var, axVar) != k20Var) {
            scrollCaptureSessionE = scrollCaptureSession;
            i3 = i2;
            d11Var2 = d11Var;
            i4 = i;
            eu0 eu0Var22 = cxVar.f;
            iD = ci0.D(i4 - gf1.Q(eu0Var22.b), 0, eu0Var22.a);
            eu0 eu0Var32 = cxVar.f;
            iD2 = ci0.D(i3 - gf1.Q(eu0Var32.b), 0, eu0Var32.a);
            int i92 = d11Var2.a;
            int i102 = d11Var2.c;
            if (iD != iD2) {
            }
        }
        return k20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureEnd(Runnable runnable) {
        p7.A(this.e, fo1.i, new a2(this, runnable, null, 11), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        zt2 zt2VarA = p7.A(this.e, null, new k9(this, scrollCaptureSession, rect, consumer, null, 3), 3);
        zt2VarA.t(new v5(8, cancellationSignal));
        cancellationSignal.setOnCancelListener(new dx(0, zt2VarA));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(rp0.n0(this.b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((nx1) this.c.i).setValue(Boolean.TRUE);
        runnable.run();
    }
}
