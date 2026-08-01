package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s20 {
    public static final defpackage.s20 a = null;

    static {
            java.lang.String r0 = "ۦۨۨ"
            int r0 = com.ljx.wechatmod.auth.C0065.m263(r0)
        L6:
            switch(r0) {
                case 1748646: goto La;
                case 1748826: goto L35;
                case 1753605: goto L4f;
                case 1753702: goto L24;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            s20 r0 = new s20
            r0.<init>()
            defpackage.s20.a = r0
            int r0 = androidx.versionedparcelable.C0041.f41
            int r1 = androidx.constraintlayout.widget.C0018.f18
            r1 = r1 | 581(0x245, float:8.14E-43)
            int r0 = r0 / r1
            if (r0 == 0) goto L4c
            com.ljx.wechatmod.hook.C0066.m265()
            java.lang.String r0 = "ۦۨۨ"
            int r0 = androidx.versionedparcelable.C0038.m153(r0)
            goto L6
        L24:
            java.lang.String r0 = "5oIDjgoYF5zSgRa+GAQRheq4H78NAhmF7oI=\n"
            java.lang.String r1 = "jed60XlweOs=\n"
            "key_show_floating_entrance"
            int r0 = com.github.megatronking.stringfog.xor.C0046.f46
            int r1 = android.support.v4.graphics.drawable.C0004.f4
            int r0 = r0 * r1
            r1 = -1670410(0xffffffffffe682f6, float:NaN)
            r0 = r0 ^ r1
            goto L6
        L35:
            int r0 = androidx.appcompat.widget.C0015.m61()
            if (r0 > 0) goto L42
            java.lang.String r0 = "ۣ۠۠"
        L3d:
            int r0 = io.fastkv.C0068.m272(r0)
            goto L6
        L42:
            int r0 = com.google.android.material.chip.C0056.f56
            int r1 = com.ljx.wechatmod.ui.C0067.f67
            int r0 = r0 + r1
            r1 = 1754128(0x1ac410, float:2.458057E-39)
            int r0 = r0 + r1
            goto L6
        L4c:
            java.lang.String r0 = "ۦۥۤ"
            goto L3d
        L4f:
            return
    }

    public static void a(android.app.Activity r50) {
            java.lang.String r4 = "JAz6\n"
            java.lang.String r5 = "RW+OG+3uB6Q=\n"
            java.lang.String r4 = "act"
            r0 = r50
            defpackage.ip.o(r4, r0)
            gn r4 = defpackage.gn.a
            java.lang.String r5 = "ia53nixGv8S9pmGlLQ==\n"
            java.lang.String r6 = "4ssOwUgnza8=\n"
            java.lang.String r5 = "key_dark_mode"
            r4.getClass()
            r4 = 0
            int r4 = defpackage.gn.b(r5, r4)
            r5 = 1
            if (r4 == r5) goto L84e
            r5 = 2
            if (r4 == r5) goto L3c
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L84e
            android.content.res.Resources r4 = r50.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.uiMode
            r5 = r4 ^ (-49)
            r4 = r4 & r5
            r5 = 32
            if (r4 != r5) goto L84e
        L3c:
            r20 = 1
        L3e:
            java.lang.String r4 = "4qKXZXH50bHovoFPcM/9qfCriw==\n"
            java.lang.String r5 = "icfuOgSQjt0=\n"
            java.lang.String r4 = "key_ui_layout_style"
            r5 = 0
            int r4 = defpackage.gn.b(r4, r5)
            r5 = 1
            if (r4 < r5) goto L852
            r4 = 1
        L4f:
            java.lang.String[] r5 = defpackage.pn.a
            java.lang.String r5 = "oBPrf5KgNA==\n"
            java.lang.String r6 = "w3yFC/fYQP0=\n"
            "context"
            r5 = 1
            if (r4 < r5) goto L855
            r5 = 1
        L5c:
            java.lang.String r4 = "NZ67LrV8FPcxlp0QtWoC7SqkoR66ZhU=\n"
            java.lang.String r6 = "XvvCcdYJZ4M=\n"
            java.lang.String r4 = "key_custom_accent_color"
            java.lang.String r6 = "7yVrl6AKhg==\n"
            java.lang.String r7 = "zBVb1pRMwAA=\n"
            java.lang.String r6 = "#00A4FF"
            java.lang.String r4 = defpackage.gn.d(r4, r6)
            int r4 = android.graphics.Color.parseColor(r4)     // Catch: java.lang.Exception -> L858
        L74:
            java.lang.String r6 = "jh3JsDwgDOaIEdOwOzYO6Jc=\n"
            java.lang.String r7 = "5Xiw71hZYoc=\n"
            gn r8 = defpackage.gn.a
            boolean r6 = defpackage.z30.q(r6, r7, r8)
            if (r6 == 0) goto Ld77
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 31
            if (r6 < r7) goto Ld77
            android.content.res.Resources r6 = r50.getResources()     // Catch: java.lang.Exception -> L87a
            r7 = 17170494(0x106003e, float:2.4612087E-38)
            android.content.res.Resources$Theme r8 = r50.getTheme()     // Catch: java.lang.Exception -> L87a
            int r4 = r6.getColor(r7, r8)     // Catch: java.lang.Exception -> L87a
            r6 = r4
        L96:
            gn r4 = defpackage.gn.a
            java.lang.String r7 = "jut+0uQ86dK652Ti+Sc=\n"
            java.lang.String r8 = "5Y4HjZdUhqU=\n"
            java.lang.String r7 = "key_show_icons"
            r4.getClass()
            r4 = 1
            boolean r18 = defpackage.gn.a(r7, r4)
            java.lang.String r4 = "CrkcgD9waFc+qAyxIkxmWgK5C6s=\n"
            java.lang.String r7 = "Ydxl31YTBzk=\n"
            java.lang.String r4 = "key_icon_tint_accent"
            r7 = 0
            boolean r19 = defpackage.gn.a(r4, r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r7 = "_"
            r4.append(r7)
            r0 = r20
            r4.append(r0)
            java.lang.String r7 = "_"
            r4.append(r7)
            r4.append(r6)
            java.lang.String r7 = "_"
            r4.append(r7)
            r0 = r18
            r4.append(r0)
            java.lang.String r7 = "_"
            r4.append(r7)
            r0 = r19
            r4.append(r0)
            java.lang.String r21 = r4.toString()
            java.util.concurrent.ConcurrentHashMap r22 = defpackage.pn.b
            r0 = r22
            r1 = r21
            java.lang.Object r4 = r0.get(r1)
            on r4 = (defpackage.on) r4
            if (r4 == 0) goto L891
            r5 = r4
        Lf6:
            int r0 = r5.g
            r16 = r0
            int r4 = r5.f
            boolean r0 = r5.p
            r32 = r0
            int r15 = r5.c
            int r0 = r5.a
            r17 = r0
            android.app.Dialog r33 = new android.app.Dialog
            r6 = 16973840(0x1030010, float:2.4060945E-38)
            r0 = r33
            r1 = r50
            r0.<init>(r1, r6)
            android.widget.FrameLayout r34 = new android.widget.FrameLayout
            r0 = r34
            r1 = r50
            r0.<init>(r1)
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r7 = -1
            r8 = -1
            r6.<init>(r7, r8)
            r0 = r34
            r0.setLayoutParams(r6)
            r6 = 0
            r0 = r34
            r0.setBackgroundColor(r6)
            u6 r6 = new u6
            r7 = 14
            r0 = r33
            r6.<init>(r0, r7)
            r0 = r34
            r0.setOnClickListener(r6)
            android.content.res.Resources r6 = r50.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.heightPixels
            double r6 = (double) r6
            r8 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r6 = r6 * r8
            int r0 = (int) r6
            r35 = r0
            r6 = 1
            r0 = r50
            android.widget.LinearLayout r36 = defpackage.z30.g(r0, r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = -1
            r0 = r35
            r6.<init>(r7, r0)
            r7 = 80
            r6.gravity = r7
            r0 = r36
            r0.setLayoutParams(r6)
            r6 = 1
            r0 = r36
            r0.setClickable(r6)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            int r7 = r5.b
            r6.setColor(r7)
            float r7 = r5.j
            r8 = 8
            float[] r8 = new float[r8]
            r9 = 0
            r8[r9] = r7
            r9 = 1
            r8[r9] = r7
            r9 = 2
            r8[r9] = r7
            r9 = 3
            r8[r9] = r7
            r7 = 4
            r9 = 0
            r8[r7] = r9
            r7 = 5
            r9 = 0
            r8[r7] = r9
            r7 = 6
            r9 = 0
            r8[r7] = r9
            r7 = 7
            r9 = 0
            r8[r7] = r9
            r6.setCornerRadii(r8)
            r0 = r36
            r0.setBackground(r6)
            int r18 = android.os.Build.VERSION.SDK_INT
            g6 r6 = new g6
            r7 = 6
            r6.<init>(r7, r5)
            r0 = r36
            r0.setOutlineProvider(r6)
            r6 = 1
            r0 = r36
            r0.setClipToOutline(r6)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r0 = r50
            r6.<init>(r0)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r9 = -2
            r7.<init>(r8, r9)
            r6.setLayoutParams(r7)
            android.view.View r7 = new android.view.View
            r0 = r50
            r7.<init>(r0)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r9 = 36
            int r9 = defpackage.ff.q(r9)
            r10 = 5
            int r10 = defpackage.ff.q(r10)
            r8.<init>(r9, r10)
            r9 = 17
            r8.gravity = r9
            r9 = 16
            int r9 = defpackage.ff.q(r9)
            r8.topMargin = r9
            r9 = 16
            int r9 = defpackage.ff.q(r9)
            r8.bottomMargin = r9
            r7.setLayoutParams(r8)
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            r8.setColor(r4)
            r9 = 80
            r8.setAlpha(r9)
            r9 = 1092616192(0x41200000, float:10.0)
            float r9 = defpackage.ff.p(r9)
            r8.setCornerRadius(r9)
            r7.setBackground(r8)
            r6.addView(r7)
            r0 = r36
            r0.addView(r6)
            r20 r7 = new r20
            r0 = r35
            r1 = r33
            r2 = r36
            r7.<init>(r0, r1, r2)
            r6.setOnTouchListener(r7)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r0 = r50
            r6.<init>(r0)
            r7 = 24
            int r7 = defpackage.ff.q(r7)
            r8 = 0
            int r8 = defpackage.ff.q(r8)
            r9 = 24
            int r9 = defpackage.ff.q(r9)
            r10 = 20
            int r10 = defpackage.ff.q(r10)
            r6.setPadding(r7, r8, r9, r10)
            android.widget.TextView r7 = new android.widget.TextView
            r0 = r50
            r7.<init>(r0)
            java.lang.String r8 = "DzVIeg==\n"
            java.lang.String r9 = "SFAtEYnsH4w=\n"
            r10 = 1101004800(0x41a00000, float:20.0)
            r0 = r16
            defpackage.z30.n(r8, r9, r7, r10, r0)
            android.graphics.Typeface r8 = defpackage.mn.a
            r9 = 3
            r7.setTypeface(r8, r9)
            r8 = 20
            int r8 = defpackage.ff.q(r8)
            r9 = 8
            int r9 = defpackage.ff.q(r9)
            r10 = 20
            int r10 = defpackage.ff.q(r10)
            r11 = 8
            int r11 = defpackage.ff.q(r11)
            r7.setPadding(r8, r9, r10, r11)
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            r8.setColor(r15)
            r9 = 1120403456(0x42c80000, float:100.0)
            float r9 = defpackage.ff.p(r9)
            r8.setCornerRadius(r9)
            r7.setBackground(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r9 = -2
            r10 = -2
            r8.<init>(r9, r10)
            r9 = 8388627(0x800013, float:1.175497E-38)
            r8.gravity = r9
            r7.setLayoutParams(r8)
            v6 r8 = new v6
            r9 = 1
            r0 = r33
            r8.<init>(r7, r0, r9)
            r7.setOnClickListener(r8)
            r6.addView(r7)
            android.widget.TextView r7 = new android.widget.TextView
            r0 = r50
            r7.<init>(r0)
            java.lang.String r8 = "wL7a\n"
            java.lang.String r9 = "LzlsMVMe3co=\n"
            r10 = 1101004800(0x41a00000, float:20.0)
            defpackage.z30.n(r8, r9, r7, r10, r4)
            android.graphics.Typeface r4 = defpackage.xn.a
            android.graphics.Typeface r4 = defpackage.xn.a
            if (r4 == 0) goto L2c0
            r7.setTypeface(r4)
        L2c0:
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            r4.setColor(r15)
            r8 = 1
            r4.setShape(r8)
            r7.setBackground(r4)
            r4 = 17
            r7.setGravity(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r8 = 40
            int r8 = defpackage.ff.q(r8)
            r9 = 40
            int r9 = defpackage.ff.q(r9)
            r4.<init>(r8, r9)
            r8 = 8388629(0x800015, float:1.1754973E-38)
            r4.gravity = r8
            r7.setLayoutParams(r4)
            y5 r4 = new y5
            r8 = 5
            r0 = r50
            r4.<init>(r0, r8, r5)
            r7.setOnClickListener(r4)
            defpackage.xn.c(r7, r5)
            r6.addView(r7)
            r0 = r36
            r0.addView(r6)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r0 = r50
            r14.<init>(r0)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r6, r7, r8)
            r14.setLayoutParams(r4)
            if (r17 != 0) goto Ld2c
            r4 = 120(0x78, float:1.68E-43)
            int r4 = defpackage.ff.q(r4)
        L31e:
            r0 = r50
            android.widget.ScrollView r6 = b(r0, r4)
            r7 = 0
            r6.setVisibility(r7)
            r0 = r50
            android.widget.ScrollView r7 = b(r0, r4)
            r8 = 8
            r7.setVisibility(r8)
            r0 = r50
            android.widget.ScrollView r8 = b(r0, r4)
            r9 = 8
            r8.setVisibility(r9)
            r0 = r50
            android.widget.ScrollView r9 = b(r0, r4)
            r4 = 8
            r9.setVisibility(r4)
            r4 = 1
            r0 = r50
            android.widget.LinearLayout r10 = defpackage.z30.g(r0, r4)
            r4 = 0
            r11 = 8
            int r11 = defpackage.ff.q(r11)
            r12 = 0
            r13 = 24
            int r13 = defpackage.ff.q(r13)
            r10.setPadding(r4, r11, r12, r13)
            r4 = 1
            r0 = r50
            android.widget.LinearLayout r11 = defpackage.z30.g(r0, r4)
            r4 = 0
            r12 = 8
            int r12 = defpackage.ff.q(r12)
            r13 = 0
            r19 = 24
            int r19 = defpackage.ff.q(r19)
            r0 = r19
            r11.setPadding(r4, r12, r13, r0)
            r4 = 1
            r0 = r50
            android.widget.LinearLayout r12 = defpackage.z30.g(r0, r4)
            r4 = 0
            r13 = 8
            int r13 = defpackage.ff.q(r13)
            r19 = 0
            r20 = 24
            int r20 = defpackage.ff.q(r20)
            r0 = r19
            r1 = r20
            r12.setPadding(r4, r13, r0, r1)
            r4 = 1
            r0 = r50
            android.widget.LinearLayout r13 = defpackage.z30.g(r0, r4)
            r4 = 0
            r19 = 8
            int r19 = defpackage.ff.q(r19)
            r20 = 0
            r21 = 24
            int r21 = defpackage.ff.q(r21)
            r0 = r19
            r1 = r20
            r2 = r21
            r13.setPadding(r4, r0, r1, r2)
            r6.addView(r10)
            r7.addView(r11)
            r8.addView(r12)
            r9.addView(r13)
            r14.addView(r6)
            r14.addView(r7)
            r14.addView(r8)
            r14.addView(r9)
            r0 = r36
            r0.addView(r14)
            java.lang.String r4 = "fmPJ\n"
            java.lang.String r14 = "HwC9IgZ88Gc=\n"
            "act"
            java.lang.String r4 = "98Mg0ePP\n"
            java.lang.String r14 = "k6pBvYyotto=\n"
            "dialog"
            java.lang.String r4 = "yzm0354=\n"
            java.lang.String r14 = "v1HRsvuyxno=\n"
            "theme"
            java.lang.String r4 = "XY0udkXn/BdfizJ2dA==\n"
            java.lang.String r14 = "PuJcEwaIkmM=\n"
            "coreContainer"
            java.lang.String r4 = "Njby0yOzJqA0N/3CEg==\n"
            java.lang.String r14 = "VV6Tp2DcSNQ=\n"
            "chatContainer"
            java.lang.String r4 = "rBNXiRtWsjOuBmSDFFCyNKMGVQ==\n"
            java.lang.String r14 = "zWMn7Hok010=\n"
            "appearanceContainer"
            java.lang.String r4 = "XeNX/kkC0L5C/0rpQQ/Mjw==\n"
            java.lang.String r14 = "LZE+iChhqf0=\n"
            "privacyContainer"
            java.lang.String r4 = "7XimI6nnslHsLKN1rea2Vet4onKssbVU\n"
            java.lang.String r14 = "jxvAEc+F0Dc=\n"
            java.lang.String r4 = "bcf2fbbfc7cdbcfbdcbcc4ec"
            java.lang.String r4 = defpackage.a80.h(r4)
            t20 r14 = new t20
            r19 = 0
            r0 = r50
            r1 = r33
            r2 = r19
            r14.<init>(r0, r5, r1, r2)
            r0 = r50
            defpackage.xn.a(r0, r10, r4, r5, r14)
            java.lang.String r4 = "ALRHxxy+4n8H4kWfG+rkLgbiQ5QfuOYt\n"
            java.lang.String r14 = "YtchpnmMgBk=\n"
            java.lang.String r4 = "bcfae2bfe5d9bfd7d5b2f4f4"
            java.lang.String r4 = defpackage.a80.h(r4)
            u20 r14 = new u20
            r19 = 2
            r0 = r50
            r1 = r19
            r14.<init>(r0, r5, r1)
            r0 = r50
            defpackage.xn.a(r0, r10, r4, r5, r14)
            java.lang.String r4 = "nxRIBHOEa5uZFksDdYdsz5kST1Zx1mrJn0BOUXPV\n"
            java.lang.String r14 = "/SYtMBfiCf0=\n"
            java.lang.String r4 = "b2e4dfbfd0f3bee2d4bff4c4bfcad7"
            java.lang.String r4 = defpackage.a80.h(r4)
            t20 r14 = new t20
            r19 = 5
            r0 = r50
            r1 = r33
            r2 = r19
            r14.<init>(r0, r5, r1, r2)
            r0 = r50
            defpackage.xn.a(r0, r10, r4, r5, r14)
            java.lang.String r4 = "mHo2esuOfZKeKDcsz9B6wpl4MSnOj3vA\n"
            java.lang.String r14 = "+h5TSq22H/Q=\n"
            java.lang.String r4 = "bde0f8bfd6dfbfe6cfbcc9d4"
            java.lang.String r4 = defpackage.a80.h(r4)
            t20 r14 = new t20
            r19 = 6
            r0 = r50
            r1 = r33
            r2 = r19
            r14.<init>(r0, r5, r1, r2)
            r0 = r50
            defpackage.xn.a(r0, r10, r4, r5, r14)
            java.lang.String r4 = "5DxnI34z5dXjbWIqf2/hhOA4Y3B5P+HU\n"
            java.lang.String r14 = "hloBEx0Lh7A=\n"
            java.lang.String r4 = "bff0c8bee7c9bdf4fbbcd4fd"
            java.lang.String r4 = defpackage.a80.h(r4)
            u20 r14 = new u20
            r19 = 3
            r0 = r50
            r1 = r19
            r14.<init>(r0, r5, r1)
            r0 = r50
            defpackage.xn.a(r0, r10, r4, r5, r14)
            java.lang.String r4 = "Ymu8Mj4ynB9kar9kOGWbTGZtuzQ/MJ1E\n"
            java.lang.String r14 = "AAjZUVoA/nw=\n"
            java.lang.String r4 = "bcecd2bcdbf5bee0febee0c8"
            java.lang.String r4 = defpackage.a80.h(r4)
            t20 r14 = new t20
            r19 = 7
            r0 = r50
            r1 = r33
            r2 = r19
            r14.<init>(r0, r5, r1, r2)
            r0 = r50
            defpackage.xn.a(r0, r11, r4, r5, r14)
            java.lang.String r4 = "U6TpOPHooF5Vpepu97mmDlL17j/z7qRf\n"
            java.lang.String r14 = "MceMW5Xawj0=\n"
            java.lang.String r4 = "bcecd2bcdbf5bcd3c2bdf4fb"
            java.lang.String r4 = defpackage.a80.h(r4)
            u20 r14 = new u20
            r19 = 4
            r0 = r50
            r1 = r19
            r14.<init>(r0, r5, r1)
            r0 = r50
            defpackage.xn.a(r0, r11, r4, r5, r14)
            java.lang.String r4 = "je0b3rNLvU7qhBmLxUTDEO3d\n"
            java.lang.String r14 = "ZG2BOSzuWfY=\n"
            java.lang.String r4 = "\u901a\u77e5\u4e0e\u9632\u9a9a\u6270"
            u20 r14 = new u20
            r19 = 0
            r0 = r50
            r1 = r19
            r14.<init>(r0, r5, r1)
            r0 = r50
            defpackage.xn.a(r0, r11, r4, r5, r14)
            java.lang.String r4 = "imwKt4A7aynxPDLjxCwQRtJu\n"
            java.lang.String r14 = "btSxXiGOjqM=\n"
            java.lang.String r4 = "\u4e3b\u9875\u529f\u80fd\u589e\u5f3a"
            t20 r14 = new t20
            r19 = 1
            r0 = r50
            r1 = r33
            r2 = r19
            r14.<init>(r0, r5, r1, r2)
            r0 = r50
            defpackage.xn.a(r0, r11, r4, r5, r14)
            java.lang.String r4 = "PtjhWrZMORA5jOEFsU89ED/Y4A61TT9N\n"
            java.lang.String r14 = "XLuCPNMpW3U=\n"
            java.lang.String r4 = "bccfeebee7c9bffeccb2fdd8"
            java.lang.String r4 = defpackage.a80.h(r4)
            t20 r14 = new t20
            r19 = 2
            r0 = r50
            r1 = r33
            r2 = r19
            r14.<init>(r0, r5, r1, r2)
            r0 = r50
            defpackage.xn.a(r0, r12, r4, r5, r14)
            java.lang.String r4 = "kb4MP26VCbCWvQ44aMoN4JDoCj9ung63\n"
            java.lang.String r14 = "89hoWQqsa9Q=\n"
            java.lang.String r4 = "bfdfd9bdeefabff4c0bfd2ec"
            java.lang.String r4 = defpackage.a80.h(r4)
            t20 r14 = new t20
            r19 = 3
            r0 = r50
            r1 = r33
            r2 = r19
            r14.<init>(r0, r5, r1, r2)
            r0 = r50
            defpackage.xn.a(r0, r12, r4, r5, r14)
            java.lang.String r4 = "ZTX5t9g5LJtjY/6w3m4ty2Nk+OXaPCifZTD8tdlr\n"
            java.lang.String r14 = "B1aagbwITv0=\n"
            java.lang.String r4 = "bcc6d1bfd5d1bfc6d2bdf4fbbff4ec"
            java.lang.String r4 = defpackage.a80.h(r4)
            u20 r14 = new u20
            r19 = 1
            r0 = r50
            r1 = r19
            r14.<init>(r0, r5, r1)
            r0 = r50
            defpackage.xn.a(r0, r13, r4, r5, r14)
            java.lang.String r4 = "NZ3XF61bbC0xy9VAqwttLTKX0xevCGh5\n"
            java.lang.String r14 = "V6+xc8k4Dh8=\n"
            java.lang.String r4 = "b2fddcb2fdd3b3c2e8bdf0ff"
            java.lang.String r4 = defpackage.a80.h(r4)
            t20 r14 = new t20
            r19 = 4
            r0 = r50
            r1 = r33
            r2 = r19
            r14.<init>(r0, r5, r1, r2)
            r0 = r50
            defpackage.xn.a(r0, r13, r4, r5, r14)
            android.widget.FrameLayout r37 = new android.widget.FrameLayout
            r0 = r37
            r1 = r50
            r0.<init>(r1)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r14 = -1
            r19 = -2
            r0 = r19
            r4.<init>(r14, r0)
            r14 = 80
            r4.gravity = r14
            r0 = r37
            r0.setLayoutParams(r4)
            if (r17 != 0) goto Ld34
            r4 = 24
            int r4 = defpackage.ff.q(r4)
            r14 = 0
            r19 = 24
            int r19 = defpackage.ff.q(r19)
            r20 = 24
            int r20 = defpackage.ff.q(r20)
            r0 = r37
            r1 = r19
            r2 = r20
            r0.setPadding(r4, r14, r1, r2)
        L5b3:
            r4 = 1
            r0 = r37
            r0.setClickable(r4)
            java.lang.String r4 = "R0R6ktiEFvJzQ2y5zocO305AcQ==\n"
            java.lang.String r14 = "LCEDzbroY4A=\n"
            java.lang.String r4 = "key_blur_bottom_bar"
            boolean r19 = defpackage.gn.e(r4)
            if (r19 == 0) goto Ld49
            if (r32 == 0) goto Ld45
            r4 = 140(0x8c, float:1.96E-43)
        L5cb:
            android.widget.FrameLayout r38 = new android.widget.FrameLayout
            r0 = r38
            r1 = r50
            r0.<init>(r1)
            if (r17 != 0) goto Ld4d
            r14 = 64
            int r14 = defpackage.ff.q(r14)
        L5dc:
            android.widget.FrameLayout$LayoutParams r20 = new android.widget.FrameLayout$LayoutParams
            r21 = -1
            r0 = r20
            r1 = r21
            r0.<init>(r1, r14)
            r0 = r38
            r1 = r20
            r0.setLayoutParams(r1)
            android.graphics.drawable.GradientDrawable r20 = new android.graphics.drawable.GradientDrawable
            r20.<init>()
            int r14 = android.graphics.Color.red(r15)
            int r21 = android.graphics.Color.green(r15)
            int r15 = android.graphics.Color.blue(r15)
            r0 = r21
            int r4 = android.graphics.Color.argb(r4, r14, r0, r15)
            r0 = r20
            r0.setColor(r4)
            if (r17 != 0) goto L631
            r4 = 1120403456(0x42c80000, float:100.0)
            float r4 = defpackage.ff.p(r4)
            r0 = r20
            r0.setCornerRadius(r4)
            if (r19 == 0) goto L631
            r4 = 1
            int r15 = defpackage.ff.q(r4)
            if (r32 == 0) goto Ld55
            java.lang.String r14 = "olZAavh+C4zH\n"
            java.lang.String r4 = "gWcBLL44Tco=\n"
        L624:
            java.lang.String r4 = defpackage.u40.a(r14, r4)
            int r4 = android.graphics.Color.parseColor(r4)
            r0 = r20
            r0.setStroke(r15, r4)
        L631:
            r0 = r38
            r1 = r20
            r0.setBackground(r1)
            if (r17 != 0) goto L680
            boolean r4 = r5.l
            if (r4 == 0) goto L680
            r4 = 1101004800(0x41a00000, float:20.0)
            float r4 = defpackage.ff.p(r4)
            r0 = r38
            r0.setElevation(r4)
            ay r4 = new ay
            r14 = 1
            r4.<init>(r14)
            r0 = r38
            r0.setOutlineProvider(r4)
            r4 = 28
            r0 = r18
            if (r0 < r4) goto L680
            if (r32 == 0) goto Ld5b
            java.lang.String r4 = "vnmBsZDdcQ==\n"
            java.lang.String r14 = "nUmxgaDtQYo=\n"
        L660:
            java.lang.String r4 = defpackage.u40.a(r4, r14)
            int r4 = android.graphics.Color.parseColor(r4)
            r0 = r38
            defpackage.c0.C(r0, r4)
            if (r32 == 0) goto Ld61
            java.lang.String r4 = "aUb0Ur+Qdw==\n"
            java.lang.String r14 = "SnbEYo+gR7E=\n"
        L673:
            java.lang.String r4 = defpackage.u40.a(r4, r14)
            int r4 = android.graphics.Color.parseColor(r4)
            r0 = r38
            defpackage.c0.D(r0, r4)
        L680:
            if (r19 == 0) goto L688
            r4 = 1
            r0 = r38
            r0.setClipToOutline(r4)
        L688:
            r4 = 8
            int r14 = defpackage.ff.q(r4)
            r4 = 8
            int r15 = defpackage.ff.q(r4)
            r4 = 8
            int r18 = defpackage.ff.q(r4)
            if (r17 != 0) goto Ld67
            r4 = 8
            int r4 = defpackage.ff.q(r4)
        L6a2:
            r0 = r38
            r1 = r18
            r0.setPadding(r14, r15, r1, r4)
            android.view.View r15 = new android.view.View
            r0 = r50
            r15.<init>(r0)
            android.graphics.drawable.GradientDrawable r14 = new android.graphics.drawable.GradientDrawable
            r14.<init>()
            r0 = r16
            r14.setColor(r0)
            r4 = 1120403456(0x42c80000, float:100.0)
            float r4 = defpackage.ff.p(r4)
            r14.setCornerRadius(r4)
            r4 = 1
            r0 = r17
            if (r0 != r4) goto Ld6f
            r4 = 40
        L6ca:
            r14.setAlpha(r4)
            r15.setBackground(r14)
            r0 = r38
            r0.addView(r15)
            h40 r16 = new h40
            qh r4 = defpackage.h40.l
            r0 = r16
            r0.<init>(r15, r4)
            i40 r4 = new i40
            r4.<init>()
            r14 = 1128792064(0x43480000, float:200.0)
            r4.b(r14)
            r14 = 1059481190(0x3f266666, float:0.65)
            r4.a(r14)
            r0 = r16
            r0.j = r4
            h40 r17 = new h40
            qh r4 = defpackage.h40.m
            r0 = r17
            r0.<init>(r15, r4)
            i40 r4 = new i40
            r4.<init>()
            r14 = 1128792064(0x43480000, float:200.0)
            r4.b(r14)
            r14 = 1059481190(0x3f266666, float:0.65)
            r4.a(r14)
            r0 = r17
            r0.j = r4
            r4 = 0
            r0 = r50
            android.widget.LinearLayout r14 = defpackage.z30.g(r0, r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r18 = -1
            r19 = -1
            r0 = r18
            r1 = r19
            r4.<init>(r0, r1)
            r14.setLayoutParams(r4)
            r18 = 0
            java.lang.String r4 = "GMJvzgAHaTEZlWzP\n"
            java.lang.String r19 = "eqEJrGRkC1I=\n"
            r0 = r19
            java.lang.String r4 = defpackage.u40.a(r4, r0)
            java.lang.String r19 = defpackage.a80.h(r4)
            java.lang.String r4 = "gmsl\n"
            java.lang.String r20 = "bNaQaFuAjR0=\n"
            r0 = r20
            java.lang.String r20 = defpackage.u40.a(r4, r0)
            r4 = r50
            android.widget.LinearLayout r4 = c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r14.addView(r4)
            r18 = 1
            java.lang.String r4 = "da50gNqfSUVy+3KI\n"
            java.lang.String r19 = "F8sRsLz6KyA=\n"
            r0 = r19
            java.lang.String r4 = defpackage.u40.a(r4, r0)
            java.lang.String r19 = defpackage.a80.h(r4)
            java.lang.String r4 = "I2Nu\n"
            java.lang.String r20 = "zdjEgWgwBjw=\n"
            r0 = r20
            java.lang.String r20 = defpackage.u40.a(r4, r0)
            r4 = r50
            android.widget.LinearLayout r4 = c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r14.addView(r4)
            r18 = 2
            java.lang.String r4 = "n0A24TDzvneeRDDj\n"
            java.lang.String r19 = "/XNV1lbL3BQ=\n"
            r0 = r19
            java.lang.String r4 = defpackage.u40.a(r4, r0)
            java.lang.String r19 = defpackage.a80.h(r4)
            java.lang.String r4 = "4j8I\n"
            java.lang.String r20 = "DJKl4x7C+iw=\n"
            r0 = r20
            java.lang.String r20 = defpackage.u40.a(r4, r0)
            r4 = r50
            android.widget.LinearLayout r4 = c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r14.addView(r4)
            r18 = 3
            java.lang.String r4 = "mvvPVdEoyrec+MoC\n"
            java.lang.String r19 = "+MisZ7QQqNQ=\n"
            r0 = r19
            java.lang.String r4 = defpackage.u40.a(r4, r0)
            java.lang.String r19 = defpackage.a80.h(r4)
            java.lang.String r4 = "jQ7h\n"
            java.lang.String r20 = "YolikdHDqCM=\n"
            r0 = r20
            java.lang.String r20 = defpackage.u40.a(r4, r0)
            r4 = r50
            android.widget.LinearLayout r4 = c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r14.addView(r4)
            r0 = r38
            r0.addView(r14)
            n20 r18 = new n20
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r13
            r27 = r14
            r28 = r5
            r29 = r15
            r30 = r16
            r31 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0 = r18
            r14.post(r0)
            r37.addView(r38)
            r0 = r34
            r1 = r36
            r0.addView(r1)
            r0 = r34
            r1 = r37
            r0.addView(r1)
            r33.setContentView(r34)
            android.view.Window r5 = r33.getWindow()
            if (r5 == 0) goto L825
            r4 = -1
            r6 = -1
            r5.setLayout(r4, r6)
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            r6 = 0
            r4.<init>(r6)
            r5.setBackgroundDrawable(r4)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5.addFlags(r4)
            r4 = 512(0x200, float:7.17E-43)
            r5.addFlags(r4)
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r5.clearFlags(r4)
            r4 = 0
            r5.setStatusBarColor(r4)
            r4 = 0
            r5.setNavigationBarColor(r4)
            if (r32 != 0) goto Ld73
            r4 = 9984(0x2700, float:1.399E-41)
        L81e:
            android.view.View r5 = r5.getDecorView()
            r5.setSystemUiVisibility(r4)
        L825:
            o20 r4 = new o20
            r0 = r35
            r1 = r33
            r2 = r36
            r4.<init>(r0, r1, r2)
            r0 = r33
            r0.setOnShowListener(r4)
            r33.show()
            int r4 = com.github.megatronking.stringfog.annotation.C0044.m178()
            if (r4 < 0) goto L84d
            java.lang.String r4 = "t8MiQol6bQ373sptCG58Eth"
            java.lang.String r4 = androidx.profileinstaller.C0031.m125(r4)
            java.lang.Integer r4 = java.lang.Integer.decode(r4)
            java.io.PrintStream r5 = java.lang.System.out
            r5.println(r4)
        L84d:
            return
        L84e:
            r20 = 0
            goto L3e
        L852:
            r4 = 0
            goto L4f
        L855:
            r5 = 0
            goto L5c
        L858:
            r4 = move-exception
            java.lang.String r4 = "Nwje\n"
            java.lang.String r6 = "Q2m5jaPP2Zc=\n"
            java.lang.String r7 = "Nk6oqAnKIW0aWL6oGM0rXAxrgbs=\n"
            java.lang.String r8 = "YwfuyWq+Th8=\n"
            java.lang.String r7 = "UIFactory_ParseColor"
            java.lang.String r8 = "Fg==\n"
            java.lang.String r9 = "c8HJlSTQVfc=\n"
            defpackage.z30.o(r4, r6, r7, r8, r9)
            java.lang.String r4 = "dNCG0GvOKQ==\n"
            java.lang.String r6 = "V+C2kV+Ib7g=\n"
            java.lang.String r4 = "#00A4FF"
            int r4 = android.graphics.Color.parseColor(r4)
            goto L74
        L87a:
            r6 = move-exception
            java.lang.String r6 = "Nwje\n"
            java.lang.String r7 = "Q2m5jaPP2Zc=\n"
            java.lang.String r8 = "KT2Okj8mwdQFK5uKLxHByhMG\n"
            java.lang.String r9 = "fHTI81xSrqY=\n"
            java.lang.String r8 = "UIFactory_SysColor"
            java.lang.String r9 = "Fg==\n"
            java.lang.String r10 = "c8HJlSTQVfc=\n"
            defpackage.z30.o(r6, r7, r8, r9, r10)
            r6 = r4
            goto L96
        L891:
            fb0 r4 = defpackage.fb0.k
            r7 = r6 ^ (-256(0xffffffffffffff00, float:NaN))
            r7 = r7 & r6
            r8 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
            r8 = r8 ^ r6
            r8 = r8 & r6
            int r8 = r8 >> 16
            double r8 = defpackage.a80.s(r8)
            r10 = -65281(0xffffffffffff00ff, float:NaN)
            r10 = r10 ^ r6
            r10 = r10 & r6
            int r10 = r10 >> 8
            double r10 = defpackage.a80.s(r10)
            double r12 = defpackage.a80.s(r7)
            r14 = 4595671593572523358(0x3fc71af7273e5d5e, double:0.18051042)
            double r14 = r14 * r12
            r16 = 4625478292286210048(0x4031000000000000, double:17.0)
            double r14 = r14 + r16
            r16 = 4600113940642081913(0x3fd6e341ae4b2c79, double:0.35762064)
            double r16 = r16 * r10
            r24 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r16 = r16 - r24
            r24 = 4601099658084187286(0x3fda63c2e8477c96, double:0.41233895)
            double r24 = r24 * r8
            double r16 = r16 + r24
            r24 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r16 = r16 + r24
            double r14 = r14 + r16
            r16 = 4625478292286210048(0x4031000000000000, double:17.0)
            double r14 = r14 - r16
            r16 = 4589866978952703325(0x3fb27bb2fec56d5d, double:0.0722)
            double r16 = r16 * r12
            r24 = 0
            r26 = 4604617168452267173(0x3fe6e2eb1c432ca5, double:0.7152)
            double r26 = r26 * r10
            r28 = 0
            r30 = 4596827742536767164(0x3fcb367a0f9096bc, double:0.2126)
            double r30 = r30 * r8
            double r28 = r28 - r30
            double r26 = r26 - r28
            double r24 = r24 - r26
            double r16 = r16 - r24
            r24 = 0
            r26 = 0
            r28 = 4606735164339439408(0x3fee693974c0c730, double:0.95034478)
            double r12 = r12 * r28
            double r12 = r26 - r12
            r26 = 4593251078828733646(0x3fbe818525c434ce, double:0.11916382)
            double r10 = r10 * r26
            r26 = 0
            r28 = 4581226238680505381(0x3f93c8fde0401c25, double:0.01932141)
            double r8 = r8 * r28
            double r8 = r26 - r8
            double r8 = r10 - r8
            double r8 = r12 - r8
            double r8 = r24 - r8
            double[][] r10 = defpackage.a80.a
            r11 = 0
            r11 = r10[r11]
            r12 = 0
            r12 = r11[r12]
            r23 = 1
            r24 = r11[r23]
            r23 = 2
            r26 = r11[r23]
            r11 = 1
            r11 = r10[r11]
            r23 = 0
            r28 = r11[r23]
            r23 = 1
            r30 = r11[r23]
            r23 = 2
            r32 = r11[r23]
            r11 = 2
            r10 = r10[r11]
            r11 = 0
            r34 = r10[r11]
            r11 = 1
            r36 = r10[r11]
            r11 = 2
            r10 = r10[r11]
            double[] r0 = r4.g
            r23 = r0
            double r0 = r4.i
            r38 = r0
            double r0 = r4.d
            r40 = r0
            double r0 = r4.a
            r42 = r0
            r44 = 0
            r44 = r23[r44]
            r46 = 0
            r48 = 0
            double r26 = r26 * r8
            double r26 = r48 - r26
            double r12 = r12 * r14
            r48 = 0
            double r24 = r24 * r16
            double r24 = r48 - r24
            double r12 = r12 - r24
            double r12 = r26 - r12
            double r12 = r46 - r12
            double r12 = r12 * r44
            r24 = 1
            r24 = r23[r24]
            double r26 = r28 * r14
            r28 = 0
            double r30 = r30 * r16
            double r28 = r28 - r30
            double r26 = r26 - r28
            r28 = 0
            double r30 = r32 * r8
            double r28 = r28 - r30
            double r26 = r26 - r28
            double r24 = r24 * r26
            r26 = 2
            r26 = r23[r26]
            r28 = 0
            r30 = 0
            double r8 = r8 * r10
            double r8 = r30 - r8
            double r10 = r16 * r36
            r16 = 0
            double r14 = r14 * r34
            double r14 = r16 - r14
            double r10 = r10 - r14
            double r8 = r8 - r10
            double r8 = r28 - r8
            double r8 = r8 * r26
            double r10 = r4.h
            double r14 = java.lang.Math.abs(r12)
            double r14 = r14 * r10
            r16 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r14 = r14 / r16
            r16 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r14 = java.lang.Math.pow(r14, r16)
            double r16 = java.lang.Math.abs(r24)
            double r16 = r16 * r10
            r26 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r16 = r16 / r26
            r26 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            r0 = r16
            r2 = r26
            double r16 = java.lang.Math.pow(r0, r2)
            double r26 = java.lang.Math.abs(r8)
            double r10 = r10 * r26
            r26 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r10 = r10 / r26
            r26 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            r0 = r26
            double r10 = java.lang.Math.pow(r10, r0)
            double r12 = java.lang.Math.signum(r12)
            r26 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r12 = r12 * r26
            double r12 = r12 * r14
            r26 = 0
            r28 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r26 = r26 - r28
            double r14 = r14 - r26
            double r12 = r12 / r14
            double r14 = java.lang.Math.signum(r24)
            r24 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r14 = r14 * r24
            double r14 = r14 * r16
            r24 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            r26 = 0
            double r16 = r26 - r16
            double r16 = r24 - r16
            double r14 = r14 / r16
            double r8 = java.lang.Math.signum(r8)
            r16 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r8 = r8 * r16
            double r8 = r8 * r10
            r16 = 4624633867356078080(0x402e000000000000, double:15.0)
            double r10 = r10 + r16
            r16 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r10 = r10 + r16
            r16 = 4624633867356078080(0x402e000000000000, double:15.0)
            double r10 = r10 - r16
            double r8 = r8 / r10
            r10 = 0
            r16 = 0
            r24 = 0
            r26 = -4600427019358961664(0xc028000000000000, double:-12.0)
            double r26 = r26 * r14
            double r24 = r24 - r26
            r26 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r26 = r26 * r12
            double r24 = r24 - r26
            double r16 = r16 - r24
            double r10 = r10 - r16
            double r10 = r8 - r10
            r16 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r16 = r10 / r16
            r10 = 4626604192193052672(0x4035000000000000, double:21.0)
            double r10 = r10 + r12
            double r10 = r10 + r14
            r24 = 4626604192193052672(0x4035000000000000, double:21.0)
            double r10 = r10 - r24
            r24 = 4626604192193052672(0x4035000000000000, double:21.0)
            double r10 = r10 + r24
            r24 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r24 = r24 * r8
            double r10 = r10 - r24
            r24 = 4626604192193052672(0x4035000000000000, double:21.0)
            double r10 = r10 - r24
            r24 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r24 = r10 / r24
            r10 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r10 = r10 * r14
            r14 = 0
            r26 = 0
            r28 = 4626604192193052672(0x4035000000000000, double:21.0)
            double r28 = r28 * r8
            double r26 = r26 - r28
            r28 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r28 = r28 * r12
            r30 = 4628855992006737920(0x403d000000000000, double:29.0)
            double r28 = r28 + r30
            double r28 = r28 + r10
            r30 = 4628855992006737920(0x403d000000000000, double:29.0)
            double r28 = r28 - r30
            double r26 = r26 - r28
            double r14 = r14 - r26
            r26 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r14 = r14 / r26
            r26 = 0
            r28 = 4630826316843712512(0x4044000000000000, double:40.0)
            double r12 = r12 * r28
            r28 = 4629418941960159232(0x403f000000000000, double:31.0)
            double r12 = r12 - r28
            double r10 = r10 + r12
            r12 = 4629418941960159232(0x403f000000000000, double:31.0)
            double r10 = r10 + r12
            double r10 = r26 - r10
            double r8 = r8 - r10
            r10 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r10 = r8 / r10
            r0 = r24
            r2 = r16
            double r8 = java.lang.Math.atan2(r0, r2)
            double r8 = java.lang.Math.toDegrees(r8)
            r12 = 0
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 >= 0) goto Lc6b
            r12 = 4645040803167600640(0x4076800000000000, double:360.0)
            r26 = 0
            double r8 = r26 - r8
            double r8 = r12 - r8
        Lab5:
            double r12 = java.lang.Math.toRadians(r8)
            double r0 = r4.b
            r26 = r0
            double r10 = r10 * r26
            double r10 = r10 / r42
            double r0 = r4.j
            r26 = r0
            double r26 = r26 * r40
            r0 = r26
            double r10 = java.lang.Math.pow(r10, r0)
            r26 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r10 = r10 * r26
            r26 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r26 = r10 / r26
            java.lang.Math.sqrt(r26)
            r10 = 4626362123713081508(0x403423d70a3d70a4, double:20.14)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 >= 0) goto Lc82
            r10 = 0
            r28 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r10 = r10 - r28
            double r10 = r8 - r10
        Laec:
            r28 = 4611686018427387904(0x4000000000000000, double:2.0)
            r30 = 0
            double r10 = java.lang.Math.toRadians(r10)
            double r10 = r30 - r10
            double r10 = r28 - r10
            double r10 = java.lang.Math.cos(r10)
            double r0 = r4.e
            r28 = r0
            double r0 = r4.c
            r30 = r0
            r0 = r16
            r2 = r24
            double r16 = java.lang.Math.hypot(r0, r2)
            r24 = 0
            r32 = 0
            double r10 = r32 - r10
            r32 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r10 = r10 - r32
            double r10 = r24 - r10
            r24 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r10 = r10 * r24
            r24 = 4660676196825845445(0x40ae0c4ec4ec4ec5, double:3846.153846153846)
            double r10 = r10 * r24
            double r10 = r10 * r28
            double r10 = r10 * r30
            double r10 = r10 * r16
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = r14 - r16
            r16 = 4599166011463297925(0x3fd3851eb851eb85, double:0.305)
            double r14 = r14 + r16
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = r14 + r16
            double r10 = r10 / r14
            r14 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            r16 = 4627730092099895296(0x4039000000000000, double:25.0)
            double r14 = r14 + r16
            r16 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            double r0 = r4.f
            r24 = r0
            r0 = r16
            r2 = r24
            double r16 = java.lang.Math.pow(r0, r2)
            double r14 = r14 - r16
            r16 = 4627730092099895296(0x4039000000000000, double:25.0)
            double r14 = r14 - r16
            r16 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r14 = java.lang.Math.pow(r14, r16)
            r16 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            r0 = r16
            double r10 = java.lang.Math.pow(r10, r0)
            double r10 = r10 * r14
            double r14 = java.lang.Math.sqrt(r26)
            double r14 = r14 * r10
            double r10 = r10 * r40
            r16 = 0
            r24 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r16 = r16 - r24
            double r16 = r42 - r16
            double r10 = r10 / r16
            java.lang.Math.sqrt(r10)
            double r10 = r14 * r38
            r16 = 4582228873984682964(0x3f9758e219652bd4, double:0.0228)
            double r10 = r10 * r16
            java.lang.Math.log1p(r10)
            java.lang.Math.cos(r12)
            java.lang.Math.sin(r12)
            int r4 = r6 >> 16
            r10 = r4 ^ (-256(0xffffffffffffff00, float:NaN))
            r4 = r4 & r10
            double r10 = defpackage.a80.s(r4)
            int r4 = r6 >> 8
            r6 = r4 ^ (-256(0xffffffffffffff00, float:NaN))
            r4 = r4 & r6
            double r12 = defpackage.a80.s(r4)
            double r6 = defpackage.a80.s(r7)
            double[][] r4 = defpackage.a80.b
            r16 = 3
            r0 = r16
            double[] r0 = new double[r0]
            r16 = r0
            r17 = 0
            r16[r17] = r10
            r10 = 1
            r16[r10] = r12
            r10 = 2
            r16[r10] = r6
            r0 = r16
            double[] r4 = defpackage.zt.F(r0, r4)
            r6 = 1
            r6 = r4[r6]
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 / r10
            r10 = 4576259018578689238(0x3f822354d28f7cd6, double:0.008856451679035631)
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 <= 0) goto Lbde
            r10 = 4599676419421066581(0x3fd5555555555555, double:0.3333333333333333)
            java.lang.Math.pow(r6, r10)
        Lbde:
            r6 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r6 = java.lang.Math.max(r14, r6)
            b70 r6 = defpackage.b70.a(r8, r6)
            r10 = 4620693217682128896(0x4020000000000000, double:8.0)
            b70 r10 = defpackage.b70.a(r8, r10)
            r12 = 4622945017495814144(0x4028000000000000, double:12.0)
            b70 r8 = defpackage.b70.a(r8, r12)
            if (r20 == 0) goto Lc85
            r4 = 80
        Lbf8:
            int r11 = r6.b(r4)
            r4 = 1
            if (r5 != r4) goto Lc9e
            if (r20 == 0) goto Lc89
            r4 = 6
        Lc02:
            int r13 = r10.b(r4)
            r6 = 95
            if (r20 == 0) goto Lc8d
            r4 = 12
        Lc0c:
            int r7 = r10.b(r4)
            if (r20 == 0) goto Lc91
            r4 = 20
        Lc14:
            int r12 = r8.b(r4)
            if (r20 == 0) goto Lc94
            r4 = r6
        Lc1b:
            int r9 = r10.b(r4)
            if (r20 == 0) goto Lc97
            r4 = 160(0xa0, float:2.24E-43)
            r6 = 255(0xff, float:3.57E-43)
            r8 = 255(0xff, float:3.57E-43)
            r10 = 255(0xff, float:3.57E-43)
            int r4 = android.graphics.Color.argb(r4, r6, r8, r10)
        Lc2d:
            r8 = 0
            r6 = r13
            r10 = r4
        Lc30:
            r4 = 1
            if (r5 != r4) goto Ld1c
            r4 = 35
        Lc35:
            int r13 = android.graphics.Color.red(r11)
            int r14 = android.graphics.Color.green(r11)
            int r15 = android.graphics.Color.blue(r11)
            int r13 = android.graphics.Color.argb(r4, r13, r14, r15)
            r4 = 1
            if (r5 != r4) goto Ld20
            r4 = 1105199104(0x41e00000, float:28.0)
        Lc4a:
            float r14 = defpackage.ff.p(r4)
            r4 = 1
            if (r5 != r4) goto Ld24
            r15 = 0
        Lc52:
            r4 = r5 ^ (-1)
            r4 = r4 & 1
            r16 = r5 & (-2)
            r16 = r16 | r4
            on r4 = new on
            r17 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = r22
            r1 = r21
            r0.put(r1, r4)
            r5 = r4
            goto Lf6
        Lc6b:
            r12 = 4645040803167600640(0x4076800000000000, double:360.0)
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 < 0) goto Lab5
            r12 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r8 = r8 + r12
            r12 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r8 = r8 - r12
            r12 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r8 = r8 - r12
            goto Lab5
        Lc82:
            r10 = r8
            goto Laec
        Lc85:
            r4 = 45
            goto Lbf8
        Lc89:
            r4 = 98
            goto Lc02
        Lc8d:
            r4 = 95
            goto Lc0c
        Lc91:
            r4 = 90
            goto Lc14
        Lc94:
            r4 = 15
            goto Lc1b
        Lc97:
            r4 = 40
            int r4 = r8.b(r4)
            goto Lc2d
        Lc9e:
            if (r20 == 0) goto Lcf6
            java.lang.String r4 = "RRvmj3SlBA==\n"
            java.lang.String r6 = "ZivWv0SVNA4=\n"
        Lca4:
            java.lang.String r4 = defpackage.u40.a(r4, r6)
            int r13 = android.graphics.Color.parseColor(r4)
            if (r20 == 0) goto Lcfb
            java.lang.String r4 = "Svz3k8Oo8A==\n"
            java.lang.String r6 = "ac20ooCZtXA=\n"
        Lcb2:
            java.lang.String r4 = defpackage.u40.a(r4, r6)
            int r7 = android.graphics.Color.parseColor(r4)
            if (r20 == 0) goto Ld00
            java.lang.String r4 = "iP8rEbHUnsft\n"
            java.lang.String r6 = "q84ZV/eS2IE=\n"
        Lcc0:
            java.lang.String r4 = defpackage.u40.a(r4, r6)
            int r8 = android.graphics.Color.parseColor(r4)
            if (r20 == 0) goto Ld05
            java.lang.String r4 = "ni4gbYT66A==\n"
            java.lang.String r6 = "vRwWX7LI0Hg=\n"
        Lcce:
            java.lang.String r4 = defpackage.u40.a(r4, r6)
            int r12 = android.graphics.Color.parseColor(r4)
            if (r20 == 0) goto Ld0a
            java.lang.String r6 = "ES+GIVCOLQ==\n"
            java.lang.String r4 = "MmnAZxbIa6o=\n"
        Lcdc:
            java.lang.String r4 = defpackage.u40.a(r6, r4)
            int r9 = android.graphics.Color.parseColor(r4)
            if (r20 == 0) goto Ld0f
            r4 = 160(0xa0, float:2.24E-43)
            r6 = 255(0xff, float:3.57E-43)
            r10 = 255(0xff, float:3.57E-43)
            r14 = 255(0xff, float:3.57E-43)
            int r4 = android.graphics.Color.argb(r4, r6, r10, r14)
        Lcf2:
            r6 = r13
            r10 = r4
            goto Lc30
        Lcf6:
            java.lang.String r4 = "M1jAtL2vjw==\n"
            java.lang.String r6 = "EB7z8onpubI=\n"
            goto Lca4
        Lcfb:
            java.lang.String r4 = "FCP8aJtyYw==\n"
            java.lang.String r6 = "N2W6Lt00JUE=\n"
            goto Lcb2
        Ld00:
            java.lang.String r4 = "LxODVoCy2Z48\n"
            java.lang.String r6 = "DCPCZrCC6a4=\n"
            goto Lcc0
        Ld05:
            java.lang.String r4 = "D3y4QF7ekw==\n"
            java.lang.String r6 = "LDmNBWub0tc=\n"
            goto Lcce
        Ld0a:
            java.lang.String r6 = "ciQYlT1wCw==\n"
            java.lang.String r4 = "URUppAxBOnY=\n"
            goto Lcdc
        Ld0f:
            java.lang.String r4 = "7c0rozT1Sw==\n"
            java.lang.String r6 = "zvVum3HMePE=\n"
            java.lang.String r4 = "#8E8E93"
            int r4 = android.graphics.Color.parseColor(r4)
            goto Lcf2
        Ld1c:
            r4 = 20
            goto Lc35
        Ld20:
            r4 = 1103101952(0x41c00000, float:24.0)
            goto Lc4a
        Ld24:
            r4 = 1094713344(0x41400000, float:12.0)
            float r15 = defpackage.ff.p(r4)
            goto Lc52
        Ld2c:
            r4 = 90
            int r4 = defpackage.ff.q(r4)
            goto L31e
        Ld34:
            r4 = 0
            r14 = 0
            r19 = 0
            r20 = 0
            r0 = r37
            r1 = r19
            r2 = r20
            r0.setPadding(r4, r14, r1, r2)
            goto L5b3
        Ld45:
            r4 = 160(0xa0, float:2.24E-43)
            goto L5cb
        Ld49:
            r4 = 255(0xff, float:3.57E-43)
            goto L5cb
        Ld4d:
            r14 = 80
            int r14 = defpackage.ff.q(r14)
            goto L5dc
        Ld55:
            java.lang.String r14 = "915QR/4fsIeS\n"
            java.lang.String r4 = "1GoUAbhZ9sE=\n"
            goto L624
        Ld5b:
            java.lang.String r4 = "pUc/YIMGH262\n"
            java.lang.String r14 = "hncMULM2L14=\n"
            goto L660
        Ld61:
            java.lang.String r4 = "VFrkDlei7wJH\n"
            java.lang.String r14 = "d2rSPmeS3zI=\n"
            goto L673
        Ld67:
            r4 = 24
            int r4 = defpackage.ff.q(r4)
            goto L6a2
        Ld6f:
            r4 = 30
            goto L6ca
        Ld73:
            r4 = 1792(0x700, float:2.511E-42)
            goto L81e
        Ld77:
            r6 = r4
            goto L96
    }

    public static final android.widget.ScrollView b(android.app.Activity r5, int r6) {
            r1 = 0
            r4 = 0
            java.lang.String r0 = "ۧۨ۟"
            int r3 = android.app.C0002.m8(r0)
            r0 = r1
            r2 = r1
        La:
            switch(r3) {
                case 56325: goto Le;
                case 1747718: goto L86;
                case 1748802: goto L3f;
                case 1749695: goto L27;
                case 1750655: goto L74;
                case 1750812: goto L1c;
                case 1751778: goto L7a;
                case 1754654: goto L37;
                case 1755374: goto L4d;
                case 1755585: goto L61;
                default: goto Ld;
            }
        Ld:
            goto La
        Le:
            r0.setOnTouchListener(r2)
            int r1 = androidx.constraintlayout.widget.C0018.f18
            int r3 = androidx.appcompat.widget.C0013.f13
            r1 = r1 ^ r3
            r3 = 1748003(0x1aac23, float:2.449474E-39)
            int r1 = r1 + r3
            r3 = r1
            goto La
        L1c:
            r0.setClipToPadding(r4)
            java.lang.String r1 = "ۡۥۦ"
        L21:
            int r1 = defpackage.C0071.m286(r1)
            r3 = r1
            goto La
        L27:
            int r1 = androidx.appcompat.widget.C0015.m61()
            if (r1 > 0) goto L34
            r1 = 29
            android.app.C0000.f0 = r1
            java.lang.String r1 = "ۣ۠ۨ"
            goto L21
        L34:
            java.lang.String r1 = "ۧۨ۟"
            goto L21
        L37:
            android.widget.ScrollView r0 = new android.widget.ScrollView
            r0.<init>(r5)
            java.lang.String r1 = "ۣۣ۟"
            goto L21
        L3f:
            r0.setPadding(r4, r4, r4, r6)
            int r1 = androidx.fragment.app.C0027.f27
            int r3 = com.github.megatronking.stringfog.C0048.f48
            int r1 = r1 - r3
            r3 = 1756120(0x1acbd8, float:2.460848E-39)
            int r1 = r1 + r3
            r3 = r1
            goto La
        L4d:
            w6 r1 = new w6
            int r2 = androidx.fragment.app.C0027.f27
            r2 = r2 ^ (-442(0xfffffffffffffe46, float:NaN))
            r1.<init>(r2)
            int r2 = androidx.savedstate.C0034.f34
            int r3 = com.github.megatronking.stringfog.C0047.f47
            int r2 = r2 - r3
            r3 = -1751409(0xffffffffffe5468f, float:NaN)
            r3 = r3 ^ r2
            r2 = r1
            goto La
        L61:
            int r1 = androidx.fragment.app.C0027.f27
            r1 = r1 ^ (-441(0xfffffffffffffe47, float:NaN))
            r0.setOverScrollMode(r1)
            int r1 = androidx.activity.result.C0009.f9
            if (r1 < 0) goto L6c
        L6c:
            java.lang.String r1 = "ۣۨۡ"
            int r1 = android.app.C0001.m5(r1)
            r3 = r1
            goto La
        L74:
            r0.setVerticalScrollBarEnabled(r4)
            java.lang.String r1 = "ۨۧ۠"
            goto L21
        L7a:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.c = r1
            java.lang.String r1 = "۠ۥ"
            int r1 = androidx.coordinatorlayout.widget.C0022.m90(r1)
            r3 = r1
            goto La
        L86:
            return r0
    }

    public static final android.widget.LinearLayout c(android.app.Activity r28, defpackage.on r29, android.widget.ScrollView r30, android.widget.ScrollView r31, android.widget.ScrollView r32, android.widget.ScrollView r33, android.widget.LinearLayout r34, android.widget.LinearLayout r35, android.widget.LinearLayout r36, android.widget.LinearLayout r37, android.widget.LinearLayout r38, android.view.View r39, defpackage.h40 r40, defpackage.h40 r41, int r42, java.lang.String r43, java.lang.String r44) {
            r19 = 0
            r24 = 0
            r22 = 0
            r18 = 0
            r17 = 0
            r21 = 0
            r4 = 0
            r2 = 0
            r3 = 0
            r23 = 0
            r20 = 0
            java.lang.String r5 = "۟۟"
            int r5 = androidx.recyclerview.widget.C0032.m130(r5)
            r25 = r2
            r26 = r3
            r27 = r4
        L1f:
            switch(r5) {
                case 56288: goto L23;
                case 56296: goto L39f;
                case 56507: goto La4;
                case 1746815: goto L85;
                case 1746851: goto L2d3;
                case 1747715: goto L210;
                case 1747747: goto L40;
                case 1747748: goto Lb0;
                case 1748897: goto L1ab;
                case 1749571: goto Le3;
                case 1749634: goto L376;
                case 1749666: goto L2b2;
                case 1749850: goto L175;
                case 1750564: goto L1c3;
                case 1750659: goto L271;
                case 1750725: goto L35c;
                case 1750757: goto L1e7;
                case 1751650: goto L24c;
                case 1751776: goto L330;
                case 1752492: goto L2ff;
                case 1752585: goto L181;
                case 1753420: goto L10c;
                case 1753445: goto L28e;
                case 1753449: goto Lc8;
                case 1753511: goto L23d;
                case 1753600: goto L152;
                case 1755619: goto L59;
                default: goto L22;
            }
        L22:
            goto L1f
        L23:
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r0 = r28
            r2.<init>(r0)
            r3 = 1
            r2.setOrientation(r3)
            int r3 = android.support.v4.graphics.drawable.C0005.f5
            if (r3 > 0) goto L78
            java.lang.String r4 = "ۦۡ"
            r3 = r20
        L36:
            int r4 = androidx.fragment.app.C0027.m110(r4)
            r19 = r2
            r20 = r3
            r5 = r4
            goto L1f
        L40:
            r0 = r19
            r1 = r22
            r0.addView(r1)
            r0 = r19
            r1 = r27
            r0.addView(r1)
            int r2 = androidx.constraintlayout.widget.C0019.f19
            int r3 = androidx.core.content.C0024.f24
            r2 = r2 | r3
            r3 = 1753325(0x1ac0ed, float:2.456932E-39)
            int r2 = r2 + r3
            r5 = r2
            goto L1f
        L59:
            r0 = r29
            int r3 = r0.f
            r0 = r29
            int r2 = r0.a
            int r4 = androidx.coordinatorlayout.widget.C0021.f21
            if (r4 < 0) goto L75
            r4 = 37
            androidx.versionedparcelable.C0042.f42 = r4
        L69:
            java.lang.String r4 = "۟ۧ"
        L6b:
            int r4 = com.github.megatronking.stringfog.C0048.m193(r4)
            r17 = r2
            r18 = r3
            r5 = r4
            goto L1f
        L75:
            java.lang.String r4 = "ۢ۟۠"
            goto L6b
        L78:
            int r3 = androidx.constraintlayout.helper.widget.C0017.f17
            int r4 = androidx.activity.result.C0008.f8
            r3 = r3 | r4
            r4 = 1748005(0x1aac25, float:2.449477E-39)
            int r3 = r3 + r4
            r19 = r2
            r5 = r3
            goto L1f
        L85:
            int r2 = com.github.megatronking.stringfog.xor.C0045.m181()
            if (r2 > 0) goto L9b
            r2 = 80
            defpackage.C0072.f72 = r2
            java.lang.String r3 = "ۣ۟ۧ"
            r2 = r21
        L93:
            int r3 = androidx.profileinstaller.C0030.m120(r3)
            r21 = r2
            r5 = r3
            goto L1f
        L9b:
            java.lang.String r2 = "۟ۧ"
            int r2 = com.google.android.material.appbar.C0049.m197(r2)
            r5 = r2
            goto L1f
        La4:
            int r2 = com.google.android.material.datepicker.C0058.f58
            int r3 = androidx.savedstate.C0034.f34
            int r2 = r2 + r3
            r3 = 56358(0xdc26, float:7.8974E-41)
            int r2 = r2 + r3
            r5 = r2
            goto L1f
        Lb0:
            int r2 = androidx.recyclerview.widget.C0033.f33
            r4 = r2 ^ 199(0xc7, float:2.79E-43)
            r0 = r19
            r0.setGravity(r4)
            java.lang.String r3 = "۟ۤۨ"
            r2 = r23
        Lbd:
            int r3 = androidx.activity.C0010.m43(r3)
            r23 = r2
            r24 = r4
            r5 = r3
            goto L1f
        Lc8:
            h40 r2 = new h40
            qh r3 = defpackage.h40.n
            r0 = r19
            r2.<init>(r0, r3)
            i40 r3 = new i40
            r3.<init>()
            java.lang.String r4 = "ۥ۠ۧ"
            int r4 = androidx.recyclerview.widget.C0032.m130(r4)
            r25 = r2
            r26 = r3
            r5 = r4
            goto L1f
        Le3:
            r0 = r22
            r1 = r18
            r0.setTextColor(r1)
            r0 = r22
            r1 = r24
            r0.setGravity(r1)
            int r2 = com.google.android.material.carousel.C0055.m223()
            if (r2 < 0) goto L108
            r2 = 73
            com.github.megatronking.stringfog.C0048.f48 = r2
            r2 = r22
        Lfd:
            java.lang.String r3 = "ۣ۠ۡ"
            r22 = r2
        L101:
            int r2 = com.google.android.material.behavior.C0050.m203(r3)
            r5 = r2
            goto L1f
        L108:
            java.lang.String r2 = "ۦ۠۟"
            r3 = r2
            goto L101
        L10c:
            p20 r2 = new p20
            r3 = r42
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r37
            r12 = r38
            r13 = r29
            r14 = r39
            r15 = r40
            r16 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r19
            r0.setOnClickListener(r2)
            if (r17 != 0) goto L85
            int r2 = com.ljx.wechatmod.ui.C0067.f67
            int r3 = com.github.megatronking.stringfog.annotation.C0044.f44
            r3 = r3 ^ (-7843(0xffffffffffffe15d, float:NaN))
            int r2 = r2 % r3
            if (r2 < 0) goto L149
            androidx.appcompat.widget.C0016.m66()
        L140:
            java.lang.String r2 = "ۥۣۧ"
            int r2 = androidx.appcompat.app.C0012.m50(r2)
            r5 = r2
            goto L1f
        L149:
            java.lang.String r2 = "ۦۣ۠"
            int r2 = androidx.activity.result.C0009.m38(r2)
            r5 = r2
            goto L1f
        L152:
            r2 = 1056964608(0x3f000000, float:0.5)
            r0 = r20
            r0.a(r2)
            r0 = r20
            r1 = r23
            r1.j = r0
            int r2 = android.app.C0000.f0
            int r3 = com.google.android.material.carousel.C0052.f52
            int r3 = r3 / 3806
            int r2 = r2 + r3
            if (r2 > 0) goto L140
            r2 = 30
            androidx.appcompat.widget.C0014.f14 = r2
            java.lang.String r2 = "۠ۢۥ"
            int r2 = androidx.constraintlayout.widget.C0018.m73(r2)
            r5 = r2
            goto L1f
        L175:
            int r2 = androidx.appcompat.app.C0012.f12
            int r3 = com.google.android.material.theme.C0064.f64
            int r2 = r2 - r3
            r3 = 1747773(0x1aab3d, float:2.449152E-39)
            int r2 = r2 + r3
            r5 = r2
            goto L1f
        L181:
            q20 r2 = new q20
            r0 = r25
            r1 = r23
            r2.<init>(r0, r1)
            r0 = r19
            r0.setOnTouchListener(r2)
            int r2 = com.google.android.material.appbar.C0049.f49
            int r3 = androidx.versionedparcelable.C0041.f41
            r3 = r3 ^ (-5733(0xffffffffffffe99b, float:NaN))
            int r2 = r2 - r3
            if (r2 > 0) goto L1a5
            r2 = 8
            androidx.activity.result.C0009.f9 = r2
            java.lang.String r2 = "ۣۦۨ"
            int r2 = com.ljx.wechatmod.auth.C0065.m263(r2)
            r5 = r2
            goto L1f
        L1a5:
            r2 = r17
            r3 = r18
            goto L69
        L1ab:
            if (r21 == 0) goto L2b2
            int r2 = androidx.coordinatorlayout.widget.C0022.f22
            int r3 = android.app.C0002.f2
            r3 = r3 ^ 6289(0x1891, float:8.813E-42)
            int r2 = r2 - r3
            if (r2 < 0) goto L284
            r2 = 69
            androidx.versionedparcelable.C0038.f38 = r2
            java.lang.String r2 = "ۢۡۡ"
            int r2 = androidx.viewpager2.adapter.C0043.m173(r2)
            r5 = r2
            goto L1f
        L1c3:
            r0 = r22
            r1 = r44
            r0.setText(r1)
            r2 = 1102053376(0x41b00000, float:22.0)
            r0 = r22
            r0.setTextSize(r2)
            int r2 = com.google.android.material.datepicker.C0059.f59
            if (r2 < 0) goto L1de
            java.lang.String r2 = "۠ۢۦ"
            int r2 = com.ljx.wechatmod.hook.C0066.m264(r2)
            r5 = r2
            goto L1f
        L1de:
            java.lang.String r2 = "ۣۨۨ"
        L1e0:
            int r2 = com.github.megatronking.stringfog.annotation.C0044.m176(r2)
            r5 = r2
            goto L1f
        L1e7:
            r0 = r26
            r1 = r25
            r1.j = r0
            h40 r2 = new h40
            qh r3 = defpackage.h40.o
            r0 = r19
            r2.<init>(r0, r3)
            int r3 = com.github.megatronking.stringfog.xor.C0045.f45
            int r4 = com.google.android.material.chip.C0057.f57
            int r4 = r4 + 631
            int r3 = r3 + r4
            if (r3 < 0) goto L205
            java.lang.String r3 = "ۣۨۨ"
            r4 = r24
            goto Lbd
        L205:
            java.lang.String r3 = "ۣۣۣ"
            int r3 = com.github.megatronking.stringfog.C0047.m189(r3)
            r23 = r2
            r5 = r3
            goto L1f
        L210:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = defpackage.ff.p(r2)
            r0 = r22
            r0.setElevation(r2)
            int r2 = defpackage.C0073.f73
            int r3 = com.google.android.material.datepicker.C0059.f59
            int r3 = r3 % (-3995)
            int r2 = r2 + r3
            if (r2 < 0) goto L231
            r2 = 71
            com.github.megatronking.stringfog.xor.C0045.f45 = r2
            java.lang.String r2 = "۠ۡۤ"
            int r2 = androidx.activity.C0010.m43(r2)
            r5 = r2
            goto L1f
        L231:
            int r2 = androidx.emoji2.text.C0026.f26
            int r3 = defpackage.C0073.f73
            int r2 = r2 * r3
            r3 = 1738607(0x1a876f, float:2.436307E-39)
            r2 = r2 ^ r3
            r5 = r2
            goto L1f
        L23d:
            r2 = 1
            r0 = r17
            if (r0 != r2) goto L175
            java.lang.String r2 = "۠ۡۤ"
            r3 = r2
        L245:
            int r2 = android.support.v4.graphics.drawable.C0005.m23(r3)
            r5 = r2
            goto L1f
        L24c:
            r0 = r22
            r1 = r21
            r0.setTypeface(r1)
            int r2 = android.support.v4.graphics.drawable.C0005.f5
            int r3 = androidx.appcompat.app.C0012.f12
            r3 = r3 | (-2475(0xfffffffffffff655, float:NaN))
            int r2 = r2 % r3
            if (r2 > 0) goto L265
            java.lang.String r2 = "۟ۤۨ"
            int r2 = androidx.activity.result.C0009.m38(r2)
            r5 = r2
            goto L1f
        L265:
            int r2 = androidx.appcompat.widget.C0016.f16
            int r3 = androidx.legacy.content.C0028.f28
            int r2 = r2 + r3
            r3 = 1749717(0x1ab2d5, float:2.451876E-39)
            int r2 = r2 + r3
            r5 = r2
            goto L1f
        L271:
            i40 r3 = new i40
            r3.<init>()
            r2 = 1153138688(0x44bb8000, float:1500.0)
            r3.b(r2)
            int r2 = android.app.C0003.m14()
            if (r2 < 0) goto L288
            r20 = r3
        L284:
            java.lang.String r2 = "ۤۤۢ"
            goto L1e0
        L288:
            java.lang.String r4 = "ۦۥ۟"
            r2 = r19
            goto L36
        L28e:
            r2 = 0
            r3 = 0
            r4 = 0
            int r5 = androidx.constraintlayout.widget.C0019.f19
            r5 = r5 ^ 95
            int r5 = defpackage.ff.q(r5)
            r0 = r22
            r0.setPadding(r2, r3, r4, r5)
            android.graphics.Typeface r2 = defpackage.xn.a
            int r3 = androidx.appcompat.widget.C0014.f14
            int r4 = android.app.C0001.f1
            r4 = r4 | (-9714(0xffffffffffffda0e, float:NaN))
            int r3 = r3 + r4
            if (r3 < 0) goto L2ae
            java.lang.String r3 = "ۡۨۨ"
            r21 = r2
            goto L245
        L2ae:
            java.lang.String r3 = "ۡۨۨ"
            goto L93
        L2b2:
            int r2 = com.ljx.wechatmod.auth.C0065.f65
            int r3 = androidx.versionedparcelable.C0038.f38
            int r3 = r3 % (-6334)
            int r2 = r2 - r3
            if (r2 < 0) goto L2c7
            kotlinx.coroutines.C0069.m276()
            java.lang.String r2 = "ۦ۟ۦ"
            int r2 = com.google.android.material.behavior.C0050.m203(r2)
            r5 = r2
            goto L1f
        L2c7:
            int r2 = android.app.C0002.f2
            int r3 = android.app.C0000.f0
            int r2 = r2 / r3
            r3 = 1749635(0x1ab283, float:2.451761E-39)
            r2 = r2 ^ r3
            r5 = r2
            goto L1f
        L2d3:
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 0
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3, r4, r5)
            r0 = r19
            r0.setLayoutParams(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r0 = r28
            r2.<init>(r0)
            int r3 = androidx.startup.C0037.f37
            int r4 = androidx.appcompat.widget.C0015.f15
            int r4 = r4 % 9102
            int r3 = r3 * r4
            if (r3 > 0) goto Lfd
            androidx.activity.result.C0009.m36()
            java.lang.String r3 = "ۣۣۣ"
            int r3 = io.fastkv.C0068.m272(r3)
            r22 = r2
            r5 = r3
            goto L1f
        L2ff:
            r2 = 1153138688(0x44bb8000, float:1500.0)
            r0 = r26
            r0.b(r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            r0 = r26
            r0.a(r2)
            int r2 = androidx.savedstate.C0036.f36
            int r3 = androidx.core.content.C0024.f24
            int r3 = r3 % (-9145)
            r2 = r2 ^ r3
            if (r2 > 0) goto L324
            r2 = 35
            com.google.android.material.floatingactionbutton.C0060.f60 = r2
            java.lang.String r2 = "ۦۥ۟"
            int r2 = androidx.profileinstaller.C0030.m120(r2)
            r5 = r2
            goto L1f
        L324:
            int r2 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r3 = androidx.profileinstaller.C0031.f31
            int r2 = r2 - r3
            r3 = 1750295(0x1ab517, float:2.452686E-39)
            int r2 = r2 + r3
            r5 = r2
            goto L1f
        L330:
            r0 = r27
            r1 = r24
            r0.setGravity(r1)
            android.graphics.Typeface r2 = defpackage.mn.a
            r3 = 1
            r0 = r27
            r0.setTypeface(r2, r3)
            int r2 = androidx.coordinatorlayout.widget.C0021.f21
            int r3 = com.github.megatronking.stringfog.C0048.f48
            int r3 = r3 % 774
            int r2 = r2 + r3
            if (r2 < 0) goto L354
            androidx.startup.C0037.m150()
            java.lang.String r2 = "ۤۨۤ"
            int r2 = androidx.core.widget.C0025.m102(r2)
            r5 = r2
            goto L1f
        L354:
            java.lang.String r3 = "ۦۣۢ"
            r2 = r23
            r4 = r24
            goto Lbd
        L35c:
            r2 = 1093664768(0x41300000, float:11.0)
            r0 = r27
            r0.setTextSize(r2)
            r0 = r27
            r1 = r18
            r0.setTextColor(r1)
            int r2 = com.google.android.material.datepicker.C0059.f59
            int r3 = androidx.appcompat.app.C0012.f12
            r2 = r2 | r3
            r3 = -1751145(0xffffffffffe54797, float:NaN)
            r2 = r2 ^ r3
            r5 = r2
            goto L1f
        L376:
            android.widget.TextView r2 = new android.widget.TextView
            r0 = r28
            r2.<init>(r0)
            r0 = r43
            r2.setText(r0)
            int r3 = androidx.core.content.C0024.f24
            if (r3 > 0) goto L391
            java.lang.String r3 = "ۣۣ۟"
            int r3 = androidx.appcompat.widget.C0013.m53(r3)
            r27 = r2
            r5 = r3
            goto L1f
        L391:
            int r3 = androidx.recyclerview.widget.C0033.f33
            int r4 = androidx.activity.C0011.f11
            r3 = r3 | r4
            r4 = 1750767(0x1ab6ef, float:2.453347E-39)
            int r3 = r3 + r4
            r27 = r2
            r5 = r3
            goto L1f
        L39f:
            return r19
    }

    public static final void d(android.widget.ScrollView r50, android.widget.ScrollView r51, android.widget.ScrollView r52, android.widget.ScrollView r53, android.widget.LinearLayout r54, android.widget.LinearLayout r55, android.widget.LinearLayout r56, android.widget.LinearLayout r57, android.widget.LinearLayout r58, defpackage.on r59, android.view.View r60, defpackage.h40 r61, defpackage.h40 r62, int r63, boolean r64) {
            r30 = 0
            r18 = 0
            r29 = 0
            r12 = 0
            r10 = 0
            r11 = 0
            r44 = 0
            r34 = 0
            r36 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            r17 = 0
            r6 = 0
            r3 = 0
            r14 = 0
            r4 = 0
            r9 = 0
            r5 = 0
            r8 = 0
            r7 = 0
            r19 = 0
            r25 = 0
            r24 = 0
            r26 = 0
            r22 = 0
            r20 = 0
            r28 = 0
            r2 = 0
            r21 = 0
            r13 = 0
            r37 = 0
            r16 = 0
            r15 = 0
            r31 = 0
            r27 = 0
            r23 = 0
            java.lang.String r38 = "۠ۧ۠"
            int r43 = androidx.profileinstaller.C0031.m127(r38)
            r38 = r4
            r39 = r2
            r40 = r13
            r41 = r14
            r42 = r28
        L4c:
            switch(r43) {
                case 56324: goto L50;
                case 56414: goto L5c8;
                case 56418: goto L218;
                case 56447: goto L4c5;
                case 56477: goto L8db;
                case 1746720: goto L907;
                case 1746781: goto L2fd;
                case 1746846: goto L7f8;
                case 1746874: goto L447;
                case 1746909: goto L851;
                case 1746911: goto L499;
                case 1746913: goto L493;
                case 1747654: goto L11b;
                case 1747656: goto La7;
                case 1747713: goto L1fd;
                case 1747806: goto L24c;
                case 1747840: goto L29e;
                case 1747897: goto L40c;
                case 1747900: goto L675;
                case 1747904: goto L275;
                case 1747935: goto L7e0;
                case 1748703: goto L8a2;
                case 1748860: goto L78d;
                case 1748863: goto L1fd;
                case 1749571: goto L582;
                case 1749664: goto L6d;
                case 1749696: goto L628;
                case 1749791: goto L4c5;
                case 1749793: goto L669;
                case 1749855: goto L2ec;
                case 1750533: goto L2d1;
                case 1750535: goto L23c;
                case 1750564: goto L750;
                case 1750629: goto L902;
                case 1750663: goto L76d;
                case 1750692: goto L282;
                case 1750750: goto L275;
                case 1751496: goto L3a5;
                case 1751558: goto L4ff;
                case 1751559: goto L4d2;
                case 1751561: goto L71f;
                case 1751593: goto Lf5;
                case 1751653: goto L72c;
                case 1751655: goto L895;
                case 1751745: goto L11b;
                case 1751771: goto L335;
                case 1751779: goto L903;
                case 1752461: goto L389;
                case 1752524: goto L178;
                case 1752551: goto L83;
                case 1752676: goto L7ae;
                case 1752704: goto L2d1;
                case 1753450: goto L5c;
                case 1753543: goto L4f2;
                case 1753546: goto L132;
                case 1753570: goto L870;
                case 1753575: goto L817;
                case 1753698: goto L699;
                case 1754410: goto L158;
                case 1754413: goto L3e9;
                case 1754437: goto L125;
                case 1754439: goto L3aa;
                case 1754476: goto L6c1;
                case 1754537: goto L5e1;
                case 1754561: goto L5fb;
                case 1754632: goto L1ba;
                case 1754656: goto L359;
                case 1755373: goto L6d;
                case 1755438: goto Lc9;
                case 1755524: goto L19b;
                case 1755527: goto L55e;
                default: goto L4f;
            }
        L4f:
            goto L4c
        L50:
            java.lang.String r2 = "ۤۢۧ"
            r4 = r2
            r20 = r22
        L55:
            int r2 = android.support.v4.graphics.drawable.C0005.m23(r4)
            r43 = r2
            goto L4c
        L5c:
            r2 = r8
            r4 = r9
        L5e:
            int r8 = androidx.recyclerview.widget.C0032.f32
            int r9 = com.google.android.material.carousel.C0055.f55
            int r8 = r8 / r9
            r9 = 1752551(0x1abde7, float:2.455847E-39)
            int r13 = r8 + r9
            r8 = r2
            r9 = r4
            r43 = r13
            goto L4c
        L6d:
            int r2 = android.support.v4.graphics.drawable.C0005.m20()
            if (r2 < 0) goto L80
            r2 = 39
            android.app.C0003.f3 = r2
            java.lang.String r2 = "ۦۦۨ"
        L79:
            int r2 = androidx.appcompat.widget.C0016.m65(r2)
            r43 = r2
            goto L4c
        L80:
            java.lang.String r2 = "ۣۤ۟"
            goto L79
        L83:
            r4 = 0
            int r2 = androidx.legacy.content.C0028.f28
            int r7 = com.google.android.material.chip.C0056.f56
            int r7 = r7 % (-3596)
            int r2 = r2 / r7
            if (r2 > 0) goto L9b
            r2 = 87
            androidx.profileinstaller.C0031.f31 = r2
            java.lang.String r2 = "۠ۧۧ"
            int r2 = io.fastkv.C0068.m272(r2)
            r7 = r4
            r43 = r2
            goto L4c
        L9b:
            r2 = r6
        L9c:
            java.lang.String r6 = "ۣۥ"
            int r13 = com.google.android.material.carousel.C0052.m209(r6)
            r6 = r2
            r7 = r4
            r43 = r13
            goto L4c
        La7:
            int r2 = com.google.android.material.behavior.C0050.m202()
            if (r2 < 0) goto Lbc
            r2 = 68
            androidx.coordinatorlayout.widget.C0022.f22 = r2
            java.lang.String r2 = "ۧۡ۟"
            int r2 = defpackage.C0072.m288(r2)
            r43 = r2
            r23 = r17
            goto L4c
        Lbc:
            java.lang.String r2 = "ۡۢ۠"
            r4 = r17
        Lc0:
            int r2 = com.google.android.material.chip.C0057.m229(r2)
            r43 = r2
            r23 = r4
            goto L4c
        Lc9:
            r2 = r10
            r4 = r11
        Lcb:
            int r10 = com.google.android.material.theme.C0062.f62
            int r11 = androidx.activity.result.C0009.f9
            int r11 = r11 % (-3887)
            int r10 = r10 % r11
            if (r10 < 0) goto Le5
            androidx.versionedparcelable.C0042.m169()
            java.lang.String r10 = "ۢ۟ۡ"
            r13 = r10
            r14 = r2
        Ldb:
            int r2 = androidx.appcompat.widget.C0015.m60(r13)
            r10 = r14
            r11 = r4
            r43 = r2
            goto L4c
        Le5:
            int r10 = com.google.android.material.carousel.C0052.f52
            int r11 = kotlinx.coroutines.C0070.f70
            int r10 = r10 - r11
            r11 = -1746777(0xffffffffffe558a7, float:NaN)
            r13 = r10 ^ r11
            r10 = r2
            r11 = r4
            r43 = r13
            goto L4c
        Lf5:
            if (r20 != 0) goto L227
            h40 r4 = new h40
            qh r2 = defpackage.h40.o
            r4.<init>(r6, r2)
            i40 r2 = new i40
            r2.<init>()
            r13 = 1128792064(0x43480000, float:200.0)
            r2.b(r13)
            int r13 = android.support.v4.graphics.drawable.C0006.f6
            int r14 = androidx.activity.C0010.f10
            int r13 = r13 * r14
            r14 = 2051374(0x1f4d2e, float:2.874587E-39)
            int r13 = r13 + r14
            r39 = r2
            r42 = r4
            r21 = r20
            r43 = r13
            goto L4c
        L11b:
            java.lang.String r2 = "ۧۡۡ"
        L11d:
            int r2 = androidx.core.widget.C0025.m102(r2)
            r43 = r2
            goto L4c
        L125:
            int r2 = androidx.versionedparcelable.C0039.f39
            int r4 = com.google.android.material.theme.C0062.f62
            r2 = r2 ^ r4
            r4 = 1752118(0x1abc36, float:2.45524E-39)
            int r2 = r2 + r4
            r43 = r2
            goto L4c
        L132:
            int r2 = androidx.versionedparcelable.C0042.f42
            int r4 = defpackage.C0073.f73
            int r4 = r4 + 2547
            r2 = r2 | r4
            if (r2 < 0) goto L148
            com.google.android.material.bottomsheet.C0051.m206()
            java.lang.String r2 = "ۣۦۡ"
            int r2 = com.google.android.material.datepicker.C0059.m239(r2)
            r43 = r2
            goto L4c
        L148:
            java.lang.String r2 = "۠۟ۥ"
            r28 = r2
            r4 = r25
        L14e:
            int r2 = com.ljx.wechatmod.ui.C0067.m271(r28)
            r25 = r4
            r43 = r2
            goto L4c
        L158:
            int r2 = androidx.savedstate.C0035.f35
            int r4 = com.ljx.wechatmod.auth.C0065.f65
            int r4 = r4 * 8546
            r2 = r2 | r4
            if (r2 < 0) goto L16d
            java.lang.String r2 = "ۢۨۦ"
            r4 = r15
        L164:
            int r2 = com.google.android.material.bottomsheet.C0051.m207(r2)
            r15 = r4
            r43 = r2
            goto L4c
        L16d:
            java.lang.String r2 = "ۡۧۢ"
            r4 = r2
        L170:
            int r2 = com.google.android.material.carousel.C0053.m213(r4)
            r43 = r2
            goto L4c
        L178:
            int r2 = com.google.android.material.bottomsheet.C0051.f51
            int r4 = androidx.appcompat.app.C0012.f12
            int r4 = r4 * (-7411)
            r2 = r2 ^ r4
            if (r2 > 0) goto L18e
            androidx.startup.C0037.m150()
            java.lang.String r2 = "ۧۤۤ"
            int r2 = androidx.legacy.content.C0028.m114(r2)
            r43 = r2
            goto L4c
        L18e:
            int r2 = androidx.versionedparcelable.C0042.f42
            int r4 = android.app.C0003.f3
            int r2 = r2 - r4
            r4 = 1749484(0x1ab1ec, float:2.451549E-39)
            int r2 = r2 + r4
            r43 = r2
            goto L4c
        L19b:
            int r2 = androidx.versionedparcelable.C0039.f39
            int r4 = com.github.megatronking.stringfog.xor.C0046.f46
            int r4 = r4 / 1334
            int r2 = r2 * r4
            if (r2 == 0) goto L1b6
            r2 = 72
            androidx.versionedparcelable.C0038.f38 = r2
            java.lang.String r2 = "ۥۨۥ"
            r4 = r17
        L1ac:
            int r2 = com.github.megatronking.stringfog.C0048.m193(r2)
            r17 = r4
            r43 = r2
            goto L4c
        L1b6:
            java.lang.String r2 = "ۧۢۧ"
            r4 = r2
            goto L170
        L1ba:
            r2 = 4
            android.widget.LinearLayout[] r2 = new android.widget.LinearLayout[r2]
            int r4 = androidx.fragment.app.C0027.f27
            r4 = r4 ^ (-443(0xfffffffffffffe45, float:NaN))
            r2[r4] = r54
            int r4 = com.google.android.material.datepicker.C0058.f58
            r4 = r4 ^ 854(0x356, float:1.197E-42)
            r2[r4] = r55
            int r4 = androidx.coordinatorlayout.widget.C0021.f21
            r4 = r4 ^ (-429(0xfffffffffffffe53, float:NaN))
            r2[r4] = r56
            int r4 = android.support.v4.graphics.drawable.C0004.f4
            r4 = r4 ^ (-657(0xfffffffffffffd6f, float:NaN))
            r2[r4] = r57
            int r4 = androidx.startup.C0037.f37
            if (r4 < 0) goto L1ee
            r4 = 60
            androidx.constraintlayout.widget.C0020.f20 = r4
            r4 = r2
            r13 = r19
        L1e0:
            java.lang.String r2 = "ۦۣۧ"
        L1e2:
            int r2 = androidx.versionedparcelable.C0042.m170(r2)
            r18 = r4
            r19 = r13
            r43 = r2
            goto L4c
        L1ee:
            int r4 = com.google.android.material.datepicker.C0058.f58
            int r13 = com.google.android.material.bottomsheet.C0051.f51
            int r4 = r4 - r13
            r13 = 1754730(0x1ac66a, float:2.4589E-39)
            r4 = r4 ^ r13
            r18 = r2
            r43 = r4
            goto L4c
        L1fd:
            int r2 = android.support.v4.graphics.drawable.C0004.f4
            if (r2 < 0) goto L20b
            java.lang.String r2 = "ۦۢۧ"
            int r2 = com.google.android.material.carousel.C0055.m220(r2)
            r43 = r2
            goto L4c
        L20b:
            int r2 = androidx.recyclerview.widget.C0033.f33
            int r4 = androidx.versionedparcelable.C0041.f41
            int r2 = r2 * r4
            r4 = 1825161(0x1bd989, float:2.557595E-39)
            r2 = r2 ^ r4
            r43 = r2
            goto L4c
        L218:
            int r2 = androidx.profileinstaller.C0030.f30
            int r4 = com.google.android.material.floatingactionbutton.C0060.f60
            r2 = r2 ^ r4
            r4 = 1753625(0x1ac219, float:2.457352E-39)
            int r2 = r2 + r4
            r19 = r7
            r43 = r2
            goto L4c
        L227:
            r2 = r20
        L229:
            int r4 = androidx.coordinatorlayout.widget.C0021.f21
            if (r4 < 0) goto L239
            java.lang.String r4 = "ۣۨۥ"
        L22f:
            int r4 = com.google.android.material.theme.C0064.m258(r4)
            r21 = r2
            r43 = r4
            goto L4c
        L239:
            java.lang.String r4 = "ۦۤۥ"
            goto L22f
        L23c:
            int r2 = androidx.recyclerview.widget.C0032.f32
            if (r2 < 0) goto L248
            r2 = 91
            androidx.savedstate.C0035.f35 = r2
            java.lang.String r2 = "ۨۢۦ"
            goto L11d
        L248:
            java.lang.String r2 = "۠ۧ۠"
            goto L11d
        L24c:
            r2 = 0
            int r4 = androidx.versionedparcelable.C0042.f42
            int r13 = com.google.android.material.carousel.C0053.f53
            int r13 = r13 % 2202
            int r4 = r4 + r13
            if (r4 < 0) goto L266
            r4 = 19
            androidx.lifecycle.C0029.f29 = r4
        L25a:
            java.lang.String r4 = "ۣۤ۟"
            int r4 = defpackage.C0071.m286(r4)
            r22 = r2
            r43 = r4
            goto L4c
        L266:
            int r4 = android.support.v4.graphics.drawable.C0005.f5
            int r13 = androidx.versionedparcelable.C0042.f42
            int r4 = r4 - r13
            r13 = 57269(0xdfb5, float:8.0251E-41)
            r4 = r4 ^ r13
            r22 = r2
            r43 = r4
            goto L4c
        L275:
            int r2 = androidx.activity.C0011.f11
            int r4 = com.google.android.material.theme.C0062.f62
            int r2 = r2 / r4
            r4 = 1755527(0x1ac987, float:2.460017E-39)
            int r2 = r2 + r4
            r43 = r2
            goto L4c
        L282:
            r2 = 0
            r0 = r62
            r0.b(r2)
            int r2 = androidx.core.content.C0023.f23
            int r4 = androidx.constraintlayout.widget.C0019.f19
            r4 = r4 | 9505(0x2521, float:1.332E-41)
            int r2 = r2 / r4
            if (r2 == 0) goto L29b
            java.lang.String r2 = "ۣ۟ۤ"
            int r2 = io.fastkv.C0068.m272(r2)
            r43 = r2
            goto L4c
        L29b:
            r2 = r22
            goto L25a
        L29e:
            r2 = 1058642330(0x3f19999a, float:0.6)
            r0 = r39
            r0.a(r2)
            r0 = r39
            r1 = r42
            r1.j = r0
            r2 = -2114126689(0xffffffff81fcfc9f, float:-9.2932674E-38)
            int r4 = androidx.activity.result.C0009.f9
            r2 = r2 ^ r4
            r0 = r42
            r6.setTag(r2, r0)
            int r2 = com.google.android.material.datepicker.C0059.m236()
            if (r2 > 0) goto L2ca
            com.github.megatronking.stringfog.C0047.m191()
            java.lang.String r2 = "ۥ۟ۧ"
            int r2 = androidx.versionedparcelable.C0038.m153(r2)
            r43 = r2
            goto L4c
        L2ca:
            java.lang.String r2 = "ۦۤ۠"
            r13 = r2
            r14 = r10
            r4 = r11
            goto Ldb
        L2d1:
            int r2 = com.github.megatronking.stringfog.C0047.f47
            if (r2 < 0) goto L2e2
            kotlinx.coroutines.C0070.m280()
            java.lang.String r2 = "ۤۧۡ"
            int r2 = com.github.megatronking.stringfog.annotation.C0044.m176(r2)
            r43 = r2
            goto L4c
        L2e2:
            java.lang.String r2 = "ۣۡ"
            int r2 = androidx.core.widget.C0025.m102(r2)
            r43 = r2
            goto L4c
        L2ec:
            int r2 = androidx.core.content.C0024.f24
            r2 = r2 ^ 0
            r0 = r29
            defpackage.gn.i(r0, r2)
            java.lang.String r2 = "ۥۢ"
            r4 = r18
            r13 = r19
            goto L1e2
        L2fd:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r4 = r29.getWidth()
            int r13 = r29.getHeight()
            r2.<init>(r4, r13)
            r0 = r60
            r0.setLayoutParams(r2)
            float r2 = r29.getX()
            r0 = r61
            r0.b(r2)
            int r2 = androidx.core.content.C0023.f23
            int r4 = androidx.appcompat.widget.C0013.f13
            int r4 = r4 + 8224
            int r2 = r2 % r4
            if (r2 > 0) goto L32b
            r2 = 89
            androidx.recyclerview.widget.C0032.f32 = r2
            java.lang.String r2 = "ۦۨۤ"
            r4 = r23
            goto Lc0
        L32b:
            java.lang.String r2 = "ۣۤۥ"
        L32d:
            int r2 = androidx.core.content.C0023.m95(r2)
            r43 = r2
            goto L4c
        L335:
            int r2 = com.github.megatronking.stringfog.xor.C0045.f45
            int r4 = androidx.legacy.content.C0028.f28
            r4 = r4 ^ 9892(0x26a4, float:1.3862E-41)
            r2 = r2 | r4
            if (r2 < 0) goto L34c
            r2 = 29
            defpackage.C0072.f72 = r2
            java.lang.String r2 = "ۣ۠ۨ"
            int r2 = androidx.appcompat.widget.C0016.m65(r2)
            r43 = r2
            goto L4c
        L34c:
            int r2 = androidx.appcompat.widget.C0013.f13
            int r4 = androidx.core.widget.C0025.f25
            int r2 = r2 / r4
            r4 = 1754561(0x1ac5c1, float:2.458664E-39)
            int r2 = r2 + r4
            r43 = r2
            goto L4c
        L359:
            r2 = -2114126218(0xffffffff81fcfe76, float:-9.2935314E-38)
            int r4 = androidx.recyclerview.widget.C0032.f32
            r4 = r4 ^ r2
            java.lang.Object r5 = r6.getTag(r4)
            boolean r8 = r5 instanceof defpackage.h40
            r2 = 0
            if (r8 == 0) goto L5e
            int r8 = androidx.savedstate.C0035.f35
            int r9 = com.github.megatronking.stringfog.C0047.f47
            int r9 = r9 * 3389
            r8 = r8 | r9
            if (r8 < 0) goto L37d
            java.lang.String r8 = "ۢۢ۠"
            int r13 = androidx.profileinstaller.C0031.m127(r8)
            r8 = r2
            r9 = r4
            r43 = r13
            goto L4c
        L37d:
            java.lang.String r8 = "ۣۣۧ"
            int r13 = com.github.megatronking.stringfog.xor.C0046.m186(r8)
            r8 = r2
            r9 = r4
            r43 = r13
            goto L4c
        L389:
            int r2 = com.google.android.material.floatingactionbutton.C0060.f60
            int r4 = io.fastkv.C0068.f68
            r4 = r4 ^ 8218(0x201a, float:1.1516E-41)
            int r2 = r2 / r4
            if (r2 == 0) goto L398
            androidx.appcompat.widget.C0016.m66()
            java.lang.String r2 = "ۡ۟ۨ"
            goto L32d
        L398:
            int r2 = kotlinx.coroutines.C0070.f70
            int r4 = com.ljx.wechatmod.auth.C0065.f65
            int r2 = r2 + r4
            r4 = -1751888(0xffffffffffe544b0, float:NaN)
            r2 = r2 ^ r4
            r43 = r2
            goto L4c
        L3a5:
            r4 = 0
            java.lang.String r2 = "۠۟ۧ"
            goto L1ac
        L3aa:
            if (r19 != 0) goto L71d
            h40 r4 = new h40
            qh r2 = defpackage.h40.n
            r4.<init>(r6, r2)
            i40 r2 = new i40
            r2.<init>()
            r13 = 1128792064(0x43480000, float:200.0)
            r2.b(r13)
            int r13 = com.ljx.wechatmod.ui.C0067.f67
            if (r13 < 0) goto L3d5
            r13 = 8
            androidx.versionedparcelable.C0038.f38 = r13
            r13 = r19
            r14 = r27
        L3c9:
            java.lang.String r25 = "ۣۡ"
            r24 = r2
            r28 = r25
            r26 = r13
            r27 = r14
            goto L14e
        L3d5:
            r13 = r30
            r25 = r4
            r26 = r19
        L3db:
            java.lang.String r4 = "ۥۦۥ"
            int r4 = androidx.appcompat.widget.C0013.m53(r4)
            r24 = r2
            r30 = r13
            r43 = r4
            goto L4c
        L3e9:
            r2 = r29
        L3eb:
            int r4 = defpackage.C0073.f73
            int r13 = android.app.C0003.f3
            r13 = r13 ^ (-9935(0xffffffffffffd931, float:NaN))
            r4 = r4 ^ r13
            if (r4 < 0) goto L3fd
            android.support.v4.graphics.drawable.C0004.m18()
            java.lang.String r4 = "ۣۣ۟"
            r29 = r2
            goto L170
        L3fd:
            int r4 = androidx.appcompat.widget.C0013.f13
            int r13 = androidx.core.content.C0023.f23
            int r4 = r4 + r13
            r13 = 56328(0xdc08, float:7.8932E-41)
            r4 = r4 ^ r13
            r29 = r2
            r43 = r4
            goto L4c
        L40c:
            r2 = 4
            android.widget.ScrollView[] r4 = new android.widget.ScrollView[r2]
            int r2 = androidx.activity.result.C0008.f8
            r2 = r2 ^ (-899(0xfffffffffffffc7d, float:NaN))
            r4[r2] = r50
            int r2 = androidx.appcompat.widget.C0015.f15
            r2 = r2 ^ (-878(0xfffffffffffffc92, float:NaN))
            r4[r2] = r51
            int r2 = com.google.android.material.floatingactionbutton.C0060.f60
            r2 = r2 ^ 956(0x3bc, float:1.34E-42)
            r4[r2] = r52
            int r2 = defpackage.C0072.f72
            r2 = r2 ^ (-638(0xfffffffffffffd82, float:NaN))
            r4[r2] = r53
            int r2 = com.google.android.material.carousel.C0052.f52
            int r13 = com.google.android.material.carousel.C0052.f52
            int r13 = r13 % (-6535)
            r2 = r2 ^ r13
            if (r2 == 0) goto L438
            r2 = 66
            androidx.activity.result.C0009.f9 = r2
            r2 = r24
            r13 = r4
            goto L3db
        L438:
            int r2 = com.google.android.material.internal.C0061.f61
            int r13 = com.google.android.material.carousel.C0052.f52
            int r2 = r2 % r13
            r13 = 1754154(0x1ac42a, float:2.458093E-39)
            int r2 = r2 + r13
            r30 = r4
            r43 = r2
            goto L4c
        L447:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r0 = r44
            int r4 = (int) r0
            r0 = r34
            int r13 = (int) r0
            r2.<init>(r4, r13)
            r0 = r60
            r0.setLayoutParams(r2)
            r2 = 1082130432(0x40800000, float:4.0)
            float r2 = r32 - r2
            float r2 = r2 + r36
            r4 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 + r4
            r0 = r61
            r0.b(r2)
            r2 = 1099956224(0x41900000, float:18.0)
            float r2 = r33 - r2
            float r2 = r2 - r35
            r4 = 1099956224(0x41900000, float:18.0)
            float r2 = r2 + r4
            r0 = r62
            r0.b(r2)
            int r2 = androidx.emoji2.text.C0026.f26
            int r4 = androidx.viewpager2.adapter.C0043.f43
            r4 = r4 ^ (-5209(0xffffffffffffeba7, float:NaN))
            int r2 = r2 / r4
            if (r2 == 0) goto L489
            com.google.android.material.datepicker.C0058.m232()
            java.lang.String r2 = "ۣۤ"
            int r2 = com.google.android.material.theme.C0063.m254(r2)
            r43 = r2
            goto L4c
        L489:
            java.lang.String r2 = "۠ۨۧ"
            int r2 = android.support.v4.graphics.drawable.C0004.m16(r2)
            r43 = r2
            goto L4c
        L493:
            java.lang.String r2 = "ۣۢۡ"
            r4 = r16
            goto L164
        L499:
            r2 = 2114126260(0x7e0301b4, float:4.353443E37)
            int r4 = android.support.v4.graphics.drawable.C0006.f6
            r2 = r2 ^ r4
            java.lang.Object r2 = r6.getTag(r2)
            boolean r4 = r2 instanceof defpackage.h40
            if (r4 == 0) goto L178
            h40 r2 = (defpackage.h40) r2
            int r4 = androidx.activity.C0011.m44()
            if (r4 > 0) goto L4bf
            r4 = 49
            androidx.versionedparcelable.C0040.f40 = r4
            java.lang.String r4 = "ۧۡۡ"
            int r4 = androidx.constraintlayout.widget.C0019.m79(r4)
            r20 = r2
            r43 = r4
            goto L4c
        L4bf:
            java.lang.String r4 = "ۧۤۦ"
            r20 = r2
            goto L55
        L4c5:
            int r2 = androidx.core.content.C0024.f24
            int r4 = androidx.appcompat.widget.C0015.f15
            int r2 = r2 % r4
            r4 = 1751594(0x1aba2a, float:2.454506E-39)
            r2 = r2 ^ r4
            r43 = r2
            goto L4c
        L4d2:
            r0 = r41
            r0.setTextColor(r10)
            r0 = r38
            r0.setTextColor(r10)
            if (r12 != 0) goto L335
            r2 = 1065353216(0x3f800000, float:1.0)
            r0 = r26
            r0.b(r2)
            int r2 = com.google.android.material.datepicker.C0059.f59
            int r4 = defpackage.C0072.f72
            int r2 = r2 + r4
            r4 = -1752880(0xffffffffffe540d0, float:NaN)
            r2 = r2 ^ r4
            r43 = r2
            goto L4c
        L4f2:
            r2 = 1066611507(0x3f933333, float:1.15)
            r0 = r21
            r0.b(r2)
            java.lang.String r2 = "ۧۢۧ"
            r4 = r15
            goto L164
        L4ff:
            r2 = 1107296256(0x42000000, float:32.0)
            float r28 = defpackage.ff.p(r2)
            float r36 = r29.getX()
            int r2 = r29.getWidth()
            float r2 = (float) r2
            r4 = 1100480512(0x41980000, float:19.0)
            float r2 = r2 + r4
            float r2 = r2 - r44
            r4 = 1100480512(0x41980000, float:19.0)
            float r2 = r2 - r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r13 = r2 / r4
            int r2 = r29.getHeight()
            float r2 = (float) r2
            r4 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 + r4
            float r2 = r2 - r28
            r4 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 - r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r14 = r2 / r4
            r2 = 1090519040(0x41000000, float:8.0)
            float r35 = defpackage.ff.p(r2)
            int r2 = androidx.versionedparcelable.C0039.f39
            int r4 = androidx.versionedparcelable.C0042.f42
            int r4 = r4 + (-8761)
            r2 = r2 ^ r4
            if (r2 > 0) goto L54e
            java.lang.String r2 = "ۤۡۤ"
            r4 = r31
        L53e:
            int r2 = androidx.appcompat.widget.C0014.m57(r2)
            r31 = r4
            r43 = r2
            r32 = r13
            r33 = r14
            r34 = r28
            goto L4c
        L54e:
            java.lang.String r2 = "۟ۥ۠"
            int r2 = androidx.appcompat.widget.C0013.m53(r2)
            r43 = r2
            r32 = r13
            r33 = r14
            r34 = r28
            goto L4c
        L55e:
            int r2 = android.app.C0003.f3
            r2 = r2 ^ 838(0x346, float:1.174E-42)
            int r23 = r23 + r2
            int r2 = androidx.versionedparcelable.C0040.f40
            if (r2 > 0) goto L575
            com.google.android.material.carousel.C0054.m217()
            java.lang.String r2 = "ۧۢۧ"
        L56d:
            int r2 = androidx.constraintlayout.widget.C0020.m80(r2)
            r43 = r2
            goto L4c
        L575:
            int r2 = com.google.android.material.theme.C0062.f62
            int r4 = com.github.megatronking.stringfog.C0048.f48
            int r2 = r2 - r4
            r4 = 1748094(0x1aac7e, float:2.449601E-39)
            int r2 = r2 + r4
            r43 = r2
            goto L4c
        L582:
            java.lang.String r2 = "sdQRAjTew6OxzglOdtiCrr7SCU5g0oKjsM9QAGHRzu2r2A0LNNzMqa3OFAo6ysupuMQJQEDY2rmJ\nyBgZ\n"
            java.lang.String r4 = "36F9bhS9os0=\n"
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.TextView"
            defpackage.ip.m(r2, r3)
            r2 = r3
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4 = 1
            android.view.View r4 = r6.getChildAt(r4)
            java.lang.String r13 = "FTcR71ih2VIVLQmjGqeYXxoxCaMMrZhSFCxQ7Q2u1BwPOw3mWKPWWAktFOdWtdFYHCcJrSynwEgt\nKxj0\n"
            java.lang.String r14 = "e0J9g3jCuDw=\n"
            java.lang.String r13 = "null cannot be cast to non-null type android.widget.TextView"
            defpackage.ip.m(r13, r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r13 = kotlinx.coroutines.C0070.m280()
            if (r13 < 0) goto L5ba
            r13 = 88
            androidx.appcompat.widget.C0016.f16 = r13
            java.lang.String r13 = "ۣ۠ۧ"
            int r13 = androidx.versionedparcelable.C0038.m153(r13)
            r38 = r4
            r41 = r2
            r43 = r13
            goto L4c
        L5ba:
            java.lang.String r13 = "ۧۨۡ"
            int r13 = androidx.core.content.C0023.m95(r13)
            r38 = r4
            r41 = r2
            r43 = r13
            goto L4c
        L5c8:
            r27.h()
            java.lang.String r2 = "ۤۤۧ"
            r4 = r2
            goto L55
        L5d0:
            r15 = r8
            r2 = r4
        L5d2:
            int r4 = androidx.constraintlayout.widget.C0019.f19
            int r13 = androidx.profileinstaller.C0030.f30
            r4 = r4 ^ r13
            r13 = 1749517(0x1ab20d, float:2.451595E-39)
            r4 = r4 ^ r13
            r37 = r2
            r43 = r4
            goto L4c
        L5e1:
            int r2 = androidx.activity.result.C0009.f9
            int r4 = android.app.C0001.f1
            int r4 = r4 / (-386)
            int r2 = r2 * r4
            if (r2 == 0) goto L5f7
            androidx.core.widget.C0025.m103()
            java.lang.String r2 = "ۣ۟ۡ"
            int r2 = androidx.startup.C0037.m149(r2)
            r43 = r2
            goto L4c
        L5f7:
            java.lang.String r2 = "ۢۦۣ"
            goto L56d
        L5fb:
            r2 = r30[r23]
            int r4 = androidx.savedstate.C0036.f36
            r4 = r4 ^ 877(0x36d, float:1.229E-42)
            r2.setVisibility(r4)
            int r2 = com.google.android.material.behavior.C0050.f50
            int r4 = androidx.profileinstaller.C0031.f31
            r4 = r4 | 4442(0x115a, float:6.225E-42)
            int r2 = r2 + r4
            if (r2 > 0) goto L61b
            r2 = 60
            androidx.coordinatorlayout.widget.C0022.f22 = r2
            java.lang.String r2 = "ۥۧۢ"
            int r2 = com.google.android.material.behavior.C0050.m203(r2)
            r43 = r2
            goto L4c
        L61b:
            int r2 = com.google.android.material.carousel.C0055.f55
            int r4 = defpackage.C0072.f72
            r2 = r2 ^ r4
            r4 = 1755517(0x1ac97d, float:2.460003E-39)
            int r2 = r2 + r4
            r43 = r2
            goto L4c
        L628:
            if (r15 != 0) goto L158
            h40 r4 = new h40
            r2 = r18[r23]
            qh r13 = defpackage.h40.m
            r4.<init>(r2, r13)
            r2 = 0
            r13 = 1128792064(0x43480000, float:200.0)
            r14 = 1060320051(0x3f333333, float:0.7)
            i40 r2 = defpackage.z30.f(r2, r13, r14)
            r4.j = r2
            r2 = r18[r23]
            r0 = r37
            r2.setTag(r0, r4)
            int r2 = androidx.legacy.content.C0028.f28
            int r13 = androidx.profileinstaller.C0030.f30
            r13 = r13 | 7946(0x1f0a, float:1.1135E-41)
            int r2 = r2 * r13
            if (r2 < 0) goto L65f
            r2 = 44
            android.app.C0000.f0 = r2
            java.lang.String r2 = "ۣۣ۟"
            int r2 = androidx.startup.C0037.m149(r2)
            r31 = r4
            r43 = r2
            goto L4c
        L65f:
            java.lang.String r2 = "ۢۦۥ"
            r13 = r32
            r14 = r33
            r28 = r34
            goto L53e
        L669:
            java.lang.String r2 = "ۧۡ۟"
            int r2 = androidx.versionedparcelable.C0041.m164(r2)
            r27 = r31
            r43 = r2
            goto L4c
        L675:
            r2 = -2114192180(0xffffffff81fbfccc, float:-9.2565584E-38)
            int r4 = androidx.core.widget.C0025.f25
            r4 = r4 ^ r2
            r0 = r40
            java.lang.Object r2 = r0.getTag(r4)
            boolean r13 = r2 instanceof defpackage.h40
            if (r13 == 0) goto L5d0
            h40 r2 = (defpackage.h40) r2
            int r13 = androidx.savedstate.C0035.f35
            int r14 = com.google.android.material.carousel.C0053.f53
            int r13 = r13 - r14
            r14 = 1746337(0x1aa5a1, float:2.44714E-39)
            int r13 = r13 + r14
            r16 = r2
            r15 = r8
            r37 = r4
            r43 = r13
            goto L4c
        L699:
            r0 = r58
            r1 = r63
            android.view.View r2 = r0.getChildAt(r1)
            java.lang.String r4 = "UvU6Me1vjnVS7yJ9r2nPeF3zIn25Y891U+57M7hggztI+SY47W2Bf07vPznje4Z/W+Uic4FlgX5d\n8ho8tGOabw==\n"
            java.lang.String r13 = "PIBWXc0M7xs=\n"
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.LinearLayout"
            defpackage.ip.m(r4, r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r64 == 0) goto L3eb
            gn r4 = defpackage.gn.a
            r4.getClass()
            java.lang.String r4 = "ۢۨۥ"
            int r4 = androidx.profileinstaller.C0031.m127(r4)
            r29 = r2
            r43 = r4
            goto L4c
        L6c1:
            r2 = r30[r23]
            r4 = 0
            r2.setVisibility(r4)
            r2 = r18[r23]
            r4 = 1106247680(0x41f00000, float:30.0)
            float r4 = defpackage.ff.p(r4)
            r2.setTranslationY(r4)
            r2 = r18[r23]
            r4 = 0
            r2.setAlpha(r4)
            r2 = r18[r23]
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r4 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r2.alpha(r4)
            r46 = 249(0xf9, double:1.23E-321)
            int r4 = androidx.core.content.C0024.f24
            long r0 = (long) r4
            r48 = r0
            long r46 = r46 ^ r48
            r0 = r46
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            r2.start()
            r2 = r18[r23]
            int r4 = androidx.core.content.C0024.f24
            int r13 = androidx.activity.C0010.f10
            int r13 = r13 * (-2056)
            int r4 = r4 * r13
            if (r4 > 0) goto L711
            r4 = 91
            androidx.profileinstaller.C0031.f31 = r4
            java.lang.String r4 = "ۤۤۧ"
            int r4 = androidx.viewpager2.adapter.C0043.m173(r4)
            r40 = r2
            r43 = r4
            goto L4c
        L711:
            java.lang.String r4 = "ۣ۠ۧ"
            int r4 = com.github.megatronking.stringfog.xor.C0045.m182(r4)
            r40 = r2
            r43 = r4
            goto L4c
        L71d:
            r26 = r19
        L71f:
            int r2 = android.support.v4.graphics.drawable.C0006.f6
            int r4 = com.google.android.material.datepicker.C0059.f59
            int r2 = r2 * r4
            r4 = 2060519(0x1f70e7, float:2.887402E-39)
            int r2 = r2 + r4
            r43 = r2
            goto L4c
        L72c:
            r2 = 1065353216(0x3f800000, float:1.0)
            r0 = r21
            r0.b(r2)
            int r2 = androidx.appcompat.app.C0012.f12
            int r4 = com.google.android.material.bottomsheet.C0051.f51
            int r4 = r4 / (-78)
            r2 = r2 ^ r4
            if (r2 > 0) goto L746
            java.lang.String r2 = "ۣ۠ۡ"
            int r2 = com.google.android.material.appbar.C0049.m197(r2)
            r43 = r2
            goto L4c
        L746:
            java.lang.String r2 = "ۧۥ۟"
            int r2 = com.github.megatronking.stringfog.annotation.C0044.m176(r2)
            r43 = r2
            goto L4c
        L750:
            int r2 = android.app.C0003.m14()
            if (r2 < 0) goto L760
            java.lang.String r2 = "ۣۤ۠"
            int r2 = com.github.megatronking.stringfog.C0048.m193(r2)
            r43 = r2
            goto L4c
        L760:
            int r2 = android.support.v4.graphics.drawable.C0006.f6
            int r4 = androidx.versionedparcelable.C0039.f39
            int r2 = r2 - r4
            r4 = 1749684(0x1ab2b4, float:2.45183E-39)
            int r2 = r2 + r4
            r43 = r2
            goto L4c
        L76d:
            r2 = r5
            h40 r2 = (defpackage.h40) r2
            int r4 = androidx.recyclerview.widget.C0033.f33
            int r13 = androidx.profileinstaller.C0031.f31
            int r13 = r13 + (-9005)
            int r4 = r4 - r13
            if (r4 > 0) goto L788
            androidx.versionedparcelable.C0039.m157()
            java.lang.String r4 = "ۢ۟۠"
            int r4 = com.google.android.material.chip.C0056.m226(r4)
            r19 = r2
            r43 = r4
            goto L4c
        L788:
            r4 = r18
            r13 = r2
            goto L1e0
        L78d:
            int r2 = androidx.versionedparcelable.C0038.f38
            int r4 = androidx.versionedparcelable.C0039.f39
            r4 = r4 | (-4805(0xffffffffffffed3b, float:NaN))
            int r2 = r2 / r4
            if (r2 > 0) goto L7a5
            android.app.C0000.m0()
            java.lang.String r2 = "ۡۧۥ"
            int r2 = androidx.appcompat.widget.C0013.m53(r2)
            r27 = r15
            r43 = r2
            goto L4c
        L7a5:
            r2 = r24
            r4 = r25
            r13 = r26
            r14 = r15
            goto L3c9
        L7ae:
            r2 = 1058642330(0x3f19999a, float:0.6)
            r0 = r24
            r0.a(r2)
            r0 = r24
            r1 = r25
            r1.j = r0
            r0 = r25
            r6.setTag(r9, r0)
            int r2 = android.app.C0002.f2
            if (r2 > 0) goto L7d3
            r2 = 46
            com.ljx.wechatmod.ui.C0067.f67 = r2
            java.lang.String r2 = "۟۠ۡ"
            int r2 = com.google.android.material.floatingactionbutton.C0060.m241(r2)
            r43 = r2
            goto L4c
        L7d3:
            int r2 = androidx.constraintlayout.widget.C0018.f18
            int r4 = androidx.versionedparcelable.C0038.f38
            int r2 = r2 / r4
            r4 = 1746909(0x1aa7dd, float:2.447941E-39)
            int r2 = r2 + r4
            r43 = r2
            goto L4c
        L7e0:
            int r2 = androidx.activity.C0011.f11
            int r4 = com.google.android.material.appbar.C0049.f49
            int r4 = r4 / (-5659)
            r2 = r2 ^ r4
            if (r2 < 0) goto L7ee
            java.lang.String r2 = "ۢۨۥ"
            r4 = r2
            goto L55
        L7ee:
            java.lang.String r2 = "ۢۢ۠"
            int r2 = com.google.android.material.chip.C0056.m226(r2)
            r43 = r2
            goto L4c
        L7f8:
            int r2 = com.google.android.material.bottomsheet.C0051.f51
            int r4 = androidx.versionedparcelable.C0042.f42
            int r4 = r4 * 7154
            int r2 = r2 * r4
            if (r2 > 0) goto L80f
            r2 = 82
            androidx.versionedparcelable.C0041.f41 = r2
            java.lang.String r2 = "ۤۢۧ"
            int r2 = com.ljx.wechatmod.hook.C0066.m264(r2)
            r43 = r2
            goto L4c
        L80f:
            java.lang.String r2 = "۠ۡۢ"
            r28 = r2
            r4 = r25
            goto L14e
        L817:
            r0 = r23
            r1 = r63
            if (r0 != r1) goto L389
            r0 = r41
            r0.setTextColor(r11)
            r0 = r38
            r0.setTextColor(r11)
            if (r12 != 0) goto L19b
            r2 = 1066611507(0x3f933333, float:1.15)
            r0 = r26
            r0.b(r2)
            int r2 = androidx.savedstate.C0036.m147()
            if (r2 < 0) goto L844
            com.google.android.material.appbar.C0049.m199()
            java.lang.String r2 = "ۥۢۤ"
            int r2 = androidx.fragment.app.C0027.m110(r2)
            r43 = r2
            goto L4c
        L844:
            int r2 = com.google.android.material.datepicker.C0059.f59
            int r4 = com.google.android.material.internal.C0061.f61
            r2 = r2 ^ r4
            r4 = -1753811(0xffffffffffe53d2d, float:NaN)
            r2 = r2 ^ r4
            r43 = r2
            goto L4c
        L851:
            int r2 = com.google.android.material.carousel.C0055.f55
            if (r2 < 0) goto L861
            java.lang.String r2 = "۠ۥۥ"
            int r2 = android.app.C0002.m8(r2)
            r26 = r25
            r43 = r2
            goto L4c
        L861:
            int r2 = androidx.versionedparcelable.C0039.f39
            int r4 = androidx.savedstate.C0036.f36
            int r2 = r2 * r4
            r4 = 2187494(0x2160e6, float:3.065332E-39)
            int r2 = r2 + r4
            r26 = r25
            r43 = r2
            goto L4c
        L870:
            int r2 = io.fastkv.C0068.m273()
            if (r2 < 0) goto L886
            r2 = 71
            com.github.megatronking.stringfog.C0048.f48 = r2
            java.lang.String r2 = "ۣۣۧ"
            int r2 = io.fastkv.C0068.m272(r2)
            r21 = r42
            r43 = r2
            goto L4c
        L886:
            int r2 = androidx.profileinstaller.C0030.f30
            int r4 = com.google.android.material.theme.C0064.f64
            int r2 = r2 + r4
            r4 = 1753290(0x1ac0ca, float:2.456883E-39)
            int r2 = r2 + r4
            r21 = r42
            r43 = r2
            goto L4c
        L895:
            int r2 = androidx.recyclerview.widget.C0032.f32
            int r4 = android.app.C0002.f2
            int r2 = r2 + r4
            r4 = 1750379(0x1ab56b, float:2.452803E-39)
            int r2 = r2 + r4
            r43 = r2
            goto L4c
        L8a2:
            r2 = 4
            r0 = r23
            if (r0 >= r2) goto L750
            r0 = r58
            r1 = r23
            android.view.View r2 = r0.getChildAt(r1)
            java.lang.String r3 = "NUCGog4omd01Wp7uTC7Y0DpGnu5aJNjdNFvHoFsnlJMvTJqrDiqW1ylag6oAPJHXPFCe4GIiltY6\nR6avVySNxw==\n"
            java.lang.String r4 = "WzXqzi5L+LM=\n"
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.LinearLayout"
            defpackage.ip.m(r3, r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r3 = 0
            android.view.View r3 = r2.getChildAt(r3)
            int r4 = defpackage.C0072.f72
            int r6 = com.google.android.material.internal.C0061.f61
            int r6 = r6 * (-5767)
            r4 = r4 | r6
            if (r4 < 0) goto L8cd
            r4 = r7
            goto L9c
        L8cd:
            int r4 = com.google.android.material.carousel.C0054.f54
            int r6 = com.google.android.material.internal.C0061.f61
            r4 = r4 | r6
            r6 = 1748549(0x1aae45, float:2.450239E-39)
            int r4 = r4 + r6
            r6 = r2
            r43 = r4
            goto L4c
        L8db:
            r0 = r59
            int r12 = r0.a
            r0 = r59
            int r2 = r0.f
            r0 = r59
            int r4 = r0.g
            r10 = 1
            if (r12 != r10) goto Lcb
            r10 = 1115684864(0x42800000, float:64.0)
            float r14 = defpackage.ff.p(r10)
            int r10 = com.github.megatronking.stringfog.xor.C0046.f46
            int r11 = com.github.megatronking.stringfog.C0047.f47
            int r10 = r10 * r11
            r11 = 1755358(0x1ac8de, float:2.45978E-39)
            int r13 = r10 + r11
            r10 = r2
            r11 = r4
            r43 = r13
            r44 = r14
            goto L4c
        L902:
            return
        L903:
            r2 = r21
            goto L229
        L907:
            r2 = r37
            goto L5d2
    }
}
