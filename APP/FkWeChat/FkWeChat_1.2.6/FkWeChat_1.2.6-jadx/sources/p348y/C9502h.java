package p348y;

import p165l1.InterfaceC4507m;

/* JADX INFO: renamed from: y.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9502h extends InterfaceC4507m.c {

    /* JADX INFO: renamed from: F */
    public InterfaceC9495a f32273F;

    /* JADX INFO: renamed from: G */
    public final boolean f32274G;

    public C9502h(InterfaceC9495a interfaceC9495a) {
        this.f32273F = interfaceC9495a;
    }

    /* JADX INFO: renamed from: G2 */
    public final void m37004G2() {
        InterfaceC9495a interfaceC9495a = this.f32273F;
        if (interfaceC9495a instanceof C9498d) {
            interfaceC9495a.getClass();
            ((C9498d) interfaceC9495a).m36997c().m37043p(this);
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final void m37005H2(InterfaceC9495a interfaceC9495a) {
        m37004G2();
        if (interfaceC9495a instanceof C9498d) {
            ((C9498d) interfaceC9495a).m36997c().m37029b(this);
        }
        this.f32273F = interfaceC9495a;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: k2 */
    public boolean mo1260k2() {
        return this.f32274G;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: p2 */
    public void mo1377p2() {
        m37005H2(this.f32273F);
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: q2 */
    public void mo1378q2() {
        m37004G2();
    }
}
