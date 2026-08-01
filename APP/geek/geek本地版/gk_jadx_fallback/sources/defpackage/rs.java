package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rs extends android.view.ViewOutlineProvider {
    public final float a;

    public rs(float r5) {
            r4 = this;
            r4.a = r5
            r4.<init>()
            r2 = 0
            java.lang.String r0 = "ۧۡۢ"
            int r0 = com.google.android.material.carousel.C0055.m220(r0)
        Ld:
            switch(r0) {
                case 1751718: goto L11;
                case 1754440: goto L62;
                case 1754442: goto L4c;
                case 1754444: goto L24;
                case 1755400: goto L12;
                case 1755430: goto L56;
                default: goto L10;
            }
        L10:
            goto Ld
        L11:
            return
        L12:
            int r0 = androidx.savedstate.C0036.f36
            if (r0 > 0) goto L21
            r0 = 95
            io.fastkv.C0068.f68 = r0
            java.lang.String r0 = "ۣۨۡ"
        L1c:
            int r0 = androidx.viewpager2.adapter.C0043.m173(r0)
            goto Ld
        L21:
            java.lang.String r0 = "ۤۦۨ"
            goto L1c
        L24:
            java.lang.String r0 = "dVsuwM"
            java.lang.String r0 = com.github.megatronking.stringfog.C0047.m188(r0)
            double r2 = java.lang.Double.parseDouble(r0)
            int r0 = androidx.recyclerview.widget.C0033.f33
            int r1 = defpackage.C0071.f71
            r1 = r1 ^ (-4020(0xfffffffffffff04c, float:NaN))
            int r0 = r0 / r1
            if (r0 == 0) goto L42
            r0 = 26
            com.google.android.material.chip.C0057.f57 = r0
            java.lang.String r0 = "ۧۡۢ"
            int r0 = com.google.android.material.theme.C0063.m254(r0)
            goto Ld
        L42:
            int r0 = android.app.C0001.f1
            int r1 = androidx.versionedparcelable.C0041.f41
            int r0 = r0 / r1
            r1 = 1755430(0x1ac926, float:2.459881E-39)
            int r0 = r0 + r1
            goto Ld
        L4c:
            int r0 = android.app.C0000.f0
            int r1 = com.google.android.material.behavior.C0050.f50
            r0 = r0 | r1
            r1 = 1753865(0x1ac309, float:2.457688E-39)
            int r0 = r0 + r1
            goto Ld
        L56:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r2)
            java.lang.String r0 = "ۤۦۨ"
            int r0 = androidx.core.widget.C0025.m102(r0)
            goto Ld
        L62:
            int r0 = com.github.megatronking.stringfog.C0048.m194()
            if (r0 > 0) goto L12
            int r0 = android.app.C0001.f1
            int r1 = androidx.versionedparcelable.C0042.f42
            int r0 = r0 + r1
            r1 = -1754804(0xffffffffffe5394c, float:NaN)
            r0 = r0 ^ r1
            goto Ld
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View r12, android.graphics.Outline r13) {
            r11 = this;
            r1 = 0
            r9 = 0
            r6 = 0
            java.lang.String r0 = "ۣۨۡ"
            int r0 = android.app.C0002.m8(r0)
            r7 = r1
            r10 = r9
            r8 = r9
            r5 = r9
        Ld:
            switch(r0) {
                case 56293: goto L11;
                case 56358: goto L23;
                case 56513: goto L78;
                case 1746727: goto L209;
                case 1746757: goto L96;
                case 1746908: goto La1;
                case 1746913: goto Lde;
                case 1747682: goto L30;
                case 1747905: goto L67;
                case 1748858: goto Lb4;
                case 1749576: goto L1ed;
                case 1750662: goto L132;
                case 1750785: goto La1;
                case 1750812: goto L1d0;
                case 1751590: goto L1bd;
                case 1751622: goto L148;
                case 1751686: goto Lfe;
                case 1752521: goto L110;
                case 1752586: goto L4e;
                case 1753420: goto Lca;
                case 1753693: goto L1a2;
                case 1754531: goto L163;
                case 1755561: goto L17b;
                case 1755617: goto L4e;
                default: goto L10;
            }
        L10:
            goto Ld
        L11:
            java.lang.String r0 = "uMSC/KsmTza43pqw6SAOO7fCmrD/Kg42ud/D/v4pQniiyJ71qyRAPKTeh/SlMkc8sdSavs03TzWz\n/Y/p5DBadprQl//+MX45pNCD4w==\n"
            java.lang.String r2 = "1rHukItFLlg=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)
            defpackage.ip.m(r0, r6)
        L1c:
            java.lang.String r0 = "ۡۧ"
        L1e:
            int r0 = androidx.lifecycle.C0029.m116(r0)
            goto Ld
        L23:
            r0 = r6
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r2 = r0.bottomMargin
            java.lang.String r0 = "۟ۦۨ"
        L2a:
            int r0 = android.view.C0007.m28(r0)
            r7 = r2
            goto Ld
        L30:
            android.view.ViewGroup$LayoutParams r6 = r12.getLayoutParams()
            int r0 = com.google.android.material.datepicker.C0058.f58
            int r2 = androidx.constraintlayout.widget.C0018.f18
            r2 = r2 | (-4047(0xfffffffffffff031, float:NaN))
            r0 = r0 ^ r2
            if (r0 < 0) goto L44
            java.lang.String r0 = "ۧۤ۠"
            int r0 = com.google.android.material.carousel.C0054.m219(r0)
            goto Ld
        L44:
            int r0 = androidx.core.widget.C0025.f25
            int r2 = com.google.android.material.carousel.C0055.f55
            r0 = r0 ^ r2
            r2 = 55967(0xda9f, float:7.8426E-41)
            int r0 = r0 + r2
            goto Ld
        L4e:
            int r0 = androidx.recyclerview.widget.C0033.f33
            if (r0 > 0) goto L5d
            r0 = 75
            com.ljx.wechatmod.ui.C0067.f67 = r0
            java.lang.String r0 = "ۣۢۨ"
            int r0 = com.github.megatronking.stringfog.xor.C0045.m182(r0)
            goto Ld
        L5d:
            int r0 = androidx.constraintlayout.widget.C0019.f19
            int r2 = io.fastkv.C0068.f68
            r0 = r0 | r2
            r2 = 1747558(0x1aaa66, float:2.44885E-39)
            int r0 = r0 + r2
            goto Ld
        L67:
            int r0 = kotlinx.coroutines.C0069.m276()
            if (r0 < 0) goto L71
            java.lang.String r0 = "۟۟۠"
            r2 = r7
            goto L2a
        L71:
            java.lang.String r0 = "۟۠ۨ"
        L73:
            int r0 = android.support.v4.graphics.drawable.C0006.m26(r0)
            goto Ld
        L78:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r0 * r10
            int r0 = androidx.coordinatorlayout.widget.C0022.m88()
            if (r0 > 0) goto L8d
            com.ljx.wechatmod.hook.C0066.m265()
            java.lang.String r0 = "ۥۡۥ"
            int r0 = androidx.fragment.app.C0027.m110(r0)
            r8 = r2
            goto Ld
        L8d:
            java.lang.String r0 = "ۣۤۥ"
        L8f:
            int r0 = com.google.android.material.appbar.C0049.m197(r0)
            r8 = r2
            goto Ld
        L96:
            int r0 = androidx.appcompat.widget.C0014.f14
            int r2 = androidx.activity.result.C0009.f9
            int r0 = r0 % r2
            r2 = 1747611(0x1aaa9b, float:2.448925E-39)
            int r0 = r0 + r2
            goto Ld
        La1:
            int r0 = androidx.versionedparcelable.C0040.f40
            if (r0 > 0) goto Lb0
            com.google.android.material.chip.C0056.m224()
            java.lang.String r0 = "ۨۨ۠"
            int r0 = androidx.savedstate.C0035.m140(r0)
            goto Ld
        Lb0:
            java.lang.String r0 = "ۨۦۧ"
            r2 = r8
            goto L8f
        Lb4:
            int r0 = com.google.android.material.appbar.C0049.m199()
            if (r0 < 0) goto Lc6
            android.app.C0003.m14()
            java.lang.String r0 = "ۣۧۥ"
            int r0 = com.github.megatronking.stringfog.C0047.m189(r0)
            r5 = r9
            goto Ld
        Lc6:
            java.lang.String r0 = "ۦ۟ۥ"
            r5 = r9
            goto L73
        Lca:
            int r0 = androidx.activity.result.C0008.f8
            int r2 = androidx.appcompat.widget.C0014.f14
            int r2 = r2 + 4960
            int r0 = r0 * r2
            if (r0 >= 0) goto L1c
            int r0 = com.google.android.material.chip.C0056.f56
            int r2 = androidx.versionedparcelable.C0039.f39
            int r0 = r0 % r2
            r2 = 1755891(0x1acaf3, float:2.460527E-39)
            int r0 = r0 + r2
            goto Ld
        Lde:
            float r2 = r11.a
            int r0 = android.app.C0001.f1
            int r3 = com.google.android.material.internal.C0061.f61
            int r3 = r3 + 7674
            int r0 = r0 % r3
            if (r0 < 0) goto Lf5
            com.github.megatronking.stringfog.C0048.m194()
            java.lang.String r0 = "۟ۦۨ"
            int r0 = androidx.lifecycle.C0029.m116(r0)
            r10 = r2
            goto Ld
        Lf5:
            java.lang.String r0 = "ۦۨ۟"
        Lf7:
            int r0 = androidx.lifecycle.C0029.m116(r0)
            r10 = r2
            goto Ld
        Lfe:
            r0 = 1086324736(0x40c00000, float:6.0)
            float r0 = r0 * r10
            int r0 = (int) r0
            r13.offset(r1, r0)
            int r0 = com.google.android.material.theme.C0063.f63
            int r2 = androidx.constraintlayout.widget.C0019.f19
            int r0 = r0 + r2
            r2 = 1746818(0x1aa782, float:2.447813E-39)
            r0 = r0 ^ r2
            goto Ld
        L110:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r0 < r2) goto L67
            int r0 = androidx.savedstate.C0035.f35
            int r2 = com.google.android.material.carousel.C0053.f53
            int r2 = r2 + (-1511)
            r0 = r0 | r2
            if (r0 < 0) goto L127
            java.lang.String r0 = "ۦۨ۟"
            int r0 = androidx.constraintlayout.widget.C0018.m73(r0)
            goto Ld
        L127:
            int r0 = androidx.appcompat.app.C0012.f12
            int r2 = com.google.android.material.carousel.C0053.f53
            int r0 = r0 % r2
            r2 = 1751685(0x1aba85, float:2.454634E-39)
            int r0 = r0 + r2
            goto Ld
        L132:
            int r0 = androidx.versionedparcelable.C0042.f42
            int r2 = com.google.android.material.appbar.C0049.f49
            int r2 = r2 + (-5479)
            r0 = r0 | r2
            if (r0 < 0) goto L140
            java.lang.String r0 = "۟ۧ"
            r2 = r8
            goto L8f
        L140:
            java.lang.String r0 = "ۣۨۡ"
            int r0 = androidx.versionedparcelable.C0038.m153(r0)
            goto Ld
        L148:
            int r0 = defpackage.C0072.m289()
            if (r0 > 0) goto L157
            r5 = r8
        L14f:
            java.lang.String r0 = "۠۠ۢ"
            int r0 = com.github.megatronking.stringfog.C0047.m189(r0)
            goto Ld
        L157:
            int r0 = androidx.startup.C0037.f37
            int r2 = com.google.android.material.chip.C0057.f57
            int r0 = r0 * r2
            r2 = 1478917(0x169105, float:2.072404E-39)
            int r0 = r0 + r2
            r5 = r8
            goto Ld
        L163:
            int r0 = com.ljx.wechatmod.hook.C0066.f66
            int r2 = androidx.core.content.C0023.f23
            int r2 = r2 % (-7284)
            int r0 = r0 / r2
            if (r0 > 0) goto L173
            androidx.coordinatorlayout.widget.C0021.m84()
            java.lang.String r0 = "ۧۧۧ"
            goto L73
        L173:
            java.lang.String r0 = "ۤۢۤ"
            int r0 = defpackage.C0071.m286(r0)
            goto Ld
        L17b:
            int r3 = r12.getWidth()
            int r4 = r12.getHeight()
            r0 = r13
            r2 = r1
            r0.setRoundRect(r1, r2, r3, r4, r5)
            int r0 = android.support.v4.graphics.drawable.C0006.f6
            int r2 = androidx.appcompat.widget.C0013.f13
            int r2 = r2 * 3341
            int r0 = r0 + r2
            if (r0 < 0) goto L19d
            r0 = 13
            androidx.constraintlayout.widget.C0018.f18 = r0
            java.lang.String r0 = "ۣۣۦ"
            int r0 = android.support.v4.graphics.drawable.C0004.m16(r0)
            goto Ld
        L19d:
            java.lang.String r0 = "ۥۡۥ"
            r2 = r7
            goto L2a
        L1a2:
            if (r7 <= 0) goto L163
            int r0 = io.fastkv.C0068.f68
            int r2 = com.google.android.material.theme.C0063.f63
            int r2 = r2 * 6351
            int r0 = r0 % r2
            if (r0 < 0) goto L1b9
            r0 = 66
            android.support.v4.graphics.drawable.C0005.f5 = r0
            java.lang.String r0 = "ۤۥۧ"
            int r0 = com.google.android.material.carousel.C0055.m220(r0)
            goto Ld
        L1b9:
            java.lang.String r0 = "ۦۧ"
            goto L73
        L1bd:
            int r0 = androidx.activity.result.C0008.f8
            if (r0 < 0) goto L1cc
            r0 = 7
            defpackage.C0071.f71 = r0
            java.lang.String r0 = "۟ۦۣ"
            int r0 = androidx.savedstate.C0035.m140(r0)
            goto Ld
        L1cc:
            java.lang.String r0 = "ۡۧ۠"
            goto L1e
        L1d0:
            java.lang.String r0 = "HUKugA==\n"
            java.lang.String r2 = "ayvL9/eKsiU=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)
            defpackage.ip.o(r0, r12)
            int r0 = androidx.appcompat.app.C0012.f12
            if (r0 > 0) goto L1e8
            r0 = 23
            androidx.viewpager2.adapter.C0043.f43 = r0
            java.lang.String r0 = "ۦۧ"
            r2 = r10
            goto Lf7
        L1e8:
            java.lang.String r0 = "ۢ۟ۥ"
            r2 = r8
            goto L8f
        L1ed:
            java.lang.String r0 = "Q98pAUBAqQ==\n"
            java.lang.String r2 = "LKpdbSkuzKc=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)
            defpackage.ip.o(r0, r13)
            int r0 = androidx.recyclerview.widget.C0032.f32
            int r2 = androidx.appcompat.app.C0012.f12
            int r2 = r2 + 9398
            r0 = r0 ^ r2
            if (r0 < 0) goto L14f
            java.lang.String r0 = "۟ۤ"
            int r0 = com.google.android.material.appbar.C0049.m197(r0)
            goto Ld
        L209:
            return
    }
}
