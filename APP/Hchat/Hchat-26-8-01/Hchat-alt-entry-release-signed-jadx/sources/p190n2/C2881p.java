package p190n2;

import p035c8.C0412a;
import p150k5.C2263n;
import p222p.AbstractC3199a;
import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: n2.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2881p implements InterfaceC2872g {

    /* JADX INFO: renamed from: a */
    public final int f9310a;

    /* JADX INFO: renamed from: b */
    public final int f9311b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2881p(int i9, int i10) {
        this.f9310a = i9;
        this.f9311b = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2872g
    /* JADX INFO: renamed from: a */
    public final void mo2428a(C2263n c2263n) {
        boolean z9 = c2263n.f7508j != -1;
        C0412a c0412a = (C0412a) c2263n.f7510l;
        if (z9) {
            c2263n.f7508j = -1;
            c2263n.f7509k = -1;
        }
        int iM7909r = AbstractC3754e0.m7909r(this.f9310a, 0, c0412a.m1373b());
        int iM7909r2 = AbstractC3754e0.m7909r(this.f9311b, 0, c0412a.m1373b());
        if (iM7909r != iM7909r2) {
            if (iM7909r < iM7909r2) {
                c2263n.m5510g(iM7909r, iM7909r2);
            } else {
                c2263n.m5510g(iM7909r2, iM7909r);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2881p)) {
            return false;
        }
        C2881p c2881p = (C2881p) obj;
        return this.f9310a == c2881p.f9310a && this.f9311b == c2881p.f9311b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f9310a * 31) + this.f9311b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f9310a);
        sb2.append(", end=");
        return AbstractC3199a.m6841n(sb2, this.f9311b, ')');
    }
}
