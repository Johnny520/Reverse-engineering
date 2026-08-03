package p000;

import java.util.logging.Logger;

/* JADX INFO: renamed from: ma */
/* JADX INFO: loaded from: classes.dex */
public final class C2230ma extends AbstractC0714Qj {

    /* JADX INFO: renamed from: j */
    public static final Logger f7797j = null;

    /* JADX INFO: renamed from: k */
    public static final boolean f7798k = false;

    /* JADX INFO: renamed from: f */
    public C0132D2 f7799f;

    /* JADX INFO: renamed from: g */
    public final byte[] f7800g;

    /* JADX INFO: renamed from: h */
    public final int f7801h;

    /* JADX INFO: renamed from: i */
    public int f7802i;

    static {
        f7797j = Logger.getLogger(C2230ma.class.getName());
        f7798k = AbstractC2092jD.f7368e;
    }

    public C2230ma(int r3, byte[] r4) {
        if (((r4.length - r3) | r3) < 0) goto L7;
        this.f7800g = r4;
        this.f7802i = 0;
        this.f7801h = r3;
        return;
    L7:
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(r4.length), 0, Integer.valueOf(r3)}));
    }

    /* JADX INFO: renamed from: J */
    public static int m4517J(int r0, AbstractC2744y6 r1) {
        int r02 = m4524Q(r0);
        return m4518K(r1) + r02;
    }

    /* JADX INFO: renamed from: K */
    public static int m4518K(AbstractC2744y6 r1) {
        int r12 = r1.size();
        return m4525R(r12) + r12;
    }

    /* JADX INFO: renamed from: L */
    public static int m4519L(int r0) {
        return m4524Q(r0) + 4;
    }

    /* JADX INFO: renamed from: M */
    public static int m4520M(int r0) {
        return m4524Q(r0) + 8;
    }

    /* JADX INFO: renamed from: N */
    public static int m4521N(int r0, AbstractC0043B r1, InterfaceC2253mx r2) {
        int r02 = m4524Q(r0) * 2;
        return r1.mo63b(r2) + r02;
    }

    /* JADX INFO: renamed from: O */
    public static int m4522O(int r0) {
        if (r0 >= 0) goto L4;
        return 10;
    L4:
        return m4525R(r0);
    }

    /* JADX INFO: renamed from: P */
    public static int m4523P(String r1) {
        int r12 = AbstractC2536tD.m5016b(r1);     // Catch: C2493sD -> L4
    L6:
        return m4525R(r12) + r12;
    L4:
        r12 = r1.getBytes(AbstractC0501Ll.f1637a).length;
        goto L6
    }

    /* JADX INFO: renamed from: Q */
    public static int m4524Q(int r0) {
        return m4525R(r0 << 3);
    }

    /* JADX INFO: renamed from: R */
    public static int m4525R(int r1) {
        if ((r1 & (-128)) != 0) goto L7;
        return 1;
    L7:
        if ((r1 & (-16384)) != 0) goto L11;
        return 2;
    L11:
        if (((-2097152) & r1) != 0) goto L15;
        return 3;
    L15:
        if ((r1 & (-268435456)) != 0) goto L18;
        return 4;
    L18:
        return 5;
    }

    /* JADX INFO: renamed from: S */
    public static int m4526S(long r6) {
        if (((-128) & r6) != 0) goto L6;
        return 1;
    L6:
        if (r6 >= 0) goto L10;
        return 10;
    L10:
        if (((-34359738368L) & r6) == 0) goto L12;
        r6 = r6 >>> 28;
        int r0 = 6;
    L14:
        if (((-2097152) & r6) == 0) goto L17;
        r0 = r0 + 2;
        r6 = r6 >>> 14;
    L17:
        if ((r6 & (-16384)) != 0) goto L19;
        return r0;
    L19:
        return r0 + 1;
    L12:
        r0 = 2;
        goto L14
    }

    /* JADX INFO: renamed from: T */
    public final void m4527T(byte r5) {
        byte[] r0 = this.f7800g;     // Catch: IndexOutOfBoundsException -> L4
        int r1 = this.f7802i;     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i = r1 + 1;     // Catch: IndexOutOfBoundsException -> L4
        r0[r1] = r5;     // Catch: IndexOutOfBoundsException -> L4
        return;
    L4:
        e = move-exception;
        throw new C2273na(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7802i), Integer.valueOf(this.f7801h), 1}), e);
    }

    /* JADX INFO: renamed from: U */
    public final void m4528U(byte[] r3, int r4, int r5) {
        System.arraycopy(r3, r4, this.f7800g, this.f7802i, r5);     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i += r5;
        return;
    L4:
        e = move-exception;
        throw new C2273na(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7802i), Integer.valueOf(this.f7801h), Integer.valueOf(r5)}), e);
    }

    /* JADX INFO: renamed from: V */
    public final void m4529V(int r2, int r3) {
        m4534a0(r2, 5);
        m4530W(r3);
    }

    /* JADX INFO: renamed from: W */
    public final void m4530W(int r6) {
        byte[] r0 = this.f7800g;     // Catch: IndexOutOfBoundsException -> L4
        int r1 = this.f7802i;     // Catch: IndexOutOfBoundsException -> L4
        int r2 = r1 + 1;     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i = r2;     // Catch: IndexOutOfBoundsException -> L4
        r0[r1] = (byte) (r6 & 255);     // Catch: IndexOutOfBoundsException -> L4
        int r3 = r1 + 2;     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i = r3;     // Catch: IndexOutOfBoundsException -> L4
        r0[r2] = (byte) ((r6 >> 8) & 255);     // Catch: IndexOutOfBoundsException -> L4
        int r22 = r1 + 3;     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i = r22;     // Catch: IndexOutOfBoundsException -> L4
        r0[r3] = (byte) ((r6 >> 16) & 255);     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i = r1 + 4;     // Catch: IndexOutOfBoundsException -> L4
        r0[r22] = (byte) ((r6 >> 24) & 255);     // Catch: IndexOutOfBoundsException -> L4
        return;
    L4:
        e = move-exception;
        throw new C2273na(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7802i), Integer.valueOf(this.f7801h), 1}), e);
    }

    /* JADX INFO: renamed from: X */
    public final void m4531X(int r2, long r3) {
        m4534a0(r2, 1);
        m4532Y(r3);
    }

    /* JADX INFO: renamed from: Y */
    public final void m4532Y(long r8) {
        byte[] r0 = this.f7800g;     // Catch: IndexOutOfBoundsException -> L4
        int r1 = this.f7802i;     // Catch: IndexOutOfBoundsException -> L4
        int r2 = r1 + 1;     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i = r2;     // Catch: IndexOutOfBoundsException -> L4
        r0[r1] = (byte) (((int) r8) & 255);     // Catch: IndexOutOfBoundsException -> L4
        int r3 = r1 + 2;     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i = r3;     // Catch: IndexOutOfBoundsException -> L4
        r0[r2] = (byte) (((int) (r8 >> 8)) & 255);     // Catch: IndexOutOfBoundsException -> L4
        int r22 = r1 + 3;     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i = r22;     // Catch: IndexOutOfBoundsException -> L4
        r0[r3] = (byte) (((int) (r8 >> 16)) & 255);     // Catch: IndexOutOfBoundsException -> L4
        int r32 = r1 + 4;     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i = r32;     // Catch: IndexOutOfBoundsException -> L4
        r0[r22] = (byte) (((int) (r8 >> 24)) & 255);     // Catch: IndexOutOfBoundsException -> L4
        int r23 = r1 + 5;     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i = r23;     // Catch: IndexOutOfBoundsException -> L4
        r0[r32] = (byte) (((int) (r8 >> 32)) & 255);     // Catch: IndexOutOfBoundsException -> L4
        int r33 = r1 + 6;     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i = r33;     // Catch: IndexOutOfBoundsException -> L4
        r0[r23] = (byte) (((int) (r8 >> 40)) & 255);     // Catch: IndexOutOfBoundsException -> L4
        int r24 = r1 + 7;     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i = r24;     // Catch: IndexOutOfBoundsException -> L4
        r0[r33] = (byte) (((int) (r8 >> 48)) & 255);     // Catch: IndexOutOfBoundsException -> L4
        this.f7802i = r1 + 8;     // Catch: IndexOutOfBoundsException -> L4
        r0[r24] = (byte) (((int) (r8 >> 56)) & 255);     // Catch: IndexOutOfBoundsException -> L4
        return;
    L4:
        e = move-exception;
        throw new C2273na(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7802i), Integer.valueOf(this.f7801h), 1}), e);
    }

    /* JADX INFO: renamed from: Z */
    public final void m4533Z(int r3) {
        if (r3 < 0) goto L5;
        m4535b0(r3);
        return;
    L5:
        m4537d0(r3);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m4534a0(int r1, int r2) {
        m4535b0((r1 << 3) | r2);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m4535b0(int r5) {
    L2:
        int r0 = r5 & (-128);
        byte[] r1 = this.f7800g;
        if (r0 == 0) goto L4;
        int r02 = this.f7802i;     // Catch: IndexOutOfBoundsException -> L6
        this.f7802i = r02 + 1;     // Catch: IndexOutOfBoundsException -> L6
        r1[r02] = (byte) ((r5 & 127) | 128);     // Catch: IndexOutOfBoundsException -> L6
        r5 = r5 >>> 7;
    L6:
        e = move-exception;
        throw new C2273na(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7802i), Integer.valueOf(this.f7801h), 1}), e);
    L4:
        int r03 = this.f7802i;     // Catch: IndexOutOfBoundsException -> L6
        this.f7802i = r03 + 1;     // Catch: IndexOutOfBoundsException -> L6
        r1[r03] = (byte) r5;     // Catch: IndexOutOfBoundsException -> L6
    }

    /* JADX INFO: renamed from: c0 */
    public final void m4536c0(int r2, long r3) {
        m4534a0(r2, 0);
        m4537d0(r3);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m4537d0(long r11) {
        boolean r0 = f7798k;
        int r1 = this.f7801h;
        byte[] r7 = this.f7800g;
        if (r0 == false) goto L12;
        if ((r1 - this.f7802i) < 10) goto L12;
    L7:
        if ((r11 & (-128)) == 0) goto L8;
        int r02 = this.f7802i;
        this.f7802i = r02 + 1;
        AbstractC2092jD.m4271k(r7, r02, (byte) ((((int) r11) & 127) | 128));
        r11 = r11 >>> 7;
        goto L7
    L8:
        int r03 = this.f7802i;
        this.f7802i = r03 + 1;
        AbstractC2092jD.m4271k(r7, r03, (byte) r11);
        return;
    L12:
        if ((r11 & (-128)) == 0) goto L13;
        int r04 = this.f7802i;     // Catch: IndexOutOfBoundsException -> L15
        this.f7802i = r04 + 1;     // Catch: IndexOutOfBoundsException -> L15
        r7[r04] = (byte) ((((int) r11) & 127) | 128);     // Catch: IndexOutOfBoundsException -> L15
        r11 = r11 >>> 7;
    L15:
        e = move-exception;
        throw new C2273na(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7802i), Integer.valueOf(r1), 1}), e);
    L13:
        int r05 = this.f7802i;     // Catch: IndexOutOfBoundsException -> L15
        this.f7802i = r05 + 1;     // Catch: IndexOutOfBoundsException -> L15
        r7[r05] = (byte) r11;     // Catch: IndexOutOfBoundsException -> L15
    }
}
