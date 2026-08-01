package p000;

/* JADX INFO: renamed from: pu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0700pu implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8706;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f8707;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.um1 f8708;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.widget.TextView f8709;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f8710;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.io.Serializable f8711;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.Object f8712;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ java.lang.Object f8713;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ android.view.View f8714;

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ android.widget.TextView f8715;

    /* JADX INFO: renamed from: ο */
    public final /* synthetic */ android.widget.TextView f8716;

    public /* synthetic */ C0700pu(android.app.Activity r2, android.app.AlertDialog r3, p000.qm1 r4, p000.um1 r5, android.widget.ProgressBar r6, android.widget.TextView r7, p000.C1000xx r8, android.widget.LinearLayout r9, android.widget.Button r10, android.widget.Button r11) {
            r1 = this;
            r0 = 1
            r1.f8706 = r0
            r1.<init>()
            r1.f8707 = r2
            r1.f8710 = r3
            r1.f8711 = r4
            r1.f8708 = r5
            r1.f8712 = r6
            r1.f8709 = r7
            r1.f8713 = r8
            r1.f8714 = r9
            r1.f8715 = r10
            r1.f8716 = r11
            return
    }

    public /* synthetic */ C0700pu(java.util.LinkedHashMap r2, p000.EnumC1071zu r3, java.util.LinkedHashMap r4, p000.um1 r5, android.widget.EditText r6, android.app.Activity r7, android.widget.EditText r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11) {
            r1 = this;
            r0 = 0
            r1.f8706 = r0
            r1.<init>()
            r1.f8710 = r2
            r1.f8712 = r3
            r1.f8711 = r4
            r1.f8708 = r5
            r1.f8713 = r6
            r1.f8707 = r7
            r1.f8714 = r8
            r1.f8709 = r9
            r1.f8715 = r10
            r1.f8716 = r11
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            int r1 = r0.f8706
            s62 r2 = p000.s62.f9751
            android.view.View r3 = r0.f8714
            java.lang.Object r4 = r0.f8713
            java.lang.Object r5 = r0.f8712
            java.io.Serializable r6 = r0.f8711
            java.lang.Object r7 = r0.f8710
            android.app.Activity r8 = r0.f8707
            switch(r1) {
                case 0: goto L46;
                default: goto L15;
            }
        L15:
            r10 = r7
            android.app.AlertDialog r10 = (android.app.AlertDialog) r10
            r11 = r6
            qm1 r11 = (p000.qm1) r11
            r14 = r5
            android.widget.ProgressBar r14 = (android.widget.ProgressBar) r14
            r16 = r4
            xx r16 = (p000.C1000xx) r16
            r17 = r3
            android.widget.LinearLayout r17 = (android.widget.LinearLayout) r17
            android.widget.TextView r1 = r0.f8715
            r18 = r1
            android.widget.Button r18 = (android.widget.Button) r18
            android.widget.TextView r1 = r0.f8716
            r19 = r1
            android.widget.Button r19 = (android.widget.Button) r19
            r12 = r21
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            r12.getClass()
            h90 r9 = new h90
            um1 r13 = r0.f8708
            android.widget.TextView r15 = r0.f8709
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r8.runOnUiThread(r9)
            return r2
        L46:
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            zu r5 = (p000.EnumC1071zu) r5
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            r9 = r4
            android.widget.EditText r9 = (android.widget.EditText) r9
            r11 = r3
            android.widget.EditText r11 = (android.widget.EditText) r11
            r1 = r21
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r3 = "/"
            java.lang.String r4 = "/sdcard/"
            if (r1 != 0) goto L5e
            goto L167
        L5e:
            java.lang.String r10 = r1.toString()
            r7.put(r5, r10)
            r7 = 1
            r10 = 0
            r12 = 47
            java.lang.String r13 = android.provider.DocumentsContract.getTreeDocumentId(r1)     // Catch: java.lang.Throwable -> Ldd
            r13.getClass()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r14 = ":"
            java.lang.String[] r14 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> Ldd
            r15 = 2
            java.util.List r13 = p000.q02.m4683(r13, r14, r15)     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r14 = p000.AbstractC0984xh.m6641(r10, r13)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r15 = ""
            if (r14 != 0) goto L86
            r14 = r15
        L86:
            java.lang.Object r13 = p000.AbstractC0984xh.m6641(r7, r13)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> Ldd
            if (r13 != 0) goto L8f
            goto L90
        L8f:
            r15 = r13
        L90:
            char[] r13 = new char[r7]     // Catch: java.lang.Throwable -> Ldd
            r13[r10] = r12     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r13 = p000.q02.m4661(r15, r13)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r15 = "primary"
            boolean r15 = r14.equalsIgnoreCase(r15)     // Catch: java.lang.Throwable -> Ldd
            if (r15 == 0) goto Lae
            boolean r14 = p000.q02.m4671(r13)     // Catch: java.lang.Throwable -> Ldd
            if (r14 == 0) goto La9
            java.lang.String r1 = "/sdcard"
            goto Le4
        La9:
            java.lang.String r1 = r4.concat(r13)     // Catch: java.lang.Throwable -> Ldd
            goto Le4
        Lae:
            boolean r4 = p000.q02.m4671(r14)     // Catch: java.lang.Throwable -> Ldd
            if (r4 != 0) goto Ld4
            boolean r4 = p000.q02.m4671(r13)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r15 = "/storage/"
            if (r4 == 0) goto Lc1
            java.lang.String r1 = r15.concat(r14)     // Catch: java.lang.Throwable -> Ldd
            goto Le4
        Lc1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd
            r4.<init>(r15)     // Catch: java.lang.Throwable -> Ldd
            r4.append(r14)     // Catch: java.lang.Throwable -> Ldd
            r4.append(r3)     // Catch: java.lang.Throwable -> Ldd
            r4.append(r13)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Ldd
            goto Le4
        Ld4:
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> Ldd
            r4.getClass()     // Catch: java.lang.Throwable -> Ldd
            r1 = r4
            goto Le4
        Ldd:
            java.lang.String r1 = r1.toString()
            r1.getClass()
        Le4:
            java.lang.Object r4 = r6.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r13 = 0
            if (r4 == 0) goto L105
            r14 = 92
            java.lang.String r4 = r4.replace(r14, r12)
            r4.getClass()
            java.lang.String r4 = p000.q02.m4687(r4, r12, r4)
            boolean r14 = p000.q02.m4671(r4)
            if (r14 != 0) goto L101
            goto L102
        L101:
            r4 = r13
        L102:
            if (r4 == 0) goto L105
            goto L11a
        L105:
            int r4 = r5.ordinal()
            java.lang.String r14 = "{nickname}_{currentTime}"
            switch(r4) {
                case 0: goto L116;
                case 1: goto L116;
                case 2: goto L116;
                case 3: goto L116;
                case 4: goto L118;
                case 5: goto L116;
                case 6: goto L113;
                default: goto L10e;
            }
        L10e:
            p000.C1080.m7272()
            r2 = r13
            goto L167
        L113:
            java.lang.String r4 = "comment_emoji_{currentTime}"
            goto L11a
        L116:
            r4 = r14
            goto L11a
        L118:
            java.lang.String r4 = "{nickname}_{currentTime}_livephoto"
        L11a:
            char[] r7 = new char[r7]
            r7[r10] = r12
            java.lang.String r1 = p000.q02.m4663(r1, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r3)
            r7.append(r4)
            java.lang.String r1 = r7.toString()
            r6.put(r5, r1)
            um1 r3 = r0.f8708
            java.lang.Object r4 = r3.f10912
            if (r4 != r5) goto L167
            r9.setText(r1)
            android.text.Editable r1 = r9.getText()
            if (r1 == 0) goto L14b
            int r1 = r1.length()
            goto L14c
        L14b:
            r1 = r10
        L14c:
            r9.setSelection(r1)
            r9.requestFocus()
            qu r1 = new qu
            r1.<init>(r8, r9, r10)
            r4 = 120(0x78, double:5.93E-322)
            r9.postDelayed(r1, r4)
            r12 = 0
            android.widget.TextView r13 = r0.f8709
            android.widget.TextView r14 = r0.f8715
            android.widget.TextView r15 = r0.f8716
            r10 = r3
            p000.h62.m2411(r9, r10, r11, r12, r13, r14, r15)
        L167:
            return r2
    }
}
