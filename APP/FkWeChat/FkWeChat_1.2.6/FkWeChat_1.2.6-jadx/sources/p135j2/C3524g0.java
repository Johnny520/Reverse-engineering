package p135j2;

import p010a9.InterfaceC0189q;
import p121i3.C3173c;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4534e0;

/* JADX INFO: renamed from: j2.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3524g0 extends InterfaceC4507m.c implements InterfaceC4534e0 {

    /* JADX INFO: renamed from: F */
    public InterfaceC0189q f9759F;

    public C3524g0(InterfaceC0189q interfaceC0189q) {
        this.f9759F = interfaceC0189q;
    }

    /* JADX INFO: renamed from: G2 */
    public final void m13123G2(InterfaceC0189q interfaceC0189q) {
        this.f9759F = interfaceC0189q;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        return (InterfaceC3558p0) this.f9759F.mo236e(interfaceC3561q0, interfaceC3552n0, C3173c.m11962a(j10));
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f9759F + ')';
    }
}
