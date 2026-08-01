package p000;

/* JADX INFO: renamed from: gc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0317gc implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4308;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f4309;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f4310;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f4311;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f4312;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f4313;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.Object f4314;

    public /* synthetic */ C0317gc(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, int r7) {
            r0 = this;
            r0.f4308 = r7
            r0.f4309 = r1
            r0.f4310 = r2
            r0.f4311 = r3
            r0.f4312 = r4
            r0.f4313 = r5
            r0.f4314 = r6
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.f4308
            r2 = 0
            r3 = 1
            s62 r4 = p000.s62.f9751
            java.lang.Object r5 = r0.f4314
            java.lang.Object r6 = r0.f4313
            java.lang.Object r7 = r0.f4312
            java.lang.Object r8 = r0.f4311
            java.lang.Object r9 = r0.f4310
            java.lang.Object r0 = r0.f4309
            switch(r1) {
                case 0: goto L159;
                case 1: goto L9c;
                case 2: goto L3c;
                default: goto L17;
            }
        L17:
            ab2 r0 = (p000.ab2) r0
            ya2 r9 = (p000.ya2) r9
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            p70 r5 = (p000.p70) r5
            r1 = r19
            cb2 r1 = (p000.cb2) r1
            ib2 r2 = p000.ib2.f4981
            if (r1 == 0) goto L35
            kf0 r2 = r9.f12544
            r0.m55(r1, r2)
            ya2 r0 = p000.ya2.f12542
            if (r9 != r0) goto L35
            p000.ib2.m2733(r1)
        L35:
            p000.ib2.m2727(r7, r8, r6)
            r5.invoke()
            return r4
        L3c:
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r9 = (java.lang.String) r9
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.app.Activity r7 = (android.app.Activity) r7
            um1 r6 = (p000.um1) r6
            java.lang.String r5 = (java.lang.String) r5
            r1 = r19
            fo1 r1 = (p000.fo1) r1
            r0.setEnabled(r3)
            r0.setText(r9)
            java.lang.Object r0 = r1.f4054
            boolean r1 = r0 instanceof p000.eo1
            if (r1 != 0) goto L88
            r1 = r0
            ef1 r1 = (p000.ef1) r1
            java.lang.String r5 = p000.jz1.m3103(r6, r5)
            java.lang.String r6 = "投喂食物："
            java.lang.String r5 = r6.concat(r5)
            r8.setText(r5)
            java.util.List r1 = r1.f3533
            int r1 = r1.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "已更新 "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = " 种食物"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            android.widget.Toast r1 = android.widget.Toast.makeText(r7, r1, r2)
            r1.show()
        L88:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L9b
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L96
            java.lang.String r0 = ""
        L96:
            java.lang.String r1 = "更新失败: "
            p000.a12.m21(r3, r7, r1, r0)
        L9b:
            return r4
        L9c:
            n r0 = (p000.C0568n) r0
            android.app.Activity r9 = (android.app.Activity) r9
            android.app.AlertDialog r8 = (android.app.AlertDialog) r8
            android.widget.TextView r7 = (android.widget.TextView) r7
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5
            r1 = r19
            jh0 r1 = (p000.jh0) r1
            r1.getClass()
            java.lang.Object r0 = r0.f7336
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            boolean r0 = r0.get()
            if (r0 != 0) goto L158
            boolean r0 = r9.isFinishing()
            if (r0 != 0) goto L158
            boolean r0 = r9.isDestroyed()
            if (r0 != 0) goto L158
            boolean r0 = r8.isShowing()
            if (r0 == 0) goto L158
            q71 r0 = p000.q71.f8896
            java.lang.String r0 = r1.f5473
            int r8 = r1.f5471
            kh0 r9 = r1.f5466
            int r10 = r1.f5472
            boolean r11 = p000.q02.m4671(r0)
            if (r11 == 0) goto Lf3
            int r0 = r9.ordinal()
            if (r0 == 0) goto Lf1
            if (r0 == r3) goto Lee
            r11 = 2
            if (r0 != r11) goto Le9
            java.lang.String r0 = "正在写入导出文件"
            goto Lf3
        Le9:
            p000.C1080.m7272()
            r4 = 0
            goto L158
        Lee:
            java.lang.String r0 = "正在整理月份时间线"
            goto Lf3
        Lf1:
            java.lang.String r0 = "正在读取完整聊天记录"
        Lf3:
            r7.setText(r0)
            java.lang.Long r0 = r1.f5468
            java.lang.Long r7 = r1.f5469
            java.lang.String r0 = p000.q71.m4800(r0, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r11 = "消息："
            r7.<init>(r11)
            int r11 = r1.f5467
            r7.append(r11)
            java.lang.String r11 = " 条\n时间范围："
            r7.append(r11)
            r7.append(r0)
            kh0 r0 = p000.kh0.f5926
            if (r9 != r0) goto L13a
            if (r10 <= 0) goto L13a
            java.lang.String r11 = "\n月份进度："
            r7.append(r11)
            r7.append(r8)
            r11 = 47
            r7.append(r11)
            r7.append(r10)
            java.lang.String r1 = r1.f5470
            if (r1 == 0) goto L13a
            java.lang.String r11 = "（"
            r7.append(r11)
            r7.append(r1)
            r1 = 65289(0xff09, float:9.149E-41)
            r7.append(r1)
        L13a:
            java.lang.String r1 = r7.toString()
            r6.setText(r1)
            if (r9 != r0) goto L146
            if (r10 <= 0) goto L146
            goto L147
        L146:
            r3 = r2
        L147:
            r0 = r3 ^ 1
            r5.setIndeterminate(r0)
            if (r3 == 0) goto L158
            r5.setMax(r10)
            int r0 = p000.j81.m2906(r8, r2, r10)
            r5.setProgress(r0)
        L158:
            return r4
        L159:
            ch1[] r0 = (p000.ch1[]) r0
            java.util.List r9 = (java.util.List) r9
            rx0 r8 = (p000.rx0) r8
            sm1 r7 = (p000.sm1) r7
            sm1 r6 = (p000.sm1) r6
            hc r5 = (p000.C0354hc) r5
            r10 = r19
            bh1 r10 = (p000.bh1) r10
            int r1 = r0.length
            r3 = r2
        L16b:
            if (r2 >= r1) goto L18f
            r11 = r0[r2]
            int r17 = r3 + 1
            r11.getClass()
            java.lang.Object r3 = r9.get(r3)
            r12 = r3
            kx0 r12 = (p000.kx0) r12
            np0 r13 = r8.getLayoutDirection()
            int r14 = r7.f9967
            int r15 = r6.f9967
            aa r3 = r5.f4682
            r16 = r3
            p000.AbstractC0243ec.m1894(r10, r11, r12, r13, r14, r15, r16)
            int r2 = r2 + 1
            r3 = r17
            goto L16b
        L18f:
            return r4
    }
}
