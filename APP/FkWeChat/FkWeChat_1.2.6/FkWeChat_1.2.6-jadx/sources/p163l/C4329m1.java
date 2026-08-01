package p163l;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l.m1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4329m1 implements InterfaceC4317k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4317k f12666a;

    /* JADX INFO: renamed from: b */
    public final long f12667b;

    public C4329m1(InterfaceC4317k interfaceC4317k, long j10) {
        this.f12666a = interfaceC4317k;
        this.f12667b = j10;
    }

    @Override // p163l.InterfaceC4317k
    /* JADX INFO: renamed from: a */
    public InterfaceC4341o3 mo16829a(InterfaceC4365t2 interfaceC4365t2) {
        return new C4334n1(this.f12666a.mo16829a(interfaceC4365t2), this.f12667b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4329m1)) {
            return false;
        }
        C4329m1 c4329m1 = (C4329m1) obj;
        return c4329m1.f12667b == this.f12667b && AbstractC1061t.m3842c(c4329m1.f12666a, this.f12666a);
    }

    public int hashCode() {
        return (this.f12666a.hashCode() * 31) + Long.hashCode(this.f12667b);
    }
}
