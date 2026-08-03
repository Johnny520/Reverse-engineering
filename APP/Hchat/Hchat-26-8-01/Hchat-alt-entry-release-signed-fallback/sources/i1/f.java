package i1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ void A(android.graphics.RenderNode r1) {
            r0 = 0
            r1.setRotationY(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void B(android.graphics.RenderNode r0, float r1) {
            r0.setTranslationX(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void C(android.graphics.RenderNode r0, float r1) {
            r0.setRotationZ(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void D(android.graphics.RenderNode r0, float r1) {
            r0.setTranslationY(r1)
            return
    }

    public static /* synthetic */ android.graphics.RenderNode a() {
            android.graphics.RenderNode r0 = new android.graphics.RenderNode
            java.lang.String r1 = "graphicsLayer"
            r0.<init>(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ void b(android.graphics.Canvas r0, int r1, android.graphics.BlendMode r2) {
            r0.drawColor(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void c(android.graphics.Canvas r0, android.graphics.RectF r1, float r2, float r3, android.graphics.RectF r4, float r5, float r6, android.graphics.Paint r7) {
            r0.drawDoubleRoundRect(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static /* bridge */ /* synthetic */ void d(android.graphics.Canvas r0, android.graphics.RectF r1, float[] r2, android.graphics.RectF r3, float[] r4, android.graphics.Paint r5) {
            r0.drawDoubleRoundRect(r1, r2, r3, r4, r5)
            return
    }

    public static /* bridge */ /* synthetic */ void e(android.graphics.Canvas r0, android.graphics.text.MeasuredText r1, int r2, int r3, int r4, int r5, float r6, float r7, boolean r8, android.graphics.Paint r9) {
            r0.drawTextRun(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static /* bridge */ /* synthetic */ void f(android.graphics.RenderNode r0) {
            r0.discardDisplayList()
            return
    }

    public static /* bridge */ /* synthetic */ void g(android.graphics.RenderNode r0, float r1) {
            r0.setAlpha(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void h(android.graphics.RenderNode r0, int r1) {
            r0.setAmbientShadowColor(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void i(android.graphics.RenderNode r0, int r1, int r2, int r3, int r4) {
            r0.setPosition(r1, r2, r3, r4)
            return
    }

    public static /* bridge */ /* synthetic */ void j(android.graphics.RenderNode r0, android.graphics.Matrix r1) {
            r0.getMatrix(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.graphics.RenderNode r0, android.graphics.Outline r1) {
            r0.setOutline(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void l(android.graphics.RenderNode r1, android.graphics.Paint r2) {
            r0 = 1
            r1.setUseCompositingLayer(r0, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.graphics.RenderNode r0, boolean r1) {
            r0.setClipToBounds(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean n(android.graphics.RenderNode r0) {
            boolean r0 = r0.hasDisplayList()
            return r0
    }

    public static /* bridge */ /* synthetic */ void o(android.graphics.RenderNode r1) {
            r0 = 1
            r1.setHasOverlappingRendering(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.graphics.RenderNode r0, float r1) {
            r0.setScaleX(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void q(android.graphics.RenderNode r0, int r1) {
            r0.setSpotShadowColor(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void r(android.graphics.RenderNode r1, android.graphics.Paint r2) {
            r0 = 0
            r1.setUseCompositingLayer(r0, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void s(android.graphics.RenderNode r1) {
            r0 = 0
            r1.setHasOverlappingRendering(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.graphics.RenderNode r0, float r1) {
            r0.setElevation(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.graphics.RenderNode r1) {
            r0 = 0
            r1.setRotationX(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void v(android.graphics.RenderNode r0, float r1) {
            r0.setPivotX(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void w(android.graphics.RenderNode r0) {
            r0.resetPivot()
            return
    }

    public static /* bridge */ /* synthetic */ void x(android.graphics.RenderNode r0, float r1) {
            r0.setPivotY(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void y(android.graphics.RenderNode r1) {
            r0 = 0
            r1.setClipToBounds(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void z(android.graphics.RenderNode r0, float r1) {
            r0.setCameraDistance(r1)
            return
    }
}
