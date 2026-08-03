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
    public static int m4321d(int r1) {
        int r0 = r1 >>> 1;
        return (-(r1 & 1)) ^ r0;
    }

    /* JADX INFO: renamed from: e */
    public static long m4322e(long r4) {
        long r0 = r4 >>> 1;
        return (-(r4 & 1)) ^ r0;
    }

    /* JADX INFO: renamed from: h */
    public static C1539ia m4323h(byte[] r1, int r2, int r3, boolean r4) {
        C1539ia r0 = new C1539ia(r1, r2, r3, r4);
        r0.mo2940l(r3);     // Catch: C0673Pl -> L5
        return r0;
    L5:
        e = move-exception;
        throw new IllegalArgumentException(e);
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
    public ByteBuffer m4324a(int r5, byte[] r6) {
        int[] r52 = mo4325c(AbstractC2130k7.m4316c(r6), r5);
        int[] r62 = (int[]) r52.clone();
        AbstractC2130k7.m4315b(r62);
        int r1 = 0;
    L4:
        if (r1 >= r52.length) goto L6;
        r52[r1] = r52[r1] + r62[r1];
        r1 = r1 + 1;
        goto L4
    L6:
        ByteBuffer r63 = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        r63.asIntBuffer().put(r52, 0, 16);
        return r63;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo2936b(int r1);

    /* JADX INFO: renamed from: c */
    public abstract int[] mo4325c(int[] r1, int r2);

    /* JADX INFO: renamed from: f */
    public abstract int mo2937f();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo2938g();

    /* JADX INFO: renamed from: i */
    public abstract int mo4326i();

    /* JADX INFO: renamed from: j */
    public abstract void mo2939j(int r1);

    /* JADX INFO: renamed from: k */
    public void m4327k(byte[] r7, ByteBuffer r8, ByteBuffer r9) {
        if (r7.length != mo4326i()) goto L13;
        int r0 = r9.remaining();
        int r1 = r0 / 64;
        int r2 = r1 + 1;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L11;
        ByteBuffer r4 = m4324a(this.f7485a + r3, r7);
        if (r3 != r1) goto L9;
        AbstractC0295Gu.m605F(r8, r9, r4, r0 % 64);
    L10:
        r3 = r3 + 1;
        goto L5
    L9:
        AbstractC0295Gu.m605F(r8, r9, r4, 64);
        goto L10
    L11:
        return;
    L13:
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo4326i());
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo2940l(int r1);

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
