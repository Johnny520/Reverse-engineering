package bb;

import gg.AbstractC1416l;
import p136j8.AbstractC2091b;
import p365y9.C6010f;

/* JADX INFO: renamed from: bb.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0244f {

    /* JADX INFO: renamed from: a */
    public final String f648a;

    /* JADX INFO: renamed from: b */
    public final C6010f f649b;

    /* JADX INFO: renamed from: c */
    public final int f650c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0244f(String str, C6010f c6010f, int i9) {
        this.f648a = str;
        this.f649b = c6010f;
        this.f650c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0244f)) {
            return false;
        }
        C0244f c0244f = (C0244f) obj;
        return this.f648a.equals(c0244f.f648a) && AbstractC1416l.m3825a(this.f649b, c0244f.f649b) && this.f650c == c0244f.f650c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f648a.hashCode() * 31;
        C6010f c6010f = this.f649b;
        return Integer.hashCode(this.f650c) + ((iHashCode + (c6010f == null ? 0 : c6010f.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuffixPart(text=");
        sb2.append(this.f648a);
        sb2.append(", color=");
        sb2.append(this.f649b);
        sb2.append(", weight=");
        return AbstractC2091b.m5163j(sb2, this.f650c, ")");
    }
}
