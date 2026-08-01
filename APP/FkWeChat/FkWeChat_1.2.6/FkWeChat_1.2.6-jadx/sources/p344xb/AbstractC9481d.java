package p344xb;

import com.alibaba.fastjson2.JSONB;
import p185m8.AbstractC5106t;
import p215oc.C5706c;
import p299ub.AbstractC8618e;

/* JADX INFO: renamed from: xb.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9481d extends AbstractC9480c {
    /* JADX INFO: renamed from: i */
    public static final void m36940i(long j10, byte[] bArr, int i10, int i11, int i12) {
        bArr.getClass();
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = AbstractC8618e.m33092b()[(int) ((j10 >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            bArr[i10] = (byte) (i15 >> 8);
            i10 += 2;
            bArr[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static final long m36941j(byte[] bArr, int i10) {
        bArr.getClass();
        return (((long) bArr[i10 + 7]) & 255) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
    }

    /* JADX INFO: renamed from: k */
    public static final C9479b m36942k() {
        byte[] bArr = new byte[16];
        AbstractC9480c.m36934c(bArr);
        return m36945n(bArr);
    }

    /* JADX INFO: renamed from: l */
    public static final String m36943l(String str, int i10) {
        return str.length() <= i10 ? str : str.substring(0, i10).concat("...");
    }

    /* JADX INFO: renamed from: m */
    public static final String m36944m(byte[] bArr, int i10) {
        return AbstractC5106t.m20753t0(bArr, null, "[", "]", i10, null, null, 49, null);
    }

    /* JADX INFO: renamed from: n */
    public static final C9479b m36945n(byte[] bArr) {
        bArr.getClass();
        byte b10 = (byte) (bArr[6] & 15);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | JSONB.Constants.BC_INT32_SHORT_MIN);
        byte b11 = (byte) (bArr[8] & JSONB.Constants.BC_INT32_BYTE_MAX);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | 128);
        return C9479b.f32211s.m36926a(bArr);
    }

    /* JADX INFO: renamed from: o */
    public static final C9479b m36946o(String str) {
        str.getClass();
        int i10 = 0;
        long j10 = 0;
        while (true) {
            if (i10 >= 16) {
                long j11 = 0;
                for (int i11 = 16; i11 < 32; i11++) {
                    long j12 = j11 << 4;
                    char cCharAt = str.charAt(i11);
                    if ((cCharAt >>> '\b') != 0 || AbstractC8618e.f28677d[cCharAt] < 0) {
                        m36948q(str, "a hexadecimal digit", i11);
                        C5706c.m23089a();
                        return null;
                    }
                    j11 = j12 | AbstractC8618e.f28677d[cCharAt];
                }
                return C9479b.f32211s.m36927b(j10, j11);
            }
            long j13 = j10 << 4;
            char cCharAt2 = str.charAt(i10);
            if ((cCharAt2 >>> '\b') != 0 || AbstractC8618e.f28677d[cCharAt2] < 0) {
                break;
            }
            j10 = j13 | AbstractC8618e.f28677d[cCharAt2];
            i10++;
        }
        m36948q(str, "a hexadecimal digit", i10);
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final C9479b m36947p(String str) {
        str.getClass();
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') != 0 || AbstractC8618e.f28677d[cCharAt] < 0) {
                m36948q(str, "a hexadecimal digit", i10);
                C5706c.m23089a();
                return null;
            }
            j10 = j11 | AbstractC8618e.f28677d[cCharAt];
        }
        if (str.charAt(8) != '-') {
            m36948q(str, "'-' (hyphen)", 8);
            C5706c.m23089a();
            return null;
        }
        long j12 = 0;
        for (int i11 = 9; i11 < 13; i11++) {
            long j13 = j12 << 4;
            char cCharAt2 = str.charAt(i11);
            if ((cCharAt2 >>> '\b') != 0 || AbstractC8618e.f28677d[cCharAt2] < 0) {
                m36948q(str, "a hexadecimal digit", i11);
                C5706c.m23089a();
                return null;
            }
            j12 = j13 | AbstractC8618e.f28677d[cCharAt2];
        }
        if (str.charAt(13) != '-') {
            m36948q(str, "'-' (hyphen)", 13);
            C5706c.m23089a();
            return null;
        }
        long j14 = 0;
        for (int i12 = 14; i12 < 18; i12++) {
            long j15 = j14 << 4;
            char cCharAt3 = str.charAt(i12);
            if ((cCharAt3 >>> '\b') != 0 || AbstractC8618e.f28677d[cCharAt3] < 0) {
                m36948q(str, "a hexadecimal digit", i12);
                C5706c.m23089a();
                return null;
            }
            j14 = j15 | AbstractC8618e.f28677d[cCharAt3];
        }
        if (str.charAt(18) != '-') {
            m36948q(str, "'-' (hyphen)", 18);
            C5706c.m23089a();
            return null;
        }
        long j16 = 0;
        for (int i13 = 19; i13 < 23; i13++) {
            long j17 = j16 << 4;
            char cCharAt4 = str.charAt(i13);
            if ((cCharAt4 >>> '\b') != 0 || AbstractC8618e.f28677d[cCharAt4] < 0) {
                m36948q(str, "a hexadecimal digit", i13);
                C5706c.m23089a();
                return null;
            }
            j16 = j17 | AbstractC8618e.f28677d[cCharAt4];
        }
        if (str.charAt(23) != '-') {
            m36948q(str, "'-' (hyphen)", 23);
            C5706c.m23089a();
            return null;
        }
        long j18 = 0;
        for (int i14 = 24; i14 < 36; i14++) {
            long j19 = j18 << 4;
            char cCharAt5 = str.charAt(i14);
            if ((cCharAt5 >>> '\b') != 0 || AbstractC8618e.f28677d[cCharAt5] < 0) {
                m36948q(str, "a hexadecimal digit", i14);
                C5706c.m23089a();
                return null;
            }
            j18 = j19 | AbstractC8618e.f28677d[cCharAt5];
        }
        return C9479b.f32211s.m36927b((j10 << 32) | (j12 << 16) | j14, (j16 << 48) | j18);
    }

    /* JADX INFO: renamed from: q */
    public static final Void m36948q(String str, String str2, int i10) {
        str.getClass();
        str2.getClass();
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i10 + ", but was '" + str.charAt(i10) + '\'');
    }
}
