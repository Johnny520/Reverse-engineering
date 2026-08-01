package p000;

/* JADX INFO: renamed from: ym */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0968ym {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    default int mo641F(float f) {
        float fMo654p = mo654p(f);
        if (Float.isInfinite(fMo654p)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo654p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    default long mo644M(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo654p = mo654p(Float.intBitsToFloat((int) (j >> 32)));
        float fMo654p2 = mo654p(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (((long) Float.floatToRawIntBits(fMo654p)) << 32) | (((long) Float.floatToRawIntBits(fMo654p2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    default float mo645P(long j) {
        if (!v71.m4419a(u71.m4287b(j), 4294967296L)) {
            y10.m5198b("Only Sp can convert to Px");
        }
        return mo654p(mo188y(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    default long mo647Z(float f) {
        return mo187o(mo653i0(f));
    }

    /* JADX INFO: renamed from: b */
    float mo48b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    default float mo652f0(int i) {
        return i / mo48b();
    }

    /* JADX INFO: renamed from: h */
    float mo49h();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    default float mo653i0(float f) {
        return f / mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    default long mo187o(float f) {
        float[] fArr = AbstractC0866vv.f6826a;
        if (mo49h() < 1.03f) {
            return j50.m1670t(f / mo49h(), 4294967296L);
        }
        InterfaceC0817uv interfaceC0817uvM4791a = AbstractC0866vv.m4791a(mo49h());
        return j50.m1670t(interfaceC0817uvM4791a != null ? interfaceC0817uvM4791a.mo2685a(f) : f / mo49h(), 4294967296L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    default float mo654p(float f) {
        return mo48b() * f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    default float mo188y(long j) {
        if (!v71.m4419a(u71.m4287b(j), 4294967296L)) {
            y10.m5198b("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC0866vv.f6826a;
        if (mo49h() < 1.03f) {
            return mo49h() * u71.m4288c(j);
        }
        InterfaceC0817uv interfaceC0817uvM4791a = AbstractC0866vv.m4791a(mo49h());
        if (interfaceC0817uvM4791a != null) {
            return interfaceC0817uvM4791a.mo2686b(u71.m4288c(j));
        }
        return mo49h() * u71.m4288c(j);
    }
}
