package p142jg;

import cg.AbstractC0565a;
import kg.C2405a;
import p136j8.C2104o;
import p219oh.AbstractC3165h;

/* JADX INFO: renamed from: jg.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2136d {

    /* JADX INFO: renamed from: g */
    public static final AbstractC2133a f7122g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Integer num = AbstractC0565a.f1760a;
        f7122g = (num == null || num.intValue() >= 34) ? new C2405a() : new C2134b();
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo5356a(int i9);

    /* JADX INFO: renamed from: b */
    public abstract int mo5357b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public int mo5361c(int i9, int i10) {
        int iMo5357b;
        int i11;
        int iMo5356a;
        if (i10 <= i9) {
            C2104o.m5291q(AbstractC3165h.m6783j(Integer.valueOf(i9), Integer.valueOf(i10)));
            return 0;
        }
        int i12 = i10 - i9;
        if (i12 > 0 || i12 == Integer.MIN_VALUE) {
            if (((-i12) & i12) == i12) {
                iMo5356a = mo5356a(31 - Integer.numberOfLeadingZeros(i12));
            } else {
                do {
                    iMo5357b = mo5357b() >>> 1;
                    i11 = iMo5357b % i12;
                } while ((i12 - 1) + (iMo5357b - i11) < 0);
                iMo5356a = i11;
            }
            return i9 + iMo5356a;
        }
        while (true) {
            int iMo5357b2 = mo5357b();
            if (i9 <= iMo5357b2 && iMo5357b2 < i10) {
                return iMo5357b2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo5358d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public long mo5362e(long j3, long j4) {
        long jMo5358d;
        long j5;
        long jMo5356a;
        int iMo5357b;
        if (j4 <= j3) {
            C2104o.m5291q(AbstractC3165h.m6783j(Long.valueOf(j3), Long.valueOf(j4)));
            return 0L;
        }
        long j10 = j4 - j3;
        if (j10 > 0) {
            if (((-j10) & j10) == j10) {
                int i9 = (int) j10;
                int i10 = (int) (j10 >>> 32);
                if (i9 != 0) {
                    iMo5357b = mo5356a(31 - Integer.numberOfLeadingZeros(i9));
                } else if (i10 == 1) {
                    iMo5357b = mo5357b();
                } else {
                    jMo5356a = (((long) mo5356a(31 - Integer.numberOfLeadingZeros(i10))) << 32) + (((long) mo5357b()) & 4294967295L);
                }
                jMo5356a = ((long) iMo5357b) & 4294967295L;
            } else {
                do {
                    jMo5358d = mo5358d() >>> 1;
                    j5 = jMo5358d % j10;
                } while ((j10 - 1) + (jMo5358d - j5) < 0);
                jMo5356a = j5;
            }
            return j3 + jMo5356a;
        }
        while (true) {
            long jMo5358d2 = mo5358d();
            if (j3 <= jMo5358d2 && jMo5358d2 < j4) {
                return jMo5358d2;
            }
        }
    }
}
