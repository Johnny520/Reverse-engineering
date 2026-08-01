package p276t1;

import p024b9.AbstractC1043k;
import p265s1.AbstractC7138s1;

/* JADX INFO: renamed from: t1.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8048p extends AbstractC8027c {

    /* JADX INFO: renamed from: e */
    public static final a f26845e = new a(null);

    public C8048p(String str, int i10) {
        super(str, AbstractC8025b.f26749a.m30845a(), i10, null);
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: c */
    public float mo30850c(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: d */
    public float mo30851d(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: h */
    public long mo30855h(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f13 = (f10 + 16.0f) / 116.0f;
        float f14 = (f11 * 0.002f) + f13;
        float f15 = f14 > 0.20689656f ? f14 * f14 * f14 : (f14 - 0.13793103f) * 0.12841855f;
        float f16 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
        C8047o c8047o = C8047o.f26833a;
        return (((long) Float.floatToRawIntBits(f16 * c8047o.m30974c()[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f15 * c8047o.m30974c()[0])) << 32);
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: i */
    public float mo30856i(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        float f13 = ((f10 + 16.0f) / 116.0f) - (f12 * 0.005f);
        return (f13 > 0.20689656f ? f13 * f13 * f13 : 0.12841855f * (f13 - 0.13793103f)) * C8047o.f26833a.m30974c()[2];
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: j */
    public long mo30857j(float f10, float f11, float f12, float f13, AbstractC8027c abstractC8027c) {
        C8047o c8047o = C8047o.f26833a;
        float f14 = f10 / c8047o.m30974c()[0];
        float f15 = f11 / c8047o.m30974c()[1];
        float f16 = f12 / c8047o.m30974c()[2];
        float fCbrt = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
        float f17 = (116.0f * fCbrt2) - 16.0f;
        float f18 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 100.0f) {
            f17 = 100.0f;
        }
        if (f18 < -128.0f) {
            f18 = -128.0f;
        }
        if (f18 > 128.0f) {
            f18 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return AbstractC7138s1.m28197a(f17, f18, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f13, abstractC8027c);
    }

    /* JADX INFO: renamed from: t1.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
