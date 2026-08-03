package p092g4;

import p311v4.C4451c0;
import p311v4.C4464m;
import p311v4.C4477z;

/* JADX INFO: renamed from: g4.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1346f {

    /* JADX INFO: renamed from: a */
    public final C1350j f4448a;

    /* JADX INFO: renamed from: b */
    public final String f4449b;

    /* JADX INFO: renamed from: c */
    public final C4464m f4450c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1346f(C1350j c1350j, C1350j c1350j2, String str) {
        if (c1350j2 == null) {
            throw null;
        }
        this.f4448a = c1350j;
        this.f4449b = str;
        this.f4450c = new C4464m(c1350j.f4481c, new C4477z(new C4451c0(str), new C4451c0(c1350j2.f4479a)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1346f)) {
            return false;
        }
        C1346f c1346f = (C1346f) obj;
        return c1346f.f4448a.equals(this.f4448a) && c1346f.f4449b.equals(this.f4449b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f4449b.hashCode() * 37) + this.f4448a.f4479a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f4448a + "." + this.f4449b;
    }
}
