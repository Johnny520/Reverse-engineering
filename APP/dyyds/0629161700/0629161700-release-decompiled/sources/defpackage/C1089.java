package defpackage;

/* JADX INFO: renamed from: ᛶᛶᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1089 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ android.widget.TextView f4883;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ float f4884;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int[] f4885;

    public /* synthetic */ C1089(float r1, int[] r2, android.widget.TextView r3) {
            r0 = this;
            r0.<init>()
            r0.f4884 = r1
            r0.f4885 = r2
            r0.f4883 = r3
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r9) {
            r8 = this;
            r0 = -444138557709870(0xfffe6c0eef0961d2, double:NaN)
            java.lang.Object r9 = r9.getAnimatedValue()
            r0 = -444181507382830(0xfffe6c04ef0961d2, double:NaN)
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            float r1 = -r9
            float r2 = r8.f4884
            float r3 = r2 - r9
            r6 = 0
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.CLAMP
            r2 = 0
            r4 = 0
            int[] r5 = r8.f4885
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            android.widget.TextView r8 = r8.f4883
            android.text.TextPaint r9 = r8.getPaint()
            r9.setShader(r0)
            r8.invalidate()
            return
    }
}
