package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class kq0 implements p000.InterfaceC0291fn {

    /* JADX INFO: renamed from: ε */
    public final p000.yp0 f6080;

    /* JADX INFO: renamed from: ζ */
    public p000.AbstractC0878un f6081;

    /* JADX INFO: renamed from: η */
    public int f6082;

    /* JADX INFO: renamed from: θ */
    public int f6083;

    /* JADX INFO: renamed from: ι */
    public final p000.b21 f6084;

    /* JADX INFO: renamed from: κ */
    public final p000.b21 f6085;

    /* JADX INFO: renamed from: λ */
    public final p000.fq0 f6086;

    /* JADX INFO: renamed from: μ */
    public final p000.cq0 f6087;

    /* JADX INFO: renamed from: ν */
    public final p000.b21 f6088;

    /* JADX INFO: renamed from: ξ */
    public final p000.j12 f6089;

    /* JADX INFO: renamed from: ο */
    public final p000.b21 f6090;

    /* JADX INFO: renamed from: π */
    public final p000.k21 f6091;

    /* JADX INFO: renamed from: ρ */
    public int f6092;

    /* JADX INFO: renamed from: σ */
    public int f6093;

    public kq0(p000.yp0 r2) {
            r1 = this;
            r1.<init>()
            r1.f6080 = r2
            long[] r2 = p000.tq1.f10431
            b21 r2 = new b21
            r2.<init>()
            r1.f6084 = r2
            b21 r2 = new b21
            r2.<init>()
            r1.f6085 = r2
            fq0 r2 = new fq0
            r2.<init>(r1)
            r1.f6086 = r2
            cq0 r2 = new cq0
            r2.<init>(r1)
            r1.f6087 = r2
            b21 r2 = new b21
            r2.<init>()
            r1.f6088 = r2
            j12 r2 = new j12
            r2.<init>()
            r1.f6089 = r2
            b21 r2 = new b21
            r2.<init>()
            r1.f6090 = r2
            k21 r2 = new k21
            r0 = 16
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.<init>(r0)
            r1.f6091 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m3404(p000.dq0 r1) {
            r0 = this;
            r1.getClass()
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m3405(int r14) {
            r13 = this;
            r0 = 0
            r13.f6092 = r0
            yp0 r1 = r13.f6080
            java.util.List r1 = r1.m7000()
            r2 = r1
            h21 r2 = (p000.h21) r2
            k21 r3 = r2.f4540
            int r3 = r3.f5718
            int r4 = r13.f6093
            int r3 = r3 - r4
            r4 = 1
            int r3 = r3 - r4
            if (r14 > r3) goto Lcd
            j12 r5 = r13.f6089
            r5.clear()
            if (r14 > r3) goto L40
            r5 = r14
        L1f:
            java.lang.Object r6 = r2.get(r5)
            yp0 r6 = (p000.yp0) r6
            b21 r7 = r13.f6084
            java.lang.Object r6 = r7.m695(r6)
            r6.getClass()
            dq0 r6 = (p000.dq0) r6
            java.lang.Object r6 = r6.f3235
            j12 r7 = r13.f6089
            java.lang.Object r7 = r7.f5295
            w11 r7 = (p000.w11) r7
            r7.m6299(r6)
            if (r5 == r3) goto L40
            int r5 = r5 + 1
            goto L1f
        L40:
            j12 r2 = r13.f6089
            r2.clear()
            tw1 r2 = p000.e81.m1877()
            if (r2 == 0) goto L50
            a80 r5 = r2.mo2001()
            goto L51
        L50:
            r5 = 0
        L51:
            tw1 r6 = p000.e81.m1880(r2)
            r7 = r0
        L56:
            if (r3 < r14) goto Lc9
            r8 = r1
            h21 r8 = (p000.h21) r8     // Catch: java.lang.Throwable -> La4
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> La4
            yp0 r8 = (p000.yp0) r8     // Catch: java.lang.Throwable -> La4
            b21 r9 = r13.f6084     // Catch: java.lang.Throwable -> La4
            java.lang.Object r9 = r9.m695(r8)     // Catch: java.lang.Throwable -> La4
            r9.getClass()     // Catch: java.lang.Throwable -> La4
            dq0 r9 = (p000.dq0) r9     // Catch: java.lang.Throwable -> La4
            java.lang.Object r10 = r9.f3235     // Catch: java.lang.Throwable -> La4
            j12 r11 = r13.f6089     // Catch: java.lang.Throwable -> La4
            java.lang.Object r11 = r11.f5295     // Catch: java.lang.Throwable -> La4
            w11 r11 = (p000.w11) r11     // Catch: java.lang.Throwable -> La4
            boolean r11 = r11.m6301(r10)     // Catch: java.lang.Throwable -> La4
            if (r11 == 0) goto La6
            int r11 = r13.f6092     // Catch: java.lang.Throwable -> La4
            int r11 = r11 + r4
            r13.f6092 = r11     // Catch: java.lang.Throwable -> La4
            x91 r11 = r9.f3240     // Catch: java.lang.Throwable -> La4
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Throwable -> La4
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> La4
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> La4
            if (r11 == 0) goto Lbd
            bq0 r8 = r8.f12734     // Catch: java.lang.Throwable -> La4
            ox0 r11 = r8.f1815     // Catch: java.lang.Throwable -> La4
            wp0 r12 = p000.wp0.f11798     // Catch: java.lang.Throwable -> La4
            r11.f8335 = r12     // Catch: java.lang.Throwable -> La4
            jw0 r8 = r8.f1816     // Catch: java.lang.Throwable -> La4
            if (r8 == 0) goto L9b
            r8.f5604 = r12     // Catch: java.lang.Throwable -> La4
        L9b:
            r13.m3409(r9, r0)     // Catch: java.lang.Throwable -> La4
            boolean r8 = r9.f3241     // Catch: java.lang.Throwable -> La4
            if (r8 == 0) goto Lbd
            r7 = r4
            goto Lbd
        La4:
            r13 = move-exception
            goto Lc5
        La6:
            yp0 r11 = r13.f6080     // Catch: java.lang.Throwable -> La4
            r11.f12758 = r4     // Catch: java.lang.Throwable -> La4
            b21 r12 = r13.f6084     // Catch: java.lang.Throwable -> La4
            r12.m699(r8)     // Catch: java.lang.Throwable -> La4
            zn r8 = r9.f3237     // Catch: java.lang.Throwable -> La4
            if (r8 == 0) goto Lb6
            r8.m7193()     // Catch: java.lang.Throwable -> La4
        Lb6:
            yp0 r8 = r13.f6080     // Catch: java.lang.Throwable -> La4
            r8.m6985(r3, r4)     // Catch: java.lang.Throwable -> La4
            r11.f12758 = r0     // Catch: java.lang.Throwable -> La4
        Lbd:
            b21 r8 = r13.f6085     // Catch: java.lang.Throwable -> La4
            r8.m699(r10)     // Catch: java.lang.Throwable -> La4
            int r3 = r3 + (-1)
            goto L56
        Lc5:
            p000.e81.m1885(r2, r6, r5)
            throw r13
        Lc9:
            p000.e81.m1885(r2, r6, r5)
            goto Lce
        Lcd:
            r7 = r0
        Lce:
            if (r7 == 0) goto Lea
            java.lang.Object r14 = p000.ax1.f1362
            monitor-enter(r14)
            sa0 r1 = p000.ax1.f1369     // Catch: java.lang.Throwable -> Le7
            c21 r1 = r1.f3730     // Catch: java.lang.Throwable -> Le7
            if (r1 == 0) goto Le0
            boolean r1 = r1.m1114()     // Catch: java.lang.Throwable -> Le7
            if (r1 != r4) goto Le0
            r0 = r4
        Le0:
            monitor-exit(r14)
            if (r0 == 0) goto Lea
            p000.ax1.m619()
            goto Lea
        Le7:
            r13 = move-exception
            monitor-exit(r14)
            throw r13
        Lea:
            r13.m3406()
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m3406() {
            r4 = this;
            yp0 r0 = r4.f6080
            java.util.List r0 = r0.m7000()
            h21 r0 = (p000.h21) r0
            k21 r0 = r0.f4540
            int r0 = r0.f5718
            b21 r1 = r4.f6084
            int r2 = r1.f1431
            if (r2 != r0) goto L13
            goto L33
        L13:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Inconsistency between the count of nodes tracked by the state ("
            r2.<init>(r3)
            int r1 = r1.f1431
            r2.append(r1)
            java.lang.String r1 = ") and the children count on the SubcomposeLayout ("
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = "). Are you trying to use the state of the disposed SubcomposeLayout?"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            p000.am0.m177(r1)
        L33:
            int r1 = r4.f6092
            int r1 = r0 - r1
            int r2 = r4.f6093
            int r1 = r1 - r2
            if (r1 < 0) goto L3d
            goto L5b
        L3d:
            java.lang.String r1 = "Incorrect state. Total children "
            java.lang.String r2 = ". Reusable children "
            java.lang.StringBuilder r0 = p000.a12.m19(r0, r1, r2)
            int r1 = r4.f6092
            r0.append(r1)
            java.lang.String r1 = ". Precomposed children "
            r0.append(r1)
            int r1 = r4.f6093
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.am0.m177(r0)
        L5b:
            b21 r0 = r4.f6088
            int r1 = r0.f1431
            int r2 = r4.f6093
            if (r1 != r2) goto L64
            return
        L64:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Incorrect state. Precomposed children "
            r1.<init>(r2)
            int r4 = r4.f6093
            r1.append(r4)
            java.lang.String r4 = ". Map size "
            r1.append(r4)
            int r4 = r0.f1431
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            p000.am0.m177(r4)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m3407(boolean r11) {
            r10 = this;
            r0 = 0
            r10.f6093 = r0
            b21 r1 = r10.f6088
            r1.m689()
            yp0 r1 = r10.f6080
            java.util.List r1 = r1.m7000()
            r2 = r1
            h21 r2 = (p000.h21) r2
            k21 r2 = r2.f4540
            int r2 = r2.f5718
            int r3 = r10.f6092
            if (r3 == r2) goto L75
            r10.f6092 = r2
            tw1 r3 = p000.e81.m1877()
            if (r3 == 0) goto L26
            a80 r4 = r3.mo2001()
            goto L27
        L26:
            r4 = 0
        L27:
            tw1 r5 = p000.e81.m1880(r3)
        L2b:
            if (r0 >= r2) goto L6d
            r6 = r1
            h21 r6 = (p000.h21) r6     // Catch: java.lang.Throwable -> L64
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Throwable -> L64
            yp0 r6 = (p000.yp0) r6     // Catch: java.lang.Throwable -> L64
            b21 r7 = r10.f6084     // Catch: java.lang.Throwable -> L64
            java.lang.Object r7 = r7.m695(r6)     // Catch: java.lang.Throwable -> L64
            dq0 r7 = (p000.dq0) r7     // Catch: java.lang.Throwable -> L64
            if (r7 == 0) goto L66
            x91 r8 = r7.f3240     // Catch: java.lang.Throwable -> L64
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L64
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L64
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto L66
            bq0 r6 = r6.f12734     // Catch: java.lang.Throwable -> L64
            ox0 r8 = r6.f1815     // Catch: java.lang.Throwable -> L64
            wp0 r9 = p000.wp0.f11798     // Catch: java.lang.Throwable -> L64
            r8.f8335 = r9     // Catch: java.lang.Throwable -> L64
            jw0 r6 = r6.f1816     // Catch: java.lang.Throwable -> L64
            if (r6 == 0) goto L5c
            r6.f5604 = r9     // Catch: java.lang.Throwable -> L64
        L5c:
            r10.m3409(r7, r11)     // Catch: java.lang.Throwable -> L64
            zz1 r6 = p000.jx0.f5631     // Catch: java.lang.Throwable -> L64
            r7.f3235 = r6     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r10 = move-exception
            goto L69
        L66:
            int r0 = r0 + 1
            goto L2b
        L69:
            p000.e81.m1885(r3, r5, r4)
            throw r10
        L6d:
            p000.e81.m1885(r3, r5, r4)
            b21 r11 = r10.f6085
            r11.m689()
        L75:
            r10.m3406()
            return
    }

    @Override // p000.InterfaceC0291fn
    /* JADX INFO: renamed from: ε */
    public final void mo407() {
            r17 = this;
            r0 = r17
            r1 = 1
            yp0 r2 = r0.f6080
            r2.f12758 = r1
            b21 r1 = r0.f6084
            java.lang.Object[] r3 = r1.f1429
            long[] r4 = r1.f1427
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            dq0 r13 = (p000.dq0) r13
            zn r13 = r13.f3237
            if (r13 == 0) goto L47
            r13.m7193()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.m6984()
            r2.f12758 = r6
            r1.m689()
            b21 r1 = r0.f6085
            r1.m689()
            r0.f6093 = r6
            r0.f6092 = r6
            b21 r1 = r0.f6088
            r1.m689()
            r0.m3406()
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m3408(int r2, int r3) {
            r1 = this;
            yp0 r1 = r1.f6080
            r0 = 1
            r1.f12758 = r0
            r1.m6980(r2, r3, r0)
            r2 = 0
            r1.f12758 = r2
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m3409(p000.dq0 r3, boolean r4) {
            r2 = this;
            if (r4 != 0) goto Le
            boolean r0 = r3.f3241
            if (r0 == 0) goto Le
            x91 r0 = r3.f3240
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            goto L16
        Le:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            x91 r0 = p000.j81.m2882(r0)
            r3.f3240 = r0
        L16:
            r3.getClass()
            if (r4 == 0) goto L23
            zn r2 = r3.f3237
            if (r2 == 0) goto L5f
            r2.m7192()
            return
        L23:
            yp0 r2 = r2.f6080
            androidx.compose.ui.platform.AndroidComposeView r2 = p000.ln0.m3646(r2)
            q81 r2 = r2.m7374getOutOfFrameExecutor()
            if (r2 == 0) goto L54
            k1 r4 = new k1
            r0 = 5
            r4.<init>(r0, r3)
            androidx.compose.ui.platform.AndroidComposeView r2 = (androidx.compose.p001ui.platform.AndroidComposeView) r2
            w6 r3 = r2.f907
            boolean r0 = r3.isEmpty()
            r3.addLast(r4)
            if (r0 == 0) goto L5f
            android.os.Handler r3 = r2.getHandler()
            if (r3 == 0) goto L4e
            q0 r2 = r2.f908
            r3.postAtFrontOfQueue(r2)
            return
        L4e:
            java.lang.String r2 = "schedule is called when outOfFrameExecutor is not available (view is detached)"
            p000.C1080.m7275(r2)
            return
        L54:
            boolean r2 = r3.f3241
            if (r2 != 0) goto L5f
            zn r2 = r3.f3237
            if (r2 == 0) goto L5f
            r2.m7192()
        L5f:
            return
    }

    @Override // p000.InterfaceC0291fn
    /* JADX INFO: renamed from: θ */
    public final void mo409() {
            r1 = this;
            r0 = 1
            r1.m3407(r0)
            return
    }

    /* JADX INFO: renamed from: ι */
    public final void m3410(p000.yp0 r11, p000.C0024an r12) {
            r10 = this;
            b21 r0 = r10.f6084
            java.lang.Object r1 = r0.m695(r11)
            r2 = 0
            if (r1 != 0) goto L25
            dq0 r1 = new dq0
            an r3 = p000.AbstractC0083bn.f1786
            s62 r3 = p000.s62.f9751
            an r4 = p000.AbstractC0083bn.f1786
            r1.<init>()
            r1.f3235 = r3
            r1.f3236 = r4
            r1.f3237 = r2
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            x91 r3 = p000.j81.m2882(r3)
            r1.f3240 = r3
            r0.m701(r11, r1)
        L25:
            dq0 r1 = (p000.dq0) r1
            an r0 = r1.f3236
            r3 = 0
            r4 = 1
            if (r0 == r12) goto L2f
            r0 = r4
            goto L30
        L2f:
            r0 = r3
        L30:
            zn r5 = r1.f3237
            if (r5 == 0) goto L45
            java.lang.Object r6 = r5.f13179
            monitor-enter(r6)
            b21 r5 = r5.f13189     // Catch: java.lang.Throwable -> L42
            int r5 = r5.f1431     // Catch: java.lang.Throwable -> L42
            if (r5 <= 0) goto L3f
            r5 = r4
            goto L40
        L3f:
            r5 = r3
        L40:
            monitor-exit(r6)
            goto L46
        L42:
            r10 = move-exception
            monitor-exit(r6)
            throw r10
        L45:
            r5 = r4
        L46:
            if (r0 != 0) goto L50
            if (r5 != 0) goto L50
            boolean r0 = r1.f3238
            if (r0 == 0) goto L4f
            goto L50
        L4f:
            return
        L50:
            r1.f3236 = r12
            tw1 r12 = p000.e81.m1877()
            if (r12 == 0) goto L5c
            a80 r2 = r12.mo2001()
        L5c:
            tw1 r0 = p000.e81.m1880(r12)
            yp0 r5 = r10.f6080     // Catch: java.lang.Throwable -> L77
            r5.f12758 = r4     // Catch: java.lang.Throwable -> L77
            zn r6 = r1.f3237     // Catch: java.lang.Throwable -> L77
            un r7 = r10.f6081     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto Lce
            if (r6 == 0) goto L79
            int r8 = r6.f13175     // Catch: java.lang.Throwable -> L77
            r9 = 3
            if (r8 != r9) goto L73
            r8 = r4
            goto L74
        L73:
            r8 = r3
        L74:
            if (r8 == 0) goto L86
            goto L79
        L77:
            r10 = move-exception
            goto Ld9
        L79:
            android.view.ViewGroup$LayoutParams r6 = p000.jd2.f5434     // Catch: java.lang.Throwable -> L77
            m6 r6 = new m6     // Catch: java.lang.Throwable -> L77
            r6.<init>(r11)     // Catch: java.lang.Throwable -> L77
            zn r11 = new zn     // Catch: java.lang.Throwable -> L77
            r11.<init>(r7, r6)     // Catch: java.lang.Throwable -> L77
            r6 = r11
        L86:
            r1.f3237 = r6     // Catch: java.lang.Throwable -> L77
            an r11 = r1.f3236     // Catch: java.lang.Throwable -> L77
            yp0 r10 = r10.f6080     // Catch: java.lang.Throwable -> L77
            androidx.compose.ui.platform.AndroidComposeView r10 = p000.ln0.m3646(r10)     // Catch: java.lang.Throwable -> L77
            q81 r10 = r10.m7374getOutOfFrameExecutor()     // Catch: java.lang.Throwable -> L77
            if (r10 == 0) goto L99
            r1.f3241 = r3     // Catch: java.lang.Throwable -> L77
            goto La8
        L99:
            r1.f3241 = r4     // Catch: java.lang.Throwable -> L77
            y1 r10 = new y1     // Catch: java.lang.Throwable -> L77
            r10.<init>(r1, r4, r11)     // Catch: java.lang.Throwable -> L77
            an r11 = new an     // Catch: java.lang.Throwable -> L77
            r7 = 1524156494(0x5ad8c84e, float:3.0509416E16)
            r11.<init>(r7, r4, r10)     // Catch: java.lang.Throwable -> L77
        La8:
            boolean r10 = r1.f3239     // Catch: java.lang.Throwable -> L77
            if (r10 == 0) goto Lc1
            r6.m7190()     // Catch: java.lang.Throwable -> L77
            r6.m7197()     // Catch: java.lang.Throwable -> L77
            v80 r10 = r6.f13195     // Catch: java.lang.Throwable -> L77
            r10.f11135 = r3     // Catch: java.lang.Throwable -> L77
            r10.f11134 = r4     // Catch: java.lang.Throwable -> L77
            un r4 = r6.f13176     // Catch: java.lang.Throwable -> L77
            r4.mo3318(r6, r11)     // Catch: java.lang.Throwable -> L77
            r10.m6102()     // Catch: java.lang.Throwable -> L77
            goto Lc4
        Lc1:
            r6.m7181(r11)     // Catch: java.lang.Throwable -> L77
        Lc4:
            r1.f3239 = r3     // Catch: java.lang.Throwable -> L77
            r5.f12758 = r3     // Catch: java.lang.Throwable -> L77
            p000.e81.m1885(r12, r0, r2)
            r1.f3238 = r3
            return
        Lce:
            java.lang.String r10 = "parent composition reference not set"
            p000.am0.m179(r10)     // Catch: java.lang.Throwable -> L77
            pm r10 = new pm     // Catch: java.lang.Throwable -> L77
            r10.<init>()     // Catch: java.lang.Throwable -> L77
            throw r10     // Catch: java.lang.Throwable -> L77
        Ld9:
            p000.e81.m1885(r12, r0, r2)
            throw r10
    }

    /* JADX INFO: renamed from: κ */
    public final p000.yp0 m3411() {
            r11 = this;
            int r0 = r11.f6092
            if (r0 != 0) goto L5
            goto L63
        L5:
            yp0 r0 = r11.f6080
            java.util.List r0 = r0.m7000()
            h21 r0 = (p000.h21) r0
            k21 r1 = r0.f4540
            int r1 = r1.f5718
            int r2 = r11.f6093
            int r1 = r1 - r2
            int r2 = r11.f6092
            int r2 = r1 - r2
            r3 = 1
            int r1 = r1 - r3
            r4 = r1
        L1b:
            s62 r5 = p000.s62.f9751
            b21 r6 = r11.f6084
            r7 = -1
            if (r4 < r2) goto L3e
            java.lang.Object r8 = r0.get(r4)
            yp0 r8 = (p000.yp0) r8
            java.lang.Object r8 = r6.m695(r8)
            r8.getClass()
            dq0 r8 = (p000.dq0) r8
            java.lang.Object r8 = r8.f3235
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L3b
            r8 = r4
            goto L3f
        L3b:
            int r4 = r4 + (-1)
            goto L1b
        L3e:
            r8 = r7
        L3f:
            if (r8 != r7) goto L61
        L41:
            if (r1 < r2) goto L60
            java.lang.Object r4 = r0.get(r1)
            yp0 r4 = (p000.yp0) r4
            java.lang.Object r4 = r6.m695(r4)
            r4.getClass()
            dq0 r4 = (p000.dq0) r4
            java.lang.Object r9 = r4.f3235
            zz1 r10 = p000.jx0.f5631
            if (r9 == r10) goto L5b
            int r1 = r1 + (-1)
            goto L41
        L5b:
            r4.f3235 = r5
            r4 = r1
            r8 = r4
            goto L61
        L60:
            r4 = r1
        L61:
            if (r8 != r7) goto L65
        L63:
            r11 = 0
            return r11
        L65:
            if (r4 == r2) goto L6a
            r11.m3408(r4, r2)
        L6a:
            int r1 = r11.f6092
            int r1 = r1 + r7
            r11.f6092 = r1
            java.lang.Object r11 = r0.get(r2)
            yp0 r11 = (p000.yp0) r11
            java.lang.Object r0 = r6.m695(r11)
            r0.getClass()
            dq0 r0 = (p000.dq0) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            x91 r1 = p000.j81.m2882(r1)
            r0.f3240 = r1
            r0.f3239 = r3
            r0.f3238 = r3
            return r11
    }
}
