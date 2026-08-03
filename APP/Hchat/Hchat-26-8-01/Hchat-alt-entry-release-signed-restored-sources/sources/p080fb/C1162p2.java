package p080fb;

/* JADX INFO: renamed from: fb.p2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1162p2 {

    /* JADX INFO: renamed from: a */
    public final C1192y f3869a;

    /* JADX INFO: renamed from: b */
    public final C1197z1 f3870b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1162p2(C1192y c1192y, C1197z1 c1197z1) {
        this.f3869a = c1192y;
        this.f3870b = c1197z1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1162p2)) {
            return false;
        }
        C1162p2 c1162p2 = (C1162p2) obj;
        return this.f3869a.equals(c1162p2.f3869a) && this.f3870b.equals(c1162p2.f3870b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3870b.f4024a.hashCode() + (this.f3869a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "StageValidation(draft=" + this.f3869a + ", validation=" + this.f3870b + ")";
    }
}
