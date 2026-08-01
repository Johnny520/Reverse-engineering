package p203n;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n.J */
/* JADX INFO: loaded from: classes.dex */
public final class C2627J implements InterfaceC2659i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2659i f8342a;

    /* JADX INFO: renamed from: b */
    public final long f8343b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2627J(InterfaceC2677v interfaceC2677v, long j5) {
        this.f8342a = interfaceC2677v;
        this.f8343b = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2659i
    /* JADX INFO: renamed from: a */
    public final InterfaceC2656g0 mo4572a(C2652e0 c2652e0) {
        return new C2628K(this.f8342a.mo4572a(c2652e0), this.f8343b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2627J)) {
            return false;
        }
        C2627J c2627j = (C2627J) obj;
        return c2627j.f8343b == this.f8343b && AbstractC1665j.m2981a(c2627j.f8342a, this.f8342a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f8343b) + (this.f8342a.hashCode() * 31);
    }
}
