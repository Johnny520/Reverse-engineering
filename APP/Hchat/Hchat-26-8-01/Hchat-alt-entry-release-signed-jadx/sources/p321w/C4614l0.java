package p321w;

import ca.C0524k;
import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p190n2.C2891z;
import p293u2.C4231a;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p308v1.InterfaceC4438y;
import tf.C4174u;

/* JADX INFO: renamed from: w.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4614l0 implements InterfaceC4438y {

    /* JADX INFO: renamed from: a */
    public final C4609j1 f15226a;

    /* JADX INFO: renamed from: b */
    public final int f15227b;

    /* JADX INFO: renamed from: c */
    public final C2891z f15228c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1220a f15229d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4614l0(C4609j1 c4609j1, int i9, C2891z c2891z, InterfaceC1220a interfaceC1220a) {
        this.f15226a = c4609j1;
        this.f15227b = i9;
        this.f15228c = c2891z;
        this.f15229d = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4614l0)) {
            return false;
        }
        C4614l0 c4614l0 = (C4614l0) obj;
        return this.f15226a.equals(c4614l0.f15226a) && this.f15227b == c4614l0.f15227b && this.f15228c.equals(c4614l0.f15228c) && AbstractC1416l.m3825a(this.f15229d, c4614l0.f15229d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f15229d.hashCode() + ((this.f15228c.hashCode() + AbstractC0921a.m2242e(this.f15227b, this.f15226a.hashCode() * 31, 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4438y
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo8892j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        long j4;
        if (interfaceC4409m0.mo8830M(C4231a.m8503g(j3)) < C4231a.m8504h(j3)) {
            j4 = j3;
        } else {
            j4 = j3;
            j3 = C4231a.m8497a(j4, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j3);
        int iMin = Math.min(abstractC4377b1Mo8831Q.f14593g, C4231a.m8504h(j4));
        return interfaceC4418p0.mo8010z(iMin, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, new C0524k(this, interfaceC4418p0, abstractC4377b1Mo8831Q, iMin, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f15226a + ", cursorOffset=" + this.f15227b + ", transformedText=" + this.f15228c + ", textLayoutResultProvider=" + this.f15229d + ')';
    }
}
