package androidx.compose.p001ui.platform;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer extends android.view.View implements p000.w81 {

    /* JADX INFO: renamed from: η */
    public static java.lang.reflect.Method f965;

    /* JADX INFO: renamed from: θ */
    public static java.lang.reflect.Field f966;

    /* JADX INFO: renamed from: ι */
    public static boolean f967;

    /* JADX INFO: renamed from: κ */
    public static boolean f968;

    /* JADX INFO: renamed from: ε */
    public boolean f969;

    /* JADX INFO: renamed from: ζ */
    public float f970;

    static {
            l92 r0 = new l92
            r1 = 1
            r0.<init>(r1)
            return
    }

    private final p000.z91 getManualClipPath() {
            r1 = this;
            boolean r1 = r1.getClipToOutline()
            r0 = 0
            if (r1 != 0) goto L8
            return r0
        L8:
            throw r0
    }

    private final void setInvalidated(boolean r2) {
            r1 = this;
            boolean r0 = r1.f969
            if (r2 != r0) goto L5
            return
        L5:
            r1.f969 = r2
            r1 = 0
            throw r1
    }

    @Override // p000.w81
    public final void destroy() {
            r1 = this;
            r0 = 0
            r1.setInvalidated(r0)
            r1 = 0
            throw r1
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public final void forceLayout() {
            r0 = this;
            return
    }

    public final float getCameraDistancePx() {
            r1 = this;
            float r0 = r1.getCameraDistance()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.densityDpi
            float r1 = (float) r1
            float r0 = r0 / r1
            return r0
    }

    public final androidx.compose.p001ui.platform.DrawChildContainer getContainer() {
            r0 = this;
            r0 = 0
            return r0
    }

    public float getFrameRate() {
            r0 = this;
            float r0 = r0.f970
            return r0
    }

    public long getLayerId() {
            r2 = this;
            r0 = 0
            return r0
    }

    public final androidx.compose.p001ui.platform.AndroidComposeView getOwnerView() {
            r0 = this;
            r0 = 0
            return r0
    }

    public long getOwnerViewId() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public float[] mo7375getUnderlyingMatrixsQKQjiQ() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.View, p000.w81
    public final void invalidate() {
            r1 = this;
            boolean r0 = r1.f969
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.setInvalidated(r0)
            super.invalidate()
            r1 = 0
            throw r1
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }

    public final void setCameraDistancePx(float r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            float r0 = (float) r0
            float r2 = r2 * r0
            r1.setCameraDistance(r2)
            return
    }

    public void setFrameRate(float r1) {
            r0 = this;
            r0.f970 = r1
            return
    }

    public void setFrameRateFromParent(boolean r1) {
            r0 = this;
            return
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: α */
    public final void mo398(p000.io1 r1) {
            r0 = this;
            int r0 = r1.f5141
            r0 = 0
            throw r0
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: β */
    public final long mo399(long r1, boolean r3) {
            r0 = this;
            r0 = 0
            if (r3 == 0) goto L4
            throw r0
        L4:
            throw r0
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: γ */
    public final void mo400(long r4) {
            r3 = this;
            r0 = 32
            long r0 = r4 >> r0
            int r0 = (int) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r1
            int r4 = (int) r4
            int r5 = r3.getWidth()
            if (r0 != r5) goto L19
            int r5 = r3.getHeight()
            if (r4 != r5) goto L19
            return
        L19:
            int r5 = p000.r52.f9267
            r1 = 0
            int r5 = (int) r1
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r0 = (float) r0
            float r5 = r5 * r0
            r3.setPivotX(r5)
            int r5 = (int) r1
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r4 = (float) r4
            float r5 = r5 * r4
            r3.setPivotY(r5)
            r3 = 0
            throw r3
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: δ */
    public final void mo401(p000.a21 r1, boolean r2) {
            r0 = this;
            r0 = 0
            if (r2 == 0) goto L4
            throw r0
        L4:
            throw r0
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: ε */
    public final void mo402(p000.e80 r1, p000.p70 r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: ζ */
    public final void mo403(p000.InterfaceC0209de r2, p000.wa0 r3) {
            r1 = this;
            float r3 = r1.getElevation()
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto Lc
            r2.mo1733()
        Lc:
            r1.getDrawingTime()
            r1 = 0
            throw r1
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: η */
    public final void mo404(long r4) {
            r3 = this;
            r0 = 32
            long r0 = r4 >> r0
            int r0 = (int) r0
            int r1 = r3.getLeft()
            r2 = 0
            if (r0 != r1) goto L23
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r0
            int r4 = (int) r4
            int r5 = r3.getTop()
            if (r4 != r5) goto L1a
            return
        L1a:
            int r5 = r3.getTop()
            int r4 = r4 - r5
            r3.offsetTopAndBottom(r4)
            throw r2
        L23:
            int r4 = r3.getLeft()
            int r0 = r0 - r4
            r3.offsetLeftAndRight(r0)
            throw r2
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: θ */
    public final void mo405() {
            r9 = this;
            boolean r0 = r9.f969
            if (r0 == 0) goto L76
            boolean r0 = androidx.compose.p001ui.platform.ViewLayer.f968
            if (r0 != 0) goto L76
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r3 = 0
            r4 = 1
            boolean r5 = androidx.compose.p001ui.platform.ViewLayer.f967     // Catch: java.lang.Throwable -> L71
            if (r5 != 0) goto L61
            androidx.compose.p001ui.platform.ViewLayer.f967 = r4     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = "getDeclaredMethod"
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L71
            r7[r3] = r1     // Catch: java.lang.Throwable -> L71
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L71
            java.lang.Class r8 = r8.getClass()     // Catch: java.lang.Throwable -> L71
            r7[r4] = r8     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r5 = r2.getDeclaredMethod(r5, r7)     // Catch: java.lang.Throwable -> L71
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = "updateDisplayListIfDirty"
            r6[r3] = r7     // Catch: java.lang.Throwable -> L71
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L71
            r6[r4] = r7     // Catch: java.lang.Throwable -> L71
            java.lang.Object r5 = r5.invoke(r0, r6)     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L71
            androidx.compose.p001ui.platform.ViewLayer.f965 = r5     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = "getDeclaredField"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L71
            r6[r3] = r1     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L71
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = "mRecreateDisplayList"
            r2[r3] = r5     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> L71
            androidx.compose.p001ui.platform.ViewLayer.f966 = r0     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r0 = androidx.compose.p001ui.platform.ViewLayer.f965     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L5a
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L71
        L5a:
            java.lang.reflect.Field r0 = androidx.compose.p001ui.platform.ViewLayer.f966     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L61
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L71
        L61:
            java.lang.reflect.Field r0 = androidx.compose.p001ui.platform.ViewLayer.f966     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L68
            r0.setBoolean(r9, r4)     // Catch: java.lang.Throwable -> L71
        L68:
            java.lang.reflect.Method r0 = androidx.compose.p001ui.platform.ViewLayer.f965     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L73
            r1 = 0
            r0.invoke(r9, r1)     // Catch: java.lang.Throwable -> L71
            goto L73
        L71:
            androidx.compose.p001ui.platform.ViewLayer.f968 = r4
        L73:
            r9.setInvalidated(r3)
        L76:
            return
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: ι */
    public final boolean mo406(long r3) {
            r2 = this;
            r0 = 32
            long r0 = r3 >> r0
            int r0 = (int) r0
            java.lang.Float.intBitsToFloat(r0)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            int r3 = (int) r3
            java.lang.Float.intBitsToFloat(r3)
            boolean r2 = r2.getClipToOutline()
            if (r2 != 0) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            throw r2
    }
}
