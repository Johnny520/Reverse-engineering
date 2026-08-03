package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b0 {
    public static /* bridge */ /* synthetic */ int A(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetBottom()
            return r0
    }

    public static /* synthetic */ void B() {
            android.view.textclassifier.TextClassificationContext$Builder r0 = new android.view.textclassifier.TextClassificationContext$Builder
            return
    }

    public static /* bridge */ /* synthetic */ int C(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetRight()
            return r0
    }

    public static /* bridge */ /* synthetic */ int D(android.view.DisplayCutout r0) {
            int r0 = r0.hashCode()
            return r0
    }

    public static /* bridge */ /* synthetic */ int a(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetTop()
            return r0
    }

    public static /* bridge */ /* synthetic */ long b(android.content.pm.PackageInfo r2) {
            long r0 = r2.getLongVersionCode()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.DisplayCutout c(android.view.WindowInsets r0) {
            android.view.DisplayCutout r0 = r0.getDisplayCutout()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.DisplayCutout d(java.lang.Object r0) {
            android.view.DisplayCutout r0 = (android.view.DisplayCutout) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsets e(android.view.WindowInsets r0) {
            android.view.WindowInsets r0 = r0.consumeDisplayCutout()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassification.Request.Builder f(android.view.textclassifier.TextClassification.Request.Builder r0, android.os.LocaleList r1) {
            android.view.textclassifier.TextClassification$Request$Builder r0 = r0.setDefaultLocales(r1)
            return r0
    }

    public static /* synthetic */ android.view.textclassifier.TextClassification.Request.Builder g(java.lang.CharSequence r1, int r2, int r3) {
            android.view.textclassifier.TextClassification$Request$Builder r0 = new android.view.textclassifier.TextClassification$Request$Builder
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassification.Request h(android.view.textclassifier.TextClassification.Request.Builder r0) {
            android.view.textclassifier.TextClassification$Request r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassification i(android.view.textclassifier.TextClassifier r0, android.view.textclassifier.TextClassification.Request r1) {
            android.view.textclassifier.TextClassification r0 = r0.classifyText(r1)
            return r0
    }

    public static /* synthetic */ android.view.textclassifier.TextClassificationContext.Builder j(java.lang.String r1, java.lang.String r2) {
            android.view.textclassifier.TextClassificationContext$Builder r0 = new android.view.textclassifier.TextClassificationContext$Builder
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassificationContext k(android.view.textclassifier.TextClassificationContext.Builder r0) {
            android.view.textclassifier.TextClassificationContext r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextClassifier l(android.view.textclassifier.TextClassificationManager r0, android.view.textclassifier.TextClassificationContext r1) {
            android.view.textclassifier.TextClassifier r0 = r0.createTextClassificationSession(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextSelection.Request.Builder m(android.view.textclassifier.TextSelection.Request.Builder r0, android.os.LocaleList r1) {
            android.view.textclassifier.TextSelection$Request$Builder r0 = r0.setDefaultLocales(r1)
            return r0
    }

    public static /* synthetic */ android.view.textclassifier.TextSelection.Request.Builder n(java.lang.CharSequence r1, int r2, int r3) {
            android.view.textclassifier.TextSelection$Request$Builder r0 = new android.view.textclassifier.TextSelection$Request$Builder
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextSelection.Request o(android.view.textclassifier.TextSelection.Request.Builder r0) {
            android.view.textclassifier.TextSelection$Request r0 = r0.build()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.textclassifier.TextSelection p(android.view.textclassifier.TextClassifier r0, android.view.textclassifier.TextSelection.Request r1) {
            android.view.textclassifier.TextSelection r0 = r0.suggestSelection(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String q() {
            java.lang.String r0 = android.app.Application.getProcessName()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.List r(android.view.textclassifier.TextClassification r0) {
            java.util.List r0 = r0.getActions()
            return r0
    }

    public static /* synthetic */ void s() {
            android.view.textclassifier.TextClassification$Request$Builder r0 = new android.view.textclassifier.TextClassification$Request$Builder
            return
    }

    public static /* bridge */ /* synthetic */ void t(android.app.Notification.Action.Builder r1) {
            r0 = 1
            r1.setSemanticAction(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void u(android.view.accessibility.AccessibilityNodeInfo r0, boolean r1) {
            r0.setScreenReaderFocusable(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean v(android.app.RemoteAction r0) {
            boolean r0 = r0.shouldShowIcon()
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean w(android.view.textclassifier.TextClassifier r0) {
            boolean r0 = r0.isDestroyed()
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean x(java.lang.Object r0) {
            boolean r0 = r0 instanceof android.view.DisplayCutout
            return r0
    }

    public static /* bridge */ /* synthetic */ int y(android.view.DisplayCutout r0) {
            int r0 = r0.getSafeInsetLeft()
            return r0
    }

    public static /* synthetic */ void z() {
            android.view.textclassifier.TextSelection$Request$Builder r0 = new android.view.textclassifier.TextSelection$Request$Builder
            return
    }
}
