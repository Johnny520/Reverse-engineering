package p198nb;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: nb.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2941j {

    /* JADX INFO: renamed from: a */
    public final C2944m f9645a;

    /* JADX INFO: renamed from: b */
    public final String f9646b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2941j(C2944m c2944m, String str) {
        this.f9645a = c2944m;
        this.f9646b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2941j)) {
            return false;
        }
        C2941j c2941j = (C2941j) obj;
        return AbstractC1416l.m3825a(this.f9645a, c2941j.f9645a) && this.f9646b.equals(c2941j.f9646b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C2944m c2944m = this.f9645a;
        return this.f9646b.hashCode() + ((c2944m == null ? 0 : c2944m.hashCode()) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CandidateResolution(voice=" + this.f9645a + ", diagnostic=" + this.f9646b + ")";
    }
}
