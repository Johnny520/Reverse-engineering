package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class sa1 extends te0 {

    /* JADX INFO: renamed from: a */
    public final float f5732a;

    /* JADX INFO: renamed from: b */
    public final float f5733b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sa1(float f, float f2) {
        this.f5732a = f;
        this.f5733b = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        ta1 ta1Var = new ta1();
        ta1Var.f5966r = this.f5732a;
        ta1Var.f5967s = this.f5733b;
        return ta1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof sa1)) {
            return false;
        }
        sa1 sa1Var = (sa1) obj;
        return C0520np.m2732b(this.f5732a, sa1Var.f5732a) && C0520np.m2732b(this.f5733b, sa1Var.f5733b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        ta1 ta1Var = (ta1) oe0Var;
        ta1Var.f5966r = this.f5732a;
        ta1Var.f5967s = this.f5733b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f5733b) + (Float.hashCode(this.f5732a) * 31);
    }
}
