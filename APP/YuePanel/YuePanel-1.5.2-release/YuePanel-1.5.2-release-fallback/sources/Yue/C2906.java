package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public final class C2906 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f9375 = 0;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f9376 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f9377 = 2;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۡ$ۥ, reason: contains not printable characters */
    public static final class C2907 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int[] f9378;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final float[] f9379;

        public C2907(@Yue.InterfaceC1230 int r1, @Yue.InterfaceC1230 int r2) {
                r0 = this;
                r0.<init>()
                int[] r1 = new int[]{r1, r2}
                r0.f9378 = r1
                r1 = 2
                float[] r1 = new float[r1]
                r1 = {x0012: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                r0.f9379 = r1
                return
        }

        public C2907(@Yue.InterfaceC1230 int r1, @Yue.InterfaceC1230 int r2, @Yue.InterfaceC1230 int r3) {
                r0 = this;
                r0.<init>()
                int[] r1 = new int[]{r1, r2, r3}
                r0.f9378 = r1
                r1 = 3
                float[] r1 = new float[r1]
                r1 = {x0012: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
                r0.f9379 = r1
                return
        }

        public C2907(@Yue.InterfaceC4410 java.util.List<java.lang.Integer> r5, @Yue.InterfaceC4410 java.util.List<java.lang.Float> r6) {
                r4 = this;
                r4.<init>()
                int r0 = r5.size()
                int[] r1 = new int[r0]
                r4.f9378 = r1
                float[] r1 = new float[r0]
                r4.f9379 = r1
                r1 = 0
            L10:
                if (r1 >= r0) goto L31
                int[] r2 = r4.f9378
                java.lang.Object r3 = r5.get(r1)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2[r1] = r3
                float[] r2 = r4.f9379
                java.lang.Object r3 = r6.get(r1)
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r2[r1] = r3
                int r1 = r1 + 1
                goto L10
            L31:
                return
        }
    }

    public C2906() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C2906.C2907 m12410(@Yue.InterfaceC4544 Yue.C2906.C2907 r0, @Yue.InterfaceC1230 int r1, @Yue.InterfaceC1230 int r2, boolean r3, @Yue.InterfaceC1230 int r4) {
            if (r0 == 0) goto L3
            return r0
        L3:
            if (r3 == 0) goto Lb
            Yue.ۥۣ۠ۧۡ$ۥ r0 = new Yue.ۥۣ۠ۧۡ$ۥ
            r0.<init>(r1, r4, r2)
            return r0
        Lb:
            Yue.ۥۣ۠ۧۡ$ۥ r0 = new Yue.ۥۣ۠ۧۡ$ۥ
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.graphics.Shader m12411(@Yue.InterfaceC4410 android.content.res.Resources r4, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r5, @Yue.InterfaceC4544 android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L4:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto Lf
            r3 = 1
            if (r1 == r3) goto Lf
            goto L4
        Lf:
            if (r1 != r2) goto L16
            android.graphics.Shader r4 = m12412(r4, r5, r0, r6)
            return r4
        L16:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.graphics.Shader m12412(@Yue.InterfaceC4410 android.content.res.Resources r20, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r21, @Yue.InterfaceC4410 android.util.AttributeSet r22, @Yue.InterfaceC4544 android.content.res.Resources.Theme r23) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            r0 = r21
            java.lang.String r1 = r21.getName()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Ld4
            int[] r1 = Yue.C5172.C5182.f19511
            r2 = r20
            r3 = r22
            r4 = r23
            android.content.res.TypedArray r1 = Yue.C6478.m23906(r2, r4, r3, r1)
            java.lang.String r5 = "startX"
            int r6 = Yue.C5172.C5182.f19520
            r7 = 0
            float r9 = Yue.C6478.m23897(r1, r0, r5, r6, r7)
            java.lang.String r5 = "startY"
            int r6 = Yue.C5172.C5182.f19521
            float r10 = Yue.C6478.m23897(r1, r0, r5, r6, r7)
            java.lang.String r5 = "endX"
            int r6 = Yue.C5172.C5182.f19522
            float r11 = Yue.C6478.m23897(r1, r0, r5, r6, r7)
            java.lang.String r5 = "endY"
            int r6 = Yue.C5172.C5182.f19523
            float r12 = Yue.C6478.m23897(r1, r0, r5, r6, r7)
            java.lang.String r5 = "centerX"
            int r6 = Yue.C5172.C5182.f19515
            float r14 = Yue.C6478.m23897(r1, r0, r5, r6, r7)
            java.lang.String r5 = "centerY"
            int r6 = Yue.C5172.C5182.f19516
            float r15 = Yue.C6478.m23897(r1, r0, r5, r6, r7)
            java.lang.String r5 = "type"
            int r6 = Yue.C5172.C5182.f19514
            r8 = 0
            int r5 = Yue.C6478.m23898(r1, r0, r5, r6, r8)
            java.lang.String r6 = "startColor"
            int r13 = Yue.C5172.C5182.f19512
            int r6 = Yue.C6478.m23893(r1, r0, r6, r13, r8)
            java.lang.String r13 = "centerColor"
            boolean r7 = Yue.C6478.m23905(r0, r13)
            int r2 = Yue.C5172.C5182.f19519
            int r2 = Yue.C6478.m23893(r1, r0, r13, r2, r8)
            java.lang.String r13 = "endColor"
            int r3 = Yue.C5172.C5182.f19513
            int r3 = Yue.C6478.m23893(r1, r0, r13, r3, r8)
            java.lang.String r13 = "tileMode"
            int r4 = Yue.C5172.C5182.f19518
            int r4 = Yue.C6478.m23898(r1, r0, r13, r4, r8)
            java.lang.String r8 = "gradientRadius"
            int r13 = Yue.C5172.C5182.f19517
            r17 = r14
            r14 = 0
            float r8 = Yue.C6478.m23897(r1, r0, r8, r13, r14)
            r1.recycle()
            Yue.ۥۣ۠ۧۡ$ۥ r0 = m12413(r20, r21, r22, r23)
            Yue.ۥۣ۠ۧۡ$ۥ r0 = m12410(r0, r6, r3, r7, r2)
            r1 = 1
            if (r5 == r1) goto Laf
            r1 = 2
            if (r5 == r1) goto La3
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            int[] r13 = r0.f9378
            float[] r14 = r0.f9379
            android.graphics.Shader$TileMode r15 = m12414(r4)
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r1
        La3:
            android.graphics.SweepGradient r1 = new android.graphics.SweepGradient
            int[] r2 = r0.f9378
            float[] r0 = r0.f9379
            r3 = r17
            r1.<init>(r3, r15, r2, r0)
            return r1
        Laf:
            r3 = r17
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lcc
            android.graphics.RadialGradient r1 = new android.graphics.RadialGradient
            int[] r2 = r0.f9378
            float[] r0 = r0.f9379
            android.graphics.Shader$TileMode r19 = m12414(r4)
            r13 = r1
            r14 = r3
            r16 = r8
            r17 = r2
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            return r1
        Lcc:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        Ld4:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = r21.getPositionDescription()
            r3.append(r0)
            java.lang.String r0 = ": invalid gradient color tag "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C2906.C2907 m12413(@Yue.InterfaceC4410 android.content.res.Resources r8, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r9, @Yue.InterfaceC4410 android.util.AttributeSet r10, @Yue.InterfaceC4544 android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = Yue.C5172.C5182.f19524
            android.content.res.TypedArray r3 = Yue.C6478.m23906(r8, r11, r10, r3)
            int r5 = Yue.C5172.C5182.f19525
            boolean r5 = r3.hasValue(r5)
            int r6 = Yue.C5172.C5182.f19526
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = Yue.C5172.C5182.f19525
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = Yue.C5172.C5182.f19526
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            Yue.ۥۣ۠ۧۡ$ۥ r8 = new Yue.ۥۣ۠ۧۡ$ۥ
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static android.graphics.Shader.TileMode m12414(int r1) {
            r0 = 1
            if (r1 == r0) goto Lc
            r0 = 2
            if (r1 == r0) goto L9
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            return r1
        L9:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            return r1
        Lc:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            return r1
    }
}
