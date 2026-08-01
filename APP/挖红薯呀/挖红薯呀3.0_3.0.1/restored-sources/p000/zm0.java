package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class zm0 {

    /* JADX INFO: renamed from: a */
    public final long f7926a;

    /* JADX INFO: renamed from: b */
    public final ln0 f7927b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zm0() {
        long jM2993c = p30.m2993c(4284900966L);
        ln0 ln0Var = new ln0(0.0f, 0.0f, 0.0f, 0.0f);
        this.f7926a = jM2993c;
        this.f7927b = ln0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zm0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        zm0 zm0Var = (zm0) obj;
        return C0207ff.m1094c(this.f7926a, zm0Var.f7926a) && p30.m3002l(this.f7927b, zm0Var.f7927b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = C0207ff.f1708h;
        return this.f7927b.hashCode() + (Long.hashCode(this.f7926a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC0748t1.m4158p(this.f7926a, sb, ", drawPadding=");
        sb.append(this.f7927b);
        sb.append(')');
        return sb.toString();
    }
}
