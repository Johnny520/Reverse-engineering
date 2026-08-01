package p153e1;

import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1926h;
import p159f1.AbstractC2096b;
import p159f1.InterfaceC2095a;

/* JADX INFO: renamed from: e1.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2007c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    default long mo266C(float f2) {
        float[] fArr = AbstractC2096b.f7022a;
        if (mo282p() < 1.03f) {
            return AbstractC1926h.m3582y(f2 / mo282p(), 4294967296L);
        }
        InterfaceC2095a interfaceC2095aM3873a = AbstractC2096b.m3873a(mo282p());
        return AbstractC1926h.m3582y(interfaceC2095aM3873a != null ? interfaceC2095aM3873a.mo3706a(f2) : f2 / mo282p(), 4294967296L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    default long mo267E(long j5) {
        if (j5 != 9205357640488583168L) {
            return AbstractC1922d.m3423b(mo284u0(Float.intBitsToFloat((int) (j5 >> 32))), mo284u0(Float.intBitsToFloat((int) (j5 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    default float mo268G(float f2) {
        return mo272b() * f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    default float mo269M(long j5) {
        float fM3710c;
        float fMo282p;
        if (!C2020p.m3712a(C2019o.m3709b(j5), 4294967296L)) {
            AbstractC2013i.m3699b("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC2096b.f7022a;
        if (mo282p() >= 1.03f) {
            InterfaceC2095a interfaceC2095aM3873a = AbstractC2096b.m3873a(mo282p());
            fM3710c = C2019o.m3710c(j5);
            if (interfaceC2095aM3873a != null) {
                return interfaceC2095aM3873a.mo3707b(fM3710c);
            }
            fMo282p = mo282p();
        } else {
            fM3710c = C2019o.m3710c(j5);
            fMo282p = mo282p();
        }
        return fMo282p * fM3710c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    default int mo270S(float f2) {
        float fMo268G = mo268G(f2);
        if (Float.isInfinite(fMo268G)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo268G);
    }

    /* JADX INFO: renamed from: b */
    float mo272b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    default long mo273c0(long j5) {
        if (j5 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo268G = mo268G(Float.intBitsToFloat((int) (j5 >> 32)));
        return (((long) Float.floatToRawIntBits(mo268G(Float.intBitsToFloat((int) (j5 & 4294967295L))))) & 4294967295L) | (Float.floatToRawIntBits(fMo268G) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    default float mo276e0(long j5) {
        if (!C2020p.m3712a(C2019o.m3709b(j5), 4294967296L)) {
            AbstractC2013i.m3699b("Only Sp can convert to Px");
        }
        return mo268G(mo269M(j5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    default long mo280k0(float f2) {
        return mo266C(mo284u0(f2));
    }

    /* JADX INFO: renamed from: p */
    float mo282p();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    default float mo283q0(int i5) {
        return i5 / mo272b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    default float mo284u0(float f2) {
        return f2 / mo272b();
    }
}
