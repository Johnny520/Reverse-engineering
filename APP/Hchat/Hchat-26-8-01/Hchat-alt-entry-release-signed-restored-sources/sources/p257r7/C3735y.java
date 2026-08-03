package p257r7;

import p298u7.C4281d;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: r7.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3735y extends AbstractC3729s {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // p257r7.AbstractC3729s, java.lang.Comparable
    /* JADX INFO: renamed from: S */
    public final int compareTo(AbstractC3729s abstractC3729s) {
        if (abstractC3729s == null) {
            return -1;
        }
        return Integer.compare(this.f7657g, abstractC3729s.f7657g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3729s
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        C4281d c4281d = (C4281d) m5553u(C4281d.class);
        int i9 = this.f7657g;
        sb2.append(AbstractC5999a.m10751n((byte) (c4281d != null ? i9 + 1 + c4281d.f14200t.f12083n : i9 + 1)));
        sb2.append(':');
        sb2.append(this.f12101m);
        return sb2.toString();
    }

    @Override // p257r7.AbstractC3729s
    /* JADX INFO: renamed from: W */
    public final void mo7736W() {
    }
}
