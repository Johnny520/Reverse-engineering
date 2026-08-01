package p276t1;

import p024b9.AbstractC1043k;
import p152k3.AbstractC3950d;
import p265s1.AbstractC7138s1;

/* JADX INFO: renamed from: t1.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8049q extends AbstractC8027c {

    /* JADX INFO: renamed from: e */
    public static final a f26846e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final float[] f26847f;

    /* JADX INFO: renamed from: g */
    public static final float[] f26848g;

    /* JADX INFO: renamed from: h */
    public static final float[] f26849h;

    /* JADX INFO: renamed from: i */
    public static final float[] f26850i;

    static {
        float[] fArrM30834b = AbstractC8023a.f26742b.m30835a().m30834b();
        C8047o c8047o = C8047o.f26833a;
        float[] fArrM30869l = AbstractC8029d.m30869l(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC8029d.m30862e(fArrM30834b, c8047o.m30973b().m30932c(), c8047o.m30976e().m30932c()));
        f26847f = fArrM30869l;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f26848g = fArr;
        f26849h = AbstractC8029d.m30868k(fArrM30869l);
        f26850i = AbstractC8029d.m30868k(fArr);
    }

    public C8049q(String str, int i10) {
        super(str, AbstractC8025b.f26749a.m30845a(), i10, null);
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: c */
    public float mo30850c(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: d */
    public float mo30851d(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: h */
    public long mo30855h(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f26850i;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f26849h;
        return (((long) Float.floatToRawIntBits(((fArr2[0] * f17) + (fArr2[3] * f18)) + (fArr2[6] * f19))) << 32) | (((long) Float.floatToRawIntBits((fArr2[1] * f17) + (fArr2[4] * f18) + (fArr2[7] * f19))) & 4294967295L);
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: i */
    public float mo30856i(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f26850i;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f26849h;
        return (fArr2[2] * f17) + (fArr2[5] * f18) + (fArr2[8] * f16 * f16 * f16);
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: j */
    public long mo30857j(float f10, float f11, float f12, float f13, AbstractC8027c abstractC8027c) {
        float[] fArr = f26847f;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        float fM15659a = AbstractC3950d.m15659a(f14);
        float fM15659a2 = AbstractC3950d.m15659a(f15);
        float fM15659a3 = AbstractC3950d.m15659a(f16);
        float[] fArr2 = f26848g;
        return AbstractC7138s1.m28197a((fArr2[0] * fM15659a) + (fArr2[3] * fM15659a2) + (fArr2[6] * fM15659a3), (fArr2[1] * fM15659a) + (fArr2[4] * fM15659a2) + (fArr2[7] * fM15659a3), (fArr2[2] * fM15659a) + (fArr2[5] * fM15659a2) + (fArr2[8] * fM15659a3), f13, abstractC8027c);
    }

    /* JADX INFO: renamed from: t1.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
