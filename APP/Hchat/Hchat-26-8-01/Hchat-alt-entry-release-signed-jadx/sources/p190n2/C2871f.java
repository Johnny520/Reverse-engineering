package p190n2;

import p035c8.C0412a;
import p150k5.C2263n;
import p204o2.AbstractC3042a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: n2.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2871f implements InterfaceC2872g {

    /* JADX INFO: renamed from: a */
    public final int f9289a;

    /* JADX INFO: renamed from: b */
    public final int f9290b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2871f(int i9, int i10) {
        this.f9289a = i9;
        this.f9290b = i10;
        if (i9 >= 0 && i10 >= 0) {
            return;
        }
        AbstractC3042a.m6486a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i9 + " and " + i10 + " respectively.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2872g
    /* JADX INFO: renamed from: a */
    public final void mo2428a(C2263n c2263n) {
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < this.f9289a) {
                int i12 = i11 + 1;
                int i13 = c2263n.f7506h;
                if (i13 <= i12) {
                    i11 = i13;
                    break;
                } else {
                    i11 = (Character.isHighSurrogate(c2263n.m5505b((i13 - i12) + (-1))) && Character.isLowSurrogate(c2263n.m5505b(c2263n.f7506h - i12))) ? i11 + 2 : i12;
                    i10++;
                }
            } else {
                break;
            }
        }
        int iM1373b = 0;
        while (true) {
            if (i9 >= this.f9290b) {
                break;
            }
            int i14 = iM1373b + 1;
            int i15 = c2263n.f7507i;
            C0412a c0412a = (C0412a) c2263n.f7510l;
            if (i15 + i14 >= c0412a.m1373b()) {
                iM1373b = c0412a.m1373b() - c2263n.f7507i;
                break;
            } else {
                iM1373b = (Character.isHighSurrogate(c2263n.m5505b((c2263n.f7507i + i14) + (-1))) && Character.isLowSurrogate(c2263n.m5505b(c2263n.f7507i + i14))) ? iM1373b + 2 : i14;
                i9++;
            }
        }
        int i16 = c2263n.f7507i;
        c2263n.m5504a(i16, iM1373b + i16);
        int i17 = c2263n.f7506h;
        c2263n.m5504a(i17 - i11, i17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2871f)) {
            return false;
        }
        C2871f c2871f = (C2871f) obj;
        return this.f9289a == c2871f.f9289a && this.f9290b == c2871f.f9290b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f9289a * 31) + this.f9290b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f9289a);
        sb2.append(", lengthAfterCursor=");
        return AbstractC3199a.m6841n(sb2, this.f9290b, ')');
    }
}
