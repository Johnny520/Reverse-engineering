package p000;

/* JADX INFO: renamed from: am */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0023am implements sd0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f190d;

    /* JADX INFO: renamed from: e */
    public final sd0 f191e;

    /* JADX INFO: renamed from: f */
    public final Enum f192f;

    /* JADX INFO: renamed from: g */
    public final Enum f193g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0023am(sd0 sd0Var, Enum r2, Enum r3, int i) {
        this.f190d = i;
        this.f191e = sd0Var;
        this.f192f = r2;
        this.f193g = r3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: I */
    public final int mo181I(int i) {
        switch (this.f190d) {
        }
        return this.f191e.mo181I(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: O */
    public final int mo182O(int i) {
        switch (this.f190d) {
        }
        return this.f191e.mo182O(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: R */
    public final int mo183R(int i) {
        switch (this.f190d) {
        }
        return this.f191e.mo183R(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: e */
    public final xq0 mo184e(long j) {
        int i = this.f190d;
        Enum r1 = this.f192f;
        Enum r2 = this.f193g;
        sd0 sd0Var = this.f191e;
        switch (i) {
            case 0:
                n30 n30Var = (n30) r2;
                m30 m30Var = (m30) r1;
                m30 m30Var2 = m30.f3799e;
                if (n30Var == n30.f4170d) {
                    return new C0864vt(m30Var == m30Var2 ? sd0Var.mo182O(C0617pj.m3136g(j)) : sd0Var.mo181I(C0617pj.m3136g(j)), C0617pj.m3132c(j) ? C0617pj.m3136g(j) : 32767, 0);
                }
                return new C0864vt(C0617pj.m3133d(j) ? C0617pj.m3137h(j) : 32767, m30Var == m30Var2 ? sd0Var.mo185f(C0617pj.m3137h(j)) : sd0Var.mo183R(C0617pj.m3137h(j)), 0);
            default:
                uj0 uj0Var = (uj0) r2;
                tj0 tj0Var = (tj0) r1;
                tj0 tj0Var2 = tj0.f6007e;
                if (uj0Var == uj0.f6246d) {
                    return new C0864vt(tj0Var == tj0Var2 ? sd0Var.mo182O(C0617pj.m3136g(j)) : sd0Var.mo181I(C0617pj.m3136g(j)), C0617pj.m3132c(j) ? C0617pj.m3136g(j) : 32767, 1);
                }
                return new C0864vt(C0617pj.m3133d(j) ? C0617pj.m3137h(j) : 32767, tj0Var == tj0Var2 ? sd0Var.mo185f(C0617pj.m3137h(j)) : sd0Var.mo183R(C0617pj.m3137h(j)), 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: f */
    public final int mo185f(int i) {
        switch (this.f190d) {
        }
        return this.f191e.mo185f(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: j */
    public final Object mo50j() {
        switch (this.f190d) {
        }
        return this.f191e.mo50j();
    }
}
