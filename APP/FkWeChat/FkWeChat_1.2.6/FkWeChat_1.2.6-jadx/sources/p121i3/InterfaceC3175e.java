package p121i3;

import p250r1.C6461k;

/* JADX INFO: renamed from: i3.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3175e extends InterfaceC3183m {
    /* JADX INFO: renamed from: J0 */
    default long mo1223J0(float f10) {
        return mo1229a0(mo1227R0(f10));
    }

    /* JADX INFO: renamed from: J1 */
    default long mo1224J1(long j10) {
        if (j10 == 9205357640488583168L) {
            return C6461k.f20335b.m25626a();
        }
        float fMo1233i1 = mo1233i1(C3182l.m12033j(j10));
        return C6461k.m25616d((((long) Float.floatToRawIntBits(mo1233i1(C3182l.m12032i(j10)))) & 4294967295L) | (Float.floatToRawIntBits(fMo1233i1) << 32));
    }

    /* JADX INFO: renamed from: O0 */
    default float mo1225O0(int i10) {
        return C3179i.m12003k(i10 / getDensity());
    }

    /* JADX INFO: renamed from: O1 */
    default float mo1226O1(long j10) {
        if (!C3195y.m12123g(C3193w.m12102g(j10), C3195y.f8493b.m12128b())) {
            AbstractC3184n.m12040b("Only Sp can convert to Px");
        }
        return mo1233i1(mo1234m0(j10));
    }

    /* JADX INFO: renamed from: R0 */
    default float mo1227R0(float f10) {
        return C3179i.m12003k(f10 / getDensity());
    }

    /* JADX INFO: renamed from: c0 */
    default long mo1230c0(long j10) {
        return j10 != 9205357640488583168L ? AbstractC3180j.m12013a(mo1227R0(Float.intBitsToFloat((int) (j10 >> 32))), mo1227R0(Float.intBitsToFloat((int) (j10 & 4294967295L)))) : C3182l.f8467b.m12037a();
    }

    float getDensity();

    /* JADX INFO: renamed from: i1 */
    default float mo1233i1(float f10) {
        return f10 * getDensity();
    }

    /* JADX INFO: renamed from: x1 */
    default int mo1236x1(float f10) {
        float fMo1233i1 = mo1233i1(f10);
        if (Float.isInfinite(fMo1233i1)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo1233i1);
    }
}
