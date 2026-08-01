package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cl0 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2196;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f2197;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f2198;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f2199;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f2200;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ android.view.KeyEvent.Callback f2201;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.Object f2202;

    public /* synthetic */ cl0(android.app.Activity r2, p000.t72 r3, android.widget.ProgressBar r4, android.widget.TextView r5, android.widget.Button r6, android.widget.Button r7) {
            r1 = this;
            r0 = 4
            r1.f2196 = r0
            r1.<init>()
            r1.f2197 = r2
            r1.f2198 = r3
            r1.f2199 = r4
            r1.f2201 = r5
            r1.f2200 = r6
            r1.f2202 = r7
            return
    }

    public /* synthetic */ cl0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, android.view.KeyEvent.Callback r5, java.lang.Object r6, int r7) {
            r0 = this;
            r0.f2196 = r7
            r0.f2197 = r1
            r0.f2198 = r2
            r0.f2199 = r3
            r0.f2200 = r4
            r0.f2201 = r5
            r0.f2202 = r6
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.f2196
            r2 = 1
            r3 = 0
            java.lang.Object r4 = r0.f2202
            java.lang.Object r5 = r0.f2200
            android.view.KeyEvent$Callback r6 = r0.f2201
            java.lang.Object r7 = r0.f2199
            java.lang.Object r8 = r0.f2198
            java.lang.Object r0 = r0.f2197
            switch(r1) {
                case 0: goto Ldc;
                case 1: goto L9c;
                case 2: goto L7f;
                case 3: goto L5c;
                default: goto L15;
            }
        L15:
            r11 = r0
            android.app.Activity r11 = (android.app.Activity) r11
            r10 = r8
            t72 r10 = (p000.t72) r10
            r13 = r7
            android.widget.ProgressBar r13 = (android.widget.ProgressBar) r13
            r12 = r6
            android.widget.TextView r12 = (android.widget.TextView) r12
            r14 = r5
            android.widget.Button r14 = (android.widget.Button) r14
            r15 = r4
            android.widget.Button r15 = (android.widget.Button) r15
            r13.getClass()
            r12.getClass()
            r14.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.u72.f10634
            boolean r0 = r0.compareAndSet(r3, r2)
            if (r0 != 0) goto L39
            goto L5b
        L39:
            r13.setVisibility(r3)
            r12.setVisibility(r3)
            java.lang.String r0 = "准备下载..."
            r12.setText(r0)
            r14.setEnabled(r3)
            r15.setEnabled(r3)
            java.lang.Thread r0 = new java.lang.Thread
            rt1 r9 = new rt1
            r16 = 1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r1 = "DY-VersionUpdateDownload"
            r0.<init>(r9, r1)
            r0.start()
        L5b:
            return
        L5c:
            android.app.Activity r0 = (android.app.Activity) r0
            r10 = r8
            java.util.List r10 = (java.util.List) r10
            r11 = r7
            zc0 r11 = (p000.zc0) r11
            r12 = r5
            java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12
            r13 = r6
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = r4
            android.widget.TextView r14 = (android.widget.TextView) r14
            bv1 r1 = p000.bv1.f1853
            vb0 r9 = new vb0
            r15 = 3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            java.lang.String r1 = "确认清空筛选"
            java.lang.String r2 = "将该页全部恢复为显示状态，不会触发 DexKit 扫描，仅清除当前过滤配置。"
            java.lang.String r3 = "清空"
            p000.bv1.m1043(r0, r1, r2, r3, r9)
            return
        L7f:
            um1 r0 = (p000.um1) r0
            java.lang.String r8 = (java.lang.String) r8
            android.widget.RadioGroup r7 = (android.widget.RadioGroup) r7
            android.widget.RadioButton r5 = (android.widget.RadioButton) r5
            android.app.Activity r6 = (android.app.Activity) r6
            xx r4 = (p000.C1000xx) r4
            r0.f10912 = r8
            int r0 = r5.getId()
            r7.check(r0)
            int r0 = r5.getId()
            p000.pf1.m4524(r7, r6, r4, r0)
            return
        L9c:
            um1 r0 = (p000.um1) r0
            ud1 r8 = (p000.ud1) r8
            android.widget.RadioGroup r7 = (android.widget.RadioGroup) r7
            android.widget.RadioButton r5 = (android.widget.RadioButton) r5
            android.app.Activity r6 = (android.app.Activity) r6
            xx r4 = (p000.C1000xx) r4
            vd1 r1 = r8.f10704
            r0.f10912 = r1
            int r0 = r5.getId()
            r7.check(r0)
            int r0 = r5.getId()
            p000.xd1.m6628(r7, r6, r4, r0)
            td r0 = r1.f11246
            java.lang.Integer r1 = r1.f11247
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "种子选项已选择 mode="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " seedId="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r1 = 0
            r2 = 4
            java.lang.String r3 = "r50ae750e12c684f0"
            p000.C0888ux.m5988(r3, r0, r1, r2, r1)
            return
        Ldc:
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r1 = r0.size()
            int r9 = r8.size()
            if (r1 == r9) goto Lf3
            goto Lf4
        Lf3:
            r2 = r3
        Lf4:
            r0.clear()
            if (r2 == 0) goto L100
            xm0 r1 = p000.AbstractC1021yh.m6857(r8)
            p000.AbstractC0984xh.m6660(r0, r1)
        L100:
            java.util.Iterator r0 = r7.iterator()
        L104:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L11a
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            if (r2 == 0) goto L114
            r7 = r3
            goto L116
        L114:
            r7 = 8
        L116:
            r1.setVisibility(r7)
            goto L104
        L11a:
            java.util.Iterator r0 = r5.iterator()
        L11e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L136
            java.lang.Object r1 = r0.next()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r2 == 0) goto L130
            r3 = 1060320051(0x3f333333, float:0.7)
            goto L132
        L130:
            r3 = 1065353216(0x3f800000, float:1.0)
        L132:
            r1.setAlpha(r3)
            goto L11e
        L136:
            if (r2 == 0) goto L13b
            java.lang.String r0 = "取消"
            goto L13d
        L13b:
            java.lang.String r0 = "全选"
        L13d:
            r6.setText(r0)
            int r0 = r8.size()
            if (r2 == 0) goto L155
            int r1 = r8.size()
            java.lang.String r2 = " / "
            java.lang.String r3 = " 张"
            java.lang.String r5 = "已选 "
            java.lang.String r0 = p000.AbstractC0602nx.m4128(r5, r0, r2, r1, r3)
            goto L15d
        L155:
            java.lang.String r1 = "选择图片（共 "
            java.lang.String r2 = " 张）"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r1, r0, r2)
        L15d:
            r4.setText(r0)
            return
    }
}
