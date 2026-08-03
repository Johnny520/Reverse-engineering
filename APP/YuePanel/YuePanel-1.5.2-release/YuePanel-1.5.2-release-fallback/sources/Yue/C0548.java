package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0548 extends Yue.AbstractC4708 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final float f1426 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final float f1427 = 70.0f;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final float f1428 = 0.0f;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float f1429;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float f1430;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f1431;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f1432;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f1433;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f1434;

    static {
            r0 = 4630122629401935872(0x4041800000000000, double:35.0)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.tan(r0)
            float r0 = (float) r0
            Yue.C0548.f1428 = r0
            return
    }

    public C0548() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1429 = r0
            r2.f1430 = r0
            r1 = 1116471296(0x428c0000, float:70.0)
            r2.f1431 = r1
            r2.f1432 = r0
            r2.f1433 = r0
            float r0 = Yue.C0548.f1428
            r2.f1434 = r0
            return
    }

    public C0548(@Yue.InterfaceC4410 android.content.Context r5, @Yue.InterfaceC4410 android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            r0 = 0
            r4.f1429 = r0
            r4.f1430 = r0
            r1 = 1116471296(0x428c0000, float:70.0)
            r4.f1431 = r1
            r4.f1432 = r0
            r4.f1433 = r0
            float r2 = Yue.C0548.f1428
            r4.f1434 = r2
            int[] r2 = Yue.C6019.f21795
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r2)
            org.xmlpull.v1.XmlPullParser r6 = (org.xmlpull.v1.XmlPullParser) r6
            java.lang.String r2 = "minimumVerticalAngle"
            r3 = 1
            float r2 = Yue.C6478.m23897(r5, r6, r2, r3, r0)
            r4.m1938(r2)
            java.lang.String r2 = "minimumHorizontalAngle"
            r3 = 0
            float r0 = Yue.C6478.m23897(r5, r6, r2, r3, r0)
            r4.m1937(r0)
            java.lang.String r0 = "maximumAngle"
            r2 = 2
            float r6 = Yue.C6478.m23897(r5, r6, r0, r2, r1)
            r4.m1936(r6)
            r5.recycle()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static float m1932(float r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L19
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L19
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            double r0 = (double) r2
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.tan(r0)
            float r2 = (float) r0
            return r2
        L19:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Arc must be between 0 and 90 degrees"
            r2.<init>(r0)
            throw r2
    }

    @Override // Yue.AbstractC4708
    @Yue.InterfaceC4410
    public android.graphics.Path getPath(float r12, float r13, float r14, float r15) {
            r11 = this;
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r7.moveTo(r12, r13)
            float r0 = r14 - r12
            float r1 = r15 - r13
            float r2 = r0 * r0
            float r3 = r1 * r1
            float r2 = r2 + r3
            float r3 = r12 + r14
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r5 = r13 + r15
            float r5 = r5 / r4
            r6 = 1048576000(0x3e800000, float:0.25)
            float r6 = r6 * r2
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 <= 0) goto L22
            r8 = 1
            goto L23
        L22:
            r8 = 0
        L23:
            float r9 = java.lang.Math.abs(r0)
            float r10 = java.lang.Math.abs(r1)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L42
            float r1 = r1 * r4
            float r2 = r2 / r1
            float r0 = java.lang.Math.abs(r2)
            if (r8 == 0) goto L3a
            float r0 = r0 + r15
            r1 = r14
            goto L3c
        L3a:
            float r0 = r0 + r13
            r1 = r12
        L3c:
            float r2 = r11.f1433
        L3e:
            float r8 = r6 * r2
            float r8 = r8 * r2
            goto L51
        L42:
            float r0 = r0 * r4
            float r2 = r2 / r0
            if (r8 == 0) goto L4a
            float r2 = r2 + r12
            r0 = r13
            r1 = r2
            goto L4e
        L4a:
            float r0 = r14 - r2
            r1 = r0
            r0 = r15
        L4e:
            float r2 = r11.f1432
            goto L3e
        L51:
            float r2 = r3 - r1
            float r9 = r5 - r0
            float r2 = r2 * r2
            float r9 = r9 * r9
            float r2 = r2 + r9
            float r9 = r11.f1434
            float r6 = r6 * r9
            float r6 = r6 * r9
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r10 = 0
            if (r9 >= 0) goto L62
            goto L69
        L62:
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L68
            r8 = r6
            goto L69
        L68:
            r8 = r10
        L69:
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L7b
            float r8 = r8 / r2
            double r8 = (double) r8
            double r8 = java.lang.Math.sqrt(r8)
            float r2 = (float) r8
            float r1 = r1 - r3
            float r1 = r1 * r2
            float r1 = r1 + r3
            float r0 = r0 - r5
            float r2 = r2 * r0
            float r0 = r5 + r2
        L7b:
            float r12 = r12 + r1
            float r12 = r12 / r4
            float r13 = r13 + r0
            float r2 = r13 / r4
            float r1 = r1 + r14
            float r3 = r1 / r4
            float r0 = r0 + r15
            float r4 = r0 / r4
            r0 = r7
            r1 = r12
            r5 = r14
            r6 = r15
            r0.cubicTo(r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float m1933() {
            r1 = this;
            float r0 = r1.f1431
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float m1934() {
            r1 = this;
            float r0 = r1.f1429
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m1935() {
            r1 = this;
            float r0 = r1.f1430
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m1936(float r1) {
            r0 = this;
            r0.f1431 = r1
            float r1 = m1932(r1)
            r0.f1434 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m1937(float r1) {
            r0 = this;
            r0.f1429 = r1
            float r1 = m1932(r1)
            r0.f1432 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m1938(float r1) {
            r0 = this;
            r0.f1430 = r1
            float r1 = m1932(r1)
            r0.f1433 = r1
            return
    }
}
