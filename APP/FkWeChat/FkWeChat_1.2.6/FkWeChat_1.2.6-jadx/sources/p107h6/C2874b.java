package p107h6;

import p024b9.AbstractC1052o0;
import p024b9.C1045l;

/* JADX INFO: renamed from: h6.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2874b extends AbstractC2882j {
    public C2874b() {
        super(EnumC2875c.f7537t, AbstractC1052o0.m3807b(Double.TYPE), null, EnumC2889q.f7629s, Double.valueOf(0.0d));
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void mo10315d(C2886n c2886n, Object obj) {
        m10329r(c2886n, ((Number) obj).doubleValue());
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ void mo10316e(C2888p c2888p, Object obj) {
        m10330s(c2888p, ((Number) obj).doubleValue());
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ int mo10319j(Object obj) {
        return m10331t(((Number) obj).doubleValue());
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double mo10314a(C2885m c2885m) {
        c2885m.getClass();
        C1045l c1045l = C1045l.f3204a;
        return Double.valueOf(Double.longBitsToDouble(c2885m.m10489l()));
    }

    /* JADX INFO: renamed from: r */
    public void m10329r(C2886n c2886n, double d10) {
        c2886n.getClass();
        c2886n.m10498c(Double.doubleToLongBits(d10));
    }

    /* JADX INFO: renamed from: s */
    public void m10330s(C2888p c2888p, double d10) {
        c2888p.getClass();
        c2888p.m10527h(Double.doubleToLongBits(d10));
    }

    /* JADX INFO: renamed from: t */
    public int m10331t(double d10) {
        return 8;
    }
}
