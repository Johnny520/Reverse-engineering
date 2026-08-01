package p107h6;

import p024b9.AbstractC1052o0;
import p024b9.C1047m;

/* JADX INFO: renamed from: h6.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2877e extends AbstractC2882j {
    public C2877e() {
        super(EnumC2875c.f7539v, AbstractC1052o0.m3807b(Float.TYPE), null, EnumC2889q.f7629s, Float.valueOf(0.0f));
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void mo10315d(C2886n c2886n, Object obj) {
        m10343r(c2886n, ((Number) obj).floatValue());
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ void mo10316e(C2888p c2888p, Object obj) {
        m10344s(c2888p, ((Number) obj).floatValue());
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ int mo10319j(Object obj) {
        return m10345t(((Number) obj).floatValue());
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Float mo10314a(C2885m c2885m) {
        c2885m.getClass();
        C1047m c1047m = C1047m.f3206a;
        return Float.valueOf(Float.intBitsToFloat(c2885m.m10488k()));
    }

    /* JADX INFO: renamed from: r */
    public void m10343r(C2886n c2886n, float f10) {
        c2886n.getClass();
        c2886n.m10497b(Float.floatToIntBits(f10));
    }

    /* JADX INFO: renamed from: s */
    public void m10344s(C2888p c2888p, float f10) {
        c2888p.getClass();
        c2888p.m10526g(Float.floatToIntBits(f10));
    }

    /* JADX INFO: renamed from: t */
    public int m10345t(float f10) {
        return 4;
    }
}
