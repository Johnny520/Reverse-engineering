package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class h40 extends f40 {

    /* JADX INFO: renamed from: k */
    public final j40 f2138k;

    /* JADX INFO: renamed from: l */
    public final i40 f2139l;

    /* JADX INFO: renamed from: m */
    public final C0169ee f2140m;

    /* JADX INFO: renamed from: n */
    public final Object f2141n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h40(j40 j40Var, i40 i40Var, C0169ee c0169ee, Object obj) {
        this.f2138k = j40Var;
        this.f2139l = i40Var;
        this.f2140m = c0169ee;
        this.f2141n = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f40
    /* JADX INFO: renamed from: r */
    public final boolean mo18r() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f40
    /* JADX INFO: renamed from: s */
    public final void mo19s(Throwable th) {
        C0169ee c0169ee = this.f2140m;
        C0169ee c0169eeM1610V = j40.m1610V(c0169ee);
        j40 j40Var = this.f2138k;
        i40 i40Var = this.f2139l;
        Object obj = this.f2141n;
        if (c0169eeM1610V == null || !j40Var.m1639i0(i40Var, c0169eeM1610V, obj)) {
            i40Var.f2446d.m1287e(new xa0(2), 2);
            C0169ee c0169eeM1610V2 = j40.m1610V(c0169ee);
            if (c0169eeM1610V2 == null || !j40Var.m1639i0(i40Var, c0169eeM1610V2, obj)) {
                j40Var.mo1172y(j40Var.m1618H(i40Var, obj));
            }
        }
    }
}
