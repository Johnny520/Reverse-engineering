package ai;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ boolean A(android.text.StaticLayout r0) {
            boolean r0 = r0.isFallbackLineSpacingEnabled()
            return r0
    }

    public static /* bridge */ /* synthetic */ byte[] B(java.io.BufferedInputStream r0) {
            byte[] r0 = r0.readAllBytes()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.text.LineBreakConfig.Builder C(android.graphics.text.LineBreakConfig.Builder r0, int r1) {
            android.graphics.text.LineBreakConfig$Builder r0 = r0.setLineBreakWordStyle(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.EditorBoundsInfo.Builder D(android.view.inputmethod.EditorBoundsInfo.Builder r0, android.graphics.RectF r1) {
            android.view.inputmethod.EditorBoundsInfo$Builder r0 = r0.setHandwritingBounds(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.pm.PackageInfo a(android.content.pm.PackageManager r0, java.lang.String r1, android.content.pm.PackageManager.PackageInfoFlags r2) {
            android.content.pm.PackageInfo r0 = r0.getPackageArchiveInfo(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.pm.PackageManager.PackageInfoFlags b(long r0) {
            android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.pm.PackageManager.ResolveInfoFlags c() {
            r0 = 131072(0x20000, double:6.4758E-319)
            android.content.pm.PackageManager$ResolveInfoFlags r0 = android.content.pm.PackageManager.ResolveInfoFlags.of(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RenderEffect d(android.graphics.RuntimeShader r0, java.lang.String r1) {
            android.graphics.RenderEffect r0 = android.graphics.RenderEffect.createRuntimeShaderEffect(r0, r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RuntimeShader e(java.lang.Object r0) {
            android.graphics.RuntimeShader r0 = (android.graphics.RuntimeShader) r0
            return r0
    }

    public static /* synthetic */ android.graphics.text.LineBreakConfig.Builder f() {
            android.graphics.text.LineBreakConfig$Builder r0 = new android.graphics.text.LineBreakConfig$Builder
            r0.<init>()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.text.LineBreakConfig.Builder g(android.graphics.text.LineBreakConfig.Builder r0, int r1) {
            android.graphics.text.LineBreakConfig$Builder r0 = r0.setLineBreakStyle(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.text.LineBreakConfig h(android.graphics.text.LineBreakConfig.Builder r0) {
            android.graphics.text.LineBreakConfig r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.text.BoringLayout.Metrics i(java.lang.CharSequence r2, android.text.TextPaint r3, android.text.TextDirectionHeuristic r4) {
            r0 = 1
            r1 = 0
            android.text.BoringLayout$Metrics r2 = android.text.BoringLayout.isBoring(r2, r3, r4, r0, r1)
            return r2
    }

    public static /* synthetic */ android.text.BoringLayout j(java.lang.CharSequence r12, android.text.TextPaint r13, int r14, android.text.Layout.Alignment r15, android.text.BoringLayout.Metrics r16, boolean r17, android.text.TextUtils.TruncateAt r18, int r19) {
            android.text.BoringLayout r0 = new android.text.BoringLayout
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r11 = 1
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction k() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.CursorAnchorInfo.Builder l(android.view.inputmethod.CursorAnchorInfo.Builder r0, android.view.inputmethod.EditorBoundsInfo r1) {
            android.view.inputmethod.CursorAnchorInfo$Builder r0 = r0.setEditorBoundsInfo(r1)
            return r0
    }

    public static /* synthetic */ android.view.inputmethod.EditorBoundsInfo.Builder m() {
            android.view.inputmethod.EditorBoundsInfo$Builder r0 = new android.view.inputmethod.EditorBoundsInfo$Builder
            r0.<init>()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.EditorBoundsInfo.Builder n(android.view.inputmethod.EditorBoundsInfo.Builder r0, android.graphics.RectF r1) {
            android.view.inputmethod.EditorBoundsInfo$Builder r0 = r0.setEditorBounds(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.EditorBoundsInfo o(android.view.inputmethod.EditorBoundsInfo.Builder r0) {
            android.view.inputmethod.EditorBoundsInfo r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedDispatcher p(y2.v r0) {
            android.window.OnBackInvokedDispatcher r0 = r0.getOnBackInvokedDispatcher()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List q(android.content.pm.PackageManager r0, android.content.Intent r1, android.content.pm.PackageManager.ResolveInfoFlags r2) {
            java.util.List r0 = r0.queryIntentServices(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ void r(android.graphics.RuntimeShader r6, float r7, float r8, float r9, float r10) {
            java.lang.String r1 = "cornerRadii"
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.setFloatUniform(r1, r2, r3, r4, r5)
            return
    }

    public static /* bridge */ /* synthetic */ void s(android.graphics.RuntimeShader r0, java.lang.String r1, float r2) {
            r0.setFloatUniform(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.graphics.RuntimeShader r0, java.lang.String r1, float r2, float r3) {
            r0.setFloatUniform(r1, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.graphics.RuntimeShader r0, java.lang.String r1, float r2, float r3, float r4) {
            r0.setFloatUniform(r1, r2, r3, r4)
            return
    }

    public static /* bridge */ /* synthetic */ void v(android.graphics.RuntimeShader r0, java.lang.String r1, int r2) {
            r0.setColorUniform(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void w(android.graphics.RuntimeShader r0, java.lang.String r1, float[] r2) {
            r0.setFloatUniform(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void x(android.text.StaticLayout.Builder r0, android.graphics.text.LineBreakConfig r1) {
            r0.setLineBreakConfig(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void y(android.view.inputmethod.InputMethodManager r0, android.view.View r1) {
            r0.startStylusHandwriting(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean z(android.text.BoringLayout r0) {
            boolean r0 = r0.isFallbackLineSpacingEnabled()
            return r0
    }
}
