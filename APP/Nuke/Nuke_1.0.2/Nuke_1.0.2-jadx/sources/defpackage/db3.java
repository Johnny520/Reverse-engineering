package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class db3 extends View {
    public static final o80 r = new o80(2);
    public final kc0 h;
    public final tp i;
    public final sp j;
    public boolean k;
    public Outline l;
    public boolean m;
    public e70 n;
    public d61 o;
    public in0 p;
    public pq0 q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public db3(kc0 kc0Var, tp tpVar, sp spVar) {
        super(kc0Var.getContext());
        this.h = kc0Var;
        this.i = tpVar;
        this.j = spVar;
        setOutlineProvider(r);
        this.m = true;
        this.n = pp0.c;
        this.o = d61.h;
        rq0.a.getClass();
        this.p = oq0.k;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        tp tpVar = this.i;
        f6 f6Var = tpVar.a;
        Canvas canvas2 = f6Var.a;
        f6Var.a = canvas;
        e70 e70Var = this.n;
        d61 d61Var = this.o;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        pq0 pq0Var = this.q;
        in0 in0Var = this.p;
        sp spVar = this.j;
        b5 b5Var = spVar.i;
        rp rpVar = ((sp) b5Var.k).h;
        e70 e70Var2 = rpVar.a;
        d61 d61Var2 = rpVar.b;
        qp qpVarQ = b5Var.q();
        b5 b5Var2 = spVar.i;
        long jU = b5Var2.u();
        pq0 pq0Var2 = (pq0) b5Var2.j;
        b5Var2.C(e70Var);
        b5Var2.D(d61Var);
        b5Var2.B(f6Var);
        b5Var2.E(jFloatToRawIntBits);
        b5Var2.j = pq0Var;
        f6Var.l();
        try {
            in0Var.j(spVar);
            f6Var.i();
            b5Var2.C(e70Var2);
            b5Var2.D(d61Var2);
            b5Var2.B(qpVarQ);
            b5Var2.E(jU);
            b5Var2.j = pq0Var2;
            tpVar.a.a = canvas2;
            this.k = false;
        } catch (Throwable th) {
            f6Var.i();
            b5Var2.C(e70Var2);
            b5Var2.D(d61Var2);
            b5Var2.B(qpVarQ);
            b5Var2.E(jU);
            b5Var2.j = pq0Var2;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final tp getCanvasHolder() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getOwnerView() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void invalidate() {
        if (this.k) {
            return;
        }
        this.k = true;
        super.invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.m != z) {
            this.m = z;
            invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setInvalidated(boolean z) {
        this.k = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
