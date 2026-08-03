package p190n2;

import gg.AbstractC1416l;
import p035c8.C0412a;
import p119i2.C1926g;
import p150k5.C2263n;
import p222p.AbstractC3199a;
import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: n2.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2882q implements InterfaceC2872g {

    /* JADX INFO: renamed from: a */
    public final C1926g f9312a;

    /* JADX INFO: renamed from: b */
    public final int f9313b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2882q(String str, int i9) {
        this.f9312a = new C1926g(str);
        this.f9313b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2872g
    /* JADX INFO: renamed from: a */
    public final void mo2428a(C2263n c2263n) {
        int i9 = c2263n.f7508j;
        C1926g c1926g = this.f9312a;
        if (i9 != -1) {
            int i10 = c2263n.f7509k;
            String str = c1926g.f6529h;
            String str2 = c1926g.f6529h;
            c2263n.m5509f(i9, i10, str);
            if (str2.length() > 0) {
                c2263n.m5510g(i9, str2.length() + i9);
            }
        } else {
            int i11 = c2263n.f7506h;
            int i12 = c2263n.f7507i;
            String str3 = c1926g.f6529h;
            String str4 = c1926g.f6529h;
            c2263n.m5509f(i11, i12, str3);
            if (str4.length() > 0) {
                c2263n.m5510g(i11, str4.length() + i11);
            }
        }
        int i13 = c2263n.f7506h;
        int i14 = c2263n.f7507i;
        int i15 = i13 == i14 ? i14 : -1;
        int i16 = this.f9313b;
        int iM7909r = AbstractC3754e0.m7909r(i16 > 0 ? (i15 + i16) - 1 : (i15 + i16) - c1926g.f6529h.length(), 0, ((C0412a) c2263n.f7510l).m1373b());
        c2263n.m5511h(iM7909r, iM7909r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2882q)) {
            return false;
        }
        C2882q c2882q = (C2882q) obj;
        return AbstractC1416l.m3825a(this.f9312a.f6529h, c2882q.f9312a.f6529h) && this.f9313b == c2882q.f9313b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f9312a.f6529h.hashCode() * 31) + this.f9313b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f9312a.f6529h);
        sb2.append("', newCursorPosition=");
        return AbstractC3199a.m6841n(sb2, this.f9313b, ')');
    }
}
