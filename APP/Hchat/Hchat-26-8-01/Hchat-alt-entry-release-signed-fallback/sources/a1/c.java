package a1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ void A(android.view.View r0, android.graphics.RenderEffect r1) {
            r0.setRenderEffect(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void B(android.view.View r0, android.view.translation.ViewTranslationCallback r1) {
            r0.setViewTranslationCallback(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void C(android.view.textclassifier.TextSelection.Request.Builder r1) {
            r0 = 1
            r1.setIncludeTextClassification(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void D(android.view.translation.ViewTranslationRequest.Builder r1, android.view.translation.TranslationRequestValue r2) {
            java.lang.String r0 = "android:text"
            r1.setValue(r0, r2)
            return
    }

    public static /* bridge */ /* synthetic */ int a(android.content.res.Configuration r0) {
            int r0 = r0.fontWeightAdjustment
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(android.view.RoundedCorner r0) {
            int r0 = r0.getRadius()
            return r0
    }

    public static /* bridge */ /* synthetic */ int c(java.math.BigInteger r0) {
            int r0 = r0.intValueExact()
            return r0
    }

    public static /* bridge */ /* synthetic */ long d(java.math.BigInteger r2) {
            long r0 = r2.longValueExact()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RenderEffect e() {
            r0 = 0
            android.graphics.RenderEffect r0 = android.graphics.RenderEffect.createOffsetEffect(r0, r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RenderEffect f(float r0, float r1, android.graphics.Shader.TileMode r2) {
            android.graphics.RenderEffect r0 = android.graphics.RenderEffect.createBlurEffect(r0, r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RenderEffect g(android.graphics.RenderEffect r0, android.graphics.RenderEffect r1) {
            android.graphics.RenderEffect r0 = android.graphics.RenderEffect.createChainEffect(r0, r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Shader.TileMode h() {
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.DECAL
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.RoundedCorner i(android.view.WindowInsets r1) {
            r0 = 3
            android.view.RoundedCorner r1 = r1.getRoundedCorner(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ android.view.ScrollCaptureSession j(java.lang.Object r0) {
            android.view.ScrollCaptureSession r0 = (android.view.ScrollCaptureSession) r0
            return r0
    }

    public static /* synthetic */ android.view.ScrollCaptureTarget k(y1.t r1, android.graphics.Rect r2, android.graphics.Point r3, android.view.ScrollCaptureCallback r4) {
            android.view.ScrollCaptureTarget r0 = new android.view.ScrollCaptureTarget
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.Surface l(android.view.ScrollCaptureSession r0) {
            android.view.Surface r0 = r0.getSurface()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassification m(android.view.textclassifier.TextSelection r0) {
            android.view.textclassifier.TextClassification r0 = r0.getTextClassification()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.translation.TranslationRequestValue n(i2.g r0) {
            android.view.translation.TranslationRequestValue r0 = android.view.translation.TranslationRequestValue.forText(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.translation.TranslationResponseValue o(android.view.translation.ViewTranslationResponse r1) {
            java.lang.String r0 = "android:text"
            android.view.translation.TranslationResponseValue r1 = r1.getValue(r0)
            return r1
    }

    public static /* synthetic */ android.view.translation.ViewTranslationRequest.Builder p(android.view.autofill.AutofillId r1, long r2) {
            android.view.translation.ViewTranslationRequest$Builder r0 = new android.view.translation.ViewTranslationRequest$Builder
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.translation.ViewTranslationRequest q(android.view.translation.ViewTranslationRequest.Builder r0) {
            android.view.translation.ViewTranslationRequest r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.translation.ViewTranslationResponse r(java.lang.Object r0) {
            android.view.translation.ViewTranslationResponse r0 = (android.view.translation.ViewTranslationResponse) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.CharSequence s(android.view.translation.TranslationResponseValue r0) {
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    public static /* synthetic */ void t() {
            android.view.translation.ViewTranslationRequest$Builder r0 = new android.view.translation.ViewTranslationRequest$Builder
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.graphics.Canvas r0, android.graphics.NinePatch r1, android.graphics.Rect r2, android.graphics.Paint r3) {
            r0.drawPatch(r1, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void v(android.graphics.Canvas r0, android.graphics.NinePatch r1, android.graphics.RectF r2, android.graphics.Paint r3) {
            r0.drawPatch(r1, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void w(android.graphics.Canvas r0, int[] r1, int r2, float[] r3, int r4, int r5, android.graphics.fonts.Font r6, android.graphics.Paint r7) {
            r0.drawGlyphs(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static /* bridge */ /* synthetic */ void x(android.graphics.RenderNode r0, android.graphics.RenderEffect r1) {
            r0.setRenderEffect(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void y(android.view.ScrollCaptureTarget r0, android.graphics.Rect r1) {
            r0.setScrollBounds(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void z(android.view.View r0) {
            r0.clearViewTranslationCallback()
            return
    }
}
