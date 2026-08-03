package p173lh;

import gg.AbstractC1416l;
import java.io.Serializable;
import kh.AbstractC2407b;
import p041d1.C0655c0;
import p218og.AbstractC3149m;
import p276sf.C3962i;

/* JADX INFO: renamed from: lh.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2568b implements Serializable {

    /* JADX INFO: renamed from: g */
    public final String f8328g;

    /* JADX INFO: renamed from: h */
    public final String f8329h;

    /* JADX INFO: renamed from: i */
    public final String f8330i;

    /* JADX INFO: renamed from: j */
    public final C3962i f8331j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2568b(String str) {
        str.getClass();
        this.f8331j = new C3962i(new C0655c0(this, 7));
        int iM6719r0 = AbstractC3149m.m6719r0(str, "->", 0, false, 6);
        int iM6719r02 = AbstractC3149m.m6719r0(str, ":", iM6719r0 + 1, false, 4);
        if (iM6719r0 == -1 || iM6719r02 == -1) {
            throw new IllegalAccessError("not field descriptor: ".concat(str));
        }
        this.f8328g = AbstractC2407b.m5747e(str.substring(0, iM6719r0));
        this.f8329h = str.substring(iM6719r0 + 2, iM6719r02);
        this.f8330i = AbstractC2407b.m5747e(str.substring(iM6719r02 + 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2568b)) {
            return false;
        }
        C2568b c2568b = (C2568b) obj;
        return AbstractC1416l.m3825a(this.f8328g, c2568b.f8328g) && AbstractC1416l.m3825a(this.f8329h, c2568b.f8329h) && AbstractC1416l.m3825a(this.f8330i, c2568b.f8330i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8330i.hashCode() + (this.f8329h.hashCode() * 31) + (this.f8328g.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2407b.m5749g(this.f8328g) + "->" + this.f8329h + ":" + ((String) this.f8331j.getValue());
    }
}
