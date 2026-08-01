package p376zd;

import ae.AbstractC0303b;
import p299ub.AbstractC8611a0;
import p376zd.C9995i;

/* JADX INFO: renamed from: zd.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9978b {

    /* JADX INFO: renamed from: a */
    public static final C9995i.a f33553a = new C9995i.a();

    /* JADX INFO: renamed from: b */
    public static final int f33554b = -1234567890;

    /* JADX INFO: renamed from: a */
    public static final boolean m38614a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        bArr.getClass();
        bArr2.getClass();
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final void m38615b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m38616c() {
        return f33554b;
    }

    /* JADX INFO: renamed from: d */
    public static final C9995i.a m38617d() {
        return f33553a;
    }

    /* JADX INFO: renamed from: e */
    public static final int m38618e(C10003m c10003m, int i10) {
        c10003m.getClass();
        return i10 == f33554b ? c10003m.m38765G() : i10;
    }

    /* JADX INFO: renamed from: f */
    public static final int m38619f(byte[] bArr, int i10) {
        bArr.getClass();
        return i10 == f33554b ? bArr.length : i10;
    }

    /* JADX INFO: renamed from: g */
    public static final C9995i.a m38620g(C9995i.a aVar) {
        aVar.getClass();
        return aVar == f33553a ? new C9995i.a() : aVar;
    }

    /* JADX INFO: renamed from: h */
    public static final int m38621h(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    /* JADX INFO: renamed from: i */
    public static final long m38622i(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    /* JADX INFO: renamed from: j */
    public static final short m38623j(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    /* JADX INFO: renamed from: k */
    public static final String m38624k(byte b10) {
        return AbstractC8611a0.m33076w(new char[]{AbstractC0303b.m909d()[(b10 >> 4) & 15], AbstractC0303b.m909d()[b10 & 15]});
    }

    /* JADX INFO: renamed from: l */
    public static final String m38625l(int i10) {
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {AbstractC0303b.m909d()[(i10 >> 28) & 15], AbstractC0303b.m909d()[(i10 >> 24) & 15], AbstractC0303b.m909d()[(i10 >> 20) & 15], AbstractC0303b.m909d()[(i10 >> 16) & 15], AbstractC0303b.m909d()[(i10 >> 12) & 15], AbstractC0303b.m909d()[(i10 >> 8) & 15], AbstractC0303b.m909d()[(i10 >> 4) & 15], AbstractC0303b.m909d()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return AbstractC8611a0.m33077x(cArr, i11, 8);
    }
}
