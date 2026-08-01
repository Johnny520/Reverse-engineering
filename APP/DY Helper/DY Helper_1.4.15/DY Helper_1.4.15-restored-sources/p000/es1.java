package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class es1 {

    /* JADX INFO: renamed from: α */
    public final p000.yp0 f3662;

    /* JADX INFO: renamed from: β */
    public final p000.C0530lz f3663;

    /* JADX INFO: renamed from: γ */
    public final p000.sm0 f3664;

    /* JADX INFO: renamed from: δ */
    public final p000.v11 f3665;

    public es1(p000.yp0 r1, p000.C0530lz r2, p000.n11 r3) {
            r0 = this;
            r0.<init>()
            r0.f3662 = r1
            r0.f3663 = r2
            r0.f3664 = r3
            v11 r1 = new v11
            r2 = 2
            r1.<init>(r2)
            r0.f3665 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final p000.bs1 m1953() {
            r4 = this;
            xr1 r0 = new xr1
            r0.<init>()
            bs1 r1 = new bs1
            r2 = 0
            lz r3 = r4.f3663
            yp0 r4 = r4.f3662
            r1.<init>(r3, r2, r4, r0)
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final void m1954(p000.yp0 r18, p000.xr1 r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            v11 r0 = r0.f3665
            java.lang.Object[] r2 = r0.f11064
            int r0 = r0.f11065
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r0) goto L15d
            r5 = r2[r4]
            k0 r5 = (p000.C0452k0) r5
            y21 r6 = r5.f5681
            java.lang.Object r7 = r6.f12428
            android.view.autofill.AutofillManager r7 = (android.view.autofill.AutofillManager) r7
            androidx.compose.ui.platform.AndroidComposeView r8 = r5.f5683
            xr1 r9 = r18.m7007()
            r10 = r18
            int r11 = r10.f12744
            if (r1 == 0) goto L36
            is1 r13 = p000.fs1.f4088
            b21 r14 = r1.f12268
            java.lang.Object r13 = r14.m695(r13)
            if (r13 != 0) goto L2f
            r13 = 0
        L2f:
            g4 r13 = (p000.C0309g4) r13
            if (r13 == 0) goto L36
            java.lang.String r13 = r13.f4228
            goto L37
        L36:
            r13 = 0
        L37:
            if (r9 == 0) goto L4b
            is1 r14 = p000.fs1.f4088
            b21 r15 = r9.f12268
            java.lang.Object r14 = r15.m695(r14)
            if (r14 != 0) goto L44
            r14 = 0
        L44:
            g4 r14 = (p000.C0309g4) r14
            if (r14 == 0) goto L4b
            java.lang.String r14 = r14.f4228
            goto L4c
        L4b:
            r14 = 0
        L4c:
            r15 = 1
            if (r13 == r14) goto L9a
            if (r13 != 0) goto L55
            r6.m6815(r8, r11, r15)
            goto L9a
        L55:
            if (r14 != 0) goto L5b
            r6.m6815(r8, r11, r3)
            goto L9a
        L5b:
            is1 r13 = p000.fs1.f4115
            java.lang.Object r13 = p000.v81.m6122(r9, r13)
            a2 r13 = (p000.C0003a2) r13
            a2 r12 = p000.C0966x.f11914
            boolean r12 = p000.ln0.m3626(r13, r12)
            if (r12 == 0) goto L9a
            int r12 = r14.length()
            r13 = 5000(0x1388, float:7.006E-42)
            if (r12 >= r13) goto L74
            goto L93
        L74:
            r12 = 4999(0x1387, float:7.005E-42)
            char r16 = r14.charAt(r12)
            boolean r16 = java.lang.Character.isHighSurrogate(r16)
            if (r16 == 0) goto L8f
            char r16 = r14.charAt(r13)
            boolean r16 = java.lang.Character.isLowSurrogate(r16)
            if (r16 == 0) goto L8f
            java.lang.String r14 = p000.q02.m4693(r14, r12)
            goto L93
        L8f:
            java.lang.String r14 = p000.q02.m4693(r14, r13)
        L93:
            android.view.autofill.AutofillValue r12 = android.view.autofill.AutofillValue.forText(r14)
            r7.notifyValueChanged(r8, r11, r12)
        L9a:
            if (r1 == 0) goto Laa
            is1 r12 = p000.fs1.f4092
            b21 r13 = r1.f12268
            java.lang.Object r12 = r13.m695(r12)
            if (r12 != 0) goto La7
            r12 = 0
        La7:
            r42 r12 = (p000.r42) r12
            goto Lab
        Laa:
            r12 = 0
        Lab:
            if (r9 == 0) goto Lbb
            is1 r13 = p000.fs1.f4092
            b21 r14 = r9.f12268
            java.lang.Object r13 = r14.m695(r13)
            if (r13 != 0) goto Lb8
            r13 = 0
        Lb8:
            r42 r13 = (p000.r42) r13
            goto Lbc
        Lbb:
            r13 = 0
        Lbc:
            if (r12 == r13) goto Lf6
            if (r12 != 0) goto Lc4
            r6.m6815(r8, r11, r15)
            goto Lf6
        Lc4:
            if (r13 != 0) goto Lca
            r6.m6815(r8, r11, r3)
            goto Lf6
        Lca:
            is1 r12 = p000.fs1.f4115
            java.lang.Object r12 = p000.v81.m6122(r9, r12)
            a2 r12 = (p000.C0003a2) r12
            a2 r14 = p000.C0966x.f11915
            boolean r12 = p000.ln0.m3626(r12, r14)
            if (r12 == 0) goto Lf6
            int r12 = r13.ordinal()
            if (r12 == 0) goto Le7
            if (r12 == r15) goto Le4
            r12 = 0
            goto Le9
        Le4:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            goto Le9
        Le7:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
        Le9:
            if (r12 == 0) goto Lf6
            boolean r12 = r12.booleanValue()
            android.view.autofill.AutofillValue r12 = android.view.autofill.AutofillValue.forToggle(r12)
            r7.notifyValueChanged(r8, r11, r12)
        Lf6:
            if (r1 == 0) goto L106
            is1 r12 = p000.fs1.f4116
            b21 r13 = r1.f12268
            java.lang.Object r12 = r13.m695(r12)
            if (r12 != 0) goto L103
            r12 = 0
        L103:
            g2 r12 = (p000.C0307g2) r12
            goto L107
        L106:
            r12 = 0
        L107:
            if (r9 == 0) goto L117
            is1 r13 = p000.fs1.f4116
            b21 r14 = r9.f12268
            java.lang.Object r13 = r14.m695(r13)
            if (r13 != 0) goto L114
            r13 = 0
        L114:
            g2 r13 = (p000.C0307g2) r13
            goto L118
        L117:
            r13 = 0
        L118:
            boolean r14 = p000.ln0.m3626(r12, r13)
            if (r14 != 0) goto L12f
            if (r12 != 0) goto L124
            r6.m6815(r8, r11, r15)
            goto L12f
        L124:
            if (r13 != 0) goto L12a
            r6.m6815(r8, r11, r3)
            goto L12f
        L12a:
            android.view.autofill.AutofillValue r6 = r13.f4212
            r7.notifyValueChanged(r8, r11, r6)
        L12f:
            if (r1 == 0) goto L13d
            b21 r6 = r1.f12268
            is1 r7 = p000.fs1.f4114
            boolean r6 = r6.m690(r7)
            if (r6 != r15) goto L13d
            r6 = r15
            goto L13e
        L13d:
            r6 = r3
        L13e:
            if (r9 == 0) goto L14b
            b21 r7 = r9.f12268
            is1 r8 = p000.fs1.f4114
            boolean r7 = r7.m690(r8)
            if (r7 != r15) goto L14b
            goto L14c
        L14b:
            r15 = r3
        L14c:
            if (r6 == r15) goto L159
            o11 r5 = r5.f5687
            if (r15 == 0) goto L156
            r5.m4151(r11)
            goto L159
        L156:
            r5.m4155(r11)
        L159:
            int r4 = r4 + 1
            goto Lc
        L15d:
            return
    }
}
