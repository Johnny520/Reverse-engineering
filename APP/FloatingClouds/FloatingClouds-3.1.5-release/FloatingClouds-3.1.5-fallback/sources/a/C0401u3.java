package a;

/* JADX INFO: renamed from: a.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0401u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal<android.util.TypedValue> f706a = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            a.C0401u3.f706a = r0
            return
    }

    public static android.content.res.ColorStateList a(android.content.res.Resources r4, android.content.res.XmlResourceParser r5, android.content.res.Resources.Theme r6) {
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
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L16:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
    }

    public static android.content.res.ColorStateList b(android.content.res.Resources r36, android.content.res.XmlResourceParser r37, android.util.AttributeSet r38, android.content.res.Resources.Theme r39) {
            r0 = r36
            r1 = r38
            r2 = r39
            java.lang.String r3 = r37.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L355
            int r3 = r37.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = r7
        L20:
            int r9 = r37.next()
            if (r9 == r4) goto L344
            int r10 = r37.getDepth()
            if (r10 >= r3) goto L2f
            r11 = 3
            if (r9 == r11) goto L344
        L2f:
            r11 = 2
            if (r9 != r11) goto L40
            if (r10 > r3) goto L40
            java.lang.String r9 = r37.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L46
        L40:
            r34 = r3
            r16 = r4
            goto L337
        L46:
            int[] r9 = androidx.core.R.styleable.ColorStateListItem
            if (r2 != 0) goto L4f
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L53
        L4f:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L53:
            int r10 = androidx.core.R.styleable.ColorStateListItem_android_color
            r12 = -1
            int r10 = r9.getResourceId(r10, r12)
            r13 = -65281(0xffffffffffff00ff, float:NaN)
            r14 = 31
            if (r10 == r12) goto L93
            java.lang.ThreadLocal<android.util.TypedValue> r12 = a.C0401u3.f706a
            java.lang.Object r15 = r12.get()
            android.util.TypedValue r15 = (android.util.TypedValue) r15
            if (r15 != 0) goto L73
            android.util.TypedValue r15 = new android.util.TypedValue
            r15.<init>()
            r12.set(r15)
        L73:
            r0.getValue(r10, r15, r4)
            int r12 = r15.type
            r15 = 28
            if (r12 < r15) goto L7f
            if (r12 > r14) goto L7f
            goto L93
        L7f:
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)     // Catch: java.lang.Exception -> L8c
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch: java.lang.Exception -> L8c
            int r10 = r10.getDefaultColor()     // Catch: java.lang.Exception -> L8c
            goto L99
        L8c:
            int r10 = androidx.core.R.styleable.ColorStateListItem_android_color
            int r10 = r9.getColor(r10, r13)
            goto L99
        L93:
            int r10 = androidx.core.R.styleable.ColorStateListItem_android_color
            int r10 = r9.getColor(r10, r13)
        L99:
            int r12 = androidx.core.R.styleable.ColorStateListItem_android_alpha
            boolean r12 = r9.hasValue(r12)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto Laa
            int r12 = androidx.core.R.styleable.ColorStateListItem_android_alpha
            float r12 = r9.getFloat(r12, r13)
            goto Lba
        Laa:
            int r12 = androidx.core.R.styleable.ColorStateListItem_alpha
            boolean r12 = r9.hasValue(r12)
            if (r12 == 0) goto Lb9
            int r12 = androidx.core.R.styleable.ColorStateListItem_alpha
            float r12 = r9.getFloat(r12, r13)
            goto Lba
        Lb9:
            r12 = r13
        Lba:
            int r15 = android.os.Build.VERSION.SDK_INT
            r16 = r4
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r15 < r14) goto Ld1
            int r14 = androidx.core.R.styleable.ColorStateListItem_android_lStar
            boolean r14 = r9.hasValue(r14)
            if (r14 == 0) goto Ld1
            int r14 = androidx.core.R.styleable.ColorStateListItem_android_lStar
            float r4 = r9.getFloat(r14, r4)
            goto Ld7
        Ld1:
            int r14 = androidx.core.R.styleable.ColorStateListItem_lStar
            float r4 = r9.getFloat(r14, r4)
        Ld7:
            r9.recycle()
            int r9 = r1.getAttributeCount()
            int[] r14 = new int[r9]
            r15 = r7
            r17 = r11
            r11 = r15
        Le4:
            if (r15 >= r9) goto L114
            r18 = r13
            int r13 = r1.getAttributeNameResource(r15)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r13 == r7) goto L10c
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r13 == r7) goto L10c
            int r7 = androidx.core.R.attr.alpha
            if (r13 == r7) goto L10c
            int r7 = androidx.core.R.attr.lStar
            if (r13 == r7) goto L10c
            int r7 = r11 + 1
            r0 = 0
            boolean r20 = r1.getAttributeBooleanValue(r15, r0)
            if (r20 == 0) goto L108
            goto L109
        L108:
            int r13 = -r13
        L109:
            r14[r11] = r13
            r11 = r7
        L10c:
            int r15 = r15 + 1
            r0 = r36
            r13 = r18
            r7 = 0
            goto Le4
        L114:
            r18 = r13
            int[] r0 = android.util.StateSet.trimStateSet(r14, r11)
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r11 = 1120403456(0x42c80000, float:100.0)
            if (r9 < 0) goto L128
            int r9 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r9 > 0) goto L128
            r9 = r16
            goto L129
        L128:
            r9 = 0
        L129:
            int r13 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r13 != 0) goto L135
            if (r9 != 0) goto L135
            r31 = r0
            r34 = r3
            goto L2f3
        L135:
            int r13 = android.graphics.Color.alpha(r10)
            float r13 = (float) r13
            float r13 = r13 * r12
            r12 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r12
            int r12 = (int) r13
            r13 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r12 = a.C0282n9.j(r12, r14, r13)
            if (r9 == 0) goto L2e7
            a.I2 r9 = a.I2.a(r10)
            a.Xg r10 = a.Xg.k
            float r13 = r9.b
            double r14 = (double) r13
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 < 0) goto L16d
            int r14 = java.lang.Math.round(r4)
            double r14 = (double) r14
            r20 = 0
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 <= 0) goto L16d
            int r14 = java.lang.Math.round(r4)
            double r14 = (double) r14
            r20 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 < 0) goto L173
        L16d:
            r31 = r0
            r34 = r3
            goto L2e2
        L173:
            float r9 = r9.f120a
            int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r14 >= 0) goto L17b
            r9 = r7
            goto L181
        L17b:
            r14 = 1135869952(0x43b40000, float:360.0)
            float r9 = java.lang.Math.min(r14, r9)
        L181:
            r21 = r7
            r22 = r21
            r15 = r13
            r20 = r16
            r7 = 0
        L189:
            float r23 = r21 - r13
            float r23 = java.lang.Math.abs(r23)
            r24 = 1053609165(0x3ecccccd, float:0.4)
            int r23 = (r23 > r24 ? 1 : (r23 == r24 ? 0 : -1))
            if (r23 < 0) goto L2d2
            r23 = 1148846080(0x447a0000, float:1000.0)
            r26 = r11
            r25 = r22
            r24 = r23
            r27 = 0
        L1a0:
            float r28 = r25 - r26
            float r28 = java.lang.Math.abs(r28)
            r29 = 1008981770(0x3c23d70a, float:0.01)
            int r28 = (r28 > r29 ? 1 : (r28 == r29 ? 0 : -1))
            r29 = 1073741824(0x40000000, float:2.0)
            if (r28 <= 0) goto L294
            float r28 = r26 - r25
            float r28 = r28 / r29
            r30 = r11
            float r11 = r28 + r25
            a.I2 r14 = a.I2.b(r11, r15, r9)
            r31 = r0
            a.Xg r0 = a.Xg.k
            int r0 = r14.c(r0)
            int r14 = android.graphics.Color.red(r0)
            float r14 = a.C0435w1.J(r14)
            int r32 = android.graphics.Color.green(r0)
            float r32 = a.C0435w1.J(r32)
            int r33 = android.graphics.Color.blue(r0)
            float r33 = a.C0435w1.J(r33)
            float[][] r34 = a.C0435w1.e
            r34 = r34[r16]
            r19 = 0
            r35 = r34[r19]
            float r14 = r14 * r35
            r35 = r34[r16]
            float r32 = r32 * r35
            float r32 = r32 + r14
            r14 = r34[r17]
            float r33 = r33 * r14
            float r33 = r33 + r32
            float r14 = r33 / r30
            r32 = 1007753895(0x3c111aa7, float:0.008856452)
            int r32 = (r14 > r32 ? 1 : (r14 == r32 ? 0 : -1))
            if (r32 > 0) goto L202
            r32 = 1147261687(0x4461d2f7, float:903.2963)
            float r14 = r14 * r32
            r32 = r0
            goto L211
        L202:
            r32 = r0
            double r0 = (double) r14
            double r0 = java.lang.Math.cbrt(r0)
            float r0 = (float) r0
            r1 = 1122500608(0x42e80000, float:116.0)
            float r0 = r0 * r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r14 = r0 - r1
        L211:
            float r0 = r4 - r14
            float r0 = java.lang.Math.abs(r0)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L272
            a.I2 r1 = a.I2.a(r32)
            r32 = r0
            float r0 = r1.c
            float r2 = r1.b
            a.I2 r0 = a.I2.b(r0, r2, r9)
            float r2 = r1.d
            r33 = r2
            float r2 = r0.d
            float r2 = r33 - r2
            r33 = r2
            float r2 = r1.e
            r34 = r2
            float r2 = r0.e
            float r2 = r34 - r2
            r34 = r2
            float r2 = r1.f
            float r0 = r0.f
            float r2 = r2 - r0
            float r0 = r33 * r33
            float r33 = r34 * r34
            float r33 = r33 + r0
            float r2 = r2 * r2
            float r2 = r2 + r33
            r33 = r1
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            r34 = r3
            r2 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r0, r2)
            r2 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r0 = r0 * r2
            float r0 = (float) r0
            int r1 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r1 > 0) goto L274
            r24 = r0
            r23 = r32
            r27 = r33
            goto L274
        L272:
            r34 = r3
        L274:
            int r0 = (r23 > r22 ? 1 : (r23 == r22 ? 0 : -1))
            if (r0 != 0) goto L27f
            int r0 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r0 != 0) goto L27f
        L27c:
            r0 = r27
            goto L29b
        L27f:
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 >= 0) goto L286
            r25 = r11
            goto L288
        L286:
            r26 = r11
        L288:
            r1 = r38
            r2 = r39
            r11 = r30
            r0 = r31
            r3 = r34
            goto L1a0
        L294:
            r31 = r0
            r34 = r3
            r30 = r11
            goto L27c
        L29b:
            if (r20 == 0) goto L2b9
            if (r0 == 0) goto L2a5
            int r0 = r0.c(r10)
        L2a3:
            r10 = r0
            goto L2eb
        L2a5:
            float r0 = r13 - r21
            float r0 = r0 / r29
            float r15 = r0 + r21
            r1 = r38
            r2 = r39
            r11 = r30
            r0 = r31
            r3 = r34
            r20 = 0
            goto L189
        L2b9:
            if (r0 != 0) goto L2bd
            r13 = r15
            goto L2c0
        L2bd:
            r7 = r0
            r21 = r15
        L2c0:
            float r0 = r13 - r21
            float r0 = r0 / r29
            float r15 = r0 + r21
            r1 = r38
            r2 = r39
            r11 = r30
            r0 = r31
            r3 = r34
            goto L189
        L2d2:
            r31 = r0
            r34 = r3
            if (r7 != 0) goto L2dd
            int r0 = a.C0435w1.F(r4)
            goto L2a3
        L2dd:
            int r0 = r7.c(r10)
            goto L2a3
        L2e2:
            int r0 = a.C0435w1.F(r4)
            goto L2a3
        L2e7:
            r31 = r0
            r34 = r3
        L2eb:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r12 << 24
            r10 = r0 | r1
        L2f3:
            int r0 = r8 + 1
            int r1 = r5.length
            r2 = 8
            r3 = 4
            if (r0 <= r1) goto L308
            if (r8 > r3) goto L2ff
            r1 = r2
            goto L301
        L2ff:
            int r1 = r8 * 2
        L301:
            int[] r1 = new int[r1]
            r14 = 0
            java.lang.System.arraycopy(r5, r14, r1, r14, r8)
            r5 = r1
        L308:
            r5[r8] = r10
            int r1 = r6.length
            if (r0 <= r1) goto L325
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r1 = r1.getComponentType()
            if (r8 > r3) goto L318
            goto L31a
        L318:
            int r2 = r8 * 2
        L31a:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r14 = 0
            java.lang.System.arraycopy(r6, r14, r1, r14, r8)
            r6 = r1
        L325:
            r6[r8] = r31
            int[][] r6 = (int[][]) r6
            r1 = r38
            r2 = r39
            r8 = r0
            r4 = r16
            r3 = r34
            r7 = 0
            r0 = r36
            goto L20
        L337:
            r0 = r36
            r1 = r38
            r2 = r39
            r4 = r16
            r3 = r34
            r7 = 0
            goto L20
        L344:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r14 = 0
            java.lang.System.arraycopy(r5, r14, r0, r14, r8)
            java.lang.System.arraycopy(r6, r14, r1, r14, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L355:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r37.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
