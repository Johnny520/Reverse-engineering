package p190n2;

import p035c8.C0412a;
import p150k5.C2263n;
import p204o2.AbstractC3042a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: n2.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2870e implements InterfaceC2872g {

    /* JADX INFO: renamed from: a */
    public final int f9287a;

    /* JADX INFO: renamed from: b */
    public final int f9288b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2870e(int i9, int i10) {
        this.f9287a = i9;
        this.f9288b = i10;
        if (i9 >= 0 && i10 >= 0) {
            return;
        }
        AbstractC3042a.m6486a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i9 + " and " + i10 + " respectively.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2872g
    /* JADX INFO: renamed from: a */
    public final void mo2428a(C2263n c2263n) {
        int i9 = c2263n.f7507i;
        C0412a c0412a = (C0412a) c2263n.f7510l;
        int i10 = this.f9288b;
        int iM1373b = i9 + i10;
        if (((i9 ^ iM1373b) & (i10 ^ iM1373b)) < 0) {
            iM1373b = c0412a.m1373b();
        }
        c2263n.m5504a(c2263n.f7507i, Math.min(iM1373b, c0412a.m1373b()));
        int i11 = c2263n.f7506h;
        int i12 = this.f9287a;
        int i13 = i11 - i12;
        if (((i11 ^ i13) & (i12 ^ i11)) < 0) {
            i13 = 0;
        }
        c2263n.m5504a(Math.max(0, i13), c2263n.f7506h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2870e)) {
            return false;
        }
        C2870e c2870e = (C2870e) obj;
        return this.f9287a == c2870e.f9287a && this.f9288b == c2870e.f9288b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f9287a * 31) + this.f9288b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f9287a);
        sb2.append(", lengthAfterCursor=");
        return AbstractC3199a.m6841n(sb2, this.f9288b, ')');
    }
}
