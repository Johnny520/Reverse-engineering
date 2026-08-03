package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a0 {
    public static /* bridge */ /* synthetic */ java.lang.Class A() {
            java.lang.Class<android.view.inputmethod.InsertGesture> r0 = android.view.inputmethod.InsertGesture.class
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean B(java.lang.Object r0) {
            boolean r0 = r0 instanceof android.view.inputmethod.DeleteRangeGesture
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class C() {
            java.lang.Class<android.view.inputmethod.RemoveSpaceGesture> r0 = android.view.inputmethod.RemoveSpaceGesture.class
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean D(java.lang.Object r0) {
            boolean r0 = r0 instanceof android.view.inputmethod.JoinOrSplitGesture
            return r0
    }

    public static /* bridge */ /* synthetic */ android.app.ActivityOptions a(android.app.ActivityOptions r1) {
            r0 = 1
            android.app.ActivityOptions r1 = r1.setPendingIntentBackgroundActivityStartMode(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ android.graphics.PointF b(android.view.inputmethod.InsertGesture r0) {
            android.graphics.PointF r0 = r0.getInsertionPoint()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RectF c(android.view.inputmethod.SelectRangeGesture r0) {
            android.graphics.RectF r0 = r0.getSelectionStartArea()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.DeleteGesture d(java.lang.Object r0) {
            android.view.inputmethod.DeleteGesture r0 = (android.view.inputmethod.DeleteGesture) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.DeleteRangeGesture e(java.lang.Object r0) {
            android.view.inputmethod.DeleteRangeGesture r0 = (android.view.inputmethod.DeleteRangeGesture) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.HandwritingGesture f(java.lang.Object r0) {
            android.view.inputmethod.HandwritingGesture r0 = (android.view.inputmethod.HandwritingGesture) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.InsertGesture g(java.lang.Object r0) {
            android.view.inputmethod.InsertGesture r0 = (android.view.inputmethod.InsertGesture) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.JoinOrSplitGesture h(java.lang.Object r0) {
            android.view.inputmethod.JoinOrSplitGesture r0 = (android.view.inputmethod.JoinOrSplitGesture) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.RemoveSpaceGesture i(java.lang.Object r0) {
            android.view.inputmethod.RemoveSpaceGesture r0 = (android.view.inputmethod.RemoveSpaceGesture) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.SelectGesture j(java.lang.Object r0) {
            android.view.inputmethod.SelectGesture r0 = (android.view.inputmethod.SelectGesture) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.inputmethod.SelectRangeGesture k(java.lang.Object r0) {
            android.view.inputmethod.SelectRangeGesture r0 = (android.view.inputmethod.SelectRangeGesture) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class l() {
            java.lang.Class<android.view.inputmethod.SelectGesture> r0 = android.view.inputmethod.SelectGesture.class
            return r0
    }

    public static /* bridge */ /* synthetic */ void m(android.app.PendingIntent r0, android.os.Bundle r1) {
            r0.send(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.view.inputmethod.CursorAnchorInfo.Builder r0, float r1, float r2, float r3, float r4) {
            r0.addVisibleLineBounds(r1, r2, r3, r4)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.view.inputmethod.EditorInfo r0, java.util.List r1) {
            r0.setSupportedHandwritingGestures(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.view.inputmethod.EditorInfo r0, java.util.Set r1) {
            r0.setSupportedHandwritingGesturePreviews(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean q(java.lang.Object r0) {
            boolean r0 = r0 instanceof android.view.inputmethod.SelectGesture
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RectF r(android.view.inputmethod.SelectRangeGesture r0) {
            android.graphics.RectF r0 = r0.getSelectionEndArea()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class s() {
            java.lang.Class<android.view.inputmethod.SelectRangeGesture> r0 = android.view.inputmethod.SelectRangeGesture.class
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean t(java.lang.Object r0) {
            boolean r0 = r0 instanceof android.view.inputmethod.InsertGesture
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class u() {
            java.lang.Class<android.view.inputmethod.DeleteRangeGesture> r0 = android.view.inputmethod.DeleteRangeGesture.class
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean v(java.lang.Object r0) {
            boolean r0 = r0 instanceof android.view.inputmethod.RemoveSpaceGesture
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class w() {
            java.lang.Class<android.view.inputmethod.DeleteGesture> r0 = android.view.inputmethod.DeleteGesture.class
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean x(java.lang.Object r0) {
            boolean r0 = r0 instanceof android.view.inputmethod.DeleteGesture
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Class y() {
            java.lang.Class<android.view.inputmethod.JoinOrSplitGesture> r0 = android.view.inputmethod.JoinOrSplitGesture.class
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean z(java.lang.Object r0) {
            boolean r0 = r0 instanceof android.view.inputmethod.SelectRangeGesture
            return r0
    }
}
