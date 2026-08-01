package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zk0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13142;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f13143;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.C0276f8 f13144;

    public /* synthetic */ zk0(android.app.Activity r1, p000.C0276f8 r2, int r3) {
            r0 = this;
            r0.f13142 = r3
            r0.f13143 = r1
            r0.f13144 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ zk0(p000.C0276f8 r2, android.app.Activity r3) {
            r1 = this;
            r0 = 2
            r1.f13142 = r0
            r1.<init>()
            r1.f13144 = r2
            r1.f13143 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r46 = this;
            r0 = r46
            int r1 = r0.f13142
            java.lang.String r2 = "DYHelper"
            r3 = 0
            android.app.Activity r4 = r0.f13143
            r5 = 1
            f8 r6 = r0.f13144
            r7 = 0
            switch(r1) {
                case 0: goto L799;
                case 1: goto L126;
                case 2: goto L73;
                case 3: goto L1f;
                default: goto L10;
            }
        L10:
            java.lang.String r0 = "未找到 8K/4K 原画质，改用普通视频下载"
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r7)
            r0.show()
            qy0 r0 = p000.qy0.f9157
            r0.m5026(r4, r6, r3)
            return
        L1f:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r4)
            java.lang.String r1 = "未找到无水印资源"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.String r1 = r6.f3780
            if (r1 != 0) goto L30
            java.lang.String r1 = "未知"
        L30:
            java.util.List r2 = r6.f3784
            if (r2 == 0) goto L39
            int r2 = r2.size()
            goto L3a
        L39:
            r2 = r7
        L3a:
            java.util.List r4 = r6.f3778
            if (r4 == 0) goto L43
            int r4 = r4.size()
            goto L44
        L43:
            r4 = r7
        L44:
            java.util.List r5 = r6.f3796
            if (r5 == 0) goto L4c
            int r7 = r5.size()
        L4c:
            java.lang.String r5 = "\n视频候选数："
            java.lang.String r6 = "\n动图条目数："
            java.lang.String r8 = "当前作品已识别为动图 / LivePhoto，但没有从 Aweme 数据中找到可下载的视频或图片资源。\n\n识别原因："
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4135(r2, r8, r1, r5, r6)
            r1.append(r4)
            java.lang.String r2 = "\n图片数："
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            java.lang.String r1 = "确定"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r3)
            r0.show()
            return
        L73:
            android.app.Activity r1 = r0.f13143
            java.lang.String r0 = "showSelectiveDownloadDialog awemeId="
            qy0 r3 = p000.qy0.f9157     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = r6.f3800     // Catch: java.lang.Throwable -> L86
            h8 r4 = r6.f3798     // Catch: java.lang.Throwable -> L86
            java.util.List r8 = r6.f3788     // Catch: java.lang.Throwable -> L86
            if (r8 == 0) goto L8a
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L86
            goto L8b
        L86:
            r0 = move-exception
            r7 = r1
            goto L107
        L8a:
            r8 = r7
        L8b:
            java.util.List r9 = r6.f3796     // Catch: java.lang.Throwable -> L86
            if (r9 == 0) goto L94
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L86
            goto L95
        L94:
            r9 = r7
        L95:
            java.util.List r10 = r6.f3778     // Catch: java.lang.Throwable -> L86
            if (r10 == 0) goto L9e
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L86
            goto L9f
        L9e:
            r10 = r7
        L9f:
            java.util.List r11 = r6.f3786     // Catch: java.lang.Throwable -> L86
            if (r11 == 0) goto La8
            int r11 = r11.size()     // Catch: java.lang.Throwable -> L86
            goto La9
        La8:
            r11 = r7
        La9:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L86
            r12.append(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = ", type="
            r12.append(r0)     // Catch: java.lang.Throwable -> L86
            r12.append(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = ", pageMediaItems="
            r12.append(r0)     // Catch: java.lang.Throwable -> L86
            r12.append(r8)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = ", imageUrls="
            r12.append(r0)     // Catch: java.lang.Throwable -> L86
            r12.append(r9)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = ", animatedUrls="
            r12.append(r0)     // Catch: java.lang.Throwable -> L86
            r12.append(r10)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = ", livePhotoItems="
            r12.append(r0)     // Catch: java.lang.Throwable -> L86
            r12.append(r11)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> L86
            p000.qy0.m4953(r0)     // Catch: java.lang.Throwable -> L86
            java.util.ArrayList r8 = p000.qy0.m4974(r6)     // Catch: java.lang.Throwable -> L86
            boolean r0 = r8.isEmpty()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto Lf0
            java.lang.String r0 = "没有可选择下载的资源"
            p000.qy0.m4991(r1, r0)     // Catch: java.lang.Throwable -> L86
            goto L125
        Lf0:
            dz0 r0 = new dz0     // Catch: java.lang.Throwable -> L86
            zx0 r12 = new zx0     // Catch: java.lang.Throwable -> L86
            r12.<init>(r1, r6, r7)     // Catch: java.lang.Throwable -> L86
            yy0 r9 = p000.yy0.f12874     // Catch: java.lang.Throwable -> L86
            java.lang.String r10 = "选择要下载的内容"
            java.lang.String r11 = "多选"
            r6 = r0
            r7 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L106
            r6.m1830()     // Catch: java.lang.Throwable -> L106
            goto L125
        L106:
            r0 = move-exception
        L107:
            java.lang.String r1 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "选择下载弹窗打开失败："
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.widget.Toast r1 = android.widget.Toast.makeText(r7, r1, r5)
            r1.show()
            java.lang.String r1 = "选择下载弹窗打开失败"
            p000.C0888ux.m5977(r2, r1, r0)
        L125:
            return
        L126:
            android.os.Handler r1 = p000.dl0.f3213
            r1 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.CopyOnWriteArrayList r4 = p000.xk0.f12198
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L13f:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L157
            java.lang.Object r8 = r4.next()
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L13f
            r6.add(r8)
            goto L13f
        L157:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r4 = r6.iterator()
        L160:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L177
            java.lang.Object r6 = r4.next()
            r8 = r6
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            boolean r8 = r8.isRecycled()
            if (r8 != 0) goto L160
            r11.add(r6)
            goto L160
        L177:
            java.util.concurrent.CopyOnWriteArrayList r4 = p000.xk0.f12199
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
            boolean r6 = r11.isEmpty()
            r8 = 3
            android.app.Activity r12 = r0.f13143
            r9 = 1095761920(0x41500000, float:13.0)
            r10 = -1
            r13 = 17
            java.lang.String r14 = "#EE111827"
            if (r6 == 0) goto L290
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L284
            r4.size()
            f9 r0 = new f9
            r0.<init>(r12, r8)
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
            r4.<init>(r12)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r12)
            r6.setOrientation(r5)
            r6.setGravity(r5)
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            int r11 = android.graphics.Color.parseColor(r14)
            r8.setColor(r11)
            java.lang.Object r11 = r0.invoke(r2)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            float r11 = (float) r11
            r8.setCornerRadius(r11)
            r6.setBackground(r8)
            r8 = 28
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r11 = r0.invoke(r8)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r14 = 32
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r14 = r0.invoke(r14)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            java.lang.Object r15 = r0.invoke(r8)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.Object r8 = r0.invoke(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r6.setPadding(r11, r14, r15, r8)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r12)
            java.lang.String r11 = "🖼️"
            r8.setText(r11)
            r11 = 1109393408(0x42200000, float:40.0)
            r8.setTextSize(r11)
            r8.setGravity(r13)
            r6.addView(r8)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r12)
            java.lang.String r11 = "图片未缓存"
            r8.setText(r11)
            r11 = 1099431936(0x41880000, float:17.0)
            r8.setTextSize(r11)
            r8.setTextColor(r10)
            r8.setTypeface(r3, r5)
            r8.setGravity(r13)
            r6.addView(r8)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r12)
            java.lang.String r5 = "请滑动浏览图文，让抖音渲染图片后再试"
            r3.setText(r5)
            r3.setTextSize(r9)
            java.lang.String r5 = "#AAAAAA"
            int r5 = android.graphics.Color.parseColor(r5)
            r3.setTextColor(r5)
            r3.setGravity(r13)
            java.lang.Object r1 = r0.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3.setPadding(r7, r1, r7, r2)
            r6.addView(r3)
            al0 r1 = new al0
            r1.<init>(r6, r7)
            java.lang.String r14 = "知道了"
            java.lang.String r15 = "#FFFFFF"
            java.lang.String r16 = "#333333"
            r13 = r0
            r17 = r1
            android.widget.TextView r0 = p000.dl0.m1773(r12, r13, r14, r15, r16, r17)
            r6.addView(r0)
            android.app.AlertDialog$Builder r0 = r4.setView(r6)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            goto L798
        L284:
            r4 = r12
            java.lang.String r0 = "未捕获到图片，请滑动图文后再试"
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r5)
            r0.show()
            goto L798
        L290:
            r4 = r12
            r6 = 195(0xc3, float:2.73E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            f9 r12 = new f9
            r12.<init>(r4, r8)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            um1 r15 = new um1
            r15.<init>()
            android.widget.LinearLayout r13 = p000.AbstractC0602nx.m4123(r4, r5)
            android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
            r9.<init>()
            int r14 = android.graphics.Color.parseColor(r14)
            r9.setColor(r14)
            java.lang.Object r2 = r12.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            float r2 = (float) r2
            r9.setCornerRadius(r2)
            r13.setBackground(r9)
            r2 = r15
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r4)
            int r9 = r11.size()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r7 = "选择图片（共 "
            r14.<init>(r7)
            r14.append(r9)
            java.lang.String r7 = " 张）"
            r14.append(r7)
            java.lang.String r7 = r14.toString()
            r15.setText(r7)
            r7 = 1097859072(0x41700000, float:15.0)
            r15.setTextSize(r7)
            r15.setTextColor(r10)
            r15.setTypeface(r3, r5)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r14 = 1065353216(0x3f800000, float:1.0)
            r18 = r3
            r3 = 0
            r7.<init>(r3, r9, r14)
            r15.setLayoutParams(r7)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r4)
            java.lang.String r7 = "全选"
            r3.setText(r7)
            r7 = 1094713344(0x41400000, float:12.0)
            r3.setTextSize(r7)
            java.lang.String r7 = "#FE2C55"
            int r14 = android.graphics.Color.parseColor(r7)
            r3.setTextColor(r14)
            r14 = 12
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r19 = r12.invoke(r14)
            java.lang.Number r19 = (java.lang.Number) r19
            int r9 = r19.intValue()
            r19 = 5
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)
            java.lang.Object r19 = r12.invoke(r10)
            java.lang.Number r19 = (java.lang.Number) r19
            int r5 = r19.intValue()
            java.lang.Object r19 = r12.invoke(r14)
            java.lang.Number r19 = (java.lang.Number) r19
            r22 = r2
            int r2 = r19.intValue()
            java.lang.Object r19 = r12.invoke(r10)
            java.lang.Number r19 = (java.lang.Number) r19
            int r0 = r19.intValue()
            r3.setPadding(r9, r5, r2, r0)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            java.lang.String r2 = "#"
            java.lang.String r5 = "#22"
            java.lang.String r2 = p000.x02.m6483(r7, r2, r5)
            int r2 = android.graphics.Color.parseColor(r2)
            r0.setColor(r2)
            r2 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r9 = r12.invoke(r5)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            r0.setCornerRadius(r9)
            r3.setBackground(r0)
            r9 = 1
            r3.setClickable(r9)
            r9 = 0
            android.widget.LinearLayout r0 = p000.AbstractC0602nx.m4123(r4, r9)
            r9 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r0.setGravity(r9)
            r23 = 18
            java.lang.Integer r9 = java.lang.Integer.valueOf(r23)
            java.lang.Object r9 = r12.invoke(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r23 = r12.invoke(r2)
            java.lang.Number r23 = (java.lang.Number) r23
            r24 = r7
            int r7 = r23.intValue()
            r23 = 14
            r25 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            java.lang.Object r23 = r12.invoke(r2)
            java.lang.Number r23 = (java.lang.Number) r23
            r26 = r2
            int r2 = r23.intValue()
            java.lang.Object r23 = r12.invoke(r14)
            java.lang.Number r23 = (java.lang.Number) r23
            r27 = r6
            int r6 = r23.intValue()
            r0.setPadding(r9, r7, r2, r6)
            r0.addView(r15)
            r0.addView(r3)
            r13.addView(r0)
            android.view.View r0 = new android.view.View
            r0.<init>(r4)
            java.lang.String r2 = "#22FFFFFF"
            int r6 = android.graphics.Color.parseColor(r2)
            r0.setBackgroundColor(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -1
            r9 = 1
            r6.<init>(r7, r9)
            r0.setLayoutParams(r6)
            r13.addView(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.widget.LinearLayout r7 = p000.AbstractC0602nx.m4123(r4, r9)
            java.lang.Object r9 = r12.invoke(r1)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r23 = r12.invoke(r1)
            java.lang.Number r23 = (java.lang.Number) r23
            r28 = r2
            int r2 = r23.intValue()
            java.lang.Object r23 = r12.invoke(r1)
            java.lang.Number r23 = (java.lang.Number) r23
            r29 = r3
            int r3 = r23.intValue()
            r23 = 4
            r30 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r23)
            java.lang.Object r13 = r12.invoke(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r7.setPadding(r9, r2, r3, r13)
            r2 = 2
            java.util.ArrayList r3 = p000.AbstractC0984xh.m6631(r2, r11)
            java.util.Iterator r3 = r3.iterator()
            r9 = 0
        L440:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L66f
            java.lang.Object r13 = r3.next()
            int r23 = r9 + 1
            if (r9 < 0) goto L66b
            java.util.List r13 = (java.util.List) r13
            r31 = r2
            r32 = r3
            r2 = 0
            android.widget.LinearLayout r3 = p000.AbstractC0602nx.m4123(r4, r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r33 = r9
            r20 = r13
            r9 = -1
            r13 = -2
            r2.<init>(r9, r13)
            java.lang.Object r9 = r12.invoke(r5)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2.bottomMargin = r9
            r3.setLayoutParams(r2)
            java.util.Iterator r2 = r20.iterator()
            r9 = 0
        L478:
            boolean r34 = r2.hasNext()
            if (r34 == 0) goto L620
            java.lang.Object r34 = r2.next()
            int r35 = r9 + 1
            if (r9 < 0) goto L61c
            r13 = r34
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            int r34 = r33 * 2
            int r41 = r34 + r9
            r34 = r2
            bl0 r2 = new bl0
            r42 = r5
            r5 = 0
            r2.<init>(r8, r15, r11, r5)
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            r5.<init>(r4)
            r40 = r2
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            java.lang.String r36 = "#33FFFFFF"
            r43 = r8
            int r8 = android.graphics.Color.parseColor(r36)
            r2.setColor(r8)
            java.lang.Object r8 = r12.invoke(r1)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            float r8 = (float) r8
            r2.setCornerRadius(r8)
            r5.setBackground(r2)
            r2 = 1
            r5.setClipToOutline(r2)
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r4)
            android.widget.ImageView$ScaleType r8 = android.widget.ImageView.ScaleType.CENTER_CROP
            r2.setScaleType(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r44 = r9
            r9 = -1
            r8.<init>(r9, r9)
            r2.setLayoutParams(r8)
            r2.setImageBitmap(r13)
            r6.add(r2)
            r5.addView(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r4)
            int r8 = r41 + 1
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r2.setText(r8)
            r8 = 1092616192(0x41200000, float:10.0)
            r2.setTextSize(r8)
            r9 = -1
            r2.setTextColor(r9)
            java.lang.Object r8 = r12.invoke(r10)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r31)
            java.lang.Object r13 = r12.invoke(r9)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.Object r36 = r12.invoke(r10)
            java.lang.Number r36 = (java.lang.Number) r36
            r45 = r6
            int r6 = r36.intValue()
            java.lang.Object r9 = r12.invoke(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2.setPadding(r8, r13, r6, r9)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            java.lang.String r8 = "#99000000"
            int r8 = android.graphics.Color.parseColor(r8)
            r6.setColor(r8)
            java.lang.Object r8 = r12.invoke(r10)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            float r8 = (float) r8
            r6.setCornerRadius(r8)
            r2.setBackground(r6)
            r5.addView(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r4)
            java.lang.String r6 = "✓"
            r2.setText(r6)
            r6 = 1095761920(0x41500000, float:13.0)
            r2.setTextSize(r6)
            r9 = -1
            r2.setTextColor(r9)
            r8 = 17
            r2.setGravity(r8)
            android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
            r9.<init>()
            int r13 = android.graphics.Color.parseColor(r24)
            r9.setColor(r13)
            java.lang.Object r13 = r12.invoke(r14)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            float r13 = (float) r13
            r9.setCornerRadius(r13)
            r2.setBackground(r9)
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r13 = 26
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r16 = r12.invoke(r13)
            java.lang.Number r16 = (java.lang.Number) r16
            int r6 = r16.intValue()
            java.lang.Object r13 = r12.invoke(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r9.<init>(r6, r13)
            r6 = 8388661(0x800035, float:1.1755018E-38)
            r9.gravity = r6
            r6 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r13 = r12.invoke(r6)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r9.rightMargin = r13
            java.lang.Object r6 = r12.invoke(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r9.topMargin = r6
            r2.setLayoutParams(r9)
            r6 = 8
            r2.setVisibility(r6)
            r0.add(r2)
            r5.addView(r2)
            qm1 r37 = new qm1
            r37.<init>()
            yk0 r36 = new yk0
            r38 = r2
            r39 = r5
            r36.<init>(r37, r38, r39, r40, r41)
            r5 = r36
            r2 = r39
            r2.setOnClickListener(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r9 = r27
            java.lang.Object r13 = r12.invoke(r9)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r6 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r6, r13, r8)
            java.lang.Object r6 = r12.invoke(r10)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r44 != 0) goto L608
            r5.rightMargin = r6
            goto L60a
        L608:
            r5.leftMargin = r6
        L60a:
            r3.addView(r2, r5)
            r27 = r9
            r2 = r34
            r9 = r35
            r5 = r42
            r8 = r43
            r6 = r45
            r13 = -2
            goto L478
        L61c:
            p000.AbstractC1021yh.m6917()
            throw r18
        L620:
            r42 = r5
            r45 = r6
            r43 = r8
            r9 = r27
            int r2 = r20.size()
            r5 = 1
            if (r2 != r5) goto L656
            android.view.View r2 = new android.view.View
            r2.<init>(r4)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            java.lang.Object r6 = r12.invoke(r9)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r8 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r8, r6, r13)
            java.lang.Object r6 = r12.invoke(r10)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5.leftMargin = r6
            r3.addView(r2, r5)
            goto L658
        L656:
            r13 = 1065353216(0x3f800000, float:1.0)
        L658:
            r7.addView(r3)
            r27 = r9
            r9 = r23
            r2 = r31
            r3 = r32
            r5 = r42
            r8 = r43
            r6 = r45
            goto L440
        L66b:
            p000.AbstractC1021yh.m6917()
            throw r18
        L66f:
            r31 = r2
            r45 = r6
            r43 = r8
            r13 = 1065353216(0x3f800000, float:1.0)
            android.widget.ScrollView r2 = new android.widget.ScrollView
            r2.<init>(r4)
            r3 = r31
            r2.setOverScrollMode(r3)
            r3 = 0
            r2.setVerticalScrollBarEnabled(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = 460(0x1cc, float:6.45E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r12.invoke(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r9 = -1
            r3.<init>(r9, r5)
            r2.setLayoutParams(r3)
            r2.addView(r7)
            r3 = r30
            r3.addView(r2)
            r21 = r9
            cl0 r9 = new cl0
            r16 = 0
            r2 = r12
            r12 = r0
            r0 = r2
            r8 = r13
            r7 = r21
            r2 = r22
            r14 = r29
            r10 = r43
            r13 = r45
            r5 = -2
            r6 = 16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r14.setOnClickListener(r9)
            android.view.View r9 = new android.view.View
            r9.<init>(r4)
            int r12 = android.graphics.Color.parseColor(r28)
            r9.setBackgroundColor(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r13 = 1
            r12.<init>(r7, r13)
            r9.setLayoutParams(r12)
            r3.addView(r9)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r4)
            r9 = 0
            r7.setOrientation(r9)
            r7.setGravity(r6)
            r6 = r26
            java.lang.Object r9 = r0.invoke(r6)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r12 = r0.invoke(r1)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            java.lang.Object r6 = r0.invoke(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r13 = r25
            java.lang.Object r13 = r0.invoke(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r7.setPadding(r9, r12, r6, r13)
            ei r6 = new ei
            r9 = 1
            r6.<init>(r2, r9)
            java.lang.String r14 = "取消"
            java.lang.String r15 = "#888888"
            java.lang.String r16 = "#22FFFFFF"
            r13 = r0
            r12 = r4
            r17 = r6
            android.widget.TextView r0 = p000.dl0.m1773(r12, r13, r14, r15, r16, r17)
            r4 = r13
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r5, r5)
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r6.rightMargin = r1
            r0.setLayoutParams(r6)
            r7.addView(r0)
            vb0 r17 = new vb0
            r0 = r46
            f8 r13 = r0.f13144
            r14 = r11
            r11 = r12
            r9 = r17
            r12 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            r12 = r11
            java.lang.String r14 = "保存选中"
            java.lang.String r15 = "#FFFFFF"
            java.lang.String r16 = "#FE2C55"
            r13 = r4
            android.widget.TextView r0 = p000.dl0.m1773(r12, r13, r14, r15, r16, r17)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r9 = 0
            r1.<init>(r9, r5, r8)
            r0.setLayoutParams(r1)
            r7.addView(r0)
            r3.addView(r7)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r12)
            android.app.AlertDialog$Builder r0 = r0.setView(r3)
            r9 = 1
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r9)
            android.app.AlertDialog r0 = r0.create()
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L793
            r3 = 17170445(0x106000d, float:2.461195E-38)
            r1.setBackgroundDrawableResource(r3)
            r3 = 1062836634(0x3f59999a, float:0.85)
            r1.setDimAmount(r3)
            r3 = 2
            r1.addFlags(r3)
        L793:
            r0.show()
            r2.f10912 = r0
        L798:
            return
        L799:
            p000.xk0.m6680()     // Catch: java.lang.Throwable -> L7aa
            android.os.Handler r0 = p000.dl0.f3213     // Catch: java.lang.Throwable -> L7aa
            zk0 r1 = new zk0     // Catch: java.lang.Throwable -> L7aa
            r9 = 1
            r1.<init>(r4, r6, r9)     // Catch: java.lang.Throwable -> L7aa
            r5 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r1, r5)     // Catch: java.lang.Throwable -> L7aa
            goto L7be
        L7aa:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r3 = "ImagePreviewDialog 异常: "
            p000.AbstractC0602nx.m4145(r3, r1, r2, r0)
            java.lang.String r0 = "打开预览失败"
            r9 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r9)
            r0.show()
        L7be:
            return
    }
}
