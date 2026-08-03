package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6676 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final long f23317 = 100;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f23318 = 20;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final long f23319 = 40;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final float[] f23320;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final long[] f23321;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f23322;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f23323;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f23324;

    public C6676() {
            r2 = this;
            r2.<init>()
            r0 = 20
            float[] r1 = new float[r0]
            r2.f23320 = r1
            long[] r0 = new long[r0]
            r2.f23321 = r0
            r0 = 0
            r2.f23322 = r0
            r0 = 0
            r2.f23323 = r0
            r2.f23324 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static float m25715(float r3) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto La
        L8:
            r0 = 1065353216(0x3f800000, float:1.0)
        La:
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = java.lang.Math.abs(r3)
            float r3 = r3 * r1
            double r1 = (double) r3
            double r1 = java.lang.Math.sqrt(r1)
            float r3 = (float) r1
            float r0 = r0 * r3
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m25716(@Yue.InterfaceC4410 android.view.MotionEvent r7) {
            r6 = this;
            long r0 = r7.getEventTime()
            int r2 = r6.f23323
            if (r2 == 0) goto L19
            long[] r2 = r6.f23321
            int r3 = r6.f23324
            r3 = r2[r3]
            long r2 = r0 - r3
            r4 = 40
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L19
            r6.m25717()
        L19:
            int r2 = r6.f23324
            int r2 = r2 + 1
            r3 = 20
            int r2 = r2 % r3
            r6.f23324 = r2
            int r4 = r6.f23323
            if (r4 == r3) goto L2a
            int r4 = r4 + 1
            r6.f23323 = r4
        L2a:
            float[] r3 = r6.f23320
            r4 = 26
            float r7 = r7.getAxisValue(r4)
            r3[r2] = r7
            long[] r7 = r6.f23321
            int r2 = r6.f23324
            r7[r2] = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m25717() {
            r1 = this;
            r0 = 0
            r1.f23323 = r0
            r0 = 0
            r1.f23322 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m25718(int r2) {
            r1 = this;
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1.m25719(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m25719(int r2, float r3) {
            r1 = this;
            float r0 = r1.m25721()
            float r2 = (float) r2
            float r0 = r0 * r2
            r1.f23322 = r0
            float r2 = java.lang.Math.abs(r3)
            float r2 = -r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L19
            float r2 = java.lang.Math.abs(r3)
            float r2 = -r2
            r1.f23322 = r2
            goto L29
        L19:
            float r2 = r1.f23322
            float r0 = java.lang.Math.abs(r3)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L29
            float r2 = java.lang.Math.abs(r3)
            r1.f23322 = r2
        L29:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float m25720(int r2) {
            r1 = this;
            r0 = 26
            if (r2 == r0) goto L6
            r2 = 0
            return r2
        L6:
            float r2 = r1.f23322
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final float m25721() {
            r14 = this;
            int r0 = r14.f23323
            r1 = 0
            r2 = 2
            if (r0 >= r2) goto L7
            return r1
        L7:
            int r3 = r14.f23324
            int r4 = r3 + 20
            r5 = 1
            int r0 = r0 - r5
            int r4 = r4 - r0
            int r4 = r4 % 20
            long[] r0 = r14.f23321
            r6 = r0[r3]
        L14:
            long[] r0 = r14.f23321
            r8 = r0[r4]
            long r10 = r6 - r8
            r12 = 100
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 <= 0) goto L2a
            int r0 = r14.f23323
            int r0 = r0 - r5
            r14.f23323 = r0
            int r4 = r4 + 1
            int r4 = r4 % 20
            goto L14
        L2a:
            int r3 = r14.f23323
            if (r3 >= r2) goto L2f
            return r1
        L2f:
            if (r3 != r2) goto L43
            int r4 = r4 + r5
            int r4 = r4 % 20
            r2 = r0[r4]
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 != 0) goto L3b
            return r1
        L3b:
            float[] r0 = r14.f23320
            r0 = r0[r4]
            long r2 = r2 - r8
            float r1 = (float) r2
            float r0 = r0 / r1
            return r0
        L43:
            r0 = 0
            r2 = r1
            r1 = r0
        L46:
            int r3 = r14.f23323
            int r3 = r3 - r5
            if (r0 >= r3) goto L7e
            int r3 = r0 + r4
            long[] r6 = r14.f23321
            int r7 = r3 % 20
            r7 = r6[r7]
            int r3 = r3 + r5
            int r3 = r3 % 20
            r9 = r6[r3]
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 != 0) goto L5d
            goto L7b
        L5d:
            int r1 = r1 + 1
            float r6 = m25715(r2)
            float[] r9 = r14.f23320
            r9 = r9[r3]
            long[] r10 = r14.f23321
            r11 = r10[r3]
            long r11 = r11 - r7
            float r3 = (float) r11
            float r9 = r9 / r3
            float r3 = r9 - r6
            float r6 = java.lang.Math.abs(r9)
            float r3 = r3 * r6
            float r2 = r2 + r3
            if (r1 != r5) goto L7b
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
        L7b:
            int r0 = r0 + 1
            goto L46
        L7e:
            float r0 = m25715(r2)
            return r0
    }
}
