package p321w;

import gg.AbstractC1416l;
import p065eb.C0899v0;
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

/* JADX INFO: renamed from: w.r1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4633r1 implements InterfaceC4438y {

    /* JADX INFO: renamed from: a */
    public final C4609j1 f15363a;

    /* JADX INFO: renamed from: b */
    public final int f15364b;

    /* JADX INFO: renamed from: c */
    public final C2891z f15365c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1220a f15366d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4633r1(C4609j1 c4609j1, int i9, C2891z c2891z, InterfaceC1220a interfaceC1220a) {
        this.f15363a = c4609j1;
        this.f15364b = i9;
        this.f15365c = c2891z;
        this.f15366d = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4633r1)) {
            return false;
        }
        C4633r1 c4633r1 = (C4633r1) obj;
        return this.f15363a.equals(c4633r1.f15363a) && this.f15364b == c4633r1.f15364b && this.f15365c.equals(c4633r1.f15365c) && AbstractC1416l.m3825a(this.f15366d, c4633r1.f15366d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f15366d.hashCode() + ((this.f15365c.hashCode() + AbstractC0921a.m2242e(this.f15364b, this.f15363a.hashCode() * 31, 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4438y
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo8892j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(C4231a.m8497a(j3, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(abstractC4377b1Mo8831Q.f14594h, C4231a.m8503g(j3));
        return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q.f14593g, iMin, C4174u.f13711g, new C0899v0(this, abstractC4377b1Mo8831Q, iMin, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f15363a + ", cursorOffset=" + this.f15364b + ", transformedText=" + this.f15365c + ", textLayoutResultProvider=" + this.f15366d + ')';
    }
}
