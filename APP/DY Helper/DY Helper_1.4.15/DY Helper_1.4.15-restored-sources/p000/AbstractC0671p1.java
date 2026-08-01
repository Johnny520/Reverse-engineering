package p000;

/* JADX INFO: renamed from: p1 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0671p1 {
    /* JADX INFO: renamed from: Α */
    public static /* bridge */ /* synthetic */ void m4347(android.view.ContentInfo.Builder r0, android.os.Bundle r1) {
            r0.setExtras(r1)
            return
    }

    /* JADX INFO: renamed from: Β */
    public static /* bridge */ /* synthetic */ void m4348(android.view.View r0) {
            r0.clearViewTranslationCallback()
            return
    }

    /* JADX INFO: renamed from: Γ */
    public static /* bridge */ /* synthetic */ void m4349(android.view.View r0, android.view.translation.ViewTranslationCallback r1) {
            r0.setViewTranslationCallback(r1)
            return
    }

    /* JADX INFO: renamed from: Δ */
    public static /* bridge */ /* synthetic */ void m4350(android.view.translation.ViewTranslationRequest.Builder r1, android.view.translation.TranslationRequestValue r2) {
            java.lang.String r0 = "android:text"
            r1.setValue(r0, r2)
            return
    }

    /* JADX INFO: renamed from: Ε */
    public static /* bridge */ /* synthetic */ boolean m4351(java.lang.Object r0) {
            boolean r0 = r0 instanceof android.os.VibratorManager
            return r0
    }

    /* JADX INFO: renamed from: Ζ */
    public static /* bridge */ /* synthetic */ int m4352(android.view.ContentInfo r0) {
            int r0 = r0.getSource()
            return r0
    }

    /* JADX INFO: renamed from: α */
    public static /* bridge */ /* synthetic */ int m4353(android.content.res.Configuration r0) {
            int r0 = r0.fontWeightAdjustment
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static /* bridge */ /* synthetic */ int m4354(android.view.ContentInfo r0) {
            int r0 = r0.getFlags()
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static /* bridge */ /* synthetic */ android.content.ClipData m4355(android.view.ContentInfo r0) {
            android.content.ClipData r0 = r0.getClip()
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static /* bridge */ /* synthetic */ android.graphics.RenderEffect m4356() {
            r0 = 0
            android.graphics.RenderEffect r0 = android.graphics.RenderEffect.createOffsetEffect(r0, r0)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static /* bridge */ /* synthetic */ android.graphics.RenderEffect m4357(float r0, float r1, android.graphics.Shader.TileMode r2) {
            android.graphics.RenderEffect r0 = android.graphics.RenderEffect.createBlurEffect(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static /* bridge */ /* synthetic */ android.graphics.RenderEffect m4358(android.graphics.RenderEffect r0, android.graphics.RenderEffect r1) {
            android.graphics.RenderEffect r0 = android.graphics.RenderEffect.createChainEffect(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static /* bridge */ /* synthetic */ android.os.Vibrator m4359(android.os.VibratorManager r0) {
            android.os.Vibrator r0 = r0.getDefaultVibrator()
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static /* bridge */ /* synthetic */ android.os.VibratorManager m4360(java.lang.Object r0) {
            android.os.VibratorManager r0 = (android.os.VibratorManager) r0
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static /* synthetic */ android.view.ContentInfo.Builder m4361(android.content.ClipData r1, int r2) {
            android.view.ContentInfo$Builder r0 = new android.view.ContentInfo$Builder
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static /* bridge */ /* synthetic */ android.view.ContentInfo m4362(android.view.ContentInfo.Builder r0) {
            android.view.ContentInfo r0 = r0.build()
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static /* bridge */ /* synthetic */ android.view.ContentInfo m4363(java.lang.Object r0) {
            android.view.ContentInfo r0 = (android.view.ContentInfo) r0
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static /* bridge */ /* synthetic */ android.view.translation.TranslationRequestValue m4364(p000.C0309g4 r0) {
            android.view.translation.TranslationRequestValue r0 = android.view.translation.TranslationRequestValue.forText(r0)
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public static /* bridge */ /* synthetic */ android.view.translation.TranslationResponseValue m4365(android.view.translation.ViewTranslationResponse r1) {
            java.lang.String r0 = "android:text"
            android.view.translation.TranslationResponseValue r1 = r1.getValue(r0)
            return r1
    }

    /* JADX INFO: renamed from: ξ */
    public static /* synthetic */ android.view.translation.ViewTranslationRequest.Builder m4366(android.view.autofill.AutofillId r1, long r2) {
            android.view.translation.ViewTranslationRequest$Builder r0 = new android.view.translation.ViewTranslationRequest$Builder
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static /* bridge */ /* synthetic */ android.view.translation.ViewTranslationRequest m4367(android.view.translation.ViewTranslationRequest.Builder r0) {
            android.view.translation.ViewTranslationRequest r0 = r0.build()
            return r0
    }

    /* JADX INFO: renamed from: π */
    public static /* bridge */ /* synthetic */ android.view.translation.ViewTranslationResponse m4368(java.lang.Object r0) {
            android.view.translation.ViewTranslationResponse r0 = (android.view.translation.ViewTranslationResponse) r0
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public static /* bridge */ /* synthetic */ java.lang.CharSequence m4369(android.view.translation.TranslationResponseValue r0) {
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static /* synthetic */ void m4370() {
            android.view.translation.ViewTranslationRequest$Builder r0 = new android.view.translation.ViewTranslationRequest$Builder
            return
    }

    /* JADX INFO: renamed from: τ */
    public static /* bridge */ /* synthetic */ void m4371(android.graphics.Canvas r0, android.graphics.NinePatch r1, android.graphics.Rect r2, android.graphics.Paint r3) {
            r0.drawPatch(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: υ */
    public static /* bridge */ /* synthetic */ void m4372(android.graphics.Canvas r0, android.graphics.NinePatch r1, android.graphics.RectF r2, android.graphics.Paint r3) {
            r0.drawPatch(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: φ */
    public static /* bridge */ /* synthetic */ void m4373(android.graphics.Canvas r0, int[] r1, int r2, float[] r3, int r4, int r5, android.graphics.fonts.Font r6, android.graphics.Paint r7) {
            r0.drawGlyphs(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: χ */
    public static /* bridge */ /* synthetic */ void m4374(android.graphics.RenderNode r0, android.graphics.RenderEffect r1) {
            r0.setRenderEffect(r1)
            return
    }

    /* JADX INFO: renamed from: ψ */
    public static /* bridge */ /* synthetic */ void m4375(android.view.ContentInfo.Builder r0, int r1) {
            r0.setFlags(r1)
            return
    }

    /* JADX INFO: renamed from: ω */
    public static /* bridge */ /* synthetic */ void m4376(android.view.ContentInfo.Builder r0, android.net.Uri r1) {
            r0.setLinkUri(r1)
            return
    }
}
