package p088g0;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p119i2.C1926g;

/* JADX INFO: renamed from: g0.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1265i {

    /* JADX INFO: renamed from: a */
    public final C1926g f4179a;

    /* JADX INFO: renamed from: b */
    public C1926g f4180b;

    /* JADX INFO: renamed from: c */
    public boolean f4181c = false;

    /* JADX INFO: renamed from: d */
    public C1260d f4182d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1265i(C1926g c1926g, C1926g c1926g2) {
        this.f4179a = c1926g;
        this.f4180b = c1926g2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1265i)) {
            return false;
        }
        C1265i c1265i = (C1265i) obj;
        return AbstractC1416l.m3825a(this.f4179a, c1265i.f4179a) && AbstractC1416l.m3825a(this.f4180b, c1265i.f4180b) && this.f4181c == c1265i.f4181c && AbstractC1416l.m3825a(this.f4182d, c1265i.f4182d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2245h = AbstractC0921a.m2245h((this.f4180b.hashCode() + (this.f4179a.hashCode() * 31)) * 31, 31, this.f4181c);
        C1260d c1260d = this.f4182d;
        return iM2245h + (c1260d == null ? 0 : c1260d.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f4179a) + ", substitution=" + ((Object) this.f4180b) + ", isShowingSubstitution=" + this.f4181c + ", layoutCache=" + this.f4182d + ')';
    }
}
