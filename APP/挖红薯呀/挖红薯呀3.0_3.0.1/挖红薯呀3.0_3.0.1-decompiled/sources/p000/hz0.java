package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class hz0 implements ny0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lz0 f2379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jz0 f2380b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hz0(lz0 lz0Var, jz0 jz0Var) {
        this.f2379a = lz0Var;
        this.f2380b = jz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ny0
    /* JADX INFO: renamed from: a */
    public final float mo1511a(float f) {
        float fAbs = Math.abs(f);
        lz0 lz0Var = this.f2379a;
        if (fAbs != 0.0f && !((Boolean) lz0Var.f3628h.invoke()).booleanValue()) {
            throw new C0105cu("The fling animation was cancelled", 0);
        }
        return lz0Var.m2093d(lz0Var.m2096g(this.f2380b.m1741a(2, lz0Var.m2094e(lz0Var.m2097h(f)))));
    }
}
