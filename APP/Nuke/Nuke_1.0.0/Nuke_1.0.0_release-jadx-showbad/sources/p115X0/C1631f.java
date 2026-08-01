package p115X0;

import p101U0.C1470e;
import p120Y0.AbstractC1732a;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: X0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1631f implements InterfaceC1632g {

    /* JADX INFO: renamed from: a */
    public final int f5617a;

    /* JADX INFO: renamed from: b */
    public final int f5618b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1631f(int i5, int i6) {
        this.f5617a = i5;
        this.f5618b = i6;
        if (i5 >= 0 && i6 >= 0) {
            return;
        }
        AbstractC1732a.m3085a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i5 + " and " + i6 + " respectively.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p115X0.InterfaceC1632g
    /* JADX INFO: renamed from: a */
    public final void mo1453a(C1633h c1633h) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 < this.f5617a) {
                int i8 = i7 + 1;
                int i9 = c1633h.f5620b;
                if (i9 <= i8) {
                    i7 = i9;
                    break;
                } else {
                    i7 = (Character.isHighSurrogate(c1633h.m2930b((i9 - i8) + (-1))) && Character.isLowSurrogate(c1633h.m2930b(c1633h.f5620b - i8))) ? i7 + 2 : i8;
                    i6++;
                }
            } else {
                break;
            }
        }
        int iM2738b = 0;
        while (true) {
            if (i5 >= this.f5618b) {
                break;
            }
            int i10 = iM2738b + 1;
            int i11 = c1633h.f5621c;
            C1470e c1470e = c1633h.f5619a;
            if (i11 + i10 >= c1470e.m2738b()) {
                iM2738b = c1470e.m2738b() - c1633h.f5621c;
                break;
            } else {
                iM2738b = (Character.isHighSurrogate(c1633h.m2930b((c1633h.f5621c + i10) + (-1))) && Character.isLowSurrogate(c1633h.m2930b(c1633h.f5621c + i10))) ? iM2738b + 2 : i10;
                i5++;
            }
        }
        int i12 = c1633h.f5621c;
        c1633h.m2929a(i12, iM2738b + i12);
        int i13 = c1633h.f5620b;
        c1633h.m2929a(i13 - i7, i13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1631f)) {
            return false;
        }
        C1631f c1631f = (C1631f) obj;
        return this.f5617a == c1631f.f5617a && this.f5618b == c1631f.f5618b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f5617a * 31) + this.f5618b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f5617a);
        sb.append(", lengthAfterCursor=");
        return AbstractC3202a.m5466a(sb, this.f5618b, ')');
    }
}
