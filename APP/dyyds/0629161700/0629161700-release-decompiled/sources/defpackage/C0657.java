package defpackage;

/* JADX INFO: renamed from: ᛴᛴᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0657 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f3184;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public android.content.res.ColorStateList f3185;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final android.graphics.Paint f3186;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public android.content.res.ColorStateList f3187;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public android.graphics.drawable.GradientDrawable f3188;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f3189;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public android.graphics.drawable.GradientDrawable f3190;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f3191;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f3192;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C2152 f3193;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public android.content.res.ColorStateList f3194;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public android.graphics.drawable.GradientDrawable f3195;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f3196;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f3197;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public boolean f3198;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f3199;

    public C0657(defpackage.C2152 r3) {
            r2 = this;
            r2.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r2.f3186 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r0 = 0
            r2.f3198 = r0
            r2.f3193 = r3
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0151 m1486() {
            r12 = this;
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r12.f3190 = r0
            int r1 = r12.f3197
            float r1 = (float) r1
            r2 = 925353388(0x3727c5ac, float:1.0E-5)
            float r1 = r1 + r2
            r0.setCornerRadius(r1)
            android.graphics.drawable.GradientDrawable r0 = r12.f3190
            r1 = -1
            r0.setColor(r1)
            r12.m1487()
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r12.f3195 = r0
            int r3 = r12.f3197
            float r3 = (float) r3
            float r3 = r3 + r2
            r0.setCornerRadius(r3)
            android.graphics.drawable.GradientDrawable r0 = r12.f3195
            r3 = 0
            r0.setColor(r3)
            android.graphics.drawable.GradientDrawable r0 = r12.f3195
            int r4 = r12.f3199
            android.content.res.ColorStateList r5 = r12.f3194
            r0.setStroke(r4, r5)
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.GradientDrawable r0 = r12.f3190
            android.graphics.drawable.GradientDrawable r4 = r12.f3195
            r5 = 2
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r5]
            r6[r3] = r0
            r0 = 1
            r6[r0] = r4
            r7.<init>(r6)
            android.graphics.drawable.InsetDrawable r6 = new android.graphics.drawable.InsetDrawable
            int r8 = r12.f3196
            int r9 = r12.f3191
            int r10 = r12.f3192
            int r11 = r12.f3189
            r6.<init>(r7, r8, r9, r10, r11)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r12.f3188 = r0
            int r4 = r12.f3197
            float r4 = (float) r4
            float r4 = r4 + r2
            r0.setCornerRadius(r4)
            android.graphics.drawable.GradientDrawable r0 = r12.f3188
            r0.setColor(r1)
            ᛱᛸᲀᛷ r0 = new ᛱᛸᲀᛷ
            android.content.res.ColorStateList r1 = r12.f3185
            int[] r2 = defpackage.AbstractC2193.f9301
            int[] r4 = defpackage.AbstractC2193.f9302
            if (r1 == 0) goto L7b
            int r7 = r1.getDefaultColor()
            int r4 = r1.getColorForState(r4, r7)
            goto L7c
        L7b:
            r4 = r3
        L7c:
            int r7 = android.graphics.Color.alpha(r4)
            int r7 = r7 * r5
            r8 = 255(0xff, float:3.57E-43)
            int r7 = java.lang.Math.min(r7, r8)
            int r9 = defpackage.AbstractC2116.f9069
            r9 = 0
            java.lang.String r10 = "alpha must be between 0 and 255."
            if (r7 < 0) goto Lcd
            if (r7 > r8) goto Lcd
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r11
            int r7 = r7 << 24
            r4 = r4 | r7
            int[] r7 = android.util.StateSet.NOTHING
            int[][] r2 = new int[][]{r2, r7}
            int[] r7 = defpackage.AbstractC2193.f9304
            if (r1 == 0) goto La9
            int r3 = r1.getDefaultColor()
            int r3 = r1.getColorForState(r7, r3)
        La9:
            int r1 = android.graphics.Color.alpha(r3)
            int r1 = r1 * r5
            int r1 = java.lang.Math.min(r1, r8)
            if (r1 < 0) goto Lc9
            if (r1 > r8) goto Lc9
            r3 = r3 & r11
            int r1 = r1 << 24
            r1 = r1 | r3
            int[] r1 = new int[]{r4, r1}
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            r3.<init>(r2, r1)
            android.graphics.drawable.GradientDrawable r12 = r12.f3188
            r0.<init>(r3, r6, r12)
            return r0
        Lc9:
            defpackage.C2264.m3684(r10)
            return r9
        Lcd:
            defpackage.C2264.m3684(r10)
            return r9
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m1487() {
            r2 = this;
            android.graphics.drawable.GradientDrawable r0 = r2.f3190
            if (r0 == 0) goto L12
            android.content.res.ColorStateList r1 = r2.f3187
            r0.setTintList(r1)
            android.graphics.PorterDuff$Mode r0 = r2.f3184
            if (r0 == 0) goto L12
            android.graphics.drawable.GradientDrawable r2 = r2.f3190
            r2.setTintMode(r0)
        L12:
            return
    }
}
