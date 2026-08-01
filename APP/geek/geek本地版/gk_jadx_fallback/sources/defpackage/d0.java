package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d0 {
    public static /* bridge */ /* synthetic */ int A() {
            int r0 = android.view.WindowInsets.Type.ime()
            return r0
    }

    public static /* bridge */ /* synthetic */ int B() {
            int r0 = android.view.WindowInsets.Type.systemGestures()
            return r0
    }

    public static /* bridge */ /* synthetic */ int C() {
            int r0 = android.view.WindowInsets.Type.mandatorySystemGestures()
            return r0
    }

    public static /* bridge */ /* synthetic */ int D() {
            int r0 = android.view.WindowInsets.Type.tappableElement()
            return r0
    }

    public static /* bridge */ /* synthetic */ float a(android.view.WindowInsetsAnimation r0) {
            float r0 = r0.getInterpolatedFraction()
            return r0
    }

    public static /* bridge */ /* synthetic */ int b() {
            int r0 = android.view.WindowInsets.Type.statusBars()
            return r0
    }

    public static /* bridge */ /* synthetic */ int c(android.view.WindowInsetsAnimation r0) {
            int r0 = r0.getTypeMask()
            return r0
    }

    public static /* bridge */ /* synthetic */ long d(android.view.WindowInsetsAnimation r2) {
            long r0 = r2.getDurationMillis()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets e(android.view.WindowInsets r0, int r1) {
            android.graphics.Insets r0 = r0.getInsets(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets f(android.view.WindowInsetsAnimation.Bounds r0) {
            android.graphics.Insets r0 = r0.getUpperBound()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets g() {
            android.view.WindowInsets r0 = android.view.WindowInsets.CONSUMED
            return r0
    }

    public static /* synthetic */ android.view.WindowInsetsAnimation.Bounds h(android.graphics.Insets r1, android.graphics.Insets r2) {
            android.view.WindowInsetsAnimation$Bounds r0 = new android.view.WindowInsetsAnimation$Bounds
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ android.view.WindowInsetsAnimation i(int r1, android.view.animation.Interpolator r2, long r3) {
            android.view.WindowInsetsAnimation r0 = new android.view.WindowInsetsAnimation
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsetsAnimation j(java.lang.Object r0) {
            android.view.WindowInsetsAnimation r0 = (android.view.WindowInsetsAnimation) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsetsController k(android.view.View r0) {
            android.view.WindowInsetsController r0 = r0.getWindowInsetsController()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction l() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD
            return r0
    }

    public static /* synthetic */ void m() {
            android.view.WindowInsetsAnimation$Bounds r0 = new android.view.WindowInsetsAnimation$Bounds
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.graphics.Outline r0, android.graphics.Path r1) {
            r0.setPath(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.view.View r0, defpackage.dc0 r1) {
            r0.setWindowInsetsAnimationCallback(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.view.Window r1) {
            r0 = 0
            r1.setDecorFitsSystemWindows(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void q(android.view.WindowInsets.Builder r0, int r1, android.graphics.Insets r2) {
            r0.setInsets(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void r(android.view.WindowInsetsAnimation r0, float r1) {
            r0.setFraction(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void s(android.view.WindowInsetsController r1, int r2) {
            r0 = 8
            r1.setSystemBarsAppearance(r2, r0)
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.view.accessibility.AccessibilityNodeInfo r0, java.lang.CharSequence r1) {
            r0.setStateDescription(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean u() {
            boolean r0 = android.os.Environment.isExternalStorageManager()
            return r0
    }

    public static /* bridge */ /* synthetic */ float v(android.view.WindowInsetsAnimation r0) {
            float r0 = r0.getFraction()
            return r0
    }

    public static /* bridge */ /* synthetic */ int w() {
            int r0 = android.view.WindowInsets.Type.navigationBars()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Insets x(android.view.WindowInsetsAnimation.Bounds r0) {
            android.graphics.Insets r0 = r0.getLowerBound()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction y() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER
            return r0
    }

    public static /* bridge */ /* synthetic */ int z() {
            int r0 = android.view.WindowInsets.Type.captionBar()
            return r0
    }
}
