package androidx.compose.p001ui.platform;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComposeView extends android.view.ViewGroup {

    /* JADX INFO: renamed from: ξ */
    public static final /* synthetic */ int f862 = 0;

    /* JADX INFO: renamed from: ε */
    public java.lang.ref.WeakReference f863;

    /* JADX INFO: renamed from: ζ */
    public android.os.IBinder f864;

    /* JADX INFO: renamed from: η */
    public p000.hd2 f865;

    /* JADX INFO: renamed from: θ */
    public p000.AbstractC0878un f866;

    /* JADX INFO: renamed from: ι */
    public p000.C0693pn f867;

    /* JADX INFO: renamed from: κ */
    public p000.p70 f868;

    /* JADX INFO: renamed from: λ */
    public boolean f869;

    /* JADX INFO: renamed from: μ */
    public boolean f870;

    /* JADX INFO: renamed from: ν */
    public boolean f871;

    public AbstractComposeView(android.content.Context r4) {
            r3 = this;
            r0 = 6
            r1 = 0
            r2 = 0
            r3.<init>(r4, r2, r0, r1)
            return
    }

    public AbstractComposeView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public AbstractComposeView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0.setClipChildren(r1)
            r0.setClipToPadding(r1)
            r1 = 1
            r0.setImportantForAccessibility(r1)
            c92 r1 = new c92
            r2 = 1
            r1.<init>(r0, r2)
            r0.addOnAttachStateChangeListener(r1)
            d92 r2 = new d92
            r2.<init>(r0)
            gi1 r3 = p000.v81.m6123(r0)
            java.util.ArrayList r3 = r3.f4382
            r3.add(r2)
            e92 r3 = new e92
            r3.<init>(r0, r1, r2)
            r0.f868 = r3
            return
    }

    public /* synthetic */ AbstractComposeView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
            return
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
            return
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
            return
    }

    private final void setParentContext(p000.AbstractC0878un r2) {
            r1 = this;
            un r0 = r1.f866
            if (r0 == r2) goto L1d
            r1.f866 = r2
            r0 = 0
            if (r2 == 0) goto Lb
            r1.f863 = r0
        Lb:
            hd2 r2 = r1.f865
            if (r2 == 0) goto L1d
            r2.m2494()
            r1.f865 = r0
            boolean r2 = r1.isAttachedToWindow()
            if (r2 == 0) goto L1d
            r1.m359()
        L1d:
            return
    }

    private final void setPreviousAttachedWindowToken(android.os.IBinder r2) {
            r1 = this;
            android.os.IBinder r0 = r1.f864
            if (r0 == r2) goto L9
            r1.f864 = r2
            r2 = 0
            r1.f863 = r2
        L9:
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1) {
            r0 = this;
            r0.m357()
            super.addView(r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1, int r2) {
            r0 = this;
            r0.m357()
            super.addView(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1, int r2, int r3) {
            r0 = this;
            r0.m357()
            super.addView(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            r0.m357()
            super.addView(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.m357()
            super.addView(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            r0.m357()
            boolean r0 = super.addViewInLayout(r1, r2, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3, boolean r4) {
            r0 = this;
            r0.m357()
            boolean r0 = super.addViewInLayout(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m7364getAutoClearFocusBehavior4UtRPd4() {
            r1 = this;
            r0 = 2131296324(0x7f090044, float:1.8210561E38)
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof p000.C0502l7
            if (r0 == 0) goto Le
            l7 r1 = (p000.C0502l7) r1
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L14
            int r1 = r1.f6461
            return r1
        L14:
            r1 = 1
            return r1
    }

    public final p000.C0693pn getComposeViewContext$ui() {
            r0 = this;
            pn r0 = r0.f867
            return r0
    }

    public final boolean getHasComposition() {
            r0 = this;
            hd2 r0 = r0.f865
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
            r0 = this;
            r0 = 1
            return r0
    }

    public final boolean getShowLayoutBounds() {
            r0 = this;
            boolean r0 = r0.f869
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
            r1 = this;
            boolean r0 = r1.f871
            if (r0 == 0) goto Ld
            boolean r1 = super.isTransitionGroup()
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r5 = this;
            super.onAttachedToWindow()
            b21 r0 = p000.dd2.f3101
            android.view.ViewParent r0 = p000.p91.m4429(r5)
            r1 = r5
        La:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L22
            android.view.View r0 = (android.view.View) r0
            int r2 = r0.getId()
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            if (r2 != r3) goto L1a
            goto L22
        L1a:
            android.view.ViewParent r1 = r0.getParent()
            r4 = r1
            r1 = r0
            r0 = r4
            goto La
        L22:
            android.view.ViewParent r0 = r1.getParent()
            if (r0 != 0) goto L36
            android.os.Handler r0 = r5.getHandler()
            ν r1 = new ν
            r2 = 0
            r1.<init>(r2, r5)
            r0.postAtFrontOfQueue(r1)
            return
        L36:
            r5.m356()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.mo360(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r0.m359()
            r0.mo361(r1, r2)
            return
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r2) {
            r1 = this;
            r0 = 0
            android.view.View r1 = r1.getChildAt(r0)
            if (r1 == 0) goto La
            r1.setLayoutDirection(r2)
        La:
            return
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m7365setAutoClearFocusBehavior17tfJxM(int r2) {
            r1 = this;
            l7 r0 = new l7
            r0.<init>(r2)
            r2 = 2131296324(0x7f090044, float:1.8210561E38)
            r1.setTag(r2, r0)
            return
    }

    public final void setComposeViewContext$ui(p000.C0693pn r4) {
            r3 = this;
            pn r0 = r3.f867
            if (r0 == r4) goto L33
            if (r4 != 0) goto La
            r3.m358()
            goto L31
        La:
            int r0 = r3.getChildCount()
            if (r0 == 0) goto L31
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r1 = r0 instanceof androidx.compose.p001ui.platform.AndroidComposeView
            if (r1 == 0) goto L1c
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.p001ui.platform.AndroidComposeView) r0
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L31
            up r1 = r0.getCoroutineContext()
            un r2 = r4.f8597
            up r2 = r2.mo3324()
            if (r1 == r2) goto L2e
            r3.m358()
        L2e:
            r0.setComposeViewContext(r4)
        L31:
            r3.f867 = r4
        L33:
            return
    }

    public final void setParentCompositionContext(p000.AbstractC0878un r1) {
            r0 = this;
            r0.setParentContext(r1)
            return
    }

    public final void setShowLayoutBounds(boolean r2) {
            r1 = this;
            r1.f869 = r2
            r0 = 0
            android.view.View r1 = r1.getChildAt(r0)
            if (r1 == 0) goto Le
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.p001ui.platform.AndroidComposeView) r1
            r1.setShowLayoutBounds(r2)
        Le:
            return
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean r1) {
            r0 = this;
            super.setTransitionGroup(r1)
            r1 = 1
            r0.f871 = r1
            return
    }

    public final void setViewCompositionStrategy(p000.f92 r2) {
            r1 = this;
            p70 r0 = r1.f868
            if (r0 == 0) goto L7
            r0.invoke()
        L7:
            p70 r2 = r2.mo2073(r1)
            r1.f868 = r2
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: α */
    public abstract void mo355(p000.v80 r1, int r2);

    /* JADX INFO: renamed from: β */
    public final void m356() {
            r3 = this;
            boolean r0 = r3.isAttachedToWindow()
            if (r0 != 0) goto L7
            goto L40
        L7:
            android.os.IBinder r0 = r3.getWindowToken()
            r3.setPreviousAttachedWindowToken(r0)
            pn r0 = r3.f867
            if (r0 != 0) goto L37
            int r0 = r3.getChildCount()
            r1 = 0
            if (r0 != 0) goto L1a
            goto L26
        L1a:
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.p001ui.platform.AndroidComposeView
            if (r2 == 0) goto L26
            r1 = r0
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.p001ui.platform.AndroidComposeView) r1
        L26:
            if (r1 == 0) goto L37
            pn r0 = r1.getComposeViewContext()
            android.view.View r2 = p000.h62.m2372(r3)
            pn r0 = r3.m364(r2, r0)
            r1.setComposeViewContext(r0)
        L37:
            boolean r0 = r3.getShouldCreateCompositionOnAttachedToWindow()
            if (r0 == 0) goto L40
            r3.m359()
        L40:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m357() {
            r3 = this;
            boolean r0 = r3.f870
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot add views to "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "; only Compose content is supported"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: δ */
    public final void m358() {
            r4 = this;
            r0 = 0
            android.view.View r1 = r4.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.compose.p001ui.platform.AndroidComposeView
            r3 = 0
            if (r2 == 0) goto Ld
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.p001ui.platform.AndroidComposeView) r1
            goto Le
        Ld:
            r1 = r3
        Le:
            if (r1 == 0) goto L1d
            boolean r2 = r1.f927
            if (r2 == 0) goto L1d
            pn r2 = r1.getComposeViewContext()
            r2.m4553()
            r1.f927 = r0
        L1d:
            hd2 r0 = r4.f865
            if (r0 == 0) goto L24
            r0.m2494()
        L24:
            r4.f865 = r3
            r4.requestLayout()
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m359() {
            r6 = this;
            hd2 r0 = r6.f865
            if (r0 != 0) goto L3b
            r0 = 0
            r1 = 1
            r6.f870 = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "Compose:initializeView"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L32
            pn r2 = r6.f867     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            pn r2 = r6.m362()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L34
        L18:
            ξ r3 = new ξ     // Catch: java.lang.Throwable -> L16
            r4 = 0
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L16
            an r4 = new an     // Catch: java.lang.Throwable -> L16
            r5 = 1003123809(0x3bca7461, float:0.006178424)
            r4.<init>(r5, r1, r3)     // Catch: java.lang.Throwable -> L16
            hd2 r1 = p000.jd2.m2955(r6, r2, r4)     // Catch: java.lang.Throwable -> L16
            r6.f865 = r1     // Catch: java.lang.Throwable -> L16
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L32
            r6.f870 = r0
            return
        L32:
            r1 = move-exception
            goto L38
        L34:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L32
            throw r1     // Catch: java.lang.Throwable -> L32
        L38:
            r6.f870 = r0
            throw r1
        L3b:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public void mo360(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            r3 = 0
            android.view.View r3 = r2.getChildAt(r3)
            if (r3 == 0) goto L1e
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingTop()
            int r6 = r6 - r4
            int r4 = r2.getPaddingRight()
            int r6 = r6 - r4
            int r7 = r7 - r5
            int r2 = r2.getPaddingBottom()
            int r7 = r7 - r2
            r3.layout(r0, r1, r6, r7)
        L1e:
            return
    }

    /* JADX INFO: renamed from: θ */
    public void mo361(int r6, int r7) {
            r5 = this;
            r0 = 0
            android.view.View r1 = r5.getChildAt(r0)
            if (r1 != 0) goto Lb
            super.onMeasure(r6, r7)
            return
        Lb:
            int r2 = android.view.View.MeasureSpec.getSize(r6)
            int r3 = r5.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r5.getPaddingRight()
            int r2 = r2 - r3
            int r2 = java.lang.Math.max(r0, r2)
            int r3 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r0 = java.lang.Math.max(r0, r3)
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r6)
            int r7 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
            r1.measure(r6, r7)
            int r6 = r1.getMeasuredWidth()
            int r7 = r5.getPaddingLeft()
            int r7 = r7 + r6
            int r6 = r5.getPaddingRight()
            int r6 = r6 + r7
            int r7 = r1.getMeasuredHeight()
            int r0 = r5.getPaddingTop()
            int r0 = r0 + r7
            int r7 = r5.getPaddingBottom()
            int r7 = r7 + r0
            r5.setMeasuredDimension(r6, r7)
            return
    }

    /* JADX INFO: renamed from: ι */
    public final p000.C0693pn m362() {
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L1c
        L9:
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.p001ui.platform.AndroidComposeView
            if (r2 == 0) goto L15
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.p001ui.platform.AndroidComposeView) r0
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L7
            pn r0 = r0.getComposeViewContext()
        L1c:
            android.view.View r4 = p000.h62.m2372(r9)
            pn r2 = p000.h62.m2424(r4)
            if (r2 != 0) goto L7c
            un r5 = r9.m363()
            hr0 r9 = p000.v71.m6037(r4)
            if (r9 != 0) goto L38
            if (r0 == 0) goto L35
            hr0 r9 = r0.f8598
            goto L36
        L35:
            r9 = r1
        L36:
            if (r9 == 0) goto L3a
        L38:
            r6 = r9
            goto L40
        L3a:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            p000.C1080.m7279(r9)
            return r1
        L40:
            kq1 r9 = p000.e81.m1876(r4)
            if (r9 != 0) goto L4e
            if (r0 == 0) goto L4b
            kq1 r9 = r0.f8599
            goto L4c
        L4b:
            r9 = r1
        L4c:
            if (r9 == 0) goto L50
        L4e:
            r7 = r9
            goto L56
        L50:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            p000.C1080.m7279(r9)
            return r1
        L56:
            r92 r9 = p000.g81.m2274(r4)
            if (r9 != 0) goto L62
            if (r0 == 0) goto L60
            r92 r1 = r0.f8600
        L60:
            r8 = r1
            goto L63
        L62:
            r8 = r9
        L63:
            pn r2 = new pn
            android.view.View r9 = p000.h62.m2372(r4)
            pn r3 = p000.h62.m2424(r9)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r2)
            r0 = 2131296320(0x7f090040, float:1.8210553E38)
            r4.setTag(r0, r9)
            return r2
        L7c:
            pn r9 = r9.m364(r4, r2)
            return r9
    }

    /* JADX INFO: renamed from: κ */
    public final p000.AbstractC0878un m363() {
            r11 = this;
            un r0 = r11.f866
            if (r0 != 0) goto L1fa
            un r0 = p000.dd2.m1721(r11)
            if (r0 == 0) goto Lb
            goto L20
        Lb:
            android.view.ViewParent r1 = r11.getParent()
        Lf:
            if (r0 != 0) goto L20
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L20
            android.view.View r1 = (android.view.View) r1
            un r0 = p000.dd2.m1721(r1)
            android.view.ViewParent r1 = p000.p91.m4429(r1)
            goto Lf
        L20:
            r1 = 0
            if (r0 == 0) goto L48
            boolean r2 = r0 instanceof p000.kl1
            if (r2 == 0) goto L3d
            r2 = r0
            kl1 r2 = (p000.kl1) r2
            f02 r2 = r2.f6021
            java.lang.Object r2 = r2.getValue()
            fl1 r2 = (p000.fl1) r2
            fl1 r3 = p000.fl1.f4006
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L3b
            goto L3d
        L3b:
            r2 = r1
            goto L3e
        L3d:
            r2 = r0
        L3e:
            if (r2 == 0) goto L49
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r11.f863 = r3
            goto L49
        L48:
            r0 = r1
        L49:
            if (r0 != 0) goto L1fa
            java.lang.ref.WeakReference r0 = r11.f863
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.get()
            un r0 = (p000.AbstractC0878un) r0
            if (r0 == 0) goto L6f
            boolean r2 = r0 instanceof p000.kl1
            if (r2 == 0) goto L70
            r2 = r0
            kl1 r2 = (p000.kl1) r2
            f02 r2 = r2.f6021
            java.lang.Object r2 = r2.getValue()
            fl1 r2 = (p000.fl1) r2
            fl1 r3 = p000.fl1.f4006
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L6f
            goto L70
        L6f:
            r0 = r1
        L70:
            if (r0 != 0) goto L1fa
            boolean r0 = r11.isAttachedToWindow()
            if (r0 != 0) goto L8e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot locate windowRecomposer; View "
            r0.<init>(r2)
            r0.append(r11)
            java.lang.String r2 = " is not attached to a window"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            p000.am0.m178(r0)
        L8e:
            android.view.ViewParent r0 = p000.p91.m4429(r11)
            r2 = r11
        L93:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto Lab
            android.view.View r0 = (android.view.View) r0
            int r3 = r0.getId()
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            if (r3 != r4) goto La3
            goto Lab
        La3:
            android.view.ViewParent r2 = r0.getParent()
            r10 = r2
            r2 = r0
            r0 = r10
            goto L93
        Lab:
            un r0 = p000.dd2.m1721(r2)
            if (r0 != 0) goto L1d2
            java.util.concurrent.atomic.AtomicReference r0 = p000.ad2.f192
            java.lang.Object r0 = r0.get()
            zc2 r0 = (p000.zc2) r0
            r0.getClass()
            hz r0 = p000.C0377hz.f4846
            h22 r3 = p000.C0345h3.f4544
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            if (r3 != r4) goto Ld3
            h22 r3 = p000.C0345h3.f4544
            java.lang.Object r3 = r3.getValue()
            up r3 = (p000.InterfaceC0880up) r3
            goto Ldd
        Ld3:
            f3 r3 = p000.C0345h3.f4545
            java.lang.Object r3 = r3.get()
            up r3 = (p000.InterfaceC0880up) r3
            if (r3 == 0) goto L1cc
        Ldd:
            up r3 = r3.mo1784(r0)
            xn0 r4 = p000.xn0.f12227
            sp r4 = r3.mo1785(r4)
            k3 r4 = (p000.C0455k3) r4
            r5 = 0
            if (r4 == 0) goto Lff
            k3 r6 = new k3
            r6.<init>(r4)
            java.lang.Object r4 = r6.f5723
            zz r4 = (p000.C1076zz) r4
            java.lang.Object r7 = r4.f13380
            monitor-enter(r7)
            r4.f13379 = r5     // Catch: java.lang.Throwable -> Lfc
            monitor-exit(r7)
            goto L100
        Lfc:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        Lff:
            r6 = r1
        L100:
            um1 r4 = new um1
            r4.<init>()
            xn0 r7 = p000.xn0.f12228
            sp r7 = r3.mo1785(r7)
            z01 r7 = (p000.z01) r7
            if (r7 != 0) goto L11e
            z01 r7 = new z01
            android.content.Context r8 = r2.getContext()
            android.content.Context r8 = r8.getApplicationContext()
            r7.<init>(r8)
            r4.f10912 = r7
        L11e:
            if (r6 == 0) goto L121
            r0 = r6
        L121:
            up r0 = r3.mo1784(r0)
            up r0 = r0.mo1784(r7)
            kl1 r3 = new kl1
            r3.<init>(r0)
            java.lang.Object r7 = r3.f6003
            monitor-enter(r7)
            r8 = 1
            r3.f6020 = r8     // Catch: java.lang.Throwable -> L1c9
            monitor-exit(r7)
            mp r0 = p000.AbstractC1021yh.m6873(r0)
            hr0 r7 = p000.v71.m6037(r2)
            if (r7 == 0) goto L144
            jr0 r7 = r7.mo192()
            goto L145
        L144:
            r7 = r1
        L145:
            if (r7 == 0) goto L1b2
            qi0 r9 = new qi0
            r9.<init>(r8, r2, r3)
            r2.addOnAttachStateChangeListener(r9)
            cd2 r9 = new cd2
            r9.<init>(r0, r6, r3, r4)
            r7.m2980(r9)
            r0 = 2131296321(0x7f090041, float:1.8210555E38)
            r2.setTag(r0, r3)
            android.os.Handler r0 = r2.getHandler()
            java.lang.String r4 = "windowRecomposer cleanup"
            int r6 = p000.oc0.f8027
            nc0 r6 = new nc0
            r6.<init>(r0, r4, r5)
            nc0 r0 = r6.f7516
            oe r4 = new oe
            r5 = 4
            r4.<init>(r3, r2, r1, r5)
            eq r5 = p000.EnumC0257eq.f3634
            r6 = 2
            r6 = r6 & r8
            if (r6 == 0) goto L17a
            hz r0 = p000.C0377hz.f4846
        L17a:
            r6 = 2
            r6 = r6 & r6
            if (r6 == 0) goto L180
            eq r5 = p000.EnumC0257eq.f3631
        L180:
            hz r6 = p000.C0377hz.f4846
            up r0 = p000.AbstractC0782s1.m5333(r6, r0, r8)
            jr r6 = p000.AbstractC0524lt.f6767
            if (r0 == r6) goto L196
            x r7 = p000.C0966x.f11916
            sp r7 = r0.mo1785(r7)
            if (r7 != 0) goto L196
            up r0 = r0.mo1784(r6)
        L196:
            eq r6 = p000.EnumC0257eq.f3632
            if (r5 != r6) goto L1a0
            pq0 r6 = new pq0
            r6.<init>(r0, r4)
            goto L1a5
        L1a0:
            xz1 r6 = new xz1
            r6.<init>(r0, r8)
        L1a5:
            r6.m7284(r5, r6, r4)
            k2 r0 = new k2
            r4 = 5
            r0.<init>(r4, r6)
            r2.addOnAttachStateChangeListener(r0)
            goto L1d9
        L1b2:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "ViewTreeLifecycleOwner not found from "
            r11.<init>(r0)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            p000.am0.m179(r11)
            pm r11 = new pm
            r11.<init>()
            throw r11
        L1c9:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L1cc:
            java.lang.String r11 = "no AndroidUiDispatcher for this thread"
            p000.C1080.m7279(r11)
            return r1
        L1d2:
            boolean r2 = r0 instanceof p000.kl1
            if (r2 == 0) goto L1f4
            r3 = r0
            kl1 r3 = (p000.kl1) r3
        L1d9:
            f02 r0 = r3.f6021
            java.lang.Object r0 = r0.getValue()
            fl1 r0 = (p000.fl1) r0
            fl1 r2 = p000.fl1.f4006
            int r0 = r0.compareTo(r2)
            if (r0 <= 0) goto L1ea
            r1 = r3
        L1ea:
            if (r1 == 0) goto L1f3
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r11.f863 = r0
        L1f3:
            return r3
        L1f4:
            java.lang.String r11 = "root viewTreeParentCompositionContext is not a Recomposer"
            p000.C1080.m7279(r11)
            return r1
        L1fa:
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public final p000.C0693pn m364(android.view.View r9, p000.C0693pn r10) {
            r8 = this;
            un r3 = r8.m363()
            hr0 r0 = p000.v71.m6037(r9)
            r92 r6 = p000.g81.m2274(r9)
            kq1 r1 = p000.e81.m1876(r9)
            un r2 = r10.f8597
            kq1 r4 = r10.f8599
            hr0 r5 = r10.f8598
            if (r3 != r2) goto L21
            if (r0 != r5) goto L21
            r92 r2 = r10.f8600
            if (r6 != r2) goto L21
            if (r1 != r4) goto L21
            return r10
        L21:
            up r2 = r3.mo3324()
            un r7 = r10.f8597
            up r7 = r7.mo3324()
            if (r2 == r7) goto L30
            r8.m358()
        L30:
            if (r0 != 0) goto L33
            r0 = r5
        L33:
            if (r1 != 0) goto L38
            r5 = r4
        L36:
            r4 = r0
            goto L3a
        L38:
            r5 = r1
            goto L36
        L3a:
            pn r0 = new pn
            r2 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            r8.<init>(r0)
            r9 = 2131296320(0x7f090040, float:1.8210553E38)
            r2.setTag(r9, r8)
            return r0
    }
}
