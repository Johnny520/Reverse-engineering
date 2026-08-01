package p147d1;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p211o0.AbstractC2736K;
import p211o0.AbstractC2758q;
import p211o0.C2762u;

/* JADX INFO: renamed from: d1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1952b implements InterfaceC1965o {

    /* JADX INFO: renamed from: a */
    public final AbstractC2736K f6620a;

    /* JADX INFO: renamed from: b */
    public final float f6621b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1952b(AbstractC2736K abstractC2736K, float f2) {
        this.f6620a = abstractC2736K;
        this.f6621b = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147d1.InterfaceC1965o
    /* JADX INFO: renamed from: a */
    public final float mo3619a() {
        return this.f6621b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147d1.InterfaceC1965o
    /* JADX INFO: renamed from: b */
    public final long mo3620b() {
        int i5 = C2762u.f8763h;
        return C2762u.f8762g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147d1.InterfaceC1965o
    /* JADX INFO: renamed from: c */
    public final AbstractC2758q mo3621c() {
        return this.f6620a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1952b)) {
            return false;
        }
        C1952b c1952b = (C1952b) obj;
        return AbstractC1665j.m2981a(this.f6620a, c1952b.f6620a) && Float.compare(this.f6621b, c1952b.f6621b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f6621b) + (this.f6620a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f6620a);
        sb.append(", alpha=");
        return AbstractC0231b.m401l(sb, this.f6621b, ')');
    }
}
