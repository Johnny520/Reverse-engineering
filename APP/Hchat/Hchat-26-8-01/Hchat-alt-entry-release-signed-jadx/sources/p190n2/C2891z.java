package p190n2;

import gg.AbstractC1416l;
import p020b5.C0192k;
import p119i2.C1926g;

/* JADX INFO: renamed from: n2.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2891z {

    /* JADX INFO: renamed from: a */
    public final C1926g f9345a;

    /* JADX INFO: renamed from: b */
    public final C0192k f9346b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2891z(C1926g c1926g, C0192k c0192k) {
        this.f9345a = c1926g;
        this.f9346b = c0192k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2891z)) {
            return false;
        }
        C2891z c2891z = (C2891z) obj;
        return AbstractC1416l.m3825a(this.f9345a, c2891z.f9345a) && this.f9346b.equals(c2891z.f9346b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9346b.hashCode() + (this.f9345a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f9345a) + ", offsetMapping=" + this.f9346b + ')';
    }
}
