package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E {
    public static /* bridge */ /* synthetic */ int A(android.graphics.Insets r0) {
            int r0 = r0.bottom
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction B() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT
            return r0
    }

    public static /* bridge */ /* synthetic */ void C(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setMandatorySystemGestureInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void D(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setTappableElementInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ float a(android.view.View r0) {
            float r0 = r0.getTransitionAlpha()
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(android.graphics.Insets r0) {
            int r0 = r0.left
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.res.ColorStateList c(android.graphics.drawable.ColorStateListDrawable r0) {
            android.content.res.ColorStateList r0 = r0.getColorStateList()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.drawable.ColorStateListDrawable d(android.graphics.drawable.Drawable r0) {
            android.graphics.drawable.ColorStateListDrawable r0 = (android.graphics.drawable.ColorStateListDrawable) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.drawable.Drawable e(android.widget.EditText r0) {
            android.graphics.drawable.Drawable r0 = r0.getTextCursorDrawable()
            return r0
    }

    public static /* synthetic */ android.view.WindowInsets.Builder f() {
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets g(android.view.WindowInsets.Builder r0) {
            android.view.WindowInsets r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction h() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP
            return r0
    }

    public static /* bridge */ /* synthetic */ void i(android.app.Activity r0, androidx.lifecycle.l.b r1) {
            r0.registerActivityLifecycleCallbacks(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void j(android.view.View r0, float r1) {
            r0.setTransitionAlpha(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.view.View r0, int r1) {
            r0.setTransitionVisibility(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void l(android.view.View r0, int r1, int r2, int r3, int r4) {
            r0.setLeftTopRightBottom(r1, r2, r3, r4)
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.view.View r0, android.graphics.Matrix r1) {
            r0.setAnimationMatrix(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setSystemWindowInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void o(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.content.Context r8, int[] r9, android.util.AttributeSet r10, android.content.res.TypedArray r11, int r12) {
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
            return
    }

    public static /* bridge */ /* synthetic */ boolean p() {
            boolean r0 = android.os.Trace.isEnabled()
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean q(android.graphics.drawable.Drawable r0) {
            boolean r0 = r0 instanceof android.graphics.drawable.ColorStateListDrawable
            return r0
    }

    public static /* bridge */ /* synthetic */ int r(android.graphics.Insets r0) {
            int r0 = r0.top
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction s() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN
            return r0
    }

    public static /* bridge */ /* synthetic */ void t(android.view.View r0, android.graphics.Matrix r1) {
            r0.transformMatrixToGlobal(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setStableInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void v(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.content.Context r8, int[] r9, android.util.AttributeSet r10, android.content.res.TypedArray r11, int r12) {
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
            return
    }

    public static /* bridge */ /* synthetic */ int w(android.graphics.Insets r0) {
            int r0 = r0.right
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction x() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT
            return r0
    }

    public static /* bridge */ /* synthetic */ void y(android.view.View r0, android.graphics.Matrix r1) {
            r0.transformMatrixToLocal(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void z(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setSystemGestureInsets(r1)
            return
    }
}
