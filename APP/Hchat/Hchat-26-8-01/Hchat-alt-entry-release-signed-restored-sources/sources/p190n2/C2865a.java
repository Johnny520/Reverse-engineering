package p190n2;

import gg.AbstractC1416l;
import p035c8.C0412a;
import p119i2.C1926g;
import p150k5.C2263n;
import p222p.AbstractC3199a;
import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: n2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2865a implements InterfaceC2872g {

    /* JADX INFO: renamed from: a */
    public final C1926g f9259a;

    /* JADX INFO: renamed from: b */
    public final int f9260b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2865a(String str, int i9) {
        this(new C1926g(str), i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2872g
    /* JADX INFO: renamed from: a */
    public final void mo2428a(C2263n c2263n) {
        int i9 = c2263n.f7508j;
        C1926g c1926g = this.f9259a;
        if (i9 != -1) {
            c2263n.m5509f(i9, c2263n.f7509k, c1926g.f6529h);
        } else {
            c2263n.m5509f(c2263n.f7506h, c2263n.f7507i, c1926g.f6529h);
        }
        int i10 = c2263n.f7506h;
        int i11 = c2263n.f7507i;
        int i12 = i10 == i11 ? i11 : -1;
        int i13 = this.f9260b;
        int iM7909r = AbstractC3754e0.m7909r(i13 > 0 ? (i12 + i13) - 1 : (i12 + i13) - c1926g.f6529h.length(), 0, ((C0412a) c2263n.f7510l).m1373b());
        c2263n.m5511h(iM7909r, iM7909r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2865a)) {
            return false;
        }
        C2865a c2865a = (C2865a) obj;
        return AbstractC1416l.m3825a(this.f9259a.f6529h, c2865a.f9259a.f6529h) && this.f9260b == c2865a.f9260b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f9259a.f6529h.hashCode() * 31) + this.f9260b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f9259a.f6529h);
        sb2.append("', newCursorPosition=");
        return AbstractC3199a.m6841n(sb2, this.f9260b, ')');
    }

    public C2865a(C1926g c1926g, int i9) {
        this.f9259a = c1926g;
        this.f9260b = i9;
    }
}
