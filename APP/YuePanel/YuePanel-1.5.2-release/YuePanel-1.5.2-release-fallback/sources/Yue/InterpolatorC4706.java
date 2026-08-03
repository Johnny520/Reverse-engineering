package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class InterpolatorC4706 implements android.view.animation.Interpolator {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final float f14934 = 0.002f;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f14935 = 3000;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final double f14936 = 1.0E-5d;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float[] f14937;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float[] f14938;

    public InterpolatorC4706(android.content.Context r2, android.util.AttributeSet r3, org.xmlpull.v1.XmlPullParser r4) {
            r1 = this;
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public InterpolatorC4706(android.content.res.Resources r2, android.content.res.Resources.Theme r3, android.util.AttributeSet r4, org.xmlpull.v1.XmlPullParser r5) {
            r1 = this;
            r1.<init>()
            int[] r0 = Yue.C0347.f835
            android.content.res.TypedArray r2 = Yue.C6478.m23906(r2, r3, r4, r0)
            r1.m18691(r2, r5)
            r2.recycle()
            return
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r7) {
            r6 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 > 0) goto L6
            return r0
        L6:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 < 0) goto Ld
            return r1
        Ld:
            float[] r1 = r6.f14937
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
        L13:
            int r4 = r1 - r3
            if (r4 <= r2) goto L27
            int r4 = r3 + r1
            int r4 = r4 / 2
            float[] r5 = r6.f14937
            r5 = r5[r4]
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 >= 0) goto L25
            r1 = r4
            goto L13
        L25:
            r3 = r4
            goto L13
        L27:
            float[] r2 = r6.f14937
            r4 = r2[r1]
            r2 = r2[r3]
            float r4 = r4 - r2
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L37
            float[] r7 = r6.f14938
            r7 = r7[r3]
            return r7
        L37:
            float r7 = r7 - r2
            float r7 = r7 / r4
            float[] r0 = r6.f14938
            r2 = r0[r3]
            r0 = r0[r1]
            float r0 = r0 - r2
            float r7 = r7 * r0
            float r2 = r2 + r7
            return r2
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m18688(float r9, float r10, float r11, float r12) {
            r8 = this;
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r0 = 0
            r7.moveTo(r0, r0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.cubicTo(r1, r2, r3, r4, r5, r6)
            r8.m18689(r7)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m18689(android.graphics.Path r11) {
            r10 = this;
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            r1 = 0
            r0.<init>(r11, r1)
            float r11 = r0.getLength()
            r2 = 990057071(0x3b03126f, float:0.002)
            float r2 = r11 / r2
            int r2 = (int) r2
            r3 = 1
            int r2 = r2 + r3
            r4 = 3000(0xbb8, float:4.204E-42)
            int r2 = java.lang.Math.min(r4, r2)
            if (r2 <= 0) goto Lf9
            float[] r4 = new float[r2]
            r10.f14937 = r4
            float[] r4 = new float[r2]
            r10.f14938 = r4
            r4 = 2
            float[] r4 = new float[r4]
            r5 = r1
        L26:
            if (r5 >= r2) goto L41
            float r6 = (float) r5
            float r6 = r6 * r11
            int r7 = r2 + (-1)
            float r7 = (float) r7
            float r6 = r6 / r7
            r7 = 0
            r0.getPosTan(r6, r4, r7)
            float[] r6 = r10.f14937
            r7 = r4[r1]
            r6[r5] = r7
            float[] r6 = r10.f14938
            r7 = r4[r3]
            r6[r5] = r7
            int r5 = r5 + 1
            goto L26
        L41:
            float[] r11 = r10.f14937
            r11 = r11[r1]
            float r11 = java.lang.Math.abs(r11)
            double r4 = (double) r11
            r6 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto Lbb
            float[] r11 = r10.f14938
            r11 = r11[r1]
            float r11 = java.lang.Math.abs(r11)
            double r4 = (double) r11
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto Lbb
            float[] r11 = r10.f14937
            int r4 = r2 + (-1)
            r11 = r11[r4]
            r5 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 - r5
            float r11 = java.lang.Math.abs(r11)
            double r8 = (double) r11
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 > 0) goto Lbb
            float[] r11 = r10.f14938
            r11 = r11[r4]
            float r11 = r11 - r5
            float r11 = java.lang.Math.abs(r11)
            double r4 = (double) r11
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto Lbb
            r11 = 0
            r3 = r1
        L82:
            if (r1 >= r2) goto Lac
            float[] r4 = r10.f14937
            int r5 = r3 + 1
            r3 = r4[r3]
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 < 0) goto L95
            r4[r1] = r3
            int r1 = r1 + 1
            r11 = r3
            r3 = r5
            goto L82
        L95:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The Path cannot loop back on itself, x :"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        Lac:
            boolean r11 = r0.nextContour()
            if (r11 != 0) goto Lb3
            return
        Lb3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The Path should be continuous, can't have 2+ contours"
            r11.<init>(r0)
            throw r11
        Lbb:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "The Path must start at (0,0) and end at (1,1) start: "
            r0.append(r4)
            float[] r4 = r10.f14937
            r4 = r4[r1]
            r0.append(r4)
            java.lang.String r4 = ","
            r0.append(r4)
            float[] r5 = r10.f14938
            r1 = r5[r1]
            r0.append(r1)
            java.lang.String r1 = " end:"
            r0.append(r1)
            float[] r1 = r10.f14937
            int r2 = r2 - r3
            r1 = r1[r2]
            r0.append(r1)
            r0.append(r4)
            float[] r1 = r10.f14938
            r1 = r1[r2]
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        Lf9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The Path has a invalid length "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m18690(float r3, float r4) {
            r2 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1 = 0
            r0.moveTo(r1, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.quadTo(r3, r4, r1, r1)
            r2.m18689(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m18691(android.content.res.TypedArray r8, org.xmlpull.v1.XmlPullParser r9) {
            r7 = this;
            java.lang.String r0 = "pathData"
            boolean r1 = Yue.C6478.m23905(r9, r0)
            if (r1 == 0) goto L2e
            r1 = 4
            java.lang.String r8 = Yue.C6478.m23900(r8, r9, r0, r1)
            android.graphics.Path r9 = Yue.C4710.m18708(r8)
            if (r9 == 0) goto L17
            r7.m18689(r9)
            goto L6a
        L17:
            android.view.InflateException r9 = new android.view.InflateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The path is null, which is created from "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
        L2e:
            java.lang.String r0 = "controlX1"
            boolean r1 = Yue.C6478.m23905(r9, r0)
            if (r1 == 0) goto L7b
            java.lang.String r1 = "controlY1"
            boolean r2 = Yue.C6478.m23905(r9, r1)
            if (r2 == 0) goto L73
            r2 = 0
            r3 = 0
            float r0 = Yue.C6478.m23897(r8, r9, r0, r2, r3)
            r2 = 1
            float r1 = Yue.C6478.m23897(r8, r9, r1, r2, r3)
            java.lang.String r2 = "controlX2"
            boolean r4 = Yue.C6478.m23905(r9, r2)
            java.lang.String r5 = "controlY2"
            boolean r6 = Yue.C6478.m23905(r9, r5)
            if (r4 != r6) goto L6b
            if (r4 != 0) goto L5d
            r7.m18690(r0, r1)
            goto L6a
        L5d:
            r4 = 2
            float r2 = Yue.C6478.m23897(r8, r9, r2, r4, r3)
            r4 = 3
            float r8 = Yue.C6478.m23897(r8, r9, r5, r4, r3)
            r7.m18688(r0, r1, r2, r8)
        L6a:
            return
        L6b:
            android.view.InflateException r8 = new android.view.InflateException
            java.lang.String r9 = "pathInterpolator requires both controlX2 and controlY2 for cubic Beziers."
            r8.<init>(r9)
            throw r8
        L73:
            android.view.InflateException r8 = new android.view.InflateException
            java.lang.String r9 = "pathInterpolator requires the controlY1 attribute"
            r8.<init>(r9)
            throw r8
        L7b:
            android.view.InflateException r8 = new android.view.InflateException
            java.lang.String r9 = "pathInterpolator requires the controlX1 attribute"
            r8.<init>(r9)
            throw r8
    }
}
