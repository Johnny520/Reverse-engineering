package p293u2;

import p092g4.AbstractC1341a;
import p309v2.AbstractC4443b;
import p309v2.InterfaceC4442a;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: u2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4233c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    default int mo1590G0(float f3) {
        float fMo1601x0 = mo1601x0(f3);
        if (Float.isInfinite(fMo1601x0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo1601x0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    default long mo1591J(float f3) {
        float[] fArr = AbstractC4443b.f14751a;
        if (mo1335q0() < 1.03f) {
            return AbstractC5700d.m10260R(4294967296L, f3 / mo1335q0());
        }
        InterfaceC4442a interfaceC4442aM8893a = AbstractC4443b.m8893a(mo1335q0());
        return AbstractC5700d.m10260R(4294967296L, interfaceC4442aM8893a != null ? interfaceC4442aM8893a.mo8536a(f3) : f3 / mo1335q0());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    default long mo1592K(long j3) {
        if (j3 != 9205357640488583168L) {
            return AbstractC1341a.m3588d(mo1600l0(Float.intBitsToFloat((int) (j3 >> 32))), mo1600l0(Float.intBitsToFloat((int) (j3 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    default long mo1593L0(long j3) {
        if (j3 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo1601x0 = mo1601x0(C4238h.m8524b(j3));
        return (((long) Float.floatToRawIntBits(mo1601x0(C4238h.m8523a(j3)))) & 4294967295L) | (Float.floatToRawIntBits(fMo1601x0) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    default float mo1594O0(long j3) {
        if (!C4246p.m8542a(C4245o.m8539b(j3), 4294967296L)) {
            AbstractC4239i.m8526b("Only Sp can convert to Px");
        }
        return mo1601x0(mo1595S(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    default float mo1595S(long j3) {
        float fM8540c;
        float fMo1335q0;
        if (!C4246p.m8542a(C4245o.m8539b(j3), 4294967296L)) {
            AbstractC4239i.m8526b("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC4443b.f14751a;
        if (mo1335q0() >= 1.03f) {
            InterfaceC4442a interfaceC4442aM8893a = AbstractC4443b.m8893a(mo1335q0());
            fM8540c = C4245o.m8540c(j3);
            if (interfaceC4442aM8893a != null) {
                return interfaceC4442aM8893a.mo8537b(fM8540c);
            }
            fMo1335q0 = mo1335q0();
        } else {
            fM8540c = C4245o.m8540c(j3);
            fMo1335q0 = mo1335q0();
        }
        return fMo1335q0 * fM8540c;
    }

    /* JADX INFO: renamed from: d */
    float mo1333d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    default long mo1598e0(float f3) {
        return mo1591J(mo1600l0(f3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    default float mo1599i0(int i9) {
        return i9 / mo1333d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    default float mo1600l0(float f3) {
        return f3 / mo1333d();
    }

    /* JADX INFO: renamed from: q0 */
    float mo1335q0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    default float mo1601x0(float f3) {
        return mo1333d() * f3;
    }
}
