package p116i;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: i.l1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1768l1 implements InterfaceC1803y {

    /* JADX INFO: renamed from: a */
    public final int f5907a;

    /* JADX INFO: renamed from: b */
    public final int f5908b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1796v f5909c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1768l1(int i9, int i10, InterfaceC1796v interfaceC1796v) {
        this.f5907a = i9;
        this.f5908b = i10;
        this.f5909c = interfaceC1796v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1763k
    /* JADX INFO: renamed from: a */
    public final InterfaceC1774n1 mo4363a(C1771m1 c1771m1) {
        return new C1795u1(this.f5907a, this.f5908b, this.f5909c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1768l1) {
            C1768l1 c1768l1 = (C1768l1) obj;
            if (c1768l1.f5907a == this.f5907a && c1768l1.f5908b == this.f5908b && AbstractC1416l.m3825a(c1768l1.f5909c, this.f5909c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((this.f5909c.hashCode() + (this.f5907a * 31)) * 31) + this.f5908b;
    }
}
