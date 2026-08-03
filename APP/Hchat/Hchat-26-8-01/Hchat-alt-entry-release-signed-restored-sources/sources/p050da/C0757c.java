package p050da;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: da.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0757c {

    /* JADX INFO: renamed from: a */
    public final int f2262a;

    /* JADX INFO: renamed from: b */
    public final int f2263b;

    /* JADX INFO: renamed from: c */
    public final boolean f2264c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0757c(int i9, int i10) {
        this.f2262a = i9;
        this.f2263b = i10;
        this.f2264c = i9 != i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0757c)) {
            return false;
        }
        C0757c c0757c = (C0757c) obj;
        return this.f2262a == c0757c.f2262a && this.f2263b == c0757c.f2263b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f2263b) + (Integer.hashCode(this.f2262a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2248k(this.f2262a, this.f2263b, "ColorSpec(startColor=", ", endColor=", ")");
    }
}
