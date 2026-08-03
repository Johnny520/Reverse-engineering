package h3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ android.graphics.Typeface a(android.graphics.Typeface r0, int r1, boolean r2) {
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Handler b(android.os.Looper r0) {
            android.os.Handler r0 = android.os.Handler.createAsync(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction c() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.CharSequence d(android.view.accessibility.AccessibilityNodeInfo r0) {
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
    }

    public static /* bridge */ /* synthetic */ void e(android.content.ClipboardManager r0) {
            r0.clearPrimaryClip()
            return
    }

    public static /* bridge */ /* synthetic */ void f(android.text.StaticLayout.Builder r1) {
            r0 = 1
            r1.setUseLineSpacingFromFallbacks(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void g(android.view.View r0) {
            r0.resetPivot()
            return
    }

    public static /* bridge */ /* synthetic */ void h(android.view.View r0, int r1) {
            r0.setOutlineSpotShadowColor(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void i(android.view.ViewStructure r0, int r1) {
            r0.setMaxTextLength(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void j(android.view.accessibility.AccessibilityNodeInfo r0, java.lang.CharSequence r1) {
            r0.setPaneTitle(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.view.accessibility.AccessibilityNodeInfo r0, boolean r1) {
            r0.setHeading(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean l(java.lang.CharSequence r0) {
            boolean r0 = r0 instanceof android.text.PrecomputedText
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction m() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP
            return r0
    }

    public static /* bridge */ /* synthetic */ void n(android.view.View r0, int r1) {
            r0.setOutlineAmbientShadowColor(r1)
            return
    }
}
