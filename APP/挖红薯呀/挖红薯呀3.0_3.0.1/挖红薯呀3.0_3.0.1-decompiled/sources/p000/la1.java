package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class la1 extends gy0 {

    /* JADX INFO: renamed from: j */
    public final ThreadLocal f3403j;
    private volatile boolean threadLocalIsSet;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public la1(InterfaceC0618pk interfaceC0618pk, AbstractC0358jk abstractC0358jk) {
        C0014ad c0014ad = C0014ad.f108f;
        super(abstractC0358jk, interfaceC0618pk.mo64l(c0014ad) == null ? interfaceC0618pk.mo63h(c0014ad) : interfaceC0618pk);
        this.f3403j = new ThreadLocal();
        if (abstractC0358jk.mo540e().mo64l(C0496n2.f4163w) instanceof AbstractC0692rk) {
            return;
        }
        Object objM4035V = s91.m4035V(interfaceC0618pk, null);
        s91.m4026M(interfaceC0618pk, objM4035V);
        m2010n0(interfaceC0618pk, objM4035V);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final boolean m2009m0() {
        boolean z = this.threadLocalIsSet && this.f3403j.get() == null;
        this.f3403j.remove();
        return !z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public final void m2010n0(InterfaceC0618pk interfaceC0618pk, Object obj) {
        this.threadLocalIsSet = true;
        this.f3403j.set(new uo0(interfaceC0618pk, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gy0, p000.j40
    /* JADX INFO: renamed from: z */
    public final void mo1173z(Object obj) {
        if (this.threadLocalIsSet) {
            uo0 uo0Var = (uo0) this.f3403j.get();
            if (uo0Var != null) {
                s91.m4026M((InterfaceC0618pk) uo0Var.f6274d, uo0Var.f6275e);
            }
            this.f3403j.remove();
        }
        Object objM1517C = AbstractC0307i4.m1517C(obj);
        InterfaceC0322ik interfaceC0322ik = this.f2092i;
        InterfaceC0618pk interfaceC0618pkMo540e = interfaceC0322ik.mo540e();
        Object objM4035V = s91.m4035V(interfaceC0618pkMo540e, null);
        la1 la1VarM1521G = objM4035V != s91.f5695C ? AbstractC0307i4.m1521G(interfaceC0322ik, interfaceC0618pkMo540e, objM4035V) : null;
        try {
            this.f2092i.mo541i(objM1517C);
            if (la1VarM1521G == null || la1VarM1521G.m2009m0()) {
                s91.m4026M(interfaceC0618pkMo540e, objM4035V);
            }
        } catch (Throwable th) {
            if (la1VarM1521G == null || la1VarM1521G.m2009m0()) {
                s91.m4026M(interfaceC0618pkMo540e, objM4035V);
            }
            throw th;
        }
    }
}
