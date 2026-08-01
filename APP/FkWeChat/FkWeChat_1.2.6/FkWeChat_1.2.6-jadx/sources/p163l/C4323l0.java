package p163l;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: l.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4323l0 implements InterfaceC4308i0 {

    /* JADX INFO: renamed from: a */
    public final float f12647a;

    /* JADX INFO: renamed from: b */
    public final float f12648b;

    /* JADX INFO: renamed from: c */
    public final float f12649c;

    /* JADX INFO: renamed from: d */
    public final C4319k1 f12650d;

    public C4323l0(float f10, float f11, float f12) {
        this.f12647a = f10;
        this.f12648b = f11;
        this.f12649c = f12;
        C4319k1 c4319k1 = new C4319k1(1.0f);
        c4319k1.m16961c(f10);
        c4319k1.m16963e(f11);
        this.f12650d = c4319k1;
    }

    @Override // p163l.InterfaceC4308i0
    /* JADX INFO: renamed from: b */
    public float mo16935b(long j10, float f10, float f11, float f12) {
        this.f12650d.m16962d(f11);
        return Float.intBitsToFloat((int) (this.f12650d.m16964f(f10, f12, j10 / 1000000) & 4294967295L));
    }

    @Override // p163l.InterfaceC4308i0
    /* JADX INFO: renamed from: c */
    public long mo16936c(float f10, float f11, float f12) {
        float fM16960b = this.f12650d.m16960b();
        float fM16959a = this.f12650d.m16959a();
        float f13 = f10 - f11;
        float f14 = this.f12649c;
        return AbstractC4314j1.m16953b(fM16960b, fM16959a, f12 / f14, f13 / f14, 1.0f) * 1000000;
    }

    @Override // p163l.InterfaceC4308i0
    /* JADX INFO: renamed from: d */
    public float mo16937d(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // p163l.InterfaceC4308i0
    /* JADX INFO: renamed from: e */
    public float mo16938e(long j10, float f10, float f11, float f12) {
        this.f12650d.m16962d(f11);
        return Float.intBitsToFloat((int) (this.f12650d.m16964f(f10, f12, j10 / 1000000) >> 32));
    }

    public /* synthetic */ C4323l0(float f10, float f11, float f12, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }
}
