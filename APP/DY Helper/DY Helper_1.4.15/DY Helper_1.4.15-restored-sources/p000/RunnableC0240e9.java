package p000;

/* JADX INFO: renamed from: e9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0240e9 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3443;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f3444;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f3445;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f3446;

    public /* synthetic */ RunnableC0240e9(java.lang.ClassLoader r2, android.app.Activity r3, p000.C0277f9 r4) {
            r1 = this;
            r0 = 29
            r1.f3443 = r0
            r1.<init>()
            r1.f3444 = r2
            r1.f3446 = r3
            r1.f3445 = r4
            return
    }

    public /* synthetic */ RunnableC0240e9(java.lang.Object r1, android.content.Context r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f3443 = r4
            r0.f3444 = r1
            r0.f3446 = r2
            r0.f3445 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0240e9(java.lang.Object r1, java.io.Serializable r2, android.app.Activity r3, int r4) {
            r0 = this;
            r0.f3443 = r4
            r0.f3444 = r1
            r0.f3445 = r2
            r0.f3446 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0240e9(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f3443 = r4
            r0.f3446 = r1
            r0.f3444 = r2
            r0.f3445 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0240e9(java.lang.Object r1, java.lang.Object r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.f3443 = r4
            r0.f3446 = r1
            r0.f3445 = r2
            r0.f3444 = r3
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m1889() {
            r14 = this;
            java.lang.Object r0 = r14.f3444
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.lang.Object r1 = r14.f3446
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r14 = r14.f3445
            f9 r14 = (p000.C0277f9) r14
            java.lang.String r2 = "rfac809154b3e7cbf"
            java.lang.String r3 = "按设置投喂失败: "
            r4 = 0
            r0.getClass()     // Catch: java.lang.Throwable -> L1e
            kf1 r0 = p000.v71.m6036(r0)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.jf1.f5454
            r3.set(r4)
            goto L4b
        L1e:
            r0 = move-exception
            java.lang.String r5 = "按设置投喂异常"
            p000.C0888ux.m5977(r2, r5, r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = r0.getMessage()     // Catch: java.lang.Throwable -> L33
            if (r5 != 0) goto L36
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L33
            goto L36
        L33:
            r0 = move-exception
            r14 = r0
            goto L6c
        L36:
            java.lang.String r13 = r3.concat(r5)     // Catch: java.lang.Throwable -> L33
            kf1 r6 = new kf1     // Catch: java.lang.Throwable -> L33
            r10 = 0
            r11 = 0
            r12 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jf1.f5454
            r0.set(r4)
            r0 = r6
        L4b:
            ii0 r3 = new ii0     // Catch: java.lang.Throwable -> L58
            r4 = 13
            r3.<init>(r14, r4, r0)     // Catch: java.lang.Throwable -> L58
            r1.runOnUiThread(r3)     // Catch: java.lang.Throwable -> L58
            s62 r14 = p000.s62.f9751     // Catch: java.lang.Throwable -> L58
            goto L60
        L58:
            r0 = move-exception
            r14 = r0
            eo1 r0 = new eo1
            r0.<init>(r14)
            r14 = r0
        L60:
            java.lang.Throwable r14 = p000.fo1.m2190(r14)
            if (r14 == 0) goto L6b
            java.lang.String r0 = "按设置投喂结果回调失败"
            p000.C0888ux.m5977(r2, r0, r14)
        L6b:
            return
        L6c:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jf1.f5454
            r0.set(r4)
            throw r14
    }

    @Override // java.lang.Runnable
    public final void run() {
            r15 = this;
            int r0 = r15.f3443
            r1 = 6
            r2 = 4
            r3 = 1
            r4 = 0
            r5 = 0
            switch(r0) {
                case 0: goto L948;
                case 1: goto L8ee;
                case 2: goto L8de;
                case 3: goto L717;
                case 4: goto L6f9;
                case 5: goto L66c;
                case 6: goto L61e;
                case 7: goto L60e;
                case 8: goto L5fe;
                case 9: goto L5e2;
                case 10: goto L5a5;
                case 11: goto L595;
                case 12: goto L51b;
                case 13: goto L492;
                case 14: goto L466;
                case 15: goto L3fb;
                case 16: goto L3e8;
                case 17: goto L3d1;
                case 18: goto L370;
                case 19: goto L34e;
                case 20: goto L308;
                case 21: goto L25b;
                case 22: goto L241;
                case 23: goto L21d;
                case 24: goto L1b1;
                case 25: goto L14c;
                case 26: goto Leb;
                case 27: goto Le7;
                case 28: goto L7b;
                default: goto La;
            }
        La:
            java.lang.Object r0 = r15.f3444
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            yf1 r1 = p000.yf1.f12603
            java.lang.Object r2 = r15.f3446
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r15 = r15.f3445
            f9 r15 = (p000.C0277f9) r15
            java.lang.String r4 = "r86c859e3375e752"
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.ag1.f220
            java.lang.String r7 = "火星任务调试失败: "
            java.lang.String r8 = "火星任务调试异常 mode="
            r0.getClass()     // Catch: java.lang.Throwable -> L2b
            zf1 r0 = p000.ag1.m111(r0)     // Catch: java.lang.Throwable -> L2b
        L27:
            r6.set(r5)
            goto L56
        L2b:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L4a
            r9.append(r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Throwable -> L4a
            p000.C0888ux.m5977(r4, r1, r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L4d
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L4a
            goto L4d
        L4a:
            r0 = move-exception
            r15 = r0
            goto L77
        L4d:
            java.lang.String r0 = r7.concat(r1)     // Catch: java.lang.Throwable -> L4a
            zf1 r0 = p000.ag1.m110(r0, r3)     // Catch: java.lang.Throwable -> L4a
            goto L27
        L56:
            ii0 r1 = new ii0     // Catch: java.lang.Throwable -> L63
            r3 = 15
            r1.<init>(r15, r3, r0)     // Catch: java.lang.Throwable -> L63
            r2.runOnUiThread(r1)     // Catch: java.lang.Throwable -> L63
            s62 r15 = p000.s62.f9751     // Catch: java.lang.Throwable -> L63
            goto L6b
        L63:
            r0 = move-exception
            r15 = r0
            eo1 r0 = new eo1
            r0.<init>(r15)
            r15 = r0
        L6b:
            java.lang.Throwable r15 = p000.fo1.m2190(r15)
            if (r15 == 0) goto L76
            java.lang.String r0 = "火星任务调试结果回调失败"
            p000.C0888ux.m5977(r4, r0, r15)
        L76:
            return
        L77:
            r6.set(r5)
            throw r15
        L7b:
            java.lang.Object r0 = r15.f3444
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r15.f3446
            r9 = r0
            android.app.Activity r9 = (android.app.Activity) r9
            java.lang.Object r15 = r15.f3445
            r7 = r15
            android.widget.RadioButton r7 = (android.widget.RadioButton) r7
            java.lang.Object r15 = p000.pf1.f8541
            r15 = 80
            int r15 = p000.jx0.m3056(r9, r15)     // Catch: java.lang.Throwable -> L97
            android.graphics.Bitmap r15 = p000.pf1.m4517(r8, r15)     // Catch: java.lang.Throwable -> L97
            goto L9f
        L97:
            r0 = move-exception
            r15 = r0
            eo1 r0 = new eo1
            r0.<init>(r15)
            r15 = r0
        L9f:
            java.lang.Throwable r0 = p000.fo1.m2190(r15)
            if (r0 == 0) goto Lac
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "食物图标加载失败"
            p000.C0888ux.m5977(r1, r2, r0)
        Lac:
            boolean r0 = r15 instanceof p000.eo1
            if (r0 == 0) goto Lb1
            goto Lb2
        Lb1:
            r4 = r15
        Lb2:
            r6 = r4
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto Lb8
            goto Le3
        Lb8:
            wd1 r15 = p000.pf1.f8545
            monitor-enter(r15)
            java.lang.Object r0 = r15.put(r8, r6)     // Catch: java.lang.Throwable -> Le4
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> Le4
            monitor-exit(r15)
            vg0 r5 = new vg0     // Catch: java.lang.Throwable -> Lce
            r10 = 4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lce
            r9.runOnUiThread(r5)     // Catch: java.lang.Throwable -> Lce
            s62 r15 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lce
            goto Ld6
        Lce:
            r0 = move-exception
            r15 = r0
            eo1 r0 = new eo1
            r0.<init>(r15)
            r15 = r0
        Ld6:
            java.lang.Throwable r15 = p000.fo1.m2190(r15)
            if (r15 == 0) goto Le3
            java.lang.String r0 = "DYHelper"
            java.lang.String r1 = "食物图标回调失败"
            p000.C0888ux.m5977(r0, r1, r15)
        Le3:
            return
        Le4:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        Le7:
            r15.m1889()
            return
        Leb:
            java.lang.Object r0 = r15.f3444
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.lang.Object r1 = r15.f3446
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r15 = r15.f3445
            f9 r15 = (p000.C0277f9) r15
            java.lang.String r2 = "ra38c9f1519a93e5b"
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.if1.f5067
            java.lang.String r6 = "食物列表调试失败: "
            r0.getClass()     // Catch: java.lang.Throwable -> L108
            hf1 r0 = p000.if1.m2758(r0)     // Catch: java.lang.Throwable -> L108
            r4.set(r5)
            goto L127
        L108:
            r0 = move-exception
            java.lang.String r7 = "食物列表调试异常"
            p000.C0888ux.m5977(r2, r7, r0)     // Catch: java.lang.Throwable -> L119
            hf1 r7 = new hf1     // Catch: java.lang.Throwable -> L119
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L119
            if (r0 != 0) goto L11c
            java.lang.String r0 = ""
            goto L11c
        L119:
            r0 = move-exception
            r15 = r0
            goto L148
        L11c:
            java.lang.String r0 = r6.concat(r0)     // Catch: java.lang.Throwable -> L119
            r7.<init>(r5, r5, r3, r0)     // Catch: java.lang.Throwable -> L119
            r4.set(r5)
            r0 = r7
        L127:
            ii0 r3 = new ii0     // Catch: java.lang.Throwable -> L134
            r4 = 12
            r3.<init>(r15, r4, r0)     // Catch: java.lang.Throwable -> L134
            r1.runOnUiThread(r3)     // Catch: java.lang.Throwable -> L134
            s62 r15 = p000.s62.f9751     // Catch: java.lang.Throwable -> L134
            goto L13c
        L134:
            r0 = move-exception
            r15 = r0
            eo1 r0 = new eo1
            r0.<init>(r15)
            r15 = r0
        L13c:
            java.lang.Throwable r15 = p000.fo1.m2190(r15)
            if (r15 == 0) goto L147
            java.lang.String r0 = "食物列表调试结果回调失败"
            p000.C0888ux.m5977(r2, r0, r15)
        L147:
            return
        L148:
            r4.set(r5)
            throw r15
        L14c:
            java.lang.Object r0 = r15.f3444
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.lang.Object r1 = r15.f3446
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r15 = r15.f3445
            g71 r15 = (p000.g71) r15
            java.lang.String r2 = "rb4e434d444870f0e"
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.ue1.f10717
            java.lang.String r4 = "亲密度调试失败: "
            r0.getClass()     // Catch: java.lang.Throwable -> L169
            te1 r0 = p000.ue1.m5853(r0)     // Catch: java.lang.Throwable -> L169
            r3.set(r5)
            goto L18c
        L169:
            r0 = move-exception
            java.lang.String r6 = "亲密度调试异常"
            p000.C0888ux.m5977(r2, r6, r0)     // Catch: java.lang.Throwable -> L17a
            te1 r7 = new te1     // Catch: java.lang.Throwable -> L17a
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L17a
            if (r0 != 0) goto L17d
            java.lang.String r0 = ""
            goto L17d
        L17a:
            r0 = move-exception
            r15 = r0
            goto L1ad
        L17d:
            java.lang.String r12 = r4.concat(r0)     // Catch: java.lang.Throwable -> L17a
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L17a
            r3.set(r5)
            r0 = r7
        L18c:
            ii0 r3 = new ii0     // Catch: java.lang.Throwable -> L199
            r4 = 11
            r3.<init>(r15, r4, r0)     // Catch: java.lang.Throwable -> L199
            r1.runOnUiThread(r3)     // Catch: java.lang.Throwable -> L199
            s62 r15 = p000.s62.f9751     // Catch: java.lang.Throwable -> L199
            goto L1a1
        L199:
            r0 = move-exception
            r15 = r0
            eo1 r0 = new eo1
            r0.<init>(r15)
            r15 = r0
        L1a1:
            java.lang.Throwable r15 = p000.fo1.m2190(r15)
            if (r15 == 0) goto L1ac
            java.lang.String r0 = "亲密度调试结果回调失败"
            p000.C0888ux.m5977(r2, r0, r15)
        L1ac:
            return
        L1ad:
            r3.set(r5)
            throw r15
        L1b1:
            java.lang.Object r0 = r15.f3444
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.lang.Object r1 = r15.f3446
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r15 = r15.f3445
            f9 r15 = (p000.C0277f9) r15
            java.lang.String r2 = "rb4e434d444870f0e"
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.se1.f9875
            java.lang.String r6 = "亲密度领取失败: "
            r0.getClass()     // Catch: java.lang.Throwable -> L1ce
            qe1 r0 = p000.se1.m5487(r0, r5, r4, r4)     // Catch: java.lang.Throwable -> L1ce
            r3.set(r5)
            goto L1f8
        L1ce:
            r0 = move-exception
            java.lang.String r4 = "手动亲密度领取异常"
            p000.C0888ux.m5977(r2, r4, r0)     // Catch: java.lang.Throwable -> L1e3
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L1e3
            if (r4 != 0) goto L1e6
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L1e3
            java.lang.String r4 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L1e3
            goto L1e6
        L1e3:
            r0 = move-exception
            r15 = r0
            goto L219
        L1e6:
            java.lang.String r13 = r6.concat(r4)     // Catch: java.lang.Throwable -> L1e3
            qe1 r7 = new qe1     // Catch: java.lang.Throwable -> L1e3
            r10 = 0
            r11 = 0
            r12 = 1
            r8 = 0
            r9 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L1e3
            r3.set(r5)
            r0 = r7
        L1f8:
            ii0 r3 = new ii0     // Catch: java.lang.Throwable -> L205
            r4 = 10
            r3.<init>(r15, r4, r0)     // Catch: java.lang.Throwable -> L205
            r1.runOnUiThread(r3)     // Catch: java.lang.Throwable -> L205
            s62 r15 = p000.s62.f9751     // Catch: java.lang.Throwable -> L205
            goto L20d
        L205:
            r0 = move-exception
            r15 = r0
            eo1 r0 = new eo1
            r0.<init>(r15)
            r15 = r0
        L20d:
            java.lang.Throwable r15 = p000.fo1.m2190(r15)
            if (r15 == 0) goto L218
            java.lang.String r0 = "亲密度领取结果回调失败"
            p000.C0888ux.m5977(r2, r0, r15)
        L218:
            return
        L219:
            r3.set(r5)
            throw r15
        L21d:
            java.lang.Object r0 = r15.f3446
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r5 = r15.f3444
            a80 r5 = (p000.a80) r5
            java.lang.Object r15 = r15.f3445
            a80 r15 = (p000.a80) r15
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.jc1.f5424
            java.lang.ClassLoader r6 = p000.dd1.m1717(r0)
            hu r7 = new hu
            r7.<init>(r0, r5, r3)
            dc1 r2 = p000.jc1.m2943(r6, r3, r4, r7, r2)
            ii0 r3 = new ii0
            r3.<init>(r15, r1, r2)
            r0.runOnUiThread(r3)
            return
        L241:
            java.lang.Object r0 = r15.f3446
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r15.f3444
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r15 = r15.f3445
            t9 r15 = (p000.C0827t9) r15
            java.lang.String r15 = r15.f10251
            r0.getClass()
            e9 r2 = new e9
            r2.<init>(r0, r1, r15, r5)
            r0.runOnUiThread(r2)
            return
        L25b:
            java.lang.Object r0 = r15.f3446
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r0 = r15.f3444
            l71 r0 = (p000.l71) r0
            java.lang.Object r15 = r15.f3445
            f8 r15 = (p000.C0276f8) r15
            java.lang.String r1 = "4K"
            java.lang.String r2 = r0.f6464
            if (r2 != 0) goto L270
            r6 = r1
            goto L271
        L270:
            r6 = r2
        L271:
            java.lang.String r8 = "已找到原画质："
            p000.a12.m21(r5, r7, r8, r6)
            qy0 r5 = p000.qy0.f9157
            java.lang.String r0 = r0.f6463
            if (r2 != 0) goto L27e
            r10 = r1
            goto L27f
        L27e:
            r10 = r2
        L27f:
            zx0 r11 = new zx0
            r11.<init>(r7, r15, r3)
            r7.getClass()
            r15.getClass()
            java.lang.String r8 = p000.qy0.m5001(r0)
            java.lang.String r0 = "http"
            boolean r0 = p000.x02.m6485(r8, r0, r3)
            if (r0 != 0) goto L29f
            java.lang.String r15 = "原画质链接无效，改用普通下载"
            p000.qy0.m4991(r7, r15)
            r11.invoke(r4)
            goto L307
        L29f:
            iu r0 = p000.AbstractC1021yh.m6915(r7)
            java.lang.String r2 = r0.f5186
            if (r2 == 0) goto L2bb
            boolean r2 = p000.q02.m4671(r2)
            if (r2 == 0) goto L2ae
            goto L2bb
        L2ae:
            boolean r0 = r0.m2799()
            if (r0 != 0) goto L2bb
            java.lang.String r0 = "DYHelper"
            java.lang.String r2 = "[DOWNLOAD-STORAGE] 当前空间无可用 SAF 授权，改用 MediaStore"
            p000.C0888ux.m5975(r0, r2)
        L2bb:
            java.lang.String r0 = "mp4"
            java.lang.String r0 = p000.qy0.m4966(r7, r15, r0)
            java.lang.String r0 = p000.q02.m4692(r0)
            jy0 r2 = p000.jy0.f5660
            fv r9 = p000.qy0.m5014(r5, r7, r15, r2, r0)
            java.lang.String r15 = r9.f4140
            java.lang.String r0 = "8K"
            boolean r2 = p000.q02.m4654(r10, r0, r3)
            if (r2 == 0) goto L2d7
            r1 = r0
            goto L2e0
        L2d7:
            boolean r0 = p000.q02.m4654(r10, r1, r3)
            if (r0 == 0) goto L2de
            goto L2e0
        L2de:
            java.lang.String r1 = "original"
        L2e0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            java.lang.String r15 = "_"
            r0.append(r15)
            r0.append(r1)
            java.lang.String r15 = r0.toString()
            java.lang.String r15 = p000.AbstractC0488ku.m3417(r15)
            java.lang.String r0 = ".mp4"
            java.lang.String r15 = p000.AbstractC0602nx.m4129(r15, r0)
            m90 r6 = new m90
            r12 = 3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            p000.qy0.m4982(r7, r15, r6)
        L307:
            return
        L308:
            java.lang.Object r0 = r15.f3446
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r15.f3444
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r15 = r15.f3445
            f8 r15 = (p000.C0276f8) r15
            q71 r3 = p000.q71.f8896
            l71 r0 = p000.q71.m4799(r0)     // Catch: java.lang.Throwable -> L31c
            goto L323
        L31c:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L323:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L328
            goto L329
        L328:
            r4 = r0
        L329:
            l71 r4 = (p000.l71) r4
            if (r4 != 0) goto L343
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L33a
            java.lang.String r3 = "DYHelper"
            java.lang.String r4 = "原画质解析失败，改用普通下载"
            p000.C0888ux.m5977(r3, r4, r0)
        L33a:
            zk0 r0 = new zk0
            r0.<init>(r1, r15, r2)
            r1.runOnUiThread(r0)
            goto L34d
        L343:
            e9 r0 = new e9
            r2 = 21
            r0.<init>(r1, r4, r15, r2)
            r1.runOnUiThread(r0)
        L34d:
            return
        L34e:
            java.lang.Object r0 = r15.f3446
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r15.f3444
            sm1 r1 = (p000.sm1) r1
            java.lang.Object r15 = r15.f3445
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            qy0 r2 = p000.qy0.f9157
            int r1 = r1.f9967
            int r15 = r15.size()
            java.lang.String r2 = "已保存 "
            java.lang.String r3 = "/"
            java.lang.String r4 = " 张图片"
            java.lang.String r15 = p000.AbstractC0602nx.m4128(r2, r1, r3, r15, r4)
            p000.qy0.m4991(r0, r15)
            return
        L370:
            java.lang.Object r0 = r15.f3446
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r15.f3444
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r15 = r15.f3445
            a80 r15 = (p000.a80) r15
            android.widget.EditText r2 = new android.widget.EditText
            r2.<init>(r0)
            r2.setText(r1)
            r2.setSingleLine(r3)
            r2.setFocusable(r3)
            r2.setFocusableInTouchMode(r3)
            r2.setSelectAllOnFocus(r5)
            android.text.Editable r3 = r2.getText()
            int r3 = r3.length()
            r2.setSelection(r3)
            r3 = 524289(0x80001, float:7.34685E-40)
            r2.setInputType(r3)
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r0)
            java.lang.String r0 = "确认文件名"
            android.app.AlertDialog$Builder r0 = r3.setTitle(r0)
            android.app.AlertDialog$Builder r0 = r0.setView(r2)
            java.lang.String r3 = "保存"
            ey0 r6 = new ey0
            r6.<init>(r15, r2, r1, r5)
            android.app.AlertDialog$Builder r15 = r0.setPositiveButton(r3, r6)
            java.lang.String r0 = "取消"
            android.app.AlertDialog$Builder r15 = r15.setNegativeButton(r0, r4)
            android.app.AlertDialog r15 = r15.create()
            fy0 r0 = new fy0
            r0.<init>(r15, r2, r5)
            r15.setOnShowListener(r0)
            r15.show()
            return
        L3d1:
            java.lang.Object r0 = r15.f3446
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r15.f3445
            zx0 r1 = (p000.zx0) r1
            java.lang.Object r15 = r15.f3444
            java.lang.String r15 = (java.lang.String) r15
            qy0 r2 = p000.qy0.f9157
            java.lang.String r2 = "原画质下载失败，改用普通视频下载"
            p000.qy0.m4991(r0, r2)
            r1.invoke(r15)
            return
        L3e8:
            java.lang.Object r0 = r15.f3446
            m3 r0 = (p000.C0535m3) r0
            java.lang.Object r1 = r15.f3444
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.Object r15 = r15.f3445
            android.app.AlertDialog r15 = (android.app.AlertDialog) r15
            r0.invoke(r1)
            r15.dismiss()
            return
        L3fb:
            java.lang.Object r0 = r15.f3446
            dc0 r0 = (p000.dc0) r0
            java.lang.Object r1 = r15.f3445
            pt r1 = (p000.C0699pt) r1
            java.lang.Object r15 = r15.f3444
            java.lang.String r15 = (java.lang.String) r15
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f3066
            java.util.LinkedHashMap r4 = r0.f3067
            boolean r2 = r2.get()
            if (r2 == 0) goto L412
            goto L465
        L412:
            java.util.List r2 = r0.f3069
            if (r2 == 0) goto L41d
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L41d
            goto L465
        L41d:
            java.util.Iterator r2 = r2.iterator()
        L421:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L465
            java.lang.Object r6 = r2.next()
            ic0 r6 = (p000.ic0) r6
            long r6 = r6.f4994
            long r8 = r1.f8693
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L421
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r4.put(r1, r15)
            ub0 r15 = r0.f3068
            java.util.List r1 = r0.f3069
            boolean r2 = r0.f3071
            if (r2 != 0) goto L44a
            boolean r0 = r0.f3072
            if (r0 == 0) goto L449
            goto L44a
        L449:
            r3 = r5
        L44a:
            r15.getClass()
            r1.getClass()
            java.util.ArrayList r0 = r15.f10677
            r0.clear()
            r0.addAll(r1)
            java.util.LinkedHashMap r0 = r15.f10678
            r0.clear()
            r0.putAll(r4)
            r15.f10680 = r3
            r15.notifyDataSetChanged()
        L465:
            return
        L466:
            java.lang.Object r0 = r15.f3444
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r15.f3446
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r15 = r15.f3445
            p70 r15 = (p000.p70) r15
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.u90.f10656
            java.util.concurrent.ConcurrentHashMap r3 = p000.u90.f10655     // Catch: java.lang.Throwable -> L48a
            p90 r4 = new p90     // Catch: java.lang.Throwable -> L48a
            java.lang.String r0 = p000.u90.m5835(r0, r1)     // Catch: java.lang.Throwable -> L48a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L48a
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L48a
            r2.remove(r1)
            r15.invoke()
            return
        L48a:
            r0 = move-exception
            r2.remove(r1)
            r15.invoke()
            throw r0
        L492:
            java.lang.Object r0 = r15.f3444
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r15.f3445
            o10 r0 = (p000.o10) r0
            java.lang.Object r15 = r15.f3446
            android.app.Activity r15 = (android.app.Activity) r15
            java.lang.String r3 = "当前作品的"
            java.lang.String r6 = "FeedGestureHook"
            java.lang.String r7 = r0.f7865
            boolean r8 = r15.isFinishing()
            boolean r9 = r15.isDestroyed()
            java.lang.String r10 = "Feed 原生互动动作开始执行 action="
            java.lang.String r11 = " hostAction="
            java.lang.String r12 = " finishing="
            java.lang.StringBuilder r10 = p000.lz1.m3695(r10, r1, r11, r7, r12)
            r10.append(r8)
            java.lang.String r8 = " destroyed="
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
            p000.C0888ux.m5988(r6, r8, r4, r2, r4)
            boolean r8 = r15.isFinishing()
            if (r8 != 0) goto L511
            boolean r8 = r15.isDestroyed()
            if (r8 == 0) goto L4d6
            goto L511
        L4d6:
            q10 r8 = p000.q10.f8786     // Catch: java.lang.Throwable -> L4f7
            boolean r0 = p000.q10.m4704(r15, r0)     // Catch: java.lang.Throwable -> L4f7
            if (r0 != 0) goto L51a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f7
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4f7
            r0.append(r7)     // Catch: java.lang.Throwable -> L4f7
            java.lang.String r3 = "功能尚未就绪"
            r0.append(r3)     // Catch: java.lang.Throwable -> L4f7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4f7
            android.widget.Toast r0 = android.widget.Toast.makeText(r15, r0, r5)     // Catch: java.lang.Throwable -> L4f7
            r0.show()     // Catch: java.lang.Throwable -> L4f7
            goto L51a
        L4f7:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "Feed 原生互动动作异常 action="
            java.lang.String r7 = " error="
            java.lang.String r0 = p000.a12.m18(r3, r1, r7, r0)
            p000.C0888ux.m5988(r6, r0, r4, r2, r4)
            java.lang.String r0 = "作品互动操作异常"
            android.widget.Toast r15 = android.widget.Toast.makeText(r15, r0, r5)
            r15.show()
            goto L51a
        L511:
            java.lang.String r15 = "Feed 原生互动动作跳过: Activity 已结束 action="
            java.lang.String r15 = r15.concat(r1)
            p000.C0888ux.m5988(r6, r15, r4, r2, r4)
        L51a:
            return
        L51b:
            java.lang.Object r0 = r15.f3444
            v10 r0 = (p000.v10) r0
            java.lang.Object r1 = r15.f3445
            um1 r1 = (p000.um1) r1
            java.lang.Object r15 = r15.f3446
            android.app.Activity r15 = (android.app.Activity) r15
            java.lang.String r5 = "FeedGestureHook"
            java.lang.String r6 = "模块长按触发 area="
            java.lang.Runnable r7 = r0.f11061     // Catch: java.lang.Throwable -> L551
            java.lang.Object r1 = r1.f10912     // Catch: java.lang.Throwable -> L551
            if (r1 == 0) goto L581
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L551
            if (r7 == r1) goto L536
            goto L594
        L536:
            boolean r1 = r0.f11052     // Catch: java.lang.Throwable -> L551
            if (r1 != 0) goto L53b
            goto L594
        L53b:
            boolean r1 = r0.f11058     // Catch: java.lang.Throwable -> L551
            if (r1 == 0) goto L540
            goto L594
        L540:
            boolean r1 = r0.f11059     // Catch: java.lang.Throwable -> L551
            if (r1 == 0) goto L545
            goto L594
        L545:
            x10 r1 = p000.x10.f11972     // Catch: java.lang.Throwable -> L551
            boolean r1 = p000.x10.m6497(r15, r0, r3)     // Catch: java.lang.Throwable -> L551
            if (r1 != 0) goto L554
            p000.x10.m6491(r0)     // Catch: java.lang.Throwable -> L551
            goto L594
        L551:
            r0 = move-exception
            r15 = r0
            goto L587
        L554:
            java.lang.String r1 = r0.f11057     // Catch: java.lang.Throwable -> L551
            w90 r7 = com.example.dyhelper.p002ui.GestureAreaView.f2522     // Catch: java.lang.Throwable -> L551
            boolean r7 = p000.C0381i2.m2595(r1)     // Catch: java.lang.Throwable -> L551
            if (r7 != 0) goto L55f
            goto L594
        L55f:
            r0.f11059 = r3     // Catch: java.lang.Throwable -> L551
            java.lang.String r3 = r0.f11056     // Catch: java.lang.Throwable -> L551
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L551
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L551
            r7.append(r3)     // Catch: java.lang.Throwable -> L551
            java.lang.String r3 = " action="
            r7.append(r3)     // Catch: java.lang.Throwable -> L551
            r7.append(r1)     // Catch: java.lang.Throwable -> L551
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L551
            p000.C0888ux.m5988(r5, r3, r4, r2, r4)     // Catch: java.lang.Throwable -> L551
            p000.x10.m6500(r15, r0)     // Catch: java.lang.Throwable -> L551
            p000.x10.m6493(r15, r1)     // Catch: java.lang.Throwable -> L551
            goto L594
        L581:
            java.lang.String r15 = "runnable"
            p000.ln0.m3650(r15)     // Catch: java.lang.Throwable -> L551
            throw r4     // Catch: java.lang.Throwable -> L551
        L587:
            java.lang.String r15 = r15.getMessage()
            java.lang.String r0 = "模块长按执行失败: "
            java.lang.String r15 = p000.lz1.m3687(r0, r15)
            p000.C0888ux.m5988(r5, r15, r4, r2, r4)
        L594:
            return
        L595:
            java.lang.Object r0 = r15.f3446
            q10 r0 = (p000.q10) r0
            java.lang.Object r1 = r15.f3444
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r15 = r15.f3445
            android.view.View$OnClickListener r15 = (android.view.View.OnClickListener) r15
            p000.q10.m4696(r0, r1, r15)
            return
        L5a5:
            java.lang.Object r0 = r15.f3446
            ｍ r0 = (p000.C1143) r0
            java.lang.Object r1 = r15.f3444
            pd2 r1 = (p000.pd2) r1
            java.lang.Object r15 = r15.f3445
            java.util.concurrent.ThreadPoolExecutor r15 = (java.util.concurrent.ThreadPoolExecutor) r15
            android.content.Context r0 = r0.f13489     // Catch: java.lang.Throwable -> L5ce
            p50 r0 = p000.ln0.m3635(r0)     // Catch: java.lang.Throwable -> L5ce
            if (r0 == 0) goto L5d3
            iy r2 = r0.f8424     // Catch: java.lang.Throwable -> L5ce
            o50 r2 = (p000.o50) r2     // Catch: java.lang.Throwable -> L5ce
            java.lang.Object r3 = r2.f7955     // Catch: java.lang.Throwable -> L5ce
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L5ce
            r2.f7957 = r15     // Catch: java.lang.Throwable -> L5d0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5d0
            iy r0 = r0.f8424     // Catch: java.lang.Throwable -> L5ce
            ly r2 = new ly     // Catch: java.lang.Throwable -> L5ce
            r2.<init>(r1, r15)     // Catch: java.lang.Throwable -> L5ce
            r0.mo2828(r2)     // Catch: java.lang.Throwable -> L5ce
            goto L5e1
        L5ce:
            r0 = move-exception
            goto L5db
        L5d0:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5d0
            throw r0     // Catch: java.lang.Throwable -> L5ce
        L5d3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L5ce
            java.lang.String r2 = "EmojiCompat font provider not available on this device."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L5ce
            throw r0     // Catch: java.lang.Throwable -> L5ce
        L5db:
            r1.mo1978(r0)
            r15.shutdown()
        L5e1:
            return
        L5e2:
            java.lang.Object r0 = r15.f3446
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            java.lang.Object r1 = r15.f3444
            θ r1 = (p000.C1085) r1
            java.lang.Object r15 = r15.f3445
            f8 r15 = (p000.C0276f8) r15
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L5fd
            r1.invoke(r15)
        L5fd:
            return
        L5fe:
            java.lang.Object r0 = r15.f3446
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r15.f3444
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r1
            java.lang.Object r15 = r15.f3445
            p70 r15 = (p000.p70) r15
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog.m1417(r0, r1, r15)
            return
        L60e:
            java.lang.Object r0 = r15.f3446
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r15.f3444
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery$Summary r1 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.Summary) r1
            java.lang.Object r15 = r15.f3445
            a80 r15 = (p000.a80) r15
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.m1394(r0, r1, r15)
            return
        L61e:
            java.lang.Object r0 = r15.f3446
            dj r0 = (p000.C0214dj) r0
            java.lang.Object r1 = r15.f3444
            byte[] r1 = (byte[]) r1
            java.lang.Object r15 = r15.f3445
            ej r15 = (p000.C0250ej) r15
            java.util.concurrent.atomic.AtomicReference r2 = p000.C0287fj.f3964
            java.lang.Object r2 = r2.get()
            if (r2 == r0) goto L633
            goto L669
        L633:
            int r2 = r1.length
            if (r2 != 0) goto L637
            goto L669
        L637:
            java.lang.Object r2 = r0.f3180
            monitor-enter(r2)
            ej r4 = r0.f3184     // Catch: java.lang.Throwable -> L641
            if (r4 != 0) goto L644
            r0.f3184 = r15     // Catch: java.lang.Throwable -> L641
            goto L644
        L641:
            r0 = move-exception
            r15 = r0
            goto L66a
        L644:
            java.io.BufferedOutputStream r15 = r0.f3181     // Catch: java.lang.Throwable -> L641
            if (r15 != 0) goto L658
            java.io.BufferedOutputStream r15 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L641
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L641
            java.io.File r5 = r0.f3177     // Catch: java.lang.Throwable -> L641
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L641
            r3 = 65536(0x10000, float:9.1835E-41)
            r15.<init>(r4, r3)     // Catch: java.lang.Throwable -> L641
            r0.f3181 = r15     // Catch: java.lang.Throwable -> L641
        L658:
            r15.write(r1)     // Catch: java.lang.Throwable -> L641
            long r3 = r0.f3182     // Catch: java.lang.Throwable -> L641
            int r15 = r1.length     // Catch: java.lang.Throwable -> L641
            long r5 = (long) r15     // Catch: java.lang.Throwable -> L641
            long r3 = r3 + r5
            r0.f3182 = r3     // Catch: java.lang.Throwable -> L641
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L641
            r0.f3183 = r3     // Catch: java.lang.Throwable -> L641
            monitor-exit(r2)
        L669:
            return
        L66a:
            monitor-exit(r2)
            throw r15
        L66c:
            java.lang.Object r0 = r15.f3446
            cj r0 = (p000.C0115cj) r0
            java.lang.String r1 = r0.f2154
            java.lang.Object r2 = r15.f3444
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r15 = r15.f3445
            java.util.concurrent.atomic.AtomicBoolean r15 = (java.util.concurrent.atomic.AtomicBoolean) r15
            fj r3 = p000.C0287fj.f3949
            java.lang.String r3 = "评论语音保存失败: "
            java.lang.String r6 = "评论语音保存异常 vid="
            java.util.concurrent.ConcurrentHashMap r7 = p000.C0287fj.f3958     // Catch: java.lang.Throwable -> L6ad
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Throwable -> L6ad
            cj r7 = (p000.C0115cj) r7     // Catch: java.lang.Throwable -> L6ad
            if (r7 != 0) goto L68b
            goto L68c
        L68b:
            r0 = r7
        L68c:
            java.lang.String r7 = r0.f2155     // Catch: java.lang.Throwable -> L6ad
            boolean r8 = r0.f2156     // Catch: java.lang.Throwable -> L6ad
            if (r8 != 0) goto L6b6
            boolean r7 = p000.C0287fj.m2137(r7)     // Catch: java.lang.Throwable -> L6ad
            if (r7 == 0) goto L699
            goto L6b6
        L699:
            java.lang.String r7 = p000.C0287fj.m2111(r0)     // Catch: java.lang.Throwable -> L6ad
            if (r7 == 0) goto L6af
            boolean r8 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> L6ad
            if (r8 == 0) goto L6a6
            goto L6af
        L6a6:
            p000.C0287fj.m2126(r2, r7, r0)     // Catch: java.lang.Throwable -> L6ad
        L6a9:
            r15.set(r5)
            goto L6f4
        L6ad:
            r0 = move-exception
            goto L6ba
        L6af:
            boolean r0 = p000.C0287fj.m2119(r2, r0, r15)     // Catch: java.lang.Throwable -> L6ad
            if (r0 != 0) goto L6f4
            goto L6a9
        L6b6:
            p000.C0287fj.m2124(r2, r0)     // Catch: java.lang.Throwable -> L6ad
            goto L6a9
        L6ba:
            java.lang.String r7 = r0.getMessage()     // Catch: java.lang.Throwable -> L6e2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e2
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L6e2
            r8.append(r1)     // Catch: java.lang.Throwable -> L6e2
            java.lang.String r1 = " err="
            r8.append(r1)     // Catch: java.lang.Throwable -> L6e2
            r8.append(r7)     // Catch: java.lang.Throwable -> L6e2
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L6e2
            p000.C0287fj.m2138(r1)     // Catch: java.lang.Throwable -> L6e2
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L6e2
            if (r0 == 0) goto L6e4
            r1 = 40
            java.lang.String r4 = p000.q02.m4693(r0, r1)     // Catch: java.lang.Throwable -> L6e2
            goto L6e4
        L6e2:
            r0 = move-exception
            goto L6f5
        L6e4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e2
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L6e2
            r0.append(r4)     // Catch: java.lang.Throwable -> L6e2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6e2
            p000.C0287fj.m2116(r2, r0)     // Catch: java.lang.Throwable -> L6e2
            goto L6a9
        L6f4:
            return
        L6f5:
            r15.set(r5)
            throw r0
        L6f9:
            java.lang.Object r0 = r15.f3446
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = r15.f3444
            ig r1 = (p000.C0394ig) r1
            java.lang.Object r15 = r15.f3445
            dh r15 = (p000.C0212dh) r15
            boolean r2 = r0.isAttachedToWindow()
            if (r2 == 0) goto L716
            java.lang.String r15 = r15.f3159
            java.lang.String r2 = " attached"
            java.lang.String r15 = r15.concat(r2)
            r1.invoke(r0, r15)
        L716:
            return
        L717:
            java.lang.Object r0 = r15.f3446
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            java.lang.Object r0 = r15.f3445
            r6 = r0
            tg r6 = (p000.C0834tg) r6
            java.lang.Object r15 = r15.f3444
            java.lang.String r15 = (java.lang.String) r15
            r0 = 2131618533(0x7f0deae5, float:1.8864079E38)
            r7.setTag(r0, r4)
            r0 = 2131618534(0x7f0deae6, float:1.886408E38)
            java.lang.Object r8 = r7.getTag(r0)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r8 = p000.ln0.m3626(r8, r9)
            java.lang.String r9 = "~796896D9FD9A99E3FF60F870F520A872CAB9C9E837D81AFF017266A3E9979F463DE356D00EC2BD454B6297D77AC58FCC046CA8A6B257A19D285C5090E83692"
            java.lang.String r9 = p000.jf0.m2957(r9)
            boolean r9 = p000.C0834tg.m5642(r7, r9)
            if (r9 != 0) goto L747
        L744:
            r1 = r4
            goto L811
        L747:
            java.lang.String r9 = p000.C0834tg.m5663(r7)
            java.lang.String r10 = "cfm"
            boolean r10 = p000.ln0.m3626(r9, r10)
            if (r10 == 0) goto L756
            cg r9 = p000.EnumC0112cg.f2102
            goto L762
        L756:
            java.lang.String r10 = "e68"
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 == 0) goto L761
            cg r9 = p000.EnumC0112cg.f2103
            goto L762
        L761:
            r9 = r4
        L762:
            if (r9 != 0) goto L765
            goto L744
        L765:
            android.view.ViewParent r10 = r7.getParent()
        L769:
            boolean r11 = r10 instanceof android.view.View
            if (r11 == 0) goto L781
            android.view.View r10 = (android.view.View) r10
            java.lang.String r11 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B176FF618D47B48161BBD6802803BCEF2506F2675D8864E9F"
            java.lang.String r11 = p000.jf0.m2957(r11)
            boolean r11 = p000.C0834tg.m5642(r10, r11)
            if (r11 == 0) goto L77c
            goto L782
        L77c:
            android.view.ViewParent r10 = r10.getParent()
            goto L769
        L781:
            r10 = r4
        L782:
            if (r10 != 0) goto L785
            goto L744
        L785:
            r11 = r5
            r10 = r7
        L787:
            boolean r12 = r10 instanceof android.view.View
            if (r12 == 0) goto L7fb
            r12 = 32
            if (r11 >= r12) goto L7fb
            android.view.View r10 = (android.view.View) r10
            java.lang.Class r12 = r10.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.Class r13 = r10.getClass()
            java.lang.String r13 = r13.getSimpleName()
            java.lang.String r14 = "SearchTagViewGroup"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L7aa
            goto L7f4
        L7aa:
            java.lang.String r14 = "~79141EF2EADECCDC45870F63A13D0E3014AC1E082CF7AEA788F31D8EC33850F7"
            java.lang.String r14 = p000.jf0.m2957(r14)
            boolean r14 = p000.x02.m6485(r12, r14, r5)
            if (r14 != 0) goto L744
            java.lang.String r14 = "~791C379109EE248F0DD5469CBC810DBAFBFF0438EA7D3677FCA6160785C1A62B2CAF"
            java.lang.String r14 = p000.jf0.m2957(r14)
            boolean r14 = p000.x02.m6485(r12, r14, r5)
            if (r14 != 0) goto L744
            java.lang.String r14 = ".general_search."
            boolean r12 = p000.q02.m4654(r12, r14, r5)
            if (r12 != 0) goto L744
            java.lang.String r12 = "SearchResult"
            boolean r12 = p000.q02.m4654(r13, r12, r5)
            if (r12 != 0) goto L744
            java.lang.String r12 = "SearchRoot"
            boolean r12 = p000.q02.m4654(r13, r12, r5)
            if (r12 != 0) goto L744
            java.lang.String r12 = "SearchPage"
            boolean r12 = p000.q02.m4654(r13, r12, r5)
            if (r12 != 0) goto L744
            java.lang.String r12 = "SearchContainer"
            boolean r12 = p000.q02.m4654(r13, r12, r5)
            if (r12 != 0) goto L744
            java.lang.String r12 = "SearchFragment"
            boolean r12 = p000.q02.m4654(r13, r12, r5)
            if (r12 == 0) goto L7f4
            goto L744
        L7f4:
            android.view.ViewParent r10 = r10.getParent()
            int r11 = r11 + 1
            goto L787
        L7fb:
            int r5 = r9.ordinal()
            if (r5 == 0) goto L80d
            if (r5 != r3) goto L808
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L811
        L808:
            p000.C1080.m7272()
            goto L8dd
        L80d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
        L811:
            if (r1 != 0) goto L8a8
            if (r8 == 0) goto L8dd
            r7.setTag(r0, r4)
            r15 = 2131618513(0x7f0dead1, float:1.8864038E38)
            java.lang.Object r0 = r7.getTag(r15)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L826
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L827
        L826:
            r0 = r4
        L827:
            if (r0 == 0) goto L832
            int r0 = r0.intValue()
            tg r1 = p000.AbstractC0871ug.f10771
            p000.C0834tg.m5684(r7, r0)
        L832:
            r0 = 2131618514(0x7f0dead2, float:1.886404E38)
            java.lang.Object r1 = r7.getTag(r0)
            boolean r2 = r1 instanceof android.animation.ValueAnimator
            if (r2 == 0) goto L840
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            goto L841
        L840:
            r1 = r4
        L841:
            if (r1 == 0) goto L846
            r1.cancel()
        L846:
            r7.setTag(r0, r4)
            p000.C0834tg.m5676(r7)
            p000.C0834tg.m5682(r7)
            r0 = 2131618523(0x7f0deadb, float:1.8864059E38)
            java.lang.Object r1 = r7.getTag(r0)
            boolean r2 = r1 instanceof java.lang.Float
            if (r2 == 0) goto L85d
            java.lang.Float r1 = (java.lang.Float) r1
            goto L85e
        L85d:
            r1 = r4
        L85e:
            r2 = 2131618524(0x7f0deadc, float:1.886406E38)
            if (r1 != 0) goto L86f
            java.lang.Object r1 = r7.getTag(r2)
            boolean r3 = r1 instanceof java.lang.Float
            if (r3 == 0) goto L86e
            java.lang.Float r1 = (java.lang.Float) r1
            goto L86f
        L86e:
            r1 = r4
        L86f:
            r7.setTag(r0, r4)
            r7.setTag(r2, r4)
            r0 = 2131618522(0x7f0deada, float:1.8864057E38)
            r7.setTag(r0, r4)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.setTag(r15, r0)
            if (r1 == 0) goto L8dd
            float r15 = r7.getAlpha()
            float r0 = r1.floatValue()
            float r15 = r15 - r0
            float r15 = java.lang.Math.abs(r15)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 <= 0) goto L8dd
            float r15 = r1.floatValue()
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r15 = p000.j81.m2905(r15, r0, r1)
            p000.C0834tg.m5677(r7, r15)
            goto L8dd
        L8a8:
            java.lang.Integer r3 = p000.C0834tg.m5664(r7)
            boolean r3 = p000.ln0.m3626(r3, r1)
            int r8 = r1.intValue()
            java.lang.String r4 = "measure-once bottom misc "
            java.lang.String r9 = r4.concat(r15)
            int r15 = r1.intValue()
            if (r15 != r2) goto L8c4
            java.lang.String r15 = "底栏杂项"
        L8c2:
            r10 = r15
            goto L8c7
        L8c4:
            java.lang.String r15 = "底栏杂项入口"
            goto L8c2
        L8c7:
            r11 = 16
            p000.C0834tg.m5666(r6, r7, r8, r9, r10, r11)
            if (r3 != 0) goto L8dd
            java.lang.Integer r15 = p000.C0834tg.m5664(r7)
            boolean r15 = p000.ln0.m3626(r15, r1)
            if (r15 == 0) goto L8dd
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            r7.setTag(r0, r15)
        L8dd:
            return
        L8de:
            java.lang.Object r0 = r15.f3446
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r15.f3444
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r1
            java.lang.Object r15 = r15.f3445
            p70 r15 = (p000.p70) r15
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.m1372(r0, r1, r15)
            return
        L8ee:
            java.lang.Object r0 = r15.f3446
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r15.f3444
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r15 = r15.f3445
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r3 = "r323590de2ec75a5c"
            java.lang.String r5 = "blacklist dialog shown uid="
            p000.AbstractC0205da.m1678()     // Catch: java.lang.Throwable -> L938
            android.app.Dialog r0 = p000.AbstractC0205da.m1677(r0, r1, r15)     // Catch: java.lang.Throwable -> L938
            p000.AbstractC0205da.f2994 = r0     // Catch: java.lang.Throwable -> L938
            r0.show()     // Catch: java.lang.Throwable -> L938
            sm1 r6 = new sm1     // Catch: java.lang.Throwable -> L938
            r6.<init>()     // Catch: java.lang.Throwable -> L938
            r7 = 5
            r6.f9967 = r7     // Catch: java.lang.Throwable -> L938
            ca r7 = new ca     // Catch: java.lang.Throwable -> L938
            r7.<init>(r0, r6, r1, r15)     // Catch: java.lang.Throwable -> L938
            p000.AbstractC0205da.f2996 = r7     // Catch: java.lang.Throwable -> L938
            android.os.Handler r0 = p000.AbstractC0205da.f2995     // Catch: java.lang.Throwable -> L938
            r8 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r7, r8)     // Catch: java.lang.Throwable -> L938
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L938
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L938
            r0.append(r1)     // Catch: java.lang.Throwable -> L938
            java.lang.String r1 = " reason="
            r0.append(r1)     // Catch: java.lang.Throwable -> L938
            r0.append(r15)     // Catch: java.lang.Throwable -> L938
            java.lang.String r15 = r0.toString()     // Catch: java.lang.Throwable -> L938
            p000.C0888ux.m5988(r3, r15, r4, r2, r4)     // Catch: java.lang.Throwable -> L938
            goto L947
        L938:
            r0 = move-exception
            r15 = r0
            java.lang.String r15 = r15.getMessage()
            java.lang.String r0 = "show dialog failed: "
            java.lang.String r15 = p000.lz1.m3687(r0, r15)
            p000.C0888ux.m5988(r3, r15, r4, r2, r4)
        L947:
            return
        L948:
            java.lang.Object r0 = r15.f3446
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r15.f3444
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r15 = r15.f3445
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r3 = "弹窗异常: "
            p000.h62.m2408(r1, r0, r15)     // Catch: java.lang.Throwable -> L95b
            goto L981
        L95b:
            r0 = move-exception
            r15 = r0
            java.lang.String r0 = "r503d887a1287db3d"
            java.lang.String r6 = r15.getMessage()
            java.lang.String r6 = p000.lz1.m3687(r3, r6)
            p000.C0888ux.m5988(r0, r6, r4, r2, r4)
            java.lang.String r15 = r15.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            android.widget.Toast r15 = android.widget.Toast.makeText(r1, r15, r5)
            r15.show()
        L981:
            return
    }
}
