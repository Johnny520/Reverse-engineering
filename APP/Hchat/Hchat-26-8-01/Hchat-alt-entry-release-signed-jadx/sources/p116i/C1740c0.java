package p116i;

import p136j8.C2104o;

/* JADX INFO: renamed from: i.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1740c0 implements InterfaceC1763k {

    /* JADX INFO: renamed from: a */
    public final C1768l1 f5794a;

    /* JADX INFO: renamed from: b */
    public final EnumC1779p0 f5795b;

    /* JADX INFO: renamed from: c */
    public final long f5796c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1740c0(C1768l1 c1768l1, EnumC1779p0 enumC1779p0, long j3) {
        this.f5794a = c1768l1;
        this.f5795b = enumC1779p0;
        this.f5796c = j3;
        if (c1768l1.f5907a == 0 && c1768l1.f5908b == 0) {
            C2104o.m5294t("Animation to be infinitely repeated cannot have a 0-duration");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1763k
    /* JADX INFO: renamed from: a */
    public final InterfaceC1774n1 mo4363a(C1771m1 c1771m1) {
        C1768l1 c1768l1 = this.f5794a;
        return new C1786r1(new C1795u1(c1768l1.f5907a, c1768l1.f5908b, c1768l1.f5909c), this.f5795b, this.f5796c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1740c0)) {
            return false;
        }
        C1740c0 c1740c0 = (C1740c0) obj;
        return c1740c0.f5794a.equals(this.f5794a) && c1740c0.f5795b == this.f5795b && c1740c0.f5796c == this.f5796c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f5796c) + ((this.f5795b.hashCode() + (this.f5794a.hashCode() * 31)) * 31);
    }
}
