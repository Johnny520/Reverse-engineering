package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction A() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT
            return r0
    }

    public static /* bridge */ /* synthetic */ void B(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setTappableElementInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendMode C() {
            android.graphics.BlendMode r0 = android.graphics.BlendMode.COLOR_DODGE
            return r0
    }

    public static /* bridge */ /* synthetic */ void D(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setStableInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ long a(y1.t r2) {
            long r0 = r2.getUniqueDrawingId()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendMode b() {
            android.graphics.BlendMode r0 = android.graphics.BlendMode.SCREEN
            return r0
    }

    public static /* synthetic */ android.graphics.BlendModeColorFilter c(int r1, android.graphics.BlendMode r2) {
            android.graphics.BlendModeColorFilter r0 = new android.graphics.BlendModeColorFilter
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets d(android.view.WindowInsets r0) {
            android.graphics.Insets r0 = r0.getTappableElementInsets()
            return r0
    }

    public static /* synthetic */ android.view.WindowInsets.Builder e() {
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>()
            return r0
    }

    public static /* synthetic */ android.view.WindowInsets.Builder f(android.view.WindowInsets r1) {
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets g(android.view.WindowInsets.Builder r0) {
            android.view.WindowInsets r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets h(android.view.WindowInsets r0, int r1, int r2, int r3, int r4) {
            android.view.WindowInsets r0 = r0.inset(r1, r2, r3, r4)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction i() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP
            return r0
    }

    public static /* synthetic */ void j() {
            android.graphics.BlendModeColorFilter r0 = new android.graphics.BlendModeColorFilter
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.graphics.Canvas r0) {
            r0.enableZ()
            return
    }

    public static /* bridge */ /* synthetic */ void l(android.graphics.Paint r0, android.graphics.BlendMode r1) {
            r0.setBlendMode(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.graphics.RenderNode r0, float r1) {
            r0.setScaleY(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.graphics.RenderNode r0, boolean r1) {
            r0.setClipToOutline(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setSystemWindowInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = 1
            r1.setTextEntryKey(r0)
            return
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendMode q() {
            android.graphics.BlendMode r0 = android.graphics.BlendMode.OVERLAY
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets r(android.view.WindowInsets r0) {
            android.graphics.Insets r0 = r0.getMandatorySystemGestureInsets()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction s() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN
            return r0
    }

    public static /* bridge */ /* synthetic */ void t(android.graphics.Canvas r0) {
            r0.disableZ()
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setSystemGestureInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendMode v() {
            android.graphics.BlendMode r0 = android.graphics.BlendMode.DARKEN
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets w(android.view.WindowInsets r0) {
            android.graphics.Insets r0 = r0.getSystemGestureInsets()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction x() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT
            return r0
    }

    public static /* bridge */ /* synthetic */ void y(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setMandatorySystemGestureInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendMode z() {
            android.graphics.BlendMode r0 = android.graphics.BlendMode.LIGHTEN
            return r0
    }
}
