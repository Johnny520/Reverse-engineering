package p332wb;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p317vb.InterfaceC4544a;

/* JADX INFO: renamed from: wb.d3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4803d3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4544a f16495a;

    /* JADX INFO: renamed from: b */
    public final C4770c3 f16496b;

    /* JADX INFO: renamed from: c */
    public final String f16497c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4803d3(InterfaceC4544a interfaceC4544a, C4770c3 c4770c3, String str) {
        this.f16495a = interfaceC4544a;
        this.f16496b = c4770c3;
        this.f16497c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4803d3)) {
            return false;
        }
        C4803d3 c4803d3 = (C4803d3) obj;
        return this.f16495a.equals(c4803d3.f16495a) && AbstractC1416l.m3825a(this.f16496b, c4803d3.f16496b) && this.f16497c.equals(c4803d3.f16497c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f16495a.hashCode() * 31;
        C4770c3 c4770c3 = this.f16496b;
        return this.f16497c.hashCode() + ((iHashCode + (c4770c3 == null ? 0 : c4770c3.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureSearchResult(provider=");
        sb2.append(this.f16495a);
        sb2.append(", group=");
        sb2.append(this.f16496b);
        sb2.append(", summary=");
        return AbstractC0921a.m2255r(sb2, this.f16497c, ")");
    }
}
