package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p50 extends de.robv.android.xposed.XC_MethodHook {
    public final int a;

    public /* synthetic */ p50(int r4) {
            r3 = this;
            r3.a = r4
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "ۨۡۡ"
            int r1 = androidx.profileinstaller.C0030.m120(r1)
        Lc:
            switch(r1) {
                case 56351: goto L10;
                case 56448: goto L73;
                case 1748710: goto L89;
                case 1748734: goto L4e;
                case 1751618: goto L44;
                case 1755400: goto L29;
                default: goto Lf;
            }
        Lf:
            goto Lc
        L10:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = android.app.C0003.f3
            int r2 = com.google.android.material.theme.C0062.f62
            r2 = r2 | 7607(0x1db7, float:1.066E-41)
            int r1 = r1 - r2
            if (r1 > 0) goto L69
            r1 = 91
            defpackage.C0073.f73 = r1
        L22:
            java.lang.String r1 = "ۡ۠"
            int r1 = androidx.activity.result.C0009.m38(r1)
            goto Lc
        L29:
            int r1 = androidx.versionedparcelable.C0042.m169()
            if (r1 > 0) goto L73
            int r1 = androidx.constraintlayout.widget.C0020.f20
            if (r1 < 0) goto L3d
            com.google.android.material.behavior.C0050.m202()
            java.lang.String r1 = "ۤۤ"
            int r1 = androidx.savedstate.C0034.m138(r1)
            goto Lc
        L3d:
            java.lang.String r1 = "ۣۡ۠"
        L3f:
            int r1 = androidx.lifecycle.C0029.m116(r1)
            goto Lc
        L44:
            int r1 = com.google.android.material.floatingactionbutton.C0060.f60
            int r2 = androidx.activity.C0011.f11
            r1 = r1 | r2
            r2 = 1755466(0x1ac94a, float:2.459932E-39)
            int r1 = r1 + r2
            goto Lc
        L4e:
            java.lang.String r0 = "QAz"
            java.lang.String r0 = com.google.android.material.behavior.C0050.m201(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            int r1 = androidx.startup.C0037.m150()
            if (r1 > 0) goto L22
            r1 = 56
            android.app.C0003.f3 = r1
            java.lang.String r1 = "ۣۤۡ"
            int r1 = androidx.appcompat.widget.C0013.m53(r1)
            goto Lc
        L69:
            int r1 = androidx.versionedparcelable.C0042.f42
            int r2 = androidx.constraintlayout.widget.C0020.f20
            int r1 = r1 % r2
            r2 = 1748787(0x1aaf33, float:2.450573E-39)
            int r1 = r1 + r2
            goto Lc
        L73:
            int r1 = androidx.appcompat.widget.C0015.f15
            int r2 = com.github.megatronking.stringfog.xor.C0046.f46
            int r2 = r2 + 5363
            int r1 = r1 - r2
            if (r1 < 0) goto L7f
            java.lang.String r1 = "ۢۥۥ"
            goto L3f
        L7f:
            int r1 = defpackage.C0073.f73
            int r2 = androidx.versionedparcelable.C0041.f41
            r1 = r1 | r2
            r2 = 1748777(0x1aaf29, float:2.450559E-39)
            r1 = r1 ^ r2
            goto Lc
        L89:
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r14) {
            r13 = this;
            r12 = 2114453522(0x7e080012, float:4.5193843E37)
            r11 = 2114453521(0x7e080011, float:4.519384E37)
            r10 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r6 = 0
            int r0 = r13.a
            switch(r0) {
                case 1: goto L832;
                case 2: goto L74b;
                case 3: goto Lf;
                case 4: goto L5bb;
                case 5: goto Lf;
                case 6: goto L3d9;
                case 7: goto L1ca;
                case 8: goto L28;
                default: goto Lf;
            }
        Lf:
            super.afterHookedMethod(r14)
            int r0 = androidx.activity.result.C0008.m33()
            if (r0 > 0) goto L27
            java.lang.String r0 = "3g"
            java.lang.String r0 = com.google.android.material.datepicker.C0058.m235(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L27:
            return
        L28:
            java.lang.String r0 = "NxQB8wE=\n"
            java.lang.String r1 = "R3VzkmwAxX8=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r14)
            java.lang.Object r0 = r14.thisObject
            boolean r1 = r0 instanceof android.widget.PopupWindow
            if (r1 == 0) goto L1ba
            android.widget.PopupWindow r0 = (android.widget.PopupWindow) r0
        L3b:
            if (r0 == 0) goto L27
            android.view.View r2 = r0.getContentView()
            if (r2 == 0) goto L27
            boolean r1 = r0.isFocusable()
            if (r1 != 0) goto L4f
            boolean r0 = r0.isOutsideTouchable()
            if (r0 == 0) goto L27
        L4f:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "LIKJvtKfM0FlydPZ\n"
            java.lang.String r4 = "S+f98LPyVmk=\n"
            defpackage.u40.a(r1, r4)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r0.toLowerCase(r1)
            java.lang.String r0 = "k93UcydsP/+Gwf00fidjlQ==\n"
            java.lang.String r5 = "57KYHFAJTbw=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r5)
            defpackage.ip.n(r0, r4)
            int r0 = r2.getId()     // Catch: java.lang.Throwable -> L1bd
            r5 = -1
            if (r0 == r5) goto L1be
            android.content.Context r0 = r2.getContext()     // Catch: java.lang.Throwable -> L1bd
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L1bd
            int r5 = r2.getId()     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r0 = r0.getResourceEntryName(r5)     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r5 = "28Bi/X+rBsPOxnPqdKwbz/LEe8oy9keYlQ==\n"
            java.lang.String r7 = "vKUWrxrYabY=\n"
            java.lang.String r5 = defpackage.u40.a(r5, r7)     // Catch: java.lang.Throwable -> L1bd
            defpackage.ip.n(r5, r0)     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r0 = r0.toLowerCase(r1)     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r1 = "DddM/De0iOAYy2W7bv/Uig==\n"
            java.lang.String r5 = "ebgAk0DR+qM=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r5)     // Catch: java.lang.Throwable -> L1bd
            defpackage.ip.n(r1, r0)     // Catch: java.lang.Throwable -> L1bd
        La0:
            java.lang.String r1 = "OuAjLis=\n"
            java.lang.String r5 = "TI9KTU4Kx24=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r5)
            boolean r1 = defpackage.b50.B(r4, r1, r6)
            if (r1 != 0) goto L27
            java.lang.String r1 = "vIBh\n"
            java.lang.String r5 = "0ekCFmUEPso=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r5)
            boolean r1 = defpackage.b50.B(r4, r1, r6)
            if (r1 != 0) goto L27
            java.lang.String r1 = "u/iV1DXi\n"
            java.lang.String r5 = "yZ32u0eGppY=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r5)
            boolean r1 = defpackage.b50.B(r4, r1, r6)
            if (r1 != 0) goto L27
            java.lang.String r1 = "MXya65Q=\n"
            java.lang.String r4 = "RxPziPGhDjY=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r4)
            boolean r1 = defpackage.b50.B(r0, r1, r6)
            if (r1 != 0) goto L27
            java.lang.String r1 = "3yDi\n"
            java.lang.String r4 = "skmBIeRH2tI=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r4)
            boolean r1 = defpackage.b50.B(r0, r1, r6)
            if (r1 != 0) goto L27
            java.lang.String r1 = "gk6lVpb2\n"
            java.lang.String r4 = "8CvGOeSSzQs=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r4)
            boolean r1 = defpackage.b50.B(r0, r1, r6)
            if (r1 != 0) goto L27
            java.lang.String r1 = "GxZa\n"
            java.lang.String r4 = "aXU+1XhbVtU=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r4)
            boolean r0 = defpackage.b50.B(r0, r1, r6)
            if (r0 != 0) goto L27
            android.view.ViewPropertyAnimator r0 = r2.animate()
            r0.cancel()
            java.lang.Object r0 = r2.getTag(r11)
            boolean r1 = r0 instanceof defpackage.h40
            if (r1 == 0) goto L1c2
            h40 r0 = (defpackage.h40) r0
        L113:
            if (r0 == 0) goto L118
            r0.c()
        L118:
            java.lang.Object r0 = r2.getTag(r12)
            boolean r1 = r0 instanceof defpackage.h40
            if (r1 == 0) goto L1c5
            h40 r0 = (defpackage.h40) r0
        L122:
            if (r0 == 0) goto L127
            r0.c()
        L127:
            int r0 = r2.getWidth()
            float r0 = (float) r0
            r1 = 1063675494(0x3f666666, float:0.9)
            float r0 = r0 * r1
            r2.setPivotX(r0)
            r0 = 0
            r2.setPivotY(r0)
            r0 = 1058642330(0x3f19999a, float:0.6)
            r2.setScaleX(r0)
            r0 = 1058642330(0x3f19999a, float:0.6)
            r2.setScaleY(r0)
            r0 = 0
            r2.setAlpha(r0)
            r0 = 2
            r2.setLayerType(r0, r3)
            android.view.ViewPropertyAnimator r0 = r2.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r10)
            r4 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r4)
            gs r1 = new gs
            r4 = 4
            r1.<init>(r2, r4)
            android.view.ViewPropertyAnimator r0 = r0.withEndAction(r1)
            r0.start()
            java.lang.Object r0 = r2.getTag(r11)
            boolean r1 = r0 instanceof defpackage.h40
            if (r1 == 0) goto L1c8
            h40 r0 = (defpackage.h40) r0
        L170:
            if (r0 != 0) goto L8ca
            h40 r0 = new h40
            qh r1 = defpackage.h40.n
            r0.<init>(r2, r1)
            r2.setTag(r11, r0)
            r1 = r0
        L17d:
            java.lang.Object r0 = r2.getTag(r12)
            boolean r4 = r0 instanceof defpackage.h40
            if (r4 == 0) goto L8c7
            h40 r0 = (defpackage.h40) r0
        L187:
            if (r0 != 0) goto L193
            h40 r0 = new h40
            qh r3 = defpackage.h40.o
            r0.<init>(r2, r3)
            r2.setTag(r12, r0)
        L193:
            r3 = 1128792064(0x43480000, float:200.0)
            r4 = 1059481190(0x3f266666, float:0.65)
            i40 r3 = defpackage.z30.f(r10, r3, r4)
            r1.j = r3
            r3 = 1128792064(0x43480000, float:200.0)
            r4 = 1059481190(0x3f266666, float:0.65)
            i40 r3 = defpackage.z30.f(r10, r3, r4)
            r0.j = r3
            r1.h()
            r0.h()
            gs r0 = new gs
            r1 = 5
            r0.<init>(r2, r1)
            r2.post(r0)
            goto L27
        L1ba:
            r0 = r3
            goto L3b
        L1bd:
            r0 = move-exception
        L1be:
            java.lang.String r0 = ""
            goto La0
        L1c2:
            r0 = r3
            goto L113
        L1c5:
            r0 = r3
            goto L122
        L1c8:
            r0 = r3
            goto L170
        L1ca:
            java.lang.String r0 = "MeI2BD4=\n"
            java.lang.String r1 = "QYNEZVNTdRs=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r14)
            java.lang.Object r0 = r14.thisObject
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L3c2
            android.app.Dialog r0 = (android.app.Dialog) r0
            r4 = r0
        L1de:
            if (r4 == 0) goto L27
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L3c5
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            if (r0 == 0) goto L3c5
            int r0 = r0.flags
            r1 = r0 ^ (-9)
            r0 = r0 & r1
        L1f1:
            r2 = 1
            if (r0 == 0) goto L3c8
            r0 = 1
        L1f5:
            if (r0 != 0) goto L27
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L353
            android.view.View r5 = r0.getDecorView()
            if (r5 == 0) goto L353
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "sKWX2LKuwh/57s2/\n"
            java.lang.String r7 = "18DjltPDpzc=\n"
            defpackage.u40.a(r1, r7)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r7 = r0.toLowerCase(r1)
            java.lang.String r0 = "sYy7IXHqmp+kkJJmKKHG9Q==\n"
            java.lang.String r8 = "xeP3TgaP6Nw=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r8)
            defpackage.ip.n(r0, r7)
            int r0 = r5.getId()     // Catch: java.lang.Throwable -> L3cb
            r8 = -1
            if (r0 == r8) goto L3cc
            android.content.Context r0 = r5.getContext()     // Catch: java.lang.Throwable -> L3cb
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L3cb
            int r8 = r5.getId()     // Catch: java.lang.Throwable -> L3cb
            java.lang.String r0 = r0.getResourceEntryName(r8)     // Catch: java.lang.Throwable -> L3cb
            java.lang.String r8 = "YFZyDD1oinN1UGMbNm+Xf0lSaztwNcsoLg==\n"
            java.lang.String r9 = "BzMGXlgb5QY=\n"
            java.lang.String r8 = defpackage.u40.a(r8, r9)     // Catch: java.lang.Throwable -> L3cb
            defpackage.ip.n(r8, r0)     // Catch: java.lang.Throwable -> L3cb
            java.lang.String r0 = r0.toLowerCase(r1)     // Catch: java.lang.Throwable -> L3cb
            java.lang.String r1 = "9DAvg/kwvWHhLAbEoHvhCw==\n"
            java.lang.String r8 = "gF9j7I5VzyI=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r8)     // Catch: java.lang.Throwable -> L3cb
            defpackage.ip.n(r1, r0)     // Catch: java.lang.Throwable -> L3cb
        L254:
            java.lang.String r1 = "6qRd+JQ=\n"
            java.lang.String r8 = "nMs0m/EhP04=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r8)
            boolean r1 = defpackage.b50.B(r7, r1, r6)
            if (r1 != 0) goto L27
            java.lang.String r1 = "ybwk\n"
            java.lang.String r8 = "pNVH2GmyQuA=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r8)
            boolean r1 = defpackage.b50.B(r7, r1, r6)
            if (r1 != 0) goto L27
            java.lang.String r1 = "x7j84+cv\n"
            java.lang.String r8 = "td2fjJVLBAE=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r8)
            boolean r1 = defpackage.b50.B(r7, r1, r6)
            if (r1 != 0) goto L27
            java.lang.String r1 = "HbP2dGM=\n"
            java.lang.String r7 = "a9yfFwaGMNM=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r7)
            boolean r1 = defpackage.b50.B(r0, r1, r6)
            if (r1 != 0) goto L27
            java.lang.String r1 = "LYrD\n"
            java.lang.String r7 = "QOOgoBWsLMw=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r7)
            boolean r1 = defpackage.b50.B(r0, r1, r6)
            if (r1 != 0) goto L27
            java.lang.String r1 = "iXh8cINf\n"
            java.lang.String r7 = "+x0fH/E7aNQ=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r7)
            boolean r1 = defpackage.b50.B(r0, r1, r6)
            if (r1 != 0) goto L27
            java.lang.String r1 = "Rdt/\n"
            java.lang.String r7 = "N7gbsLrkBPs=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r7)
            boolean r0 = defpackage.b50.B(r0, r1, r6)
            if (r0 != 0) goto L27
            android.view.ViewPropertyAnimator r0 = r5.animate()
            r0.cancel()
            java.lang.Object r0 = r5.getTag(r11)
            boolean r1 = r0 instanceof defpackage.h40
            if (r1 == 0) goto L3d0
            h40 r0 = (defpackage.h40) r0
        L2c7:
            if (r0 == 0) goto L2cc
            r0.c()
        L2cc:
            java.lang.Object r0 = r5.getTag(r12)
            boolean r1 = r0 instanceof defpackage.h40
            if (r1 == 0) goto L3d3
            h40 r0 = (defpackage.h40) r0
        L2d6:
            if (r0 == 0) goto L2db
            r0.c()
        L2db:
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r5.setScaleX(r0)
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r5.setScaleY(r0)
            r0 = 0
            r5.setAlpha(r0)
            r0 = 2
            r5.setLayerType(r0, r3)
            android.view.ViewPropertyAnimator r0 = r5.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r10)
            r6 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r6)
            gs r1 = new gs
            r6 = 3
            r1.<init>(r5, r6)
            android.view.ViewPropertyAnimator r0 = r0.withEndAction(r1)
            r0.start()
            java.lang.Object r0 = r5.getTag(r11)
            boolean r1 = r0 instanceof defpackage.h40
            if (r1 == 0) goto L3d6
            h40 r0 = (defpackage.h40) r0
        L314:
            if (r0 != 0) goto L8c4
            h40 r0 = new h40
            qh r1 = defpackage.h40.n
            r0.<init>(r5, r1)
            r5.setTag(r11, r0)
            r1 = r0
        L321:
            java.lang.Object r0 = r5.getTag(r12)
            boolean r6 = r0 instanceof defpackage.h40
            if (r6 == 0) goto L8c1
            h40 r0 = (defpackage.h40) r0
        L32b:
            if (r0 != 0) goto L337
            h40 r0 = new h40
            qh r3 = defpackage.h40.o
            r0.<init>(r5, r3)
            r5.setTag(r12, r0)
        L337:
            r3 = 1128792064(0x43480000, float:200.0)
            r5 = 1059481190(0x3f266666, float:0.65)
            i40 r3 = defpackage.z30.f(r10, r3, r5)
            r1.j = r3
            r3 = 1128792064(0x43480000, float:200.0)
            r5 = 1059481190(0x3f266666, float:0.65)
            i40 r3 = defpackage.z30.f(r10, r3, r5)
            r0.j = r3
            r1.h()
            r0.h()
        L353:
            java.lang.String r0 = "qdf/gwmw1xqy7eSwDK34AKw=\n"
            java.lang.String r1 = "wrKG3Hnfp28=\n"
            gn r3 = defpackage.gn.a
            boolean r0 = defpackage.z30.q(r0, r1, r3)
            if (r0 == 0) goto L27
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L27
            android.view.Window r1 = r4.getWindow()     // Catch: java.lang.Throwable -> L3ac
            if (r1 == 0) goto L27
            java.lang.String r0 = "YdsNS2C6M8V64RZ4Zacc2WTKEXpjvDfJ\n"
            java.lang.String r3 = "Cr50FBDVQ7A=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r3)     // Catch: java.lang.Throwable -> L3ac
            r3 = 100
            int r0 = defpackage.gn.b(r0, r3)     // Catch: java.lang.Throwable -> L3ac
            if (r0 <= 0) goto L27
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r3)     // Catch: java.lang.Throwable -> L3ac
            r3 = 0
            r1.setStatusBarColor(r3)     // Catch: java.lang.Throwable -> L3ac
            r3 = 0
            r1.setNavigationBarColor(r3)     // Catch: java.lang.Throwable -> L3ac
            r3 = 2
            r1.clearFlags(r3)     // Catch: java.lang.Throwable -> L3ac
            r3 = 4
            r1.addFlags(r3)     // Catch: java.lang.Throwable -> L3ac
            android.view.WindowManager$LayoutParams r3 = r1.getAttributes()     // Catch: java.lang.Throwable -> L3ac
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L3ac
            r4 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r4
            r4 = 150(0x96, float:2.1E-43)
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L3ac
            float r0 = r0 * r4
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L3ac
            r4 = 1
            if (r0 >= r4) goto L3a1
            r0 = r2
        L3a1:
            defpackage.p7.n(r3, r0)     // Catch: java.lang.Throwable -> L3ac
            r0 = 0
            r3.dimAmount = r0     // Catch: java.lang.Throwable -> L3ac
            r1.setAttributes(r3)     // Catch: java.lang.Throwable -> L3ac
            goto L27
        L3ac:
            r0 = move-exception
            java.lang.String r0 = "Nwje\n"
            java.lang.String r1 = "Q2m5jaPP2Zc=\n"
            java.lang.String r2 = "YEB4FG2CPUNZQW0+X6smVnRGaQ1yoA==\n"
            java.lang.String r3 = "MC8IYR3HUyQ=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            java.lang.String r3 = "Fg==\n"
            java.lang.String r4 = "c8HJlSTQVfc=\n"
            defpackage.z30.o(r0, r1, r2, r3, r4)
            goto L27
        L3c2:
            r4 = r3
            goto L1de
        L3c5:
            r0 = r6
            goto L1f1
        L3c8:
            r0 = r6
            goto L1f5
        L3cb:
            r0 = move-exception
        L3cc:
            java.lang.String r0 = ""
            goto L254
        L3d0:
            r0 = r3
            goto L2c7
        L3d3:
            r0 = r3
            goto L2d6
        L3d6:
            r0 = r3
            goto L314
        L3d9:
            m80 r4 = defpackage.vh.l
            java.lang.String r0 = "fg==\n"
            java.lang.String r1 = "Dln7Cr8v0xg=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r14)
            java.lang.Object r1 = r14.thisObject
            java.lang.String r0 = "4ddTizd7VenhzUvHdX0U5O7RS8djdxTp4MwSiWJ0WKf720+CN3la4/3NVoM5eUT3oeNck35uXfP2\n"
            java.lang.String r2 = "j6I/5xcYNIc=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)
            defpackage.ip.m(r0, r1)
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Class r0 = r1.getClass()
            java.lang.String r7 = r0.getName()
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L545
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L40b:
            if (r0 == 0) goto L27
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            gn r2 = defpackage.gn.a     // Catch: java.lang.Throwable -> L548
            r2.getClass()     // Catch: java.lang.Throwable -> L548
            java.lang.String r2 = "ANPNWd5DOQ==\n"
            java.lang.String r5 = "PKCoLfN8By8=\n"
            defpackage.u40.a(r2, r5)     // Catch: java.lang.Throwable -> L548
            defpackage.gn.e = r7     // Catch: java.lang.Throwable -> L548
        L420:
            gn r8 = defpackage.gn.a
            java.lang.String r2 = "KiWE8kEHkYE1H4jE\n"
            java.lang.String r5 = "QUD9rSJv9OA=\n"
            boolean r2 = defpackage.z30.q(r2, r5, r8)
            if (r2 == 0) goto L47e
            java.lang.String r2 = "UJlJCoJL565JsQ==\n"
            java.lang.String r5 = "HPg8ZOEjgtw=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r5)
            boolean r2 = defpackage.b50.B(r7, r2, r6)
            if (r2 != 0) goto L448
            java.lang.String r2 = "UC3WsLFlzLxGDA==\n"
            java.lang.String r5 = "E0W3xMUMots=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r5)
            boolean r2 = defpackage.b50.B(r7, r2, r6)
            if (r2 == 0) goto L47e
        L448:
            android.hardware.SensorManager r2 = defpackage.vh.k
            if (r2 != 0) goto L464
            android.content.Context r2 = r1.getApplicationContext()
            java.lang.String r5 = "X+UHuawI\n"
            java.lang.String r9 = "LIBpysN6nsc=\n"
            java.lang.String r5 = defpackage.u40.a(r5, r9)
            java.lang.Object r2 = r2.getSystemService(r5)
            boolean r5 = r2 instanceof android.hardware.SensorManager
            if (r5 == 0) goto L55e
            android.hardware.SensorManager r2 = (android.hardware.SensorManager) r2
        L462:
            defpackage.vh.k = r2
        L464:
            android.hardware.SensorManager r2 = defpackage.vh.k
            if (r2 == 0) goto L46d
            r3 = 1
            android.hardware.Sensor r3 = r2.getDefaultSensor(r3)
        L46d:
            if (r3 == 0) goto L47e
            android.hardware.SensorManager r2 = defpackage.vh.k
            if (r2 == 0) goto L476
            r2.unregisterListener(r4)
        L476:
            android.hardware.SensorManager r2 = defpackage.vh.k
            if (r2 == 0) goto L47e
            r5 = 2
            r2.registerListener(r4, r3, r5)
        L47e:
            java.lang.String r2 = "+WZNFq7ws47gTg==\n"
            java.lang.String r3 = "tQc4eM2Y1vw=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            boolean r2 = defpackage.b50.B(r7, r2, r6)
            if (r2 == 0) goto L4c8
            java.lang.String r2 = "3R2hc4D6RyTCEbZLueVNMcIRtkuV\n"
            java.lang.String r3 = "tnjYLOaWKEU=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            boolean r2 = defpackage.gn.e(r2)
            if (r2 == 0) goto L572
            java.lang.String r2 = "ddas\n"
            java.lang.String r3 = "AbfL95mQedY=\n"
            java.lang.String r4 = "fakeKTfI\n"
            java.lang.String r5 = "Lsxqa0OmF94=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r5)
            java.lang.String r5 = "ITa66yE=\n"
            java.lang.String r9 = "Q1rViEo8ya8=\n"
            defpackage.z30.o(r2, r3, r4, r5, r9)
            java.lang.String r2 = "qogz5+Dmgse5hDjrzMqFx6M=\n"
            java.lang.String r3 = "ze1WjL+V57M=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)     // Catch: java.lang.Throwable -> L561
            java.lang.String r3 = "GKCF8KLV\n"
            java.lang.String r4 = "+jocHxpaGbo=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r4)     // Catch: java.lang.Throwable -> L561
            k80 r5 = new k80     // Catch: java.lang.Throwable -> L561
            r4 = 0
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L561
            r4 = 300(0x12c, float:4.2E-43)
            defpackage.vh.c(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L561
        L4c8:
            java.lang.String r2 = "EzqE5pgIE8EKEg==\n"
            java.lang.String r3 = "X1vxiPtgdrM=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            boolean r2 = defpackage.b50.B(r7, r2, r6)
            if (r2 != 0) goto L4e4
            java.lang.String r2 = "i5AmdhSrlDydsQ==\n"
            java.lang.String r3 = "yPhHAmDC+ls=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            boolean r2 = defpackage.b50.B(r7, r2, r6)
            if (r2 == 0) goto L520
        L4e4:
            java.lang.String r2 = "0rzJvyeZaXLNht2PIJQ=\n"
            java.lang.String r3 = "udmw4ETxDBM=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            java.lang.String r3 = "aYbW\n"
            java.lang.String r4 = "AuOvGSdAksw=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r4)
            defpackage.ip.o(r3, r2)
            r8.getClass()     // Catch: java.lang.Throwable -> L587
            r3 = 0
            int r2 = defpackage.gn.b(r2, r3)     // Catch: java.lang.Throwable -> L587
        L4ff:
            java.lang.String r3 = "8GOqAz7eXGfvWaY1\n"
            java.lang.String r4 = "mwbTXF22OQY=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r4)
            boolean r3 = defpackage.gn.e(r3)
            if (r3 == 0) goto L5a6
            if (r2 != 0) goto L5a6
            java.lang.String r2 = "JJrsGPUoQIQ=\n"
            java.lang.String r3 = "Z/KJeYFqNOo=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            hv r3 = new hv
            r4 = 2
            r3.<init>(r0, r4, r1)
            defpackage.gn.j(r2, r3)
        L520:
            java.lang.String r2 = "+RiqWLQ7FEnvOQ==\n"
            java.lang.String r3 = "unDLLMBSei4=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            boolean r2 = defpackage.b50.B(r7, r2, r6)
            if (r2 == 0) goto L27
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            t5 r3 = new t5
            r4 = 10
            r3.<init>(r1, r4, r0)
            r0 = 800(0x320, double:3.953E-321)
            r2.postDelayed(r3, r0)
            goto L27
        L545:
            r0 = r3
            goto L40b
        L548:
            r2 = move-exception
            java.lang.String r2 = "Nwje\n"
            java.lang.String r5 = "Q2m5jaPP2Zc=\n"
            java.lang.String r8 = "hGr26HeogOm+U//kbA==\n"
            java.lang.String r9 = "0SO+hxjD370=\n"
            java.lang.String r8 = defpackage.u40.a(r8, r9)
            java.lang.String r9 = "Fg==\n"
            java.lang.String r10 = "c8HJlSTQVfc=\n"
            defpackage.z30.o(r2, r5, r8, r9, r10)
            goto L420
        L55e:
            r2 = r3
            goto L462
        L561:
            r2 = move-exception
            java.lang.String r2 = "Nwje\n"
            java.lang.String r3 = "Q2m5jaPP2Zc=\n"
            defpackage.u40.a(r2, r3)
            java.lang.String r2 = "Fg==\n"
            java.lang.String r3 = "c8HJlSTQVfc=\n"
            defpackage.u40.a(r2, r3)
            goto L4c8
        L572:
            java.lang.String r2 = "jO2X5KEmyUSf4ZzojQrORIU=\n"
            java.lang.String r3 = "64jyj/5VrDA=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            android.view.View r2 = r0.findViewWithTag(r2)
            if (r2 == 0) goto L4c8
            r3 = 8
            r2.setVisibility(r3)
            goto L4c8
        L587:
            r3 = move-exception
            gn r3 = defpackage.gn.a     // Catch: java.lang.Throwable -> L5a2
            r3.getClass()     // Catch: java.lang.Throwable -> L5a2
            r3 = 0
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L5a2
            java.lang.String r2 = defpackage.gn.d(r2, r3)     // Catch: java.lang.Throwable -> L5a2
            java.lang.Integer r2 = defpackage.b50.R(r2)     // Catch: java.lang.Throwable -> L5a2
            if (r2 == 0) goto L5a3
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L5a2
            goto L4ff
        L5a2:
            r2 = move-exception
        L5a3:
            r2 = r6
            goto L4ff
        L5a6:
            java.lang.String r2 = "HmpAKBpFF0AYe3ohMUg=\n"
            java.lang.String r3 = "eQ8lQ0UmfyU=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            android.view.View r2 = r0.findViewWithTag(r2)
            if (r2 == 0) goto L520
            r3 = 8
            r2.setVisibility(r3)
            goto L520
        L5bb:
            java.lang.String r0 = "Hw==\n"
            java.lang.String r1 = "b8zHCs9fJlQ=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r14)
            gn r1 = defpackage.gn.a
            java.lang.String r0 = "eAQEuzJK3TNMDRKHPlHXN30=\n"
            java.lang.String r2 = "E2F95F8lvlg=\n"
            boolean r0 = defpackage.z30.q(r0, r2, r1)
            if (r0 == 0) goto L27
            java.lang.Object[] r0 = r14.args
            java.lang.String r2 = "HWAJ/A==\n"
            java.lang.String r4 = "fBJuj1P6vjw=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r4)
            defpackage.ip.n(r2, r0)
            int r2 = r0.length
            if (r2 != 0) goto L6f8
            r0 = r3
        L5e3:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L5ea
            java.lang.String r0 = (java.lang.String) r0
            r3 = r0
        L5ea:
            if (r3 == 0) goto L27
            int r0 = r3.length()
            r2 = 15
            if (r0 > r2) goto L27
            java.lang.String r0 = "nv0Z8oCtSBM=\n"
            java.lang.String r2 = "8pxtm/TYLHY=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L61e
            java.lang.String r0 = "fPHJ\n"
            java.lang.String r2 = "EJC91nfLNPc=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L61e
            java.lang.String r0 = "0fjv2WDq\n"
            java.lang.String r2 = "oZeGtxSTzoc=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L674
        L61e:
            java.lang.String r0 = "tEaK945Gem2AT5Lc\n"
            java.lang.String r2 = "3yPzqOMpGQY=\n"
            java.lang.String r2 = defpackage.u40.a(r0, r2)
            java.lang.String r0 = "K4EC6uixvw==\n"
            java.lang.String r4 = "GLgs09iFjVE=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r4)
            java.lang.String r4 = "3f5Z\n"
            java.lang.String r5 = "tpsgeLwwj7M=\n"
            java.lang.String r7 = "lNdk\n"
            java.lang.String r8 = "8LICxVL6724=\n"
            java.lang.String r4 = defpackage.z30.k(r4, r5, r2, r7, r8)
            defpackage.ip.o(r4, r0)
            r1.getClass()     // Catch: java.lang.Throwable -> L6fc
            java.lang.String r0 = defpackage.gn.d(r2, r0)     // Catch: java.lang.Throwable -> L6fc
        L644:
            java.lang.Double r0 = defpackage.a50.A(r0)
            if (r0 == 0) goto L718
            double r0 = r0.doubleValue()
        L64e:
            java.lang.reflect.Member r2 = r14.method
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "yHqmMGL7cauBMfxX\n"
            java.lang.String r5 = "rx/SfgOWFIM=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r5)
            defpackage.ip.n(r4, r2)
            java.lang.String r4 = "lxhHI5ul\n"
            java.lang.String r5 = "xGw1SvXCRbU=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r5)
            boolean r2 = defpackage.b50.B(r2, r4, r6)
            if (r2 == 0) goto L71f
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L671:
            r14.setResult(r0)
        L674:
            java.lang.String r0 = "bm6WekADj6hn\n"
            java.lang.String r1 = "AgH4HSl3+sw=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L69e
            java.lang.String r0 = "M678\n"
            java.lang.String r1 = "X8CbR9Egbq0=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L69e
            java.lang.String r0 = "2bP9HkSG\n"
            java.lang.String r1 = "qdyUcDD+n+E=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L27
        L69e:
            java.lang.String r0 = "zJnJug1qpav4kN6C\n"
            java.lang.String r1 = "p/yw5WAFxsA=\n"
            java.lang.String r2 = defpackage.u40.a(r0, r1)
            java.lang.String r0 = "ejhfyJgL3Bk=\n"
            java.lang.String r1 = "Swlp5qw76y0=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            java.lang.String r1 = "3f5Z\n"
            java.lang.String r3 = "tpsgeLwwj7M=\n"
            java.lang.String r4 = "lNdk\n"
            java.lang.String r5 = "8LICxVL6724=\n"
            java.lang.String r1 = defpackage.z30.k(r1, r3, r2, r4, r5)
            defpackage.ip.o(r1, r0)
            gn r1 = defpackage.gn.a     // Catch: java.lang.Throwable -> L725
            r1.getClass()     // Catch: java.lang.Throwable -> L725
            java.lang.String r0 = defpackage.gn.d(r2, r0)     // Catch: java.lang.Throwable -> L725
        L6c6:
            java.lang.Double r0 = defpackage.a50.A(r0)
            if (r0 == 0) goto L740
            double r0 = r0.doubleValue()
        L6d0:
            java.lang.reflect.Member r2 = r14.method
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "yLd985hrAvyB/CeU\n"
            java.lang.String r4 = "r9IJvfkGZ9Q=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r4)
            defpackage.ip.n(r3, r2)
            java.lang.String r3 = "lCU2cCDH\n"
            java.lang.String r4 = "x1FEGU6g8QY=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r4)
            boolean r2 = defpackage.b50.B(r2, r3, r6)
            if (r2 == 0) goto L746
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L6f3:
            r14.setResult(r0)
            goto L27
        L6f8:
            r0 = r0[r6]
            goto L5e3
        L6fc:
            r1 = move-exception
            gn r4 = defpackage.gn.a     // Catch: java.lang.Throwable -> L8be
            java.lang.Integer r1 = defpackage.b50.R(r0)     // Catch: java.lang.Throwable -> L8be
            if (r1 == 0) goto L716
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L8be
        L709:
            r4.getClass()     // Catch: java.lang.Throwable -> L8be
            int r1 = defpackage.gn.b(r2, r1)     // Catch: java.lang.Throwable -> L8be
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L8be
            goto L644
        L716:
            r1 = r6
            goto L709
        L718:
            r0 = 4630812834192328072(0x4043f3bcd35a8588, double:39.9042)
            goto L64e
        L71f:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L671
        L725:
            r1 = move-exception
            gn r3 = defpackage.gn.a     // Catch: java.lang.Throwable -> L8bb
            java.lang.Integer r1 = defpackage.b50.R(r0)     // Catch: java.lang.Throwable -> L8bb
            if (r1 == 0) goto L73e
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L8bb
        L732:
            r3.getClass()     // Catch: java.lang.Throwable -> L8bb
            int r1 = defpackage.gn.b(r2, r1)     // Catch: java.lang.Throwable -> L8bb
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L8bb
            goto L6c6
        L73e:
            r1 = r6
            goto L732
        L740:
            r0 = 4637891859487856892(0x405d1a12d77318fc, double:116.4074)
            goto L6d0
        L746:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L6f3
        L74b:
            java.lang.String r0 = "Rg==\n"
            java.lang.String r1 = "Nh8XuJCPPAE=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r14)
            gn r1 = defpackage.gn.a
            java.lang.String r0 = "Ud1p1g7N3ABl1H/qAtbWBFQ=\n"
            java.lang.String r2 = "OrgQiWOiv2s=\n"
            boolean r0 = defpackage.z30.q(r0, r2, r1)
            if (r0 == 0) goto L27
            java.lang.reflect.Member r0 = r14.method
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "tAKhYoipcVimA7A=\n"
            java.lang.String r3 = "02fVLundGCw=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            boolean r0 = defpackage.ip.i(r0, r2)
            if (r0 == 0) goto L7ae
            java.lang.String r0 = "zuhcYH9iXjn64URL\n"
            java.lang.String r2 = "pY0lPxINPVI=\n"
            java.lang.String r2 = defpackage.u40.a(r0, r2)
            java.lang.String r0 = "8aw7nIjm8w==\n"
            java.lang.String r3 = "wpUVpbjSwU4=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r3)
            java.lang.String r3 = "3f5Z\n"
            java.lang.String r4 = "tpsgeLwwj7M=\n"
            java.lang.String r5 = "lNdk\n"
            java.lang.String r7 = "8LICxVL6724=\n"
            java.lang.String r3 = defpackage.z30.k(r3, r4, r2, r5, r7)
            defpackage.ip.o(r3, r0)
            r1.getClass()     // Catch: java.lang.Throwable -> L7fe
            java.lang.String r0 = defpackage.gn.d(r2, r0)     // Catch: java.lang.Throwable -> L7fe
        L79c:
            java.lang.Double r0 = defpackage.a50.A(r0)
            if (r0 != 0) goto L7ab
            r0 = 4630812834192328072(0x4043f3bcd35a8588, double:39.9042)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L7ab:
            r14.setResult(r0)
        L7ae:
            java.lang.reflect.Member r0 = r14.method
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Nbo94AzQBt0mqi3J\n"
            java.lang.String r2 = "Ut9JrGO+YbQ=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            boolean r0 = defpackage.ip.i(r0, r1)
            if (r0 == 0) goto L27
            java.lang.String r0 = "O4nJ8xhCY4YPgN7L\n"
            java.lang.String r1 = "UOywrHUtAO0=\n"
            java.lang.String r1 = defpackage.u40.a(r0, r1)
            java.lang.String r0 = "+rryrQDkJQ0=\n"
            java.lang.String r2 = "y4vEgzTUEjk=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)
            java.lang.String r2 = "3f5Z\n"
            java.lang.String r3 = "tpsgeLwwj7M=\n"
            java.lang.String r4 = "lNdk\n"
            java.lang.String r5 = "8LICxVL6724=\n"
            java.lang.String r2 = defpackage.z30.k(r2, r3, r1, r4, r5)
            defpackage.ip.o(r2, r0)
            gn r2 = defpackage.gn.a     // Catch: java.lang.Throwable -> L819
            r2.getClass()     // Catch: java.lang.Throwable -> L819
            java.lang.String r0 = defpackage.gn.d(r1, r0)     // Catch: java.lang.Throwable -> L819
        L7ea:
            java.lang.Double r0 = defpackage.a50.A(r0)
            if (r0 != 0) goto L7f9
            r0 = 4637891859487856892(0x405d1a12d77318fc, double:116.4074)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L7f9:
            r14.setResult(r0)
            goto L27
        L7fe:
            r1 = move-exception
            gn r3 = defpackage.gn.a     // Catch: java.lang.Throwable -> L8b8
            java.lang.Integer r1 = defpackage.b50.R(r0)     // Catch: java.lang.Throwable -> L8b8
            if (r1 == 0) goto L817
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L8b8
        L80b:
            r3.getClass()     // Catch: java.lang.Throwable -> L8b8
            int r1 = defpackage.gn.b(r2, r1)     // Catch: java.lang.Throwable -> L8b8
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L8b8
            goto L79c
        L817:
            r1 = r6
            goto L80b
        L819:
            r2 = move-exception
            gn r2 = defpackage.gn.a     // Catch: java.lang.Throwable -> L8b5
            java.lang.Integer r3 = defpackage.b50.R(r0)     // Catch: java.lang.Throwable -> L8b5
            if (r3 == 0) goto L826
            int r6 = r3.intValue()     // Catch: java.lang.Throwable -> L8b5
        L826:
            r2.getClass()     // Catch: java.lang.Throwable -> L8b5
            int r1 = defpackage.gn.b(r1, r6)     // Catch: java.lang.Throwable -> L8b5
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L8b5
            goto L7ea
        L832:
            java.lang.String r0 = "6A==\n"
            java.lang.String r1 = "mNsSAod3j84=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r14)
            java.lang.String r0 = "gAY704Bws0u0Dy3vjGu5T4U=\n"
            java.lang.String r1 = "62NCjO0f0CA=\n"
            gn r2 = defpackage.gn.a
            boolean r0 = defpackage.z30.q(r0, r1, r2)
            if (r0 == 0) goto L27
            java.lang.Object r0 = r14.getResult()
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L8ab
            java.util.List r0 = (java.util.List) r0
        L853:
            if (r0 == 0) goto L27
            java.util.Iterator r2 = r0.iterator()
            java.lang.String r0 = "RgdFFkgMuzYHXQ5KAA==\n"
            java.lang.String r1 = "L3MgZCl41EQ=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.n(r0, r2)
        L864:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r4 = r2.next()
            if (r4 == 0) goto L864
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L8a9
            java.lang.reflect.Method[] r5 = r0.getMethods()     // Catch: java.lang.Throwable -> L8a9
            java.lang.String r0 = "Hg3T3cOULCMdG4++iM5t\n"
            java.lang.String r1 = "eWinkKbgREw=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)     // Catch: java.lang.Throwable -> L8a9
            defpackage.ip.n(r0, r5)     // Catch: java.lang.Throwable -> L8a9
            int r7 = r5.length     // Catch: java.lang.Throwable -> L8a9
            r1 = r6
        L885:
            if (r1 >= r7) goto L8b3
            r0 = r5[r1]     // Catch: java.lang.Throwable -> L8a9
            java.lang.String r8 = r0.getName()     // Catch: java.lang.Throwable -> L8a9
            java.lang.String r9 = "AesgM7GMCGwG6yYEsA==\n"
            java.lang.String r10 = "co5UYdTrYR8=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r10)     // Catch: java.lang.Throwable -> L8a9
            boolean r8 = defpackage.ip.i(r8, r9)     // Catch: java.lang.Throwable -> L8a9
            if (r8 == 0) goto L8ad
        L89b:
            if (r0 == 0) goto L864
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L8a9
            r5 = 0
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L8a9
            r1[r5] = r7     // Catch: java.lang.Throwable -> L8a9
            r0.invoke(r4, r1)     // Catch: java.lang.Throwable -> L8a9
            goto L864
        L8a9:
            r0 = move-exception
            goto L864
        L8ab:
            r0 = r3
            goto L853
        L8ad:
            int r0 = 0 - r1
            int r0 = 1 - r0
            r1 = r0
            goto L885
        L8b3:
            r0 = r3
            goto L89b
        L8b5:
            r1 = move-exception
            goto L7ea
        L8b8:
            r1 = move-exception
            goto L79c
        L8bb:
            r1 = move-exception
            goto L6c6
        L8be:
            r1 = move-exception
            goto L644
        L8c1:
            r0 = r3
            goto L32b
        L8c4:
            r1 = r0
            goto L321
        L8c7:
            r0 = r3
            goto L187
        L8ca:
            r1 = r0
            goto L17d
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r51) {
            r50 = this;
            r11 = 0
            r10 = 0
            r12 = 0
            r34 = 0
            r37 = 0
            r33 = 0
            r20 = 0
            r19 = 0
            r8 = 0
            r38 = 0
            r40 = 0
            r48 = 0
            r22 = 0
            r13 = 0
            r4 = 0
            r36 = 0
            r26 = 0
            r32 = 0
            r45 = 0
            r44 = 0
            r7 = 0
            r25 = 0
            r24 = 0
            r16 = 0
            r14 = 0
            r42 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r18 = 0
            r46 = 0
            r9 = 0
            r5 = 0
            r35 = 0
            r21 = 0
            r39 = 0
            r6 = 0
            java.lang.String r30 = "ۡۡۢ"
            int r41 = androidx.constraintlayout.widget.C0020.m80(r30)
            r30 = r4
            r31 = r13
        L4a:
            switch(r41) {
                case 56288: goto L4e;
                case 56322: goto L4eb;
                case 56352: goto L5d6;
                case 56384: goto L69b;
                case 56389: goto L470;
                case 56444: goto L73f;
                case 56449: goto L7f7;
                case 56450: goto L9a6;
                case 56483: goto L3ca;
                case 56541: goto L88b;
                case 1746721: goto Lbd;
                case 1746750: goto L8c2;
                case 1746756: goto L39c;
                case 1746782: goto L862;
                case 1746787: goto L57a;
                case 1746813: goto L17d;
                case 1746814: goto L88b;
                case 1746847: goto L2f4;
                case 1746907: goto L1dd;
                case 1746913: goto L906;
                case 1747653: goto L71e;
                case 1747654: goto L493;
                case 1747710: goto L563;
                case 1747715: goto L563;
                case 1747749: goto L115;
                case 1747750: goto L38f;
                case 1747834: goto Lf5;
                case 1747843: goto L3ce;
                case 1747935: goto L4ce;
                case 1748617: goto La7b;
                case 1748674: goto L85b;
                case 1748679: goto L18c;
                case 1748767: goto L9d6;
                case 1748773: goto L9d1;
                case 1748832: goto L359;
                case 1748833: goto L540;
                case 1748834: goto L7c6;
                case 1748835: goto L3f2;
                case 1748863: goto L40e;
                case 1749577: goto Lb1;
                case 1749578: goto L7dd;
                case 1749606: goto L84;
                case 1749638: goto L51d;
                case 1749664: goto L62;
                case 1749668: goto L436;
                case 1749672: goto L2e7;
                case 1749700: goto L9ff;
                case 1749729: goto L71e;
                case 1749732: goto L271;
                case 1749734: goto L5e0;
                case 1749756: goto L531;
                case 1749788: goto La52;
                case 1749794: goto L1aa;
                case 1750566: goto L88b;
                case 1750663: goto L341;
                case 1750688: goto L959;
                case 1750725: goto L245;
                case 1750753: goto L3b2;
                case 1750813: goto L2ab;
                case 1750814: goto La3b;
                case 1750816: goto L982;
                case 1750818: goto L7c6;
                case 1751530: goto Laad;
                case 1751531: goto L67a;
                case 1751587: goto L4eb;
                case 1751618: goto L88b;
                case 1751656: goto L7ea;
                case 1751711: goto L762;
                case 1751715: goto L213;
                case 1751716: goto L58e;
                case 1751717: goto L290;
                case 1751742: goto L9b5;
                case 1751745: goto L837;
                case 1752461: goto L38f;
                case 1752491: goto L9b5;
                case 1752493: goto L1dd;
                case 1752522: goto L4f8;
                case 1752639: goto L290;
                case 1752640: goto L8a9;
                case 1752645: goto L86f;
                case 1752670: goto L7ea;
                case 1752740: goto L5ac;
                case 1753481: goto L61a;
                case 1753516: goto L1f3;
                case 1753541: goto L65a;
                case 1753542: goto L1cb;
                case 1753609: goto L782;
                case 1753640: goto L2b5;
                case 1753668: goto La61;
                case 1753671: goto L63a;
                case 1754378: goto Lb1;
                case 1754382: goto L87c;
                case 1754408: goto L700;
                case 1754440: goto Laad;
                case 1754600: goto L8ec;
                case 1754659: goto L314;
                case 1754663: goto L9db;
                case 1755339: goto L6cb;
                case 1755400: goto Laad;
                case 1755405: goto La0e;
                case 1755431: goto L9c2;
                case 1755433: goto Lc6;
                case 1755466: goto L516;
                case 1755491: goto L7b2;
                case 1755496: goto La88;
                case 1755525: goto L402;
                case 1755527: goto Le2;
                case 1755553: goto Laad;
                case 1755562: goto L5fa;
                default: goto L4d;
            }
        L4d:
            goto L4a
        L4e:
            if (r21 != 0) goto L63a
            int r4 = androidx.fragment.app.C0027.f27
            int r13 = android.support.v4.graphics.drawable.C0005.f5
            int r13 = r13 * 9153
            int r4 = r4 % r13
            if (r4 < 0) goto La77
        L59:
            java.lang.String r4 = "ۨۦۨ"
            int r4 = kotlinx.coroutines.C0070.m281(r4)
            r41 = r4
            goto L4a
        L62:
            int r4 = androidx.core.widget.C0025.f25
            int r13 = com.ljx.wechatmod.auth.C0065.f65
            int r13 = r13 % (-6551)
            int r4 = r4 + r13
            if (r4 < 0) goto L78
            r4 = 60
            com.google.android.material.behavior.C0050.f50 = r4
            java.lang.String r4 = "ۢۡۥ"
            int r4 = androidx.appcompat.widget.C0014.m57(r4)
            r41 = r4
            goto L4a
        L78:
            int r4 = android.support.v4.graphics.drawable.C0005.f5
            int r13 = com.google.android.material.internal.C0061.f61
            r4 = r4 ^ r13
            r13 = 1751182(0x1ab88e, float:2.453929E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L84:
            java.lang.String r4 = "3f5Z\n"
            java.lang.String r13 = "tpsgeLwwj7M=\n"
            java.lang.String r41 = "lNdk\n"
            java.lang.String r47 = "8LICxVL6724=\n"
            r0 = r30
            r1 = r41
            r2 = r47
            java.lang.String r4 = defpackage.z30.k(r4, r13, r0, r1, r2)
            r0 = r36
            defpackage.ip.o(r4, r0)
            int r4 = com.google.android.material.chip.C0056.f56
            if (r4 < 0) goto La8
            java.lang.String r4 = "ۡۦۥ"
            int r4 = com.google.android.material.carousel.C0053.m213(r4)
            r41 = r4
            goto L4a
        La8:
            java.lang.String r4 = "ۧۨۨ"
            int r4 = android.view.C0007.m28(r4)
            r41 = r4
            goto L4a
        Lb1:
            int r4 = com.google.android.material.behavior.C0050.f50
            int r13 = com.google.android.material.chip.C0057.f57
            int r4 = r4 - r13
            r13 = 1746344(0x1aa5a8, float:2.447149E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        Lbd:
            java.lang.String r4 = "ۡۦۧ"
        Lbf:
            int r4 = androidx.lifecycle.C0029.m116(r4)
            r41 = r4
            goto L4a
        Lc6:
            r32.getClass()     // Catch: java.lang.Throwable -> L815
            r0 = r30
            r1 = r44
            int r4 = defpackage.gn.b(r0, r1)     // Catch: java.lang.Throwable -> L815
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L815
            int r4 = androidx.appcompat.widget.C0014.f14
            int r13 = com.google.android.material.theme.C0062.f62
            int r4 = r4 % r13
            r13 = -1748386(0xffffffffffe5525e, float:NaN)
            r4 = r4 ^ r13
            r41 = r4
            goto L4a
        Le2:
            int r4 = android.app.C0002.m10()
            if (r4 > 0) goto Lf2
            java.lang.String r4 = "ۤۥۢ"
        Lea:
            int r4 = android.app.C0003.m13(r4)
            r41 = r4
            goto L4a
        Lf2:
            java.lang.String r4 = "ۡۡۢ"
            goto Lea
        Lf5:
            int r4 = androidx.appcompat.widget.C0014.f14
            int r13 = androidx.core.widget.C0025.f25
            int r13 = r13 / 1243
            r4 = r4 ^ r13
            if (r4 < 0) goto L10b
            androidx.constraintlayout.widget.C0020.m82()
            java.lang.String r4 = "ۣۤۦ"
            int r4 = com.github.megatronking.stringfog.xor.C0046.m186(r4)
            r41 = r4
            goto L4a
        L10b:
            java.lang.String r4 = "ۨۦ۟"
        L10d:
            int r4 = androidx.recyclerview.widget.C0033.m132(r4)
            r41 = r4
            goto L4a
        L115:
            java.lang.String r4 = "qw==\n"
            java.lang.String r13 = "2/WvGUzTdLk=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r13)
            r0 = r51
            defpackage.ip.o(r4, r0)
            java.lang.String r4 = "PFeAgqtxaEgIUIu0oHZ/TTJBig==\n"
            java.lang.String r13 = "VzL53cceCyM=\n"
            gn r41 = defpackage.gn.a
            r0 = r41
            boolean r4 = defpackage.z30.q(r4, r13, r0)
            if (r4 != 0) goto L65a
            int r4 = androidx.recyclerview.widget.C0033.f33
            int r13 = com.google.android.material.carousel.C0054.f54
            int r13 = r13 + 7267
            int r4 = r4 + r13
            if (r4 > 0) goto L147
            r4 = 14
            defpackage.C0071.f71 = r4
            java.lang.String r4 = "۠۟ۥ"
            int r4 = androidx.activity.result.C0009.m38(r4)
            r41 = r4
            goto L4a
        L147:
            int r4 = androidx.emoji2.text.C0026.f26
            int r13 = com.google.android.material.carousel.C0054.f54
            r4 = r4 | r13
            r13 = 1748658(0x1aaeb2, float:2.450392E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L154:
            r4 = move-exception
            int r4 = androidx.viewpager2.adapter.C0043.f43
            int r13 = com.google.android.material.carousel.C0054.f54
            int r13 = r13 / 6991
            int r4 = r4 + r13
            if (r4 > 0) goto L16e
            r4 = 50
            com.google.android.material.bottomsheet.C0051.f51 = r4
            java.lang.String r4 = "ۥۨ"
            int r4 = com.google.android.material.chip.C0057.m229(r4)
            r39 = r34
            r41 = r4
            goto L4a
        L16e:
            int r4 = androidx.coordinatorlayout.widget.C0022.f22
            int r13 = androidx.recyclerview.widget.C0032.f32
            r4 = r4 ^ r13
            r13 = 1751801(0x1abaf9, float:2.454796E-39)
            int r4 = r4 + r13
            r39 = r34
            r41 = r4
            goto L4a
        L17d:
            int r4 = com.google.android.material.chip.C0056.f56
            int r13 = androidx.profileinstaller.C0030.f30
            r4 = r4 ^ r13
            r13 = 1751202(0x1ab8a2, float:2.453957E-39)
            int r4 = r4 + r13
            r25 = r6
            r41 = r4
            goto L4a
        L18c:
            int r4 = androidx.constraintlayout.widget.C0019.f19
            if (r4 > 0) goto L19e
            r4 = 14
            defpackage.C0072.f72 = r4
            java.lang.String r4 = "ۤۡۡ"
        L196:
            int r4 = com.google.android.material.chip.C0057.m229(r4)
            r41 = r4
            goto L4a
        L19e:
            java.lang.String r13 = "ۡۦۦ"
            r4 = r10
        L1a1:
            int r13 = androidx.coordinatorlayout.widget.C0022.m90(r13)
            r10 = r4
            r41 = r13
            goto L4a
        L1aa:
            int r4 = android.app.C0001.m4()
            if (r4 > 0) goto L1bf
            androidx.activity.C0010.m40()
            java.lang.String r4 = "ۡۦۦ"
            int r4 = androidx.core.widget.C0025.m102(r4)
            r41 = r4
            r44 = r45
            goto L4a
        L1bf:
            java.lang.String r4 = "ۣۨۢ"
            int r4 = androidx.activity.result.C0008.m35(r4)
            r41 = r4
            r44 = r45
            goto L4a
        L1cb:
            int r4 = androidx.coordinatorlayout.widget.C0021.f21
            if (r4 < 0) goto L1d3
            java.lang.String r4 = "ۡۤۡ"
            goto Lbf
        L1d3:
            java.lang.String r4 = "ۡۧۥ"
        L1d5:
            int r4 = com.google.android.material.chip.C0057.m229(r4)
            r41 = r4
            goto L4a
        L1dd:
            int r4 = com.google.android.material.theme.C0063.m253()
            if (r4 > 0) goto L1f0
            defpackage.C0071.m284()
            java.lang.String r4 = "ۣۢ۠"
        L1e8:
            int r4 = com.github.megatronking.stringfog.xor.C0046.m186(r4)
            r41 = r4
            goto L4a
        L1f0:
            java.lang.String r4 = "ۣۨۢ"
            goto L1e8
        L1f3:
            int r4 = androidx.fragment.app.C0027.m111()
            if (r4 > 0) goto L206
            androidx.appcompat.widget.C0013.m52()
            java.lang.String r4 = "۠ۨۧ"
            int r4 = com.github.megatronking.stringfog.C0048.m193(r4)
            r41 = r4
            goto L4a
        L206:
            int r4 = android.view.C0007.f7
            int r13 = androidx.activity.C0011.f11
            r4 = r4 | r13
            r13 = -1750576(0xffffffffffe549d0, float:NaN)
            r4 = r4 ^ r13
            r41 = r4
            goto L4a
        L213:
            java.lang.String r4 = "nQ==\n"
            java.lang.String r13 = "7T/+s/wSNTA=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r13)
            r0 = r51
            defpackage.ip.o(r4, r0)
            java.lang.String r4 = "QFl5bUyrvz5IV19FXKelOE5L\n"
            java.lang.String r13 = "KzwAMjnF01E=\n"
            gn r41 = defpackage.gn.a
            r0 = r41
            boolean r4 = defpackage.z30.q(r4, r13, r0)
            if (r4 == 0) goto Lf5
            int r4 = com.google.android.material.internal.C0061.f61
            int r13 = android.support.v4.graphics.drawable.C0006.f6
            int r13 = r13 + (-7241)
            int r4 = r4 - r13
            if (r4 > 0) goto L241
            java.lang.String r4 = "ۢ۟ۧ"
            int r4 = android.support.v4.graphics.drawable.C0004.m16(r4)
            r41 = r4
            goto L4a
        L241:
            java.lang.String r4 = "۟ۡۦ"
            goto Lea
        L245:
            r33.getClass()     // Catch: java.lang.Throwable -> L154
            r0 = r19
            int r4 = defpackage.gn.b(r12, r0)     // Catch: java.lang.Throwable -> L154
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L154
            int r8 = androidx.viewpager2.adapter.C0043.f43
            int r13 = androidx.versionedparcelable.C0038.f38
            int r13 = r13 * (-8625)
            r8 = r8 | r13
            if (r8 > 0) goto L266
        L25b:
            java.lang.String r8 = "ۤ۠ۦ"
            int r13 = androidx.versionedparcelable.C0039.m159(r8)
            r8 = r4
            r41 = r13
            goto L4a
        L266:
            r8 = r4
        L267:
            java.lang.String r4 = "ۣۢۥ"
            int r4 = androidx.core.widget.C0025.m102(r4)
            r41 = r4
            goto L4a
        L271:
            int r4 = kotlinx.coroutines.C0070.f70
            if (r4 > 0) goto L281
            java.lang.String r4 = "ۡۤۨ"
            int r4 = com.google.android.material.behavior.C0050.m203(r4)
            r41 = r4
            r46 = r29
            goto L4a
        L281:
            int r4 = androidx.appcompat.widget.C0016.f16
            int r13 = com.google.android.material.datepicker.C0059.f59
            int r4 = r4 - r13
            r13 = 1748595(0x1aae73, float:2.450303E-39)
            r4 = r4 ^ r13
            r41 = r4
            r46 = r29
            goto L4a
        L290:
            int r4 = com.google.android.material.carousel.C0053.f53
            if (r4 > 0) goto L29e
            java.lang.String r4 = "ۣ۟ۤ"
            int r4 = android.app.C0002.m8(r4)
            r41 = r4
            goto L4a
        L29e:
            int r4 = com.google.android.material.bottomsheet.C0051.f51
            int r13 = androidx.versionedparcelable.C0041.f41
            int r4 = r4 / r13
            r13 = 1750725(0x1ab6c5, float:2.453288E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L2ab:
            java.lang.String r4 = "ۤ۠ۦ"
        L2ad:
            int r4 = androidx.coordinatorlayout.widget.C0021.m86(r4)
            r41 = r4
            goto L4a
        L2b5:
            int r4 = androidx.fragment.app.C0027.m111()
            if (r4 > 0) goto L2c5
            java.lang.String r4 = "ۣۡ۟"
        L2bd:
            int r4 = com.google.android.material.chip.C0057.m229(r4)
            r41 = r4
            goto L4a
        L2c5:
            java.lang.String r4 = "۟ۤۤ"
            goto Lbf
        L2c9:
            r4 = move-exception
            gn r4 = defpackage.gn.a     // Catch: java.lang.Throwable -> L815
            java.lang.Integer r13 = defpackage.b50.R(r36)     // Catch: java.lang.Throwable -> L815
            if (r13 == 0) goto L8ec
            int r44 = r13.intValue()     // Catch: java.lang.Throwable -> L815
            int r13 = android.support.v4.graphics.drawable.C0004.f4
            int r32 = androidx.appcompat.widget.C0013.f13
            int r13 = r13 % r32
            r32 = 1752687(0x1abe6f, float:2.456038E-39)
            int r13 = r13 + r32
            r32 = r4
            r41 = r13
            goto L4a
        L2e7:
            int r4 = androidx.versionedparcelable.C0038.f38
            int r13 = kotlinx.coroutines.C0070.f70
            r4 = r4 | r13
            r13 = -1749917(0xffffffffffe54c63, float:NaN)
            r4 = r4 ^ r13
            r41 = r4
            goto L4a
        L2f4:
            r48 = 4630812834192328072(0x4043f3bcd35a8588, double:39.9042)
            int r4 = com.google.android.material.floatingactionbutton.C0060.f60
            if (r4 > 0) goto L307
            java.lang.String r4 = "ۡۡۢ"
            int r4 = android.app.C0000.m2(r4)
            r41 = r4
            goto L4a
        L307:
            int r4 = android.support.v4.graphics.drawable.C0006.f6
            int r13 = androidx.appcompat.widget.C0016.f16
            int r4 = r4 % r13
            r13 = 1751307(0x1ab90b, float:2.454104E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L314:
            int r4 = androidx.constraintlayout.helper.widget.C0017.m71()
            if (r4 > 0) goto L2ab
            java.lang.String r4 = "5iWRpnosLmKbSXR8DX"
            java.lang.String r4 = android.app.C0002.m11(r4)
            long r42 = java.lang.Long.parseLong(r4)
            int r4 = com.google.android.material.theme.C0063.f63
            int r13 = androidx.constraintlayout.widget.C0018.f18
            int r13 = r13 + 9950
            int r4 = r4 + r13
            if (r4 > 0) goto L337
            java.lang.String r4 = "ۤۧۡ"
            int r4 = com.google.android.material.internal.C0061.m246(r4)
            r41 = r4
            goto L4a
        L337:
            java.lang.String r4 = "ۤۦۡ"
            int r4 = kotlinx.coroutines.C0069.m277(r4)
            r41 = r4
            goto L4a
        L341:
            r4 = 0
            int r9 = androidx.coordinatorlayout.widget.C0021.m84()
            if (r9 > 0) goto L34b
            r9 = r4
            goto L267
        L34b:
            int r9 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r13 = androidx.core.content.C0023.f23
            r9 = r9 | r13
            r13 = 1747902(0x1aabbe, float:2.449332E-39)
            int r13 = r13 + r9
            r9 = r4
            r41 = r13
            goto L4a
        L359:
            java.lang.String r4 = "ouI/qDRqgQ==\n"
            java.lang.String r13 = "kdsRkQRes5c=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r13)
            int r13 = androidx.versionedparcelable.C0039.f39
            int r34 = com.google.android.material.carousel.C0054.f54
            r0 = r34
            r0 = r0 ^ (-330(0xfffffffffffffeb6, float:NaN))
            r34 = r0
            r13 = r13 | r34
            if (r13 < 0) goto L37e
            androidx.appcompat.widget.C0014.m58()
            java.lang.String r13 = "ۣۤۡ"
            int r13 = androidx.constraintlayout.widget.C0019.m79(r13)
            r34 = r4
            r41 = r13
            goto L4a
        L37e:
            int r13 = kotlinx.coroutines.C0069.f69
            int r34 = com.google.android.material.internal.C0061.f61
            int r13 = r13 / r34
            r34 = 1752740(0x1abea4, float:2.456112E-39)
            int r13 = r13 + r34
            r34 = r4
            r41 = r13
            goto L4a
        L38f:
            int r4 = com.google.android.material.theme.C0064.f64
            int r13 = androidx.startup.C0037.f37
            int r4 = r4 - r13
            r13 = 1754670(0x1ac62e, float:2.458816E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L39c:
            r0 = r51
            java.lang.Object[] r4 = r0.args
            r13 = 0
            java.lang.Boolean r41 = java.lang.Boolean.TRUE
            r4[r13] = r41
            int r4 = com.google.android.material.theme.C0062.f62
            int r13 = androidx.activity.result.C0009.f9
            int r4 = r4 * r13
            r13 = 936238(0xe492e, float:1.311949E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L3b2:
            int r4 = android.support.v4.graphics.drawable.C0005.m20()
            if (r4 < 0) goto L3bd
            java.lang.String r13 = "ۣۡۧ"
            r4 = r10
            goto L1a1
        L3bd:
            int r4 = com.google.android.material.carousel.C0054.f54
            int r13 = com.google.android.material.internal.C0061.f61
            int r4 = r4 + r13
            r13 = 55231(0xd7bf, float:7.7395E-41)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L3ca:
            java.lang.String r4 = "ۧۨۨ"
            goto L1d5
        L3ce:
            int r4 = defpackage.C0073.f73
            int r13 = android.view.C0007.f7
            int r13 = r13 + (-3754)
            r4 = r4 | r13
            if (r4 < 0) goto L3e5
            r4 = 83
            androidx.appcompat.widget.C0013.f13 = r4
            java.lang.String r4 = "ۨۡۧ"
            int r4 = androidx.core.content.C0023.m95(r4)
            r41 = r4
            goto L4a
        L3e5:
            int r4 = androidx.constraintlayout.widget.C0018.f18
            int r13 = androidx.savedstate.C0036.f36
            int r4 = r4 % r13
            r13 = 1748910(0x1aafae, float:2.450745E-39)
            r4 = r4 ^ r13
            r41 = r4
            goto L4a
        L3f2:
            r11.getClass()     // Catch: java.lang.Throwable -> La1d
            int r4 = androidx.core.content.C0024.f24
            int r13 = androidx.appcompat.widget.C0016.f16
            int r4 = r4 / r13
            r13 = 1750814(0x1ab71e, float:2.453413E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L402:
            java.lang.Double r4 = defpackage.a50.A(r24)
            if (r4 == 0) goto L2e7
            double r14 = r4.doubleValue()
            goto L59
        L40e:
            int r4 = androidx.core.widget.C0025.f25
            int r13 = androidx.startup.C0037.f37
            int r13 = r13 / 4822
            r4 = r4 | r13
            if (r4 < 0) goto L427
            r4 = 21
            androidx.savedstate.C0035.f35 = r4
            java.lang.String r4 = "ۡۦۨ"
            int r4 = androidx.core.widget.C0025.m102(r4)
            r40 = r37
            r41 = r4
            goto L4a
        L427:
            int r4 = androidx.savedstate.C0034.f34
            int r13 = androidx.coordinatorlayout.widget.C0021.f21
            int r4 = r4 % r13
            r13 = -1749621(0xffffffffffe54d8b, float:NaN)
            r4 = r4 ^ r13
            r40 = r37
            r41 = r4
            goto L4a
        L436:
            r0 = r51
            java.lang.reflect.Member r4 = r0.method
            java.lang.String r4 = r4.getName()
            java.lang.String r13 = "bZIC7gMSvrtqghLH\n"
            java.lang.String r41 = "Hvd2omx82dI=\n"
            r0 = r41
            java.lang.String r13 = defpackage.u40.a(r13, r0)
            boolean r4 = defpackage.ip.i(r4, r13)
            if (r4 == 0) goto L5d6
            r0 = r51
            java.lang.Object[] r13 = r0.args
            java.lang.String r4 = "ry6j8VPAIJCbJ7TJ\n"
            java.lang.String r30 = "xEvarj6vQ/s=\n"
            r0 = r30
            java.lang.String r4 = defpackage.u40.a(r4, r0)
            java.lang.String r30 = "3Wt/mMbrLYE=\n"
            java.lang.String r31 = "7FpJtvLbGrU=\n"
            java.lang.String r36 = defpackage.u40.a(r30, r31)
            java.lang.String r30 = "ۢ۠ۤ"
            int r41 = com.github.megatronking.stringfog.C0047.m189(r30)
            r30 = r4
            r31 = r13
            goto L4a
        L470:
            r4 = r18
        L472:
            int r13 = androidx.profileinstaller.C0031.f31
            if (r13 < 0) goto L482
            java.lang.String r13 = "ۢۢۡ"
            int r13 = androidx.constraintlayout.widget.C0019.m79(r13)
            r18 = r4
            r41 = r13
            goto L4a
        L482:
            int r13 = android.app.C0002.f2
            int r18 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r13 = r13 - r18
            r18 = 1750814(0x1ab71e, float:2.453413E-39)
            r13 = r13 ^ r18
            r18 = r4
            r41 = r13
            goto L4a
        L493:
            r4 = 0
            r0 = r46
            r1 = r28
            if (r0 >= r1) goto L472
            r13 = r27[r46]
            boolean r0 = r13 instanceof android.view.WindowManager.LayoutParams
            r18 = r0
            if (r18 == 0) goto L69d
            int r5 = androidx.recyclerview.widget.C0033.f33
            int r18 = androidx.appcompat.widget.C0016.f16
            r0 = r18
            r0 = r0 ^ 717(0x2cd, float:1.005E-42)
            r18 = r0
            r5 = r5 ^ r18
            if (r5 > 0) goto L4be
            androidx.savedstate.C0035.m143()
            java.lang.String r5 = "ۤۢۡ"
            int r41 = com.google.android.material.chip.C0056.m226(r5)
            r18 = r4
            r5 = r13
            goto L4a
        L4be:
            int r5 = com.google.android.material.carousel.C0054.f54
            int r18 = com.google.android.material.appbar.C0049.f49
            int r5 = r5 - r18
            r18 = 1752796(0x1abedc, float:2.45619E-39)
            int r41 = r5 + r18
            r18 = r4
            r5 = r13
            goto L4a
        L4ce:
            int r4 = androidx.viewpager2.adapter.C0043.f43
            int r13 = com.github.megatronking.stringfog.xor.C0046.f46
            int r13 = r13 / 4519
            int r4 = r4 + r13
            if (r4 > 0) goto L4e1
            java.lang.String r4 = "ۣۧۧ"
            int r4 = com.google.android.material.carousel.C0053.m213(r4)
            r41 = r4
            goto L4a
        L4e1:
            java.lang.String r4 = "ۤۦۥ"
            int r4 = android.app.C0003.m13(r4)
            r41 = r4
            goto L4a
        L4eb:
            int r4 = android.view.C0007.f7
            int r13 = androidx.appcompat.widget.C0013.f13
            r4 = r4 ^ r13
            r13 = 1753661(0x1ac23d, float:2.457402E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L4f8:
            int r4 = com.google.android.material.chip.C0056.f56
            int r13 = com.github.megatronking.stringfog.xor.C0046.f46
            r13 = r13 ^ (-2926(0xfffffffffffff492, float:NaN))
            r4 = r4 ^ r13
            if (r4 > 0) goto L509
            r4 = 67
            androidx.viewpager2.adapter.C0043.f43 = r4
            java.lang.String r4 = "ۣۧۥ"
            goto L1d5
        L509:
            int r4 = android.app.C0003.f3
            int r13 = com.google.android.material.bottomsheet.C0051.f51
            int r4 = r4 * r13
            r13 = 1895416(0x1cebf8, float:2.656044E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L516:
            java.lang.String r13 = "ۢۡۥ"
            r4 = r10
            r14 = r16
            goto L1a1
        L51d:
            r4 = 0
            java.lang.Double r13 = java.lang.Double.valueOf(r14)
            r31[r4] = r13
            int r4 = androidx.savedstate.C0034.f34
            int r13 = androidx.core.content.C0023.f23
            r4 = r4 | r13
            r13 = 1755068(0x1ac7bc, float:2.459374E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L531:
            r16 = 4637891859487856892(0x405d1a12d77318fc, double:116.4074)
            java.lang.String r4 = "ۣۨۥ"
        L538:
            int r4 = androidx.activity.C0010.m43(r4)
            r41 = r4
            goto L4a
        L540:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = r21
            r0.screenBrightness = r4
            int r4 = com.google.android.material.floatingactionbutton.C0060.m240()
            if (r4 < 0) goto L556
            java.lang.String r4 = "ۨۥۢ"
            int r4 = androidx.legacy.content.C0028.m114(r4)
            r41 = r4
            goto L4a
        L556:
            int r4 = android.app.C0001.f1
            int r13 = androidx.core.widget.C0025.f25
            r4 = r4 | r13
            r13 = -1754489(0xffffffffffe53a87, float:NaN)
            r4 = r4 ^ r13
            r41 = r4
            goto L4a
        L563:
            int r4 = com.google.android.material.internal.C0061.m244()
            if (r4 > 0) goto L576
            com.google.android.material.chip.C0056.m224()
            java.lang.String r4 = "۠ۤۨ"
        L56e:
            int r4 = defpackage.C0072.m288(r4)
            r41 = r4
            goto L4a
        L576:
            java.lang.String r4 = "ۨۤۤ"
            goto L2bd
        L57a:
            int r4 = androidx.profileinstaller.C0031.f31
            int r13 = com.github.megatronking.stringfog.xor.C0046.f46
            r13 = r13 ^ (-232(0xffffffffffffff18, float:NaN))
            int r4 = r4 - r13
            if (r4 > 0) goto L58a
            androidx.fragment.app.C0027.m111()
            java.lang.String r4 = "ۧۨۢ"
            goto L2ad
        L58a:
            java.lang.String r4 = "ۢۢۤ"
            goto L1d5
        L58e:
            int r4 = androidx.savedstate.C0036.f36
            int r13 = com.google.android.material.datepicker.C0058.f58
            r13 = r13 ^ 4657(0x1231, float:6.526E-42)
            int r4 = r4 - r13
            if (r4 < 0) goto L59f
            r4 = 82
            androidx.appcompat.widget.C0014.f14 = r4
            java.lang.String r4 = "ۦۣۦ"
            goto L10d
        L59f:
            int r4 = androidx.constraintlayout.widget.C0019.f19
            int r13 = com.github.megatronking.stringfog.C0048.f48
            int r4 = r4 % r13
            r13 = 1753575(0x1ac1e7, float:2.457282E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L5ac:
            java.lang.String r4 = "3f5Z\n"
            java.lang.String r13 = "tpsgeLwwj7M=\n"
            java.lang.String r41 = "lNdk\n"
            java.lang.String r47 = "8LICxVL6724=\n"
            r0 = r41
            r1 = r47
            java.lang.String r4 = defpackage.z30.k(r4, r13, r12, r0, r1)
            r0 = r34
            defpackage.ip.o(r4, r0)
            int r4 = androidx.core.content.C0023.f23
            if (r4 > 0) goto L5d2
            androidx.coordinatorlayout.widget.C0021.m84()
            java.lang.String r4 = "ۨۥۤ"
            int r4 = com.google.android.material.datepicker.C0058.m234(r4)
            r41 = r4
            goto L4a
        L5d2:
            java.lang.String r4 = "ۡۦۨ"
            goto L196
        L5d6:
            java.lang.String r4 = "ۧۨۤ"
        L5d8:
            int r4 = android.app.C0001.m5(r4)
            r41 = r4
            goto L4a
        L5e0:
            super.beforeHookedMethod(r51)
            int r4 = androidx.core.content.C0024.f24
            int r13 = com.github.megatronking.stringfog.C0047.f47
            int r13 = r13 * 564
            int r4 = r4 / r13
            if (r4 == 0) goto L5f6
            java.lang.String r4 = "ۤۧۤ"
        L5ee:
            int r4 = androidx.recyclerview.widget.C0032.m130(r4)
            r41 = r4
            goto L4a
        L5f6:
            java.lang.String r4 = "ۨۡۡ"
            goto L10d
        L5fa:
            int r4 = com.google.android.material.theme.C0064.f64
            int r13 = androidx.fragment.app.C0027.f27
            r13 = r13 ^ (-320(0xfffffffffffffec0, float:NaN))
            int r4 = r4 * r13
            if (r4 > 0) goto L60d
            java.lang.String r4 = "ۣۦۤ"
            int r4 = android.app.C0002.m8(r4)
            r41 = r4
            goto L4a
        L60d:
            int r4 = com.ljx.wechatmod.ui.C0067.f67
            int r13 = android.support.v4.graphics.drawable.C0005.f5
            int r4 = r4 + r13
            r13 = 1747699(0x1aaaf3, float:2.449048E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L61a:
            int r4 = androidx.coordinatorlayout.widget.C0022.m88()
            if (r4 > 0) goto L62d
            androidx.core.widget.C0025.m103()
            java.lang.String r4 = "۠ۥ۟"
            int r4 = com.ljx.wechatmod.hook.C0066.m264(r4)
            r41 = r4
            goto L4a
        L62d:
            int r4 = androidx.versionedparcelable.C0039.f39
            int r13 = androidx.appcompat.widget.C0016.f16
            int r4 = r4 / r13
            r13 = 1751588(0x1aba24, float:2.454498E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L63a:
            int r4 = androidx.profileinstaller.C0030.m121()
            if (r4 < 0) goto L64d
            androidx.versionedparcelable.C0041.m167()
            java.lang.String r4 = "ۥۣۧ"
            int r4 = com.google.android.material.behavior.C0050.m203(r4)
            r41 = r4
            goto L4a
        L64d:
            int r4 = androidx.lifecycle.C0029.f29
            int r13 = com.google.android.material.behavior.C0050.f50
            int r4 = r4 / r13
            r13 = -1746748(0xffffffffffe558c4, float:NaN)
            r4 = r4 ^ r13
            r41 = r4
            goto L4a
        L65a:
            int r4 = androidx.coordinatorlayout.widget.C0021.m84()
            if (r4 > 0) goto L66d
            androidx.legacy.content.C0028.m112()
            java.lang.String r4 = "ۦۦۥ"
            int r4 = androidx.appcompat.widget.C0015.m60(r4)
            r41 = r4
            goto L4a
        L66d:
            int r4 = androidx.profileinstaller.C0031.f31
            int r13 = com.github.megatronking.stringfog.xor.C0045.f45
            int r4 = r4 + r13
            r13 = 1751091(0x1ab833, float:2.453801E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L67a:
            int r4 = androidx.core.widget.C0025.m103()
            if (r4 < 0) goto L691
            com.google.android.material.appbar.C0049.m199()
            r4 = r19
        L685:
            java.lang.String r13 = "ۣۥۧ"
            r19 = r4
        L689:
            int r4 = com.google.android.material.theme.C0064.m258(r13)
            r41 = r4
            goto L4a
        L691:
            java.lang.String r4 = "ۧۤ"
            int r4 = com.google.android.material.internal.C0061.m246(r4)
            r41 = r4
            goto L4a
        L69b:
            r4 = r18
        L69d:
            int r13 = androidx.emoji2.text.C0026.f26
            int r18 = com.google.android.material.chip.C0057.f57
            r0 = r18
            r0 = r0 ^ (-5926(0xffffffffffffe8da, float:NaN))
            r18 = r0
            int r13 = r13 + r18
            if (r13 > 0) goto L6ba
            androidx.core.content.C0023.m92()
            java.lang.String r13 = "ۤۡۧ"
            int r13 = com.google.android.material.internal.C0061.m246(r13)
            r18 = r4
            r41 = r13
            goto L4a
        L6ba:
            int r13 = com.github.megatronking.stringfog.C0048.f48
            int r18 = androidx.savedstate.C0034.f34
            int r13 = r13 / r18
            r18 = 1755339(0x1ac8cb, float:2.459754E-39)
            int r13 = r13 + r18
            r18 = r4
            r41 = r13
            goto L4a
        L6cb:
            int r4 = androidx.core.content.C0023.f23
            r4 = r4 ^ 614(0x266, float:8.6E-43)
            int r13 = r46 + r4
            int r4 = com.google.android.material.carousel.C0055.f55
            int r41 = defpackage.C0073.f73
            r0 = r41
            int r0 = r0 + (-3197)
            r41 = r0
            int r4 = r4 - r41
            if (r4 > 0) goto L6ef
            r4 = 89
            com.google.android.material.carousel.C0052.f52 = r4
            java.lang.String r4 = "۟ۡ۠"
            int r4 = androidx.coordinatorlayout.widget.C0021.m86(r4)
            r41 = r4
            r46 = r13
            goto L4a
        L6ef:
            int r4 = androidx.core.content.C0024.f24
            int r41 = androidx.constraintlayout.widget.C0020.f20
            int r4 = r4 - r41
            r41 = 1752900(0x1abf44, float:2.456336E-39)
            r4 = r4 ^ r41
            r41 = r4
            r46 = r13
            goto L4a
        L700:
            r4 = r21
        L702:
            int r13 = com.github.megatronking.stringfog.C0047.f47
            if (r13 < 0) goto L712
            java.lang.String r13 = "ۦۢۥ"
            int r13 = android.support.v4.graphics.drawable.C0005.m23(r13)
            r21 = r4
            r41 = r13
            goto L4a
        L712:
            java.lang.String r13 = "۟۟"
            int r13 = androidx.constraintlayout.widget.C0019.m79(r13)
            r21 = r4
            r41 = r13
            goto L4a
        L71e:
            int r4 = com.github.megatronking.stringfog.C0048.m194()
            if (r4 > 0) goto L732
            java.lang.String r4 = "ۧۢۨ"
            r13 = r24
        L728:
            int r4 = android.support.v4.graphics.drawable.C0005.m23(r4)
            r24 = r13
            r41 = r4
            goto L4a
        L732:
            int r4 = androidx.fragment.app.C0027.f27
            int r13 = androidx.coordinatorlayout.widget.C0022.f22
            r4 = r4 | r13
            r13 = 1749919(0x1ab39f, float:2.452159E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L73f:
            int r4 = defpackage.C0073.f73
            int r13 = com.google.android.material.carousel.C0052.f52
            r13 = r13 | (-8585(0xffffffffffffde77, float:NaN))
            int r4 = r4 * r13
            if (r4 < 0) goto L755
            androidx.constraintlayout.helper.widget.C0017.m71()
            java.lang.String r4 = "ۨ۟"
        L74d:
            int r4 = com.github.megatronking.stringfog.annotation.C0044.m176(r4)
            r41 = r4
            goto L4a
        L755:
            int r4 = com.google.android.material.appbar.C0049.f49
            int r13 = androidx.savedstate.C0035.f35
            int r4 = r4 % r13
            r13 = 1747694(0x1aaaee, float:2.449041E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L762:
            java.io.PrintStream r4 = java.lang.System.out
            r0 = r42
            r4.println(r0)
            int r4 = androidx.savedstate.C0034.f34
            int r13 = android.app.C0003.f3
            r13 = r13 ^ 7650(0x1de2, float:1.072E-41)
            r4 = r4 ^ r13
            if (r4 < 0) goto L77f
            androidx.versionedparcelable.C0041.m167()
            java.lang.String r4 = "ۢۤۨ"
            int r4 = defpackage.C0073.m292(r4)
            r41 = r4
            goto L4a
        L77f:
            r4 = r8
            goto L25b
        L782:
            boolean r4 = r5 instanceof android.view.WindowManager.LayoutParams
            if (r4 == 0) goto Laae
            r4 = r5
            android.view.WindowManager$LayoutParams r4 = (android.view.WindowManager.LayoutParams) r4
            int r13 = com.google.android.material.theme.C0064.f64
            if (r13 > 0) goto L79f
            r13 = 82
            com.google.android.material.bottomsheet.C0051.f51 = r13
            java.lang.String r13 = "ۣ۟ۢ"
            int r13 = android.view.C0007.m28(r13)
            r35 = r4
            r21 = r18
            r41 = r13
            goto L4a
        L79f:
            int r13 = com.google.android.material.carousel.C0053.f53
            int r21 = com.ljx.wechatmod.hook.C0066.f66
            int r13 = r13 / r21
            r21 = 1749788(0x1ab31c, float:2.451975E-39)
            int r13 = r13 + r21
            r35 = r4
            r21 = r18
            r41 = r13
            goto L4a
        L7b2:
            r0 = r30
            r1 = r36
            java.lang.String r4 = defpackage.gn.d(r0, r1)     // Catch: java.lang.Throwable -> L2c9
        L7ba:
            java.lang.String r13 = "ۦۧۥ"
            int r13 = com.google.android.material.carousel.C0053.m213(r13)
            r26 = r4
            r41 = r13
            goto L4a
        L7c6:
            int r4 = com.google.android.material.theme.C0064.m257()
            if (r4 < 0) goto L7d0
            java.lang.String r4 = "ۢ۠ۢ"
            goto L5d8
        L7d0:
            int r4 = androidx.versionedparcelable.C0038.f38
            int r13 = androidx.appcompat.widget.C0014.f14
            int r4 = r4 + r13
            r13 = 1756595(0x1acdb3, float:2.461514E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L7dd:
            int r4 = androidx.constraintlayout.widget.C0020.f20
            int r13 = androidx.savedstate.C0034.f34
            int r4 = r4 * r13
            r13 = 1517541(0x1727e5, float:2.126528E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L7ea:
            int r4 = com.google.android.material.carousel.C0054.f54
            int r13 = androidx.constraintlayout.widget.C0020.f20
            r4 = r4 | r13
            r13 = -1747680(0xffffffffffe55520, float:NaN)
            r4 = r4 ^ r13
            r41 = r4
            goto L4a
        L7f7:
            r20 = 0
            int r4 = defpackage.C0071.f71
            int r13 = androidx.appcompat.widget.C0013.f13
            int r13 = r13 + (-2569)
            r4 = r4 | r13
            if (r4 < 0) goto L808
            androidx.startup.C0037.m150()
            r4 = r26
            goto L7ba
        L808:
            int r4 = androidx.core.widget.C0025.f25
            int r13 = android.support.v4.graphics.drawable.C0006.f6
            r4 = r4 | r13
            r13 = 1753153(0x1ac041, float:2.45669E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L815:
            r4 = move-exception
            int r4 = androidx.constraintlayout.widget.C0019.m77()
            if (r4 > 0) goto L828
            java.lang.String r4 = "ۢۦ۠"
            int r4 = com.ljx.wechatmod.auth.C0065.m263(r4)
            r6 = r36
            r41 = r4
            goto L4a
        L828:
            int r4 = androidx.viewpager2.adapter.C0043.f43
            int r6 = androidx.appcompat.app.C0012.f12
            int r4 = r4 - r6
            r6 = 1754147(0x1ac423, float:2.458083E-39)
            int r4 = r4 + r6
            r6 = r36
            r41 = r4
            goto L4a
        L837:
            int r4 = androidx.savedstate.C0036.f36
            int r13 = androidx.activity.result.C0008.f8
            int r13 = r13 / (-225)
            r4 = r4 ^ r13
            if (r4 > 0) goto L84c
            java.lang.String r4 = "ۤۦ"
            int r4 = kotlinx.coroutines.C0069.m277(r4)
            r41 = r4
            r22 = r48
            goto L4a
        L84c:
            int r4 = com.ljx.wechatmod.ui.C0067.f67
            int r13 = androidx.versionedparcelable.C0041.f41
            int r4 = r4 / r13
            r13 = 1755496(0x1ac968, float:2.459974E-39)
            int r4 = r4 + r13
            r41 = r4
            r22 = r48
            goto L4a
        L85b:
            r0 = r50
            int r4 = r0.a
            switch(r4) {
                case 0: goto L73f;
                case 1: goto L862;
                case 2: goto L862;
                case 3: goto L4ce;
                case 4: goto L862;
                case 5: goto L4f8;
                default: goto L862;
            }
        L862:
            int r4 = com.google.android.material.floatingactionbutton.C0060.f60
            int r13 = androidx.core.content.C0023.f23
            int r4 = r4 % r13
            r13 = 1749937(0x1ab3b1, float:2.452184E-39)
            r4 = r4 ^ r13
            r41 = r4
            goto L4a
        L86f:
            int r4 = androidx.activity.C0010.f10
            int r13 = androidx.activity.result.C0009.f9
            r4 = r4 | r13
            r13 = 1752201(0x1abc89, float:2.455357E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L87c:
            int r4 = androidx.activity.result.C0008.f8
            int r13 = androidx.versionedparcelable.C0039.f39
            int r4 = r4 % r13
            r13 = -1755275(0xffffffffffe53775, float:NaN)
            r4 = r4 ^ r13
            r40 = r38
            r41 = r4
            goto L4a
        L88b:
            int r4 = android.app.C0000.f0
            if (r4 > 0) goto L89c
            androidx.coordinatorlayout.widget.C0021.m84()
            java.lang.String r4 = "۟۠ۡ"
            int r4 = com.ljx.wechatmod.hook.C0066.m264(r4)
            r41 = r4
            goto L4a
        L89c:
            int r4 = com.ljx.wechatmod.ui.C0067.f67
            int r13 = androidx.recyclerview.widget.C0033.f33
            r4 = r4 | r13
            r13 = -1754442(0xffffffffffe53ab6, float:NaN)
            r4 = r4 ^ r13
            r41 = r4
            goto L4a
        L8a9:
            int r4 = androidx.activity.result.C0008.m33()
            if (r4 > 0) goto L8be
            com.ljx.wechatmod.ui.C0067.m269()
            java.lang.String r4 = "ۡۡ"
            int r4 = androidx.core.widget.C0025.m102(r4)
            r41 = r4
            r19 = r20
            goto L4a
        L8be:
            r4 = r20
            goto L685
        L8c2:
            r0 = r21
            float r4 = r0.screenBrightness
            r13 = 0
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 <= 0) goto L88b
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 != 0) goto L18c
            int r4 = androidx.activity.C0011.m44()
            if (r4 > 0) goto L8df
            r4 = 74
            com.google.android.material.bottomsheet.C0051.f51 = r4
            java.lang.String r4 = "ۦۣۣ"
            goto L538
        L8df:
            int r4 = androidx.activity.C0010.f10
            int r13 = com.google.android.material.theme.C0062.f62
            int r4 = r4 % r13
            r13 = 1752224(0x1abca0, float:2.455389E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L8ec:
            int r4 = androidx.activity.result.C0008.f8
            int r13 = androidx.recyclerview.widget.C0033.f33
            r13 = r13 ^ 6771(0x1a73, float:9.488E-42)
            int r4 = r4 * r13
            if (r4 < 0) goto L902
            kotlinx.coroutines.C0070.m280()
            java.lang.String r4 = "ۨۦۤ"
            int r4 = com.google.android.material.theme.C0063.m254(r4)
            r41 = r4
            goto L4a
        L902:
            java.lang.String r4 = "ۤۦ"
            goto Lbf
        L906:
            java.lang.String r4 = "NQ==\n"
            java.lang.String r11 = "RWjt2IJ6vAA=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r11)
            r0 = r51
            defpackage.ip.o(r4, r0)
            gn r11 = defpackage.gn.a
            java.lang.String r4 = "1dgSEiOGAsbh0QQuL50IwtA=\n"
            java.lang.String r13 = "vr1rTU7pYa0=\n"
            boolean r4 = defpackage.z30.q(r4, r13, r11)
            if (r4 == 0) goto L5d6
            r0 = r51
            java.lang.reflect.Member r4 = r0.method
            java.lang.String r4 = r4.getName()
            java.lang.String r13 = "MMpjuErjaw42y3I=\n"
            java.lang.String r41 = "Q68X9CuXAno=\n"
            r0 = r41
            java.lang.String r13 = defpackage.u40.a(r13, r0)
            boolean r4 = defpackage.ip.i(r4, r13)
            if (r4 == 0) goto L57a
            r0 = r51
            java.lang.Object[] r4 = r0.args
            java.lang.String r10 = "IWLNsZYo5IYVa9Wa\n"
            java.lang.String r12 = "Sge07vtHh+0=\n"
            java.lang.String r12 = defpackage.u40.a(r10, r12)
            int r10 = androidx.activity.C0011.m44()
            if (r10 > 0) goto L954
            java.lang.String r10 = "ۢۢۨ"
            int r13 = androidx.savedstate.C0036.m144(r10)
            r10 = r4
            r41 = r13
            goto L4a
        L954:
            java.lang.String r10 = "ۡۦۥ"
            r13 = r10
            goto L1a1
        L959:
            r0 = r51
            java.lang.Object[] r4 = r0.args
            java.lang.String r13 = "HMuFtQ==\n"
            java.lang.String r27 = "fbnixsVHb4s=\n"
            r0 = r27
            java.lang.String r13 = defpackage.u40.a(r13, r0)
            defpackage.ip.n(r13, r4)
            int r13 = r4.length
            r29 = 0
            int r27 = androidx.constraintlayout.widget.C0020.m82()
            if (r27 > 0) goto L994
            com.ljx.wechatmod.ui.C0067.m269()
            java.lang.String r27 = "ۡۧۥ"
            int r41 = androidx.constraintlayout.widget.C0018.m73(r27)
            r27 = r4
            r28 = r13
            goto L4a
        L982:
            int r4 = androidx.core.content.C0024.f24
            int r13 = com.google.android.material.theme.C0064.f64
            int r13 = r13 + (-8590)
            int r4 = r4 / r13
            if (r4 == 0) goto L9a0
            com.google.android.material.theme.C0063.m253()
            r4 = r27
            r24 = r25
            r13 = r28
        L994:
            java.lang.String r27 = "ۢۤۦ"
            int r41 = androidx.startup.C0037.m149(r27)
            r27 = r4
            r28 = r13
            goto L4a
        L9a0:
            java.lang.String r4 = "ۨۥۢ"
            r13 = r25
            goto L728
        L9a6:
            r45 = 0
            int r4 = com.github.megatronking.stringfog.C0048.f48
            int r13 = com.github.megatronking.stringfog.C0048.f48
            int r4 = r4 - r13
            r13 = 1749794(0x1ab322, float:2.451984E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L9b5:
            int r4 = android.support.v4.graphics.drawable.C0004.f4
            int r13 = androidx.profileinstaller.C0030.f30
            int r4 = r4 * r13
            r13 = -1817139(0xffffffffffe445cd, float:NaN)
            r4 = r4 ^ r13
            r41 = r4
            goto L4a
        L9c2:
            int r4 = com.google.android.material.datepicker.C0059.f59
            int r13 = androidx.activity.C0011.f11
            int r4 = r4 - r13
            r13 = -1754322(0xffffffffffe53b2e, float:NaN)
            r4 = r4 ^ r13
            r38 = r39
            r41 = r4
            goto L4a
        L9d1:
            java.lang.String r4 = "ۦۥۨ"
            r5 = r9
            goto L74d
        L9d6:
            java.lang.String r4 = "ۣ۟ۡ"
            r6 = r7
            goto L196
        L9db:
            gn r4 = defpackage.gn.a     // Catch: java.lang.Throwable -> L2c9
            r4.getClass()     // Catch: java.lang.Throwable -> L2c9
            int r4 = com.ljx.wechatmod.hook.C0066.f66
            if (r4 > 0) goto L9f2
            r4 = 25
            androidx.activity.result.C0008.f8 = r4
            java.lang.String r4 = "ۤ۠ۧ"
            int r4 = androidx.emoji2.text.C0026.m105(r4)
            r41 = r4
            goto L4a
        L9f2:
            int r4 = android.support.v4.graphics.drawable.C0004.f4
            int r13 = androidx.versionedparcelable.C0038.f38
            r4 = r4 ^ r13
            r13 = 1754470(0x1ac566, float:2.458536E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        L9ff:
            int r4 = androidx.legacy.content.C0028.f28
            int r13 = com.google.android.material.carousel.C0054.f54
            r4 = r4 | r13
            r13 = 1755459(0x1ac943, float:2.459922E-39)
            int r4 = r4 + r13
            r39 = r8
            r41 = r4
            goto L4a
        La0e:
            java.lang.Double r4 = defpackage.a50.A(r40)
            if (r4 == 0) goto L2b5
            double r22 = r4.doubleValue()
            java.lang.String r4 = "ۡ۟ۧ"
            r13 = r4
            goto L689
        La1d:
            r4 = move-exception
            gn r4 = defpackage.gn.a     // Catch: java.lang.Throwable -> L154
            java.lang.Integer r13 = defpackage.b50.R(r34)     // Catch: java.lang.Throwable -> L154
            if (r13 == 0) goto L3b2
            int r19 = r13.intValue()     // Catch: java.lang.Throwable -> L154
            int r13 = android.view.C0007.f7
            int r33 = androidx.activity.result.C0008.f8
            int r13 = r13 * r33
            r33 = 2185957(0x215ae5, float:3.063178E-39)
            int r13 = r13 + r33
            r33 = r4
            r41 = r13
            goto L4a
        La3b:
            r0 = r34
            java.lang.String r4 = defpackage.gn.d(r12, r0)     // Catch: java.lang.Throwable -> La1d
            int r13 = androidx.versionedparcelable.C0038.f38
            int r37 = com.google.android.material.theme.C0063.f63
            int r13 = r13 + r37
            r37 = -1748570(0xffffffffffe551a6, float:NaN)
            r13 = r13 ^ r37
            r37 = r4
            r41 = r13
            goto L4a
        La52:
            int r4 = androidx.recyclerview.widget.C0033.f33
            int r13 = com.google.android.material.chip.C0057.f57
            int r4 = r4 - r13
            r13 = 55642(0xd95a, float:7.7971E-41)
            int r4 = r4 + r13
            r21 = r35
            r41 = r4
            goto L4a
        La61:
            int r4 = androidx.appcompat.widget.C0014.f14
            if (r4 < 0) goto La71
            java.lang.String r4 = "۟ۦۨ"
            int r4 = androidx.constraintlayout.helper.widget.C0017.m70(r4)
            r24 = r26
            r41 = r4
            goto L4a
        La71:
            java.lang.String r4 = "۟۠ۢ"
            r24 = r26
            goto L5ee
        La77:
            java.lang.String r4 = "ۦۢۨ"
            goto L56e
        La7b:
            int r4 = androidx.savedstate.C0034.f34
            int r13 = androidx.constraintlayout.widget.C0020.f20
            int r4 = r4 / r13
            r13 = 1747712(0x1aab00, float:2.449066E-39)
            int r4 = r4 + r13
            r41 = r4
            goto L4a
        La88:
            r4 = 0
            java.lang.Double r13 = java.lang.Double.valueOf(r22)
            r10[r4] = r13
            int r4 = android.support.v4.graphics.drawable.C0005.f5
            if (r4 > 0) goto Laa0
            io.fastkv.C0068.m273()
            java.lang.String r4 = "ۢۧ"
            int r4 = androidx.viewpager2.adapter.C0043.m173(r4)
            r41 = r4
            goto L4a
        Laa0:
            int r4 = androidx.constraintlayout.widget.C0020.f20
            int r13 = com.ljx.wechatmod.auth.C0065.f65
            int r4 = r4 % r13
            r13 = -1749594(0xffffffffffe54da6, float:NaN)
            r4 = r4 ^ r13
            r41 = r4
            goto L4a
        Laad:
            return
        Laae:
            r4 = r18
            goto L702
    }
}
