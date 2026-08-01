package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class xd1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.ExecutorService f12139 = null;

    /* JADX INFO: renamed from: β */
    public static final p000.wd1 f12140 = null;

    static {
            aj r0 = new aj
            r1 = 15
            r0.<init>(r1)
            r1 = 2
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            p000.xd1.f12139 = r0
            wd1 r0 = new wd1
            r1 = 24
            r2 = 0
            r0.<init>(r1, r2)
            p000.xd1.f12140 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m6613(android.view.View r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, p000.C1000xx r10) {
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            java.lang.String r1 = r10.f12351
            r2 = 8
            android.graphics.drawable.GradientDrawable r0 = p000.jx0.m3062(r2, r0, r1)
            r3.setBackground(r0)
            java.lang.String r3 = r10.f12355
            int r3 = android.graphics.Color.parseColor(r3)
            r4.setTextColor(r3)
            java.lang.String r3 = r10.f12356
            int r4 = android.graphics.Color.parseColor(r3)
            r5.setTextColor(r4)
            int r4 = android.graphics.Color.parseColor(r3)
            r6.setTextColor(r4)
            java.lang.String r4 = r10.f12358
            int r5 = android.graphics.Color.parseColor(r4)
            r7.setTextColor(r5)
            int r3 = android.graphics.Color.parseColor(r3)
            r8.setTextColor(r3)
            int r3 = android.graphics.Color.parseColor(r4)
            r9.setTextColor(r3)
            android.widget.TextView[] r3 = new android.widget.TextView[]{r7, r8, r9}
            java.util.List r3 = p000.AbstractC1021yh.m6897(r3)
            java.util.Iterator r3 = r3.iterator()
        L4e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r3.next()
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.content.Context r5 = r4.getContext()
            r5.getClass()
            java.lang.String r6 = r10.f12348
            java.lang.String r7 = "#00000000"
            r8 = 6
            android.graphics.drawable.RippleDrawable r5 = p000.jx0.m3059(r8, r5, r6, r7)
            r4.setBackground(r5)
            goto L4e
        L6e:
            return
    }

    /* JADX INFO: renamed from: β */
    public static android.graphics.drawable.GradientDrawable m6614(android.app.Activity r2, p000.C1000xx r3, boolean r4) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            if (r4 == 0) goto La
            java.lang.String r1 = r3.f12359
            goto Lc
        La:
            java.lang.String r1 = r3.f12352
        Lc:
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setColor(r1)
            r1 = 1
            int r1 = p000.jx0.m3056(r2, r1)
            if (r4 == 0) goto L1d
            java.lang.String r3 = r3.f12358
            goto L1f
        L1d:
            java.lang.String r3 = r3.f12353
        L1f:
            int r3 = android.graphics.Color.parseColor(r3)
            r0.setStroke(r1, r3)
            r3 = 6
            int r2 = p000.jx0.m3056(r2, r3)
            float r2 = (float) r2
            r0.setCornerRadius(r2)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m6615(android.app.Activity r2, android.app.AlertDialog r3) {
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L2d
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r1 = 0
            r0.<init>(r1)
            r3.setBackgroundDrawable(r0)
            r0 = 1055286886(0x3ee66666, float:0.45)
            r3.setDimAmount(r0)
            r0 = 2
            r3.addFlags(r0)
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            float r2 = (float) r2
            r0 = 1064011039(0x3f6b851f, float:0.92)
            float r2 = r2 * r0
            int r2 = (int) r2
            r0 = -2
            r3.setLayout(r2, r0)
        L2d:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static android.graphics.Bitmap m6616(java.lang.String r6, int r7) {
            t41 r0 = p000.C0963wx.f11880
            kz r0 = p000.C0493kz.f6332
            r1 = 2097152(0x200000, float:2.938736E-39)
            java.lang.String r2 = "image/*"
            byte[] r6 = p000.C0963wx.m6406(r6, r0, r2, r1)
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            int r2 = r6.length
            r3 = 0
            android.graphics.BitmapFactory.decodeByteArray(r6, r3, r2, r0)
            int r2 = r0.outWidth
            r4 = 0
            if (r2 <= 0) goto L4e
            int r2 = r0.outHeight
            if (r2 <= 0) goto L4e
        L22:
            int r2 = r0.outWidth
            int r2 = r2 / r1
            int r5 = r7 * 2
            if (r2 > r5) goto L4b
            int r2 = r0.outHeight
            int r2 = r2 / r1
            if (r2 <= r5) goto L2f
            goto L4b
        L2f:
            int r7 = r6.length
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r0.inSampleSize = r1
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r6, r3, r7, r0)
            if (r7 == 0) goto L3e
            return r7
        L3e:
            int r6 = r6.length
            java.lang.String r7 = "图标位图解码失败 bytes="
            java.lang.String r0 = " sampleSize="
            java.lang.String r6 = p000.AbstractC0602nx.m4125(r6, r1, r7, r0)
            p000.C1080.m7273(r6)
            return r4
        L4b:
            int r1 = r1 * 2
            goto L22
        L4e:
            int r6 = r6.length
            java.lang.String r7 = "图标响应无法解析尺寸 bytes="
            java.lang.String r6 = p000.a12.m17(r7, r6)
            p000.C1080.m7273(r6)
            return r4
    }

    /* JADX INFO: renamed from: ε */
    public static void m6617(android.app.Activity r9, android.widget.CompoundButton r10, java.lang.String r11, java.lang.String r12) {
            r1 = 0
            if (r11 == 0) goto Lc
            java.lang.CharSequence r11 = p000.q02.m4660(r11)
            java.lang.String r11 = r11.toString()
            goto Ld
        Lc:
            r11 = r1
        Ld:
            if (r11 != 0) goto L11
            java.lang.String r11 = ""
        L11:
            int r0 = r11.length()
            r2 = 4
            if (r0 != 0) goto L24
            java.lang.String r9 = "r50ae750e12c684f0"
            java.lang.String r10 = "种子图标缺少 URL label="
            java.lang.String r10 = p000.lz1.m3687(r10, r12)
            p000.C0888ux.m5988(r9, r10, r1, r2, r1)
            return
        L24:
            java.lang.String r0 = "https://"
            r3 = 1
            boolean r0 = p000.x02.m6485(r11, r0, r3)
            if (r0 == 0) goto L2e
            goto L36
        L2e:
            java.lang.String r0 = "http://"
            boolean r0 = p000.x02.m6485(r11, r0, r3)
            if (r0 == 0) goto L38
        L36:
            r4 = r11
            goto L48
        L38:
            java.lang.String r0 = "//"
            r3 = 0
            boolean r0 = p000.x02.m6485(r11, r0, r3)
            if (r0 == 0) goto Lb3
            java.lang.String r0 = "https:"
            java.lang.String r11 = r0.concat(r11)
            goto L36
        L48:
            android.net.Uri r11 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r11 = r11.getHost()     // Catch: java.lang.Throwable -> L55
            if (r11 != 0) goto L5d
            java.lang.String r11 = ""
            goto L5d
        L55:
            r0 = move-exception
            r11 = r0
            eo1 r0 = new eo1
            r0.<init>(r11)
            r11 = r0
        L5d:
            java.lang.String r0 = ""
            boolean r3 = r11 instanceof p000.eo1
            if (r3 == 0) goto L64
            r11 = r0
        L64:
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r0 = p000.q02.m4671(r11)
            if (r0 == 0) goto L6e
            java.lang.String r11 = "unknown"
        L6e:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = "label="
            java.lang.String r3 = " host="
            java.lang.String r6 = p000.a12.m18(r0, r12, r3, r11)
            r10.setTag(r4)
            wd1 r11 = p000.xd1.f12140
            monitor-enter(r11)
            java.lang.Object r12 = r11.get(r4)     // Catch: java.lang.Throwable -> Laf
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r11)
            if (r12 == 0) goto L96
            java.lang.String r11 = "r50ae750e12c684f0"
            java.lang.String r0 = "种子图标缓存命中 "
            java.lang.String r0 = r0.concat(r6)
            p000.C0888ux.m5988(r11, r0, r1, r2, r1)
            m6618(r10, r4, r6, r9, r12)
            return
        L96:
            java.lang.String r11 = "r50ae750e12c684f0"
            java.lang.String r12 = "开始加载种子图标 "
            java.lang.String r12 = r12.concat(r6)
            p000.C0888ux.m5988(r11, r12, r1, r2, r1)
            java.util.concurrent.ExecutorService r11 = p000.xd1.f12139
            vg0 r3 = new vg0
            r8 = 3
            r5 = r9
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r11.execute(r3)
            return
        Laf:
            r0 = move-exception
            r9 = r0
            monitor-exit(r11)
            throw r9
        Lb3:
            java.lang.String r9 = "r50ae750e12c684f0"
            java.lang.String r10 = "种子图标 URL 协议无效 label="
            java.lang.String r10 = p000.lz1.m3687(r10, r12)
            p000.C0888ux.m5988(r9, r10, r1, r2, r1)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static final void m6618(android.widget.CompoundButton r5, java.lang.String r6, java.lang.String r7, android.app.Activity r8, android.graphics.Bitmap r9) {
            java.lang.Object r0 = r5.getTag()
            boolean r6 = p000.ln0.m3626(r0, r6)
            r0 = 4
            java.lang.String r1 = "r50ae750e12c684f0"
            r2 = 0
            if (r6 == 0) goto L51
            boolean r6 = r9.isRecycled()
            if (r6 == 0) goto L15
            goto L51
        L15:
            r6 = 40
            int r6 = p000.jx0.m3056(r8, r6)
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r4 = r8.getResources()
            r3.<init>(r4, r9)
            r4 = 0
            r3.setBounds(r4, r4, r6, r6)
            r6 = 10
            int r6 = p000.jx0.m3056(r8, r6)
            r5.setCompoundDrawablePadding(r6)
            r5.setCompoundDrawablesRelative(r3, r2, r2, r2)
            int r5 = r9.getWidth()
            int r6 = r9.getHeight()
            java.lang.String r8 = " size="
            java.lang.String r9 = "x"
            java.lang.String r3 = "种子图标已应用 "
            java.lang.StringBuilder r5 = p000.AbstractC0602nx.m4135(r5, r3, r7, r8, r9)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            p000.C0888ux.m5988(r1, r5, r2, r0, r2)
            return
        L51:
            java.lang.String r5 = "种子图标结果已过期 "
            java.lang.String r5 = r5.concat(r7)
            p000.C0888ux.m5988(r1, r5, r2, r0, r2)
            return
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.String m6619(int r2) {
            if (r2 > 0) goto L5
            java.lang.String r2 = "价格上限：不限制"
            return r2
        L5:
            java.lang.String r0 = "价格上限："
            java.lang.String r1 = " 金币"
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r0, r2, r1)
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.String m6620(p000.id1 r11, java.lang.Integer r12, java.lang.Long r13) {
            java.lang.Integer r0 = r11.f5019
            java.lang.Integer r1 = r11.f5022
            java.lang.String r2 = " 金币"
            if (r0 == 0) goto L19
            int r3 = r0.intValue()
            if (r3 != 0) goto L11
            java.lang.String r3 = "价格：免费"
            goto L17
        L11:
            java.lang.String r4 = "价格："
            java.lang.String r3 = p000.AbstractC0602nx.m4127(r4, r3, r2)
        L17:
            r4 = r3
            goto L1c
        L19:
            java.lang.String r3 = "价格：待获取"
            goto L17
        L1c:
            java.lang.Integer r3 = r11.f5020
            if (r3 == 0) goto L2c
            int r3 = r3.intValue()
            java.lang.String r5 = "收益："
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r5, r3, r2)
        L2a:
            r5 = r2
            goto L2f
        L2c:
            java.lang.String r2 = "收益：待获取"
            goto L2a
        L2f:
            java.lang.Integer r2 = r11.f5021
            r3 = 0
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            java.lang.String r6 = "+"
            java.lang.String r7 = " 营地经验"
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r6, r2, r7)
            goto L42
        L41:
            r2 = r3
        L42:
            java.lang.String r6 = ""
            if (r2 != 0) goto L47
            r2 = r6
        L47:
            java.lang.Integer r7 = r11.f5018
            if (r7 == 0) goto L77
            int r7 = r7.intValue()
            if (r7 > 0) goto L54
            java.lang.String r7 = "成熟时间未知"
            goto L78
        L54:
            r8 = 86400(0x15180, float:1.21072E-40)
            int r9 = r7 % r8
            if (r9 != 0) goto L63
            int r7 = r7 / r8
            java.lang.String r8 = " 天成熟"
        L5e:
            java.lang.String r7 = p000.lz1.m3686(r8, r7)
            goto L78
        L63:
            int r8 = r7 % 3600
            if (r8 != 0) goto L6c
            int r7 = r7 / 3600
            java.lang.String r8 = " 小时成熟"
            goto L5e
        L6c:
            r8 = 60
            if (r7 < r8) goto L74
            int r7 = r7 / r8
            java.lang.String r8 = " 分钟成熟"
            goto L5e
        L74:
            java.lang.String r8 = " 秒成熟"
            goto L5e
        L77:
            r7 = r3
        L78:
            if (r7 != 0) goto L7b
            r7 = r6
        L7b:
            if (r1 == 0) goto L89
            int r3 = r1.intValue()
            java.lang.String r8 = "解锁："
            java.lang.String r9 = " 级"
            java.lang.String r3 = p000.AbstractC0602nx.m4127(r8, r3, r9)
        L89:
            if (r3 != 0) goto L8d
            r8 = r6
            goto L8e
        L8d:
            r8 = r3
        L8e:
            boolean r3 = r11.f5033
            if (r3 != 0) goto L97
            java.lang.String r11 = "当前未在商店出售"
        L94:
            r9 = r11
            r6 = r2
            goto Lde
        L97:
            long r9 = java.lang.System.currentTimeMillis()
            boolean r11 = r11.m2743(r9)
            if (r11 != 0) goto La4
            java.lang.String r11 = "当前不在活动时间"
            goto L94
        La4:
            if (r12 != 0) goto La9
            java.lang.String r11 = "营地等级待刷新"
            goto L94
        La9:
            if (r1 == 0) goto Lb0
            int r11 = r1.intValue()
            goto Lb3
        Lb0:
            r11 = 2147483647(0x7fffffff, float:NaN)
        Lb3:
            int r12 = r12.intValue()
            if (r11 <= r12) goto Lbc
            java.lang.String r11 = "当前等级未解锁"
            goto L94
        Lbc:
            if (r0 == 0) goto Ld6
            int r11 = r0.intValue()
            if (r11 <= 0) goto Ld6
            if (r13 == 0) goto Ld6
            long r11 = r13.longValue()
            int r0 = r0.intValue()
            long r0 = (long) r0
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 >= 0) goto Ld6
            java.lang.String r11 = "当前金币不足"
            goto L94
        Ld6:
            if (r13 != 0) goto Ldb
            java.lang.String r11 = "金币待刷新"
            goto L94
        Ldb:
            java.lang.String r11 = "当前可购买"
            goto L94
        Lde:
            java.lang.String[] r11 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
            java.util.List r11 = p000.AbstractC1021yh.m6897(r11)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        Lef:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L106
            java.lang.Object r12 = r11.next()
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = p000.q02.m4671(r13)
            if (r13 != 0) goto Lef
            r0.add(r12)
            goto Lef
        L106:
            r5 = 0
            r6 = 62
            java.lang.String r1 = " · "
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r11 = p000.AbstractC0984xh.m6644(r0, r1, r2, r3, r4, r5, r6)
            return r11
    }

    /* JADX INFO: renamed from: ι */
    public static java.lang.String m6621(p000.id1 r2) {
            java.lang.String r0 = r2.f5016
            int r2 = r2.f5015
            if (r0 != 0) goto Lc
            java.lang.String r0 = "种子 "
            java.lang.String r0 = p000.a12.m17(r0, r2)
        Lc:
            java.lang.String r1 = " · #"
            java.lang.String r2 = p000.AbstractC0602nx.m4130(r0, r1, r2)
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public static void m6622(android.app.Activity r14, p000.ec1 r15, java.util.Set r16, int r17, p000.nb1 r18) {
            x01 r0 = p000.x01.f11964
            android.view.LayoutInflater r0 = r0.m6477(r14)
            r1 = 0
            r2 = 0
            r3 = 2131492918(0x7f0c0036, float:1.8609301E38)
            android.view.View r6 = r0.inflate(r3, r1, r2)
            r0 = 2131296855(0x7f090257, float:1.8211638E38)
            android.view.View r0 = r6.findViewById(r0)
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2131296854(0x7f090256, float:1.8211636E38)
            android.view.View r0 = r6.findViewById(r0)
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 2131296851(0x7f090253, float:1.821163E38)
            android.view.View r0 = r6.findViewById(r0)
            r1 = r0
            android.widget.RadioGroup r1 = (android.widget.RadioGroup) r1
            r0 = 2131296850(0x7f090252, float:1.8211628E38)
            android.view.View r0 = r6.findViewById(r0)
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 2131296852(0x7f090254, float:1.8211632E38)
            android.view.View r0 = r6.findViewById(r0)
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 2131296847(0x7f09024f, float:1.8211622E38)
            android.view.View r0 = r6.findViewById(r0)
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 2131296849(0x7f090251, float:1.8211626E38)
            android.view.View r0 = r6.findViewById(r0)
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            xx r2 = p000.jx0.m3049(r14)
            r7.getClass()
            r9.getClass()
            r10.getClass()
            r8.getClass()
            r11.getClass()
            r12.getClass()
            r13 = r10
            r10 = r8
            r8 = r9
            r9 = r13
            r13 = r2
            m6613(r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = r9
            r9 = r8
            r8 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r6
            java.lang.String r0 = r15.f3484
            java.lang.String r4 = " 排除的智能种子"
            java.lang.String r0 = r0.concat(r4)
            r7.setText(r0)
            r0 = r16
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L92:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto La9
            java.lang.Object r6 = r0.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 <= 0) goto L92
            r4.add(r6)
            goto L92
        La9:
            java.util.Set r0 = p000.AbstractC0984xh.m6670(r4)
            um1 r4 = new um1
            r4.<init>()
            kd1 r6 = p000.kd1.f5861
            java.util.List r6 = r6.m3202()
            r4.f10912 = r6
            r7 = r14
            r5 = r0
            r0 = r4
            r3 = r9
            r4 = r17
            r9 = r6
            r6 = r15
            m6624(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r4 = r0
            r7 = r1
            r9 = r3
            r0 = r11
            r11 = r5
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r14)
            android.app.AlertDialog$Builder r1 = r1.setView(r10)
            android.app.AlertDialog r6 = r1.create()
            r10 = r0
            md1 r0 = new md1
            r1 = r10
            r10 = r2
            r2 = r8
            r8 = r1
            r5 = r14
            r3 = r15
            r1 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = r0
            r0 = r2
            r2 = r10
            r8.setOnClickListener(r1)
            sa r1 = new sa
            r3 = 15
            r1.<init>(r6, r3)
            r12.setOnClickListener(r1)
            c9 r1 = new c9
            r3 = 9
            r5 = r18
            r1.<init>(r5, r11, r6, r3)
            r13.setOnClickListener(r1)
            r13 = r0
            nd1 r0 = new nd1
            r5 = r14
            r3 = r15
            r1 = r17
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r6.setOnShowListener(r0)
            r6.show()
            return
    }

    /* JADX INFO: renamed from: λ */
    public static final void m6623(int r13, p000.C1000xx r14, p000.ec1 r15, p000.um1 r16, android.app.Activity r17, android.app.AlertDialog r18, android.widget.RadioGroup r19, android.widget.TextView r20, android.widget.TextView r21, android.widget.TextView r22, java.util.Set r23, boolean r24) {
            r8 = r20
            r0 = 0
            r8.setEnabled(r0)
            r0 = 1055286886(0x3ee66666, float:0.45)
            r8.setAlpha(r0)
            java.lang.String r0 = "更新中"
            r8.setText(r0)
            java.lang.String r0 = "正在从宿主配置中心更新全部种子…"
            r10 = r21
            r10.setText(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jc1.f5424
            od1 r0 = new od1
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r9 = r22
            r11 = r23
            r12 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            p000.jc1.m2946(r5, r0)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static final void m6624(p000.um1 r12, android.widget.RadioGroup r13, android.widget.TextView r14, android.widget.TextView r15, int r16, java.util.Set r17, p000.ec1 r18, android.app.Activity r19, p000.C1000xx r20, java.util.List r21) {
            r2 = r19
            r5 = r20
            r6 = r21
            r12.f10912 = r6
            r13.removeAllViews()
            java.util.Iterator r12 = r6.iterator()
        Lf:
            boolean r0 = r12.hasNext()
            r1 = 0
            r3 = 8
            if (r0 == 0) goto Lee
            java.lang.Object r0 = r12.next()
            r4 = r0
            id1 r4 = (p000.id1) r4
            java.lang.String r7 = m6621(r4)
            r8 = r18
            id r0 = r8.f3487
            r9 = 0
            if (r0 == 0) goto L31
            zd1 r10 = r0.f5005
            if (r10 == 0) goto L31
            java.lang.Integer r10 = r10.f13048
            goto L32
        L31:
            r10 = r9
        L32:
            if (r0 == 0) goto L3e
            zd1 r0 = r0.f5005
            if (r0 == 0) goto L3e
            qc1 r9 = p000.qc1.f8961
            java.lang.Long r9 = p000.qc1.m4853(r0)
        L3e:
            java.lang.String r0 = m6620(r4, r10, r9)
            android.widget.CheckBox r9 = new android.widget.CheckBox
            r9.<init>(r2)
            android.text.SpannableString r0 = p000.jx0.m3064(r7, r0, r5)
            r9.setText(r0)
            r0 = 1095761920(0x41500000, float:13.0)
            r9.setTextSize(r0)
            r0 = 2
            int r0 = p000.jx0.m3056(r2, r0)
            float r0 = (float) r0
            r10 = 1065353216(0x3f800000, float:1.0)
            r9.setLineSpacing(r0, r10)
            r0 = 56
            int r0 = p000.jx0.m3056(r2, r0)
            r9.setMinHeight(r0)
            r0 = 16
            r9.setGravity(r0)
            r0 = 10
            int r0 = p000.jx0.m3056(r2, r0)
            int r10 = p000.jx0.m3056(r2, r3)
            r11 = 12
            int r11 = p000.jx0.m3056(r2, r11)
            int r3 = p000.jx0.m3056(r2, r3)
            r9.setPadding(r0, r10, r11, r3)
            java.lang.String r0 = r5.f12355
            int r0 = android.graphics.Color.parseColor(r0)
            r9.setTextColor(r0)
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r3 = new int[]{r3}
            int[] r1 = new int[r1]
            int[][] r1 = new int[][]{r3, r1}
            java.lang.String r3 = r5.f12366
            int r3 = android.graphics.Color.parseColor(r3)
            java.lang.String r10 = r5.f12356
            int r10 = android.graphics.Color.parseColor(r10)
            int[] r3 = new int[]{r3, r10}
            r0.<init>(r1, r3)
            r9.setButtonTintList(r0)
            int r0 = r4.f5015
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = r17
            boolean r0 = r3.contains(r0)
            r9.setChecked(r0)
            boolean r0 = r9.isChecked()
            android.graphics.drawable.GradientDrawable r0 = m6614(r2, r5, r0)
            r9.setBackground(r0)
            xg r0 = new xg
            r1 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            r9.setOnCheckedChangeListener(r0)
            android.widget.RadioGroup$LayoutParams r0 = new android.widget.RadioGroup$LayoutParams
            r1 = -1
            r3 = -2
            r0.<init>(r1, r3)
            r1 = 6
            int r1 = p000.jx0.m3056(r2, r1)
            r0.bottomMargin = r1
            r13.addView(r9, r0)
            java.lang.String r0 = r4.f5017
            m6617(r2, r9, r0, r7)
            r5 = r20
            goto Lf
        Lee:
            boolean r12 = r6.isEmpty()
            if (r12 == 0) goto Lf5
            goto Lf6
        Lf5:
            r1 = r3
        Lf6:
            r14.setVisibility(r1)
            java.lang.String r12 = m6619(r16)
            int r13 = r17.size()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "仅影响智能选择；价格上限 "
            r14.<init>(r0)
            r14.append(r12)
            java.lang.String r12 = "，已排除 "
            r14.append(r12)
            r14.append(r13)
            java.lang.String r12 = " 种"
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r15.setText(r12)
            return
    }

    /* JADX INFO: renamed from: ν */
    public static void m6625(android.app.Activity r22, java.lang.String r23, p000.vd1 r24, int r25, java.lang.Integer r26, java.lang.Long r27, boolean r28, boolean r29, p000.a80 r30) {
            r6 = r22
            r0 = r24
            x01 r1 = p000.x01.f11964
            android.view.LayoutInflater r8 = r1.m6477(r6)
            r1 = 0
            r2 = 2131492918(0x7f0c0036, float:1.8609301E38)
            r3 = 0
            android.view.View r9 = r8.inflate(r2, r3, r1)
            r1 = 2131296855(0x7f090257, float:1.8211638E38)
            android.view.View r1 = r9.findViewById(r1)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 2131296854(0x7f090256, float:1.8211636E38)
            android.view.View r1 = r9.findViewById(r1)
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1 = 2131296851(0x7f090253, float:1.821163E38)
            android.view.View r1 = r9.findViewById(r1)
            r4 = r1
            android.widget.RadioGroup r4 = (android.widget.RadioGroup) r4
            r1 = 2131296850(0x7f090252, float:1.8211628E38)
            android.view.View r1 = r9.findViewById(r1)
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r1 = 2131296852(0x7f090254, float:1.8211632E38)
            android.view.View r1 = r9.findViewById(r1)
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            r1 = 2131296847(0x7f09024f, float:1.8211622E38)
            android.view.View r1 = r9.findViewById(r1)
            r14 = r1
            android.widget.TextView r14 = (android.widget.TextView) r14
            r1 = 2131296849(0x7f090251, float:1.8211626E38)
            android.view.View r1 = r9.findViewById(r1)
            r15 = r1
            android.widget.TextView r15 = (android.widget.TextView) r15
            xx r2 = p000.jx0.m3049(r6)
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r13.getClass()
            r14.getClass()
            r15.getClass()
            r16 = r2
            m6613(r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r23
            r16 = r13
            r10.setText(r1)
            um1 r5 = new um1
            r5.<init>()
            td r1 = r0.f11246
            td r7 = p000.EnumC0831td.f10319
            if (r1 != r7) goto L91
            java.lang.Integer r7 = r0.f11247
            if (r7 == 0) goto L91
            int r7 = r7.intValue()
            if (r7 <= 0) goto L91
            goto Lab
        L91:
            td r0 = p000.EnumC0831td.f10318
            if (r1 != r0) goto L9c
            vd1 r1 = new vd1
            r1.<init>(r0, r3)
        L9a:
            r0 = r1
            goto Lab
        L9c:
            td r0 = p000.EnumC0831td.f10317
            if (r1 != r0) goto La6
            vd1 r1 = new vd1
            r1.<init>(r0, r3)
            goto L9a
        La6:
            vd1 r0 = new vd1
            r0.<init>(r3, r3)
        Lab:
            r5.f10912 = r0
            um1 r10 = new um1
            r10.<init>()
            kd1 r0 = p000.kd1.f5861
            java.util.List r0 = r0.m3202()
            r10.f10912 = r0
            qm1 r3 = new qm1
            r3.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            rd1 r0 = new rd1
            r7 = 0
            r21 = r2
            r2 = r1
            r1 = r3
            r3 = r5
            r5 = r6
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r5 = r3
            r3 = r4
            r4 = r0
            r0 = r2
            r2 = r6
            r3.setOnCheckedChangeListener(r4)
            java.lang.Object r4 = r10.f10912
            java.util.List r4 = (java.util.List) r4
            r6 = r26
            r7 = r27
            r13 = r2
            r18 = r9
            r19 = r14
            r20 = r15
            r14 = r22
            r9 = r29
            r2 = r1
            r15 = r4
            r4 = r5
            r5 = r25
            r1 = r0
            r0 = r10
            r10 = r12
            r12 = r8
            r8 = r28
            m6627(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r15 = r1
            r1 = r2
            r9 = r3
            r5 = r4
            r8 = r12
            r2 = r13
            r6 = r14
            r4 = r0
            r12 = r10
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r6)
            r3 = r18
            android.app.AlertDialog$Builder r0 = r0.setView(r3)
            android.app.AlertDialog r7 = r0.create()
            sd1 r0 = new sd1
            r13 = r26
            r14 = r27
            r17 = r29
            r3 = r1
            r10 = r16
            r1 = r25
            r16 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r3
            r10.setOnClickListener(r0)
            sa r0 = new sa
            r3 = 16
            r0.<init>(r7, r3)
            r14 = r19
            r14.setOnClickListener(r0)
            c9 r0 = new c9
            r3 = 11
            r6 = r30
            r0.<init>(r6, r5, r7, r3)
            r3 = r20
            r3.setOnClickListener(r0)
            td1 r0 = new td1
            r6 = r22
            r14 = r27
            r3 = r1
            r1 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r7.setOnShowListener(r0)
            r7.show()
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static final void m6626(int r19, p000.C1000xx r20, p000.qm1 r21, p000.um1 r22, p000.um1 r23, android.app.Activity r24, android.app.AlertDialog r25, android.view.LayoutInflater r26, android.widget.RadioGroup r27, android.widget.TextView r28, android.widget.TextView r29, android.widget.TextView r30, java.lang.Integer r31, java.lang.Long r32, java.util.LinkedHashMap r33, boolean r34, boolean r35, boolean r36) {
            r10 = r28
            r0 = 0
            r10.setEnabled(r0)
            r0 = 1055286886(0x3ee66666, float:0.45)
            r10.setAlpha(r0)
            java.lang.String r0 = "更新中"
            r10.setText(r0)
            java.lang.String r0 = "正在从宿主配置中心更新全部种子…"
            r12 = r29
            r12.setText(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jc1.f5424
            ld1 r0 = new ld1
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r11 = r30
            r13 = r31
            r14 = r32
            r15 = r33
            r17 = r34
            r18 = r35
            r16 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            p000.jc1.m2946(r6, r0)
            return
    }

    /* JADX INFO: renamed from: ο */
    public static final void m6627(p000.um1 r20, java.util.LinkedHashMap r21, p000.qm1 r22, android.widget.RadioGroup r23, p000.um1 r24, int r25, java.lang.Integer r26, java.lang.Long r27, boolean r28, boolean r29, android.widget.TextView r30, android.widget.TextView r31, android.view.LayoutInflater r32, p000.C1000xx r33, android.app.Activity r34, java.util.List r35) {
            r0 = r22
            r4 = r23
            r2 = r24
            r9 = r26
            r10 = r27
            r7 = r33
            r6 = r34
            r1 = r20
            r11 = r35
            r1.f10912 = r11
            r21.clear()
            r1 = 1
            r0.f9050 = r1
            r4.removeAllViews()
            java.lang.Object r1 = r2.f10912
            vd1 r1 = (p000.vd1) r1
            zt0 r3 = p000.AbstractC1021yh.m6893()
            r5 = 24
            r8 = 0
            if (r28 == 0) goto L3b
            ud1 r12 = new ud1
            vd1 r13 = new vd1
            r13.<init>(r8, r8)
            java.lang.String r14 = "暂不设置全局种子"
            java.lang.String r15 = "自动种地会安全跳过，直到选择智能或固定种子"
            r12.<init>(r13, r14, r15, r5)
            r3.add(r12)
        L3b:
            if (r29 == 0) goto L50
            ud1 r12 = new ud1
            vd1 r13 = new vd1
            td r14 = p000.EnumC0831td.f10317
            r13.<init>(r14, r8)
            java.lang.String r14 = "跟随全局种子"
            java.lang.String r15 = "实时使用全局固定或智能策略；人员排除名单仍会约束全局智能选择"
            r12.<init>(r13, r14, r15, r5)
            r3.add(r12)
        L50:
            ud1 r12 = new ud1
            vd1 r13 = new vd1
            td r14 = p000.EnumC0831td.f10318
            r13.<init>(r14, r8)
            java.lang.String r14 = m6619(r25)
            java.lang.String r15 = "免费优先，其余按收益/价格比选择；"
            java.lang.String r14 = r15.concat(r14)
            java.lang.String r15 = "智能选择"
            r12.<init>(r13, r15, r14, r5)
            r3.add(r12)
            java.lang.Integer r5 = r1.f11247
            td r1 = r1.f11246
            td r12 = p000.EnumC0831td.f10319
            if (r1 != r12) goto L74
            r8 = r5
        L74:
            r13 = 8
            if (r8 == 0) goto Lb7
            if (r11 == 0) goto L81
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L81
            goto L9a
        L81:
            java.util.Iterator r1 = r11.iterator()
        L85:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r1.next()
            id1 r5 = (p000.id1) r5
            int r5 = r5.f5015
            int r14 = r8.intValue()
            if (r5 != r14) goto L85
            goto Lb7
        L9a:
            ud1 r1 = new ud1
            vd1 r5 = new vd1
            r5.<init>(r12, r8)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "已保存的种子 #"
            r14.<init>(r15)
            r14.append(r8)
            java.lang.String r8 = r14.toString()
            java.lang.String r14 = "当前目录中未找到，请更新列表或重新选择"
            r1.<init>(r5, r8, r14, r13)
            r3.add(r1)
        Lb7:
            java.util.Iterator r1 = r11.iterator()
        Lbb:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Le9
            java.lang.Object r5 = r1.next()
            id1 r5 = (p000.id1) r5
            ud1 r14 = new ud1
            vd1 r15 = new vd1
            int r8 = r5.f5015
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r15.<init>(r12, r8)
            java.lang.String r16 = m6621(r5)
            java.lang.String r17 = m6620(r5, r9, r10)
            java.lang.String r5 = r5.f5017
            r19 = 1
            r18 = r5
            r14.<init>(r15, r16, r17, r18, r19)
            r3.add(r14)
            goto Lbb
        Le9:
            zt0 r1 = p000.AbstractC1021yh.m6883(r3)
            r14 = 0
            java.util.ListIterator r15 = r1.listIterator(r14)
        Lf2:
            r1 = r15
            le0 r1 = (p000.le0) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1b2
            java.lang.Object r1 = r1.next()
            r3 = r1
            ud1 r3 = (p000.ud1) r3
            r1 = 2131492952(0x7f0c0058, float:1.860937E38)
            r5 = r32
            android.view.View r1 = r5.inflate(r1, r4, r14)
            r1.getClass()
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            int r8 = android.view.View.generateViewId()
            r1.setId(r8)
            java.lang.String r8 = r3.f10705
            vd1 r13 = r3.f10704
            boolean r14 = r3.f10708
            java.lang.String r5 = r3.f10706
            android.text.SpannableString r5 = p000.jx0.m3064(r8, r5, r7)
            r1.setText(r5)
            r5 = 2
            int r5 = p000.jx0.m3056(r6, r5)
            float r5 = (float) r5
            r8 = 1065353216(0x3f800000, float:1.0)
            r1.setLineSpacing(r5, r8)
            r1.setEnabled(r14)
            if (r14 == 0) goto L137
            goto L13a
        L137:
            r8 = 1056293519(0x3ef5c28f, float:0.48)
        L13a:
            r1.setAlpha(r8)
            java.lang.String r5 = r7.f12355
            int r5 = android.graphics.Color.parseColor(r5)
            r1.setTextColor(r5)
            android.content.res.ColorStateList r5 = new android.content.res.ColorStateList
            r8 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r8 = new int[]{r8}
            r14 = 0
            int[] r10 = new int[r14]
            int[][] r8 = new int[][]{r8, r10}
            java.lang.String r10 = r7.f12358
            int r10 = android.graphics.Color.parseColor(r10)
            java.lang.String r14 = r7.f12356
            int r14 = android.graphics.Color.parseColor(r14)
            int[] r10 = new int[]{r10, r14}
            r5.<init>(r8, r10)
            r1.setButtonTintList(r5)
            java.lang.Object r5 = r2.f10912
            boolean r5 = p000.ln0.m3626(r13, r5)
            r1.setChecked(r5)
            boolean r5 = r1.isChecked()
            android.graphics.drawable.GradientDrawable r5 = m6614(r6, r7, r5)
            r1.setBackground(r5)
            int r5 = r1.getId()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10 = r21
            r10.put(r5, r3)
            r4.addView(r1)
            r5 = r1
            cl0 r1 = new cl0
            r8 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r5.setOnClickListener(r1)
            td r1 = r13.f11246
            if (r1 != r12) goto L1a5
            java.lang.String r1 = r3.f10707
            java.lang.String r2 = r3.f10705
            m6617(r6, r5, r1, r2)
        L1a5:
            r4 = r23
            r2 = r24
            r10 = r27
            r7 = r33
            r13 = 8
            r14 = 0
            goto Lf2
        L1b2:
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L1bc
            r13 = 0
        L1b9:
            r1 = r30
            goto L1bf
        L1bc:
            r13 = 8
            goto L1b9
        L1bf:
            r1.setVisibility(r13)
            int r1 = r11.size()
            if (r9 != 0) goto L1ea
            java.lang.String r2 = m6619(r25)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "已缓存 "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " 种种子；执行时会按各会话的实时等级、余额和 "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = " 校验"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L1e7:
            r2 = r31
            goto L21c
        L1ea:
            if (r27 != 0) goto L1ef
            java.lang.String r2 = "未知"
            goto L1f1
        L1ef:
            r2 = r27
        L1f1:
            java.lang.String r3 = m6619(r25)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "当前营地 "
            r4.<init>(r5)
            r4.append(r9)
            java.lang.String r5 = " 级，金币 "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "；共 "
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = " 种，智能选择 "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            goto L1e7
        L21c:
            r2.setText(r1)
            r14 = 0
            r0.f9050 = r14
            return
    }

    /* JADX INFO: renamed from: π */
    public static final void m6628(android.widget.RadioGroup r5, android.app.Activity r6, p000.C1000xx r7, int r8) {
            int r0 = r5.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L2a
            android.view.View r3 = r5.getChildAt(r2)
            boolean r4 = r3 instanceof android.widget.RadioButton
            if (r4 == 0) goto L13
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            goto L14
        L13:
            r3 = 0
        L14:
            if (r3 != 0) goto L17
            goto L27
        L17:
            int r4 = r3.getId()
            if (r4 != r8) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = r1
        L20:
            android.graphics.drawable.GradientDrawable r4 = m6614(r6, r7, r4)
            r3.setBackground(r4)
        L27:
            int r2 = r2 + 1
            goto L6
        L2a:
            return
    }
}
