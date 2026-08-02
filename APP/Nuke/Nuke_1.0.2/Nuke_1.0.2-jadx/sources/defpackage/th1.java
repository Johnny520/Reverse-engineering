package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class th1 implements t60 {
    public s00 i;
    public int j;
    public th1 l;
    public th1 m;
    public ps1 n;
    public zn1 o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public t6 t;
    public boolean u;
    public th1 h = this;
    public int k = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final j20 A0() {
        s00 s00Var = this.i;
        if (s00Var != null) {
            return s00Var;
        }
        s00 s00VarE = te.e(((b7) sp0.f0(this)).getCoroutineContext().k(new m21((k21) ((b7) sp0.f0(this)).getCoroutineContext().o(sn.K))));
        this.i = s00VarE;
        return s00VarE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean B0() {
        return !(this instanceof nj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void C0() {
        if (this.u) {
            kz0.b("node attached multiple times");
        }
        if (this.o == null) {
            kz0.b("attach invoked on a node without a coordinator");
        }
        this.u = true;
        this.r = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void D0() {
        if (!this.u) {
            kz0.b("Cannot detach a node that is not attached");
        }
        if (this.r) {
            kz0.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.s) {
            kz0.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.u = false;
        s00 s00Var = this.i;
        if (s00Var != null) {
            te.o(s00Var, new xh1("The Modifier.Node was detached", 2));
            this.i = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void H0() {
        if (!this.u) {
            kz0.b("reset() called on an unattached node");
        }
        G0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void I0() {
        if (!this.u) {
            kz0.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.r) {
            kz0.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.r = false;
        E0();
        this.s = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void J0() {
        if (!this.u) {
            kz0.b("node detached multiple times");
        }
        if (this.o == null) {
            kz0.b("detach invoked on a node without a coordinator");
        }
        if (!this.s) {
            kz0.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.s = false;
        t6 t6Var = this.t;
        if (t6Var != null) {
            t6Var.a();
        }
        F0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void K0(th1 th1Var) {
        this.h = th1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void L0(zn1 zn1Var) {
        this.o = zn1Var;
    }

    public void E0() {
    }

    public void F0() {
    }

    public void G0() {
    }
}
