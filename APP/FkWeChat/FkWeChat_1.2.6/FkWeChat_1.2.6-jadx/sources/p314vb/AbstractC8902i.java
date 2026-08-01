package p314vb;

import okhttp3.internal.p218ws.RealWebSocket;
import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: vb.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8902i extends AbstractC8901h {

    /* JADX INFO: renamed from: vb.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29503a;

        static {
            int[] iArr = new int[EnumC8900g.values().length];
            try {
                iArr[EnumC8900g.f29499x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8900g.f29498w.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8900g.f29497v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8900g.f29496u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC8900g.f29495t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC8900g.f29493r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC8900g.f29494s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f29503a = iArr;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final long m34169c(long j10, EnumC8900g enumC8900g) {
        enumC8900g.getClass();
        return m34171e(j10, m34170d(enumC8900g));
    }

    /* JADX INFO: renamed from: d */
    public static final long m34170d(EnumC8900g enumC8900g) {
        int i10 = a.f29503a[enumC8900g.ordinal()];
        if (i10 == 1) {
            return 86400000L;
        }
        if (i10 == 2) {
            return 3600000L;
        }
        if (i10 == 3) {
            return RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        }
        if (i10 == 4) {
            return 1000L;
        }
        if (i10 == 5) {
            return 1L;
        }
        C8897d.m34134a("Wrong unit for millisMultiplier: ", enumC8900g);
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public static final long m34171e(long j10, long j11) {
        if (j10 == 0) {
            return 0L;
        }
        if (j10 == 1) {
            return AbstractC2368o.m8583j(j11, 4611686018427387903L);
        }
        if (j11 == 1) {
            return AbstractC2368o.m8583j(j10, 4611686018427387903L);
        }
        int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j10)) - Long.numberOfLeadingZeros(j11);
        if (iNumberOfLeadingZeros < 63) {
            return j10 * j11;
        }
        if (iNumberOfLeadingZeros > 63) {
            return 4611686018427387903L;
        }
        return AbstractC2368o.m8583j(j10 * j11, 4611686018427387903L);
    }
}
