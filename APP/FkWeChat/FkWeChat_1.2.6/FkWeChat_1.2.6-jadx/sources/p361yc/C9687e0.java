package p361yc;

import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5106t;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9687e0 {

    /* JADX INFO: renamed from: e */
    public static final a f32918e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final long[] f32919f = new long[0];

    /* JADX INFO: renamed from: a */
    public final InterfaceC9218f f32920a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0188p f32921b;

    /* JADX INFO: renamed from: c */
    public long f32922c;

    /* JADX INFO: renamed from: d */
    public final long[] f32923d;

    public C9687e0(InterfaceC9218f interfaceC9218f, InterfaceC0188p interfaceC0188p) {
        interfaceC9218f.getClass();
        interfaceC0188p.getClass();
        this.f32920a = interfaceC9218f;
        this.f32921b = interfaceC0188p;
        int iMo35891e = interfaceC9218f.mo35891e();
        if (iMo35891e <= 64) {
            this.f32922c = iMo35891e != 64 ? (-1) << iMo35891e : 0L;
            this.f32923d = f32919f;
        } else {
            this.f32922c = 0L;
            this.f32923d = m37870e(iMo35891e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m37866a(int i10) {
        if (i10 < 64) {
            this.f32922c |= 1 << i10;
        } else {
            m37867b(i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m37867b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f32923d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    /* JADX INFO: renamed from: c */
    public final int m37868c() {
        int length = this.f32923d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f32923d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (((Boolean) this.f32921b.invoke(this.f32920a, Integer.valueOf(i13))).booleanValue()) {
                    this.f32923d[i10] = j10;
                    return i13;
                }
            }
            this.f32923d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final int m37869d() {
        int iNumberOfTrailingZeros;
        int iMo35891e = this.f32920a.mo35891e();
        do {
            long j10 = this.f32922c;
            if (j10 == -1) {
                if (iMo35891e > 64) {
                    return m37868c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f32922c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.f32921b.invoke(this.f32920a, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }

    /* JADX INFO: renamed from: e */
    public final long[] m37870e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[AbstractC5106t.m20730e0(jArr)] = (-1) << i10;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: yc.e0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
