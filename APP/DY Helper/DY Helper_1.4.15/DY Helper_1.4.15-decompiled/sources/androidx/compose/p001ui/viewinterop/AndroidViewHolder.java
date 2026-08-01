package androidx.compose.p001ui.viewinterop;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class AndroidViewHolder extends android.view.ViewGroup implements p000.d31, p000.InterfaceC0291fn, p000.x81, p000.v41 {

    /* JADX INFO: renamed from: ε */
    public p000.p70 f971;

    /* JADX INFO: renamed from: ζ */
    public p000.p70 f972;

    /* JADX INFO: renamed from: η */
    public p000.p70 f973;

    /* JADX INFO: renamed from: θ */
    public p000.r01 f974;

    /* JADX INFO: renamed from: ι */
    public p000.a80 f975;

    /* JADX INFO: renamed from: κ */
    public p000.InterfaceC1031yr f976;

    /* JADX INFO: renamed from: λ */
    public p000.a80 f977;

    /* JADX INFO: renamed from: μ */
    public p000.hr0 f978;

    /* JADX INFO: renamed from: ν */
    public p000.kq1 f979;

    /* JADX INFO: renamed from: ξ */
    public p000.a80 f980;

    private final p000.y81 getSnapshotObserver() {
            r0 = this;
            boolean r0 = r0.isAttachedToWindow()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "Expected AndroidViewHolder to be attached when observing reads."
            p000.am0.m178(r0)
        Lb:
            r0 = 0
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(android.graphics.Region r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r0 = 1
            return r0
        L4:
            r1 = 0
            r0.getLocationInWindow(r1)
            throw r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r0 = this;
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            return r0
    }

    public final p000.InterfaceC1031yr getDensity() {
            r0 = this;
            yr r0 = r0.f976
            return r0
    }

    public final android.view.View getInteropView() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final p000.yp0 getLayoutNode() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final p000.hr0 getLifecycleOwner() {
            r0 = this;
            hr0 r0 = r0.f978
            return r0
    }

    public final p000.r01 getModifier() {
            r0 = this;
            r01 r0 = r0.f974
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final p000.a80 getOnDensityChanged$ui() {
            r0 = this;
            a80 r0 = r0.f977
            return r0
    }

    public final p000.a80 getOnModifierChanged$ui() {
            r0 = this;
            a80 r0 = r0.f975
            return r0
    }

    public final p000.a80 getOnRequestDisallowInterceptTouchEvent$ui() {
            r0 = this;
            a80 r0 = r0.f980
            return r0
    }

    public final p000.p70 getRelease() {
            r0 = this;
            p70 r0 = r0.f973
            return r0
    }

    public final p000.p70 getReset() {
            r0 = this;
            p70 r0 = r0.f972
            return r0
    }

    public final p000.kq1 getSavedStateRegistryOwner() {
            r0 = this;
            kq1 r0 = r0.f979
            return r0
    }

    public final p000.p70 getUpdate() {
            r0 = this;
            p70 r0 = r0.f971
            return r0
    }

    public final android.view.View getView() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ViewParent invalidateChildInParent(int[] r1, android.graphics.Rect r2) {
            r0 = this;
            super.invalidateChildInParent(r1, r2)
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0 = 0
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(android.view.View r1, android.view.View r2) {
            r0 = this;
            super.onDescendantInvalidated(r1, r2)
            r0 = 0
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r22 = this;
            r0 = r22
            super.onDetachedFromWindow()
            y81 r1 = r0.getSnapshotObserver()
            kx1 r1 = r1.f12491
            java.lang.Object r2 = r1.f6304
            monitor-enter(r2)
            k21 r1 = r1.f6303     // Catch: java.lang.Throwable -> L96
            int r3 = r1.f5718     // Catch: java.lang.Throwable -> L96
            r5 = 0
            r6 = 0
        L14:
            java.lang.Object[] r7 = r1.f5716
            if (r5 >= r3) goto L9c
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L96
            jx1 r7 = (p000.jx1) r7     // Catch: java.lang.Throwable -> L96
            b21 r8 = r7.f5640     // Catch: java.lang.Throwable -> L96
            java.lang.Object r8 = r8.m699(r0)     // Catch: java.lang.Throwable -> L96
            u11 r8 = (p000.u11) r8     // Catch: java.lang.Throwable -> L96
            if (r8 != 0) goto L29
        L26:
            r16 = r5
            goto L80
        L29:
            java.lang.Object[] r9 = r8.f10556     // Catch: java.lang.Throwable -> L96
            int[] r10 = r8.f10557     // Catch: java.lang.Throwable -> L96
            long[] r8 = r8.f10555     // Catch: java.lang.Throwable -> L96
            int r11 = r8.length     // Catch: java.lang.Throwable -> L96
            int r11 = r11 + (-2)
            if (r11 < 0) goto L26
            r12 = 0
        L35:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> L96
            r16 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> L96
            r17 = 7
            long r4 = r4 << r17
            long r4 = r4 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r17
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L79
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> L96
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r15 = 0
        L54:
            if (r15 >= r4) goto L77
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r13 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L6e
            int r18 = r12 << 3
            int r18 = r18 + r15
            r19 = r5
            r5 = r9[r18]     // Catch: java.lang.Throwable -> L96
            r18 = r10[r18]     // Catch: java.lang.Throwable -> L96
            r7.m3069(r0, r5)     // Catch: java.lang.Throwable -> L96
            goto L70
        L6e:
            r19 = r5
        L70:
            long r13 = r13 >> r19
            int r15 = r15 + 1
            r5 = r19
            goto L54
        L77:
            if (r4 != r5) goto L80
        L79:
            if (r12 == r11) goto L80
            int r12 = r12 + 1
            r5 = r16
            goto L35
        L80:
            b21 r4 = r7.f5640     // Catch: java.lang.Throwable -> L96
            boolean r4 = r4.m698()     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto L8b
            int r6 = r6 + 1
            goto L98
        L8b:
            if (r6 <= 0) goto L98
            java.lang.Object[] r4 = r1.f5716     // Catch: java.lang.Throwable -> L96
            int r5 = r16 - r6
            r7 = r4[r16]     // Catch: java.lang.Throwable -> L96
            r4[r5] = r7     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r0 = move-exception
            goto La6
        L98:
            int r5 = r16 + 1
            goto L14
        L9c:
            int r0 = r3 - r6
            r4 = 0
            java.util.Arrays.fill(r7, r0, r3, r4)     // Catch: java.lang.Throwable -> L96
            r1.f5718 = r0     // Catch: java.lang.Throwable -> L96
            monitor-exit(r2)
            return
        La6:
            monitor-exit(r2)
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View r1, android.graphics.Rect r2, boolean r3) {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r3) {
            r2 = this;
            a80 r0 = r2.f980
            if (r0 == 0) goto Lb
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.invoke(r1)
        Lb:
            super.requestDisallowInterceptTouchEvent(r3)
            return
    }

    public final void setDensity(p000.InterfaceC1031yr r2) {
            r1 = this;
            yr r0 = r1.f976
            if (r2 == r0) goto Ld
            r1.f976 = r2
            a80 r1 = r1.f977
            if (r1 == 0) goto Ld
            r1.invoke(r2)
        Ld:
            return
    }

    public final void setLifecycleOwner(p000.hr0 r2) {
            r1 = this;
            hr0 r0 = r1.f978
            if (r2 == r0) goto Lc
            r1.f978 = r2
            r0 = 2131297158(0x7f090386, float:1.8212253E38)
            r1.setTag(r0, r2)
        Lc:
            return
    }

    public final void setModifier(p000.r01 r2) {
            r1 = this;
            r01 r0 = r1.f974
            if (r2 == r0) goto Ld
            r1.f974 = r2
            a80 r1 = r1.f975
            if (r1 == 0) goto Ld
            r1.invoke(r2)
        Ld:
            return
    }

    public final void setOnDensityChanged$ui(p000.a80 r1) {
            r0 = this;
            r0.f977 = r1
            return
    }

    public final void setOnModifierChanged$ui(p000.a80 r1) {
            r0 = this;
            r0.f975 = r1
            return
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(p000.a80 r1) {
            r0 = this;
            r0.f980 = r1
            return
    }

    public final void setRelease(p000.p70 r1) {
            r0 = this;
            r0.f973 = r1
            return
    }

    public final void setReset(p000.p70 r1) {
            r0 = this;
            r0.f972 = r1
            return
    }

    public final void setSavedStateRegistryOwner(p000.kq1 r2) {
            r1 = this;
            kq1 r0 = r1.f979
            if (r2 == r0) goto Lc
            r1.f979 = r2
            r0 = 2131297160(0x7f090388, float:1.8212257E38)
            r1.setTag(r0, r2)
        Lc:
            return
    }

    public final void setUpdate(p000.p70 r1) {
            r0 = this;
            r0.f971 = r1
            r0 = 0
            throw r0
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: α */
    public final void mo250(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: β */
    public final void mo251(android.view.ViewGroup r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: γ */
    public final void mo252(android.view.View r1, int r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: δ */
    public final void mo253(int r1, int r2, int[] r3, int r4) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // p000.InterfaceC0291fn
    /* JADX INFO: renamed from: ε */
    public final void mo407() {
            r0 = this;
            p70 r0 = r0.f973
            r0.invoke()
            return
    }

    @Override // p000.d31
    /* JADX INFO: renamed from: ζ */
    public final void mo254(android.view.ViewGroup r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // p000.v41
    /* JADX INFO: renamed from: η */
    public final p000.oc2 mo408(android.view.View r2, p000.oc2 r3) {
            r1 = this;
            oc2 r1 = new oc2
            r1.<init>(r3)
            lc2 r1 = r3.f8033
            r2 = -1
            nm0 r2 = r1.mo1906(r2)
            nm0 r0 = p000.nm0.f7673
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L27
            r2 = -9
            nm0 r2 = r1.mo1907(r2)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L27
            mt r1 = r1.mo2297()
            if (r1 != 0) goto L27
            return r3
        L27:
            r1 = 0
            throw r1
    }

    @Override // p000.InterfaceC0291fn
    /* JADX INFO: renamed from: θ */
    public final void mo409() {
            r1 = this;
            p70 r0 = r1.f972
            r0.invoke()
            r1.removeAllViewsInLayout()
            return
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: ι */
    public final boolean mo257(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r0 = r3 & 2
            r1 = 1
            if (r0 != 0) goto Lc
            r0 = r3 & 1
            if (r0 == 0) goto La
            goto Lc
        La:
            r0 = 0
            return r0
        Lc:
            return r1
    }

    @Override // p000.x81
    /* JADX INFO: renamed from: χ */
    public final boolean mo410() {
            r0 = this;
            boolean r0 = r0.isAttachedToWindow()
            return r0
    }
}
