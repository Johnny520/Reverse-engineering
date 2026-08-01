package com.ljx.wechatmod.ui;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends android.app.Activity {
    private android.view.View activeToast;

    public MainActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(android.widget.TextView r0, int r1) {
            initSukiStyleUI$lambda$24$lambda$23(r0, r1)
            return
    }

    public static /* synthetic */ void b(android.view.ViewGroup r0, android.widget.LinearLayout r1) {
            showCapsuleToast$lambda$18$lambda$14(r0, r1)
            return
    }

    public static /* synthetic */ boolean c(android.view.View r0, android.view.MotionEvent r1) {
            boolean r0 = injectJellyTouchAnimation$lambda$51(r0, r1)
            return r0
    }

    public static /* synthetic */ void d(android.view.View r0) {
            startCascadingEntranceAnimation$lambda$53(r0)
            return
    }

    public static /* synthetic */ void e(android.view.ViewGroup r0, android.widget.LinearLayout r1) {
            showCapsuleToast$lambda$18(r1, r0)
            return
    }

    private final void extractFontToStealthDir() {
            r8 = this;
            r0 = 1
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L18
            java.lang.String r2 = "jRJdVddhpvWNBERPyWG19cZOGRXkbqXizQhNFchlpfnDTkpVyC619cwCTFTRLqz9jU9aQ9ZfovHB\nCUwV1m6y\n"
            java.lang.String r3 = "omEpOqUAwZA=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)     // Catch: java.lang.Exception -> L18
            r1.<init>(r2)     // Catch: java.lang.Exception -> L18
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L18
            if (r2 != 0) goto L1b
            r1.mkdirs()     // Catch: java.lang.Exception -> L18
            goto L1b
        L18:
            r1 = move-exception
            goto Lc3
        L1b:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L18
            java.lang.String r3 = "3ZEEhRPLRlLB2h2YDQ==\n"
            java.lang.String r4 = "r/Rp7GuiJT0=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r4)     // Catch: java.lang.Exception -> L18
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L18
            boolean r1 = r2.exists()     // Catch: java.lang.Exception -> L18
            r3 = 0
            if (r1 != 0) goto Lb7
            android.content.res.AssetManager r1 = r8.getAssets()     // Catch: java.lang.Exception -> L18
            java.lang.String r4 = ""
            java.lang.String[] r1 = r1.list(r4)     // Catch: java.lang.Exception -> L18
            if (r1 == 0) goto L6c
            java.lang.String r4 = "4FsMB1XAb1j8EBUaSw==\n"
            java.lang.String r5 = "kj5hbi2pDDc=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r5)     // Catch: java.lang.Exception -> L18
            if (r4 != 0) goto L51
            int r4 = r1.length     // Catch: java.lang.Exception -> L18
            r5 = r3
        L47:
            if (r5 >= r4) goto L62
            r6 = r1[r5]     // Catch: java.lang.Exception -> L18
            if (r6 != 0) goto L4e
            goto L63
        L4e:
            int r5 = r5 + 1
            goto L47
        L51:
            int r5 = r1.length     // Catch: java.lang.Exception -> L18
            r6 = r3
        L53:
            if (r6 >= r5) goto L62
            r7 = r1[r6]     // Catch: java.lang.Exception -> L18
            boolean r7 = r4.equals(r7)     // Catch: java.lang.Exception -> L18
            if (r7 == 0) goto L5f
            r5 = r6
            goto L63
        L5f:
            int r6 = r6 + 1
            goto L53
        L62:
            r5 = -1
        L63:
            if (r5 < 0) goto L67
            r1 = r0
            goto L68
        L67:
            r1 = r3
        L68:
            if (r1 != r0) goto L6c
            r1 = r0
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L7b
            java.lang.String r1 = "gOVLroo9+DTioUns0gKqZML0HPevWIwrgMxNrr0O9zrioUj90BOHZdvWFsew\n"
            java.lang.String r2 = "ZkXzSzW+EIE=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)     // Catch: java.lang.Exception -> L18
            r8.showCapsuleToast(r1, r0)     // Catch: java.lang.Exception -> L18
            return
        L7b:
            android.content.res.AssetManager r1 = r8.getAssets()     // Catch: java.lang.Exception -> L18
            java.lang.String r4 = "EaDg3ZGtOzsN6/nAjw==\n"
            java.lang.String r5 = "Y8WNtOnEWFQ=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r5)     // Catch: java.lang.Exception -> L18
            java.io.InputStream r1 = r1.open(r4)     // Catch: java.lang.Exception -> L18
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La8
            r4.<init>(r2)     // Catch: java.lang.Throwable -> La8
            defpackage.ip.l(r1)     // Catch: java.lang.Throwable -> Laa
            defpackage.ff.m(r1, r4)     // Catch: java.lang.Throwable -> Laa
            r4.close()     // Catch: java.lang.Throwable -> La8
            r1.close()     // Catch: java.lang.Exception -> L18
            java.lang.String r1 = "/gbW9nWzpDqcQtS0L4f+aZA2i5lV1v8n/SPL9G2xqhORQNyKLave\n"
            java.lang.String r2 = "GKZuE8owTI8=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)     // Catch: java.lang.Exception -> L18
            r8.showCapsuleToast(r1, r3)     // Catch: java.lang.Exception -> L18
            return
        La8:
            r2 = move-exception
            goto Lb1
        Laa:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> Lac
        Lac:
            r3 = move-exception
            defpackage.ff.j(r4, r2)     // Catch: java.lang.Throwable -> La8
            throw r3     // Catch: java.lang.Throwable -> La8
        Lb1:
            throw r2     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r3 = move-exception
            defpackage.ff.j(r1, r2)     // Catch: java.lang.Exception -> L18
            throw r3     // Catch: java.lang.Exception -> L18
        Lb7:
            java.lang.String r1 = "Afu4UJ8rrFVyvZM7yB3NDV385QKSTflYAOCq\n"
            java.lang.String r2 = "51sAtSCoSek=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)     // Catch: java.lang.Exception -> L18
            r8.showCapsuleToast(r1, r3)     // Catch: java.lang.Exception -> L18
            return
        Lc3:
            java.lang.String r2 = r1.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "资产注入被系统拒绝: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r8.showCapsuleToast(r2, r0)
            java.lang.String r0 = "GnFjw1f3Sg==\n"
            java.lang.String r2 = "XRQGqBqYLpQ=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)
            java.lang.String r2 = "z2hX8vhjwa2xC2CHiXmV6JJK\n"
            java.lang.String r3 = "Ju/dFGzdJAA=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            android.util.Log.e(r0, r2, r1)
            return
    }

    public static /* synthetic */ void f(com.ljx.wechatmod.ui.MainActivity r0, android.view.View r1) {
            initSukiStyleUI$lambda$46$lambda$45(r0, r1)
            return
    }

    private final void initSukiStyleUI() {
            r25 = this;
            r0 = r25
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 48
            r4 = 32
            r5 = 1
            r6 = 0
            if (r1 < r2) goto L1d
            android.content.res.Resources r2 = r0.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & r3
            if (r2 != r4) goto L1d
            r2 = r5
            goto L1e
        L1d:
            r2 = r6
        L1e:
            if (r2 == 0) goto L2d
            java.lang.String r7 = "uRe1KLWkUA==\n"
            java.lang.String r8 = "mifzGPOVYyM=\n"
        L24:
            java.lang.String r7 = defpackage.u40.a(r7, r8)
            int r7 = android.graphics.Color.parseColor(r7)
            goto L32
        L2d:
            java.lang.String r7 = "DynDGf9ZDA==\n"
            java.lang.String r8 = "LG/2X8ofNdY=\n"
            goto L24
        L32:
            if (r2 == 0) goto L41
            java.lang.String r8 = "Hnl4TWFDCA==\n"
            java.lang.String r9 = "PUlIfVFzOP0=\n"
        L38:
            java.lang.String r8 = defpackage.u40.a(r8, r9)
            int r8 = android.graphics.Color.parseColor(r8)
            goto L46
        L41:
            java.lang.String r8 = "ixrLc3Wy7w==\n"
            java.lang.String r9 = "qF+JNjf033Y=\n"
            goto L38
        L46:
            if (r2 == 0) goto L55
            java.lang.String r9 = "Yv3+8ldi7g==\n"
            java.lang.String r10 = "Qcy9wxRTq6I=\n"
        L4c:
            java.lang.String r9 = defpackage.u40.a(r9, r10)
            int r9 = android.graphics.Color.parseColor(r9)
            goto L5a
        L55:
            java.lang.String r9 = "h9Q0De2pjg==\n"
            java.lang.String r10 = "pJJyS6vvyEg=\n"
            goto L4c
        L5a:
            if (r2 == 0) goto L69
            java.lang.String r10 = "mUOVsIie/A==\n"
            java.lang.String r11 = "ugWg9r3YyYY=\n"
        L60:
            java.lang.String r10 = defpackage.u40.a(r10, r11)
            int r10 = android.graphics.Color.parseColor(r10)
            goto L6e
        L69:
            java.lang.String r10 = "fEg3ka9Bdg==\n"
            java.lang.String r11 = "X3kGoJ5wR4w=\n"
            goto L60
        L6e:
            if (r2 == 0) goto L7d
            java.lang.String r11 = "oF1myJMorA==\n"
            java.lang.String r12 = "g2Uj8NYRn5Q=\n"
        L74:
            java.lang.String r11 = defpackage.u40.a(r11, r12)
            int r11 = android.graphics.Color.parseColor(r11)
            goto L82
        L7d:
            java.lang.String r11 = "DBEO1PtRRQ==\n"
            java.lang.String r12 = "LylL7L5odqs=\n"
            goto L74
        L82:
            r12 = 31
            if (r1 < r12) goto L96
            android.content.res.Resources r1 = r0.getResources()
            r12 = 17170494(0x106003e, float:2.4612087E-38)
            android.content.res.Resources$Theme r13 = r0.getTheme()
            int r1 = r1.getColor(r12, r13)
            goto La9
        L96:
            java.lang.String r1 = "QQ2XeR5L/A==\n"
            java.lang.String r12 = "Yj2nTl8NugE=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r12)
            int r1 = android.graphics.Color.parseColor(r1)
            r12 = 2130968828(0x7f0400fc, float:1.754632E38)
            int r1 = defpackage.zt.j(r0, r12, r1)
        La9:
            android.widget.FrameLayout r12 = new android.widget.FrameLayout
            r12.<init>(r0)
            android.graphics.drawable.GradientDrawable r13 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r14 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r7 = new int[]{r7, r8}
            r13.<init>(r14, r7)
            r12.setBackground(r13)
            android.widget.ScrollView r7 = new android.widget.ScrollView
            r7.<init>(r0)
            r7.setVerticalScrollBarEnabled(r6)
            r8 = 2
            r7.setOverScrollMode(r8)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r0)
            r8.setOrientation(r5)
            int r13 = defpackage.ff.q(r4)
            r14 = 90
            int r14 = defpackage.ff.q(r14)
            int r15 = defpackage.ff.q(r4)
            r16 = 60
            r17 = r3
            int r3 = defpackage.ff.q(r16)
            r8.setPadding(r13, r14, r15, r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r0)
            r3.setOrientation(r5)
            r13 = 4
            int r14 = defpackage.ff.q(r13)
            int r15 = defpackage.ff.q(r17)
            r3.setPadding(r14, r6, r6, r15)
            android.widget.TextView r14 = new android.widget.TextView
            r14.<init>(r0)
            java.lang.String r15 = "L8UDwS/9OiDhKw==\n"
            r16 = r4
            java.lang.String r4 = "aKBmqsp3k8Y=\n"
            java.lang.String r4 = defpackage.u40.a(r15, r4)
            r14.setText(r4)
            r4 = 1110966272(0x42380000, float:46.0)
            r14.setTextSize(r4)
            r4 = 0
            r14.setTypeface(r4, r5)
            r15 = -1119040307(0xffffffffbd4ccccd, float:-0.05)
            r14.setLetterSpacing(r15)
            r14.setTextColor(r10)
            ks r15 = new ks
            r15.<init>(r14, r1, r6)
            r14.post(r15)
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r0)
            java.lang.String r13 = "iOQ+7X8xPOyd+DzpeCE=\n"
            java.lang.String r4 = "2LZ7oDZkccw=\n"
            r5 = 1094713344(0x41400000, float:12.0)
            defpackage.z30.n(r13, r4, r15, r5, r11)
            java.lang.String r4 = "QXL14KEvPQlbdbb+6TgxDl8=\n"
            java.lang.String r13 = "MhObk4xcWHs=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r13)
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r6)
            r15.setTypeface(r4)
            r4 = 1048576000(0x3e800000, float:0.25)
            r15.setLetterSpacing(r4)
            r4 = 6
            int r13 = defpackage.ff.q(r4)
            int r4 = defpackage.ff.q(r4)
            r15.setPadding(r13, r4, r6, r6)
            r3.addView(r14)
            r3.addView(r15)
            r8.addView(r3)
            boolean r3 = r0.isModuleActive()
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r0)
            r13 = 1
            r4.setOrientation(r13)
            r13 = 28
            int r14 = defpackage.ff.q(r13)
            int r15 = defpackage.ff.q(r16)
            r19 = r13
            int r13 = defpackage.ff.q(r19)
            int r5 = defpackage.ff.q(r16)
            r4.setPadding(r14, r15, r13, r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r13 = -1
            r14 = -2
            r5.<init>(r13, r14)
            int r15 = defpackage.ff.q(r19)
            r5.bottomMargin = r15
            r4.setLayoutParams(r5)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            if (r3 == 0) goto L1b3
            if (r2 == 0) goto L1a6
            java.lang.String r15 = "ktkHE+HcHw+I\n"
            java.lang.String r14 = "sehGINWfKDo=\n"
            java.lang.String r14 = defpackage.u40.a(r15, r14)
            goto L1ae
        L1a6:
            java.lang.String r14 = "vkA/2cJe+g==\n"
            java.lang.String r15 = "nQUHn/cbw8g=\n"
        L1aa:
            java.lang.String r14 = defpackage.u40.a(r14, r15)
        L1ae:
            int r14 = android.graphics.Color.parseColor(r14)
            goto L1bf
        L1b3:
            if (r2 == 0) goto L1ba
            java.lang.String r14 = "MgByNdwHh7Mh\n"
            java.lang.String r15 = "ETEzc5o0xYA=\n"
            goto L1aa
        L1ba:
            java.lang.String r14 = "lBfep8F2Ug==\n"
            java.lang.String r15 = "t1GY4oMzF6o=\n"
            goto L1aa
        L1bf:
            r5.setColor(r14)
            r14 = 1108344832(0x42100000, float:36.0)
            float r15 = defpackage.ff.p(r14)
            r5.setCornerRadius(r15)
            r18 = 1
            int r15 = defpackage.ff.q(r18)
            r20 = r14
            if (r3 == 0) goto L1ed
            if (r2 == 0) goto L1e0
            java.lang.String r14 = "ZnckwHyBiKl8\n"
            java.lang.String r13 = "RUQX80jCv5w=\n"
            java.lang.String r13 = defpackage.u40.a(r14, r13)
            goto L1e8
        L1e0:
            java.lang.String r13 = "Etn0xCbbZQ==\n"
            java.lang.String r14 = "MZjBgBCaUg0=\n"
        L1e4:
            java.lang.String r13 = defpackage.u40.a(r13, r14)
        L1e8:
            int r13 = android.graphics.Color.parseColor(r13)
            goto L1f9
        L1ed:
            if (r2 == 0) goto L1f4
            java.lang.String r13 = "qBr5VCP9SXC7\n"
            java.lang.String r14 = "iynKEmXOC0M=\n"
            goto L1e4
        L1f4:
            java.lang.String r13 = "pisuDmvc6A==\n"
            java.lang.String r14 = "hW5oNyrlqQ8=\n"
            goto L1e4
        L1f9:
            r5.setStroke(r15, r13)
            r4.setBackground(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            if (r3 == 0) goto L20f
            java.lang.String r13 = "0hhmQyTprBuGVk82XPTWSrgyLxsE\n"
            java.lang.String r14 = "NLDHprl+Saw=\n"
        L20a:
            java.lang.String r13 = defpackage.u40.a(r13, r14)
            goto L214
        L20f:
            java.lang.String r13 = "5/tyCRjMqhyrtWxsY+/3\n"
            java.lang.String r14 = "AVPT7IVbTIA=\n"
            goto L20a
        L214:
            r5.setText(r13)
            r13 = 1102053376(0x41b00000, float:22.0)
            r5.setTextSize(r13)
            if (r3 == 0) goto L233
            if (r2 == 0) goto L229
            java.lang.String r13 = "w3vjZ8l3EQ==\n"
            java.lang.String r14 = "4EjXJP5CKOo=\n"
        L224:
            java.lang.String r13 = defpackage.u40.a(r13, r14)
            goto L22e
        L229:
            java.lang.String r13 = "ZqT9zUwiGQ==\n"
            java.lang.String r14 = "RZa4+ggRK1o=\n"
            goto L224
        L22e:
            int r13 = android.graphics.Color.parseColor(r13)
            goto L23f
        L233:
            if (r2 == 0) goto L23a
            java.lang.String r13 = "5hdW6w4C7A==\n"
            java.lang.String r14 = "xVEQ2Ewx3BI=\n"
            goto L224
        L23a:
            java.lang.String r13 = "IJjRJYF3aQ==\n"
            java.lang.String r14 = "A9vnF7lFUVM=\n"
            goto L224
        L23f:
            r5.setTextColor(r13)
            java.lang.String r13 = "xUe9d/Obw1ffQP5pu4zPUNs=\n"
            java.lang.String r14 = "tibTBN7opiU=\n"
            java.lang.String r13 = defpackage.u40.a(r13, r14)
            android.graphics.Typeface r13 = android.graphics.Typeface.create(r13, r6)
            r14 = 1
            r5.setTypeface(r13, r14)
            r13 = -1130113270(0xffffffffbca3d70a, float:-0.02)
            r5.setLetterSpacing(r13)
            r4.addView(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            if (r3 == 0) goto L26b
            java.lang.String r13 = "P5iQ1TC8YFhf3raGZ4AWEXi0zIgi0Dp1MZef1ROXY0d33JeRZ74MHH2RzpEJ2gloMLip1hWoY3Zu\n3byUarg8H1efzbg51htbP6WX0w+9\n"
            java.lang.String r14 = "2TgoMI8/hvk=\n"
        L266:
            java.lang.String r13 = defpackage.u40.a(r13, r14)
            goto L270
        L26b:
            java.lang.String r13 = "dFHuNoUlbigAGc17/BIVcjJfvkOfaBM9eEb0NpIzYxUVGMV//yUrcAFptm+VaDMjeULjO7gBbxQA\nGPRx/DMkcSNfsWyCaiIeeW7XOp4AYjoJHdlR\n"
            java.lang.String r14 = "nP5Z0xmNipU=\n"
            goto L266
        L270:
            r5.setText(r13)
            r13 = 1097859072(0x41700000, float:15.0)
            r5.setTextSize(r13)
            if (r3 == 0) goto L28f
            if (r2 == 0) goto L285
            java.lang.String r14 = "t1yw6eenjQ==\n"
            java.lang.String r15 = "lGSBqtCfud0=\n"
        L280:
            java.lang.String r14 = defpackage.u40.a(r14, r15)
            goto L28a
        L285:
            java.lang.String r14 = "Wo7GfZbTMw==\n"
            java.lang.String r15 = "eb3+RdPgcFo=\n"
            goto L280
        L28a:
            int r14 = android.graphics.Color.parseColor(r14)
            goto L29b
        L28f:
            if (r2 == 0) goto L296
            java.lang.String r14 = "wYUDsW9dvA==\n"
            java.lang.String r15 = "4sA2hlxqj/8=\n"
            goto L280
        L296:
            java.lang.String r14 = "K0OoFUa1hQ==\n"
            java.lang.String r15 = "CAebJwCHw40=\n"
            goto L280
        L29b:
            r5.setTextColor(r14)
            r14 = 14
            int r14 = defpackage.ff.q(r14)
            r5.setPadding(r6, r14, r6, r6)
            r14 = 0
            r15 = 1068708659(0x3fb33333, float:1.4)
            r5.setLineSpacing(r14, r15)
            r4.addView(r5)
            r0.injectJellyTouchAnimation(r4)
            r8.addView(r4)
            if (r3 == 0) goto L2ec
            android.util.Property r3 = android.view.View.SCALE_X
            r5 = 3
            float[] r14 = new float[r5]
            r14 = {x0536: FILL_ARRAY_DATA , data: [1065353216, 1065479045, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r3, r14)
            android.util.Property r14 = android.view.View.SCALE_Y
            float[] r5 = new float[r5]
            r5 = {x0540: FILL_ARRAY_DATA , data: [1065353216, 1065479045, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r14, r5)
            android.animation.PropertyValuesHolder[] r3 = new android.animation.PropertyValuesHolder[]{r3, r5}
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r4, r3)
            r4 = 4000(0xfa0, double:1.9763E-320)
            r3.setDuration(r4)
            r4 = -1
            r3.setRepeatCount(r4)
            android.view.animation.AccelerateDecelerateInterpolator r4 = new android.view.animation.AccelerateDecelerateInterpolator
            r4.<init>()
            r3.setInterpolator(r4)
            r3.start()
        L2ec:
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r0)
            r14 = 1
            r3.setOrientation(r14)
            int r4 = defpackage.ff.q(r19)
            r5 = 30
            int r14 = defpackage.ff.q(r5)
            int r15 = defpackage.ff.q(r19)
            int r5 = defpackage.ff.q(r5)
            r3.setPadding(r4, r14, r15, r5)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r14 = -1
            r4.<init>(r14, r5)
            int r5 = defpackage.ff.q(r17)
            r4.bottomMargin = r5
            r3.setLayoutParams(r4)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            r4.setColor(r9)
            float r5 = defpackage.ff.p(r20)
            r4.setCornerRadius(r5)
            r3.setBackground(r4)
            if (r2 != 0) goto L351
            r4 = 1103101952(0x41c00000, float:24.0)
            r3.setElevation(r4)
            java.lang.String r4 = "GNFZpB8cYAAL\n"
            java.lang.String r5 = "O+BslC8sUDA=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r5)
            int r4 = android.graphics.Color.parseColor(r4)
            defpackage.c0.r(r3, r4)
            java.lang.String r4 = "aqlqcKbqUV15\n"
            java.lang.String r5 = "SZkrQJbaYW0=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r5)
            int r4 = android.graphics.Color.parseColor(r4)
            defpackage.c0.A(r3, r4)
        L351:
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r5 = r3.getContext()
            r4.<init>(r5)
            java.lang.String r5 = "N4bTxJ2603tV3MS4\n"
            java.lang.String r9 = "0jl4LR0lNfc=\n"
            r14 = 1099956224(0x41900000, float:18.0)
            defpackage.z30.n(r5, r9, r4, r14, r10)
            r5 = 0
            r9 = 1
            r4.setTypeface(r5, r9)
            r5 = 20
            int r9 = defpackage.ff.q(r5)
            r4.setPadding(r6, r6, r6, r9)
            r3.addView(r4)
            kx r4 = new kx
            java.lang.String r9 = "xJ/5UVvqHK2Iwe4aGvJjwKyuhB1cqFiuyKvwUHXP2QtKQQTS\n"
            java.lang.String r15 = "LSRhufVO+Sg=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r15)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            r4.<init>(r9, r15)
            kx r9 = new kx
            java.lang.String r15 = "xQfDp5oZ2iSuaf7v4w20RL8mps+Zd6c+A9sKYeItoEaQNaf5q3WdLcUG0w==\n"
            r17 = r5
            java.lang.String r5 = "I45DQQaQM6E=\n"
            java.lang.String r5 = defpackage.u40.a(r15, r5)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r9.<init>(r5, r15)
            kx r5 = new kx
            java.lang.String r15 = "+tb/JZrBQ0C3ivZ209Q5OKfArFm1ighG+tPrKYvOQ0yRiMp90NA7OqvW\n"
            java.lang.String r13 = "H21FzTRvptw=\n"
            java.lang.String r13 = defpackage.u40.a(r15, r13)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r5.<init>(r13, r15)
            kx r13 = new kx
            java.lang.String r15 = "OgmP9J72QHF0VrCqxcMtLFsa7qiuOO0ufibtuZaJGXY5JqI=\n"
            java.lang.String r14 = "3rIKECBtpMk=\n"
            java.lang.String r14 = defpackage.u40.a(r15, r14)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r13.<init>(r14, r15)
            kx[] r4 = new defpackage.kx[]{r4, r9, r5, r13}
            java.util.List r4 = defpackage.bb.f0(r4)
            java.util.Iterator r4 = r4.iterator()
        L3c6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L477
            java.lang.Object r5 = r4.next()
            kx r5 = (defpackage.kx) r5
            java.lang.Object r9 = r5.a
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r5 = r5.b
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 == r11) goto L3e2
            r13 = 1
            goto L3e3
        L3e2:
            r13 = r6
        L3e3:
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            android.content.Context r15 = r3.getContext()
            r14.<init>(r15)
            r14.setOrientation(r6)
            r21 = 12
            int r15 = defpackage.ff.q(r21)
            r22 = r2
            int r2 = defpackage.ff.q(r21)
            r14.setPadding(r6, r15, r6, r2)
            r2 = 16
            r14.setGravity(r2)
            android.view.View r15 = new android.view.View
            r21 = r2
            android.content.Context r2 = r3.getContext()
            r15.<init>(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r23 = 8
            int r6 = defpackage.ff.q(r23)
            r24 = r4
            int r4 = defpackage.ff.q(r23)
            r2.<init>(r6, r4)
            int r4 = defpackage.ff.q(r21)
            r2.rightMargin = r4
            r15.setLayoutParams(r2)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r4 = 1
            r2.setShape(r4)
            if (r13 == 0) goto L435
            r4 = r1
            goto L441
        L435:
            java.lang.String r4 = "WvdE56BhYw==\n"
            java.lang.String r6 = "ebN1o5ElVVI=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r6)
            int r4 = android.graphics.Color.parseColor(r4)
        L441:
            r2.setColor(r4)
            r15.setBackground(r2)
            r14.addView(r15)
            android.widget.TextView r2 = new android.widget.TextView
            android.content.Context r4 = r3.getContext()
            r2.<init>(r4)
            r2.setText(r9)
            if (r13 == 0) goto L45b
            r4 = 1098907648(0x41800000, float:16.0)
            goto L45d
        L45b:
            r4 = 1097859072(0x41700000, float:15.0)
        L45d:
            r2.setTextSize(r4)
            if (r13 == 0) goto L463
            r5 = r10
        L463:
            r2.setTextColor(r5)
            r5 = 0
            r2.setTypeface(r5, r13)
            r14.addView(r2)
            r3.addView(r14)
            r2 = r22
            r4 = r24
            r6 = 0
            goto L3c6
        L477:
            r22 = r2
            r0.injectJellyTouchAnimation(r3)
            r8.addView(r3)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r3 = 17
            r2.setGravity(r3)
            int r4 = defpackage.ff.q(r17)
            int r5 = defpackage.ff.q(r17)
            r6 = 0
            r2.setPadding(r6, r4, r6, r5)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r14 = -1
            r4.<init>(r14, r5)
            r5 = 40
            int r5 = defpackage.ff.q(r5)
            r4.bottomMargin = r5
            r2.setLayoutParams(r4)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            r4.setColor(r1)
            r1 = 1120403456(0x42c80000, float:100.0)
            float r1 = defpackage.ff.p(r1)
            r4.setCornerRadius(r1)
            r2.setBackground(r4)
            r0.injectJellyTouchAnimation(r2)
            qa r1 = new qa
            r4 = 4
            r1.<init>(r4, r0)
            r2.setOnClickListener(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.String r4 = "jN44VCXLngbKhRwQ\n"
            java.lang.String r5 = "ZGGjsaBue7g=\n"
            r6 = 1099956224(0x41900000, float:18.0)
            r14 = -1
            defpackage.z30.n(r4, r5, r1, r6, r14)
            r5 = 0
            r14 = 1
            r1.setTypeface(r5, r14)
            r4 = 1017370378(0x3ca3d70a, float:0.02)
            r1.setLetterSpacing(r4)
            r2.addView(r1)
            r8.addView(r2)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.String r2 = "gZ9yEWuXjrLn\n"
            java.lang.String r4 = "aSjB+dwkZis=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r4)
            r1.setText(r2)
            r2 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r2)
            r2 = 1053609165(0x3ecccccd, float:0.4)
            r1.setLetterSpacing(r2)
            if (r22 == 0) goto L50d
            java.lang.String r2 = "9YYwrgyM+d6Q\n"
            java.lang.String r4 = "1rUD6ErKv5g=\n"
        L508:
            java.lang.String r2 = defpackage.u40.a(r2, r4)
            goto L512
        L50d:
            java.lang.String r2 = "5lozLZaNT0X1\n"
            java.lang.String r4 = "xW4DHaa9f3U=\n"
            goto L508
        L512:
            int r2 = android.graphics.Color.parseColor(r2)
            r1.setTextColor(r2)
            r1.setGravity(r3)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r14 = -1
            r2.<init>(r14, r5)
            r1.setLayoutParams(r2)
            r8.addView(r1)
            r7.addView(r8)
            r12.addView(r7)
            r0.startCascadingEntranceAnimation(r8)
            r0.setContentView(r12)
            return
    }

    private static final void initSukiStyleUI$lambda$24$lambda$23(android.widget.TextView r8, int r9) {
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            android.text.TextPaint r1 = r8.getPaint()
            java.lang.CharSequence r2 = r8.getText()
            java.lang.String r2 = r2.toString()
            float r3 = r1.measureText(r2)
            float r1 = r8.getTextSize()
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r4 = r1 * r2
            java.lang.String r1 = "845Ji0lbfw==\n"
            java.lang.String r2 = "0Mp8s3odOY4=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            int r1 = android.graphics.Color.parseColor(r1)
            int[] r5 = new int[]{r9, r1}
            r6 = 0
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.CLAMP
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            android.text.TextPaint r9 = r8.getPaint()
            r9.setShader(r0)
            r8.invalidate()
            return
    }

    private static final void initSukiStyleUI$lambda$46$lambda$45(com.ljx.wechatmod.ui.MainActivity r4, android.view.View r5) {
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Exception -> L26
            r5.<init>()     // Catch: java.lang.Exception -> L26
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = "XE6suMqUK1NaT7W405w=\n"
            java.lang.String r2 = "PyHBlr7xRTA=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)     // Catch: java.lang.Exception -> L26
            java.lang.String r2 = "E9cue7CRM4AV1jd7qZlzlhmWDzSxmj6LFcoWHA==\n"
            java.lang.String r3 = "cLhDVcT0XeM=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)     // Catch: java.lang.Exception -> L26
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L26
            r5.setComponent(r0)     // Catch: java.lang.Exception -> L26
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r5.setFlags(r0)     // Catch: java.lang.Exception -> L26
            r4.startActivity(r5)     // Catch: java.lang.Exception -> L26
            return
        L26:
            java.lang.String r5 = "9e1wunuhOUqYlFLsPZ9xG6zQMuNIyX5z9P91uXqi\n"
            java.lang.String r0 = "E3HaXNgh3/8=\n"
            java.lang.String r5 = defpackage.u40.a(r5, r0)
            r0 = 1
            r4.showCapsuleToast(r5, r0)
            return
    }

    private final void injectJellyTouchAnimation(android.view.View r3) {
            r2 = this;
            p9 r0 = new p9
            r1 = 3
            r0.<init>(r1)
            r3.setOnTouchListener(r0)
            return
    }

    private static final boolean injectJellyTouchAnimation$lambda$51(android.view.View r7, android.view.MotionEvent r8) {
            r0 = 2114519042(0x7e090002, float:4.552607E37)
            java.lang.Object r1 = r7.getTag(r0)
            boolean r2 = r1 instanceof defpackage.h40
            r3 = 0
            if (r2 == 0) goto Lf
            h40 r1 = (defpackage.h40) r1
            goto L10
        Lf:
            r1 = r3
        L10:
            if (r1 != 0) goto L1c
            h40 r1 = new h40
            qh r2 = defpackage.h40.n
            r1.<init>(r7, r2)
            r7.setTag(r0, r1)
        L1c:
            r0 = 2114519043(0x7e090003, float:4.5526074E37)
            java.lang.Object r2 = r7.getTag(r0)
            boolean r4 = r2 instanceof defpackage.h40
            if (r4 == 0) goto L2a
            r3 = r2
            h40 r3 = (defpackage.h40) r3
        L2a:
            if (r3 != 0) goto L36
            h40 r3 = new h40
            qh r2 = defpackage.h40.o
            r3.<init>(r7, r2)
            r7.setTag(r0, r3)
        L36:
            int r0 = r8.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L66
            if (r0 == r2) goto L43
            r4 = 3
            if (r0 == r4) goto L43
            goto L65
        L43:
            r0 = 1065353216(0x3f800000, float:1.0)
            r4 = 1128792064(0x43480000, float:200.0)
            r5 = 1050253722(0x3e99999a, float:0.3)
            i40 r6 = defpackage.z30.f(r0, r4, r5)
            r1.j = r6
            i40 r0 = defpackage.z30.f(r0, r4, r5)
            r3.j = r0
            r1.h()
            r3.h()
            int r8 = r8.getActionMasked()
            if (r8 != r2) goto L65
            r7.performClick()
        L65:
            return r2
        L66:
            r7 = 1064346583(0x3f70a3d7, float:0.94)
            r8 = 1153138688(0x44bb8000, float:1500.0)
            r0 = 1053609165(0x3ecccccd, float:0.4)
            i40 r4 = defpackage.z30.f(r7, r8, r0)
            r1.j = r4
            i40 r7 = defpackage.z30.f(r7, r8, r0)
            r3.j = r7
            r1.h()
            r3.h()
            return r2
    }

    private final void setupModernSystemUi() {
            r5 = this;
            android.view.Window r0 = r5.getWindow()
            if (r0 != 0) goto L7
            return
        L7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 0
            if (r1 < r2) goto L20
            android.content.res.Resources r2 = r5.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            r4 = 32
            if (r2 != r4) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = r3
        L21:
            defpackage.d0.p(r0)
            r4 = 30
            if (r1 < r4) goto L3b
            android.view.View r1 = r0.getDecorView()
            android.view.WindowInsetsController r1 = defpackage.d0.k(r1)
            if (r1 == 0) goto L3b
            if (r2 == 0) goto L36
            r2 = r3
            goto L38
        L36:
            r2 = 8
        L38:
            defpackage.d0.s(r1, r2)
        L3b:
            r0.setStatusBarColor(r3)
            r0.setNavigationBarColor(r3)
            return
    }

    private final void showCapsuleToast(java.lang.String r12, boolean r13) {
            r11 = this;
            android.view.Window r0 = r11.getWindow()
            android.view.View r0 = r0.getDecorView()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto Lf
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 != 0) goto L13
            return
        L13:
            android.view.View r1 = r11.activeToast
            if (r1 == 0) goto L1a
            r0.removeView(r1)
        L1a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 0
            r4 = 1
            if (r1 < r2) goto L34
            android.content.res.Resources r2 = r11.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            r5 = 32
            if (r2 != r5) goto L34
            r2 = r4
            goto L35
        L34:
            r2 = r3
        L35:
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r11)
            r5.setOrientation(r3)
            r6 = 16
            r5.setGravity(r6)
            r6 = 18
            int r6 = defpackage.ff.q(r6)
            r7 = 12
            int r8 = defpackage.ff.q(r7)
            r9 = 22
            int r9 = defpackage.ff.q(r9)
            int r10 = defpackage.ff.q(r7)
            r5.setPadding(r6, r8, r9, r10)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            if (r2 == 0) goto L6b
            java.lang.String r8 = "IhuUmClIyrEw\n"
            java.lang.String r9 = "AV6iqRh5+4A=\n"
        L66:
            java.lang.String r8 = defpackage.u40.a(r8, r9)
            goto L70
        L6b:
            java.lang.String r8 = "sjehaN48g93X\n"
            java.lang.String r9 = "kXKXLph6xZs=\n"
            goto L66
        L70:
            int r8 = android.graphics.Color.parseColor(r8)
            r6.setColor(r8)
            r8 = 1120403456(0x42c80000, float:100.0)
            float r8 = defpackage.ff.p(r8)
            r6.setCornerRadius(r8)
            int r8 = defpackage.ff.q(r4)
            if (r2 == 0) goto L8f
            java.lang.String r9 = "LH8OSqN2V2lJ\n"
            java.lang.String r10 = "D004DOUwES8=\n"
        L8a:
            java.lang.String r9 = defpackage.u40.a(r9, r10)
            goto L94
        L8f:
            java.lang.String r9 = "m2yAhmALIkuI\n"
            java.lang.String r10 = "uF3BtlA7Ens=\n"
            goto L8a
        L94:
            int r9 = android.graphics.Color.parseColor(r9)
            r6.setStroke(r8, r9)
            r5.setBackground(r6)
            r6 = 1106247680(0x41f00000, float:30.0)
            float r6 = defpackage.ff.p(r6)
            r5.setElevation(r6)
            r6 = 28
            if (r1 < r6) goto Ld1
            java.lang.String r1 = "EFWG6ZcU2A==\n"
            java.lang.String r6 = "M2W22ack6Cc=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r6)
            int r1 = android.graphics.Color.parseColor(r1)
            defpackage.c0.r(r5, r1)
            if (r13 == 0) goto Lc5
            java.lang.String r1 = "L1O+ccV26U48\n"
            java.lang.String r6 = "DGCNN4NFq30=\n"
        Lc0:
            java.lang.String r1 = defpackage.u40.a(r1, r6)
            goto Lca
        Lc5:
            java.lang.String r1 = "lr/Ol8PKerOF\n"
            java.lang.String r6 = "tY3+p/P6SoM=\n"
            goto Lc0
        Lca:
            int r1 = android.graphics.Color.parseColor(r1)
            defpackage.c0.A(r5, r1)
        Ld1:
            android.view.View r1 = new android.view.View
            r1.<init>(r11)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r8 = 8
            int r9 = defpackage.ff.q(r8)
            int r8 = defpackage.ff.q(r8)
            r6.<init>(r9, r8)
            int r7 = defpackage.ff.q(r7)
            r6.rightMargin = r7
            r1.setLayoutParams(r6)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            r6.setShape(r4)
            if (r13 == 0) goto L101
            java.lang.String r13 = "wI85IX+qRA==\n"
            java.lang.String r7 = "48l/Ej2ZdE8=\n"
        Lfc:
            java.lang.String r13 = defpackage.u40.a(r13, r7)
            goto L106
        L101:
            java.lang.String r13 = "pGIdhTk2HA==\n"
            java.lang.String r7 = "h1Epxg4DJRI=\n"
            goto Lfc
        L106:
            int r13 = android.graphics.Color.parseColor(r13)
            r6.setColor(r13)
            r1.setBackground(r6)
            android.widget.TextView r13 = new android.widget.TextView
            r13.<init>(r11)
            r13.setText(r12)
            r12 = 1096286208(0x41580000, float:13.5)
            r13.setTextSize(r12)
            if (r2 == 0) goto L128
            java.lang.String r12 = "RF8RUBe0zQ==\n"
            java.lang.String r2 = "ZxkkFiLy+H8=\n"
        L123:
            java.lang.String r12 = defpackage.u40.a(r12, r2)
            goto L12d
        L128:
            java.lang.String r12 = "MMgOfGOHfA==\n"
            java.lang.String r2 = "E/k/TVK2TUY=\n"
            goto L123
        L12d:
            int r12 = android.graphics.Color.parseColor(r12)
            r13.setTextColor(r12)
            java.lang.String r12 = "fwW/pIX0BcFlAvy6zeMJxmE=\n"
            java.lang.String r2 = "DGTR16iHYLM=\n"
            java.lang.String r12 = defpackage.u40.a(r12, r2)
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r3)
            r13.setTypeface(r12, r4)
            r12 = 1017370378(0x3ca3d70a, float:0.02)
            r13.setLetterSpacing(r12)
            r5.addView(r1)
            r5.addView(r13)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r13 = -2
            r12.<init>(r13, r13)
            r13 = 49
            r12.gravity = r13
            r13 = 55
            int r13 = defpackage.ff.q(r13)
            r12.topMargin = r13
            r0.addView(r5, r12)
            r11.activeToast = r5
            r12 = 1114636288(0x42700000, float:60.0)
            float r12 = defpackage.ff.p(r12)
            float r12 = -r12
            r5.setTranslationY(r12)
            r12 = 0
            r5.setAlpha(r12)
            r13 = 1062836634(0x3f59999a, float:0.85)
            r5.setScaleX(r13)
            r5.setScaleY(r13)
            android.view.ViewPropertyAnimator r13 = r5.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r13 = r13.alpha(r1)
            r2 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r13 = r13.setDuration(r2)
            r13.start()
            h40 r13 = new h40
            qh r2 = defpackage.h40.m
            r13.<init>(r5, r2)
            r2 = 1128792064(0x43480000, float:200.0)
            r3 = 1058642330(0x3f19999a, float:0.6)
            i40 r12 = defpackage.z30.f(r12, r2, r3)
            r13.j = r12
            r13.h()
            h40 r12 = new h40
            qh r13 = defpackage.h40.n
            r12.<init>(r5, r13)
            i40 r13 = defpackage.z30.f(r1, r2, r3)
            r12.j = r13
            r12.h()
            h40 r12 = new h40
            qh r13 = defpackage.h40.o
            r12.<init>(r5, r13)
            i40 r13 = defpackage.z30.f(r1, r2, r3)
            r12.j = r13
            r12.h()
            js r12 = new js
            r12.<init>(r5, r0)
            r0 = 2500(0x9c4, double:1.235E-320)
            r5.postDelayed(r12, r0)
            return
    }

    public static /* synthetic */ void showCapsuleToast$default(com.ljx.wechatmod.ui.MainActivity r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.showCapsuleToast(r1, r2)
            return
    }

    private static final void showCapsuleToast$lambda$18(android.widget.LinearLayout r4, android.view.ViewGroup r5) {
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L66
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            js r1 = new js
            r1.<init>(r5, r4)
            android.view.ViewPropertyAnimator r5 = r0.withEndAction(r1)
            r5.start()
            h40 r5 = new h40
            qh r0 = defpackage.h40.m
            r5.<init>(r4, r0)
            i40 r0 = new i40
            r1 = 1114636288(0x42700000, float:60.0)
            float r1 = defpackage.ff.p(r1)
            float r1 = -r1
            r0.<init>(r1)
            r1 = 1128792064(0x43480000, float:200.0)
            r0.b(r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.a(r2)
            r5.j = r0
            r5.h()
            h40 r5 = new h40
            qh r0 = defpackage.h40.n
            r5.<init>(r4, r0)
            r0 = 1062836634(0x3f59999a, float:0.85)
            i40 r3 = defpackage.z30.f(r0, r1, r2)
            r5.j = r3
            r5.h()
            h40 r5 = new h40
            qh r3 = defpackage.h40.o
            r5.<init>(r4, r3)
            i40 r4 = defpackage.z30.f(r0, r1, r2)
            r5.j = r4
            r5.h()
        L66:
            return
    }

    private static final void showCapsuleToast$lambda$18$lambda$14(android.view.ViewGroup r0, android.widget.LinearLayout r1) {
            r0.removeView(r1)
            return
    }

    private final void startCascadingEntranceAnimation(android.view.ViewGroup r9) {
            r8 = this;
            int r0 = r9.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L48
            android.view.View r2 = r9.getChildAt(r1)
            r3 = 0
            r2.setAlpha(r3)
            r3 = 1120403456(0x42c80000, float:100.0)
            float r3 = defpackage.ff.p(r3)
            r2.setTranslationY(r3)
            android.view.ViewPropertyAnimator r3 = r2.animate()
            r4 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r3 = r3.alpha(r4)
            r4 = 600(0x258, double:2.964E-321)
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r4)
            long r4 = (long) r1
            r6 = 90
            long r4 = r4 * r6
            android.view.ViewPropertyAnimator r3 = r3.setStartDelay(r4)
            android.view.animation.AccelerateDecelerateInterpolator r6 = new android.view.animation.AccelerateDecelerateInterpolator
            r6.<init>()
            android.view.ViewPropertyAnimator r3 = r3.setInterpolator(r6)
            r3.start()
            gs r3 = new gs
            r6 = 2
            r3.<init>(r2, r6)
            r2.postDelayed(r3, r4)
            int r1 = r1 + 1
            goto L5
        L48:
            return
    }

    private static final void startCascadingEntranceAnimation$lambda$53(android.view.View r3) {
            h40 r0 = new h40
            qh r1 = defpackage.h40.m
            r0.<init>(r3, r1)
            r3 = 1128792064(0x43480000, float:200.0)
            r1 = 1059481190(0x3f266666, float:0.65)
            r2 = 0
            i40 r3 = defpackage.z30.f(r2, r3, r1)
            r0.j = r3
            r0.h()
            return
    }

    public final boolean isModuleActive() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle r4) {
            r3 = this;
            java.lang.String r0 = "package:"
            super.onCreate(r4)
            r3.setupModernSystemUi()     // Catch: java.lang.Throwable -> L48
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L48
            r1 = 30
            if (r4 < r1) goto L4a
            boolean r4 = defpackage.d0.u()     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L4a
            java.lang.String r4 = "10bIXiNUZPm+PNQ/Y0MFlIVsoBg6PBXe2EfLXxxFZsubM888Y0E8lYJPriULPTf02GDY\n"
            java.lang.String r1 = "PtpItoXVgnA=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r1)     // Catch: java.lang.Throwable -> L48
            r1 = 1
            r3.showCapsuleToast(r4, r1)     // Catch: java.lang.Throwable -> L48
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "6jTh4Cmt4fL4P/HmL6rir6UXxNwHg8CDygrVzQeIyYPNE8nXFZvEn8gf1sEZlMCOxhPWwQ+Lyw==\n"
            java.lang.String r2 = "i1qFkkbEhdw=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)     // Catch: java.lang.Throwable -> L48
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r2.append(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L48
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L48
            r4.setData(r0)     // Catch: java.lang.Throwable -> L48
            r3.startActivity(r4)     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r4 = move-exception
            goto L4e
        L4a:
            r3.initSukiStyleUI()     // Catch: java.lang.Throwable -> L48
            return
        L4e:
            android.widget.ScrollView r0 = new android.widget.ScrollView
            r0.<init>(r3)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r3)
            java.lang.String r4 = defpackage.ip.W(r4)
            java.lang.String r2 = "App 启动异常：\n\n"
            java.lang.String r4 = r2.concat(r4)
            r1.setText(r4)
            java.lang.String r4 = "XL04w48VaQ==\n"
            java.lang.String r2 = "f/t+9r0gWxk=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r2)
            int r4 = android.graphics.Color.parseColor(r4)
            r1.setTextColor(r4)
            r4 = 1096810496(0x41600000, float:14.0)
            r1.setTextSize(r4)
            r4 = 100
            r2 = 50
            r1.setPadding(r2, r4, r2, r2)
            r0.addView(r1)
            r3.setContentView(r0)
            return
    }

    @Override // android.app.Activity
    public void onResume() {
            r2 = this;
            super.onResume()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            boolean r0 = defpackage.d0.u()
            if (r0 == 0) goto L10
            goto L11
        L10:
            return
        L11:
            r2.extractFontToStealthDir()
            return
    }
}
