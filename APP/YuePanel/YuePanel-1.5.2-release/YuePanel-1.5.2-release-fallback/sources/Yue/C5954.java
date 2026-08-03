package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5954 extends Yue.AbstractInterpolatorC4272 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float f21723;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float f21724;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f21725;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f21726;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f21727;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f21728;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float f21729;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float f21730;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float f21731;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f21732;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public java.lang.String f21733;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f21734;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public float f21735;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public float f21736;

    public C5954() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f21734 = r0
            return
    }

    @Override // Yue.AbstractInterpolatorC4272, android.animation.TimeInterpolator
    public float getInterpolation(float r2) {
            r1 = this;
            float r0 = r1.m22089(r2)
            r1.f21736 = r2
            boolean r2 = r1.f21734
            if (r2 == 0) goto Le
            float r2 = r1.f21735
            float r2 = r2 - r0
            goto L11
        Le:
            float r2 = r1.f21735
            float r2 = r2 + r0
        L11:
            return r2
    }

    @Override // Yue.AbstractInterpolatorC4272
    /* JADX INFO: renamed from: ۥ */
    public float mo16637() {
            r1 = this;
            boolean r0 = r1.f21734
            if (r0 == 0) goto Lc
            float r0 = r1.f21736
            float r0 = r1.m22092(r0)
            float r0 = -r0
            goto L12
        Lc:
            float r0 = r1.f21736
            float r0 = r1.m22092(r0)
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final float m22089(float r6) {
            r5 = this;
            float r0 = r5.f21726
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 > 0) goto L15
            float r1 = r5.f21723
            float r3 = r1 * r6
            float r4 = r5.f21724
            float r4 = r4 - r1
            float r4 = r4 * r6
            float r4 = r4 * r6
            float r0 = r0 * r2
            float r4 = r4 / r0
            float r3 = r3 + r4
            return r3
        L15:
            int r1 = r5.f21732
            r3 = 1
            if (r1 != r3) goto L1d
            float r6 = r5.f21729
            return r6
        L1d:
            float r6 = r6 - r0
            float r0 = r5.f21727
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 >= 0) goto L34
            float r1 = r5.f21729
            float r3 = r5.f21724
            float r4 = r3 * r6
            float r1 = r1 + r4
            float r4 = r5.f21725
            float r4 = r4 - r3
            float r4 = r4 * r6
            float r4 = r4 * r6
            float r0 = r0 * r2
            float r4 = r4 / r0
            float r1 = r1 + r4
            return r1
        L34:
            r3 = 2
            if (r1 != r3) goto L3a
            float r6 = r5.f21730
            return r6
        L3a:
            float r6 = r6 - r0
            float r0 = r5.f21728
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 >= 0) goto L4e
            float r1 = r5.f21730
            float r3 = r5.f21725
            float r4 = r3 * r6
            float r1 = r1 + r4
            float r3 = r3 * r6
            float r3 = r3 * r6
            float r0 = r0 * r2
            float r3 = r3 / r0
            float r1 = r1 - r3
            return r1
        L4e:
            float r6 = r5.f21731
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m22090(float r7, float r8, float r9, float r10, float r11, float r12) {
            r6 = this;
            r6.f21735 = r7
            int r1 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r1 <= 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            r6.f21734 = r1
            if (r1 == 0) goto L18
            float r1 = -r9
            float r2 = r7 - r8
            r0 = r6
            r3 = r11
            r4 = r12
            r5 = r10
            r0.m22093(r1, r2, r3, r4, r5)
            goto L22
        L18:
            float r2 = r8 - r7
            r0 = r6
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r10
            r0.m22093(r1, r2, r3, r4, r5)
        L22:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m22091(java.lang.String r7, java.lang.String r8, float r9) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = " ===== "
            r0.append(r1)
            java.lang.String r1 = r6.f21733
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            boolean r1 = r6.f21734
            if (r1 == 0) goto L28
            java.lang.String r1 = "backwards"
            goto L2a
        L28:
            java.lang.String r1 = "forward "
        L2a:
            r0.append(r1)
            java.lang.String r1 = " time = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "  stages "
            r0.append(r1)
            int r1 = r6.f21732
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = " dur "
            r0.append(r1)
            float r2 = r6.f21726
            r0.append(r2)
            java.lang.String r2 = " vel "
            r0.append(r2)
            float r3 = r6.f21723
            r0.append(r3)
            java.lang.String r3 = " pos "
            r0.append(r3)
            float r4 = r6.f21729
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r7, r0)
            int r0 = r6.f21732
            r4 = 1
            if (r0 <= r4) goto L9f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r1)
            float r5 = r6.f21727
            r0.append(r5)
            r0.append(r2)
            float r5 = r6.f21724
            r0.append(r5)
            r0.append(r3)
            float r5 = r6.f21730
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r7, r0)
        L9f:
            int r0 = r6.f21732
            r5 = 2
            if (r0 <= r5) goto Lcb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r1)
            float r1 = r6.f21728
            r0.append(r1)
            r0.append(r2)
            float r1 = r6.f21725
            r0.append(r1)
            r0.append(r3)
            float r1 = r6.f21731
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r7, r0)
        Lcb:
            float r0 = r6.f21726
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 > 0) goto Le6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "stage 0"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.v(r7, r8)
            return
        Le6:
            int r1 = r6.f21732
            if (r1 != r4) goto Lff
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "end stage 0"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.v(r7, r8)
            return
        Lff:
            float r9 = r9 - r0
            float r0 = r6.f21727
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L11b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = " stage 1"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.v(r7, r8)
            return
        L11b:
            if (r1 != r5) goto L132
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "end stage 1"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.v(r7, r8)
            return
        L132:
            float r9 = r9 - r0
            float r0 = r6.f21728
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L14e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = " stage 2"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.v(r7, r8)
            return
        L14e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = " end stage 2"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.v(r7, r8)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float m22092(float r4) {
            r3 = this;
            float r0 = r3.f21726
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 > 0) goto Lf
            float r1 = r3.f21723
            float r2 = r3.f21724
            float r2 = r2 - r1
            float r2 = r2 * r4
            float r2 = r2 / r0
            float r1 = r1 + r2
            return r1
        Lf:
            int r1 = r3.f21732
            r2 = 1
            if (r1 != r2) goto L16
            r4 = 0
            return r4
        L16:
            float r4 = r4 - r0
            float r0 = r3.f21727
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L26
            float r1 = r3.f21724
            float r2 = r3.f21725
            float r2 = r2 - r1
            float r2 = r2 * r4
            float r2 = r2 / r0
            float r1 = r1 + r2
            return r1
        L26:
            r2 = 2
            if (r1 != r2) goto L2c
            float r4 = r3.f21730
            return r4
        L2c:
            float r4 = r4 - r0
            float r0 = r3.f21728
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L39
            float r1 = r3.f21725
            float r4 = r4 * r1
            float r4 = r4 / r0
            float r1 = r1 - r4
            return r1
        L39:
            float r4 = r3.f21731
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m22093(float r9, float r10, float r11, float r12, float r13) {
            r8 = this;
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 != 0) goto L8
            r9 = 953267991(0x38d1b717, float:1.0E-4)
        L8:
            r8.f21723 = r9
            float r1 = r9 / r11
            float r2 = r1 * r9
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r5 = 3
            r6 = 2
            if (r4 >= 0) goto L70
            float r13 = -r9
            float r13 = r13 / r11
            float r13 = r13 * r9
            float r13 = r13 / r3
            float r13 = r10 - r13
            float r13 = r13 * r11
            double r1 = (double) r13
            double r1 = java.lang.Math.sqrt(r1)
            float r13 = (float) r1
            int r1 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r1 >= 0) goto L47
            java.lang.String r12 = "backward accelerate, decelerate"
            r8.f21733 = r12
            r8.f21732 = r6
            r8.f21723 = r9
            r8.f21724 = r13
            r8.f21725 = r0
            float r12 = r13 - r9
            float r12 = r12 / r11
            r8.f21726 = r12
            float r11 = r13 / r11
            r8.f21727 = r11
            float r9 = r9 + r13
            float r9 = r9 * r12
            float r9 = r9 / r3
            r8.f21729 = r9
            r8.f21730 = r10
            r8.f21731 = r10
            return
        L47:
            java.lang.String r13 = "backward accelerate cruse decelerate"
            r8.f21733 = r13
            r8.f21732 = r5
            r8.f21723 = r9
            r8.f21724 = r12
            r8.f21725 = r12
            float r13 = r12 - r9
            float r13 = r13 / r11
            r8.f21726 = r13
            float r11 = r12 / r11
            r8.f21728 = r11
            float r9 = r9 + r12
            float r9 = r9 * r13
            float r9 = r9 / r3
            float r11 = r11 * r12
            float r11 = r11 / r3
            float r13 = r10 - r9
            float r13 = r13 - r11
            float r13 = r13 / r12
            r8.f21727 = r13
            r8.f21729 = r9
            float r9 = r10 - r11
            r8.f21730 = r9
            r8.f21731 = r10
            return
        L70:
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 < 0) goto L86
            java.lang.String r11 = "hard stop"
            r8.f21733 = r11
            float r3 = r3 * r10
            float r3 = r3 / r9
            r11 = 1
            r8.f21732 = r11
            r8.f21723 = r9
            r8.f21724 = r0
            r8.f21729 = r10
            r8.f21726 = r3
            return
        L86:
            float r2 = r10 - r2
            float r4 = r2 / r9
            float r7 = r4 + r1
            int r13 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r13 >= 0) goto La5
            java.lang.String r11 = "cruse decelerate"
            r8.f21733 = r11
            r8.f21732 = r6
            r8.f21723 = r9
            r8.f21724 = r9
            r8.f21725 = r0
            r8.f21729 = r2
            r8.f21730 = r10
            r8.f21726 = r4
            r8.f21727 = r1
            return
        La5:
            float r13 = r11 * r10
            float r1 = r9 * r9
            float r1 = r1 / r3
            float r13 = r13 + r1
            double r1 = (double) r13
            double r1 = java.lang.Math.sqrt(r1)
            float r13 = (float) r1
            float r1 = r13 - r9
            float r1 = r1 / r11
            r8.f21726 = r1
            float r2 = r13 / r11
            r8.f21727 = r2
            int r4 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r4 >= 0) goto Ld6
            java.lang.String r11 = "accelerate decelerate"
            r8.f21733 = r11
            r8.f21732 = r6
            r8.f21723 = r9
            r8.f21724 = r13
            r8.f21725 = r0
            r8.f21726 = r1
            r8.f21727 = r2
            float r9 = r9 + r13
            float r9 = r9 * r1
            float r9 = r9 / r3
            r8.f21729 = r9
            r8.f21730 = r10
            return
        Ld6:
            java.lang.String r13 = "accelerate cruse decelerate"
            r8.f21733 = r13
            r8.f21732 = r5
            r8.f21723 = r9
            r8.f21724 = r12
            r8.f21725 = r12
            float r13 = r12 - r9
            float r13 = r13 / r11
            r8.f21726 = r13
            float r11 = r12 / r11
            r8.f21728 = r11
            float r9 = r9 + r12
            float r9 = r9 * r13
            float r9 = r9 / r3
            float r11 = r11 * r12
            float r11 = r11 / r3
            float r13 = r10 - r9
            float r13 = r13 - r11
            float r13 = r13 / r12
            r8.f21727 = r13
            r8.f21729 = r9
            float r9 = r10 - r11
            r8.f21730 = r9
            r8.f21731 = r10
            return
    }
}
