package p080fb;

/* JADX INFO: renamed from: fb.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1164q0 {

    /* JADX INFO: renamed from: a */
    public final C1156o0 f3872a;

    /* JADX INFO: renamed from: b */
    public final String f3873b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1164q0(C1156o0 c1156o0, String str) {
        this.f3872a = c1156o0;
        this.f3873b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1164q0)) {
            return false;
        }
        C1164q0 c1164q0 = (C1164q0) obj;
        return this.f3872a.equals(c1164q0.f3872a) && this.f3873b.equals(c1164q0.f3873b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3873b.hashCode() + (this.f3872a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ToolRoute(client=" + this.f3872a + ", originalName=" + this.f3873b + ")";
    }
}
