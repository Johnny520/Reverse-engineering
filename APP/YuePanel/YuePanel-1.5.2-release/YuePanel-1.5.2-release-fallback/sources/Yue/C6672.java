package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6672 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f23310 = 20;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f23311 = 40;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f23312 = 100;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public long[] f23313;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float[] f23314;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f23315;

    public C6672() {
            r4 = this;
            r4.<init>()
            r0 = 20
            long[] r1 = new long[r0]
            r4.f23313 = r1
            float[] r0 = new float[r0]
            r4.f23314 = r0
            r0 = 0
            r4.f23315 = r0
            r2 = -9223372036854775808
            java.util.Arrays.fill(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m25696(long r3, float r5) {
            r2 = this;
            int r0 = r2.f23315
            int r0 = r0 + 1
            int r0 = r0 % 20
            r2.f23315 = r0
            long[] r1 = r2.f23313
            r1[r0] = r3
            float[] r3 = r2.f23314
            r3[r0] = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float m25697() {
            r15 = this;
            int r0 = r15.f23315
            r1 = -9223372036854775808
            r3 = 0
            if (r0 != 0) goto L10
            long[] r4 = r15.f23313
            r5 = r4[r0]
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 != 0) goto L10
            return r3
        L10:
            long[] r4 = r15.f23313
            r5 = r4[r0]
            r4 = 0
            r7 = r5
        L16:
            long[] r9 = r15.f23313
            r10 = r9[r0]
            int r9 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            r12 = 20
            if (r9 != 0) goto L21
            goto L44
        L21:
            long r13 = r5 - r10
            float r9 = (float) r13
            long r7 = r10 - r7
            long r7 = java.lang.Math.abs(r7)
            float r7 = (float) r7
            r8 = 1120403456(0x42c80000, float:100.0)
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 > 0) goto L44
            r8 = 1109393408(0x42200000, float:40.0)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L38
            goto L44
        L38:
            if (r0 != 0) goto L3b
            r0 = r12
        L3b:
            int r0 = r0 + (-1)
            int r4 = r4 + 1
            if (r4 < r12) goto L42
            goto L44
        L42:
            r7 = r10
            goto L16
        L44:
            r0 = 2
            if (r4 >= r0) goto L48
            return r3
        L48:
            r1 = 1148846080(0x447a0000, float:1000.0)
            if (r4 != r0) goto L6c
            int r0 = r15.f23315
            if (r0 != 0) goto L53
            r2 = 19
            goto L55
        L53:
            int r2 = r0 + (-1)
        L55:
            long[] r4 = r15.f23313
            r5 = r4[r0]
            r7 = r4[r2]
            long r5 = r5 - r7
            float r4 = (float) r5
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 != 0) goto L62
            return r3
        L62:
            float[] r3 = r15.f23314
            r0 = r3[r0]
            r2 = r3[r2]
            float r0 = r0 - r2
            float r0 = r0 / r4
        L6a:
            float r0 = r0 * r1
            return r0
        L6c:
            int r0 = r15.f23315
            int r2 = r0 - r4
            int r2 = r2 + 21
            int r2 = r2 % r12
            int r0 = r0 + 21
            int r0 = r0 % r12
            long[] r4 = r15.f23313
            r5 = r4[r2]
            float[] r4 = r15.f23314
            r4 = r4[r2]
            int r2 = r2 + 1
            int r7 = r2 % 20
            r8 = r3
        L83:
            if (r7 == r0) goto Laf
            long[] r9 = r15.f23313
            r10 = r9[r7]
            long r13 = r10 - r5
            float r9 = (float) r13
            int r13 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r13 != 0) goto L91
            goto Lab
        L91:
            float[] r5 = r15.f23314
            r5 = r5[r7]
            float r6 = r15.m25698(r8)
            float r4 = r5 - r4
            float r4 = r4 / r9
            float r6 = r4 - r6
            float r4 = java.lang.Math.abs(r4)
            float r6 = r6 * r4
            float r8 = r8 + r6
            if (r7 != r2) goto La9
            r4 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r4
        La9:
            r4 = r5
            r5 = r10
        Lab:
            int r7 = r7 + 1
            int r7 = r7 % r12
            goto L83
        Laf:
            float r0 = r15.m25698(r8)
            goto L6a
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float m25698(float r5) {
            r4 = this;
            float r0 = java.lang.Math.signum(r5)
            double r0 = (double) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r5 = java.lang.Math.abs(r5)
            float r5 = r5 * r2
            double r2 = (double) r5
            double r2 = java.lang.Math.sqrt(r2)
            double r0 = r0 * r2
            float r5 = (float) r0
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m25699() {
            r3 = this;
            r0 = 0
            r3.f23315 = r0
            long[] r0 = r3.f23313
            r1 = -9223372036854775808
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r3.f23314
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
    }
}
