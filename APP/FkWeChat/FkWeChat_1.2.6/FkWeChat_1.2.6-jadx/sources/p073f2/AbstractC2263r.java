package p073f2;

import p250r1.C6455e;

/* JADX INFO: renamed from: f2.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2263r {
    /* JADX INFO: renamed from: a */
    public static final boolean m8228a(C2236d0 c2236d0) {
        return (c2236d0.m8085p() || c2236d0.m8081l() || !c2236d0.m8078i()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m8229b(C2236d0 c2236d0) {
        return !c2236d0.m8081l() && c2236d0.m8078i();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m8230c(C2236d0 c2236d0) {
        return (c2236d0.m8085p() || !c2236d0.m8081l() || c2236d0.m8078i()) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m8231d(C2236d0 c2236d0) {
        return c2236d0.m8081l() && !c2236d0.m8078i();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m8232e(C2236d0 c2236d0, long j10) {
        long jM8077h = c2236d0.m8077h();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM8077h >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM8077h & 4294967295L));
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return (fIntBitsToFloat > ((float) i10)) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) i11));
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m8233f(C2236d0 c2236d0, long j10, long j11) {
        boolean zM8244g = AbstractC2264r0.m8244g(c2236d0.m8083n(), AbstractC2264r0.f6219a.m8250d());
        long jM8077h = c2236d0.m8077h();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM8077h >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM8077h & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32));
        float f10 = zM8244g ? 1.0f : 0.0f;
        float f11 = fIntBitsToFloat3 * f10;
        float f12 = ((int) (j10 >> 32)) + f11;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f10;
        return (fIntBitsToFloat > f12) | (fIntBitsToFloat < (-f11)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j10 & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX INFO: renamed from: g */
    public static final long m8234g(C2236d0 c2236d0) {
        return m8236i(c2236d0, false);
    }

    /* JADX INFO: renamed from: h */
    public static final long m8235h(C2236d0 c2236d0) {
        return m8236i(c2236d0, true);
    }

    /* JADX INFO: renamed from: i */
    public static final long m8236i(C2236d0 c2236d0, boolean z10) {
        return (z10 || !c2236d0.m8085p()) ? C6455e.m25562p(c2236d0.m8077h(), c2236d0.m8080k()) : C6455e.f20314b.m25569c();
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m8237j(C2236d0 c2236d0) {
        return !C6455e.m25556j(m8236i(c2236d0, true), C6455e.f20314b.m25569c());
    }
}
