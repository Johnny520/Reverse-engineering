package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ym0 extends v50 {

    /* JADX INFO: renamed from: a */
    public final bw0 f7657a;

    /* JADX INFO: renamed from: b */
    public final C0118d6 f7658b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ym0(bw0 bw0Var) {
        C0118d6 c0118d6M1030a;
        this.f7657a = bw0Var;
        if (j50.m1669s(bw0Var)) {
            c0118d6M1030a = null;
        } else {
            c0118d6M1030a = AbstractC0198f6.m1030a();
            C0118d6.m635b(c0118d6M1030a, bw0Var);
        }
        this.f7658b = c0118d6M1030a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ym0) {
            return this.f7657a.equals(((ym0) obj).f7657a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7657a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.v50
    /* JADX INFO: renamed from: j */
    public final st0 mo4418j() {
        bw0 bw0Var = this.f7657a;
        return new st0(bw0Var.f596a, bw0Var.f597b, bw0Var.f598c, bw0Var.f599d);
    }
}
