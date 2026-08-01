package p115X0;

import com.bumptech.glide.AbstractC1926h;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: X0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1645t implements InterfaceC1632g {

    /* JADX INFO: renamed from: a */
    public final int f5648a;

    /* JADX INFO: renamed from: b */
    public final int f5649b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1645t(int i5, int i6) {
        this.f5648a = i5;
        this.f5649b = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p115X0.InterfaceC1632g
    /* JADX INFO: renamed from: a */
    public final void mo1453a(C1633h c1633h) {
        int iM3568k = AbstractC1926h.m3568k(this.f5648a, 0, c1633h.f5619a.m2738b());
        int iM3568k2 = AbstractC1926h.m3568k(this.f5649b, 0, c1633h.f5619a.m2738b());
        if (iM3568k < iM3568k2) {
            c1633h.m2934f(iM3568k, iM3568k2);
        } else {
            c1633h.m2934f(iM3568k2, iM3568k);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1645t)) {
            return false;
        }
        C1645t c1645t = (C1645t) obj;
        return this.f5648a == c1645t.f5648a && this.f5649b == c1645t.f5649b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f5648a * 31) + this.f5649b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f5648a);
        sb.append(", end=");
        return AbstractC3202a.m5466a(sb, this.f5649b, ')');
    }
}
