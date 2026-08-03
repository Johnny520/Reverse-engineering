package a;

/* JADX INFO: renamed from: a.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0491z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Shader f775a;
    public final android.content.res.ColorStateList b;
    public int c;

    public C0491z3(android.graphics.Shader r1, android.content.res.ColorStateList r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f775a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static a.C0491z3 a(android.content.res.Resources r26, int r27, android.content.res.Resources.Theme r28) {
            r0 = r26
            r1 = r28
            java.lang.String r2 = "gradient"
            android.content.res.XmlResourceParser r3 = r26.getXml(r27)
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r3)
        Le:
            int r5 = r3.next()
            r6 = 2
            r7 = 1
            if (r5 == r6) goto L19
            if (r5 == r7) goto L19
            goto Le
        L19:
            if (r5 != r6) goto L2a8
            java.lang.String r5 = r3.getName()
            r5.getClass()
            r8 = 0
            boolean r9 = r5.equals(r2)
            if (r9 != 0) goto L5d
            java.lang.String r2 = "selector"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L3f
            android.content.res.ColorStateList r0 = a.C0401u3.b(r0, r3, r4, r1)
            a.z3 r1 = new a.z3
            int r2 = r0.getDefaultColor()
            r1.<init>(r8, r0, r2)
            return r1
        L3f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5d:
            java.lang.String r5 = r3.getName()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L288
            int[] r2 = androidx.core.R.styleable.GradientColor
            android.content.res.TypedArray r2 = a.Lf.c(r0, r1, r4, r2)
            int r5 = androidx.core.R.styleable.GradientColor_android_startX
            java.lang.String r9 = "http://schemas.android.com/apk/res/android"
            java.lang.String r10 = "startX"
            java.lang.String r10 = r3.getAttributeValue(r9, r10)
            r11 = 0
            if (r10 == 0) goto L7c
            r10 = r7
            goto L7d
        L7c:
            r10 = r11
        L7d:
            r12 = 0
            if (r10 != 0) goto L82
            r14 = r12
            goto L87
        L82:
            float r5 = r2.getFloat(r5, r12)
            r14 = r5
        L87:
            int r5 = androidx.core.R.styleable.GradientColor_android_startY
            java.lang.String r10 = "startY"
            java.lang.String r10 = r3.getAttributeValue(r9, r10)
            if (r10 == 0) goto L97
            float r5 = r2.getFloat(r5, r12)
            r15 = r5
            goto L98
        L97:
            r15 = r12
        L98:
            int r5 = androidx.core.R.styleable.GradientColor_android_endX
            java.lang.String r10 = "endX"
            java.lang.String r10 = r3.getAttributeValue(r9, r10)
            if (r10 == 0) goto La9
            float r5 = r2.getFloat(r5, r12)
            r16 = r5
            goto Lab
        La9:
            r16 = r12
        Lab:
            int r5 = androidx.core.R.styleable.GradientColor_android_endY
            java.lang.String r10 = "endY"
            java.lang.String r10 = r3.getAttributeValue(r9, r10)
            if (r10 == 0) goto Lbc
            float r5 = r2.getFloat(r5, r12)
            r17 = r5
            goto Lbe
        Lbc:
            r17 = r12
        Lbe:
            int r5 = androidx.core.R.styleable.GradientColor_android_centerX
            java.lang.String r10 = "centerX"
            java.lang.String r10 = r3.getAttributeValue(r9, r10)
            if (r10 == 0) goto Lcd
            float r5 = r2.getFloat(r5, r12)
            goto Lce
        Lcd:
            r5 = r12
        Lce:
            int r10 = androidx.core.R.styleable.GradientColor_android_centerY
            java.lang.String r13 = "centerY"
            java.lang.String r13 = r3.getAttributeValue(r9, r13)
            if (r13 == 0) goto Ldd
            float r10 = r2.getFloat(r10, r12)
            goto Lde
        Ldd:
            r10 = r12
        Lde:
            int r13 = androidx.core.R.styleable.GradientColor_android_type
            java.lang.String r8 = "type"
            java.lang.String r8 = r3.getAttributeValue(r9, r8)
            if (r8 == 0) goto Lea
            r8 = r7
            goto Leb
        Lea:
            r8 = r11
        Leb:
            if (r8 != 0) goto Lef
            r8 = r11
            goto Lf3
        Lef:
            int r8 = r2.getInt(r13, r11)
        Lf3:
            int r13 = androidx.core.R.styleable.GradientColor_android_startColor
            java.lang.String r6 = "startColor"
            java.lang.String r6 = r3.getAttributeValue(r9, r6)
            if (r6 == 0) goto L102
            int r6 = r2.getColor(r13, r11)
            goto L103
        L102:
            r6 = r11
        L103:
            java.lang.String r13 = "centerColor"
            java.lang.String r19 = r3.getAttributeValue(r9, r13)
            if (r19 == 0) goto L110
            r19 = r7
            r20 = r19
            goto L114
        L110:
            r20 = r7
            r19 = r11
        L114:
            int r7 = androidx.core.R.styleable.GradientColor_android_centerColor
            java.lang.String r13 = r3.getAttributeValue(r9, r13)
            if (r13 == 0) goto L121
            int r7 = r2.getColor(r7, r11)
            goto L122
        L121:
            r7 = r11
        L122:
            int r13 = androidx.core.R.styleable.GradientColor_android_endColor
            java.lang.String r12 = "endColor"
            java.lang.String r12 = r3.getAttributeValue(r9, r12)
            if (r12 == 0) goto L131
            int r12 = r2.getColor(r13, r11)
            goto L132
        L131:
            r12 = r11
        L132:
            int r13 = androidx.core.R.styleable.GradientColor_android_tileMode
            java.lang.String r11 = "tileMode"
            java.lang.String r11 = r3.getAttributeValue(r9, r11)
            if (r11 == 0) goto L143
            r11 = 0
            int r13 = r2.getInt(r13, r11)
            r11 = r13
            goto L144
        L143:
            r11 = 0
        L144:
            int r13 = androidx.core.R.styleable.GradientColor_android_gradientRadius
            r22 = r14
            java.lang.String r14 = "gradientRadius"
            java.lang.String r9 = r3.getAttributeValue(r9, r14)
            if (r9 == 0) goto L157
            r9 = 0
            float r13 = r2.getFloat(r13, r9)
            r9 = r13
            goto L158
        L157:
            r9 = 0
        L158:
            r2.recycle()
            int r2 = r3.getDepth()
            int r2 = r2 + 1
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 20
            r13.<init>(r14)
            r23 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r14)
        L16f:
            int r14 = r23.next()
            r24 = r9
            r9 = r20
            if (r14 == r9) goto L1f0
            int r9 = r23.getDepth()
            r25 = r15
            if (r9 >= r2) goto L184
            r15 = 3
            if (r14 == r15) goto L1f2
        L184:
            r15 = 2
            if (r14 == r15) goto L18e
        L187:
            r9 = r24
            r15 = r25
            r20 = 1
            goto L16f
        L18e:
            if (r9 > r2) goto L1d2
            java.lang.String r9 = r23.getName()
            java.lang.String r14 = "item"
            boolean r9 = r9.equals(r14)
            if (r9 != 0) goto L19d
            goto L187
        L19d:
            int[] r9 = androidx.core.R.styleable.GradientColorItem
            android.content.res.TypedArray r9 = a.Lf.c(r0, r1, r4, r9)
            int r14 = androidx.core.R.styleable.GradientColorItem_android_color
            boolean r14 = r9.hasValue(r14)
            int r15 = androidx.core.R.styleable.GradientColorItem_android_offset
            boolean r15 = r9.hasValue(r15)
            if (r14 == 0) goto L1d5
            if (r15 == 0) goto L1d5
            int r14 = androidx.core.R.styleable.GradientColorItem_android_color
            r15 = 0
            int r14 = r9.getColor(r14, r15)
            int r15 = androidx.core.R.styleable.GradientColorItem_android_offset
            r0 = 0
            float r15 = r9.getFloat(r15, r0)
            r9.recycle()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r3.add(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
            r13.add(r0)
        L1d2:
            r0 = r26
            goto L187
        L1d5:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1f0:
            r25 = r15
        L1f2:
            int r0 = r3.size()
            if (r0 <= 0) goto L1fe
            a.Z7 r0 = new a.Z7
            r0.<init>(r3, r13)
            goto L1ff
        L1fe:
            r0 = 0
        L1ff:
            if (r0 == 0) goto L203
        L201:
            r9 = 1
            goto L211
        L203:
            if (r19 == 0) goto L20b
            a.Z7 r0 = new a.Z7
            r0.<init>(r6, r7, r12)
            goto L201
        L20b:
            a.Z7 r0 = new a.Z7
            r0.<init>(r6, r12)
            goto L201
        L211:
            if (r8 == r9) goto L249
            r15 = 2
            if (r8 == r15) goto L23b
            android.graphics.LinearGradient r13 = new android.graphics.LinearGradient
            if (r11 == r9) goto L224
            if (r11 == r15) goto L221
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
        L21e:
            r20 = r1
            goto L227
        L221:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L21e
        L224:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            goto L21e
        L227:
            java.lang.Object r1 = r0.f371a
            r18 = r1
            int[] r18 = (int[]) r18
            java.lang.Object r0 = r0.b
            r19 = r0
            float[] r19 = (float[]) r19
            r14 = r22
            r15 = r25
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            goto L278
        L23b:
            android.graphics.SweepGradient r13 = new android.graphics.SweepGradient
            java.lang.Object r1 = r0.f371a
            int[] r1 = (int[]) r1
            java.lang.Object r0 = r0.b
            float[] r0 = (float[]) r0
            r13.<init>(r5, r10, r1, r0)
            goto L278
        L249:
            r21 = 0
            int r1 = (r24 > r21 ? 1 : (r24 == r21 ? 0 : -1))
            if (r1 <= 0) goto L280
            r15 = 2
            android.graphics.RadialGradient r18 = new android.graphics.RadialGradient
            r9 = 1
            if (r11 == r9) goto L25d
            if (r11 == r15) goto L25a
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            goto L25f
        L25a:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L25f
        L25d:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
        L25f:
            java.lang.Object r2 = r0.f371a
            r22 = r2
            int[] r22 = (int[]) r22
            java.lang.Object r0 = r0.b
            r23 = r0
            float[] r23 = (float[]) r23
            r19 = r5
            r20 = r10
            r21 = r24
            r24 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r13 = r18
        L278:
            a.z3 r0 = new a.z3
            r1 = 0
            r15 = 0
            r0.<init>(r13, r1, r15)
            return r0
        L280:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L288:
            r23 = r3
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2a8:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
    }

    public final boolean b() {
            r1 = this;
            android.graphics.Shader r0 = r1.f775a
            if (r0 != 0) goto L10
            android.content.res.ColorStateList r0 = r1.b
            if (r0 == 0) goto L10
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }
}
