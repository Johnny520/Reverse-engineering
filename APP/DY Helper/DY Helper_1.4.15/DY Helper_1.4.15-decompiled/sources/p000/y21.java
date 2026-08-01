package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y21 implements p000.InterfaceC0260et, p000.hj1, p000.f40, p000.c00, p000.InterfaceC0199d4, p000.n72 {

    /* JADX INFO: renamed from: ε */
    public java.lang.Object f12428;

    public y21(int r2) {
            r1 = this;
            switch(r2) {
                case 5: goto L25;
                case 8: goto L1a;
                case 11: goto Lf;
                default: goto L3;
            }
        L3:
            r1.<init>()
            zv0 r2 = new zv0
            r0 = 0
            r2.<init>(r0)
            r1.f12428 = r2
            return
        Lf:
            r1.<init>()
            nq r2 = new nq
            r2.<init>(r1)
            r1.f12428 = r2
            return
        L1a:
            r1.<init>()
            android.graphics.Region r2 = new android.graphics.Region
            r2.<init>()
            r1.f12428 = r2
            return
        L25:
            r1.<init>()
            n11 r2 = new n11
            r2.<init>()
            r1.f12428 = r2
            return
    }

    public /* synthetic */ y21(java.lang.Object r1) {
            r0 = this;
            r0.f12428 = r1
            r0.<init>()
            return
    }

    @Override // p000.InterfaceC0199d4
    public p000.e40 get(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.f12428
            e40[] r0 = (p000.e40[]) r0
            r0 = r0[r1]
            return r0
    }

    @Override // p000.c00
    /* JADX INFO: renamed from: α */
    public p000.vk1 mo1093() {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r5.f12428
            al1 r2 = (p000.al1) r2
            uk1 r2 = r2.f318
            boolean r2 = r2.f10903
            if (r2 != 0) goto L5d
            java.lang.Object r2 = r5.f12428     // Catch: java.io.IOException -> L30
            al1 r2 = (p000.al1) r2     // Catch: java.io.IOException -> L30
            bp1 r2 = r2.m174()     // Catch: java.io.IOException -> L30
            boolean r3 = r2.mo991()     // Catch: java.io.IOException -> L30
            if (r3 != 0) goto L45
            ap1 r3 = r2.mo992()     // Catch: java.io.IOException -> L30
            bp1 r4 = r3.f1271     // Catch: java.io.IOException -> L30
            if (r4 != 0) goto L28
            java.lang.Throwable r4 = r3.f1272     // Catch: java.io.IOException -> L30
            if (r4 != 0) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = 0
        L29:
            if (r4 == 0) goto L32
            ap1 r3 = r2.mo989()     // Catch: java.io.IOException -> L30
            goto L32
        L30:
            r2 = move-exception
            goto L4a
        L32:
            bp1 r4 = r3.f1271     // Catch: java.io.IOException -> L30
            java.lang.Throwable r3 = r3.f1272     // Catch: java.io.IOException -> L30
            if (r3 != 0) goto L44
            if (r4 == 0) goto L45
            java.lang.Object r2 = r5.f12428     // Catch: java.io.IOException -> L30
            al1 r2 = (p000.al1) r2     // Catch: java.io.IOException -> L30
            w6 r2 = r2.f323     // Catch: java.io.IOException -> L30
            r2.addFirst(r4)     // Catch: java.io.IOException -> L30
            goto L2
        L44:
            throw r3     // Catch: java.io.IOException -> L30
        L45:
            vk1 r5 = r2.mo990()     // Catch: java.io.IOException -> L30
            return r5
        L4a:
            if (r1 != 0) goto L4e
            r1 = r2
            goto L51
        L4e:
            p000.ln0.m3624(r1, r2)
        L51:
            java.lang.Object r2 = r5.f12428
            al1 r2 = (p000.al1) r2
            boolean r2 = r2.m173(r0)
            if (r2 == 0) goto L5c
            goto L2
        L5c:
            throw r1
        L5d:
            java.lang.String r5 = "Canceled"
            p000.C1080.m7281(r5)
            r5 = 0
            return r5
    }

    @Override // p000.c00
    /* JADX INFO: renamed from: β */
    public p000.al1 mo1094() {
            r0 = this;
            java.lang.Object r0 = r0.f12428
            al1 r0 = (p000.al1) r0
            return r0
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: γ */
    public java.lang.Object mo601(p000.g40 r5, p000.InterfaceC0631op r6) {
            r4 = this;
            boolean r0 = r6 instanceof p000.C1094
            if (r0 == 0) goto L13
            r0 = r6
            ρ r0 = (p000.C1094) r0
            int r1 = r0.f13414
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13414 = r1
            goto L18
        L13:
            ρ r0 = new ρ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f13412
            int r1 = r0.f13414
            s62 r2 = p000.s62.f9751
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2b
            mp1 r4 = r0.f13411
            p000.i81.m2649(r6)     // Catch: java.lang.Throwable -> L29
            goto L55
        L29:
            r5 = move-exception
            goto L5f
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r4)
            r4 = 0
            return r4
        L32:
            p000.i81.m2649(r6)
            mp1 r6 = new mp1
            up r1 = r0.f8639
            r1.getClass()
            r6.<init>(r5, r1)
            r0.f13411 = r6     // Catch: java.lang.Throwable -> L5d
            r0.f13414 = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r4.f12428     // Catch: java.lang.Throwable -> L59
            y12 r4 = (p000.y12) r4     // Catch: java.lang.Throwable -> L59
            java.lang.Object r4 = r4.invoke(r6, r0)     // Catch: java.lang.Throwable -> L59
            cq r5 = p000.EnumC0184cq.f2716
            if (r4 != r5) goto L50
            goto L51
        L50:
            r4 = r2
        L51:
            if (r4 != r5) goto L54
            return r5
        L54:
            r4 = r6
        L55:
            r4.mo4562()
            return r2
        L59:
            r4 = move-exception
            r5 = r4
        L5b:
            r4 = r6
            goto L5f
        L5d:
            r5 = move-exception
            goto L5b
        L5f:
            r4.mo4562()
            throw r5
    }

    @Override // p000.InterfaceC0260et
    /* JADX INFO: renamed from: δ */
    public boolean mo1955(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            r1 = 0
            return r1
        L7:
            r1.mo1957()
            java.lang.Object r1 = r1.f12428
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            int r2 = (int) r2
            r1.m435(r2)
            r1 = 1
            return r1
    }

    @Override // p000.hj1
    /* JADX INFO: renamed from: ε */
    public void mo2511() {
            r1 = this;
            java.lang.String r1 = "DIAGNOSTIC_PROFILE_IS_COMPRESSED"
            java.lang.String r0 = "ProfileInstaller"
            android.util.Log.d(r0, r1)
            return
    }

    @Override // p000.n72
    /* JADX INFO: renamed from: ζ */
    public p000.AbstractC0100c4 mo2559(long r7, p000.AbstractC0100c4 r9, p000.AbstractC0100c4 r10, p000.AbstractC0100c4 r11) {
            r6 = this;
            java.lang.Object r6 = r6.f12428
            r0 = r6
            i0 r0 = (p000.C0379i0) r0
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            c4 r6 = r0.mo2559(r1, r3, r4, r5)
            return r6
    }

    @Override // p000.hj1
    /* JADX INFO: renamed from: η */
    public void mo2512(int r4, java.lang.Object r5) {
            r3 = this;
            switch(r4) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1b;
                case 4: goto L18;
                case 5: goto L15;
                case 6: goto L12;
                case 7: goto Lf;
                case 8: goto Lc;
                case 9: goto L3;
                case 10: goto L9;
                case 11: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = ""
            goto L23
        L6:
            java.lang.String r0 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
            goto L23
        L9:
            java.lang.String r0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
            goto L23
        Lc:
            java.lang.String r0 = "RESULT_PARSE_EXCEPTION"
            goto L23
        Lf:
            java.lang.String r0 = "RESULT_IO_EXCEPTION"
            goto L23
        L12:
            java.lang.String r0 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
            goto L23
        L15:
            java.lang.String r0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
            goto L23
        L18:
            java.lang.String r0 = "RESULT_NOT_WRITABLE"
            goto L23
        L1b:
            java.lang.String r0 = "RESULT_UNSUPPORTED_ART_VERSION"
            goto L23
        L1e:
            java.lang.String r0 = "RESULT_ALREADY_INSTALLED"
            goto L23
        L21:
            java.lang.String r0 = "RESULT_INSTALL_SUCCESS"
        L23:
            r1 = 6
            java.lang.String r2 = "ProfileInstaller"
            if (r4 == r1) goto L33
            r1 = 7
            if (r4 == r1) goto L33
            r1 = 8
            if (r4 == r1) goto L33
            android.util.Log.d(r2, r0)
            goto L38
        L33:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r2, r0, r5)
        L38:
            java.lang.Object r3 = r3.f12428
            androidx.profileinstaller.ProfileInstallReceiver r3 = (androidx.profileinstaller.ProfileInstallReceiver) r3
            r3.setResultCode(r4)
            return
    }

    @Override // p000.n72
    /* JADX INFO: renamed from: θ */
    public p000.AbstractC0100c4 mo2561(long r7, p000.AbstractC0100c4 r9, p000.AbstractC0100c4 r10, p000.AbstractC0100c4 r11) {
            r6 = this;
            java.lang.Object r6 = r6.f12428
            r0 = r6
            i0 r0 = (p000.C0379i0) r0
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            c4 r6 = r0.mo2561(r1, r3, r4, r5)
            return r6
    }

    @Override // p000.n72
    /* JADX INFO: renamed from: ι */
    public p000.AbstractC0100c4 mo2562(p000.AbstractC0100c4 r1, p000.AbstractC0100c4 r2, p000.AbstractC0100c4 r3) {
            r0 = this;
            java.lang.Object r0 = r0.f12428
            i0 r0 = (p000.C0379i0) r0
            c4 r0 = r0.mo2562(r1, r2, r3)
            return r0
    }

    @Override // p000.n72
    /* JADX INFO: renamed from: κ */
    public long mo2563(p000.AbstractC0100c4 r1, p000.AbstractC0100c4 r2, p000.AbstractC0100c4 r3) {
            r0 = this;
            java.lang.Object r0 = r0.f12428
            i0 r0 = (p000.C0379i0) r0
            long r0 = r0.mo2563(r1, r2, r3)
            return r0
    }

    @Override // p000.InterfaceC0260et
    /* JADX INFO: renamed from: λ */
    public float mo1956() {
            r0 = this;
            java.lang.Object r0 = r0.f12428
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            float r0 = r0.getVerticalScrollFactorCompat()
            float r0 = -r0
            return r0
    }

    @Override // p000.InterfaceC0260et
    /* JADX INFO: renamed from: μ */
    public void mo1957() {
            r0 = this;
            java.lang.Object r0 = r0.f12428
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            android.widget.OverScroller r0 = r0.f1045
            r0.abortAnimation()
            return
    }

    @Override // p000.n72
    /* JADX INFO: renamed from: ν */
    public void mo4011() {
            r0 = this;
            java.lang.Object r0 = r0.f12428
            i0 r0 = (p000.C0379i0) r0
            r0.getClass()
            return
    }

    /* JADX INFO: renamed from: ξ */
    public synchronized java.lang.Object m6814(java.lang.Object r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.f12428     // Catch: java.lang.Throwable -> Lb
            nq r0 = (p000.C0595nq) r0     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    /* JADX INFO: renamed from: ο */
    public void m6815(android.view.View r1, int r2, boolean r3) {
            r0 = this;
            java.lang.Object r0 = r0.f12428
            android.view.autofill.AutofillManager r0 = (android.view.autofill.AutofillManager) r0
            r0.notifyViewVisibilityChanged(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: π */
    public p000.C0574n5 m6816(p000.C0574n5 r42, androidx.compose.p001ui.platform.AndroidComposeView r43) {
            r41 = this;
            r0 = r42
            r1 = r41
            java.lang.Object r1 = r1.f12428
            zv0 r1 = (p000.zv0) r1
            zv0 r2 = new zv0
            java.lang.Object r3 = r0.f7387
            java.util.List r3 = (java.util.List) r3
            int r4 = r3.size()
            r2.<init>(r4)
            int r4 = r3.size()
            r6 = 0
        L1a:
            if (r6 >= r4) goto Lac
            java.lang.Object r7 = r3.get(r6)
            ci1 r7 = (p000.ci1) r7
            long r8 = r7.f2141
            java.lang.Object r10 = r1.m7234(r8)
            bi1 r10 = (p000.bi1) r10
            if (r10 != 0) goto L39
            long r10 = r7.f2142
            long r12 = r7.f2144
            r25 = r10
            r27 = r12
            r29 = 0
            r10 = r43
            goto L4b
        L39:
            long r11 = r10.f1729
            boolean r13 = r10.f1731
            long r14 = r10.f1730
            r10 = r43
            long r14 = r10.m378(r14)
            r25 = r11
            r29 = r13
            r27 = r14
        L4b:
            long r11 = r7.f2141
            ai1 r16 = new ai1
            long r13 = r7.f2142
            r15 = r6
            long r5 = r7.f2144
            r39 = r3
            boolean r3 = r7.f2145
            r23 = r3
            float r3 = r7.f2146
            r24 = r3
            int r3 = r7.f2147
            r30 = r3
            java.util.ArrayList r3 = r7.f2149
            r31 = r3
            r40 = r4
            long r3 = r7.f2150
            r32 = r3
            float r3 = r7.f2151
            r34 = r3
            long r3 = r7.f2152
            r35 = r3
            long r3 = r7.f2153
            r37 = r3
            r21 = r5
            r17 = r11
            r19 = r13
            r16.<init>(r17, r19, r21, r23, r24, r25, r27, r29, r30, r31, r32, r34, r35, r37)
            r5 = r16
            r3 = r17
            r2.m7236(r3, r5)
            boolean r3 = r7.f2145
            if (r3 == 0) goto La1
            bi1 r16 = new bi1
            long r4 = r7.f2142
            long r6 = r7.f2143
            r21 = r3
            r17 = r4
            r19 = r6
            r16.<init>(r17, r19, r21)
            r3 = r16
            r1.m7236(r8, r3)
            goto La4
        La1:
            r1.m7237(r8)
        La4:
            int r6 = r15 + 1
            r3 = r39
            r4 = r40
            goto L1a
        Lac:
            n5 r1 = new n5
            r3 = 19
            r4 = 0
            r1.<init>(r3, r2, r0, r4)
            return r1
    }

    /* JADX INFO: renamed from: ρ */
    public void m6817(p000.ym0 r4) {
            r3 = this;
            java.lang.Object r3 = r3.f12428
            android.graphics.Region r3 = (android.graphics.Region) r3
            int r0 = r4.f12684
            int r1 = r4.f12685
            int r2 = r4.f12686
            int r4 = r4.f12687
            r3.set(r0, r1, r2, r4)
            return
    }
}
