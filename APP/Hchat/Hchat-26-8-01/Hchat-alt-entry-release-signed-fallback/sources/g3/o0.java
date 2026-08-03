package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o0 {
    public static /* bridge */ /* synthetic */ int a() {
            int r0 = android.view.WindowInsets.Type.displayCutout()
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(android.app.ApplicationExitInfo r0) {
            int r0 = r0.getPid()
            return r0
    }

    public static /* bridge */ /* synthetic */ long c(android.app.ApplicationExitInfo r2) {
            long r0 = r2.getPss()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.app.ApplicationExitInfo d(java.lang.Object r0) {
            android.app.ApplicationExitInfo r0 = (android.app.ApplicationExitInfo) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.Rect e(android.view.WindowMetrics r0) {
            android.graphics.Rect r0 = r0.getBounds()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowMetrics f(android.view.WindowManager r0) {
            android.view.WindowMetrics r0 = r0.getCurrentWindowMetrics()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction g() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD
            return r0
    }

    public static /* bridge */ /* synthetic */ java.io.InputStream h(android.app.ApplicationExitInfo r0) {
            java.io.InputStream r0 = r0.getTraceInputStream()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String i(android.app.ApplicationExitInfo r0) {
            java.lang.String r0 = r0.getDescription()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List j(android.app.ActivityManager r2, java.lang.String r3) {
            r0 = 0
            r1 = 32
            java.util.List r2 = r2.getHistoricalProcessExitReasons(r3, r0, r1)
            return r2
    }

    public static /* bridge */ /* synthetic */ void k(android.graphics.Outline r0, android.graphics.Path r1) {
            r0.setPath(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean l(android.graphics.Canvas r0, float r1, float r2, float r3, float r4) {
            boolean r0 = r0.quickReject(r1, r2, r3, r4)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean m(android.graphics.Canvas r0, android.graphics.Path r1) {
            boolean r0 = r0.quickReject(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean n(android.graphics.Canvas r0, android.graphics.RectF r1) {
            boolean r0 = r0.quickReject(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ int o(android.app.ApplicationExitInfo r0) {
            int r0 = r0.getStatus()
            return r0
    }

    public static /* bridge */ /* synthetic */ long p(android.app.ApplicationExitInfo r2) {
            long r0 = r2.getTimestamp()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction q() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String r(android.app.ApplicationExitInfo r0) {
            java.lang.String r0 = r0.getProcessName()
            return r0
    }

    public static /* bridge */ /* synthetic */ int s(android.app.ApplicationExitInfo r0) {
            int r0 = r0.getImportance()
            return r0
    }

    public static /* bridge */ /* synthetic */ long t(android.app.ApplicationExitInfo r2) {
            long r0 = r2.getRss()
            return r0
    }

    public static /* bridge */ /* synthetic */ int u(android.app.ApplicationExitInfo r0) {
            int r0 = r0.getReason()
            return r0
    }

    public static /* bridge */ /* synthetic */ int v(android.app.ApplicationExitInfo r0) {
            int r0 = r0.getRealUid()
            return r0
    }

    public static /* bridge */ /* synthetic */ int w(android.app.ApplicationExitInfo r0) {
            int r0 = r0.getPackageUid()
            return r0
    }
}
