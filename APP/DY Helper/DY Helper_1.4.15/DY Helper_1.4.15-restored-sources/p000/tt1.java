package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tt1 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10451;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f10452;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.um1 f10453;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.app.Activity f10454;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f10455;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f10456;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.io.Serializable f10457;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ java.lang.Object f10458;

    public /* synthetic */ tt1(p000.a80 r2, android.app.Activity r3, android.app.AlertDialog r4, p000.um1 r5, p000.qm1 r6, p000.qm1 r7, p000.um1 r8) {
            r1 = this;
            r0 = 0
            r1.f10451 = r0
            r1.<init>()
            r1.f10455 = r2
            r1.f10454 = r3
            r1.f10456 = r4
            r1.f10453 = r5
            r1.f10452 = r6
            r1.f10458 = r7
            r1.f10457 = r8
            return
    }

    public /* synthetic */ tt1(android.widget.TextView r2, android.app.Activity r3, p000.ky1 r4, java.lang.String r5, android.widget.TextView r6, p000.um1 r7, java.lang.String r8) {
            r1 = this;
            r0 = 2
            r1.f10451 = r0
            r1.<init>()
            r1.f10455 = r2
            r1.f10454 = r3
            r1.f10456 = r4
            r1.f10457 = r5
            r1.f10452 = r6
            r1.f10453 = r7
            r1.f10458 = r8
            return
    }

    public /* synthetic */ tt1(p000.qm1 r2, p000.um1 r3, android.app.Activity r4, java.util.ArrayList r5, p000.a80 r6, android.app.AlertDialog r7, java.util.LinkedHashSet r8) {
            r1 = this;
            r0 = 1
            r1.f10451 = r0
            r1.<init>()
            r1.f10452 = r2
            r1.f10453 = r3
            r1.f10454 = r4
            r1.f10457 = r5
            r1.f10455 = r6
            r1.f10456 = r7
            r1.f10458 = r8
            return
    }

    public /* synthetic */ tt1(p000.um1 r2, p000.fz1 r3, p000.a80 r4, java.util.ArrayList r5, java.util.List r6, p000.C1000xx r7, android.app.Activity r8) {
            r1 = this;
            r0 = 3
            r1.f10451 = r0
            r1.<init>()
            r1.f10453 = r2
            r1.f10456 = r3
            r1.f10455 = r4
            r1.f10457 = r5
            r1.f10452 = r6
            r1.f10458 = r7
            r1.f10454 = r8
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.f10451
            r2 = 0
            android.app.Activity r3 = r0.f10454
            um1 r4 = r0.f10453
            java.lang.Object r5 = r0.f10458
            java.lang.Object r6 = r0.f10452
            java.io.Serializable r7 = r0.f10457
            java.lang.Object r8 = r0.f10455
            java.lang.Object r9 = r0.f10456
            switch(r1) {
                case 0: goto L1d8;
                case 1: goto L53;
                case 2: goto L2b;
                default: goto L16;
            }
        L16:
            fz1 r9 = (p000.fz1) r9
            a80 r8 = (p000.a80) r8
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.List r6 = (java.util.List) r6
            xx r5 = (p000.C1000xx) r5
            java.lang.String r0 = r9.f4180
            r4.f10912 = r0
            r8.invoke(r0)
            p000.jz1.m3083(r7, r4, r6, r5, r3)
            return
        L2b:
            r10 = r8
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = r9
            ky1 r1 = (p000.ky1) r1
            r11 = r7
            java.lang.String r11 = (java.lang.String) r11
            r12 = r6
            android.widget.TextView r12 = (android.widget.TextView) r12
            r15 = r5
            java.lang.String r15 = (java.lang.String) r15
            r10.setEnabled(r2)
            java.lang.String r2 = "正在更新…"
            r10.setText(r2)
            java.lang.Object r2 = p000.pf1.f8541
            gc r9 = new gc
            r16 = 2
            android.app.Activity r13 = r0.f10454
            um1 r14 = r0.f10453
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            p000.pf1.m4519(r13, r1, r9)
            return
        L53:
            qm1 r6 = (p000.qm1) r6
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            a80 r8 = (p000.a80) r8
            android.app.AlertDialog r9 = (android.app.AlertDialog) r9
            java.util.LinkedHashSet r5 = (java.util.LinkedHashSet) r5
            bv1 r0 = p000.bv1.f1853
            boolean r0 = r6.f9050
            if (r0 == 0) goto L78
            java.lang.Object r0 = r4.f10912
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L78
            java.lang.String r0 = "会话仍在加载，请稍后"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r2)
            r0.show()
            goto L1d7
        L78:
            java.lang.Object r0 = r4.f10912
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            int r6 = p000.AbstractC1021yh.m6889(r0, r4)
            r1.<init>(r6)
            java.util.Iterator r6 = r0.iterator()
        L8b:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L9d
            java.lang.Object r10 = r6.next()
            lu1 r10 = (p000.lu1) r10
            java.lang.String r10 = r10.f6800
            r1.add(r10)
            goto L8b
        L9d:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        La6:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto Lbd
            java.lang.Object r10 = r1.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = p000.q02.m4671(r11)
            if (r11 != 0) goto La6
            r6.add(r10)
            goto La6
        Lbd:
            java.util.Set r1 = p000.AbstractC0984xh.m6671(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r7.iterator()
        Lca:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Leb
            java.lang.Object r10 = r7.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r11 = p000.bv1.m1035(r11)
            boolean r12 = p000.q02.m4671(r11)
            if (r12 != 0) goto Lca
            boolean r11 = r1.contains(r11)
            if (r11 != 0) goto Lca
            r6.add(r10)
            goto Lca
        Leb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf4:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L10d
            java.lang.Object r7 = r0.next()
            r10 = r7
            lu1 r10 = (p000.lu1) r10
            java.lang.String r10 = r10.f6800
            boolean r10 = r5.contains(r10)
            if (r10 == 0) goto Lf4
            r1.add(r7)
            goto Lf4
        L10d:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r5 = p000.AbstractC1021yh.m6889(r1, r4)
            r0.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L11a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L12c
            java.lang.Object r5 = r1.next()
            lu1 r5 = (p000.lu1) r5
            java.lang.String r5 = r5.f6804
            r0.add(r5)
            goto L11a
        L12c:
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r6, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r4 = p000.AbstractC1021yh.m6889(r1, r4)
            r5.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L13d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L155
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            r5.add(r4)
            goto L13d
        L155:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r5.iterator()
        L15e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L175
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = p000.q02.m4671(r6)
            if (r6 != 0) goto L15e
            r1.add(r5)
            goto L15e
        L175:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r1.iterator()
        L183:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L19e
            java.lang.Object r5 = r1.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = p000.bv1.m1035(r6)
            boolean r6 = r4.add(r6)
            if (r6 == 0) goto L183
            r10.add(r5)
            goto L183
        L19e:
            r15 = 0
            r16 = 62
            java.lang.String r11 = "\n"
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r1 = p000.AbstractC0984xh.m6644(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r4 = "im_auto_read_filter_rules"
            p000.ui1.m5875(r4, r1)
            java.lang.String r1 = p000.bv1.m1066(r1)
            r8.invoke(r1)
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "已保存 "
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = " 个会话规则"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r2)
            r0.show()
            r9.dismiss()
        L1d7:
            return
        L1d8:
            a80 r8 = (p000.a80) r8
            android.app.AlertDialog r9 = (android.app.AlertDialog) r9
            qm1 r6 = (p000.qm1) r6
            qm1 r5 = (p000.qm1) r5
            um1 r7 = (p000.um1) r7
            java.lang.String r0 = p000.bv1.m1051(r4, r6, r5, r7)
            r1 = 120(0x78, float:1.68E-43)
            java.lang.String r0 = p000.q02.m4693(r0, r1)
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "info_bar_text_format"
            p000.ui1.m5875(r1, r0)
            r1 = 20
            java.lang.String r0 = p000.bv1.m1042(r0, r1)
            r8.invoke(r0)
            java.lang.String r0 = "格式已更新，切换视频后生效"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r2)
            r0.show()
            r9.dismiss()
            return
    }
}
