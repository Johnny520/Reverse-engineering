package p000;

/* JADX INFO: renamed from: ni */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0587ni {

    /* JADX INFO: renamed from: α */
    public static final java.lang.ThreadLocal f7628 = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p000.AbstractC0587ni.f7628 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static android.content.res.ColorStateList m4069(android.content.res.Resources r36, android.content.res.XmlResourceParser r37, android.content.res.Resources.Theme r38) {
            r0 = r36
            r1 = r38
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r37)
        L8:
            int r3 = r37.next()
            r4 = 1
            r5 = 2
            if (r3 == r5) goto L13
            if (r3 == r4) goto L13
            goto L8
        L13:
            if (r3 != r5) goto L394
            java.lang.String r3 = r37.getName()
            java.lang.String r6 = "selector"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L376
            int r3 = r37.getDepth()
            int r3 = r3 + r4
            r6 = 20
            int[][] r7 = new int[r6][]
            int[] r6 = new int[r6]
            r8 = 0
            r9 = r8
        L2e:
            int r10 = r37.next()
            if (r10 == r4) goto L365
            int r11 = r37.getDepth()
            r12 = 3
            if (r11 >= r3) goto L3d
            if (r10 == r12) goto L365
        L3d:
            if (r10 != r5) goto L4d
            if (r11 > r3) goto L4d
            java.lang.String r10 = r37.getName()
            java.lang.String r11 = "item"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L57
        L4d:
            r33 = r2
            r35 = r3
            r16 = r4
            r17 = r5
            goto L356
        L57:
            int[] r10 = p000.hk1.f4754
            if (r1 != 0) goto L60
            android.content.res.TypedArray r10 = r0.obtainAttributes(r2, r10)
            goto L64
        L60:
            android.content.res.TypedArray r10 = r1.obtainStyledAttributes(r2, r10, r8, r8)
        L64:
            r11 = -1
            int r13 = r10.getResourceId(r8, r11)
            r14 = -65281(0xffffffffffff00ff, float:NaN)
            r15 = 31
            if (r13 == r11) goto La3
            java.lang.ThreadLocal r11 = p000.AbstractC0587ni.f7628
            java.lang.Object r16 = r11.get()
            android.util.TypedValue r16 = (android.util.TypedValue) r16
            if (r16 != 0) goto L83
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r11.set(r5)
            goto L85
        L83:
            r5 = r16
        L85:
            r0.getValue(r13, r5, r4)
            int r5 = r5.type
            r11 = 28
            if (r5 < r11) goto L91
            if (r5 > r15) goto L91
            goto La3
        L91:
            android.content.res.XmlResourceParser r5 = r0.getXml(r13)     // Catch: java.lang.Exception -> L9e
            android.content.res.ColorStateList r5 = m4069(r0, r5, r1)     // Catch: java.lang.Exception -> L9e
            int r5 = r5.getDefaultColor()     // Catch: java.lang.Exception -> L9e
            goto La7
        L9e:
            int r5 = r10.getColor(r8, r14)
            goto La7
        La3:
            int r5 = r10.getColor(r8, r14)
        La7:
            boolean r11 = r10.hasValue(r4)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto Lb4
            float r11 = r10.getFloat(r4, r13)
            goto Lc0
        Lb4:
            boolean r11 = r10.hasValue(r12)
            if (r11 == 0) goto Lbf
            float r11 = r10.getFloat(r12, r13)
            goto Lc0
        Lbf:
            r11 = r13
        Lc0:
            int r12 = android.os.Build.VERSION.SDK_INT
            r14 = 4
            r16 = r4
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 < r15) goto Ld5
            r12 = 2
            boolean r15 = r10.hasValue(r12)
            if (r15 == 0) goto Ld5
            float r4 = r10.getFloat(r12, r4)
            goto Ld9
        Ld5:
            float r4 = r10.getFloat(r14, r4)
        Ld9:
            r10.recycle()
            int r10 = r2.getAttributeCount()
            int[] r12 = new int[r10]
            r15 = r8
            r18 = r13
            r13 = r15
        Le6:
            if (r15 >= r10) goto L115
            int r14 = r2.getAttributeNameResource(r15)
            r8 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r14 == r8) goto L10e
            r8 = 16843551(0x101031f, float:2.3695797E-38)
            if (r14 == r8) goto L10e
            r8 = 2130968619(0x7f04002b, float:1.7545897E38)
            if (r14 == r8) goto L10e
            r8 = 2130968752(0x7f0400b0, float:1.7546167E38)
            if (r14 == r8) goto L10e
            int r8 = r13 + 1
            r0 = 0
            boolean r20 = r2.getAttributeBooleanValue(r15, r0)
            if (r20 == 0) goto L10a
            goto L10b
        L10a:
            int r14 = -r14
        L10b:
            r12[r13] = r14
            r13 = r8
        L10e:
            int r15 = r15 + 1
            r0 = r36
            r8 = 0
            r14 = 4
            goto Le6
        L115:
            int[] r0 = android.util.StateSet.trimStateSet(r12, r13)
            r8 = 0
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            r12 = 1120403456(0x42c80000, float:100.0)
            if (r10 < 0) goto L127
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 > 0) goto L127
            r10 = r16
            goto L128
        L127:
            r10 = 0
        L128:
            int r13 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r13 != 0) goto L138
            if (r10 != 0) goto L138
            r31 = r0
            r33 = r2
            r35 = r3
            r17 = 2
            goto L30f
        L138:
            int r13 = android.graphics.Color.alpha(r5)
            float r13 = (float) r13
            float r13 = r13 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r11
            int r11 = (int) r13
            if (r11 >= 0) goto L146
            r13 = 0
            goto L14c
        L146:
            r13 = 255(0xff, float:3.57E-43)
            if (r11 <= r13) goto L14b
            goto L14c
        L14b:
            r13 = r11
        L14c:
            if (r10 == 0) goto L2ff
            nd r5 = p000.C0582nd.m4021(r5)
            float r10 = r5.f7519
            float r5 = r5.f7520
            fa2 r11 = p000.fa2.f3845
            double r14 = (double) r5
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 < 0) goto L175
            int r14 = java.lang.Math.round(r4)
            double r14 = (double) r14
            r20 = 0
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 <= 0) goto L175
            int r14 = java.lang.Math.round(r4)
            double r14 = (double) r14
            r20 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 < 0) goto L17f
        L175:
            r31 = r0
            r33 = r2
            r35 = r3
            r17 = 2
            goto L2fa
        L17f:
            int r14 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r14 >= 0) goto L185
            r10 = r8
            goto L18b
        L185:
            r14 = 1135869952(0x43b40000, float:360.0)
            float r10 = java.lang.Math.min(r14, r10)
        L18b:
            r15 = r5
            r21 = r8
            r22 = r21
            r20 = r16
            r8 = 0
        L193:
            float r23 = r21 - r5
            float r23 = java.lang.Math.abs(r23)
            r24 = 1053609165(0x3ecccccd, float:0.4)
            int r23 = (r23 > r24 ? 1 : (r23 == r24 ? 0 : -1))
            if (r23 < 0) goto L2e6
            r23 = 1148846080(0x447a0000, float:1000.0)
            r26 = r12
            r25 = r22
            r24 = r23
            r27 = 0
        L1aa:
            float r28 = r25 - r26
            float r28 = java.lang.Math.abs(r28)
            r29 = 1008981770(0x3c23d70a, float:0.01)
            int r28 = (r28 > r29 ? 1 : (r28 == r29 ? 0 : -1))
            r29 = 1073741824(0x40000000, float:2.0)
            if (r28 <= 0) goto L2a4
            float r28 = r26 - r25
            float r28 = r28 / r29
            r30 = r12
            float r12 = r28 + r25
            nd r14 = p000.C0582nd.m4022(r12, r15, r10)
            r31 = r0
            fa2 r0 = p000.fa2.f3845
            int r0 = r14.m4023(r0)
            int r14 = android.graphics.Color.red(r0)
            float r14 = p000.jx0.m3021(r14)
            int r32 = android.graphics.Color.green(r0)
            float r32 = p000.jx0.m3021(r32)
            int r33 = android.graphics.Color.blue(r0)
            float r33 = p000.jx0.m3021(r33)
            float[][] r34 = p000.jx0.f5620
            r34 = r34[r16]
            r19 = 0
            r35 = r34[r19]
            float r14 = r14 * r35
            r35 = r34[r16]
            float r32 = r32 * r35
            float r32 = r32 + r14
            r17 = 2
            r14 = r34[r17]
            float r33 = r33 * r14
            float r33 = r33 + r32
            float r14 = r33 / r30
            r32 = 1007753895(0x3c111aa7, float:0.008856452)
            int r32 = (r14 > r32 ? 1 : (r14 == r32 ? 0 : -1))
            if (r32 > 0) goto L20e
            r32 = 1147261687(0x4461d2f7, float:903.2963)
            float r14 = r14 * r32
            r32 = r0
            goto L21d
        L20e:
            r32 = r0
            double r0 = (double) r14
            double r0 = java.lang.Math.cbrt(r0)
            float r0 = (float) r0
            r1 = 1122500608(0x42e80000, float:116.0)
            float r0 = r0 * r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r14 = r0 - r1
        L21d:
            float r0 = r4 - r14
            float r0 = java.lang.Math.abs(r0)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L280
            nd r1 = p000.C0582nd.m4021(r32)
            r32 = r0
            float r0 = r1.f7521
            r33 = r2
            float r2 = r1.f7520
            nd r0 = p000.C0582nd.m4022(r0, r2, r10)
            float r2 = r1.f7522
            r34 = r2
            float r2 = r0.f7522
            float r2 = r34 - r2
            r34 = r2
            float r2 = r1.f7523
            r35 = r2
            float r2 = r0.f7523
            float r2 = r35 - r2
            r35 = r2
            float r2 = r1.f7524
            float r0 = r0.f7524
            float r2 = r2 - r0
            float r0 = r34 * r34
            float r34 = r35 * r35
            float r34 = r34 + r0
            float r2 = r2 * r2
            float r2 = r2 + r34
            r34 = r1
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            r35 = r3
            r2 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r0, r2)
            r2 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r0 = r0 * r2
            float r0 = (float) r0
            int r1 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r1 > 0) goto L284
            r24 = r0
            r23 = r32
            r27 = r34
            goto L284
        L280:
            r33 = r2
            r35 = r3
        L284:
            int r0 = (r23 > r22 ? 1 : (r23 == r22 ? 0 : -1))
            if (r0 != 0) goto L28f
            int r0 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r0 != 0) goto L28f
        L28c:
            r0 = r27
            goto L2af
        L28f:
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 >= 0) goto L296
            r25 = r12
            goto L298
        L296:
            r26 = r12
        L298:
            r1 = r38
            r12 = r30
            r0 = r31
            r2 = r33
            r3 = r35
            goto L1aa
        L2a4:
            r31 = r0
            r33 = r2
            r35 = r3
            r30 = r12
            r17 = 2
            goto L28c
        L2af:
            if (r20 == 0) goto L2cd
            if (r0 == 0) goto L2b9
            int r0 = r0.m4023(r11)
        L2b7:
            r5 = r0
            goto L307
        L2b9:
            float r0 = r5 - r21
            float r0 = r0 / r29
            float r15 = r0 + r21
            r1 = r38
            r12 = r30
            r0 = r31
            r2 = r33
            r3 = r35
            r20 = 0
            goto L193
        L2cd:
            if (r0 != 0) goto L2d1
            r5 = r15
            goto L2d4
        L2d1:
            r8 = r0
            r21 = r15
        L2d4:
            float r0 = r5 - r21
            float r0 = r0 / r29
            float r15 = r0 + r21
            r1 = r38
            r12 = r30
            r0 = r31
            r2 = r33
            r3 = r35
            goto L193
        L2e6:
            r31 = r0
            r33 = r2
            r35 = r3
            r17 = 2
            if (r8 != 0) goto L2f5
            int r0 = p000.jx0.m3014(r4)
            goto L2b7
        L2f5:
            int r0 = r8.m4023(r11)
            goto L2b7
        L2fa:
            int r0 = p000.jx0.m3014(r4)
            goto L2b7
        L2ff:
            r31 = r0
            r33 = r2
            r35 = r3
            r17 = 2
        L307:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r5
            int r1 = r13 << 24
            r5 = r0 | r1
        L30f:
            int r0 = r9 + 1
            int r1 = r6.length
            r2 = 8
            if (r0 <= r1) goto L324
            r1 = 4
            if (r9 > r1) goto L31b
            r1 = r2
            goto L31d
        L31b:
            int r1 = r9 * 2
        L31d:
            int[] r1 = new int[r1]
            r3 = 0
            java.lang.System.arraycopy(r6, r3, r1, r3, r9)
            r6 = r1
        L324:
            r6[r9] = r5
            int r1 = r7.length
            if (r0 <= r1) goto L342
            java.lang.Class r1 = r7.getClass()
            java.lang.Class r1 = r1.getComponentType()
            r3 = 4
            if (r9 > r3) goto L335
            goto L337
        L335:
            int r2 = r9 * 2
        L337:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r3 = 0
            java.lang.System.arraycopy(r7, r3, r1, r3, r9)
            r7 = r1
        L342:
            r7[r9] = r31
            int[][] r7 = (int[][]) r7
            r1 = r38
            r9 = r0
            r4 = r16
            r5 = r17
            r2 = r33
            r3 = r35
            r8 = 0
            r0 = r36
            goto L2e
        L356:
            r0 = r36
            r1 = r38
            r4 = r16
            r5 = r17
            r2 = r33
            r3 = r35
            r8 = 0
            goto L2e
        L365:
            int[] r0 = new int[r9]
            int[][] r1 = new int[r9][]
            r3 = 0
            java.lang.System.arraycopy(r6, r3, r0, r3, r9)
            java.lang.System.arraycopy(r7, r3, r1, r3, r9)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L376:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = r37.getPositionDescription()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ": invalid color state list tag "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L394:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
    }
}
