package p190n2;

import p035c8.C0412a;
import p150k5.C2263n;
import p222p.AbstractC3199a;
import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: n2.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2883r implements InterfaceC2872g {

    /* JADX INFO: renamed from: a */
    public final int f9314a;

    /* JADX INFO: renamed from: b */
    public final int f9315b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2883r(int i9, int i10) {
        this.f9314a = i9;
        this.f9315b = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2872g
    /* JADX INFO: renamed from: a */
    public final void mo2428a(C2263n c2263n) {
        int iM7909r = AbstractC3754e0.m7909r(this.f9314a, 0, ((C0412a) c2263n.f7510l).m1373b());
        int iM7909r2 = AbstractC3754e0.m7909r(this.f9315b, 0, ((C0412a) c2263n.f7510l).m1373b());
        if (iM7909r < iM7909r2) {
            c2263n.m5511h(iM7909r, iM7909r2);
        } else {
            c2263n.m5511h(iM7909r2, iM7909r);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2883r)) {
            return false;
        }
        C2883r c2883r = (C2883r) obj;
        return this.f9314a == c2883r.f9314a && this.f9315b == c2883r.f9315b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f9314a * 31) + this.f9315b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f9314a);
        sb2.append(", end=");
        return AbstractC3199a.m6841n(sb2, this.f9315b, ')');
    }
}
