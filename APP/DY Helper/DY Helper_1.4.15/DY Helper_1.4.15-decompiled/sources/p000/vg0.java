package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vg0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11264;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f11265;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f11266;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f11267;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f11268;

    public /* synthetic */ vg0(android.view.View r1, java.lang.Object r2, java.lang.Object r3, java.lang.Integer r4, java.lang.String r5) {
            r0 = this;
            r5 = 0
            r0.f11264 = r5
            r0.<init>()
            r0.f11265 = r1
            r0.f11266 = r2
            r0.f11267 = r3
            r0.f11268 = r4
            return
    }

    public /* synthetic */ vg0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f11264 = r5
            r0.f11265 = r1
            r0.f11266 = r2
            r0.f11267 = r3
            r0.f11268 = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r0 = r17
            int r1 = r0.f11264
            switch(r1) {
                case 0: goto L32b;
                case 1: goto L2fc;
                case 2: goto L2ea;
                case 3: goto L272;
                case 4: goto L25e;
                case 5: goto Lba;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f11265
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r3 = r0.f11266
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r4 = r0.f11267
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.Object r0 = r0.f11268
            r5 = r0
            um1 r5 = (p000.um1) r5
            java.io.File r0 = r1.getFilesDir()
            r0.getClass()
            java.lang.String r6 = "CroppedBitmapStore"
            java.lang.String r7 = "裁剪图已保存: "
            r3.getClass()
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L7f
            java.lang.String r9 = "comment_bg"
            r8.<init>(r0, r9)     // Catch: java.lang.Throwable -> L7f
            r8.mkdirs()     // Catch: java.lang.Throwable -> L7f
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L7f
            java.lang.String r9 = "cropped.webp"
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L7f
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7f
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L7f
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch: java.lang.Throwable -> L81
            r10 = 95
            r3.compress(r9, r10, r8)     // Catch: java.lang.Throwable -> L81
            r8.flush()     // Catch: java.lang.Throwable -> L81
            r8.close()     // Catch: java.lang.Throwable -> L7f
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7f
            int r8 = r3.getWidth()     // Catch: java.lang.Throwable -> L7f
            int r9 = r3.getHeight()     // Catch: java.lang.Throwable -> L7f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r10.<init>(r7)     // Catch: java.lang.Throwable -> L7f
            r10.append(r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r7 = " ("
            r10.append(r7)     // Catch: java.lang.Throwable -> L7f
            r10.append(r8)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r7 = "×"
            r10.append(r7)     // Catch: java.lang.Throwable -> L7f
            r10.append(r9)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r7 = ")"
            r10.append(r7)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> L7f
            android.util.Log.d(r6, r7)     // Catch: java.lang.Throwable -> L7f
            r2 = r0
            goto L9f
        L7f:
            r0 = move-exception
            goto L89
        L81:
            r0 = move-exception
            r7 = r0
            throw r7     // Catch: java.lang.Throwable -> L84
        L84:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r8, r7)     // Catch: java.lang.Throwable -> L7f
            throw r0     // Catch: java.lang.Throwable -> L7f
        L89:
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "保存失败: "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            android.util.Log.e(r6, r0)
            r2 = 0
        L9f:
            boolean r0 = r3.isRecycled()
            if (r0 != 0) goto La8
            r3.recycle()
        La8:
            boolean r0 = r4.isRecycled()
            if (r0 != 0) goto Lb1
            r4.recycle()
        Lb1:
            jg1 r0 = new jg1
            r0.<init>(r2, r5, r1)
            r1.runOnUiThread(r0)
            return
        Lba:
            java.lang.Object r1 = r0.f11265
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
            java.lang.Object r3 = r0.f11266
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r4 = r0.f11267
            ky1 r4 = (p000.ky1) r4
            java.lang.Object r0 = r0.f11268
            r5 = r0
            android.app.Activity r5 = (android.app.Activity) r5
            gf1 r8 = p000.gf1.f4355
            r1.getClass()
            r3.getClass()
            r14 = 0
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L101
            if (r0 == 0) goto L21c
            java.lang.String r0 = p000.ui1.m5890()     // Catch: java.lang.Throwable -> L101
            java.lang.CharSequence r0 = p000.q02.m4660(r0)     // Catch: java.lang.Throwable -> L101
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L101
            int r6 = r0.length()     // Catch: java.lang.Throwable -> L101
            if (r6 <= 0) goto L214
            zt0 r15 = p000.AbstractC1021yh.m6893()     // Catch: java.lang.Throwable -> L101
            if (r4 == 0) goto L104
            boolean r6 = p000.gf1.m2302(r4)     // Catch: java.lang.Throwable -> L101
            if (r6 == 0) goto Lfa
            r6 = r4
            goto Lfb
        Lfa:
            r6 = 0
        Lfb:
            if (r6 == 0) goto L104
            r15.add(r6)     // Catch: java.lang.Throwable -> L101
            goto L104
        L101:
            r0 = move-exception
            goto L224
        L104:
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L101
            f7 r6 = new f7     // Catch: java.lang.Throwable -> L101
            r7 = 1
            r6.<init>(r7, r3)     // Catch: java.lang.Throwable -> L101
            r3 = r6
            ny0 r6 = new ny0     // Catch: java.lang.Throwable -> L101
            java.lang.Class<gf1> r9 = p000.gf1.class
            java.lang.String r10 = "isValidSpark"
            java.lang.String r11 = "isValidSpark(Lcom/example/dyhelper/hook/SparkAutoRenewHook$SparkInfo;)Z"
            r12 = 0
            r13 = 17
            r16 = r7
            r7 = 1
            r2 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L101
            y30 r7 = new y30     // Catch: java.lang.Throwable -> L101
            r7.<init>(r3, r2, r6)     // Catch: java.lang.Throwable -> L101
            bf1 r3 = new bf1     // Catch: java.lang.Throwable -> L101
            r3.<init>(r4, r14)     // Catch: java.lang.Throwable -> L101
            y30 r4 = new y30     // Catch: java.lang.Throwable -> L101
            r4.<init>(r7, r14, r3)     // Catch: java.lang.Throwable -> L101
            ib1 r3 = new ib1     // Catch: java.lang.Throwable -> L101
            r6 = 11
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L101
            java.util.List r4 = p000.us1.m5949(r4)     // Catch: java.lang.Throwable -> L101
            p000.AbstractC0019ai.m168(r4, r3)     // Catch: java.lang.Throwable -> L101
            java.util.Iterator r3 = r4.iterator()     // Catch: java.lang.Throwable -> L101
        L141:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L101
            if (r4 == 0) goto L151
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L101
            ky1 r4 = (p000.ky1) r4     // Catch: java.lang.Throwable -> L101
            r15.add(r4)     // Catch: java.lang.Throwable -> L101
            goto L141
        L151:
            zt0 r3 = p000.AbstractC1021yh.m6883(r15)     // Catch: java.lang.Throwable -> L101
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L101
            if (r4 != 0) goto L20c
            java.util.ListIterator r3 = r3.listIterator(r14)     // Catch: java.lang.Throwable -> L101
            r16 = 0
        L161:
            r4 = r3
            le0 r4 = (p000.le0) r4     // Catch: java.lang.Throwable -> L101
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L101
            if (r6 == 0) goto L200
            java.lang.Object r4 = r4.next()     // Catch: java.lang.Throwable -> L101
            ky1 r4 = (p000.ky1) r4     // Catch: java.lang.Throwable -> L101
            long r6 = r4.f6323     // Catch: java.lang.Throwable -> L101
            java.lang.Object r4 = p000.p91.m4424(r1, r6)     // Catch: java.lang.Throwable -> L101
            boolean r6 = r4 instanceof p000.eo1     // Catch: java.lang.Throwable -> L101
            if (r6 == 0) goto L180
            java.lang.Throwable r16 = p000.fo1.m2190(r4)     // Catch: java.lang.Throwable -> L101
            goto L200
        L180:
            p000.i81.m2649(r4)     // Catch: java.lang.Throwable -> L101
            xe1 r4 = (p000.xe1) r4     // Catch: java.lang.Throwable -> L101
            boolean r6 = r4.m6629()     // Catch: java.lang.Throwable -> L101
            if (r6 != 0) goto L1ab
            int r4 = r4.f12147     // Catch: java.lang.Throwable -> L101
            r6 = 994008(0xf2ad8, float:1.392902E-39)
            if (r4 == r6) goto L161
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L101
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L101
            r7.<init>()     // Catch: java.lang.Throwable -> L101
            java.lang.String r8 = "食物目录业务失败 code="
            r7.append(r8)     // Catch: java.lang.Throwable -> L101
            r7.append(r4)     // Catch: java.lang.Throwable -> L101
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L101
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L101
            r16 = r6
            goto L161
        L1ab:
            java.util.List r4 = r4.f12150     // Catch: java.lang.Throwable -> L101
            f7 r6 = new f7     // Catch: java.lang.Throwable -> L101
            r6.<init>(r2, r4)     // Catch: java.lang.Throwable -> L101
            cf1 r4 = new cf1     // Catch: java.lang.Throwable -> L101
            r4.<init>(r14)     // Catch: java.lang.Throwable -> L101
            y30 r7 = new y30     // Catch: java.lang.Throwable -> L101
            r7.<init>(r6, r2, r4)     // Catch: java.lang.Throwable -> L101
            ff1 r4 = p000.ff1.f3920     // Catch: java.lang.Throwable -> L101
            cu r6 = new cu     // Catch: java.lang.Throwable -> L101
            r6.<init>(r7, r14, r4)     // Catch: java.lang.Throwable -> L101
            cf1 r4 = new cf1     // Catch: java.lang.Throwable -> L101
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L101
            t52 r7 = new t52     // Catch: java.lang.Throwable -> L101
            r7.<init>(r6, r4)     // Catch: java.lang.Throwable -> L101
            java.util.List r4 = p000.us1.m5948(r7)     // Catch: java.lang.Throwable -> L101
            boolean r6 = r4.isEmpty()     // Catch: java.lang.Throwable -> L101
            if (r6 == 0) goto L1e1
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L101
            java.lang.String r6 = "服务端返回的普通食物目录为空"
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L101
            r16 = r4
            goto L161
        L1e1:
            java.lang.String r1 = p000.ui1.m5890()     // Catch: java.lang.Throwable -> L101
            java.lang.CharSequence r1 = p000.q02.m4660(r1)     // Catch: java.lang.Throwable -> L101
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L101
            boolean r0 = p000.ln0.m3626(r1, r0)     // Catch: java.lang.Throwable -> L101
            if (r0 == 0) goto L1f8
            ef1 r0 = p000.gf1.m2305(r4)     // Catch: java.lang.Throwable -> L101
            goto L22a
        L1f8:
            java.lang.String r0 = "账号已切换，放弃写入旧账号食物目录"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L101
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L101
            throw r1     // Catch: java.lang.Throwable -> L101
        L200:
            if (r16 != 0) goto L20b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L101
            java.lang.String r1 = "没有可用的小火人食物目录"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L101
            r16 = r0
        L20b:
            throw r16     // Catch: java.lang.Throwable -> L101
        L20c:
            java.lang.String r0 = "没有已识别的小火人单聊会话"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L101
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L101
            throw r1     // Catch: java.lang.Throwable -> L101
        L214:
            java.lang.String r0 = "当前账号 UID 不可用"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L101
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L101
            throw r1     // Catch: java.lang.Throwable -> L101
        L21c:
            java.lang.String r0 = "账号配置尚未初始化"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L101
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L101
            throw r1     // Catch: java.lang.Throwable -> L101
        L224:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L22a:
            java.lang.Object r1 = p000.pf1.f8541
            monitor-enter(r1)
            p000.pf1.f8542 = r14     // Catch: java.lang.Throwable -> L25b
            java.util.ArrayList r2 = p000.pf1.f8543     // Catch: java.lang.Throwable -> L25b
            java.util.List r3 = p000.AbstractC0984xh.m6666(r2)     // Catch: java.lang.Throwable -> L25b
            r2.clear()     // Catch: java.lang.Throwable -> L25b
            monitor-exit(r1)
            ii0 r1 = new ii0     // Catch: java.lang.Throwable -> L246
            r2 = 14
            r1.<init>(r3, r2, r0)     // Catch: java.lang.Throwable -> L246
            r5.runOnUiThread(r1)     // Catch: java.lang.Throwable -> L246
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L246
            goto L24d
        L246:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L24d:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L25a
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "食物目录结果回调失败"
            p000.C0888ux.m5977(r1, r2, r0)
        L25a:
            return
        L25b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L25e:
            java.lang.Object r1 = r0.f11265
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.Object r2 = r0.f11266
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            java.lang.Object r3 = r0.f11267
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.f11268
            android.app.Activity r0 = (android.app.Activity) r0
            p000.pf1.m4518(r2, r3, r0, r1)
            return
        L272:
            java.lang.Object r1 = r0.f11265
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r0.f11266
            r7 = r1
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r1 = r0.f11267
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.f11268
            r4 = r0
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            java.util.concurrent.ExecutorService r0 = p000.xd1.f12139
            r0 = 80
            int r0 = p000.jx0.m3056(r7, r0)     // Catch: java.lang.Throwable -> L293
            android.graphics.Bitmap r0 = p000.xd1.m6616(r5, r0)     // Catch: java.lang.Throwable -> L293
            goto L29a
        L293:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L29a:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 == 0) goto L2ab
            java.lang.String r2 = "DYHelper"
            java.lang.String r3 = "营地种子图标加载失败 "
            java.lang.String r3 = r3.concat(r6)
            p000.C0888ux.m5977(r2, r3, r1)
        L2ab:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L2b1
            r2 = 0
            goto L2b2
        L2b1:
            r2 = r0
        L2b2:
            r3 = r2
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 != 0) goto L2b8
            goto L2e6
        L2b8:
            wd1 r1 = p000.xd1.f12140
            monitor-enter(r1)
            java.lang.Object r0 = r1.put(r5, r3)     // Catch: java.lang.Throwable -> L2e7
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L2e7
            monitor-exit(r1)
            v8 r2 = new v8     // Catch: java.lang.Throwable -> L2ce
            r8 = 5
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2ce
            r7.runOnUiThread(r2)     // Catch: java.lang.Throwable -> L2ce
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2ce
            goto L2d5
        L2ce:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L2d5:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L2e6
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "营地种子图标回调失败 "
            java.lang.String r2 = r2.concat(r6)
            p000.C0888ux.m5977(r1, r2, r0)
        L2e6:
            return
        L2e7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L2ea:
            java.lang.Object r1 = r0.f11265
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r0.f11266
            java.lang.Object r3 = r0.f11267
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.f11268
            n81 r0 = (p000.n81) r0
            p000.p81.m4398(r1, r2, r3, r0)
            return
        L2fc:
            java.lang.Object r1 = r0.f11265
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r0.f11266
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.f11267
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.f11268
            hu r0 = (p000.C0372hu) r0
            boolean r4 = r1.isFinishing()
            if (r4 != 0) goto L32a
            boolean r4 = r1.isDestroyed()
            if (r4 == 0) goto L319
            goto L32a
        L319:
            p000.AbstractC0978xb.m6589(r1, r2, r3, r0)     // Catch: java.lang.Throwable -> L31d
            goto L32a
        L31d:
            r0 = move-exception
            java.lang.String r2 = "IMTimeLabelConfigDialog"
            java.lang.String r3 = "时间标签 XML 配置弹窗打开失败"
            p000.C0888ux.m5977(r2, r3, r0)
            java.lang.String r2 = "时间标签设置"
            p000.u81.m5815(r1, r2, r0)
        L32a:
            return
        L32b:
            java.lang.Object r1 = r0.f11265
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r2 = r0.f11266
            java.lang.Object r3 = r0.f11267
            java.lang.Object r0 = r0.f11268
            java.lang.Integer r0 = (java.lang.Integer) r0
            r4 = 2117337098(0x7e34000a, float:5.981531E37)
            r5 = 0
            r1.setTag(r4, r5)
            android.os.Handler r4 = p000.ah0.f229
            boolean r4 = p000.ah0.m123()
            if (r4 != 0) goto L347
            goto L362
        L347:
            java.lang.Object r4 = p000.ah0.m163(r2)
            if (r4 != 0) goto L35c
            if (r3 == 0) goto L35a
            if (r0 == 0) goto L35a
            int r0 = r0.intValue()
            java.lang.Object r0 = p000.ah0.m162(r0, r3)
            goto L35d
        L35a:
            r0 = r5
            goto L35d
        L35c:
            r0 = r4
        L35d:
            if (r0 == 0) goto L362
            p000.ah0.m132(r1, r2, r0)
        L362:
            return
    }
}
