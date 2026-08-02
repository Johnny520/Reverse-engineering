package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class po extends th1 implements os1, rn, mc0 {
    public final qo v;
    public boolean w;
    public in0 x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public po(qo qoVar, in0 in0Var) {
        this.v = qoVar;
        this.x = in0Var;
        qoVar.h = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void G0() {
        M0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.os1
    public final void L() {
        M0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M0() {
        this.w = false;
        this.v.i = null;
        ci0.M(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mc0
    public final void P(t61 t61Var) {
        boolean z = this.w;
        qo qoVar = this.v;
        if (!z) {
            qoVar.i = null;
            s11.S(this, new t6(3, this, qoVar));
            if (qoVar.i == null) {
                throw vi0.e("DrawResult not defined, did you forget to call onDraw?");
            }
            this.w = true;
        }
        n4 n4Var = qoVar.i;
        n4Var.getClass();
        ((in0) n4Var.i).j(t61Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t60, defpackage.r12
    public final void a() {
        M0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rn
    public final e70 b() {
        return sp0.c0(this).F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rn
    public final long d() {
        return s11.q0(sp0.Z(this, 4).j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rn
    public final d61 getLayoutDirection() {
        return sp0.c0(this).G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mc0
    public final void r0() {
        M0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t60
    public final void w0() {
        M0();
    }

    @Override // defpackage.th1
    public final void F0() {
    }
}
