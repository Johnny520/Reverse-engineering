package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f0 {
    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction A() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT
            return r0
    }

    public static /* bridge */ /* synthetic */ void B(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setSystemGestureInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ int C(android.graphics.Insets r0) {
            int r0 = r0.bottom
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction D() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT
            return r0
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

    public static /* bridge */ /* synthetic */ android.text.TextDirectionHeuristic f(android.widget.TextView r0) {
            android.text.TextDirectionHeuristic r0 = r0.getTextDirectionHeuristic()
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

    public static /* bridge */ /* synthetic */ void i(android.app.Activity r0, p00.a r1) {
            r0.registerActivityLifecycleCallbacks(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void j(android.graphics.drawable.GradientDrawable r0, int r1, int r2, int r3, int r4) {
            r0.setPadding(r1, r2, r3, r4)
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.view.View r0, float r1) {
            r0.setTransitionAlpha(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void l(android.view.View r0, int r1) {
            r0.setTransitionVisibility(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.view.View r0, int r1, int r2, int r3, int r4) {
            r0.setLeftTopRightBottom(r1, r2, r3, r4)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.view.View r0, android.graphics.Matrix r1) {
            r0.transformMatrixToGlobal(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.view.ViewGroup r0, boolean r1) {
            r0.suppressLayout(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setSystemWindowInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void q(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.content.Context r8, int[] r9, android.util.AttributeSet r10, android.content.res.TypedArray r11) {
            r5 = 2130968881(0x7f040131, float:1.7546428E38)
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
            return
    }

    public static /* bridge */ /* synthetic */ void r(androidx.recyclerview.widget.RecyclerView r7, android.content.Context r8, int[] r9, android.util.AttributeSet r10, android.content.res.TypedArray r11, int r12) {
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

    public static /* bridge */ /* synthetic */ boolean s() {
            boolean r0 = android.os.Trace.isEnabled()
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean t(android.graphics.drawable.Drawable r0) {
            boolean r0 = r0 instanceof android.graphics.drawable.ColorStateListDrawable
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean u(android.widget.TextView r0) {
            boolean r0 = r0.isHorizontallyScrollable()
            return r0
    }

    public static /* bridge */ /* synthetic */ int v(android.graphics.Insets r0) {
            int r0 = r0.top
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction w() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN
            return r0
    }

    public static /* bridge */ /* synthetic */ void x(android.view.View r0, android.graphics.Matrix r1) {
            r0.transformMatrixToLocal(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void y(android.view.WindowInsets.Builder r0, android.graphics.Insets r1) {
            r0.setStableInsets(r1)
            return
    }

    public static /* bridge */ /* synthetic */ int z(android.graphics.Insets r0) {
            int r0 = r0.right
            return r0
    }
}
