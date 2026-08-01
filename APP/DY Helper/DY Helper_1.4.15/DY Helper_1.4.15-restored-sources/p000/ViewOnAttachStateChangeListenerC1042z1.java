package p000;

/* JADX INFO: renamed from: z1 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1042z1 implements p000.InterfaceC0332gr, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ε */
    public final androidx.compose.p001ui.platform.AndroidComposeView f12924;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0930w0 f12925;

    /* JADX INFO: renamed from: η */
    public p000.C0574n5 f12926;

    /* JADX INFO: renamed from: θ */
    public final java.util.ArrayList f12927;

    /* JADX INFO: renamed from: ι */
    public final long f12928;

    /* JADX INFO: renamed from: κ */
    public p000.EnumC0893v1 f12929;

    /* JADX INFO: renamed from: λ */
    public boolean f12930;

    /* JADX INFO: renamed from: μ */
    public final p000.C0942wc f12931;

    /* JADX INFO: renamed from: ν */
    public p000.n11 f12932;

    /* JADX INFO: renamed from: ξ */
    public long f12933;

    /* JADX INFO: renamed from: ο */
    public final p000.n11 f12934;

    /* JADX INFO: renamed from: π */
    public p000.cs1 f12935;

    /* JADX INFO: renamed from: ρ */
    public boolean f12936;

    /* JADX INFO: renamed from: σ */
    public final p000.RunnableC1090 f12937;

    public ViewOnAttachStateChangeListenerC1042z1(androidx.compose.p001ui.platform.AndroidComposeView r3, p000.C0930w0 r4) {
            r2 = this;
            r2.<init>()
            r2.f12924 = r3
            r2.f12925 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.f12927 = r4
            r0 = 100
            r2.f12928 = r0
            v1 r4 = p000.EnumC0893v1.f11049
            r2.f12929 = r4
            r4 = 1
            r2.f12930 = r4
            r0 = 0
            r1 = 6
            wc r4 = p000.ln0.m3619(r4, r0, r1)
            r2.f12931 = r4
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            n11 r4 = p000.tm0.f10413
            r4.getClass()
            r2.f12932 = r4
            n11 r0 = new n11
            r0.<init>()
            r2.f12934 = r0
            cs1 r0 = new cs1
            es1 r3 = r3.getSemanticsOwner()
            bs1 r3 = r3.m1953()
            r0.<init>(r3, r4)
            r2.f12935 = r0
            ν r3 = new ν
            r4 = 2
            r3.<init>(r4, r2)
            r2.f12937 = r3
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            androidx.compose.ui.platform.AndroidComposeView r2 = r1.f12924
            android.os.Handler r2 = r2.getHandler()
            r2.getClass()
            ν r0 = r1.f12937
            r2.removeCallbacks(r0)
            r2 = 0
            r1.f12926 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.Object m7056(p000.AbstractC0695pp r8) {
            r7 = this;
            boolean r0 = r8 instanceof p000.C0968x1
            if (r0 == 0) goto L13
            r0 = r8
            x1 r0 = (p000.C0968x1) r0
            int r1 = r0.f11971
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11971 = r1
            goto L18
        L13:
            x1 r0 = new x1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f11969
            int r1 = r0.f11971
            r2 = 2
            r3 = 1
            cq r4 = p000.EnumC0184cq.f2716
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            vc r1 = r0.f11968
            p000.i81.m2649(r8)
            goto L46
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r7)
            r7 = 0
            return r7
        L33:
            vc r1 = r0.f11968
            p000.i81.m2649(r8)
            goto L51
        L39:
            p000.i81.m2649(r8)
            wc r8 = r7.f12931
            r8.getClass()
            vc r1 = new vc
            r1.<init>(r8)
        L46:
            r0.f11968 = r1
            r0.f11971 = r3
            java.lang.Object r8 = r1.m6166(r0)
            if (r8 != r4) goto L51
            goto L84
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L85
            r1.m6167()
            boolean r8 = r7.m7060()
            if (r8 == 0) goto L65
            r7.m7061()
        L65:
            androidx.compose.ui.platform.AndroidComposeView r8 = r7.f12924
            android.os.Handler r8 = r8.getHandler()
            boolean r5 = r7.f12936
            if (r5 != 0) goto L78
            if (r8 == 0) goto L78
            r7.f12936 = r3
            ν r5 = r7.f12937
            r8.post(r5)
        L78:
            r0.f11968 = r1
            r0.f11971 = r2
            long r5 = r7.f12928
            java.lang.Object r8 = p000.jx0.m3053(r5, r0)
            if (r8 != r4) goto L46
        L84:
            return r4
        L85:
            s62 r7 = p000.s62.f9751
            return r7
    }

    /* JADX INFO: renamed from: β */
    public final void m7057(p000.sm0 r36) {
            r35 = this;
            r0 = r35
            r1 = r36
            int[] r2 = r1.f9963
            long[] r3 = r1.f9962
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L213
            r6 = 0
        Le:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r12
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 == 0) goto L203
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r14 = 0
        L28:
            if (r14 >= r9) goto L1fb
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r7 & r15
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L1dd
            int r17 = r6 << 3
            int r17 = r17 + r14
            r5 = r2[r17]
            r17 = r11
            n11 r11 = r0.f12934
            java.lang.Object r11 = r11.m5525(r5)
            cs1 r11 = (p000.cs1) r11
            java.lang.Object r5 = r1.m5525(r5)
            ds1 r5 = (p000.ds1) r5
            r21 = 0
            if (r5 == 0) goto L51
            bs1 r5 = r5.f3268
            goto L53
        L51:
            r5 = r21
        L53:
            if (r5 == 0) goto L1d6
            r22 = r12
            int r12 = r5.f1826
            xr1 r5 = r5.f1824
            b21 r5 = r5.f12268
            java.lang.String r13 = "Invalid content capture ID"
            if (r11 != 0) goto L10b
            java.lang.Object[] r11 = r5.f1428
            r24 = r15
            long[] r15 = r5.f1427
            r16 = r10
            int r10 = r15.length
            int r10 = r10 + (-2)
            r26 = r2
            r27 = r3
            if (r10 < 0) goto L105
            r1 = 0
        L73:
            r2 = r15[r1]
            r28 = r7
            long r7 = ~r2
            long r7 = r7 << r17
            long r7 = r7 & r2
            long r7 = r7 & r22
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto Lf3
            int r7 = r1 - r10
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = 0
        L89:
            if (r8 >= r7) goto Lea
            long r30 = r2 & r24
            int r30 = (r30 > r19 ? 1 : (r30 == r19 ? 0 : -1))
            if (r30 >= 0) goto Ldb
            int r30 = r1 << 3
            int r30 = r30 + r8
            r30 = r11[r30]
            r31 = r2
            r2 = r30
            is1 r2 = (p000.is1) r2
            is1 r3 = p000.fs1.f4085
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 == 0) goto Ldd
            java.lang.Object r2 = r5.m695(r3)
            if (r2 != 0) goto Lad
            r2 = r21
        Lad:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = p000.AbstractC0984xh.m6640(r2)
            g4 r2 = (p000.C0309g4) r2
            goto Lba
        Lb8:
            r2 = r21
        Lba:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            n5 r3 = r0.f12926
            if (r3 != 0) goto Lc3
            goto Ldd
        Lc3:
            r33 = r13
            r30 = r14
            long r13 = (long) r12
            android.view.autofill.AutofillId r13 = r3.m3967(r13)
            if (r13 == 0) goto Ld6
            java.lang.Object r3 = r3.f7387
            android.view.contentcapture.ContentCaptureSession r3 = (android.view.contentcapture.ContentCaptureSession) r3
            r3.notifyViewTextChanged(r13, r2)
            goto Le1
        Ld6:
            pm r0 = p000.lz1.m3680(r33)
            throw r0
        Ldb:
            r31 = r2
        Ldd:
            r33 = r13
            r30 = r14
        Le1:
            long r2 = r31 >> r16
            int r8 = r8 + 1
            r14 = r30
            r13 = r33
            goto L89
        Lea:
            r33 = r13
            r30 = r14
            r2 = r16
            if (r7 != r2) goto L1d3
            goto Lf7
        Lf3:
            r33 = r13
            r30 = r14
        Lf7:
            if (r1 == r10) goto L1d3
            int r1 = r1 + 1
            r7 = r28
            r14 = r30
            r13 = r33
            r16 = 8
            goto L73
        L105:
            r28 = r7
            r30 = r14
            goto L1d3
        L10b:
            r26 = r2
            r27 = r3
            r28 = r7
            r33 = r13
            r30 = r14
            r24 = r15
            java.lang.Object[] r1 = r5.f1428
            long[] r2 = r5.f1427
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L1d3
            r7 = 0
        L121:
            r13 = r2[r7]
            r8 = r1
            r10 = r2
            long r1 = ~r13
            long r1 = r1 << r17
            long r1 = r1 & r13
            long r1 = r1 & r22
            int r1 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r1 == 0) goto L1c4
            int r1 = r7 - r3
            int r1 = ~r1
            int r1 = r1 >>> 31
            r16 = 8
            int r1 = 8 - r1
            r2 = 0
        L139:
            if (r2 >= r1) goto L1bb
            long r31 = r13 & r24
            int r15 = (r31 > r19 ? 1 : (r31 == r19 ? 0 : -1))
            if (r15 >= 0) goto L1aa
            int r15 = r7 << 3
            int r15 = r15 + r2
            r15 = r8[r15]
            is1 r15 = (p000.is1) r15
            r31 = r2
            is1 r2 = p000.fs1.f4085
            boolean r15 = p000.ln0.m3626(r15, r2)
            if (r15 == 0) goto L1ac
            xr1 r15 = r11.f2737
            b21 r15 = r15.f12268
            java.lang.Object r15 = r15.m695(r2)
            if (r15 != 0) goto L15e
            r15 = r21
        L15e:
            java.util.List r15 = (java.util.List) r15
            if (r15 == 0) goto L169
            java.lang.Object r15 = p000.AbstractC0984xh.m6640(r15)
            g4 r15 = (p000.C0309g4) r15
            goto L16b
        L169:
            r15 = r21
        L16b:
            java.lang.Object r2 = r5.m695(r2)
            if (r2 != 0) goto L173
            r2 = r21
        L173:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L17e
            java.lang.Object r2 = p000.AbstractC0984xh.m6640(r2)
            g4 r2 = (p000.C0309g4) r2
            goto L180
        L17e:
            r2 = r21
        L180:
            boolean r15 = p000.ln0.m3626(r15, r2)
            if (r15 != 0) goto L1ac
            java.lang.String r2 = java.lang.String.valueOf(r2)
            n5 r15 = r0.f12926
            if (r15 != 0) goto L18f
            goto L1ac
        L18f:
            r34 = r10
            r32 = r11
            long r10 = (long) r12
            android.view.autofill.AutofillId r10 = r15.m3967(r10)
            if (r10 == 0) goto L1a2
            java.lang.Object r11 = r15.f7387
            android.view.contentcapture.ContentCaptureSession r11 = (android.view.contentcapture.ContentCaptureSession) r11
            r11.notifyViewTextChanged(r10, r2)
            goto L1a7
        L1a2:
            pm r0 = p000.lz1.m3680(r33)
            throw r0
        L1a7:
            r2 = 8
            goto L1b1
        L1aa:
            r31 = r2
        L1ac:
            r34 = r10
            r32 = r11
            goto L1a7
        L1b1:
            long r13 = r13 >> r2
            int r10 = r31 + 1
            r2 = r10
            r11 = r32
            r10 = r34
            goto L139
        L1bb:
            r34 = r10
            r32 = r11
            r2 = 8
            if (r1 != r2) goto L1d3
            goto L1c8
        L1c4:
            r34 = r10
            r32 = r11
        L1c8:
            if (r7 == r3) goto L1d3
            int r7 = r7 + 1
            r1 = r8
            r11 = r32
            r2 = r34
            goto L121
        L1d3:
            r2 = 8
            goto L1ea
        L1d6:
            java.lang.String r0 = "no value for specified key"
            pm r0 = p000.lz1.m3680(r0)
            throw r0
        L1dd:
            r26 = r2
            r27 = r3
            r28 = r7
            r17 = r11
            r22 = r12
            r30 = r14
            r2 = r10
        L1ea:
            long r7 = r28 >> r2
            int r14 = r30 + 1
            r1 = r36
            r10 = r2
            r11 = r17
            r12 = r22
            r2 = r26
            r3 = r27
            goto L28
        L1fb:
            r26 = r2
            r27 = r3
            r2 = r10
            if (r9 != r2) goto L213
            goto L207
        L203:
            r26 = r2
            r27 = r3
        L207:
            if (r6 == r4) goto L213
            int r6 = r6 + 1
            r1 = r36
            r2 = r26
            r3 = r27
            goto Le
        L213:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m7058(p000.bs1 r7, p000.e80 r8) {
            r6 = this;
            r7.getClass()
            r0 = 4
            java.util.List r7 = p000.bs1.m1005(r0, r7)
            int r0 = r7.size()
            r1 = 0
            r2 = r1
        Le:
            if (r1 >= r0) goto L2f
            java.lang.Object r3 = r7.get(r1)
            r4 = r3
            bs1 r4 = (p000.bs1) r4
            sm0 r5 = r6.m7059()
            int r4 = r4.f1826
            boolean r4 = r5.m5524(r4)
            if (r4 == 0) goto L2c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r8.invoke(r4, r3)
            int r2 = r2 + 1
        L2c:
            int r1 = r1 + 1
            goto Le
        L2f:
            return
    }

    @Override // p000.InterfaceC0332gr
    /* JADX INFO: renamed from: δ */
    public final void mo385(p000.hr0 r1) {
            r0 = this;
            androidx.compose.ui.platform.AndroidComposeView r1 = r0.f12924
            es1 r1 = r1.getSemanticsOwner()
            bs1 r1 = r1.m1953()
            r0.m7064(r1)
            r0.m7061()
            r1 = 0
            r0.f12926 = r1
            return
    }

    /* JADX INFO: renamed from: ε */
    public final p000.sm0 m7059() {
            r2 = this;
            boolean r0 = r2.f12930
            if (r0 == 0) goto L1b
            r0 = 0
            r2.f12930 = r0
            androidx.compose.ui.platform.AndroidComposeView r0 = r2.f12924
            es1 r0 = r0.getSemanticsOwner()
            a1 r1 = p000.C0002a1.f24
            n11 r0 = p000.h62.m2382(r0, r1)
            r2.f12932 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.f12933 = r0
        L1b:
            n11 r2 = r2.f12932
            return r2
    }

    /* JADX INFO: renamed from: ζ */
    public final boolean m7060() {
            r0 = this;
            n5 r0 = r0.f12926
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // p000.InterfaceC0332gr
    /* JADX INFO: renamed from: η */
    public final void mo2318(p000.hr0 r2) {
            r1 = this;
            w0 r2 = r1.f12925
            java.lang.Object r2 = r2.invoke()
            n5 r2 = (p000.C0574n5) r2
            r1.f12926 = r2
            androidx.compose.ui.platform.AndroidComposeView r2 = r1.f12924
            es1 r2 = r2.getSemanticsOwner()
            bs1 r2 = r2.m1953()
            r0 = -1
            r1.m7063(r0, r2)
            r1.m7061()
            return
    }

    /* JADX INFO: renamed from: ι */
    public final void m7061() {
            r8 = this;
            n5 r0 = r8.f12926
            if (r0 != 0) goto L5
            goto L5d
        L5:
            java.lang.Object r1 = r0.f7387
            android.view.contentcapture.ContentCaptureSession r1 = (android.view.contentcapture.ContentCaptureSession) r1
            java.util.ArrayList r8 = r8.f12927
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L5d
            int r2 = r8.size()
            r3 = 0
            r4 = r3
        L17:
            r5 = 1
            if (r4 >= r2) goto L49
            java.lang.Object r6 = r8.get(r4)
            bp r6 = (p000.C0085bp) r6
            cp r7 = r6.f1798
            int r7 = r7.ordinal()
            if (r7 == 0) goto L3b
            if (r7 != r5) goto L37
            int r5 = r6.f1796
            long r5 = (long) r5
            android.view.autofill.AutofillId r5 = r0.m3967(r5)
            if (r5 == 0) goto L46
            r1.notifyViewDisappeared(r5)
            goto L46
        L37:
            p000.C1080.m7272()
            return
        L3b:
            y21 r5 = r6.f1799
            if (r5 == 0) goto L46
            java.lang.Object r5 = r5.f12428
            android.view.ViewStructure r5 = (android.view.ViewStructure) r5
            r1.notifyViewAppeared(r5)
        L46:
            int r4 = r4 + 1
            goto L17
        L49:
            java.lang.Object r0 = r0.f7388
            android.view.View r0 = (android.view.View) r0
            android.view.autofill.AutofillId r0 = r0.getAutofillId()
            long[] r2 = new long[r5]
            r4 = -9223372036854775808
            r2[r3] = r4
            r1.notifyViewsDisappeared(r0, r2)
            r8.clear()
        L5d:
            return
    }

    /* JADX INFO: renamed from: λ */
    public final void m7062(p000.bs1 r6, p000.cs1 r7) {
            r5 = this;
            y1 r0 = new y1
            r1 = 0
            r0.<init>(r7, r1, r5)
            r5.m7058(r6, r0)
            r7 = 4
            java.util.List r6 = p000.bs1.m1005(r7, r6)
            int r7 = r6.size()
            r0 = 0
        L13:
            if (r0 >= r7) goto L45
            java.lang.Object r1 = r6.get(r0)
            bs1 r1 = (p000.bs1) r1
            sm0 r2 = r5.m7059()
            int r3 = r1.f1826
            boolean r2 = r2.m5524(r3)
            if (r2 == 0) goto L42
            n11 r2 = r5.f12934
            boolean r4 = r2.m5524(r3)
            if (r4 == 0) goto L42
            java.lang.Object r2 = r2.m5525(r3)
            if (r2 == 0) goto L3b
            cs1 r2 = (p000.cs1) r2
            r5.m7062(r1, r2)
            goto L42
        L3b:
            java.lang.String r5 = "node not present in pruned tree before this change"
            pm r5 = p000.lz1.m3680(r5)
            throw r5
        L42:
            int r0 = r0 + 1
            goto L13
        L45:
            return
    }

    /* JADX INFO: renamed from: μ */
    public final void m7063(int r18, p000.bs1 r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r0.m7060()
            if (r2 != 0) goto Lb
            return
        Lb:
            xr1 r2 = r1.f1824
            b21 r2 = r2.f12268
            is1 r3 = p000.fs1.f4087
            java.lang.Object r3 = r2.m695(r3)
            r4 = 0
            if (r3 != 0) goto L19
            r3 = r4
        L19:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            v1 r5 = r0.f12929
            v1 r6 = p000.EnumC0893v1.f11049
            if (r5 != r6) goto L45
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r5 = p000.ln0.m3626(r3, r5)
            if (r5 == 0) goto L45
            is1 r3 = p000.wr1.f11823
            java.lang.Object r2 = r2.m695(r3)
            if (r2 != 0) goto L32
            r2 = r4
        L32:
            м r2 = (p000.C1114) r2
            if (r2 == 0) goto L6e
            m80 r2 = r2.f13447
            a80 r2 = (p000.a80) r2
            if (r2 == 0) goto L6e
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r2.invoke(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            goto L6e
        L45:
            v1 r5 = r0.f12929
            v1 r6 = p000.EnumC0893v1.f11050
            if (r5 != r6) goto L6e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r3 = p000.ln0.m3626(r3, r5)
            if (r3 == 0) goto L6e
            is1 r3 = p000.wr1.f11823
            java.lang.Object r2 = r2.m695(r3)
            if (r2 != 0) goto L5c
            r2 = r4
        L5c:
            м r2 = (p000.C1114) r2
            if (r2 == 0) goto L6e
            m80 r2 = r2.f13447
            a80 r2 = (p000.a80) r2
            if (r2 == 0) goto L6e
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Object r2 = r2.invoke(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L6e:
            int r6 = r1.f1826
            n5 r2 = r0.f12926
            if (r2 != 0) goto L77
        L74:
            r10 = r4
            goto L18e
        L77:
            androidx.compose.ui.platform.AndroidComposeView r3 = r0.f12924
            android.view.autofill.AutofillId r3 = r3.getAutofillId()
            bs1 r5 = r1.m1016()
            int r7 = r1.f1826
            if (r5 == 0) goto L8f
            int r3 = r5.f1826
            long r8 = (long) r3
            android.view.autofill.AutofillId r3 = r2.m3967(r8)
            if (r3 != 0) goto L8f
            goto L74
        L8f:
            long r8 = (long) r7
            java.lang.Object r2 = r2.f7387
            android.view.contentcapture.ContentCaptureSession r2 = (android.view.contentcapture.ContentCaptureSession) r2
            android.view.ViewStructure r10 = r2.newVirtualViewStructure(r3, r8)
            y21 r2 = new y21
            r2.<init>(r10)
            xr1 r3 = r1.f1824
            is1 r5 = p000.fs1.f4093
            b21 r8 = r3.f12268
            boolean r5 = r8.m691(r5)
            if (r5 == 0) goto Laa
            goto L74
        Laa:
            android.os.Bundle r5 = r10.getExtras()
            if (r5 == 0) goto Lbe
            java.lang.String r9 = "android.view.contentcapture.EventTimestamp"
            long r11 = r0.f12933
            r5.putLong(r9, r11)
            java.lang.String r9 = "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX"
            r11 = r18
            r5.putInt(r9, r11)
        Lbe:
            is1 r5 = p000.fs1.f4121
            java.lang.Object r5 = r8.m695(r5)
            if (r5 != 0) goto Lc7
            r5 = r4
        Lc7:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto Lce
            r10.setId(r7, r4, r4, r5)
        Lce:
            is1 r5 = p000.fs1.f4110
            java.lang.Object r5 = r8.m695(r5)
            if (r5 != 0) goto Ld7
            r5 = r4
        Ld7:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto Le0
            java.lang.String r5 = "android.widget.ViewGroup"
            r10.setClassName(r5)
        Le0:
            is1 r5 = p000.fs1.f4085
            java.lang.Object r5 = r8.m695(r5)
            if (r5 != 0) goto Le9
            r5 = r4
        Le9:
            java.util.List r5 = (java.util.List) r5
            r7 = 62
            java.lang.String r9 = "\n"
            if (r5 == 0) goto Lfd
            java.lang.String r11 = "android.widget.TextView"
            r10.setClassName(r11)
            java.lang.String r5 = p000.hu0.m2541(r5, r9, r4, r7)
            r10.setText(r5)
        Lfd:
            is1 r5 = p000.fs1.f4089
            java.lang.Object r5 = r8.m695(r5)
            if (r5 != 0) goto L106
            r5 = r4
        L106:
            g4 r5 = (p000.C0309g4) r5
            if (r5 == 0) goto L112
            java.lang.String r11 = "android.widget.EditText"
            r10.setClassName(r11)
            r10.setText(r5)
        L112:
            is1 r5 = p000.fs1.f4098
            java.lang.Object r5 = r8.m695(r5)
            if (r5 != 0) goto L11b
            r5 = r4
        L11b:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L126
            java.lang.String r5 = p000.hu0.m2541(r5, r9, r4, r7)
            r10.setContentDescription(r5)
        L126:
            is1 r5 = p000.fs1.f4120
            java.lang.Object r5 = r8.m695(r5)
            if (r5 != 0) goto L12f
            r5 = r4
        L12f:
            so1 r5 = (p000.so1) r5
            if (r5 == 0) goto L13e
            int r5 = r5.f9982
            java.lang.String r5 = p000.v71.m6047(r5)
            if (r5 == 0) goto L13e
            r10.setClassName(r5)
        L13e:
            m32 r3 = p000.v71.m6038(r3)
            if (r3 == 0) goto L160
            l32 r3 = r3.f6923
            w32 r5 = r3.f6403
            yr r3 = r3.f6408
            ux1 r5 = r5.f11556
            long r7 = r5.f10997
            float r5 = p000.y32.m6820(r7)
            float r7 = r3.mo586()
            float r7 = r7 * r5
            float r3 = r3.mo590()
            float r3 = r3 * r7
            r5 = 0
            r10.setTextStyle(r3, r5, r5, r5)
        L160:
            q31 r3 = r1.m1009()
            if (r3 == 0) goto L176
            q01 r5 = r3.mo2315()
            boolean r5 = r5.f8784
            if (r5 == 0) goto L16f
            r4 = r3
        L16f:
            if (r4 == 0) goto L176
            ml1 r3 = r1.m1006(r4)
            goto L178
        L176:
            ml1 r3 = p000.ml1.f7199
        L178:
            float r4 = r3.f7200
            int r11 = (int) r4
            float r5 = r3.f7201
            int r12 = (int) r5
            float r7 = r3.f7202
            float r7 = r7 - r4
            int r15 = (int) r7
            float r3 = r3.f7203
            float r3 = r3 - r5
            int r3 = (int) r3
            r13 = 0
            r14 = 0
            r16 = r3
            r10.setDimens(r11, r12, r13, r14, r15, r16)
            r10 = r2
        L18e:
            if (r10 != 0) goto L191
            goto L19f
        L191:
            bp r5 = new bp
            long r7 = r0.f12933
            cp r9 = p000.EnumC0183cp.f2700
            r5.<init>(r6, r7, r9, r10)
            java.util.ArrayList r2 = r0.f12927
            r2.add(r5)
        L19f:
            ξ r2 = new ξ
            r3 = 1
            r2.<init>(r3, r0)
            r0.m7058(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ν */
    public final void m7064(p000.bs1 r8) {
            r7 = this;
            boolean r0 = r7.m7060()
            if (r0 != 0) goto L7
            goto L30
        L7:
            int r2 = r8.f1826
            bp r1 = new bp
            long r3 = r7.f12933
            cp r5 = p000.EnumC0183cp.f2701
            r6 = 0
            r1.<init>(r2, r3, r5, r6)
            java.util.ArrayList r0 = r7.f12927
            r0.add(r1)
            r0 = 4
            java.util.List r8 = p000.bs1.m1005(r0, r8)
            int r0 = r8.size()
            r1 = 0
        L22:
            if (r1 >= r0) goto L30
            java.lang.Object r2 = r8.get(r1)
            bs1 r2 = (p000.bs1) r2
            r7.m7064(r2)
            int r1 = r1 + 1
            goto L22
        L30:
            return
    }

    /* JADX INFO: renamed from: ξ */
    public final void m7065() {
            r17 = this;
            r0 = r17
            n11 r1 = r0.f12934
            r1.m3938()
            sm0 r2 = r0.m7059()
            int[] r3 = r2.f9963
            java.lang.Object[] r4 = r2.f9964
            long[] r2 = r2.f9962
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            ds1 r13 = (p000.ds1) r13
            cs1 r15 = new cs1
            bs1 r13 = r13.f3268
            sm0 r6 = r0.m7059()
            r15.<init>(r13, r6)
            r1.m3942(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            cs1 r1 = new cs1
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.f12924
            es1 r2 = r2.getSemanticsOwner()
            bs1 r2 = r2.m1953()
            sm0 r3 = r0.m7059()
            r1.<init>(r2, r3)
            r0.f12935 = r1
            return
    }
}
