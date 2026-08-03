package p152k7;

import java.io.ByteArrayOutputStream;
import p075f6.C1075b;
import p241q7.C3445b;

/* JADX INFO: renamed from: k7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2331a {

    /* JADX INFO: renamed from: g */
    public int f7657g = -1;

    /* JADX INFO: renamed from: h */
    public AbstractC2331a f7658h;

    /* JADX INFO: renamed from: i */
    public boolean f7659i;

    /* JADX INFO: renamed from: j */
    public AbstractC2331a f7660j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static void m5534D(byte[] bArr, int i9, int i10) {
        if (i9 + 4 > bArr.length) {
            return;
        }
        bArr[i9 + 3] = (byte) ((i10 >>> 24) & 255);
        bArr[i9 + 2] = (byte) ((i10 >>> 16) & 255);
        bArr[i9 + 1] = (byte) ((i10 >>> 8) & 255);
        bArr[i9] = (byte) (i10 & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static void m5535E(byte[] bArr, int i9, int i10) {
        bArr[i9 + 1] = (byte) ((i10 >>> 8) & 255);
        bArr[i9] = (byte) (i10 & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static void m5536F(byte[] bArr, int i9, short s10) {
        bArr[i9 + 1] = (byte) ((s10 >>> 8) & 255);
        bArr[i9] = (byte) (s10 & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static byte[] m5537o(byte[] bArr, byte[] bArr2) {
        boolean z9 = true;
        boolean z10 = bArr == null || bArr.length == 0;
        if (bArr2 != null && bArr2.length != 0) {
            z9 = false;
        }
        if (z10 && z9) {
            return null;
        }
        if (z10) {
            return bArr2;
        }
        if (z9) {
            return bArr;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        int length = bArr.length;
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, bArr2.length);
        return bArr3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static boolean m5538q(byte[] bArr, int i9, int i10) {
        return (((bArr[i9] & 255) >> i10) & 1) == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static int m5539s(byte[] bArr, int i9) {
        if (i9 + 4 > bArr.length) {
            return 0;
        }
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static long m5540t(byte[] bArr, int i9) {
        long j3 = 0;
        if (i9 + 8 > bArr.length) {
            return 0L;
        }
        for (int i10 = i9 + 7; i10 >= i9; i10--) {
            j3 = (j3 << 8) | ((long) (bArr[i10] & 255));
        }
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static short m5541w(byte[] bArr, int i9) {
        if (i9 + 2 > bArr.length) {
            return (short) 0;
        }
        return (short) (((bArr[i9 + 1] & 255) << 8) | (bArr[i9] & 255));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static int m5542x(byte[] bArr, int i9) {
        if (i9 + 2 > bArr.length) {
            return 0;
        }
        return ((bArr[i9 + 1] & 255) << 8) | (bArr[i9] & 255);
    }

    /* JADX INFO: renamed from: C */
    public abstract int mo5544C(ByteArrayOutputStream byteArrayOutputStream);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [k7.a, q7.a] */
    /* JADX INFO: renamed from: G */
    public final void m5545G(C3445b c3445b) {
        mo1893B(c3445b);
        ?? r12 = this.f7660j;
        if (r12 != 0) {
            r12.mo1926m(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final void m5546H(int i9) {
        int i10 = this.f7657g;
        if (i9 == i10) {
            return;
        }
        this.f7657g = i9;
        if (i10 == -1 || i9 == -1) {
            return;
        }
        mo5543A(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public void mo5547I(boolean z9) {
        this.f7659i = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m5548J(AbstractC2331a abstractC2331a) {
        if (abstractC2331a == this) {
            return;
        }
        this.f7658h = abstractC2331a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final int m5549K(ByteArrayOutputStream byteArrayOutputStream) {
        if (mo5555y()) {
            return 0;
        }
        return mo5544C(byteArrayOutputStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public AbstractC2331a m5550d(Class cls) {
        return m5554v(cls);
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo5551p();

    /* JADX INFO: renamed from: r */
    public abstract byte[] mo5552r();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final AbstractC2331a m5553u(Class cls) {
        for (AbstractC2331a abstractC2331a = this.f7658h; abstractC2331a != null; abstractC2331a = abstractC2331a.f7658h) {
            if (abstractC2331a.getClass() == cls) {
                return abstractC2331a;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final AbstractC2331a m5554v(Class cls) {
        for (AbstractC2331a abstractC2331a = this.f7658h; abstractC2331a != null; abstractC2331a = abstractC2331a.f7658h) {
            if (cls.isInstance(abstractC2331a)) {
                return abstractC2331a;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public boolean mo5555y() {
        return this.f7659i;
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo5556z(C1075b c1075b);

    /* JADX INFO: renamed from: A */
    public void mo5543A(int i9) {
    }

    /* JADX INFO: renamed from: B */
    public void mo1893B(C3445b c3445b) {
    }
}
