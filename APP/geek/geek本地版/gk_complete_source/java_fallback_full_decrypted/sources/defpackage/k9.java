package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k9 extends de.robv.android.xposed.XC_MethodHook {
    public final int a;

    public /* synthetic */ k9(int r5) {
            r4 = this;
            r4.a = r5
            r4.<init>()
            r0 = 0
            java.lang.String r2 = "ۣۡۦ"
            int r2 = androidx.constraintlayout.widget.C0019.m79(r2)
        Ld:
            switch(r2) {
                case 1748740: goto L11;
                case 1749695: goto L9f;
                case 1751561: goto L75;
                case 1751652: goto L2b;
                case 1754507: goto L5b;
                case 1755467: goto L49;
                default: goto L10;
            }
        L10:
            goto Ld
        L11:
            int r2 = androidx.recyclerview.widget.C0032.m128()
            if (r2 < 0) goto L2b
            int r2 = androidx.activity.C0011.f11
            int r3 = android.support.v4.graphics.drawable.C0006.f6
            int r3 = r3 + (-3470)
            int r2 = r2 % r3
            if (r2 < 0) goto L94
            r2 = 44
            android.support.v4.graphics.drawable.C0005.f5 = r2
        L24:
            java.lang.String r2 = "ۣۢ۠"
            int r2 = androidx.activity.result.C0009.m38(r2)
            goto Ld
        L2b:
            int r2 = com.google.android.material.behavior.C0050.f50
            int r3 = com.google.android.material.chip.C0057.f57
            r3 = r3 ^ 1876(0x754, float:2.629E-42)
            int r2 = r2 / r3
            if (r2 == 0) goto L3f
            r2 = 97
            com.google.android.material.appbar.C0049.f49 = r2
            java.lang.String r2 = "ۡۧ۠"
            int r2 = com.google.android.material.carousel.C0053.m213(r2)
            goto Ld
        L3f:
            int r2 = com.google.android.material.theme.C0064.f64
            int r3 = android.view.C0007.f7
            r2 = r2 | r3
            r3 = 1749840(0x1ab350, float:2.452048E-39)
            r2 = r2 ^ r3
            goto Ld
        L49:
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
            int r2 = androidx.core.content.C0023.m92()
            if (r2 < 0) goto L24
            java.lang.String r2 = "ۣۡۦ"
            int r2 = kotlinx.coroutines.C0070.m281(r2)
            goto Ld
        L5b:
            int r2 = androidx.activity.C0010.f10
            int r3 = androidx.lifecycle.C0029.f29
            int r3 = r3 / (-1755)
            int r2 = r2 + r3
            if (r2 < 0) goto L6b
            java.lang.String r2 = "۠ۡۥ"
            int r2 = androidx.appcompat.widget.C0015.m60(r2)
            goto Ld
        L6b:
            int r2 = androidx.fragment.app.C0027.f27
            int r3 = androidx.activity.C0011.f11
            r2 = r2 | r3
            r3 = -1748911(0xffffffffffe55051, float:NaN)
            r2 = r2 ^ r3
            goto Ld
        L75:
            java.lang.String r0 = "3M3dPU3kISqRt1LqoLa"
            java.lang.String r0 = defpackage.C0073.m293(r0)
            long r0 = java.lang.Long.parseLong(r0)
            int r2 = androidx.appcompat.widget.C0015.f15
            int r3 = androidx.constraintlayout.widget.C0018.f18
            int r3 = r3 + (-2845)
            int r2 = r2 / r3
            if (r2 == 0) goto L8c
            r2 = 17
            androidx.versionedparcelable.C0041.f41 = r2
        L8c:
            java.lang.String r2 = "ۣۨۦ"
            int r2 = com.google.android.material.behavior.C0050.m203(r2)
            goto Ld
        L94:
            int r2 = androidx.profileinstaller.C0031.f31
            int r3 = androidx.core.content.C0024.f24
            int r2 = r2 - r3
            r3 = 1751671(0x1aba77, float:2.454614E-39)
            int r2 = r2 + r3
            goto Ld
        L9f:
            return
    }

    public static final void a(defpackage.k9 r43, android.app.Activity r44, android.view.ViewGroup r45, android.view.ViewGroup r46) {
            r27 = 0
            r34 = 0
            r33 = 0
            r13 = 0
            r15 = 0
            r14 = 0
            r12 = 0
            r22 = 0
            r16 = 0
            r17 = 0
            r28 = 0
            r30 = 0
            r29 = 0
            r2 = 0
            r19 = 0
            r11 = 0
            r35 = 0
            r36 = 0
            r24 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r20 = 0
            r9 = 0
            r18 = 0
            r23 = 0
            r26 = 0
            r39 = 0
            r32 = 0
            r40 = 0
            r25 = 0
            r21 = 0
            r37 = 0
            r38 = 0
            r31 = 0
            java.lang.String r7 = "ۦۥۨ"
            int r7 = androidx.activity.result.C0009.m38(r7)
            r41 = r2
            r42 = r7
        L48:
            switch(r42) {
                case 56290: goto L4c;
                case 56352: goto L16b;
                case 56355: goto L354;
                case 56386: goto L6e;
                case 56389: goto L124;
                case 56476: goto L2ce;
                case 1746727: goto L234;
                case 1746749: goto L24c;
                case 1746758: goto L406;
                case 1746875: goto L103;
                case 1746940: goto L55c;
                case 1746967: goto L2ac;
                case 1747748: goto L29e;
                case 1747806: goto L60;
                case 1747809: goto L575;
                case 1748678: goto L5a7;
                case 1749575: goto L13d;
                case 1749578: goto L284;
                case 1749664: goto L4c2;
                case 1749667: goto Lc5;
                case 1749696: goto L5b4;
                case 1749762: goto L12c;
                case 1749789: goto L112;
                case 1750601: goto L1a8;
                case 1750661: goto Le2;
                case 1750694: goto L38f;
                case 1750780: goto L98;
                case 1751494: goto L234;
                case 1751528: goto L159;
                case 1751530: goto L1e9;
                case 1752460: goto L347;
                case 1752490: goto L4a5;
                case 1752522: goto L428;
                case 1752584: goto L11c;
                case 1752610: goto L474;
                case 1752645: goto L30e;
                case 1753515: goto L5b5;
                case 1753605: goto L5a7;
                case 1753609: goto L1b5;
                case 1753632: goto L51e;
                case 1753698: goto L465;
                case 1754379: goto L1a8;
                case 1754412: goto L20b;
                case 1754532: goto L3e3;
                case 1755491: goto L3c1;
                case 1755586: goto L112;
                case 1755620: goto L4fa;
                default: goto L4b;
            }
        L4b:
            goto L48
        L4c:
            int r2 = kotlinx.coroutines.C0069.m276()
            if (r2 < 0) goto L4eb
            androidx.core.widget.C0025.m103()
            java.lang.String r2 = "ۢ۟ۤ"
            int r2 = androidx.appcompat.app.C0012.m50(r2)
            r13 = r33
            r42 = r2
            goto L48
        L60:
            r2 = r27
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            java.lang.String r7 = "ۧۤۡ"
            r13 = r2
        L67:
            int r2 = androidx.savedstate.C0035.m140(r7)
            r42 = r2
            goto L48
        L6e:
            int r2 = com.github.megatronking.stringfog.xor.C0045.f45
            int r7 = androidx.legacy.content.C0028.f28
            r7 = r7 ^ 5527(0x1597, float:7.745E-42)
            int r2 = r2 - r7
            if (r2 > 0) goto L8c
            r2 = 40
            androidx.coordinatorlayout.widget.C0021.f21 = r2
            java.lang.String r2 = "ۦۥۤ"
            r7 = r29
            r10 = r31
        L81:
            int r2 = androidx.savedstate.C0034.m138(r2)
            r29 = r7
            r42 = r2
            r31 = r10
            goto L48
        L8c:
            int r2 = com.google.android.material.chip.C0056.f56
            int r7 = com.google.android.material.chip.C0056.f56
            int r2 = r2 % r7
            r7 = 1748678(0x1aaec6, float:2.45042E-39)
            r2 = r2 ^ r7
            r42 = r2
            goto L48
        L98:
            r0 = r26
            java.util.ArrayList r2 = r0.i
            r0 = r32
            boolean r7 = r2.contains(r0)
            if (r7 != 0) goto L4c4
            int r7 = androidx.recyclerview.widget.C0033.f33
            if (r7 > 0) goto Lb7
            r7 = 89
            com.github.megatronking.stringfog.C0048.f48 = r7
            java.lang.String r7 = "ۥۥۥ"
            int r7 = androidx.coordinatorlayout.widget.C0022.m90(r7)
            r40 = r2
            r42 = r7
            goto L48
        Lb7:
            int r7 = kotlinx.coroutines.C0069.f69
            int r10 = android.app.C0003.f3
            r7 = r7 ^ r10
            r10 = -1749447(0xffffffffffe54e39, float:NaN)
            r7 = r7 ^ r10
            r40 = r2
            r42 = r7
            goto L48
        Lc5:
            r0 = r40
            r1 = r32
            r0.add(r1)
            int r2 = androidx.profileinstaller.C0031.f31
            int r7 = androidx.coordinatorlayout.widget.C0022.f22
            int r7 = r7 / (-499)
            int r2 = r2 - r7
            if (r2 < 0) goto L414
            androidx.fragment.app.C0027.m111()
            java.lang.String r2 = "ۥ۟ۦ"
            int r2 = androidx.versionedparcelable.C0041.m164(r2)
            r42 = r2
            goto L48
        Le2:
            r10 = 0
            int r2 = androidx.profileinstaller.C0031.f31
            if (r2 < 0) goto Lf7
            java.lang.String r7 = "ۥۣۦ"
            r2 = r32
        Leb:
            int r7 = androidx.activity.result.C0009.m38(r7)
            r32 = r2
            r33 = r10
            r42 = r7
            goto L48
        Lf7:
            java.lang.String r2 = "۟ۡ"
            int r2 = androidx.versionedparcelable.C0038.m153(r2)
            r33 = r10
            r42 = r2
            goto L48
        L103:
            r30 = 0
            int r2 = androidx.savedstate.C0034.f34
            int r7 = androidx.activity.C0011.f11
            r2 = r2 ^ r7
            r7 = 55502(0xd8ce, float:7.7775E-41)
            int r2 = r2 + r7
            r42 = r2
            goto L48
        L112:
            java.lang.String r2 = "ۥۥۥ"
        L114:
            int r2 = android.app.C0001.m5(r2)
            r42 = r2
            goto L48
        L11c:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Error: Update listeners must be added beforethe animation."
            r2.<init>(r3)
            throw r2
        L124:
            java.lang.String r2 = "ۧ۠ۥ"
            r7 = r30
            r10 = r31
            goto L81
        L12c:
            r2 = r32
        L12e:
            int r7 = androidx.recyclerview.widget.C0032.f32
            int r10 = com.google.android.material.internal.C0061.f61
            int r7 = r7 + r10
            r10 = 1752499(0x1abdb3, float:2.455774E-39)
            int r7 = r7 + r10
            r32 = r2
            r42 = r7
            goto L48
        L13d:
            int r2 = kotlinx.coroutines.C0069.m276()
            if (r2 < 0) goto L154
            r2 = 5
            androidx.coordinatorlayout.widget.C0022.f22 = r2
            java.lang.String r2 = "ۡۦ"
            r7 = r34
        L14a:
            int r2 = com.google.android.material.appbar.C0049.m197(r2)
            r34 = r7
            r42 = r2
            goto L48
        L154:
            java.lang.String r2 = "ۦۥۨ"
            r7 = r34
            goto L14a
        L159:
            java.lang.String r7 = "۟۠ۨ"
            r2 = r35
            r10 = r36
        L15f:
            int r7 = com.google.android.material.appbar.C0049.m197(r7)
            r35 = r2
            r36 = r10
            r42 = r7
            goto L48
        L16b:
            r2 = 0
            int r7 = com.google.android.material.floatingactionbutton.C0060.f60
            r7 = r7 ^ 948(0x3b4, float:1.328E-42)
            int r7 = defpackage.ff.q(r7)
            r10 = 0
            int r35 = androidx.versionedparcelable.C0039.f39
            r0 = r35
            r0 = r0 ^ (-499(0xfffffffffffffe0d, float:NaN))
            r35 = r0
            int r35 = defpackage.ff.q(r35)
            r0 = r35
            r11.setPadding(r2, r7, r10, r0)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r7 = androidx.activity.result.C0009.f9
            r7 = r7 ^ 866(0x362, float:1.214E-42)
            int r10 = com.github.megatronking.stringfog.annotation.C0044.f44
            r10 = r10 ^ (-355(0xfffffffffffffe9d, float:NaN))
            r2.<init>(r7, r10)
            r7 = 80
            r2.gravity = r7
            int r7 = defpackage.C0073.f73
            r10 = r7 ^ 30
            int r7 = androidx.appcompat.widget.C0015.m61()
            if (r7 > 0) goto L1ce
            r7 = 16
            androidx.profileinstaller.C0030.f30 = r7
            java.lang.String r7 = "ۣۣۥ"
            goto L15f
        L1a8:
            int r2 = com.github.megatronking.stringfog.xor.C0046.f46
            int r7 = com.google.android.material.appbar.C0049.f49
            int r2 = r2 - r7
            r7 = 1746433(0x1aa601, float:2.447274E-39)
            int r2 = r2 + r7
            r42 = r2
            goto L48
        L1b5:
            android.view.ViewParent r27 = r46.getParent()
            r0 = r27
            boolean r2 = r0 instanceof android.view.ViewGroup
            r34 = 0
            if (r2 == 0) goto L518
            int r2 = android.app.C0002.f2
            int r7 = androidx.viewpager2.adapter.C0043.f43
            int r7 = r7 % 2667
            int r2 = r2 + r7
            if (r2 > 0) goto L1dc
            r2 = r35
            r10 = r36
        L1ce:
            java.lang.String r7 = "ۦۦ۠"
            int r7 = androidx.appcompat.widget.C0014.m57(r7)
            r35 = r2
            r36 = r10
            r42 = r7
            goto L48
        L1dc:
            int r2 = androidx.savedstate.C0034.f34
            int r7 = androidx.coordinatorlayout.widget.C0021.f21
            r2 = r2 | r7
            r7 = 1748203(0x1aaceb, float:2.449754E-39)
            int r2 = r2 + r7
            r42 = r2
            goto L48
        L1e9:
            android.view.View r24 = new android.view.View
            r0 = r24
            r1 = r44
            r0.<init>(r1)
            r0 = r24
            r11.addView(r0)
            h00 r3 = new h00
            r3.<init>()
            e00 r4 = new e00
            r4.<init>()
        L201:
            java.lang.String r2 = "۠ۤۥ"
            int r2 = defpackage.C0073.m292(r2)
            r42 = r2
            goto L48
        L20b:
            if (r29 == 0) goto L55a
            android.graphics.drawable.Drawable r2 = r29.getBackground()
            int r7 = androidx.emoji2.text.C0026.f26
            if (r7 > 0) goto L223
            java.lang.String r7 = "ۨۧۡ"
            int r7 = com.google.android.material.theme.C0063.m254(r7)
            r41 = r2
            r19 = r34
            r42 = r7
            goto L48
        L223:
            int r7 = kotlinx.coroutines.C0069.f69
            int r10 = io.fastkv.C0068.f68
            int r7 = r7 - r10
            r10 = 1753456(0x1ac170, float:2.457115E-39)
            r7 = r7 ^ r10
            r41 = r2
            r19 = r34
            r42 = r7
            goto L48
        L234:
            int r2 = com.github.megatronking.stringfog.C0047.f47
            int r7 = com.google.android.material.internal.C0061.f61
            int r7 = r7 + (-8058)
            int r2 = r2 / r7
            if (r2 == 0) goto L242
            java.lang.String r2 = "ۤۢ۟"
            r7 = r2
            goto L67
        L242:
            java.lang.String r2 = "ۧ۠ۥ"
            int r2 = androidx.activity.result.C0009.m38(r2)
            r42 = r2
            goto L48
        L24c:
            android.view.ViewGroup$LayoutParams r15 = r46.getLayoutParams()
            r0 = r46
            int r14 = r13.indexOfChild(r0)
            r2 = 16908813(0x102020d, float:2.38787E-38)
            int r7 = kotlinx.coroutines.C0070.f70
            r2 = r2 ^ r7
            r0 = r44
            android.view.View r2 = r0.findViewById(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            android.content.res.Resources r7 = r44.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r0 = r7.density
            r22 = r0
            int r7 = com.github.megatronking.stringfog.xor.C0046.f46
            int r10 = android.app.C0003.f3
            r10 = r10 ^ (-7725(0xffffffffffffe1d3, float:NaN))
            r7 = r7 ^ r10
            if (r7 < 0) goto L2b6
            java.lang.String r7 = "ۢۧ"
            int r7 = androidx.versionedparcelable.C0041.m164(r7)
            r12 = r2
            r42 = r7
            goto L48
        L284:
            int r2 = com.github.megatronking.stringfog.xor.C0045.f45
            int r7 = com.google.android.material.chip.C0057.f57
            int r7 = r7 + (-7297)
            int r2 = r2 + r7
            if (r2 < 0) goto L291
            java.lang.String r2 = "ۣ۟ۦ"
            goto L114
        L291:
            int r2 = com.google.android.material.chip.C0056.f56
            int r7 = androidx.appcompat.widget.C0016.f16
            int r2 = r2 / r7
            r7 = 1746749(0x1aa73d, float:2.447717E-39)
            int r2 = r2 + r7
            r42 = r2
            goto L48
        L29e:
            r2 = r28
            android.view.View r2 = (android.view.View) r2
            int r7 = androidx.activity.result.C0008.m33()
            if (r7 > 0) goto L3ed
            r29 = r2
            goto L201
        L2ac:
            int r2 = com.ljx.wechatmod.hook.C0066.f66
            int r7 = androidx.core.content.C0024.f24
            int r7 = r7 / 5063
            int r2 = r2 - r7
            if (r2 > 0) goto L2c1
            r2 = r12
        L2b6:
            java.lang.String r7 = "ۣۤۧ"
            int r7 = android.app.C0003.m13(r7)
            r12 = r2
            r42 = r7
            goto L48
        L2c1:
            int r2 = com.ljx.wechatmod.ui.C0067.f67
            int r7 = androidx.appcompat.widget.C0014.f14
            r2 = r2 ^ r7
            r7 = 1756139(0x1acbeb, float:2.460875E-39)
            r2 = r2 ^ r7
            r42 = r2
            goto L48
        L2ce:
            dm r2 = new dm
            r7 = 1
            r0 = r38
            r2.<init>(r0, r7)
            r0 = r37
            r0.addOnAttachStateChangeListener(r2)
            mh r2 = new mh
            r7 = 1
            r0 = r38
            r2.<init>(r7, r0)
            r0 = r37
            r0.setOnTouchListener(r2)
            int r2 = androidx.constraintlayout.widget.C0020.f20
            r2 = r2 ^ (-253(0xffffffffffffff03, float:NaN))
            int r31 = r31 + r2
            int r2 = com.github.megatronking.stringfog.C0048.f48
            int r7 = android.app.C0003.f3
            int r7 = r7 % 5611
            int r2 = r2 * r7
            if (r2 > 0) goto L304
            com.ljx.wechatmod.auth.C0065.m260()
            java.lang.String r2 = "ۤ۟ۡ"
            int r2 = androidx.savedstate.C0036.m144(r2)
            r42 = r2
            goto L48
        L304:
            java.lang.String r2 = "۟ۨ۠"
            int r2 = com.ljx.wechatmod.ui.C0067.m271(r2)
            r42 = r2
            goto L48
        L30e:
            r0 = r31
            r1 = r25
            if (r0 >= r1) goto L5a7
            r0 = r46
            r1 = r31
            android.view.View r2 = r0.getChildAt(r1)
            defpackage.ip.l(r2)
            android.view.View r7 = defpackage.a80.j(r2)
            int r10 = androidx.startup.C0037.f37
            if (r10 < 0) goto L339
            r10 = 35
            com.google.android.material.floatingactionbutton.C0060.f60 = r10
            java.lang.String r10 = "ۣۢۡ"
            int r10 = defpackage.C0073.m292(r10)
            r37 = r2
            r38 = r7
            r42 = r10
            goto L48
        L339:
            java.lang.String r10 = "ۥۡ"
        L33b:
            int r10 = com.google.android.material.carousel.C0055.m220(r10)
            r37 = r2
            r38 = r7
            r42 = r10
            goto L48
        L347:
            int r2 = com.github.megatronking.stringfog.C0048.f48
            int r7 = androidx.appcompat.widget.C0016.f16
            r2 = r2 ^ r7
            r7 = 1746677(0x1aa6f5, float:2.447616E-39)
            int r2 = r2 + r7
            r42 = r2
            goto L48
        L354:
            android.graphics.drawable.ColorDrawable r23 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r0 = r23
            r0.<init>(r2)
            h40 r26 = new h40
            qh r2 = defpackage.h40.l
            r0 = r26
            r1 = r24
            r0.<init>(r1, r2)
            i40 r2 = new i40
            r2.<init>()
            r7 = 1125515264(0x43160000, float:150.0)
            r2.b(r7)
            int r7 = com.ljx.wechatmod.hook.C0066.m265()
            if (r7 > 0) goto L383
            java.lang.String r7 = "۟ۥۡ"
            int r7 = androidx.activity.C0010.m43(r7)
            r39 = r2
            r42 = r7
            goto L48
        L383:
            java.lang.String r7 = "ۨۤ۟"
        L385:
            int r7 = androidx.activity.result.C0009.m38(r7)
            r39 = r2
            r42 = r7
            goto L48
        L38f:
            android.graphics.drawable.Drawable r16 = r46.getBackground()
            android.graphics.drawable.Drawable r17 = r13.getBackground()
            android.view.ViewParent r28 = r13.getParent()
            r0 = r28
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L347
            int r2 = androidx.profileinstaller.C0031.f31
            int r7 = android.view.C0007.f7
            int r7 = r7 % (-6504)
            int r2 = r2 % r7
            if (r2 < 0) goto L3b4
            java.lang.String r2 = "ۥ۠ۥ"
            int r2 = androidx.startup.C0037.m149(r2)
            r42 = r2
            goto L48
        L3b4:
            int r2 = androidx.core.content.C0023.f23
            int r7 = androidx.constraintlayout.helper.widget.C0017.f17
            int r2 = r2 / r7
            r7 = 1747748(0x1aab24, float:2.449117E-39)
            int r2 = r2 + r7
            r42 = r2
            goto L48
        L3c1:
            r2 = 1058642330(0x3f19999a, float:0.6)
            r0 = r39
            r0.a(r2)
            r0 = r39
            r1 = r26
            r1.j = r0
            l9 r2 = new l9
            r7 = 1
            r0 = r24
            r2.<init>(r7, r0)
            r0 = r26
            boolean r7 = r0.e
            if (r7 != 0) goto L12e
            java.lang.String r7 = "ۣۧ۠"
            r10 = r33
            goto Leb
        L3e3:
            int r2 = com.ljx.wechatmod.auth.C0065.f65
            if (r2 < 0) goto L3f9
            r2 = 52
            androidx.constraintlayout.widget.C0020.f20 = r2
            r2 = r29
        L3ed:
            java.lang.String r7 = "ۤ۠ۤ"
            int r7 = defpackage.C0071.m286(r7)
            r29 = r2
            r42 = r7
            goto L48
        L3f9:
            int r2 = androidx.appcompat.widget.C0013.f13
            int r7 = android.app.C0000.f0
            int r2 = r2 + r7
            r7 = 1750529(0x1ab601, float:2.453014E-39)
            int r2 = r2 + r7
            r42 = r2
            goto L48
        L406:
            if (r13 != 0) goto L284
            int r2 = androidx.savedstate.C0036.f36
            int r7 = com.google.android.material.datepicker.C0059.f59
            int r7 = r7 + 7698
            int r2 = r2 - r7
            if (r2 < 0) goto L41e
            com.ljx.wechatmod.ui.C0067.m269()
        L414:
            java.lang.String r2 = "ۥۡۦ"
            int r2 = androidx.activity.C0011.m45(r2)
            r42 = r2
            goto L48
        L41e:
            java.lang.String r2 = "ۢۤ"
            int r2 = androidx.appcompat.widget.C0016.m65(r2)
            r42 = r2
            goto L48
        L428:
            android.view.ViewTreeObserver r42 = r46.getViewTreeObserver()
            ps r2 = new ps
            r7 = r44
            r10 = r46
            r21 = r45
            r25 = r43
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = r42
            r0.addOnPreDrawListener(r2)
            int r25 = r46.getChildCount()
            r21 = 0
            int r2 = kotlinx.coroutines.C0069.f69
            int r7 = android.app.C0003.f3
            int r7 = r7 / (-5644)
            int r2 = r2 * r7
            if (r2 == 0) goto L458
            defpackage.C0072.m289()
            java.lang.String r10 = "ۣۧ۟"
            r2 = r37
            r7 = r38
            goto L33b
        L458:
            int r2 = androidx.legacy.content.C0028.f28
            int r7 = com.google.android.material.carousel.C0054.f54
            int r2 = r2 * r7
            r7 = 2175770(0x21331a, float:3.048903E-39)
            int r2 = r2 + r7
            r42 = r2
            goto L48
        L465:
            int r2 = androidx.appcompat.widget.C0013.f13
            int r7 = com.google.android.material.bottomsheet.C0051.f51
            r2 = r2 | r7
            r7 = 1752755(0x1abeb3, float:2.456133E-39)
            int r2 = r2 + r7
            r19 = r41
            r42 = r2
            goto L48
        L474:
            android.widget.FrameLayout r11 = new android.widget.FrameLayout
            r0 = r44
            r11.<init>(r0)
            java.lang.String r2 = "B+7xkdrGuHwF5vCRzP6BZxjm9IjH6w==\n"
            java.lang.String r7 = "aoeE+KKZ3hA=\n"
            java.lang.String r2 = "miuix_floating_wrapper"
            r11.setTag(r2)
            r2 = 0
            r11.setClipChildren(r2)
            r2 = 0
            r11.setClipToPadding(r2)
            int r2 = androidx.constraintlayout.helper.widget.C0017.f17
            if (r2 > 0) goto L498
            java.lang.String r7 = "ۦۥۨ"
            r2 = r39
            goto L385
        L498:
            int r2 = androidx.core.content.C0024.f24
            int r7 = com.google.android.material.carousel.C0052.f52
            int r2 = r2 * r7
            r7 = 55867(0xda3b, float:7.8286E-41)
            r2 = r2 ^ r7
            r42 = r2
            goto L48
        L4a5:
            int r2 = androidx.savedstate.C0035.m143()
            if (r2 > 0) goto L4ba
            kotlinx.coroutines.C0069.m276()
            java.lang.String r2 = "ۡۡۦ"
            int r2 = androidx.fragment.app.C0027.m110(r2)
            r42 = r2
            r31 = r21
            goto L48
        L4ba:
            java.lang.String r2 = "ۥۥۥ"
            r7 = r29
            r10 = r21
            goto L81
        L4c2:
            r2 = r40
        L4c4:
            int r7 = androidx.core.content.C0023.f23
            int r10 = androidx.profileinstaller.C0031.f31
            int r10 = r10 % (-6269)
            int r7 = r7 % r10
            if (r7 > 0) goto L4dc
            r7 = 0
            androidx.appcompat.widget.C0015.f15 = r7
            java.lang.String r7 = "ۥۧ"
            int r7 = androidx.core.widget.C0025.m102(r7)
            r40 = r2
            r42 = r7
            goto L48
        L4dc:
            int r7 = androidx.profileinstaller.C0030.f30
            int r10 = defpackage.C0071.f71
            int r7 = r7 + r10
            r10 = 1753001(0x1abfa9, float:2.456478E-39)
            int r7 = r7 + r10
            r40 = r2
            r42 = r7
            goto L48
        L4eb:
            int r2 = androidx.appcompat.widget.C0016.f16
            int r7 = com.google.android.material.carousel.C0055.f55
            r2 = r2 | r7
            r7 = 1747291(0x1aa95b, float:2.448476E-39)
            int r2 = r2 + r7
            r13 = r33
            r42 = r2
            goto L48
        L4fa:
            g00 r8 = new g00
            r8.<init>()
            i00 r20 = new i00
            r20.<init>()
            i00 r9 = new i00
            r9.<init>()
            e00 r18 = new e00
            r18.<init>()
            java.lang.String r2 = "ۡۤ"
            int r2 = com.google.android.material.carousel.C0054.m219(r2)
            r42 = r2
            goto L48
        L518:
            r7 = r34
        L51a:
            java.lang.String r2 = "ۣۣۥ"
            goto L14a
        L51e:
            int r2 = defpackage.ff.q(r36)
            r7 = 0
            int r10 = defpackage.ff.q(r36)
            int r42 = com.ljx.wechatmod.auth.C0065.f65
            r0 = r42
            r0 = r0 ^ (-888(0xfffffffffffffc88, float:NaN))
            r42 = r0
            int r42 = defpackage.ff.q(r42)
            r0 = r35
            r1 = r42
            r0.setMargins(r2, r7, r10, r1)
            r0 = r35
            r11.setLayoutParams(r0)
            r2 = 1
            r11.setClipToOutline(r2)
            rs r2 = new rs
            r0 = r22
            r2.<init>(r0)
            r11.setOutlineProvider(r2)
            int r2 = com.ljx.wechatmod.hook.C0066.f66
            int r7 = kotlinx.coroutines.C0070.f70
            int r2 = r2 * r7
            r7 = 1270906(0x13647a, float:1.780919E-39)
            int r2 = r2 + r7
            r42 = r2
            goto L48
        L55a:
            r19 = r34
        L55c:
            int r2 = androidx.constraintlayout.widget.C0020.f20
            int r7 = androidx.core.content.C0024.f24
            int r7 = r7 + (-6917)
            int r2 = r2 / r7
            if (r2 == 0) goto L572
            androidx.coordinatorlayout.widget.C0022.m88()
            java.lang.String r2 = "ۢۡۡ"
        L56a:
            int r2 = androidx.activity.result.C0008.m35(r2)
            r42 = r2
            goto L48
        L572:
            java.lang.String r2 = "ۥۤۡ"
            goto L56a
        L575:
            r2 = 1
            r4.a = r2
            e00 r5 = new e00
            r5.<init>()
            g00 r6 = new g00
            r6.<init>()
            r2 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r6.a = r2
            int r2 = com.google.android.material.datepicker.C0059.m236()
            if (r2 > 0) goto L59a
            com.google.android.material.floatingactionbutton.C0060.m240()
            java.lang.String r2 = "ۢۢ۠"
            int r2 = androidx.recyclerview.widget.C0032.m130(r2)
            r42 = r2
            goto L48
        L59a:
            int r2 = androidx.versionedparcelable.C0041.f41
            int r7 = androidx.viewpager2.adapter.C0043.f43
            int r2 = r2 / r7
            r7 = 1755619(0x1ac9e3, float:2.460146E-39)
            int r2 = r2 + r7
            r42 = r2
            goto L48
        L5a7:
            int r2 = androidx.core.widget.C0025.f25
            int r7 = com.google.android.material.datepicker.C0058.f58
            int r2 = r2 % r7
            r7 = 1750515(0x1ab5f3, float:2.452994E-39)
            int r2 = r2 + r7
            r42 = r2
            goto L48
        L5b4:
            return
        L5b5:
            r7 = r34
            goto L51a
    }

    private final void b(de.robv.android.xposed.XC_MethodHook.MethodHookParam r38) {
            r37 = this;
            r4 = 0
            r19 = 0
            r13 = 0
            r30 = 0
            r20 = 0
            r15 = 0
            r12 = 0
            r3 = 0
            r18 = 0
            r14 = 0
            r34 = 0
            r29 = 0
            r11 = 0
            r5 = 0
            r32 = 0
            r33 = 0
            r31 = 0
            r17 = 0
            r9 = 0
            r16 = 0
            r8 = 0
            r7 = 0
            r24 = 0
            r35 = 0
            r10 = 0
            r6 = 0
            r21 = 0
            r23 = 0
            r22 = 0
            r28 = 0
            r2 = 0
            java.lang.String r25 = "ۣ۟ۡ"
            int r36 = androidx.fragment.app.C0027.m110(r25)
            r25 = r2
            r26 = r5
            r27 = r7
        L3c:
            switch(r36) {
                case 56384: goto L40;
                case 56386: goto L2bb;
                case 56387: goto L64f;
                case 56419: goto L5a0;
                case 56446: goto L786;
                case 56474: goto L6d7;
                case 56479: goto L32f;
                case 56514: goto Lcb;
                case 56538: goto L34c;
                case 56544: goto L272;
                case 56574: goto L60f;
                case 1746692: goto L218;
                case 1746784: goto L272;
                case 1746789: goto L65b;
                case 1746813: goto L3a8;
                case 1746845: goto L37d;
                case 1746878: goto L443;
                case 1746879: goto L481;
                case 1746907: goto L297;
                case 1747654: goto L272;
                case 1747657: goto L2bb;
                case 1747685: goto L192;
                case 1747686: goto L724;
                case 1747812: goto L2f9;
                case 1747899: goto L55;
                case 1748648: goto Lf4;
                case 1748676: goto L677;
                case 1748703: goto L7f7;
                case 1748708: goto L768;
                case 1748738: goto L9f;
                case 1748799: goto L68f;
                case 1748892: goto L3f9;
                case 1749573: goto L406;
                case 1749574: goto L450;
                case 1749636: goto L7c0;
                case 1749638: goto L42e;
                case 1749664: goto L3f9;
                case 1749731: goto L1c5;
                case 1749795: goto L533;
                case 1749825: goto L146;
                case 1749852: goto L429;
                case 1750533: goto L225;
                case 1750633: goto L6f6;
                case 1750720: goto L358;
                case 1750725: goto L77;
                case 1750782: goto L556;
                case 1750788: goto L456;
                case 1750815: goto L47b;
                case 1751495: goto L749;
                case 1751499: goto L6a9;
                case 1751528: goto L4fe;
                case 1751558: goto L167;
                case 1751560: goto L626;
                case 1751621: goto L115;
                case 1751622: goto L79e;
                case 1751623: goto L2c8;
                case 1751624: goto L1f4;
                case 1751685: goto L3c1;
                case 1751712: goto L4e0;
                case 1752492: goto L6c8;
                case 1752518: goto L4c1;
                case 1752520: goto L4ab;
                case 1752549: goto L3b7;
                case 1752550: goto L3e0;
                case 1752577: goto L5b7;
                case 1752641: goto L317;
                case 1752645: goto L724;
                case 1752648: goto L4a4;
                case 1752677: goto L578;
                case 1752679: goto L7ca;
                case 1752703: goto L7e9;
                case 1752710: goto L7b6;
                case 1752738: goto L5ef;
                case 1753417: goto L69f;
                case 1753453: goto L250;
                case 1753481: goto L6e4;
                case 1753543: goto L3c1;
                case 1753634: goto L55;
                case 1754378: goto L5c5;
                case 1754473: goto L443;
                case 1754475: goto L695;
                case 1754477: goto L1e4;
                case 1754630: goto L416;
                case 1755338: goto L124;
                case 1755344: goto L725;
                case 1755369: goto L45c;
                case 1755462: goto L392;
                case 1755499: goto L51f;
                case 1755524: goto L19f;
                case 1755531: goto L241;
                default: goto L3f;
            }
        L3f:
            goto L3c
        L40:
            int r2 = androidx.activity.C0011.f11
            int r5 = com.github.megatronking.stringfog.xor.C0046.f46
            int r5 = r5 + 8995
            int r2 = r2 % r5
            if (r2 < 0) goto L185
            androidx.core.content.C0024.m96()
            java.lang.String r2 = "۟ۥۥ"
            int r2 = androidx.savedstate.C0034.m138(r2)
            r36 = r2
            goto L3c
        L55:
            int r2 = com.ljx.wechatmod.hook.C0066.f66
            int r5 = androidx.constraintlayout.widget.C0018.f18
            int r5 = r5 / 5199
            int r2 = r2 + r5
            if (r2 > 0) goto L6b
            r2 = 35
            com.google.android.material.chip.C0057.f57 = r2
            java.lang.String r2 = "ۣۣۢ"
            int r2 = androidx.appcompat.app.C0012.m50(r2)
            r36 = r2
            goto L3c
        L6b:
            int r2 = com.google.android.material.theme.C0064.f64
            int r5 = androidx.activity.C0010.f10
            int r2 = r2 * r5
            r5 = 1847565(0x1c310d, float:2.58899E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L77:
            if (r26 == 0) goto L7c0
            java.lang.String r32 = r26.toString()     // Catch: java.lang.Throwable -> L710
            int r2 = androidx.core.widget.C0025.f25
            int r5 = android.support.v4.graphics.drawable.C0006.f6
            r5 = r5 ^ (-7956(0xffffffffffffe0ec, float:NaN))
            r2 = r2 ^ r5
            if (r2 > 0) goto L93
            r2 = 72
            com.ljx.wechatmod.ui.C0067.f67 = r2
            java.lang.String r2 = "ۡ۠ۧ"
            int r2 = androidx.appcompat.widget.C0016.m65(r2)
            r36 = r2
            goto L3c
        L93:
            int r2 = androidx.appcompat.widget.C0014.f14
            int r5 = androidx.constraintlayout.widget.C0019.f19
            int r2 = r2 % r5
            r5 = 56590(0xdd0e, float:7.93E-41)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L9f:
            java.lang.String r2 = "/rMlomkXhdLrtDW8Yw==\n"
            java.lang.String r5 = "n91B0AZ+4fw=\n"
            java.lang.String r2 = "android.title"     // Catch: java.lang.Throwable -> L710
            r0 = r29
            java.lang.CharSequence r2 = r0.getCharSequence(r2)     // Catch: java.lang.Throwable -> L710
            int r5 = androidx.coordinatorlayout.widget.C0022.f22
            if (r5 < 0) goto Lbc
            java.lang.String r5 = "ۣ۟ۡ"
            int r5 = com.google.android.material.carousel.C0053.m213(r5)
            r26 = r2
            r36 = r5
            goto L3c
        Lbc:
            int r5 = com.google.android.material.chip.C0057.f57
            int r7 = com.google.android.material.carousel.C0054.f54
            int r5 = r5 + r7
            r7 = 1751025(0x1ab7f1, float:2.453709E-39)
            r5 = r5 ^ r7
            r26 = r2
            r36 = r5
            goto L3c
        Lcb:
            r0 = r38
            java.lang.Object[] r2 = r0.args     // Catch: java.lang.Throwable -> L710
            int r4 = androidx.fragment.app.C0027.m111()
            if (r4 > 0) goto Le6
            r4 = 36
            androidx.profileinstaller.C0030.f30 = r4
        Ld9:
            java.lang.String r4 = "ۤۢ"
            r5 = r4
            r7 = r2
        Ldd:
            int r2 = android.view.C0007.m28(r5)
            r4 = r7
            r36 = r2
            goto L3c
        Le6:
            int r4 = kotlinx.coroutines.C0069.f69
            int r5 = com.google.android.material.chip.C0056.f56
            r4 = r4 | r5
            r5 = -1749796(0xffffffffffe54cdc, float:NaN)
            r5 = r5 ^ r4
            r4 = r2
            r36 = r5
            goto L3c
        Lf4:
            r5 = 0
            int r2 = com.github.megatronking.stringfog.xor.C0045.f45
            if (r2 < 0) goto L107
            com.google.android.material.internal.C0061.m244()
            java.lang.String r2 = "ۣۧۢ"
        Lfe:
            int r2 = com.google.android.material.carousel.C0054.m219(r2)
            r36 = r2
            r13 = r5
            goto L3c
        L107:
            int r2 = com.google.android.material.theme.C0064.f64
            int r7 = defpackage.C0071.f71
            r2 = r2 ^ r7
            r7 = -1748029(0xffffffffffe553c3, float:NaN)
            r2 = r2 ^ r7
            r36 = r2
            r13 = r5
            goto L3c
        L115:
            java.lang.String r11 = ""
            int r2 = defpackage.C0071.f71
            int r5 = androidx.appcompat.widget.C0013.f13
            int r2 = r2 % r5
            r5 = 1752677(0x1abe65, float:2.456024E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L124:
            r2 = 0
            r0 = r38
            r0.setResult(r2)     // Catch: java.lang.Throwable -> L710
            java.lang.String r2 = "ZZugDgW/975fnbsJK7n7tA==\n"
            java.lang.String r5 = "K/TUZ2PWlN8=\n"
            java.lang.String r22 = "NotificationHook"     // Catch: java.lang.Throwable -> L710
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L710
            r7.<init>()     // Catch: java.lang.Throwable -> L710
            java.lang.String r2 = "۟ۦۢ"
            r5 = r2
            r23 = r22
        L13c:
            int r2 = androidx.versionedparcelable.C0042.m170(r5)
            r22 = r7
            r36 = r2
            goto L3c
        L146:
            int r2 = androidx.profileinstaller.C0031.f31
            int r5 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r5 = r5 + 154
            int r2 = r2 + r5
            if (r2 > 0) goto L15b
            java.lang.String r2 = "ۣۦ"
            int r2 = com.google.android.material.theme.C0063.m254(r2)
            r35 = r24
            r36 = r2
            goto L3c
        L15b:
            java.lang.String r2 = "ۣ۟ۡ"
            int r2 = com.google.android.material.chip.C0057.m229(r2)
            r35 = r24
            r36 = r2
            goto L3c
        L167:
            java.lang.String r2 = "sEdmDw==\n"
            java.lang.String r5 = "8AYKY3HDUao=\n"
            java.lang.String r2 = "@All"     // Catch: java.lang.Throwable -> L710
            r5 = 1
            r0 = r21
            boolean r2 = defpackage.b50.B(r0, r2, r5)     // Catch: java.lang.Throwable -> L710
            if (r2 == 0) goto L272
            int r2 = com.ljx.wechatmod.auth.C0065.f65
            int r5 = com.google.android.material.carousel.C0052.f52
            int r2 = r2 + r5
            r5 = -1747884(0xffffffffffe55454, float:NaN)
            r2 = r2 ^ r5
            r36 = r2
            goto L3c
        L185:
            int r2 = com.google.android.material.carousel.C0055.f55
            int r5 = androidx.activity.result.C0008.f8
            int r2 = r2 * r5
            r5 = 1183421(0x120ebd, float:1.658326E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L192:
            int r2 = androidx.coordinatorlayout.widget.C0022.f22
            int r5 = kotlinx.coroutines.C0070.f70
            int r2 = r2 / r5
            r5 = -1746879(0xffffffffffe55841, float:NaN)
            r2 = r2 ^ r5
            r36 = r2
            goto L3c
        L19f:
            r0 = r34
            java.lang.CharSequence r2 = r0.tickerText     // Catch: java.lang.Throwable -> L710
            int r5 = androidx.constraintlayout.widget.C0018.f18
            if (r5 > 0) goto L1b6
            androidx.activity.C0011.m44()
            java.lang.String r5 = "ۥۦۨ"
            int r5 = androidx.appcompat.widget.C0014.m57(r5)
            r27 = r2
            r36 = r5
            goto L3c
        L1b6:
            int r5 = androidx.startup.C0037.f37
            int r7 = androidx.lifecycle.C0029.f29
            int r5 = r5 - r7
            r7 = 1753026(0x1abfc2, float:2.456513E-39)
            int r5 = r5 + r7
            r27 = r2
            r36 = r5
            goto L3c
        L1c5:
            int r2 = androidx.emoji2.text.C0026.f26
            if (r2 > 0) goto L1d7
            r2 = 15
            com.ljx.wechatmod.auth.C0065.f65 = r2
            java.lang.String r2 = "ۤۢ۠"
        L1cf:
            int r2 = androidx.versionedparcelable.C0040.m160(r2)
            r36 = r2
            goto L3c
        L1d7:
            int r2 = com.github.megatronking.stringfog.C0047.f47
            int r5 = androidx.core.widget.C0025.f25
            int r2 = r2 + r5
            r5 = 1751362(0x1ab942, float:2.454181E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L1e4:
            int r2 = com.github.megatronking.stringfog.xor.C0046.f46     // Catch: java.lang.Throwable -> L710
            r2 = r2 ^ 381(0x17d, float:5.34E-43)
            int r20 = r15 + r2
        L1ea:
            java.lang.String r2 = "ۡۡۤ"
            int r2 = androidx.coordinatorlayout.widget.C0021.m86(r2)
            r36 = r2
            goto L3c
        L1f4:
            if (r17 == 0) goto L218
            java.lang.String r9 = r17.toString()     // Catch: java.lang.Throwable -> L710
            int r2 = androidx.core.content.C0024.f24
            if (r2 > 0) goto L20b
            androidx.viewpager2.adapter.C0043.m172()
        L201:
            java.lang.String r2 = "ۣۡۤ"
            int r2 = androidx.activity.C0010.m43(r2)
            r36 = r2
            goto L3c
        L20b:
            int r2 = androidx.savedstate.C0034.f34
            int r5 = androidx.coordinatorlayout.widget.C0021.f21
            r2 = r2 ^ r5
            r5 = 1752891(0x1abf3b, float:2.456323E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L218:
            int r2 = androidx.coordinatorlayout.widget.C0021.f21
            int r5 = androidx.activity.C0010.f10
            int r2 = r2 + r5
            r5 = 1749923(0x1ab3a3, float:2.452164E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L225:
            java.lang.String r2 = "UKb3dio=\n"
            java.lang.String r5 = "IMeFF0e3ugY=\n"
            java.lang.String r2 = "param"
            r0 = r38
            defpackage.ip.o(r2, r0)
            java.lang.String r2 = "pDSLXSnjG6ykDpN2FO4Yow==\n"
            java.lang.String r5 = "z1HyAkuPdM8=\n"
            gn r7 = defpackage.gn.a
            boolean r2 = defpackage.z30.q(r2, r5, r7)
            if (r2 != 0) goto L6a9
            java.lang.String r2 = "ۤۦۢ"
            goto L1cf
        L241:
            if (r32 != 0) goto L456
            int r2 = androidx.recyclerview.widget.C0033.f33
            int r5 = com.google.android.material.theme.C0064.f64
            int r2 = r2 * r5
            r5 = 1722318(0x1a47ce, float:2.413482E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L250:
            int r2 = android.app.C0001.f1
            int r5 = com.google.android.material.datepicker.C0058.f58
            int r5 = r5 + 5923
            int r2 = r2 - r5
            if (r2 < 0) goto L26b
            android.app.C0000.m0()
            java.lang.String r2 = "ۤۦۢ"
            r8 = r9
            r5 = r14
            r7 = r15
        L261:
            int r2 = kotlinx.coroutines.C0069.m277(r2)
            r14 = r5
            r36 = r2
            r15 = r7
            goto L3c
        L26b:
            java.lang.String r2 = "ۣۧۢ"
            r5 = r2
            r7 = r4
            r8 = r9
            goto Ldd
        L272:
            int r2 = androidx.coordinatorlayout.widget.C0021.f21
            int r5 = androidx.appcompat.widget.C0016.f16
            r5 = r5 ^ (-490(0xfffffffffffffe16, float:NaN))
            int r2 = r2 / r5
            if (r2 > 0) goto L289
            r2 = 23
            androidx.versionedparcelable.C0040.f40 = r2
            java.lang.String r2 = "ۣۤۤ"
        L281:
            int r2 = androidx.coordinatorlayout.widget.C0022.m90(r2)
            r36 = r2
            goto L3c
        L289:
            java.lang.String r2 = "ۥۥۥ"
            r5 = r17
        L28d:
            int r2 = com.google.android.material.carousel.C0053.m213(r2)
            r17 = r5
            r36 = r2
            goto L3c
        L297:
            java.lang.String r2 = "🔕 成功静默拦截 @所有人 通知: "
            r0 = r22
            r0.append(r2)     // Catch: java.lang.Throwable -> L710
            int r2 = androidx.versionedparcelable.C0042.m169()
            if (r2 > 0) goto L2b1
            kotlinx.coroutines.C0070.m280()
            java.lang.String r2 = "ۥۡۢ"
            int r2 = com.google.android.material.carousel.C0055.m220(r2)
            r36 = r2
            goto L3c
        L2b1:
            java.lang.String r2 = "ۣۢۨ"
            int r2 = com.google.android.material.chip.C0056.m226(r2)
            r36 = r2
            goto L3c
        L2bb:
            int r2 = androidx.appcompat.widget.C0016.f16
            int r5 = androidx.appcompat.widget.C0016.f16
            int r2 = r2 - r5
            r5 = 1752550(0x1abde6, float:2.455846E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L2c8:
            int r2 = com.github.megatronking.stringfog.xor.C0046.m185()
            if (r2 > 0) goto L392
            java.lang.String r2 = "h8GeLYSXVYhmEOWZmU1dxE"
            java.lang.String r2 = android.support.v4.graphics.drawable.C0006.m27(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r5 = com.google.android.material.appbar.C0049.m199()
            if (r5 < 0) goto L2ea
            java.lang.String r5 = "ۨ۟ۡ"
            int r5 = com.ljx.wechatmod.auth.C0065.m263(r5)
            r25 = r2
            r36 = r5
            goto L3c
        L2ea:
            int r5 = com.google.android.material.theme.C0063.f63
            int r7 = io.fastkv.C0068.f68
            r5 = r5 | r7
            r7 = -1755744(0xffffffffffe535a0, float:NaN)
            r5 = r5 ^ r7
            r25 = r2
            r36 = r5
            goto L3c
        L2f9:
            java.lang.String r2 = "eTVHCouUKhkfbV1W\n"
            java.lang.String r5 = "lonn7AIUzIU=\n"
            java.lang.String r2 = "\uff20\u6240\u6709\u4eba"     // Catch: java.lang.Throwable -> L710
            r5 = 0
            r0 = r21
            boolean r2 = defpackage.b50.B(r0, r2, r5)     // Catch: java.lang.Throwable -> L710
            if (r2 != 0) goto L443
            int r2 = androidx.versionedparcelable.C0042.f42
            int r5 = com.github.megatronking.stringfog.xor.C0045.f45
            int r2 = r2 + r5
            r5 = -1752681(0xffffffffffe54197, float:NaN)
            r2 = r2 ^ r5
            r36 = r2
            goto L3c
        L317:
            int r2 = androidx.emoji2.text.C0026.f26
            int r5 = com.google.android.material.carousel.C0053.f53
            int r5 = r5 % (-6839)
            int r2 = r2 - r5
            if (r2 > 0) goto L32c
            java.lang.String r2 = "ۥۤ"
        L322:
            int r2 = com.google.android.material.appbar.C0049.m197(r2)
            r34 = r18
            r36 = r2
            goto L3c
        L32c:
            java.lang.String r2 = "ۥۢۢ"
            goto L322
        L32f:
            int r2 = com.google.android.material.chip.C0057.m230()
            if (r2 < 0) goto L33f
            java.lang.String r2 = "ۡۦۥ"
            int r2 = com.ljx.wechatmod.auth.C0065.m263(r2)
            r36 = r2
            goto L3c
        L33f:
            int r2 = androidx.versionedparcelable.C0042.f42
            int r5 = androidx.savedstate.C0034.f34
            int r2 = r2 - r5
            r5 = 1751537(0x1ab9f1, float:2.454426E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L34c:
            java.lang.String r2 = "ۨۥۨ"
            int r2 = com.google.android.material.floatingactionbutton.C0060.m241(r2)
            r31 = r32
            r36 = r2
            goto L3c
        L358:
            int r2 = com.google.android.material.internal.C0061.m244()
            if (r2 > 0) goto L36e
            r2 = 22
            defpackage.C0072.f72 = r2
            java.lang.String r2 = "ۧۢۤ"
            int r2 = com.github.megatronking.stringfog.annotation.C0044.m176(r2)
            r31 = r33
            r36 = r2
            goto L3c
        L36e:
            int r2 = com.google.android.material.carousel.C0055.f55
            int r5 = androidx.versionedparcelable.C0042.f42
            int r2 = r2 % r5
            r5 = 1755007(0x1ac77f, float:2.459289E-39)
            int r2 = r2 + r5
            r31 = r33
            r36 = r2
            goto L3c
        L37d:
            r0 = r30
            boolean r2 = r0 instanceof android.app.Notification     // Catch: java.lang.Throwable -> L710
            if (r2 == 0) goto L768
            int r2 = com.google.android.material.chip.C0056.f56
            int r3 = androidx.versionedparcelable.C0038.f38
            int r2 = r2 - r3
            r3 = 1755277(0x1ac88d, float:2.459667E-39)
            r2 = r2 ^ r3
            r3 = r30
            r36 = r2
            goto L3c
        L392:
            int r2 = android.app.C0003.f3
            if (r2 > 0) goto L3a4
            r2 = 49
            androidx.versionedparcelable.C0042.f42 = r2
            java.lang.String r2 = "۠ۨۦ"
        L39c:
            int r2 = androidx.constraintlayout.widget.C0020.m80(r2)
            r36 = r2
            goto L3c
        L3a4:
            java.lang.String r2 = "۠۠ۦ"
            goto L281
        L3a8:
            int r2 = defpackage.C0071.f71
            int r5 = kotlinx.coroutines.C0070.f70
            int r2 = r2 / r5
            r5 = 1752551(0x1abde7, float:2.455847E-39)
            int r2 = r2 + r5
            r10 = r35
            r36 = r2
            goto L3c
        L3b7:
            java.lang.String r2 = "۠ۧۢ"
        L3b9:
            int r2 = androidx.constraintlayout.widget.C0018.m73(r2)
            r36 = r2
            goto L3c
        L3c1:
            int r2 = androidx.recyclerview.widget.C0032.f32
            int r5 = kotlinx.coroutines.C0070.f70
            r5 = r5 ^ 9368(0x2498, float:1.3127E-41)
            int r2 = r2 % r5
            if (r2 < 0) goto L3db
            r2 = 0
            com.google.android.material.theme.C0064.f64 = r2
            java.lang.String r2 = "ۥۣ"
            r5 = r16
        L3d1:
            int r2 = androidx.activity.C0010.m43(r2)
            r16 = r5
            r36 = r2
            goto L3c
        L3db:
            java.lang.String r2 = "ۥۡۢ"
            r5 = r16
            goto L3d1
        L3e0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L710
            r6.<init>()     // Catch: java.lang.Throwable -> L710
            int r2 = com.ljx.wechatmod.hook.C0066.f66
            if (r2 > 0) goto L3f3
            java.lang.String r2 = "ۣۢۡ"
            int r2 = androidx.profileinstaller.C0031.m127(r2)
            r36 = r2
            goto L3c
        L3f3:
            java.lang.String r2 = "ۢۥ"
            r5 = r2
            r7 = r4
            goto Ldd
        L3f9:
            int r2 = com.google.android.material.carousel.C0053.f53
            int r5 = com.github.megatronking.stringfog.annotation.C0044.f44
            r2 = r2 | r5
            r5 = 1754251(0x1ac48b, float:2.458229E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L406:
            if (r24 != 0) goto L42e
            int r2 = androidx.activity.result.C0009.f9
            int r5 = android.support.v4.graphics.drawable.C0006.f6
            int r2 = r2 / r5
            r5 = -1752578(0xffffffffffe541fe, float:NaN)
            r2 = r2 ^ r5
            r10 = r11
            r36 = r2
            goto L3c
        L416:
            r0 = r19
            if (r15 >= r0) goto L7b6
            r30 = r4[r15]     // Catch: java.lang.Throwable -> L710
            int r2 = com.google.android.material.datepicker.C0058.f58
            int r5 = com.google.android.material.theme.C0062.f62
            int r2 = r2 % r5
            r5 = 1745990(0x1aa446, float:2.446653E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L429:
            if (r34 != 0) goto L7ca
        L42b:
            java.lang.String r2 = "ۧۢۦ"
            goto L3b9
        L42e:
            int r2 = androidx.activity.result.C0009.f9
            if (r2 < 0) goto L438
            java.lang.String r2 = "ۣۨۡ"
            r5 = r17
            goto L28d
        L438:
            java.lang.String r2 = "ۢۧۦ"
            r5 = r2
        L43b:
            int r2 = androidx.versionedparcelable.C0038.m153(r5)
            r36 = r2
            goto L3c
        L443:
            int r2 = com.google.android.material.carousel.C0052.f52
            int r5 = com.google.android.material.carousel.C0052.f52
            int r2 = r2 - r5
            r5 = 1755338(0x1ac8ca, float:2.459752E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L450:
            java.lang.String r2 = "ۥۡۢ"
            r3 = r12
            r5 = r13
            goto Lfe
        L456:
            java.lang.String r2 = "ۧ۟ۢ"
            r5 = r16
            goto L3d1
        L45c:
            int r2 = androidx.core.content.C0023.f23
            if (r2 > 0) goto L46e
            r2 = 44
            androidx.profileinstaller.C0030.f30 = r2
            java.lang.String r2 = "ۦ۠ۥ"
            int r2 = android.app.C0001.m5(r2)
            r36 = r2
            goto L3c
        L46e:
            int r2 = androidx.activity.result.C0009.f9
            int r5 = android.app.C0003.f3
            int r2 = r2 % r5
            r5 = 1755552(0x1ac9a0, float:2.460052E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L47b:
            java.lang.String r2 = "ۣۤۤ"
            r5 = r16
            goto L3d1
        L481:
            int r2 = androidx.appcompat.app.C0012.f12
            if (r2 > 0) goto L495
            r2 = 19
            androidx.versionedparcelable.C0040.f40 = r2
            java.lang.String r2 = "ۢۢ۠"
            int r2 = com.ljx.wechatmod.ui.C0067.m271(r2)
            r34 = r14
            r36 = r2
            goto L3c
        L495:
            int r2 = com.ljx.wechatmod.hook.C0066.f66
            int r5 = androidx.constraintlayout.helper.widget.C0017.f17
            int r2 = r2 / r5
            r5 = 1749851(0x1ab35b, float:2.452064E-39)
            int r2 = r2 + r5
            r34 = r14
            r36 = r2
            goto L3c
        L4a4:
            java.lang.String r2 = "ۦۡۤ"
            r5 = r2
            r7 = r4
            r10 = r11
            goto Ldd
        L4ab:
            if (r29 == 0) goto L7c0
            int r2 = androidx.viewpager2.adapter.C0043.m172()
            if (r2 < 0) goto L201
            r2 = 91
            androidx.appcompat.app.C0012.f12 = r2
            java.lang.String r2 = "ۥۥۥ"
            int r2 = androidx.profileinstaller.C0030.m120(r2)
            r36 = r2
            goto L3c
        L4c1:
            boolean r2 = r3 instanceof android.app.Notification     // Catch: java.lang.Throwable -> L710
            if (r2 == 0) goto L69f
            r0 = r3
            android.app.Notification r0 = (android.app.Notification) r0     // Catch: java.lang.Throwable -> L710
            r2 = r0
            int r5 = android.app.C0003.m14()
            if (r5 < 0) goto L4dc
            java.lang.String r5 = "ۥۢۢ"
            r7 = r2
        L4d2:
            int r2 = android.app.C0001.m5(r5)
            r18 = r7
            r36 = r2
            goto L3c
        L4dc:
            java.lang.String r5 = "ۥۥۡ"
            r7 = r2
            goto L4d2
        L4e0:
            int r2 = androidx.activity.C0010.f10
            if (r2 < 0) goto L4f1
            androidx.savedstate.C0035.m143()
        L4e7:
            java.lang.String r2 = "ۢۢ"
            int r2 = androidx.viewpager2.adapter.C0043.m173(r2)
            r36 = r2
            goto L3c
        L4f1:
            int r2 = androidx.savedstate.C0034.f34
            int r5 = androidx.core.content.C0023.f23
            int r2 = r2 + r5
            r5 = 1747094(0x1aa896, float:2.4482E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L4fe:
            int r2 = android.app.C0002.f2
            int r5 = androidx.coordinatorlayout.widget.C0021.f21
            int r5 = r5 + 7368
            int r2 = r2 / r5
            if (r2 == 0) goto L513
            java.lang.String r2 = "ۢۡۥ"
            int r2 = androidx.appcompat.app.C0012.m50(r2)
            r8 = r16
            r36 = r2
            goto L3c
        L513:
            r8 = r16
        L515:
            java.lang.String r2 = "ۨۥۡ"
            int r2 = com.google.android.material.datepicker.C0059.m239(r2)
            r36 = r2
            goto L3c
        L51f:
            java.io.PrintStream r2 = java.lang.System.out
            r0 = r25
            r2.println(r0)
            int r2 = com.google.android.material.datepicker.C0058.f58
            int r5 = androidx.constraintlayout.widget.C0020.f20
            int r2 = r2 % r5
            r5 = 1747593(0x1aaa89, float:2.4489E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L533:
            java.lang.String r2 = "Yvu7iw==\n"
            java.lang.String r5 = "A4nc+Ajj1jw=\n"
            java.lang.String r2 = "args"     // Catch: java.lang.Throwable -> L710
            defpackage.ip.n(r2, r4)     // Catch: java.lang.Throwable -> L710
            int r0 = r4.length     // Catch: java.lang.Throwable -> L710
            r19 = r0
            int r2 = androidx.versionedparcelable.C0041.f41
            if (r2 > 0) goto L54f
            java.lang.String r2 = "۟۟ۤ"
            int r2 = androidx.lifecycle.C0029.m116(r2)
            r36 = r2
            goto L3c
        L54f:
            java.lang.String r2 = "ۡ۠ۧ"
            r5 = r2
            r7 = r18
            goto L4d2
        L556:
            if (r9 != 0) goto L45c
            int r2 = com.google.android.material.chip.C0057.m230()
            if (r2 < 0) goto L56b
            androidx.versionedparcelable.C0038.m155()
        L561:
            java.lang.String r2 = "ۥۨۥ"
            int r2 = com.google.android.material.internal.C0061.m246(r2)
            r36 = r2
            goto L3c
        L56b:
            int r2 = androidx.profileinstaller.C0031.f31
            int r5 = com.google.android.material.appbar.C0049.f49
            int r2 = r2 + r5
            r5 = 1748851(0x1aaf73, float:2.450662E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L578:
            java.lang.String r2 = "53vj\n"
            java.lang.String r5 = "igiEy7e+YPk=\n"
            java.lang.String r2 = "msg"     // Catch: java.lang.Throwable -> L710
            r0 = r28
            defpackage.ip.o(r2, r0)     // Catch: java.lang.Throwable -> L710
            int r2 = com.google.android.material.chip.C0057.f57
            if (r2 < 0) goto L593
            java.lang.String r2 = "ۨ۠ۡ"
            int r2 = com.ljx.wechatmod.hook.C0066.m264(r2)
            r36 = r2
            goto L3c
        L593:
            int r2 = androidx.lifecycle.C0029.f29
            int r5 = com.google.android.material.datepicker.C0059.f59
            int r2 = r2 % r5
            r5 = 1751865(0x1abb39, float:2.454886E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L5a0:
            java.lang.String r2 = "xwGO\n"
            java.lang.String r5 = "s2Dpd1+FjZU=\n"
            java.lang.String r2 = "tag"     // Catch: java.lang.Throwable -> L710
            r0 = r23
            defpackage.ip.o(r2, r0)     // Catch: java.lang.Throwable -> L710
            java.lang.String r2 = "ۥۦۦ"
            int r2 = androidx.versionedparcelable.C0041.m164(r2)
            r36 = r2
            goto L3c
        L5b7:
            int r2 = android.app.C0001.f1
            if (r2 < 0) goto L5c1
            r2 = 74
            androidx.savedstate.C0034.f34 = r2
            goto L515
        L5c1:
            java.lang.String r2 = "۠۟ۨ"
            goto L39c
        L5c5:
            if (r29 == 0) goto L218
            java.lang.String r2 = "ch5V2Uu3d8dnFUnf\n"
            java.lang.String r5 = "E3AxqyTeE+k=\n"
            java.lang.String r2 = "android.text"     // Catch: java.lang.Throwable -> L710
            r0 = r29
            java.lang.CharSequence r5 = r0.getCharSequence(r2)     // Catch: java.lang.Throwable -> L710
            int r2 = androidx.constraintlayout.helper.widget.C0017.m71()
            if (r2 > 0) goto L5eb
            r2 = 39
            com.google.android.material.theme.C0063.f63 = r2
            java.lang.String r2 = "ۨۥۨ"
            int r2 = androidx.startup.C0037.m149(r2)
            r17 = r5
            r36 = r2
            goto L3c
        L5eb:
            java.lang.String r2 = "ۣۤۧ"
            goto L28d
        L5ef:
            r6.append(r8)     // Catch: java.lang.Throwable -> L710
            int r2 = androidx.profileinstaller.C0030.m121()
            if (r2 < 0) goto L602
            java.lang.String r2 = "ۥ۟"
            int r2 = com.google.android.material.carousel.C0053.m213(r2)
            r36 = r2
            goto L3c
        L602:
            int r2 = com.google.android.material.datepicker.C0059.f59
            int r5 = android.app.C0001.f1
            int r2 = r2 / r5
            r5 = 1751492(0x1ab9c4, float:2.454363E-39)
            r2 = r2 ^ r5
            r36 = r2
            goto L3c
        L60f:
            r0 = r34
            android.os.Bundle r2 = r0.extras     // Catch: java.lang.Throwable -> L710
            int r5 = androidx.startup.C0037.f37
            if (r5 < 0) goto L61a
            android.app.C0000.m0()
        L61a:
            java.lang.String r5 = "ۣۤۤ"
            int r5 = kotlinx.coroutines.C0069.m277(r5)
            r29 = r2
            r36 = r5
            goto L3c
        L626:
            java.lang.String r2 = "c6ExMBsJ5l+J/Q==\n"
            java.lang.String r5 = "M0e4sP2Vb7s=\n"
            java.lang.String r2 = "@\u6240\u6709\u4eba"     // Catch: java.lang.Throwable -> L710
            r5 = 0
            r0 = r21
            boolean r2 = defpackage.b50.B(r0, r2, r5)     // Catch: java.lang.Throwable -> L710
            if (r2 != 0) goto L443
            int r2 = androidx.constraintlayout.widget.C0019.f19
            int r5 = androidx.appcompat.widget.C0013.f13
            int r5 = r5 * (-7253)
            int r2 = r2 + r5
            if (r2 > 0) goto L645
            io.fastkv.C0068.m273()
            goto L42b
        L645:
            java.lang.String r2 = "۠ۤۨ"
        L647:
            int r2 = androidx.appcompat.app.C0012.m50(r2)
            r36 = r2
            goto L3c
        L64f:
            r0 = r31
            r6.append(r0)     // Catch: java.lang.Throwable -> L710
            int r2 = com.github.megatronking.stringfog.C0047.f47
            if (r2 >= 0) goto L1ea
            r2 = r4
            goto Ld9
        L65b:
            r6.append(r10)     // Catch: java.lang.Throwable -> L710
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L710
            int r5 = androidx.recyclerview.widget.C0033.f33
            if (r5 > 0) goto L671
            com.google.android.material.carousel.C0052.m210()
        L669:
            java.lang.String r5 = "۟ۢۨ"
            r7 = r22
            r21 = r2
            goto L13c
        L671:
            java.lang.String r5 = "ۤۡۥ"
            r21 = r2
            goto L43b
        L677:
            int r2 = androidx.savedstate.C0034.f34
            if (r2 < 0) goto L68b
            r2 = 57
            androidx.constraintlayout.widget.C0018.f18 = r2
            java.lang.String r2 = "ۣۨۡ"
            int r2 = android.app.C0002.m8(r2)
            r36 = r2
            r15 = r20
            goto L3c
        L68b:
            r15 = r20
            goto L4e7
        L68f:
            java.lang.String r5 = ""
            java.lang.String r2 = "ۤ۠ۤ"
            goto L3d1
        L695:
            java.lang.String r2 = "ۧۧ"
            int r2 = androidx.appcompat.widget.C0016.m65(r2)
            r36 = r2
            goto L3c
        L69f:
            java.lang.String r2 = "ۣۤۥ"
            int r2 = androidx.constraintlayout.helper.widget.C0017.m70(r2)
            r36 = r2
            goto L3c
        L6a9:
            int r2 = androidx.activity.result.C0008.f8
            int r5 = androidx.legacy.content.C0028.f28
            int r5 = r5 / 168
            int r2 = r2 * r5
            if (r2 > 0) goto L6bb
            r2 = 43
            androidx.coordinatorlayout.widget.C0022.f22 = r2
            java.lang.String r2 = "ۣۡۦ"
            r5 = r2
            goto L43b
        L6bb:
            int r2 = com.google.android.material.internal.C0061.f61
            int r5 = com.google.android.material.floatingactionbutton.C0060.f60
            int r2 = r2 % r5
            r5 = 56036(0xdae4, float:7.8523E-41)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L6c8:
            java.lang.String r33 = ""
            int r2 = io.fastkv.C0068.f68
            int r5 = androidx.versionedparcelable.C0041.f41
            int r2 = r2 + r5
            r5 = 1751092(0x1ab834, float:2.453803E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L6d7:
            int r2 = android.app.C0001.f1
            int r5 = com.google.android.material.internal.C0061.f61
            r2 = r2 | r5
            r5 = 1748771(0x1aaf23, float:2.45055E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L6e4:
            if (r27 == 0) goto L2bb
            java.lang.String r5 = r27.toString()     // Catch: java.lang.Throwable -> L710
            java.lang.String r2 = "ۢ۟ۢ"
        L6ec:
            int r2 = com.google.android.material.theme.C0063.m254(r2)
            r24 = r5
            r36 = r2
            goto L3c
        L6f6:
            r0 = r22
            r1 = r21
            r0.append(r1)     // Catch: java.lang.Throwable -> L710
            java.lang.String r2 = r22.toString()     // Catch: java.lang.Throwable -> L710
            int r5 = android.app.C0003.f3
            int r7 = android.support.v4.graphics.drawable.C0006.f6
            r5 = r5 ^ r7
            r7 = 56978(0xde92, float:7.9843E-41)
            r5 = r5 ^ r7
            r28 = r2
            r36 = r5
            goto L3c
        L710:
            r2 = move-exception
            java.lang.String r2 = "Nwje\n"
            java.lang.String r3 = "Q2m5jaPP2Zc=\n"
            java.lang.String r4 = "Neg71qYJaEEP7iDRiA9kSw==\n"
            java.lang.String r5 = "e4dPv8BgCyA=\n"
            java.lang.String r4 = "NotificationHook"
            java.lang.String r5 = "Fg==\n"
            java.lang.String r6 = "c8HJlSTQVfc=\n"
            defpackage.z30.o(r2, r3, r4, r5, r6)
        L724:
            return
        L725:
            int r2 = androidx.appcompat.widget.C0013.f13
            int r5 = androidx.coordinatorlayout.widget.C0022.f22
            int r5 = r5 + 4307
            r2 = r2 | r5
            if (r2 < 0) goto L73c
            r2 = 22
            androidx.versionedparcelable.C0042.f42 = r2
            java.lang.String r2 = "ۣۤۧ"
            int r2 = com.google.android.material.floatingactionbutton.C0060.m241(r2)
            r36 = r2
            goto L3c
        L73c:
            int r2 = androidx.coordinatorlayout.widget.C0021.f21
            int r5 = androidx.versionedparcelable.C0040.f40
            int r2 = r2 % r5
            r5 = -1751852(0xffffffffffe544d4, float:NaN)
            r2 = r2 ^ r5
            r36 = r2
            goto L3c
        L749:
            java.lang.String r2 = " | "
            r6.append(r2)     // Catch: java.lang.Throwable -> L710
            int r2 = android.support.v4.graphics.drawable.C0004.f4
            int r5 = io.fastkv.C0068.f68
            r5 = r5 ^ (-5562(0xffffffffffffea46, float:NaN))
            r2 = r2 ^ r5
            if (r2 < 0) goto L764
            androidx.versionedparcelable.C0040.m162()
            java.lang.String r2 = "۟ۤۢ"
            int r2 = com.github.megatronking.stringfog.annotation.C0044.m176(r2)
            r36 = r2
            goto L3c
        L764:
            r2 = r21
            goto L669
        L768:
            int r2 = com.google.android.material.floatingactionbutton.C0060.f60
            int r5 = androidx.viewpager2.adapter.C0043.f43
            r5 = r5 | (-4594(0xffffffffffffee0e, float:NaN))
            int r2 = r2 * r5
            if (r2 < 0) goto L779
            r2 = 53
            com.google.android.material.theme.C0063.f63 = r2
            java.lang.String r2 = "ۡۢۢ"
            goto L647
        L779:
            int r2 = com.google.android.material.internal.C0061.f61
            int r5 = android.app.C0000.f0
            int r2 = r2 - r5
            r5 = -1754455(0xffffffffffe53aa9, float:NaN)
            r2 = r2 ^ r5
            r36 = r2
            goto L3c
        L786:
            java.lang.String r2 = " | "
            r6.append(r2)     // Catch: java.lang.Throwable -> L710
            int r2 = android.app.C0000.m0()
            if (r2 < 0) goto L561
            androidx.constraintlayout.widget.C0020.m82()
            java.lang.String r2 = "ۨ۟ۧ"
            int r2 = com.github.megatronking.stringfog.C0047.m189(r2)
            r36 = r2
            goto L3c
        L79e:
            r5 = 0
            int r2 = androidx.appcompat.widget.C0014.f14
            if (r2 < 0) goto L7b1
            android.app.C0003.m14()
            java.lang.String r2 = "۠ۤۨ"
            int r2 = androidx.constraintlayout.widget.C0018.m73(r2)
            r14 = r5
            r36 = r2
            goto L3c
        L7b1:
            java.lang.String r2 = "۟ۥۥ"
            r7 = r15
            goto L261
        L7b6:
            java.lang.String r2 = "ۥۧۡ"
            int r2 = com.github.megatronking.stringfog.C0047.m189(r2)
            r36 = r2
            goto L3c
        L7c0:
            java.lang.String r2 = "ۥ۠ۧ"
            int r2 = androidx.viewpager2.adapter.C0043.m173(r2)
            r36 = r2
            goto L3c
        L7ca:
            int r2 = com.github.megatronking.stringfog.xor.C0046.f46
            int r5 = androidx.startup.C0037.f37
            int r5 = r5 + 7586
            int r2 = r2 - r5
            if (r2 < 0) goto L7dc
            com.google.android.material.carousel.C0055.m223()
            java.lang.String r2 = "ۧ۠ۤ"
            r5 = r24
            goto L6ec
        L7dc:
            int r2 = androidx.versionedparcelable.C0040.f40
            int r5 = androidx.core.content.C0023.f23
            r2 = r2 | r5
            r5 = 57089(0xdf01, float:7.9999E-41)
            r2 = r2 ^ r5
            r36 = r2
            goto L3c
        L7e9:
            r12 = 0
            int r2 = com.google.android.material.floatingactionbutton.C0060.f60
            int r5 = androidx.constraintlayout.widget.C0018.f18
            int r2 = r2 * r5
            r5 = 1553184(0x17b320, float:2.176474E-39)
            int r2 = r2 + r5
            r36 = r2
            goto L3c
        L7f7:
            java.lang.String r2 = "ۧۧۦ"
            r5 = r14
            r7 = r13
            goto L261
    }

    private final void c(de.robv.android.xposed.XC_MethodHook.MethodHookParam r15) {
            r14 = this;
            r0 = 0
            r2 = 0
            r8 = 0
            r1 = 0
            r9 = 0
            r5 = 0
            r6 = 0
            r4 = 0
            r3 = 0
            r7 = 0
            java.lang.String r10 = "ۧ۟ۥ"
            int r12 = com.google.android.material.behavior.C0050.m203(r10)
            r10 = r0
            r11 = r2
        L12:
            switch(r12) {
                case 56291: goto L16;
                case 56419: goto L96;
                case 56568: goto L23d;
                case 1746688: goto L2a6;
                case 1746726: goto L23d;
                case 1746939: goto L1d5;
                case 1747781: goto L1a9;
                case 1748641: goto L1f0;
                case 1748676: goto L220;
                case 1748864: goto L2c;
                case 1749668: goto L60;
                case 1750569: goto L79;
                case 1750624: goto L284;
                case 1751686: goto L140;
                case 1751775: goto Laf;
                case 1752609: goto L113;
                case 1753478: goto L45;
                case 1753516: goto L26d;
                case 1753546: goto L249;
                case 1753696: goto Lcd;
                case 1754381: goto L14c;
                case 1754570: goto L1bf;
                case 1754662: goto L1b5;
                case 1755370: goto Lcd;
                case 1755376: goto L121;
                case 1755431: goto L96;
                default: goto L15;
            }
        L15:
            goto L12
        L16:
            r1.getClass()     // Catch: java.lang.Throwable -> Lef
            int r0 = defpackage.gn.b(r10, r5)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lef
            int r0 = com.github.megatronking.stringfog.C0047.f47
            int r2 = com.google.android.material.datepicker.C0058.f58
            int r0 = r0 / r2
            r2 = 1753478(0x1ac186, float:2.457146E-39)
            r0 = r0 ^ r2
            r12 = r0
            goto L12
        L2c:
            java.lang.Object[] r0 = r15.args
            r2 = 0
            r0[r2] = r3
            int r0 = androidx.activity.result.C0009.f9
            int r2 = androidx.constraintlayout.widget.C0019.f19
            int r2 = r2 % (-1655)
            r0 = r0 | r2
            if (r0 < 0) goto L277
            androidx.coordinatorlayout.widget.C0022.m88()
            java.lang.String r0 = "ۨ۠"
            int r0 = com.google.android.material.theme.C0062.m249(r0)
            r12 = r0
            goto L12
        L45:
            int r0 = androidx.versionedparcelable.C0039.f39
            if (r0 < 0) goto L56
            r0 = 19
            androidx.activity.result.C0008.f8 = r0
            java.lang.String r0 = "ۦۣۧ"
            int r0 = android.support.v4.graphics.drawable.C0005.m23(r0)
            r7 = r6
            r12 = r0
            goto L12
        L56:
            java.lang.String r0 = "ۦۣۧ"
            r2 = r6
        L59:
            int r0 = androidx.viewpager2.adapter.C0043.m173(r0)
            r7 = r2
            r12 = r0
            goto L12
        L60:
            int r0 = androidx.versionedparcelable.C0042.f42
            if (r0 < 0) goto L70
            android.app.C0000.m0()
            java.lang.String r0 = "ۧۨۧ"
            r3 = r4
        L6a:
            int r0 = com.github.megatronking.stringfog.C0048.m193(r0)
            r12 = r0
            goto L12
        L70:
            java.lang.String r0 = "ۡۧۦ"
            r3 = r4
        L73:
            int r0 = com.google.android.material.chip.C0056.m226(r0)
            r12 = r0
            goto L12
        L79:
            int r0 = androidx.lifecycle.C0029.m118()
            if (r0 > 0) goto L8a
            androidx.appcompat.widget.C0014.m58()
            java.lang.String r0 = "ۣۤۨ"
            int r0 = androidx.coordinatorlayout.widget.C0021.m86(r0)
            r12 = r0
            goto L12
        L8a:
            int r0 = androidx.emoji2.text.C0026.f26
            int r2 = android.app.C0003.f3
            int r0 = r0 % r2
            r2 = 55609(0xd939, float:7.7925E-41)
            int r0 = r0 + r2
            r12 = r0
            goto L12
        L96:
            int r0 = androidx.versionedparcelable.C0038.m155()
            if (r0 > 0) goto La3
            r0 = 94
            androidx.activity.C0010.f10 = r0
            java.lang.String r0 = "ۧۡ"
            goto L73
        La3:
            int r0 = com.github.megatronking.stringfog.xor.C0045.f45
            int r2 = androidx.constraintlayout.helper.widget.C0017.f17
            int r0 = r0 / r2
            r2 = 1748864(0x1aaf80, float:2.45068E-39)
            int r0 = r0 + r2
            r12 = r0
            goto L12
        Laf:
            java.lang.String r0 = "bKpB27X0yOViu2fyo/k=\n"
            java.lang.String r2 = "B884hMKVpIk=\n"
            java.lang.String r0 = "key_wallet_val"
            java.lang.String r2 = "oP6u5vYqD2ug\n"
            java.lang.String r10 = "mceX388TIVI=\n"
            java.lang.String r2 = "999999.99"
            int r10 = com.google.android.material.chip.C0057.f57
            int r11 = android.app.C0001.f1
            r10 = r10 | r11
            r11 = -1748490(0xffffffffffe551f6, float:NaN)
            r12 = r10 ^ r11
            r10 = r0
            r11 = r2
            goto L12
        Lcd:
            int r0 = androidx.recyclerview.widget.C0033.f33
            int r2 = androidx.coordinatorlayout.widget.C0021.f21
            int r2 = r2 / 6331
            r0 = r0 ^ r2
            if (r0 > 0) goto Le3
            r0 = 28
            android.app.C0001.f1 = r0
            java.lang.String r0 = "۠ۡ۠"
            int r0 = androidx.activity.C0011.m45(r0)
            r12 = r0
            goto L12
        Le3:
            int r0 = androidx.versionedparcelable.C0040.f40
            int r2 = androidx.core.widget.C0025.f25
            int r0 = r0 * r2
            r2 = 472343(0x73517, float:6.61894E-40)
            int r0 = r0 + r2
            r12 = r0
            goto L12
        Lef:
            r0 = move-exception
            int r0 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r2 = android.app.C0001.f1
            int r2 = r2 + 9599
            int r0 = r0 * r2
            if (r0 > 0) goto L106
            androidx.appcompat.widget.C0016.m66()
            java.lang.String r0 = "ۨ۠ۢ"
            int r0 = androidx.constraintlayout.widget.C0018.m73(r0)
            r7 = r11
            r12 = r0
            goto L12
        L106:
            int r0 = com.google.android.material.datepicker.C0059.f59
            int r2 = com.ljx.wechatmod.ui.C0067.f67
            int r0 = r0 * r2
            r2 = 1637894(0x18fe06, float:2.295178E-39)
            int r0 = r0 + r2
            r7 = r11
            r12 = r0
            goto L12
        L113:
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> L180
            r0.getClass()     // Catch: java.lang.Throwable -> L180
            java.lang.String r0 = "ۣۢ۟"
            int r0 = defpackage.C0073.m292(r0)
            r12 = r0
            goto L12
        L121:
            int r0 = com.github.megatronking.stringfog.xor.C0045.m181()
            if (r0 > 0) goto L134
            r0 = 99
            androidx.activity.C0010.f10 = r0
            java.lang.String r0 = "ۨ۟ۨ"
            int r0 = android.support.v4.graphics.drawable.C0005.m23(r0)
            r12 = r0
            goto L12
        L134:
            int r0 = com.ljx.wechatmod.hook.C0066.f66
            int r2 = androidx.appcompat.widget.C0016.f16
            int r0 = r0 / r2
            r2 = 1746687(0x1aa6ff, float:2.44763E-39)
            int r0 = r0 + r2
            r12 = r0
            goto L12
        L140:
            int r0 = defpackage.C0071.f71
            int r2 = com.google.android.material.theme.C0064.f64
            int r0 = r0 - r2
            r2 = -1753944(0xffffffffffe53ca8, float:NaN)
            r0 = r0 ^ r2
            r12 = r0
            goto L12
        L14c:
            java.lang.String r0 = "6g==\n"
            java.lang.String r2 = "mkXc09L/9uw=\n"
            java.lang.String r0 = "p"
            defpackage.ip.o(r0, r15)
            java.lang.String r0 = "01/5CExSJnbdTt84VQ==\n"
            java.lang.String r2 = "uDqAVzszSho=\n"
            java.lang.String r0 = "key_wallet_on"
            boolean r0 = defpackage.gt.i(r0)
            if (r0 == 0) goto L121
            int r0 = com.google.android.material.theme.C0064.f64
            int r2 = androidx.core.content.C0023.f23
            r2 = r2 ^ (-5141(0xffffffffffffebeb, float:NaN))
            int r0 = r0 % r2
            if (r0 > 0) goto L177
            r0 = 96
            com.github.megatronking.stringfog.xor.C0045.f45 = r0
            java.lang.String r0 = "ۣ۠ۨ"
            r2 = r7
            goto L59
        L177:
            java.lang.String r0 = "ۣۤۨ"
        L179:
            int r0 = com.google.android.material.carousel.C0052.m209(r0)
            r12 = r0
            goto L12
        L180:
            r0 = move-exception
            gn r2 = defpackage.gn.a     // Catch: java.lang.Throwable -> Lef
            java.lang.Integer r0 = defpackage.b50.R(r11)     // Catch: java.lang.Throwable -> Lef
            if (r0 == 0) goto L140
            int r5 = r0.intValue()     // Catch: java.lang.Throwable -> Lef
            int r0 = com.google.android.material.behavior.C0050.f50
            int r1 = androidx.versionedparcelable.C0042.f42
            r1 = r1 | 4645(0x1225, float:6.509E-42)
            int r0 = r0 / r1
            if (r0 == 0) goto L1a4
            r0 = 44
            com.google.android.material.datepicker.C0059.f59 = r0
            java.lang.String r0 = "ۣ۠ۦ"
            int r0 = androidx.lifecycle.C0029.m116(r0)
            r1 = r2
            r12 = r0
            goto L12
        L1a4:
            java.lang.String r0 = "ۨ۠ۢ"
            r1 = r2
            goto L6a
        L1a9:
            int r0 = com.github.megatronking.stringfog.C0047.f47
            int r2 = androidx.savedstate.C0035.f35
            r0 = r0 ^ r2
            r2 = 1755006(0x1ac77e, float:2.459287E-39)
            int r0 = r0 + r2
            r12 = r0
            goto L12
        L1b5:
            java.lang.String r0 = "۟ۢ"
            r5 = r9
        L1b8:
            int r0 = android.support.v4.graphics.drawable.C0004.m16(r0)
            r12 = r0
            goto L12
        L1bf:
            int r0 = androidx.constraintlayout.widget.C0018.f18
            if (r0 > 0) goto L1d1
            r0 = 90
            android.support.v4.graphics.drawable.C0005.f5 = r0
            java.lang.String r0 = "ۤۥۧ"
            int r0 = androidx.constraintlayout.widget.C0020.m80(r0)
            r3 = r8
            r12 = r0
            goto L12
        L1d1:
            java.lang.String r0 = "ۣ۠ۦ"
            r3 = r8
            goto L1b8
        L1d5:
            int r0 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r2 = com.google.android.material.theme.C0063.f63
            r2 = r2 ^ (-1569(0xfffffffffffff9df, float:NaN))
            int r0 = r0 * r2
            if (r0 < 0) goto L1e4
            com.google.android.material.theme.C0062.m248()
            java.lang.String r0 = "ۤۦۢ"
            goto L1b8
        L1e4:
            int r0 = com.google.android.material.carousel.C0052.f52
            int r2 = androidx.core.widget.C0025.f25
            int r0 = r0 * r2
            r2 = 2179308(0x2140ec, float:3.053861E-39)
            int r0 = r0 + r2
            r12 = r0
            goto L12
        L1f0:
            java.lang.String r0 = "3f5Z\n"
            java.lang.String r2 = "tpsgeLwwj7M=\n"
            java.lang.String r12 = "lNdk\n"
            java.lang.String r13 = "8LICxVL6724=\n"
            java.lang.String r0 = defpackage.z30.k(r0, r2, r10, r12, r13)
            defpackage.ip.o(r0, r11)
            int r0 = androidx.appcompat.app.C0012.f12
            int r2 = com.google.android.material.carousel.C0054.f54
            r2 = r2 | 7892(0x1ed4, float:1.1059E-41)
            int r0 = r0 % r2
            if (r0 > 0) goto L214
            androidx.appcompat.app.C0012.m51()
            java.lang.String r0 = "ۦۨۢ"
            int r0 = defpackage.C0072.m288(r0)
            r12 = r0
            goto L12
        L214:
            int r0 = com.ljx.wechatmod.ui.C0067.f67
            int r2 = androidx.constraintlayout.helper.widget.C0017.f17
            r0 = r0 ^ r2
            r2 = -1752174(0xffffffffffe54392, float:NaN)
            r0 = r0 ^ r2
            r12 = r0
            goto L12
        L220:
            int r0 = com.google.android.material.theme.C0062.f62
            int r2 = androidx.activity.result.C0008.f8
            r2 = r2 | (-4756(0xffffffffffffed6c, float:NaN))
            int r0 = r0 * r2
            if (r0 > 0) goto L231
            r0 = 99
            androidx.appcompat.widget.C0014.f14 = r0
            java.lang.String r0 = "ۥۤۡ"
            goto L179
        L231:
            int r0 = androidx.activity.result.C0008.f8
            int r2 = com.google.android.material.carousel.C0054.f54
            int r0 = r0 * r2
            r2 = 2419830(0x24ec76, float:3.390904E-39)
            int r0 = r0 + r2
            r12 = r0
            goto L12
        L23d:
            int r0 = com.google.android.material.chip.C0057.f57
            int r2 = android.view.C0007.f7
            int r0 = r0 % r2
            r2 = 1753978(0x1ac37a, float:2.457847E-39)
            int r0 = r0 + r2
            r12 = r0
            goto L12
        L249:
            int r0 = androidx.emoji2.text.C0026.f26
            int r2 = com.google.android.material.datepicker.C0059.f59
            int r2 = r2 + 9961
            r0 = r0 | r2
            if (r0 > 0) goto L260
            r0 = 86
            androidx.core.widget.C0025.f25 = r0
            java.lang.String r0 = "ۦۢۨ"
            int r0 = androidx.activity.result.C0008.m35(r0)
            r4 = r7
            r12 = r0
            goto L12
        L260:
            int r0 = androidx.savedstate.C0034.f34
            int r2 = com.google.android.material.carousel.C0054.f54
            r0 = r0 | r2
            r2 = -1749949(0xffffffffffe54c43, float:NaN)
            r0 = r0 ^ r2
            r4 = r7
            r12 = r0
            goto L12
        L26d:
            r9 = 0
            int r0 = android.view.C0007.f7
            int r2 = androidx.activity.result.C0009.f9
            r2 = r2 | 419(0x1a3, float:5.87E-43)
            int r0 = r0 % r2
            if (r0 > 0) goto L280
        L277:
            java.lang.String r0 = "۟۟۠"
            int r0 = com.github.megatronking.stringfog.annotation.C0044.m176(r0)
            r12 = r0
            goto L12
        L280:
            java.lang.String r0 = "ۧۨۧ"
            goto L179
        L284:
            java.lang.String r8 = defpackage.gn.d(r10, r11)     // Catch: java.lang.Throwable -> L180
            int r0 = androidx.appcompat.widget.C0014.f14
            int r2 = com.github.megatronking.stringfog.xor.C0046.f46
            r2 = r2 | 5662(0x161e, float:7.934E-42)
            int r0 = r0 % r2
            if (r0 < 0) goto L29a
            java.lang.String r0 = "ۦۡۡ"
            int r0 = com.ljx.wechatmod.hook.C0066.m264(r0)
            r12 = r0
            goto L12
        L29a:
            int r0 = android.app.C0000.f0
            int r2 = com.google.android.material.carousel.C0053.f53
            int r0 = r0 + r2
            r2 = 1753975(0x1ac377, float:2.457842E-39)
            int r0 = r0 + r2
            r12 = r0
            goto L12
        L2a6:
            return
    }

    private final void d(de.robv.android.xposed.XC_MethodHook.MethodHookParam r49) {
            r48 = this;
            r29 = 0
            r35 = 0
            r34 = 0
            r25 = 0
            r28 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r24 = 0
            r12 = 0
            r16 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r26 = 0
            r27 = 0
            r32 = 0
            r31 = 0
            r23 = 0
            r20 = 0
            r4 = 0
            r11 = 0
            r9 = 0
            r15 = 0
            r18 = 0
            r8 = 0
            r10 = 0
            r39 = 0
            r40 = 0
            r30 = 0
            r3 = 0
            r36 = 0
            r47 = 0
            r41 = 0
            r37 = 0
            r33 = 0
            r22 = 0
            r21 = 0
            r19 = 0
            r38 = 0
            java.lang.String r42 = "ۧ۠۠"
            int r46 = android.app.C0002.m8(r42)
            r42 = r3
            r43 = r15
            r44 = r18
            r45 = r19
        L51:
            switch(r46) {
                case 56319: goto L55;
                case 56322: goto L291;
                case 56382: goto L29e;
                case 56451: goto Lb86;
                case 56481: goto L585;
                case 56510: goto Lc13;
                case 56545: goto Labd;
                case 56572: goto Lc9e;
                case 1746692: goto L66;
                case 1746725: goto L576;
                case 1746752: goto L660;
                case 1746753: goto Lb0f;
                case 1746755: goto L585;
                case 1746782: goto L736;
                case 1746813: goto L3eb;
                case 1746814: goto L6eb;
                case 1746850: goto Lccf;
                case 1746906: goto L1e3;
                case 1746909: goto L151;
                case 1746937: goto L9cf;
                case 1746940: goto L177;
                case 1746973: goto Lb79;
                case 1747648: goto L48f;
                case 1747651: goto La89;
                case 1747718: goto L706;
                case 1747742: goto Lcaf;
                case 1747745: goto L177;
                case 1747748: goto La6a;
                case 1747779: goto L263;
                case 1747807: goto L860;
                case 1747899: goto L8e;
                case 1748610: goto Lc37;
                case 1748612: goto L385;
                case 1748616: goto L340;
                case 1748644: goto L177;
                case 1748703: goto L177;
                case 1748706: goto L310;
                case 1748708: goto L7e5;
                case 1748709: goto L9d2;
                case 1748733: goto L556;
                case 1748800: goto L888;
                case 1748802: goto Ldb;
                case 1748827: goto Ld49;
                case 1748865: goto L4e3;
                case 1748866: goto L807;
                case 1748888: goto L67a;
                case 1748896: goto L7a7;
                case 1749609: goto L3fa;
                case 1749610: goto L82d;
                case 1749634: goto La96;
                case 1749635: goto La31;
                case 1749729: goto La3;
                case 1749788: goto L2dd;
                case 1749794: goto L177;
                case 1749821: goto L535;
                case 1750537: goto Lfe;
                case 1750597: goto L20a;
                case 1750626: goto L177;
                case 1750632: goto L5a7;
                case 1750633: goto Lc5e;
                case 1750724: goto L959;
                case 1750748: goto Lcf;
                case 1750750: goto L68f;
                case 1750752: goto L1a5;
                case 1750757: goto L458;
                case 1750784: goto La7c;
                case 1750785: goto L177;
                case 1750810: goto L8e;
                case 1751492: goto L436;
                case 1751497: goto La09;
                case 1751498: goto L494;
                case 1751525: goto L177;
                case 1751556: goto Lbba;
                case 1751558: goto Lab9;
                case 1751589: goto L465;
                case 1751616: goto L9eb;
                case 1751712: goto L4e3;
                case 1751745: goto L7be;
                case 1751772: goto L646;
                case 1751776: goto L504;
                case 1752487: goto L1fd;
                case 1752519: goto L177;
                case 1752610: goto L7cb;
                case 1752639: goto L177;
                case 1752648: goto L825;
                case 1752670: goto L8c1;
                case 1752675: goto L7be;
                case 1752701: goto Lc4a;
                case 1752732: goto L88c;
                case 1752734: goto Lc8b;
                case 1753420: goto L184;
                case 1753422: goto L270;
                case 1753448: goto L9b0;
                case 1753452: goto L270;
                case 1753480: goto L74c;
                case 1753484: goto L535;
                case 1753508: goto L979;
                case 1753539: goto Laee;
                case 1753541: goto L130;
                case 1753542: goto L3dc;
                case 1753573: goto L436;
                case 1753574: goto L79a;
                case 1753575: goto L4fe;
                case 1753666: goto Ld49;
                case 1753695: goto L76b;
                case 1754375: goto L626;
                case 1754407: goto L5e2;
                case 1754444: goto Laee;
                case 1754474: goto Lc2a;
                case 1754499: goto Lb2c;
                case 1754503: goto L78d;
                case 1754506: goto Lbcf;
                case 1754539: goto Lae1;
                case 1754569: goto L93f;
                case 1754594: goto L3d0;
                case 1754626: goto L97;
                case 1754627: goto Lb3b;
                case 1754631: goto Ld31;
                case 1754659: goto La4e;
                case 1755344: goto Lc7a;
                case 1755371: goto L1bf;
                case 1755372: goto L325;
                case 1755374: goto Lad4;
                case 1755399: goto L44c;
                case 1755434: goto L419;
                case 1755437: goto Lb55;
                case 1755461: goto Lbba;
                case 1755464: goto L1a5;
                case 1755466: goto L725;
                case 1755499: goto L8e1;
                case 1755525: goto L8e1;
                case 1755562: goto L4c3;
                case 1755586: goto L7d8;
                case 1755592: goto L6ca;
                case 1755622: goto L995;
                default: goto L54;
            }
        L54:
            goto L51
        L55:
            int r3 = kotlinx.coroutines.C0070.f70
            if (r3 > 0) goto L884
            r3 = 15
            android.support.v4.graphics.drawable.C0006.f6 = r3
            java.lang.String r3 = "ۧ۠۠"
            int r3 = androidx.core.content.C0024.m98(r3)
            r46 = r3
            goto L51
        L66:
            r15 = 1
            int r3 = com.github.megatronking.stringfog.C0048.f48
            int r18 = com.google.android.material.carousel.C0053.f53
            r0 = r18
            int r0 = r0 % (-2916)
            r18 = r0
            r3 = r3 | r18
            if (r3 > 0) goto L83
            kotlinx.coroutines.C0069.m276()
            java.lang.String r3 = "ۣۣۨ"
            int r3 = defpackage.C0073.m292(r3)
            r24 = r15
            r46 = r3
            goto L51
        L83:
            java.lang.String r3 = "ۣۦ۟"
        L85:
            int r3 = androidx.startup.C0037.m149(r3)
            r24 = r15
            r46 = r3
            goto L51
        L8e:
            java.lang.String r3 = "ۣۢۨ"
        L90:
            int r3 = androidx.constraintlayout.widget.C0019.m79(r3)
            r46 = r3
            goto L51
        L97:
            int r3 = defpackage.C0073.f73
            int r15 = com.google.android.material.appbar.C0049.f49
            int r3 = r3 / r15
            r15 = 1747899(0x1aabbb, float:2.449328E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        La3:
            java.util.List r3 = defpackage.pb0.F0
            r0 = r27
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L888
            int r3 = com.google.android.material.floatingactionbutton.C0060.f60
            int r15 = com.google.android.material.carousel.C0054.f54
            int r15 = r15 + (-8862)
            int r3 = r3 + r15
            if (r3 < 0) goto Lc2
            com.google.android.material.floatingactionbutton.C0060.m240()
            java.lang.String r3 = "ۤ۠ۡ"
            int r3 = com.ljx.wechatmod.ui.C0067.m271(r3)
            r46 = r3
            goto L51
        Lc2:
            r3 = r37
        Lc4:
            java.lang.String r15 = "ۦۣۣ"
            int r15 = com.github.megatronking.stringfog.annotation.C0044.m176(r15)
            r37 = r3
            r46 = r15
            goto L51
        Lcf:
            java.lang.String r3 = "ۡ۟ۢ"
            r12 = r24
        Ld3:
            int r3 = io.fastkv.C0068.m272(r3)
            r46 = r3
            goto L51
        Ldb:
            if (r34 != 0) goto L9eb
            int r3 = androidx.constraintlayout.helper.widget.C0017.m71()
            if (r3 > 0) goto Lf1
            r3 = 85
            androidx.constraintlayout.widget.C0020.f20 = r3
            java.lang.String r3 = "ۣ۠ۦ"
            int r3 = com.google.android.material.datepicker.C0059.m239(r3)
            r46 = r3
            goto L51
        Lf1:
            int r3 = com.ljx.wechatmod.auth.C0065.f65
            int r15 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r3 = r3 - r15
            r15 = 1753821(0x1ac2dd, float:2.457627E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        Lfe:
            java.lang.String r3 = "P3Z04A==\n"
            java.lang.String r15 = "bTk7tG1etwk=\n"
            java.lang.String r3 = "ROOT"     // Catch: java.lang.Throwable -> Ld21
            r0 = r44
            defpackage.ip.n(r3, r0)     // Catch: java.lang.Throwable -> Ld21
            java.lang.String r8 = r43.toLowerCase(r44)     // Catch: java.lang.Throwable -> Ld21
            int r3 = defpackage.C0072.f72
            int r15 = com.google.android.material.behavior.C0050.f50
            int r15 = r15 % (-6279)
            int r3 = r3 % r15
            if (r3 < 0) goto L126
            r3 = 62
            com.google.android.material.chip.C0057.f57 = r3
            java.lang.String r3 = "ۢۡۢ"
        L11e:
            int r3 = com.google.android.material.carousel.C0054.m219(r3)
            r46 = r3
            goto L51
        L126:
            java.lang.String r3 = "ۣۧ۟"
        L128:
            int r3 = androidx.appcompat.widget.C0016.m65(r3)
            r46 = r3
            goto L51
        L130:
            int r3 = com.google.android.material.theme.C0064.f64
            int r15 = com.google.android.material.floatingactionbutton.C0060.f60
            r15 = r15 | (-3044(0xfffffffffffff41c, float:NaN))
            int r3 = r3 * r15
            if (r3 < 0) goto L145
            java.lang.String r3 = "ۧۥۧ"
            int r3 = androidx.versionedparcelable.C0041.m164(r3)
            r33 = r37
            r46 = r3
            goto L51
        L145:
            java.lang.String r3 = "ۢۦ۠"
            int r3 = com.google.android.material.chip.C0057.m229(r3)
            r33 = r37
            r46 = r3
            goto L51
        L151:
            int r3 = androidx.emoji2.text.C0026.f26
            if (r3 > 0) goto L164
            com.github.megatronking.stringfog.C0048.m194()
            java.lang.String r3 = "ۣۦ۟"
            int r3 = androidx.appcompat.widget.C0015.m60(r3)
            r27 = r26
            r46 = r3
            goto L51
        L164:
            java.lang.String r3 = "ۣۧۤ"
            r15 = r3
            r18 = r25
            r19 = r26
        L16b:
            int r3 = androidx.lifecycle.C0029.m116(r15)
            r25 = r18
            r27 = r19
            r46 = r3
            goto L51
        L177:
            int r3 = androidx.recyclerview.widget.C0033.f33
            int r15 = com.github.megatronking.stringfog.xor.C0045.f45
            int r3 = r3 * r15
            r15 = 1817010(0x1bb9b2, float:2.546173E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L184:
            int r3 = android.os.Build.VERSION.SDK_INT
            r15 = 31
            if (r3 < r15) goto L3fa
            int r3 = androidx.recyclerview.widget.C0032.f32
            if (r3 < 0) goto L19b
            androidx.appcompat.widget.C0013.m52()
        L191:
            java.lang.String r3 = "۠ۢ"
            int r3 = androidx.appcompat.widget.C0013.m53(r3)
            r46 = r3
            goto L51
        L19b:
            java.lang.String r3 = "ۣۡۢ"
        L19d:
            int r3 = android.support.v4.graphics.drawable.C0006.m26(r3)
            r46 = r3
            goto L51
        L1a5:
            int r3 = androidx.versionedparcelable.C0042.f42
            int r15 = androidx.savedstate.C0035.f35
            int r15 = r15 / (-5247)
            int r3 = r3 + r15
            if (r3 < 0) goto L1b2
            java.lang.String r3 = "ۨۧ۟"
            goto L128
        L1b2:
            int r3 = android.support.v4.graphics.drawable.C0005.f5
            int r15 = androidx.activity.result.C0008.f8
            r3 = r3 | r15
            r15 = 1755466(0x1ac94a, float:2.459932E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L1bf:
            java.lang.String r3 = "3f5Z\n"
            java.lang.String r15 = "tpsgeLwwj7M=\n"
            java.lang.String r18 = "lNdk\n"
            java.lang.String r19 = "8LICxVL6724=\n"
            r0 = r39
            r1 = r18
            r2 = r19
            java.lang.String r3 = defpackage.z30.k(r3, r15, r0, r1, r2)
            r0 = r40
            defpackage.ip.o(r3, r0)
            int r3 = androidx.versionedparcelable.C0042.f42
            int r15 = com.google.android.material.carousel.C0055.f55
            int r3 = r3 + r15
            r15 = 1754948(0x1ac744, float:2.459206E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L1e3:
            r11 = 0
            int r3 = androidx.recyclerview.widget.C0032.f32
            if (r3 < 0) goto L1f7
            com.ljx.wechatmod.hook.C0066.m265()
            r3 = r10
        L1ec:
            java.lang.String r10 = "ۤ۟ۤ"
            int r15 = com.google.android.material.carousel.C0052.m209(r10)
            r10 = r3
            r46 = r15
            goto L51
        L1f7:
            java.lang.String r3 = "ۡ۟ۦ"
            r15 = r24
            goto L85
        L1fd:
            int r3 = com.google.android.material.chip.C0056.f56
            int r15 = androidx.fragment.app.C0027.f27
            int r3 = r3 * r15
            r15 = 1798501(0x1b7165, float:2.520237E-39)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        L20a:
            if (r7 == 0) goto L177
            if (r9 == 0) goto L177
            java.lang.String r3 = "UPuob8DRuoFa/ahvw9eqm14=\n"
            java.lang.String r15 = "O57RMLCj0/c=\n"
            java.lang.String r3 = "key_privacy_style"
            r15 = 0
            int r3 = defpackage.gt.j(r3, r15)
            r15 = 1
            if (r3 != r15) goto Lc13
            int r3 = android.os.Build.VERSION.SDK_INT
            r15 = 31
            if (r3 < r15) goto Lc13
            r3 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r15 = "/T0B0AiYcuL3OwHQGoZu5skxFvsdhGj94iE=\n"
            java.lang.String r18 = "llh4j3jqG5Q=\n"
            r0 = r18
            java.lang.String r15 = defpackage.u40.a(r15, r0)
            r18 = 100
            r0 = r18
            int r15 = defpackage.gt.j(r15, r0)
            float r15 = (float) r15
            r18 = 1120403456(0x42c80000, float:100.0)
            float r15 = r15 / r18
            r18 = 1092616192(0x41200000, float:10.0)
            float r15 = r15 * r18
            float r3 = java.lang.Math.max(r3, r15)
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.RenderEffect r3 = defpackage.p7.e(r3, r3)
            r0 = r34
            defpackage.p7.r(r0, r3)
            int r3 = android.app.C0002.f2
            int r15 = defpackage.C0071.f71
            int r15 = r15 / 6051
            r3 = r3 ^ r15
            if (r3 > 0) goto L478
            java.lang.String r3 = "ۣۤۡ"
            int r3 = com.google.android.material.theme.C0064.m258(r3)
            r46 = r3
            goto L51
        L263:
            r15 = 0
            java.lang.String r3 = "۟۠ۦ"
        L266:
            int r3 = io.fastkv.C0068.m272(r3)
            r46 = r3
            r36 = r15
            goto L51
        L270:
            int r3 = android.support.v4.graphics.drawable.C0004.m18()
            if (r3 < 0) goto L284
            r3 = 75
            com.google.android.material.carousel.C0055.f55 = r3
            java.lang.String r3 = "ۣۨۤ"
        L27c:
            int r3 = com.google.android.material.theme.C0063.m254(r3)
            r46 = r3
            goto L51
        L284:
            int r3 = androidx.profileinstaller.C0031.f31
            int r15 = com.github.megatronking.stringfog.xor.C0045.f45
            int r3 = r3 % r15
            r15 = 1748909(0x1aafad, float:2.450743E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L291:
            int r3 = com.google.android.material.bottomsheet.C0051.f51
            int r15 = com.github.megatronking.stringfog.C0047.f47
            r3 = r3 ^ r15
            r15 = 1750441(0x1ab5a9, float:2.45289E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L29e:
            java.lang.String r3 = "HyvL6pIk51gROu3DhCk=\n"
            java.lang.String r15 = "dE6yteVFizQ=\n"
            java.lang.String r3 = "key_wallet_val"
            java.lang.String r15 = "XfuKs1HNPxxd\n"
            java.lang.String r18 = "ZMKzimj0ESU=\n"
            r0 = r18
            java.lang.String r18 = defpackage.u40.a(r15, r0)
            int r15 = com.google.android.material.appbar.C0049.f49
            int r19 = androidx.constraintlayout.helper.widget.C0017.f17
            r0 = r19
            int r0 = r0 + 550
            r19 = r0
            r15 = r15 ^ r19
            if (r15 > 0) goto L2cf
            com.google.android.material.appbar.C0049.m199()
            java.lang.String r15 = "ۣۦۨ"
            int r15 = androidx.constraintlayout.helper.widget.C0017.m70(r15)
            r39 = r3
            r40 = r18
            r46 = r15
            goto L51
        L2cf:
            java.lang.String r15 = "ۣۨ۠"
        L2d1:
            int r15 = com.google.android.material.carousel.C0054.m219(r15)
            r39 = r3
            r40 = r18
            r46 = r15
            goto L51
        L2dd:
            i00 r15 = defpackage.dy.g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r18 = "¥"
            r0 = r18
            r3.<init>(r0)
            r0 = r33
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r15.getClass()
            java.lang.String r18 = "input"
            r0 = r18
            defpackage.ip.o(r0, r5)
            java.lang.String r18 = "replacement"
            r0 = r18
            defpackage.ip.o(r0, r3)
            java.lang.String r18 = "ۣۢۧ"
        L304:
            int r18 = com.google.android.material.chip.C0057.m229(r18)
            r21 = r3
            r22 = r15
            r46 = r18
            goto L51
        L310:
            defpackage.p7.q(r34)
            int r3 = androidx.savedstate.C0036.f36
            if (r3 > 0) goto L321
            java.lang.String r3 = "ۣۤۢ"
            int r3 = androidx.appcompat.app.C0012.m50(r3)
            r46 = r3
            goto L51
        L321:
            java.lang.String r3 = "ۢ۠ۨ"
            goto Ld3
        L325:
            int r3 = androidx.constraintlayout.helper.widget.C0017.f17
            if (r3 > 0) goto L333
            java.lang.String r3 = "۟۟۠"
        L32b:
            int r3 = androidx.constraintlayout.widget.C0018.m73(r3)
            r46 = r3
            goto L51
        L333:
            int r3 = androidx.legacy.content.C0028.f28
            int r15 = android.app.C0001.f1
            r3 = r3 | r15
            r15 = 1746966(0x1aa816, float:2.448021E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L340:
            int r3 = androidx.savedstate.C0036.f36
            int r9 = androidx.fragment.app.C0027.f27
            r9 = r9 | 968(0x3c8, float:1.356E-42)
            r3 = r3 | r9
            if (r3 < 0) goto L354
            java.lang.String r3 = "۟ۡۥ"
            int r3 = com.github.megatronking.stringfog.xor.C0045.m182(r3)
            r9 = r11
            r46 = r3
            goto L51
        L354:
            java.lang.String r3 = "ۧۥۧ"
            r9 = r11
        L357:
            int r3 = androidx.constraintlayout.widget.C0020.m80(r3)
            r46 = r3
            goto L51
        L35f:
            r3 = move-exception
            java.lang.String r27 = ""
            int r3 = com.google.android.material.chip.C0056.f56
            int r15 = androidx.legacy.content.C0028.f28
            int r15 = r15 % (-2217)
            r3 = r3 ^ r15
            if (r3 > 0) goto L378
            android.app.C0000.m0()
            java.lang.String r3 = "ۧۡۦ"
            int r3 = androidx.savedstate.C0034.m138(r3)
            r46 = r3
            goto L51
        L378:
            int r3 = androidx.versionedparcelable.C0041.f41
            int r15 = androidx.activity.C0011.f11
            int r3 = r3 * r15
            r15 = -1779532(0xffffffffffe4d8b4, float:NaN)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        L385:
            int r3 = r34.getId()
            java.lang.String r16 = ""
            int r3 = r3 >>> 24
            r15 = 127(0x7f, float:1.78E-43)
            if (r3 != r15) goto La6a
            java.util.concurrent.ConcurrentHashMap r3 = defpackage.dy.c
            int r4 = r34.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r18 = r3.get(r4)
            int r13 = com.google.android.material.carousel.C0054.f54
            int r14 = com.google.android.material.chip.C0057.f57
            r14 = r14 | (-7037(0xffffffffffffe483, float:NaN))
            int r13 = r13 % r14
            if (r13 > 0) goto L3be
            androidx.activity.C0010.m40()
            java.lang.String r13 = "ۧۦۡ"
            r14 = r4
            r15 = r13
            r17 = r18
            r19 = r18
        L3b3:
            int r15 = android.app.C0003.m13(r15)
            r13 = r3
            r4 = r19
            r46 = r15
            goto L51
        L3be:
            java.lang.String r15 = "ۧۦۡ"
            r13 = r3
            r14 = r4
            r17 = r18
            r19 = r18
        L3c6:
            int r3 = com.google.android.material.theme.C0062.m249(r15)
            r4 = r19
            r46 = r3
            goto L51
        L3d0:
            if (r17 != 0) goto L8e
            java.lang.String r3 = "ۦ۠ۢ"
        L3d4:
            int r3 = com.google.android.material.theme.C0062.m249(r3)
            r46 = r3
            goto L51
        L3dc:
            r31 = 1
            int r3 = androidx.savedstate.C0036.f36
            int r15 = com.github.megatronking.stringfog.xor.C0045.f45
            int r3 = r3 * r15
            r15 = 2007948(0x1ea38c, float:2.813734E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L3eb:
            r3 = r5
        L3ec:
            int r5 = androidx.constraintlayout.widget.C0020.f20
            int r15 = com.google.android.material.internal.C0061.f61
            int r5 = r5 * r15
            r15 = 1869060(0x1c8504, float:2.619111E-39)
            int r15 = r15 + r5
            r5 = r3
            r46 = r15
            goto L51
        L3fa:
            int r3 = com.github.megatronking.stringfog.C0047.m191()
            if (r3 < 0) goto L40c
            r3 = 65
            androidx.versionedparcelable.C0041.f41 = r3
            java.lang.String r18 = "ۥۢ"
            r3 = r21
            r15 = r22
            goto L304
        L40c:
            int r3 = androidx.lifecycle.C0029.f29
            int r15 = com.google.android.material.theme.C0063.f63
            r3 = r3 ^ r15
            r15 = -1749716(0xffffffffffe54d2c, float:NaN)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        L419:
            int r3 = androidx.appcompat.widget.C0016.m66()
            if (r3 > 0) goto L42d
            r3 = 16
            io.fastkv.C0068.f68 = r3
            java.lang.String r3 = "۠۟۟"
            int r3 = androidx.appcompat.app.C0012.m50(r3)
            r46 = r3
            goto L51
        L42d:
            java.lang.String r3 = "ۥۣۡ"
            r15 = r3
            r18 = r25
            r19 = r27
            goto L16b
        L436:
            int r3 = com.google.android.material.floatingactionbutton.C0060.f60
            if (r3 > 0) goto L448
            r3 = 67
            androidx.activity.C0010.f10 = r3
            java.lang.String r3 = "ۣۢۢ"
        L440:
            int r3 = androidx.appcompat.app.C0012.m50(r3)
            r46 = r3
            goto L51
        L448:
            java.lang.String r3 = "ۢۦ۠"
            goto L128
        L44c:
            java.lang.String r3 = "ۣۧۧ"
            int r3 = com.google.android.material.carousel.C0053.m213(r3)
            r28 = r25
            r46 = r3
            goto L51
        L458:
            int r3 = com.google.android.material.theme.C0063.f63
            int r15 = defpackage.C0072.f72
            r3 = r3 ^ r15
            r15 = 1751317(0x1ab915, float:2.454118E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L465:
            int r3 = r34.getId()
            r15 = -1
            if (r3 != r15) goto La31
            int r3 = androidx.lifecycle.C0029.f29
            int r15 = android.view.C0007.f7
            r15 = r15 ^ 8836(0x2284, float:1.2382E-41)
            int r3 = r3 / r15
            if (r3 == 0) goto L482
            androidx.startup.C0037.m150()
        L478:
            java.lang.String r3 = "۠۟"
            int r3 = kotlinx.coroutines.C0069.m277(r3)
            r46 = r3
            goto L51
        L482:
            int r3 = com.google.android.material.carousel.C0052.f52
            int r15 = com.google.android.material.bottomsheet.C0051.f51
            r3 = r3 ^ r15
            r15 = 1756132(0x1acbe4, float:2.460865E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L48f:
            r12 = 0
            java.lang.String r3 = "ۣ۟ۡ"
            goto L32b
        L494:
            r42.getClass()     // Catch: java.lang.Throwable -> L8f6
            r0 = r39
            r1 = r47
            int r3 = defpackage.gn.b(r0, r1)     // Catch: java.lang.Throwable -> L8f6
            java.lang.String r41 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L8f6
            int r3 = androidx.startup.C0037.f37
            int r15 = androidx.activity.C0010.f10
            int r15 = r15 + 9290
            r3 = r3 ^ r15
            if (r3 < 0) goto L4b9
            com.github.megatronking.stringfog.annotation.C0044.m178()
            java.lang.String r3 = "ۦ۠ۢ"
            int r3 = androidx.appcompat.widget.C0013.m53(r3)
            r46 = r3
            goto L51
        L4b9:
            java.lang.String r3 = "ۦۤۥ"
            int r3 = com.github.megatronking.stringfog.xor.C0045.m182(r3)
            r46 = r3
            goto L51
        L4c3:
            int r3 = kotlinx.coroutines.C0070.f70
            int r15 = androidx.constraintlayout.widget.C0018.f18
            r15 = r15 ^ (-7064(0xffffffffffffe468, float:NaN))
            int r3 = r3 % r15
            if (r3 > 0) goto L4d9
            androidx.viewpager2.adapter.C0043.m172()
            java.lang.String r3 = "ۣ۠ۨ"
        L4d1:
            int r3 = androidx.profileinstaller.C0031.m127(r3)
            r46 = r3
            goto L51
        L4d9:
            java.lang.String r3 = "ۡ۟۠"
        L4db:
            int r3 = com.github.megatronking.stringfog.xor.C0046.m186(r3)
            r46 = r3
            goto L51
        L4e3:
            int r3 = com.google.android.material.internal.C0061.f61
            if (r3 > 0) goto L4f1
            java.lang.String r3 = "ۤ۠ۤ"
            int r3 = com.google.android.material.appbar.C0049.m197(r3)
            r46 = r3
            goto L51
        L4f1:
            int r3 = androidx.profileinstaller.C0030.f30
            int r15 = com.google.android.material.theme.C0064.f64
            r3 = r3 ^ r15
            r15 = 1751743(0x1ababf, float:2.454715E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L4fe:
            r38 = r41
        L500:
            java.lang.String r3 = "ۧۨۤ"
            goto L357
        L504:
            java.lang.String r3 = defpackage.gn.d(r39, r40)     // Catch: java.lang.Throwable -> L91f
            int r15 = androidx.versionedparcelable.C0038.f38
            int r18 = androidx.viewpager2.adapter.C0043.f43
            r0 = r18
            int r0 = r0 + 9128
            r18 = r0
            r15 = r15 | r18
            if (r15 < 0) goto L525
            androidx.startup.C0037.m150()
            java.lang.String r15 = "ۨۤۧ"
            int r15 = com.google.android.material.floatingactionbutton.C0060.m241(r15)
            r30 = r3
            r46 = r15
            goto L51
        L525:
            r15 = r31
        L527:
            java.lang.String r18 = "ۧۧۧ"
            int r18 = com.google.android.material.bottomsheet.C0051.m207(r18)
            r30 = r3
            r31 = r15
            r46 = r18
            goto L51
        L535:
            int r3 = androidx.profileinstaller.C0030.m121()
            if (r3 < 0) goto L549
            r3 = 29
            android.app.C0000.f0 = r3
            java.lang.String r3 = "ۤۡۢ"
        L541:
            int r3 = kotlinx.coroutines.C0070.m281(r3)
            r46 = r3
            goto L51
        L549:
            int r3 = defpackage.C0073.f73
            int r15 = androidx.constraintlayout.helper.widget.C0017.f17
            int r3 = r3 % r15
            r15 = 1754500(0x1ac584, float:2.458578E-39)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        L556:
            r32 = 0
            int r3 = com.github.megatronking.stringfog.xor.C0046.f46
            if (r3 > 0) goto L569
            android.app.C0000.m0()
            java.lang.String r3 = "ۢ۠"
            int r3 = android.support.v4.graphics.drawable.C0005.m23(r3)
            r46 = r3
            goto L51
        L569:
            int r3 = com.google.android.material.carousel.C0055.f55
            int r15 = android.support.v4.graphics.drawable.C0006.f6
            r3 = r3 | r15
            r15 = 1756169(0x1acc09, float:2.460917E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L576:
            int r3 = com.google.android.material.carousel.C0052.f52
            int r15 = androidx.profileinstaller.C0030.f30
            r3 = r3 ^ r15
            r15 = 1750833(0x1ab731, float:2.45344E-39)
            int r3 = r3 + r15
            r46 = r3
            r47 = r36
            goto L51
        L585:
            r3 = r5
        L586:
            int r5 = io.fastkv.C0068.f68
            if (r5 < 0) goto L599
            androidx.versionedparcelable.C0042.m169()
            java.lang.String r5 = "ۡۥۢ"
            r15 = r5
        L590:
            int r15 = androidx.constraintlayout.widget.C0019.m79(r15)
            r5 = r3
            r46 = r15
            goto L51
        L599:
            int r5 = androidx.activity.result.C0009.f9
            int r15 = android.app.C0001.f1
            r5 = r5 ^ r15
            r15 = 1745706(0x1aa32a, float:2.446255E-39)
            int r15 = r15 + r5
            r5 = r3
            r46 = r15
            goto L51
        L5a7:
            r0 = r22
            java.lang.Object r3 = r0.b
            java.util.regex.Pattern r3 = (java.util.regex.Pattern) r3
            java.util.regex.Matcher r3 = r3.matcher(r5)
            r0 = r21
            java.lang.String r3 = r3.replaceAll(r0)
            java.lang.String r15 = "replaceAll(...)"
            defpackage.ip.n(r15, r3)
            boolean r15 = r3.equals(r5)
            if (r15 != 0) goto L7a7
            r0 = r49
            java.lang.Object[] r15 = r0.args
            r18 = 0
            r15[r18] = r3
            int r3 = androidx.emoji2.text.C0026.m106()
            if (r3 > 0) goto L5de
            r3 = 83
            android.app.C0002.f2 = r3
            java.lang.String r3 = "۟ۤۧ"
            int r3 = com.google.android.material.carousel.C0053.m213(r3)
            r46 = r3
            goto L51
        L5de:
            java.lang.String r3 = "ۡۦ۠"
            goto L11e
        L5e2:
            java.lang.String r3 = "1g==\n"
            java.lang.String r15 = "pvqdpgJ9Q7I=\n"
            java.lang.String r3 = "p"
            r0 = r49
            defpackage.ip.o(r3, r0)
            r0 = r49
            java.lang.Object r3 = r0.thisObject
            boolean r15 = r3 instanceof android.widget.TextView
            r29 = 0
            if (r15 == 0) goto Lc7a
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r15 = androidx.constraintlayout.widget.C0018.f18
            int r18 = androidx.startup.C0037.f37
            r0 = r18
            r0 = r0 | 8336(0x2090, float:1.1681E-41)
            r18 = r0
            int r15 = r15 - r18
            if (r15 > 0) goto L615
            java.lang.String r15 = "ۧۨ"
            int r15 = com.google.android.material.internal.C0061.m246(r15)
            r34 = r3
            r46 = r15
            goto L51
        L615:
            int r15 = androidx.activity.C0010.f10
            int r18 = com.github.megatronking.stringfog.C0047.f47
            int r15 = r15 * r18
            r18 = 1750154(0x1ab48a, float:2.452488E-39)
            r15 = r15 ^ r18
            r34 = r3
            r46 = r15
            goto L51
        L626:
            int r3 = com.google.android.material.theme.C0064.f64
            int r15 = io.fastkv.C0068.f68
            int r15 = r15 * (-1204)
            r3 = r3 ^ r15
            if (r3 > 0) goto L637
            java.lang.String r3 = "ۨۦۨ"
            r20 = r23
            r15 = r24
            goto L85
        L637:
            int r3 = com.google.android.material.carousel.C0055.f55
            int r15 = android.view.C0007.f7
            r3 = r3 ^ r15
            r15 = 1753567(0x1ac1df, float:2.457271E-39)
            int r3 = r3 + r15
            r20 = r23
            r46 = r3
            goto L51
        L646:
            int r3 = r27.length()
            if (r3 <= 0) goto L888
            java.util.List r3 = defpackage.pb0.G0
            r0 = r27
            boolean r3 = r3.contains(r0)
            if (r3 != 0) goto Lb79
            java.lang.String r3 = "ۣۢۤ"
        L658:
            int r3 = com.google.android.material.datepicker.C0059.m239(r3)
            r46 = r3
            goto L51
        L660:
            defpackage.p7.q(r34)
            int r3 = defpackage.C0071.f71
            int r15 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r15 = r15 + 8435
            r3 = r3 | r15
            if (r3 < 0) goto L676
            java.lang.String r3 = "ۨۢۧ"
            int r3 = androidx.appcompat.widget.C0014.m57(r3)
            r46 = r3
            goto L51
        L676:
            java.lang.String r3 = "ۡ۟۠"
            goto L128
        L67a:
            int r3 = android.app.C0003.f3
            if (r3 > 0) goto L68b
            com.google.android.material.theme.C0063.m253()
            java.lang.String r3 = "ۨ۠ۦ"
            int r3 = androidx.versionedparcelable.C0039.m159(r3)
            r46 = r3
            goto L51
        L68b:
            java.lang.String r3 = "ۦ۟ۧ"
            goto L27c
        L68f:
            r0 = r49
            java.lang.Object[] r3 = r0.args
            r15 = 0
            r3 = r3[r15]
            boolean r15 = r3 instanceof java.lang.CharSequence
            if (r15 == 0) goto L993
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r15 = defpackage.C0072.f72
            int r18 = androidx.constraintlayout.widget.C0020.f20
            r0 = r18
            r0 = r0 | (-4782(0xffffffffffffed52, float:NaN))
            r18 = r0
            int r15 = r15 + r18
            if (r15 < 0) goto L6b7
            androidx.profileinstaller.C0031.m124()
            java.lang.String r15 = "ۢ۠ۧ"
            r18 = r3
            r19 = r27
            r28 = r29
            goto L16b
        L6b7:
            int r15 = android.view.C0007.f7
            int r18 = android.support.v4.graphics.drawable.C0006.f6
            int r15 = r15 / r18
            r18 = 1755398(0x1ac906, float:2.459837E-39)
            r15 = r15 ^ r18
            r25 = r3
            r28 = r29
            r46 = r15
            goto L51
        L6ca:
            int r3 = androidx.versionedparcelable.C0039.f39
            int r15 = android.app.C0001.f1
            int r15 = r15 + (-6393)
            int r3 = r3 % r15
            if (r3 < 0) goto L6dc
            androidx.legacy.content.C0028.m112()
            r3 = r30
            r15 = r32
            goto L527
        L6dc:
            int r3 = androidx.activity.C0011.f11
            int r15 = android.view.C0007.f7
            int r3 = r3 * r15
            r15 = 170203(0x298db, float:2.38505E-40)
            int r3 = r3 + r15
            r31 = r32
            r46 = r3
            goto L51
        L6eb:
            int r3 = com.google.android.material.datepicker.C0058.f58
            if (r3 > 0) goto L6f9
            java.lang.String r3 = "ۣۧۥ"
            int r3 = androidx.core.widget.C0025.m102(r3)
            r46 = r3
            goto L51
        L6f9:
            int r3 = android.app.C0001.f1
            int r15 = androidx.savedstate.C0035.f35
            r3 = r3 ^ r15
            r15 = 1749409(0x1ab1a1, float:2.451444E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L706:
            if (r7 != 0) goto La89
            if (r12 != 0) goto La89
            int r3 = com.google.android.material.floatingactionbutton.C0060.f60
            if (r3 > 0) goto L718
            java.lang.String r3 = "۠ۢ۠"
            int r3 = androidx.coordinatorlayout.widget.C0021.m86(r3)
            r46 = r3
            goto L51
        L718:
            int r3 = com.github.megatronking.stringfog.xor.C0046.f46
            int r15 = com.google.android.material.datepicker.C0059.f59
            r3 = r3 | r15
            r15 = -1746430(0xffffffffffe55a02, float:NaN)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        L725:
            int r3 = android.support.v4.graphics.drawable.C0004.f4
            if (r3 < 0) goto L731
            r3 = 61
            androidx.constraintlayout.widget.C0020.f20 = r3
            java.lang.String r3 = "ۣ۠ۤ"
            goto L3d4
        L731:
            java.lang.String r15 = "ۢۦۦ"
            r3 = r5
            goto L590
        L736:
            int r3 = com.github.megatronking.stringfog.xor.C0045.f45
            if (r3 < 0) goto L748
            r3 = 11
            kotlinx.coroutines.C0070.f70 = r3
            java.lang.String r3 = "ۨ۟ۨ"
            int r3 = com.github.megatronking.stringfog.xor.C0045.m182(r3)
            r46 = r3
            goto L51
        L748:
            java.lang.String r3 = "ۧۧۧ"
            goto L4d1
        L74c:
            gn r3 = defpackage.gn.a     // Catch: java.lang.Throwable -> L91f
            r3.getClass()     // Catch: java.lang.Throwable -> L91f
            int r3 = androidx.activity.result.C0009.m36()
            if (r3 < 0) goto L761
            java.lang.String r3 = "ۤۨ۠"
            int r3 = androidx.constraintlayout.helper.widget.C0017.m70(r3)
            r46 = r3
            goto L51
        L761:
            java.lang.String r3 = "ۤۨۤ"
            int r3 = androidx.activity.result.C0009.m38(r3)
            r46 = r3
            goto L51
        L76b:
            java.lang.String r26 = defpackage.gn.c(r34)     // Catch: java.lang.Throwable -> L35f
            int r3 = androidx.constraintlayout.widget.C0019.f19
            if (r3 > 0) goto L780
            androidx.viewpager2.adapter.C0043.m172()
            java.lang.String r3 = "ۢ۠ۨ"
            int r3 = com.github.megatronking.stringfog.xor.C0045.m182(r3)
            r46 = r3
            goto L51
        L780:
            int r3 = androidx.profileinstaller.C0030.f30
            int r15 = com.github.megatronking.stringfog.xor.C0045.f45
            r3 = r3 | r15
            r15 = -1746683(0xffffffffffe55905, float:NaN)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        L78d:
            int r3 = androidx.appcompat.widget.C0013.f13
            int r15 = android.app.C0002.f2
            r3 = r3 ^ r15
            r15 = 57196(0xdf6c, float:8.0149E-41)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L79a:
            int r3 = androidx.constraintlayout.widget.C0019.f19
            int r15 = androidx.viewpager2.adapter.C0043.f43
            int r3 = r3 + r15
            r15 = 1746498(0x1aa642, float:2.447365E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L7a7:
            int r3 = androidx.activity.C0011.f11
            int r15 = com.google.android.material.carousel.C0054.f54
            int r15 = r15 * 1363
            int r3 = r3 / r15
            if (r3 == 0) goto L7ba
            java.lang.String r3 = "ۢۢۦ"
            int r3 = com.google.android.material.theme.C0063.m254(r3)
            r46 = r3
            goto L51
        L7ba:
            java.lang.String r3 = "ۣۣۡ"
            goto L32b
        L7be:
            int r3 = androidx.versionedparcelable.C0040.f40
            int r15 = com.ljx.wechatmod.hook.C0066.f66
            r3 = r3 ^ r15
            r15 = 1750878(0x1ab75e, float:2.453503E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L7cb:
            int r3 = androidx.recyclerview.widget.C0033.f33
            int r15 = android.app.C0002.f2
            int r3 = r3 - r15
            r15 = -1752001(0xffffffffffe5443f, float:NaN)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        L7d8:
            int r3 = androidx.core.content.C0024.f24
            int r15 = androidx.profileinstaller.C0031.f31
            int r3 = r3 / r15
            r15 = 1747718(0x1aab06, float:2.449075E-39)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        L7e5:
            r35 = 0
            int r3 = androidx.savedstate.C0034.f34
            int r15 = androidx.constraintlayout.widget.C0020.f20
            int r15 = r15 + 3208
            r3 = r3 | r15
            if (r3 < 0) goto L7fa
            java.lang.String r3 = "ۡ۟۠"
            int r3 = androidx.core.content.C0024.m98(r3)
            r46 = r3
            goto L51
        L7fa:
            int r3 = androidx.activity.C0011.f11
            int r15 = androidx.activity.result.C0008.f8
            int r3 = r3 - r15
            r15 = 1751185(0x1ab891, float:2.453933E-39)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        L807:
            int r3 = androidx.core.widget.C0025.f25
            if (r3 < 0) goto L81c
            androidx.emoji2.text.C0026.m106()
            r3 = r33
        L810:
            java.lang.String r15 = "ۥۦ۟"
            int r15 = kotlinx.coroutines.C0070.m281(r15)
            r33 = r3
            r46 = r15
            goto L51
        L81c:
            java.lang.String r3 = "ۥۥ۟"
            r15 = r3
            r18 = r25
            r19 = r27
            goto L16b
        L825:
            java.lang.String r4 = "ۣۢۨ"
            r3 = r13
            r15 = r4
            r19 = r20
            goto L3b3
        L82d:
            r0 = r49
            java.lang.Object[] r3 = r0.args
            r15 = 0
            java.lang.String r18 = "5SvV9QWwdbCPX8ufca4fxJE1\n"
            java.lang.String r19 = "B71dF5M4lyY=\n"
            java.lang.String r18 = "\u2588\u2588\u2588\u2588\u2588\u2588"
            r3[r15] = r18
            int r3 = androidx.savedstate.C0036.f36
            int r15 = androidx.constraintlayout.widget.C0020.f20
            r15 = r15 ^ (-2942(0xfffffffffffff482, float:NaN))
            int r3 = r3 - r15
            if (r3 < 0) goto L856
            androidx.coordinatorlayout.widget.C0022.m88()
            r3 = r34
        L84a:
            java.lang.String r15 = "ۡۥۦ"
            int r15 = androidx.viewpager2.adapter.C0043.m173(r15)
            r34 = r3
            r46 = r15
            goto L51
        L856:
            java.lang.String r3 = "ۦۣۧ"
            int r3 = androidx.lifecycle.C0029.m116(r3)
            r46 = r3
            goto L51
        L860:
            int r3 = com.ljx.wechatmod.hook.C0066.f66
            int r15 = androidx.core.content.C0024.f24
            int r15 = r15 + 8596
            int r3 = r3 % r15
            if (r3 > 0) goto L877
            r3 = 11
            androidx.fragment.app.C0027.f27 = r3
            java.lang.String r3 = "ۥ۟ۤ"
            int r3 = androidx.versionedparcelable.C0041.m164(r3)
            r46 = r3
            goto L51
        L877:
            int r3 = androidx.savedstate.C0034.f34
            int r15 = androidx.core.widget.C0025.f25
            int r3 = r3 % r15
            r15 = 1753586(0x1ac1f2, float:2.457297E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L884:
            java.lang.String r3 = "ۣۡ۠"
            goto L440
        L888:
            java.lang.String r3 = "ۣۡ۟"
            goto L90
        L88c:
            gn r3 = defpackage.gn.a     // Catch: java.lang.Throwable -> Ld21
            r3.getClass()     // Catch: java.lang.Throwable -> Ld21
            java.lang.String r3 = defpackage.gn.e     // Catch: java.lang.Throwable -> Ld21
            int r15 = androidx.startup.C0037.f37
            int r18 = com.google.android.material.theme.C0064.f64
            r0 = r18
            int r0 = r0 * (-3801)
            r18 = r0
            int r15 = r15 / r18
            if (r15 == 0) goto L8b0
            androidx.emoji2.text.C0026.m106()
            java.lang.String r15 = "ۡۢۥ"
            int r15 = com.ljx.wechatmod.auth.C0065.m263(r15)
            r43 = r3
            r46 = r15
            goto L51
        L8b0:
            int r15 = com.google.android.material.carousel.C0054.f54
            int r18 = androidx.appcompat.widget.C0016.f16
            r15 = r15 | r18
            r18 = 1751729(0x1abab1, float:2.454695E-39)
            int r15 = r15 + r18
            r43 = r3
            r46 = r15
            goto L51
        L8c1:
            int r3 = androidx.versionedparcelable.C0042.f42
            int r15 = com.ljx.wechatmod.hook.C0066.f66
            int r15 = r15 % 3316
            int r3 = r3 / r15
            if (r3 == 0) goto L8d4
            java.lang.String r3 = "ۦۤۤ"
            int r3 = androidx.activity.result.C0008.m35(r3)
            r46 = r3
            goto L51
        L8d4:
            int r3 = com.github.megatronking.stringfog.xor.C0046.f46
            int r15 = androidx.constraintlayout.helper.widget.C0017.f17
            r3 = r3 | r15
            r15 = 1753626(0x1ac21a, float:2.457353E-39)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        L8e1:
            int r3 = com.google.android.material.datepicker.C0059.m236()
            if (r3 > 0) goto L8ef
            r3 = 52
            kotlinx.coroutines.C0069.f69 = r3
            java.lang.String r3 = "۠۠ۤ"
            goto L658
        L8ef:
            java.lang.String r3 = "ۡ۟ۢ"
            r15 = r3
            r19 = r4
            goto L3c6
        L8f6:
            r3 = move-exception
            int r3 = androidx.fragment.app.C0027.f27
            int r15 = com.google.android.material.appbar.C0049.f49
            int r15 = r15 * (-9463)
            r3 = r3 ^ r15
            if (r3 > 0) goto L910
            r3 = 44
            androidx.emoji2.text.C0026.f26 = r3
            java.lang.String r3 = "ۡ۟ۦ"
            int r3 = androidx.versionedparcelable.C0041.m164(r3)
            r38 = r40
            r46 = r3
            goto L51
        L910:
            int r3 = androidx.versionedparcelable.C0040.f40
            int r15 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r3 = r3 * r15
            r15 = 1573199(0x18014f, float:2.204521E-39)
            int r3 = r3 + r15
            r38 = r40
            r46 = r3
            goto L51
        L91f:
            r3 = move-exception
            gn r3 = defpackage.gn.a     // Catch: java.lang.Throwable -> L8f6
            java.lang.Integer r15 = defpackage.b50.R(r40)     // Catch: java.lang.Throwable -> L8f6
            if (r15 == 0) goto L1fd
            int r18 = r15.intValue()     // Catch: java.lang.Throwable -> L8f6
            int r15 = com.google.android.material.theme.C0063.f63
            int r19 = com.google.android.material.chip.C0057.f57
            int r15 = r15 % r19
            r19 = 1752619(0x1abe2b, float:2.455942E-39)
            r15 = r15 ^ r19
            r42 = r3
            r46 = r15
            r47 = r18
            goto L51
        L93f:
            if (r7 != 0) goto L4c3
            if (r9 == 0) goto L4c3
            int r3 = android.os.Build.VERSION.SDK_INT
            r15 = 31
            if (r3 < r15) goto L4c3
            int r3 = androidx.recyclerview.widget.C0032.m128()
            if (r3 < 0) goto L9bf
            java.lang.String r3 = "ۧۧۢ"
            int r3 = androidx.profileinstaller.C0031.m127(r3)
            r46 = r3
            goto L51
        L959:
            int r3 = io.fastkv.C0068.f68
            int r15 = androidx.versionedparcelable.C0042.f42
            int r15 = r15 / 1308
            int r3 = r3 + r15
            if (r3 < 0) goto L96c
            java.lang.String r3 = "ۣ۟ۡ"
            int r3 = com.google.android.material.chip.C0057.m229(r3)
            r46 = r3
            goto L51
        L96c:
            int r3 = com.google.android.material.chip.C0056.f56
            int r15 = com.google.android.material.carousel.C0052.f52
            int r3 = r3 % r15
            r15 = 1755735(0x1aca57, float:2.460309E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        L979:
            int r3 = androidx.savedstate.C0034.f34
            int r15 = androidx.constraintlayout.widget.C0020.f20
            int r15 = r15 * (-4010)
            int r3 = r3 / r15
            if (r3 == 0) goto L98c
            java.lang.String r3 = "ۣ۟"
            int r3 = androidx.activity.C0010.m43(r3)
            r46 = r3
            goto L51
        L98c:
            java.lang.String r3 = "ۦ۠ۢ"
            r15 = r3
            r19 = r4
            goto L3c6
        L993:
            r28 = r29
        L995:
            int r3 = com.ljx.wechatmod.auth.C0065.f65
            if (r3 < 0) goto L9a3
            r3 = 26
            defpackage.C0072.f72 = r3
            java.lang.String r3 = "ۣ۠۠"
            r15 = r36
            goto L266
        L9a3:
            int r3 = com.google.android.material.appbar.C0049.f49
            int r15 = io.fastkv.C0068.f68
            int r3 = r3 * r15
            r15 = -1734242(0xffffffffffe5899e, float:NaN)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        L9b0:
            gn r3 = defpackage.gn.a     // Catch: java.lang.Throwable -> L35f
            r3.getClass()     // Catch: java.lang.Throwable -> L35f
            int r3 = com.github.megatronking.stringfog.annotation.C0044.m178()
            if (r3 < 0) goto L9c9
            r3 = 88
            defpackage.C0073.f73 = r3
        L9bf:
            java.lang.String r3 = "۟ۡۢ"
            int r3 = kotlinx.coroutines.C0069.m277(r3)
            r46 = r3
            goto L51
        L9c9:
            java.lang.String r3 = "ۦۨۡ"
            r15 = r24
            goto L85
        L9cf:
            r3 = r8
            goto L1ec
        L9d2:
            int r3 = android.support.v4.graphics.drawable.C0006.f6
            if (r3 > 0) goto L9e4
            r3 = 47
            com.google.android.material.appbar.C0049.f49 = r3
            java.lang.String r3 = "ۣۢۤ"
            int r3 = androidx.savedstate.C0036.m144(r3)
            r46 = r3
            goto L51
        L9e4:
            java.lang.String r15 = "۟ۧۤ"
            r3 = r13
            r19 = r4
            goto L3b3
        L9eb:
            int r3 = io.fastkv.C0068.f68
            int r15 = defpackage.C0072.f72
            r15 = r15 | (-3413(0xfffffffffffff2ab, float:NaN))
            int r3 = r3 + r15
            if (r3 < 0) goto L9fc
            r3 = 28
            com.github.megatronking.stringfog.C0047.f47 = r3
            java.lang.String r3 = "ۥۥ"
            goto Ld3
        L9fc:
            int r3 = androidx.constraintlayout.widget.C0018.f18
            int r15 = com.github.megatronking.stringfog.annotation.C0044.f44
            r3 = r3 ^ r15
            r15 = 1755007(0x1ac77f, float:2.459289E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        La09:
            int r3 = androidx.savedstate.C0036.f36
            int r15 = androidx.emoji2.text.C0026.f26
            int r15 = r15 / (-3822)
            r3 = r3 ^ r15
            if (r3 > 0) goto La22
            r3 = 90
            androidx.core.content.C0023.f23 = r3
            java.lang.String r3 = "ۨ۟ۧ"
            int r3 = androidx.savedstate.C0034.m138(r3)
            r45 = r10
            r46 = r3
            goto L51
        La22:
            int r3 = defpackage.C0072.f72
            int r15 = com.google.android.material.bottomsheet.C0051.f51
            r3 = r3 | r15
            r15 = -1754555(0xffffffffffe53a45, float:NaN)
            r3 = r3 ^ r15
            r45 = r10
            r46 = r3
            goto L51
        La31:
            int r3 = com.google.android.material.theme.C0062.f62
            int r15 = com.google.android.material.theme.C0063.f63
            int r15 = r15 / (-8680)
            r3 = r3 ^ r15
            if (r3 < 0) goto La41
            java.lang.String r3 = "۟۠۟"
            r15 = r3
            r19 = r4
            goto L3c6
        La41:
            int r3 = androidx.appcompat.widget.C0015.f15
            int r15 = androidx.emoji2.text.C0026.f26
            r3 = r3 ^ r15
            r15 = 1746921(0x1aa7e9, float:2.447958E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        La4e:
            int r3 = com.google.android.material.chip.C0056.f56
            int r15 = androidx.versionedparcelable.C0039.f39
            int r15 = r15 + (-232)
            r3 = r3 ^ r15
            if (r3 > 0) goto La5b
            r3 = r38
            goto Lc4
        La5b:
            int r3 = com.google.android.material.appbar.C0049.f49
            int r15 = androidx.savedstate.C0035.f35
            r3 = r3 | r15
            r15 = 1752902(0x1abf46, float:2.456339E-39)
            int r3 = r3 + r15
            r37 = r38
            r46 = r3
            goto L51
        La6a:
            int r3 = com.ljx.wechatmod.auth.C0065.f65
            if (r3 < 0) goto La72
            java.lang.String r3 = "ۧۥۥ"
            goto L4db
        La72:
            java.lang.String r3 = "۟ۦۡ"
        La74:
            int r3 = androidx.lifecycle.C0029.m116(r3)
            r46 = r3
            goto L51
        La7c:
            int r3 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r15 = androidx.coordinatorlayout.widget.C0022.f22
            int r3 = r3 - r15
            r15 = 1747713(0x1aab01, float:2.449068E-39)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        La89:
            int r3 = androidx.emoji2.text.C0026.f26
            int r15 = com.google.android.material.carousel.C0052.f52
            int r3 = r3 - r15
            r15 = 1752443(0x1abd7b, float:2.455696E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        La96:
            int r3 = com.google.android.material.floatingactionbutton.C0060.f60
            int r15 = androidx.savedstate.C0034.f34
            int r15 = r15 + 6554
            int r3 = r3 * r15
            if (r3 > 0) goto Laac
            com.ljx.wechatmod.auth.C0065.m260()
            java.lang.String r3 = "ۡۧۧ"
            int r3 = androidx.fragment.app.C0027.m110(r3)
            r46 = r3
            goto L51
        Laac:
            int r3 = androidx.appcompat.widget.C0016.f16
            int r15 = androidx.lifecycle.C0029.f29
            int r3 = r3 + r15
            r15 = 1755217(0x1ac851, float:2.459583E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        Lab9:
            r3 = r35
            goto L84a
        Labd:
            int r3 = android.app.C0000.m0()
            if (r3 < 0) goto Lac7
            java.lang.String r3 = "۟۠ۡ"
            goto L90
        Lac7:
            int r3 = androidx.savedstate.C0036.f36
            int r15 = io.fastkv.C0068.f68
            int r3 = r3 - r15
            r15 = 1749899(0x1ab38b, float:2.452131E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        Lad4:
            int r3 = android.app.C0001.f1
            int r15 = androidx.profileinstaller.C0030.f30
            int r3 = r3 % r15
            r15 = 1747786(0x1aab4a, float:2.44917E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        Lae1:
            int r3 = com.google.android.material.appbar.C0049.f49
            int r15 = kotlinx.coroutines.C0070.f70
            int r3 = r3 / r15
            r15 = 1754407(0x1ac527, float:2.458448E-39)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        Laee:
            int r3 = com.github.megatronking.stringfog.xor.C0045.m181()
            if (r3 > 0) goto Lb02
            r3 = 42
            androidx.versionedparcelable.C0042.f42 = r3
            java.lang.String r3 = "ۤ۠۠"
            int r3 = com.google.android.material.internal.C0061.m246(r3)
            r46 = r3
            goto L51
        Lb02:
            int r3 = com.google.android.material.theme.C0063.f63
            int r15 = defpackage.C0072.f72
            int r3 = r3 % r15
            r15 = 1754587(0x1ac5db, float:2.4587E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        Lb0f:
            int r3 = defpackage.C0073.f73
            int r15 = androidx.versionedparcelable.C0039.f39
            int r15 = r15 + (-679)
            int r3 = r3 % r15
            if (r3 > 0) goto Lb26
            r3 = 51
            com.google.android.material.carousel.C0053.f53 = r3
            java.lang.String r3 = "۟ۧۡ"
            int r3 = com.ljx.wechatmod.hook.C0066.m264(r3)
            r46 = r3
            goto L51
        Lb26:
            java.lang.String r3 = "ۨۥۢ"
            r15 = r24
            goto L85
        Lb2c:
            java.lang.String r3 = "ffcJ/jSqzXRo6yC5beGRHg==\n"
            java.lang.String r15 = "CZhFkUPPvzc=\n"
            java.lang.String r3 = "toLowerCase(...)"     // Catch: java.lang.Throwable -> Ld21
            defpackage.ip.n(r3, r8)     // Catch: java.lang.Throwable -> Ld21
            java.lang.String r3 = "۟ۧۡ"
            goto L541
        Lb3b:
            if (r28 != 0) goto Lc4a
            int r3 = androidx.appcompat.app.C0012.f12
            int r15 = androidx.core.content.C0024.f24
            int r15 = r15 + 5070
            r3 = r3 | r15
            if (r3 > 0) goto Lb51
            r3 = 6
            com.google.android.material.bottomsheet.C0051.f51 = r3
        Lb49:
            java.lang.String r15 = "ۡۢۦ"
            r3 = r39
            r18 = r40
            goto L2d1
        Lb51:
            java.lang.String r3 = "ۨ۠ۦ"
            goto Ld3
        Lb55:
            r0 = r34
            boolean r3 = r0 instanceof android.widget.EditText
            if (r3 == 0) goto L458
            int r3 = com.google.android.material.datepicker.C0059.f59
            if (r3 < 0) goto Lb6c
            androidx.savedstate.C0034.m137()
            java.lang.String r3 = "ۦۣۢ"
            int r3 = androidx.recyclerview.widget.C0032.m130(r3)
            r46 = r3
            goto L51
        Lb6c:
            int r3 = com.google.android.material.internal.C0061.f61
            int r15 = com.google.android.material.datepicker.C0059.f59
            int r3 = r3 / r15
            r15 = 1748866(0x1aaf82, float:2.450683E-39)
            r3 = r3 ^ r15
            r46 = r3
            goto L51
        Lb79:
            int r3 = androidx.recyclerview.widget.C0032.f32
            int r15 = com.google.android.material.carousel.C0052.f52
            int r3 = r3 - r15
            r15 = 1754456(0x1ac558, float:2.458516E-39)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        Lb86:
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r31)
            r0 = r19
            java.lang.Object r23 = r13.putIfAbsent(r14, r0)
            if (r23 != 0) goto Lc9e
            int r3 = androidx.activity.result.C0008.f8
            int r4 = androidx.emoji2.text.C0026.f26
            r4 = r4 ^ (-8425(0xffffffffffffdf17, float:NaN))
            int r3 = r3 * r4
            if (r3 > 0) goto Lbab
            r3 = 14
            androidx.constraintlayout.widget.C0019.f19 = r3
            java.lang.String r3 = "ۡۦ۠"
            int r3 = android.support.v4.graphics.drawable.C0005.m23(r3)
            r4 = r19
            r46 = r3
            goto L51
        Lbab:
            int r3 = androidx.core.content.C0024.f24
            int r4 = android.app.C0003.f3
            int r3 = r3 / r4
            r4 = 1754626(0x1ac602, float:2.458755E-39)
            int r3 = r3 + r4
            r4 = r19
            r46 = r3
            goto L51
        Lbba:
            int r3 = com.google.android.material.theme.C0064.f64
            if (r3 > 0) goto Lbcb
            androidx.core.widget.C0025.m103()
            java.lang.String r3 = "ۥۧۢ"
            int r3 = kotlinx.coroutines.C0069.m277(r3)
            r46 = r3
            goto L51
        Lbcb:
            java.lang.String r3 = "ۤۧ"
            goto L19d
        Lbcf:
            if (r6 == 0) goto L7a7
            if (r12 == 0) goto L7a7
            java.lang.String r3 = "1H+BO3K/Drs=\n"
            java.lang.String r15 = "txfgTwbWYNw=\n"
            java.lang.String r3 = "chatting"
            r15 = 0
            r0 = r45
            boolean r3 = defpackage.b50.B(r0, r3, r15)
            if (r3 != 0) goto L7a7
            java.lang.String r3 = "0Y4dJHIVIUTAjg==\n"
            java.lang.String r15 = "o+twTQZhQCo=\n"
            java.lang.String r3 = "remittance"
            r15 = 0
            r0 = r45
            boolean r3 = defpackage.b50.B(r0, r3, r15)
            if (r3 == 0) goto L78d
            float r3 = r34.getTextSize()
            r15 = 1117782016(0x42a00000, float:80.0)
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 <= 0) goto L78d
            int r3 = androidx.versionedparcelable.C0041.m167()
            if (r3 > 0) goto L191
            r3 = 91
            androidx.versionedparcelable.C0040.f40 = r3
            java.lang.String r3 = "ۣۧ۟"
            int r3 = androidx.legacy.content.C0028.m114(r3)
            r46 = r3
            goto L51
        Lc13:
            int r3 = androidx.appcompat.widget.C0015.f15
            int r15 = androidx.startup.C0037.f37
            r15 = r15 | (-939(0xfffffffffffffc55, float:NaN))
            int r3 = r3 / r15
            if (r3 > 0) goto Lc26
            java.lang.String r3 = "ۦ۟۟"
            int r3 = androidx.fragment.app.C0027.m110(r3)
            r46 = r3
            goto L51
        Lc26:
            java.lang.String r3 = "ۦ۟ۥ"
            goto L32b
        Lc2a:
            int r3 = androidx.viewpager2.adapter.C0043.f43
            int r15 = androidx.recyclerview.widget.C0033.f33
            r3 = r3 | r15
            r15 = 56003(0xdac3, float:7.8477E-41)
            int r3 = r3 + r15
            r46 = r3
            goto L51
        Lc37:
            if (r6 != 0) goto L7d8
            if (r7 != 0) goto L7d8
            int r3 = androidx.fragment.app.C0027.f27
            int r15 = androidx.coordinatorlayout.widget.C0021.f21
            int r15 = r15 + 9343
            r3 = r3 ^ r15
            if (r3 < 0) goto Lb49
            r3 = 25
            androidx.versionedparcelable.C0039.f39 = r3
            goto L500
        Lc4a:
            int r3 = defpackage.C0071.m284()
            if (r3 < 0) goto Lc5a
            java.lang.String r3 = "ۤۤۡ"
            int r3 = android.app.C0003.m13(r3)
            r46 = r3
            goto L51
        Lc5a:
            java.lang.String r3 = "۠ۢ۠"
            goto Ld3
        Lc5e:
            r3 = r4
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r9 = r3.booleanValue()
            int r3 = androidx.core.content.C0024.f24
            if (r3 > 0) goto Lc76
            androidx.appcompat.widget.C0016.m66()
            java.lang.String r3 = "ۣۢۨ"
            int r3 = com.google.android.material.behavior.C0050.m203(r3)
            r46 = r3
            goto L51
        Lc76:
            java.lang.String r3 = "ۢۡۡ"
            goto L128
        Lc7a:
            int r3 = androidx.fragment.app.C0027.f27
            int r15 = kotlinx.coroutines.C0070.f70
            int r15 = r15 * 1725
            int r3 = r3 * r15
            if (r3 < 0) goto Lc87
            java.lang.String r3 = "ۢۥ"
            goto L19d
        Lc87:
            java.lang.String r3 = "ۡۢۥ"
            goto L19d
        Lc8b:
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> Ld21
            int r15 = com.ljx.wechatmod.auth.C0065.f65
            int r18 = androidx.activity.result.C0008.f8
            int r15 = r15 % r18
            r18 = 1751393(0x1ab961, float:2.454224E-39)
            int r15 = r15 + r18
            r44 = r3
            r46 = r15
            goto L51
        Lc9e:
            int r3 = androidx.savedstate.C0036.m147()
            if (r3 < 0) goto Lcab
            com.github.megatronking.stringfog.xor.C0046.m185()
            java.lang.String r3 = "۠ۧ۠"
            goto La74
        Lcab:
            java.lang.String r3 = "ۧ۟۟"
            goto La74
        Lcaf:
            int r3 = r28.length()
            if (r3 != 0) goto Labd
            int r3 = com.google.android.material.carousel.C0054.f54
            int r15 = kotlinx.coroutines.C0070.f70
            int r15 = r15 % 2791
            int r3 = r3 / r15
            if (r3 > 0) goto Lccb
            android.view.C0007.m31()
            java.lang.String r3 = "ۣۨ۟"
            int r3 = androidx.core.widget.C0025.m102(r3)
            r46 = r3
            goto L51
        Lccb:
            java.lang.String r3 = "ۣۨۥ"
            goto L440
        Lccf:
            java.lang.String r3 = r28.toString()
            java.lang.String r5 = "XhX+bQVs8iFQBNhdHA==\n"
            java.lang.String r6 = "NXCHMnINnk0=\n"
            java.lang.String r5 = "key_wallet_on"
            boolean r6 = defpackage.gt.i(r5)
            java.lang.String r5 = "gZZ9Pz5mismLkH0/I3WQ1A==\n"
            java.lang.String r7 = "6vMEYE4U478=\n"
            java.lang.String r5 = "key_privacy_mask"
            boolean r7 = defpackage.gt.i(r5)
            if (r6 == 0) goto L3ec
            int r5 = r3.length()
            r15 = 50
            if (r5 >= r15) goto L3ec
            java.lang.String r5 = "ZGk=\n"
            java.lang.String r15 = "pszDuzXTJqo=\n"
            java.lang.String r5 = "\u00a5"
            r15 = 0
            boolean r5 = defpackage.b50.B(r3, r5, r15)
            if (r5 != 0) goto L586
            java.lang.String r5 = "nOHy\n"
            java.lang.String r15 = "c15Xx7RzxpQ=\n"
            java.lang.String r5 = "\uffe5"
            r15 = 0
            boolean r5 = defpackage.b50.B(r3, r5, r15)
            if (r5 == 0) goto L3ec
            int r5 = androidx.constraintlayout.widget.C0018.f18
            int r15 = androidx.emoji2.text.C0026.f26
            int r5 = r5 / r15
            r15 = 1754474(0x1ac56a, float:2.458542E-39)
            int r15 = r15 + r5
            r5 = r3
            r46 = r15
            goto L51
        Ld21:
            r3 = move-exception
            int r3 = com.google.android.material.behavior.C0050.f50
            int r15 = android.app.C0002.f2
            r3 = r3 ^ r15
            r15 = 1752755(0x1abeb3, float:2.456133E-39)
            int r3 = r3 + r15
            r45 = r16
            r46 = r3
            goto L51
        Ld31:
            int r3 = androidx.coordinatorlayout.widget.C0021.f21
            if (r3 < 0) goto Ld45
            r3 = 78
            defpackage.C0073.f73 = r3
            java.lang.String r3 = "ۢۦۦ"
            int r3 = androidx.savedstate.C0036.m144(r3)
            r33 = r30
            r46 = r3
            goto L51
        Ld45:
            r3 = r30
            goto L810
        Ld49:
            return
    }

    private final void e(de.robv.android.xposed.XC_MethodHook.MethodHookParam r13) {
            r12 = this;
            java.lang.String r0 = "fQ==\n"
            java.lang.String r1 = "DdBfWHdFcms=\n"
            java.lang.String r0 = "p"
            defpackage.ip.o(r0, r13)
            java.lang.Object r0 = r13.thisObject
            boolean r1 = r0 instanceof android.widget.ImageView
            if (r1 == 0) goto L2c
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6 = r0
        L14:
            if (r6 != 0) goto L2f
        L16:
            int r0 = androidx.startup.C0037.m150()
            if (r0 > 0) goto L2b
            java.lang.String r0 = "pbnNLgptfi"
            java.lang.String r0 = androidx.appcompat.app.C0012.m48(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2b:
            return
        L2c:
            r0 = 0
            r6 = r0
            goto L14
        L2f:
            java.lang.String r0 = "dcUWcDNH/Ll/wxZwLlTmpA==\n"
            java.lang.String r1 = "HqBvL0M1lc8=\n"
            java.lang.String r0 = "key_privacy_mask"
            boolean r7 = defpackage.gt.i(r0)
            java.lang.String r0 = "WArKbhk/7btXCtduCib5oVId\n"
            java.lang.String r1 = "M2+zMWtQmNU=\n"
            java.lang.String r0 = "key_rounded_avatar"
            boolean r8 = defpackage.gt.i(r0)
            if (r7 != 0) goto L7b
            if (r8 != 0) goto L7b
            r6.clearColorFilter()
            android.view.ViewOutlineProvider r0 = r6.getOutlineProvider()
            ay r1 = defpackage.dy.h
            if (r0 != r1) goto L5f
            r0 = 0
            r6.setClipToOutline(r0)
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BACKGROUND
            r6.setOutlineProvider(r0)
        L5f:
            int r0 = defpackage.dy.d
            r1 = -1
            if (r0 == r1) goto L16
            r0 = -1
            defpackage.dy.d = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            defpackage.dy.f = r0
            java.util.Map r0 = defpackage.dy.a
            r0.clear()
            java.util.Set r0 = defpackage.dy.b
            r0.clear()
            java.util.concurrent.ConcurrentHashMap r0 = defpackage.dy.c
            r0.clear()
            goto L2b
        L7b:
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> L312
            r0.getClass()     // Catch: java.lang.Throwable -> L312
            java.lang.String r0 = defpackage.gn.e     // Catch: java.lang.Throwable -> L312
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L312
            java.lang.String r2 = "KFtOlA==\n"
            java.lang.String r3 = "ehQBwC5x4u0=\n"
            java.lang.String r2 = "ROOT"     // Catch: java.lang.Throwable -> L312
            defpackage.ip.n(r2, r1)     // Catch: java.lang.Throwable -> L312
            java.lang.String r0 = r0.toLowerCase(r1)     // Catch: java.lang.Throwable -> L312
            java.lang.String r1 = "u2XDvXPnaw2ueer6Kqw3Zw==\n"
            java.lang.String r2 = "zwqP0gSCGU4=\n"
            java.lang.String r1 = "toLowerCase(...)"     // Catch: java.lang.Throwable -> L312
            defpackage.ip.n(r1, r0)     // Catch: java.lang.Throwable -> L312
            r5 = r0
        L9f:
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L2fc
            if (r0 != 0) goto L318
        La5:
            r0 = 2114650112(0x7e0b0000, float:4.6190673E37)
            java.lang.Object r0 = r6.getTag(r0)     // Catch: java.lang.Throwable -> L2fc
            boolean r1 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L2fc
            if (r1 == 0) goto L338
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2fc
        Lb1:
            if (r0 != 0) goto L269
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r1 = "Y/6M1diPgYMqtday\n"
            java.lang.String r2 = "BJv4m7ni5Ks=\n"
            "getName(...)"     // Catch: java.lang.Throwable -> L2fc
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r2 = "MEj9LQ==\n"
            java.lang.String r3 = "YgeyeV7l+rI=\n"
            java.lang.String r2 = "ROOT"     // Catch: java.lang.Throwable -> L2fc
            defpackage.ip.n(r2, r1)     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r2 = r0.toLowerCase(r1)     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r0 = "GObgPGVg1KEN+sl7PCuIyw==\n"
            java.lang.String r3 = "bImsUxIFpuI=\n"
            java.lang.String r0 = "toLowerCase(...)"     // Catch: java.lang.Throwable -> L2fc
            defpackage.ip.n(r0, r2)     // Catch: java.lang.Throwable -> L2fc
            int r0 = r6.getId()     // Catch: java.lang.Throwable -> L2fc
            r3 = -1
            if (r0 == r3) goto L33c
            android.content.Context r0 = r6.getContext()     // Catch: java.lang.Throwable -> L33b
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L33b
            int r3 = r6.getId()     // Catch: java.lang.Throwable -> L33b
            java.lang.String r0 = r0.getResourceEntryName(r3)     // Catch: java.lang.Throwable -> L33b
            java.lang.String r3 = "Wi2TQBPDTYxPK4JXGMRQgHMpindengzXFA==\n"
            java.lang.String r4 = "PUjnEnawIvk=\n"
            java.lang.String r3 = "getResourceEntryName(...)"     // Catch: java.lang.Throwable -> L33b
            defpackage.ip.n(r3, r0)     // Catch: java.lang.Throwable -> L33b
            java.lang.String r3 = "Jl0+EA==\n"
            java.lang.String r4 = "dBJxRNJ4DoM=\n"
            "ROOT"     // Catch: java.lang.Throwable -> L33b
            java.lang.String r0 = r0.toLowerCase(r1)     // Catch: java.lang.Throwable -> L33b
            java.lang.String r1 = "89xQCvj7LxnmwHlNobBzcw==\n"
            java.lang.String r3 = "h7McZY+eXVo=\n"
            java.lang.String r1 = "toLowerCase(...)"     // Catch: java.lang.Throwable -> L33b
            defpackage.ip.n(r1, r0)     // Catch: java.lang.Throwable -> L33b
            r1 = r0
        L117:
            java.lang.CharSequence r0 = r6.getContentDescription()     // Catch: java.lang.Throwable -> L2fc
            if (r0 == 0) goto L123
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2fc
            if (r0 != 0) goto L125
        L123:
            java.lang.String r0 = ""
        L125:
            java.lang.String r3 = "Z4bgi0k=\n"
            java.lang.String r4 = "AuuP4SD6LEU=\n"
            java.lang.String r3 = "emoji"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r2, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "OBogT+4=\n"
            java.lang.String r4 = "XXdPJYesEkI=\n"
            java.lang.String r3 = "emoji"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r1, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "VwIt\n"
            java.lang.String r4 = "MGtLV3m39Vw=\n"
            java.lang.String r3 = "gif"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r2, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "x98B\n"
            java.lang.String r4 = "oLZnZ1K6Lio=\n"
            java.lang.String r3 = "gif"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r1, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "vKIGItWK+w==\n"
            java.lang.String r4 = "z9ZvQb7viUk=\n"
            java.lang.String r3 = "sticker"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r2, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "KbLG2ZGqkw==\n"
            java.lang.String r4 = "WsavuvrP4bI=\n"
            java.lang.String r3 = "sticker"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r1, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "rD03GXvshaY=\n"
            java.lang.String r4 = "zlRWdgqF68E=\n"
            java.lang.String r3 = "biaoqing"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r1, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "w1dYwj8G7lLC\n"
            java.lang.String r4 = "tT48p1Bwhzc=\n"
            java.lang.String r3 = "videoview"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r2, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "pkIaVeAXSzW8XBpV4A==\n"
            java.lang.String r4 = "zy97MoVIJlA=\n"
            java.lang.String r3 = "image_message"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r1, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "GAdi41fL3GUkDGz5V8fcdg==\n"
            java.lang.String r4 = "e28DlyOisgI=\n"
            java.lang.String r3 = "chatting_content"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r1, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "wYf9jbY=\n"
            java.lang.String r4 = "te+I4NQPKAg=\n"
            java.lang.String r3 = "thumb"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r1, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "RvPFq3M=\n"
            java.lang.String r4 = "JZyzzgGQVus=\n"
            java.lang.String r3 = "cover"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r1, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "FzaHPPtC\n"
            java.lang.String r4 = "ZFnyTpgnVDA=\n"
            java.lang.String r3 = "source"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r1, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "hgOaAlci\n"
            java.lang.String r4 = "53PqbyRFdY0=\n"
            java.lang.String r3 = "appmsg"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r1, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "kVDNuuGjKMg=\n"
            java.lang.String r4 = "8CC92JPCRqw=\n"
            java.lang.String r3 = "appbrand"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r2, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "VcnQ9xIZ\n"
            java.lang.String r4 = "J6yxk3drefk=\n"
            java.lang.String r3 = "reader"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r1, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "kigM0x+x\n"
            java.lang.String r4 = "eomkNZw0Vq4=\n"
            java.lang.String r3 = "\u8868\u60c5"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r0, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "Hu5sd0ME\n"
            java.lang.String r4 = "+2TEkNe/hfw=\n"
            java.lang.String r3 = "\u52a8\u753b"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r0, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "YKHL3fB/\n"
            java.lang.String r4 = "hTp1Onn4vEM=\n"
            java.lang.String r3 = "\u56fe\u7247"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r0, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "LTb8/qWJ\n"
            java.lang.String r4 = "yIZ9FzgrdGw=\n"
            java.lang.String r3 = "\u5c01\u9762"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r3 = defpackage.b50.B(r0, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r3 != 0) goto L260
            java.lang.String r3 = "X3/2OeafwKYG\n"
            java.lang.String r4 = "uMNf3nM6JT0=\n"
            java.lang.String r3 = "\u7f29\u7565\u56fe"     // Catch: java.lang.Throwable -> L2fc
            r4 = 0
            boolean r0 = defpackage.b50.B(r0, r3, r4)     // Catch: java.lang.Throwable -> L2fc
            if (r0 == 0) goto L341
        L260:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2fc
        L262:
            if (r0 == 0) goto L654
            r1 = 2114650112(0x7e0b0000, float:4.6190673E37)
            r6.setTag(r1, r0)     // Catch: java.lang.Throwable -> L2fc
        L269:
            r0 = 2114650112(0x7e0b0000, float:4.6190673E37)
            java.lang.Object r0 = r6.getTag(r0)     // Catch: java.lang.Throwable -> L2fc
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2fc
            boolean r0 = defpackage.ip.i(r0, r1)     // Catch: java.lang.Throwable -> L2fc
            if (r0 == 0) goto L76f
            if (r8 == 0) goto L28d
            ay r0 = defpackage.dy.h     // Catch: java.lang.Throwable -> L2fc
            if (r0 == 0) goto L28d
            android.view.ViewOutlineProvider r1 = r6.getOutlineProvider()     // Catch: java.lang.Throwable -> L2fc
            if (r1 == r0) goto L28a
            r6.setOutlineProvider(r0)     // Catch: java.lang.Throwable -> L2fc
            r0 = 1
            r6.setClipToOutline(r0)     // Catch: java.lang.Throwable -> L2fc
        L28a:
            r6.invalidateOutline()     // Catch: java.lang.Throwable -> L2fc
        L28d:
            if (r7 == 0) goto L76a
            java.lang.String r0 = "8CLoGuwTZfr6JOga7xV14P4=\n"
            java.lang.String r1 = "m0eRRZxhDIw=\n"
            java.lang.String r0 = "key_privacy_style"     // Catch: java.lang.Throwable -> L2fc
            r1 = 0
            int r0 = defpackage.gt.j(r0, r1)     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r1 = "Ake+cl8m1C8IQb5yTTjIKzZLqVlKOs4wHVs=\n"
            java.lang.String r2 = "aSLHLS9UvVk=\n"
            java.lang.String r1 = "key_privacy_blur_intensity"     // Catch: java.lang.Throwable -> L2fc
            r2 = 100
            int r1 = defpackage.gt.j(r1, r2)     // Catch: java.lang.Throwable -> L2fc
            int r2 = defpackage.dy.d     // Catch: java.lang.Throwable -> L2fc
            if (r2 != r0) goto L2b2
            int r2 = defpackage.dy.e     // Catch: java.lang.Throwable -> L2fc
            if (r2 == r1) goto L2c0
        L2b2:
            defpackage.dy.d = r0     // Catch: java.lang.Throwable -> L2fc
            defpackage.dy.e = r1     // Catch: java.lang.Throwable -> L2fc
            java.util.Map r0 = defpackage.dy.a     // Catch: java.lang.Throwable -> L2fc
            r0.clear()     // Catch: java.lang.Throwable -> L2fc
            java.util.Set r0 = defpackage.dy.b     // Catch: java.lang.Throwable -> L2fc
            r0.clear()     // Catch: java.lang.Throwable -> L2fc
        L2c0:
            java.lang.String r0 = "qE43pcXxx9aiSDelxvfXzKY=\n"
            java.lang.String r1 = "wytO+rWDrqA=\n"
            java.lang.String r0 = "key_privacy_style"     // Catch: java.lang.Throwable -> L2fc
            r1 = 0
            int r0 = defpackage.gt.j(r0, r1)     // Catch: java.lang.Throwable -> L2fc
            r1 = 1
            if (r0 != r1) goto L674
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2fc
            r1 = 31
            if (r0 < r1) goto L674
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = "d9C27vFh0gN91rbu43/OB0PcocXkfcgcaMw=\n"
            java.lang.String r2 = "HLXPsYETu3U=\n"
            java.lang.String r1 = "key_privacy_blur_intensity"     // Catch: java.lang.Throwable -> L2fc
            r2 = 100
            int r1 = defpackage.gt.j(r1, r2)     // Catch: java.lang.Throwable -> L2fc
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L2fc
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            r2 = 1097859072(0x41700000, float:15.0)
            float r1 = r1 * r2
            float r0 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> L2fc
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP     // Catch: java.lang.Throwable -> L2fc
            android.graphics.RenderEffect r0 = defpackage.p7.e(r0, r0)     // Catch: java.lang.Throwable -> L2fc
            defpackage.p7.p(r6, r0)     // Catch: java.lang.Throwable -> L2fc
            goto L16
        L2fc:
            r0 = move-exception
            java.lang.String r0 = "Nwje\n"
            java.lang.String r1 = "Q2m5jaPP2Zc=\n"
            java.lang.String r2 = "zZVuN9BxcgXyiGwe+H9qKvg=\n"
            java.lang.String r3 = "necHQbESC00=\n"
            java.lang.String r2 = "PrivacyHook_Image"
            java.lang.String r3 = "Fg==\n"
            java.lang.String r4 = "c8HJlSTQVfc=\n"
            defpackage.z30.o(r0, r1, r2, r3, r4)
            goto L16
        L312:
            r0 = move-exception
            java.lang.String r0 = ""
            r5 = r0
            goto L9f
        L318:
            java.lang.String r0 = "V85FTJa4qPBOxg==\n"
            java.lang.String r1 = "O68wIvXQzYI=\n"
            java.lang.String r0 = "launcherui"     // Catch: java.lang.Throwable -> L2fc
            r1 = 0
            boolean r0 = defpackage.b50.B(r5, r0, r1)     // Catch: java.lang.Throwable -> L2fc
            if (r0 != 0) goto La5
            java.lang.String r0 = "mGvPIMha/FaOag==\n"
            java.lang.String r1 = "+wOuVLwzkjE=\n"
            java.lang.String r0 = "chattingui"     // Catch: java.lang.Throwable -> L2fc
            r1 = 0
            boolean r0 = defpackage.b50.B(r5, r0, r1)     // Catch: java.lang.Throwable -> L2fc
            if (r0 == 0) goto L16
            goto La5
        L338:
            r0 = 0
            goto Lb1
        L33b:
            r0 = move-exception
        L33c:
            java.lang.String r0 = ""
            r1 = r0
            goto L117
        L341:
            java.lang.String r0 = "wRaMuUU4\n"
            java.lang.String r3 = "oGDtzSRKXnc=\n"
            java.lang.String r0 = "avatar"     // Catch: java.lang.Throwable -> L2fc
            r3 = 0
            boolean r0 = defpackage.b50.B(r2, r0, r3)     // Catch: java.lang.Throwable -> L2fc
            if (r0 != 0) goto L367
            java.lang.String r0 = "W6DsjZ4X\n"
            java.lang.String r2 = "OtaN+f9lSWQ=\n"
            java.lang.String r0 = "avatar"     // Catch: java.lang.Throwable -> L2fc
            r2 = 0
            boolean r0 = defpackage.b50.B(r1, r0, r2)     // Catch: java.lang.Throwable -> L2fc
            if (r0 != 0) goto L367
            java.util.List r0 = defpackage.pb0.H0     // Catch: java.lang.Throwable -> L2fc
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L2fc
            if (r0 == 0) goto L36b
        L367:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2fc
            goto L262
        L36b:
            java.lang.String r0 = "hcB3y/C2aA2TwQ==\n"
            java.lang.String r1 = "5qgWv4TfBmo=\n"
            java.lang.String r0 = "chattingui"     // Catch: java.lang.Throwable -> L2fc
            r1 = 0
            boolean r3 = defpackage.b50.B(r5, r0, r1)     // Catch: java.lang.Throwable -> L2fc
            android.view.ViewParent r0 = r6.getParent()     // Catch: java.lang.Throwable -> L2fc
            boolean r1 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L2fc
            if (r1 == 0) goto L422
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L2fc
        L382:
            r1 = 0
            r2 = r0
            r4 = r1
        L385:
            if (r2 == 0) goto L42b
            r0 = 15
            if (r4 >= r0) goto L42b
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r1 = "wpiBz5dw/PqL09uo\n"
            java.lang.String r9 = "pf31gfYdmdI=\n"
            "getName(...)"     // Catch: java.lang.Throwable -> L2fc
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r9 = "q+vZKQ==\n"
            java.lang.String r10 = "+aSWfYH37N0=\n"
            java.lang.String r9 = "ROOT"     // Catch: java.lang.Throwable -> L2fc
            defpackage.ip.n(r9, r1)     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r9 = r0.toLowerCase(r1)     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r0 = "09rN1NWQLrfGxuSTjNty3Q==\n"
            java.lang.String r10 = "p7WBu6L1XPQ=\n"
            java.lang.String r0 = "toLowerCase(...)"     // Catch: java.lang.Throwable -> L2fc
            defpackage.ip.n(r0, r9)     // Catch: java.lang.Throwable -> L2fc
            int r0 = r2.getId()     // Catch: java.lang.Throwable -> L2fc
            r10 = -1
            if (r0 == r10) goto L426
            android.content.Context r0 = r2.getContext()     // Catch: java.lang.Throwable -> L425
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L425
            int r10 = r2.getId()     // Catch: java.lang.Throwable -> L425
            java.lang.String r0 = r0.getResourceEntryName(r10)     // Catch: java.lang.Throwable -> L425
            java.lang.String r10 = "KVQdxKbYQh88UgzTrd9fEwBQBPPrhQNEZw==\n"
            java.lang.String r11 = "TjFplsOrLWo=\n"
            java.lang.String r10 = "getResourceEntryName(...)"     // Catch: java.lang.Throwable -> L425
            defpackage.ip.n(r10, r0)     // Catch: java.lang.Throwable -> L425
            java.lang.String r10 = "nBT2IA==\n"
            java.lang.String r11 = "zlu5dHojA7o=\n"
            "ROOT"     // Catch: java.lang.Throwable -> L425
            java.lang.String r0 = r0.toLowerCase(r1)     // Catch: java.lang.Throwable -> L425
            java.lang.String r1 = "SMShrQ5YYMtd2IjqVxM8oQ==\n"
            java.lang.String r10 = "PKvtwnk9Eog=\n"
            java.lang.String r1 = "toLowerCase(...)"     // Catch: java.lang.Throwable -> L425
            defpackage.ip.n(r1, r0)     // Catch: java.lang.Throwable -> L425
        L3ee:
            java.lang.String r1 = "E1Vqh7ssvJc=\n"
            java.lang.String r10 = "cD0L889F0vA=\n"
            java.lang.String r1 = "chatting"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r0 = defpackage.b50.B(r0, r1, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r0 != 0) goto L40c
            java.lang.String r0 = "j4U72ppF+4M=\n"
            java.lang.String r1 = "7O1aru4sleQ=\n"
            java.lang.String r0 = "chatting"     // Catch: java.lang.Throwable -> L2fc
            r1 = 0
            boolean r0 = defpackage.b50.B(r9, r0, r1)     // Catch: java.lang.Throwable -> L2fc
            if (r0 == 0) goto L782
        L40c:
            r0 = 1
            r1 = r0
        L40e:
            android.view.ViewParent r0 = r2.getParent()     // Catch: java.lang.Throwable -> L2fc
            boolean r2 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L2fc
            if (r2 == 0) goto L429
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L2fc
        L418:
            int r2 = 0 - r4
            int r2 = r2 + (-1)
            int r4 = 0 - r2
            r2 = r0
            r3 = r1
            goto L385
        L422:
            r0 = 0
            goto L382
        L425:
            r0 = move-exception
        L426:
            java.lang.String r0 = ""
            goto L3ee
        L429:
            r0 = 0
            goto L418
        L42b:
            android.view.ViewParent r0 = r6.getParent()     // Catch: java.lang.Throwable -> L2fc
            boolean r1 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L2fc
            if (r1 == 0) goto L51c
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L2fc
        L435:
            r2 = 0
            r1 = r0
        L437:
            if (r1 == 0) goto L62b
            r0 = 15
            if (r2 >= r0) goto L62b
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r4 = "2JN7Wq3efZSR2CE9\n"
            java.lang.String r9 = "v/YPFMyzGLw=\n"
            "getName(...)"     // Catch: java.lang.Throwable -> L2fc
            java.util.Locale r4 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r9 = "BixFgw==\n"
            java.lang.String r10 = "VGMK11RxC6Q=\n"
            java.lang.String r9 = "ROOT"     // Catch: java.lang.Throwable -> L2fc
            defpackage.ip.n(r9, r4)     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r9 = r0.toLowerCase(r4)     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r0 = "XhrWmY/3C9lLBv/e1rxXsw==\n"
            java.lang.String r10 = "KnWa9viSeZo=\n"
            java.lang.String r0 = "toLowerCase(...)"     // Catch: java.lang.Throwable -> L2fc
            defpackage.ip.n(r0, r9)     // Catch: java.lang.Throwable -> L2fc
            int r0 = r1.getId()     // Catch: java.lang.Throwable -> L2fc
            r10 = -1
            if (r0 == r10) goto L520
            android.content.Context r0 = r1.getContext()     // Catch: java.lang.Throwable -> L51f
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L51f
            int r10 = r1.getId()     // Catch: java.lang.Throwable -> L51f
            java.lang.String r0 = r0.getResourceEntryName(r10)     // Catch: java.lang.Throwable -> L51f
            java.lang.String r10 = "dMdL/9UXTCdhwVro3hBRK13DUsiYSg18Og==\n"
            java.lang.String r11 = "E6I/rbBkI1I=\n"
            java.lang.String r10 = "getResourceEntryName(...)"     // Catch: java.lang.Throwable -> L51f
            defpackage.ip.n(r10, r0)     // Catch: java.lang.Throwable -> L51f
            java.lang.String r10 = "jarR+Q==\n"
            java.lang.String r11 = "3+WercEu1zE=\n"
            "ROOT"     // Catch: java.lang.Throwable -> L51f
            java.lang.String r0 = r0.toLowerCase(r4)     // Catch: java.lang.Throwable -> L51f
            java.lang.String r4 = "bX0X0lx3q9p4YT6VBTz3sA==\n"
            java.lang.String r10 = "GRJbvSsS2Zk=\n"
            java.lang.String r4 = "toLowerCase(...)"     // Catch: java.lang.Throwable -> L51f
            defpackage.ip.n(r4, r0)     // Catch: java.lang.Throwable -> L51f
        L4a0:
            java.lang.String r4 = "2dKj5dQ=\n"
            java.lang.String r10 = "vL/Mj70mC9Q=\n"
            java.lang.String r4 = "emoji"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r9, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "PXRiWfA=\n"
            java.lang.String r10 = "WBkNM5mxbNc=\n"
            java.lang.String r4 = "emoji"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r0, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "Bcvneeto\n"
            java.lang.String r10 = "dqaOFY4Rkq4=\n"
            java.lang.String r4 = "smiley"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r9, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "NcSyQa2a\n"
            java.lang.String r10 = "RqnbLcjjY40=\n"
            java.lang.String r4 = "smiley"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r0, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "38EXhs3pcyk=\n"
            java.lang.String r10 = "uqx48qSKHEc=\n"
            java.lang.String r4 = "emoticon"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r9, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "gl9e+DQpZKo=\n"
            java.lang.String r10 = "5zIxjF1KC8Q=\n"
            java.lang.String r4 = "emoticon"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r0, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "c7yA60/djg8=\n"
            java.lang.String r10 = "GNn5iSC8/Gs=\n"
            java.lang.String r4 = "keyboard"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r9, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "bZMHgzc=\n"
            java.lang.String r10 = "BP139kML1NI=\n"
            java.lang.String r4 = "input"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r0, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 == 0) goto L524
        L518:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2fc
            goto L262
        L51c:
            r0 = 0
            goto L435
        L51f:
            r0 = move-exception
        L520:
            java.lang.String r0 = ""
            goto L4a0
        L524:
            if (r3 == 0) goto L616
            java.lang.String r4 = "Jac/aG0=\n"
            java.lang.String r10 = "VNJQHAiKzp8=\n"
            java.lang.String r4 = "quote"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r9, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "6xpMUMY=\n"
            java.lang.String r10 = "mm8jJKMdUZQ=\n"
            java.lang.String r4 = "quote"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r0, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "RF8mTAM=\n"
            java.lang.String r10 = "NjpWIHpjCLM=\n"
            java.lang.String r4 = "reply"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r9, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "SNR1+54=\n"
            java.lang.String r10 = "OrEFl+dgyrE=\n"
            java.lang.String r4 = "reply"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r0, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "mG64u6I=\n"
            java.lang.String r10 = "6A/W3s5LKbU=\n"
            java.lang.String r4 = "panel"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r9, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "kIKtRBo=\n"
            java.lang.String r10 = "4OPDIXayd50=\n"
            java.lang.String r4 = "panel"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r0, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "pIS4rAf1\n"
            java.lang.String r10 = "wuvX2GKH8/I=\n"
            java.lang.String r4 = "footer"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r9, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "SsbCXRRu\n"
            java.lang.String r10 = "LKmtKXEc/sk=\n"
            java.lang.String r4 = "footer"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r0, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "ZKbv17LS\n"
            java.lang.String r10 = "Bsmbo92/B/U=\n"
            java.lang.String r4 = "bottom"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r9, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "TSMNFpdo\n"
            java.lang.String r10 = "L0x5YvgFjm0=\n"
            java.lang.String r4 = "bottom"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r0, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "7hoSbg==\n"
            java.lang.String r10 = "iWh7CmeiRIo=\n"
            java.lang.String r4 = "grid"     // Catch: java.lang.Throwable -> L2fc
            r10 = 0
            boolean r4 = defpackage.b50.B(r9, r4, r10)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "zl5Zpw==\n"
            java.lang.String r9 = "qSwww4dOgTo=\n"
            java.lang.String r4 = "grid"     // Catch: java.lang.Throwable -> L2fc
            r9 = 0
            boolean r4 = defpackage.b50.B(r0, r4, r9)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "g+X8RTRzUkO/7vJfNH9SUA==\n"
            java.lang.String r9 = "4I2dMUAaPCQ=\n"
            java.lang.String r4 = "chatting_content"     // Catch: java.lang.Throwable -> L2fc
            r9 = 0
            boolean r4 = defpackage.b50.B(r0, r4, r9)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "WV7x6wTv3g9lX+T6HdnRGEpb4/g=\n"
            java.lang.String r9 = "OjaQn3CGsGg=\n"
            java.lang.String r4 = "chatting_item_appmsg"     // Catch: java.lang.Throwable -> L2fc
            r9 = 0
            boolean r4 = defpackage.b50.B(r0, r4, r9)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "1KvlSAJM\n"
            java.lang.String r9 = "p8SQOmEph8k=\n"
            java.lang.String r4 = "source"     // Catch: java.lang.Throwable -> L2fc
            r9 = 0
            boolean r4 = defpackage.b50.B(r0, r4, r9)     // Catch: java.lang.Throwable -> L2fc
            if (r4 != 0) goto L518
            java.lang.String r4 = "9c9TYA==\n"
            java.lang.String r9 = "lq4hBEudCYQ=\n"
            java.lang.String r4 = "card"     // Catch: java.lang.Throwable -> L2fc
            r9 = 0
            boolean r0 = defpackage.b50.B(r0, r4, r9)     // Catch: java.lang.Throwable -> L2fc
            if (r0 != 0) goto L518
        L616:
            android.view.ViewParent r0 = r1.getParent()     // Catch: java.lang.Throwable -> L2fc
            boolean r1 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L2fc
            if (r1 == 0) goto L629
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L2fc
        L620:
            int r1 = r2 + 4
            int r1 = r1 + 1
            int r2 = r1 + (-4)
            r1 = r0
            goto L437
        L629:
            r0 = 0
            goto L620
        L62b:
            if (r3 == 0) goto L643
            r0 = 1107820544(0x42080000, float:34.0)
        L62f:
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()     // Catch: java.lang.Throwable -> L2fc
            if (r1 == 0) goto L646
            int r2 = r1.width     // Catch: java.lang.Throwable -> L2fc
            if (r2 <= 0) goto L646
            int r1 = r1.height     // Catch: java.lang.Throwable -> L2fc
            if (r1 <= 0) goto L646
            java.lang.Boolean r0 = i(r6, r0, r2, r1)     // Catch: java.lang.Throwable -> L2fc
            goto L262
        L643:
            r0 = 1094713344(0x41400000, float:12.0)
            goto L62f
        L646:
            int r1 = r6.getWidth()     // Catch: java.lang.Throwable -> L2fc
            int r2 = r6.getHeight()     // Catch: java.lang.Throwable -> L2fc
            java.lang.Boolean r0 = i(r6, r0, r1, r2)     // Catch: java.lang.Throwable -> L2fc
            goto L262
        L654:
            r0 = 2114650114(0x7e0b0002, float:4.6190683E37)
            java.lang.Object r0 = r6.getTag(r0)     // Catch: java.lang.Throwable -> L2fc
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2fc
            boolean r0 = defpackage.ip.i(r0, r1)     // Catch: java.lang.Throwable -> L2fc
            if (r0 != 0) goto L269
            r0 = 2114650114(0x7e0b0002, float:4.6190683E37)
            r6.setTag(r0, r1)     // Catch: java.lang.Throwable -> L2fc
            o7 r0 = new o7     // Catch: java.lang.Throwable -> L2fc
            r1 = 1
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L2fc
            r6.addOnLayoutChangeListener(r0)     // Catch: java.lang.Throwable -> L2fc
            goto L269
        L674:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2fc
            r1 = 31
            if (r0 < r1) goto L67d
            defpackage.p7.o(r6)     // Catch: java.lang.Throwable -> L2fc
        L67d:
            i00 r3 = new i00     // Catch: java.lang.Throwable -> L2fc
            r3.<init>()     // Catch: java.lang.Throwable -> L2fc
            java.lang.reflect.Member r0 = r13.method     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r1 = "b+LM+wljU6Ne7szfBXI=\n"
            java.lang.String r2 = "HIe4smQCNMY=\n"
            java.lang.String r1 = "setImageBitmap"     // Catch: java.lang.Throwable -> L2fc
            boolean r4 = defpackage.ip.i(r0, r1)     // Catch: java.lang.Throwable -> L2fc
            if (r4 == 0) goto L6c9
            java.lang.Object[] r0 = r13.args     // Catch: java.lang.Throwable -> L2fc
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2fc
            boolean r1 = r0 instanceof android.graphics.Bitmap     // Catch: java.lang.Throwable -> L2fc
            if (r1 == 0) goto L6c7
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L2fc
        L6a1:
            r3.b = r0     // Catch: java.lang.Throwable -> L2fc
        L6a3:
            java.lang.Object r0 = r3.b     // Catch: java.lang.Throwable -> L2fc
            if (r0 == 0) goto L16
            java.util.Set r1 = defpackage.dy.b     // Catch: java.lang.Throwable -> L2fc
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L2fc
            if (r0 != 0) goto L16
            java.util.Map r0 = defpackage.dy.a     // Catch: java.lang.Throwable -> L2fc
            java.lang.Object r1 = r3.b     // Catch: java.lang.Throwable -> L2fc
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2fc
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L2fc
            if (r0 == 0) goto L731
            if (r4 == 0) goto L722
            java.lang.Object[] r1 = r13.args     // Catch: java.lang.Throwable -> L2fc
            r2 = 0
            r1[r2] = r0     // Catch: java.lang.Throwable -> L2fc
        L6c2:
            r6.clearColorFilter()     // Catch: java.lang.Throwable -> L2fc
            goto L16
        L6c7:
            r0 = 0
            goto L6a1
        L6c9:
            java.lang.Object[] r0 = r13.args     // Catch: java.lang.Throwable -> L2fc
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2fc
            boolean r1 = r0 instanceof android.graphics.drawable.Drawable     // Catch: java.lang.Throwable -> L2fc
            if (r1 == 0) goto L6e1
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch: java.lang.Throwable -> L2fc
        L6d4:
            boolean r1 = r0 instanceof android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Throwable -> L2fc
            if (r1 == 0) goto L6e3
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0     // Catch: java.lang.Throwable -> L2fc
            android.graphics.Bitmap r0 = r0.getBitmap()     // Catch: java.lang.Throwable -> L2fc
            r3.b = r0     // Catch: java.lang.Throwable -> L2fc
            goto L6a3
        L6e1:
            r0 = 0
            goto L6d4
        L6e3:
            if (r0 == 0) goto L6a3
            int r2 = r0.getIntrinsicWidth()     // Catch: java.lang.Throwable -> L71d
            r1 = 150(0x96, float:2.1E-43)
            if (r2 <= 0) goto L71f
            int r2 = r0.getIntrinsicWidth()     // Catch: java.lang.Throwable -> L71d
        L6f1:
            int r5 = r0.getIntrinsicHeight()     // Catch: java.lang.Throwable -> L71d
            if (r5 <= 0) goto L6fb
            int r1 = r0.getIntrinsicHeight()     // Catch: java.lang.Throwable -> L71d
        L6fb:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L71d
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r1, r5)     // Catch: java.lang.Throwable -> L71d
            r3.b = r1     // Catch: java.lang.Throwable -> L71d
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L71d
            java.lang.Object r1 = r3.b     // Catch: java.lang.Throwable -> L71d
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L71d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L71d
            r1 = 0
            r5 = 0
            int r7 = r2.getWidth()     // Catch: java.lang.Throwable -> L71d
            int r8 = r2.getHeight()     // Catch: java.lang.Throwable -> L71d
            r0.setBounds(r1, r5, r7, r8)     // Catch: java.lang.Throwable -> L71d
            r0.draw(r2)     // Catch: java.lang.Throwable -> L71d
            goto L6a3
        L71d:
            r0 = move-exception
            goto L6a3
        L71f:
            r2 = 150(0x96, float:2.1E-43)
            goto L6f1
        L722:
            java.lang.Object[] r1 = r13.args     // Catch: java.lang.Throwable -> L2fc
            r2 = 0
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Throwable -> L2fc
            android.content.res.Resources r4 = r6.getResources()     // Catch: java.lang.Throwable -> L2fc
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L2fc
            r1[r2] = r3     // Catch: java.lang.Throwable -> L2fc
            goto L6c2
        L731:
            java.lang.String r0 = "ivQJEgX110OR\n"
            java.lang.String r1 = "qcwxKj3N73s=\n"
            java.lang.String r0 = "#88888888"     // Catch: java.lang.Throwable -> L2fc
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Throwable -> L2fc
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch: java.lang.Throwable -> L2fc
            r6.setColorFilter(r0, r1)     // Catch: java.lang.Throwable -> L2fc
            java.lang.Object r0 = r3.b     // Catch: java.lang.Throwable -> L2fc
            int r0 = java.lang.System.identityHashCode(r0)     // Catch: java.lang.Throwable -> L2fc
            java.lang.String r1 = "rfGeKYsy+J6r/Zg9gDD8iKQ=\n"
            java.lang.String r2 = "6rTbYtR/t80=\n"
            java.lang.String r1 = "GEEK_MOSAIC_TOKEN"     // Catch: java.lang.Throwable -> L2fc
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L2fc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2fc
            r6.setTag(r1, r2)     // Catch: java.lang.Throwable -> L2fc
            java.lang.Thread r1 = new java.lang.Thread     // Catch: java.lang.Throwable -> L2fc
            cy r2 = new cy     // Catch: java.lang.Throwable -> L2fc
            r2.<init>(r3, r6, r0, r4)     // Catch: java.lang.Throwable -> L2fc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2fc
            r1.start()     // Catch: java.lang.Throwable -> L2fc
            goto L16
        L76a:
            r6.clearColorFilter()     // Catch: java.lang.Throwable -> L2fc
            goto L16
        L76f:
            android.view.ViewOutlineProvider r0 = r6.getOutlineProvider()     // Catch: java.lang.Throwable -> L2fc
            ay r1 = defpackage.dy.h     // Catch: java.lang.Throwable -> L2fc
            if (r0 != r1) goto L16
            r0 = 0
            r6.setClipToOutline(r0)     // Catch: java.lang.Throwable -> L2fc
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BACKGROUND     // Catch: java.lang.Throwable -> L2fc
            r6.setOutlineProvider(r0)     // Catch: java.lang.Throwable -> L2fc
            goto L16
        L782:
            r1 = r3
            goto L40e
    }

    private final void f(de.robv.android.xposed.XC_MethodHook.MethodHookParam r13) {
            r12 = this;
            r11 = 0
            r3 = 0
            java.lang.String r0 = "ۣۢۨ"
            int r0 = androidx.appcompat.widget.C0015.m60(r0)
            r1 = r3
            r10 = r3
            r4 = r3
            r5 = r3
            r9 = r3
            r6 = r3
            r2 = r3
            r7 = r0
        L10:
            switch(r7) {
                case 56445: goto L14;
                case 56447: goto L267;
                case 56480: goto L7d;
                case 56509: goto Lbb;
                case 56569: goto L14a;
                case 1746718: goto L24f;
                case 1746784: goto L7d;
                case 1746910: goto L21e;
                case 1746970: goto L208;
                case 1747871: goto L19a;
                case 1748613: goto L267;
                case 1748647: goto L1ec;
                case 1748796: goto L25;
                case 1749665: goto Lff;
                case 1750633: goto L139;
                case 1750688: goto L116;
                case 1750780: goto L88;
                case 1751618: goto L19a;
                case 1751624: goto L159;
                case 1751744: goto Lde;
                case 1751774: goto L19a;
                case 1752461: goto L45;
                case 1752642: goto L5e;
                case 1753574: goto L24f;
                case 1753631: goto L237;
                case 1753698: goto Lcb;
                case 1754473: goto L1b6;
                case 1754475: goto Lfa;
                case 1754504: goto L177;
                case 1755374: goto L1a3;
                case 1755560: goto L211;
                case 1755622: goto L1c2;
                default: goto L13;
            }
        L13:
            goto L10
        L14:
            int r0 = androidx.versionedparcelable.C0040.f40
            int r7 = android.app.C0002.f2
            int r7 = r7 + (-6781)
            r0 = r0 | r7
            if (r0 < 0) goto L25b
            java.lang.String r0 = "ۥۣۢ"
        L1f:
            int r0 = com.github.megatronking.stringfog.xor.C0046.m186(r0)
            r7 = r0
            goto L10
        L25:
            java.lang.String r0 = "SOTqAF/vsM588v0sYeWhy0b19g==\n"
            java.lang.String r7 = "I4GTXz6BxKc=\n"
            gn r8 = defpackage.gn.a
            boolean r0 = defpackage.z30.q(r0, r7, r8)
            if (r0 != 0) goto L1b6
            int r0 = androidx.coordinatorlayout.widget.C0021.f21
            if (r0 < 0) goto L3d
        L35:
            java.lang.String r0 = "ۣۤۡ"
            int r0 = com.google.android.material.datepicker.C0059.m239(r0)
            r7 = r0
            goto L10
        L3d:
            java.lang.String r0 = "ۨ۠ۦ"
            int r0 = com.google.android.material.datepicker.C0058.m234(r0)
            r7 = r0
            goto L10
        L45:
            int r0 = com.google.android.material.floatingactionbutton.C0060.m240()
            if (r0 < 0) goto L53
            java.lang.String r0 = "ۨۧ"
        L4d:
            int r0 = com.google.android.material.theme.C0062.m249(r0)
            r7 = r0
            goto L10
        L53:
            int r0 = android.support.v4.graphics.drawable.C0004.f4
            int r7 = androidx.versionedparcelable.C0042.f42
            r0 = r0 ^ r7
            r7 = 1748327(0x1aad67, float:2.449928E-39)
            int r0 = r0 + r7
            r7 = r0
            goto L10
        L5e:
            int r0 = androidx.appcompat.widget.C0014.f14
            int r7 = defpackage.C0072.f72
            r7 = r7 | (-3207(0xfffffffffffff379, float:NaN))
            int r0 = r0 / r7
            if (r0 > 0) goto L72
            com.google.android.material.datepicker.C0058.m232()
            java.lang.String r0 = "ۡ۠ۦ"
            int r0 = androidx.profileinstaller.C0030.m120(r0)
            r7 = r0
            goto L10
        L72:
            int r0 = androidx.versionedparcelable.C0042.f42
            int r7 = com.github.megatronking.stringfog.C0047.f47
            int r0 = r0 + r7
            r7 = 1748720(0x1aaef0, float:2.450479E-39)
            int r0 = r0 + r7
            r7 = r0
            goto L10
        L7d:
            int r0 = androidx.legacy.content.C0028.f28
            int r7 = androidx.activity.C0011.f11
            int r0 = r0 / r7
            r7 = 1753696(0x1ac260, float:2.457452E-39)
            r0 = r0 ^ r7
            r7 = r0
            goto L10
        L88:
            java.lang.String r0 = "MBVeUZswZuclCXcWwns6jQ==\n"
            java.lang.String r7 = "RHoSPuxVFKQ=\n"
            java.lang.String r0 = "toLowerCase(...)"
            defpackage.ip.n(r0, r10)
            boolean r0 = defpackage.b50.B(r4, r9, r11)
            if (r0 != 0) goto L21e
            int r0 = android.view.C0007.f7
            int r7 = defpackage.C0073.f73
            int r7 = r7 * 4671
            int r0 = r0 - r7
            if (r0 < 0) goto Laf
            r0 = 27
            com.github.megatronking.stringfog.C0048.f48 = r0
        La6:
            java.lang.String r0 = "ۥۥۢ"
            int r0 = androidx.constraintlayout.widget.C0018.m73(r0)
            r7 = r0
            goto L10
        Laf:
            int r0 = androidx.versionedparcelable.C0039.f39
            int r7 = android.app.C0002.f2
            int r0 = r0 * r7
            r7 = 443917(0x6c60d, float:6.2206E-40)
            int r0 = r0 + r7
            r7 = r0
            goto L10
        Lbb:
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r0 = r2.toLowerCase(r4)
            r5 = r4
        Lc2:
            java.lang.String r4 = "ۣۧۤ"
            int r7 = com.google.android.material.datepicker.C0059.m239(r4)
            r4 = r0
            goto L10
        Lcb:
            if (r2 != 0) goto L45
            int r0 = com.google.android.material.theme.C0062.f62
            if (r0 < 0) goto La6
            r0 = 71
            androidx.versionedparcelable.C0041.f41 = r0
            java.lang.String r0 = "ۤۨۢ"
            int r0 = androidx.profileinstaller.C0031.m127(r0)
            r7 = r0
            goto L10
        Lde:
            int r0 = defpackage.C0072.f72
            if (r0 < 0) goto Lee
            android.support.v4.graphics.drawable.C0006.m24()
            java.lang.String r0 = "ۥۥ"
            int r0 = com.google.android.material.carousel.C0053.m213(r0)
            r7 = r0
            goto L10
        Lee:
            int r0 = androidx.coordinatorlayout.widget.C0021.f21
            int r7 = androidx.recyclerview.widget.C0032.f32
            int r0 = r0 - r7
            r7 = -1746748(0xffffffffffe558c4, float:NaN)
            r0 = r0 ^ r7
            r7 = r0
            goto L10
        Lfa:
            java.lang.String r0 = "ۦۨۤ"
            r2 = r3
            goto L4d
        Lff:
            r13.setResult(r3)
            int r0 = com.github.megatronking.stringfog.C0047.f47
            if (r0 < 0) goto L10c
            r0 = 86
            androidx.constraintlayout.widget.C0019.f19 = r0
            r0 = r4
            goto Lc2
        L10c:
            r0 = r9
        L10d:
            java.lang.String r7 = "ۣۤ"
            int r7 = androidx.profileinstaller.C0031.m127(r7)
            r9 = r0
            goto L10
        L116:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L14
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            int r6 = androidx.constraintlayout.widget.C0019.f19
            if (r6 > 0) goto L130
            kotlinx.coroutines.C0069.m276()
        L124:
            java.lang.String r6 = "ۧۢۦ"
            r7 = r6
            r8 = r0
        L128:
            int r0 = com.ljx.wechatmod.ui.C0067.m271(r7)
            r6 = r8
            r7 = r0
            goto L10
        L130:
            java.lang.String r6 = "ۨۦۦ"
            int r7 = android.app.C0003.m13(r6)
            r6 = r0
            goto L10
        L139:
            java.lang.String r0 = "gQ==\n"
            java.lang.String r1 = "8Tw6gVNunZA=\n"
            java.lang.String r0 = "p"
            defpackage.ip.o(r0, r13)
            java.lang.Object[] r0 = r13.args
            r1 = r0[r11]
            goto L35
        L14a:
            boolean r0 = defpackage.b50.B(r4, r10, r11)
            if (r0 == 0) goto L19a
            java.lang.String r0 = "ۡ۠ۦ"
        L152:
            int r0 = androidx.appcompat.widget.C0016.m65(r0)
            r7 = r0
            goto L10
        L159:
            int r0 = androidx.versionedparcelable.C0040.f40
            int r7 = com.github.megatronking.stringfog.annotation.C0044.f44
            r7 = r7 | (-2611(0xfffffffffffff5cd, float:NaN))
            int r0 = r0 + r7
            if (r0 < 0) goto L16b
            java.lang.String r0 = "ۥۦ"
            int r0 = defpackage.C0072.m288(r0)
            r7 = r0
            goto L10
        L16b:
            int r0 = androidx.activity.result.C0008.f8
            int r7 = com.github.megatronking.stringfog.C0047.f47
            int r0 = r0 * r7
            r7 = 1742199(0x1a9577, float:2.441341E-39)
            r0 = r0 ^ r7
            r7 = r0
            goto L10
        L177:
            java.lang.String r0 = "lOaiCD0dEFiB+otPZFZMMg==\n"
            java.lang.String r7 = "4InuZ0p4Yhs=\n"
            java.lang.String r0 = "toLowerCase(...)"
            defpackage.ip.n(r0, r4)
            java.lang.String r0 = defpackage.pb0.C0
            java.lang.String r0 = r0.toLowerCase(r5)
            int r7 = androidx.appcompat.widget.C0013.f13
            int r8 = kotlinx.coroutines.C0069.f69
            int r8 = r8 * (-1078)
            int r7 = r7 / r8
            if (r7 != 0) goto L10d
            java.lang.String r7 = "ۨۨۦ"
            int r7 = com.google.android.material.datepicker.C0059.m239(r7)
            r9 = r0
            goto L10
        L19a:
            java.lang.String r0 = "ۣۡ۟"
        L19c:
            int r0 = androidx.lifecycle.C0029.m116(r0)
            r7 = r0
            goto L10
        L1a3:
            int r0 = defpackage.C0071.f71
            int r7 = androidx.constraintlayout.helper.widget.C0017.f17
            int r7 = r7 + (-5221)
            r0 = r0 ^ r7
            if (r0 > 0) goto L1b2
            androidx.emoji2.text.C0026.m106()
            java.lang.String r0 = "ۦۤۤ"
            goto L152
        L1b2:
            java.lang.String r0 = "ۣۤۡ"
            goto L1f
        L1b6:
            int r0 = android.view.C0007.f7
            int r7 = com.google.android.material.carousel.C0055.f55
            int r0 = r0 + r7
            r7 = 56656(0xdd50, float:7.9392E-41)
            int r0 = r0 + r7
            r7 = r0
            goto L10
        L1c2:
            java.lang.String r0 = "922nFTrfIGHicY5SY5R8Cw==\n"
            java.lang.String r7 = "gwLrek26UiI=\n"
            java.lang.String r0 = "toLowerCase(...)"
            defpackage.ip.n(r0, r9)
            java.lang.String r0 = defpackage.pb0.D0
            java.lang.String r0 = r0.toLowerCase(r5)
            int r7 = kotlinx.coroutines.C0070.f70
            if (r7 > 0) goto L1e0
            java.lang.String r7 = "ۨۨۦ"
            int r7 = androidx.activity.result.C0009.m38(r7)
            r10 = r0
            goto L10
        L1e0:
            int r7 = androidx.startup.C0037.f37
            int r8 = com.ljx.wechatmod.ui.C0067.f67
            int r7 = r7 - r8
            r8 = 1751248(0x1ab8d0, float:2.454021E-39)
            int r7 = r7 + r8
            r10 = r0
            goto L10
        L1ec:
            java.lang.String r0 = defpackage.pb0.t1
            boolean r0 = defpackage.b50.B(r4, r0, r11)
            if (r0 != 0) goto L24f
            java.lang.String r0 = "p/dwFnV4U9Cx/XE=\n"
            java.lang.String r7 = "w5IccwEdc7Y=\n"
            java.lang.String r0 = "delete from"
            boolean r0 = defpackage.b50.N(r4, r0, r11)
            if (r0 == 0) goto L19a
            java.lang.String r0 = "ۣۤۧ"
            r7 = r0
            r8 = r6
            goto L128
        L208:
            java.lang.String r0 = "ۥۥ"
            int r0 = com.google.android.material.theme.C0064.m258(r0)
            r7 = r0
            goto L10
        L211:
            int r0 = androidx.core.widget.C0025.f25
            int r2 = com.google.android.material.datepicker.C0059.f59
            int r0 = r0 - r2
            r2 = -1747069(0xffffffffffe55783, float:NaN)
            r0 = r0 ^ r2
            r2 = r6
            r7 = r0
            goto L10
        L21e:
            int r0 = com.google.android.material.appbar.C0049.f49
            int r7 = androidx.constraintlayout.helper.widget.C0017.f17
            int r7 = r7 * 7101
            r0 = r0 ^ r7
            if (r0 > 0) goto L22b
            java.lang.String r0 = "ۣ۟ۧ"
            goto L19c
        L22b:
            int r0 = androidx.core.content.C0023.f23
            int r7 = androidx.versionedparcelable.C0040.f40
            int r0 = r0 % r7
            r7 = 1748540(0x1aae3c, float:2.450226E-39)
            int r0 = r0 + r7
            r7 = r0
            goto L10
        L237:
            int r0 = com.google.android.material.theme.C0062.f62
            int r7 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r7 = r7 % 1912
            int r0 = r0 + r7
            if (r0 < 0) goto L24c
            androidx.activity.result.C0008.m33()
            java.lang.String r0 = "ۣۤۧ"
            int r0 = com.ljx.wechatmod.hook.C0066.m264(r0)
            r7 = r0
            goto L10
        L24c:
            r0 = r6
            goto L124
        L24f:
            int r0 = androidx.coordinatorlayout.widget.C0021.f21
            int r7 = defpackage.C0073.f73
            int r0 = r0 % r7
            r7 = 1749676(0x1ab2ac, float:2.451818E-39)
            int r0 = r0 + r7
            r7 = r0
            goto L10
        L25b:
            int r0 = kotlinx.coroutines.C0070.f70
            int r7 = com.ljx.wechatmod.auth.C0065.f65
            r0 = r0 ^ r7
            r7 = -1753928(0xffffffffffe53cb8, float:NaN)
            r0 = r0 ^ r7
            r7 = r0
            goto L10
        L267:
            return
    }

    private final void g(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
            r7 = this;
            r1 = 0
            java.lang.String r0 = "/g==\n"
            java.lang.String r2 = "jqKdm6v/Knk=\n"
            java.lang.String r0 = "p"
            defpackage.ip.o(r0, r8)
            java.lang.Object[] r4 = r8.args     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = "WknuFA==\n"
            java.lang.String r2 = "OzuJZ09lZZk=\n"
            java.lang.String r0 = "args"     // Catch: java.lang.Throwable -> Ld3
            defpackage.ip.n(r0, r4)     // Catch: java.lang.Throwable -> Ld3
            int r5 = r4.length     // Catch: java.lang.Throwable -> Ld3
            r0 = 0
        L1b:
            r2 = 1616(0x650, float:2.264E-42)
        L1d:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L23;
                case 49: goto L26;
                case 204: goto L2b;
                case 239: goto L71;
                default: goto L22;
            }     // Catch: java.lang.Throwable -> Ld3
        L22:
            goto L1d
        L23:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L1d
        L26:
            if (r0 >= r5) goto L23
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L1d
        L2b:
            r2 = r4[r0]     // Catch: java.lang.Throwable -> Ld3
            boolean r6 = r2 instanceof android.hardware.Sensor     // Catch: java.lang.Throwable -> Ld3
            r3 = 1740(0x6cc, float:2.438E-42)
        L31:
            r3 = r3 ^ 1757(0x6dd, float:2.462E-42)
            switch(r3) {
                case 17: goto L37;
                case 54: goto L3c;
                case 471: goto L5d;
                case 500: goto L3f;
                default: goto L36;
            }     // Catch: java.lang.Throwable -> Ld3
        L36:
            goto L31
        L37:
            if (r6 == 0) goto L3c
            r3 = 1833(0x729, float:2.569E-42)
            goto L31
        L3c:
            r3 = 1802(0x70a, float:2.525E-42)
            goto L31
        L3f:
            r0 = 1864(0x748, float:2.612E-42)
        L41:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L47;
                case 47483: goto L4b;
                default: goto L46;
            }     // Catch: java.lang.Throwable -> Ld3
        L46:
            goto L41
        L47:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L41
        L4b:
            r0 = r2
        L4c:
            boolean r3 = r0 instanceof android.hardware.Sensor     // Catch: java.lang.Throwable -> Ld3
            r2 = 48891(0xbefb, float:6.8511E-41)
        L51:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 22: goto L59;
                case 53: goto Leb;
                case 503: goto L73;
                case 32495: goto L79;
                default: goto L58;
            }     // Catch: java.lang.Throwable -> Ld3
        L58:
            goto L51
        L59:
            r2 = 48953(0xbf39, float:6.8598E-41)
            goto L51
        L5d:
            int r2 = com.github.megatronking.stringfog.C0047.f47     // Catch: java.lang.Throwable -> Ld3
            r2 = r2 ^ (-9)
            int r0 = r0 + r2
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L65:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L1b;
                case 239: goto L6d;
                default: goto L6c;
            }     // Catch: java.lang.Throwable -> Ld3
        L6c:
            goto L65
        L6d:
            r2 = 48798(0xbe9e, float:6.838E-41)
            goto L65
        L71:
            r0 = r1
            goto L4c
        L73:
            if (r3 == 0) goto L59
            r2 = 49635(0xc1e3, float:6.9553E-41)
            goto L51
        L79:
            android.hardware.Sensor r0 = (android.hardware.Sensor) r0     // Catch: java.lang.Throwable -> Ld3
        L7b:
            r1 = 49666(0xc202, float:6.9597E-41)
        L7e:
            r2 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L86;
                case 50: goto L8c;
                case 76: goto L90;
                case 83: goto Lb9;
                default: goto L85;
            }     // Catch: java.lang.Throwable -> Ld3
        L85:
            goto L7e
        L86:
            if (r0 != 0) goto L8c
            r1 = 49759(0xc25f, float:6.9727E-41)
            goto L7e
        L8c:
            r1 = 49728(0xc240, float:6.9684E-41)
            goto L7e
        L90:
            int r1 = androidx.constraintlayout.widget.C0019.m77()     // Catch: java.lang.Throwable -> Ld3
            r0 = 49790(0xc27e, float:6.977E-41)
        L97:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto L9f;
                case 51: goto Lb8;
                case 84: goto La9;
                case 241: goto La3;
                default: goto L9e;
            }     // Catch: java.lang.Throwable -> Ld3
        L9e:
            goto L97
        L9f:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L97
        La3:
            if (r1 > 0) goto L9f
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L97
        La9:
            java.lang.String r0 = "3ToAjG"
            java.lang.String r0 = androidx.viewpager2.adapter.C0043.m175(r0)     // Catch: java.lang.Throwable -> Ld3
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> Ld3
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Throwable -> Ld3
            r2.println(r0)     // Catch: java.lang.Throwable -> Ld3
        Lb8:
            return
        Lb9:
            java.lang.String r1 = "Aq6M1IWIRQ==\n"
            java.lang.String r2 = "b+btuuHkICk=\n"
            java.lang.String r1 = "mHandle"     // Catch: java.lang.Throwable -> Ld3
            int r1 = de.robv.android.xposed.XposedHelpers.getIntField(r0, r1)     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r2 = defpackage.q50.b     // Catch: java.lang.Throwable -> Ld3
            monitor-enter(r2)     // Catch: java.lang.Throwable -> Ld3
            android.util.SparseIntArray r3 = defpackage.q50.a     // Catch: java.lang.Throwable -> Le8
            int r0 = r0.getType()     // Catch: java.lang.Throwable -> Le8
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> Le8
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld3
            goto Lb8
        Ld3:
            r0 = move-exception
            java.lang.String r0 = "Nwje\n"
            java.lang.String r1 = "Q2m5jaPP2Zc=\n"
            java.lang.String r2 = "UMBNMOV5Mwts0mEX5XoIC3HrWyM=\n"
            java.lang.String r3 = "A7k+RIAUe2Q=\n"
            java.lang.String r2 = "SystemHook_SensorReg"
            java.lang.String r3 = "Fg==\n"
            java.lang.String r4 = "c8HJlSTQVfc=\n"
            defpackage.z30.o(r0, r1, r2, r3, r4)
            goto Lb8
        Le8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld3
            throw r0     // Catch: java.lang.Throwable -> Ld3
        Leb:
            r0 = r1
            goto L7b
    }

    private final void h(de.robv.android.xposed.XC_MethodHook.MethodHookParam r11) {
            r10 = this;
            r2 = 0
            r4 = 0
            java.lang.String r0 = "fw==\n"
            java.lang.String r1 = "D0+Qj8V7Io0=\n"
            java.lang.String r0 = "p"
            defpackage.ip.o(r0, r11)
            java.lang.Object[] r0 = r11.args
            r0 = r0[r4]
            java.lang.String r1 = "hWw410LTGdSFdiCbANVY2YpqIJsW31jUhHd51RfcFJqfYCTeQtsXzodwOpUr3gw=\n"
            java.lang.String r3 = "6xlUu2KweLo=\n"
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            defpackage.ip.m(r1, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r3 = r0.intValue()
            java.lang.Object[] r0 = r11.args
            r1 = 1
            r0 = r0[r1]
            boolean r5 = r0 instanceof float[]
            r1 = 1616(0x650, float:2.264E-42)
        L2b:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L31;
                case 49: goto L34;
                case 204: goto L39;
                case 239: goto L55;
                default: goto L30;
            }
        L30:
            goto L2b
        L31:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L2b
        L34:
            if (r5 == 0) goto L31
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L2b
        L39:
            float[] r0 = (float[]) r0
            r1 = 1740(0x6cc, float:2.438E-42)
        L3d:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L43;
                case 54: goto L46;
                default: goto L42;
            }
        L42:
            goto L3d
        L43:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L3d
        L46:
            r1 = r0
        L47:
            r0 = 1864(0x748, float:2.612E-42)
        L49:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L4f;
                case 47384: goto L6b;
                case 47417: goto L5b;
                case 47483: goto L57;
                default: goto L4e;
            }
        L4e:
            goto L49
        L4f:
            if (r1 != 0) goto L57
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L49
        L55:
            r1 = r2
            goto L47
        L57:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L49
        L5b:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L5e:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L66;
                case 239: goto L67;
                default: goto L65;
            }
        L65:
            goto L5e
        L66:
            return
        L67:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L5e
        L6b:
            int r5 = r1.length
            r0 = 48891(0xbefb, float:6.8511E-41)
        L6f:
            r6 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r6
            switch(r0) {
                case 22: goto L77;
                case 53: goto L90;
                case 503: goto L7b;
                case 32495: goto L81;
                default: goto L76;
            }
        L76:
            goto L6f
        L77:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L6f
        L7b:
            if (r5 != 0) goto L77
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L6f
        L81:
            r0 = 49666(0xc202, float:6.9597E-41)
        L84:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L8c;
                case 50: goto L66;
                default: goto L8b;
            }
        L8b:
            goto L84
        L8c:
            r0 = 49697(0xc221, float:6.964E-41)
            goto L84
        L90:
            java.lang.Object r5 = defpackage.q50.b
            monitor-enter(r5)
            android.util.SparseIntArray r0 = defpackage.q50.a     // Catch: java.lang.Throwable -> L1c7
            int r6 = com.github.megatronking.stringfog.xor.C0045.f45     // Catch: java.lang.Throwable -> L1c7
            r6 = r6 ^ 295(0x127, float:4.13E-43)
            int r3 = r0.get(r3, r6)     // Catch: java.lang.Throwable -> L1c7
            monitor-exit(r5)
            r0 = 49790(0xc27e, float:6.977E-41)
        La1:
            r5 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 18: goto La9;
                case 51: goto L66;
                case 84: goto Lb5;
                case 241: goto Lad;
                default: goto La8;
            }
        La8:
            goto La1
        La9:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto La1
        Lad:
            r0 = 19
            if (r3 != r0) goto La9
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto La1
        Lb5:
            gn r3 = defpackage.gn.a
            java.lang.String r0 = "VcapnaeqZ71hzr+m\n"
            java.lang.String r5 = "PqPQwtTeAs0=\n"
            boolean r5 = defpackage.z30.q(r0, r5, r3)
            r0 = 49914(0xc2fa, float:6.9944E-41)
        Lc2:
            r6 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r6
            switch(r0) {
                case 497: goto Lca;
                case 1711: goto Ld0;
                case 1736: goto L66;
                case 1769: goto Ld4;
                default: goto Lc9;
            }
        Lc9:
            goto Lc2
        Lca:
            if (r5 == 0) goto Ld0
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto Lc2
        Ld0:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto Lc2
        Ld4:
            r5 = r1[r4]
            r0 = 50689(0xc601, float:7.103E-41)
        Ld9:
            r6 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r6
            switch(r0) {
                case 19: goto Le1;
                case 45: goto L66;
                case 50: goto Lea;
                case 76: goto Lee;
                default: goto Le0;
            }
        Le0:
            goto Ld9
        Le1:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lea
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto Ld9
        Lea:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto Ld9
        Lee:
            java.lang.String r0 = "fVnocyz319ZJUeRAK+rCyn9Z4w==\n"
            java.lang.String r5 = "FjyRLF+DsqY=\n"
            java.lang.String r6 = "key_step_multiplier"
            java.lang.String r0 = "CW0=\n"
            java.lang.String r5 = "OF2hDzC9/Os=\n"
            java.lang.String r0 = "10"
            java.lang.String r5 = "3f5Z\n"
            java.lang.String r7 = "tpsgeLwwj7M=\n"
            java.lang.String r8 = "lNdk\n"
            java.lang.String r9 = "8LICxVL6724=\n"
            java.lang.String r5 = defpackage.z30.k(r5, r7, r6, r8, r9)
            defpackage.ip.o(r5, r0)
            r3.getClass()     // Catch: java.lang.Throwable -> L14b
            java.lang.String r0 = defpackage.gn.d(r6, r0)     // Catch: java.lang.Throwable -> L14b
            r3 = 50813(0xc67d, float:7.1204E-41)
        L117:
            r5 = 50830(0xc68e, float:7.1228E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 18: goto L11f;
                case 243: goto L147;
                default: goto L11e;
            }
        L11e:
            goto L117
        L11f:
            r3 = r0
        L120:
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r3)
            i00 r0 = defpackage.x10.a     // Catch: java.lang.NumberFormatException -> L1dd
            r0.getClass()     // Catch: java.lang.NumberFormatException -> L1dd
            java.lang.Object r0 = r0.b     // Catch: java.lang.NumberFormatException -> L1dd
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0     // Catch: java.lang.NumberFormatException -> L1dd
            java.util.regex.Matcher r0 = r0.matcher(r3)     // Catch: java.lang.NumberFormatException -> L1dd
            boolean r5 = r0.matches()     // Catch: java.lang.NumberFormatException -> L1dd
            r0 = 51836(0xca7c, float:7.2638E-41)
        L139:
            r6 = 51853(0xca8d, float:7.2662E-41)
            r0 = r0 ^ r6
            switch(r0) {
                case 241: goto L141;
                case 1963: goto L189;
                case 1992: goto L195;
                case 2025: goto L18d;
                default: goto L140;
            }
        L140:
            goto L139
        L141:
            if (r5 == 0) goto L189
            r0 = 52580(0xcd64, float:7.368E-41)
            goto L139
        L147:
            r3 = 50844(0xc69c, float:7.1248E-41)
            goto L117
        L14b:
            r3 = move-exception
            gn r7 = defpackage.gn.a     // Catch: java.lang.Throwable -> L1ca
            java.lang.Integer r5 = defpackage.b50.R(r0)     // Catch: java.lang.Throwable -> L1ca
            r3 = 51588(0xc984, float:7.229E-41)
        L155:
            r8 = 51605(0xc995, float:7.2314E-41)
            r3 = r3 ^ r8
            switch(r3) {
                case 17: goto L15d;
                case 54: goto L163;
                case 87: goto L187;
                case 116: goto L167;
                default: goto L15c;
            }     // Catch: java.lang.Throwable -> L1ca
        L15c:
            goto L155
        L15d:
            if (r5 == 0) goto L163
            r3 = 51681(0xc9e1, float:7.242E-41)
            goto L155
        L163:
            r3 = 51650(0xc9c2, float:7.2377E-41)
            goto L155
        L167:
            int r3 = r5.intValue()     // Catch: java.lang.Throwable -> L1ca
            r5 = 51712(0xca00, float:7.2464E-41)
        L16e:
            r8 = 51729(0xca11, float:7.2488E-41)
            r5 = r5 ^ r8
            switch(r5) {
                case 14: goto L176;
                case 15: goto L175;
                case 16: goto L175;
                case 17: goto L183;
                default: goto L175;
            }     // Catch: java.lang.Throwable -> L1ca
        L175:
            goto L16e
        L176:
            r7.getClass()     // Catch: java.lang.Throwable -> L1ca
            int r3 = defpackage.gn.b(r6, r3)     // Catch: java.lang.Throwable -> L1ca
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L1ca
            r3 = r0
            goto L120
        L183:
            r5 = 51743(0xca1f, float:7.2507E-41)
            goto L16e
        L187:
            r3 = r4
            goto L176
        L189:
            r0 = 52549(0xcd45, float:7.3637E-41)
            goto L139
        L18d:
            float r0 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L1dd
            java.lang.Float r2 = java.lang.Float.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L1dd
        L195:
            r0 = 52611(0xcd83, float:7.3724E-41)
        L198:
            r3 = 52628(0xcd94, float:7.3748E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 23: goto L1a0;
                case 54: goto L1a6;
                case 85: goto L1c4;
                case 116: goto L1aa;
                default: goto L19f;
            }
        L19f:
            goto L198
        L1a0:
            if (r2 == 0) goto L1a6
            r0 = 52704(0xcde0, float:7.3854E-41)
            goto L198
        L1a6:
            r0 = 52673(0xcdc1, float:7.381E-41)
            goto L198
        L1aa:
            float r0 = r2.floatValue()
            r2 = 52735(0xcdff, float:7.3897E-41)
        L1b1:
            r3 = 52752(0xce10, float:7.3921E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L1b9;
                case 1007: goto L1c0;
                default: goto L1b8;
            }
        L1b8:
            goto L1b1
        L1b9:
            r2 = r1[r4]
            float r0 = r0 * r2
            r1[r4] = r0
            goto L66
        L1c0:
            r2 = 52766(0xce1e, float:7.3941E-41)
            goto L1b1
        L1c4:
            r0 = 1092616192(0x41200000, float:10.0)
            goto L1b9
        L1c7:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L1ca:
            r3 = move-exception
            r3 = 53510(0xd106, float:7.4983E-41)
        L1ce:
            r5 = 53527(0xd117, float:7.5007E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 17: goto L1d6;
                case 50: goto L1da;
                default: goto L1d5;
            }
        L1d5:
            goto L1ce
        L1d6:
            r3 = 53541(0xd125, float:7.5027E-41)
            goto L1ce
        L1da:
            r3 = r0
            goto L120
        L1dd:
            r0 = move-exception
            r0 = 53634(0xd182, float:7.5157E-41)
        L1e1:
            r3 = 53651(0xd193, float:7.5181E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 17: goto L1e9;
                case 50: goto L195;
                default: goto L1e8;
            }
        L1e8:
            goto L1e1
        L1e9:
            r0 = 53665(0xd1a1, float:7.52E-41)
            goto L1e1
    }

    public static final java.lang.Boolean i(android.widget.ImageView r6, float r7, int r8, int r9) {
            r4 = 0
            r5 = 0
            java.lang.String r0 = "ۣۣۧ"
            int r2 = com.google.android.material.theme.C0063.m254(r0)
            r1 = r4
            r0 = r4
        La:
            switch(r2) {
                case 56288: goto Le;
                case 56474: goto L98;
                case 1746818: goto L2c;
                case 1747717: goto L45;
                case 1747775: goto Ld4;
                case 1748677: goto L158;
                case 1749574: goto L60;
                case 1749601: goto L125;
                case 1750721: goto L149;
                case 1750783: goto L13;
                case 1751617: goto L122;
                case 1751622: goto L154;
                case 1752462: goto L10b;
                case 1752737: goto L84;
                case 1754500: goto Lf7;
                case 1755343: goto L144;
                case 1755527: goto Ld9;
                case 1755620: goto Lb8;
                default: goto Ld;
            }
        Ld:
            goto La
        Le:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L12:
            return r0
        L13:
            if (r8 <= 0) goto L158
            int r2 = kotlinx.coroutines.C0069.f69
            int r3 = androidx.appcompat.widget.C0016.f16
            int r3 = r3 % (-8894)
            r2 = r2 | r3
            if (r2 < 0) goto L25
            java.lang.String r2 = "ۨۨۤ"
            int r2 = com.google.android.material.behavior.C0050.m203(r2)
            goto La
        L25:
            java.lang.String r2 = "ۨۥۤ"
        L27:
            int r2 = com.google.android.material.datepicker.C0059.m239(r2)
            goto La
        L2c:
            int r0 = com.github.megatronking.stringfog.xor.C0045.f45
            if (r0 < 0) goto L3a
            java.lang.String r0 = "ۥۨۤ"
            r2 = r0
            r3 = r4
        L34:
            int r2 = com.google.android.material.theme.C0064.m258(r2)
            r0 = r3
            goto La
        L3a:
            int r0 = androidx.versionedparcelable.C0042.f42
            int r2 = defpackage.C0071.f71
            int r0 = r0 - r2
            r2 = 56690(0xdd72, float:7.944E-41)
            int r2 = r2 + r0
            r0 = r4
            goto La
        L45:
            int r0 = android.support.v4.graphics.drawable.C0005.m20()
            if (r0 < 0) goto L56
            androidx.startup.C0037.m150()
            r0 = r1
        L4f:
            java.lang.String r2 = "ۣ۠ۢ"
            int r2 = androidx.legacy.content.C0028.m114(r2)
            goto La
        L56:
            java.lang.String r0 = "۟۟"
            r2 = r0
            r3 = r1
        L5a:
            int r2 = io.fastkv.C0068.m272(r2)
            r0 = r3
            goto La
        L60:
            float r2 = (float) r8
            android.content.res.Resources r3 = r6.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r5 = r2 / r3
            int r2 = androidx.coordinatorlayout.widget.C0021.f21
            int r3 = androidx.constraintlayout.widget.C0019.f19
            int r3 = r3 * (-9695)
            int r2 = r2 + r3
            if (r2 < 0) goto L80
            com.google.android.material.carousel.C0052.m210()
            java.lang.String r2 = "۟۟"
            int r2 = androidx.constraintlayout.widget.C0019.m79(r2)
            goto La
        L80:
            java.lang.String r2 = "ۢ۠۟"
            r3 = r0
            goto L34
        L84:
            r2 = 1118437376(0x42aa0000, float:85.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 > 0) goto Lf7
            int r2 = androidx.appcompat.app.C0012.f12
            if (r2 > 0) goto L4f
            java.lang.String r2 = "ۣ۟ۦ"
            r3 = r1
        L91:
            int r2 = androidx.versionedparcelable.C0038.m153(r2)
            r1 = r3
            goto La
        L98:
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 > 0) goto Lf7
            int r2 = android.app.C0002.f2
            int r3 = androidx.versionedparcelable.C0042.f42
            r3 = r3 | 8449(0x2101, float:1.184E-41)
            int r2 = r2 + r3
            if (r2 > 0) goto Lad
            java.lang.String r2 = "ۣۥۣ"
            int r2 = androidx.recyclerview.widget.C0033.m132(r2)
            goto La
        Lad:
            int r2 = androidx.versionedparcelable.C0040.f40
            int r3 = androidx.constraintlayout.widget.C0019.f19
            int r2 = r2 + r3
            r3 = 1754742(0x1ac676, float:2.458917E-39)
            int r2 = r2 + r3
            goto La
        Lb8:
            int r2 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r3 = com.github.megatronking.stringfog.xor.C0046.f46
            int r3 = r3 + (-8057)
            int r2 = r2 * r3
            if (r2 < 0) goto Lc9
            java.lang.String r2 = "ۡۡۨ"
            int r2 = com.github.megatronking.stringfog.xor.C0046.m186(r2)
            goto La
        Lc9:
            int r2 = androidx.appcompat.widget.C0013.f13
            int r3 = androidx.appcompat.widget.C0013.f13
            int r2 = r2 % r3
            r3 = 1750783(0x1ab6ff, float:2.45337E-39)
            int r2 = r2 + r3
            goto La
        Ld4:
            r3 = 1
            java.lang.String r1 = "۠ۡۦ"
            r2 = r1
            goto L91
        Ld9:
            if (r9 <= 0) goto L158
            int r2 = android.app.C0002.f2
            if (r2 > 0) goto Lec
            com.google.android.material.carousel.C0052.m210()
            java.lang.String r2 = "ۢ۠۟"
            r3 = r0
        Le5:
            int r2 = com.google.android.material.datepicker.C0059.m239(r2)
            r0 = r3
            goto La
        Lec:
            int r2 = android.view.C0007.f7
            int r3 = com.google.android.material.theme.C0062.f62
            int r2 = r2 % r3
            r3 = 1751980(0x1abbac, float:2.455047E-39)
            int r2 = r2 + r3
            goto La
        Lf7:
            int r2 = androidx.savedstate.C0035.f35
            if (r2 > 0) goto L100
            java.lang.String r2 = "ۡۧ۠"
            r3 = r0
            goto L5a
        L100:
            int r2 = androidx.savedstate.C0035.f35
            int r3 = androidx.appcompat.widget.C0014.f14
            r2 = r2 | r3
            r3 = -56167(0xffffffffffff2499, float:NaN)
            r2 = r2 ^ r3
            goto La
        L10b:
            int r2 = r8 + 21
            int r2 = r2 - r9
            int r2 = r2 + (-21)
            int r2 = java.lang.Math.abs(r2)
            r3 = 5
            if (r2 > r3) goto L149
            int r2 = androidx.savedstate.C0034.f34
            int r3 = androidx.core.widget.C0025.f25
            int r2 = r2 / r3
            r3 = 1749573(0x1ab245, float:2.451674E-39)
            int r2 = r2 + r3
            goto La
        L122:
            r0 = 0
            goto L12
        L125:
            int r2 = androidx.core.widget.C0025.f25
            int r3 = kotlinx.coroutines.C0070.f70
            int r3 = r3 + 241
            int r2 = r2 % r3
            if (r2 < 0) goto L139
            androidx.coordinatorlayout.widget.C0022.m88()
            java.lang.String r2 = "ۣۣۧ"
            int r2 = com.github.megatronking.stringfog.xor.C0046.m186(r2)
            goto La
        L139:
            int r2 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r3 = androidx.savedstate.C0035.f35
            r2 = r2 ^ r3
            r3 = 1746024(0x1aa468, float:2.446701E-39)
            int r2 = r2 + r3
            goto La
        L144:
            java.lang.String r0 = "ۥۨۤ"
            r2 = r0
            r3 = r4
            goto Le5
        L149:
            int r2 = androidx.emoji2.text.C0026.f26
            int r3 = androidx.appcompat.widget.C0014.f14
            r2 = r2 ^ r3
            r3 = 1752027(0x1abbdb, float:2.455113E-39)
            int r2 = r2 + r3
            goto La
        L154:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L12
        L158:
            int r2 = androidx.fragment.app.C0027.f27
            int r3 = androidx.versionedparcelable.C0039.f39
            r3 = r3 ^ (-9205(0xffffffffffffdc0b, float:NaN))
            int r2 = r2 / r3
            if (r2 == 0) goto L169
            r2 = 34
            androidx.appcompat.widget.C0015.f15 = r2
            java.lang.String r2 = "ۡۡۤ"
            goto L27
        L169:
            int r2 = androidx.appcompat.widget.C0016.f16
            int r3 = androidx.activity.C0010.f10
            int r2 = r2 % r3
            r3 = 1751128(0x1ab858, float:2.453853E-39)
            int r2 = r2 + r3
            goto La
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r15) {
            r14 = this;
            int r0 = r14.a
            java.lang.String r1 = ""
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r2 = 0
            r11 = 0
            switch(r0) {
                case 0: goto Laa8;
                case 1: goto L11;
                case 2: goto L11;
                case 3: goto La2e;
                case 4: goto L11;
                case 5: goto L11;
                case 6: goto L11;
                case 7: goto L9d3;
                case 8: goto L978;
                case 9: goto L828;
                case 10: goto L7eb;
                case 11: goto L11;
                case 12: goto L11;
                case 13: goto L11;
                case 14: goto L11;
                case 15: goto L11;
                case 16: goto L11;
                case 17: goto L11;
                case 18: goto L768;
                case 19: goto L6cd;
                case 20: goto L64a;
                case 21: goto L11;
                case 22: goto L601;
                case 23: goto L3e3;
                case 24: goto L12e;
                case 25: goto Lc9;
                case 26: goto La0;
                case 27: goto L11;
                case 28: goto L11;
                case 29: goto L2a;
                default: goto L11;
            }
        L11:
            super.afterHookedMethod(r15)
            int r0 = kotlinx.coroutines.C0069.m276()
            if (r0 < 0) goto L29
            java.lang.String r0 = "MQS7t8qPzae3DSKa"
            java.lang.String r0 = com.google.android.material.chip.C0056.m225(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L29:
            return
        L2a:
            java.lang.String r0 = "4A==\n"
            java.lang.String r1 = "kBP3rSCIrog=\n"
            java.lang.String r0 = "p"
            defpackage.ip.o(r0, r15)
            java.lang.Object[] r0 = r15.args
            r1 = 0
            r0 = r0[r1]
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L9b
            java.lang.String r0 = (java.lang.String) r0
            r1 = r0
        L41:
            if (r1 == 0) goto L29
            java.lang.Object r0 = r15.getResult()
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto Lb02
            java.lang.Integer r0 = (java.lang.Integer) r0
        L4d:
            if (r0 == 0) goto L9e
            int r0 = r0.intValue()
        L53:
            java.lang.String r2 = "bBSMUYxLIY9mA5FRhk0+kXM=\n"
            java.lang.String r3 = "B3H1DuokU/g=\n"
            gn r4 = defpackage.gn.a
            boolean r2 = defpackage.z30.q(r2, r3, r4)
            if (r2 == 0) goto L29
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r3 = "ZXDxig==\n"
            java.lang.String r4 = "Nz++3h7jdSs=\n"
            java.lang.String r3 = "ROOT"
            defpackage.ip.n(r3, r2)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "MPiGs6H4y+wl5K/0+LOXhg==\n"
            java.lang.String r3 = "RJfK3Nadua8=\n"
            java.lang.String r2 = "toLowerCase(...)"
            defpackage.ip.n(r2, r1)
            java.lang.String r2 = "8PKKss0=\n"
            java.lang.String r3 = "nJvn27nTYEE=\n"
            java.lang.String r2 = "limit"
            r3 = 0
            boolean r1 = defpackage.b50.B(r1, r2, r3)
            if (r1 == 0) goto L29
            r1 = 1
            if (r0 == r1) goto L91
            r1 = 9
            if (r0 != r1) goto L29
        L91:
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15.setResult(r0)
            goto L29
        L9b:
            r0 = 0
            r1 = r0
            goto L41
        L9e:
            r0 = 0
            goto L53
        La0:
            java.lang.String r0 = "XQ==\n"
            java.lang.String r1 = "Lf0swNVWQvM=\n"
            java.lang.String r0 = "p"
            defpackage.ip.o(r0, r15)
            java.lang.String r0 = "HrUVvU38vGIqvAOBQee2Zhs=\n"
            java.lang.String r1 = "ddBs4iCT3wk=\n"
            gn r2 = defpackage.gn.a
            boolean r0 = defpackage.z30.q(r0, r1, r2)
            if (r0 == 0) goto L29
            android.telephony.gsm.GsmCellLocation r0 = new android.telephony.gsm.GsmCellLocation     // Catch: java.lang.Throwable -> Lc6
            r0.<init>()     // Catch: java.lang.Throwable -> Lc6
            r1 = 0
            r2 = 0
            r0.setLacAndCid(r1, r2)     // Catch: java.lang.Throwable -> Lc6
            r15.setResult(r0)     // Catch: java.lang.Throwable -> Lc6
            goto L29
        Lc6:
            r0 = move-exception
            goto L29
        Lc9:
            java.lang.String r0 = "xA==\n"
            java.lang.String r1 = "tA7hOm14yFg=\n"
            java.lang.String r0 = "p"
            defpackage.ip.o(r0, r15)
            java.lang.String r0 = "fr7Yil+eThBKt862U4VEFHs=\n"
            java.lang.String r1 = "Fduh1TLxLXs=\n"
            gn r2 = defpackage.gn.a
            boolean r0 = defpackage.z30.q(r0, r1, r2)
            if (r0 == 0) goto L29
            java.lang.Object r0 = r15.getResult()
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto Laff
            java.util.List r0 = (java.util.List) r0
        Lea:
            if (r0 == 0) goto L29
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "aGg1sxL+qR4pMn7vWg==\n"
            java.lang.String r2 = "ARxQwXOKxmw=\n"
            java.lang.String r1 = "iterator(...)"
            defpackage.ip.n(r1, r0)
        Lfb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            if (r1 == 0) goto Lfb
            java.lang.String r2 = "4dNDtjQ=\n"
            java.lang.String r3 = "o4AQ/3Ci3O4=\n"
            java.lang.String r2 = "BSSID"     // Catch: java.lang.Throwable -> L12c
            java.lang.String r3 = "SKLfurKLt5pCoNWwsoG9mkg=\n"
            java.lang.String r4 = "eJDlioKxh6o=\n"
            java.lang.String r3 = "02:00:00:00:00:00"     // Catch: java.lang.Throwable -> L12c
            de.robv.android.xposed.XposedHelpers.setObjectField(r1, r2, r3)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r2 = "QhVX80w=\n"
            java.lang.String r3 = "LnAhliBiTNY=\n"
            java.lang.String r2 = "level"     // Catch: java.lang.Throwable -> L12c
            r3 = -99
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L12c
            de.robv.android.xposed.XposedHelpers.setObjectField(r1, r2, r3)     // Catch: java.lang.Throwable -> L12c
            goto Lfb
        L12c:
            r1 = move-exception
            goto Lfb
        L12e:
            java.lang.String r0 = "HQ==\n"
            java.lang.String r2 = "bc5E2gsKx4o=\n"
            java.lang.String r0 = "p"
            defpackage.ip.o(r0, r15)
            java.lang.String r0 = "kcb4+qYv0FqO/PTM\n"
            java.lang.String r2 = "+qOBpcVHtTs=\n"
            gn r3 = defpackage.gn.a
            boolean r0 = defpackage.z30.q(r0, r2, r3)
            if (r0 == 0) goto L29
            java.lang.String r0 = "WupDVqFSS1NF0Fdmpl8=\n"
            java.lang.String r2 = "MY86CcI6LjI=\n"
            java.lang.String r0 = "key_cheat_mode"
            r2 = 0
            int r4 = defpackage.gt.j(r0, r2)
            java.lang.String r0 = "uqEOdOo7fDKOqxk=\n"
            java.lang.String r2 = "0cR3K45SH1c=\n"
            java.lang.String r0 = "key_dice_on"
            boolean r0 = defpackage.gt.i(r0)
            java.lang.String r2 = "p5hRFSiqSVKjkw==\n"
            java.lang.String r3 = "zP0oSlraOg0=\n"
            java.lang.String r2 = "key_rps_on"
            boolean r2 = defpackage.gt.i(r2)
            if (r4 != 0) goto L178
            if (r0 != 0) goto L178
            if (r2 != 0) goto L178
            java.lang.Integer r0 = defpackage.q50.d
            if (r0 != 0) goto L178
            java.lang.Integer r0 = defpackage.q50.e
            if (r0 == 0) goto L29
        L178:
            java.lang.String r1 = defpackage.gn.e     // Catch: java.lang.Throwable -> Lacb
        L17a:
            java.lang.String r0 = "9nxbw7XTo+M=\n"
            java.lang.String r2 = "tRQ6t8G6zYQ=\n"
            java.lang.String r0 = "Chatting"
            r2 = 0
            boolean r0 = defpackage.b50.B(r1, r0, r2)
            if (r0 != 0) goto L1a7
            java.lang.String r0 = "E8PYKQ==\n"
            java.lang.String r2 = "VKK1TLT87Lw=\n"
            java.lang.String r0 = "Game"
            r2 = 0
            boolean r0 = defpackage.b50.B(r1, r0, r2)
            if (r0 != 0) goto L1a7
            java.lang.String r0 = "t/kCK3zv/aM=\n"
            java.lang.String r2 = "1olySQ6Ok8c=\n"
            java.lang.String r0 = "appbrand"
            r2 = 1
            boolean r0 = defpackage.b50.B(r1, r0, r2)
            if (r0 == 0) goto L29
        L1a7:
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = defpackage.q50.c
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1be
            android.util.SparseIntArray r0 = defpackage.q50.a
            r0 = 500(0x1f4, float:7.0E-43)
            long r0 = (long) r0
            r2 = 0
            long r2 = r2 - r6
            long r0 = r0 - r2
            defpackage.q50.c = r0
            goto L29
        L1be:
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r5 = r0.getStackTrace()
            int r0 = r5.length
            r1 = 15
            int r8 = java.lang.Math.min(r0, r1)
            r2 = 0
            r3 = 0
            r0 = r3
            r1 = r3
        L1d2:
            if (r2 >= r8) goto L2e7
            r3 = r5[r2]
            java.lang.String r3 = r3.getClassName()
            java.lang.String r9 = "b9bx60Dc1lFG0ujNBJOLDCE=\n"
            java.lang.String r10 = "CLOFqCy9pSI=\n"
            java.lang.String r9 = "getClassName(...)"
            defpackage.ip.n(r9, r3)
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r10 = "WE6/LQ==\n"
            java.lang.String r11 = "CgHweYbKEHo=\n"
            java.lang.String r10 = "ROOT"
            defpackage.ip.n(r10, r9)
            java.lang.String r3 = r3.toLowerCase(r9)
            java.lang.String r10 = "OgDbf2ew8kUvHPI4PvuuLw==\n"
            java.lang.String r11 = "Tm+XEBDVgAY=\n"
            java.lang.String r10 = "toLowerCase(...)"
            defpackage.ip.n(r10, r3)
            r10 = r5[r2]
            java.lang.String r10 = r10.getMethodName()
            java.lang.String r11 = "eeh7GYxbZyJ6w245jAchYzCk\n"
            java.lang.String r12 = "Ho0PVOkvD00=\n"
            java.lang.String r11 = "getMethodName(...)"
            defpackage.ip.n(r11, r10)
            java.lang.String r11 = "o/JZUg==\n"
            java.lang.String r12 = "8b0WBj59Ifc=\n"
            "ROOT"
            java.lang.String r9 = r10.toLowerCase(r9)
            java.lang.String r10 = "5xZDNJoPHwfyCmpzw0RDbQ==\n"
            java.lang.String r11 = "k3kPW+1qbUQ=\n"
            java.lang.String r10 = "toLowerCase(...)"
            defpackage.ip.n(r10, r9)
            java.lang.String r10 = "0lXChh0=\n"
            java.lang.String r11 = "pDqr5XjiCTg=\n"
            java.lang.String r10 = "voice"
            r11 = 0
            boolean r10 = defpackage.b50.B(r3, r10, r11)
            if (r10 != 0) goto L264
            java.lang.String r10 = "7xST/og=\n"
            java.lang.String r11 = "jmH3l+fqc5U=\n"
            java.lang.String r10 = "audio"
            r11 = 0
            boolean r10 = defpackage.b50.B(r3, r10, r11)
            if (r10 != 0) goto L264
            java.lang.String r10 = "fTEWV5RW\n"
            java.lang.String r11 = "D1R1OOYyLWY=\n"
            java.lang.String r10 = "record"
            r11 = 0
            boolean r10 = defpackage.b50.B(r3, r10, r11)
            if (r10 != 0) goto L264
            java.lang.String r10 = "+oRNH7XU\n"
            java.lang.String r11 = "iOEucMewQGs=\n"
            java.lang.String r10 = "record"
            r11 = 0
            boolean r10 = defpackage.b50.B(r9, r10, r11)
            if (r10 == 0) goto L274
        L264:
            android.util.SparseIntArray r0 = defpackage.q50.a
            r0 = 0
            r2 = 0
            long r2 = r2 - r6
            r4 = 500(0x1f4, float:7.0E-43)
            long r4 = (long) r4
            long r2 = r2 - r4
            long r0 = r0 - r2
            defpackage.q50.c = r0
            goto L29
        L274:
            java.lang.String r10 = "uUSDlC0=\n"
            java.lang.String r11 = "3Cns/kQDeNQ=\n"
            java.lang.String r10 = "emoji"
            r11 = 0
            boolean r10 = defpackage.b50.B(r3, r10, r11)
            if (r10 != 0) goto L2bf
            java.lang.String r10 = "nADZGzpi\n"
            java.lang.String r11 = "722wd18bCow=\n"
            java.lang.String r10 = "smiley"
            r11 = 0
            boolean r10 = defpackage.b50.B(r3, r10, r11)
            if (r10 != 0) goto L2bf
            java.lang.String r10 = "DXqPew==\n"
            java.lang.String r11 = "ahviHrluZd0=\n"
            java.lang.String r10 = "game"
            r11 = 0
            boolean r10 = defpackage.b50.B(r3, r10, r11)
            if (r10 != 0) goto L2bf
            java.lang.String r10 = "vVtwyg==\n"
            java.lang.String r11 = "2TITr/ZNokc=\n"
            java.lang.String r10 = "dice"
            r11 = 0
            boolean r10 = defpackage.b50.B(r3, r10, r11)
            if (r10 != 0) goto L2bf
            java.lang.String r10 = "djmpEw==\n"
            java.lang.String r11 = "ElDKdhh4KTw=\n"
            java.lang.String r10 = "dice"
            r11 = 0
            boolean r10 = defpackage.b50.B(r9, r10, r11)
            if (r10 == 0) goto L2c0
        L2bf:
            r0 = 1
        L2c0:
            java.lang.String r10 = "Td2alQ==\n"
            java.lang.String r11 = "KbT58FxOylA=\n"
            java.lang.String r10 = "dice"
            r11 = 0
            boolean r3 = defpackage.b50.B(r3, r10, r11)
            if (r3 != 0) goto L2de
            java.lang.String r3 = "5f4FpA==\n"
            java.lang.String r10 = "gZdmwXuce/g=\n"
            java.lang.String r3 = "dice"
            r10 = 0
            boolean r3 = defpackage.b50.B(r9, r3, r10)
            if (r3 == 0) goto L2df
        L2de:
            r1 = 1
        L2df:
            int r2 = 0 - r2
            int r2 = r2 + (-1)
            int r2 = 0 - r2
            goto L1d2
        L2e7:
            java.lang.Integer r2 = defpackage.q50.d
            if (r2 == 0) goto L327
            r0 = 1
        L2ec:
            r1 = 1
            r2 = r1
            r3 = r0
        L2ef:
            if (r2 == 0) goto L29
            if (r3 != 0) goto L2fe
            java.lang.Integer r0 = defpackage.q50.d
            if (r0 != 0) goto L2fe
            r0 = 1
            if (r4 != r0) goto L32d
            java.lang.Integer r0 = defpackage.q50.e
            if (r0 != 0) goto L32d
        L2fe:
            java.lang.Integer r0 = defpackage.q50.d
            if (r0 == 0) goto L39a
            int r0 = r0.intValue()
            int r0 = r0 + (-25)
            int r0 = r0 + (-1)
            int r0 = r0 + 25
        L30c:
            r1 = 5
            int r0 = defpackage.gt.e(r0, r1)
            double r0 = (double) r0
            r2 = 0
            double r0 = r0 + r2
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 + r2
            r2 = 0
            double r0 = r0 - r2
            r2 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r0 = r0 / r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r15.setResult(r0)
            goto L29
        L327:
            java.lang.Integer r2 = defpackage.q50.e
            if (r2 == 0) goto Lade
            r0 = 0
            goto L2ec
        L32d:
            java.lang.Integer r0 = defpackage.q50.e
            if (r0 == 0) goto L355
            int r0 = r0.intValue()
            int r0 = r0 + (-29)
            int r0 = r0 + (-1)
            int r0 = r0 + 29
        L33b:
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r4 = 0
            r1 = 2
            int r0 = defpackage.gt.e(r0, r1)
            double r0 = (double) r0
            double r0 = r4 - r0
            double r0 = r2 - r0
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = r0 / r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r15.setResult(r0)
            goto L29
        L355:
            r0 = 1
            if (r4 != r0) goto L35b
            int r0 = defpackage.a80.u
            goto L33b
        L35b:
            java.lang.String r0 = "d1PoZJwh85ByQ/w=\n"
            java.lang.String r1 = "HDaRO+5RgM8=\n"
            java.lang.String r0 = "key_rps_num"
            java.lang.String r1 = "aYbW\n"
            java.lang.String r2 = "AuOvGSdAksw=\n"
            java.lang.String r1 = "key"
            defpackage.ip.o(r1, r0)
            gn r1 = defpackage.gn.a     // Catch: java.lang.Throwable -> Ladb
            r1.getClass()     // Catch: java.lang.Throwable -> Ladb
            r1 = 1
            int r0 = defpackage.gn.b(r0, r1)     // Catch: java.lang.Throwable -> L37d
        L378:
            int r0 = 0 - r0
            int r0 = (-1) - r0
            goto L33b
        L37d:
            r1 = move-exception
        L37e:
            gn r1 = defpackage.gn.a     // Catch: java.lang.Throwable -> L397
            r1.getClass()     // Catch: java.lang.Throwable -> L397
            r1 = 1
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L397
            java.lang.String r0 = defpackage.gn.d(r0, r1)     // Catch: java.lang.Throwable -> L397
            java.lang.Integer r0 = defpackage.b50.R(r0)     // Catch: java.lang.Throwable -> L397
            if (r0 == 0) goto L398
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L397
            goto L378
        L397:
            r0 = move-exception
        L398:
            r0 = 1
            goto L378
        L39a:
            r0 = 1
            if (r4 != r0) goto L3a1
            int r0 = defpackage.a80.t
            goto L30c
        L3a1:
            java.lang.String r0 = "LCV91RuA+5QYLnHn\n"
            java.lang.String r1 = "R0AEin/pmPE=\n"
            java.lang.String r0 = "key_dice_num"
            java.lang.String r1 = "aYbW\n"
            java.lang.String r2 = "AuOvGSdAksw=\n"
            java.lang.String r1 = "key"
            defpackage.ip.o(r1, r0)
            gn r1 = defpackage.gn.a     // Catch: java.lang.Throwable -> Lad8
            r1.getClass()     // Catch: java.lang.Throwable -> Lad8
            r1 = 1
            int r0 = defpackage.gn.b(r0, r1)     // Catch: java.lang.Throwable -> L3c6
        L3be:
            int r0 = r0 + 29
            int r0 = r0 + (-1)
            int r0 = r0 + (-29)
            goto L30c
        L3c6:
            r1 = move-exception
        L3c7:
            gn r1 = defpackage.gn.a     // Catch: java.lang.Throwable -> L3e0
            r1.getClass()     // Catch: java.lang.Throwable -> L3e0
            r1 = 1
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L3e0
            java.lang.String r0 = defpackage.gn.d(r0, r1)     // Catch: java.lang.Throwable -> L3e0
            java.lang.Integer r0 = defpackage.b50.R(r0)     // Catch: java.lang.Throwable -> L3e0
            if (r0 == 0) goto L3e1
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L3e0
            goto L3be
        L3e0:
            r0 = move-exception
        L3e1:
            r0 = 1
            goto L3be
        L3e3:
            java.lang.String r0 = "Wg==\n"
            java.lang.String r1 = "Klemh81GfNk=\n"
            java.lang.String r0 = "p"
            defpackage.ip.o(r0, r15)
            java.lang.Object[] r0 = r15.args
            r1 = 0
            r0 = r0[r1]
            java.lang.String r1 = "mD7RRZR6XTaYJMkJ1nwcO5c4yQnAdhw2mSWQR8F1UHiCMs1MlHJTLJoi0wf9d0g=\n"
            java.lang.String r2 = "9ku9KbQZPFg=\n"
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            defpackage.ip.m(r1, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            r0 = 6
            if (r1 == r0) goto L410
            r0 = 5
            if (r1 == r0) goto L410
            r0 = 3
            if (r1 == r0) goto L410
            r0 = 2
            if (r1 != r0) goto L29
        L410:
            java.lang.String r0 = "ecz8TKSka8lm9vB6\n"
            java.lang.String r2 = "EqmFE8fMDqg=\n"
            gn r3 = defpackage.gn.a
            boolean r0 = defpackage.z30.q(r0, r2, r3)
            if (r0 == 0) goto L29
            java.lang.String r0 = "kUzDNIo4Y52OdtcEjTU=\n"
            java.lang.String r2 = "+im6a+lQBvw=\n"
            java.lang.String r0 = "key_cheat_mode"
            r2 = 0
            int r2 = defpackage.gt.j(r0, r2)
            java.lang.String r0 = "Cvnp75RaLR0+8/4=\n"
            java.lang.String r3 = "YZyQsPAzTng=\n"
            java.lang.String r0 = "key_dice_on"
            boolean r3 = defpackage.gt.i(r0)
            java.lang.String r0 = "WTneI+EAt69dMg==\n"
            java.lang.String r4 = "MlynfJNwxPA=\n"
            java.lang.String r0 = "key_rps_on"
            boolean r4 = defpackage.gt.i(r0)
            if (r2 != 0) goto L44f
            if (r3 != 0) goto L44f
            if (r4 != 0) goto L44f
            java.lang.Integer r0 = defpackage.q50.d
            if (r0 != 0) goto L44f
            java.lang.Integer r0 = defpackage.q50.e
            if (r0 == 0) goto L29
        L44f:
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = defpackage.q50.c
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L466
            android.util.SparseIntArray r0 = defpackage.q50.a
            r0 = 500(0x1f4, float:7.0E-43)
            long r0 = (long) r0
            r2 = 0
            long r2 = r2 - r6
            long r0 = r0 - r2
            defpackage.q50.c = r0
            goto L29
        L466:
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r5 = r0.getStackTrace()
            int r0 = r5.length
            r8 = 15
            int r8 = java.lang.Math.min(r0, r8)
            r0 = 0
        L477:
            if (r0 >= r8) goto L521
            r9 = r5[r0]
            java.lang.String r9 = r9.getClassName()
            java.lang.String r10 = "zoNNv5yfWvPnh1SZ2NAHroA=\n"
            java.lang.String r11 = "qeY5/PD+KYA=\n"
            java.lang.String r10 = "getClassName(...)"
            defpackage.ip.n(r10, r9)
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r11 = "1rEBcA==\n"
            java.lang.String r12 = "hP5OJLcOug0=\n"
            java.lang.String r11 = "ROOT"
            defpackage.ip.n(r11, r10)
            java.lang.String r9 = r9.toLowerCase(r10)
            java.lang.String r11 = "TzqeW3iJmJVaJrccIcLE/w==\n"
            java.lang.String r12 = "O1XSNA/s6tY=\n"
            java.lang.String r11 = "toLowerCase(...)"
            defpackage.ip.n(r11, r9)
            r11 = r5[r0]
            java.lang.String r11 = r11.getMethodName()
            java.lang.String r12 = "NV8IUSl8zEQ2dB1xKSCKBXwT\n"
            java.lang.String r13 = "Ujp8HEwIpCs=\n"
            java.lang.String r12 = "getMethodName(...)"
            defpackage.ip.n(r12, r11)
            java.lang.String r12 = "igczFg==\n"
            java.lang.String r13 = "2Eh8QjooGjo=\n"
            "ROOT"
            java.lang.String r10 = r11.toLowerCase(r10)
            java.lang.String r11 = "vyNMAPeltbaqP2VHru7p3A==\n"
            java.lang.String r12 = "y0wAb4DAx/U=\n"
            java.lang.String r11 = "toLowerCase(...)"
            defpackage.ip.n(r11, r10)
            java.lang.String r11 = "N6gV6Qs=\n"
            java.lang.String r12 = "Qcd8im6RKjk=\n"
            java.lang.String r11 = "voice"
            r12 = 0
            boolean r11 = defpackage.b50.B(r9, r11, r12)
            if (r11 != 0) goto L509
            java.lang.String r11 = "ADnRZes=\n"
            java.lang.String r12 = "YUy1DIRt4p4=\n"
            java.lang.String r11 = "audio"
            r12 = 0
            boolean r11 = defpackage.b50.B(r9, r11, r12)
            if (r11 != 0) goto L509
            java.lang.String r11 = "bKBztEdK\n"
            java.lang.String r12 = "HsUQ2zUuIqs=\n"
            java.lang.String r11 = "record"
            r12 = 0
            boolean r9 = defpackage.b50.B(r9, r11, r12)
            if (r9 != 0) goto L509
            java.lang.String r9 = "AnJ7YsFS\n"
            java.lang.String r11 = "cBcYDbM2Wlg=\n"
            java.lang.String r9 = "record"
            r11 = 0
            boolean r9 = defpackage.b50.B(r10, r9, r11)
            if (r9 == 0) goto L519
        L509:
            android.util.SparseIntArray r0 = defpackage.q50.a
            r0 = 12
            long r0 = r0 + r6
            r2 = 500(0x1f4, float:7.0E-43)
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 12
            long r0 = r0 - r2
            defpackage.q50.c = r0
            goto L29
        L519:
            int r0 = r0 + 25
            int r0 = r0 + 1
            int r0 = r0 + (-25)
            goto L477
        L521:
            r0 = 2
            if (r1 == r0) goto L596
            r0 = 3
            if (r1 == r0) goto L596
            r0 = 5
            if (r1 == r0) goto L52d
            r0 = 6
            if (r1 != r0) goto L29
        L52d:
            java.lang.Integer r0 = defpackage.q50.d
            if (r0 == 0) goto L551
            int r0 = r0.intValue()
        L535:
            int r0 = r0 + (-13)
            int r0 = r0 + (-1)
            int r0 = r0 + 13
        L53b:
            r2 = -1
            if (r0 == r2) goto L29
            int r1 = r1 + 5
            int r1 = r1 + (-1)
            int r1 = r1 + (-5)
            int r0 = defpackage.gt.e(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15.setResult(r0)
            goto L29
        L551:
            r0 = 1
            if (r2 != r0) goto L557
            int r0 = defpackage.a80.t
            goto L53b
        L557:
            if (r3 == 0) goto L594
            java.lang.String r0 = "2B1TxXL+DqzsFl/3\n"
            java.lang.String r2 = "s3gqmhaXbck=\n"
            java.lang.String r0 = "key_dice_num"
            java.lang.String r2 = "aYbW\n"
            java.lang.String r3 = "AuOvGSdAksw=\n"
            java.lang.String r2 = "key"
            defpackage.ip.o(r2, r0)
            gn r2 = defpackage.gn.a     // Catch: java.lang.Throwable -> Lad5
            r2.getClass()     // Catch: java.lang.Throwable -> Lad5
            r2 = 1
            int r0 = defpackage.gn.b(r0, r2)     // Catch: java.lang.Throwable -> L577
            goto L535
        L577:
            r2 = move-exception
        L578:
            gn r2 = defpackage.gn.a     // Catch: java.lang.Throwable -> L591
            r2.getClass()     // Catch: java.lang.Throwable -> L591
            r2 = 1
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L591
            java.lang.String r0 = defpackage.gn.d(r0, r2)     // Catch: java.lang.Throwable -> L591
            java.lang.Integer r0 = defpackage.b50.R(r0)     // Catch: java.lang.Throwable -> L591
            if (r0 == 0) goto L592
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L591
            goto L535
        L591:
            r0 = move-exception
        L592:
            r0 = 1
            goto L535
        L594:
            r0 = -1
            goto L53b
        L596:
            java.lang.Integer r0 = defpackage.q50.e
            if (r0 == 0) goto L5ba
            int r0 = r0.intValue()
            int r0 = r0 + 16
            int r0 = r0 + (-1)
            int r0 = r0 + (-16)
        L5a4:
            r2 = -1
            if (r0 == r2) goto L29
            int r1 = 0 - r1
            int r1 = r1 + 1
            int r1 = 0 - r1
            int r0 = defpackage.gt.e(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15.setResult(r0)
            goto L29
        L5ba:
            r0 = 1
            if (r2 != r0) goto L5c0
            int r0 = defpackage.a80.u
            goto L5a4
        L5c0:
            if (r4 == 0) goto L5ff
            java.lang.String r0 = "Uaip3AgC+1JUuL0=\n"
            java.lang.String r2 = "Os3Qg3pyiA0=\n"
            java.lang.String r0 = "key_rps_num"
            java.lang.String r2 = "aYbW\n"
            java.lang.String r3 = "AuOvGSdAksw=\n"
            java.lang.String r2 = "key"
            defpackage.ip.o(r2, r0)
            gn r2 = defpackage.gn.a     // Catch: java.lang.Throwable -> Lad2
            r2.getClass()     // Catch: java.lang.Throwable -> Lad2
            r2 = 1
            int r0 = defpackage.gn.b(r0, r2)     // Catch: java.lang.Throwable -> L5e2
        L5df:
            int r0 = r0 + (-1)
            goto L5a4
        L5e2:
            r2 = move-exception
        L5e3:
            gn r2 = defpackage.gn.a     // Catch: java.lang.Throwable -> L5fc
            r2.getClass()     // Catch: java.lang.Throwable -> L5fc
            r2 = 1
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L5fc
            java.lang.String r0 = defpackage.gn.d(r0, r2)     // Catch: java.lang.Throwable -> L5fc
            java.lang.Integer r0 = defpackage.b50.R(r0)     // Catch: java.lang.Throwable -> L5fc
            if (r0 == 0) goto L5fd
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L5fc
            goto L5df
        L5fc:
            r0 = move-exception
        L5fd:
            r0 = 1
            goto L5df
        L5ff:
            r0 = -1
            goto L5a4
        L601:
            java.lang.String r0 = "Gw==\n"
            java.lang.String r1 = "azgQ3e5y3gU=\n"
            java.lang.String r0 = "p"
            defpackage.ip.o(r0, r15)
            java.lang.Object[] r0 = r15.args
            r1 = 0
            r0 = r0[r1]
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Lafc
            java.lang.String r0 = (java.lang.String) r0
        L617:
            if (r0 == 0) goto L29
            java.lang.String r1 = "Ea84Ye0hFrglpTNX6z0MiBOnJg==\n"
            java.lang.String r2 = "espBPoxUYtc=\n"
            gn r3 = defpackage.gn.a
            boolean r1 = defpackage.z30.q(r1, r2, r3)
            if (r1 == 0) goto L29
            java.lang.String r1 = "L8EQVIhBq58DzRNX\n"
            java.lang.String r2 = "XKR+MNczyug=\n"
            java.lang.String r1 = "send_raw_img"
            r2 = 0
            boolean r1 = defpackage.b50.B(r0, r1, r2)
            if (r1 != 0) goto L643
            java.lang.String r1 = "nYYv\n"
            java.lang.String r2 = "7+dYpFvA4xk=\n"
            java.lang.String r1 = "raw"
            r2 = 0
            boolean r0 = defpackage.b50.B(r0, r1, r2)
            if (r0 == 0) goto L29
        L643:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r15.setResult(r0)
            goto L29
        L64a:
            java.lang.String r0 = "oNHuhtY=\n"
            java.lang.String r1 = "0LCc57uHa1k=\n"
            java.lang.String r0 = "param"
            defpackage.ip.o(r0, r15)
            java.lang.Object r0 = r15.thisObject
            boolean r1 = r0 instanceof android.widget.EditText
            if (r1 == 0) goto L29
            java.lang.Object[] r1 = r15.args
            r2 = 0
            r1 = r1[r2]
            if (r1 == 0) goto L29
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L29
            int r2 = r1.length()
            if (r2 == 0) goto L29
            int r2 = r1.length()
            r3 = 2
            if (r2 < r3) goto L29
            gn r2 = defpackage.gn.a
            java.lang.String r3 = "+q0cu9Rxya70vDqByWDYpc6rCoDC\n"
            java.lang.String r4 = "kchl5KcUqtw=\n"
            java.lang.String r3 = "key_secret_entry_code"
            java.lang.String r4 = "g8aUu+w=\n"
            java.lang.String r5 = "oKHx3odqh0k=\n"
            java.lang.String r4 = "#geek"
            r2.getClass()
            java.lang.String r2 = defpackage.gn.d(r3, r4)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L29
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 3
            long r4 = r2 - r4
            long r6 = defpackage.ct.a
            long r4 = r4 - r6
            r6 = 3
            long r4 = r4 + r6
            r6 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L29
            defpackage.ct.a = r2
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r1 = ""
            r0.setText(r1)
            android.content.Context r1 = r0.getContext()
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto Laf9
            android.app.Activity r1 = (android.app.Activity) r1
        L6bb:
            if (r1 == 0) goto L29
            r2 = 1
            defpackage.gn.i(r0, r2)
            java.lang.String r0 = defpackage.t6.a
            s20 r0 = defpackage.s20.a
            r0.getClass()
            defpackage.s20.a(r1)
            goto L29
        L6cd:
            java.lang.String r0 = "4c90H2w=\n"
            java.lang.String r1 = "ka4GfgGqYzE=\n"
            java.lang.String r0 = "param"
            defpackage.ip.o(r0, r15)
            java.lang.Object r2 = r15.thisObject
            java.util.concurrent.ConcurrentHashMap r0 = defpackage.bz.a
            java.lang.Object r0 = r0.remove(r2)
            kx r0 = (defpackage.kx) r0
            if (r0 == 0) goto L29
            java.lang.Object r1 = r0.a
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.b
            sm r0 = (defpackage.sm) r0
            java.lang.String r3 = defpackage.pb0.x     // Catch: java.lang.Exception -> L75d
            java.lang.Object r2 = de.robv.android.xposed.XposedHelpers.getObjectField(r2, r3)     // Catch: java.lang.Exception -> L75d
            if (r2 == 0) goto L29
            java.lang.String r3 = defpackage.pb0.y     // Catch: java.lang.Exception -> L75d
            java.lang.Object r2 = de.robv.android.xposed.XposedHelpers.getObjectField(r2, r3)     // Catch: java.lang.Exception -> L75d
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L75d
            if (r3 == 0) goto Laf6
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L75d
        L700:
            if (r2 == 0) goto L29
            int r3 = r2.length()     // Catch: java.lang.Exception -> L75d
            if (r3 == 0) goto L29
            int r3 = r2.length()     // Catch: java.lang.Exception -> L75d
            if (r3 == 0) goto L760
            int r3 = defpackage.b50.D(r2)     // Catch: java.lang.Exception -> L75d
            char r2 = r2.charAt(r3)     // Catch: java.lang.Exception -> L75d
            gn r3 = defpackage.gn.a     // Catch: java.lang.Exception -> L75d
            java.lang.String r4 = "qKJ4pakUuPWcqWCXvi6p66ahaII=\n"
            java.lang.String r5 = "w8cB+ttx2Zk=\n"
            java.lang.String r4 = "key_real_name_prefix"     // Catch: java.lang.Exception -> L75d
            java.lang.String r5 = "WBpD\n"
            java.lang.String r6 = "varMEy4YObY=\n"
            java.lang.String r5 = "\u5c0f"     // Catch: java.lang.Exception -> L75d
            r3.getClass()     // Catch: java.lang.Exception -> L75d
            java.lang.String r3 = defpackage.gn.d(r4, r5)     // Catch: java.lang.Exception -> L75d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L75d
            r4.<init>()     // Catch: java.lang.Exception -> L75d
            r4.append(r3)     // Catch: java.lang.Exception -> L75d
            r4.append(r2)     // Catch: java.lang.Exception -> L75d
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L75d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L75d
            java.lang.String r4 = "real_name_"
            r3.<init>(r4)     // Catch: java.lang.Exception -> L75d
            r3.append(r1)     // Catch: java.lang.Exception -> L75d
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L75d
            defpackage.gn.h(r1, r2)     // Catch: java.lang.Exception -> L75d
            android.os.Handler r1 = defpackage.d9.b     // Catch: java.lang.Exception -> L75d
            t5 r3 = new t5     // Catch: java.lang.Exception -> L75d
            r4 = 8
            r3.<init>(r0, r4, r2)     // Catch: java.lang.Exception -> L75d
            r1.post(r3)     // Catch: java.lang.Exception -> L75d
            goto L29
        L75d:
            r0 = move-exception
            goto L29
        L760:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Exception -> L75d
            java.lang.String r1 = "Char sequence is empty."
            r0.<init>(r1)     // Catch: java.lang.Exception -> L75d
            throw r0     // Catch: java.lang.Exception -> L75d
        L768:
            java.lang.String r0 = "FA==\n"
            java.lang.String r1 = "ZFPzWwRIz/Q=\n"
            java.lang.String r0 = "p"
            defpackage.ip.o(r0, r15)
            java.lang.Object r0 = r15.thisObject
            boolean r1 = r0 instanceof android.widget.ImageView
            if (r1 == 0) goto L7ba
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1 = r0
        L77c:
            if (r1 == 0) goto L29
            java.lang.String r0 = "G2ES5Sk6T50UYQ/lOiNbhxF2\n"
            java.lang.String r2 = "cARrultVOvM=\n"
            java.lang.String r0 = "key_rounded_avatar"
            java.lang.String r2 = "ggWA\n"
            java.lang.String r3 = "6WD5BmkcYhM=\n"
            java.lang.String r2 = "key"
            defpackage.ip.o(r2, r0)
            gn r2 = defpackage.gn.a     // Catch: java.lang.Throwable -> L7bd
            r2.getClass()     // Catch: java.lang.Throwable -> L7bd
            boolean r0 = defpackage.gn.e(r0)     // Catch: java.lang.Throwable -> L7bd
        L79a:
            if (r0 == 0) goto L29
            r0 = 2114650112(0x7e0b0000, float:4.6190673E37)
            java.lang.Object r0 = r1.getTag(r0)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = defpackage.ip.i(r0, r2)
            if (r0 == 0) goto L29
            ay r0 = defpackage.dy.h
            if (r0 == 0) goto L29
            r1.setOutlineProvider(r0)
            r0 = 1
            r1.setClipToOutline(r0)
            r1.invalidateOutline()
            goto L29
        L7ba:
            r0 = 0
            r1 = r0
            goto L77c
        L7bd:
            r2 = move-exception
            gn r2 = defpackage.gn.a     // Catch: java.lang.Throwable -> L7e8
            r2.getClass()     // Catch: java.lang.Throwable -> L7e8
            r2 = 0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L7e8
            java.lang.String r0 = defpackage.gn.d(r0, r2)     // Catch: java.lang.Throwable -> L7e8
            java.lang.String r2 = "true"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L7e8
            if (r2 == 0) goto L7dd
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L7e8
        L7d6:
            if (r0 == 0) goto L7e9
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L7e8
            goto L79a
        L7dd:
            java.lang.String r2 = "false"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L7e8
            if (r0 == 0) goto Laf3
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L7e8
            goto L7d6
        L7e8:
            r0 = move-exception
        L7e9:
            r0 = 0
            goto L79a
        L7eb:
            java.lang.String r0 = "AzHCyE8=\n"
            java.lang.String r1 = "c1CwqSK+qUI=\n"
            java.lang.String r0 = "param"
            defpackage.ip.o(r0, r15)
            java.lang.Object r0 = r15.thisObject
            java.lang.String r1 = "W9RWycul8o9bzk6FiaOzglTSToWfqbOPWs8Xy56q/8FB2ErAy6f9hUfOU8HFp+ORG+BZ0YKw+pVM\n"
            java.lang.String r2 = "NaE6pevGk+E=\n"
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            defpackage.ip.m(r1, r0)
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r1 = r0.getWindow()
            android.view.View r1 = r1.getDecorView()
            java.lang.String r2 = "Hy9dEG0qOOMfNUVcLyx57hApRVw5JnnjHjQcEjglNa0FI0EZbSg36QM1WBhjPzDoBnRnFSg+Hv8e\nL0E=\n"
            java.lang.String r3 = "cVoxfE1JWY0=\n"
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup"
            defpackage.ip.m(r2, r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            qs r3 = new qs
            r3.<init>(r1, r14, r0)
            r2.addOnPreDrawListener(r3)
            goto L29
        L828:
            java.lang.String r0 = "MDU6Qdk=\n"
            java.lang.String r2 = "QFRIILSX8DQ=\n"
            java.lang.String r0 = "param"
            defpackage.ip.o(r0, r15)
            java.lang.Object[] r0 = r15.args
            r2 = 0
            r0 = r0[r2]
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L8e5
            java.lang.String r0 = (java.lang.String) r0
        L83e:
            if (r0 == 0) goto L29
            java.lang.String r2 = "A9JWLgnfPw==\n"
            java.lang.String r3 = "brclXWi4WoE=\n"
            java.lang.String r2 = "message"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L29
            java.lang.Object[] r3 = r15.args
            java.lang.String r0 = "x1JL4Q==\n"
            java.lang.String r2 = "piAsksk06Jk=\n"
            java.lang.String r0 = "args"
            defpackage.ip.n(r0, r3)
            int r4 = r3.length
            r0 = 0
            r2 = r0
        L85e:
            if (r2 >= r4) goto L8f1
            r0 = r3[r2]
            boolean r6 = r0 instanceof android.content.ContentValues
            if (r6 == 0) goto L8e8
        L866:
            boolean r2 = r0 instanceof android.content.ContentValues
            if (r2 == 0) goto L8f4
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            r4 = r0
        L86d:
            if (r4 == 0) goto L29
            java.lang.String r0 = "WV7fdg==\n"
            java.lang.String r2 = "LSevE3FxUHc=\n"
            java.lang.String r0 = "type"
            java.lang.Integer r0 = r4.getAsInteger(r0)
            if (r0 == 0) goto L8f8
            int r0 = r0.intValue()
        L881:
            r2 = 49
            if (r0 == r2) goto L88a
            r2 = 436207665(0x1a000031, float:2.6469934E-23)
            if (r0 != r2) goto L29
        L88a:
            java.lang.String r0 = "St2KP4JY\n"
            java.lang.String r2 = "PrzmVOcqy5o=\n"
            java.lang.String r0 = "talker"
            java.lang.String r0 = r4.getAsString(r0)
            if (r0 != 0) goto L89a
            java.lang.String r0 = ""
        L89a:
            int r2 = r0.length()
            if (r2 != 0) goto L8c8
            hs r0 = defpackage.hs.a
            java.lang.Object r0 = r15.thisObject
            java.lang.String r2 = "gNN/lwGMZR6Xzw==\n"
            java.lang.String r3 = "9LsW5E7uD3s=\n"
            java.lang.String r2 = "thisObject"
            defpackage.ip.n(r2, r0)
            java.lang.String r2 = "+9kTyDowy+8=\n"
            java.lang.String r3 = "j7h/o19Cgos=\n"
            java.lang.String r2 = "talkerId"
            java.lang.Long r2 = r4.getAsLong(r2)
            if (r2 == 0) goto L8fa
            long r2 = r2.longValue()
        L8c1:
            r6 = 0
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 > 0) goto L8fd
            r0 = r1
        L8c8:
            int r1 = r0.length()
            if (r1 <= 0) goto L29
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>(r4)
            java.lang.String r2 = "wJh8vfB8\n"
            java.lang.String r3 = "tPkQ1pUOd1I=\n"
            java.lang.String r2 = "talker"
            r1.put(r2, r0)
            hs r0 = defpackage.hs.a
            defpackage.hs.b(r1)
            goto L29
        L8e5:
            r0 = 0
            goto L83e
        L8e8:
            int r0 = r2 + (-30)
            int r0 = r0 + 1
            int r0 = r0 + 30
            r2 = r0
            goto L85e
        L8f1:
            r0 = 0
            goto L866
        L8f4:
            r0 = 0
            r4 = r0
            goto L86d
        L8f8:
            r0 = 0
            goto L881
        L8fa:
            r2 = 0
            goto L8c1
        L8fd:
            java.lang.String r6 = "u7ArR9W/0b4=\n"
            java.lang.String r7 = "ydFcFqDao8c=\n"
            java.lang.String r6 = "rawQuery"     // Catch: java.lang.Throwable -> Lace
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Lace
            r8 = 0
            java.lang.String r9 = "tg50vcNfwoaWLkqW4WaH06MZd7WgeYGciz9Zm/QrtbugGX3Y8mSVmoFrBdi/\n"
            java.lang.String r10 = "5Us4+IAL4vM=\n"
            java.lang.String r9 = "SELECT username FROM rcontact WHERE rowid = ?"     // Catch: java.lang.Throwable -> Lace
            r7[r8] = r9     // Catch: java.lang.Throwable -> Lace
            r8 = 1
            r9 = 1
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> Lace
            r10 = 0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> Lace
            r9[r10] = r2     // Catch: java.lang.Throwable -> Lace
            r7[r8] = r9     // Catch: java.lang.Throwable -> Lace
            java.lang.Object r2 = de.robv.android.xposed.XposedHelpers.callMethod(r0, r6, r7)     // Catch: java.lang.Throwable -> Lace
            if (r2 == 0) goto Laf0
            java.lang.String r0 = "zuRVGWbh6tvR+Fc=\n"
            java.lang.String r3 = "o4sjfDKOrLI=\n"
            java.lang.String r0 = "moveToFirst"     // Catch: java.lang.Throwable -> Lace
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lace
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r2, r0, r3)     // Catch: java.lang.Throwable -> Lace
            boolean r3 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> Lace
            if (r3 == 0) goto L976
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lace
        L93b:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lace
            boolean r0 = defpackage.ip.i(r0, r3)     // Catch: java.lang.Throwable -> Lace
            if (r0 == 0) goto Laed
            java.lang.String r0 = "FtIlwqS8DP8W\n"
            java.lang.String r3 = "cbdRkdDOZZE=\n"
            java.lang.String r0 = "getString"     // Catch: java.lang.Throwable -> Lace
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lace
            r6 = 0
            r7 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lace
            r3[r6] = r7     // Catch: java.lang.Throwable -> Lace
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r2, r0, r3)     // Catch: java.lang.Throwable -> Lace
            boolean r3 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lace
            if (r3 == 0) goto Laea
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lace
        L960:
            if (r0 != 0) goto L963
            r0 = r1
        L963:
            java.lang.String r1 = "F454kTQ=\n"
            java.lang.String r3 = "dOIX4lERLik=\n"
            java.lang.String r1 = "close"     // Catch: java.lang.Throwable -> L973
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L973
            de.robv.android.xposed.XposedHelpers.callMethod(r2, r1, r3)     // Catch: java.lang.Throwable -> L973
            goto L8c8
        L973:
            r1 = move-exception
            goto L8c8
        L976:
            r0 = 0
            goto L93b
        L978:
            java.lang.String r0 = "UcWnZ8M=\n"
            java.lang.String r1 = "IaTVBq5+Ax4=\n"
            java.lang.String r0 = "param"
            defpackage.ip.o(r0, r15)
            java.lang.String r0 = "eddIlfAN3g9r\n"
            java.lang.String r1 = "ErIxypx4vWQ=\n"
            gn r2 = defpackage.gn.a
            boolean r0 = defpackage.z30.q(r0, r1, r2)
            if (r0 == 0) goto L29
            java.lang.String r0 = "NjaNqnxxM8IkDJmadGE=\n"
            java.lang.String r1 = "XVP09RAEUKk=\n"
            java.lang.String r0 = "key_lucky_mode"
            r1 = 0
            int r0 = defpackage.gn.b(r0, r1)
            if (r0 != 0) goto L29
            java.lang.Object r0 = r15.thisObject
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto Lae7
            android.app.Activity r0 = (android.app.Activity) r0
        L9a6:
            if (r0 == 0) goto L29
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "zDJEXINz+CP9PlVvzj65f4I=\n"
            java.lang.String r2 = "q1cwGOYQl1E=\n"
            java.lang.String r1 = "getDecorView(...)"
            defpackage.ip.n(r1, r0)
            gs r1 = new gs
            r2 = 0
            r1.<init>(r0, r2)
            r2 = 100
            r0.postDelayed(r1, r2)
            gs r1 = new gs
            r2 = 1
            r1.<init>(r0, r2)
            r2 = 300(0x12c, double:1.48E-321)
            r0.postDelayed(r1, r2)
            goto L29
        L9d3:
            java.lang.String r0 = "Ye5kdcA=\n"
            java.lang.String r1 = "EY8WFK0fWhM=\n"
            java.lang.String r0 = "param"
            defpackage.ip.o(r0, r15)
            java.lang.Object r0 = r15.thisObject
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto La2c
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L9e6:
            if (r0 == 0) goto L29
            r1 = 2114322432(0x7e060000, float:4.452914E37)
            java.lang.Object r0 = r0.getTag(r1)
            boolean r1 = r0 instanceof defpackage.e9
            if (r1 == 0) goto Lae4
            e9 r0 = (defpackage.e9) r0
        L9f4:
            if (r0 == 0) goto L29
            f9 r0 = r0.h
            if (r0 == 0) goto L29
            java.lang.Object r0 = r15.getResult()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = defpackage.ip.i(r0, r1)
            if (r0 == 0) goto L29
            java.lang.Object[] r0 = r15.args
            r1 = 0
            r0 = r0[r1]
            java.lang.String r1 = "jDfhKVo+usOMLfllGDj7zoMx+WUOMvvDjSygKw8xt42WO/0gWjy1yZAt5CFUK7LIlWzAKg40tMOn\nNOgrDg==\n"
            java.lang.String r2 = "4kKNRXpd260=\n"
            java.lang.String r1 = "null cannot be cast to non-null type android.view.MotionEvent"
            defpackage.ip.m(r1, r0)
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            int r1 = r0.getActionMasked()
            if (r1 == 0) goto La25
            int r0 = r0.getActionMasked()
            r1 = 2
            if (r0 != r1) goto L29
        La25:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r15.setResult(r0)
            goto L29
        La2c:
            r0 = 0
            goto L9e6
        La2e:
            java.lang.String r0 = "elF7ZYQ=\n"
            java.lang.String r1 = "CjAJBOmjlG8=\n"
            java.lang.String r0 = "param"
            defpackage.ip.o(r0, r15)
            java.lang.String r0 = defpackage.ff.z     // Catch: java.lang.Throwable -> La92
            java.lang.String r1 = "5kx4l0XHQF3ldg==\n"
            java.lang.String r3 = "gSkd/BqhLzE=\n"
            java.lang.String r1 = "geek_fold_"     // Catch: java.lang.Throwable -> La92
            r3 = 0
            boolean r1 = defpackage.b50.N(r0, r1, r3)     // Catch: java.lang.Throwable -> La92
            if (r1 == 0) goto L29
            gn r1 = defpackage.gn.a     // Catch: java.lang.Throwable -> La92
            java.lang.String r3 = "key_geek_folder_name_"
            java.lang.String r0 = r3.concat(r0)     // Catch: java.lang.Throwable -> La92
            java.lang.String r3 = "hSrv/WMTP9TkS9OfKTJtiMkU\n"
            java.lang.String r4 = "ba1FGM2J220=\n"
            java.lang.String r3 = "\u81ea\u5b9a\u4e49\u6587\u4ef6\u5939"     // Catch: java.lang.Throwable -> La92
            r1.getClass()     // Catch: java.lang.Throwable -> La92
            java.lang.String r0 = defpackage.gn.d(r0, r3)     // Catch: java.lang.Throwable -> La92
            java.lang.Object r1 = r15.thisObject     // Catch: java.lang.Throwable -> La92
            java.lang.String r3 = "K80AoiK9qkU0zQ==\n"
            java.lang.String r4 = "WKh072/pwzE=\n"
            java.lang.String r3 = "setMMTitle"     // Catch: java.lang.Throwable -> La92
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> La92
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Throwable -> La92
            de.robv.android.xposed.XposedHelpers.callMethod(r1, r3, r4)     // Catch: java.lang.Throwable -> La92
            java.lang.Object r0 = r15.thisObject     // Catch: java.lang.Throwable -> La92
            java.lang.String r1 = "n5FpmKXa6A==\n"
            java.lang.String r3 = "+PQdzsy/n40=\n"
            java.lang.String r1 = "getView"     // Catch: java.lang.Throwable -> La92
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La92
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r0, r1, r3)     // Catch: java.lang.Throwable -> La92
            boolean r1 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> La92
            if (r1 == 0) goto Lae2
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> La92
        La8b:
            if (r0 == 0) goto L29
            defpackage.vd.b(r0)     // Catch: java.lang.Throwable -> La92
            goto L29
        La92:
            r0 = move-exception
            java.lang.String r0 = "Nwje\n"
            java.lang.String r1 = "Q2m5jaPP2Zc=\n"
            java.lang.String r2 = "mb0HqbNQksSwuTSfg2qvxro=\n"
            java.lang.String r3 = "39JrzeYZ2qs=\n"
            java.lang.String r2 = "FoldUIHook_Resume"
            java.lang.String r3 = "Fg==\n"
            java.lang.String r4 = "c8HJlSTQVfc=\n"
            defpackage.z30.o(r0, r1, r2, r3, r4)
            goto L29
        Laa8:
            java.lang.String r0 = "dg==\n"
            java.lang.String r1 = "Bg0NHDsJzxo=\n"
            java.lang.String r0 = "p"
            defpackage.ip.o(r0, r15)
            gn r0 = defpackage.gn.a
            java.lang.String r1 = "sgH31pwd\n"
            java.lang.String r2 = "8WmWoslUoB0=\n"
            java.lang.String r1 = "ChatUI"
            j9 r2 = new j9
            r3 = 1
            r2.<init>(r15, r3)
            r0.getClass()
            defpackage.gn.j(r1, r2)
            goto L29
        Lacb:
            r0 = move-exception
            goto L17a
        Lace:
            r0 = move-exception
            r0 = r1
            goto L8c8
        Lad2:
            r2 = move-exception
            goto L5e3
        Lad5:
            r2 = move-exception
            goto L578
        Lad8:
            r1 = move-exception
            goto L3c7
        Ladb:
            r1 = move-exception
            goto L37e
        Lade:
            r2 = r0
            r3 = r1
            goto L2ef
        Lae2:
            r0 = r2
            goto La8b
        Lae4:
            r0 = r3
            goto L9f4
        Lae7:
            r0 = r4
            goto L9a6
        Laea:
            r0 = r5
            goto L960
        Laed:
            r0 = r1
            goto L963
        Laf0:
            r0 = r1
            goto L8c8
        Laf3:
            r0 = r6
            goto L7d6
        Laf6:
            r2 = r7
            goto L700
        Laf9:
            r1 = r8
            goto L6bb
        Lafc:
            r0 = r9
            goto L617
        Laff:
            r0 = r10
            goto Lea
        Lb02:
            r0 = r11
            goto L4d
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r16) {
            r15 = this;
            int r2 = r15.a
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = 0
            r5 = 0
            switch(r2) {
                case 0: goto L1aa2;
                case 1: goto L12f5;
                case 2: goto L117d;
                case 3: goto Ld;
                case 4: goto L113f;
                case 5: goto Lf30;
                case 6: goto Ld19;
                case 7: goto L467;
                case 8: goto Ld;
                case 9: goto Ld;
                case 10: goto Ld;
                case 11: goto L3ef;
                case 12: goto L2c4;
                case 13: goto L114;
                case 14: goto L50;
                case 15: goto L4c;
                case 16: goto L48;
                case 17: goto L44;
                case 18: goto L40;
                case 19: goto Ld;
                case 20: goto Ld;
                case 21: goto L19;
                case 22: goto Ld;
                case 23: goto Ld;
                case 24: goto Ld;
                case 25: goto Ld;
                case 26: goto Ld;
                case 27: goto L15;
                case 28: goto L11;
                default: goto Ld;
            }
        Ld:
            super.beforeHookedMethod(r16)
        L10:
            return
        L11:
            r15.h(r16)
            goto L10
        L15:
            r15.g(r16)
            goto L10
        L19:
            r15.f(r16)
            int r3 = defpackage.C0072.m289()
            r2 = 1616(0x650, float:2.264E-42)
        L22:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L28;
                case 49: goto L2b;
                case 204: goto L30;
                case 239: goto L10;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L22
        L2b:
            if (r3 > 0) goto L28
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L22
        L30:
            java.lang.String r2 = "tl86BhfhpGOJXQCeNbbqKvWyp"
            java.lang.String r2 = defpackage.C0073.m293(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r2)
            goto L10
        L40:
            r15.e(r16)
            goto L10
        L44:
            r15.d(r16)
            goto L10
        L48:
            r15.c(r16)
            goto L10
        L4c:
            r15.b(r16)
            goto L10
        L50:
            java.lang.String r2 = "IA==\n"
            java.lang.String r4 = "UCdJ/Dw8hBA=\n"
            java.lang.String r2 = "p"
            r0 = r16
            defpackage.ip.o(r2, r0)
            r0 = r16
            java.lang.Object[] r2 = r0.args
            r4 = 0
            r2 = r2[r4]
            boolean r5 = r2 instanceof java.lang.String
            r4 = 1740(0x6cc, float:2.438E-42)
        L68:
            r4 = r4 ^ 1757(0x6dd, float:2.462E-42)
            switch(r4) {
                case 17: goto L6e;
                case 54: goto L73;
                case 471: goto L84;
                case 500: goto L76;
                default: goto L6d;
            }
        L6d:
            goto L68
        L6e:
            if (r5 == 0) goto L73
            r4 = 1833(0x729, float:2.569E-42)
            goto L68
        L73:
            r4 = 1802(0x70a, float:2.525E-42)
            goto L68
        L76:
            java.lang.String r2 = (java.lang.String) r2
            r4 = 1864(0x748, float:2.612E-42)
        L7a:
            r4 = r4 ^ 1881(0x759, float:2.636E-42)
            switch(r4) {
                case 17: goto L80;
                case 47483: goto L85;
                default: goto L7f;
            }
        L7f:
            goto L7a
        L80:
            r4 = 48674(0xbe22, float:6.8207E-41)
            goto L7a
        L84:
            r2 = 0
        L85:
            r4 = 48767(0xbe7f, float:6.8337E-41)
        L88:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 14: goto L90;
                case 45: goto L10;
                case 76: goto L9a;
                case 239: goto L94;
                default: goto L8f;
            }
        L8f:
            goto L88
        L90:
            r4 = 48829(0xbebd, float:6.8424E-41)
            goto L88
        L94:
            if (r2 == 0) goto L90
            r4 = 48860(0xbedc, float:6.8467E-41)
            goto L88
        L9a:
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r5 = "x0Ving==\n"
            java.lang.String r6 = "lQotymmHBys=\n"
            java.lang.String r5 = "ROOT"
            defpackage.ip.n(r5, r4)
            java.lang.String r5 = r2.toLowerCase(r4)
            java.lang.String r2 = "MgZwgBzqiMonGlnHRaHUoA==\n"
            java.lang.String r4 = "Rmk872uP+ok=\n"
            java.lang.String r2 = "toLowerCase(...)"
            defpackage.ip.n(r2, r5)
            r0 = r16
            java.lang.Object[] r2 = r0.args
            r4 = 1
            r2 = r2[r4]
            boolean r6 = r2 instanceof android.content.ContentValues
            r4 = 48891(0xbefb, float:6.8511E-41)
        Lc2:
            r7 = 48908(0xbf0c, float:6.8535E-41)
            r4 = r4 ^ r7
            switch(r4) {
                case 22: goto Lca;
                case 53: goto L1afe;
                case 503: goto Lce;
                case 32495: goto Ld4;
                default: goto Lc9;
            }
        Lc9:
            goto Lc2
        Lca:
            r4 = 48953(0xbf39, float:6.8598E-41)
            goto Lc2
        Lce:
            if (r6 == 0) goto Lca
            r4 = 49635(0xc1e3, float:6.9553E-41)
            goto Lc2
        Ld4:
            android.content.ContentValues r2 = (android.content.ContentValues) r2
        Ld6:
            r3 = 49666(0xc202, float:6.9597E-41)
        Ld9:
            r4 = 49683(0xc213, float:6.9621E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto Le1;
                case 50: goto Le7;
                case 76: goto Leb;
                case 83: goto Lfa;
                default: goto Le0;
            }
        Le0:
            goto Ld9
        Le1:
            if (r2 != 0) goto Le7
            r3 = 49759(0xc25f, float:6.9727E-41)
            goto Ld9
        Le7:
            r3 = 49728(0xc240, float:6.9684E-41)
            goto Ld9
        Leb:
            r2 = 49790(0xc27e, float:6.977E-41)
        Lee:
            r3 = 49807(0xc28f, float:6.9794E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L10;
                case 241: goto Lf6;
                default: goto Lf5;
            }
        Lf5:
            goto Lee
        Lf6:
            r2 = 49821(0xc29d, float:6.9814E-41)
            goto Lee
        Lfa:
            gn r3 = defpackage.gn.a
            java.lang.String r4 = "T3aj0rnRN29uRJ4=\n"
            java.lang.String r6 = "CzTqvM20RQw=\n"
            java.lang.String r4 = "DBIntercept"
            iv r6 = new iv
            r7 = 1
            r0 = r16
            r6.<init>(r5, r2, r0, r7)
            r3.getClass()
            defpackage.gn.j(r4, r6)
            goto L10
        L114:
            java.lang.String r2 = "pA==\n"
            java.lang.String r3 = "1H27dKFryNY=\n"
            java.lang.String r2 = "p"
            r0 = r16
            defpackage.ip.o(r2, r0)
            java.lang.Object r3 = defpackage.uv.b
            r2 = 49914(0xc2fa, float:6.9944E-41)
        L126:
            r6 = 49931(0xc30b, float:6.9968E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 497: goto L12e;
                case 1711: goto L134;
                case 1736: goto L10;
                case 1769: goto L138;
                default: goto L12d;
            }
        L12d:
            goto L126
        L12e:
            if (r3 != 0) goto L134
            r2 = 50658(0xc5e2, float:7.0987E-41)
            goto L126
        L134:
            r2 = 50627(0xc5c3, float:7.0944E-41)
            goto L126
        L138:
            r0 = r16
            java.lang.Object[] r7 = r0.args
            java.lang.String r2 = "Cje67w==\n"
            java.lang.String r3 = "a0XdnDpvxVU=\n"
            java.lang.String r2 = "args"
            defpackage.ip.n(r2, r7)
            int r8 = r7.length
            r2 = 0
        L149:
            r3 = 50689(0xc601, float:7.103E-41)
        L14c:
            r6 = 50706(0xc612, float:7.1054E-41)
            r3 = r3 ^ r6
            switch(r3) {
                case 19: goto L154;
                case 45: goto L1ab;
                case 50: goto L15a;
                case 76: goto L15e;
                default: goto L153;
            }
        L153:
            goto L14c
        L154:
            if (r2 >= r8) goto L15a
            r3 = 50782(0xc65e, float:7.1161E-41)
            goto L14c
        L15a:
            r3 = 50751(0xc63f, float:7.1117E-41)
            goto L14c
        L15e:
            r3 = r7[r2]
            boolean r9 = r3 instanceof java.lang.String
            r6 = 50813(0xc67d, float:7.1204E-41)
        L165:
            r10 = 50830(0xc68e, float:7.1228E-41)
            r6 = r6 ^ r10
            switch(r6) {
                case 18: goto L16d;
                case 53: goto L19a;
                case 243: goto L171;
                case 4075: goto L177;
                default: goto L16c;
            }
        L16c:
            goto L165
        L16d:
            r6 = 50875(0xc6bb, float:7.1291E-41)
            goto L165
        L171:
            if (r9 == 0) goto L16d
            r6 = 51557(0xc965, float:7.2247E-41)
            goto L165
        L177:
            r2 = 51588(0xc984, float:7.229E-41)
        L17a:
            r6 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 17: goto L182;
                case 54: goto L186;
                default: goto L181;
            }
        L181:
            goto L17a
        L182:
            r2 = 51619(0xc9a3, float:7.2334E-41)
            goto L17a
        L186:
            r2 = r3
        L187:
            boolean r6 = r2 instanceof java.lang.String
            r3 = 51836(0xca7c, float:7.2638E-41)
        L18c:
            r7 = 51853(0xca8d, float:7.2662E-41)
            r3 = r3 ^ r7
            switch(r3) {
                case 241: goto L194;
                case 1963: goto L1ad;
                case 1992: goto L1afb;
                case 2025: goto L1b1;
                default: goto L193;
            }
        L193:
            goto L18c
        L194:
            if (r6 == 0) goto L1ad
            r3 = 52580(0xcd64, float:7.368E-41)
            goto L18c
        L19a:
            int r2 = r2 + 1
            r3 = 51712(0xca00, float:7.2464E-41)
        L19f:
            r6 = 51729(0xca11, float:7.2488E-41)
            r3 = r3 ^ r6
            switch(r3) {
                case 14: goto L149;
                case 15: goto L1a6;
                case 16: goto L1a6;
                case 17: goto L1a7;
                default: goto L1a6;
            }
        L1a6:
            goto L19f
        L1a7:
            r3 = 51743(0xca1f, float:7.2507E-41)
            goto L19f
        L1ab:
            r2 = 0
            goto L187
        L1ad:
            r3 = 52549(0xcd45, float:7.3637E-41)
            goto L18c
        L1b1:
            java.lang.String r2 = (java.lang.String) r2
        L1b3:
            r3 = 52611(0xcd83, float:7.3724E-41)
        L1b6:
            r4 = 52628(0xcd94, float:7.3748E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 23: goto L1be;
                case 54: goto L1c4;
                case 85: goto L1d7;
                case 116: goto L1c8;
                default: goto L1bd;
            }
        L1bd:
            goto L1b6
        L1be:
            if (r2 != 0) goto L1c4
            r3 = 52704(0xcde0, float:7.3854E-41)
            goto L1b6
        L1c4:
            r3 = 52673(0xcdc1, float:7.381E-41)
            goto L1b6
        L1c8:
            r2 = 52735(0xcdff, float:7.3897E-41)
        L1cb:
            r3 = 52752(0xce10, float:7.3921E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L10;
                case 1007: goto L1d3;
                default: goto L1d2;
            }
        L1d2:
            goto L1cb
        L1d3:
            r2 = 52766(0xce1e, float:7.3941E-41)
            goto L1cb
        L1d7:
            java.lang.String r3 = "TK6aBX1B+g==\n"
            java.lang.String r4 = "Icvpdhwmn5w=\n"
            java.lang.String r3 = "message"
            r4 = 1
            boolean r4 = defpackage.b50.B(r2, r3, r4)
            r3 = 53510(0xd106, float:7.4983E-41)
        L1e7:
            r6 = 53527(0xd117, float:7.5007E-41)
            r3 = r3 ^ r6
            switch(r3) {
                case 17: goto L1ef;
                case 50: goto L1f5;
                case 83: goto L23d;
                case 116: goto L1f9;
                default: goto L1ee;
            }
        L1ee:
            goto L1e7
        L1ef:
            if (r4 != 0) goto L1f5
            r3 = 53603(0xd163, float:7.5114E-41)
            goto L1e7
        L1f5:
            r3 = 53572(0xd144, float:7.507E-41)
            goto L1e7
        L1f9:
            java.lang.String r3 = "FF8ayxxCoB8sQyfNAWI=\n"
            java.lang.String r4 = "QjBzqHkW0n4=\n"
            java.lang.String r3 = "VoiceTransText"
            r4 = 1
            boolean r4 = defpackage.b50.B(r2, r3, r4)
            r3 = 53634(0xd182, float:7.5157E-41)
        L209:
            r6 = 53651(0xd193, float:7.5181E-41)
            r3 = r3 ^ r6
            switch(r3) {
                case 17: goto L211;
                case 50: goto L217;
                case 76: goto L21b;
                case 83: goto L23d;
                default: goto L210;
            }
        L210:
            goto L209
        L211:
            if (r4 != 0) goto L217
            r3 = 53727(0xd1df, float:7.5288E-41)
            goto L209
        L217:
            r3 = 53696(0xd1c0, float:7.5244E-41)
            goto L209
        L21b:
            java.lang.String r3 = "6PoFvNVDa0c=\n"
            java.lang.String r4 = "mplq0qEiCDM=\n"
            java.lang.String r3 = "rcontact"
            r4 = 1
            boolean r3 = defpackage.b50.B(r2, r3, r4)
            r2 = 53758(0xd1fe, float:7.5331E-41)
        L22b:
            r4 = 53775(0xd20f, float:7.5355E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 1009: goto L233;
                case 1703: goto L239;
                case 1736: goto L10;
                case 1769: goto L23d;
                default: goto L232;
            }
        L232:
            goto L22b
        L233:
            if (r3 == 0) goto L239
            r2 = 54502(0xd4e6, float:7.6374E-41)
            goto L22b
        L239:
            r2 = 54471(0xd4c7, float:7.633E-41)
            goto L22b
        L23d:
            android.os.Handler r2 = defpackage.uv.a
            r0 = r16
            java.lang.Object r2 = r0.thisObject
            defpackage.uv.b = r2
            java.lang.String r2 = "LmFUrtdbI5Ih\n"
            java.lang.String r3 = "YwQn3bY8RtY=\n"
            java.lang.String r2 = "MessageDB"
            java.lang.String r3 = "AgP5D9BaJctqAJqnnDo7mcDIP2t08lCAfnvCpNluOctnGZmLsTshrgYw/cadSlyMcb80QFm5lcpb\nOpWovDQhkAYf28e1b1auYg==\n"
            java.lang.String r4 = "4J98LzbStS4=\n"
            java.lang.String r3 = "\u2705 \u6210\u529f\u622a\u83b7 WCDB \u5b9e\u4f8b\uff0c\u51c6\u5907\u9500\u6bc1\u9ad8\u9891 Hook \u4ee5\u91ca\u653e\u6027\u80fd\u3002"
            java.lang.String r4 = "xwGO\n"
            java.lang.String r6 = "s2Dpd1+FjZU=\n"
            java.lang.String r7 = "53vj\n"
            java.lang.String r8 = "igiEy7e+YPk=\n"
            java.lang.String r2 = defpackage.z30.k(r4, r6, r2, r7, r8)
            defpackage.ip.o(r2, r3)
            java.util.ArrayList r4 = defpackage.jv.a
            monitor-enter(r4)
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L29d
            r3 = r5
        L26c:
            r2 = 54533(0xd505, float:7.6417E-41)
        L26f:
            r5 = 54550(0xd516, float:7.6441E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 19: goto L277;
                case 50: goto L27d;
                case 85: goto L2ad;
                case 116: goto L281;
                default: goto L276;
            }     // Catch: java.lang.Throwable -> L29d
        L276:
            goto L26f
        L277:
            if (r3 >= r6) goto L27d
            r2 = 54626(0xd562, float:7.6547E-41)
            goto L26f
        L27d:
            r2 = 54595(0xd543, float:7.6504E-41)
            goto L26f
        L281:
            java.lang.Object r2 = r4.get(r3)     // Catch: java.lang.Throwable -> L29d
            int r3 = 0 - r3
            int r3 = 1 - r3
            de.robv.android.xposed.XC_MethodHook$Unhook r2 = (de.robv.android.xposed.XC_MethodHook.Unhook) r2     // Catch: java.lang.Throwable -> L29d
            r2.unhook()     // Catch: java.lang.Throwable -> L1ac9
            r2 = 54657(0xd581, float:7.6591E-41)
        L291:
            r5 = 54674(0xd592, float:7.6615E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 19: goto L299;
                case 50: goto L26c;
                default: goto L298;
            }
        L298:
            goto L291
        L299:
            r2 = 54688(0xd5a0, float:7.6634E-41)
            goto L291
        L29d:
            r2 = move-exception
            r3 = 55432(0xd888, float:7.7677E-41)
        L2a1:
            r5 = 55449(0xd899, float:7.77E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 17: goto L2a9;
                case 62: goto L2c2;
                default: goto L2a8;
            }
        L2a8:
            goto L2a1
        L2a9:
            r3 = 55463(0xd8a7, float:7.772E-41)
            goto L2a1
        L2ad:
            java.util.ArrayList r2 = defpackage.jv.a     // Catch: java.lang.Throwable -> L29d
            r2.clear()     // Catch: java.lang.Throwable -> L29d
            monitor-exit(r4)
            r2 = 55556(0xd904, float:7.785E-41)
        L2b6:
            r3 = 55573(0xd915, float:7.7874E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L2be;
                case 54: goto L10;
                default: goto L2bd;
            }
        L2bd:
            goto L2b6
        L2be:
            r2 = 55587(0xd923, float:7.7894E-41)
            goto L2b6
        L2c2:
            monitor-exit(r4)
            throw r2
        L2c4:
            java.lang.String r2 = "XQ==\n"
            java.lang.String r3 = "Le/uiacavWg=\n"
            java.lang.String r2 = "p"
            r0 = r16
            defpackage.ip.o(r2, r0)
            r0 = r16
            java.lang.Object[] r2 = r0.args
            r3 = 0
            r2 = r2[r3]
            boolean r4 = r2 instanceof java.lang.String
            r3 = 55680(0xd980, float:7.8024E-41)
        L2dd:
            r5 = 55697(0xd991, float:7.8048E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 17: goto L2e5;
                case 1467: goto L2eb;
                case 1496: goto L300;
                case 1529: goto L2ef;
                default: goto L2e4;
            }
        L2e4:
            goto L2dd
        L2e5:
            if (r4 == 0) goto L2eb
            r3 = 56424(0xdc68, float:7.9067E-41)
            goto L2dd
        L2eb:
            r3 = 56393(0xdc49, float:7.9023E-41)
            goto L2dd
        L2ef:
            java.lang.String r2 = (java.lang.String) r2
            r3 = 56455(0xdc87, float:7.911E-41)
        L2f4:
            r4 = 56472(0xdc98, float:7.9134E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 31: goto L2fc;
                case 62: goto L301;
                default: goto L2fb;
            }
        L2fb:
            goto L2f4
        L2fc:
            r3 = 56486(0xdca6, float:7.9154E-41)
            goto L2f4
        L300:
            r2 = 0
        L301:
            r3 = 56579(0xdd03, float:7.9284E-41)
        L304:
            r4 = 56596(0xdd14, float:7.9308E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 23: goto L30c;
                case 54: goto L312;
                case 85: goto L10;
                case 1564036: goto L316;
                default: goto L30b;
            }
        L30b:
            goto L304
        L30c:
            if (r2 == 0) goto L312
            r3 = 1507472(0x170090, float:2.112418E-39)
            goto L304
        L312:
            r3 = 56641(0xdd41, float:7.9371E-41)
            goto L304
        L316:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r4 = "NiYCgw==\n"
            java.lang.String r5 = "ZGlN1/G6Slo=\n"
            java.lang.String r4 = "ROOT"
            defpackage.ip.n(r4, r3)
            java.lang.String r4 = r2.toLowerCase(r3)
            java.lang.String r2 = "Q3S6OjmZfK1WaJN9YNIgxw==\n"
            java.lang.String r3 = "Nxv2VU78Du4=\n"
            java.lang.String r2 = "toLowerCase(...)"
            defpackage.ip.n(r2, r4)
            r0 = r16
            java.lang.Object[] r2 = r0.args
            r3 = 2
            r2 = r2[r3]
            boolean r5 = r2 instanceof android.content.ContentValues
            r3 = 1507503(0x1700af, float:2.112462E-39)
        L33e:
            r7 = 1507520(0x1700c0, float:2.112485E-39)
            r3 = r3 ^ r7
            switch(r3) {
                case 14: goto L346;
                case 45: goto L1af8;
                case 111: goto L34a;
                case 460: goto L350;
                default: goto L345;
            }
        L345:
            goto L33e
        L346:
            r3 = 1507565(0x1700ed, float:2.112549E-39)
            goto L33e
        L34a:
            if (r5 == 0) goto L346
            r3 = 1507596(0x17010c, float:2.112592E-39)
            goto L33e
        L350:
            android.content.ContentValues r2 = (android.content.ContentValues) r2
        L352:
            r3 = 1507627(0x17012b, float:2.112635E-39)
        L355:
            r5 = 1507644(0x17013c, float:2.112659E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 23: goto L35d;
                case 85: goto L376;
                case 118: goto L363;
                case 180: goto L367;
                default: goto L35c;
            }
        L35c:
            goto L355
        L35d:
            if (r2 != 0) goto L363
            r3 = 1507720(0x170188, float:2.112766E-39)
            goto L355
        L363:
            r3 = 1507689(0x170169, float:2.112722E-39)
            goto L355
        L367:
            r2 = 1507751(0x1701a7, float:2.112809E-39)
        L36a:
            r3 = 1507768(0x1701b8, float:2.112833E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 31: goto L372;
                case 1513: goto L10;
                default: goto L371;
            }
        L371:
            goto L36a
        L372:
            r2 = 1508433(0x170451, float:2.113765E-39)
            goto L36a
        L376:
            java.lang.String r3 = "a0bauEywnA==\n"
            java.lang.String r5 = "BiOpyy3X+Uw=\n"
            java.lang.String r3 = "message"
            boolean r5 = r4.equals(r3)
            r3 = 1508526(0x1704ae, float:2.113895E-39)
        L385:
            r6 = 1508543(0x1704bf, float:2.113919E-39)
            r3 = r3 ^ r6
            switch(r3) {
                case 17: goto L38d;
                case 83: goto L3b8;
                case 114: goto L393;
                case 436: goto L397;
                default: goto L38c;
            }
        L38c:
            goto L385
        L38d:
            if (r5 != 0) goto L393
            r3 = 1508619(0x17050b, float:2.114025E-39)
            goto L385
        L393:
            r3 = 1508588(0x1704ec, float:2.113982E-39)
            goto L385
        L397:
            java.lang.String r3 = "0Fkatec/vhg=\n"
            java.lang.String r5 = "ojp125Ne3Ww=\n"
            java.lang.String r3 = "rcontact"
            boolean r5 = r4.equals(r3)
            r3 = 1508650(0x17052a, float:2.114069E-39)
        L3a6:
            r6 = 1508667(0x17053b, float:2.114093E-39)
            r3 = r3 ^ r6
            switch(r3) {
                case 17: goto L3ae;
                case 83: goto L3d5;
                case 114: goto L3b4;
                case 3369: goto L3b8;
                default: goto L3ad;
            }
        L3ad:
            goto L3a6
        L3ae:
            if (r5 == 0) goto L3b4
            r3 = 1509394(0x170812, float:2.115111E-39)
            goto L3a6
        L3b4:
            r3 = 1508712(0x170568, float:2.114156E-39)
            goto L3a6
        L3b8:
            java.lang.Object r5 = defpackage.uv.b
            r3 = 1509425(0x170831, float:2.115155E-39)
        L3bd:
            r6 = 1509442(0x170842, float:2.115179E-39)
            r3 = r3 ^ r6
            switch(r3) {
                case 18: goto L3c5;
                case 45: goto L3d5;
                case 115: goto L3c9;
                case 204: goto L3cf;
                default: goto L3c4;
            }
        L3c4:
            goto L3bd
        L3c5:
            r3 = 1509487(0x17086f, float:2.115242E-39)
            goto L3bd
        L3c9:
            if (r5 != 0) goto L3c5
            r3 = 1509518(0x17088e, float:2.115285E-39)
            goto L3bd
        L3cf:
            r0 = r16
            java.lang.Object r3 = r0.thisObject
            defpackage.uv.b = r3
        L3d5:
            gn r3 = defpackage.gn.a
            java.lang.String r5 = "vQSwEQSWjVWcNo0=\n"
            java.lang.String r6 = "+Ub5f3Dz/zY=\n"
            java.lang.String r5 = "DBIntercept"
            iv r6 = new iv
            r7 = 0
            r0 = r16
            r6.<init>(r4, r2, r0, r7)
            r3.getClass()
            defpackage.gn.j(r5, r6)
            goto L10
        L3ef:
            java.lang.String r2 = "1Q==\n"
            java.lang.String r3 = "pavEZsLgCUA=\n"
            java.lang.String r2 = "p"
            r0 = r16
            defpackage.ip.o(r2, r0)
            r0 = r16
            java.lang.Object[] r2 = r0.args
            r3 = 0
            r2 = r2[r3]
            boolean r4 = r2 instanceof java.lang.String
            r3 = 1509549(0x1708ad, float:2.115329E-39)
        L408:
            r5 = 1509566(0x1708be, float:2.115353E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 19: goto L410;
                case 85: goto L1af5;
                case 114: goto L416;
                case 436: goto L41a;
                default: goto L40f;
            }
        L40f:
            goto L408
        L410:
            if (r4 == 0) goto L416
            r3 = 1509642(0x17090a, float:2.115459E-39)
            goto L408
        L416:
            r3 = 1509611(0x1708eb, float:2.115416E-39)
            goto L408
        L41a:
            java.lang.String r2 = (java.lang.String) r2
        L41c:
            r3 = 1509673(0x170929, float:2.115502E-39)
        L41f:
            r4 = 1509690(0x17093a, float:2.115526E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 19: goto L427;
                case 712: goto L10;
                case 745: goto L42d;
                case 1323: goto L431;
                default: goto L426;
            }
        L426:
            goto L41f
        L427:
            if (r2 == 0) goto L42d
            r3 = 1510417(0x170c11, float:2.116545E-39)
            goto L41f
        L42d:
            r3 = 1510386(0x170bf2, float:2.116502E-39)
            goto L41f
        L431:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r4 = "99vgYw==\n"
            java.lang.String r5 = "pZSvN0YnLEY=\n"
            java.lang.String r4 = "ROOT"
            defpackage.ip.n(r4, r3)
            java.lang.String r2 = r2.toLowerCase(r3)
            java.lang.String r3 = "vKX/GzGkhySpudZcaO/bTg==\n"
            java.lang.String r4 = "yMqzdEbB9Wc=\n"
            java.lang.String r3 = "toLowerCase(...)"
            defpackage.ip.n(r3, r2)
            gn r3 = defpackage.gn.a
            java.lang.String r4 = "GC4Ahx4AKAo5HD0=\n"
            java.lang.String r5 = "XGxJ6WplWmk=\n"
            java.lang.String r4 = "DBIntercept"
            hv r5 = new hv
            r6 = 0
            r0 = r16
            r5.<init>(r2, r6, r0)
            r3.getClass()
            defpackage.gn.j(r4, r5)
            goto L10
        L467:
            java.lang.String r2 = "U7HX/iQ=\n"
            java.lang.String r3 = "I9Cln0mG8K0=\n"
            java.lang.String r2 = "param"
            r0 = r16
            defpackage.ip.o(r2, r0)
            r0 = r16
            java.lang.Object r2 = r0.thisObject
            boolean r4 = r2 instanceof android.view.ViewGroup
            r3 = 1510448(0x170c30, float:2.116588E-39)
        L47d:
            r5 = 1510465(0x170c41, float:2.116612E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 14: goto L485;
                case 47: goto L4a0;
                case 113: goto L489;
                case 204: goto L48f;
                default: goto L484;
            }
        L484:
            goto L47d
        L485:
            r3 = 1510510(0x170c6e, float:2.116675E-39)
            goto L47d
        L489:
            if (r4 == 0) goto L485
            r3 = 1510541(0x170c8d, float:2.116719E-39)
            goto L47d
        L48f:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 1510572(0x170cac, float:2.116762E-39)
        L494:
            r4 = 1510589(0x170cbd, float:2.116786E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto L49c;
                case 118: goto L4a1;
                default: goto L49b;
            }
        L49b:
            goto L494
        L49c:
            r3 = 1510603(0x170ccb, float:2.116806E-39)
            goto L494
        L4a0:
            r2 = 0
        L4a1:
            r3 = 1511347(0x170fb3, float:2.117848E-39)
        L4a4:
            r4 = 1511364(0x170fc4, float:2.117872E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 22: goto L4ac;
                case 53: goto L4c5;
                case 119: goto L4b0;
                case 8148: goto L4b6;
                default: goto L4ab;
            }
        L4ab:
            goto L4a4
        L4ac:
            r3 = 1511409(0x170ff1, float:2.117935E-39)
            goto L4a4
        L4b0:
            if (r2 != 0) goto L4ac
            r3 = 1511440(0x171010, float:2.117979E-39)
            goto L4a4
        L4b6:
            r2 = 1511471(0x17102f, float:2.118022E-39)
        L4b9:
            r3 = 1511488(0x171040, float:2.118046E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L10;
                case 111: goto L4c1;
                default: goto L4c0;
            }
        L4c0:
            goto L4b9
        L4c1:
            r2 = 1511502(0x17104e, float:2.118065E-39)
            goto L4b9
        L4c5:
            r3 = 2114322432(0x7e060000, float:4.452914E37)
            java.lang.Object r3 = r2.getTag(r3)
            boolean r5 = r3 instanceof defpackage.e9
            r4 = 1511595(0x1710ab, float:2.118196E-39)
        L4d0:
            r6 = 1511612(0x1710bc, float:2.11822E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 23: goto L4d8;
                case 815: goto L4e2;
                case 968: goto L504;
                case 1001: goto L4de;
                default: goto L4d7;
            }
        L4d7:
            goto L4d0
        L4d8:
            if (r5 == 0) goto L4de
            r4 = 1512339(0x171393, float:2.119238E-39)
            goto L4d0
        L4de:
            r4 = 1512308(0x171374, float:2.119195E-39)
            goto L4d0
        L4e2:
            e9 r3 = (defpackage.e9) r3
            r4 = 1512370(0x1713b2, float:2.119282E-39)
        L4e7:
            r5 = 1512387(0x1713c3, float:2.119306E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 18: goto L4ef;
                case 113: goto L500;
                default: goto L4ee;
            }
        L4ee:
            goto L4e7
        L4ef:
            r4 = 1512494(0x17142e, float:2.119456E-39)
        L4f2:
            r5 = 1512511(0x17143f, float:2.11948E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 17: goto L4fa;
                case 83: goto L519;
                case 114: goto L506;
                case 809: goto L50a;
                default: goto L4f9;
            }
        L4f9:
            goto L4f2
        L4fa:
            if (r3 != 0) goto L506
            r4 = 1513238(0x171716, float:2.120498E-39)
            goto L4f2
        L500:
            r4 = 1512401(0x1713d1, float:2.119325E-39)
            goto L4e7
        L504:
            r3 = 0
            goto L4ef
        L506:
            r4 = 1512556(0x17146c, float:2.119542E-39)
            goto L4f2
        L50a:
            r2 = 1513269(0x171735, float:2.120542E-39)
        L50d:
            r3 = 1513286(0x171746, float:2.120565E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L10;
                case 115: goto L515;
                default: goto L514;
            }
        L514:
            goto L50d
        L515:
            r2 = 1513300(0x171754, float:2.120585E-39)
            goto L50d
        L519:
            f9 r6 = r3.h
            r4 = 1513393(0x1717b1, float:2.120715E-39)
        L51e:
            r5 = 1513410(0x1717c2, float:2.120739E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 18: goto L526;
                case 45: goto L53f;
                case 115: goto L52a;
                case 4044: goto L530;
                default: goto L525;
            }
        L525:
            goto L51e
        L526:
            r4 = 1513455(0x1717ef, float:2.120802E-39)
            goto L51e
        L52a:
            if (r6 != 0) goto L526
            r4 = 1513486(0x17180e, float:2.120846E-39)
            goto L51e
        L530:
            r2 = 1513517(0x17182d, float:2.120889E-39)
        L533:
            r3 = 1513534(0x17183e, float:2.120913E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L53b;
                case 745: goto L10;
                default: goto L53a;
            }
        L53a:
            goto L533
        L53b:
            r2 = 1514199(0x171ad7, float:2.121845E-39)
            goto L533
        L53f:
            r0 = r16
            java.lang.Object[] r4 = r0.args
            r5 = 0
            r5 = r4[r5]
            java.lang.String r4 = "OQsmwWuKTJE5ET6NKYwNnDYNPo0/hg2ROBBnwz6FQd8jBzrIa4hDmyURI8lln0SaIFAHwj+AQpES\nCC/DPw==\n"
            java.lang.String r7 = "V35KrUvpLf8=\n"
            java.lang.String r4 = "null cannot be cast to non-null type android.view.MotionEvent"
            defpackage.ip.m(r4, r5)
            android.view.MotionEvent r5 = (android.view.MotionEvent) r5
            g9 r4 = r3.g
            int r9 = r5.getActionMasked()
            r7 = 1514292(0x171b34, float:2.121975E-39)
        L55c:
            r10 = 1514309(0x171b45, float:2.121999E-39)
            r7 = r7 ^ r10
            switch(r7) {
                case 22: goto L564;
                case 55: goto L9da;
                case 113: goto L568;
                case 212: goto L56e;
                default: goto L563;
            }
        L563:
            goto L55c
        L564:
            r7 = 1514354(0x171b72, float:2.122062E-39)
            goto L55c
        L568:
            if (r9 == 0) goto L564
            r7 = 1514385(0x171b91, float:2.122105E-39)
            goto L55c
        L56e:
            r7 = 1514416(0x171bb0, float:2.122149E-39)
        L571:
            r8 = 1514433(0x171bc1, float:2.122173E-39)
            r7 = r7 ^ r8
            switch(r7) {
                case 14: goto L579;
                case 47: goto L9c5;
                case 113: goto L57d;
                case 1369: goto L584;
                default: goto L578;
            }
        L578:
            goto L571
        L579:
            r7 = 1514478(0x171bee, float:2.122236E-39)
            goto L571
        L57d:
            r7 = 1
            if (r9 == r7) goto L579
            r7 = 1515160(0x171e98, float:2.123191E-39)
            goto L571
        L584:
            r7 = 1515191(0x171eb7, float:2.123235E-39)
        L587:
            r8 = 1515208(0x171ec8, float:2.123259E-39)
            r7 = r7 ^ r8
            switch(r7) {
                case 30: goto L58f;
                case 61: goto L5d4;
                case 127: goto L593;
                case 476: goto L59a;
                default: goto L58e;
            }
        L58e:
            goto L587
        L58f:
            r7 = 1515253(0x171ef5, float:2.123322E-39)
            goto L587
        L593:
            r7 = 2
            if (r9 == r7) goto L58f
            r7 = 1515284(0x171f14, float:2.123365E-39)
            goto L587
        L59a:
            r7 = 1515315(0x171f33, float:2.123409E-39)
        L59d:
            r8 = 1515332(0x171f44, float:2.123432E-39)
            r7 = r7 ^ r8
            switch(r7) {
                case 22: goto L5a5;
                case 53: goto L5bf;
                case 119: goto L5a9;
                case 212: goto L5b0;
                default: goto L5a4;
            }
        L5a4:
            goto L59d
        L5a5:
            r7 = 1515377(0x171f71, float:2.123495E-39)
            goto L59d
        L5a9:
            r7 = 3
            if (r9 == r7) goto L5a5
            r7 = 1515408(0x171f90, float:2.123539E-39)
            goto L59d
        L5b0:
            r2 = 1515439(0x171faf, float:2.123582E-39)
        L5b3:
            r3 = 1515456(0x171fc0, float:2.123606E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 111: goto L5bb;
                case 15769: goto L10;
                default: goto L5ba;
            }
        L5ba:
            goto L5b3
        L5bb:
            r2 = 1516121(0x172259, float:2.124538E-39)
            goto L5b3
        L5bf:
            r8 = 1
            r7 = r16
            defpackage.vh.b(r2, r3, r4, r5, r6, r7, r8)
            r2 = 1516214(0x1722b6, float:2.124668E-39)
        L5c8:
            r3 = 1516231(0x1722c7, float:2.124692E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L10;
                case 113: goto L5d0;
                default: goto L5cf;
            }
        L5cf:
            goto L5c8
        L5d0:
            r2 = 1516245(0x1722d5, float:2.124712E-39)
            goto L5c8
        L5d4:
            int r7 = r5.getPointerCount()
            r6 = 1516338(0x172332, float:2.124842E-39)
        L5db:
            r8 = 1516355(0x172343, float:2.124866E-39)
            r6 = r6 ^ r8
            switch(r6) {
                case 18: goto L5e3;
                case 51: goto L5fd;
                case 113: goto L5e7;
                case 22444: goto L5ee;
                default: goto L5e2;
            }
        L5e2:
            goto L5db
        L5e3:
            r6 = 1516400(0x172370, float:2.124929E-39)
            goto L5db
        L5e7:
            r6 = 1
            if (r7 <= r6) goto L5e3
            r6 = 1537263(0x1774ef, float:2.154164E-39)
            goto L5db
        L5ee:
            r2 = 1537294(0x17750e, float:2.154208E-39)
        L5f1:
            r3 = 1537311(0x17751f, float:2.154232E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L5f9;
                case 50: goto L10;
                default: goto L5f8;
            }
        L5f8:
            goto L5f1
        L5f9:
            r2 = 1537325(0x17752d, float:2.154251E-39)
            goto L5f1
        L5fd:
            float r6 = r5.getRawX()
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 + r7
            float r7 = r4.a
            float r6 = r6 - r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r14 = r6 - r7
            float r8 = r5.getRawY()
            float r9 = r4.b
            r6 = 2114191365(0x7e040005, float:4.386455E37)
            java.lang.Object r6 = r2.getTag(r6)
            boolean r10 = r6 instanceof android.view.VelocityTracker
            r7 = 1537418(0x17758a, float:2.154381E-39)
        L61d:
            r11 = 1537435(0x17759b, float:2.154405E-39)
            r7 = r7 ^ r11
            switch(r7) {
                case 17: goto L625;
                case 50: goto L62b;
                case 83: goto L640;
                case 124: goto L62f;
                default: goto L624;
            }
        L624:
            goto L61d
        L625:
            if (r10 == 0) goto L62b
            r7 = 1537511(0x1775e7, float:2.154512E-39)
            goto L61d
        L62b:
            r7 = 1537480(0x1775c8, float:2.154468E-39)
            goto L61d
        L62f:
            android.view.VelocityTracker r6 = (android.view.VelocityTracker) r6
            r7 = 1537542(0x177606, float:2.154555E-39)
        L634:
            r10 = 1537559(0x177617, float:2.154579E-39)
            r7 = r7 ^ r10
            switch(r7) {
                case 17: goto L63c;
                case 3751: goto L641;
                default: goto L63b;
            }
        L63b:
            goto L634
        L63c:
            r7 = 1538224(0x1778b0, float:2.155511E-39)
            goto L634
        L640:
            r6 = 0
        L641:
            r7 = 1538317(0x17790d, float:2.155641E-39)
        L644:
            r10 = 1538334(0x17791e, float:2.155665E-39)
            r7 = r7 ^ r10
            switch(r7) {
                case 19: goto L64c;
                case 50: goto L652;
                case 85: goto L659;
                case 116: goto L656;
                default: goto L64b;
            }
        L64b:
            goto L644
        L64c:
            if (r6 == 0) goto L652
            r7 = 1538410(0x17796a, float:2.155772E-39)
            goto L644
        L652:
            r7 = 1538379(0x17794b, float:2.155728E-39)
            goto L644
        L656:
            r6.addMovement(r5)
        L659:
            boolean r7 = r4.c
            r6 = 1538441(0x177989, float:2.155815E-39)
        L65e:
            r10 = 1538458(0x17799a, float:2.155839E-39)
            r6 = r6 ^ r10
            switch(r6) {
                case 19: goto L666;
                case 50: goto L66c;
                case 93: goto L73b;
                case 1515: goto L670;
                default: goto L665;
            }
        L665:
            goto L65e
        L666:
            if (r7 != 0) goto L66c
            r6 = 1539185(0x177c71, float:2.156858E-39)
            goto L65e
        L66c:
            r6 = 1538503(0x1779c7, float:2.155902E-39)
            goto L65e
        L670:
            float r7 = java.lang.Math.abs(r14)
            float r10 = defpackage.vh.e
            r6 = 1539216(0x177c90, float:2.156901E-39)
        L679:
            r11 = 1539233(0x177ca1, float:2.156925E-39)
            r6 = r6 ^ r11
            switch(r6) {
                case 14: goto L681;
                case 49: goto L685;
                case 76: goto L68d;
                case 111: goto L73b;
                default: goto L680;
            }
        L680:
            goto L679
        L681:
            r6 = 1539278(0x177cce, float:2.156988E-39)
            goto L679
        L685:
            int r6 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r6 <= 0) goto L681
            r6 = 1539309(0x177ced, float:2.157031E-39)
            goto L679
        L68d:
            float r7 = java.lang.Math.abs(r14)
            r6 = 1106247680(0x41f00000, float:30.0)
            float r6 = r6 + r8
            float r6 = r6 - r9
            r8 = 1106247680(0x41f00000, float:30.0)
            float r6 = r6 - r8
            float r8 = java.lang.Math.abs(r6)
            r6 = 1539340(0x177d0c, float:2.157075E-39)
        L69f:
            r9 = 1539357(0x177d1d, float:2.157099E-39)
            r6 = r6 ^ r9
            switch(r6) {
                case 17: goto L6a7;
                case 54: goto L6b2;
                case 87: goto L73b;
                case 116: goto L6b6;
                default: goto L6a6;
            }
        L6a6:
            goto L69f
        L6a7:
            r6 = 1075838976(0x40200000, float:2.5)
            float r6 = r6 * r8
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 <= 0) goto L6b2
            r6 = 1539433(0x177d69, float:2.157205E-39)
            goto L69f
        L6b2:
            r6 = 1539402(0x177d4a, float:2.157162E-39)
            goto L69f
        L6b6:
            r6 = 1
            r4.c = r6
            r6 = 2
            r7 = 0
            r2.setLayerType(r6, r7)
            android.view.ViewParent r7 = r2.getParent()
            r6 = 1539464(0x177d88, float:2.157249E-39)
        L6c5:
            r8 = 1539481(0x177d99, float:2.157272E-39)
            r6 = r6 ^ r8
            switch(r6) {
                case 17: goto L6cd;
                case 64939: goto L6d3;
                case 64968: goto L6db;
                case 65001: goto L6d7;
                default: goto L6cc;
            }
        L6cc:
            goto L6c5
        L6cd:
            if (r7 == 0) goto L6d3
            r6 = 1540208(0x178070, float:2.158291E-39)
            goto L6c5
        L6d3:
            r6 = 1540177(0x178051, float:2.158248E-39)
            goto L6c5
        L6d7:
            r6 = 1
            r7.requestDisallowInterceptTouchEvent(r6)
        L6db:
            long r6 = r5.getDownTime()
            long r8 = r5.getEventTime()
            r10 = 3
            float r11 = r5.getX()
            float r12 = r5.getY()
            int r13 = r5.getMetaState()
            android.view.MotionEvent r6 = android.view.MotionEvent.obtain(r6, r8, r10, r11, r12, r13)
            r0 = r16
            java.lang.reflect.Member r5 = r0.method     // Catch: java.lang.Throwable -> L726
            r0 = r16
            java.lang.Object r7 = r0.thisObject     // Catch: java.lang.Throwable -> L726
            r8 = 1
            android.view.MotionEvent[] r8 = new android.view.MotionEvent[r8]     // Catch: java.lang.Throwable -> L726
            r9 = 0
            r8[r9] = r6     // Catch: java.lang.Throwable -> L726
            de.robv.android.xposed.XposedBridge.invokeOriginalMethod(r5, r7, r8)     // Catch: java.lang.Throwable -> L726
            r5 = 1540239(0x17808f, float:2.158335E-39)
        L708:
            r7 = 1540256(0x1780a0, float:2.158358E-39)
            r5 = r5 ^ r7
            switch(r5) {
                case 14: goto L710;
                case 47: goto L722;
                default: goto L70f;
            }
        L70f:
            goto L708
        L710:
            r6.recycle()
            r5 = 1540363(0x17810b, float:2.158508E-39)
        L716:
            r6 = 1540380(0x17811c, float:2.158532E-39)
            r5 = r5 ^ r6
            switch(r5) {
                case 23: goto L71e;
                case 54: goto L73b;
                default: goto L71d;
            }
        L71d:
            goto L716
        L71e:
            r5 = 1540394(0x17812a, float:2.158552E-39)
            goto L716
        L722:
            r5 = 1540270(0x1780ae, float:2.158378E-39)
            goto L708
        L726:
            r5 = move-exception
            java.lang.String r5 = "Nwje\n"
            java.lang.String r7 = "Q2m5jaPP2Zc=\n"
            java.lang.String r8 = "+Sfq4hOgGNHRLfLJJbMT+tsu3OA=\n"
            java.lang.String r9 = "vkKZlmbSfZk=\n"
            java.lang.String r8 = "GestureHook_CancelEv"
            java.lang.String r9 = "Fg==\n"
            java.lang.String r10 = "c8HJlSTQVfc=\n"
            defpackage.z30.o(r5, r7, r8, r9, r10)
            goto L710
        L73b:
            boolean r6 = r4.c
            r5 = 1541138(0x178412, float:2.159594E-39)
        L740:
            r7 = 1541155(0x178423, float:2.159618E-39)
            r5 = r5 ^ r7
            switch(r5) {
                case 18: goto L748;
                case 49: goto L74c;
                case 76: goto L752;
                case 115: goto L10;
                default: goto L747;
            }
        L747:
            goto L740
        L748:
            r5 = 1541200(0x178450, float:2.159681E-39)
            goto L740
        L74c:
            if (r6 == 0) goto L748
            r5 = 1541231(0x17846f, float:2.159725E-39)
            goto L740
        L752:
            float r5 = defpackage.vh.d
            r6 = 1184645120(0x469c4000, float:20000.0)
            float r5 = r5 * r6
            r2.setCameraDistance(r5)
            float r5 = java.lang.Math.abs(r14)
            float r6 = defpackage.vh.g
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            float r5 = r5 / r6
            r10 = 1061997773(0x3f4ccccd, float:0.8)
            float r5 = r5 * r10
            float r5 = r9 - r5
            float r5 = r8 - r5
            float r5 = r7 / r5
            float r7 = java.lang.Math.signum(r14)
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 1103626240(0x41c80000, float:25.0)
            float r8 = r8 - r9
            float r5 = r8 - r5
            r8 = 1103626240(0x41c80000, float:25.0)
            float r5 = r5 + r8
            float r5 = r5 * r6
            float r6 = r7 * r5
            float r5 = java.lang.Math.abs(r6)
            float r7 = defpackage.vh.g
            float r5 = r5 / r7
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = java.lang.Math.min(r5, r7)
            int r5 = defpackage.ac.n
            float r5 = (float) r5
            r8 = 1120403456(0x42c80000, float:100.0)
            float r8 = r5 / r8
            int r9 = defpackage.ac.m
            r5 = 1541262(0x17848e, float:2.159768E-39)
        L79b:
            r10 = 1541279(0x17849f, float:2.159792E-39)
            r5 = r5 ^ r10
            switch(r5) {
                case 17: goto L7a3;
                case 50: goto L7a9;
                case 83: goto L931;
                case 116: goto L7ad;
                default: goto L7a2;
            }
        L7a2:
            goto L79b
        L7a3:
            if (r9 == 0) goto L7a9
            r5 = 1541355(0x1784eb, float:2.159898E-39)
            goto L79b
        L7a9:
            r5 = 1541324(0x1784cc, float:2.159855E-39)
            goto L79b
        L7ad:
            r5 = 1541386(0x17850a, float:2.159942E-39)
        L7b0:
            r10 = 1541403(0x17851b, float:2.159966E-39)
            r5 = r5 ^ r10
            switch(r5) {
                case 17: goto L7b8;
                case 687: goto L7bf;
                case 712: goto L8f3;
                case 745: goto L7c3;
                default: goto L7b7;
            }
        L7b7:
            goto L7b0
        L7b8:
            r5 = 1
            if (r9 == r5) goto L7bf
            r5 = 1542130(0x1787f2, float:2.160984E-39)
            goto L7b0
        L7bf:
            r5 = 1542099(0x1787d3, float:2.160941E-39)
            goto L7b0
        L7c3:
            r5 = 1542161(0x178811, float:2.161028E-39)
        L7c6:
            r10 = 1542178(0x178822, float:2.161052E-39)
            r5 = r5 ^ r10
            switch(r5) {
                case 18: goto L7ce;
                case 51: goto L7d2;
                case 76: goto L7d9;
                case 109: goto L8ad;
                default: goto L7cd;
            }
        L7cd:
            goto L7c6
        L7ce:
            r5 = 1542223(0x17884f, float:2.161115E-39)
            goto L7c6
        L7d2:
            r5 = 2
            if (r9 == r5) goto L7ce
            r5 = 1542254(0x17886e, float:2.161158E-39)
            goto L7c6
        L7d9:
            r5 = 1542285(0x17888d, float:2.161202E-39)
        L7dc:
            r10 = 1542302(0x17889e, float:2.161225E-39)
            r5 = r5 ^ r10
            switch(r5) {
                case 19: goto L7e4;
                case 50: goto L7eb;
                case 85: goto L858;
                case 1003: goto L7ef;
                default: goto L7e3;
            }
        L7e3:
            goto L7dc
        L7e4:
            r5 = 3
            if (r9 == r5) goto L7eb
            r5 = 1543029(0x178b75, float:2.162244E-39)
            goto L7dc
        L7eb:
            r5 = 1542347(0x1788cb, float:2.161288E-39)
            goto L7dc
        L7ef:
            r3 = 1543060(0x178b94, float:2.162288E-39)
        L7f2:
            r5 = 1543077(0x178ba5, float:2.162311E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 22: goto L7fa;
                case 49: goto L7fe;
                case 84: goto L805;
                case 119: goto L827;
                default: goto L7f9;
            }
        L7f9:
            goto L7f2
        L7fa:
            r3 = 1543122(0x178bd2, float:2.162374E-39)
            goto L7f2
        L7fe:
            r3 = 4
            if (r9 == r3) goto L7fa
            r3 = 1543153(0x178bf1, float:2.162418E-39)
            goto L7f2
        L805:
            r3 = 1543184(0x178c10, float:2.162461E-39)
        L808:
            r5 = 1543201(0x178c21, float:2.162485E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 14: goto L810;
                case 49: goto L823;
                default: goto L80f;
            }
        L80f:
            goto L808
        L810:
            boolean r5 = r4.e
            r3 = 1545230(0x17940e, float:2.165328E-39)
        L815:
            r6 = 1545247(0x17941f, float:2.165352E-39)
            r3 = r3 ^ r6
            switch(r3) {
                case 17: goto L81d;
                case 679: goto L93a;
                case 712: goto L98d;
                case 745: goto L93f;
                default: goto L81c;
            }
        L81c:
            goto L815
        L81d:
            if (r5 != 0) goto L93a
            r3 = 1545974(0x1796f6, float:2.166371E-39)
            goto L815
        L823:
            r3 = 1543215(0x178c2f, float:2.162505E-39)
            goto L808
        L827:
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r3 = r3 * r6
            float r3 = r3 * r8
            r2.setTranslationX(r3)
            r3 = 1097859072(0x41700000, float:15.0)
            float r3 = r3 * r7
            float r3 = r3 * r8
            float r3 = -r3
            r2.setTranslationY(r3)
            r3 = 0
            r5 = 0
            r6 = 1036831949(0x3dcccccd, float:0.1)
            float r6 = r6 * r7
            float r6 = r6 * r8
            float r5 = r5 - r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r6
            float r3 = r3 - r5
            r2.setScaleX(r3)
            r2.setScaleY(r3)
            r3 = 1543308(0x178c8c, float:2.162635E-39)
        L84c:
            r5 = 1543325(0x178c9d, float:2.162659E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 17: goto L854;
                case 939: goto L810;
                default: goto L853;
            }
        L853:
            goto L84c
        L854:
            r3 = 1543990(0x178f36, float:2.163591E-39)
            goto L84c
        L858:
            r5 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r6
            float r5 = r5 * r8
            r2.setTranslationX(r5)
            r5 = 1112014848(0x42480000, float:50.0)
            float r5 = r5 * r7
            float r5 = r5 * r8
            float r5 = -r5
            r2.setTranslationY(r5)
            float r5 = r6 * r8
            r6 = 1114636288(0x42700000, float:60.0)
            float r5 = r5 / r6
            r2.setRotation(r5)
            android.view.View r5 = r3.e
            r3 = 1544083(0x178f93, float:2.163721E-39)
        L875:
            r6 = 1544100(0x178fa4, float:2.163745E-39)
            r3 = r3 ^ r6
            switch(r3) {
                case 22: goto L87d;
                case 55: goto L881;
                case 84: goto L887;
                case 117: goto L810;
                default: goto L87c;
            }
        L87c:
            goto L875
        L87d:
            r3 = 1544145(0x178fd1, float:2.163808E-39)
            goto L875
        L881:
            if (r5 == 0) goto L87d
            r3 = 1544176(0x178ff0, float:2.163851E-39)
            goto L875
        L887:
            r3 = 1041865114(0x3e19999a, float:0.15)
            r6 = 1065353216(0x3f800000, float:1.0)
            r9 = 1102053376(0x41b00000, float:22.0)
            float r6 = r6 + r9
            r9 = 1075838976(0x40200000, float:2.5)
            float r7 = r7 * r9
            float r7 = r7 * r8
            float r6 = r6 - r7
            r7 = 1102053376(0x41b00000, float:22.0)
            float r6 = r6 - r7
            float r3 = java.lang.Math.max(r3, r6)
            r5.setAlpha(r3)
            r3 = 1544207(0x17900f, float:2.163895E-39)
        L8a1:
            r5 = 1544224(0x179020, float:2.163919E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 14: goto L810;
                case 47: goto L8a9;
                default: goto L8a8;
            }
        L8a8:
            goto L8a1
        L8a9:
            r3 = 1544238(0x17902e, float:2.163938E-39)
            goto L8a1
        L8ad:
            r3 = 1062836634(0x3f59999a, float:0.85)
            float r3 = r3 * r6
            float r3 = r3 * r8
            r2.setTranslationX(r3)
            r3 = 1103626240(0x41c80000, float:25.0)
            float r3 = r3 * r7
            float r3 = r3 * r8
            float r3 = -r3
            r2.setRotationX(r3)
            float r3 = java.lang.Math.signum(r14)
            r5 = 1108082688(0x420c0000, float:35.0)
            float r5 = r5 * r7
            float r3 = r3 * r5
            float r3 = r3 * r8
            r2.setRotationY(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 - r5
            r5 = 1039516303(0x3df5c28f, float:0.12)
            float r5 = r5 * r7
            float r5 = r5 * r8
            float r3 = r3 - r5
            r5 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 + r5
            r2.setScaleX(r3)
            r2.setScaleY(r3)
            r3 = 1125515264(0x43160000, float:150.0)
            float r3 = r3 * r7
            float r3 = r3 * r8
            r2.setTranslationZ(r3)
            r3 = 1544982(0x179316, float:2.164981E-39)
        L8e7:
            r5 = 1544999(0x179327, float:2.165005E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 18: goto L810;
                case 49: goto L8ef;
                default: goto L8ee;
            }
        L8ee:
            goto L8e7
        L8ef:
            r3 = 1545013(0x179335, float:2.165024E-39)
            goto L8e7
        L8f3:
            r3 = 1066611507(0x3f933333, float:1.15)
            float r3 = r3 * r6
            float r3 = r3 * r8
            r2.setTranslationX(r3)
            float r3 = r6 * r8
            r5 = 1106247680(0x41f00000, float:30.0)
            float r3 = r3 / r5
            r2.setRotation(r3)
            r3 = 1051931443(0x3eb33333, float:0.35)
            float r3 = r3 * r7
            float r3 = r3 * r8
            r5 = 0
            float r3 = r3 + r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r5
            r5 = 0
            float r3 = r3 - r5
            r2.setScaleX(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 1102053376(0x41b00000, float:22.0)
            float r3 = r3 + r5
            r5 = 1048576000(0x3e800000, float:0.25)
            float r5 = r5 * r7
            float r5 = r5 * r8
            float r3 = r3 - r5
            r5 = 1102053376(0x41b00000, float:22.0)
            float r3 = r3 - r5
            r2.setScaleY(r3)
            r3 = 1545106(0x179392, float:2.165155E-39)
        L925:
            r5 = 1545123(0x1793a3, float:2.165178E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 18: goto L810;
                case 49: goto L92d;
                default: goto L92c;
            }
        L92c:
            goto L925
        L92d:
            r3 = 1545137(0x1793b1, float:2.165198E-39)
            goto L925
        L931:
            r3 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r6
            float r3 = r3 * r8
            r2.setTranslationX(r3)
            goto L810
        L93a:
            r3 = 1545943(0x1796d7, float:2.166328E-39)
            goto L815
        L93f:
            float r5 = java.lang.Math.abs(r14)
            float r6 = defpackage.vh.f
            r3 = 1546005(0x179715, float:2.166414E-39)
        L948:
            r7 = 1546022(0x179726, float:2.166438E-39)
            r3 = r3 ^ r7
            switch(r3) {
                case 18: goto L950;
                case 51: goto L954;
                case 84: goto L95c;
                case 117: goto L98d;
                default: goto L94f;
            }
        L94f:
            goto L948
        L950:
            r3 = 1546067(0x179753, float:2.166501E-39)
            goto L948
        L954:
            int r3 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r3 <= 0) goto L950
            r3 = 1546098(0x179772, float:2.166545E-39)
            goto L948
        L95c:
            r3 = 1
            r4.e = r3
            gn r3 = defpackage.gn.a
            r3.getClass()
            r3 = 4
            defpackage.gn.i(r2, r3)
            r2 = 1546129(0x179791, float:2.166588E-39)
        L96b:
            r3 = 1546146(0x1797a2, float:2.166612E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L973;
                case 51: goto L989;
                default: goto L972;
            }
        L972:
            goto L96b
        L973:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0 = r16
            r0.setResult(r2)
            r2 = 1567333(0x17ea65, float:2.196301E-39)
        L97d:
            r3 = 1567350(0x17ea76, float:2.196325E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L985;
                case 1913: goto L10;
                default: goto L984;
            }
        L984:
            goto L97d
        L985:
            r2 = 1568015(0x17ed0f, float:2.197257E-39)
            goto L97d
        L989:
            r2 = 1546160(0x1797b0, float:2.166632E-39)
            goto L96b
        L98d:
            boolean r3 = r4.e
            r2 = 1567085(0x17e96d, float:2.195954E-39)
        L992:
            r5 = 1567102(0x17e97e, float:2.195978E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 19: goto L99a;
                case 180: goto L9a4;
                case 213: goto L973;
                case 242: goto L9a0;
                default: goto L999;
            }
        L999:
            goto L992
        L99a:
            if (r3 == 0) goto L9a0
            r2 = 1567178(0x17e9ca, float:2.196084E-39)
            goto L992
        L9a0:
            r2 = 1567147(0x17e9ab, float:2.19604E-39)
            goto L992
        L9a4:
            float r3 = java.lang.Math.abs(r14)
            float r5 = defpackage.vh.f
            r2 = 1567209(0x17e9e9, float:2.196128E-39)
        L9ad:
            r6 = 1567226(0x17e9fa, float:2.196151E-39)
            r2 = r2 ^ r6
            switch(r2) {
                case 19: goto L9b5;
                case 956: goto L9c1;
                case 989: goto L973;
                case 1010: goto L9bd;
                default: goto L9b4;
            }
        L9b4:
            goto L9ad
        L9b5:
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 > 0) goto L9bd
            r2 = 1567302(0x17ea46, float:2.196258E-39)
            goto L9ad
        L9bd:
            r2 = 1567271(0x17ea27, float:2.196214E-39)
            goto L9ad
        L9c1:
            r2 = 0
            r4.e = r2
            goto L973
        L9c5:
            r8 = 0
            r7 = r16
            defpackage.vh.b(r2, r3, r4, r5, r6, r7, r8)
            r2 = 1568108(0x17ed6c, float:2.197387E-39)
        L9ce:
            r3 = 1568125(0x17ed7d, float:2.197411E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L9d6;
                case 246: goto L10;
                default: goto L9d5;
            }
        L9d5:
            goto L9ce
        L9d6:
            r2 = 1568139(0x17ed8b, float:2.197431E-39)
            goto L9ce
        L9da:
            float r3 = r5.getRawX()
            r4.a = r3
            float r3 = r5.getRawY()
            r4.b = r3
            r3 = 0
            r4.c = r3
            r3 = 0
            r4.d = r3
            r3 = 0
            r4.e = r3
            android.content.res.Resources r3 = r2.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.widthPixels
            float r3 = (float) r3
            defpackage.vh.g = r3
            android.content.res.Resources r3 = r2.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            defpackage.vh.d = r3
            r4 = 1103101952(0x41c00000, float:24.0)
            float r4 = r4 * r3
            defpackage.vh.e = r4
            r4 = 1119092736(0x42b40000, float:90.0)
            float r3 = r3 * r4
            defpackage.vh.f = r3
            r3 = 0
            r2.setClipChildren(r3)
            r3 = 0
            r2.setClipToPadding(r3)
            android.view.ViewParent r3 = r2.getParent()
            boolean r6 = r3 instanceof android.view.ViewGroup
            r4 = 1568232(0x17ede8, float:2.197561E-39)
        La23:
            r7 = 1568249(0x17edf9, float:2.197585E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 17: goto La2b;
                case 991: goto La57;
                case 1022: goto La31;
                case 7465: goto La35;
                default: goto La2a;
            }
        La2a:
            goto La23
        La2b:
            if (r6 == 0) goto La31
            r4 = 1568976(0x17f0d0, float:2.198604E-39)
            goto La23
        La31:
            r4 = 1568294(0x17ee26, float:2.197648E-39)
            goto La23
        La35:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r4 = 1569007(0x17f0ef, float:2.198647E-39)
        La3a:
            r6 = 1569024(0x17f100, float:2.198671E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 14: goto La42;
                case 495: goto La53;
                default: goto La41;
            }
        La41:
            goto La3a
        La42:
            r4 = 1569131(0x17f16b, float:2.198821E-39)
        La45:
            r6 = 1569148(0x17f17c, float:2.198845E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 23: goto La4d;
                case 180: goto La5d;
                case 213: goto La61;
                case 246: goto La59;
                default: goto La4c;
            }
        La4c:
            goto La45
        La4d:
            if (r3 == 0) goto La59
            r4 = 1569224(0x17f1c8, float:2.198951E-39)
            goto La45
        La53:
            r4 = 1569038(0x17f10e, float:2.19869E-39)
            goto La3a
        La57:
            r3 = 0
            goto La42
        La59:
            r4 = 1569193(0x17f1a9, float:2.198908E-39)
            goto La45
        La5d:
            r4 = 0
            r3.setClipChildren(r4)
        La61:
            android.view.ViewParent r3 = r2.getParent()
            boolean r6 = r3 instanceof android.view.ViewGroup
            r4 = 1569255(0x17f1e7, float:2.198995E-39)
        La6a:
            r7 = 1569272(0x17f1f8, float:2.199018E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 31: goto La72;
                case 1335: goto La7c;
                case 1352: goto La8d;
                case 1385: goto La78;
                default: goto La71;
            }
        La71:
            goto La6a
        La72:
            if (r6 == 0) goto La78
            r4 = 1569999(0x17f4cf, float:2.200037E-39)
            goto La6a
        La78:
            r4 = 1569968(0x17f4b0, float:2.199994E-39)
            goto La6a
        La7c:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r4 = 1570030(0x17f4ee, float:2.20008E-39)
        La81:
            r6 = 1570047(0x17f4ff, float:2.200104E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto La89;
                case 498: goto La8e;
                default: goto La88;
            }
        La88:
            goto La81
        La89:
            r4 = 1570061(0x17f50d, float:2.200124E-39)
            goto La81
        La8d:
            r3 = 0
        La8e:
            r4 = 1570154(0x17f56a, float:2.200254E-39)
        La91:
            r6 = 1570171(0x17f57b, float:2.200278E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto La99;
                case 211: goto Laa7;
                case 242: goto La9f;
                case 3369: goto Laa3;
                default: goto La98;
            }
        La98:
            goto La91
        La99:
            if (r3 == 0) goto La9f
            r4 = 1570898(0x17f852, float:2.201297E-39)
            goto La91
        La9f:
            r4 = 1570216(0x17f5a8, float:2.200341E-39)
            goto La91
        Laa3:
            r4 = 0
            r3.setClipToPadding(r4)
        Laa7:
            r3 = 2114191365(0x7e040005, float:4.386455E37)
            java.lang.Object r3 = r2.getTag(r3)
            boolean r6 = r3 instanceof android.view.VelocityTracker
            r4 = 1570929(0x17f871, float:2.20134E-39)
        Lab3:
            r7 = 1570946(0x17f882, float:2.201364E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 18: goto Labb;
                case 45: goto Lad6;
                case 76: goto Lac5;
                case 243: goto Labf;
                default: goto Laba;
            }
        Laba:
            goto Lab3
        Labb:
            r4 = 1570991(0x17f8af, float:2.201427E-39)
            goto Lab3
        Labf:
            if (r6 == 0) goto Labb
            r4 = 1571022(0x17f8ce, float:2.201471E-39)
            goto Lab3
        Lac5:
            android.view.VelocityTracker r3 = (android.view.VelocityTracker) r3
            r4 = 1571053(0x17f8ed, float:2.201514E-39)
        Laca:
            r6 = 1571070(0x17f8fe, float:2.201538E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 19: goto Lad2;
                case 498: goto Lad7;
                default: goto Lad1;
            }
        Lad1:
            goto Laca
        Lad2:
            r4 = 1571084(0x17f90c, float:2.201558E-39)
            goto Laca
        Lad6:
            r3 = 0
        Lad7:
            r4 = 1571177(0x17f969, float:2.201688E-39)
        Lada:
            r6 = 1571194(0x17f97a, float:2.201712E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 19: goto Lae2;
                case 1323: goto Laec;
                case 1352: goto Laef;
                case 1385: goto Lae8;
                default: goto Lae1;
            }
        Lae1:
            goto Lada
        Lae2:
            if (r3 == 0) goto Lae8
            r4 = 1571921(0x17fc51, float:2.20273E-39)
            goto Lada
        Lae8:
            r4 = 1571890(0x17fc32, float:2.202687E-39)
            goto Lada
        Laec:
            r3.recycle()
        Laef:
            r3 = 2114191367(0x7e040007, float:4.386456E37)
            java.lang.Object r3 = r2.getTag(r3)
            boolean r6 = r3 instanceof java.lang.Runnable
            r4 = 1571952(0x17fc70, float:2.202774E-39)
        Lafb:
            r7 = 1571969(0x17fc81, float:2.202798E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 14: goto Lb03;
                case 47: goto Lb1e;
                case 76: goto Lb0d;
                case 241: goto Lb07;
                default: goto Lb02;
            }
        Lb02:
            goto Lafb
        Lb03:
            r4 = 1572014(0x17fcae, float:2.202861E-39)
            goto Lafb
        Lb07:
            if (r6 == 0) goto Lb03
            r4 = 1572045(0x17fccd, float:2.202904E-39)
            goto Lafb
        Lb0d:
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r4 = 1572076(0x17fcec, float:2.202948E-39)
        Lb12:
            r6 = 1572093(0x17fcfd, float:2.202972E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto Lb1a;
                case 502: goto Lb1f;
                default: goto Lb19;
            }
        Lb19:
            goto Lb12
        Lb1a:
            r4 = 1572107(0x17fd0b, float:2.202991E-39)
            goto Lb12
        Lb1e:
            r3 = 0
        Lb1f:
            r4 = 1572851(0x17fff3, float:2.204034E-39)
        Lb22:
            r6 = 1572868(0x180004, float:2.204058E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 22: goto Lb2a;
                case 53: goto Lb3e;
                case 84: goto Lb34;
                case 1048567: goto Lb2e;
                default: goto Lb29;
            }
        Lb29:
            goto Lb22
        Lb2a:
            r4 = 1572913(0x180031, float:2.20412E-39)
            goto Lb22
        Lb2e:
            if (r3 == 0) goto Lb2a
            r4 = 1572944(0x180050, float:2.204164E-39)
            goto Lb22
        Lb34:
            r2.removeCallbacks(r3)
            r3 = 2114191367(0x7e040007, float:4.386456E37)
            r4 = 0
            r2.setTag(r3, r4)
        Lb3e:
            r3 = 2114191361(0x7e040001, float:4.386453E37)
            java.lang.Object r3 = r2.getTag(r3)
            boolean r6 = r3 instanceof defpackage.h40
            r4 = 1572975(0x18006f, float:2.204207E-39)
        Lb4a:
            r7 = 1572992(0x180080, float:2.204231E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 14: goto Lb52;
                case 45: goto Lb6d;
                case 76: goto Lb5c;
                case 239: goto Lb56;
                default: goto Lb51;
            }
        Lb51:
            goto Lb4a
        Lb52:
            r4 = 1573037(0x1800ad, float:2.204294E-39)
            goto Lb4a
        Lb56:
            if (r6 == 0) goto Lb52
            r4 = 1573068(0x1800cc, float:2.204338E-39)
            goto Lb4a
        Lb5c:
            h40 r3 = (defpackage.h40) r3
            r4 = 1573099(0x1800eb, float:2.204381E-39)
        Lb61:
            r6 = 1573116(0x1800fc, float:2.204405E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 23: goto Lb69;
                case 873: goto Lb6e;
                default: goto Lb68;
            }
        Lb68:
            goto Lb61
        Lb69:
            r4 = 1573781(0x180395, float:2.205337E-39)
            goto Lb61
        Lb6d:
            r3 = 0
        Lb6e:
            r4 = 1573874(0x1803f2, float:2.205467E-39)
        Lb71:
            r6 = 1573891(0x180403, float:2.205491E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 18: goto Lb79;
                case 51: goto Lb9d;
                case 76: goto Lb83;
                case 2033: goto Lb7d;
                default: goto Lb78;
            }
        Lb78:
            goto Lb71
        Lb79:
            r4 = 1573936(0x180430, float:2.205554E-39)
            goto Lb71
        Lb7d:
            if (r3 == 0) goto Lb79
            r4 = 1573967(0x18044f, float:2.205598E-39)
            goto Lb71
        Lb83:
            boolean r6 = r3.e
            r4 = 1573998(0x18046e, float:2.205641E-39)
        Lb88:
            r7 = 1574015(0x18047f, float:2.205665E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 17: goto Lb90;
                case 211: goto Lb9d;
                case 242: goto Lb96;
                case 809: goto Lb9a;
                default: goto Lb8f;
            }
        Lb8f:
            goto Lb88
        Lb90:
            if (r6 == 0) goto Lb96
            r4 = 1574742(0x180756, float:2.206684E-39)
            goto Lb88
        Lb96:
            r4 = 1574060(0x1804ac, float:2.205728E-39)
            goto Lb88
        Lb9a:
            r3.c()
        Lb9d:
            r3 = 2114191362(0x7e040002, float:4.3864534E37)
            java.lang.Object r3 = r2.getTag(r3)
            boolean r6 = r3 instanceof defpackage.h40
            r4 = 1574773(0x180775, float:2.206727E-39)
        Lba9:
            r7 = 1574790(0x180786, float:2.206751E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 18: goto Lbb1;
                case 53: goto Lbdd;
                case 84: goto Lbbb;
                case 243: goto Lbb5;
                default: goto Lbb0;
            }
        Lbb0:
            goto Lba9
        Lbb1:
            r4 = 1574835(0x1807b3, float:2.206814E-39)
            goto Lba9
        Lbb5:
            if (r6 == 0) goto Lbb1
            r4 = 1574866(0x1807d2, float:2.206857E-39)
            goto Lba9
        Lbbb:
            h40 r3 = (defpackage.h40) r3
            r4 = 1574897(0x1807f1, float:2.206901E-39)
        Lbc0:
            r6 = 1574914(0x180802, float:2.206925E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 18: goto Lbc8;
                case 4083: goto Lbd9;
                default: goto Lbc7;
            }
        Lbc7:
            goto Lbc0
        Lbc8:
            r4 = 1575021(0x18086d, float:2.207075E-39)
        Lbcb:
            r6 = 1575038(0x18087e, float:2.207098E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 19: goto Lbd3;
                case 811: goto Lbe3;
                case 840: goto Lbfd;
                case 873: goto Lbdf;
                default: goto Lbd2;
            }
        Lbd2:
            goto Lbcb
        Lbd3:
            if (r3 == 0) goto Lbdf
            r4 = 1575765(0x180b55, float:2.208117E-39)
            goto Lbcb
        Lbd9:
            r4 = 1574928(0x180810, float:2.206944E-39)
            goto Lbc0
        Lbdd:
            r3 = 0
            goto Lbc8
        Lbdf:
            r4 = 1575734(0x180b36, float:2.208074E-39)
            goto Lbcb
        Lbe3:
            boolean r6 = r3.e
            r4 = 1575796(0x180b74, float:2.20816E-39)
        Lbe8:
            r7 = 1575813(0x180b85, float:2.208184E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 22: goto Lbf0;
                case 55: goto Lbfd;
                case 84: goto Lbfa;
                case 241: goto Lbf4;
                default: goto Lbef;
            }
        Lbef:
            goto Lbe8
        Lbf0:
            r4 = 1575858(0x180bb2, float:2.208247E-39)
            goto Lbe8
        Lbf4:
            if (r6 == 0) goto Lbf0
            r4 = 1575889(0x180bd1, float:2.208291E-39)
            goto Lbe8
        Lbfa:
            r3.c()
        Lbfd:
            r3 = 2114191363(0x7e040003, float:4.386454E37)
            java.lang.Object r3 = r2.getTag(r3)
            boolean r6 = r3 instanceof defpackage.h40
            r4 = 1575920(0x180bf0, float:2.208334E-39)
        Lc09:
            r7 = 1575937(0x180c01, float:2.208358E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 14: goto Lc11;
                case 47: goto Lc2c;
                case 2033: goto Lc15;
                case 20908: goto Lc1b;
                default: goto Lc10;
            }
        Lc10:
            goto Lc09
        Lc11:
            r4 = 1575982(0x180c2e, float:2.208421E-39)
            goto Lc09
        Lc15:
            if (r6 == 0) goto Lc11
            r4 = 1596845(0x185dad, float:2.237656E-39)
            goto Lc09
        Lc1b:
            h40 r3 = (defpackage.h40) r3
            r4 = 1596876(0x185dcc, float:2.2377E-39)
        Lc20:
            r6 = 1596893(0x185ddd, float:2.237724E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto Lc28;
                case 54: goto Lc2d;
                default: goto Lc27;
            }
        Lc27:
            goto Lc20
        Lc28:
            r4 = 1596907(0x185deb, float:2.237743E-39)
            goto Lc20
        Lc2c:
            r3 = 0
        Lc2d:
            r4 = 1597000(0x185e48, float:2.237874E-39)
        Lc30:
            r6 = 1597017(0x185e59, float:2.237897E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto Lc38;
                case 62: goto Lc3e;
                case 223: goto Lc5c;
                case 252: goto Lc42;
                default: goto Lc37;
            }
        Lc37:
            goto Lc30
        Lc38:
            if (r3 == 0) goto Lc3e
            r4 = 1597093(0x185ea5, float:2.238004E-39)
            goto Lc30
        Lc3e:
            r4 = 1597062(0x185e86, float:2.23796E-39)
            goto Lc30
        Lc42:
            boolean r6 = r3.e
            r4 = 1597124(0x185ec4, float:2.238047E-39)
        Lc47:
            r7 = 1597141(0x185ed5, float:2.238071E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 17: goto Lc4f;
                case 16216: goto Lc5c;
                case 16249: goto Lc59;
                case 16315: goto Lc55;
                default: goto Lc4e;
            }
        Lc4e:
            goto Lc47
        Lc4f:
            if (r6 == 0) goto Lc55
            r4 = 1597868(0x1861ac, float:2.23909E-39)
            goto Lc47
        Lc55:
            r4 = 1597837(0x18618d, float:2.239047E-39)
            goto Lc47
        Lc59:
            r3.c()
        Lc5c:
            r3 = 2114191364(0x7e040004, float:4.3864544E37)
            java.lang.Object r3 = r2.getTag(r3)
            boolean r6 = r3 instanceof defpackage.h40
            r4 = 1597899(0x1861cb, float:2.239133E-39)
        Lc68:
            r7 = 1597916(0x1861dc, float:2.239157E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 23: goto Lc70;
                case 54: goto Lc76;
                case 981: goto Lc8b;
                case 1012: goto Lc7a;
                default: goto Lc6f;
            }
        Lc6f:
            goto Lc68
        Lc70:
            if (r6 == 0) goto Lc76
            r4 = 1597992(0x186228, float:2.239264E-39)
            goto Lc68
        Lc76:
            r4 = 1597961(0x186209, float:2.23922E-39)
            goto Lc68
        Lc7a:
            h40 r3 = (defpackage.h40) r3
            r4 = 1598023(0x186247, float:2.239307E-39)
        Lc7f:
            r6 = 1598040(0x186258, float:2.239331E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 31: goto Lc87;
                case 62: goto Lc8c;
                default: goto Lc86;
            }
        Lc86:
            goto Lc7f
        Lc87:
            r4 = 1598054(0x186266, float:2.23935E-39)
            goto Lc7f
        Lc8b:
            r3 = 0
        Lc8c:
            r4 = 1598798(0x18654e, float:2.240393E-39)
        Lc8f:
            r6 = 1598815(0x18655f, float:2.240417E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto Lc97;
                case 50: goto Lc9d;
                case 211: goto Lcbb;
                case 244: goto Lca1;
                default: goto Lc96;
            }
        Lc96:
            goto Lc8f
        Lc97:
            if (r3 == 0) goto Lc9d
            r4 = 1598891(0x1865ab, float:2.240524E-39)
            goto Lc8f
        Lc9d:
            r4 = 1598860(0x18658c, float:2.24048E-39)
            goto Lc8f
        Lca1:
            boolean r6 = r3.e
            r4 = 1598922(0x1865ca, float:2.240567E-39)
        Lca6:
            r7 = 1598939(0x1865db, float:2.240591E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 17: goto Lcae;
                case 50: goto Lcb4;
                case 979: goto Lcbb;
                case 1020: goto Lcb8;
                default: goto Lcad;
            }
        Lcad:
            goto Lca6
        Lcae:
            if (r6 == 0) goto Lcb4
            r4 = 1599015(0x186627, float:2.240697E-39)
            goto Lca6
        Lcb4:
            r4 = 1598984(0x186608, float:2.240654E-39)
            goto Lca6
        Lcb8:
            r3.c()
        Lcbb:
            r3 = 2114191366(0x7e040006, float:4.3864554E37)
            java.lang.Object r3 = r2.getTag(r3)
            boolean r6 = r3 instanceof defpackage.h40
            r4 = 1599046(0x186646, float:2.240741E-39)
        Lcc7:
            r7 = 1599063(0x186657, float:2.240765E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 17: goto Lccf;
                case 3751: goto Lcd5;
                case 3928: goto L1af2;
                case 3961: goto Lcd9;
                default: goto Lcce;
            }
        Lcce:
            goto Lcc7
        Lccf:
            if (r6 == 0) goto Lcd5
            r4 = 1599790(0x18692e, float:2.241783E-39)
            goto Lcc7
        Lcd5:
            r4 = 1599759(0x18690f, float:2.24174E-39)
            goto Lcc7
        Lcd9:
            h40 r3 = (defpackage.h40) r3
        Lcdb:
            r4 = 1599821(0x18694d, float:2.241827E-39)
        Lcde:
            r6 = 1599838(0x18695e, float:2.24185E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 19: goto Lce6;
                case 50: goto Lcec;
                case 213: goto Ld0a;
                case 244: goto Lcf0;
                default: goto Lce5;
            }
        Lce5:
            goto Lcde
        Lce6:
            if (r3 == 0) goto Lcec
            r4 = 1599914(0x1869aa, float:2.241957E-39)
            goto Lcde
        Lcec:
            r4 = 1599883(0x18698b, float:2.241914E-39)
            goto Lcde
        Lcf0:
            boolean r6 = r3.e
            r4 = 1599945(0x1869c9, float:2.242E-39)
        Lcf5:
            r7 = 1599962(0x1869da, float:2.242024E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 19: goto Lcfd;
                case 50: goto Ld03;
                case 989: goto Ld0a;
                case 1387: goto Ld07;
                default: goto Lcfc;
            }
        Lcfc:
            goto Lcf5
        Lcfd:
            if (r6 == 0) goto Ld03
            r4 = 1600689(0x186cb1, float:2.243043E-39)
            goto Lcf5
        Ld03:
            r4 = 1600007(0x186a07, float:2.242087E-39)
            goto Lcf5
        Ld07:
            r3.c()
        Ld0a:
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r3.addMovement(r5)
            r4 = 2114191365(0x7e040005, float:4.386455E37)
            r2.setTag(r4, r3)
            goto L10
        Ld19:
            java.lang.String r2 = "GwiwAXU=\n"
            java.lang.String r3 = "a2nCYBidHhc=\n"
            java.lang.String r2 = "param"
            r0 = r16
            defpackage.ip.o(r2, r0)
            r0 = r16
            java.lang.Object[] r2 = r0.args
            r3 = 0
            r2 = r2[r3]
            java.lang.String r3 = "SxWarlja115LD4LiGtyWU0QTguIM1pZeSg7brA3V2hBRGYanWNLZREkJmOwx18I=\n"
            java.lang.String r4 = "JWD2wni5tjA=\n"
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Int"
            defpackage.ip.m(r3, r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            r2 = 1600720(0x186cd0, float:2.243086E-39)
        Ld41:
            r4 = 1600737(0x186ce1, float:2.24311E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 14: goto Ld49;
                case 49: goto Ld4d;
                case 460: goto Ld55;
                case 495: goto L10;
                default: goto Ld48;
            }
        Ld48:
            goto Ld41
        Ld49:
            r2 = 1600782(0x186d0e, float:2.243173E-39)
            goto Ld41
        Ld4d:
            r2 = 32275(0x7e13, float:4.5227E-41)
            if (r3 != r2) goto Ld49
            r2 = 1600813(0x186d2d, float:2.243217E-39)
            goto Ld41
        Ld55:
            r2 = 0
            r0 = r16
            r0.setResult(r2)
            r0 = r16
            java.lang.Object r2 = r0.thisObject
            java.lang.String r3 = "K01IND7TwQErV1B4fNWADCRLUHhq34ABKlYJNmvczE8xQVQ9PtHOCzdXTTww0dAfa3lHLHfGyRs8\n"
            java.lang.String r4 = "RTgkWB6woG8=\n"
            java.lang.String r3 = "null cannot be cast to non-null type android.app.Activity"
            defpackage.ip.m(r3, r2)
            android.app.Activity r2 = (android.app.Activity) r2
            r0 = r16
            java.lang.Object[] r3 = r0.args
            r4 = 1
            r3 = r3[r4]
            java.lang.String r4 = "/1z9yCxpgQP/RuWEbm/ADvBa5YR4ZcAD/ke8ynlmjE3lUOHBLGGPGf1A/4pFZJQ=\n"
            java.lang.String r5 = "kSmRpAwK4G0=\n"
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Int"
            defpackage.ip.m(r4, r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r5 = r3.intValue()
            r0 = r16
            java.lang.Object[] r3 = r0.args
            r4 = 2
            r3 = r3[r4]
            boolean r6 = r3 instanceof android.content.Intent
            r4 = 1600844(0x186d4c, float:2.24326E-39)
        Ld90:
            r7 = 1600861(0x186d5d, float:2.243284E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 17: goto Ld98;
                case 54: goto Ld9e;
                case 215: goto L1aef;
                case 244: goto Lda2;
                default: goto Ld97;
            }
        Ld97:
            goto Ld90
        Ld98:
            if (r6 == 0) goto Ld9e
            r4 = 1600937(0x186da9, float:2.24339E-39)
            goto Ld90
        Ld9e:
            r4 = 1600906(0x186d8a, float:2.243347E-39)
            goto Ld90
        Lda2:
            android.content.Intent r3 = (android.content.Intent) r3
        Lda4:
            r4 = 1600968(0x186dc8, float:2.243434E-39)
        Lda7:
            r6 = 1600985(0x186dd9, float:2.243458E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto Ldaf;
                case 7496: goto L10;
                case 7529: goto Ldba;
                case 7595: goto Ldb6;
                default: goto Ldae;
            }
        Ldae:
            goto Lda7
        Ldaf:
            r4 = -1
            if (r5 != r4) goto Ldb6
            r4 = 1601712(0x1870b0, float:2.244477E-39)
            goto Lda7
        Ldb6:
            r4 = 1601681(0x187091, float:2.244433E-39)
            goto Lda7
        Ldba:
            r4 = 1601743(0x1870cf, float:2.24452E-39)
        Ldbd:
            r5 = 1601760(0x1870e0, float:2.244544E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 14: goto Ldc5;
                case 47: goto Ldc9;
                case 460: goto Ldcf;
                case 493: goto L10;
                default: goto Ldc4;
            }
        Ldc4:
            goto Ldbd
        Ldc5:
            r4 = 1601805(0x18710d, float:2.244607E-39)
            goto Ldbd
        Ldc9:
            if (r3 == 0) goto Ldc5
            r4 = 1601836(0x18712c, float:2.24465E-39)
            goto Ldbd
        Ldcf:
            java.lang.String r4 = defpackage.a80.v
            int r5 = r4.length()
            r4 = 1601867(0x18714b, float:2.244694E-39)
        Ldd8:
            r6 = 1601884(0x18715c, float:2.244718E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 23: goto Lde0;
                case 54: goto Lde6;
                case 213: goto L10;
                case 1391: goto Ldea;
                default: goto Lddf;
            }
        Lddf:
            goto Ldd8
        Lde0:
            if (r5 <= 0) goto Lde6
            r4 = 1602611(0x187433, float:2.245736E-39)
            goto Ldd8
        Lde6:
            r4 = 1601929(0x187189, float:2.24478E-39)
            goto Ldd8
        Ldea:
            android.net.Uri r4 = r3.getData()     // Catch: java.lang.Throwable -> Leab
            r3 = 1602642(0x187452, float:2.24578E-39)
        Ldf1:
            r5 = 1602659(0x187463, float:2.245804E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 18: goto Ldf9;
                case 49: goto Ldfd;
                case 204: goto Le03;
                case 243: goto Le1d;
                default: goto Ldf8;
            }
        Ldf8:
            goto Ldf1
        Ldf9:
            r3 = 1602704(0x187490, float:2.245867E-39)
            goto Ldf1
        Ldfd:
            if (r4 != 0) goto Ldf9
            r3 = 1602735(0x1874af, float:2.24591E-39)
            goto Ldf1
        Le03:
            java.lang.String r2 = "pmIMv5RATA==\n"
            java.lang.String r3 = "mhFpy7l/cl0=\n"
            "<set-?>"
            java.lang.String r2 = ""
            defpackage.a80.v = r2
            r2 = 1602766(0x1874ce, float:2.245954E-39)
        Le11:
            r3 = 1602783(0x1874df, float:2.245977E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto Le19;
                case 50: goto L10;
                default: goto Le18;
            }
        Le18:
            goto Le11
        Le19:
            r2 = 1602797(0x1874ed, float:2.245997E-39)
            goto Le11
        Le1d:
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch: java.lang.Throwable -> Leab
            java.io.InputStream r5 = r3.openInputStream(r4)     // Catch: java.lang.Throwable -> Leab
            r3 = 1602890(0x18754a, float:2.246127E-39)
        Le28:
            r4 = 1602907(0x18755b, float:2.246151E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto Le30;
                case 687: goto Le36;
                case 3400: goto Le88;
                case 3433: goto Le3a;
                default: goto Le2f;
            }
        Le2f:
            goto Le28
        Le30:
            if (r5 == 0) goto Le36
            r3 = 1603634(0x187832, float:2.24717E-39)
            goto Le28
        Le36:
            r3 = 1603603(0x187813, float:2.247126E-39)
            goto Le28
        Le3a:
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch: java.lang.Throwable -> Led0
            r4 = 144(0x90, float:2.02E-43)
            r6 = 144(0x90, float:2.02E-43)
            r7 = 1
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r3, r4, r6, r7)     // Catch: java.lang.Throwable -> Led0
            java.lang.String r4 = "6op4lf3Y57zolHiQy9TAsuiINdqnk50=\n"
            java.lang.String r6 = "ifgd9Im9tN8=\n"
            java.lang.String r4 = "createScaledBitmap(...)"     // Catch: java.lang.Throwable -> Led0
            defpackage.ip.n(r4, r3)     // Catch: java.lang.Throwable -> Led0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Led0
            r4.<init>()     // Catch: java.lang.Throwable -> Led0
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> Led0
            r7 = 100
            r3.compress(r6, r7, r4)     // Catch: java.lang.Throwable -> Led0
            byte[] r3 = r4.toByteArray()     // Catch: java.lang.Throwable -> Led0
            r4 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)     // Catch: java.lang.Throwable -> Led0
            gn r4 = defpackage.gn.a     // Catch: java.lang.Throwable -> Led0
            java.lang.String r6 = "geek_avatar_"
            java.lang.String r7 = defpackage.a80.v     // Catch: java.lang.Throwable -> Led0
            java.lang.String r6 = r6.concat(r7)     // Catch: java.lang.Throwable -> Led0
            defpackage.ip.l(r3)     // Catch: java.lang.Throwable -> Led0
            r4.getClass()     // Catch: java.lang.Throwable -> Led0
            defpackage.gn.h(r6, r3)     // Catch: java.lang.Throwable -> Led0
            r5.close()     // Catch: java.lang.Throwable -> Leab
            r3 = 1603665(0x187851, float:2.247213E-39)
        Le80:
            r4 = 1603682(0x187862, float:2.247237E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 18: goto Le88;
                case 51: goto Lea7;
                default: goto Le87;
            }     // Catch: java.lang.Throwable -> Leab
        Le87:
            goto Le80
        Le88:
            gn r3 = defpackage.gn.a     // Catch: java.lang.Throwable -> Leab
            java.lang.String r4 = "29QF1JDxJYqAlwyf9fZdwbTvXo2SmnWv2Ps41JvJK7KOlAmK+t94wbPDVL68mVm72OU50pP8\n"
            java.lang.String r5 = "PnCxMRN+zSQ=\n"
            java.lang.String r4 = "\u5934\u50cf\u8bbe\u7f6e\u6210\u529f\uff01\u4e0b\u62c9\u5237\u65b0\u4e3b\u9875\u5373\u53ef\u751f\u6548\u3002"     // Catch: java.lang.Throwable -> Leab
            r3.getClass()     // Catch: java.lang.Throwable -> Leab
            defpackage.gn.k(r2, r4)     // Catch: java.lang.Throwable -> Leab
            r2 = 1604812(0x187ccc, float:2.24882E-39)
        Le9b:
            r3 = 1604829(0x187cdd, float:2.248844E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto Lea3;
                case 939: goto Le03;
                default: goto Lea2;
            }
        Lea2:
            goto Le9b
        Lea3:
            r2 = 1605494(0x187f76, float:2.249776E-39)
            goto Le9b
        Lea7:
            r3 = 1603696(0x187870, float:2.247257E-39)
            goto Le80
        Leab:
            r3 = move-exception
            r4 = 1603789(0x1878cd, float:2.247387E-39)
        Leaf:
            r5 = 1603806(0x1878de, float:2.247411E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 19: goto Leb7;
                case 50: goto Lee0;
                default: goto Leb6;
            }
        Leb6:
            goto Leaf
        Leb7:
            r4 = 1603820(0x1878ec, float:2.24743E-39)
            goto Leaf
        Lebb:
            r4 = 1604564(0x187bd4, float:2.248473E-39)
        Lebe:
            r6 = 1604581(0x187be5, float:2.248497E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 22: goto Lec6;
                case 49: goto Lecc;
                default: goto Lec5;
            }
        Lec5:
            goto Lebe
        Lec6:
            throw r3     // Catch: java.lang.Throwable -> Lec7
        Lec7:
            r4 = move-exception
            defpackage.ff.j(r5, r3)     // Catch: java.lang.Throwable -> Leab
            throw r4     // Catch: java.lang.Throwable -> Leab
        Lecc:
            r4 = 1604595(0x187bf3, float:2.248517E-39)
            goto Lebe
        Led0:
            r3 = move-exception
            r4 = 1604688(0x187c50, float:2.248647E-39)
        Led4:
            r6 = 1604705(0x187c61, float:2.24867E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 14: goto Lebb;
                case 49: goto Ledc;
                default: goto Ledb;
            }
        Ledb:
            goto Led4
        Ledc:
            r4 = 1604719(0x187c6f, float:2.24869E-39)
            goto Led4
        Lee0:
            java.lang.String r4 = "5f8yVlGfoebS7BZQQoKA\n"
            java.lang.String r5 = "pIlTIjDt8oc=\n"
            java.lang.String r4 = "AvatarSaveError"     // Catch: java.lang.Throwable -> Lf23
            java.lang.String r5 = "Nwje\n"
            java.lang.String r6 = "Q2m5jaPP2Zc=\n"
            java.lang.String r5 = "tag"     // Catch: java.lang.Throwable -> Lf23
            defpackage.ip.o(r5, r4)     // Catch: java.lang.Throwable -> Lf23
            java.lang.String r4 = "Fg==\n"
            java.lang.String r5 = "c8HJlSTQVfc=\n"
            "e"     // Catch: java.lang.Throwable -> Lf23
            gn r4 = defpackage.gn.a     // Catch: java.lang.Throwable -> Lf23
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> Lf23
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf23
            java.lang.String r6 = "头像处理失败: "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lf23
            r5.append(r3)     // Catch: java.lang.Throwable -> Lf23
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lf23
            r4.getClass()     // Catch: java.lang.Throwable -> Lf23
            defpackage.gn.k(r2, r3)     // Catch: java.lang.Throwable -> Lf23
            r2 = 1605587(0x187fd3, float:2.249907E-39)
        Lf17:
            r3 = 1605604(0x187fe4, float:2.24993E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 22: goto Le03;
                case 55: goto Lf1f;
                default: goto Lf1e;
            }
        Lf1e:
            goto Lf17
        Lf1f:
            r2 = 1605618(0x187ff2, float:2.24995E-39)
            goto Lf17
        Lf23:
            r2 = move-exception
            java.lang.String r3 = "pmIMv5RATA==\n"
            java.lang.String r4 = "mhFpy7l/cl0=\n"
            "<set-?>"
            java.lang.String r3 = ""
            defpackage.a80.v = r3
            throw r2
        Lf30:
            java.lang.String r2 = "mjy8s0g=\n"
            java.lang.String r3 = "6l3O0iVaDpM=\n"
            java.lang.String r2 = "param"
            r0 = r16
            defpackage.ip.o(r2, r0)
            r0 = r16
            java.lang.Object[] r5 = r0.args
            java.lang.String r2 = "nbJR5g==\n"
            java.lang.String r3 = "/MA2lZ3JQoo=\n"
            java.lang.String r2 = "args"
            defpackage.ip.n(r2, r5)
            int r6 = r5.length
            r2 = 0
        Lf4e:
            r3 = 1605711(0x18804f, float:2.25008E-39)
        Lf51:
            r4 = 1605728(0x188060, float:2.250104E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 14: goto Lf59;
                case 47: goto Lf5d;
                case 237: goto Lfb4;
                case 21100: goto Lf63;
                default: goto Lf58;
            }
        Lf58:
            goto Lf51
        Lf59:
            r3 = 1605773(0x18808d, float:2.250167E-39)
            goto Lf51
        Lf5d:
            if (r2 >= r6) goto Lf59
            r3 = 1626636(0x18d20c, float:2.279403E-39)
            goto Lf51
        Lf63:
            r3 = r5[r2]
            boolean r7 = r3 instanceof java.lang.String
            r4 = 1626667(0x18d22b, float:2.279446E-39)
        Lf6a:
            r8 = 1626684(0x18d23c, float:2.27947E-39)
            r4 = r4 ^ r8
            switch(r4) {
                case 23: goto Lf72;
                case 85: goto Lf9f;
                case 118: goto Lf78;
                case 180: goto Lf7c;
                default: goto Lf71;
            }
        Lf71:
            goto Lf6a
        Lf72:
            if (r7 == 0) goto Lf78
            r4 = 1626760(0x18d288, float:2.279576E-39)
            goto Lf6a
        Lf78:
            r4 = 1626729(0x18d269, float:2.279533E-39)
            goto Lf6a
        Lf7c:
            r2 = 1626791(0x18d2a7, float:2.27962E-39)
        Lf7f:
            r4 = 1626808(0x18d2b8, float:2.279644E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 31: goto Lf87;
                case 126: goto Lf8b;
                default: goto Lf86;
            }
        Lf86:
            goto Lf7f
        Lf87:
            r2 = 1626822(0x18d2c6, float:2.279663E-39)
            goto Lf7f
        Lf8b:
            r2 = r3
        Lf8c:
            boolean r4 = r2 instanceof java.lang.String
            r3 = 1627690(0x18d62a, float:2.28088E-39)
        Lf91:
            r5 = 1627707(0x18d63b, float:2.280903E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 17: goto Lf99;
                case 83: goto Lfdd;
                case 114: goto Lfb6;
                case 188: goto Lfba;
                default: goto Lf98;
            }
        Lf98:
            goto Lf91
        Lf99:
            if (r4 == 0) goto Lfb6
            r3 = 1627783(0x18d687, float:2.28101E-39)
            goto Lf91
        Lf9f:
            int r2 = r2 + 21
            int r2 = r2 + 1
            int r2 = r2 + (-21)
            r3 = 1626915(0x18d323, float:2.279793E-39)
        Lfa8:
            r4 = 1626932(0x18d334, float:2.279817E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 23: goto Lfb0;
                case 1785: goto Lf4e;
                default: goto Lfaf;
            }
        Lfaf:
            goto Lfa8
        Lfb0:
            r3 = 1627597(0x18d5cd, float:2.280749E-39)
            goto Lfa8
        Lfb4:
            r2 = 0
            goto Lf8c
        Lfb6:
            r3 = 1627752(0x18d668, float:2.280966E-39)
            goto Lf91
        Lfba:
            java.lang.String r2 = (java.lang.String) r2
            r3 = 1627814(0x18d6a6, float:2.281053E-39)
        Lfbf:
            r4 = 1627831(0x18d6b7, float:2.281077E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto Lfc7;
                case 114: goto Lfcb;
                default: goto Lfc6;
            }
        Lfc6:
            goto Lfbf
        Lfc7:
            r3 = 1627845(0x18d6c5, float:2.281097E-39)
            goto Lfbf
        Lfcb:
            r3 = r2
        Lfcc:
            r2 = 1628589(0x18d9ad, float:2.282139E-39)
        Lfcf:
            r4 = 1628606(0x18d9be, float:2.282163E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 19: goto Lfd7;
                case 85: goto Lff3;
                case 114: goto Lfe0;
                case 948: goto Lfe4;
                default: goto Lfd6;
            }
        Lfd6:
            goto Lfcf
        Lfd7:
            if (r3 != 0) goto Lfe0
            r2 = 1628682(0x18da0a, float:2.28227E-39)
            goto Lfcf
        Lfdd:
            r2 = 0
            r3 = r2
            goto Lfcc
        Lfe0:
            r2 = 1628651(0x18d9eb, float:2.282226E-39)
            goto Lfcf
        Lfe4:
            r2 = 1628713(0x18da29, float:2.282313E-39)
        Lfe7:
            r3 = 1628730(0x18da3a, float:2.282337E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto Lfef;
                case 114: goto L10;
                default: goto Lfee;
            }
        Lfee:
            goto Lfe7
        Lfef:
            r2 = 1628744(0x18da48, float:2.282356E-39)
            goto Lfe7
        Lff3:
            java.lang.String r2 = "hJZpa4OfOEuHrA==\n"
            java.lang.String r4 = "4/MMANz5Vyc=\n"
            java.lang.String r2 = "geek_fold_"
            r4 = 0
            boolean r4 = defpackage.b50.N(r3, r2, r4)
            r2 = 1628837(0x18daa5, float:2.282487E-39)
        L1003:
            r5 = 1628854(0x18dab6, float:2.28251E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 19: goto L100b;
                case 1851: goto L1015;
                case 2008: goto L10f0;
                case 2041: goto L1011;
                default: goto L100a;
            }
        L100a:
            goto L1003
        L100b:
            if (r4 == 0) goto L1011
            r2 = 1629581(0x18dd8d, float:2.28353E-39)
            goto L1003
        L1011:
            r2 = 1629550(0x18dd6e, float:2.283486E-39)
            goto L1003
        L1015:
            java.lang.String r2 = "3CIk1yWWGA==\n"
            java.lang.String r4 = "4FFBowipJsc=\n"
            "<set-?>"
            defpackage.ff.z = r3
            r2 = 0
            r0 = r16
            r0.setResult(r2)
            r0 = r16
            java.lang.Object r2 = r0.thisObject
            boolean r5 = r2 instanceof android.app.Activity
            r4 = 1629612(0x18ddac, float:2.283573E-39)
        L102d:
            r6 = 1629629(0x18ddbd, float:2.283597E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto L1035;
                case 87: goto L1aec;
                case 118: goto L103b;
                case 948: goto L103f;
                default: goto L1034;
            }
        L1034:
            goto L102d
        L1035:
            if (r5 == 0) goto L103b
            r4 = 1629705(0x18de09, float:2.283703E-39)
            goto L102d
        L103b:
            r4 = 1629674(0x18ddea, float:2.28366E-39)
            goto L102d
        L103f:
            android.app.Activity r2 = (android.app.Activity) r2
        L1041:
            r4 = 1629736(0x18de28, float:2.283747E-39)
        L1044:
            r5 = 1629753(0x18de39, float:2.28377E-39)
            r4 = r4 ^ r5
            switch(r4) {
                case 17: goto L104c;
                case 95: goto L1065;
                case 126: goto L1052;
                case 16169: goto L1056;
                default: goto L104b;
            }
        L104b:
            goto L1044
        L104c:
            if (r2 != 0) goto L1052
            r4 = 1630480(0x18e110, float:2.284789E-39)
            goto L1044
        L1052:
            r4 = 1629798(0x18de66, float:2.283833E-39)
            goto L1044
        L1056:
            r2 = 1630511(0x18e12f, float:2.284833E-39)
        L1059:
            r3 = 1630528(0x18e140, float:2.284856E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L10;
                case 111: goto L1061;
                default: goto L1060;
            }
        L1060:
            goto L1059
        L1061:
            r2 = 1630542(0x18e14e, float:2.284876E-39)
            goto L1059
        L1065:
            gn r4 = defpackage.gn.a
            java.lang.String r5 = "key_geek_folder_name_"
            java.lang.String r5 = r5.concat(r3)
            java.lang.String r6 = "2QtHjqTpAU24anvs7shTEZU1\n"
            java.lang.String r7 = "MYztawpz5fQ=\n"
            java.lang.String r6 = "\u81ea\u5b9a\u4e49\u6587\u4ef6\u5939"
            r4.getClass()
            defpackage.gn.d(r5, r6)
            java.lang.String r4 = "4MLlKdibeg==\n"
            java.lang.String r5 = "g62LXb3jDmA=\n"
            "context"
            java.lang.String r4 = "0uKKV+PjlNc=\n"
            java.lang.String r5 = "tI3mM4aR3bM=\n"
            "folderId"
            java.lang.String r4 = "TOhopDkEmNBH4g==\n"
            java.lang.String r5 = "KocEwFx21rE=\n"
            "folderName"
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L10bd
            r4.<init>()     // Catch: java.lang.Throwable -> L10bd
            java.lang.String r5 = "CuMX50RsjX8M4g7nXWTNaQCiGaZef4ZuGu0OoF9nzV8G4gyLX3GweRv6E6pVSoxyH+kIulF9inMH\n2TM=\n"
            java.lang.String r6 = "aYx6yTAJ4xw=\n"
            java.lang.String r5 = "com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI"     // Catch: java.lang.Throwable -> L10bd
            r4.setClassName(r2, r5)     // Catch: java.lang.Throwable -> L10bd
            java.lang.String r5 = "mpEkD1NZRQ2MjS8J\n"
            java.lang.String r6 = "2f5KezI6MVI=\n"
            java.lang.String r5 = "Contact_User"     // Catch: java.lang.Throwable -> L10bd
            r4.putExtra(r5, r3)     // Catch: java.lang.Throwable -> L10bd
            r2.startActivity(r4)     // Catch: java.lang.Throwable -> L10bd
            r2 = 1630635(0x18e1ab, float:2.285006E-39)
        L10b1:
            r3 = 1630652(0x18e1bc, float:2.28503E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 23: goto L10b9;
                case 118: goto L10;
                default: goto L10b8;
            }
        L10b8:
            goto L10b1
        L10b9:
            r2 = 1630666(0x18e1ca, float:2.28505E-39)
            goto L10b1
        L10bd:
            r3 = move-exception
            java.lang.String r3 = "Nwje\n"
            java.lang.String r4 = "Q2m5jaPP2Zc=\n"
            java.lang.String r5 = "cQFlwA8825NJCWbLKjv5llgS\n"
            java.lang.String r6 = "PWAQrmxUlfI=\n"
            java.lang.String r5 = "LaunchNativeFolder"
            java.lang.String r6 = "Fg==\n"
            java.lang.String r7 = "c8HJlSTQVfc=\n"
            defpackage.z30.o(r3, r4, r5, r6, r7)
            java.lang.String r3 = "x8yc9vGY8966p4yxjKagsbbm66TS4rHlyvam/tmL8t2qpJ+9gIi6vKH/667i4YLz\n"
            java.lang.String r4 = "IkIDEWUHFVQ=\n"
            java.lang.String r3 = "\u539f\u751f\u6298\u53e0\u9875\u5524\u8d77\u5931\u8d25\uff0c\u7248\u672c\u53ef\u80fd\u8fc7\u65e7"
            r4 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r4)
            r2.show()
            r2 = 1630759(0x18e227, float:2.28518E-39)
        L10e4:
            r3 = 1630776(0x18e238, float:2.285204E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 31: goto L10ec;
                case 1769: goto L10;
                default: goto L10eb;
            }
        L10eb:
            goto L10e4
        L10ec:
            r2 = 1631441(0x18e4d1, float:2.286136E-39)
            goto L10e4
        L10f0:
            java.lang.String r2 = "hY5+sf8GgemSiH+p+BuK+4OTZq75EQ==\n"
            java.lang.String r4 = "5uEQx5p08og=\n"
            java.lang.String r2 = "conversationboxservice"
            boolean r4 = r3.equals(r2)
            r2 = 1631534(0x18e52e, float:2.286266E-39)
        L10ff:
            r5 = 1631551(0x18e53f, float:2.28629E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L1107;
                case 83: goto L1132;
                case 114: goto L110d;
                case 180: goto L1111;
                default: goto L1106;
            }
        L1106:
            goto L10ff
        L1107:
            if (r4 != 0) goto L110d
            r2 = 1631627(0x18e58b, float:2.286396E-39)
            goto L10ff
        L110d:
            r2 = 1631596(0x18e56c, float:2.286353E-39)
            goto L10ff
        L1111:
            java.lang.String r2 = "JXsHrfRi82sucRi6\n"
            java.lang.String r4 = "SB503pUFljQ=\n"
            java.lang.String r2 = "message_fold"
            boolean r3 = r3.equals(r2)
            r2 = 1631658(0x18e5aa, float:2.28644E-39)
        L1120:
            r4 = 1631675(0x18e5bb, float:2.286464E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 17: goto L1128;
                case 83: goto L10;
                case 114: goto L112e;
                case 3369: goto L1132;
                default: goto L1127;
            }
        L1127:
            goto L1120
        L1128:
            if (r3 == 0) goto L112e
            r2 = 1632402(0x18e892, float:2.287482E-39)
            goto L1120
        L112e:
            r2 = 1631720(0x18e5e8, float:2.286527E-39)
            goto L1120
        L1132:
            java.lang.String r2 = "3CIk1yWWGA==\n"
            java.lang.String r3 = "4FFBowipJsc=\n"
            "<set-?>"
            java.lang.String r2 = ""
            defpackage.ff.z = r2
            goto L10
        L113f:
            java.lang.String r2 = "h9b4QE0=\n"
            java.lang.String r3 = "97eKISA80Rw=\n"
            java.lang.String r2 = "param"
            r0 = r16
            defpackage.ip.o(r2, r0)
            java.lang.String r2 = defpackage.ff.z
            java.lang.String r3 = "d4s5UivpaYx0sQ==\n"
            java.lang.String r4 = "EO5cOXSPBuA=\n"
            java.lang.String r3 = "geek_fold_"
            r4 = 0
            boolean r3 = defpackage.b50.N(r2, r3, r4)
            r2 = 1632433(0x18e8b1, float:2.287526E-39)
        L115e:
            r4 = 1632450(0x18e8c2, float:2.28755E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 18: goto L1166;
                case 45: goto L10;
                case 115: goto L116a;
                case 460: goto L1170;
                default: goto L1165;
            }
        L1165:
            goto L115e
        L1166:
            r2 = 1632495(0x18e8ef, float:2.287613E-39)
            goto L115e
        L116a:
            if (r3 == 0) goto L1166
            r2 = 1632526(0x18e90e, float:2.287656E-39)
            goto L115e
        L1170:
            java.lang.String r2 = "3CIk1yWWGA==\n"
            java.lang.String r3 = "4FFBowipJsc=\n"
            "<set-?>"
            java.lang.String r2 = ""
            defpackage.ff.z = r2
            goto L10
        L117d:
            java.lang.String r2 = "NEgJan8=\n"
            java.lang.String r3 = "RCl7CxKsDME=\n"
            java.lang.String r2 = "param"
            r0 = r16
            defpackage.ip.o(r2, r0)
            java.lang.String r6 = defpackage.ff.z     // Catch: java.lang.Throwable -> L12df
            java.lang.String r2 = "QahuoFvs3HFCkg==\n"
            java.lang.String r3 = "Js0LywSKsx0=\n"
            java.lang.String r2 = "geek_fold_"     // Catch: java.lang.Throwable -> L12df
            r3 = 0
            boolean r3 = defpackage.b50.N(r6, r2, r3)     // Catch: java.lang.Throwable -> L12df
            r2 = 1632557(0x18e92d, float:2.2877E-39)
        L119c:
            r4 = 1632574(0x18e93e, float:2.287723E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 19: goto L11a4;
                case 85: goto L10;
                case 114: goto L11aa;
                case 180: goto L11ae;
                default: goto L11a3;
            }     // Catch: java.lang.Throwable -> L12df
        L11a3:
            goto L119c
        L11a4:
            if (r3 == 0) goto L11aa
            r2 = 1632650(0x18e98a, float:2.28783E-39)
            goto L119c
        L11aa:
            r2 = 1632619(0x18e96b, float:2.287786E-39)
            goto L119c
        L11ae:
            r0 = r16
            java.lang.Object r2 = r0.thisObject     // Catch: java.lang.Throwable -> L12df
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L12df
            r4 = r2
        L11b7:
            r2 = 1632681(0x18e9a9, float:2.287873E-39)
        L11ba:
            r3 = 1632698(0x18e9ba, float:2.287897E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L11c2;
                case 1323: goto L11cc;
                case 1480: goto L10;
                case 1513: goto L11c8;
                default: goto L11c1;
            }     // Catch: java.lang.Throwable -> L12df
        L11c1:
            goto L11ba
        L11c2:
            if (r4 == 0) goto L11c8
            r2 = 1633425(0x18ec91, float:2.288916E-39)
            goto L11ba
        L11c8:
            r2 = 1633394(0x18ec72, float:2.288873E-39)
            goto L11ba
        L11cc:
            java.lang.String r2 = r4.getName()     // Catch: java.lang.Throwable -> L12df
            java.lang.String r3 = "+C3/4+cp7cX1YsbgoyDv3w==\n"
            java.lang.String r5 = "kkyJgslFjKs=\n"
            java.lang.String r3 = "java.lang.Object"     // Catch: java.lang.Throwable -> L12df
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> L12df
            r2 = 1633456(0x18ecb0, float:2.28896E-39)
        L11df:
            r5 = 1633473(0x18ecc1, float:2.288983E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 14: goto L11e7;
                case 47: goto L10;
                case 113: goto L11eb;
                case 460: goto L11f1;
                default: goto L11e6;
            }     // Catch: java.lang.Throwable -> L12df
        L11e6:
            goto L11df
        L11e7:
            r2 = 1633518(0x18ecee, float:2.289046E-39)
            goto L11df
        L11eb:
            if (r3 != 0) goto L11e7
            r2 = 1633549(0x18ed0d, float:2.28909E-39)
            goto L11df
        L11f1:
            java.lang.reflect.Field[] r2 = r4.getDeclaredFields()     // Catch: java.lang.Throwable -> L12df
            i r7 = defpackage.a80.q(r2)     // Catch: java.lang.Throwable -> L12df
        L11f9:
            boolean r3 = r7.hasNext()     // Catch: java.lang.Throwable -> L12df
            r2 = 1633580(0x18ed2c, float:2.289133E-39)
        L1200:
            r5 = 1633597(0x18ed3d, float:2.289157E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L1208;
                case 87: goto L12c9;
                case 118: goto L120e;
                case 7465: goto L1212;
                default: goto L1207;
            }     // Catch: java.lang.Throwable -> L12df
        L1207:
            goto L1200
        L1208:
            if (r3 == 0) goto L120e
            r2 = 1634324(0x18f014, float:2.290176E-39)
            goto L1200
        L120e:
            r2 = 1633642(0x18ed6a, float:2.28922E-39)
            goto L1200
        L1212:
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L12df
            r0 = r2
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> L12df
            r3 = r0
            java.lang.Class r2 = r3.getType()     // Catch: java.lang.Throwable -> L12df
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r5 = defpackage.ip.i(r2, r5)     // Catch: java.lang.Throwable -> L12df
            r2 = 1634355(0x18f033, float:2.290219E-39)
        L1227:
            r8 = 1634372(0x18f044, float:2.290243E-39)
            r2 = r2 ^ r8
            switch(r2) {
                case 22: goto L122f;
                case 53: goto L11f9;
                case 119: goto L1233;
                case 212: goto L1239;
                default: goto L122e;
            }     // Catch: java.lang.Throwable -> L12df
        L122e:
            goto L1227
        L122f:
            r2 = 1634417(0x18f071, float:2.290306E-39)
            goto L1227
        L1233:
            if (r5 == 0) goto L122f
            r2 = 1634448(0x18f090, float:2.29035E-39)
            goto L1227
        L1239:
            r2 = 1
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L12df
            r0 = r16
            java.lang.Object r2 = r0.thisObject     // Catch: java.lang.Throwable -> L12df
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L12df
            boolean r8 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L12df
            r5 = 1634479(0x18f0af, float:2.290393E-39)
        L124a:
            r9 = 1634496(0x18f0c0, float:2.290417E-39)
            r5 = r5 ^ r9
            switch(r5) {
                case 14: goto L1252;
                case 45: goto L1289;
                case 111: goto L1256;
                case 460: goto L125c;
                default: goto L1251;
            }     // Catch: java.lang.Throwable -> L12df
        L1251:
            goto L124a
        L1252:
            r5 = 1634541(0x18f0ed, float:2.29048E-39)
            goto L124a
        L1256:
            if (r8 == 0) goto L1252
            r5 = 1634572(0x18f10c, float:2.290523E-39)
            goto L124a
        L125c:
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L12df
            r5 = 1634603(0x18f12b, float:2.290567E-39)
        L1261:
            r8 = 1634620(0x18f13c, float:2.29059E-39)
            r5 = r5 ^ r8
            switch(r5) {
                case 23: goto L1269;
                case 745: goto L126d;
                default: goto L1268;
            }     // Catch: java.lang.Throwable -> L12df
        L1268:
            goto L1261
        L1269:
            r5 = 1635285(0x18f3d5, float:2.291522E-39)
            goto L1261
        L126d:
            r5 = r2
        L126e:
            java.lang.String r2 = "rj6LPaxz3eq5OIolq27W+KgjkyKqZA==\n"
            java.lang.String r8 = "zVHlS8kBros=\n"
            java.lang.String r2 = "conversationboxservice"     // Catch: java.lang.Throwable -> L12df
            boolean r8 = defpackage.ip.i(r5, r2)     // Catch: java.lang.Throwable -> L12df
            r2 = 1635378(0x18f432, float:2.291653E-39)
        L127d:
            r9 = 1635395(0x18f443, float:2.291677E-39)
            r2 = r2 ^ r9
            switch(r2) {
                case 18: goto L1285;
                case 51: goto L12b3;
                case 113: goto L128c;
                case 204: goto L1292;
                default: goto L1284;
            }     // Catch: java.lang.Throwable -> L12df
        L1284:
            goto L127d
        L1285:
            r2 = 1635440(0x18f470, float:2.29174E-39)
            goto L127d
        L1289:
            r2 = 0
            r5 = r2
            goto L126e
        L128c:
            if (r8 != 0) goto L1285
            r2 = 1635471(0x18f48f, float:2.291783E-39)
            goto L127d
        L1292:
            java.lang.String r2 = "cqvLvQmkddJ5odSq\n"
            java.lang.String r8 = "H864zmjDEI0=\n"
            java.lang.String r2 = "message_fold"     // Catch: java.lang.Throwable -> L12df
            boolean r5 = defpackage.ip.i(r5, r2)     // Catch: java.lang.Throwable -> L12df
            r2 = 1635502(0x18f4ae, float:2.291826E-39)
        L12a1:
            r8 = 1635519(0x18f4bf, float:2.29185E-39)
            r2 = r2 ^ r8
            switch(r2) {
                case 17: goto L12a9;
                case 83: goto L11f9;
                case 114: goto L12af;
                case 111316: goto L12b3;
                default: goto L12a8;
            }     // Catch: java.lang.Throwable -> L12df
        L12a8:
            goto L12a1
        L12a9:
            if (r5 == 0) goto L12af
            r2 = 1656427(0x19466b, float:2.321149E-39)
            goto L12a1
        L12af:
            r2 = 1635564(0x18f4ec, float:2.291913E-39)
            goto L12a1
        L12b3:
            r0 = r16
            java.lang.Object r2 = r0.thisObject     // Catch: java.lang.Throwable -> L12df
            r3.set(r2, r6)     // Catch: java.lang.Throwable -> L12df
            r2 = 1656458(0x19468a, float:2.321192E-39)
        L12bd:
            r3 = 1656475(0x19469b, float:2.321216E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L12c5;
                case 50: goto L11f9;
                default: goto L12c4;
            }     // Catch: java.lang.Throwable -> L12df
        L12c4:
            goto L12bd
        L12c5:
            r2 = 1656489(0x1946a9, float:2.321235E-39)
            goto L12bd
        L12c9:
            java.lang.Class r2 = r4.getSuperclass()     // Catch: java.lang.Throwable -> L12df
            r3 = 1656582(0x194706, float:2.321366E-39)
        L12d0:
            r4 = 1656599(0x194717, float:2.32139E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto L12d8;
                case 50: goto L12dc;
                default: goto L12d7;
            }
        L12d7:
            goto L12d0
        L12d8:
            r3 = 1656613(0x194725, float:2.321409E-39)
            goto L12d0
        L12dc:
            r4 = r2
            goto L11b7
        L12df:
            r2 = move-exception
            java.lang.String r2 = "Nwje\n"
            java.lang.String r3 = "Q2m5jaPP2Zc=\n"
            java.lang.String r4 = "XtJuuaez/Mp31l2UnJPA83HYdQ==\n"
            java.lang.String r5 = "GL0C3fL6tKU=\n"
            java.lang.String r4 = "FoldUIHook_InitView"
            java.lang.String r5 = "Fg==\n"
            java.lang.String r6 = "c8HJlSTQVfc=\n"
            defpackage.z30.o(r2, r3, r4, r5, r6)
            goto L10
        L12f5:
            java.lang.String r2 = "SxtBLLo=\n"
            java.lang.String r3 = "O3ozTddsdR0=\n"
            java.lang.String r2 = "param"
            r0 = r16
            defpackage.ip.o(r2, r0)
            r0 = r16
            java.lang.Object[] r5 = r0.args
            java.lang.String r2 = "kXVj/g==\n"
            java.lang.String r3 = "8AcEjWoBYAs=\n"
            java.lang.String r2 = "args"
            defpackage.ip.n(r2, r5)
            int r6 = r5.length
            r2 = 0
            r3 = r2
        L1314:
            r2 = 1656706(0x194782, float:2.32154E-39)
        L1317:
            r4 = 1656723(0x194793, float:2.321563E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 17: goto L131f;
                case 3519: goto L1325;
                case 3544: goto L13b8;
                case 3577: goto L1329;
                default: goto L131e;
            }
        L131e:
            goto L1317
        L131f:
            if (r3 >= r6) goto L1325
            r2 = 1657450(0x194a6a, float:2.322582E-39)
            goto L1317
        L1325:
            r2 = 1657419(0x194a4b, float:2.322539E-39)
            goto L1317
        L1329:
            r2 = r5[r3]
            boolean r7 = r2 instanceof java.lang.String
            r4 = 1657481(0x194a89, float:2.322626E-39)
        L1330:
            r8 = 1657498(0x194a9a, float:2.32265E-39)
            r4 = r4 ^ r8
            switch(r4) {
                case 19: goto L1338;
                case 50: goto L133e;
                case 93: goto L13a4;
                case 124: goto L1342;
                default: goto L1337;
            }
        L1337:
            goto L1330
        L1338:
            if (r7 == 0) goto L133e
            r4 = 1657574(0x194ae6, float:2.322756E-39)
            goto L1330
        L133e:
            r4 = 1657543(0x194ac7, float:2.322712E-39)
            goto L1330
        L1342:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = defpackage.b50.T(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "XNoKr8dh\n"
            java.lang.String r7 = "L79myqQVnR0=\n"
            java.lang.String r4 = "select"
            r7 = 1
            boolean r4 = defpackage.b50.N(r2, r4, r7)
            r2 = 1657605(0x194b05, float:2.3228E-39)
        L1360:
            r7 = 1657622(0x194b16, float:2.322823E-39)
            r2 = r2 ^ r7
            switch(r2) {
                case 19: goto L1368;
                case 50: goto L136e;
                case 85: goto L13a4;
                case 1787: goto L1372;
                default: goto L1367;
            }
        L1367:
            goto L1360
        L1368:
            if (r4 == 0) goto L136e
            r2 = 1658349(0x194ded, float:2.323842E-39)
            goto L1360
        L136e:
            r2 = 1657667(0x194b43, float:2.322886E-39)
            goto L1360
        L1372:
            r2 = 1658380(0x194e0c, float:2.323885E-39)
        L1375:
            r4 = 1658397(0x194e1d, float:2.323909E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 17: goto L137d;
                case 54: goto L1381;
                default: goto L137c;
            }
        L137c:
            goto L1375
        L137d:
            r2 = 1658411(0x194e2b, float:2.323929E-39)
            goto L1375
        L1381:
            r5 = r3
        L1382:
            r0 = r16
            java.lang.Object[] r4 = r0.args
            java.lang.String r2 = "2eZsHw==\n"
            java.lang.String r3 = "uJQLbJSw6Iw=\n"
            java.lang.String r2 = "args"
            defpackage.ip.n(r2, r4)
            int r6 = r4.length
            r2 = 0
        L1393:
            r3 = 1658628(0x194f04, float:2.324233E-39)
        L1396:
            r7 = 1658645(0x194f15, float:2.324257E-39)
            r3 = r3 ^ r7
            switch(r3) {
                case 17: goto L139e;
                case 7867: goto L13bb;
                case 7896: goto L1428;
                case 7929: goto L13bf;
                default: goto L139d;
            }
        L139d:
            goto L1396
        L139e:
            if (r2 >= r6) goto L13bb
            r3 = 1659372(0x1951ec, float:2.325275E-39)
            goto L1396
        L13a4:
            int r2 = r3 + 1
            r3 = 1658504(0x194e88, float:2.324059E-39)
        L13a9:
            r4 = 1658521(0x194e99, float:2.324083E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto L13b1;
                case 62: goto L13b5;
                default: goto L13b0;
            }
        L13b0:
            goto L13a9
        L13b1:
            r3 = 1658535(0x194ea7, float:2.324103E-39)
            goto L13a9
        L13b5:
            r3 = r2
            goto L1314
        L13b8:
            r3 = -1
            r5 = r3
            goto L1382
        L13bb:
            r3 = 1659341(0x1951cd, float:2.325232E-39)
            goto L1396
        L13bf:
            r7 = r4[r2]
            r3 = 1659403(0x19520b, float:2.325319E-39)
        L13c4:
            r8 = 1659420(0x19521c, float:2.325343E-39)
            r3 = r3 ^ r8
            switch(r3) {
                case 23: goto L13cc;
                case 54: goto L13d2;
                case 85: goto L1415;
                case 116: goto L13d6;
                default: goto L13cb;
            }
        L13cb:
            goto L13c4
        L13cc:
            if (r7 == 0) goto L13d2
            r3 = 1659496(0x195268, float:2.325449E-39)
            goto L13c4
        L13d2:
            r3 = 1659465(0x195249, float:2.325406E-39)
            goto L13c4
        L13d6:
            java.lang.Class r3 = r7.getClass()
            boolean r7 = r3.isArray()
            r3 = 1659527(0x195287, float:2.325493E-39)
        L13e1:
            r8 = 1659544(0x195298, float:2.325516E-39)
            r3 = r3 ^ r8
            switch(r3) {
                case 31: goto L13e9;
                case 62: goto L13ef;
                case 93: goto L1415;
                case 2039: goto L13f3;
                default: goto L13e8;
            }
        L13e8:
            goto L13e1
        L13e9:
            if (r7 == 0) goto L13ef
            r3 = 1660271(0x19556f, float:2.326535E-39)
            goto L13e1
        L13ef:
            r3 = 1659589(0x1952c5, float:2.32558E-39)
            goto L13e1
        L13f3:
            r3 = 1660302(0x19558e, float:2.326579E-39)
        L13f6:
            r4 = 1660319(0x19559f, float:2.326602E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto L13fe;
                case 50: goto L1402;
                default: goto L13fd;
            }
        L13fd:
            goto L13f6
        L13fe:
            r3 = 1660333(0x1955ad, float:2.326622E-39)
            goto L13f6
        L1402:
            r3 = r2
        L1403:
            r2 = 1660550(0x195686, float:2.326926E-39)
        L1406:
            r4 = 1660567(0x195697, float:2.32695E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 17: goto L140e;
                case 4007: goto L142b;
                case 4056: goto L143e;
                case 4089: goto L142f;
                default: goto L140d;
            }
        L140d:
            goto L1406
        L140e:
            r2 = -1
            if (r5 != r2) goto L142b
            r2 = 1661294(0x19596e, float:2.327969E-39)
            goto L1406
        L1415:
            int r2 = 0 - r2
            int r2 = 1 - r2
            r3 = 1660426(0x19560a, float:2.326752E-39)
        L141c:
            r7 = 1660443(0x19561b, float:2.326776E-39)
            r3 = r3 ^ r7
            switch(r3) {
                case 17: goto L1424;
                case 50: goto L1393;
                default: goto L1423;
            }
        L1423:
            goto L141c
        L1424:
            r3 = 1660457(0x195629, float:2.326796E-39)
            goto L141c
        L1428:
            r2 = -1
            r3 = r2
            goto L1403
        L142b:
            r2 = 1661263(0x19594f, float:2.327925E-39)
            goto L1406
        L142f:
            r2 = 1661325(0x19598d, float:2.328012E-39)
        L1432:
            r3 = 1661342(0x19599e, float:2.328036E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L143a;
                case 50: goto L10;
                default: goto L1439;
            }
        L1439:
            goto L1432
        L143a:
            r2 = 1661356(0x1959ac, float:2.328056E-39)
            goto L1432
        L143e:
            r0 = r16
            java.lang.Object[] r2 = r0.args
            r2 = r2[r5]
            java.lang.String r4 = "I+hyUThUNXwj8modelJ0cSzuah1sWHR8IvMzU21bODI55G5YOFw7ZiH0cBNLQyZ7I/o=\n"
            java.lang.String r6 = "TZ0ePRg3VBI=\n"
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            defpackage.ip.m(r4, r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "sQIZEfoH1vjtDx8c5QjU4aY=\n"
            java.lang.String r6 = "w2F2f45mtYw=\n"
            java.lang.String r4 = "rcontact.nickname"
            r6 = 1
            boolean r6 = defpackage.b50.B(r2, r4, r6)
            r4 = 1661449(0x195a09, float:2.328186E-39)
        L1461:
            r7 = 1661466(0x195a1a, float:2.32821E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 19: goto L1469;
                case 50: goto L146f;
                case 93: goto L14ca;
                case 1771: goto L1473;
                default: goto L1468;
            }
        L1468:
            goto L1461
        L1469:
            if (r6 != 0) goto L146f
            r4 = 1662193(0x195cf1, float:2.329228E-39)
            goto L1461
        L146f:
            r4 = 1661511(0x195a47, float:2.328273E-39)
            goto L1461
        L1473:
            java.lang.String r4 = "ZhYIs32EXMlwVxOlM557wHo=\n"
            java.lang.String r6 = "Fnd61hPwDqw=\n"
            java.lang.String r4 = "parentRef is null"
            r6 = 1
            boolean r6 = defpackage.b50.B(r2, r4, r6)
            r4 = 1662224(0x195d10, float:2.329272E-39)
        L1483:
            r7 = 1662241(0x195d21, float:2.329296E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 14: goto L148b;
                case 49: goto L148f;
                case 76: goto L1495;
                case 111: goto L14a4;
                default: goto L148a;
            }
        L148a:
            goto L1483
        L148b:
            r4 = 1662286(0x195d4e, float:2.329359E-39)
            goto L1483
        L148f:
            if (r6 == 0) goto L148b
            r4 = 1662317(0x195d6d, float:2.329402E-39)
            goto L1483
        L1495:
            r4 = 1662348(0x195d8c, float:2.329446E-39)
        L1498:
            r6 = 1662365(0x195d9d, float:2.32947E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto L14a0;
                case 54: goto L14ca;
                default: goto L149f;
            }
        L149f:
            goto L1498
        L14a0:
            r4 = 1662379(0x195dab, float:2.329489E-39)
            goto L1498
        L14a4:
            r4 = 0
            r6 = 1662472(0x195e08, float:2.32962E-39)
        L14a8:
            r7 = 1662489(0x195e19, float:2.329643E-39)
            r6 = r6 ^ r7
            switch(r6) {
                case 17: goto L14b0;
                case 16043: goto L14b4;
                default: goto L14af;
            }
        L14af:
            goto L14a8
        L14b0:
            r6 = 1663154(0x1960b2, float:2.330575E-39)
            goto L14a8
        L14b4:
            r6 = r4
        L14b5:
            java.lang.String r4 = defpackage.ff.z
            int r7 = r4.length()
            r4 = 1663247(0x19610f, float:2.330705E-39)
        L14be:
            r8 = 1663264(0x196120, float:2.330729E-39)
            r4 = r4 ^ r8
            switch(r4) {
                case 14: goto L14c6;
                case 47: goto L14cd;
                case 76: goto L14d3;
                case 109: goto L166f;
                default: goto L14c5;
            }
        L14c5:
            goto L14be
        L14c6:
            r4 = 1663309(0x19614d, float:2.330792E-39)
            goto L14be
        L14ca:
            r4 = 1
            r6 = r4
            goto L14b5
        L14cd:
            if (r7 <= 0) goto L14c6
            r4 = 1663340(0x19616c, float:2.330836E-39)
            goto L14be
        L14d3:
            r4 = 1663371(0x19618b, float:2.330879E-39)
        L14d6:
            r7 = 1663388(0x19619c, float:2.330903E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 23: goto L14de;
                case 54: goto L14e4;
                case 85: goto L166f;
                case 1519: goto L14e8;
                default: goto L14dd;
            }
        L14dd:
            goto L14d6
        L14de:
            if (r6 != 0) goto L14e4
            r4 = 1664115(0x196473, float:2.331922E-39)
            goto L14d6
        L14e4:
            r4 = 1663433(0x1961c9, float:2.330966E-39)
            goto L14d6
        L14e8:
            java.lang.String r4 = "ibhIFB7929SevkkMGeDQxo+lUAsY6g==\n"
            java.lang.String r7 = "6tcmYnuPqLU=\n"
            java.lang.String r4 = "conversationboxservice"
            r7 = 0
            boolean r7 = defpackage.b50.B(r2, r4, r7)
            r4 = 1664146(0x196492, float:2.331965E-39)
        L14f8:
            r8 = 1664163(0x1964a3, float:2.331989E-39)
            r4 = r4 ^ r8
            switch(r4) {
                case 18: goto L1500;
                case 49: goto L1504;
                case 76: goto L150a;
                case 115: goto L155e;
                default: goto L14ff;
            }
        L14ff:
            goto L14f8
        L1500:
            r4 = 1664208(0x1964d0, float:2.332052E-39)
            goto L14f8
        L1504:
            if (r7 != 0) goto L1500
            r4 = 1664239(0x1964ef, float:2.332096E-39)
            goto L14f8
        L150a:
            java.lang.String r4 = "PYkSATyXG+g2gw0W\n"
            java.lang.String r7 = "UOxhcl3wfrc=\n"
            java.lang.String r4 = "message_fold"
            r7 = 0
            boolean r7 = defpackage.b50.B(r2, r4, r7)
            r4 = 1664270(0x19650e, float:2.332139E-39)
        L151a:
            r8 = 1664287(0x19651f, float:2.332163E-39)
            r4 = r4 ^ r8
            switch(r4) {
                case 17: goto L1522;
                case 50: goto L1528;
                case 83: goto L153b;
                case 116: goto L152c;
                default: goto L1521;
            }
        L1521:
            goto L151a
        L1522:
            if (r7 == 0) goto L1528
            r4 = 1664363(0x19656b, float:2.33227E-39)
            goto L151a
        L1528:
            r4 = 1664332(0x19654c, float:2.332226E-39)
            goto L151a
        L152c:
            r4 = 1664394(0x19658a, float:2.332313E-39)
        L152f:
            r7 = 1664411(0x19659b, float:2.332337E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 17: goto L1537;
                case 3503: goto L155e;
                default: goto L1536;
            }
        L1536:
            goto L152f
        L1537:
            r4 = 1665076(0x196834, float:2.333268E-39)
            goto L152f
        L153b:
            r4 = 0
            r7 = 1665169(0x196891, float:2.333399E-39)
        L153f:
            r8 = 1665186(0x1968a2, float:2.333423E-39)
            r7 = r7 ^ r8
            switch(r7) {
                case 18: goto L1547;
                case 51: goto L155a;
                default: goto L1546;
            }
        L1546:
            goto L153f
        L1547:
            r7 = r4
        L1548:
            r4 = 1665293(0x19690d, float:2.333573E-39)
        L154b:
            r8 = 1665310(0x19691e, float:2.333596E-39)
            r4 = r4 ^ r8
            switch(r4) {
                case 19: goto L1553;
                case 50: goto L1583;
                case 85: goto L164b;
                case 54228: goto L1587;
                default: goto L1552;
            }
        L1552:
            goto L154b
        L1553:
            r4 = -1
            if (r3 == r4) goto L1583
            r4 = 1686218(0x19baca, float:2.362895E-39)
            goto L154b
        L155a:
            r7 = 1665200(0x1968b0, float:2.333442E-39)
            goto L153f
        L155e:
            java.lang.String r4 = "IWaXT7TQn1w2YJZXs82UTid7j1Cyxw==\n"
            java.lang.String r7 = "Qgn5OdGi7D0=\n"
            java.lang.String r4 = "conversationboxservice"
            java.lang.String r7 = defpackage.ff.z
            java.lang.String r4 = defpackage.b50.L(r2, r4, r7)
            java.lang.String r7 = "Tjj3zlnFHdRFMujZ\n"
            java.lang.String r8 = "I12EvTiieIs=\n"
            java.lang.String r7 = "message_fold"
            java.lang.String r8 = defpackage.ff.z
            java.lang.String r4 = defpackage.b50.L(r4, r7, r8)
            r0 = r16
            java.lang.Object[] r7 = r0.args
            r7[r5] = r4
            r4 = 1
            r7 = r4
            goto L1548
        L1583:
            r4 = 1665355(0x19694b, float:2.33366E-39)
            goto L154b
        L1587:
            r0 = r16
            java.lang.Object[] r4 = r0.args
            r4 = r4[r3]
            boolean r8 = r4 instanceof java.lang.Object[]
            r3 = 1686249(0x19bae9, float:2.362938E-39)
        L1592:
            r9 = 1686266(0x19bafa, float:2.362962E-39)
            r3 = r3 ^ r9
            switch(r3) {
                case 19: goto L159a;
                case 444: goto L15a4;
                case 477: goto L164b;
                case 498: goto L15a0;
                default: goto L1599;
            }
        L1599:
            goto L1592
        L159a:
            if (r8 == 0) goto L15a0
            r3 = 1686342(0x19bb46, float:2.363068E-39)
            goto L1592
        L15a0:
            r3 = 1686311(0x19bb27, float:2.363025E-39)
            goto L1592
        L15a4:
            r3 = r4
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r11 = r3.length
            r8 = 0
            r9 = r7
        L15aa:
            r7 = 1686373(0x19bb65, float:2.363112E-39)
        L15ad:
            r10 = 1686390(0x19bb76, float:2.363136E-39)
            r7 = r7 ^ r10
            switch(r7) {
                case 19: goto L15b5;
                case 180: goto L15bf;
                case 213: goto L164a;
                case 242: goto L15bb;
                default: goto L15b4;
            }
        L15b4:
            goto L15ad
        L15b5:
            if (r8 >= r11) goto L15bb
            r7 = 1686466(0x19bbc2, float:2.363242E-39)
            goto L15ad
        L15bb:
            r7 = 1686435(0x19bba3, float:2.363199E-39)
            goto L15ad
        L15bf:
            r10 = r3[r8]
            r7 = 1686497(0x19bbe1, float:2.363286E-39)
        L15c4:
            r12 = 1686514(0x19bbf2, float:2.36331E-39)
            r7 = r7 ^ r12
            switch(r7) {
                case 19: goto L15cc;
                case 1339: goto L15d6;
                case 1368: goto L15e9;
                case 1401: goto L15d2;
                default: goto L15cb;
            }
        L15cb:
            goto L15c4
        L15cc:
            if (r10 == 0) goto L15d2
            r7 = 1687241(0x19bec9, float:2.364328E-39)
            goto L15c4
        L15d2:
            r7 = 1687210(0x19beaa, float:2.364285E-39)
            goto L15c4
        L15d6:
            java.lang.String r7 = r10.toString()
            r10 = 1687272(0x19bee8, float:2.364372E-39)
        L15dd:
            r12 = 1687289(0x19bef9, float:2.364395E-39)
            r10 = r10 ^ r12
            switch(r10) {
                case 17: goto L15e5;
                case 510: goto L15ea;
                default: goto L15e4;
            }
        L15e4:
            goto L15dd
        L15e5:
            r10 = 1687303(0x19bf07, float:2.364415E-39)
            goto L15dd
        L15e9:
            r7 = 0
        L15ea:
            java.lang.String r10 = "snnV+c2isEClf9Thyr+7UrRkzebLtQ==\n"
            java.lang.String r12 = "0Ra7j6jQwyE=\n"
            java.lang.String r10 = "conversationboxservice"
            boolean r12 = defpackage.ip.i(r7, r10)
            r10 = 1687396(0x19bf64, float:2.364545E-39)
        L15f9:
            r13 = 1687413(0x19bf75, float:2.364569E-39)
            r10 = r10 ^ r13
            switch(r10) {
                case 17: goto L1601;
                case 215: goto L162c;
                case 246: goto L1607;
                case 32057: goto L160b;
                default: goto L1600;
            }
        L1600:
            goto L15f9
        L1601:
            if (r12 != 0) goto L1607
            r10 = 1688140(0x19c24c, float:2.365588E-39)
            goto L15f9
        L1607:
            r10 = 1687458(0x19bfa2, float:2.364632E-39)
            goto L15f9
        L160b:
            java.lang.String r10 = "kSr32LDzxAyaIOjP\n"
            java.lang.String r12 = "/E+Eq9GUoVM=\n"
            java.lang.String r10 = "message_fold"
            boolean r10 = defpackage.ip.i(r7, r10)
            r7 = 1688171(0x19c26b, float:2.365631E-39)
        L161a:
            r12 = 1688188(0x19c27c, float:2.365655E-39)
            r7 = r7 ^ r12
            switch(r7) {
                case 23: goto L1622;
                case 180: goto L162c;
                case 213: goto L1632;
                case 246: goto L1628;
                default: goto L1621;
            }
        L1621:
            goto L161a
        L1622:
            if (r10 == 0) goto L1628
            r7 = 1688264(0x19c2c8, float:2.365762E-39)
            goto L161a
        L1628:
            r7 = 1688233(0x19c2a9, float:2.365718E-39)
            goto L161a
        L162c:
            java.lang.String r7 = defpackage.ff.z     // Catch: java.lang.Throwable -> L1ad9
            java.lang.reflect.Array.set(r4, r8, r7)     // Catch: java.lang.Throwable -> L1ad9
            r9 = 1
        L1632:
            int r7 = 0 - r8
            int r7 = r7 + (-1)
            int r7 = 0 - r7
            r8 = 1688295(0x19c2e7, float:2.365805E-39)
        L163b:
            r10 = 1688312(0x19c2f8, float:2.365829E-39)
            r8 = r8 ^ r10
            switch(r8) {
                case 31: goto L1643;
                case 510: goto L1647;
                default: goto L1642;
            }
        L1642:
            goto L163b
        L1643:
            r8 = 1688326(0x19c306, float:2.365849E-39)
            goto L163b
        L1647:
            r8 = r7
            goto L15aa
        L164a:
            r7 = r9
        L164b:
            r3 = 1688419(0x19c363, float:2.365979E-39)
        L164e:
            r4 = 1688436(0x19c374, float:2.366003E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 23: goto L1656;
                case 1343: goto L1660;
                case 1368: goto L166f;
                case 1401: goto L165c;
                default: goto L1655;
            }
        L1655:
            goto L164e
        L1656:
            if (r7 == 0) goto L165c
            r3 = 1689163(0x19c64b, float:2.367022E-39)
            goto L164e
        L165c:
            r3 = 1689132(0x19c62c, float:2.366978E-39)
            goto L164e
        L1660:
            r2 = 1689194(0x19c66a, float:2.367065E-39)
        L1663:
            r3 = 1689211(0x19c67b, float:2.367089E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L166b;
                case 242: goto L10;
                default: goto L166a;
            }
        L166a:
            goto L1663
        L166b:
            r2 = 1689225(0x19c689, float:2.367108E-39)
            goto L1663
        L166f:
            r3 = 1689318(0x19c6e6, float:2.367239E-39)
        L1672:
            r4 = 1689335(0x19c6f7, float:2.367263E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto L167a;
                case 467: goto L10;
                case 498: goto L1680;
                case 3897: goto L1684;
                default: goto L1679;
            }
        L1679:
            goto L1672
        L167a:
            if (r6 == 0) goto L1680
            r3 = 1690062(0x19c9ce, float:2.368281E-39)
            goto L1672
        L1680:
            r3 = 1689380(0x19c724, float:2.367326E-39)
            goto L1672
        L1684:
            java.lang.String r3 = "5oqH/dwM\n"
            java.lang.String r4 = "heXyk6gk+d0=\n"
            java.lang.String r3 = "count("
            r4 = 1
            boolean r4 = defpackage.b50.B(r2, r3, r4)
            r3 = 1690093(0x19c9ed, float:2.368325E-39)
        L1694:
            r6 = 1690110(0x19c9fe, float:2.368349E-39)
            r3 = r3 ^ r6
            switch(r3) {
                case 19: goto L169c;
                case 948: goto L16a6;
                case 981: goto L10;
                case 1010: goto L16a2;
                default: goto L169b;
            }
        L169b:
            goto L1694
        L169c:
            if (r4 != 0) goto L16a2
            r3 = 1690186(0x19ca4a, float:2.368455E-39)
            goto L1694
        L16a2:
            r3 = 1690155(0x19ca2b, float:2.368412E-39)
            goto L1694
        L16a6:
            gn r3 = defpackage.gn.a
            java.lang.String r4 = "xVqGa8MYQ0vnTbB56xQ=\n"
            java.lang.String r6 = "gj/jAIV3Ly8=\n"
            java.lang.String r4 = "GeekFolderSync"
            j9 r6 = new j9
            r7 = 2
            r0 = r16
            r6.<init>(r0, r7)
            r3.getClass()
            defpackage.gn.j(r4, r6)
            java.lang.String r3 = "IJMHDePQkYYuhA0z9NaQnhSRDD31z5aeLA==\n"
            java.lang.String r4 = "S/Z+UoC///A=\n"
            java.lang.String r3 = "key_conversation_grouping"
            boolean r4 = defpackage.gn.e(r3)
            r3 = 1690217(0x19ca69, float:2.368498E-39)
        L16cd:
            r6 = 1690234(0x19ca7a, float:2.368522E-39)
            r3 = r3 ^ r6
            switch(r3) {
                case 19: goto L16d5;
                case 188: goto L16df;
                case 221: goto L16ee;
                case 242: goto L16db;
                default: goto L16d4;
            }
        L16d4:
            goto L16cd
        L16d5:
            if (r4 != 0) goto L16db
            r3 = 1690310(0x19cac6, float:2.368629E-39)
            goto L16cd
        L16db:
            r3 = 1690279(0x19caa7, float:2.368585E-39)
            goto L16cd
        L16df:
            r2 = 1690341(0x19cae5, float:2.368672E-39)
        L16e2:
            r3 = 1690358(0x19caf6, float:2.368696E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L16ea;
                case 1913: goto L10;
                default: goto L16e9;
            }
        L16e9:
            goto L16e2
        L16ea:
            r2 = 1691023(0x19cd8f, float:2.369628E-39)
            goto L16e2
        L16ee:
            java.util.ArrayList r4 = defpackage.zt.K()
            int r6 = defpackage.ff.y
            int r7 = r4.size()
            r3 = 1691116(0x19cdec, float:2.369758E-39)
        L16fb:
            r8 = 1691133(0x19cdfd, float:2.369782E-39)
            r3 = r3 ^ r8
            switch(r3) {
                case 17: goto L1703;
                case 948: goto L170d;
                case 983: goto L171c;
                case 1014: goto L1709;
                default: goto L1702;
            }
        L1702:
            goto L16fb
        L1703:
            if (r6 < r7) goto L1709
            r3 = 1691209(0x19ce49, float:2.369889E-39)
            goto L16fb
        L1709:
            r3 = 1691178(0x19ce2a, float:2.369845E-39)
            goto L16fb
        L170d:
            r2 = 1691240(0x19ce68, float:2.369932E-39)
        L1710:
            r3 = 1691257(0x19ce79, float:2.369956E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L1718;
                case 254: goto L10;
                default: goto L1717;
            }
        L1717:
            goto L1710
        L1718:
            r2 = 1691271(0x19ce87, float:2.369975E-39)
            goto L1710
        L171c:
            int r3 = defpackage.ff.y
            java.lang.Object r3 = r4.get(r3)
            s50 r3 = (defpackage.s50) r3
            java.lang.String r4 = r3.b
            java.lang.String r6 = "KI0U\n"
            java.lang.String r7 = "SeF4cnAlR3k=\n"
            java.lang.String r6 = "all"
            boolean r6 = defpackage.ip.i(r4, r6)
            r4 = 1692015(0x19d16f, float:2.371018E-39)
        L1735:
            r7 = 1692032(0x19d180, float:2.371042E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 14: goto L173d;
                case 45: goto L1756;
                case 76: goto L1747;
                case 239: goto L1741;
                default: goto L173c;
            }
        L173c:
            goto L1735
        L173d:
            r4 = 1692077(0x19d1ad, float:2.371105E-39)
            goto L1735
        L1741:
            if (r6 == 0) goto L173d
            r4 = 1692108(0x19d1cc, float:2.371148E-39)
            goto L1735
        L1747:
            r2 = 1692139(0x19d1eb, float:2.371192E-39)
        L174a:
            r3 = 1692156(0x19d1fc, float:2.371216E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 23: goto L1752;
                case 1014: goto L10;
                default: goto L1751;
            }
        L1751:
            goto L174a
        L1752:
            r2 = 1692170(0x19d20a, float:2.371235E-39)
            goto L174a
        L1756:
            java.lang.String r6 = r3.b
            java.lang.String r3 = ""
            java.lang.String r4 = "WT6KDI7SsQ5UGoER\n"
            java.lang.String r7 = "OlHkaOem2GE=\n"
            java.lang.String r4 = "conditionKey"
            defpackage.ip.o(r4, r6)
            java.lang.String r4 = "IyXs\n"
            java.lang.String r7 = "QkmACuf1rLk=\n"
            java.lang.String r4 = "all"
            boolean r7 = r6.equals(r4)
            r4 = 1692263(0x19d267, float:2.371366E-39)
        L1774:
            r8 = 1692280(0x19d278, float:2.37139E-39)
            r4 = r4 ^ r8
            switch(r4) {
                case 31: goto L177c;
                case 1847: goto L1786;
                case 1864: goto L17ab;
                case 1897: goto L1782;
                default: goto L177b;
            }
        L177b:
            goto L1774
        L177c:
            if (r7 == 0) goto L1782
            r4 = 1693007(0x19d54f, float:2.372408E-39)
            goto L1774
        L1782:
            r4 = 1692976(0x19d530, float:2.372365E-39)
            goto L1774
        L1786:
            r4 = 1693038(0x19d56e, float:2.372452E-39)
        L1789:
            r6 = 1693055(0x19d57f, float:2.372475E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto L1791;
                case 242: goto L1795;
                default: goto L1790;
            }
        L1790:
            goto L1789
        L1791:
            r4 = 1693069(0x19d58d, float:2.372495E-39)
            goto L1789
        L1795:
            r6 = r3
        L1796:
            int r4 = r6.length()
            r3 = 1718086(0x1a3746, float:2.407551E-39)
        L179d:
            r7 = 1718103(0x1a3757, float:2.407575E-39)
            r3 = r3 ^ r7
            switch(r3) {
                case 17: goto L17a5;
                case 50: goto L18e2;
                case 211: goto L18f7;
                case 244: goto L18e7;
                default: goto L17a4;
            }
        L17a4:
            goto L179d
        L17a5:
            if (r4 <= 0) goto L18e2
            r3 = 1718179(0x1a37a3, float:2.407682E-39)
            goto L179d
        L17ab:
            java.lang.String r7 = defpackage.pb0.C1
            int r8 = r6.hashCode()
            r4 = 1693162(0x19d5ea, float:2.372625E-39)
        L17b4:
            r9 = 1693179(0x19d5fb, float:2.372649E-39)
            r4 = r4 ^ r9
            switch(r4) {
                case 17: goto L17bc;
                case 979: goto L18a4;
                case 1010: goto L17c5;
                case 3369: goto L17c9;
                default: goto L17bb;
            }
        L17bb:
            goto L17b4
        L17bc:
            r4 = -1266283874(0xffffffffb4860a9e, float:-2.496717E-7)
            if (r8 == r4) goto L17c5
            r4 = 1693906(0x19d8d2, float:2.373668E-39)
            goto L17b4
        L17c5:
            r4 = 1693224(0x19d628, float:2.372712E-39)
            goto L17b4
        L17c9:
            r4 = 1693937(0x19d8f1, float:2.373711E-39)
        L17cc:
            r7 = 1693954(0x19d902, float:2.373735E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 18: goto L17d4;
                case 45: goto L1857;
                case 76: goto L17e1;
                case 499: goto L17d8;
                default: goto L17d3;
            }
        L17d3:
            goto L17cc
        L17d4:
            r4 = 1693999(0x19d92f, float:2.373798E-39)
            goto L17cc
        L17d8:
            r4 = -840272977(0xffffffffcdea73af, float:-4.9168125E8)
            if (r8 == r4) goto L17d4
            r4 = 1694030(0x19d94e, float:2.373842E-39)
            goto L17cc
        L17e1:
            r4 = 1694061(0x19d96d, float:2.373885E-39)
        L17e4:
            r7 = 1694078(0x19d97e, float:2.373909E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 19: goto L17ec;
                case 180: goto L17f9;
                case 213: goto L180a;
                case 242: goto L17f5;
                default: goto L17eb;
            }
        L17eb:
            goto L17e4
        L17ec:
            r4 = 98629247(0x5e0f67f, float:2.1155407E-35)
            if (r8 == r4) goto L17f5
            r4 = 1694154(0x19d9ca, float:2.374015E-39)
            goto L17e4
        L17f5:
            r4 = 1694123(0x19d9ab, float:2.373972E-39)
            goto L17e4
        L17f9:
            r4 = 1694185(0x19d9e9, float:2.374059E-39)
        L17fc:
            r6 = 1694202(0x19d9fa, float:2.374083E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 19: goto L1804;
                case 1385: goto L1808;
                default: goto L1803;
            }
        L1803:
            goto L17fc
        L1804:
            r4 = 1694867(0x19dc93, float:2.375015E-39)
            goto L17fc
        L1808:
            r6 = r3
            goto L1796
        L180a:
            java.lang.String r4 = "W4tcv6c=\n"
            java.lang.String r7 = "PPkzytfnHGI=\n"
            java.lang.String r4 = "group"
            boolean r6 = r6.equals(r4)
            r4 = 1694960(0x19dcf0, float:2.375145E-39)
        L1819:
            r7 = 1694977(0x19dd01, float:2.375169E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 14: goto L1821;
                case 47: goto L183d;
                case 76: goto L182b;
                case 497: goto L1825;
                default: goto L1820;
            }
        L1820:
            goto L1819
        L1821:
            r4 = 1695022(0x19dd2e, float:2.375232E-39)
            goto L1819
        L1825:
            if (r6 != 0) goto L1821
            r4 = 1695053(0x19dd4d, float:2.375275E-39)
            goto L1819
        L182b:
            r4 = 1695084(0x19dd6c, float:2.375319E-39)
        L182e:
            r6 = 1695101(0x19dd7d, float:2.375342E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto L1836;
                case 246: goto L183a;
                default: goto L1835;
            }
        L1835:
            goto L182e
        L1836:
            r4 = 1695115(0x19dd8b, float:2.375362E-39)
            goto L182e
        L183a:
            r6 = r3
            goto L1796
        L183d:
            java.lang.String r3 = "WCzy7ImDfTFLO/Ttkch6MU898+OSgy8OYwTYotjDTyFCLunwkIliZQ==\n"
            java.lang.String r4 = "Kk+dgv/mD0I=\n"
            java.lang.String r3 = "rconversation.username LIKE '%@chatroom'"
            r4 = 1716040(0x1a2f48, float:2.404684E-39)
        L1848:
            r6 = 1716057(0x1a2f59, float:2.404708E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto L1850;
                case 62: goto L1854;
                default: goto L184f;
            }
        L184f:
            goto L1848
        L1850:
            r4 = 1716071(0x1a2f67, float:2.404728E-39)
            goto L1848
        L1854:
            r6 = r3
            goto L1796
        L1857:
            java.lang.String r4 = "SPZspLkO\n"
            java.lang.String r7 = "PZgewdhqq2s=\n"
            java.lang.String r4 = "unread"
            boolean r6 = r6.equals(r4)
            r4 = 1716164(0x1a2fc4, float:2.404858E-39)
        L1866:
            r7 = 1716181(0x1a2fd5, float:2.404882E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 17: goto L186e;
                case 54: goto L1874;
                case 8151: goto L188a;
                case 8180: goto L1878;
                default: goto L186d;
            }
        L186d:
            goto L1866
        L186e:
            if (r6 != 0) goto L1874
            r4 = 1716257(0x1a3021, float:2.404988E-39)
            goto L1866
        L1874:
            r4 = 1716226(0x1a3002, float:2.404945E-39)
            goto L1866
        L1878:
            r4 = 1716288(0x1a3040, float:2.405032E-39)
        L187b:
            r6 = 1716305(0x1a3051, float:2.405056E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto L1883;
                case 699: goto L1887;
                default: goto L1882;
            }
        L1882:
            goto L187b
        L1883:
            r4 = 1716970(0x1a32ea, float:2.405987E-39)
            goto L187b
        L1887:
            r6 = r3
            goto L1796
        L188a:
            java.lang.String r3 = "jSdb2g02Y/2eMF3bFX1k4K0hVdA4PGTgi2QKlEs=\n"
            java.lang.String r4 = "/0Q0tHtTEY4=\n"
            java.lang.String r3 = "rconversation.unReadCount > 0"
            r4 = 1717063(0x1a3347, float:2.406118E-39)
        L1895:
            r6 = 1717080(0x1a3358, float:2.406142E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 31: goto L189d;
                case 62: goto L18a1;
                default: goto L189c;
            }
        L189c:
            goto L1895
        L189d:
            r4 = 1717094(0x1a3366, float:2.406161E-39)
            goto L1895
        L18a1:
            r6 = r3
            goto L1796
        L18a4:
            java.lang.String r4 = "OHbTd/Ki\n"
            java.lang.String r8 = "XgS6EpzGNDE=\n"
            java.lang.String r4 = "friend"
            boolean r6 = r6.equals(r4)
            r4 = 1717187(0x1a33c3, float:2.406292E-39)
        L18b3:
            r8 = 1717204(0x1a33d4, float:2.406315E-39)
            r4 = r4 ^ r8
            switch(r4) {
                case 23: goto L18bb;
                case 54: goto L18c1;
                case 1407: goto L18c5;
                case 2005: goto L18d7;
                default: goto L18ba;
            }
        L18ba:
            goto L18b3
        L18bb:
            if (r6 != 0) goto L18c1
            r4 = 1717931(0x1a36ab, float:2.407334E-39)
            goto L18b3
        L18c1:
            r4 = 1717249(0x1a3401, float:2.406378E-39)
            goto L18b3
        L18c5:
            r4 = 1717962(0x1a36ca, float:2.407378E-39)
        L18c8:
            r6 = 1717979(0x1a36db, float:2.407401E-39)
            r4 = r4 ^ r6
            switch(r4) {
                case 17: goto L18d0;
                case 50: goto L18d4;
                default: goto L18cf;
            }
        L18cf:
            goto L18c8
        L18d0:
            r4 = 1717993(0x1a36e9, float:2.407421E-39)
            goto L18c8
        L18d4:
            r6 = r3
            goto L1796
        L18d7:
            java.lang.String r3 = "rconversation.username NOT LIKE '%@chatroom' AND rconversation.username NOT LIKE 'gh_%' AND rconversation.username NOT IN ("
            java.lang.String r4 = ")"
            java.lang.String r3 = defpackage.z30.j(r3, r7, r4)
            r6 = r3
            goto L1796
        L18e2:
            r3 = 1718148(0x1a3784, float:2.407638E-39)
            goto L179d
        L18e7:
            r3 = 1
            r4 = 1718210(0x1a37c2, float:2.407725E-39)
        L18eb:
            r7 = 1718227(0x1a37d3, float:2.407749E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 17: goto L18f3;
                case 3519: goto L18f8;
                default: goto L18f2;
            }
        L18f2:
            goto L18eb
        L18f3:
            r4 = 1718892(0x1a3a6c, float:2.408681E-39)
            goto L18eb
        L18f7:
            r3 = 0
        L18f8:
            r4 = 1718985(0x1a3ac9, float:2.408811E-39)
        L18fb:
            r7 = 1719002(0x1a3ada, float:2.408835E-39)
            r4 = r4 ^ r7
            switch(r4) {
                case 19: goto L1903;
                case 50: goto L1909;
                case 477: goto L10;
                case 508: goto L190d;
                default: goto L1902;
            }
        L1902:
            goto L18fb
        L1903:
            if (r3 == 0) goto L1909
            r4 = 1719078(0x1a3b26, float:2.408941E-39)
            goto L18fb
        L1909:
            r4 = 1719047(0x1a3b07, float:2.408898E-39)
            goto L18fb
        L190d:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r2.toLowerCase(r3)
            java.lang.String r4 = "ONZZmCuoJ/gtynDfcuN7kg==\n"
            java.lang.String r7 = "TLkV91zNVbs=\n"
            java.lang.String r4 = "toLowerCase(...)"
            defpackage.ip.n(r4, r3)
            int r7 = r3.length()
            r4 = 3
            java.lang.Integer[] r4 = new java.lang.Integer[r4]
            r8 = 0
            java.lang.String r9 = "ZqO9Zfs76/4/5A==\n"
            java.lang.String r10 = "RsTPCo5Ly5w=\n"
            java.lang.String r9 = " group by "
            r10 = 6
            int r9 = defpackage.b50.I(r3, r9, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4[r8] = r9
            r8 = 1
            java.lang.String r9 = "g+/P7Sb011naoA==\n"
            java.lang.String r10 = "o4C9iUOG9zs=\n"
            java.lang.String r9 = " order by "
            r10 = 6
            int r9 = defpackage.b50.I(r3, r9, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4[r8] = r9
            r8 = 2
            java.lang.String r9 = "mDVRRx31Ow==\n"
            java.lang.String r10 = "uFk4KnSBG0M=\n"
            java.lang.String r9 = " limit "
            r10 = 6
            int r3 = defpackage.b50.I(r3, r9, r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r8] = r3
            java.util.List r3 = defpackage.bb.f0(r4)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r3.iterator()
        L196e:
            boolean r4 = r10.hasNext()
            r3 = 1719109(0x1a3b45, float:2.408985E-39)
        L1975:
            r8 = 1719126(0x1a3b56, float:2.409009E-39)
            r3 = r3 ^ r8
            switch(r3) {
                case 19: goto L197d;
                case 50: goto L1983;
                case 213: goto L19e0;
                case 1403: goto L1987;
                default: goto L197c;
            }
        L197c:
            goto L1975
        L197d:
            if (r4 == 0) goto L1983
            r3 = 1719853(0x1a3e2d, float:2.410027E-39)
            goto L1975
        L1983:
            r3 = 1719171(0x1a3b83, float:2.409072E-39)
            goto L1975
        L1987:
            java.lang.Object r4 = r10.next()
            r3 = r4
            java.lang.Number r3 = (java.lang.Number) r3
            int r8 = r3.intValue()
            r3 = 1719884(0x1a3e4c, float:2.410071E-39)
        L1995:
            r11 = 1719901(0x1a3e5d, float:2.410095E-39)
            r3 = r3 ^ r11
            switch(r3) {
                case 17: goto L199d;
                case 54: goto L19a4;
                case 215: goto L19b8;
                case 244: goto L19a8;
                default: goto L199c;
            }
        L199c:
            goto L1995
        L199d:
            r3 = -1
            if (r8 == r3) goto L19a4
            r3 = 1719977(0x1a3ea9, float:2.410201E-39)
            goto L1995
        L19a4:
            r3 = 1719946(0x1a3e8a, float:2.410158E-39)
            goto L1995
        L19a8:
            r3 = 1
            r8 = 1720008(0x1a3ec8, float:2.410245E-39)
        L19ac:
            r11 = 1720025(0x1a3ed9, float:2.410268E-39)
            r8 = r8 ^ r11
            switch(r8) {
                case 17: goto L19b4;
                case 62: goto L19b9;
                default: goto L19b3;
            }
        L19b3:
            goto L19ac
        L19b4:
            r8 = 1720039(0x1a3ee7, float:2.410288E-39)
            goto L19ac
        L19b8:
            r3 = 0
        L19b9:
            r8 = 1720132(0x1a3f44, float:2.410418E-39)
        L19bc:
            r11 = 1720149(0x1a3f55, float:2.410442E-39)
            r8 = r8 ^ r11
            switch(r8) {
                case 17: goto L19c4;
                case 32088: goto L196e;
                case 32121: goto L19ce;
                case 32443: goto L19ca;
                default: goto L19c3;
            }
        L19c3:
            goto L19bc
        L19c4:
            if (r3 == 0) goto L19ca
            r8 = 1720876(0x1a422c, float:2.411461E-39)
            goto L19bc
        L19ca:
            r8 = 1720845(0x1a420d, float:2.411417E-39)
            goto L19bc
        L19ce:
            r9.add(r4)
            r3 = 1720907(0x1a424b, float:2.411504E-39)
        L19d4:
            r4 = 1720924(0x1a425c, float:2.411528E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 23: goto L19dc;
                case 54: goto L196e;
                default: goto L19db;
            }
        L19db:
            goto L19d4
        L19dc:
            r3 = 1720938(0x1a426a, float:2.411548E-39)
            goto L19d4
        L19e0:
            java.lang.Comparable r3 = defpackage.ab.k0(r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4 = 1721031(0x1a42c7, float:2.411678E-39)
        L19e9:
            r8 = 1721048(0x1a42d8, float:2.411702E-39)
            r4 = r4 ^ r8
            switch(r4) {
                case 31: goto L19f1;
                case 62: goto L19f7;
                case 477: goto L1ae9;
                case 1911: goto L19fb;
                default: goto L19f0;
            }
        L19f0:
            goto L19e9
        L19f1:
            if (r3 == 0) goto L19f7
            r4 = 1721775(0x1a45af, float:2.41272E-39)
            goto L19e9
        L19f7:
            r4 = 1721093(0x1a4305, float:2.411765E-39)
            goto L19e9
        L19fb:
            int r3 = r3.intValue()
        L19ff:
            r4 = 0
            java.lang.String r7 = r2.substring(r4, r3)
            java.lang.String r4 = "ifTJ4uAfLZedqYW/ukQ=\n"
            java.lang.String r8 = "+oGrkZRtRPk=\n"
            java.lang.String r4 = "substring(...)"
            defpackage.ip.n(r4, r7)
            java.lang.String r8 = r2.substring(r3)
            java.lang.String r2 = "XC/qja11S49IcqbQ9y4=\n"
            java.lang.String r3 = "L1qI/tkHIuE=\n"
            java.lang.String r2 = "substring(...)"
            defpackage.ip.n(r2, r8)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r7.toLowerCase(r2)
            java.lang.String r3 = "OVPEiQRo0h0sT+3OXSOOdw==\n"
            java.lang.String r4 = "TTyI5nMNoF4=\n"
            java.lang.String r3 = "toLowerCase(...)"
            defpackage.ip.n(r3, r2)
            java.lang.String r3 = "ss1ec3DljQ==\n"
            java.lang.String r4 = "kro2FgKArVA=\n"
            java.lang.String r3 = " where "
            r4 = 0
            boolean r3 = defpackage.b50.B(r2, r3, r4)
            r2 = 1721806(0x1a45ce, float:2.412764E-39)
        L1a3f:
            r4 = 1721823(0x1a45df, float:2.412788E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 17: goto L1a47;
                case 50: goto L1a4d;
                case 979: goto L1a68;
                case 1012: goto L1a51;
                default: goto L1a46;
            }
        L1a46:
            goto L1a3f
        L1a47:
            if (r3 == 0) goto L1a4d
            r2 = 1721899(0x1a462b, float:2.412894E-39)
            goto L1a3f
        L1a4d:
            r2 = 1721868(0x1a460c, float:2.412851E-39)
            goto L1a3f
        L1a51:
            java.lang.String r3 = "QFgRDzY=\n"
            java.lang.String r2 = "YBlfSxZ3C7I=\n"
        L1a55:
            java.lang.String r3 = defpackage.u40.a(r3, r2)
            r2 = 1721930(0x1a464a, float:2.412938E-39)
        L1a5c:
            r4 = 1721947(0x1a465b, float:2.412962E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 17: goto L1a64;
                case 50: goto L1a7b;
                default: goto L1a63;
            }
        L1a63:
            goto L1a5c
        L1a64:
            r2 = 1721961(0x1a4669, float:2.412981E-39)
            goto L1a5c
        L1a68:
            java.lang.String r3 = "Cgta2R2QUw==\n"
            java.lang.String r2 = "KlwSnE/Vc58=\n"
            r4 = 1722054(0x1a46c6, float:2.413112E-39)
        L1a6f:
            r9 = 1722071(0x1a46d7, float:2.413135E-39)
            r4 = r4 ^ r9
            switch(r4) {
                case 17: goto L1a77;
                case 4007: goto L1a55;
                default: goto L1a76;
            }
        L1a76:
            goto L1a6f
        L1a77:
            r4 = 1722736(0x1a4970, float:2.414067E-39)
            goto L1a6f
        L1a7b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r3)
            java.lang.String r3 = "("
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = ") "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r0 = r16
            java.lang.Object[] r3 = r0.args
            r3[r5] = r2
            goto L10
        L1aa2:
            java.lang.String r2 = "pQ==\n"
            java.lang.String r3 = "1Vc4X3SAwMk=\n"
            java.lang.String r2 = "p"
            r0 = r16
            defpackage.ip.o(r2, r0)
            gn r2 = defpackage.gn.a
            java.lang.String r3 = "IsbcQNY40cwEyNJG5g==\n"
            java.lang.String r4 = "Ya69NINxjo4=\n"
            java.lang.String r3 = "ChatUI_Before"
            j9 r4 = new j9
            r5 = 0
            r0 = r16
            r4.<init>(r0, r5)
            r2.getClass()
            defpackage.gn.j(r3, r4)
            goto L10
        L1ac9:
            r2 = move-exception
            r2 = 1722829(0x1a49cd, float:2.414198E-39)
        L1acd:
            r5 = 1722846(0x1a49de, float:2.414221E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 19: goto L1ad5;
                case 50: goto L26c;
                default: goto L1ad4;
            }
        L1ad4:
            goto L1acd
        L1ad5:
            r2 = 1722860(0x1a49ec, float:2.414241E-39)
            goto L1acd
        L1ad9:
            r7 = move-exception
            r7 = 1722953(0x1a4a49, float:2.414371E-39)
        L1add:
            r10 = 1722970(0x1a4a5a, float:2.414395E-39)
            r7 = r7 ^ r10
            switch(r7) {
                case 19: goto L1ae5;
                case 50: goto L1632;
                default: goto L1ae4;
            }
        L1ae4:
            goto L1add
        L1ae5:
            r7 = 1722984(0x1a4a68, float:2.414415E-39)
            goto L1add
        L1ae9:
            r3 = r7
            goto L19ff
        L1aec:
            r2 = r10
            goto L1041
        L1aef:
            r3 = r9
            goto Lda4
        L1af2:
            r3 = r8
            goto Lcdb
        L1af5:
            r2 = r7
            goto L41c
        L1af8:
            r2 = r6
            goto L352
        L1afb:
            r2 = r4
            goto L1b3
        L1afe:
            r2 = r3
            goto Ld6
    }
}
