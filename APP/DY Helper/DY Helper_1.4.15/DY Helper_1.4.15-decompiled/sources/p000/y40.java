package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y40 implements p000.v40 {

    /* JADX INFO: renamed from: α */
    public final androidx.compose.p001ui.platform.AndroidComposeView f12445;

    /* JADX INFO: renamed from: β */
    public final androidx.compose.p001ui.platform.AndroidComposeView f12446;

    /* JADX INFO: renamed from: γ */
    public final p000.c50 f12447;

    /* JADX INFO: renamed from: δ */
    public final p000.s40 f12448;

    /* JADX INFO: renamed from: ε */
    public final p000.w40 f12449;

    /* JADX INFO: renamed from: ζ */
    public p000.s11 f12450;

    /* JADX INFO: renamed from: η */
    public final p000.v11 f12451;

    /* JADX INFO: renamed from: θ */
    public p000.c50 f12452;

    public y40(androidx.compose.p001ui.platform.AndroidComposeView r1, androidx.compose.p001ui.platform.AndroidComposeView r2) {
            r0 = this;
            r0.<init>()
            r0.f12445 = r1
            r0.f12446 = r2
            c50 r1 = new c50
            r1.<init>()
            r0.f12447 = r1
            s40 r1 = new s40
            r1.<init>(r0, r2)
            r0.f12448 = r1
            w40 r1 = new w40
            r1.<init>(r0)
            r0.f12449 = r1
            v11 r1 = new v11
            r2 = 1
            r1.<init>(r2)
            r0.f12451 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m6822(boolean r9) {
            r8 = this;
            c50 r9 = r8.m6827()
            r0 = 1
            if (r9 != 0) goto L9
            goto La0
        L9:
            c50 r9 = r8.m6827()
            r1 = 0
            r8.m6829(r1)
            if (r9 == 0) goto La0
            b50 r8 = p000.b50.f1476
            b50 r2 = p000.b50.f1478
            r9.m1134(r8, r2)
            q01 r8 = r9.f8771
            boolean r8 = r8.f8784
            if (r8 != 0) goto L25
            java.lang.String r8 = "visitAncestors called on an unattached node"
            p000.am0.m178(r8)
        L25:
            q01 r8 = r9.f8771
            q01 r8 = r8.f8775
            yp0 r9 = p000.h62.m2445(r9)
        L2d:
            if (r9 == 0) goto La0
            k31 r3 = r9.f12733
            q01 r3 = r3.f5729
            int r3 = r3.f8774
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L91
        L39:
            if (r8 == 0) goto L91
            int r3 = r8.f8773
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L8e
            r3 = r8
            r4 = r1
        L43:
            if (r3 == 0) goto L8e
            boolean r5 = r3 instanceof p000.c50
            if (r5 == 0) goto L51
            c50 r3 = (p000.c50) r3
            b50 r5 = p000.b50.f1477
            r3.m1134(r5, r2)
            goto L89
        L51:
            int r5 = r3.f8773
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L89
            boolean r5 = r3 instanceof p000.C1014ya
            if (r5 == 0) goto L89
            r5 = r3
            ya r5 = (p000.C1014ya) r5
            q01 r5 = r5.f12512
            r6 = 0
        L61:
            if (r5 == 0) goto L86
            int r7 = r5.f8773
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L83
            int r6 = r6 + 1
            if (r6 != r0) goto L6f
            r3 = r5
            goto L83
        L6f:
            if (r4 != 0) goto L7a
            k21 r4 = new k21
            r7 = 16
            q01[] r7 = new p000.q01[r7]
            r4.<init>(r7)
        L7a:
            if (r3 == 0) goto L80
            r4.m3127(r3)
            r3 = r1
        L80:
            r4.m3127(r5)
        L83:
            q01 r5 = r5.f8776
            goto L61
        L86:
            if (r6 != r0) goto L89
            goto L43
        L89:
            q01 r3 = p000.h62.m2387(r4)
            goto L43
        L8e:
            q01 r8 = r8.f8775
            goto L39
        L91:
            yp0 r9 = r9.m7005()
            if (r9 == 0) goto L9e
            k31 r8 = r9.f12733
            if (r8 == 0) goto L9e
            q22 r8 = r8.f5728
            goto L2d
        L9e:
            r8 = r1
            goto L2d
        La0:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final boolean m6823(int r2, boolean r3, boolean r4) {
            r1 = this;
            r2 = 1
            if (r3 != 0) goto L23
            c50 r0 = r1.f12447
            uq r0 = p000.kn0.m3346(r0)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L1d
            r2 = 2
            if (r0 == r2) goto L1d
            r2 = 3
            if (r0 != r2) goto L18
            goto L1d
        L18:
            p000.C1080.m7272()
            r1 = 0
            return r1
        L1d:
            r2 = 0
            goto L26
        L1f:
            r1.m6822(r3)
            goto L26
        L23:
            r1.m6822(r3)
        L26:
            if (r2 == 0) goto L2d
            if (r4 == 0) goto L2d
            r1.m6824()
        L2d:
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public final void m6824() {
            r1 = this;
            androidx.compose.ui.platform.AndroidComposeView r1 = r1.f12445
            boolean r0 = r1.isFocused()
            if (r0 != 0) goto L22
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto Lf
            goto L22
        Lf:
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L21
            android.view.View r0 = r1.findFocus()
            if (r0 == 0) goto L1e
            r0.clearFocus()
        L1e:
            r1.clearFocus()
        L21:
            return
        L22:
            r1.clearFocus()
            return
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m6825(android.view.KeyEvent r13, p000.p70 r14) {
            r12 = this;
            c50 r0 = r12.f12447
            java.lang.String r1 = "FocusOwnerImpl:dispatchKeyEvent"
            android.os.Trace.beginSection(r1)
            s40 r1 = r12.f12448     // Catch: java.lang.Throwable -> L2ce
            boolean r1 = r1.f9710     // Catch: java.lang.Throwable -> L2ce
            r2 = 0
            if (r1 == 0) goto L19
            java.lang.String r12 = "FocusRelatedWarning: Dispatching key event while focus system is invalidated."
            java.io.PrintStream r13 = java.lang.System.out     // Catch: java.lang.Throwable -> L2ce
            r13.println(r12)     // Catch: java.lang.Throwable -> L2ce
            android.os.Trace.endSection()
            return r2
        L19:
            boolean r12 = r12.m6830(r13)     // Catch: java.lang.Throwable -> L2ce
            if (r12 != 0) goto L23
            android.os.Trace.endSection()
            return r2
        L23:
            c50 r12 = p000.ln0.m3641(r0)     // Catch: java.lang.Throwable -> L2ce
            java.lang.String r1 = "visitAncestors called on an unattached node"
            r3 = 16
            r4 = 0
            r5 = 1
            if (r12 == 0) goto L59
            q01 r6 = r12.f8771     // Catch: java.lang.Throwable -> L2ce
            boolean r6 = r6.f8784     // Catch: java.lang.Throwable -> L2ce
            if (r6 != 0) goto L3a
            java.lang.String r6 = "visitLocalDescendants called on an unattached node"
            p000.am0.m178(r6)     // Catch: java.lang.Throwable -> L2ce
        L3a:
            q01 r6 = r12.f8771     // Catch: java.lang.Throwable -> L2ce
            int r7 = r6.f8774     // Catch: java.lang.Throwable -> L2ce
            r7 = r7 & 9216(0x2400, float:1.2914E-41)
            if (r7 == 0) goto L56
            q01 r6 = r6.f8776     // Catch: java.lang.Throwable -> L2ce
            r7 = r4
        L45:
            if (r6 == 0) goto L57
            int r8 = r6.f8773     // Catch: java.lang.Throwable -> L2ce
            r9 = r8 & 9216(0x2400, float:1.2914E-41)
            if (r9 == 0) goto L53
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L52
            goto L57
        L52:
            r7 = r6
        L53:
            q01 r6 = r6.f8776     // Catch: java.lang.Throwable -> L2ce
            goto L45
        L56:
            r7 = r4
        L57:
            if (r7 != 0) goto L161
        L59:
            if (r12 == 0) goto Ldd
            q01 r6 = r12.f8771     // Catch: java.lang.Throwable -> L2ce
            boolean r6 = r6.f8784     // Catch: java.lang.Throwable -> L2ce
            if (r6 != 0) goto L64
            p000.am0.m178(r1)     // Catch: java.lang.Throwable -> L2ce
        L64:
            q01 r6 = r12.f8771     // Catch: java.lang.Throwable -> L2ce
            yp0 r12 = p000.h62.m2445(r12)     // Catch: java.lang.Throwable -> L2ce
        L6a:
            if (r12 == 0) goto Ld4
            k31 r7 = r12.f12733     // Catch: java.lang.Throwable -> L2ce
            q01 r7 = r7.f5729     // Catch: java.lang.Throwable -> L2ce
            int r7 = r7.f8774     // Catch: java.lang.Throwable -> L2ce
            r7 = r7 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto Lc5
        L76:
            if (r6 == 0) goto Lc5
            int r7 = r6.f8773     // Catch: java.lang.Throwable -> L2ce
            r7 = r7 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto Lc2
            r8 = r4
            r7 = r6
        L80:
            if (r7 == 0) goto Lc2
            boolean r9 = r7 instanceof p000.C0855u0     // Catch: java.lang.Throwable -> L2ce
            if (r9 == 0) goto L87
            goto Ld5
        L87:
            int r9 = r7.f8773     // Catch: java.lang.Throwable -> L2ce
            r9 = r9 & 8192(0x2000, float:1.148E-41)
            if (r9 == 0) goto Lbd
            boolean r9 = r7 instanceof p000.C1014ya     // Catch: java.lang.Throwable -> L2ce
            if (r9 == 0) goto Lbd
            r9 = r7
            ya r9 = (p000.C1014ya) r9     // Catch: java.lang.Throwable -> L2ce
            q01 r9 = r9.f12512     // Catch: java.lang.Throwable -> L2ce
            r10 = r2
        L97:
            if (r9 == 0) goto Lba
            int r11 = r9.f8773     // Catch: java.lang.Throwable -> L2ce
            r11 = r11 & 8192(0x2000, float:1.148E-41)
            if (r11 == 0) goto Lb7
            int r10 = r10 + 1
            if (r10 != r5) goto La5
            r7 = r9
            goto Lb7
        La5:
            if (r8 != 0) goto Lae
            k21 r8 = new k21     // Catch: java.lang.Throwable -> L2ce
            q01[] r11 = new p000.q01[r3]     // Catch: java.lang.Throwable -> L2ce
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L2ce
        Lae:
            if (r7 == 0) goto Lb4
            r8.m3127(r7)     // Catch: java.lang.Throwable -> L2ce
            r7 = r4
        Lb4:
            r8.m3127(r9)     // Catch: java.lang.Throwable -> L2ce
        Lb7:
            q01 r9 = r9.f8776     // Catch: java.lang.Throwable -> L2ce
            goto L97
        Lba:
            if (r10 != r5) goto Lbd
            goto L80
        Lbd:
            q01 r7 = p000.h62.m2387(r8)     // Catch: java.lang.Throwable -> L2ce
            goto L80
        Lc2:
            q01 r6 = r6.f8775     // Catch: java.lang.Throwable -> L2ce
            goto L76
        Lc5:
            yp0 r12 = r12.m7005()     // Catch: java.lang.Throwable -> L2ce
            if (r12 == 0) goto Ld2
            k31 r6 = r12.f12733     // Catch: java.lang.Throwable -> L2ce
            if (r6 == 0) goto Ld2
            q22 r6 = r6.f5728     // Catch: java.lang.Throwable -> L2ce
            goto L6a
        Ld2:
            r6 = r4
            goto L6a
        Ld4:
            r7 = r4
        Ld5:
            u0 r7 = (p000.C0855u0) r7     // Catch: java.lang.Throwable -> L2ce
            if (r7 == 0) goto Ldd
            q01 r7 = r7.f8771     // Catch: java.lang.Throwable -> L2ce
            goto L161
        Ldd:
            q01 r12 = r0.f8771     // Catch: java.lang.Throwable -> L2ce
            boolean r12 = r12.f8784     // Catch: java.lang.Throwable -> L2ce
            if (r12 != 0) goto Le6
            p000.am0.m178(r1)     // Catch: java.lang.Throwable -> L2ce
        Le6:
            q01 r12 = r0.f8771     // Catch: java.lang.Throwable -> L2ce
            q01 r12 = r12.f8775     // Catch: java.lang.Throwable -> L2ce
            yp0 r0 = p000.h62.m2445(r0)     // Catch: java.lang.Throwable -> L2ce
        Lee:
            if (r0 == 0) goto L158
            k31 r6 = r0.f12733     // Catch: java.lang.Throwable -> L2ce
            q01 r6 = r6.f5729     // Catch: java.lang.Throwable -> L2ce
            int r6 = r6.f8774     // Catch: java.lang.Throwable -> L2ce
            r6 = r6 & 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L149
        Lfa:
            if (r12 == 0) goto L149
            int r6 = r12.f8773     // Catch: java.lang.Throwable -> L2ce
            r6 = r6 & 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L146
            r6 = r12
            r7 = r4
        L104:
            if (r6 == 0) goto L146
            boolean r8 = r6 instanceof p000.C0855u0     // Catch: java.lang.Throwable -> L2ce
            if (r8 == 0) goto L10b
            goto L159
        L10b:
            int r8 = r6.f8773     // Catch: java.lang.Throwable -> L2ce
            r8 = r8 & 8192(0x2000, float:1.148E-41)
            if (r8 == 0) goto L141
            boolean r8 = r6 instanceof p000.C1014ya     // Catch: java.lang.Throwable -> L2ce
            if (r8 == 0) goto L141
            r8 = r6
            ya r8 = (p000.C1014ya) r8     // Catch: java.lang.Throwable -> L2ce
            q01 r8 = r8.f12512     // Catch: java.lang.Throwable -> L2ce
            r9 = r2
        L11b:
            if (r8 == 0) goto L13e
            int r10 = r8.f8773     // Catch: java.lang.Throwable -> L2ce
            r10 = r10 & 8192(0x2000, float:1.148E-41)
            if (r10 == 0) goto L13b
            int r9 = r9 + 1
            if (r9 != r5) goto L129
            r6 = r8
            goto L13b
        L129:
            if (r7 != 0) goto L132
            k21 r7 = new k21     // Catch: java.lang.Throwable -> L2ce
            q01[] r10 = new p000.q01[r3]     // Catch: java.lang.Throwable -> L2ce
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L2ce
        L132:
            if (r6 == 0) goto L138
            r7.m3127(r6)     // Catch: java.lang.Throwable -> L2ce
            r6 = r4
        L138:
            r7.m3127(r8)     // Catch: java.lang.Throwable -> L2ce
        L13b:
            q01 r8 = r8.f8776     // Catch: java.lang.Throwable -> L2ce
            goto L11b
        L13e:
            if (r9 != r5) goto L141
            goto L104
        L141:
            q01 r6 = p000.h62.m2387(r7)     // Catch: java.lang.Throwable -> L2ce
            goto L104
        L146:
            q01 r12 = r12.f8775     // Catch: java.lang.Throwable -> L2ce
            goto Lfa
        L149:
            yp0 r0 = r0.m7005()     // Catch: java.lang.Throwable -> L2ce
            if (r0 == 0) goto L156
            k31 r12 = r0.f12733     // Catch: java.lang.Throwable -> L2ce
            if (r12 == 0) goto L156
            q22 r12 = r12.f5728     // Catch: java.lang.Throwable -> L2ce
            goto Lee
        L156:
            r12 = r4
            goto Lee
        L158:
            r6 = r4
        L159:
            u0 r6 = (p000.C0855u0) r6     // Catch: java.lang.Throwable -> L2ce
            if (r6 == 0) goto L160
            q01 r7 = r6.f8771     // Catch: java.lang.Throwable -> L2ce
            goto L161
        L160:
            r7 = r4
        L161:
            if (r7 == 0) goto L2ca
            q01 r12 = r7.f8771     // Catch: java.lang.Throwable -> L2ce
            boolean r12 = r12.f8784     // Catch: java.lang.Throwable -> L2ce
            if (r12 != 0) goto L16c
            p000.am0.m178(r1)     // Catch: java.lang.Throwable -> L2ce
        L16c:
            q01 r12 = r7.f8771     // Catch: java.lang.Throwable -> L2ce
            q01 r12 = r12.f8775     // Catch: java.lang.Throwable -> L2ce
            yp0 r0 = p000.h62.m2445(r7)     // Catch: java.lang.Throwable -> L2ce
            r1 = r4
        L175:
            if (r0 == 0) goto L1ed
            k31 r6 = r0.f12733     // Catch: java.lang.Throwable -> L2ce
            q01 r6 = r6.f5729     // Catch: java.lang.Throwable -> L2ce
            int r6 = r6.f8774     // Catch: java.lang.Throwable -> L2ce
            r6 = r6 & 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L1de
        L181:
            if (r12 == 0) goto L1de
            int r6 = r12.f8773     // Catch: java.lang.Throwable -> L2ce
            r6 = r6 & 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L1db
            r6 = r12
            r8 = r4
        L18b:
            if (r6 == 0) goto L1db
            boolean r9 = r6 instanceof p000.C0855u0     // Catch: java.lang.Throwable -> L2ce
            if (r9 == 0) goto L19d
            if (r1 != 0) goto L198
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2ce
            r1.<init>()     // Catch: java.lang.Throwable -> L2ce
        L198:
            r1.add(r6)     // Catch: java.lang.Throwable -> L2ce
            r9 = r2
            goto L19e
        L19d:
            r9 = r5
        L19e:
            if (r9 == 0) goto L1d6
            int r9 = r6.f8773     // Catch: java.lang.Throwable -> L2ce
            r9 = r9 & 8192(0x2000, float:1.148E-41)
            if (r9 == 0) goto L1d6
            boolean r9 = r6 instanceof p000.C1014ya     // Catch: java.lang.Throwable -> L2ce
            if (r9 == 0) goto L1d6
            r9 = r6
            ya r9 = (p000.C1014ya) r9     // Catch: java.lang.Throwable -> L2ce
            q01 r9 = r9.f12512     // Catch: java.lang.Throwable -> L2ce
            r10 = r2
        L1b0:
            if (r9 == 0) goto L1d3
            int r11 = r9.f8773     // Catch: java.lang.Throwable -> L2ce
            r11 = r11 & 8192(0x2000, float:1.148E-41)
            if (r11 == 0) goto L1d0
            int r10 = r10 + 1
            if (r10 != r5) goto L1be
            r6 = r9
            goto L1d0
        L1be:
            if (r8 != 0) goto L1c7
            k21 r8 = new k21     // Catch: java.lang.Throwable -> L2ce
            q01[] r11 = new p000.q01[r3]     // Catch: java.lang.Throwable -> L2ce
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L2ce
        L1c7:
            if (r6 == 0) goto L1cd
            r8.m3127(r6)     // Catch: java.lang.Throwable -> L2ce
            r6 = r4
        L1cd:
            r8.m3127(r9)     // Catch: java.lang.Throwable -> L2ce
        L1d0:
            q01 r9 = r9.f8776     // Catch: java.lang.Throwable -> L2ce
            goto L1b0
        L1d3:
            if (r10 != r5) goto L1d6
            goto L18b
        L1d6:
            q01 r6 = p000.h62.m2387(r8)     // Catch: java.lang.Throwable -> L2ce
            goto L18b
        L1db:
            q01 r12 = r12.f8775     // Catch: java.lang.Throwable -> L2ce
            goto L181
        L1de:
            yp0 r0 = r0.m7005()     // Catch: java.lang.Throwable -> L2ce
            if (r0 == 0) goto L1eb
            k31 r12 = r0.f12733     // Catch: java.lang.Throwable -> L2ce
            if (r12 == 0) goto L1eb
            q22 r12 = r12.f5728     // Catch: java.lang.Throwable -> L2ce
            goto L175
        L1eb:
            r12 = r4
            goto L175
        L1ed:
            if (r1 == 0) goto L207
            int r12 = r1.size()     // Catch: java.lang.Throwable -> L2ce
            int r12 = r12 + (-1)
            if (r12 < 0) goto L207
        L1f7:
            int r0 = r12 + (-1)
            java.lang.Object r12 = r1.get(r12)     // Catch: java.lang.Throwable -> L2ce
            u0 r12 = (p000.C0855u0) r12     // Catch: java.lang.Throwable -> L2ce
            r12.getClass()     // Catch: java.lang.Throwable -> L2ce
            if (r0 >= 0) goto L205
            goto L207
        L205:
            r12 = r0
            goto L1f7
        L207:
            q01 r12 = r7.f8771     // Catch: java.lang.Throwable -> L2ce
            r0 = r4
        L20a:
            if (r12 == 0) goto L24e
            boolean r6 = r12 instanceof p000.C0855u0     // Catch: java.lang.Throwable -> L2ce
            if (r6 == 0) goto L213
            u0 r12 = (p000.C0855u0) r12     // Catch: java.lang.Throwable -> L2ce
            goto L249
        L213:
            int r6 = r12.f8773     // Catch: java.lang.Throwable -> L2ce
            r6 = r6 & 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L249
            boolean r6 = r12 instanceof p000.C1014ya     // Catch: java.lang.Throwable -> L2ce
            if (r6 == 0) goto L249
            r6 = r12
            ya r6 = (p000.C1014ya) r6     // Catch: java.lang.Throwable -> L2ce
            q01 r6 = r6.f12512     // Catch: java.lang.Throwable -> L2ce
            r8 = r2
        L223:
            if (r6 == 0) goto L246
            int r9 = r6.f8773     // Catch: java.lang.Throwable -> L2ce
            r9 = r9 & 8192(0x2000, float:1.148E-41)
            if (r9 == 0) goto L243
            int r8 = r8 + 1
            if (r8 != r5) goto L231
            r12 = r6
            goto L243
        L231:
            if (r0 != 0) goto L23a
            k21 r0 = new k21     // Catch: java.lang.Throwable -> L2ce
            q01[] r9 = new p000.q01[r3]     // Catch: java.lang.Throwable -> L2ce
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L2ce
        L23a:
            if (r12 == 0) goto L240
            r0.m3127(r12)     // Catch: java.lang.Throwable -> L2ce
            r12 = r4
        L240:
            r0.m3127(r6)     // Catch: java.lang.Throwable -> L2ce
        L243:
            q01 r6 = r6.f8776     // Catch: java.lang.Throwable -> L2ce
            goto L223
        L246:
            if (r8 != r5) goto L249
            goto L20a
        L249:
            q01 r12 = p000.h62.m2387(r0)     // Catch: java.lang.Throwable -> L2ce
            goto L20a
        L24e:
            java.lang.Object r12 = r14.invoke()     // Catch: java.lang.Throwable -> L2ce
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L2ce
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L2ce
            if (r12 == 0) goto L25e
            android.os.Trace.endSection()
            return r5
        L25e:
            q01 r12 = r7.f8771     // Catch: java.lang.Throwable -> L2ce
            r14 = r4
        L261:
            if (r12 == 0) goto L2ae
            boolean r0 = r12 instanceof p000.C0855u0     // Catch: java.lang.Throwable -> L2ce
            if (r0 == 0) goto L273
            u0 r12 = (p000.C0855u0) r12     // Catch: java.lang.Throwable -> L2ce
            boolean r12 = r12.m5769(r13)     // Catch: java.lang.Throwable -> L2ce
            if (r12 == 0) goto L2a9
            android.os.Trace.endSection()
            return r5
        L273:
            int r0 = r12.f8773     // Catch: java.lang.Throwable -> L2ce
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L2a9
            boolean r0 = r12 instanceof p000.C1014ya     // Catch: java.lang.Throwable -> L2ce
            if (r0 == 0) goto L2a9
            r0 = r12
            ya r0 = (p000.C1014ya) r0     // Catch: java.lang.Throwable -> L2ce
            q01 r0 = r0.f12512     // Catch: java.lang.Throwable -> L2ce
            r6 = r2
        L283:
            if (r0 == 0) goto L2a6
            int r7 = r0.f8773     // Catch: java.lang.Throwable -> L2ce
            r7 = r7 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto L2a3
            int r6 = r6 + 1
            if (r6 != r5) goto L291
            r12 = r0
            goto L2a3
        L291:
            if (r14 != 0) goto L29a
            k21 r14 = new k21     // Catch: java.lang.Throwable -> L2ce
            q01[] r7 = new p000.q01[r3]     // Catch: java.lang.Throwable -> L2ce
            r14.<init>(r7)     // Catch: java.lang.Throwable -> L2ce
        L29a:
            if (r12 == 0) goto L2a0
            r14.m3127(r12)     // Catch: java.lang.Throwable -> L2ce
            r12 = r4
        L2a0:
            r14.m3127(r0)     // Catch: java.lang.Throwable -> L2ce
        L2a3:
            q01 r0 = r0.f8776     // Catch: java.lang.Throwable -> L2ce
            goto L283
        L2a6:
            if (r6 != r5) goto L2a9
            goto L261
        L2a9:
            q01 r12 = p000.h62.m2387(r14)     // Catch: java.lang.Throwable -> L2ce
            goto L261
        L2ae:
            if (r1 == 0) goto L2ca
            int r12 = r1.size()     // Catch: java.lang.Throwable -> L2ce
            r14 = r2
        L2b5:
            if (r14 >= r12) goto L2ca
            java.lang.Object r0 = r1.get(r14)     // Catch: java.lang.Throwable -> L2ce
            u0 r0 = (p000.C0855u0) r0     // Catch: java.lang.Throwable -> L2ce
            boolean r0 = r0.m5769(r13)     // Catch: java.lang.Throwable -> L2ce
            if (r0 == 0) goto L2c7
            android.os.Trace.endSection()
            return r5
        L2c7:
            int r14 = r14 + 1
            goto L2b5
        L2ca:
            android.os.Trace.endSection()
            return r2
        L2ce:
            r12 = move-exception
            android.os.Trace.endSection()
            throw r12
    }

    /* JADX INFO: renamed from: ε */
    public final java.lang.Boolean m6826(int r20, p000.ml1 r21, p000.a80 r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            c50 r4 = r0.f12447
            c50 r5 = p000.ln0.m3641(r4)
            r7 = 4
            r8 = 3
            r9 = 6
            r10 = 5
            r11 = 2
            androidx.compose.ui.platform.AndroidComposeView r13 = r0.f12446
            r16 = 0
            r17 = 0
            r15 = 1
            if (r5 == 0) goto L1a2
            np0 r18 = r13.getLayoutDirection()
            z40 r14 = r5.m1135()
            a50 r6 = r14.f12965
            a50 r12 = r14.f12966
            if (r1 != r15) goto L2e
            a50 r6 = r14.f12959
            goto La6
        L2e:
            if (r1 != r11) goto L34
            a50 r6 = r14.f12960
            goto La6
        L34:
            if (r1 != r10) goto L3a
            a50 r6 = r14.f12961
            goto La6
        L3a:
            if (r1 != r9) goto L40
            a50 r6 = r14.f12962
            goto La6
        L40:
            if (r1 != r8) goto L5c
            int r9 = r18.ordinal()
            if (r9 == 0) goto L51
            if (r9 != r15) goto L4c
            r6 = r12
            goto L51
        L4c:
            p000.C1080.m7272()
            r0 = 0
            return r0
        L51:
            a50 r9 = p000.a50.f66
            if (r6 != r9) goto L57
            r6 = r17
        L57:
            if (r6 != 0) goto La6
            a50 r6 = r14.f12963
            goto La6
        L5c:
            if (r1 != r7) goto L78
            int r9 = r18.ordinal()
            if (r9 == 0) goto L6c
            if (r9 != r15) goto L67
            goto L6d
        L67:
            p000.C1080.m7272()
            r0 = 0
            return r0
        L6c:
            r6 = r12
        L6d:
            a50 r9 = p000.a50.f66
            if (r6 != r9) goto L73
            r6 = r17
        L73:
            if (r6 != 0) goto La6
            a50 r6 = r14.f12964
            goto La6
        L78:
            r6 = 7
            if (r1 != r6) goto L7c
            goto L80
        L7c:
            r9 = 8
            if (r1 != r9) goto L19b
        L80:
            androidx.compose.ui.platform.AndroidComposeView r9 = p000.h62.m2446(r5)
            v40 r9 = r9.getFocusOwner()
            y40 r9 = (p000.y40) r9
            c50 r12 = r9.m6827()
            if (r1 != r6) goto L96
            a1 r6 = r14.f12967
            r6.getClass()
            goto L9b
        L96:
            a1 r6 = r14.f12968
            r6.getClass()
        L9b:
            c50 r6 = r9.m6827()
            if (r12 == r6) goto La4
            a50 r6 = p000.a50.f68
            goto La6
        La4:
            a50 r6 = p000.a50.f66
        La6:
            a50 r9 = p000.a50.f67
            boolean r12 = p000.ln0.m3626(r6, r9)
            if (r12 == 0) goto Lb0
            goto L1f9
        Lb0:
            a50 r12 = p000.a50.f68
            boolean r12 = p000.ln0.m3626(r6, r12)
            if (r12 == 0) goto Lc5
            c50 r0 = p000.ln0.m3641(r4)
            if (r0 == 0) goto L1f9
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
        Lc5:
            a50 r12 = p000.a50.f66
            boolean r14 = p000.ln0.m3626(r6, r12)
            if (r14 != 0) goto L1a4
            java.lang.String r0 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r6 == r12) goto L196
            if (r6 == r9) goto L191
            k21 r0 = r6.f69
            int r1 = r0.f5718
            if (r1 != 0) goto Le2
            java.lang.String r0 = "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L18c
        Le2:
            java.lang.Object[] r0 = r0.f5716
            r2 = r16
            r4 = r2
        Le7:
            if (r2 >= r1) goto L18a
            r5 = r0[r2]
            p8 r5 = (p000.C0678p8) r5
            q01 r6 = r5.f8771
            boolean r6 = r6.f8784
            if (r6 != 0) goto Lf8
            java.lang.String r6 = "visitChildren called on an unattached node"
            p000.am0.m178(r6)
        Lf8:
            k21 r6 = new k21
            r7 = 16
            q01[] r8 = new p000.q01[r7]
            r6.<init>(r8)
            q01 r5 = r5.f8771
            q01 r7 = r5.f8776
            if (r7 != 0) goto L10b
            p000.h62.m2386(r6, r5)
            goto L10e
        L10b:
            r6.m3127(r7)
        L10e:
            int r5 = r6.f5718
            if (r5 == 0) goto L186
            int r5 = r5 + (-1)
            java.lang.Object r5 = r6.m3136(r5)
            q01 r5 = (p000.q01) r5
            int r7 = r5.f8774
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 != 0) goto L124
            p000.h62.m2386(r6, r5)
            goto L10e
        L124:
            if (r5 == 0) goto L10e
            int r7 = r5.f8773
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L183
            r7 = r17
        L12e:
            if (r5 == 0) goto L10e
            boolean r8 = r5 instanceof p000.c50
            if (r8 == 0) goto L144
            c50 r5 = (p000.c50) r5
            java.lang.Object r5 = r3.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L17e
            r4 = r15
            goto L186
        L144:
            int r8 = r5.f8773
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L17e
            boolean r8 = r5 instanceof p000.C1014ya
            if (r8 == 0) goto L17e
            r8 = r5
            ya r8 = (p000.C1014ya) r8
            q01 r8 = r8.f12512
            r9 = r16
        L155:
            if (r8 == 0) goto L17b
            int r10 = r8.f8773
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L178
            int r9 = r9 + 1
            if (r9 != r15) goto L163
            r5 = r8
            goto L178
        L163:
            if (r7 != 0) goto L16e
            k21 r7 = new k21
            r10 = 16
            q01[] r11 = new p000.q01[r10]
            r7.<init>(r11)
        L16e:
            if (r5 == 0) goto L175
            r7.m3127(r5)
            r5 = r17
        L175:
            r7.m3127(r8)
        L178:
            q01 r8 = r8.f8776
            goto L155
        L17b:
            if (r9 != r15) goto L17e
            goto L12e
        L17e:
            q01 r5 = p000.h62.m2387(r7)
            goto L12e
        L183:
            q01 r5 = r5.f8776
            goto L124
        L186:
            int r2 = r2 + 1
            goto Le7
        L18a:
            r16 = r4
        L18c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L191:
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L196:
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L19b:
            java.lang.String r0 = "invalid FocusDirection"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L1a2:
            r5 = r17
        L1a4:
            np0 r6 = r13.getLayoutDirection()
            lv r9 = new lv
            r9.<init>(r5, r0, r3)
            if (r1 != r15) goto L1b0
            goto L1b2
        L1b0:
            if (r1 != r11) goto L1cb
        L1b2:
            if (r1 != r15) goto L1b9
            boolean r0 = p000.h62.m2379(r4, r9)
            goto L1bf
        L1b9:
            if (r1 != r11) goto L1c4
            boolean r0 = p000.h62.m2393(r4, r9)
        L1bf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1c4:
            java.lang.String r0 = "This function should only be used for 1-D focus search"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L1cb:
            if (r1 != r8) goto L1ce
            goto L1d7
        L1ce:
            if (r1 != r7) goto L1d1
            goto L1d7
        L1d1:
            if (r1 != r10) goto L1d4
            goto L1d7
        L1d4:
            r0 = 6
            if (r1 != r0) goto L1dc
        L1d7:
            java.lang.Boolean r0 = p000.j81.m2892(r1, r9, r4, r2)
            return r0
        L1dc:
            r0 = 7
            if (r1 != r0) goto L1fa
            int r0 = r6.ordinal()
            if (r0 == 0) goto L1ee
            if (r0 != r15) goto L1e9
            r7 = r8
            goto L1ee
        L1e9:
            p000.C1080.m7272()
            r0 = 0
            return r0
        L1ee:
            c50 r0 = p000.ln0.m3641(r4)
            if (r0 == 0) goto L1f9
            java.lang.Boolean r0 = p000.j81.m2892(r7, r9, r0, r2)
            return r0
        L1f9:
            return r17
        L1fa:
            r0 = 8
            if (r1 != r0) goto L2bd
            c50 r0 = p000.ln0.m3641(r4)
            if (r0 == 0) goto L2a3
            q01 r1 = r0.f8771
            boolean r1 = r1.f8784
            if (r1 != 0) goto L20f
            java.lang.String r1 = "visitAncestors called on an unattached node"
            p000.am0.m178(r1)
        L20f:
            q01 r1 = r0.f8771
            q01 r1 = r1.f8775
            yp0 r0 = p000.h62.m2445(r0)
        L217:
            if (r0 == 0) goto L2a3
            k31 r2 = r0.f12733
            q01 r2 = r2.f5729
            int r2 = r2.f8774
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L28f
        L223:
            if (r1 == 0) goto L28f
            int r2 = r1.f8773
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L28a
            r2 = r1
            r3 = r17
        L22e:
            if (r2 == 0) goto L28a
            boolean r5 = r2 instanceof p000.c50
            if (r5 == 0) goto L244
            c50 r2 = (p000.c50) r2
            z40 r5 = r2.m1135()
            boolean r5 = r5.f12958
            if (r5 == 0) goto L241
            r15 = r2
            goto L2a5
        L241:
            r7 = 16
            goto L285
        L244:
            int r5 = r2.f8773
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L241
            boolean r5 = r2 instanceof p000.C1014ya
            if (r5 == 0) goto L241
            r5 = r2
            ya r5 = (p000.C1014ya) r5
            q01 r5 = r5.f12512
            r6 = r16
        L255:
            if (r5 == 0) goto L280
            int r7 = r5.f8773
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L262
            int r6 = r6 + 1
            if (r6 != r15) goto L265
            r2 = r5
        L262:
            r7 = 16
            goto L27d
        L265:
            if (r3 != 0) goto L271
            k21 r3 = new k21
            r7 = 16
            q01[] r8 = new p000.q01[r7]
            r3.<init>(r8)
            goto L273
        L271:
            r7 = 16
        L273:
            if (r2 == 0) goto L27a
            r3.m3127(r2)
            r2 = r17
        L27a:
            r3.m3127(r5)
        L27d:
            q01 r5 = r5.f8776
            goto L255
        L280:
            r7 = 16
            if (r6 != r15) goto L285
            goto L22e
        L285:
            q01 r2 = p000.h62.m2387(r3)
            goto L22e
        L28a:
            r7 = 16
            q01 r1 = r1.f8775
            goto L223
        L28f:
            r7 = 16
            yp0 r0 = r0.m7005()
            if (r0 == 0) goto L29f
            k31 r1 = r0.f12733
            if (r1 == 0) goto L29f
            q22 r1 = r1.f5728
            goto L217
        L29f:
            r1 = r17
            goto L217
        L2a3:
            r15 = r17
        L2a5:
            if (r15 == 0) goto L2b8
            boolean r0 = r15.equals(r4)
            if (r0 == 0) goto L2ae
            goto L2b8
        L2ae:
            java.lang.Object r0 = r9.invoke(r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r16 = r0.booleanValue()
        L2b8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L2bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = p000.q40.m4765(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Focus search invoked with invalid FocusDirection "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ζ */
    public final p000.c50 m6827() {
            r2 = this;
            c50 r2 = r2.f12452
            if (r2 == 0) goto La
            boolean r0 = r2.f8784
            r1 = 1
            if (r0 != r1) goto La
            return r2
        La:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: η */
    public final boolean m6828(int r4) {
            r3 = this;
            r0 = 0
            boolean r1 = r3.m6823(r4, r0, r0)
            if (r1 != 0) goto L8
            return r0
        L8:
            c1 r1 = new c1
            r2 = 2
            r1.<init>(r4, r2)
            r2 = 0
            java.lang.Boolean r4 = r3.m6826(r4, r2, r1)
            if (r4 == 0) goto L19
            boolean r0 = r4.booleanValue()
        L19:
            if (r0 != 0) goto L1e
            r3.m6824()
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public final void m6829(p000.c50 r5) {
            r4 = this;
            c50 r0 = r4.f12452
            r4.f12452 = r5
            v11 r4 = r4.f12451
            java.lang.Object[] r1 = r4.f11064
            int r4 = r4.f11065
            r2 = 0
        Lb:
            if (r2 >= r4) goto L17
            r3 = r1[r2]
            t40 r3 = (p000.t40) r3
            r3.mo384(r0, r5)
            int r2 = r2 + 1
            goto Lb
        L17:
            return
    }

    /* JADX INFO: renamed from: ι */
    public final boolean m6830(android.view.KeyEvent r39) {
            r38 = this;
            r0 = r38
            int r1 = r39.getKeyCode()
            long r1 = p000.h62.m2385(r1)
            int r3 = r39.getAction()
            r4 = 2
            r6 = 1
            if (r3 == 0) goto L18
            if (r3 == r6) goto L16
            r3 = 0
            goto L19
        L16:
            r3 = r6
            goto L19
        L18:
            r3 = r4
        L19:
            r12 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r17 = 0
            r19 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            r21 = 254(0xfe, double:1.255E-321)
            r39 = 0
            r5 = 8
            r23 = 6
            r7 = 3
            if (r3 != r4) goto L2c6
            s11 r3 = r0.f12450
            if (r3 != 0) goto L3e
            s11 r3 = new s11
            r3.<init>(r7)
            r0.f12450 = r3
        L3e:
            r4 = r3
            int r0 = java.lang.Long.hashCode(r1)
            int r0 = r0 * r12
            int r3 = r0 << 16
            r0 = r0 ^ r3
            int r3 = r0 >>> 7
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r24 = r7
            int r7 = r4.f9672
            r25 = r3 & r7
            r26 = r39
            r27 = 1
        L55:
            long[] r8 = r4.f9670
            int r9 = r25 >> 3
            r29 = r25 & 7
            r30 = 63
            int r10 = r29 << 3
            r31 = r8[r9]
            long r31 = r31 >>> r10
            int r9 = r9 + r6
            r8 = r8[r9]
            int r29 = 64 - r10
            long r8 = r8 << r29
            r33 = r12
            r29 = 7
            long r11 = (long) r10
            long r10 = -r11
            long r10 = r10 >> r30
            long r8 = r8 & r10
            long r8 = r31 | r8
            long r10 = (long) r0
            long r31 = r10 * r19
            r34 = 255(0xff, double:1.26E-321)
            long r13 = r8 ^ r31
            long r31 = r13 - r19
            long r12 = ~r13
            long r12 = r31 & r12
            long r12 = r12 & r15
        L82:
            int r14 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r14 == 0) goto La3
            int r14 = java.lang.Long.numberOfTrailingZeros(r12)
            int r14 = r14 >> 3
            int r14 = r25 + r14
            r14 = r14 & r7
            r31 = r15
            long[] r15 = r4.f9671
            r15 = r15[r14]
            int r15 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r15 != 0) goto L9d
            r38 = r6
            goto L2b1
        L9d:
            long r14 = r12 - r27
            long r12 = r12 & r14
            r15 = r31
            goto L82
        La3:
            r31 = r15
            long r12 = ~r8
            long r12 = r12 << r23
            long r8 = r8 & r12
            long r8 = r8 & r31
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 == 0) goto L2b6
            int r0 = r4.m5348(r3)
            int r7 = r4.f9674
            if (r7 != 0) goto Lc8
            long[] r7 = r4.f9670
            int r12 = r0 >> 3
            r12 = r7[r12]
            r7 = r0 & 7
            int r7 = r7 << 3
            long r12 = r12 >> r7
            long r12 = r12 & r34
            int r7 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r7 != 0) goto Lce
        Lc8:
            r38 = r6
            r19 = 128(0x80, double:6.3E-322)
            goto L279
        Lce:
            int r0 = r4.f9672
            if (r0 <= r5) goto L1f6
            int r7 = r4.f9673
            long r12 = (long) r7
            r14 = 32
            long r12 = r12 * r14
            long r14 = (long) r0
            r19 = 25
            long r14 = r14 * r19
            int r0 = java.lang.Long.compareUnsigned(r12, r14)
            if (r0 > 0) goto L1f6
            long[] r0 = r4.f9670
            int r7 = r4.f9672
            long[] r12 = r4.f9671
            int r13 = r7 + 7
            int r13 = r13 >> 3
            r14 = r39
        Lef:
            if (r14 >= r13) goto L10c
            r15 = r0[r14]
            r19 = 128(0x80, double:6.3E-322)
            long r8 = r15 & r31
            r16 = r5
            r15 = r6
            long r5 = ~r8
            long r8 = r8 >>> r29
            long r5 = r5 + r8
            r8 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r5 = r5 & r8
            r0[r14] = r5
            int r14 = r14 + 1
            r6 = r15
            r5 = r16
            goto Lef
        L10c:
            r16 = r5
            r15 = r6
            r19 = 128(0x80, double:6.3E-322)
            int r5 = p000.AbstractC0312g7.m2252(r0)
            int r6 = r5 + (-1)
            r8 = r0[r6]
            r13 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r8 = r8 & r13
            r25 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r8 = r8 | r25
            r0[r6] = r8
            r8 = r0[r39]
            r0[r5] = r8
            r5 = r39
        L12b:
            if (r5 == r7) goto L1e7
            int r6 = r5 >> 3
            r8 = r0[r6]
            r23 = r5 & 7
            int r23 = r23 << 3
            long r8 = r8 >> r23
            long r8 = r8 & r34
            int r25 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r25 != 0) goto L140
        L13d:
            int r5 = r5 + 1
            goto L12b
        L140:
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto L145
            goto L13d
        L145:
            r8 = r12[r5]
            int r8 = java.lang.Long.hashCode(r8)
            int r8 = r8 * r33
            int r9 = r8 << 16
            r8 = r8 ^ r9
            int r9 = r8 >>> 7
            int r25 = r4.m5348(r9)
            r9 = r9 & r7
            int r26 = r25 - r9
            r26 = r26 & r7
            r27 = r13
            int r13 = r26 / 8
            int r9 = r5 - r9
            r9 = r9 & r7
            int r9 = r9 / 8
            r30 = -9223372036854775808
            if (r13 != r9) goto L189
            r8 = r8 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r13 = r0[r6]
            r26 = r5
            r38 = r6
            long r5 = r34 << r23
            long r5 = ~r5
            long r5 = r5 & r13
            long r8 = r8 << r23
            long r5 = r5 | r8
            r0[r38] = r5
            int r5 = r0.length
            int r5 = r5 - r15
            r8 = r0[r39]
            long r8 = r8 & r27
            long r8 = r8 | r30
            r0[r5] = r8
            int r5 = r26 + 1
        L186:
            r13 = r27
            goto L12b
        L189:
            r26 = r5
            r38 = r6
            int r5 = r25 >> 3
            r13 = r0[r5]
            r6 = r25 & 7
            int r6 = r6 << 3
            long r36 = r13 >> r6
            long r36 = r36 & r34
            int r9 = (r36 > r19 ? 1 : (r36 == r19 ? 0 : -1))
            if (r9 != 0) goto L1c1
            r8 = r8 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r32 = r5
            r36 = r6
            long r5 = r34 << r36
            long r5 = ~r5
            long r5 = r5 & r13
            long r8 = r8 << r36
            long r5 = r5 | r8
            r0[r32] = r5
            r5 = r0[r38]
            long r8 = r34 << r23
            long r8 = ~r8
            long r5 = r5 & r8
            long r8 = r19 << r23
            long r5 = r5 | r8
            r0[r38] = r5
            r5 = r12[r26]
            r12[r25] = r5
            r12[r26] = r17
            r5 = r26
            goto L1db
        L1c1:
            r32 = r5
            r36 = r6
            r5 = r8 & 127(0x7f, float:1.78E-43)
            long r5 = (long) r5
            long r8 = r34 << r36
            long r8 = ~r8
            long r8 = r8 & r13
            long r5 = r5 << r36
            long r5 = r5 | r8
            r0[r32] = r5
            r5 = r12[r25]
            r8 = r12[r26]
            r12[r25] = r8
            r12[r26] = r5
            int r5 = r26 + (-1)
        L1db:
            int r6 = r0.length
            int r6 = r6 - r15
            r8 = r0[r39]
            long r8 = r8 & r27
            long r8 = r8 | r30
            r0[r6] = r8
            int r5 = r5 + r15
            goto L186
        L1e7:
            int r0 = r4.f9672
            int r0 = p000.tq1.m5731(r0)
            int r5 = r4.f9673
            int r0 = r0 - r5
            r4.f9674 = r0
        L1f2:
            r38 = r15
            goto L275
        L1f6:
            r15 = r6
            r19 = 128(0x80, double:6.3E-322)
            int r0 = r4.f9672
            int r0 = p000.tq1.m5732(r0)
            long[] r5 = r4.f9670
            long[] r6 = r4.f9671
            int r7 = r4.f9672
            r4.m5349(r0)
            long[] r0 = r4.f9670
            long[] r8 = r4.f9671
            int r9 = r4.f9672
            r12 = r39
        L210:
            if (r12 >= r7) goto L1f2
            int r13 = r12 >> 3
            r13 = r5[r13]
            r16 = r12 & 7
            int r16 = r16 << 3
            long r13 = r13 >> r16
            long r13 = r13 & r34
            int r13 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r13 >= 0) goto L262
            r13 = r6[r12]
            int r16 = java.lang.Long.hashCode(r13)
            int r16 = r16 * r33
            int r17 = r16 << 16
            r16 = r16 ^ r17
            r38 = r15
            int r15 = r16 >>> 7
            int r15 = r4.m5348(r15)
            r17 = r0
            r0 = r16 & 127(0x7f, float:1.78E-43)
            r16 = r5
            r18 = r6
            long r5 = (long) r0
            int r0 = r15 >> 3
            r21 = r15 & 7
            int r21 = r21 << 3
            r22 = r17[r0]
            r25 = r5
            long r5 = r34 << r21
            long r5 = ~r5
            long r5 = r22 & r5
            long r21 = r25 << r21
            long r5 = r5 | r21
            r17[r0] = r5
            int r0 = r15 + (-7)
            r0 = r0 & r9
            r21 = r9 & 7
            int r0 = r0 + r21
            int r0 = r0 >> 3
            r17[r0] = r5
            r8[r15] = r13
            goto L26a
        L262:
            r17 = r0
            r16 = r5
            r18 = r6
            r38 = r15
        L26a:
            int r12 = r12 + 1
            r15 = r38
            r5 = r16
            r0 = r17
            r6 = r18
            goto L210
        L275:
            int r0 = r4.m5348(r3)
        L279:
            r14 = r0
            int r0 = r4.f9673
            int r0 = r0 + 1
            r4.f9673 = r0
            int r0 = r4.f9674
            long[] r3 = r4.f9670
            int r5 = r14 >> 3
            r6 = r3[r5]
            r8 = r14 & 7
            int r8 = r8 << 3
            long r12 = r6 >> r8
            long r12 = r12 & r34
            int r9 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r9 != 0) goto L297
            r9 = r38
            goto L299
        L297:
            r9 = r39
        L299:
            int r0 = r0 - r9
            r4.f9674 = r0
            int r0 = r4.f9672
            long r12 = r34 << r8
            long r12 = ~r12
            long r6 = r6 & r12
            long r8 = r10 << r8
            long r6 = r6 | r8
            r3[r5] = r6
            int r5 = r14 + (-7)
            r5 = r5 & r0
            r0 = r0 & 7
            int r5 = r5 + r0
            int r0 = r5 >> 3
            r3[r0] = r6
        L2b1:
            long[] r0 = r4.f9671
            r0[r14] = r1
            return r38
        L2b6:
            r16 = r5
            r38 = r6
            int r26 = r26 + 8
            int r25 = r25 + r26
            r25 = r25 & r7
            r15 = r31
            r12 = r33
            goto L55
        L2c6:
            r24 = r7
            r33 = r12
            r31 = r15
            r27 = 1
            r29 = 7
            r30 = 63
            r34 = 255(0xff, double:1.26E-321)
            r16 = r5
            r15 = r6
            if (r3 != r15) goto L373
            s11 r3 = r0.f12450
            if (r3 == 0) goto L372
            boolean r3 = r3.m5347(r1)
            if (r3 != r15) goto L372
            s11 r0 = r0.f12450
            if (r0 == 0) goto L36a
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 * r33
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f9672
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r39
        L2f9:
            long[] r7 = r0.f9670
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r15 = 1
            int r8 = r8 + r15
            r7 = r7[r8]
            int r12 = 64 - r9
            long r7 = r7 << r12
            long r12 = (long) r9
            long r12 = -r12
            long r12 = r12 >> r30
            long r7 = r7 & r12
            long r7 = r7 | r10
            long r9 = (long) r4
            long r9 = r9 * r19
            long r9 = r9 ^ r7
            long r11 = r9 - r19
            long r9 = ~r9
            long r9 = r9 & r11
            long r9 = r9 & r31
        L31b:
            int r11 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r11 == 0) goto L334
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            long[] r12 = r0.f9671
            r12 = r12[r11]
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L330
            goto L33f
        L330:
            long r11 = r9 - r27
            long r9 = r9 & r11
            goto L31b
        L334:
            long r9 = ~r7
            long r9 = r9 << r23
            long r7 = r7 & r9
            long r7 = r7 & r31
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r7 == 0) goto L36c
            r11 = -1
        L33f:
            if (r11 < 0) goto L36a
            int r1 = r0.f9673
            r15 = 1
            int r1 = r1 - r15
            r0.f9673 = r1
            long[] r1 = r0.f9670
            int r0 = r0.f9672
            int r2 = r11 >> 3
            r3 = r11 & 7
            int r3 = r3 << 3
            r4 = r1[r2]
            long r6 = r34 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            long r6 = r21 << r3
            long r3 = r4 | r6
            r1[r2] = r3
            int r11 = r11 + (-7)
            r2 = r11 & r0
            r0 = r0 & 7
            int r2 = r2 + r0
            int r0 = r2 >> 3
            r1[r0] = r3
            r15 = 1
            return r15
        L36a:
            r15 = 1
            goto L373
        L36c:
            r15 = 1
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L2f9
        L372:
            return r39
        L373:
            return r15
    }
}
