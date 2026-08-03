package p261rb;

/* JADX INFO: renamed from: rb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3785a {

    /* JADX INFO: renamed from: a */
    public final boolean f12407a;

    /* JADX INFO: renamed from: b */
    public final String f12408b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3785a(boolean z9, String str) {
        this.f12407a = z9;
        this.f12408b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3785a)) {
            return false;
        }
        C3785a c3785a = (C3785a) obj;
        return this.f12407a == c3785a.f12407a && this.f12408b.equals(c3785a.f12408b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12408b.hashCode() + (Boolean.hashCode(this.f12407a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ZombieCheckActionResult(success=" + this.f12407a + ", message=" + this.f12408b + ")";
    }
}
