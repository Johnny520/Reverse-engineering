package p000;

/* JADX INFO: renamed from: w1 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0931w1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11511;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f11512;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f11513;

    public /* synthetic */ RunnableC0931w1(android.app.Activity r2, p000.C0286fi r3) {
            r1 = this;
            r0 = 24
            r1.f11511 = r0
            r1.<init>()
            r1.f11512 = r2
            r1.f11513 = r3
            return
    }

    public /* synthetic */ RunnableC0931w1(android.app.Activity r2, p000.xj0 r3) {
            r1 = this;
            r0 = 11
            r1.f11511 = r0
            r1.<init>()
            r1.f11512 = r2
            r1.f11513 = r3
            return
    }

    public /* synthetic */ RunnableC0931w1(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f11511 = r2
            r0.f11512 = r1
            r0.f11513 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0931w1(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            r0 = 4
            r1.f11511 = r0
            kf r0 = p000.C0467kf.f5879
            r1.<init>()
            r1.f11512 = r2
            r1.f11513 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            int r0 = r12.f11511
            r1 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            switch(r0) {
                case 0: goto L51c;
                case 1: goto L506;
                case 2: goto L4ce;
                case 3: goto L4b8;
                case 4: goto L477;
                case 5: goto L46b;
                case 6: goto L436;
                case 7: goto L41a;
                case 8: goto L40e;
                case 9: goto L3e0;
                case 10: goto L3cf;
                case 11: goto L394;
                case 12: goto L386;
                case 13: goto L2af;
                case 14: goto L274;
                case 15: goto L266;
                case 16: goto L247;
                case 17: goto L229;
                case 18: goto L1eb;
                case 19: goto L1dd;
                case 20: goto L1c1;
                case 21: goto L190;
                case 22: goto L163;
                case 23: goto L106;
                case 24: goto Ld5;
                case 25: goto La9;
                case 26: goto L94;
                case 27: goto L67;
                case 28: goto L49;
                default: goto La;
            }
        La:
            java.lang.Object r0 = r12.f11512
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r12 = r12.f11513
            li0 r12 = (p000.li0) r12
            java.util.Iterator r1 = r0.iterator()
        L16:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r1.next()
            xi0 r0 = (p000.xi0) r0
            st r2 = p000.C0810st.f10010     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = r0.f12180     // Catch: java.lang.Throwable -> L2d
            long r6 = r0.f12181     // Catch: java.lang.Throwable -> L2d
            pt r0 = r2.m5565(r6, r3)     // Catch: java.lang.Throwable -> L2d
            goto L34
        L2d:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L34:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L39
            r0 = r5
        L39:
            pt r0 = (p000.C0699pt) r0
            if (r0 == 0) goto L16
            p3 r2 = new p3
            r3 = 23
            r2.<init>(r12, r3, r0)
            r12.m3571(r2)
            goto L16
        L48:
            return
        L49:
            java.lang.Object r0 = r12.f11512
            li0 r0 = (p000.li0) r0
            java.lang.Object r12 = r12.f11513
            android.view.inputmethod.InputMethodManager r12 = (android.view.inputmethod.InputMethodManager) r12
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f6679
            android.widget.EditText r0 = r0.f6664
            boolean r1 = r1.get()
            if (r1 != 0) goto L66
            boolean r1 = r0.hasFocus()
            if (r1 == 0) goto L66
            if (r12 == 0) goto L66
            r12.showSoftInput(r0, r3)
        L66:
            return
        L67:
            java.lang.Object r0 = r12.f11512
            li0 r0 = (p000.li0) r0
            java.lang.Object r12 = r12.f11513
            p70 r12 = (p000.p70) r12
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f6679
            android.app.Activity r2 = r0.f6659
            boolean r1 = r1.get()
            if (r1 == 0) goto L7a
            goto L93
        L7a:
            boolean r1 = r2.isFinishing()
            if (r1 != 0) goto L93
            boolean r1 = r2.isDestroyed()
            if (r1 == 0) goto L87
            goto L93
        L87:
            android.app.AlertDialog r0 = r0.f6676
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L90
            goto L93
        L90:
            r12.invoke()
        L93:
            return
        L94:
            java.lang.Object r0 = r12.f11512
            li0 r0 = (p000.li0) r0
            java.lang.Object r12 = r12.f11513
            pt r12 = (p000.C0699pt) r12
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f6679
            boolean r1 = r1.get()
            if (r1 == 0) goto La5
            goto La8
        La5:
            r0.m3570(r12)
        La8:
            return
        La9:
            java.lang.Object r0 = r12.f11512
            nd0 r0 = (p000.nd0) r0
            java.lang.Object r12 = r12.f11513
            p70 r12 = (p000.p70) r12
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f7537
            android.app.Activity r2 = r0.f7534
            boolean r1 = r1.get()
            if (r1 != 0) goto Ld4
            boolean r1 = r2.isFinishing()
            if (r1 != 0) goto Ld4
            boolean r1 = r2.isDestroyed()
            if (r1 == 0) goto Lc8
            goto Ld4
        Lc8:
            android.app.AlertDialog r0 = r0.f7525
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto Ld1
            goto Ld4
        Ld1:
            r12.invoke()
        Ld4:
            return
        Ld5:
            java.lang.Object r0 = r12.f11512
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r12 = r12.f11513
            fi r12 = (p000.C0286fi) r12
            java.lang.String r2 = "打开隐藏联系人菜单失败"
            nd0 r0 = new nd0     // Catch: java.lang.Throwable -> Leb
            r0.<init>(r1, r12)     // Catch: java.lang.Throwable -> Leb
            r0.m4032()     // Catch: java.lang.Throwable -> Leb
            s62 r12 = p000.s62.f9751     // Catch: java.lang.Throwable -> Leb
            goto Lf3
        Leb:
            r0 = move-exception
            r12 = r0
            eo1 r0 = new eo1
            r0.<init>(r12)
            r12 = r0
        Lf3:
            java.lang.Throwable r12 = p000.fo1.m2190(r12)
            if (r12 == 0) goto L105
            java.lang.String r0 = "r44e0b9fe58029ab"
            p000.C0888ux.m5977(r0, r2, r12)
            android.widget.Toast r12 = android.widget.Toast.makeText(r1, r2, r4)
            r12.show()
        L105:
            return
        L106:
            java.lang.Object r0 = r12.f11512
            r7 = r0
            dc0 r7 = (p000.dc0) r7
            java.lang.Object r12 = r12.f11513
            r9 = r12
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            um1 r8 = new um1
            r8.<init>()
            um1 r10 = new um1
            r10.<init>()
            um1 r11 = new um1
            r11.<init>()
            vb0 r6 = new vb0
            r6.<init>(r7, r8, r9, r10, r11)
            boolean r12 = p000.jc0.m2927(r6)
            if (r12 != 0) goto L133
            wb0 r12 = new wb0
            r12.<init>(r7, r4)
            r7.m1690(r12)
            goto L15c
        L133:
            java.lang.Object r12 = r11.f10912
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            if (r12 == 0) goto L144
            p3 r0 = new p3
            r1 = 11
            r0.<init>(r7, r1, r12)
            r7.m1690(r0)
            goto L15c
        L144:
            java.lang.Object r12 = r10.f10912
            if (r12 == 0) goto L15d
            sb0 r12 = (p000.sb0) r12
            java.util.List r12 = r12.f9811
            java.util.Map r12 = r7.m1691(r12)
            xb0 r6 = new xb0
            r11 = 0
            r9 = r8
            r8 = r10
            r10 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r7.m1690(r6)
        L15c:
            return
        L15d:
            java.lang.String r12 = "refreshed"
            p000.ln0.m3650(r12)
            throw r5
        L163:
            java.lang.Object r0 = r12.f11512
            dc0 r0 = (p000.dc0) r0
            java.lang.Object r12 = r12.f11513
            p70 r12 = (p000.p70) r12
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f3066
            android.app.Activity r2 = r0.f3052
            boolean r1 = r1.get()
            if (r1 == 0) goto L176
            goto L18f
        L176:
            boolean r1 = r2.isFinishing()
            if (r1 != 0) goto L18f
            boolean r1 = r2.isDestroyed()
            if (r1 == 0) goto L183
            goto L18f
        L183:
            android.app.AlertDialog r0 = r0.f3065
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L18c
            goto L18f
        L18c:
            r12.invoke()
        L18f:
            return
        L190:
            java.lang.Object r0 = r12.f11512
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r12 = r12.f11513
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            com.example.dyhelper.hook.γ r4 = com.example.dyhelper.hook.C0157.f2411
            android.view.ViewGroup r6 = com.example.dyhelper.hook.C0157.m1504(r0)
            if (r6 == 0) goto L1a4
            r4.m1524(r0)
            goto L1c0
        L1a4:
            boolean r6 = r12 instanceof android.widget.FrameLayout
            if (r6 == 0) goto L1ab
            r5 = r12
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
        L1ab:
            if (r5 != 0) goto L1b1
            android.widget.FrameLayout r5 = com.example.dyhelper.hook.C0157.m1509(r0)
        L1b1:
            if (r5 == 0) goto L1b7
            r4.m1525(r5, r0)
            goto L1c0
        L1b7:
            android.app.Activity r12 = com.example.dyhelper.hook.C0157.m1502(r12)
            if (r12 == 0) goto L1c0
            com.example.dyhelper.hook.C0157.m1517(r12, r1, r3)
        L1c0:
            return
        L1c1:
            java.lang.Object r0 = r12.f11512
            p70 r0 = (p000.p70) r0
            java.lang.Object r12 = r12.f11513
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            java.lang.Object r1 = com.example.dyhelper.hook.C0157.f2417
            monitor-enter(r1)
            java.util.WeakHashMap r2 = com.example.dyhelper.hook.C0157.f2427     // Catch: java.lang.Throwable -> L1d9
            java.lang.Object r12 = r2.remove(r12)     // Catch: java.lang.Throwable -> L1d9
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L1d9
            monitor-exit(r1)
            r0.invoke()
            return
        L1d9:
            r0 = move-exception
            r12 = r0
            monitor-exit(r1)
            throw r12
        L1dd:
            java.lang.Object r0 = r12.f11512
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            java.lang.Object r12 = r12.f11513
            android.view.View r12 = (android.view.View) r12
            com.example.dyhelper.hook.γ r1 = com.example.dyhelper.hook.C0157.f2411
            r1.m1525(r0, r12)
            return
        L1eb:
            java.lang.Object r0 = r12.f11512
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.lang.Object r12 = r12.f11513
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.Object r1 = com.example.dyhelper.hook.C0157.f2417
            monitor-enter(r1)
            java.util.WeakHashMap r2 = com.example.dyhelper.hook.C0157.f2430     // Catch: java.lang.Throwable -> L225
            java.lang.Object r2 = r2.remove(r0)     // Catch: java.lang.Throwable -> L225
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L225
            monitor-exit(r1)
            boolean r1 = r0.isAttachedToWindow()
            if (r1 != 0) goto L206
            goto L224
        L206:
            com.example.dyhelper.hook.γ r1 = com.example.dyhelper.hook.C0157.f2411
            android.view.ViewGroup r2 = com.example.dyhelper.hook.C0157.m1504(r12)
            if (r2 == 0) goto L212
            r1.m1524(r12)
            goto L224
        L212:
            boolean r2 = r0 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L219
            r5 = r0
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
        L219:
            if (r5 != 0) goto L21f
            android.widget.FrameLayout r5 = com.example.dyhelper.hook.C0157.m1509(r12)
        L21f:
            if (r5 == 0) goto L224
            r1.m1525(r5, r12)
        L224:
            return
        L225:
            r0 = move-exception
            r12 = r0
            monitor-exit(r1)
            throw r12
        L229:
            java.lang.Object r0 = r12.f11512
            b20 r0 = (p000.b20) r0
            java.lang.Object r12 = r12.f11513
            android.view.View r12 = (android.view.View) r12
            com.example.dyhelper.hook.γ r1 = com.example.dyhelper.hook.C0157.f2411
            long r1 = r0.f1422
            java.lang.String r3 = r0.f1423
            boolean r1 = com.example.dyhelper.hook.C0157.m1479(r1, r3)
            if (r1 == 0) goto L246
            boolean r0 = com.example.dyhelper.hook.C0157.m1493(r12, r0)
            if (r0 == 0) goto L246
            com.example.dyhelper.hook.C0157.m1519(r12)
        L246:
            return
        L247:
            java.lang.Object r0 = r12.f11512
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r12 = r12.f11513
            yj0 r12 = (p000.yj0) r12
            boolean r1 = r12.f12646
            if (r1 == 0) goto L256
            java.lang.String r12 = "一键已读成功"
            goto L25e
        L256:
            java.lang.String r12 = r12.f12647
            java.lang.String r1 = "一键已读失败: "
            java.lang.String r12 = p000.lz1.m3687(r1, r12)
        L25e:
            android.widget.Toast r12 = android.widget.Toast.makeText(r0, r12, r4)
            r12.show()
            return
        L266:
            java.lang.Object r0 = r12.f11512
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r12 = r12.f11513
            o10 r12 = (p000.o10) r12
            q10 r1 = p000.q10.f8786
            p000.q10.m4704(r0, r12)
            return
        L274:
            java.lang.Object r0 = r12.f11512
            r1 = r0
            java.util.concurrent.FutureTask r1 = (java.util.concurrent.FutureTask) r1
            java.lang.Object r12 = r12.f11513
            java.lang.String r12 = (java.lang.String) r12
            r1.run()     // Catch: java.lang.Throwable -> L296
            java.lang.Object r2 = p000.C0666ox.f8309
            monitor-enter(r2)
            java.util.HashMap r0 = p000.C0666ox.f8312     // Catch: java.lang.Throwable -> L28f
            java.lang.Object r3 = r0.get(r12)     // Catch: java.lang.Throwable -> L28f
            if (r3 != r1) goto L292
            r0.remove(r12)     // Catch: java.lang.Throwable -> L28f
            goto L292
        L28f:
            r0 = move-exception
            r12 = r0
            goto L294
        L292:
            monitor-exit(r2)
            return
        L294:
            monitor-exit(r2)
            throw r12
        L296:
            r0 = move-exception
            java.lang.Object r2 = p000.C0666ox.f8309
            monitor-enter(r2)
            java.util.HashMap r3 = p000.C0666ox.f8312     // Catch: java.lang.Throwable -> L2a8
            java.lang.Object r3 = r3.get(r12)     // Catch: java.lang.Throwable -> L2a8
            if (r3 != r1) goto L2ab
            java.util.HashMap r1 = p000.C0666ox.f8312     // Catch: java.lang.Throwable -> L2a8
            r1.remove(r12)     // Catch: java.lang.Throwable -> L2a8
            goto L2ab
        L2a8:
            r0 = move-exception
            r12 = r0
            goto L2ad
        L2ab:
            monitor-exit(r2)
            throw r0
        L2ad:
            monitor-exit(r2)
            throw r12
        L2af:
            java.lang.Object r0 = r12.f11512
            r5 = r0
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.Object r12 = r12.f11513
            r10 = r12
            java.lang.ClassLoader r10 = (java.lang.ClassLoader) r10
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.C0410ix.f5231
            int r0 = p000.C0410ix.f5220
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L382
            boolean r0 = r5.isDestroyed()
            if (r0 == 0) goto L2cb
            goto L382
        L2cb:
            java.lang.String r1 = ""
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L2df
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L2df
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r4)     // Catch: java.lang.Throwable -> L2df
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Throwable -> L2df
            if (r0 != 0) goto L2e6
            r0 = r1
            goto L2e6
        L2df:
            r0 = move-exception
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L2f7
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2f7
            r0 = r2
        L2e6:
            boolean r2 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L2f7
            if (r2 == 0) goto L2eb
            goto L2ec
        L2eb:
            r1 = r0
        L2ec:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2f7
            boolean r0 = p000.q02.m4671(r1)     // Catch: java.lang.Throwable -> L2f7
            if (r0 == 0) goto L2f9
            java.lang.String r1 = "未知"
            goto L2f9
        L2f7:
            r0 = move-exception
            goto L35d
        L2f9:
            long r7 = p000.C0410ix.m2818(r5)     // Catch: java.lang.Throwable -> L2f7
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L2f7
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2f7
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r4)     // Catch: java.lang.Throwable -> L2f7
            android.app.AlertDialog r9 = r0.create()     // Catch: java.lang.Throwable -> L2f7
            r6 = r5
            fx r5 = new fx     // Catch: java.lang.Throwable -> L2f7
            r5.<init>(r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L2f7
            r0 = r9
            gx r10 = new gx     // Catch: java.lang.Throwable -> L2f7
            r10.<init>(r0, r7, r1)     // Catch: java.lang.Throwable -> L2f7
            r9 = r5
            r5 = r6
            r6 = r1
            android.widget.FrameLayout r1 = p000.C0410ix.m2814(r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L2f7
            r6 = r5
            r0.setView(r1)     // Catch: java.lang.Throwable -> L2f7
            r0.show()     // Catch: java.lang.Throwable -> L2f7
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> L2f7
            if (r0 != 0) goto L32b
            goto L35a
        L32b:
            android.content.res.Resources r1 = r6.getResources()     // Catch: java.lang.Throwable -> L2f7
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Throwable -> L2f7
            int r1 = r1.widthPixels     // Catch: java.lang.Throwable -> L2f7
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L2f7
            r2 = 1063339950(0x3f6147ae, float:0.88)
            float r1 = r1 * r2
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L2f7
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> L2f7
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2f7
            r0.setBackgroundDrawable(r2)     // Catch: java.lang.Throwable -> L2f7
            android.view.View r2 = r0.getDecorView()     // Catch: java.lang.Throwable -> L2f7
            r2.setPadding(r4, r4, r4, r4)     // Catch: java.lang.Throwable -> L2f7
            r2 = 1052938076(0x3ec28f5c, float:0.38)
            r0.setDimAmount(r2)     // Catch: java.lang.Throwable -> L2f7
            r2 = 524320(0x80020, float:7.34729E-40)
            r0.clearFlags(r2)     // Catch: java.lang.Throwable -> L2f7
            r2 = -2
            r0.setLayout(r1, r2)     // Catch: java.lang.Throwable -> L2f7
        L35a:
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2f7
            goto L363
        L35d:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L363:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L385
            r12.set(r4)
            java.lang.String r12 = r0.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "show best-version warning failed: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            p000.C0410ix.m2820(r12)
            goto L385
        L382:
            r12.set(r4)
        L385:
            return
        L386:
            java.lang.Object r0 = r12.f11512
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r12 = r12.f11513
            xw r12 = (p000.C0999xw) r12
            android.os.Handler r1 = p000.C1036yw.f12843
            p000.C1036yw.m7037(r0, r12)
            return
        L394:
            java.lang.Object r0 = r12.f11512
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r12 = r12.f11513
            xj0 r12 = (p000.xj0) r12
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L3a7
            if (r0 != 0) goto L3aa
            p000.ui1.m5896(r1)     // Catch: java.lang.Throwable -> L3a7
            goto L3aa
        L3a7:
            r0 = move-exception
            r12 = r0
            goto L3ae
        L3aa:
            p000.h62.m2407(r1, r12)     // Catch: java.lang.Throwable -> L3a7
            goto L3ce
        L3ae:
            java.lang.String r0 = "DYHelper"
            java.lang.String r2 = "打开下载路径模板弹窗失败"
            p000.C0888ux.m5977(r0, r2, r12)
            java.lang.String r12 = r12.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "打开路径设置失败: "
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.widget.Toast r12 = android.widget.Toast.makeText(r1, r12, r4)
            r12.show()
        L3ce:
            return
        L3cf:
            java.lang.Object r0 = r12.f11512
            pr r0 = (p000.C0697pr) r0
            java.lang.Object r12 = r12.f11513
            mr r12 = (p000.C0559mr) r12
            android.view.ViewGroup r0 = r0.f8663
            r0.endViewTransition(r5)
            r12.m2767()
            return
        L3e0:
            java.lang.Object r0 = r12.f11512
            p70 r0 = (p000.p70) r0
            java.lang.Object r12 = r12.f11513
            android.view.View r12 = (android.view.View) r12
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L3ed
            goto L3f4
        L3ed:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L3f4:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L40d
            java.lang.String r1 = "r8dc155644f53e174"
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r2 = "评论控件异步样式处理失败: "
            java.lang.String r12 = r2.concat(r12)
            p000.C0888ux.m5977(r1, r12, r0)
        L40d:
            return
        L40e:
            java.lang.Object r0 = r12.f11512
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r12 = r12.f11513
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r12 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog) r12
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog.m1402(r0, r12)
            return
        L41a:
            java.lang.Object r0 = r12.f11512
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r12 = r12.f11513
            android.view.ViewGroup r0 = p000.AbstractC0551mj.m3849(r0)
            if (r0 != 0) goto L430
            android.view.ViewGroup r0 = p000.AbstractC0551mj.m3850(r12)
            if (r0 != 0) goto L430
            android.view.ViewGroup r0 = p000.AbstractC0551mj.m3851(r12)
        L430:
            if (r0 == 0) goto L435
            p000.AbstractC0551mj.m3864(r0, r3, r3)
        L435:
            return
        L436:
            java.lang.Object r0 = r12.f11512
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r12 = r12.f11513
            java.lang.String r12 = (java.lang.String) r12
            if (r0 == 0) goto L445
            java.util.LinkedHashSet r3 = p000.AbstractC0871ug.f10797
            r3.add(r0)
        L445:
            p000.AbstractC0871ug.f10798 = r12
            s0 r12 = p000.AbstractC0871ug.f10796
            if (r12 == 0) goto L450
            android.os.Handler r3 = p000.AbstractC0871ug.f10780
            r3.removeCallbacks(r12)
        L450:
            if (r0 == 0) goto L45d
            java.util.LinkedHashSet r12 = p000.AbstractC0871ug.f10795
            boolean r12 = r12.contains(r0)
            if (r12 == 0) goto L45b
            goto L45d
        L45b:
            r1 = 32
        L45d:
            s0 r12 = new s0
            r0 = 4
            r12.<init>(r0)
            p000.AbstractC0871ug.f10796 = r12
            android.os.Handler r0 = p000.AbstractC0871ug.f10780
            r0.postDelayed(r12, r1)
            return
        L46b:
            java.lang.Object r0 = r12.f11512
            kf r0 = (p000.C0467kf) r0
            java.lang.Object r12 = r12.f11513
            android.view.View r12 = (android.view.View) r12
            r0.m3239(r12, r5)
            return
        L477:
            kf r0 = p000.C0467kf.f5879
            java.lang.Object r1 = r12.f11512
            java.lang.Object r12 = r12.f11513
            android.view.View r1 = p000.C0467kf.m3222(r1)
            if (r1 != 0) goto L484
            goto L4b7
        L484:
            p000.C0467kf.m3214(r1, r12)
            w1 r12 = new w1     // Catch: java.lang.Throwable -> L492
            r2 = 5
            r12.<init>(r0, r2, r1)     // Catch: java.lang.Throwable -> L492
            r2 = 160(0xa0, double:7.9E-322)
            r1.postDelayed(r12, r2)     // Catch: java.lang.Throwable -> L492
        L492:
            java.lang.Class r12 = r1.getClass()
            java.lang.String r12 = r12.getName()
            int r0 = r1.hashCode()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "delayed bind from presenter view="
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = "@"
            r1.append(r12)
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            p000.C0467kf.m3226(r12)
        L4b7:
            return
        L4b8:
            java.lang.Object r0 = r12.f11512
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r12 = r12.f11513
            java.lang.Integer r12 = (java.lang.Integer) r12
            boolean r1 = r0.isAttachedToWindow()
            if (r1 == 0) goto L4cd
            int r12 = r12.intValue()
            p000.C0792sb.m5407(r0, r12)
        L4cd:
            return
        L4ce:
            java.lang.Object r0 = r12.f11512
            r1 = r0
            a80 r1 = (p000.a80) r1
            java.lang.Object r12 = r12.f11513
            java.lang.String r12 = (java.lang.String) r12
            java.util.Set r2 = p000.AbstractC0976x9.f12072
            java.lang.String r3 = "check failed: "
            v9 r0 = p000.AbstractC0976x9.m6535(r12)     // Catch: java.lang.Throwable -> L4e6
            r1.invoke(r0)     // Catch: java.lang.Throwable -> L4e6
        L4e2:
            r2.remove(r12)
            goto L500
        L4e6:
            r0 = move-exception
            v9 r6 = new v9     // Catch: java.lang.Throwable -> L501
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L501
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L501
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L501
            r7.append(r0)     // Catch: java.lang.Throwable -> L501
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L501
            r6.<init>(r4, r0, r5)     // Catch: java.lang.Throwable -> L501
            r1.invoke(r6)     // Catch: java.lang.Throwable -> L501
            goto L4e2
        L500:
            return
        L501:
            r0 = move-exception
            r2.remove(r12)
            throw r0
        L506:
            java.lang.Object r0 = r12.f11512
            r1 = r0
            u4 r1 = (p000.ExecutorC0859u4) r1
            java.lang.Object r12 = r12.f11513
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            r12.run()     // Catch: java.lang.Throwable -> L516
            r1.m5780()
            return
        L516:
            r0 = move-exception
            r12 = r0
            r1.m5780()
            throw r12
        L51c:
            java.lang.Object r0 = r12.f11512
            z1 r0 = (p000.ViewOnAttachStateChangeListenerC1042z1) r0
            java.lang.Object r12 = r12.f11513
            android.util.LongSparseArray r12 = (android.util.LongSparseArray) r12
            p000.ln0.m3637(r0, r12)
            return
    }
}
