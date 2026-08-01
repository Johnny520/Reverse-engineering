package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class gw0 {

    /* JADX INFO: renamed from: a */
    public float f2082a = 0.0f;

    /* JADX INFO: renamed from: b */
    public boolean f2083b = true;

    /* JADX INFO: renamed from: c */
    public C0213fl f2084c = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw0)) {
            return false;
        }
        gw0 gw0Var = (gw0) obj;
        return Float.compare(this.f2082a, gw0Var.f2082a) == 0 && this.f2083b == gw0Var.f2083b && p30.m3002l(this.f2084c, gw0Var.f2084c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM4145c = AbstractC0748t1.m4145c(Float.hashCode(this.f2082a) * 31, 31, this.f2083b);
        C0213fl c0213fl = this.f2084c;
        return (iM4145c + (c0213fl == null ? 0 : c0213fl.hashCode())) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RowColumnParentData(weight=" + this.f2082a + ", fill=" + this.f2083b + ", crossAxisAlignment=" + this.f2084c + ", flowLayoutData=null)";
    }
}
