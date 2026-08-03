package p109hb;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: hb.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1688k0 {

    /* JADX INFO: renamed from: a */
    public final C1671c f5610a;

    /* JADX INFO: renamed from: b */
    public final C1695r f5611b;

    /* JADX INFO: renamed from: c */
    public final C1687k f5612c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1688k0(C1671c c1671c, C1695r c1695r, C1687k c1687k) {
        c1671c.getClass();
        c1695r.getClass();
        c1687k.getClass();
        this.f5610a = c1671c;
        this.f5611b = c1695r;
        this.f5612c = c1687k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1688k0)) {
            return false;
        }
        C1688k0 c1688k0 = (C1688k0) obj;
        return AbstractC1416l.m3825a(this.f5610a, c1688k0.f5610a) && AbstractC1416l.m3825a(this.f5611b, c1688k0.f5611b) && AbstractC1416l.m3825a(this.f5612c, c1688k0.f5612c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5612c.hashCode() + ((this.f5611b.hashCode() + (this.f5610a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "State(moduleSender=" + this.f5610a + ", selectedModuleSender=" + this.f5611b + ", officialSender=" + this.f5612c + ")";
    }
}
