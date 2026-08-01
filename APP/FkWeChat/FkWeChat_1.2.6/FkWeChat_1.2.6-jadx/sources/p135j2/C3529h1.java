package p135j2;

import p121i3.EnumC3191u;
import p135j2.AbstractC3545l1;
import p166l2.InterfaceC4580q1;

/* JADX INFO: renamed from: j2.h1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3529h1 extends AbstractC3545l1.a {

    /* JADX INFO: renamed from: r */
    public final InterfaceC4580q1 f9772r;

    public C3529h1(InterfaceC4580q1 interfaceC4580q1) {
        this.f9772r = interfaceC4580q1;
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: c1 */
    public float mo1231c1() {
        return this.f9772r.getDensity().mo1231c1();
    }

    @Override // p121i3.InterfaceC3175e
    public float getDensity() {
        return this.f9772r.getDensity().getDensity();
    }

    @Override // p135j2.AbstractC3545l1.a
    /* JADX INFO: renamed from: q */
    public EnumC3191u mo13131q() {
        return this.f9772r.getLayoutDirection();
    }

    @Override // p135j2.AbstractC3545l1.a
    /* JADX INFO: renamed from: t */
    public int mo13132t() {
        return this.f9772r.getRoot().m17860G0();
    }
}
