package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5385;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f5386;

    public /* synthetic */ ja0(android.app.Activity r1, int r2) {
            r0 = this;
            r0.f5385 = r2
            r0.f5386 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r24 = this;
            r0 = r24
            int r1 = r0.f5385
            r3 = 0
            r4 = 17
            r5 = 14
            java.lang.String r6 = "复制主页ID"
            java.lang.String r7 = "选择下载"
            java.lang.String r8 = "批量下载为内测功能，请联系开发者申请"
            r9 = 3
            r10 = 8
            r11 = 5
            r12 = 24
            r13 = 2
            r14 = 0
            r15 = 1
            android.app.Activity r2 = r0.f5386
            s62 r16 = p000.s62.f9751
            switch(r1) {
                case 0: goto L502;
                case 1: goto L4d2;
                case 2: goto L4c2;
                case 3: goto L4b3;
                case 4: goto L341;
                case 5: goto L332;
                case 6: goto L327;
                case 7: goto L318;
                case 8: goto L30b;
                case 9: goto L2fd;
                case 10: goto L2ee;
                case 11: goto L2e2;
                case 12: goto L2d7;
                case 13: goto L2ca;
                case 14: goto L2bd;
                case 15: goto L27f;
                case 16: goto L241;
                case 17: goto L234;
                case 18: goto L22e;
                case 19: goto L21f;
                case 20: goto L219;
                case 21: goto L213;
                case 22: goto L206;
                case 23: goto L1a4;
                case 24: goto L197;
                case 25: goto L189;
                case 26: goto L16b;
                case 27: goto L115;
                case 28: goto Lbe;
                default: goto L1f;
            }
        L1f:
            java.lang.String r0 = "正在按投喂设置实时校验食物和价格上限"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r15)
            r0.show()
            f9 r1 = new f9
            r0 = 28
            r1.<init>(r2, r0)
            r2.getClass()
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L45
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L3f
            r0 = r2
        L3f:
            p000.ui1.m5896(r0)     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            r0 = move-exception
            goto L48
        L45:
            r3 = r16
            goto L4d
        L48:
            eo1 r3 = new eo1
            r3.<init>(r0)
        L4d:
            java.lang.Throwable r0 = p000.fo1.m2190(r3)
            android.app.Activity r3 = r1.f3827
            if (r0 == 0) goto L7a
            java.lang.String r1 = "rfac809154b3e7cbf"
            java.lang.String r2 = "手动投喂初始化配置失败"
            p000.C0888ux.m5977(r1, r2, r0)
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L6a
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getSimpleName()
        L6a:
            java.lang.String r0 = "投喂设置不可用: "
            java.lang.String r0 = r0.concat(r1)
            q71 r1 = p000.q71.f8896
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r15)
            r0.show()
            goto Lbd
        L7a:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jf1.f5454
            boolean r0 = r0.compareAndSet(r14, r15)
            if (r0 != 0) goto L8e
            q71 r0 = p000.q71.f8896
            java.lang.String r0 = "投喂正在执行，请稍后"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r15)
            r0.show()
            goto Lbd
        L8e:
            java.util.concurrent.atomic.AtomicReference r0 = p000.ry1.f9578
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto La1
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 == 0) goto La1
            goto La9
        La1:
            java.lang.Class r0 = r2.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
        La9:
            java.lang.Thread r3 = new java.lang.Thread
            e9 r4 = new e9
            r5 = 27
            r4.<init>(r0, r2, r1, r5)
            java.lang.String r0 = "rdecc9b45dc2fda"
            r3.<init>(r4, r0)
            r3.setDaemon(r15)
            r3.start()
        Lbd:
            return r16
        Lbe:
            java.lang.String r0 = "正在只读获取全部火花会话的亲密度信息"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r15)
            r0.show()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.ue1.f10717
            g71 r0 = new g71
            r0.<init>(r2, r13)
            r2.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.ue1.f10717
            boolean r1 = r1.compareAndSet(r14, r15)
            if (r1 != 0) goto Le5
            java.lang.String r1 = "亲密度调试正在执行，请稍后"
            android.app.Activity r0 = r0.f4266
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r14)
            r0.show()
            goto L114
        Le5:
            java.util.concurrent.atomic.AtomicReference r1 = p000.ry1.f9578
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto Lf8
            java.lang.Class r1 = r1.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 == 0) goto Lf8
            goto L100
        Lf8:
            java.lang.Class r1 = r2.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
        L100:
            java.lang.Thread r3 = new java.lang.Thread
            e9 r4 = new e9
            r5 = 25
            r4.<init>(r1, r2, r0, r5)
            java.lang.String r0 = "r4213f2249a89b8a0"
            r3.<init>(r4, r0)
            r3.setDaemon(r15)
            r3.start()
        L114:
            return r16
        L115:
            java.lang.String r0 = "正在获取全部火花会话的食物列表"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r15)
            r0.show()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.if1.f5067
            f9 r0 = new f9
            r1 = 21
            r0.<init>(r2, r1)
            r2.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.if1.f5067
            boolean r1 = r1.compareAndSet(r14, r15)
            if (r1 != 0) goto L13e
            java.lang.String r1 = "食物列表调试正在执行，请稍后"
            android.app.Activity r0 = r0.f3827
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r14)
            r0.show()
            goto L16a
        L13e:
            java.util.concurrent.atomic.AtomicReference r1 = p000.ry1.f9578
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L151
            java.lang.Class r1 = r1.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 == 0) goto L151
            goto L159
        L151:
            java.lang.Class r1 = r2.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
        L159:
            java.lang.Thread r3 = new java.lang.Thread
            e9 r4 = new e9
            r5 = 26
            r4.<init>(r1, r2, r0, r5)
            java.lang.String r0 = "r6af06f132d017cc5"
            r3.<init>(r4, r0)
            r3.start()
        L16a:
            return r16
        L16b:
            boolean r0 = p000.AbstractC0976x9.m6528()
            if (r0 != 0) goto L17b
            java.lang.String r0 = "营地管理仅限内测用户使用"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r15)
            r0.show()
            goto L188
        L17b:
            r2.getClass()
            n9 r0 = new n9
            r1 = 29
            r0.<init>(r2, r1)
            r2.runOnUiThread(r0)
        L188:
            return r16
        L189:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.wg1.f11716
            r2.getClass()
            hg1 r0 = new hg1
            r0.<init>(r2, r15)
            r2.runOnUiThread(r0)
            return r16
        L197:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r0.<init>(r2, r12)
            java.lang.String r1 = "下载视频"
            p000.q71.m4783(r2, r1, r0)
            return r16
        L1a4:
            java.lang.String r0 = "正在只读拉取火星任务，不会发送消息或领取奖励"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r15)
            r0.show()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.ag1.f220
            f9 r0 = new f9
            r1 = 9
            r0.<init>(r2, r1)
            r2.getClass()
            boolean r1 = p000.AbstractC0976x9.m6529()
            if (r1 != 0) goto L1c9
            java.lang.String r1 = "火星任务调试仅限内测用户使用"
            zf1 r1 = p000.ag1.m110(r1, r14)
            r0.invoke(r1)
            goto L205
        L1c9:
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.ag1.f220
            boolean r1 = r1.compareAndSet(r14, r15)
            if (r1 != 0) goto L1db
            java.lang.String r1 = "火星任务调试正在执行，请稍后"
            zf1 r1 = p000.ag1.m110(r1, r14)
            r0.invoke(r1)
            goto L205
        L1db:
            java.util.concurrent.atomic.AtomicReference r1 = p000.ry1.f9578
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L1ee
            java.lang.Class r1 = r1.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 == 0) goto L1ee
            goto L1f6
        L1ee:
            java.lang.Class r1 = r2.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
        L1f6:
            java.lang.Thread r3 = new java.lang.Thread
            e9 r4 = new e9
            r4.<init>(r1, r2, r0)
            java.lang.String r0 = "r786394e9ad6027b0"
            r3.<init>(r4, r0)
            r3.start()
        L205:
            return r16
        L206:
            q71 r0 = p000.q71.f8896
            g71 r0 = new g71
            r0.<init>(r2, r11)
            java.lang.String r1 = "复制链接"
            p000.q71.m4783(r2, r1, r0)
            return r16
        L213:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE
            r0.show(r2, r13)
            return r16
        L219:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE
            r0.show(r2, r13)
            return r16
        L21f:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r1 = 11
            r0.<init>(r2, r1)
            java.lang.String r1 = "作品书签"
            p000.q71.m4783(r2, r1, r0)
            return r16
        L22e:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE
            r0.show(r2, r15)
            return r16
        L234:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r0.<init>(r2, r10)
            java.lang.String r1 = "作者主页书签"
            p000.q71.m4783(r2, r1, r0)
            return r16
        L241:
            q71 r1 = p000.q71.f8896
            boolean r1 = p000.AbstractC0976x9.m6527()
            android.app.Activity r0 = r0.f5386
            if (r1 == 0) goto L277
            cj1 r1 = p000.cj1.f2169
            r0.getClass()
            android.os.Handler r1 = com.example.dyhelper.p002ui.C0182.f2694
            java.lang.String r19 = "调试获取主页作品"
            java.lang.String r1 = com.example.dyhelper.p002ui.C0182.m1592(r19)
            java.lang.String r18 = com.example.dyhelper.p002ui.C0182.m1593(r1)
            by0 r17 = new by0
            java.lang.String r20 = "正在识别主页用户..."
            r21 = -1
            r23 = 1
            r22 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23)
            com.example.dyhelper.p002ui.C0182.m1597(r17)
            java.util.concurrent.ExecutorService r1 = p000.cj1.f2171
            hg1 r2 = new hg1
            r2.<init>(r0, r9)
            r1.execute(r2)
            goto L27e
        L277:
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r8, r15)
            r0.show()
        L27e:
            return r16
        L27f:
            q71 r1 = p000.q71.f8896
            boolean r1 = p000.AbstractC0976x9.m6527()
            android.app.Activity r0 = r0.f5386
            if (r1 == 0) goto L2b5
            cj1 r1 = p000.cj1.f2169
            r0.getClass()
            android.os.Handler r1 = com.example.dyhelper.p002ui.C0182.f2694
            java.lang.String r19 = "主动获取主页作品"
            java.lang.String r1 = com.example.dyhelper.p002ui.C0182.m1592(r19)
            java.lang.String r18 = com.example.dyhelper.p002ui.C0182.m1593(r1)
            by0 r17 = new by0
            java.lang.String r20 = "正在识别主页用户..."
            r21 = -1
            r23 = 1
            r22 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23)
            com.example.dyhelper.p002ui.C0182.m1597(r17)
            java.util.concurrent.ExecutorService r1 = p000.cj1.f2171
            hg1 r2 = new hg1
            r2.<init>(r0, r13)
            r1.execute(r2)
            goto L2bc
        L2b5:
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r8, r15)
            r0.show()
        L2bc:
            return r16
        L2bd:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r1 = 20
            r0.<init>(r2, r1)
            p000.q71.m4783(r2, r7, r0)
            return r16
        L2ca:
            q71 r0 = p000.q71.f8896
            g71 r0 = new g71
            r0.<init>(r2, r14)
            java.lang.String r1 = "复制文案"
            p000.q71.m4783(r2, r1, r0)
            return r16
        L2d7:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r0.<init>(r2, r5)
            p000.q71.m4783(r2, r6, r0)
            return r16
        L2e2:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r1 = 6
            r0.<init>(r2, r1)
            p000.q71.m4783(r2, r6, r0)
            return r16
        L2ee:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r1 = 13
            r0.<init>(r2, r1)
            java.lang.String r1 = "打开作者主页"
            p000.q71.m4783(r2, r1, r0)
            return r16
        L2fd:
            q71 r0 = p000.q71.f8896
            g71 r0 = new g71
            r1 = 4
            r0.<init>(r2, r1)
            java.lang.String r1 = "预览图片"
            p000.q71.m4783(r2, r1, r0)
            return r16
        L30b:
            q71 r0 = p000.q71.f8896
            g71 r0 = new g71
            r0.<init>(r2, r9)
            java.lang.String r1 = "复制下载直链"
            p000.q71.m4783(r2, r1, r0)
            return r16
        L318:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r1 = 19
            r0.<init>(r2, r1)
            java.lang.String r1 = "下载原画质"
            p000.q71.m4783(r2, r1, r0)
            return r16
        L327:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r0.<init>(r2, r4)
            p000.q71.m4783(r2, r7, r0)
            return r16
        L332:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r1 = 16
            r0.<init>(r2, r1)
            java.lang.String r1 = "下载音频"
            p000.q71.m4783(r2, r1, r0)
            return r16
        L341:
            q71 r0 = p000.q71.f8896
            xx r0 = p000.jx0.m3049(r2)
            android.widget.LinearLayout r1 = p000.AbstractC0602nx.m4123(r2, r15)
            int r6 = p000.q71.m4796(r2, r12)
            int r7 = p000.q71.m4796(r2, r10)
            int r8 = p000.q71.m4796(r2, r12)
            r1.setPadding(r6, r7, r8, r14)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r2)
            r7 = 1096810496(0x41600000, float:14.0)
            r6.setTextSize(r7)
            r6.setTypeface(r3, r15)
            java.lang.String r7 = r0.f12360
            int r8 = android.graphics.Color.parseColor(r7)
            r6.setTextColor(r8)
            r6.setGravity(r4)
            r4 = 12
            int r8 = p000.q71.m4796(r2, r4)
            int r9 = p000.q71.m4796(r2, r11)
            int r4 = p000.q71.m4796(r2, r4)
            int r10 = p000.q71.m4796(r2, r11)
            r6.setPadding(r8, r9, r4, r10)
            java.lang.String r4 = r0.f12361
            r8 = 99
            android.graphics.drawable.GradientDrawable r4 = p000.jx0.m3062(r8, r2, r4)
            r6.setBackground(r4)
            r1.addView(r6)
            x01 r4 = p000.x01.f11964
            android.view.LayoutInflater r4 = r4.m6477(r2)
            r8 = 2131492971(0x7f0c006b, float:1.8609409E38)
            android.view.View r4 = r4.inflate(r8, r1, r14)
            r8 = 2131296905(0x7f090289, float:1.821174E38)
            android.view.View r8 = r4.findViewById(r8)
            android.widget.SeekBar r8 = (android.widget.SeekBar) r8
            if (r8 != 0) goto L3b0
            goto L4b2
        L3b0:
            int r9 = android.graphics.Color.parseColor(r7)     // Catch: java.lang.Throwable -> L3ce
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)     // Catch: java.lang.Throwable -> L3ce
            r8.setProgressTintList(r9)     // Catch: java.lang.Throwable -> L3ce
            java.lang.String r9 = r0.f12353     // Catch: java.lang.Throwable -> L3ce
            int r9 = android.graphics.Color.parseColor(r9)     // Catch: java.lang.Throwable -> L3ce
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)     // Catch: java.lang.Throwable -> L3ce
            r8.setProgressBackgroundTintList(r9)     // Catch: java.lang.Throwable -> L3ce
            r8.setThumbTintList(r3)     // Catch: java.lang.Throwable -> L3ce
            r8.setHapticFeedbackEnabled(r15)     // Catch: java.lang.Throwable -> L3ce
        L3ce:
            java.util.List r9 = p000.q71.f8897
            int r10 = p000.AbstractC1021yh.m6858(r9)
            r8.setMax(r10)
            java.lang.String r10 = "global_video_speed"
            r11 = 1065353216(0x3f800000, float:1.0)
            android.content.SharedPreferences r12 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L3e3
            float r11 = r12.getFloat(r10, r11)     // Catch: java.lang.Throwable -> L3e3
        L3e3:
            float r10 = p000.q71.m4771(r11)
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            int r10 = r9.indexOf(r10)
            if (r10 >= 0) goto L3f2
            goto L3f3
        L3f2:
            r14 = r10
        L3f3:
            r8.setProgress(r14)
            java.lang.Object r9 = r9.get(r14)
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            java.lang.String r9 = p000.q71.m4801(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = "x"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r6.setText(r9)
            tk r9 = new tk
            r9.<init>(r15, r6)
            r8.setOnSeekBarChangeListener(r9)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r8 = 48
            int r8 = p000.q71.m4796(r2, r8)
            r9 = -1
            r6.<init>(r9, r8)
            int r8 = p000.q71.m4796(r2, r13)
            r6.topMargin = r8
            r1.addView(r4, r6)
            boolean r4 = r0.f12350
            if (r4 == 0) goto L43d
            r4 = 16974374(0x1030226, float:2.4062441E-38)
            goto L440
        L43d:
            r4 = 16974394(0x103023a, float:2.4062497E-38)
        L440:
            android.app.AlertDialog$Builder r6 = new android.app.AlertDialog$Builder
            r6.<init>(r2, r4)
            java.lang.String r4 = "全局视频倍速"
            android.app.AlertDialog$Builder r4 = r6.setTitle(r4)
            android.app.AlertDialog$Builder r1 = r4.setView(r1)
            java.lang.String r4 = "完成"
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r4, r3)
            android.app.AlertDialog r1 = r1.create()
            r1.show()
            android.view.Window r4 = r1.getWindow()
            if (r4 == 0) goto L488
            java.lang.String r6 = r0.f12352
            android.graphics.drawable.GradientDrawable r5 = p000.jx0.m3062(r5, r2, r6)
            r4.setBackgroundDrawable(r5)
            r5 = 1055286886(0x3ee66666, float:0.45)
            r4.setDimAmount(r5)
            r4.addFlags(r13)
            android.content.res.Resources r5 = r2.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            float r5 = (float) r5
            r6 = 1063004406(0x3f5c28f6, float:0.86)
            float r5 = r5 * r6
            int r5 = (int) r5
            r6 = -2
            r4.setLayout(r5, r6)
        L488:
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r4 = "id"
            java.lang.String r5 = "android"
            java.lang.String r6 = "alertTitle"
            int r2 = r2.getIdentifier(r6, r4, r5)
            if (r2 == 0) goto L4a5
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L4a5
            java.lang.String r0 = r0.f12355
            p000.lz1.m3699(r0, r2, r3, r15)
        L4a5:
            android.widget.Button r0 = r1.getButton(r9)
            if (r0 == 0) goto L4b2
            int r1 = android.graphics.Color.parseColor(r7)
            r0.setTextColor(r1)
        L4b2:
            return r16
        L4b3:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r4 = 12
            r0.<init>(r2, r4)
            java.lang.String r1 = "下载作品"
            p000.q71.m4783(r2, r1, r0)
            return r16
        L4c2:
            q71 r0 = p000.q71.f8896
            r2.getClass()
            n9 r0 = new n9
            r1 = 23
            r0.<init>(r2, r1)
            r2.runOnUiThread(r0)
            return r16
        L4d2:
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L4dd
            android.view.View r0 = r0.getDecorView()
            goto L4de
        L4dd:
            r0 = r3
        L4de:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L4e5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L4e6
        L4e5:
            r0 = r3
        L4e6:
            if (r0 == 0) goto L501
            java.lang.String r1 = "dyhelper_gesture_position_preview"
            android.view.View r0 = r0.findViewWithTag(r1)
            if (r0 != 0) goto L4f1
            goto L501
        L4f1:
            android.view.ViewParent r1 = r0.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L4fc
            r3 = r1
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L4fc:
            if (r3 == 0) goto L501
            r3.removeView(r0)
        L501:
            return r16
        L502:
            com.example.dyhelper.p002ui.AbstractC0172.m1587(r2)     // Catch: java.lang.Throwable -> L506
            goto L51e
        L506:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "创建手势位置预览失败: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "GesturePositionPreview"
            p000.C0888ux.m5987(r2, r1, r0)
        L51e:
            return r16
    }
}
