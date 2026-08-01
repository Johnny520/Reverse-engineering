package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ra0 extends ta0 {

    /* JADX INFO: renamed from: a */
    public final String f5342a;

    /* JADX INFO: renamed from: b */
    public final i71 f5343b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ra0(String str, i71 i71Var) {
        this.f5342a = str;
        this.f5343b = i71Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra0)) {
            return false;
        }
        ra0 ra0Var = (ra0) obj;
        return this.f5342a.equals(ra0Var.f5342a) && p30.m3002l(this.f5343b, ra0Var.f5343b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f5342a.hashCode() * 31;
        i71 i71Var = this.f5343b;
        return (iHashCode + (i71Var != null ? i71Var.hashCode() : 0)) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.f5342a + ')';
    }
}
