package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6477 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m23871(android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1) {
            boolean r0 = r0.hasValue(r1)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attribute not defined in set."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean m23872(@Yue.InterfaceC4418 android.content.res.TypedArray r1, @Yue.InterfaceC6031 int r2) {
            m23871(r1, r2)
            r0 = 0
            boolean r1 = r1.getBoolean(r2, r0)
            return r1
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m23873(@Yue.InterfaceC4418 android.content.res.TypedArray r1, @Yue.InterfaceC6031 int r2) {
            m23871(r1, r2)
            r0 = 0
            int r1 = r1.getColor(r2, r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final android.content.res.ColorStateList m23874(@Yue.InterfaceC4418 android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1) {
            m23871(r0, r1)
            android.content.res.ColorStateList r0 = r0.getColorStateList(r1)
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attribute value was not a color or color state list."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final float m23875(@Yue.InterfaceC4418 android.content.res.TypedArray r1, @Yue.InterfaceC6031 int r2) {
            m23871(r1, r2)
            r0 = 0
            float r1 = r1.getDimension(r2, r0)
            return r1
    }

    @Yue.InterfaceC1849
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m23876(@Yue.InterfaceC4418 android.content.res.TypedArray r1, @Yue.InterfaceC6031 int r2) {
            m23871(r1, r2)
            r0 = 0
            int r1 = r1.getDimensionPixelOffset(r2, r0)
            return r1
    }

    @Yue.InterfaceC1849
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m23877(@Yue.InterfaceC4418 android.content.res.TypedArray r1, @Yue.InterfaceC6031 int r2) {
            m23871(r1, r2)
            r0 = 0
            int r1 = r1.getDimensionPixelSize(r2, r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final android.graphics.drawable.Drawable m23878(@Yue.InterfaceC4418 android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1) {
            m23871(r0, r1)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            Yue.C3329.m13903(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final float m23879(@Yue.InterfaceC4418 android.content.res.TypedArray r1, @Yue.InterfaceC6031 int r2) {
            m23871(r1, r2)
            r0 = 0
            float r1 = r1.getFloat(r2, r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(26)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final android.graphics.Typeface m23880(@Yue.InterfaceC4418 android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1) {
            m23871(r0, r1)
            android.graphics.Typeface r0 = Yue.C6476.m23870(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int m23881(@Yue.InterfaceC4418 android.content.res.TypedArray r1, @Yue.InterfaceC6031 int r2) {
            m23871(r1, r2)
            r0 = 0
            int r1 = r1.getInt(r2, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int m23882(@Yue.InterfaceC4418 android.content.res.TypedArray r1, @Yue.InterfaceC6031 int r2) {
            m23871(r1, r2)
            r0 = 0
            int r1 = r1.getInteger(r2, r0)
            return r1
    }

    @Yue.InterfaceC0411
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int m23883(@Yue.InterfaceC4418 android.content.res.TypedArray r1, @Yue.InterfaceC6031 int r2) {
            m23871(r1, r2)
            r0 = 0
            int r1 = r1.getResourceId(r2, r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final java.lang.String m23884(@Yue.InterfaceC4418 android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1) {
            m23871(r0, r1)
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attribute value could not be coerced to String."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final java.lang.CharSequence[] m23885(@Yue.InterfaceC4418 android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1) {
            m23871(r0, r1)
            java.lang.CharSequence[] r0 = r0.getTextArray(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final java.lang.CharSequence m23886(@Yue.InterfaceC4418 android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1) {
            m23871(r0, r1)
            java.lang.CharSequence r0 = r0.getText(r1)
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Attribute value could not be coerced to CharSequence."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <R> R m23887(@Yue.InterfaceC4418 android.content.res.TypedArray r0, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.content.res.TypedArray, ? extends R> r1) {
            java.lang.Object r1 = r1.invoke(r0)
            r0.recycle()
            return r1
    }
}
