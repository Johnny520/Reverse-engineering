package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class o31 implements InterfaceC0778tt {

    /* JADX INFO: renamed from: a */
    public final float f4457a;

    /* JADX INFO: renamed from: b */
    public final float f4458b;

    /* JADX INFO: renamed from: c */
    public final Object f4459c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o31(float f, float f2, Object obj) {
        this.f4457a = f;
        this.f4458b = f2;
        this.f4459c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0830v7
    /* JADX INFO: renamed from: a */
    public final mb1 mo969a(q91 q91Var) {
        Object obj = this.f4459c;
        return new qb1(this.f4457a, this.f4458b, obj == null ? null : (AbstractC0046b8) q91Var.f5089a.invoke(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof o31) {
            o31 o31Var = (o31) obj;
            if (o31Var.f4457a == this.f4457a && o31Var.f4458b == this.f4458b && p30.m3002l(o31Var.f4459c, this.f4459c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f4459c;
        return Float.hashCode(this.f4458b) + AbstractC0748t1.m4143a(this.f4457a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
