package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oe0 implements InterfaceC0694rm {

    /* JADX INFO: renamed from: e */
    public C0286hk f4530e;

    /* JADX INFO: renamed from: f */
    public int f4531f;

    /* JADX INFO: renamed from: h */
    public oe0 f4533h;

    /* JADX INFO: renamed from: i */
    public oe0 f4534i;

    /* JADX INFO: renamed from: j */
    public nk0 f4535j;

    /* JADX INFO: renamed from: k */
    public qj0 f4536k;

    /* JADX INFO: renamed from: l */
    public boolean f4537l;

    /* JADX INFO: renamed from: m */
    public boolean f4538m;

    /* JADX INFO: renamed from: n */
    public boolean f4539n;

    /* JADX INFO: renamed from: o */
    public boolean f4540o;

    /* JADX INFO: renamed from: p */
    public C0458m3 f4541p;

    /* JADX INFO: renamed from: q */
    public boolean f4542q;

    /* JADX INFO: renamed from: d */
    public oe0 f4529d = this;

    /* JADX INFO: renamed from: g */
    public int f4532g = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC0966yk m2879k0() {
        C0286hk c0286hk = this.f4530e;
        if (c0286hk != null) {
            return c0286hk;
        }
        C0286hk c0286hkM2995e = p30.m2995e(((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(this)).getCoroutineContext().mo63h(new e40((c40) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(this)).getCoroutineContext().mo64l(C0496n2.f4129I))));
        this.f4530e = c0286hkM2995e;
        return c0286hkM2995e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public boolean mo548l0() {
        return !(this instanceof C0756t9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public void mo2880m0() {
        if (this.f4542q) {
            w10.m4824b("node attached multiple times");
        }
        if (this.f4536k == null) {
            w10.m4824b("attach invoked on a node without a coordinator");
        }
        this.f4542q = true;
        this.f4539n = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public void mo2881n0() {
        if (!this.f4542q) {
            w10.m4824b("Cannot detach a node that is not attached");
        }
        if (this.f4539n) {
            w10.m4824b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f4540o) {
            w10.m4824b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f4542q = false;
        C0286hk c0286hk = this.f4530e;
        if (c0286hk != null) {
            se0 se0Var = new se0("The Modifier.Node was detached", 2);
            c40 c40Var = (c40) c0286hk.f2274d.mo64l(C0496n2.f4129I);
            if (c40Var == null) {
                C0921xc.m5130k(c0286hk, "Scope cannot be cancelled because it does not have a job: ");
            } else {
                c40Var.mo478a(se0Var);
                this.f4530e = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public void mo2882r0() {
        if (!this.f4542q) {
            w10.m4824b("reset() called on an unattached node");
        }
        mo694q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public void mo2883s0() {
        if (!this.f4542q) {
            w10.m4824b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f4539n) {
            w10.m4824b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f4539n = false;
        mo656o0();
        this.f4540o = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public void mo2884t0() {
        if (!this.f4542q) {
            w10.m4824b("node detached multiple times");
        }
        if (this.f4536k == null) {
            w10.m4824b("detach invoked on a node without a coordinator");
        }
        if (!this.f4540o) {
            w10.m4824b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f4540o = false;
        C0458m3 c0458m3 = this.f4541p;
        if (c0458m3 != null) {
            c0458m3.invoke();
        }
        mo657p0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public void mo2885u0(oe0 oe0Var) {
        this.f4529d = oe0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public void mo2886v0(qj0 qj0Var) {
        this.f4536k = qj0Var;
    }

    /* JADX INFO: renamed from: o0 */
    public void mo656o0() {
    }

    /* JADX INFO: renamed from: p0 */
    public void mo657p0() {
    }

    /* JADX INFO: renamed from: q0 */
    public void mo694q0() {
    }
}
