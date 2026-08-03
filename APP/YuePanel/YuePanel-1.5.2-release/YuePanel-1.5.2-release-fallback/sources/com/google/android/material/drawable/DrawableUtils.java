package com.google.android.material.drawable;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;
    private static final int UNSPECIFIED_HEIGHT = -1;
    private static final int UNSPECIFIED_WIDTH = -1;

    @Yue.InterfaceC5336(21)
    public static class OutlineCompatL {
        private OutlineCompatL() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        public static void setConvexPath(@Yue.InterfaceC4410 android.graphics.Outline r0, @Yue.InterfaceC4410 android.graphics.Path r1) {
                r0.setConvexPath(r1)
                return
        }
    }

    @Yue.InterfaceC5336(30)
    public static class OutlineCompatR {
        private OutlineCompatR() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        public static void setPath(@Yue.InterfaceC4410 android.graphics.Outline r0, @Yue.InterfaceC4410 android.graphics.Path r1) {
                Yue.C2015.m9310(r0, r1)
                return
        }
    }

    private DrawableUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    public static android.graphics.drawable.Drawable compositeTwoLayeredDrawable(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r2) {
            r0 = -1
            android.graphics.drawable.Drawable r1 = compositeTwoLayeredDrawable(r1, r2, r0, r0)
            return r1
    }

    @Yue.InterfaceC4544
    public static android.graphics.drawable.Drawable compositeTwoLayeredDrawable(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r2, @Yue.InterfaceC4544 android.graphics.drawable.Drawable r3, @Yue.InterfaceC4992 int r4, @Yue.InterfaceC4992 int r5) {
            if (r2 != 0) goto L3
            return r3
        L3:
            if (r3 != 0) goto L6
            return r2
        L6:
            r0 = -1
            if (r4 != r0) goto Ld
            int r4 = getTopLayerIntrinsicWidth(r2, r3)
        Ld:
            if (r5 != r0) goto L13
            int r5 = getTopLayerIntrinsicHeight(r2, r3)
        L13:
            int r0 = r2.getIntrinsicWidth()
            if (r4 > r0) goto L20
            int r0 = r2.getIntrinsicHeight()
            if (r5 > r0) goto L20
            goto L44
        L20:
            float r4 = (float) r4
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r2.getIntrinsicWidth()
            float r5 = (float) r5
            int r0 = r2.getIntrinsicHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 < 0) goto L3d
            int r5 = r2.getIntrinsicWidth()
            float r0 = (float) r5
            float r0 = r0 / r4
            int r4 = (int) r0
            r1 = r5
            r5 = r4
            r4 = r1
            goto L44
        L3d:
            int r5 = r2.getIntrinsicHeight()
            float r0 = (float) r5
            float r4 = r4 * r0
            int r4 = (int) r4
        L44:
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[]{r2, r3}
            r0.<init>(r2)
            r2 = 1
            r0.setLayerSize(r2, r4, r5)
            r3 = 17
            r0.setLayerGravity(r2, r3)
            return r0
    }

    @Yue.InterfaceC4544
    public static android.graphics.drawable.Drawable createTintableDrawableIfNeeded(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4544 android.content.res.ColorStateList r2, @Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r3) {
            r0 = 0
            android.graphics.drawable.Drawable r1 = createTintableMutatedDrawableIfNeeded(r1, r2, r3, r0)
            return r1
    }

    @Yue.InterfaceC4544
    public static android.graphics.drawable.Drawable createTintableMutatedDrawableIfNeeded(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4544 android.content.res.ColorStateList r2, @Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r3) {
            r0 = 0
            android.graphics.drawable.Drawable r1 = createTintableMutatedDrawableIfNeeded(r1, r2, r3, r0)
            return r1
    }

    @Yue.InterfaceC4544
    private static android.graphics.drawable.Drawable createTintableMutatedDrawableIfNeeded(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r0, @Yue.InterfaceC4544 android.content.res.ColorStateList r1, @Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r2, boolean r3) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            if (r1 == 0) goto L14
            android.graphics.drawable.Drawable r0 = Yue.C1995.m9235(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r2 == 0) goto L19
            Yue.C1995.m9233(r0, r2)
            goto L19
        L14:
            if (r3 == 0) goto L19
            r0.mutate()
        L19:
            return r0
    }

    @Yue.InterfaceC4410
    public static int[] getCheckedState(@Yue.InterfaceC4410 int[] r3) {
            r0 = 0
        L1:
            int r1 = r3.length
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r0 >= r1) goto L1a
            r1 = r3[r0]
            if (r1 != r2) goto Lc
            return r3
        Lc:
            if (r1 != 0) goto L17
            java.lang.Object r3 = r3.clone()
            int[] r3 = (int[]) r3
            r3[r0] = r2
            return r3
        L17:
            int r0 = r0 + 1
            goto L1
        L1a:
            int r0 = r3.length
            int r0 = r0 + 1
            int[] r0 = java.util.Arrays.copyOf(r3, r0)
            int r3 = r3.length
            r0[r3] = r2
            return r0
    }

    @Yue.InterfaceC4544
    public static android.content.res.ColorStateList getColorStateListOrNull(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r2) {
            boolean r0 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto Lf
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            return r2
        Lf:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L24
            boolean r0 = Yue.C2005.m9296(r2)
            if (r0 == 0) goto L24
            android.graphics.drawable.ColorStateListDrawable r2 = Yue.C2007.m9298(r2)
            android.content.res.ColorStateList r2 = Yue.C2009.m9300(r2)
            return r2
        L24:
            r2 = 0
            return r2
    }

    private static int getTopLayerIntrinsicHeight(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4410 android.graphics.drawable.Drawable r2) {
            int r2 = r2.getIntrinsicHeight()
            r0 = -1
            if (r2 == r0) goto L8
            goto Lc
        L8:
            int r2 = r1.getIntrinsicHeight()
        Lc:
            return r2
    }

    private static int getTopLayerIntrinsicWidth(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4410 android.graphics.drawable.Drawable r2) {
            int r2 = r2.getIntrinsicWidth()
            r0 = -1
            if (r2 == r0) goto L8
            goto Lc
        L8:
            int r2 = r1.getIntrinsicWidth()
        Lc:
            return r2
    }

    @Yue.InterfaceC4410
    public static int[] getUncheckedState(@Yue.InterfaceC4410 int[] r6) {
            int r0 = r6.length
            int[] r0 = new int[r0]
            int r1 = r6.length
            r2 = 0
            r3 = r2
        L6:
            if (r2 >= r1) goto L17
            r4 = r6[r2]
            r5 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r4 == r5) goto L14
            int r5 = r3 + 1
            r0[r3] = r4
            r3 = r5
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            return r0
    }

    @Yue.InterfaceC4410
    public static android.util.AttributeSet parseDrawableXml(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC7171 int r4, @Yue.InterfaceC4410 java.lang.CharSequence r5) {
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            android.content.res.XmlResourceParser r3 = r3.getXml(r4)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
        L8:
            int r0 = r3.next()     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            r1 = 2
            if (r0 == r1) goto L12
            r2 = 1
            if (r0 != r2) goto L8
        L12:
            if (r0 != r1) goto L43
            java.lang.String r0 = r3.getName()     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            boolean r0 = android.text.TextUtils.equals(r0, r5)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            if (r0 == 0) goto L27
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r3)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            return r3
        L23:
            r3 = move-exception
            goto L4b
        L25:
            r3 = move-exception
            goto L4b
        L27:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            r0.<init>()     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            java.lang.String r1 = "Must have a <"
            r0.append(r1)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            r0.append(r5)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            java.lang.String r5 = "> start tag"
            r0.append(r5)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            java.lang.String r5 = r0.toString()     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            r3.<init>(r5)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            throw r3     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
        L43:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            java.lang.String r5 = "No start tag found"
            r3.<init>(r5)     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
            throw r3     // Catch: java.io.IOException -> L23 org.xmlpull.v1.XmlPullParserException -> L25
        L4b:
            android.content.res.Resources$NotFoundException r5 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't load badge resource ID #0x"
            r0.append(r1)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            r5.initCause(r3)
            throw r5
    }

    public static void setOutlineToPath(@Yue.InterfaceC4410 android.graphics.Outline r2, @Yue.InterfaceC4410 android.graphics.Path r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            com.google.android.material.drawable.DrawableUtils.OutlineCompatR.setPath(r2, r3)
            goto L1b
        La:
            r1 = 29
            if (r0 < r1) goto L12
            com.google.android.material.drawable.DrawableUtils.OutlineCompatL.setConvexPath(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L1b
            goto L1b
        L12:
            boolean r0 = r3.isConvex()
            if (r0 == 0) goto L1b
            com.google.android.material.drawable.DrawableUtils.OutlineCompatL.setConvexPath(r2, r3)
        L1b:
            return
    }

    @android.annotation.TargetApi(21)
    public static void setRippleDrawableRadius(@Yue.InterfaceC4544 android.graphics.drawable.RippleDrawable r0, int r1) {
            r0.setRadius(r1)
            return
    }

    public static void setTint(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r1, @Yue.InterfaceC1230 int r2) {
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto Lb
            Yue.C1995.m9231(r1, r2)
            goto Lf
        Lb:
            r2 = 0
            Yue.C1995.m9232(r1, r2)
        Lf:
            return
    }

    @Yue.InterfaceC4544
    public static android.graphics.PorterDuffColorFilter updateTintFilter(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r1, @Yue.InterfaceC4544 android.content.res.ColorStateList r2, @Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r3) {
            if (r2 == 0) goto L14
            if (r3 != 0) goto L5
            goto L14
        L5:
            int[] r1 = r1.getState()
            r0 = 0
            int r1 = r2.getColorForState(r1, r0)
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r1, r3)
            return r2
        L14:
            r1 = 0
            return r1
    }
}
