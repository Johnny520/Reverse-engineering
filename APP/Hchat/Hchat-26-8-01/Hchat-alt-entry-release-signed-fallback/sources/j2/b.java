package j2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ float a(android.view.MotionEvent r1) {
            r0 = 0
            float r1 = r1.getRawX(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ float b(android.view.MotionEvent r0, int r1) {
            float r0 = r0.getRawX(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ int c(android.text.TextPaint r7, java.lang.CharSequence r8, int r9, int r10) {
            r4 = 0
            r6 = 2
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r5 = r10
            int r7 = r0.getTextRunCursor(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static /* bridge */ /* synthetic */ int d(android.view.MotionEvent r0) {
            int r0 = r0.getClassification()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.graphics.RecordingCanvas e(android.graphics.RenderNode r0) {
            android.graphics.RecordingCanvas r0 = r0.beginRecording()
            return r0
    }

    public static /* synthetic */ android.graphics.RenderNode f() {
            android.graphics.RenderNode r0 = new android.graphics.RenderNode
            java.lang.String r1 = "AndroidEdgeEffectOverscrollEffect"
            r0.<init>(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.String g(javax.net.ssl.SSLSocket r0) {
            java.lang.String r0 = r0.getApplicationProtocol()
            return r0
    }

    public static /* bridge */ /* synthetic */ void h(long r0, java.lang.String r2) {
            android.os.Trace.setCounter(r2, r0)
            return
    }

    public static /* bridge */ /* synthetic */ void i(android.graphics.Canvas r0, long r1) {
            r0.drawColor(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void j(android.graphics.Canvas r0, long r1, android.graphics.BlendMode r3) {
            r0.drawColor(r1, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void k(android.graphics.Canvas r0, android.graphics.RenderNode r1) {
            r0.drawRenderNode(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void l(android.graphics.Paint r0, java.lang.CharSequence r1, int r2, int r3, android.graphics.Rect r4) {
            r0.getTextBounds(r1, r2, r3, r4)
            return
    }

    public static /* bridge */ /* synthetic */ void m(android.graphics.RenderNode r0) {
            r0.endRecording()
            return
    }

    public static /* bridge */ /* synthetic */ void n(android.graphics.RenderNode r1, int r2, int r3) {
            r0 = 0
            r1.setPosition(r0, r0, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void o(android.view.View r1) {
            r0 = 0
            r1.setForceDarkAllowed(r0)
            return
    }

    public static /* bridge */ /* synthetic */ void p(android.view.View r0, android.graphics.Matrix r1) {
            r0.transformMatrixToGlobal(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void q(javax.net.ssl.SSLParameters r0, java.lang.String[] r1) {
            r0.setApplicationProtocols(r1)
            return
    }

    public static /* bridge */ /* synthetic */ void r(javax.net.ssl.SSLSocket r1) {
            r0 = 1
            android.net.ssl.SSLSockets.setUseSessionTickets(r1, r0)
            return
    }

    public static /* bridge */ /* synthetic */ void s(y2.x r0, java.util.ArrayList r1) {
            r0.setSystemGestureExclusionRects(r1)
            return
    }

    public static /* bridge */ /* synthetic */ boolean t(javax.net.ssl.SSLSocket r0) {
            boolean r0 = android.net.ssl.SSLSockets.isSupportedSocket(r0)
            return r0
    }

    public static /* bridge */ /* synthetic */ float u(android.view.MotionEvent r1) {
            r0 = 0
            float r1 = r1.getRawY(r0)
            return r1
    }

    public static /* bridge */ /* synthetic */ float v(android.view.MotionEvent r0, int r1) {
            float r0 = r0.getRawY(r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ int w(android.text.TextPaint r7, java.lang.CharSequence r8, int r9, int r10) {
            r4 = 0
            r6 = 0
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r5 = r10
            int r7 = r0.getTextRunCursor(r1, r2, r3, r4, r5, r6)
            return r7
    }
}
