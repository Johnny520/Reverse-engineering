package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z3 {
    public int a;
    public final java.lang.Object b;
    public java.lang.Object c;

    public z3(android.graphics.Shader r1, android.content.res.ColorStateList r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.a = r3
            return
    }

    public z3(android.widget.ImageView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r2
            return
    }

    public static defpackage.z3 b(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
            r0 = r30
            r1 = r32
            android.content.res.XmlResourceParser r2 = r30.getXml(r31)
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)
        Lc:
            int r4 = r2.next()
            r5 = 1
            r6 = 2
            if (r4 == r6) goto L17
            if (r4 == r5) goto L17
            goto Lc
        L17:
            if (r4 != r6) goto L291
            java.lang.String r4 = r2.getName()
            r4.getClass()
            java.lang.String r7 = "gradient"
            boolean r8 = r4.equals(r7)
            r9 = 0
            if (r8 != 0) goto L5d
            java.lang.String r5 = "selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L3f
            android.content.res.ColorStateList r0 = defpackage.hb.b(r0, r2, r3, r1)
            z3 r1 = new z3
            int r2 = r0.getDefaultColor()
            r1.<init>(r9, r0, r2)
            return r1
        L3f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5d:
            java.lang.String r4 = r2.getName()
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L271
            int[] r4 = defpackage.ty.d
            android.content.res.TypedArray r4 = defpackage.zt.H(r0, r1, r3, r4)
            java.lang.String r7 = "http://schemas.android.com/apk/res/android"
            java.lang.String r8 = "startX"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            r10 = 0
            if (r8 == 0) goto L80
            r8 = 8
            float r8 = r4.getFloat(r8, r10)
            r12 = r8
            goto L81
        L80:
            r12 = r10
        L81:
            java.lang.String r8 = "startY"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            if (r8 == 0) goto L91
            r8 = 9
            float r8 = r4.getFloat(r8, r10)
            r13 = r8
            goto L92
        L91:
            r13 = r10
        L92:
            java.lang.String r8 = "endX"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            if (r8 == 0) goto La2
            r8 = 10
            float r8 = r4.getFloat(r8, r10)
            r14 = r8
            goto La3
        La2:
            r14 = r10
        La3:
            java.lang.String r8 = "endY"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            if (r8 == 0) goto Lb3
            r8 = 11
            float r8 = r4.getFloat(r8, r10)
            r15 = r8
            goto Lb4
        Lb3:
            r15 = r10
        Lb4:
            java.lang.String r8 = "centerX"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            r11 = 3
            if (r8 == 0) goto Lc2
            float r8 = r4.getFloat(r11, r10)
            goto Lc3
        Lc2:
            r8 = r10
        Lc3:
            java.lang.String r9 = "centerY"
            java.lang.String r9 = r2.getAttributeValue(r7, r9)
            if (r9 == 0) goto Ld1
            r9 = 4
            float r9 = r4.getFloat(r9, r10)
            goto Ld2
        Ld1:
            r9 = r10
        Ld2:
            java.lang.String r11 = "type"
            java.lang.String r11 = r2.getAttributeValue(r7, r11)
            r10 = 0
            if (r11 == 0) goto Le0
            int r11 = r4.getInt(r6, r10)
            goto Le1
        Le0:
            r11 = r10
        Le1:
            java.lang.String r6 = "startColor"
            java.lang.String r6 = r2.getAttributeValue(r7, r6)
            if (r6 == 0) goto Lee
            int r6 = r4.getColor(r10, r10)
            goto Lef
        Lee:
            r6 = r10
        Lef:
            java.lang.String r5 = "centerColor"
            java.lang.String r20 = r2.getAttributeValue(r7, r5)
            if (r20 == 0) goto Lfa
            r20 = 1
            goto Lfc
        Lfa:
            r20 = r10
        Lfc:
            java.lang.String r5 = r2.getAttributeValue(r7, r5)
            if (r5 == 0) goto L108
            r5 = 7
            int r5 = r4.getColor(r5, r10)
            goto L109
        L108:
            r5 = r10
        L109:
            java.lang.String r10 = "endColor"
            java.lang.String r10 = r2.getAttributeValue(r7, r10)
            if (r10 == 0) goto L11c
            r21 = r12
            r10 = 0
            r12 = 1
            int r23 = r4.getColor(r12, r10)
            r12 = r23
            goto L120
        L11c:
            r21 = r12
            r10 = 0
            r12 = r10
        L120:
            java.lang.String r10 = "tileMode"
            java.lang.String r10 = r2.getAttributeValue(r7, r10)
            if (r10 == 0) goto L131
            r10 = 6
            r22 = r13
            r13 = 0
            int r10 = r4.getInt(r10, r13)
            goto L134
        L131:
            r22 = r13
            r10 = 0
        L134:
            java.lang.String r13 = "gradientRadius"
            java.lang.String r7 = r2.getAttributeValue(r7, r13)
            if (r7 == 0) goto L144
            r7 = 5
            r13 = 0
            float r7 = r4.getFloat(r7, r13)
            r13 = r7
            goto L145
        L144:
            r13 = 0
        L145:
            r4.recycle()
            int r4 = r2.getDepth()
            r7 = 1
            int r4 = r4 + r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r24 = r2
            r2 = 20
            r7.<init>(r2)
            r25 = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r2)
        L15e:
            int r2 = r24.next()
            r26 = r14
            r14 = 1
            if (r2 == r14) goto L1d4
            int r14 = r24.getDepth()
            r27 = r15
            if (r14 >= r4) goto L172
            r15 = 3
            if (r2 == r15) goto L1d6
        L172:
            r15 = 2
            if (r2 == r15) goto L17a
        L175:
            r14 = r26
            r15 = r27
            goto L15e
        L17a:
            if (r14 > r4) goto L175
            java.lang.String r2 = r24.getName()
            java.lang.String r14 = "item"
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L189
            goto L175
        L189:
            int[] r2 = defpackage.ty.e
            android.content.res.TypedArray r2 = defpackage.zt.H(r0, r1, r3, r2)
            r14 = 0
            boolean r15 = r2.hasValue(r14)
            r14 = 1
            boolean r19 = r2.hasValue(r14)
            if (r15 == 0) goto L1b9
            if (r19 == 0) goto L1b9
            r15 = 0
            int r28 = r2.getColor(r15, r15)
            r15 = 0
            float r29 = r2.getFloat(r14, r15)
            r2.recycle()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            r13.add(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r29)
            r7.add(r2)
            goto L175
        L1b9:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r24.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1d4:
            r27 = r15
        L1d6:
            int r0 = r13.size()
            if (r0 <= 0) goto L1e2
            d4 r0 = new d4
            r0.<init>(r13, r7)
            goto L1e3
        L1e2:
            r0 = 0
        L1e3:
            if (r0 == 0) goto L1e7
        L1e5:
            r14 = 1
            goto L1f5
        L1e7:
            if (r20 == 0) goto L1ef
            d4 r0 = new d4
            r0.<init>(r6, r5, r12)
            goto L1e5
        L1ef:
            d4 r0 = new d4
            r0.<init>(r6, r12)
            goto L1e5
        L1f5:
            if (r11 == r14) goto L231
            r15 = 2
            if (r11 == r15) goto L223
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            java.lang.Object r1 = r0.b
            r16 = r1
            int[] r16 = (int[]) r16
            java.lang.Object r0 = r0.c
            r17 = r0
            float[] r17 = (float[]) r17
            if (r10 == r14) goto L21c
            if (r10 == r15) goto L219
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
        L20e:
            r18 = r0
            r12 = r21
            r13 = r22
            r14 = r26
            r15 = r27
            goto L21f
        L219:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.MIRROR
            goto L20e
        L21c:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.REPEAT
            goto L20e
        L21f:
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L261
        L223:
            android.graphics.SweepGradient r11 = new android.graphics.SweepGradient
            java.lang.Object r1 = r0.b
            int[] r1 = (int[]) r1
            java.lang.Object r0 = r0.c
            float[] r0 = (float[]) r0
            r11.<init>(r8, r9, r1, r0)
            goto L261
        L231:
            r17 = 0
            int r1 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r1 <= 0) goto L269
            android.graphics.RadialGradient r16 = new android.graphics.RadialGradient
            java.lang.Object r1 = r0.b
            r20 = r1
            int[] r20 = (int[]) r20
            java.lang.Object r0 = r0.c
            r21 = r0
            float[] r21 = (float[]) r21
            r14 = 1
            if (r10 == r14) goto L259
            r15 = 2
            if (r10 == r15) goto L256
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
        L24d:
            r22 = r0
            r17 = r8
            r18 = r9
            r19 = r25
            goto L25c
        L256:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.MIRROR
            goto L24d
        L259:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.REPEAT
            goto L24d
        L25c:
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r11 = r16
        L261:
            z3 r0 = new z3
            r1 = 0
            r13 = 0
            r0.<init>(r11, r1, r13)
            return r0
        L269:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L271:
            r24 = r2
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r24.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L291:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
    }

    public void a() {
            r3 = this;
            java.lang.Object r0 = r3.b
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            if (r1 == 0) goto Ld
            defpackage.eh.a(r1)
        Ld:
            if (r1 == 0) goto L1c
            java.lang.Object r2 = r3.c
            y60 r2 = (defpackage.y60) r2
            if (r2 == 0) goto L1c
            int[] r0 = r0.getDrawableState()
            defpackage.u3.e(r1, r2, r0)
        L1c:
            return
    }

    public boolean c() {
            r1 = this;
            java.lang.Object r0 = r1.b
            android.graphics.Shader r0 = (android.graphics.Shader) r0
            if (r0 != 0) goto L14
            java.lang.Object r0 = r1.c
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            if (r0 == 0) goto L14
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public void d(android.util.AttributeSet r9, int r10) {
            r8 = this;
            java.lang.Object r0 = r8.b
            r1 = r0
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.content.Context r0 = r1.getContext()
            int[] r3 = defpackage.xy.f
            r5 r7 = defpackage.r5.y(r0, r9, r3, r10)
            java.lang.Object r0 = r7.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r1.getContext()
            java.lang.Object r4 = r7.b
            r5 = r4
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r4 = r9
            r6 = r10
            defpackage.ja0.k(r1, r2, r3, r4, r5, r6)
            android.graphics.drawable.Drawable r9 = r1.getDrawable()     // Catch: java.lang.Throwable -> L3d
            r10 = -1
            if (r9 != 0) goto L40
            r2 = 1
            int r2 = r0.getResourceId(r2, r10)     // Catch: java.lang.Throwable -> L3d
            if (r2 == r10) goto L40
            android.content.Context r9 = r1.getContext()     // Catch: java.lang.Throwable -> L3d
            android.graphics.drawable.Drawable r9 = defpackage.ff.r(r9, r2)     // Catch: java.lang.Throwable -> L3d
            if (r9 == 0) goto L40
            r1.setImageDrawable(r9)     // Catch: java.lang.Throwable -> L3d
            goto L40
        L3d:
            r0 = move-exception
            r9 = r0
            goto L6a
        L40:
            if (r9 == 0) goto L45
            defpackage.eh.a(r9)     // Catch: java.lang.Throwable -> L3d
        L45:
            r9 = 2
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L53
            android.content.res.ColorStateList r9 = r7.l(r9)     // Catch: java.lang.Throwable -> L3d
            defpackage.to.c(r1, r9)     // Catch: java.lang.Throwable -> L3d
        L53:
            r9 = 3
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L66
            int r9 = r0.getInt(r9, r10)     // Catch: java.lang.Throwable -> L3d
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = defpackage.eh.b(r9, r10)     // Catch: java.lang.Throwable -> L3d
            defpackage.to.d(r1, r9)     // Catch: java.lang.Throwable -> L3d
        L66:
            r7.z()
            return
        L6a:
            r7.z()
            throw r9
    }
}
