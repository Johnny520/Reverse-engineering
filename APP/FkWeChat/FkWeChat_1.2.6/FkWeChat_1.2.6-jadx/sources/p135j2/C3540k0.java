package p135j2;

import p121i3.EnumC3191u;
import p135j2.AbstractC3545l1;
import p166l2.AbstractC4585s0;

/* JADX INFO: renamed from: j2.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3540k0 extends AbstractC3545l1.a {

    /* JADX INFO: renamed from: r */
    public final AbstractC4585s0 f9854r;

    public C3540k0(AbstractC4585s0 abstractC4585s0) {
        this.f9854r = abstractC4585s0;
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: c1 */
    public float mo1231c1() {
        return this.f9854r.mo1231c1();
    }

    @Override // p121i3.InterfaceC3175e
    public float getDensity() {
        return this.f9854r.getDensity();
    }

    @Override // p135j2.AbstractC3545l1.a
    /* JADX INFO: renamed from: o */
    public float mo13234o(AbstractC3571t1 abstractC3571t1, float f10) {
        return abstractC3571t1.m13363b() != null ? ((Number) abstractC3571t1.m13363b().invoke(this, Float.valueOf(f10))).floatValue() : this.f9854r.m18216v1(abstractC3571t1, f10);
    }

    @Override // p135j2.AbstractC3545l1.a
    /* JADX INFO: renamed from: q */
    public EnumC3191u mo13131q() {
        return this.f9854r.getLayoutDirection();
    }

    @Override // p135j2.AbstractC3545l1.a
    /* JADX INFO: renamed from: t */
    public int mo13132t() {
        return this.f9854r.mo13262K0();
    }
}
