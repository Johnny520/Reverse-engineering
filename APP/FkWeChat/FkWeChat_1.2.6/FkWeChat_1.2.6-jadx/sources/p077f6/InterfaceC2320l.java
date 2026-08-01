package p077f6;

import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0188p;
import p121i3.InterfaceC3175e;
import p215oc.C5729x;
import p250r1.C6461k;

/* JADX INFO: renamed from: f6.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2320l {

    /* JADX INFO: renamed from: a */
    public static final a f6357a = a.f6358a;

    /* JADX INFO: renamed from: f6.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f6358a = new a();
    }

    /* JADX INFO: renamed from: f6.l$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6359a;

        static {
            int[] iArr = new int[EnumC2322m.values().length];
            try {
                iArr[EnumC2322m.f6360q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2322m.f6361r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6359a = iArr;
        }
    }

    /* JADX INFO: renamed from: c */
    static long m8478c(long j10, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return C6461k.m25616d((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: a */
    AbstractC2318k mo8479a(String str, InterfaceC0572r interfaceC0572r, int i10);

    /* JADX INFO: renamed from: b */
    default C2325n0 mo8480b(String str, InterfaceC3175e interfaceC3175e, long j10, EnumC2322m enumC2322m, long j11, InterfaceC0188p interfaceC0188p) {
        long jM8478c;
        str.getClass();
        interfaceC3175e.getClass();
        enumC2322m.getClass();
        if (j10 == 9205357640488583168L) {
            jM8478c = C6461k.m25616d((((long) Float.floatToRawIntBits(200.0f)) << 32) | (((long) Float.floatToRawIntBits(200.0f)) & 4294967295L));
        } else if (j11 == 9205357640488583168L) {
            float fMin = Math.min(200.0f, Math.min(interfaceC3175e.mo1227R0(Float.intBitsToFloat((int) (j10 & 4294967295L))), interfaceC3175e.mo1227R0(Float.intBitsToFloat((int) (j10 >> 32)))));
            jM8478c = C6461k.m25616d((((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMin)) & 4294967295L));
        } else {
            float fMo1227R0 = interfaceC3175e.mo1227R0(Float.intBitsToFloat((int) (j11 >> 32)));
            float fMo1227R02 = interfaceC3175e.mo1227R0(Float.intBitsToFloat((int) (j11 & 4294967295L)));
            float fMo1227R03 = interfaceC3175e.mo1227R0(Float.intBitsToFloat((int) (j10 >> 32)));
            float fMin2 = Math.min(fMo1227R02, interfaceC3175e.mo1227R0(Float.intBitsToFloat((int) (j10 & 4294967295L))));
            int[] iArr = b.f6359a;
            int i10 = iArr[enumC2322m.ordinal()];
            if (i10 == 1) {
                fMo1227R03 = Math.min(fMo1227R0, fMo1227R03);
            } else if (i10 != 2) {
                C5729x.m23182a();
                return null;
            }
            if (fMo1227R03 < fMo1227R0 || fMin2 < fMo1227R02) {
                int i11 = iArr[enumC2322m.ordinal()];
                if (i11 == 1) {
                    jM8478c = m8478c(C6461k.m25616d((((long) Float.floatToRawIntBits(fMo1227R0)) << 32) | (((long) Float.floatToRawIntBits(fMo1227R02)) & 4294967295L)), Math.min(fMo1227R03 / fMo1227R0, fMin2 / fMo1227R02));
                } else {
                    if (i11 != 2) {
                        C5729x.m23182a();
                        return null;
                    }
                    jM8478c = C6461k.m25616d((((long) Float.floatToRawIntBits(fMo1227R03)) << 32) | (((long) Float.floatToRawIntBits(fMo1227R02 * (fMo1227R03 / fMo1227R0))) & 4294967295L));
                }
            } else {
                int i12 = iArr[enumC2322m.ordinal()];
                if (i12 == 1) {
                    jM8478c = C6461k.m25616d((((long) Float.floatToRawIntBits(fMin2)) & 4294967295L) | (Float.floatToRawIntBits(fMo1227R03) << 32));
                } else {
                    if (i12 != 2) {
                        C5729x.m23182a();
                        return null;
                    }
                    jM8478c = C6461k.m25616d((((long) Float.floatToRawIntBits(fMo1227R03)) << 32) | (((long) Float.floatToRawIntBits(fMo1227R02 * (fMo1227R03 / fMo1227R0))) & 4294967295L));
                }
            }
        }
        return new C2325n0(jM8478c, 0, 2, null);
    }
}
