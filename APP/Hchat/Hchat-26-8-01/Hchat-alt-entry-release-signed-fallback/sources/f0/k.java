package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static /* bridge */ /* synthetic */ int a() {
            int r0 = android.view.WindowInsets.Type.systemOverlays()
            return r0
    }

    public static /* bridge */ /* synthetic */ int b(android.view.ViewConfiguration r0) {
            int r0 = r0.getScaledHandwritingGestureLineMargin()
            return r0
    }

    public static /* bridge */ /* synthetic */ int c(android.view.inputmethod.DeleteGesture r0) {
            int r0 = r0.getGranularity()
            return r0
    }

    public static /* bridge */ /* synthetic */ int d(android.view.inputmethod.DeleteRangeGesture r0) {
            int r0 = r0.getGranularity()
            return r0
    }

    public static /* bridge */ /* synthetic */ int e(android.view.inputmethod.SelectGesture r0) {
            int r0 = r0.getGranularity()
            return r0
    }

    public static /* bridge */ /* synthetic */ int f(android.view.inputmethod.SelectRangeGesture r0) {
            int r0 = r0.getGranularity()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.ColorSpace.Named g() {
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.BT2020_HLG
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.PointF h(android.view.inputmethod.JoinOrSplitGesture r0) {
            android.graphics.PointF r0 = r0.getJoinOrSplitPoint()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.PointF i(android.view.inputmethod.RemoveSpaceGesture r0) {
            android.graphics.PointF r0 = r0.getStartPoint()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RectF j(android.view.inputmethod.DeleteGesture r0) {
            android.graphics.RectF r0 = r0.getDeletionArea()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RectF k(android.view.inputmethod.DeleteRangeGesture r0) {
            android.graphics.RectF r0 = r0.getDeletionStartArea()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RectF l(android.view.inputmethod.SelectGesture r0) {
            android.graphics.RectF r0 = r0.getSelectionArea()
            return r0
    }

    public static /* synthetic */ android.text.GraphemeClusterSegmentFinder m(java.lang.CharSequence r1, android.text.TextPaint r2) {
            android.text.GraphemeClusterSegmentFinder r0 = new android.text.GraphemeClusterSegmentFinder
            r0.<init>(r1, r2)
            return r0
    }

    public static /* bridge */ /* synthetic */ android.text.SegmentFinder n(java.lang.Object r0) {
            android.text.SegmentFinder r0 = (android.text.SegmentFinder) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String o(android.view.inputmethod.HandwritingGesture r0) {
            java.lang.String r0 = r0.getFallbackText()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String p(android.view.inputmethod.InsertGesture r0) {
            java.lang.String r0 = r0.getTextToInsert()
            return r0
    }

    public static /* synthetic */ void q() {
            android.text.GraphemeClusterSegmentFinder r0 = new android.text.GraphemeClusterSegmentFinder
            return
    }

    public static /* bridge */ /* synthetic */ int[] r(android.text.Layout r0, android.graphics.RectF r1, android.text.SegmentFinder r2, j2.a r3) {
            int[] r0 = r0.getRangeForRect(r1, r2, r3)
            return r0
    }

    public static /* bridge */ /* synthetic */ int s(android.view.ViewConfiguration r0) {
            int r0 = r0.getScaledHandwritingSlop()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.ColorSpace.Named t() {
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.BT2020_PQ
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.PointF u(android.view.inputmethod.RemoveSpaceGesture r0) {
            android.graphics.PointF r0 = r0.getEndPoint()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RectF v(android.view.inputmethod.DeleteRangeGesture r0) {
            android.graphics.RectF r0 = r0.getDeletionEndArea()
            return r0
    }
}
