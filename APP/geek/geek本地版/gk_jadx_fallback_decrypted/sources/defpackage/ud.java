package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ud extends de.robv.android.xposed.XC_MethodHook {
    public final java.lang.String a;
    public final int b;

    public ud(java.lang.String r4, int r5) {
            r3 = this;
            r3.a = r4
            r3.b = r5
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "ۤ۟ۥ"
            int r2 = com.google.android.material.internal.C0061.m246(r1)
            r1 = r0
        Lf:
            switch(r2) {
                case 56544: goto L13;
                case 1746696: goto L76;
                case 1747712: goto L28;
                case 1747774: goto L94;
                case 1751498: goto L49;
                case 1754627: goto L69;
                default: goto L12;
            }
        L12:
            goto Lf
        L13:
            java.lang.String r0 = "EklV5IMjL4TkEQ5NRgtYB1"
            java.lang.String r0 = androidx.legacy.content.C0028.m115(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            int r1 = androidx.coordinatorlayout.widget.C0022.f22
            int r2 = androidx.startup.C0037.f37
            r1 = r1 ^ r2
            r2 = 1747337(0x1aa989, float:2.44854E-39)
            int r2 = r2 + r1
            r1 = r0
            goto Lf
        L28:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = androidx.recyclerview.widget.C0033.m135()
            if (r0 < 0) goto L3e
            androidx.viewpager2.adapter.C0043.m172()
            java.lang.String r0 = "ۤ۟ۥ"
            int r0 = com.google.android.material.datepicker.C0058.m234(r0)
            r2 = r0
            goto Lf
        L3e:
            int r0 = androidx.profileinstaller.C0030.f30
            int r2 = androidx.fragment.app.C0027.f27
            int r0 = r0 / r2
            r2 = 1747774(0x1aab3e, float:2.449153E-39)
            int r0 = r0 + r2
            r2 = r0
            goto Lf
        L49:
            int r0 = com.github.megatronking.stringfog.xor.C0046.m185()
            if (r0 > 0) goto L76
            int r0 = androidx.savedstate.C0034.m137()
            if (r0 > 0) goto L61
            r0 = 50
            com.github.megatronking.stringfog.xor.C0045.f45 = r0
            java.lang.String r0 = "۟۟ۨ"
            int r0 = com.google.android.material.carousel.C0053.m213(r0)
            r2 = r0
            goto Lf
        L61:
            java.lang.String r0 = "ۧۧ"
        L63:
            int r0 = com.github.megatronking.stringfog.annotation.C0044.m176(r0)
            r2 = r0
            goto Lf
        L69:
            int r0 = androidx.lifecycle.C0029.f29
            if (r0 < 0) goto L73
            androidx.startup.C0037.m150()
            java.lang.String r0 = "ۦۡۨ"
            goto L63
        L73:
            java.lang.String r0 = "ۤ۟ۥ"
            goto L63
        L76:
            int r0 = androidx.constraintlayout.widget.C0020.f20
            int r2 = androidx.savedstate.C0035.f35
            int r2 = r2 / (-2679)
            int r0 = r0 - r2
            if (r0 < 0) goto L8b
            r0 = 29
            androidx.constraintlayout.widget.C0020.f20 = r0
            java.lang.String r0 = "ۣۡۤ"
            int r0 = defpackage.C0072.m288(r0)
            r2 = r0
            goto Lf
        L8b:
            java.lang.String r0 = "ۣ۠ۡ"
            int r0 = androidx.coordinatorlayout.widget.C0022.m90(r0)
            r2 = r0
            goto Lf
        L94:
            return
    }

    public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r69) {
            r68 = this;
            r28 = 0
            r7 = 0
            r37 = 0
            r54 = 0
            r63 = 0
            r29 = 0
            r34 = 0
            r6 = 0
            r40 = 0
            r38 = 0
            r39 = 0
            r16 = 0
            r25 = 0
            r65 = 0
            r5 = 0
            r22 = 0
            r31 = 0
            r32 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r56 = 0
            r55 = 0
            r51 = 0
            r30 = 0
            r53 = 0
            r66 = 0
            r52 = 0
            r24 = 0
            r20 = 0
            r36 = 0
            r50 = 0
            r46 = 0
            r49 = 0
            r47 = 0
            r64 = 0
            r62 = 0
            r48 = 0
            r27 = 0
            r26 = 0
            r61 = 0
            r23 = 0
            r35 = 0
            r11 = 0
            r15 = 0
            r8 = 0
            r13 = 0
            r9 = 0
            r14 = 0
            r10 = 0
            r12 = 0
            r21 = 0
            r33 = 0
            java.lang.String r57 = "ۧ۟ۦ"
            int r67 = androidx.startup.C0037.m149(r57)
            r57 = r5
            r58 = r20
            r59 = r24
            r60 = r25
        L77:
            switch(r67) {
                case 56353: goto L7b;
                case 56357: goto Lf3e;
                case 56384: goto Laec;
                case 56385: goto L897;
                case 56415: goto L617;
                case 56418: goto Lbca;
                case 56448: goto La83;
                case 56449: goto Lb41;
                case 56451: goto Ldcf;
                case 56452: goto L24d;
                case 56479: goto L2d8;
                case 56506: goto L8e;
                case 56509: goto L4df;
                case 56536: goto L203;
                case 56569: goto L9ab;
                case 56576: goto L6f9;
                case 1746750: goto L4ad;
                case 1746755: goto Ld00;
                case 1746780: goto L8da;
                case 1746814: goto L955;
                case 1746843: goto Ld58;
                case 1746848: goto L8a6;
                case 1746942: goto L903;
                case 1746968: goto Le90;
                case 1746972: goto L46f;
                case 1747655: goto L30e;
                case 1747718: goto L1e2;
                case 1747743: goto Ld25;
                case 1747748: goto Lc2b;
                case 1747777: goto Ladd;
                case 1747779: goto L493;
                case 1747807: goto L22e;
                case 1747838: goto L5d8;
                case 1747869: goto L5c9;
                case 1747873: goto L2fa;
                case 1747899: goto L65b;
                case 1747900: goto Ld91;
                case 1748611: goto L504;
                case 1748648: goto Lf3e;
                case 1748671: goto Ld39;
                case 1748674: goto L6b5;
                case 1748678: goto L6af;
                case 1748711: goto Lab2;
                case 1748765: goto L975;
                case 1748767: goto L532;
                case 1748801: goto L724;
                case 1748802: goto L57e;
                case 1748834: goto Laff;
                case 1748835: goto L7d9;
                case 1748865: goto L85d;
                case 1748893: goto L6f9;
                case 1749573: goto L42a;
                case 1749632: goto L514;
                case 1749637: goto Laff;
                case 1749663: goto Lc59;
                case 1749666: goto Lcab;
                case 1749667: goto L371;
                case 1749789: goto Lf7;
                case 1749793: goto Laff;
                case 1749796: goto L33a;
                case 1749854: goto L933;
                case 1749856: goto Ld54;
                case 1749857: goto Le75;
                case 1750535: goto Lee6;
                case 1750538: goto L408;
                case 1750567: goto Lbd;
                case 1750597: goto L123;
                case 1750598: goto L2a3;
                case 1750720: goto L22e;
                case 1750810: goto Ldcb;
                case 1751558: goto L897;
                case 1751562: goto Ld25;
                case 1751586: goto Laff;
                case 1751588: goto Ld43;
                case 1751617: goto Ldb3;
                case 1751620: goto Lec;
                case 1751647: goto L4ee;
                case 1751681: goto L18a;
                case 1751686: goto L79f;
                case 1751710: goto Ldb3;
                case 1751712: goto L617;
                case 1751773: goto Ld67;
                case 1752456: goto L35f;
                case 1752491: goto Lc89;
                case 1752519: goto Lbaa;
                case 1752523: goto L493;
                case 1752547: goto Le3e;
                case 1752583: goto Lbcc;
                case 1752610: goto Lc7a;
                case 1752672: goto L8b5;
                case 1752704: goto L62e;
                case 1752710: goto L54e;
                case 1752741: goto Lb17;
                case 1753451: goto L8a6;
                case 1753507: goto L9bb;
                case 1753514: goto Ld54;
                case 1753572: goto Lc1c;
                case 1753578: goto L565;
                case 1753603: goto L9ca;
                case 1753632: goto Lbff;
                case 1753637: goto Lda6;
                case 1753667: goto L9dc;
                case 1753671: goto L514;
                case 1754376: goto L398;
                case 1754378: goto L9ff;
                case 1754382: goto L3b7;
                case 1754383: goto L8e;
                case 1754406: goto Lb68;
                case 1754415: goto L743;
                case 1754444: goto Lb83;
                case 1754501: goto Lc59;
                case 1754530: goto L1a5;
                case 1754539: goto L199;
                case 1754600: goto L280;
                case 1754632: goto Le7f;
                case 1755339: goto L8ec;
                case 1755370: goto L9c;
                case 1755374: goto L151;
                case 1755399: goto Lf1b;
                case 1755430: goto L2b2;
                case 1755493: goto L5c3;
                case 1755498: goto L44c;
                case 1755555: goto L15e;
                case 1755557: goto La83;
                case 1755592: goto L933;
                case 1755616: goto L689;
                default: goto L7a;
            }
        L7a:
            goto L77
        L7b:
            int r5 = defpackage.ff.y
            int r20 = r22.size()
            r0 = r20
            if (r5 < r0) goto Lc7a
            java.lang.String r5 = "ۦۥۢ"
        L87:
            int r5 = com.ljx.wechatmod.hook.C0066.m264(r5)
            r67 = r5
            goto L77
        L8e:
            int r5 = com.github.megatronking.stringfog.C0048.f48
            int r20 = defpackage.C0073.f73
            int r5 = r5 - r20
            r20 = 1748579(0x1aae63, float:2.450281E-39)
            r5 = r5 ^ r20
            r67 = r5
            goto L77
        L9c:
            int r5 = androidx.activity.result.C0008.m33()
            if (r5 > 0) goto Laf
            r5 = 29
            androidx.appcompat.widget.C0015.f15 = r5
            java.lang.String r5 = "ۢۡ۟"
            int r5 = androidx.versionedparcelable.C0039.m159(r5)
            r67 = r5
            goto L77
        Laf:
            int r5 = androidx.savedstate.C0034.f34
            int r20 = com.google.android.material.theme.C0062.f62
            r5 = r5 | r20
            r20 = 1753436(0x1ac15c, float:2.457087E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        Lbd:
            int r5 = androidx.coordinatorlayout.widget.C0021.f21
            int r9 = androidx.fragment.app.C0027.f27
            int r9 = r9 % (-3059)
            r5 = r5 | r9
            if (r5 < 0) goto Ldc
            com.google.android.material.floatingactionbutton.C0060.m240()
            r5 = r8
            r10 = r11
            r12 = r13
            r14 = r15
        Lcd:
            java.lang.String r9 = "ۡۦ"
            r20 = r9
            r24 = r5
        Ld3:
            int r5 = com.github.megatronking.stringfog.C0047.m189(r20)
            r9 = r24
            r67 = r5
            goto L77
        Ldc:
            int r5 = androidx.savedstate.C0035.f35
            int r9 = android.support.v4.graphics.drawable.C0005.f5
            int r5 = r5 + r9
            r9 = 1756132(0x1acbe4, float:2.460865E-39)
            r5 = r5 ^ r9
            r9 = r8
            r67 = r5
            r10 = r11
            r12 = r13
            r14 = r15
            goto L77
        Lec:
            if (r37 != 0) goto L565
        Lee:
            java.lang.String r5 = "ۥ۠ۦ"
            int r5 = androidx.coordinatorlayout.widget.C0021.m86(r5)
            r67 = r5
            goto L77
        Lf7:
            int r24 = android.graphics.Color.parseColor(r51)
            int r5 = android.view.C0007.f7
            int r20 = androidx.constraintlayout.widget.C0019.f19
            r0 = r20
            r0 = r0 ^ 4682(0x124a, float:6.561E-42)
            r20 = r0
            int r5 = r5 - r20
            if (r5 < 0) goto L115
            java.lang.String r5 = "ۤۤ"
            int r5 = kotlinx.coroutines.C0070.m281(r5)
            r55 = r24
            r67 = r5
            goto L77
        L115:
            java.lang.String r5 = "ۨۡ"
            r20 = r5
            r55 = r24
        L11b:
            int r5 = com.google.android.material.datepicker.C0059.m239(r20)
            r67 = r5
            goto L77
        L123:
            int r5 = androidx.activity.result.C0008.f8
            int r20 = android.support.v4.graphics.drawable.C0006.f6
            r0 = r20
            int r0 = r0 * (-2856)
            r20 = r0
            int r5 = r5 - r20
            if (r5 > 0) goto L142
            defpackage.C0071.m284()
            r5 = r16
        L136:
            java.lang.String r16 = "ۤۤ۟"
            int r20 = com.google.android.material.floatingactionbutton.C0060.m241(r16)
            r16 = r5
            r67 = r20
            goto L77
        L142:
            int r5 = com.ljx.wechatmod.hook.C0066.f66
            int r20 = com.github.megatronking.stringfog.xor.C0045.f45
            r5 = r5 | r20
            r20 = 1748933(0x1aafc5, float:2.450777E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        L151:
            r5 = 1
            defpackage.vd.f = r5
            java.lang.String r5 = "ۣۣ۟"
            int r5 = androidx.versionedparcelable.C0042.m170(r5)
            r67 = r5
            goto L77
        L15e:
            int r5 = com.github.megatronking.stringfog.annotation.C0044.m178()
            if (r5 < 0) goto L17a
            java.lang.String r20 = "ۦۦۡ"
            r5 = r17
            r24 = r10
            r25 = r12
        L16c:
            int r20 = androidx.constraintlayout.widget.C0019.m79(r20)
            r17 = r5
            r67 = r20
            r10 = r24
            r12 = r25
            goto L77
        L17a:
            java.lang.String r5 = "ۡ۠ۧ"
            r24 = r5
            r25 = r56
        L180:
            int r5 = defpackage.C0072.m288(r24)
            r56 = r25
            r67 = r5
            goto L77
        L18a:
            int r5 = androidx.versionedparcelable.C0038.f38
            int r20 = androidx.savedstate.C0034.f34
            r5 = r5 ^ r20
            r20 = 1747084(0x1aa88c, float:2.448186E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        L199:
            java.lang.String r5 = "ۢۦۡ"
            int r5 = androidx.constraintlayout.widget.C0020.m80(r5)
            r51 = r56
            r67 = r5
            goto L77
        L1a5:
            r0 = r19
            r1 = r55
            r0.setColor(r1)
            r5 = 1148829696(0x4479c000, float:999.0)
            r0 = r19
            r0.setCornerRadius(r5)
            int r5 = defpackage.ff.q(r45)
            boolean r20 = defpackage.vd.e
            if (r20 == 0) goto L2b4
            java.lang.String r20 = "TQj9+s3uS68o\n"
            java.lang.String r24 = "bjvOvIuoDek=\n"
            r0 = r20
            r1 = r24
            java.lang.String r53 = defpackage.u40.a(r0, r1)
            int r20 = com.google.android.material.datepicker.C0058.f58
            int r24 = com.github.megatronking.stringfog.xor.C0046.f46
            r0 = r24
            r0 = r0 | 8462(0x210e, float:1.1858E-41)
            r24 = r0
            int r20 = r20 % r24
            if (r20 > 0) goto Lc99
            java.lang.String r20 = "ۨۦۣ"
            int r20 = androidx.emoji2.text.C0026.m105(r20)
            r30 = r5
            r67 = r20
            goto L77
        L1e2:
            java.util.ArrayList r5 = defpackage.vd.a
            android.widget.ListAdapter r5 = r37.getAdapter()
            defpackage.vd.d = r5
            r20 = 1
            if (r5 == 0) goto Ldb5
            boolean r5 = defpackage.vd.f
            if (r5 != 0) goto Ldb5
            int r5 = androidx.core.widget.C0025.f25
            int r24 = com.ljx.wechatmod.hook.C0066.f66
            int r5 = r5 - r24
            r24 = 1757105(0x1acfb1, float:2.462229E-39)
            int r5 = r5 + r24
            r34 = r20
            r67 = r5
            goto L77
        L203:
            int r5 = com.github.megatronking.stringfog.C0047.f47
            int r20 = android.app.C0002.f2
            r0 = r20
            int r0 = r0 / (-5475)
            r20 = r0
            r5 = r5 ^ r20
            if (r5 < 0) goto L21f
            java.lang.String r20 = "ۣۨۡ"
            r5 = r28
        L215:
            int r20 = android.app.C0002.m8(r20)
            r28 = r5
            r67 = r20
            goto L77
        L21f:
            int r5 = com.google.android.material.theme.C0064.f64
            int r20 = androidx.profileinstaller.C0030.f30
            int r5 = r5 / r20
            r20 = 1754382(0x1ac50e, float:2.458413E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        L22e:
            int r5 = androidx.legacy.content.C0028.m112()
            if (r5 > 0) goto L23e
            java.lang.String r5 = "ۥۡ"
        L236:
            int r5 = androidx.activity.C0011.m45(r5)
            r67 = r5
            goto L77
        L23e:
            int r5 = com.google.android.material.theme.C0063.f63
            int r20 = androidx.appcompat.widget.C0013.f13
            int r5 = r5 % r20
            r20 = 1751564(0x1aba0c, float:2.454464E-39)
            r5 = r5 ^ r20
            r67 = r5
            goto L77
        L24d:
            int r5 = android.graphics.Color.parseColor(r52)
            int r20 = androidx.lifecycle.C0029.f29
            int r24 = com.google.android.material.bottomsheet.C0051.f51
            r0 = r24
            int r0 = r0 + 5678
            r24 = r0
            r20 = r20 ^ r24
            if (r20 < 0) goto L26f
            r20 = 60
            com.google.android.material.datepicker.C0059.f59 = r20
            java.lang.String r20 = "ۥۢ۠"
            int r20 = androidx.legacy.content.C0028.m114(r20)
            r66 = r5
            r67 = r20
            goto L77
        L26f:
            int r20 = android.support.v4.graphics.drawable.C0005.f5
            int r24 = com.google.android.material.carousel.C0054.f54
            int r20 = r20 % r24
            r24 = 1748695(0x1aaed7, float:2.450444E-39)
            int r20 = r20 + r24
            r66 = r5
            r67 = r20
            goto L77
        L280:
            r5 = r17
        L282:
            int r17 = com.google.android.material.behavior.C0050.f50
            if (r17 > 0) goto L299
            com.google.android.material.appbar.C0049.m199()
            java.lang.String r20 = "ۦ۠ۧ"
            r17 = r5
            r24 = r29
        L28f:
            int r5 = com.google.android.material.behavior.C0050.m203(r20)
            r29 = r24
            r67 = r5
            goto L77
        L299:
            java.lang.String r17 = "ۥۧۢ"
            r20 = r17
            r24 = r10
            r25 = r12
            goto L16c
        L2a3:
            int r5 = com.google.android.material.internal.C0061.f61
            int r14 = androidx.constraintlayout.widget.C0020.f20
            int r5 = r5 - r14
            r14 = 1755092(0x1ac7d4, float:2.459408E-39)
            r5 = r5 ^ r14
            r67 = r5
            r14 = r23
            goto L77
        L2b2:
            r5 = r30
        L2b4:
            int r20 = com.google.android.material.chip.C0056.f56
            if (r20 < 0) goto L2c7
            com.github.megatronking.stringfog.xor.C0045.m181()
            java.lang.String r20 = "ۡۦۡ"
            r30 = r5
        L2bf:
            int r5 = com.github.megatronking.stringfog.xor.C0046.m186(r20)
            r67 = r5
            goto L77
        L2c7:
            int r20 = androidx.core.widget.C0025.f25
            int r24 = android.app.C0002.f2
            int r20 = r20 * r24
            r24 = 2373589(0x2437d5, float:3.326107E-39)
            int r20 = r20 + r24
            r30 = r5
            r67 = r20
            goto L77
        L2d8:
            java.lang.String r5 = "WtECzTg0FA==\n"
            java.lang.String r20 = "PbR2m1FRYxg=\n"
            r0 = r20
            java.lang.String r20 = defpackage.u40.a(r5, r0)     // Catch: java.lang.Throwable -> Lef8
            td r24 = new td     // Catch: java.lang.Throwable -> Lef8
            r5 = 0
            r0 = r24
            r1 = r29
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> Lef8
            java.lang.String r5 = "ۦۦۥ"
        L2ee:
            int r5 = androidx.appcompat.widget.C0013.m53(r5)
            r38 = r20
            r39 = r24
            r67 = r5
            goto L77
        L2fa:
            java.lang.String r5 = "wvkhzrHB34jR\n"
            java.lang.String r20 = "4chg/oHx77g=\n"
            r0 = r20
            java.lang.String r52 = defpackage.u40.a(r5, r0)
            java.lang.String r5 = "ۦۣ"
            int r5 = android.app.C0002.m8(r5)
            r67 = r5
            goto L77
        L30e:
            int r5 = android.view.C0007.f7
            int r20 = com.google.android.material.datepicker.C0059.f59
            r0 = r20
            int r0 = r0 % (-2275)
            r20 = r0
            int r5 = r5 - r20
            if (r5 > 0) goto L32c
            r5 = 82
            androidx.activity.result.C0008.f8 = r5
            java.lang.String r5 = "ۨ۟ۢ"
            int r5 = com.github.megatronking.stringfog.xor.C0046.m186(r5)
            r32 = r31
            r67 = r5
            goto L77
        L32c:
            r5 = r31
        L32e:
            java.lang.String r20 = "ۥۣۥ"
            int r20 = androidx.core.widget.C0025.m102(r20)
            r32 = r5
            r67 = r20
            goto L77
        L33a:
            int r5 = androidx.versionedparcelable.C0038.f38
            int r20 = androidx.constraintlayout.widget.C0020.f20
            r0 = r20
            int r0 = r0 * 6699
            r20 = r0
            int r5 = r5 * r20
            if (r5 > 0) goto L355
            com.google.android.material.chip.C0057.m230()
            java.lang.String r5 = "ۣۢۧ"
            int r5 = com.github.megatronking.stringfog.xor.C0046.m186(r5)
            r67 = r5
            goto L77
        L355:
            java.lang.String r5 = "ۤۧ"
        L357:
            int r5 = androidx.versionedparcelable.C0039.m159(r5)
            r67 = r5
            goto L77
        L35f:
            if (r63 != 0) goto L54e
            java.lang.String r20 = "ۣ۠ۤ"
            r5 = r35
            r24 = r20
        L367:
            int r20 = androidx.recyclerview.widget.C0033.m132(r24)
            r35 = r5
            r67 = r20
            goto L77
        L371:
            int r5 = android.app.C0000.m0()
            if (r5 < 0) goto L386
            r5 = 4
            com.google.android.material.appbar.C0049.f49 = r5
            java.lang.String r5 = "ۣ۠ۤ"
            int r5 = com.github.megatronking.stringfog.xor.C0046.m186(r5)
            r37 = r7
            r67 = r5
            goto L77
        L386:
            java.lang.String r5 = "ۣۣۤ"
            r20 = r36
            r24 = r7
        L38c:
            int r5 = androidx.startup.C0037.m149(r5)
            r36 = r20
            r37 = r24
            r67 = r5
            goto L77
        L398:
            int r5 = android.app.C0001.f1
            int r9 = androidx.activity.result.C0009.f9
            int r9 = r9 / 7474
            int r5 = r5 + r9
            if (r5 < 0) goto L3b1
            r5 = 16
            com.github.megatronking.stringfog.C0048.f48 = r5
            java.lang.String r5 = "ۤۢۢ"
            int r5 = android.support.v4.graphics.drawable.C0006.m26(r5)
            r9 = r29
            r67 = r5
            goto L77
        L3b1:
            java.lang.String r5 = "ۡۥۦ"
            r9 = r29
            goto L87
        L3b7:
            java.lang.String r5 = "+VCkWpk=\n"
            java.lang.String r20 = "iTHWO/Q6Gko=\n"
            r0 = r20
            java.lang.String r5 = defpackage.u40.a(r5, r0)
            r0 = r69
            defpackage.ip.o(r5, r0)
            r0 = r69
            java.lang.Object r0 = r0.thisObject
            r28 = r0
            r0 = r68
            java.lang.String r5 = r0.a
            r0 = r28
            java.lang.Object r5 = de.robv.android.xposed.XposedHelpers.getObjectField(r0, r5)
            boolean r0 = r5 instanceof android.widget.ListView
            r20 = r0
            if (r20 == 0) goto Lbff
            android.widget.ListView r5 = (android.widget.ListView) r5
            int r20 = androidx.appcompat.app.C0012.f12
            int r24 = androidx.recyclerview.widget.C0032.f32
            r0 = r24
            int r0 = r0 / (-7642)
            r24 = r0
            int r20 = r20 + r24
            if (r20 > 0) goto L3fc
            r20 = 93
            com.google.android.material.carousel.C0052.f52 = r20
            java.lang.String r20 = "ۢۢ۟"
            int r20 = defpackage.C0072.m288(r20)
            r37 = r5
            r67 = r20
            goto L77
        L3fc:
            java.lang.String r20 = "۠ۦۣ"
            int r20 = com.github.megatronking.stringfog.annotation.C0044.m176(r20)
            r37 = r5
            r67 = r20
            goto L77
        L408:
            android.content.Context r24 = r37.getContext()
            if (r24 != 0) goto L506
            int r5 = com.google.android.material.internal.C0061.m244()
            if (r5 > 0) goto L424
            r5 = 39
            com.google.android.material.chip.C0056.f56 = r5
            java.lang.String r5 = "ۢۨۧ"
            int r5 = androidx.core.content.C0024.m98(r5)
            r29 = r24
            r67 = r5
            goto L77
        L424:
            java.lang.String r5 = "ۣ۟ۢ"
            r20 = r5
            goto L28f
        L42a:
            r5 = 1092616192(0x41200000, float:10.0)
            float r5 = defpackage.ff.p(r5)
            r0 = r61
            r0.setElevation(r5)
            r57.clear()
            int r12 = r22.size()
            r24 = 0
            r25 = 0
            java.lang.String r10 = "ۣۡۤ"
            r5 = r17
            r20 = r10
            r21 = r22
            r23 = r12
            goto L16c
        L44c:
            r5 = 1086324736(0x40c00000, float:6.0)
            float r27 = defpackage.ff.p(r5)
            int r5 = androidx.coordinatorlayout.widget.C0022.f22
            if (r5 < 0) goto L460
            java.lang.String r5 = "ۥۡۧ"
            int r5 = androidx.versionedparcelable.C0042.m170(r5)
            r67 = r5
            goto L77
        L460:
            int r5 = com.google.android.material.chip.C0056.f56
            int r20 = defpackage.C0071.f71
            int r5 = r5 / r20
            r20 = 1746972(0x1aa81c, float:2.448029E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        L46f:
            int r5 = androidx.recyclerview.widget.C0033.f33
            int r20 = com.google.android.material.appbar.C0049.f49
            r0 = r20
            int r0 = r0 + 3935
            r20 = r0
            int r5 = r5 % r20
            if (r5 > 0) goto L487
            r5 = 8
            androidx.appcompat.widget.C0014.f14 = r5
            r5 = r32
            r26 = r27
            goto L32e
        L487:
            java.lang.String r20 = "ۡۦۨ"
            r5 = r17
            r24 = r10
            r25 = r12
            r26 = r27
            goto L16c
        L493:
            int r5 = com.github.megatronking.stringfog.C0048.m194()
            if (r5 > 0) goto L4a3
            java.lang.String r5 = "ۥ۟۟"
        L49b:
            int r5 = android.support.v4.graphics.drawable.C0006.m26(r5)
            r67 = r5
            goto L77
        L4a3:
            java.lang.String r5 = "ۡۧۧ"
        L4a5:
            int r5 = androidx.versionedparcelable.C0039.m159(r5)
            r67 = r5
            goto L77
        L4ad:
            android.view.ViewParent r5 = r37.getParent()
            boolean r0 = r5 instanceof android.view.ViewGroup
            r20 = r0
            if (r20 == 0) goto L5c3
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r20 = androidx.versionedparcelable.C0038.m155()
            if (r20 > 0) goto L4ce
            androidx.core.widget.C0025.m103()
            java.lang.String r20 = "ۣۣۤ"
            int r20 = android.support.v4.graphics.drawable.C0005.m23(r20)
            r63 = r5
            r67 = r20
            goto L77
        L4ce:
            int r20 = androidx.recyclerview.widget.C0033.f33
            int r24 = androidx.savedstate.C0034.f34
            r20 = r20 | r24
            r24 = 1753449(0x1ac169, float:2.457105E-39)
            int r20 = r20 + r24
            r63 = r5
            r67 = r20
            goto L77
        L4df:
            int r5 = androidx.activity.result.C0008.f8
            int r20 = com.google.android.material.appbar.C0049.f49
            int r5 = r5 + r20
            r20 = 1752402(0x1abd52, float:2.455638E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        L4ee:
            java.io.PrintStream r5 = java.lang.System.out
            r0 = r16
            r5.println(r0)
            int r5 = io.fastkv.C0068.f68
            int r20 = com.google.android.material.carousel.C0052.f52
            r5 = r5 | r20
            r20 = 1748957(0x1aafdd, float:2.450811E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        L504:
            r24 = r29
        L506:
            java.lang.String r5 = "۠ۡۧ"
            r20 = r5
            r29 = r24
        L50c:
            int r5 = androidx.coordinatorlayout.widget.C0022.m90(r20)
            r67 = r5
            goto L77
        L514:
            int r5 = androidx.profileinstaller.C0031.f31
            if (r5 < 0) goto L52a
            r5 = 21
            androidx.activity.result.C0009.f9 = r5
            java.lang.String r20 = "ۤۥۤ"
            r5 = r33
        L520:
            int r20 = androidx.constraintlayout.helper.widget.C0017.m70(r20)
            r33 = r5
            r67 = r20
            goto L77
        L52a:
            java.lang.String r5 = "ۧ۟ۢ"
            r20 = r5
            r24 = r29
            goto L28f
        L532:
            int r5 = androidx.constraintlayout.helper.widget.C0017.f17
            if (r5 > 0) goto L544
            r5 = 96
            androidx.coordinatorlayout.widget.C0022.f22 = r5
            java.lang.String r5 = "ۡۥۥ"
            int r5 = androidx.savedstate.C0036.m144(r5)
            r67 = r5
            goto L77
        L544:
            java.lang.String r5 = "ۤۦۢ"
        L546:
            int r5 = android.app.C0003.m13(r5)
            r67 = r5
            goto L77
        L54e:
            int r5 = androidx.core.content.C0024.f24
            if (r5 > 0) goto L560
            java.lang.String r5 = "ۦۦۤ"
            r20 = r34
        L556:
            int r5 = com.ljx.wechatmod.auth.C0065.m263(r5)
            r34 = r20
            r67 = r5
            goto L77
        L560:
            java.lang.String r5 = "ۣ۟ۦ"
            r20 = r34
            goto L556
        L565:
            int r5 = androidx.activity.C0011.m44()
            if (r5 > 0) goto L578
            r5 = 2
            com.google.android.material.theme.C0064.f64 = r5
            java.lang.String r5 = "ۣۦۤ"
            int r5 = androidx.core.content.C0024.m98(r5)
            r67 = r5
            goto L77
        L578:
            java.lang.String r20 = "۟ۡ۠"
            r5 = r28
            goto L215
        L57e:
            if (r12 >= r14) goto Ldcb
            r0 = r21
            java.lang.Object r5 = r0.get(r12)
            if (r10 < 0) goto L6af
            java.lang.String r5 = (java.lang.String) r5
            android.widget.TextView r20 = new android.widget.TextView
            r0 = r20
            r0.<init>(r9)
            r0 = r20
            r0.setText(r5)
            r5 = 1096810496(0x41600000, float:14.0)
            r0 = r20
            r0.setTextSize(r5)
            r5 = 17
            r0 = r20
            r0.setGravity(r5)
            int r5 = androidx.savedstate.C0034.f34
            if (r5 < 0) goto L5b2
            r5 = 62
            android.support.v4.graphics.drawable.C0006.f6 = r5
            java.lang.String r24 = "ۦۤۢ"
            r5 = r20
            goto L367
        L5b2:
            int r5 = android.app.C0001.f1
            int r24 = androidx.core.widget.C0025.f25
            int r5 = r5 % r24
            r24 = 1749851(0x1ab35b, float:2.452064E-39)
            int r5 = r5 + r24
            r35 = r20
            r67 = r5
            goto L77
        L5c3:
            java.lang.String r5 = "ۥۨۨ"
            r20 = r5
            goto L50c
        L5c9:
            int r5 = androidx.versionedparcelable.C0042.f42
            int r20 = androidx.versionedparcelable.C0041.f41
            r5 = r5 ^ r20
            r20 = -1750088(0xffffffffffe54bb8, float:NaN)
            r5 = r5 ^ r20
            r67 = r5
            goto L77
        L5d8:
            r5 = 2
            int[] r0 = new int[r5]
            r20 = r0
            r5 = 0
            java.lang.String r24 = "OKBPU7GkqQ==\n"
            java.lang.String r25 = "G+YJFffi79c=\n"
            java.lang.String r24 = defpackage.u40.a(r24, r25)
            int r24 = android.graphics.Color.parseColor(r24)
            r20[r5] = r24
            java.lang.String r5 = "3DmXfqz6xA==\n"
            java.lang.String r24 = "/3+lOJ68828=\n"
            r0 = r24
            java.lang.String r5 = defpackage.u40.a(r5, r0)
            int r5 = android.graphics.Color.parseColor(r5)
            r20[r45] = r5
            int r5 = android.support.v4.graphics.drawable.C0004.f4
            if (r5 < 0) goto L606
            java.lang.String r5 = "ۣ۟ۢ"
            r24 = r37
            goto L38c
        L606:
            int r5 = androidx.recyclerview.widget.C0033.f33
            int r24 = com.github.megatronking.stringfog.C0048.f48
            r5 = r5 | r24
            r24 = 1747388(0x1aa9bc, float:2.448612E-39)
            int r5 = r5 + r24
            r36 = r20
            r67 = r5
            goto L77
        L617:
            int r5 = androidx.savedstate.C0036.m147()
            if (r5 < 0) goto L628
            androidx.savedstate.C0035.m143()
            java.lang.String r5 = "ۡۤ۟"
            r20 = r38
            r24 = r39
            goto L2ee
        L628:
            java.lang.String r5 = "۟ۡۥ"
            r20 = r5
            goto L50c
        L62e:
            java.lang.String r5 = "XWMG6B1n6/M4\n"
            java.lang.String r20 = "fiE1rlshrbU=\n"
            r0 = r20
            java.lang.String r5 = defpackage.u40.a(r5, r0)
            int r20 = androidx.versionedparcelable.C0041.f41
            if (r20 > 0) goto L64b
            defpackage.C0071.m284()
            java.lang.String r20 = "ۨۧۧ"
            int r20 = com.google.android.material.datepicker.C0059.m239(r20)
            r51 = r5
            r67 = r20
            goto L77
        L64b:
            r20 = r52
        L64d:
            java.lang.String r24 = "ۨۨ۠"
            int r24 = kotlinx.coroutines.C0069.m277(r24)
            r51 = r5
            r52 = r20
            r67 = r24
            goto L77
        L65b:
            int r5 = com.github.megatronking.stringfog.C0047.f47
            int r20 = androidx.savedstate.C0035.f35
            r0 = r20
            int r0 = r0 / (-7748)
            r20 = r0
            int r5 = r5 * r20
            if (r5 == 0) goto L678
            android.support.v4.graphics.drawable.C0006.m24()
            java.lang.String r5 = "۠ۦۧ"
            int r5 = com.github.megatronking.stringfog.C0047.m189(r5)
            r50 = r36
            r67 = r5
            goto L77
        L678:
            int r5 = defpackage.C0073.f73
            int r20 = com.ljx.wechatmod.hook.C0066.f66
            int r5 = r5 + r20
            r20 = 1748316(0x1aad5c, float:2.449913E-39)
            r5 = r5 ^ r20
            r50 = r36
            r67 = r5
            goto L77
        L689:
            int r5 = androidx.savedstate.C0035.f35
            int r20 = com.google.android.material.chip.C0056.f56
            r0 = r20
            int r0 = r0 / 3227
            r20 = r0
            r5 = r5 ^ r20
            if (r5 > 0) goto L6a5
            java.lang.String r5 = "ۤۨۡ"
            r20 = r40
        L69b:
            int r5 = com.google.android.material.floatingactionbutton.C0060.m241(r5)
            r40 = r20
            r67 = r5
            goto L77
        L6a5:
            java.lang.String r5 = "ۦۢۦ"
        L6a7:
            int r5 = com.google.android.material.datepicker.C0059.m239(r5)
            r67 = r5
            goto L77
        L6af:
            java.lang.String r5 = "۟ۢ۟"
            r20 = r5
            goto L2bf
        L6b5:
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r0 = r58
            r1 = r50
            r5.<init>(r0, r1)
            r20 = 1148829696(0x4479c000, float:999.0)
            r0 = r20
            r5.setCornerRadius(r0)
            int r49 = defpackage.ff.q(r45)
            boolean r20 = defpackage.vd.e
            if (r20 == 0) goto Lb43
            java.lang.String r25 = "eo6OXIRCPD0f\n"
            java.lang.String r48 = "WbrKGsIEens=\n"
            int r20 = androidx.constraintlayout.helper.widget.C0017.m71()
            if (r20 > 0) goto L6e9
            androidx.activity.result.C0009.m36()
            java.lang.String r20 = "ۣ۟ۦ"
            int r20 = androidx.savedstate.C0035.m140(r20)
            r46 = r5
            r47 = r25
            r67 = r20
            goto L77
        L6e9:
            java.lang.String r20 = "ۧۧۨ"
            r24 = r20
        L6ed:
            int r20 = androidx.constraintlayout.widget.C0018.m73(r24)
            r46 = r5
            r47 = r25
            r67 = r20
            goto L77
        L6f9:
            int r5 = androidx.versionedparcelable.C0038.f38
            int r20 = android.view.C0007.f7
            r0 = r20
            int r0 = r0 / (-2899)
            r20 = r0
            r5 = r5 | r20
            if (r5 < 0) goto L715
            r5 = 95
            androidx.appcompat.app.C0012.f12 = r5
            java.lang.String r5 = "ۦۡۦ"
            int r5 = androidx.startup.C0037.m149(r5)
            r67 = r5
            goto L77
        L715:
            int r5 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r20 = android.app.C0003.f3
            int r5 = r5 - r20
            r20 = 1749158(0x1ab0a6, float:2.451092E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        L724:
            int r5 = androidx.emoji2.text.C0026.m106()
            if (r5 > 0) goto L734
            java.lang.String r5 = "ۥۧۨ"
            int r5 = androidx.appcompat.widget.C0015.m60(r5)
            r67 = r5
            goto L77
        L734:
            int r5 = androidx.versionedparcelable.C0040.f40
            int r20 = defpackage.C0072.f72
            r5 = r5 ^ r20
            r20 = 1754570(0x1ac5ca, float:2.458676E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        L743:
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            r0 = r29
            r5.<init>(r0)
            android.view.ViewGroup$LayoutParams r17 = new android.view.ViewGroup$LayoutParams
            r18 = -1
            r19 = 54
            int r19 = defpackage.ff.q(r19)
            r17.<init>(r18, r19)
            r0 = r17
            r5.setLayoutParams(r0)
            r17 = 0
            r0 = r17
            r5.setBackgroundColor(r0)
            android.widget.FrameLayout r18 = new android.widget.FrameLayout
            r0 = r18
            r1 = r29
            r0.<init>(r1)
            android.graphics.drawable.GradientDrawable r19 = new android.graphics.drawable.GradientDrawable
            r19.<init>()
            boolean r17 = defpackage.vd.e
            if (r17 == 0) goto L282
            java.lang.String r17 = "Z7U6Aloe6EwB\n"
            java.lang.String r20 = "RIwDMxkvq30=\n"
            r0 = r17
            r1 = r20
            java.lang.String r25 = defpackage.u40.a(r0, r1)
            int r17 = com.google.android.material.theme.C0063.f63
            if (r17 > 0) goto L797
            r17 = 97
            defpackage.C0071.f71 = r17
            java.lang.String r17 = "۠ۡۧ"
            int r20 = androidx.versionedparcelable.C0042.m170(r17)
            r17 = r5
            r56 = r25
            r67 = r20
            goto L77
        L797:
            java.lang.String r20 = "ۧۤۨ"
            r17 = r5
            r24 = r20
            goto L180
        L79f:
            java.util.ArrayList r22 = defpackage.vd.a
            android.content.res.Resources r5 = r29.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.uiMode
            r20 = r5 ^ (-49)
            r5 = r5 & r20
            r20 = 32
            r0 = r20
            if (r5 != r0) goto Ld39
            r32 = 1
            int r5 = androidx.emoji2.text.C0026.f26
            int r20 = android.support.v4.graphics.drawable.C0006.f6
            r0 = r20
            int r0 = r0 % (-6198)
            r20 = r0
            int r5 = r5 - r20
            if (r5 > 0) goto L7ca
            com.ljx.wechatmod.auth.C0065.m260()
            goto Lee
        L7ca:
            int r5 = androidx.emoji2.text.C0026.f26
            int r20 = com.google.android.material.datepicker.C0058.f58
            int r5 = r5 - r20
            r20 = 1746888(0x1aa7c8, float:2.447911E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        L7d9:
            r0 = r59
            r1 = r26
            r0.setElevation(r1)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r20 = 100
            int r20 = defpackage.ff.q(r20)
            r24 = -1
            r0 = r20
            r1 = r24
            r5.<init>(r0, r1)
            r0 = r59
            r0.setLayoutParams(r5)
            defpackage.vd.c = r59
            r0 = r18
            r1 = r59
            r0.addView(r1)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r0 = r29
            r5.<init>(r0)
            r20 = 0
            r0 = r20
            r5.setOrientation(r0)
            android.widget.FrameLayout$LayoutParams r20 = new android.widget.FrameLayout$LayoutParams
            r24 = -1
            r25 = -1
            r0 = r20
            r1 = r24
            r2 = r25
            r0.<init>(r1, r2)
            r0 = r20
            r5.setLayoutParams(r0)
            int r20 = r22.size()
            r0 = r20
            float r0 = (float) r0
            r20 = r0
            r0 = r20
            r5.setWeightSum(r0)
            int r20 = androidx.savedstate.C0036.f36
            int r24 = androidx.core.content.C0024.f24
            r0 = r24
            int r0 = r0 / (-3706)
            r24 = r0
            int r20 = r20 - r24
            if (r20 > 0) goto L84c
            com.github.megatronking.stringfog.xor.C0045.m181()
            java.lang.String r20 = "ۡۥۦ"
            int r20 = androidx.lifecycle.C0029.m116(r20)
            r61 = r5
            r67 = r20
            goto L77
        L84c:
            int r20 = android.support.v4.graphics.drawable.C0005.f5
            int r24 = com.ljx.wechatmod.hook.C0066.f66
            int r20 = r20 + r24
            r24 = 1748555(0x1aae4b, float:2.450247E-39)
            int r20 = r20 + r24
            r61 = r5
            r67 = r20
            goto L77
        L85d:
            r0 = r62
            r1 = r48
            java.lang.String r5 = defpackage.u40.a(r0, r1)
            int r5 = android.graphics.Color.parseColor(r5)
            int r20 = android.support.v4.graphics.drawable.C0006.f6
            int r24 = androidx.lifecycle.C0029.f29
            r0 = r24
            r0 = r0 ^ (-3119(0xfffffffffffff3d1, float:NaN))
            r24 = r0
            int r20 = r20 / r24
            if (r20 == 0) goto L886
            androidx.activity.C0010.m40()
            java.lang.String r20 = "ۧ۠ۨ"
            int r20 = androidx.profileinstaller.C0030.m120(r20)
            r64 = r5
            r67 = r20
            goto L77
        L886:
            int r20 = androidx.coordinatorlayout.widget.C0022.f22
            int r24 = androidx.coordinatorlayout.widget.C0022.f22
            int r20 = r20 - r24
            r24 = 1748767(0x1aaf1f, float:2.450545E-39)
            int r20 = r20 + r24
            r64 = r5
            r67 = r20
            goto L77
        L897:
            int r5 = android.view.C0007.f7
            int r20 = com.github.megatronking.stringfog.xor.C0045.f45
            r5 = r5 ^ r20
            r20 = 56650(0xdd4a, float:7.9384E-41)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        L8a6:
            int r5 = androidx.core.widget.C0025.f25
            int r20 = com.google.android.material.datepicker.C0059.f59
            r5 = r5 | r20
            r20 = -1755041(0xffffffffffe5385f, float:NaN)
            r5 = r5 ^ r20
            r67 = r5
            goto L77
        L8b5:
            int r5 = androidx.constraintlayout.widget.C0018.f18
            int r20 = com.google.android.material.carousel.C0054.f54
            r0 = r20
            r0 = r0 ^ 3849(0xf09, float:5.394E-42)
            r20 = r0
            r5 = r5 | r20
            if (r5 > 0) goto L8d0
            android.support.v4.graphics.drawable.C0005.m20()
            java.lang.String r5 = "ۡۡۦ"
            int r5 = androidx.constraintlayout.widget.C0019.m79(r5)
            r67 = r5
            goto L77
        L8d0:
            java.lang.String r5 = "ۣۧۡ"
        L8d2:
            int r5 = androidx.savedstate.C0034.m138(r5)
            r67 = r5
            goto L77
        L8da:
            defpackage.bb.g0()
            int r5 = defpackage.C0071.f71
            int r20 = androidx.constraintlayout.widget.C0020.f20
            r5 = r5 ^ r20
            r20 = 57073(0xdef1, float:7.9976E-41)
            r5 = r5 ^ r20
            r67 = r5
            goto L77
        L8ec:
            int r5 = androidx.constraintlayout.widget.C0018.f18
            if (r5 > 0) goto L8fd
            com.google.android.material.appbar.C0049.m199()
            java.lang.String r5 = "ۦۧۥ"
            int r5 = com.google.android.material.behavior.C0050.m203(r5)
            r67 = r5
            goto L77
        L8fd:
            java.lang.String r5 = "ۣۣ۟"
            r20 = r34
            goto L556
        L903:
            int r5 = android.app.C0002.f2
            int r20 = androidx.viewpager2.adapter.C0043.f43
            r0 = r20
            int r0 = r0 * 5714
            r20 = r0
            int r5 = r5 % r20
            if (r5 > 0) goto L929
            java.lang.String r20 = "ۣ۠ۤ"
            r5 = r41
            r24 = r42
            r25 = r43
            r44 = r43
        L91b:
            int r20 = com.google.android.material.floatingactionbutton.C0060.m241(r20)
            r41 = r5
            r42 = r24
            r43 = r25
            r67 = r20
            goto L77
        L929:
            java.lang.String r5 = "ۥۢ۠"
            r24 = r5
            r25 = r56
            r44 = r43
            goto L180
        L933:
            int r5 = androidx.legacy.content.C0028.m112()
            if (r5 > 0) goto L946
            androidx.constraintlayout.widget.C0020.m82()
            java.lang.String r5 = "ۧ۠ۦ"
            int r5 = androidx.versionedparcelable.C0039.m159(r5)
            r67 = r5
            goto L77
        L946:
            int r5 = com.google.android.material.behavior.C0050.f50
            int r20 = android.app.C0003.f3
            r5 = r5 ^ r20
            r20 = 1747969(0x1aac01, float:2.449426E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        L955:
            int r5 = androidx.constraintlayout.widget.C0018.f18
            int r20 = com.google.android.material.bottomsheet.C0051.f51
            r0 = r20
            int r0 = r0 * 1264
            r20 = r0
            int r5 = r5 - r20
            if (r5 > 0) goto L96b
            r5 = 57
            android.support.v4.graphics.drawable.C0005.f5 = r5
            java.lang.String r5 = "ۡۧۧ"
            goto L546
        L96b:
            java.lang.String r5 = "ۤۢ۠"
            int r5 = androidx.savedstate.C0036.m144(r5)
            r67 = r5
            goto L77
        L975:
            android.view.ViewTreeObserver r5 = r17.getViewTreeObserver()
            rd r20 = new rd
            r0 = r20
            r1 = r37
            r2 = r60
            r3 = r33
            r4 = r17
            r0.<init>(r1, r2, r3, r4)
            r0 = r20
            r5.addOnPreDrawListener(r0)
            r17.bringToFront()
            int r5 = android.support.v4.graphics.drawable.C0004.f4
            int r20 = androidx.fragment.app.C0027.f27
            r0 = r20
            r0 = r0 | 4673(0x1241, float:6.548E-42)
            r20 = r0
            r5 = r5 ^ r20
            if (r5 > 0) goto L9a8
            java.lang.String r5 = "ۤۥۢ"
            int r5 = androidx.versionedparcelable.C0038.m153(r5)
            r67 = r5
            goto L77
        L9a8:
            r5 = r9
            goto Lcd
        L9ab:
            int r5 = androidx.profileinstaller.C0031.m124()
            if (r5 > 0) goto L9b5
            java.lang.String r5 = "ۡۦۨ"
            goto L87
        L9b5:
            java.lang.String r20 = "۟ۤۥ"
            r5 = r28
            goto L215
        L9bb:
            int r5 = androidx.savedstate.C0036.f36
            int r20 = com.google.android.material.appbar.C0049.f49
            int r5 = r5 + r20
            r20 = 1750638(0x1ab66e, float:2.453166E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        L9ca:
            r5 = 0
            defpackage.ff.y = r5
            int r5 = androidx.versionedparcelable.C0040.f40
            int r20 = com.github.megatronking.stringfog.C0047.f47
            r5 = r5 | r20
            r20 = 1754417(0x1ac531, float:2.458462E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        L9dc:
            defpackage.ip.l(r6)     // Catch: java.lang.Throwable -> Lef8
            java.lang.Class r20 = r6.getClass()     // Catch: java.lang.Throwable -> Lef8
            int r5 = com.google.android.material.theme.C0064.f64
            int r24 = android.app.C0003.f3
            r0 = r24
            r0 = r0 | (-4065(0xfffffffffffff01f, float:NaN))
            r24 = r0
            int r5 = r5 * r24
            if (r5 < 0) goto L9fb
            java.lang.String r24 = "ۣۢ"
            r5 = r46
            r40 = r20
            r25 = r47
            goto L6ed
        L9fb:
            java.lang.String r5 = "ۥۤ"
            goto L69b
        L9ff:
            r0 = r19
            r1 = r30
            r2 = r66
            r0.setStroke(r1, r2)
            r18.setBackground(r19)
            r5 = 3
            int r5 = defpackage.ff.q(r5)
            r20 = 3
            int r20 = defpackage.ff.q(r20)
            r24 = 3
            int r24 = defpackage.ff.q(r24)
            r25 = 3
            int r25 = defpackage.ff.q(r25)
            r0 = r18
            r1 = r20
            r2 = r24
            r3 = r25
            r0.setPadding(r5, r1, r2, r3)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r20 = -1
            r24 = 36
            int r24 = defpackage.ff.q(r24)
            r0 = r20
            r1 = r24
            r5.<init>(r0, r1)
            r20 = 16
            int r20 = defpackage.ff.q(r20)
            r24 = 10
            int r24 = defpackage.ff.q(r24)
            r25 = 16
            int r25 = defpackage.ff.q(r25)
            r58 = 8
            int r58 = defpackage.ff.q(r58)
            r0 = r20
            r1 = r24
            r2 = r25
            r3 = r58
            r5.setMargins(r0, r1, r2, r3)
            r0 = r18
            r0.setLayoutParams(r5)
            android.view.View r20 = new android.view.View
            r0 = r20
            r1 = r29
            r0.<init>(r1)
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int r24 = androidx.fragment.app.C0027.f27
            if (r24 < 0) goto La75
        La75:
            java.lang.String r24 = "ۡۢۨ"
            int r24 = com.google.android.material.datepicker.C0059.m239(r24)
            r58 = r5
            r59 = r20
            r67 = r24
            goto L77
        La83:
            int r5 = androidx.activity.result.C0008.f8
            int r20 = android.app.C0000.f0
            r0 = r20
            int r0 = r0 + (-6765)
            r20 = r0
            int r5 = r5 * r20
            if (r5 > 0) goto Laa3
            r5 = 96
            com.github.megatronking.stringfog.annotation.C0044.f44 = r5
            java.lang.String r5 = "۟۠"
            r20 = r50
        La99:
            int r5 = androidx.savedstate.C0036.m144(r5)
            r50 = r20
            r67 = r5
            goto L77
        Laa3:
            int r5 = com.ljx.wechatmod.ui.C0067.f67
            int r20 = androidx.legacy.content.C0028.f28
            int r5 = r5 * r20
            r20 = 1665639(0x196a67, float:2.334057E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        Lab2:
            boolean r5 = defpackage.vd.e
            if (r5 == 0) goto L18a
            r5 = 2
            int[] r0 = new int[r5]
            r20 = r0
            r5 = 0
            java.lang.String r24 = "juUkuYlIaw==\n"
            java.lang.String r25 = "rdJnjspwW5c=\n"
            java.lang.String r24 = defpackage.u40.a(r24, r25)
            int r24 = android.graphics.Color.parseColor(r24)
            r20[r5] = r24
            java.lang.String r5 = "IP2oOuuF7w==\n"
            java.lang.String r24 = "A8ubDNiz2WQ=\n"
            r0 = r24
            java.lang.String r5 = defpackage.u40.a(r5, r0)
            int r5 = android.graphics.Color.parseColor(r5)
            r20[r45] = r5
            java.lang.String r5 = "ۣۣۡ"
            goto La99
        Ladd:
            int r5 = com.ljx.wechatmod.hook.C0066.f66
            int r20 = com.google.android.material.bottomsheet.C0051.f51
            int r5 = r5 + r20
            r20 = 1748099(0x1aac83, float:2.449608E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        Laec:
            int r5 = com.github.megatronking.stringfog.annotation.C0044.f44
            if (r5 > 0) goto Laf9
            com.google.android.material.chip.C0057.m230()
            r5 = r51
            r20 = r53
            goto L64d
        Laf9:
            java.lang.String r5 = "ۤۨ"
            r52 = r53
            goto L4a5
        Laff:
            int r5 = com.google.android.material.carousel.C0052.m210()
            if (r5 > 0) goto Lb0d
            r5 = 33
            com.ljx.wechatmod.ui.C0067.f67 = r5
            java.lang.String r5 = "ۢ۟ۡ"
            goto L357
        Lb0d:
            java.lang.String r5 = "ۥۣۡ"
            int r5 = com.google.android.material.chip.C0057.m229(r5)
            r67 = r5
            goto L77
        Lb17:
            r5 = 0
            int r20 = android.support.v4.graphics.drawable.C0005.m20()
            if (r20 < 0) goto Lb30
            r20 = 52
            androidx.appcompat.app.C0012.f12 = r20
            r20 = r5
        Lb24:
            java.lang.String r5 = "ۦۧۤ"
            int r5 = com.google.android.material.bottomsheet.C0051.m207(r5)
            r54 = r20
            r67 = r5
            goto L77
        Lb30:
            int r20 = androidx.core.content.C0023.f23
            int r24 = androidx.startup.C0037.f37
            int r20 = r20 - r24
            r24 = 1748983(0x1aaff7, float:2.450847E-39)
            r20 = r20 ^ r24
            r54 = r5
            r67 = r20
            goto L77
        Lb41:
            r5 = r46
        Lb43:
            int r20 = android.support.v4.graphics.drawable.C0006.f6
            if (r20 > 0) goto Lb57
            r20 = 86
            androidx.savedstate.C0034.f34 = r20
            java.lang.String r20 = "ۥ۟ۡ"
            int r20 = android.app.C0002.m8(r20)
            r46 = r5
            r67 = r20
            goto L77
        Lb57:
            int r20 = com.google.android.material.chip.C0057.f57
            int r24 = android.support.v4.graphics.drawable.C0004.f4
            r20 = r20 | r24
            r24 = -1747776(0xffffffffffe554c0, float:NaN)
            r20 = r20 ^ r24
            r46 = r5
            r67 = r20
            goto L77
        Lb68:
            r7 = 0
            int r5 = com.google.android.material.chip.C0056.f56
            if (r5 < 0) goto Lb77
            java.lang.String r5 = "ۧ۟۠"
            int r5 = com.google.android.material.carousel.C0053.m213(r5)
            r67 = r5
            goto L77
        Lb77:
            r5 = r6
        Lb78:
            java.lang.String r6 = "ۣۢۢ"
            int r20 = com.google.android.material.theme.C0062.m249(r6)
            r6 = r5
            r67 = r20
            goto L77
        Lb83:
            int r5 = com.google.android.material.carousel.C0052.f52
            int r20 = androidx.constraintlayout.helper.widget.C0017.f17
            r0 = r20
            int r0 = r0 % 5969
            r20 = r0
            r5 = r5 ^ r20
            if (r5 > 0) goto Lb9b
            java.lang.String r5 = "ۢۨۦ"
            int r5 = defpackage.C0071.m286(r5)
            r67 = r5
            goto L77
        Lb9b:
            int r5 = androidx.constraintlayout.helper.widget.C0017.f17
            int r20 = defpackage.C0073.f73
            int r5 = r5 / r20
            r20 = 1749802(0x1ab32a, float:2.451995E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        Lbaa:
            int r5 = io.fastkv.C0068.m273()
            if (r5 < 0) goto L15e
            java.lang.String r5 = "SZSlqDVVyrYNNe6WpxEFwQPZb"
            java.lang.String r5 = androidx.appcompat.widget.C0013.m54(r5)
            java.lang.Double r5 = java.lang.Double.decode(r5)
            int r16 = com.google.android.material.appbar.C0049.f49
            if (r16 > 0) goto L136
            java.lang.String r16 = "ۨ۠ۢ"
            int r20 = androidx.activity.C0011.m45(r16)
            r16 = r5
            r67 = r20
            goto L77
        Lbca:
            r5 = 0
            throw r5
        Lbcc:
            defpackage.vd.e = r32
            r22.clear()
            java.util.ArrayList r5 = defpackage.zt.K()
            int r24 = r5.size()
            r25 = 0
            int r20 = androidx.core.widget.C0025.f25
            int r41 = kotlinx.coroutines.C0070.f70
            r0 = r41
            int r0 = r0 * (-2639)
            r41 = r0
            int r20 = r20 % r41
            if (r20 < 0) goto Lbf9
            r20 = 83
            io.fastkv.C0068.f68 = r20
            java.lang.String r20 = "ۥۨۨ"
            r41 = r5
            r42 = r24
            r43 = r25
            r45 = r34
            goto L11b
        Lbf9:
            java.lang.String r20 = "۟ۧۦ"
            r45 = r34
            goto L91b
        Lbff:
            r5 = r28
            int r20 = androidx.recyclerview.widget.C0033.f33
            int r24 = androidx.coordinatorlayout.widget.C0021.f21
            r0 = r24
            int r0 = r0 + (-4470)
            r24 = r0
            int r20 = r20 * r24
            if (r20 < 0) goto Lc18
            android.view.C0007.m31()
            java.lang.String r20 = "ۧۢ۟"
            r28 = r5
            goto L50c
        Lc18:
            java.lang.String r20 = "ۧ۠۟"
            goto L215
        Lc1c:
            int r5 = android.support.v4.graphics.drawable.C0005.f5
            int r20 = com.google.android.material.carousel.C0053.f53
            int r5 = r5 % r20
            r20 = 1755449(0x1ac939, float:2.459908E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        Lc2b:
            int r5 = com.google.android.material.theme.C0062.f62
            int r20 = com.google.android.material.behavior.C0050.f50
            r0 = r20
            int r0 = r0 + 8745
            r20 = r0
            int r5 = r5 / r20
            if (r5 == 0) goto Lc48
            r5 = 7
            com.ljx.wechatmod.ui.C0067.f67 = r5
            java.lang.String r5 = "۟ۨۡ"
            int r5 = com.google.android.material.appbar.C0049.m197(r5)
            r63 = r54
            r67 = r5
            goto L77
        Lc48:
            int r5 = android.app.C0003.f3
            int r20 = androidx.savedstate.C0036.f36
            r5 = r5 | r20
            r20 = 1751585(0x1aba21, float:2.454493E-39)
            int r5 = r5 + r20
            r63 = r54
            r67 = r5
            goto L77
        Lc59:
            int r5 = android.support.v4.graphics.drawable.C0005.f5
            int r20 = androidx.versionedparcelable.C0042.f42
            r0 = r20
            int r0 = r0 * 7901
            r20 = r0
            int r5 = r5 / r20
            if (r5 == 0) goto Lc6b
            java.lang.String r5 = "ۡ۟"
            goto L4a5
        Lc6b:
            int r5 = androidx.savedstate.C0036.f36
            int r20 = com.google.android.material.bottomsheet.C0051.f51
            int r5 = r5 + r20
            r20 = 1751764(0x1abad4, float:2.454744E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        Lc7a:
            int r5 = androidx.versionedparcelable.C0040.f40
            int r20 = androidx.activity.result.C0008.f8
            int r5 = r5 * r20
            r20 = 2211107(0x21bd23, float:3.098421E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        Lc89:
            int r5 = androidx.profileinstaller.C0031.f31
            int r20 = kotlinx.coroutines.C0070.f70
            r0 = r20
            r0 = r0 | 1713(0x6b1, float:2.4E-42)
            r20 = r0
            r5 = r5 ^ r20
            if (r5 < 0) goto Lca5
            r5 = r30
        Lc99:
            java.lang.String r20 = "ۢۢ"
            int r20 = androidx.activity.C0011.m45(r20)
            r30 = r5
            r67 = r20
            goto L77
        Lca5:
            java.lang.String r5 = "ۢۡۤ"
            r20 = r40
            goto L69b
        Lcab:
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r8 = 0
            r11 = -1
            r13 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r8, r11, r13)
            r0 = r35
            r0.setLayoutParams(r5)
            nd r5 = new nd
            r0 = r37
            r1 = r28
            r5.<init>(r10, r0, r1)
            r0 = r35
            r0.setOnClickListener(r5)
            r0 = r61
            r1 = r35
            r0.addView(r1)
            r0 = r57
            r1 = r35
            r0.add(r1)
            int r5 = r10 + (-22)
            int r5 = r5 + 1
            int r11 = r5 + 22
            int r5 = 0 - r12
            int r13 = 1 - r5
            int r5 = com.google.android.material.datepicker.C0059.m236()
            if (r5 > 0) goto Lcf1
            java.lang.String r5 = "ۢۨۤ"
            int r5 = kotlinx.coroutines.C0070.m281(r5)
            r8 = r9
            r15 = r14
            r67 = r5
            goto L77
        Lcf1:
            int r5 = androidx.constraintlayout.widget.C0018.f18
            int r8 = com.github.megatronking.stringfog.C0047.f47
            int r5 = r5 * r8
            r8 = 1752617(0x1abe29, float:2.45594E-39)
            int r5 = r5 + r8
            r8 = r9
            r15 = r14
            r67 = r5
            goto L77
        Ld00:
            r0 = r46
            r1 = r49
            r2 = r64
            r0.setStroke(r1, r2)
            r0 = r59
            r1 = r46
            r0.setBackground(r1)
            boolean r5 = defpackage.vd.e
            if (r5 == 0) goto Lc1c
            r26 = 0
            int r5 = androidx.appcompat.widget.C0015.f15
            int r20 = androidx.activity.C0011.f11
            int r5 = r5 - r20
            r20 = -1755085(0xffffffffffe53833, float:NaN)
            r5 = r5 ^ r20
            r67 = r5
            goto L77
        Ld25:
            int r5 = androidx.versionedparcelable.C0040.f40
            if (r5 > 0) goto Ld33
            java.lang.String r5 = "ۡۨۥ"
            int r5 = com.google.android.material.datepicker.C0058.m234(r5)
            r67 = r5
            goto L77
        Ld33:
            java.lang.String r5 = "ۥۢ۠"
            r20 = r5
            goto L50c
        Ld39:
            java.lang.String r5 = "ۤۢۢ"
            int r5 = androidx.versionedparcelable.C0039.m159(r5)
            r67 = r5
            goto L77
        Ld43:
            r31 = 0
            int r5 = androidx.activity.result.C0009.f9
            int r20 = androidx.viewpager2.adapter.C0043.f43
            r5 = r5 ^ r20
            r20 = 1748224(0x1aad00, float:2.449784E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        Ld54:
            java.lang.String r5 = "ۢۦۡ"
            goto L236
        Ld58:
            int r5 = com.google.android.material.behavior.C0050.f50
            int r20 = androidx.startup.C0037.f37
            r5 = r5 ^ r20
            r20 = -1756140(0xffffffffffe53414, float:NaN)
            r5 = r5 ^ r20
            r67 = r5
            goto L77
        Ld67:
            r5 = 2114519049(0x7e090009, float:4.5526104E37)
            r0 = r63
            android.view.View r5 = r0.findViewById(r5)
            if (r5 == 0) goto L33a
            int r5 = io.fastkv.C0068.f68
            int r20 = defpackage.C0072.f72
            r0 = r20
            r0 = r0 ^ 2899(0xb53, float:4.062E-42)
            r20 = r0
            int r5 = r5 - r20
            if (r5 > 0) goto Ld87
            com.google.android.material.carousel.C0053.m214()
            java.lang.String r5 = "ۢۦۥ"
            goto L6a7
        Ld87:
            java.lang.String r5 = "ۥۣۡ"
            int r5 = defpackage.C0073.m292(r5)
            r67 = r5
            goto L77
        Ld91:
            java.lang.String r5 = "aLQpAc17tP57\n"
            java.lang.String r48 = "S4RtMf1LhM4=\n"
            int r20 = androidx.activity.C0011.f11
            int r24 = com.google.android.material.floatingactionbutton.C0060.f60
            int r20 = r20 % r24
            r24 = -1755138(0xffffffffffe537fe, float:NaN)
            r20 = r20 ^ r24
            r62 = r5
            r67 = r20
            goto L77
        Lda6:
            r0 = r40
            r1 = r38
            r2 = r39
            de.robv.android.xposed.XposedBridge.hookAllMethods(r0, r1, r2)     // Catch: java.lang.Throwable -> Lef8
            java.lang.String r5 = "ۤۨۡ"
            goto L49b
        Ldb3:
            r20 = r34
        Ldb5:
            int r5 = androidx.recyclerview.widget.C0033.f33
            if (r5 > 0) goto Ldc7
            r5 = 99
            androidx.coordinatorlayout.widget.C0021.f21 = r5
            java.lang.String r5 = "ۣۢ۟"
            r24 = r5
            r25 = r56
            r34 = r20
            goto L180
        Ldc7:
            java.lang.String r5 = "ۤۨۡ"
            goto L556
        Ldcb:
            java.lang.String r5 = "۟ۨۡ"
            goto L357
        Ldcf:
            android.view.View r20 = new android.view.View
            r0 = r20
            r1 = r29
            r0.<init>(r1)
            r0 = r68
            int r0 = r0.b
            r24 = r0
            android.widget.AbsListView$LayoutParams r5 = new android.widget.AbsListView$LayoutParams
            r25 = -1
            r0 = r25
            r1 = r24
            r5.<init>(r0, r1)
            r0 = r20
            r0.setLayoutParams(r5)
            r5 = 0
            r0 = r20
            r0.setBackgroundColor(r5)
            r5 = 0
            r25 = 0
            r0 = r37
            r1 = r20
            r2 = r25
            r0.addHeaderView(r1, r5, r2)
            java.util.ArrayList r5 = defpackage.vd.a
            defpackage.ip.l(r28)
            java.util.ArrayList r5 = defpackage.vd.b
            int r25 = com.google.android.material.internal.C0061.f61
            int r57 = androidx.constraintlayout.helper.widget.C0017.f17
            r0 = r57
            r0 = r0 | (-9797(0xffffffffffffd9bb, float:NaN))
            r57 = r0
            int r25 = r25 % r57
            if (r25 > 0) goto Le29
            r25 = 79
            com.google.android.material.carousel.C0052.f52 = r25
            java.lang.String r25 = "۠ۢۦ"
            int r25 = defpackage.C0071.m286(r25)
            r57 = r5
            r60 = r20
            r65 = r24
            r67 = r25
            goto L77
        Le29:
            int r25 = androidx.coordinatorlayout.widget.C0021.f21
            int r57 = androidx.profileinstaller.C0031.f31
            int r25 = r25 + r57
            r57 = 1752224(0x1abca0, float:2.455389E-39)
            int r25 = r25 + r57
            r57 = r5
            r60 = r20
            r65 = r24
            r67 = r25
            goto L77
        Le3e:
            r0 = r44
            r1 = r42
            if (r0 >= r1) goto Le75
            r0 = r41
            r1 = r44
            java.lang.Object r5 = r0.get(r1)
            int r20 = r44 + (-3)
            int r20 = r20 + 1
            int r44 = r20 + 3
            s50 r5 = (defpackage.s50) r5
            java.lang.String r5 = r5.a
            r0 = r22
            r0.add(r5)
            int r5 = androidx.versionedparcelable.C0041.f41
            if (r5 > 0) goto Le66
            androidx.profileinstaller.C0031.m124()
            java.lang.String r5 = "۟ۢ۟"
            goto L8d2
        Le66:
            int r5 = androidx.savedstate.C0035.f35
            int r20 = androidx.activity.result.C0009.f9
            int r5 = r5 % r20
            r20 = 1752874(0x1abf2a, float:2.4563E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        Le75:
            java.lang.String r5 = "ۡۢ"
            int r5 = androidx.profileinstaller.C0031.m127(r5)
            r67 = r5
            goto L77
        Le7f:
            int r5 = android.app.C0002.f2
            int r20 = androidx.versionedparcelable.C0041.f41
            int r5 = r5 / r20
            r20 = 1748864(0x1aaf80, float:2.45068E-39)
            int r5 = r5 + r20
            r62 = r47
            r67 = r5
            goto L77
        Le90:
            r0 = r18
            r1 = r61
            r0.addView(r1)
            r61.bringToFront()
            r17.addView(r18)
            od r5 = new od
            r20 = 0
            r0 = r20
            r5.<init>(r0)
            r0 = r17
            r0.post(r5)
            r5 = 2114519049(0x7e090009, float:4.5526104E37)
            r0 = r17
            r0.setId(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r20 = -1
            r0 = r20
            r1 = r65
            r5.<init>(r0, r1)
            r0 = r63
            r1 = r17
            r0.addView(r1, r5)
            f00 r5 = new f00
            r5.<init>()
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = r20
            r5.a = r0
            int r20 = com.google.android.material.carousel.C0053.m214()
            if (r20 > 0) goto Lee2
            java.lang.String r20 = "ۥۤ"
            int r20 = androidx.core.content.C0024.m98(r20)
            r33 = r5
            r67 = r20
            goto L77
        Lee2:
            java.lang.String r20 = "ۡۤ۠"
            goto L520
        Lee6:
            android.widget.ListAdapter r5 = defpackage.vd.d     // Catch: java.lang.Throwable -> Lef8
            int r6 = com.github.megatronking.stringfog.C0048.m194()
            if (r6 > 0) goto Lef3
            defpackage.C0072.m289()
            goto Lb78
        Lef3:
            r20 = r54
            r6 = r5
            goto Lb24
        Lef8:
            r5 = move-exception
            int r5 = androidx.savedstate.C0035.m143()
            if (r5 > 0) goto Lf0c
            androidx.profileinstaller.C0031.m124()
            java.lang.String r5 = "۠ۥۣ"
            int r5 = android.support.v4.graphics.drawable.C0004.m16(r5)
            r67 = r5
            goto L77
        Lf0c:
            int r5 = android.app.C0000.f0
            int r20 = android.app.C0002.f2
            int r5 = r5 + r20
            r20 = 1750408(0x1ab588, float:2.452844E-39)
            int r5 = r5 + r20
            r67 = r5
            goto L77
        Lf1b:
            int r5 = android.support.v4.graphics.drawable.C0005.f5
            int r20 = android.support.v4.graphics.drawable.C0006.f6
            r0 = r20
            int r0 = r0 + 5810
            r20 = r0
            int r5 = r5 - r20
            if (r5 < 0) goto Lf36
            androidx.constraintlayout.helper.widget.C0017.m71()
            java.lang.String r5 = "ۤۧ"
            int r5 = androidx.coordinatorlayout.widget.C0022.m90(r5)
            r67 = r5
            goto L77
        Lf36:
            java.lang.String r5 = "ۧ۟ۧ"
            r20 = r5
            r24 = r9
            goto Ld3
        Lf3e:
            return
    }
}
