package p000;

/* JADX INFO: renamed from: l1 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0496l1 extends androidx.core.view.C0045 implements android.view.View.OnAttachStateChangeListener, android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: Ρ */
    public static final p000.m11 f6341 = null;

    /* JADX INFO: renamed from: Α */
    public boolean f6342;

    /* JADX INFO: renamed from: Β */
    public p000.C0306g1 f6343;

    /* JADX INFO: renamed from: Γ */
    public p000.n11 f6344;

    /* JADX INFO: renamed from: Δ */
    public final p000.o11 f6345;

    /* JADX INFO: renamed from: Ε */
    public final p000.l11 f6346;

    /* JADX INFO: renamed from: Ζ */
    public final p000.l11 f6347;

    /* JADX INFO: renamed from: Η */
    public final java.lang.String f6348;

    /* JADX INFO: renamed from: Θ */
    public final java.lang.String f6349;

    /* JADX INFO: renamed from: Ι */
    public final p000.C0538m6 f6350;

    /* JADX INFO: renamed from: Κ */
    public final p000.n11 f6351;

    /* JADX INFO: renamed from: Λ */
    public p000.cs1 f6352;

    /* JADX INFO: renamed from: Μ */
    public boolean f6353;

    /* JADX INFO: renamed from: Ν */
    public final p000.l11 f6354;

    /* JADX INFO: renamed from: Ξ */
    public final p000.RunnableC1090 f6355;

    /* JADX INFO: renamed from: Ο */
    public final java.util.ArrayList f6356;

    /* JADX INFO: renamed from: Π */
    public final p000.C0415j1 f6357;

    /* JADX INFO: renamed from: θ */
    public final androidx.compose.p001ui.platform.AndroidComposeView f6358;

    /* JADX INFO: renamed from: ι */
    public int f6359;

    /* JADX INFO: renamed from: κ */
    public final p000.C0415j1 f6360;

    /* JADX INFO: renamed from: λ */
    public final android.view.accessibility.AccessibilityManager f6361;

    /* JADX INFO: renamed from: μ */
    public long f6362;

    /* JADX INFO: renamed from: ν */
    public java.util.List f6363;

    /* JADX INFO: renamed from: ξ */
    public final p000.C0269f1 f6364;

    /* JADX INFO: renamed from: ο */
    public int f6365;

    /* JADX INFO: renamed from: π */
    public int f6366;

    /* JADX INFO: renamed from: ρ */
    public final p000.n11 f6367;

    /* JADX INFO: renamed from: σ */
    public final p000.n11 f6368;

    /* JADX INFO: renamed from: τ */
    public final p000.kz1 f6369;

    /* JADX INFO: renamed from: υ */
    public final p000.kz1 f6370;

    /* JADX INFO: renamed from: φ */
    public int f6371;

    /* JADX INFO: renamed from: χ */
    public java.lang.Integer f6372;

    /* JADX INFO: renamed from: ψ */
    public final p000.C0202d7 f6373;

    /* JADX INFO: renamed from: ω */
    public final p000.C0942wc f6374;

    static {
            r0 = 32
            int[] r1 = new int[r0]
            r1 = {x0046: FILL_ARRAY_DATA , data: [2131296263, 2131296264, 2131296275, 2131296286, 2131296289, 2131296290, 2131296291, 2131296292, 2131296293, 2131296294, 2131296265, 2131296266, 2131296267, 2131296268, 2131296269, 2131296270, 2131296271, 2131296272, 2131296273, 2131296274, 2131296276, 2131296277, 2131296278, 2131296279, 2131296280, 2131296281, 2131296282, 2131296283, 2131296284, 2131296285, 2131296287, 2131296288} // fill-array
            int r2 = p000.rm0.f9403
            m11 r2 = new m11
            r2.<init>(r0)
            int r3 = r2.f6888
            if (r3 < 0) goto L3f
            int r4 = r3 + 32
            int[] r5 = r2.f6887
            int r6 = r5.length
            if (r6 >= r4) goto L28
            int r6 = r5.length
            int r6 = r6 * 3
            int r6 = r6 / 2
            int r6 = java.lang.Math.max(r4, r6)
            int[] r5 = java.util.Arrays.copyOf(r5, r6)
            r2.f6887 = r5
        L28:
            int[] r5 = r2.f6887
            int r6 = r2.f6888
            if (r3 == r6) goto L31
            p000.AbstractC0312g7.m2235(r4, r3, r6, r5, r5)
        L31:
            r4 = 0
            r6 = 12
            p000.AbstractC0312g7.m2239(r3, r4, r6, r1, r5)
            int r1 = r2.f6888
            int r1 = r1 + r0
            r2.f6888 = r1
            p000.ViewOnAttachStateChangeListenerC0496l1.f6341 = r2
            return
        L3f:
            java.lang.String r0 = ""
            p000.C1080.m7269(r0)
            return
    }

    public ViewOnAttachStateChangeListenerC0496l1(androidx.compose.p001ui.platform.AndroidComposeView r6) {
            r5 = this;
            r5.<init>()
            r5.f6358 = r6
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5.f6359 = r0
            j1 r1 = new j1
            r2 = 0
            r1.<init>(r5, r2)
            r5.f6360 = r1
            android.content.Context r1 = r6.getContext()
            java.lang.String r3 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r3)
            r1.getClass()
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r5.f6361 = r1
            r3 = 100
            r5.f6362 = r3
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r1.<init>(r3)
            f1 r1 = new f1
            r1.<init>(r5)
            r5.f6364 = r1
            r5.f6365 = r0
            r5.f6366 = r0
            n11 r0 = new n11
            r0.<init>()
            r5.f6367 = r0
            n11 r0 = new n11
            r0.<init>()
            r5.f6368 = r0
            kz1 r0 = new kz1
            r0.<init>(r2)
            r5.f6369 = r0
            kz1 r0 = new kz1
            r0.<init>(r2)
            r5.f6370 = r0
            r0 = -1
            r5.f6371 = r0
            d7 r0 = new d7
            r0.<init>(r2)
            r5.f6373 = r0
            r0 = 6
            r1 = 1
            r2 = 0
            wc r0 = p000.ln0.m3619(r1, r2, r0)
            r5.f6374 = r0
            r5.f6342 = r1
            n11 r0 = p000.tm0.f10413
            r0.getClass()
            r5.f6344 = r0
            o11 r2 = new o11
            r2.<init>()
            r5.f6345 = r2
            l11 r2 = new l11
            r2.<init>()
            r5.f6346 = r2
            l11 r2 = new l11
            r2.<init>()
            r5.f6347 = r2
            java.lang.String r2 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"
            r5.f6348 = r2
            java.lang.String r2 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"
            r5.f6349 = r2
            m6 r2 = new m6
            r3 = 15
            r2.<init>(r3)
            r5.f6350 = r2
            n11 r2 = new n11
            r2.<init>()
            r5.f6351 = r2
            cs1 r2 = new cs1
            es1 r3 = r6.getSemanticsOwner()
            bs1 r3 = r3.m1953()
            r2.<init>(r3, r0)
            r5.f6352 = r2
            int r0 = p000.qm0.f9049
            l11 r0 = new l11
            r0.<init>()
            r5.f6354 = r0
            r6.addOnAttachStateChangeListener(r5)
            ν r6 = new ν
            r6.<init>(r1, r5)
            r5.f6355 = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.f6356 = r6
            j1 r6 = new j1
            r6.<init>(r5, r1)
            r5.f6357 = r6
            return
    }

    /* JADX INFO: renamed from: Γ */
    public static /* synthetic */ void m3434(p000.ViewOnAttachStateChangeListenerC0496l1 r1, int r2, int r3, java.lang.Integer r4, int r5) {
            r5 = r5 & 4
            r0 = 0
            if (r5 == 0) goto L6
            r4 = r0
        L6:
            r1.m3441(r2, r3, r4, r0)
            return
    }

    /* JADX INFO: renamed from: Ι */
    public static android.graphics.Rect m3435(p000.u81 r4, float r5, float r6) {
            boolean r0 = r4 instanceof p000.s81
            if (r0 != 0) goto Lb
            boolean r0 = r4 instanceof p000.t81
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r4 = 0
            return r4
        Lb:
            ml1 r4 = r4.mo5068()
            android.graphics.Rect r0 = new android.graphics.Rect
            float r1 = r4.f7200
            float r1 = r1 + r5
            int r1 = (int) r1
            float r2 = r4.f7201
            float r2 = r2 + r6
            int r2 = (int) r2
            float r3 = r4.f7202
            float r3 = r3 + r5
            int r5 = (int) r3
            float r4 = r4.f7203
            float r4 = r4 + r6
            int r4 = (int) r4
            r0.<init>(r1, r2, r5, r4)
            return r0
    }

    /* JADX INFO: renamed from: Λ */
    public static float[] m3436(p000.u81 r13) {
            boolean r0 = r13 instanceof p000.t81
            if (r0 == 0) goto L68
            t81 r13 = (p000.t81) r13
            wo1 r13 = r13.f10247
            long r0 = r13.f11795
            long r2 = r13.f11794
            long r4 = r13.f11793
            long r6 = r13.f11792
            r13 = 32
            long r8 = r6 >> r13
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r9
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r11 = r4 >> r13
            int r7 = (int) r11
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r4 = r4 & r9
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r11 = r2 >> r13
            int r5 = (int) r11
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r2 = r2 & r9
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r11 = r0 >> r13
            int r13 = (int) r11
            float r13 = java.lang.Float.intBitsToFloat(r13)
            long r0 = r0 & r9
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 8
            float[] r1 = new float[r1]
            r3 = 0
            r1[r3] = r8
            r3 = 1
            r1[r3] = r6
            r3 = 2
            r1[r3] = r7
            r3 = 3
            r1[r3] = r4
            r3 = 4
            r1[r3] = r5
            r3 = 5
            r1[r3] = r2
            r2 = 6
            r1[r2] = r13
            r13 = 7
            r1[r13] = r0
            return r1
        L68:
            r13 = 0
            return r13
    }

    /* JADX INFO: renamed from: Μ */
    public static android.graphics.Region m3437(p000.u81 r7, float r8, float r9) {
            boolean r0 = r7 instanceof p000.r81
            if (r0 == 0) goto L47
            android.graphics.Region r0 = new android.graphics.Region
            r81 r7 = (p000.r81) r7
            ml1 r1 = r7.mo5068()
            ml1 r1 = r1.m3869(r8, r9)
            android.graphics.Rect r2 = new android.graphics.Rect
            float r3 = r1.f7200
            r4 = 0
            float r3 = r3 + r4
            int r3 = (int) r3
            float r5 = r1.f7201
            float r5 = r5 + r4
            int r5 = (int) r5
            float r6 = r1.f7202
            float r6 = r6 + r4
            int r6 = (int) r6
            float r1 = r1.f7203
            float r1 = r1 + r4
            int r1 = (int) r1
            r2.<init>(r3, r5, r6, r1)
            r0.<init>(r2)
            android.graphics.Region r1 = new android.graphics.Region
            r1.<init>()
            z91 r7 = r7.f9289
            boolean r2 = r7 instanceof p000.C0969x2
            if (r2 == 0) goto L3f
            x2 r7 = (p000.C0969x2) r7
            android.graphics.Path r7 = r7.f11999
            r7.offset(r8, r9)
            r1.setPath(r7, r0)
            return r1
        L3f:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "Unable to obtain android.graphics.Path"
            r7.<init>(r8)
            throw r7
        L47:
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: Ν */
    public static java.lang.CharSequence m3438(java.lang.CharSequence r3) {
            int r0 = r3.length()
            if (r0 != 0) goto L7
            goto L10
        L7:
            int r0 = r3.length()
            r1 = 100000(0x186a0, float:1.4013E-40)
            if (r0 > r1) goto L11
        L10:
            return r3
        L11:
            r0 = 99999(0x1869f, float:1.40128E-40)
            char r2 = r3.charAt(r0)
            boolean r2 = java.lang.Character.isHighSurrogate(r2)
            if (r2 == 0) goto L29
            char r2 = r3.charAt(r1)
            boolean r2 = java.lang.Character.isLowSurrogate(r2)
            if (r2 == 0) goto L29
            r1 = r0
        L29:
            r0 = 0
            java.lang.CharSequence r3 = r3.subSequence(r0, r1)
            r3.getClass()
            return r3
    }

    /* JADX INFO: renamed from: τ */
    public static java.lang.String m3439(p000.bs1 r4) {
            r0 = 0
            if (r4 != 0) goto L4
            goto L4d
        L4:
            xr1 r4 = r4.f1824
            b21 r1 = r4.f12268
            is1 r2 = p000.fs1.f4098
            boolean r3 = r1.m691(r2)
            if (r3 == 0) goto L1f
            java.lang.Object r4 = r4.m6780(r2)
            java.util.List r4 = (java.util.List) r4
            java.lang.String r1 = ","
            r2 = 62
            java.lang.String r4 = p000.hu0.m2541(r4, r1, r0, r2)
            return r4
        L1f:
            is1 r4 = p000.fs1.f4089
            boolean r2 = r1.m691(r4)
            if (r2 == 0) goto L35
            java.lang.Object r4 = r1.m695(r4)
            if (r4 != 0) goto L2e
            r4 = r0
        L2e:
            g4 r4 = (p000.C0309g4) r4
            if (r4 == 0) goto L4d
            java.lang.String r4 = r4.f4228
            return r4
        L35:
            is1 r4 = p000.fs1.f4085
            java.lang.Object r4 = r1.m695(r4)
            if (r4 != 0) goto L3e
            r4 = r0
        L3e:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L4d
            java.lang.Object r4 = p000.AbstractC0984xh.m6640(r4)
            g4 r4 = (p000.C0309g4) r4
            if (r4 == 0) goto L4d
            java.lang.String r4 = r4.f4228
            return r4
        L4d:
            return r0
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean r1) {
            r0 = this;
            r1 = 0
            r0.f6363 = r1
            return
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean r1) {
            r0 = this;
            r1 = 0
            r0.f6363 = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityManager r2 = r1.f6361
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto Lb
            r0 = 0
            r1.f6363 = r0
        Lb:
            r2.addAccessibilityStateChangeListener(r1)
            r2.addTouchExplorationStateChangeListener(r1)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            androidx.compose.ui.platform.AndroidComposeView r2 = r1.f6358
            android.os.Handler r2 = r2.getHandler()
            r2.getClass()
            ν r0 = r1.f6355
            r2.removeCallbacks(r0)
            android.view.accessibility.AccessibilityManager r2 = r1.f6361
            r2.removeAccessibilityStateChangeListener(r1)
            r2.removeTouchExplorationStateChangeListener(r1)
            return
    }

    /* JADX INFO: renamed from: Α */
    public final boolean m3440(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            boolean r0 = r2.m3459()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            int r0 = r3.getEventType()
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 == r1) goto L17
            int r0 = r3.getEventType()
            r1 = 32768(0x8000, float:4.5918E-41)
        L17:
            j1 r2 = r2.f6360     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.invoke(r3)     // Catch: java.lang.Throwable -> L24
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L24
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L24
            return r2
        L24:
            r2 = move-exception
            throw r2
    }

    /* JADX INFO: renamed from: Β */
    public final boolean m3441(int r2, int r3, java.lang.Integer r4, java.util.List r5) {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L2b
            boolean r0 = r1.m3459()
            if (r0 != 0) goto Lb
            goto L2b
        Lb:
            android.view.accessibility.AccessibilityEvent r2 = r1.m3453(r2, r3)
            if (r4 == 0) goto L18
            int r3 = r4.intValue()
            r2.setContentChangeTypes(r3)
        L18:
            if (r5 == 0) goto L26
            r3 = 0
            r4 = 62
            java.lang.String r0 = ","
            java.lang.String r3 = p000.hu0.m2541(r5, r0, r3, r4)
            r2.setContentDescription(r3)
        L26:
            boolean r1 = r1.m3440(r2)
            return r1
        L2b:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: Δ */
    public final void m3442(int r2, int r3, java.lang.String r4) {
            r1 = this;
            int r2 = r1.m3461(r2)
            r0 = 32
            android.view.accessibility.AccessibilityEvent r2 = r1.m3453(r2, r0)
            r2.setContentChangeTypes(r3)
            if (r4 == 0) goto L16
            java.util.List r3 = r2.getText()
            r3.add(r4)
        L16:
            r1.m3440(r2)
            return
    }

    /* JADX INFO: renamed from: Ε */
    public final void m3443(int r7) {
            r6 = this;
            g1 r0 = r6.f6343
            if (r0 == 0) goto L46
            bs1 r1 = r0.f4185
            int r2 = r1.f1826
            if (r7 == r2) goto Lb
            return
        Lb:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r4 = r0.f4190
            long r2 = r2 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L46
            int r7 = r1.f1826
            int r7 = r6.m3461(r7)
            r2 = 131072(0x20000, float:1.83671E-40)
            android.view.accessibility.AccessibilityEvent r7 = r6.m3453(r7, r2)
            int r2 = r0.f4188
            r7.setFromIndex(r2)
            int r2 = r0.f4189
            r7.setToIndex(r2)
            int r2 = r0.f4186
            r7.setAction(r2)
            int r0 = r0.f4187
            r7.setMovementGranularity(r0)
            java.util.List r0 = r7.getText()
            java.lang.String r1 = m3439(r1)
            r0.add(r1)
            r6.m3440(r7)
        L46:
            r7 = 0
            r6.f6343 = r7
            return
    }

    /* JADX INFO: renamed from: Ζ */
    public final void m3444(p000.sm0 r57) {
            r56 = this;
            r0 = r56
            r6 = r57
            r1 = 64
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList r9 = r0.f6356
            r8.<init>(r9)
            r9.clear()
            int[] r10 = r6.f9963
            long[] r11 = r6.f9962
            int r1 = r11.length
            r12 = 2
            int r13 = r1 + (-2)
            r14 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            if (r13 < 0) goto L686
            r15 = r14
        L24:
            r3 = r11[r15]
            r16 = r12
            r17 = r13
            long r12 = ~r3
            r18 = 7
            long r12 = r12 << r18
            long r12 = r12 & r3
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r19
            int r1 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r1 == 0) goto L665
            int r1 = r15 - r17
            int r1 = ~r1
            int r1 = r1 >>> 31
            r12 = 8
            int r13 = 8 - r1
            r21 = r3
            r1 = r14
        L47:
            if (r1 >= r13) goto L64f
            r23 = 255(0xff, double:1.26E-321)
            long r3 = r21 & r23
            r25 = 128(0x80, double:6.3E-322)
            int r3 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r3 >= 0) goto L627
            int r3 = r15 << 3
            int r3 = r3 + r1
            r3 = r10[r3]
            n11 r4 = r0.f6351
            java.lang.Object r4 = r4.m5525(r3)
            cs1 r4 = (p000.cs1) r4
            if (r4 != 0) goto L64
            goto L627
        L64:
            xr1 r4 = r4.f2737
            b21 r5 = r4.f12268
            java.lang.Object r27 = r6.m5525(r3)
            r14 = r27
            ds1 r14 = (p000.ds1) r14
            r27 = r12
            if (r14 == 0) goto L77
            bs1 r14 = r14.f3268
            goto L78
        L77:
            r14 = 0
        L78:
            if (r14 == 0) goto L620
            yp0 r12 = r14.f1823
            xr1 r6 = r14.f1824
            r29 = r10
            int r10 = r14.f1826
            r30 = r11
            b21 r11 = r6.f12268
            r31 = r15
            java.lang.Object[] r15 = r11.f1428
            r32 = r15
            java.lang.Object[] r15 = r11.f1429
            r33 = r15
            long[] r15 = r11.f1427
            r34 = r1
            int r1 = r15.length
            int r1 = r1 + (-2)
            r35 = r15
            if (r1 < 0) goto L5d4
            r40 = r12
            r39 = r13
            r15 = 0
            r38 = 0
        La2:
            r12 = r35[r15]
            r41 = r14
            r42 = r15
            long r14 = ~r12
            long r14 = r14 << r18
            long r14 = r14 & r12
            long r14 = r14 & r19
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 == 0) goto L5ad
            int r15 = r42 - r1
            int r14 = ~r15
            int r14 = r14 >>> 31
            int r14 = 8 - r14
            r15 = 0
        Lba:
            if (r15 >= r14) goto L596
            long r43 = r12 & r23
            int r43 = (r43 > r25 ? 1 : (r43 == r25 ? 0 : -1))
            if (r43 >= 0) goto L568
            int r43 = r42 << 3
            int r43 = r43 + r15
            r44 = r32[r43]
            r45 = r1
            r1 = r33[r43]
            r43 = r4
            r4 = r44
            is1 r4 = (p000.is1) r4
            r46 = r12
            is1 r12 = p000.fs1.f4118
            boolean r13 = p000.ln0.m3626(r4, r12)
            if (r13 != 0) goto Le9
            is1 r13 = p000.fs1.f4119
            boolean r13 = p000.ln0.m3626(r4, r13)
            if (r13 == 0) goto Le5
            goto Le9
        Le5:
            r44 = r15
            r15 = 0
            goto L11a
        Le9:
            int r13 = r8.size()
            r44 = r15
            r15 = 0
        Lf0:
            if (r15 >= r13) goto L10c
            java.lang.Object r48 = r8.get(r15)
            r49 = r13
            r13 = r48
            br1 r13 = (p000.br1) r13
            int r13 = r13.f1818
            if (r13 != r3) goto L107
            java.lang.Object r13 = r8.get(r15)
            br1 r13 = (p000.br1) r13
            goto L10d
        L107:
            int r15 = r15 + 1
            r13 = r49
            goto Lf0
        L10c:
            r13 = 0
        L10d:
            if (r13 == 0) goto L111
            r15 = 0
            goto L117
        L111:
            br1 r13 = new br1
            r13.<init>(r3, r9)
            r15 = 1
        L117:
            r9.add(r13)
        L11a:
            if (r15 != 0) goto L13b
            java.lang.Object r13 = r5.m695(r4)
            if (r13 != 0) goto L123
            r13 = 0
        L123:
            boolean r13 = p000.ln0.m3626(r1, r13)
            if (r13 == 0) goto L13b
        L129:
            r13 = r3
            r53 = r7
            r48 = r8
            r28 = r14
            r15 = r40
            r7 = r45
            r3 = 0
            r37 = 1
            r8 = r2
            r14 = r5
            goto L55d
        L13b:
            is1 r13 = p000.fs1.f4101
            boolean r15 = p000.ln0.m3626(r4, r13)
            if (r15 == 0) goto L154
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = r5.m691(r13)
            r13 = r27
            if (r4 == 0) goto L129
            r0.m3442(r3, r13, r1)
            goto L129
        L154:
            r13 = r27
            is1 r15 = p000.fs1.f4099
            boolean r15 = p000.ln0.m3626(r4, r15)
            if (r15 == 0) goto L16f
            int r1 = r0.m3461(r3)
            r15 = 2048(0x800, float:2.87E-42)
            m3434(r0, r1, r15, r7, r13)
            int r1 = r0.m3461(r3)
            m3434(r0, r1, r15, r2, r13)
            goto L129
        L16f:
            r15 = 2048(0x800, float:2.87E-42)
            is1 r13 = p000.fs1.f4092
            boolean r13 = p000.ln0.m3626(r4, r13)
            if (r13 == 0) goto L190
            int r1 = r0.m3461(r3)
            r4 = 8192(0x2000, float:1.148E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13 = 8
            m3434(r0, r1, r15, r4, r13)
            int r1 = r0.m3461(r3)
            m3434(r0, r1, r15, r2, r13)
            goto L129
        L190:
            is1 r13 = p000.fs1.f4094
            boolean r13 = p000.ln0.m3626(r4, r13)
            if (r13 == 0) goto L1a8
            int r1 = r0.m3461(r3)
            r4 = 3072(0xc00, float:4.305E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13 = 8
            m3434(r0, r1, r15, r4, r13)
            goto L129
        L1a8:
            is1 r13 = p000.fs1.f4100
            boolean r13 = p000.ln0.m3626(r4, r13)
            if (r13 == 0) goto L1c2
            int r1 = r0.m3461(r3)
            r13 = 8
            m3434(r0, r1, r15, r7, r13)
            int r1 = r0.m3461(r3)
            m3434(r0, r1, r15, r2, r13)
            goto L129
        L1c2:
            is1 r13 = p000.fs1.f4091
            boolean r15 = p000.ln0.m3626(r4, r13)
            r48 = r8
            r8 = 4
            if (r15 == 0) goto L28d
            is1 r1 = p000.fs1.f4120
            java.lang.Object r1 = r11.m695(r1)
            if (r1 != 0) goto L1d6
            r1 = 0
        L1d6:
            so1 r1 = (p000.so1) r1
            if (r1 != 0) goto L1dc
        L1da:
            r1 = 0
            goto L1e1
        L1dc:
            int r1 = r1.f9982
            if (r1 != r8) goto L1da
            r1 = 1
        L1e1:
            if (r1 == 0) goto L26a
            java.lang.Object r1 = r11.m695(r13)
            if (r1 != 0) goto L1ea
            r1 = 0
        L1ea:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r1, r4)
            if (r1 == 0) goto L259
            int r1 = r0.m3461(r3)
            android.view.accessibility.AccessibilityEvent r1 = r0.m3453(r1, r8)
            bs1 r4 = new bs1
            r13 = r41
            q01 r8 = r13.f1821
            r15 = r40
            r12 = 1
            r4.<init>(r8, r12, r15, r6)
            xr1 r8 = r4.m1015()
            is1 r12 = p000.fs1.f4098
            b21 r8 = r8.f12268
            java.lang.Object r8 = r8.m695(r12)
            if (r8 != 0) goto L215
            r8 = 0
        L215:
            java.util.List r8 = (java.util.List) r8
            r12 = 62
            r40 = r4
            java.lang.String r4 = ","
            r41 = r13
            r13 = 0
            if (r8 == 0) goto L227
            java.lang.String r8 = p000.hu0.m2541(r8, r4, r13, r12)
            r13 = r8
        L227:
            xr1 r8 = r40.m1015()
            is1 r12 = p000.fs1.f4085
            b21 r8 = r8.f12268
            java.lang.Object r8 = r8.m695(r12)
            if (r8 != 0) goto L236
            r8 = 0
        L236:
            java.util.List r8 = (java.util.List) r8
            r28 = r14
            r12 = 0
            if (r8 == 0) goto L244
            r14 = 62
            java.lang.String r4 = p000.hu0.m2541(r8, r4, r12, r14)
            goto L245
        L244:
            r4 = r12
        L245:
            if (r13 == 0) goto L24a
            r1.setContentDescription(r13)
        L24a:
            if (r4 == 0) goto L253
            java.util.List r8 = r1.getText()
            r8.add(r4)
        L253:
            r0.m3440(r1)
            r13 = 2048(0x800, float:2.87E-42)
            goto L281
        L259:
            r28 = r14
            r15 = r40
            r12 = 0
            int r1 = r0.m3461(r3)
            r4 = 8
            r13 = 2048(0x800, float:2.87E-42)
            m3434(r0, r1, r13, r2, r4)
            goto L281
        L26a:
            r28 = r14
            r15 = r40
            r4 = 8
            r12 = 0
            r13 = 2048(0x800, float:2.87E-42)
            int r1 = r0.m3461(r3)
            m3434(r0, r1, r13, r7, r4)
            int r1 = r0.m3461(r3)
            m3434(r0, r1, r13, r2, r4)
        L281:
            r8 = r2
            r13 = r3
            r14 = r5
            r53 = r7
        L286:
            r7 = r45
        L288:
            r3 = 0
            r37 = 1
            goto L55d
        L28d:
            r36 = r8
            r28 = r14
            r15 = r40
            r13 = 2048(0x800, float:2.87E-42)
            r14 = 0
            is1 r8 = p000.fs1.f4098
            boolean r8 = p000.ln0.m3626(r4, r8)
            if (r8 == 0) goto L2af
            int r4 = r0.m3461(r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r36)
            r1.getClass()
            java.util.List r1 = (java.util.List) r1
            r0.m3441(r4, r13, r8, r1)
            goto L281
        L2af:
            is1 r8 = p000.fs1.f4089
            boolean r13 = p000.ln0.m3626(r4, r8)
            r49 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r40 = 32
            java.lang.String r51 = ""
            if (r13 == 0) goto L3d4
            is1 r1 = p000.wr1.f11821
            boolean r1 = r11.m691(r1)
            if (r1 == 0) goto L3c0
            java.lang.Object r13 = r5.m695(r8)
            if (r13 != 0) goto L2cf
            r13 = r14
        L2cf:
            g4 r13 = (p000.C0309g4) r13
            if (r13 == 0) goto L2d4
            goto L2d6
        L2d4:
            r13 = r51
        L2d6:
            java.lang.Object r1 = r11.m695(r8)
            if (r1 != 0) goto L2dd
            r1 = r14
        L2dd:
            g4 r1 = (p000.C0309g4) r1
            if (r1 == 0) goto L2e2
            goto L2e4
        L2e2:
            r1 = r51
        L2e4:
            java.lang.CharSequence r4 = m3438(r1)
            int r8 = r13.length()
            int r12 = r1.length()
            if (r8 <= r12) goto L2f4
            r14 = r12
            goto L2f5
        L2f4:
            r14 = r8
        L2f5:
            r52 = r2
            r2 = 0
        L2f8:
            r53 = r7
            if (r2 >= r14) goto L310
            char r7 = r13.charAt(r2)
            r51 = r8
            char r8 = r1.charAt(r2)
            if (r7 == r8) goto L309
            goto L312
        L309:
            int r2 = r2 + 1
            r8 = r51
            r7 = r53
            goto L2f8
        L310:
            r51 = r8
        L312:
            r7 = 0
        L313:
            int r8 = r14 - r2
            if (r7 >= r8) goto L32e
            int r8 = r51 + (-1)
            int r8 = r8 - r7
            char r8 = r13.charAt(r8)
            int r54 = r12 + (-1)
            r55 = r7
            int r7 = r54 - r55
            char r7 = r1.charAt(r7)
            if (r8 == r7) goto L32b
            goto L330
        L32b:
            int r7 = r55 + 1
            goto L313
        L32e:
            r55 = r7
        L330:
            int r8 = r51 - r55
            int r8 = r8 - r2
            int r1 = r12 - r55
            int r1 = r1 - r2
            is1 r7 = p000.fs1.f4093
            boolean r14 = r5.m691(r7)
            boolean r7 = r11.m691(r7)
            r51 = r7
            is1 r7 = p000.fs1.f4089
            boolean r7 = r5.m691(r7)
            if (r7 == 0) goto L351
            if (r14 != 0) goto L351
            if (r51 == 0) goto L351
            r54 = 1
            goto L353
        L351:
            r54 = 0
        L353:
            if (r7 == 0) goto L35b
            if (r14 == 0) goto L35b
            if (r51 != 0) goto L35b
            r7 = 1
            goto L35c
        L35b:
            r7 = 0
        L35c:
            if (r54 != 0) goto L383
            if (r7 == 0) goto L361
            goto L383
        L361:
            int r12 = r0.m3461(r3)
            r14 = 16
            android.view.accessibility.AccessibilityEvent r12 = r0.m3453(r12, r14)
            r12.setFromIndex(r2)
            r12.setRemovedCount(r8)
            r12.setAddedCount(r1)
            r12.setBeforeText(r13)
            java.util.List r1 = r12.getText()
            r1.add(r4)
            r13 = r3
            r14 = r5
            r2 = r52
            goto L398
        L383:
            int r1 = r0.m3461(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r8 = r3
            r3 = r52
            r14 = r5
            r13 = r8
            r5 = r4
            r4 = r2
            r2 = r52
            android.view.accessibility.AccessibilityEvent r12 = r0.m3454(r1, r2, r3, r4, r5)
        L398:
            java.lang.String r1 = "android.widget.EditText"
            r12.setClassName(r1)
            r0.m3440(r12)
            if (r54 != 0) goto L3a4
            if (r7 == 0) goto L3bd
        L3a4:
            is1 r1 = p000.fs1.f4090
            java.lang.Object r1 = r6.m6780(r1)
            r32 r1 = (p000.r32) r1
            long r3 = r1.f9254
            long r7 = r3 >> r40
            int r1 = (int) r7
            r12.setFromIndex(r1)
            long r3 = r3 & r49
            int r1 = (int) r3
            r12.setToIndex(r1)
            r0.m3440(r12)
        L3bd:
            r8 = r2
            goto L286
        L3c0:
            r13 = r3
            r14 = r5
            r53 = r7
            int r1 = r0.m3461(r13)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r4 = 2048(0x800, float:2.87E-42)
            r5 = 8
            m3434(r0, r1, r4, r3, r5)
            goto L3bd
        L3d4:
            r13 = r3
            r14 = r5
            r53 = r7
            r7 = r45
            is1 r3 = p000.fs1.f4090
            boolean r5 = p000.ln0.m3626(r4, r3)
            if (r5 == 0) goto L42e
            java.lang.Object r1 = r11.m695(r8)
            if (r1 != 0) goto L3e9
            r1 = 0
        L3e9:
            g4 r1 = (p000.C0309g4) r1
            if (r1 == 0) goto L3f4
            java.lang.String r1 = r1.f4228
            if (r1 != 0) goto L3f2
            goto L3f4
        L3f2:
            r51 = r1
        L3f4:
            java.lang.Object r1 = r6.m6780(r3)
            r32 r1 = (p000.r32) r1
            long r3 = r1.f9254
            int r1 = r0.m3461(r13)
            r5 = r1
            long r0 = r3 >> r40
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            long r3 = r3 & r49
            int r1 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r1 = r51.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.CharSequence r1 = m3438(r51)
            r8 = r5
            r5 = r1
            r1 = r8
            r8 = r2
            r2 = r0
            r0 = r56
            android.view.accessibility.AccessibilityEvent r1 = r0.m3454(r1, r2, r3, r4, r5)
            r0.m3440(r1)
            r0.m3443(r10)
            goto L288
        L42e:
            r8 = r2
            boolean r2 = p000.ln0.m3626(r4, r12)
            if (r2 != 0) goto L43d
            is1 r2 = p000.fs1.f4119
            boolean r2 = p000.ln0.m3626(r4, r2)
            if (r2 == 0) goto L442
        L43d:
            r3 = 0
            r37 = 1
            goto L50c
        L442:
            is1 r2 = p000.fs1.f4109
            boolean r2 = p000.ln0.m3626(r4, r2)
            if (r2 == 0) goto L470
            r1.getClass()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L463
            int r1 = r0.m3461(r10)
            r4 = 8
            android.view.accessibility.AccessibilityEvent r1 = r0.m3453(r1, r4)
            r0.m3440(r1)
            goto L465
        L463:
            r4 = 8
        L465:
            int r1 = r0.m3461(r10)
            r2 = 2048(0x800, float:2.87E-42)
            m3434(r0, r1, r2, r8, r4)
            goto L288
        L470:
            is1 r2 = p000.wr1.f11833
            boolean r3 = p000.ln0.m3626(r4, r2)
            if (r3 == 0) goto L4d0
            java.lang.Object r1 = r6.m6780(r2)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r14.m695(r2)
            if (r2 != 0) goto L485
            r2 = 0
        L485:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L4c3
            int r3 = p000.uq1.f10933
            c21 r3 = new c21
            r3.<init>()
            int r4 = r1.size()
            if (r4 > 0) goto L4b7
            c21 r1 = new c21
            r1.<init>()
            int r4 = r2.size()
            if (r4 > 0) goto L4ab
            boolean r1 = r3.equals(r1)
            r37 = 1
            r38 = r1 ^ 1
            goto L57c
        L4ab:
            r3 = 0
            java.lang.Object r0 = r2.get(r3)
            r0.getClass()
            p000.C1080.m7264()
            return
        L4b7:
            r3 = 0
            java.lang.Object r0 = r1.get(r3)
            r0.getClass()
            p000.C1080.m7264()
            return
        L4c3:
            r3 = 0
            r37 = 1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L55d
        L4cc:
            r38 = r37
            goto L55d
        L4d0:
            r3 = 0
            r37 = 1
            boolean r2 = r1 instanceof p000.C1114
            if (r2 == 0) goto L4cc
            м r1 = (p000.C1114) r1
            java.lang.Object r2 = r14.m695(r4)
            if (r2 != 0) goto L4e0
            r2 = 0
        L4e0:
            if (r1 != r2) goto L4e3
            goto L504
        L4e3:
            boolean r4 = r2 instanceof p000.C1114
            if (r4 != 0) goto L4e8
            goto L502
        L4e8:
            java.lang.String r4 = r1.f13446
            м r2 = (p000.C1114) r2
            m80 r5 = r2.f13447
            java.lang.String r2 = r2.f13446
            boolean r2 = p000.ln0.m3626(r4, r2)
            if (r2 != 0) goto L4f7
            goto L502
        L4f7:
            m80 r1 = r1.f13447
            if (r1 != 0) goto L4fe
            if (r5 == 0) goto L4fe
            goto L502
        L4fe:
            if (r1 == 0) goto L504
            if (r5 != 0) goto L504
        L502:
            r12 = r3
            goto L506
        L504:
            r12 = r37
        L506:
            if (r12 != 0) goto L509
            goto L4cc
        L509:
            r38 = r3
            goto L55d
        L50c:
            r0.m3460(r15)
            int r1 = r9.size()
            r2 = r3
        L514:
            if (r2 >= r1) goto L52a
            java.lang.Object r4 = r9.get(r2)
            br1 r4 = (p000.br1) r4
            int r4 = r4.f1818
            if (r4 != r13) goto L527
            java.lang.Object r1 = r9.get(r2)
            br1 r1 = (p000.br1) r1
            goto L52b
        L527:
            int r2 = r2 + 1
            goto L514
        L52a:
            r1 = 0
        L52b:
            r1.getClass()
            java.lang.Object r2 = r11.m695(r12)
            if (r2 != 0) goto L535
            r2 = 0
        L535:
            if (r2 != 0) goto L564
            is1 r2 = p000.fs1.f4119
            java.lang.Object r2 = r11.m695(r2)
            if (r2 != 0) goto L540
            r2 = 0
        L540:
            if (r2 != 0) goto L560
            java.util.List r2 = r1.f1819
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L54b
            goto L55d
        L54b:
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.f6358
            y81 r2 = r2.getSnapshotObserver()
            k1 r4 = new k1
            r4.<init>(r1, r0)
            kx1 r2 = r2.f12491
            j1 r5 = r0.f6357
            r2.m3425(r1, r5, r4)
        L55d:
            r4 = 8
            goto L57e
        L560:
            p000.C1080.m7264()
            return
        L564:
            p000.C1080.m7264()
            return
        L568:
            r43 = r4
            r53 = r7
            r48 = r8
            r46 = r12
            r28 = r14
            r44 = r15
            r15 = r40
            r37 = 1
            r7 = r1
            r8 = r2
            r13 = r3
            r14 = r5
        L57c:
            r3 = 0
            goto L55d
        L57e:
            long r1 = r46 >> r4
            int r5 = r44 + 1
            r27 = r4
            r3 = r13
            r40 = r15
            r4 = r43
            r12 = r1
            r15 = r5
            r1 = r7
            r2 = r8
            r5 = r14
            r14 = r28
            r8 = r48
            r7 = r53
            goto Lba
        L596:
            r13 = r3
            r43 = r4
            r53 = r7
            r48 = r8
            r12 = r14
            r4 = r27
            r15 = r40
            r3 = 0
            r37 = 1
            r7 = r1
            r8 = r2
            r14 = r5
            if (r12 != r4) goto L5e5
        L5aa:
            r1 = r42
            goto L5bd
        L5ad:
            r13 = r3
            r43 = r4
            r14 = r5
            r53 = r7
            r48 = r8
            r15 = r40
            r3 = 0
            r37 = 1
            r7 = r1
            r8 = r2
            goto L5aa
        L5bd:
            if (r1 == r7) goto L5e5
            int r1 = r1 + 1
            r2 = r8
            r3 = r13
            r5 = r14
            r40 = r15
            r14 = r41
            r4 = r43
            r8 = r48
            r27 = 8
            r15 = r1
            r1 = r7
            r7 = r53
            goto La2
        L5d4:
            r43 = r4
            r53 = r7
            r48 = r8
            r39 = r13
            r41 = r14
            r37 = 1
            r8 = r2
            r13 = r3
            r3 = 0
            r38 = r3
        L5e5:
            if (r38 != 0) goto L60f
            java.util.Iterator r1 = r43.iterator()
        L5eb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L60c
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            xr1 r4 = r41.m1015()
            java.lang.Object r2 = r2.getKey()
            is1 r2 = (p000.is1) r2
            b21 r4 = r4.f12268
            boolean r2 = r4.m691(r2)
            if (r2 != 0) goto L5eb
            r15 = r37
            goto L60d
        L60c:
            r15 = r3
        L60d:
            r38 = r15
        L60f:
            if (r38 == 0) goto L61d
            int r1 = r0.m3461(r13)
            r13 = 8
            r15 = 2048(0x800, float:2.87E-42)
            m3434(r0, r1, r15, r8, r13)
            goto L638
        L61d:
            r13 = 8
            goto L638
        L620:
            java.lang.String r0 = "no value for specified key"
            pm r0 = p000.lz1.m3680(r0)
            throw r0
        L627:
            r34 = r1
            r53 = r7
            r48 = r8
            r29 = r10
            r30 = r11
            r39 = r13
            r3 = r14
            r31 = r15
            r8 = r2
            r13 = r12
        L638:
            long r21 = r21 >> r13
            int r1 = r34 + 1
            r6 = r57
            r14 = r3
            r2 = r8
            r12 = r13
            r10 = r29
            r11 = r30
            r15 = r31
            r13 = r39
            r8 = r48
            r7 = r53
            goto L47
        L64f:
            r3 = r13
            r13 = r12
            r12 = r3
            r53 = r7
            r48 = r8
            r29 = r10
            r30 = r11
            r3 = r14
            r31 = r15
            r8 = r2
            if (r12 != r13) goto L686
            r14 = r31
        L662:
            r1 = r17
            goto L671
        L665:
            r53 = r7
            r48 = r8
            r29 = r10
            r30 = r11
            r3 = r14
            r8 = r2
            r14 = r15
            goto L662
        L671:
            if (r14 == r1) goto L686
            int r15 = r14 + 1
            r6 = r57
            r13 = r1
            r14 = r3
            r2 = r8
            r12 = r16
            r10 = r29
            r11 = r30
            r8 = r48
            r7 = r53
            goto L24
        L686:
            return
    }

    /* JADX INFO: renamed from: Η */
    public final void m3445(p000.yp0 r6, p000.o11 r7) {
            r5 = this;
            boolean r0 = r6.m6977()
            if (r0 != 0) goto L8
            goto L79
        L8:
            androidx.compose.ui.platform.AndroidComposeView r0 = r5.f6358
            androidx.compose.ui.platform.AndroidViewsHandler r0 = r0.getAndroidViewsHandler$ui()
            java.util.HashMap r0 = r0.getLayoutNodeToHolder()
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L1a
            goto L79
        L1a:
            k31 r0 = r6.f12733
            r1 = 8
            boolean r0 = r0.m3144(r1)
            r2 = 0
            if (r0 == 0) goto L26
            goto L3b
        L26:
            yp0 r6 = r6.m7005()
        L2a:
            if (r6 == 0) goto L3a
            k31 r0 = r6.f12733
            boolean r0 = r0.m3144(r1)
            if (r0 == 0) goto L35
            goto L3b
        L35:
            yp0 r6 = r6.m7005()
            goto L2a
        L3a:
            r6 = r2
        L3b:
            if (r6 == 0) goto L79
            xr1 r0 = r6.m7007()
            if (r0 != 0) goto L44
            goto L79
        L44:
            boolean r0 = r0.f12270
            r3 = 1
            if (r0 != 0) goto L63
            yp0 r0 = r6.m7005()
        L4d:
            if (r0 == 0) goto L60
            xr1 r4 = r0.m7007()
            if (r4 == 0) goto L5b
            boolean r4 = r4.f12270
            if (r4 != r3) goto L5b
            r2 = r0
            goto L60
        L5b:
            yp0 r0 = r0.m7005()
            goto L4d
        L60:
            if (r2 == 0) goto L63
            r6 = r2
        L63:
            int r6 = r6.f12744
            boolean r7 = r7.m4151(r6)
            if (r7 != 0) goto L6c
            goto L79
        L6c:
            int r6 = r5.m3461(r6)
            r7 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            m3434(r5, r6, r7, r0, r1)
        L79:
            return
    }

    /* JADX INFO: renamed from: Θ */
    public final boolean m3446(p000.bs1 r11, int r12, int r13, boolean r14) {
            r10 = this;
            xr1 r0 = r11.f1824
            int r1 = r11.f1826
            is1 r2 = p000.wr1.f11820
            b21 r0 = r0.f12268
            boolean r0 = r0.m691(r2)
            r3 = 0
            if (r0 == 0) goto L3a
            boolean r0 = p000.kn0.m3362(r11)
            if (r0 == 0) goto L3a
            xr1 r10 = r11.f1824
            java.lang.Object r10 = r10.m6780(r2)
            м r10 = (p000.C1114) r10
            m80 r10 = r10.f13447
            f80 r10 = (p000.f80) r10
            if (r10 == 0) goto L47
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r14)
            java.lang.Object r10 = r10.mo10(r11, r12, r13)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L3a:
            if (r12 != r13) goto L41
            int r14 = r10.f6371
            if (r13 != r14) goto L41
            goto L47
        L41:
            java.lang.String r9 = m3439(r11)
            if (r9 != 0) goto L48
        L47:
            return r3
        L48:
            if (r12 < 0) goto L53
            if (r12 != r13) goto L53
            int r11 = r9.length()
            if (r13 > r11) goto L53
            goto L54
        L53:
            r12 = -1
        L54:
            r10.f6371 = r12
            int r11 = r9.length()
            r12 = 1
            if (r11 <= 0) goto L5e
            r3 = r12
        L5e:
            int r5 = r10.m3461(r1)
            r11 = 0
            if (r3 == 0) goto L6d
            int r13 = r10.f6371
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r6 = r13
            goto L6e
        L6d:
            r6 = r11
        L6e:
            if (r3 == 0) goto L78
            int r13 = r10.f6371
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r7 = r13
            goto L79
        L78:
            r7 = r11
        L79:
            if (r3 == 0) goto L83
            int r11 = r9.length()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
        L83:
            r4 = r10
            r8 = r11
            android.view.accessibility.AccessibilityEvent r10 = r4.m3454(r5, r6, r7, r8, r9)
            r4.m3440(r10)
            r4.m3443(r1)
            return r12
    }

    /* JADX INFO: renamed from: Κ */
    public final android.graphics.Rect m3447(float r8, float r9, float r10, float r11) {
            r7 = this;
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r0 = (long) r8
            int r8 = java.lang.Float.floatToRawIntBits(r9)
            long r8 = (long) r8
            r2 = 32
            long r0 = r0 << r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r3
            long r8 = r8 | r0
            androidx.compose.ui.platform.AndroidComposeView r7 = r7.f6358
            long r8 = r7.m392(r8)
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r0 = (long) r10
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            long r0 = r0 << r2
            long r10 = r10 & r3
            long r10 = r10 | r0
            long r10 = r7.m392(r10)
            android.graphics.Rect r7 = new android.graphics.Rect
            long r0 = r8 >> r2
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            long r5 = r10 >> r2
            int r2 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r2)
            float r1 = java.lang.Math.min(r1, r5)
            double r5 = (double) r1
            double r5 = java.lang.Math.floor(r5)
            float r1 = (float) r5
            int r1 = (int) r1
            long r8 = r8 & r3
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            long r10 = r10 & r3
            int r10 = (int) r10
            float r11 = java.lang.Float.intBitsToFloat(r10)
            float r9 = java.lang.Math.min(r9, r11)
            double r3 = (double) r9
            double r3 = java.lang.Math.floor(r3)
            float r9 = (float) r3
            int r9 = (int) r9
            float r11 = java.lang.Float.intBitsToFloat(r0)
            float r0 = java.lang.Float.intBitsToFloat(r2)
            float r11 = java.lang.Math.max(r11, r0)
            double r2 = (double) r11
            double r2 = java.lang.Math.ceil(r2)
            float r11 = (float) r2
            int r11 = (int) r11
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r8 = java.lang.Math.max(r8, r10)
            double r2 = (double) r8
            double r2 = java.lang.Math.ceil(r2)
            float r8 = (float) r2
            int r8 = (int) r8
            r7.<init>(r1, r9, r11, r8)
            return r7
    }

    /* JADX INFO: renamed from: Ξ */
    public final void m3448() {
            r32 = this;
            r0 = r32
            o11 r1 = new o11
            r1.<init>()
            o11 r2 = r0.f6345
            int[] r3 = r2.f7867
            long[] r4 = r2.f7866
            int r5 = r4.length
            int r5 = r5 + (-2)
            n11 r6 = r0.f6351
            r14 = 8
            if (r5 < 0) goto L9d
            r7 = 0
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L1b:
            r9 = r4[r7]
            r8 = 7
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = ~r9
            long r11 = r11 << r8
            long r11 = r11 & r9
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L95
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        L34:
            if (r12 >= r11) goto L90
            long r22 = r9 & r18
            int r13 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r13 >= 0) goto L88
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            r22 = r8
            sm0 r8 = r0.m3457()
            java.lang.Object r8 = r8.m5525(r13)
            ds1 r8 = (p000.ds1) r8
            r23 = 0
            if (r8 == 0) goto L54
            bs1 r8 = r8.f3268
            goto L56
        L54:
            r8 = r23
        L56:
            if (r8 == 0) goto L64
            xr1 r8 = r8.f1824
            is1 r15 = p000.fs1.f4101
            b21 r8 = r8.f12268
            boolean r8 = r8.m691(r15)
            if (r8 != 0) goto L8a
        L64:
            r1.m4151(r13)
            java.lang.Object r8 = r6.m5525(r13)
            cs1 r8 = (p000.cs1) r8
            if (r8 == 0) goto L80
            xr1 r8 = r8.f2737
            is1 r15 = p000.fs1.f4101
            b21 r8 = r8.f12268
            java.lang.Object r8 = r8.m695(r15)
            if (r8 != 0) goto L7c
            goto L7e
        L7c:
            r23 = r8
        L7e:
            java.lang.String r23 = (java.lang.String) r23
        L80:
            r8 = r23
            r15 = 32
            r0.m3442(r13, r15, r8)
            goto L8a
        L88:
            r22 = r8
        L8a:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            r8 = r22
            goto L34
        L90:
            r22 = r8
            if (r11 != r14) goto La8
            goto L97
        L95:
            r22 = r8
        L97:
            if (r7 == r5) goto La8
            int r7 = r7 + 1
            goto L1b
        L9d:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r22 = 7
        La8:
            int[] r3 = r1.f7867
            long[] r1 = r1.f7866
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L183
            r5 = 0
        Lb2:
            r7 = r1[r5]
            long r9 = ~r7
            long r9 = r9 << r22
            long r9 = r9 & r7
            long r9 = r9 & r20
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto L177
            int r9 = r5 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        Lc6:
            if (r10 >= r9) goto L171
            long r11 = r7 & r18
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 >= 0) goto L161
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            int r12 = java.lang.Integer.hashCode(r11)
            r13 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r12 = r12 * r13
            int r13 = r12 << 16
            r12 = r12 ^ r13
            r13 = r12 & 127(0x7f, float:1.78E-43)
            int r15 = r2.f7868
            int r12 = r12 >>> 7
            r12 = r12 & r15
            r24 = r14
            r23 = 0
        Le9:
            long[] r14 = r2.f7866
            int r25 = r12 >> 3
            r26 = r12 & 7
            r27 = r1
            int r1 = r26 << 3
            r28 = r14[r25]
            long r28 = r28 >>> r1
            int r25 = r25 + 1
            r25 = r14[r25]
            int r14 = 64 - r1
            long r25 = r25 << r14
            r30 = r7
            long r7 = (long) r1
            long r7 = -r7
            r1 = 63
            long r7 = r7 >> r1
            long r7 = r25 & r7
            long r7 = r28 | r7
            r1 = r15
            long r14 = (long) r13
            r25 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r14 = r14 * r25
            long r14 = r14 ^ r7
            long r25 = r14 - r25
            long r14 = ~r14
            long r14 = r25 & r14
            long r14 = r14 & r20
        L11b:
            r25 = 0
            int r28 = (r14 > r25 ? 1 : (r14 == r25 ? 0 : -1))
            if (r28 == 0) goto L13f
            int r25 = java.lang.Long.numberOfTrailingZeros(r14)
            int r25 = r25 >> 3
            int r25 = r12 + r25
            r25 = r25 & r1
            r28 = r1
            int[] r1 = r2.f7867
            r1 = r1[r25]
            if (r1 != r11) goto L136
        L133:
            r1 = r25
            goto L14e
        L136:
            r25 = 1
            long r25 = r14 - r25
            long r14 = r14 & r25
            r1 = r28
            goto L11b
        L13f:
            r28 = r1
            long r14 = ~r7
            r1 = 6
            long r14 = r14 << r1
            long r7 = r7 & r14
            long r7 = r7 & r20
            int r1 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r1 == 0) goto L154
            r25 = -1
            goto L133
        L14e:
            if (r1 < 0) goto L167
            r2.m4156(r1)
            goto L167
        L154:
            int r23 = r23 + 8
            int r12 = r12 + r23
            r12 = r12 & r28
            r1 = r27
            r15 = r28
            r7 = r30
            goto Le9
        L161:
            r27 = r1
            r30 = r7
            r24 = r14
        L167:
            long r7 = r30 >> r24
            int r10 = r10 + 1
            r14 = r24
            r1 = r27
            goto Lc6
        L171:
            r27 = r1
            r1 = r14
            if (r9 != r1) goto L183
            goto L179
        L177:
            r27 = r1
        L179:
            if (r5 == r4) goto L183
            int r5 = r5 + 1
            r1 = r27
            r14 = 8
            goto Lb2
        L183:
            r6.m3938()
            sm0 r1 = r0.m3457()
            int[] r3 = r1.f9963
            java.lang.Object[] r4 = r1.f9964
            long[] r1 = r1.f9962
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L1fc
            r7 = 0
        L196:
            r8 = r1[r7]
            long r10 = ~r8
            long r10 = r10 << r22
            long r10 = r10 & r8
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto L1f5
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r24 = 8
            int r14 = 8 - r10
            r10 = 0
        L1ac:
            if (r10 >= r14) goto L1f0
            long r11 = r8 & r18
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 >= 0) goto L1ea
            int r11 = r7 << 3
            int r11 = r11 + r10
            r12 = r3[r11]
            r11 = r4[r11]
            ds1 r11 = (p000.ds1) r11
            bs1 r11 = r11.f3268
            xr1 r13 = r11.f1824
            is1 r15 = p000.fs1.f4101
            b21 r13 = r13.f12268
            boolean r13 = r13.m691(r15)
            if (r13 == 0) goto L1de
            boolean r13 = r2.m4151(r12)
            if (r13 == 0) goto L1de
            xr1 r13 = r11.f1824
            java.lang.Object r13 = r13.m6780(r15)
            java.lang.String r13 = (java.lang.String) r13
            r15 = 16
            r0.m3442(r12, r15, r13)
        L1de:
            cs1 r13 = new cs1
            sm0 r15 = r0.m3457()
            r13.<init>(r11, r15)
            r6.m3942(r12, r13)
        L1ea:
            r11 = 8
            long r8 = r8 >> r11
            int r10 = r10 + 1
            goto L1ac
        L1f0:
            r11 = 8
            if (r14 != r11) goto L1fc
            goto L1f7
        L1f5:
            r11 = 8
        L1f7:
            if (r7 == r5) goto L1fc
            int r7 = r7 + 1
            goto L196
        L1fc:
            cs1 r1 = new cs1
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.f6358
            es1 r2 = r2.getSemanticsOwner()
            bs1 r2 = r2.m1953()
            sm0 r3 = r0.m3457()
            r1.<init>(r2, r3)
            r0.f6352 = r1
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: β */
    public final p000.C0568n mo421(android.view.View r1) {
            r0 = this;
            f1 r0 = r0.f6364
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final void m3449(int r23, p000.C1128 r24, java.lang.String r25, android.os.Bundle r26) {
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            r3 = r24
            r4 = r26
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.f13478
            sm0 r5 = r0.m3457()
            java.lang.Object r5 = r5.m5525(r1)
            ds1 r5 = (p000.ds1) r5
            if (r5 == 0) goto L443
            bs1 r5 = r5.f3268
            if (r5 != 0) goto L1e
            goto L443
        L1e:
            yp0 r6 = r5.f1823
            xr1 r7 = r5.f1824
            b21 r8 = r7.f12268
            java.lang.String r9 = m3439(r5)
            java.lang.String r10 = r0.f6348
            boolean r10 = p000.ln0.m3626(r2, r10)
            r11 = -1
            if (r10 == 0) goto L41
            l11 r0 = r0.f6346
            int r0 = r0.m3466(r1)
            if (r0 == r11) goto L443
            android.os.Bundle r1 = r3.getExtras()
            r1.putInt(r2, r0)
            return
        L41:
            java.lang.String r10 = r0.f6349
            boolean r10 = p000.ln0.m3626(r2, r10)
            if (r10 == 0) goto L59
            l11 r0 = r0.f6347
            int r0 = r0.m3466(r1)
            if (r0 == r11) goto L443
            android.os.Bundle r1 = r3.getExtras()
            r1.putInt(r2, r0)
            return
        L59:
            is1 r1 = p000.wr1.f11812
            boolean r1 = r8.m691(r1)
            androidx.compose.ui.platform.AndroidComposeView r10 = r0.f6358
            r12 = 0
            if (r1 == 0) goto L2b7
            if (r4 == 0) goto L2b7
            java.lang.String r1 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"
            boolean r1 = p000.ln0.m3626(r2, r1)
            if (r1 == 0) goto L2b7
            java.lang.String r0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX"
            int r0 = r4.getInt(r0, r11)
            java.lang.String r1 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH"
            int r1 = r4.getInt(r1, r11)
            if (r1 <= 0) goto L2af
            if (r0 < 0) goto L2af
            if (r9 == 0) goto L85
            int r4 = r9.length()
            goto L88
        L85:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L88:
            if (r0 < r4) goto L8c
            goto L2af
        L8c:
            m32 r4 = p000.v71.m6038(r7)
            if (r4 != 0) goto L94
            goto L443
        L94:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
        L9a:
            if (r7 >= r1) goto L29e
            int r8 = r0 + r7
            l32 r9 = r4.f6923
            g4 r9 = r9.f6402
            java.lang.String r9 = r9.f4228
            int r9 = r9.length()
            if (r8 < r9) goto Lb4
            r6.add(r12)
            r22 = r0
            r26 = r1
            r14 = r10
            goto L294
        Lb4:
            g11 r9 = r4.f6924
            java.lang.Object r11 = r9.f4207
            b8 r11 = (p000.C0068b8) r11
            java.lang.Object r11 = r11.f1556
            g4 r11 = (p000.C0309g4) r11
            r15 = 41
            java.lang.String r12 = "offset("
            if (r8 < 0) goto Lcd
            java.lang.String r14 = r11.f4228
            int r14 = r14.length()
            if (r8 >= r14) goto Lcd
            goto Le6
        Lcd:
            java.lang.String r14 = ") is out of bounds [0, "
            java.lang.StringBuilder r14 = p000.a12.m19(r8, r12, r14)
            java.lang.String r11 = r11.f4228
            int r11 = r11.length()
            r14.append(r11)
            r14.append(r15)
            java.lang.String r11 = r14.toString()
            p000.bm0.m982(r11)
        Le6:
            java.lang.Object r9 = r9.f4209
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r11 = p000.AbstractC0073bd.m882(r8, r9)
            java.lang.Object r9 = r9.get(r11)
            m91 r9 = (p000.m91) r9
            s2 r11 = r9.f7033
            int r8 = r9.m3799(r8)
            java.lang.CharSequence r14 = r11.f9685
            if (r8 < 0) goto L105
            int r13 = r14.length()
            if (r8 >= r13) goto L105
            goto L11c
        L105:
            java.lang.String r13 = ") is out of bounds [0,"
            java.lang.StringBuilder r12 = p000.a12.m19(r8, r12, r13)
            int r13 = r14.length()
            r12.append(r13)
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            p000.bm0.m982(r12)
        L11c:
            k32 r11 = r11.f9684
            android.text.Layout r12 = r11.f5738
            int r13 = r12.getLineForOffset(r8)
            float r14 = r11.m3153(r13)
            float r15 = r11.m3151(r13)
            int r13 = r12.getParagraphDirection(r13)
            r22 = r0
            r0 = 1
            if (r13 != r0) goto L137
            r13 = r0
            goto L138
        L137:
            r13 = 0
        L138:
            boolean r12 = r12.isRtlCharAt(r8)
            if (r13 == 0) goto L14d
            if (r12 != 0) goto L14d
            r0 = 0
            float r12 = r11.m3154(r8, r0)
            int r8 = r8 + 1
            r13 = 1
            float r8 = r11.m3154(r8, r13)
            goto L17b
        L14d:
            r0 = 0
            if (r13 == 0) goto L163
            if (r12 == 0) goto L163
            float r12 = r11.m3155(r8, r0)
            int r8 = r8 + 1
            r13 = 1
            float r8 = r11.m3155(r8, r13)
        L15d:
            r21 = r12
            r12 = r8
            r8 = r21
            goto L17b
        L163:
            r13 = 1
            if (r12 == 0) goto L171
            float r12 = r11.m3154(r8, r0)
            int r8 = r8 + 1
            float r8 = r11.m3154(r8, r13)
            goto L15d
        L171:
            float r12 = r11.m3155(r8, r0)
            int r8 = r8 + 1
            float r8 = r11.m3155(r8, r13)
        L17b:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r12, r14, r8, r15)
            float r8 = r0.left
            float r11 = r0.top
            float r12 = r0.right
            float r0 = r0.bottom
            float r9 = r9.f7038
            r13 = 0
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            long r13 = (long) r13
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            r15 = r0
            r26 = r1
            long r0 = (long) r9
            r9 = 32
            long r13 = r13 << r9
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r16
            long r0 = r0 | r13
            ml1 r13 = new ml1
            r18 = r9
            r14 = r10
            long r9 = r0 >> r18
            int r9 = (int) r9
            float r10 = java.lang.Float.intBitsToFloat(r9)
            float r10 = r10 + r8
            long r0 = r0 & r16
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            float r1 = r1 + r11
            float r8 = java.lang.Float.intBitsToFloat(r9)
            float r8 = r8 + r12
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 + r15
            r13.<init>(r10, r1, r8, r0)
            q31 r0 = r5.m1009()
            r8 = 0
            if (r0 == 0) goto L1dd
            q01 r1 = r0.mo2315()
            boolean r1 = r1.f8784
            if (r1 == 0) goto L1d6
            goto L1d7
        L1d6:
            r0 = 0
        L1d7:
            if (r0 == 0) goto L1dd
            long r8 = r0.m4745(r8)
        L1dd:
            ml1 r0 = r13.m3870(r8)
            ml1 r1 = r5.m1012()
            float r8 = r0.f7200
            float r9 = r1.f7202
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L1ef
            r8 = 1
            goto L1f0
        L1ef:
            r8 = 0
        L1f0:
            float r9 = r1.f7200
            float r10 = r0.f7202
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L1fa
            r9 = 1
            goto L1fb
        L1fa:
            r9 = 0
        L1fb:
            r8 = r8 & r9
            float r9 = r0.f7201
            float r10 = r1.f7203
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L206
            r9 = 1
            goto L207
        L206:
            r9 = 0
        L207:
            r8 = r8 & r9
            float r9 = r1.f7201
            float r10 = r0.f7203
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L212
            r9 = 1
            goto L213
        L212:
            r9 = 0
        L213:
            r8 = r8 & r9
            if (r8 == 0) goto L21b
            ml1 r0 = r0.m3868(r1)
            goto L21c
        L21b:
            r0 = 0
        L21c:
            if (r0 == 0) goto L290
            float r1 = r0.f7200
            float r8 = r0.f7201
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r9 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r8)
            long r11 = (long) r1
            long r8 = r9 << r18
            long r10 = r11 & r16
            long r8 = r8 | r10
            long r8 = r14.m392(r8)
            float r1 = r0.f7202
            float r0 = r0.f7203
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r10 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            long r10 = r10 << r18
            long r0 = r0 & r16
            long r0 = r0 | r10
            long r0 = r14.m392(r0)
            android.graphics.RectF r10 = new android.graphics.RectF
            long r11 = r8 >> r18
            int r11 = (int) r11
            float r12 = java.lang.Float.intBitsToFloat(r11)
            r19 = r0
            long r0 = r19 >> r18
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            float r1 = java.lang.Math.min(r12, r1)
            long r8 = r8 & r16
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            long r12 = r19 & r16
            int r12 = (int) r12
            float r13 = java.lang.Float.intBitsToFloat(r12)
            float r9 = java.lang.Math.min(r9, r13)
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = java.lang.Math.max(r11, r0)
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r11 = java.lang.Float.intBitsToFloat(r12)
            float r8 = java.lang.Math.max(r8, r11)
            r10.<init>(r1, r9, r0, r8)
            goto L291
        L290:
            r10 = 0
        L291:
            r6.add(r10)
        L294:
            int r7 = r7 + 1
            r0 = r22
            r1 = r26
            r10 = r14
            r12 = 0
            goto L9a
        L29e:
            android.os.Bundle r0 = r3.getExtras()
            r1 = 0
            android.graphics.RectF[] r1 = new android.graphics.RectF[r1]
            java.lang.Object[] r1 = r6.toArray(r1)
            android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
            r0.putParcelableArray(r2, r1)
            return
        L2af:
            java.lang.String r0 = "AccessibilityDelegate"
            java.lang.String r1 = "Invalid arguments for accessibility character locations"
            android.util.Log.e(r0, r1)
            return
        L2b7:
            r14 = r10
            is1 r1 = p000.fs1.f4121
            boolean r7 = r8.m691(r1)
            if (r7 == 0) goto L2df
            if (r4 == 0) goto L2df
            java.lang.String r4 = "androidx.compose.ui.semantics.testTag"
            boolean r4 = p000.ln0.m3626(r2, r4)
            if (r4 == 0) goto L2df
            java.lang.Object r0 = r8.m695(r1)
            if (r0 != 0) goto L2d2
            r12 = 0
            goto L2d3
        L2d2:
            r12 = r0
        L2d3:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L443
            android.os.Bundle r0 = r3.getExtras()
            r0.putCharSequence(r2, r12)
            return
        L2df:
            java.lang.String r1 = "androidx.compose.ui.semantics.id"
            boolean r1 = p000.ln0.m3626(r2, r1)
            if (r1 == 0) goto L2f1
            android.os.Bundle r0 = r3.getExtras()
            int r1 = r5.f1826
            r0.putInt(r2, r1)
            return
        L2f1:
            java.lang.String r1 = "androidx.compose.ui.semantics.shapeType"
            boolean r4 = p000.ln0.m3626(r2, r1)
            java.lang.String r7 = "androidx.compose.ui.semantics.shapeRegion"
            java.lang.String r9 = "androidx.compose.ui.semantics.shapeCorners"
            java.lang.String r10 = "androidx.compose.ui.semantics.shapeRect"
            if (r4 == 0) goto L384
            is1 r2 = p000.fs1.f4097
            java.lang.Object r2 = r8.m695(r2)
            if (r2 != 0) goto L309
            r12 = 0
            goto L30a
        L309:
            r12 = r2
        L30a:
            iv1 r12 = (p000.iv1) r12
            if (r12 == 0) goto L443
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3.getBoundsInScreen(r2)
            ml1 r0 = r0.m3458(r5, r2, r12)
            float r2 = r0.f7201
            float r4 = r0.f7200
            r11 = r14
            long r13 = r0.m3867()
            np0 r0 = r6.f12727
            yr r5 = r11.getDensity()
            u81 r0 = r12.mo2812(r13, r0, r5)
            boolean r5 = r0 instanceof p000.s81
            if (r5 == 0) goto L345
            android.os.Bundle r5 = r3.getExtras()
            r6 = 0
            r5.putInt(r1, r6)
            android.os.Bundle r1 = r3.getExtras()
            android.graphics.Rect r0 = m3435(r0, r4, r2)
            r1.putParcelable(r10, r0)
            return
        L345:
            boolean r5 = r0 instanceof p000.t81
            if (r5 == 0) goto L368
            android.os.Bundle r5 = r3.getExtras()
            r13 = 1
            r5.putInt(r1, r13)
            android.os.Bundle r1 = r3.getExtras()
            android.graphics.Rect r2 = m3435(r0, r4, r2)
            r1.putParcelable(r10, r2)
            android.os.Bundle r1 = r3.getExtras()
            float[] r0 = m3436(r0)
            r1.putFloatArray(r9, r0)
            return
        L368:
            boolean r5 = r0 instanceof p000.r81
            if (r5 == 0) goto L380
            android.os.Bundle r5 = r3.getExtras()
            r6 = 2
            r5.putInt(r1, r6)
            android.os.Bundle r1 = r3.getExtras()
            android.graphics.Region r0 = m3437(r0, r4, r2)
            r1.putParcelable(r7, r0)
            return
        L380:
            p000.C1080.m7272()
            return
        L384:
            r11 = r14
            boolean r1 = p000.ln0.m3626(r2, r10)
            if (r1 == 0) goto L3c6
            is1 r1 = p000.fs1.f4097
            java.lang.Object r1 = r8.m695(r1)
            if (r1 != 0) goto L395
            r12 = 0
            goto L396
        L395:
            r12 = r1
        L396:
            iv1 r12 = (p000.iv1) r12
            if (r12 == 0) goto L443
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.getBoundsInScreen(r1)
            ml1 r0 = r0.m3458(r5, r1, r12)
            long r1 = r0.m3867()
            np0 r4 = r6.f12727
            yr r5 = r11.getDensity()
            u81 r1 = r12.mo2812(r1, r4, r5)
            float r2 = r0.f7200
            float r0 = r0.f7201
            android.graphics.Rect r0 = m3435(r1, r2, r0)
            if (r0 == 0) goto L443
            android.os.Bundle r1 = r3.getExtras()
            r1.putParcelable(r10, r0)
            return
        L3c6:
            boolean r1 = p000.ln0.m3626(r2, r9)
            if (r1 == 0) goto L403
            is1 r1 = p000.fs1.f4097
            java.lang.Object r1 = r8.m695(r1)
            if (r1 != 0) goto L3d6
            r12 = 0
            goto L3d7
        L3d6:
            r12 = r1
        L3d7:
            iv1 r12 = (p000.iv1) r12
            if (r12 == 0) goto L443
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.getBoundsInScreen(r1)
            ml1 r0 = r0.m3458(r5, r1, r12)
            long r0 = r0.m3867()
            np0 r2 = r6.f12727
            yr r4 = r11.getDensity()
            u81 r0 = r12.mo2812(r0, r2, r4)
            float[] r0 = m3436(r0)
            if (r0 == 0) goto L443
            android.os.Bundle r1 = r3.getExtras()
            r1.putFloatArray(r9, r0)
            return
        L403:
            boolean r1 = p000.ln0.m3626(r2, r7)
            if (r1 == 0) goto L443
            is1 r1 = p000.fs1.f4097
            java.lang.Object r1 = r8.m695(r1)
            if (r1 != 0) goto L413
            r12 = 0
            goto L414
        L413:
            r12 = r1
        L414:
            iv1 r12 = (p000.iv1) r12
            if (r12 == 0) goto L443
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.getBoundsInScreen(r1)
            ml1 r0 = r0.m3458(r5, r1, r12)
            long r1 = r0.m3867()
            np0 r4 = r6.f12727
            yr r5 = r11.getDensity()
            u81 r1 = r12.mo2812(r1, r4, r5)
            float r2 = r0.f7200
            float r0 = r0.f7201
            android.graphics.Region r0 = m3437(r1, r2, r0)
            if (r0 == 0) goto L443
            android.os.Bundle r1 = r3.getExtras()
            r1.putParcelable(r7, r0)
        L443:
            return
    }

    /* JADX INFO: renamed from: λ */
    public final java.lang.Object m3450(p000.AbstractC0695pp r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof p000.C0343h1
            if (r2 == 0) goto L17
            r2 = r1
            h1 r2 = (p000.C0343h1) r2
            int r3 = r2.f4524
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f4524 = r3
            goto L1c
        L17:
            h1 r2 = new h1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f4522
            int r3 = r2.f4524
            r4 = 2
            d7 r5 = r0.f6373
            r6 = 1
            cq r7 = p000.EnumC0184cq.f2716
            if (r3 == 0) goto L4e
            if (r3 == r6) goto L46
            if (r3 != r4) goto L3f
            vc r3 = r2.f4521
            o11 r8 = r2.f4520
            p000.i81.m2649(r1)     // Catch: java.lang.Throwable -> L3a
            r1 = r4
            r20 = r5
            r11 = r6
            r5 = r7
            goto L13e
        L3a:
            r0 = move-exception
            r20 = r5
            goto L14f
        L3f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L46:
            vc r3 = r2.f4521
            o11 r8 = r2.f4520
            p000.i81.m2649(r1)     // Catch: java.lang.Throwable -> L3a
            goto L75
        L4e:
            p000.i81.m2649(r1)
            o11 r1 = new o11     // Catch: java.lang.Throwable -> L3a
            r1.<init>()     // Catch: java.lang.Throwable -> L3a
            wc r3 = r0.f6374     // Catch: java.lang.Throwable -> L3a
            r3.getClass()     // Catch: java.lang.Throwable -> L3a
            vc r8 = new vc     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L3a
        L60:
            r2.f4520 = r1     // Catch: java.lang.Throwable -> L3a
            r2.f4521 = r8     // Catch: java.lang.Throwable -> L3a
            r2.f4524 = r6     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r3 = r8.m6166(r2)     // Catch: java.lang.Throwable -> L3a
            if (r3 != r7) goto L6f
            r5 = r7
            goto L13d
        L6f:
            r18 = r8
            r8 = r1
            r1 = r3
            r3 = r18
        L75:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L147
            r3.m6167()     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r0.m3459()     // Catch: java.lang.Throwable -> L3a
            n11 r9 = r0.f6368
            n11 r10 = r0.f6367
            if (r1 == 0) goto L11e
            int r1 = r5.f2931     // Catch: java.lang.Throwable -> L3a
            r11 = 0
            r12 = r11
        L8e:
            androidx.compose.ui.platform.AndroidComposeView r13 = r0.f6358
            if (r12 >= r1) goto Lce
            java.lang.Object[] r14 = r5.f2930     // Catch: java.lang.Throwable -> L3a
            r14 = r14[r12]     // Catch: java.lang.Throwable -> L3a
            yp0 r14 = (p000.yp0) r14     // Catch: java.lang.Throwable -> L3a
            r0.m3445(r14, r8)     // Catch: java.lang.Throwable -> L3a
            boolean r15 = r14.m6977()     // Catch: java.lang.Throwable -> L3a
            if (r15 != 0) goto La2
            goto Lbf
        La2:
            androidx.compose.ui.platform.AndroidViewsHandler r13 = r13.getAndroidViewsHandler$ui()     // Catch: java.lang.Throwable -> L3a
            java.util.HashMap r13 = r13.getLayoutNodeToHolder()     // Catch: java.lang.Throwable -> L3a
            boolean r13 = r13.containsKey(r14)     // Catch: java.lang.Throwable -> L3a
            if (r13 == 0) goto Lb1
            goto Lbf
        Lb1:
            int r13 = r14.f12744     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r14 = r10.m5525(r13)     // Catch: java.lang.Throwable -> L3a
            if (r14 != 0) goto Lc8
            java.lang.Object r13 = r9.m5525(r13)     // Catch: java.lang.Throwable -> L3a
            if (r13 != 0) goto Lc2
        Lbf:
            int r12 = r12 + 1
            goto L8e
        Lc2:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L3a
            r0.<init>()     // Catch: java.lang.Throwable -> L3a
            throw r0     // Catch: java.lang.Throwable -> L3a
        Lc8:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L3a
            r0.<init>()     // Catch: java.lang.Throwable -> L3a
            throw r0     // Catch: java.lang.Throwable -> L3a
        Lce:
            r8.f7869 = r11     // Catch: java.lang.Throwable -> L3a
            long[] r1 = r8.f7866     // Catch: java.lang.Throwable -> L3a
            long[] r11 = p000.tq1.f10431     // Catch: java.lang.Throwable -> L3a
            if (r1 == r11) goto Lf8
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            p000.AbstractC0312g7.m2245(r11, r1)     // Catch: java.lang.Throwable -> L3a
            long[] r1 = r8.f7866     // Catch: java.lang.Throwable -> L3a
            int r11 = r8.f7868     // Catch: java.lang.Throwable -> L3a
            int r12 = r11 >> 3
            r11 = r11 & 7
            int r11 = r11 << 3
            r14 = r1[r12]     // Catch: java.lang.Throwable -> L3a
            r16 = 255(0xff, double:1.26E-321)
            r20 = r5
            long r4 = r16 << r11
            r16 = r7
            long r6 = ~r4
            long r6 = r6 & r14
            long r4 = r4 | r6
            r1[r12] = r4     // Catch: java.lang.Throwable -> L11a
            goto Lfc
        Lf8:
            r20 = r5
            r16 = r7
        Lfc:
            int r1 = r8.f7868     // Catch: java.lang.Throwable -> L11a
            int r1 = p000.tq1.m5731(r1)     // Catch: java.lang.Throwable -> L11a
            int r4 = r8.f7869     // Catch: java.lang.Throwable -> L11a
            int r1 = r1 - r4
            r8.f7870 = r1     // Catch: java.lang.Throwable -> L11a
            android.os.Handler r1 = r13.getHandler()     // Catch: java.lang.Throwable -> L11a
            boolean r4 = r0.f6353     // Catch: java.lang.Throwable -> L11a
            if (r4 != 0) goto L11c
            if (r1 == 0) goto L11c
            r11 = 1
            r0.f6353 = r11     // Catch: java.lang.Throwable -> L11a
            ν r4 = r0.f6355     // Catch: java.lang.Throwable -> L11a
            r1.post(r4)     // Catch: java.lang.Throwable -> L11a
            goto L123
        L11a:
            r0 = move-exception
            goto L14f
        L11c:
            r11 = 1
            goto L123
        L11e:
            r20 = r5
            r11 = r6
            r16 = r7
        L123:
            r20.clear()     // Catch: java.lang.Throwable -> L11a
            r10.m3938()     // Catch: java.lang.Throwable -> L11a
            r9.m3938()     // Catch: java.lang.Throwable -> L11a
            long r4 = r0.f6362     // Catch: java.lang.Throwable -> L11a
            r2.f4520 = r8     // Catch: java.lang.Throwable -> L11a
            r2.f4521 = r3     // Catch: java.lang.Throwable -> L11a
            r1 = 2
            r2.f4524 = r1     // Catch: java.lang.Throwable -> L11a
            java.lang.Object r4 = p000.jx0.m3053(r4, r2)     // Catch: java.lang.Throwable -> L11a
            r5 = r16
            if (r4 != r5) goto L13e
        L13d:
            return r5
        L13e:
            r4 = r1
            r7 = r5
            r1 = r8
            r6 = r11
            r5 = r20
            r8 = r3
            goto L60
        L147:
            r20 = r5
            r20.clear()
            s62 r0 = p000.s62.f9751
            return r0
        L14f:
            r20.clear()
            throw r0
    }

    /* JADX INFO: renamed from: μ */
    public final void m3451(long r21, boolean r23) {
            r20 = this;
            r0 = r21
            r2 = r23
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Thread r3 = r3.getThread()
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L18
            goto Lf7
        L18:
            sm0 r3 = r20.m3457()
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r4 = p000.o41.m4203(r0, r4)
            if (r4 != 0) goto Lf7
            r4 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r4 = r4 & r0
            r6 = 36028792732385279(0x7fffff007fffff, double:2.848093183464406E-306)
            long r4 = r4 + r6
            r6 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto Lf7
            r4 = 1
            if (r2 != r4) goto L45
            is1 r2 = p000.fs1.f4119
            goto L49
        L45:
            if (r2 != 0) goto Lf4
            is1 r2 = p000.fs1.f4118
        L49:
            java.lang.Object[] r5 = r3.f9964
            long[] r3 = r3.f9962
            int r6 = r3.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto Lf7
            r8 = 0
        L53:
            r9 = r3[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto Leb
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L6d:
            if (r13 >= r11) goto Le8
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto Ldc
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r5[r14]
            ds1 r14 = (p000.ds1) r14
            ym0 r15 = r14.f3269
            int r4 = r15.f12684
            float r4 = (float) r4
            int r7 = r15.f12685
            float r7 = (float) r7
            r16 = r12
            int r12 = r15.f12686
            float r12 = (float) r12
            int r15 = r15.f12687
            float r15 = (float) r15
            r17 = 32
            long r0 = r21 >> r17
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r19 = r0
            long r0 = r21 & r17
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r1 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r1 < 0) goto Lac
            r1 = 1
            goto Lad
        Lac:
            r1 = 0
        Lad:
            int r4 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
            if (r4 >= 0) goto Lb3
            r4 = 1
            goto Lb4
        Lb3:
            r4 = 0
        Lb4:
            r1 = r1 & r4
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 < 0) goto Lbb
            r4 = 1
            goto Lbc
        Lbb:
            r4 = 0
        Lbc:
            r1 = r1 & r4
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 >= 0) goto Lc3
            r0 = 1
            goto Lc4
        Lc3:
            r0 = 0
        Lc4:
            r0 = r0 & r1
            if (r0 != 0) goto Lc8
            goto Lde
        Lc8:
            bs1 r0 = r14.f3268
            xr1 r0 = r0.f1824
            b21 r0 = r0.f12268
            java.lang.Object r0 = r0.m695(r2)
            if (r0 != 0) goto Ld5
            r0 = 0
        Ld5:
            if (r0 != 0) goto Ld8
            goto Lde
        Ld8:
            p000.C1080.m7264()
            return
        Ldc:
            r16 = r12
        Lde:
            long r9 = r9 >> r16
            int r13 = r13 + 1
            r0 = r21
            r12 = r16
            r4 = 1
            goto L6d
        Le8:
            r0 = r12
            if (r11 != r0) goto Lf7
        Leb:
            if (r8 == r6) goto Lf7
            int r8 = r8 + 1
            r0 = r21
            r4 = 1
            goto L53
        Lf4:
            p000.C1080.m7272()
        Lf7:
            return
    }

    /* JADX INFO: renamed from: ν */
    public final void m3452() {
            r2 = this;
            java.lang.String r0 = "sendAccessibilitySemanticsStructureChangeEvents"
            android.os.Trace.beginSection(r0)
            boolean r0 = r2.m3459()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L1a
            androidx.compose.ui.platform.AndroidComposeView r0 = r2.f6358     // Catch: java.lang.Throwable -> L42
            es1 r0 = r0.getSemanticsOwner()     // Catch: java.lang.Throwable -> L42
            bs1 r0 = r0.m1953()     // Catch: java.lang.Throwable -> L42
            cs1 r1 = r2.f6352     // Catch: java.lang.Throwable -> L42
            r2.m3462(r0, r1)     // Catch: java.lang.Throwable -> L42
        L1a:
            android.os.Trace.endSection()
            java.lang.String r0 = "sendSemanticsPropertyChangeEvents"
            android.os.Trace.beginSection(r0)
            sm0 r0 = r2.m3457()     // Catch: java.lang.Throwable -> L3d
            r2.m3444(r0)     // Catch: java.lang.Throwable -> L3d
            android.os.Trace.endSection()
            java.lang.String r0 = "updateSemanticsNodesCopyAndPanes"
            android.os.Trace.beginSection(r0)
            r2.m3448()     // Catch: java.lang.Throwable -> L38
            android.os.Trace.endSection()
            return
        L38:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
        L3d:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
        L42:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
    }

    /* JADX INFO: renamed from: ξ */
    public final android.view.accessibility.AccessibilityEvent m3453(int r3, int r4) {
            r2 = this;
            android.view.accessibility.AccessibilityEvent r4 = android.view.accessibility.AccessibilityEvent.obtain(r4)
            r0 = 1
            r4.setEnabled(r0)
            java.lang.String r0 = "android.view.View"
            r4.setClassName(r0)
            androidx.compose.ui.platform.AndroidComposeView r0 = r2.f6358
            android.content.Context r1 = r0.getContext()
            java.lang.String r1 = r1.getPackageName()
            r4.setPackageName(r1)
            r4.setSource(r0, r3)
            boolean r0 = r2.m3459()
            if (r0 == 0) goto L5a
            sm0 r2 = r2.m3457()
            java.lang.Object r2 = r2.m5525(r3)
            ds1 r2 = (p000.ds1) r2
            if (r2 == 0) goto L5a
            bs1 r2 = r2.f3268
            xr1 r3 = r2.f1824
            is1 r0 = p000.fs1.f4093
            b21 r3 = r3.f12268
            boolean r3 = r3.m691(r0)
            r4.setPassword(r3)
            xr1 r2 = r2.f1824
            is1 r3 = p000.fs1.f4111
            b21 r2 = r2.f12268
            java.lang.Object r2 = r2.m695(r3)
            if (r2 != 0) goto L4b
            r2 = 0
        L4b:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = p000.ln0.m3626(r2, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r3 < r0) goto L5a
            p000.AbstractC1117.m7298(r4, r2)
        L5a:
            return r4
    }

    /* JADX INFO: renamed from: ο */
    public final android.view.accessibility.AccessibilityEvent m3454(int r2, java.lang.Integer r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.CharSequence r6) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            android.view.accessibility.AccessibilityEvent r1 = r1.m3453(r2, r0)
            if (r3 == 0) goto Lf
            int r2 = r3.intValue()
            r1.setFromIndex(r2)
        Lf:
            if (r4 == 0) goto L18
            int r2 = r4.intValue()
            r1.setToIndex(r2)
        L18:
            if (r5 == 0) goto L21
            int r2 = r5.intValue()
            r1.setItemCount(r2)
        L21:
            if (r6 == 0) goto L2a
            java.util.List r2 = r1.getText()
            r2.add(r6)
        L2a:
            return r1
    }

    /* JADX INFO: renamed from: π */
    public final int m3455(p000.bs1 r3) {
            r2 = this;
            xr1 r3 = r3.f1824
            is1 r0 = p000.fs1.f4098
            b21 r1 = r3.f12268
            boolean r0 = r1.m691(r0)
            if (r0 != 0) goto L26
            is1 r0 = p000.fs1.f4090
            b21 r1 = r3.f12268
            boolean r1 = r1.m691(r0)
            if (r1 == 0) goto L26
            java.lang.Object r2 = r3.m6780(r0)
            r32 r2 = (p000.r32) r2
            long r2 = r2.f9254
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            return r2
        L26:
            int r2 = r2.f6371
            return r2
    }

    /* JADX INFO: renamed from: ρ */
    public final int m3456(p000.bs1 r3) {
            r2 = this;
            xr1 r3 = r3.f1824
            is1 r0 = p000.fs1.f4098
            b21 r1 = r3.f12268
            boolean r0 = r1.m691(r0)
            if (r0 != 0) goto L23
            is1 r0 = p000.fs1.f4090
            b21 r1 = r3.f12268
            boolean r1 = r1.m691(r0)
            if (r1 == 0) goto L23
            java.lang.Object r2 = r3.m6780(r0)
            r32 r2 = (p000.r32) r2
            long r2 = r2.f9254
            r0 = 32
            long r2 = r2 >> r0
            int r2 = (int) r2
            return r2
        L23:
            int r2 = r2.f6371
            return r2
    }

    /* JADX INFO: renamed from: σ */
    public final p000.sm0 m3457() {
            r7 = this;
            boolean r0 = r7.f6342
            if (r0 == 0) goto L78
            r0 = 0
            r7.f6342 = r0
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.f6358
            es1 r1 = r0.getSemanticsOwner()
            a1 r2 = p000.C0002a1.f23
            n11 r1 = p000.h62.m2382(r1, r2)
            r7.f6344 = r1
            boolean r1 = r7.m3459()
            if (r1 == 0) goto L78
            n11 r1 = r7.f6344
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            l11 r2 = r7.f6346
            r2.m3463()
            l11 r3 = r7.f6347
            r3.m3463()
            r4 = -1
            java.lang.Object r4 = r1.m5525(r4)
            ds1 r4 = (p000.ds1) r4
            if (r4 == 0) goto L3b
            bs1 r4 = r4.f3268
            goto L3c
        L3b:
            r4 = 0
        L3c:
            r4.getClass()
            b0 r5 = new b0
            r6 = 4
            r5.<init>(r6, r1)
            b0 r1 = new b0
            r6 = 5
            r1.<init>(r6, r0)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r4)
            java.util.ArrayList r0 = p000.ks1.m3413(r4, r5, r1, r0)
            int r1 = r0.size()
            r4 = 1
            int r1 = r1 - r4
            if (r4 > r1) goto L78
        L5b:
            int r5 = r4 + (-1)
            java.lang.Object r5 = r0.get(r5)
            bs1 r5 = (p000.bs1) r5
            int r5 = r5.f1826
            java.lang.Object r6 = r0.get(r4)
            bs1 r6 = (p000.bs1) r6
            int r6 = r6.f1826
            r2.m3468(r5, r6)
            r3.m3468(r6, r5)
            if (r4 == r1) goto L78
            int r4 = r4 + 1
            goto L5b
        L78:
            n11 r7 = r7.f6344
            return r7
    }

    /* JADX INFO: renamed from: υ */
    public final p000.ml1 m3458(p000.bs1 r10, android.graphics.Rect r11, p000.iv1 r12) {
            r9 = this;
            i1 r0 = new i1
            r0.<init>(r12)
            yp0 r10 = r10.f1823
            k31 r12 = r10.f12733
            q01 r12 = r12.f5729
            int r1 = r12.f8774
            r1 = r1 & 8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L76
        L14:
            if (r12 == 0) goto L76
            int r1 = r12.f8773
            r1 = r1 & 8
            if (r1 == 0) goto L6d
            r1 = r12
            r5 = r2
        L1e:
            if (r1 == 0) goto L6d
            boolean r6 = r1 instanceof p000.zr1
            if (r6 == 0) goto L30
            r6 = r1
            zr1 r6 = (p000.zr1) r6
            r6.mo600(r0)
            boolean r6 = r0.f4865
            if (r6 == 0) goto L68
            r2 = r1
            goto L76
        L30:
            int r6 = r1.f8773
            r6 = r6 & 8
            if (r6 == 0) goto L68
            boolean r6 = r1 instanceof p000.C1014ya
            if (r6 == 0) goto L68
            r6 = r1
            ya r6 = (p000.C1014ya) r6
            q01 r6 = r6.f12512
            r7 = r4
        L40:
            if (r6 == 0) goto L65
            int r8 = r6.f8773
            r8 = r8 & 8
            if (r8 == 0) goto L62
            int r7 = r7 + 1
            if (r7 != r3) goto L4e
            r1 = r6
            goto L62
        L4e:
            if (r5 != 0) goto L59
            k21 r5 = new k21
            r8 = 16
            q01[] r8 = new p000.q01[r8]
            r5.<init>(r8)
        L59:
            if (r1 == 0) goto L5f
            r5.m3127(r1)
            r1 = r2
        L5f:
            r5.m3127(r6)
        L62:
            q01 r6 = r6.f8776
            goto L40
        L65:
            if (r7 != r3) goto L68
            goto L1e
        L68:
            q01 r1 = p000.h62.m2387(r5)
            goto L1e
        L6d:
            int r1 = r12.f8774
            r1 = r1 & 8
            if (r1 == 0) goto L76
            q01 r12 = r12.f8776
            goto L14
        L76:
            zr1 r2 = (p000.zr1) r2
            if (r2 == 0) goto Lb9
            r12 = r2
            q01 r12 = (p000.q01) r12
            q01 r12 = r12.f8771
            boolean r12 = r12.f8784
            if (r12 != r3) goto Lb9
            q31 r10 = p000.h62.m2444(r2)
            mp0 r12 = p000.AbstractC0782s1.m5332(r10)
            ml1 r10 = r12.mo2337(r10, r4)
            float r12 = r10.f7200
            float r0 = r10.f7201
            float r1 = r10.f7202
            float r10 = r10.f7203
            android.graphics.Rect r9 = r9.m3447(r12, r0, r1, r10)
            int r10 = r9.left
            int r12 = r11.left
            int r10 = r10 - r12
            float r10 = (float) r10
            int r12 = r9.top
            int r11 = r11.top
            int r12 = r12 - r11
            float r11 = (float) r12
            ml1 r12 = new ml1
            int r0 = r9.width()
            float r0 = (float) r0
            float r0 = r0 + r10
            int r9 = r9.height()
            float r9 = (float) r9
            float r9 = r9 + r11
            r12.<init>(r10, r11, r0, r9)
            return r12
        Lb9:
            k31 r9 = r10.f12733
            q31 r9 = r9.f5727
            ml1 r9 = p000.AbstractC0782s1.m5328(r9, r4)
            return r9
    }

    /* JADX INFO: renamed from: φ */
    public final boolean m3459() {
            r2 = this;
            android.view.accessibility.AccessibilityManager r0 = r2.f6361
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L1b
            java.util.List r1 = r2.f6363
            if (r1 != 0) goto L13
            r1 = -1
            java.util.List r1 = r0.getEnabledAccessibilityServiceList(r1)
            r2.f6363 = r1
        L13:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L1b
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: χ */
    public final void m3460(p000.yp0 r2) {
            r1 = this;
            d7 r0 = r1.f6373
            boolean r2 = r0.add(r2)
            if (r2 == 0) goto Lf
            wc r1 = r1.f6374
            s62 r2 = p000.s62.f9751
            r1.mo3385(r2)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ψ */
    public final int m3461(int r1) {
            r0 = this;
            androidx.compose.ui.platform.AndroidComposeView r0 = r0.f6358
            es1 r0 = r0.getSemanticsOwner()
            bs1 r0 = r0.m1953()
            int r0 = r0.f1826
            if (r1 != r0) goto L10
            r0 = -1
            return r0
        L10:
            return r1
    }

    /* JADX INFO: renamed from: ω */
    public final void m3462(p000.bs1 r20, p000.cs1 r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = p000.an0.f333
            o11 r3 = new o11
            r3.<init>()
            r4 = 4
            java.util.List r5 = p000.bs1.m1005(r4, r1)
            yp0 r6 = r1.f1823
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            bs1 r10 = (p000.bs1) r10
            sm0 r11 = r0.m3457()
            int r10 = r10.f1826
            boolean r11 = r11.m5524(r10)
            if (r11 == 0) goto L3d
            o11 r11 = r2.f2738
            boolean r11 = r11.m4152(r10)
            if (r11 != 0) goto L3a
            r0.m3460(r6)
            return
        L3a:
            r3.m4151(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            o11 r2 = r2.f2738
            int[] r5 = r2.f7867
            long[] r2 = r2.f7866
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.m4152(r15)
            if (r15 != 0) goto L80
            r0.m3460(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = p000.bs1.m1005(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            bs1 r3 = (p000.bs1) r3
            n11 r4 = r0.f6351
            int r5 = r3.f1826
            java.lang.Object r4 = r4.m5525(r5)
            cs1 r4 = (p000.cs1) r4
            if (r4 == 0) goto Lb6
            sm0 r5 = r0.m3457()
            int r6 = r3.f1826
            boolean r5 = r5.m5524(r6)
            if (r5 == 0) goto Lb6
            r0.m3462(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
    }
}
