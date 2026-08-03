package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: ka */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2140ka {

    /* JADX INFO: renamed from: a */
    public int f7485a;

    /* JADX INFO: renamed from: b */
    public Object f7486b;

    /* JADX INFO: renamed from: d */
    public static int m4321d(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: e */
    public static long m4322e(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: h */
    public static C1539ia m4323h(byte[] bArr, int i, int i2, boolean z) {
        C1539ia c1539ia = new C1539ia(bArr, i, i2, z);
        try {
            c1539ia.mo2940l(i2);
            return c1539ia;
        } catch (C0673Pl e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract String mo2926A();

    /* JADX INFO: renamed from: B */
    public abstract int mo2927B();

    /* JADX INFO: renamed from: C */
    public abstract int mo2928C();

    /* JADX INFO: renamed from: D */
    public abstract long mo2929D();

    /* JADX INFO: renamed from: a */
    public ByteBuffer m4324a(int i, byte[] bArr) {
        int[] iArrMo4325c = mo4325c(AbstractC2130k7.m4316c(bArr), i);
        int[] iArr = (int[]) iArrMo4325c.clone();
        AbstractC2130k7.m4315b(iArr);
        for (int i2 = 0; i2 < iArrMo4325c.length; i2++) {
            iArrMo4325c[i2] = iArrMo4325c[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrMo4325c, 0, 16);
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo2936b(int i);

    /* JADX INFO: renamed from: c */
    public abstract int[] mo4325c(int[] iArr, int i);

    /* JADX INFO: renamed from: f */
    public abstract int mo2937f();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo2938g();

    /* JADX INFO: renamed from: i */
    public abstract int mo4326i();

    /* JADX INFO: renamed from: j */
    public abstract void mo2939j(int i);

    /* JADX INFO: renamed from: k */
    public void m4327k(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != mo4326i()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo4326i());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferM4324a = m4324a(this.f7485a + i3, bArr);
            if (i3 == i) {
                AbstractC0295Gu.m605F(byteBuffer, byteBuffer2, byteBufferM4324a, iRemaining % 64);
            } else {
                AbstractC0295Gu.m605F(byteBuffer, byteBuffer2, byteBufferM4324a, 64);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo2940l(int i);

    /* JADX INFO: renamed from: m */
    public abstract boolean mo2941m();

    /* JADX INFO: renamed from: n */
    public abstract C2701x6 mo2942n();

    /* JADX INFO: renamed from: o */
    public abstract double mo2943o();

    /* JADX INFO: renamed from: p */
    public abstract int mo2944p();

    /* JADX INFO: renamed from: q */
    public abstract int mo2945q();

    /* JADX INFO: renamed from: r */
    public abstract long mo2946r();

    /* JADX INFO: renamed from: s */
    public abstract float mo2947s();

    /* JADX INFO: renamed from: t */
    public abstract int mo2948t();

    /* JADX INFO: renamed from: u */
    public abstract long mo2949u();

    /* JADX INFO: renamed from: v */
    public abstract int mo2950v();

    /* JADX INFO: renamed from: w */
    public abstract long mo2951w();

    /* JADX INFO: renamed from: x */
    public abstract int mo2952x();

    /* JADX INFO: renamed from: y */
    public abstract long mo2953y();

    /* JADX INFO: renamed from: z */
    public abstract String mo2954z();
}
