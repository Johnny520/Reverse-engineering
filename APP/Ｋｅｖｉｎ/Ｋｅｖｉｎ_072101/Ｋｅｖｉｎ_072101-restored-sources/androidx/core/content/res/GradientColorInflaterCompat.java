package androidx.core.content.res;

/* JADX INFO: loaded from: classes2.dex */
final class GradientColorInflaterCompat {
    private static final int TILE_MODE_CLAMP = 0;
    private static final int TILE_MODE_MIRROR = 2;
    private static final int TILE_MODE_REPEAT = 1;

    static final class ColorStops {
        final int[] mColors;
        final float[] mOffsets;

        ColorStops(int r2, int r3) {
                r1 = this;
                r1.<init>()
                int[] r0 = new int[]{r2, r3}
                r1.mColors = r0
                r0 = 2
                float[] r0 = new float[r0]
                r0 = {x0012: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                r1.mOffsets = r0
                return
        }

        ColorStops(int r2, int r3, int r4) {
                r1 = this;
                r1.<init>()
                int[] r0 = new int[]{r2, r3, r4}
                r1.mColors = r0
                r0 = 3
                float[] r0 = new float[r0]
                r0 = {x0012: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
                r1.mOffsets = r0
                return
        }

        ColorStops(java.util.List<java.lang.Integer> r5, java.util.List<java.lang.Float> r6) {
                r4 = this;
                r4.<init>()
                int r0 = r5.size()
                int[] r1 = new int[r0]
                r4.mColors = r1
                float[] r1 = new float[r0]
                r4.mOffsets = r1
                r1 = 0
            L10:
                if (r1 >= r0) goto L31
                int[] r2 = r4.mColors
                java.lang.Object r3 = r5.get(r1)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2[r1] = r3
                float[] r2 = r4.mOffsets
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

    private GradientColorInflaterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.core.content.res.GradientColorInflaterCompat.ColorStops checkColors(androidx.core.content.res.GradientColorInflaterCompat.ColorStops r1, int r2, int r3, boolean r4, int r5) {
            if (r1 == 0) goto L3
            return r1
        L3:
            if (r4 == 0) goto Lb
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r0 = new androidx.core.content.res.GradientColorInflaterCompat$ColorStops
            r0.<init>(r2, r5, r3)
            return r0
        Lb:
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r0 = new androidx.core.content.res.GradientColorInflaterCompat$ColorStops
            r0.<init>(r2, r3)
            return r0
    }

    static android.graphics.Shader createFromXml(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L4:
            int r1 = r5.next()
            r2 = r1
            r3 = 2
            if (r1 == r3) goto L10
            r1 = 1
            if (r2 == r1) goto L10
            goto L4
        L10:
            if (r2 != r3) goto L17
            android.graphics.Shader r1 = createFromXmlInner(r4, r5, r0, r6)
            return r1
        L17:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r3 = "No start tag found"
            r1.<init>(r3)
            throw r1
    }

    static android.graphics.Shader createFromXmlInner(android.content.res.Resources r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            r0 = r29
            java.lang.String r1 = r29.getName()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Le7
            int[] r2 = androidx.core.C0112R.styleable.GradientColor
            r3 = r28
            r4 = r30
            r5 = r31
            android.content.res.TypedArray r2 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r3, r5, r4, r2)
            java.lang.String r6 = "startX"
            int r7 = androidx.core.C0112R.styleable.GradientColor_android_startX
            r8 = 0
            float r6 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r6, r7, r8)
            java.lang.String r7 = "startY"
            int r9 = androidx.core.C0112R.styleable.GradientColor_android_startY
            float r7 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r7, r9, r8)
            java.lang.String r9 = "endX"
            int r10 = androidx.core.C0112R.styleable.GradientColor_android_endX
            float r17 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r9, r10, r8)
            java.lang.String r9 = "endY"
            int r10 = androidx.core.C0112R.styleable.GradientColor_android_endY
            float r18 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r9, r10, r8)
            java.lang.String r9 = "centerX"
            int r10 = androidx.core.C0112R.styleable.GradientColor_android_centerX
            float r15 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r9, r10, r8)
            java.lang.String r9 = "centerY"
            int r10 = androidx.core.C0112R.styleable.GradientColor_android_centerY
            float r14 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r9, r10, r8)
            java.lang.String r9 = "type"
            int r10 = androidx.core.C0112R.styleable.GradientColor_android_type
            r11 = 0
            int r26 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r2, r0, r9, r10, r11)
            java.lang.String r9 = "startColor"
            int r10 = androidx.core.C0112R.styleable.GradientColor_android_startColor
            int r13 = androidx.core.content.res.TypedArrayUtils.getNamedColor(r2, r0, r9, r10, r11)
            java.lang.String r9 = "centerColor"
            boolean r12 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r0, r9)
            int r10 = androidx.core.C0112R.styleable.GradientColor_android_centerColor
            int r10 = androidx.core.content.res.TypedArrayUtils.getNamedColor(r2, r0, r9, r10, r11)
            java.lang.String r9 = "endColor"
            int r8 = androidx.core.C0112R.styleable.GradientColor_android_endColor
            int r8 = androidx.core.content.res.TypedArrayUtils.getNamedColor(r2, r0, r9, r8, r11)
            java.lang.String r9 = "tileMode"
            int r3 = androidx.core.C0112R.styleable.GradientColor_android_tileMode
            int r3 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r2, r0, r9, r3, r11)
            java.lang.String r9 = "gradientRadius"
            int r11 = androidx.core.C0112R.styleable.GradientColor_android_gradientRadius
            r4 = 0
            float r27 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r2, r0, r9, r11, r4)
            r2.recycle()
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r4 = inflateChildElements(r28, r29, r30, r31)
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r4 = checkColors(r4, r13, r8, r12, r10)
            switch(r26) {
                case 1: goto Lc0;
                case 2: goto Lb6;
                default: goto L8f;
            }
        L8f:
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            int[] r11 = r4.mColors
            float[] r9 = r4.mOffsets
            android.graphics.Shader$TileMode r16 = parseTileMode(r3)
            r19 = r9
            r9 = r0
            r20 = r10
            r10 = r6
            r21 = r11
            r11 = r7
            r22 = r12
            r12 = r17
            r23 = r13
            r13 = r18
            r24 = r14
            r14 = r21
            r21 = r15
            r15 = r19
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r0
        Lb6:
            android.graphics.SweepGradient r9 = new android.graphics.SweepGradient
            int[] r11 = r4.mColors
            float[] r0 = r4.mOffsets
            r9.<init>(r15, r14, r11, r0)
            return r9
        Lc0:
            r0 = 0
            int r0 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r0 <= 0) goto Ldf
            android.graphics.RadialGradient r0 = new android.graphics.RadialGradient
            int[] r9 = r4.mColors
            float[] r11 = r4.mOffsets
            android.graphics.Shader$TileMode r25 = parseTileMode(r3)
            r19 = r0
            r20 = r15
            r21 = r14
            r22 = r27
            r23 = r9
            r24 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25)
            return r0
        Ldf:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r9 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r9)
            throw r0
        Le7:
            r5 = r31
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r29.getPositionDescription()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": invalid gradient color tag "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    private static androidx.core.content.res.GradientColorInflaterCompat.ColorStops inflateChildElements(android.content.res.Resources r12, org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            int r0 = r13.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r3 = r4
        L13:
            int r4 = r13.next()
            r5 = r4
            if (r4 == r1) goto L8a
            int r4 = r13.getDepth()
            r6 = r4
            if (r4 >= r0) goto L24
            r4 = 3
            if (r5 == r4) goto L8a
        L24:
            r4 = 2
            if (r5 == r4) goto L28
            goto L13
        L28:
            if (r6 > r0) goto L13
            java.lang.String r4 = r13.getName()
            java.lang.String r7 = "item"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L37
            goto L13
        L37:
            int[] r4 = androidx.core.C0112R.styleable.GradientColorItem
            android.content.res.TypedArray r4 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r12, r15, r14, r4)
            int r7 = androidx.core.C0112R.styleable.GradientColorItem_android_color
            boolean r7 = r4.hasValue(r7)
            int r8 = androidx.core.C0112R.styleable.GradientColorItem_android_offset
            boolean r8 = r4.hasValue(r8)
            if (r7 == 0) goto L6d
            if (r8 == 0) goto L6d
            int r9 = androidx.core.C0112R.styleable.GradientColorItem_android_color
            r10 = 0
            int r9 = r4.getColor(r9, r10)
            int r10 = androidx.core.C0112R.styleable.GradientColorItem_android_offset
            r11 = 0
            float r10 = r4.getFloat(r10, r11)
            r4.recycle()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r3.add(r11)
            java.lang.Float r11 = java.lang.Float.valueOf(r10)
            r2.add(r11)
            goto L13
        L6d:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r13.getPositionDescription()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r1.<init>(r9)
            throw r1
        L8a:
            int r1 = r3.size()
            if (r1 <= 0) goto L96
            androidx.core.content.res.GradientColorInflaterCompat$ColorStops r1 = new androidx.core.content.res.GradientColorInflaterCompat$ColorStops
            r1.<init>(r3, r2)
            return r1
        L96:
            r1 = 0
            return r1
    }

    private static android.graphics.Shader.TileMode parseTileMode(int r1) {
            switch(r1) {
                case 1: goto L9;
                case 2: goto L6;
                default: goto L3;
            }
        L3:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            return r0
        L6:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.MIRROR
            return r0
        L9:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.REPEAT
            return r0
    }
}
