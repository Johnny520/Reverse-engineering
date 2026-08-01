package p163l;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: l.i1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4309i1 implements InterfaceC4283d0 {

    /* JADX INFO: renamed from: a */
    public final int f12630a;

    public /* synthetic */ C4309i1(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    @Override // p163l.InterfaceC4317k
    /* JADX INFO: renamed from: a */
    public InterfaceC4356r3 mo16829a(InterfaceC4365t2 interfaceC4365t2) {
        return new C4391y3(this.f12630a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4309i1) && ((C4309i1) obj).f12630a == this.f12630a;
    }

    public int hashCode() {
        return this.f12630a;
    }

    public C4309i1(int i10) {
        this.f12630a = i10;
    }
}
