package p000;

import java.util.logging.Logger;

/* JADX INFO: renamed from: ma */
/* JADX INFO: loaded from: classes.dex */
public final class C2230ma extends AbstractC0714Qj {

    /* JADX INFO: renamed from: j */
    public static final Logger f7797j = Logger.getLogger(C2230ma.class.getName());

    /* JADX INFO: renamed from: k */
    public static final boolean f7798k = AbstractC2092jD.f7368e;

    /* JADX INFO: renamed from: f */
    public C0132D2 f7799f;

    /* JADX INFO: renamed from: g */
    public final byte[] f7800g;

    /* JADX INFO: renamed from: h */
    public final int f7801h;

    /* JADX INFO: renamed from: i */
    public int f7802i;

    public C2230ma(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f7800g = bArr;
        this.f7802i = 0;
        this.f7801h = i;
    }

    /* JADX INFO: renamed from: J */
    public static int m4517J(int i, AbstractC2744y6 abstractC2744y6) {
        return m4518K(abstractC2744y6) + m4524Q(i);
    }

    /* JADX INFO: renamed from: K */
    public static int m4518K(AbstractC2744y6 abstractC2744y6) {
        int size = abstractC2744y6.size();
        return m4525R(size) + size;
    }

    /* JADX INFO: renamed from: L */
    public static int m4519L(int i) {
        return m4524Q(i) + 4;
    }

    /* JADX INFO: renamed from: M */
    public static int m4520M(int i) {
        return m4524Q(i) + 8;
    }

    /* JADX INFO: renamed from: N */
    public static int m4521N(int i, AbstractC0043B abstractC0043B, InterfaceC2253mx interfaceC2253mx) {
        return abstractC0043B.mo63b(interfaceC2253mx) + (m4524Q(i) * 2);
    }

    /* JADX INFO: renamed from: O */
    public static int m4522O(int i) {
        if (i >= 0) {
            return m4525R(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: P */
    public static int m4523P(String str) {
        int length;
        try {
            length = AbstractC2536tD.m5016b(str);
        } catch (C2493sD unused) {
            length = str.getBytes(AbstractC0501Ll.f1637a).length;
        }
        return m4525R(length) + length;
    }

    /* JADX INFO: renamed from: Q */
    public static int m4524Q(int i) {
        return m4525R(i << 3);
    }

    /* JADX INFO: renamed from: R */
    public static int m4525R(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: S */
    public static int m4526S(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: T */
    public final void m4527T(byte b) throws C2273na {
        try {
            byte[] bArr = this.f7800g;
            int i = this.f7802i;
            this.f7802i = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C2273na(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7802i), Integer.valueOf(this.f7801h), 1), e);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m4528U(byte[] bArr, int i, int i2) throws C2273na {
        try {
            System.arraycopy(bArr, i, this.f7800g, this.f7802i, i2);
            this.f7802i += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C2273na(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7802i), Integer.valueOf(this.f7801h), Integer.valueOf(i2)), e);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m4529V(int i, int i2) throws C2273na {
        m4534a0(i, 5);
        m4530W(i2);
    }

    /* JADX INFO: renamed from: W */
    public final void m4530W(int i) throws C2273na {
        try {
            byte[] bArr = this.f7800g;
            int i2 = this.f7802i;
            int i3 = i2 + 1;
            this.f7802i = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f7802i = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f7802i = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f7802i = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C2273na(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7802i), Integer.valueOf(this.f7801h), 1), e);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m4531X(int i, long j) throws C2273na {
        m4534a0(i, 1);
        m4532Y(j);
    }

    /* JADX INFO: renamed from: Y */
    public final void m4532Y(long j) throws C2273na {
        try {
            byte[] bArr = this.f7800g;
            int i = this.f7802i;
            int i2 = i + 1;
            this.f7802i = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f7802i = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f7802i = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f7802i = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f7802i = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f7802i = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f7802i = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f7802i = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C2273na(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7802i), Integer.valueOf(this.f7801h), 1), e);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m4533Z(int i) throws C2273na {
        if (i >= 0) {
            m4535b0(i);
        } else {
            m4537d0(i);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m4534a0(int i, int i2) throws C2273na {
        m4535b0((i << 3) | i2);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m4535b0(int i) throws C2273na {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f7800g;
            if (i2 == 0) {
                int i3 = this.f7802i;
                this.f7802i = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f7802i;
                    this.f7802i = i4 + 1;
                    bArr[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C2273na(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7802i), Integer.valueOf(this.f7801h), 1), e);
                }
            }
            throw new C2273na(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7802i), Integer.valueOf(this.f7801h), 1), e);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m4536c0(int i, long j) throws C2273na {
        m4534a0(i, 0);
        m4537d0(j);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m4537d0(long j) throws C2273na {
        boolean z = f7798k;
        int i = this.f7801h;
        byte[] bArr = this.f7800g;
        if (z && i - this.f7802i >= 10) {
            while ((j & (-128)) != 0) {
                int i2 = this.f7802i;
                this.f7802i = i2 + 1;
                AbstractC2092jD.m4271k(bArr, i2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i3 = this.f7802i;
            this.f7802i = i3 + 1;
            AbstractC2092jD.m4271k(bArr, i3, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i4 = this.f7802i;
                this.f7802i = i4 + 1;
                bArr[i4] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C2273na(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7802i), Integer.valueOf(i), 1), e);
            }
        }
        int i5 = this.f7802i;
        this.f7802i = i5 + 1;
        bArr[i5] = (byte) j;
    }
}
