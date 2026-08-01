package p276t1;

import p265s1.AbstractC7138s1;

/* JADX INFO: renamed from: t1.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8042j0 extends AbstractC8027c {
    public C8042j0(String str, int i10) {
        super(str, AbstractC8025b.f26749a.m30847c(), i10, null);
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: c */
    public float mo30850c(int i10) {
        return 2.0f;
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: d */
    public float mo30851d(int i10) {
        return -2.0f;
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: h */
    public long mo30855h(float f10, float f11, float f12) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11 <= 2.0f ? f11 : 2.0f)) & 4294967295L);
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: i */
    public float mo30856i(float f10, float f11, float f12) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            return 2.0f;
        }
        return f12;
    }

    @Override // p276t1.AbstractC8027c
    /* JADX INFO: renamed from: j */
    public long mo30857j(float f10, float f11, float f12, float f13, AbstractC8027c abstractC8027c) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        return AbstractC7138s1.m28197a(f10, f11, f12 <= 2.0f ? f12 : 2.0f, f13, abstractC8027c);
    }
}
