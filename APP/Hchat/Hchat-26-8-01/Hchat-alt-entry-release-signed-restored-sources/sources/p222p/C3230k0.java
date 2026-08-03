package p222p;

/* JADX INFO: renamed from: p.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3230k0 {

    /* JADX INFO: renamed from: a */
    public final int f10309a;

    /* JADX INFO: renamed from: b */
    public final int f10310b;

    /* JADX INFO: renamed from: c */
    public final int f10311c;

    /* JADX INFO: renamed from: d */
    public final int f10312d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3230k0(int i9, int i10, int i11, int i12) {
        this.f10309a = i9;
        this.f10310b = i10;
        this.f10311c = i11;
        this.f10312d = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3230k0)) {
            return false;
        }
        C3230k0 c3230k0 = (C3230k0) obj;
        return this.f10309a == c3230k0.f10309a && this.f10310b == c3230k0.f10310b && this.f10311c == c3230k0.f10311c && this.f10312d == c3230k0.f10312d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((((this.f10309a * 31) + this.f10310b) * 31) + this.f10311c) * 31) + this.f10312d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f10309a);
        sb2.append(", top=");
        sb2.append(this.f10310b);
        sb2.append(", right=");
        sb2.append(this.f10311c);
        sb2.append(", bottom=");
        return AbstractC3199a.m6841n(sb2, this.f10312d, ')');
    }
}
