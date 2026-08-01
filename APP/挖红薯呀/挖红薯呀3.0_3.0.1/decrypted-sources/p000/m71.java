package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class m71 {

    /* JADX INFO: renamed from: a */
    public final long f3857a;

    /* JADX INFO: renamed from: b */
    public final long f3858b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m71(long j, long j2) {
        this.f3857a = j;
        this.f3858b = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m71)) {
            return false;
        }
        m71 m71Var = (m71) obj;
        return C0207ff.m1094c(this.f3857a, m71Var.f3857a) && C0207ff.m1094c(this.f3858b, m71Var.f3858b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = C0207ff.f1708h;
        return Long.hashCode(this.f3858b) + (Long.hashCode(this.f3857a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC0748t1.m4158p(this.f3857a, sb, ", selectionBackgroundColor=");
        sb.append((Object) C0207ff.m1100i(this.f3858b));
        sb.append(')');
        return sb.toString();
    }
}
