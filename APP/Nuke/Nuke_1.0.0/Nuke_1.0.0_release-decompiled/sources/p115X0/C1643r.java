package p115X0;

import com.bumptech.glide.AbstractC1926h;
import p101U0.C1470e;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: X0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1643r implements InterfaceC1632g {

    /* JADX INFO: renamed from: a */
    public final int f5644a;

    /* JADX INFO: renamed from: b */
    public final int f5645b;

    public C1643r(int i5, int i6) {
        this.f5644a = i5;
        this.f5645b = i6;
    }

    @Override // p115X0.InterfaceC1632g
    /* JADX INFO: renamed from: a */
    public final void mo1453a(C1633h c1633h) {
        boolean z5 = c1633h.f5622d != -1;
        C1470e c1470e = c1633h.f5619a;
        if (z5) {
            c1633h.f5622d = -1;
            c1633h.f5623e = -1;
        }
        int iM3568k = AbstractC1926h.m3568k(this.f5644a, 0, c1470e.m2738b());
        int iM3568k2 = AbstractC1926h.m3568k(this.f5645b, 0, c1470e.m2738b());
        if (iM3568k != iM3568k2) {
            if (iM3568k < iM3568k2) {
                c1633h.m2933e(iM3568k, iM3568k2);
            } else {
                c1633h.m2933e(iM3568k2, iM3568k);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1643r)) {
            return false;
        }
        C1643r c1643r = (C1643r) obj;
        return this.f5644a == c1643r.f5644a && this.f5645b == c1643r.f5645b;
    }

    public final int hashCode() {
        return (this.f5644a * 31) + this.f5645b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f5644a);
        sb.append(", end=");
        return AbstractC3202a.m5466a(sb, this.f5645b, ')');
    }
}
