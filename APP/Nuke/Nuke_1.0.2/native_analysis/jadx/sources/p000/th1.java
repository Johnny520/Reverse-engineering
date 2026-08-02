package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class th1 implements t60 {

    /* JADX INFO: renamed from: i */
    public s00 f10758i;

    /* JADX INFO: renamed from: j */
    public int f10759j;

    /* JADX INFO: renamed from: l */
    public th1 f10761l;

    /* JADX INFO: renamed from: m */
    public th1 f10762m;

    /* JADX INFO: renamed from: n */
    public ps1 f10763n;

    /* JADX INFO: renamed from: o */
    public zn1 f10764o;

    /* JADX INFO: renamed from: p */
    public boolean f10765p;

    /* JADX INFO: renamed from: q */
    public boolean f10766q;

    /* JADX INFO: renamed from: r */
    public boolean f10767r;

    /* JADX INFO: renamed from: s */
    public boolean f10768s;

    /* JADX INFO: renamed from: t */
    public C0723t6 f10769t;

    /* JADX INFO: renamed from: u */
    public boolean f10770u;

    /* JADX INFO: renamed from: h */
    public th1 f10757h = this;

    /* JADX INFO: renamed from: k */
    public int f10760k = -1;

    /* JADX INFO: renamed from: A0 */
    public final j20 m5255A0() {
        s00 s00Var = this.f10758i;
        if (s00Var != null) {
            return s00Var;
        }
        s00 s00VarM5206e = AbstractC0731te.m5206e(((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(this)).getCoroutineContext().mo14k(new m21((k21) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(this)).getCoroutineContext().mo15o(C0700sn.f10207K))));
        this.f10758i = s00VarM5206e;
        return s00VarM5206e;
    }

    /* JADX INFO: renamed from: B0 */
    public boolean mo210B0() {
        return !(this instanceof C0500nj);
    }

    /* JADX INFO: renamed from: C0 */
    public void mo5256C0() {
        if (this.f10770u) {
            kz0.m2764b("node attached multiple times");
        }
        if (this.f10764o == null) {
            kz0.m2764b("attach invoked on a node without a coordinator");
        }
        this.f10770u = true;
        this.f10767r = true;
    }

    /* JADX INFO: renamed from: D0 */
    public void mo5257D0() {
        if (!this.f10770u) {
            kz0.m2764b("Cannot detach a node that is not attached");
        }
        if (this.f10767r) {
            kz0.m2764b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f10768s) {
            kz0.m2764b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f10770u = false;
        s00 s00Var = this.f10758i;
        if (s00Var != null) {
            AbstractC0731te.m5226o(s00Var, new xh1("The Modifier.Node was detached", 2));
            this.f10758i = null;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void mo5258H0() {
        if (!this.f10770u) {
            kz0.m2764b("reset() called on an unattached node");
        }
        mo1486G0();
    }

    /* JADX INFO: renamed from: I0 */
    public void mo5259I0() {
        if (!this.f10770u) {
            kz0.m2764b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f10767r) {
            kz0.m2764b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f10767r = false;
        mo212E0();
        this.f10768s = true;
    }

    /* JADX INFO: renamed from: J0 */
    public void mo5260J0() {
        if (!this.f10770u) {
            kz0.m2764b("node detached multiple times");
        }
        if (this.f10764o == null) {
            kz0.m2764b("detach invoked on a node without a coordinator");
        }
        if (!this.f10768s) {
            kz0.m2764b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f10768s = false;
        C0723t6 c0723t6 = this.f10769t;
        if (c0723t6 != null) {
            c0723t6.mo6a();
        }
        mo213F0();
    }

    /* JADX INFO: renamed from: K0 */
    public void mo5261K0(th1 th1Var) {
        this.f10757h = th1Var;
    }

    /* JADX INFO: renamed from: L0 */
    public void mo5262L0(zn1 zn1Var) {
        this.f10764o = zn1Var;
    }

    /* JADX INFO: renamed from: E0 */
    public void mo212E0() {
    }

    /* JADX INFO: renamed from: F0 */
    public void mo213F0() {
    }

    /* JADX INFO: renamed from: G0 */
    public void mo1486G0() {
    }
}
