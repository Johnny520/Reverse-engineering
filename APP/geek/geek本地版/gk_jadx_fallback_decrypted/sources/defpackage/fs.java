package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fs extends de.robv.android.xposed.XC_MethodHook {
    public final int a;
    public final java.lang.ClassLoader b;

    public /* synthetic */ fs(java.lang.ClassLoader r4, int r5) {
            r3 = this;
            r3.a = r5
            r3.b = r4
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "ۡۤ"
            int r2 = com.google.android.material.datepicker.C0059.m239(r1)
            r1 = r0
        Lf:
            switch(r2) {
                case 56355: goto L13;
                case 56545: goto L83;
                case 1753547: goto L41;
                case 1753665: goto L2b;
                case 1753667: goto L58;
                case 1755467: goto L78;
                default: goto L12;
            }
        L12:
            goto Lf
        L13:
            int r0 = androidx.coordinatorlayout.widget.C0021.m84()
            if (r0 > 0) goto L41
            int r0 = com.google.android.material.theme.C0064.m257()
            if (r0 < 0) goto L6d
            r0 = 70
            com.github.megatronking.stringfog.C0047.f47 = r0
            java.lang.String r0 = "ۣۨۦ"
            int r0 = com.google.android.material.chip.C0057.m229(r0)
            r2 = r0
            goto Lf
        L2b:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = defpackage.C0073.f73
            int r2 = android.support.v4.graphics.drawable.C0004.f4
            r2 = r2 ^ (-519(0xfffffffffffffdf9, float:NaN))
            r0 = r0 ^ r2
            if (r0 > 0) goto L39
        L39:
            java.lang.String r0 = "ۧۨ"
            int r0 = com.github.megatronking.stringfog.C0048.m193(r0)
            r2 = r0
            goto Lf
        L41:
            int r0 = androidx.activity.result.C0008.f8
            int r2 = com.google.android.material.bottomsheet.C0051.f51
            int r2 = r2 + 3723
            int r0 = r0 + r2
            if (r0 > 0) goto L55
            com.github.megatronking.stringfog.xor.C0045.m181()
            java.lang.String r0 = "ۧۧۨ"
        L4f:
            int r0 = androidx.activity.result.C0008.m35(r0)
            r2 = r0
            goto Lf
        L55:
            java.lang.String r0 = "ۧۨ"
            goto L4f
        L58:
            java.lang.String r0 = "zzJoJ0AA8GenB"
            java.lang.String r0 = androidx.lifecycle.C0029.m119(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r1 = com.google.android.material.theme.C0062.f62
            int r2 = androidx.profileinstaller.C0031.f31
            int r1 = r1 * r2
            r2 = 1788090(0x1b48ba, float:2.505648E-39)
            r2 = r2 ^ r1
            r1 = r0
            goto Lf
        L6d:
            int r0 = com.google.android.material.appbar.C0049.f49
            int r2 = com.google.android.material.theme.C0063.f63
            r0 = r0 | r2
            r2 = 1753540(0x1ac1c4, float:2.457233E-39)
            int r0 = r0 + r2
            r2 = r0
            goto Lf
        L78:
            int r0 = androidx.savedstate.C0036.f36
            int r2 = androidx.savedstate.C0035.f35
            int r0 = r0 / r2
            r2 = 56354(0xdc22, float:7.8969E-41)
            int r0 = r0 + r2
            r2 = r0
            goto Lf
        L83:
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r75) {
            r74 = this;
            r20 = 0
            r15 = 0
            r17 = 0
            r24 = 0
            r21 = 0
            r40 = 0
            r10 = 0
            r28 = 0
            r41 = 0
            r55 = 0
            r6 = 0
            r5 = 0
            r14 = 0
            r44 = 0
            r45 = 0
            r7 = 0
            r39 = 0
            r34 = 0
            r35 = 0
            r65 = 0
            r47 = 0
            r69 = 0
            r60 = 0
            r62 = 0
            r54 = 0
            r30 = 0
            r29 = 0
            r48 = 0
            r49 = 0
            r4 = 0
            r61 = 0
            r64 = 0
            r9 = 0
            r50 = 0
            r13 = 0
            r18 = 0
            r25 = 0
            r31 = 0
            r26 = 0
            r8 = 0
            r38 = 0
            r52 = 0
            r37 = 0
            r63 = 0
            r27 = 0
            r51 = 0
            r36 = 0
            r43 = 0
            r11 = 0
            r56 = 0
            r19 = 0
            r67 = 0
            r66 = 0
            r42 = 0
            r72 = 0
            r53 = 0
            r71 = 0
            r46 = 0
            r68 = 0
            r32 = 0
            r22 = 0
            r16 = 0
            r12 = 0
            java.lang.String r57 = "ۧ۠"
            int r70 = androidx.constraintlayout.helper.widget.C0017.m70(r57)
            r57 = r4
            r58 = r12
            r59 = r16
        L7e:
            switch(r70) {
                case 56324: goto L82;
                case 56326: goto L12d7;
                case 56353: goto L12b4;
                case 56356: goto L9ac;
                case 56358: goto L1220;
                case 56389: goto L1348;
                case 56417: goto L12a7;
                case 56443: goto Lee6;
                case 56446: goto L291;
                case 56449: goto L171;
                case 56475: goto Lb6;
                case 56537: goto Lf9a;
                case 56538: goto La1b;
                case 56542: goto L572;
                case 56544: goto Lb04;
                case 56570: goto L559;
                case 56571: goto Lc41;
                case 56575: goto L1009;
                case 1746695: goto L10db;
                case 1746749: goto Lfc7;
                case 1746785: goto L1396;
                case 1746818: goto Le57;
                case 1746845: goto La4f;
                case 1746880: goto L144c;
                case 1746905: goto L485;
                case 1746911: goto Leb1;
                case 1746937: goto Le02;
                case 1746967: goto L476;
                case 1746968: goto L7fb;
                case 1746970: goto L95f;
                case 1747649: goto Lc6f;
                case 1747656: goto La28;
                case 1747680: goto Lc80;
                case 1747711: goto L37f;
                case 1747745: goto L913;
                case 1747747: goto Lb1a;
                case 1747748: goto Lb98;
                case 1747773: goto L132;
                case 1747808: goto L1372;
                case 1747811: goto Lc66;
                case 1747835: goto Lf2;
                case 1747837: goto L5ef;
                case 1747839: goto Lee6;
                case 1747866: goto L125d;
                case 1747903: goto Ld7b;
                case 1747927: goto Ld94;
                case 1747932: goto L1158;
                case 1748609: goto Lf82;
                case 1748610: goto Lef3;
                case 1748612: goto L7bb;
                case 1748640: goto Ld21;
                case 1748641: goto Lc17;
                case 1748644: goto L8e;
                case 1748646: goto La1b;
                case 1748649: goto L1c7;
                case 1748672: goto Lee6;
                case 1748673: goto Ldaf;
                case 1748679: goto L8a0;
                case 1748704: goto L6ab;
                case 1748707: goto L11e7;
                case 1748710: goto L144c;
                case 1748734: goto L12a1;
                case 1748742: goto L8b1;
                case 1748764: goto L8e;
                case 1748767: goto L763;
                case 1748770: goto L441;
                case 1748771: goto L695;
                case 1748826: goto L1ff;
                case 1748830: goto Lcfd;
                case 1748834: goto L2eb;
                case 1748860: goto L231;
                case 1748894: goto L41d;
                case 1749570: goto L10d1;
                case 1749571: goto L13b5;
                case 1749572: goto L810;
                case 1749574: goto L14f;
                case 1749575: goto L1020;
                case 1749601: goto L11d2;
                case 1749609: goto L5ba;
                case 1749610: goto L1259;
                case 1749634: goto L10e;
                case 1749640: goto L1003;
                case 1749641: goto L195;
                case 1749663: goto L9c4;
                case 1749696: goto Lcaf;
                case 1749700: goto Le63;
                case 1749701: goto L1326;
                case 1749702: goto L1da;
                case 1749731: goto L1405;
                case 1749757: goto L402;
                case 1749759: goto L4ed;
                case 1749762: goto Lb6;
                case 1749764: goto Lf17;
                case 1749789: goto L68f;
                case 1749791: goto Lee6;
                case 1749822: goto L284;
                case 1749824: goto L5fc;
                case 1749850: goto L33f;
                case 1749852: goto L593;
                case 1749857: goto La70;
                case 1750531: goto L882;
                case 1750539: goto Lbbe;
                case 1750564: goto L508;
                case 1750565: goto Lfe7;
                case 1750593: goto Lb6;
                case 1750595: goto L9fb;
                case 1750596: goto L13cc;
                case 1750599: goto Lb55;
                case 1750601: goto L7ab;
                case 1750624: goto Lae2;
                case 1750656: goto Lb6;
                case 1750663: goto L24d;
                case 1750664: goto L772;
                case 1750695: goto L63e;
                case 1750725: goto L80a;
                case 1750726: goto L39a;
                case 1750750: goto Lf62;
                case 1750754: goto Ld4;
                case 1750757: goto L7b7;
                case 1750783: goto Ld5b;
                case 1750785: goto L98f;
                case 1750810: goto L105e;
                case 1750811: goto L12fa;
                case 1750816: goto L722;
                case 1750819: goto L1165;
                case 1751494: goto L743;
                case 1751495: goto L10fc;
                case 1751496: goto L6b8;
                case 1751501: goto L1a3;
                case 1751525: goto L277;
                case 1751527: goto L3be;
                case 1751531: goto L4c6;
                case 1751555: goto L572;
                case 1751557: goto L2ab;
                case 1751590: goto Lbf8;
                case 1751593: goto L5ef;
                case 1751594: goto L38b;
                case 1751616: goto L118c;
                case 1751624: goto Lb55;
                case 1751649: goto L6d2;
                case 1751651: goto L559;
                case 1751655: goto L63e;
                case 1751680: goto L975;
                case 1751687: goto L368;
                case 1751710: goto L722;
                case 1751712: goto Lebe;
                case 1751713: goto L620;
                case 1751714: goto L103b;
                case 1751777: goto L6f9;
                case 1752455: goto Le1c;
                case 1752461: goto L220;
                case 1752486: goto Lb79;
                case 1752491: goto Ld49;
                case 1752551: goto L4bc;
                case 1752555: goto L975;
                case 1752578: goto Lee6;
                case 1752579: goto L144c;
                case 1752583: goto Lb6;
                case 1752584: goto L112d;
                case 1752611: goto L8f1;
                case 1752639: goto L3de;
                case 1752641: goto Ld5b;
                case 1752672: goto L402;
                case 1752677: goto Lc94;
                case 1752701: goto L128b;
                case 1752734: goto L5e5;
                case 1752736: goto Lc45;
                case 1753447: goto L7d4;
                case 1753481: goto L8c7;
                case 1753509: goto L7ca;
                case 1753512: goto L533;
                case 1753514: goto Lee6;
                case 1753516: goto Ldc1;
                case 1753570: goto Lee6;
                case 1753573: goto L1085;
                case 1753574: goto Lb6;
                case 1753576: goto L302;
                case 1753633: goto Lc73;
                case 1753636: goto Lbde;
                case 1753637: goto Le3f;
                case 1753640: goto L9e0;
                case 1753693: goto Lfe;
                case 1753697: goto L101;
                case 1754380: goto L4ca;
                case 1754412: goto L11f6;
                case 1754415: goto L12d7;
                case 1754499: goto Lcde;
                case 1754508: goto L65d;
                case 1754533: goto L1158;
                case 1754537: goto L499;
                case 1754594: goto L36b;
                case 1754598: goto L13c4;
                case 1754600: goto L63e;
                case 1754660: goto L142f;
                case 1755345: goto La92;
                case 1755399: goto Lf27;
                case 1755430: goto L120b;
                case 1755436: goto L927;
                case 1755462: goto L1420;
                case 1755463: goto L12a7;
                case 1755468: goto L830;
                case 1755496: goto Le80;
                case 1755526: goto L402;
                case 1755528: goto La7;
                case 1755558: goto L685;
                case 1755584: goto Lde4;
                case 1755591: goto L540;
                case 1755619: goto L66a;
                case 1755624: goto L8e4;
                default: goto L81;
            }
        L81:
            goto L7e
        L82:
            int r4 = com.google.android.material.internal.C0061.f61
            int r12 = android.support.v4.graphics.drawable.C0005.f5
            int r4 = r4 + r12
            r12 = 1750072(0x1ab438, float:2.452373E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L8e:
            int r4 = androidx.coordinatorlayout.widget.C0022.f22
            int r12 = com.google.android.material.theme.C0062.f62
            int r12 = r12 / (-5630)
            int r4 = r4 * r12
            if (r4 == 0) goto La4
            r4 = 67
            androidx.savedstate.C0036.f36 = r4
            java.lang.String r4 = "ۣۤۦ"
        L9d:
            int r4 = androidx.emoji2.text.C0026.m105(r4)
            r70 = r4
            goto L7e
        La4:
            java.lang.String r4 = "۟ۨۡ"
            goto L9d
        La7:
            r4 = 211(0xd3, float:2.96E-43)
            r0 = r28
            if (r0 == r4) goto L9e0
            java.lang.String r4 = "ۦۡۤ"
            int r4 = androidx.core.widget.C0025.m102(r4)
            r70 = r4
            goto L7e
        Lb6:
            int r4 = androidx.core.content.C0023.m92()
            if (r4 < 0) goto Lc9
            r4 = 61
            androidx.core.widget.C0025.f25 = r4
            java.lang.String r4 = "ۤۧۧ"
            int r4 = androidx.appcompat.widget.C0013.m53(r4)
            r70 = r4
            goto L7e
        Lc9:
            java.lang.String r4 = "۟ۥۦ"
            r16 = r4
        Lcd:
            int r4 = androidx.versionedparcelable.C0040.m160(r16)
            r70 = r4
            goto L7e
        Ld4:
            int r4 = androidx.activity.result.C0009.f9
            int r12 = com.google.android.material.carousel.C0055.f55
            int r12 = r12 + 5843
            r4 = r4 ^ r12
            if (r4 < 0) goto Le6
            java.lang.String r4 = "ۨۧ"
            int r4 = com.google.android.material.theme.C0063.m254(r4)
            r70 = r4
            goto L7e
        Le6:
            int r4 = com.ljx.wechatmod.hook.C0066.f66
            int r12 = androidx.startup.C0037.f37
            r4 = r4 | r12
            r12 = -1751588(0xffffffffffe545dc, float:NaN)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        Lf2:
            int r4 = androidx.appcompat.widget.C0014.f14
            int r12 = androidx.versionedparcelable.C0038.f38
            int r4 = r4 + r12
            r12 = 1753653(0x1ac235, float:2.457391E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        Lfe:
            switch(r28) {
                case 210: goto L11d2;
                case 211: goto L11d2;
                case 212: goto L11d2;
                default: goto L101;
            }
        L101:
            int r4 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r12 = androidx.appcompat.widget.C0013.f13
            int r4 = r4 % r12
            r12 = 1755236(0x1ac864, float:2.45961E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L10e:
            int r4 = androidx.core.content.C0023.f23
            int r12 = com.github.megatronking.stringfog.xor.C0045.f45
            r12 = r12 | 6490(0x195a, float:9.094E-42)
            r4 = r4 | r12
            if (r4 < 0) goto L123
            java.lang.String r4 = "ۢۡۧ"
            int r4 = androidx.activity.result.C0008.m35(r4)
            r22 = r32
            r70 = r4
            goto L7e
        L123:
            int r4 = androidx.savedstate.C0035.f35
            int r12 = com.google.android.material.appbar.C0049.f49
            int r4 = r4 % r12
            r12 = 1755556(0x1ac9a4, float:2.460058E-39)
            int r4 = r4 + r12
            r22 = r32
            r70 = r4
            goto L7e
        L132:
            int r4 = androidx.constraintlayout.widget.C0020.m82()
            if (r4 > 0) goto L145
            com.google.android.material.chip.C0056.m224()
            java.lang.String r4 = "ۣۥۨ"
            int r4 = com.google.android.material.theme.C0062.m249(r4)
            r70 = r4
            goto L7e
        L145:
            java.lang.String r4 = "۠ۥۤ"
            int r4 = androidx.versionedparcelable.C0042.m170(r4)
            r70 = r4
            goto L7e
        L14f:
            int r4 = androidx.appcompat.widget.C0016.f16
            int r12 = com.ljx.wechatmod.ui.C0067.f67
            int r12 = r12 + 6021
            int r4 = r4 - r12
            if (r4 < 0) goto L167
            r4 = 90
            androidx.constraintlayout.widget.C0019.f19 = r4
            java.lang.String r4 = "ۧۤۡ"
            r12 = r4
        L15f:
            int r4 = androidx.core.content.C0024.m98(r12)
            r70 = r4
            goto L7e
        L167:
            java.lang.String r4 = "۠ۢۥ"
        L169:
            int r4 = androidx.appcompat.app.C0012.m50(r4)
            r70 = r4
            goto L7e
        L171:
            int r4 = android.app.C0001.m4()
            if (r4 > 0) goto L189
            java.lang.String r12 = "ۣۡۧ"
            r4 = r15
            r16 = r17
            r18 = r13
        L17e:
            int r12 = android.support.v4.graphics.drawable.C0004.m16(r12)
            r15 = r4
            r17 = r16
            r70 = r12
            goto L7e
        L189:
            java.lang.String r4 = "ۡۤۦ"
            r18 = r13
        L18d:
            int r4 = androidx.activity.C0010.m43(r4)
            r70 = r4
            goto L7e
        L195:
            java.lang.String r4 = "ۣۦۥ"
            r12 = r25
        L199:
            int r4 = com.google.android.material.bottomsheet.C0051.m207(r4)
            r70 = r4
            r26 = r12
            goto L7e
        L1a3:
            if (r71 != 0) goto Lb6
            hs r4 = defpackage.hs.a     // Catch: java.lang.Throwable -> L2c7
            int r4 = androidx.versionedparcelable.C0038.f38
            int r12 = androidx.core.content.C0024.f24
            int r12 = r12 % (-5773)
            int r4 = r4 + r12
            if (r4 < 0) goto L1bd
            android.app.C0000.m0()
        L1b3:
            java.lang.String r4 = "ۥۦۦ"
            int r4 = android.app.C0003.m13(r4)
            r70 = r4
            goto L7e
        L1bd:
            java.lang.String r4 = "ۧۦۥ"
        L1bf:
            int r4 = androidx.activity.C0010.m43(r4)
            r70 = r4
            goto L7e
        L1c7:
            boolean r4 = r65.isEmpty()     // Catch: java.lang.Throwable -> L11a3
            if (r4 == 0) goto L5e5
            int r4 = androidx.appcompat.widget.C0014.f14
            int r12 = androidx.coordinatorlayout.widget.C0021.f21
            int r4 = r4 * r12
            r12 = 1977710(0x1e2d6e, float:2.771362E-39)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        L1da:
            r0 = r68
            long r0 = (long) r0
            r22 = r0
            int r4 = com.google.android.material.carousel.C0053.f53
            int r12 = com.google.android.material.datepicker.C0058.f58
            r12 = r12 | (-1472(0xfffffffffffffa40, float:NaN))
            int r4 = r4 - r12
            if (r4 > 0) goto L1f5
            androidx.lifecycle.C0029.m118()
        L1eb:
            java.lang.String r4 = "ۨ۟ۨ"
        L1ed:
            int r4 = androidx.fragment.app.C0027.m110(r4)
            r70 = r4
            goto L7e
        L1f5:
            java.lang.String r4 = "ۧ۟ۤ"
        L1f7:
            int r4 = com.google.android.material.carousel.C0055.m220(r4)
            r70 = r4
            goto L7e
        L1ff:
            r4 = r21
            r12 = r24
        L203:
            int r16 = androidx.versionedparcelable.C0039.f39
            if (r16 < 0) goto L212
            androidx.appcompat.widget.C0013.m52()
            java.lang.String r16 = "ۣۢۧ"
            r21 = r4
            r24 = r12
            goto Lcd
        L212:
            java.lang.String r16 = "ۨۢۦ"
            int r16 = android.support.v4.graphics.drawable.C0004.m16(r16)
            r21 = r4
            r24 = r12
            r70 = r16
            goto L7e
        L220:
            i00 r12 = new i00     // Catch: java.lang.Throwable -> L11a3
            r12.<init>()     // Catch: java.lang.Throwable -> L11a3
            java.lang.String r4 = "ۨۤۤ"
        L227:
            int r4 = androidx.appcompat.widget.C0016.m65(r4)
            r55 = r12
            r70 = r4
            goto L7e
        L231:
            int r4 = androidx.versionedparcelable.C0040.m162()
            if (r4 < 0) goto L240
            com.google.android.material.chip.C0057.m230()
            java.lang.String r4 = "ۢۡۥ"
            r12 = r26
            goto L199
        L240:
            int r4 = com.github.megatronking.stringfog.xor.C0046.f46
            int r12 = androidx.profileinstaller.C0031.f31
            int r4 = r4 + r12
            r12 = 1750999(0x1ab7d7, float:2.453672E-39)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        L24d:
            java.util.concurrent.ConcurrentHashMap r4 = defpackage.hs.c     // Catch: java.lang.Throwable -> L2c7
            r0 = r66
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L2c7
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L2c7
            int r12 = androidx.core.widget.C0025.m103()
            if (r12 < 0) goto L269
            java.lang.String r12 = "ۣۧۨ"
            int r12 = androidx.coordinatorlayout.widget.C0021.m86(r12)
            r42 = r4
            r70 = r12
            goto L7e
        L269:
            java.lang.String r12 = "ۥ۠ۦ"
            r16 = r4
        L26d:
            int r4 = com.google.android.material.datepicker.C0059.m239(r12)
            r42 = r16
            r70 = r4
            goto L7e
        L277:
            int r4 = androidx.activity.C0011.f11
            int r12 = androidx.constraintlayout.widget.C0018.f18
            int r4 = r4 / r12
            r12 = 56476(0xdc9c, float:7.914E-41)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L284:
            int r4 = defpackage.C0073.f73
            int r12 = defpackage.C0073.f73
            int r4 = r4 - r12
            r12 = 1749702(0x1ab2c6, float:2.451855E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L291:
            int r4 = androidx.legacy.content.C0028.m112()
            if (r4 > 0) goto L29e
            androidx.startup.C0037.m150()
            java.lang.String r4 = "ۣۧۨ"
            goto L1bf
        L29e:
            int r4 = androidx.versionedparcelable.C0040.f40
            int r12 = android.support.v4.graphics.drawable.C0004.f4
            r4 = r4 | r12
            r12 = -56903(0xffffffffffff21b9, float:NaN)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        L2ab:
            java.lang.String r4 = " 下发数据为空，无新内容需点赞。"
            r0 = r49
            r0.append(r4)     // Catch: java.lang.Throwable -> L11a3
            java.lang.String r4 = r49.toString()     // Catch: java.lang.Throwable -> L11a3
            int r12 = androidx.core.widget.C0025.f25
            int r16 = androidx.versionedparcelable.C0041.f41
            int r12 = r12 - r16
            r16 = -1754464(0xffffffffffe53aa0, float:NaN)
            r12 = r12 ^ r16
            r57 = r4
            r70 = r12
            goto L7e
        L2c7:
            r4 = move-exception
            int r4 = androidx.fragment.app.C0027.f27
            int r12 = com.github.megatronking.stringfog.annotation.C0044.f44
            r12 = r12 ^ (-7804(0xffffffffffffe184, float:NaN))
            int r4 = r4 - r12
            if (r4 > 0) goto L2de
            androidx.activity.result.C0008.m33()
            java.lang.String r4 = "ۦۦۤ"
            int r4 = androidx.appcompat.widget.C0013.m53(r4)
            r70 = r4
            goto L7e
        L2de:
            int r4 = androidx.versionedparcelable.C0042.f42
            int r12 = android.support.v4.graphics.drawable.C0006.f6
            int r4 = r4 - r12
            r12 = 1751039(0x1ab7ff, float:2.453728E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L2eb:
            r0 = r55
            java.lang.Object r4 = r0.b     // Catch: java.lang.Throwable -> L11a3
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L11a3
            int r12 = android.support.v4.graphics.drawable.C0004.f4
            int r16 = androidx.appcompat.widget.C0015.f15
            int r12 = r12 * r16
            r16 = 1171037(0x11de5d, float:1.640972E-39)
            int r12 = r12 + r16
            r65 = r4
            r70 = r12
            goto L7e
        L302:
            java.lang.String r4 = "xwGO\n"
            java.lang.String r12 = "s2Dpd1+FjZU=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r12)     // Catch: java.lang.Throwable -> L11a3
            r0 = r47
            defpackage.ip.o(r4, r0)     // Catch: java.lang.Throwable -> L11a3
            int r4 = kotlinx.coroutines.C0070.f70
            int r12 = androidx.core.widget.C0025.f25
            int r12 = r12 + 8319
            int r4 = r4 % r12
            if (r4 > 0) goto L326
            r4 = 32
            android.support.v4.graphics.drawable.C0005.f5 = r4
            java.lang.String r4 = "ۤ۠ۧ"
            int r4 = androidx.activity.result.C0009.m38(r4)
            r70 = r4
            goto L7e
        L326:
            java.lang.String r4 = "۠۟ۧ"
            r12 = r54
        L32a:
            int r4 = io.fastkv.C0068.m272(r4)
            r54 = r12
            r70 = r4
            goto L7e
        L334:
            r4 = move-exception
            java.lang.String r4 = "۠ۦ"
            int r4 = androidx.core.content.C0023.m95(r4)
            r70 = r4
            goto L7e
        L33f:
            java.lang.String r4 = defpackage.pb0.r1     // Catch: java.lang.Throwable -> L334
            r0 = r41
            java.lang.Object r7 = de.robv.android.xposed.XposedHelpers.getObjectField(r0, r4)     // Catch: java.lang.Throwable -> L334
            int r4 = androidx.appcompat.widget.C0013.m52()
            if (r4 < 0) goto L35b
            r4 = 95
            defpackage.C0072.f72 = r4
            java.lang.String r4 = "ۦۤۤ"
            int r4 = androidx.core.widget.C0025.m102(r4)
            r70 = r4
            goto L7e
        L35b:
            int r4 = androidx.savedstate.C0036.f36
            int r12 = kotlinx.coroutines.C0070.f70
            int r4 = r4 * r12
            r12 = 1291700(0x13b5b4, float:1.810057E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L368:
            switch(r20) {
                case 0: goto L1405;
                case 1: goto L36b;
                case 2: goto L36b;
                case 3: goto Lf17;
                default: goto L36b;
            }
        L36b:
            int r4 = com.google.android.material.datepicker.C0059.f59
            if (r4 < 0) goto L37c
            defpackage.C0073.m295()
            java.lang.String r4 = "ۨۡۨ"
        L374:
            int r4 = androidx.appcompat.widget.C0014.m57(r4)
            r70 = r4
            goto L7e
        L37c:
            java.lang.String r4 = "ۦ۠ۡ"
            goto L374
        L37f:
            if (r46 == 0) goto L14f
        L381:
            java.lang.String r4 = "۠ۥ۠"
            int r4 = com.google.android.material.chip.C0056.m226(r4)
            r70 = r4
            goto L7e
        L38b:
            in r4 = defpackage.in.a     // Catch: java.lang.Throwable -> L11a3
            int r4 = androidx.core.content.C0023.f23
            int r12 = androidx.appcompat.widget.C0015.f15
            int r4 = r4 % r12
            r12 = 1748092(0x1aac7c, float:2.449599E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L39a:
            int r4 = kotlinx.coroutines.C0069.f69
            int r12 = androidx.activity.C0010.f10
            int r12 = r12 + (-9061)
            r4 = r4 ^ r12
            if (r4 > 0) goto L3af
            java.lang.String r4 = "ۡۢۧ"
            int r4 = androidx.legacy.content.C0028.m114(r4)
            r45 = r14
            r70 = r4
            goto L7e
        L3af:
            int r4 = androidx.recyclerview.widget.C0033.f33
            int r12 = androidx.core.content.C0024.f24
            int r4 = r4 * r12
            r12 = 1751813(0x1abb05, float:2.454813E-39)
            int r4 = r4 + r12
            r45 = r14
            r70 = r4
            goto L7e
        L3be:
            int r4 = com.google.android.material.bottomsheet.C0051.f51
            int r12 = androidx.savedstate.C0034.f34
            r12 = r12 ^ 1399(0x577, float:1.96E-42)
            r4 = r4 ^ r12
            if (r4 > 0) goto L3d1
            java.lang.String r4 = "ۤۤۧ"
            int r4 = androidx.emoji2.text.C0026.m105(r4)
            r70 = r4
            goto L7e
        L3d1:
            int r4 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r12 = androidx.versionedparcelable.C0042.f42
            int r4 = r4 + r12
            r12 = 1752077(0x1abc0d, float:2.455183E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L3de:
            r0 = r5
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Throwable -> L5d7
            r4 = r0
            int r12 = com.ljx.wechatmod.ui.C0067.f67
            int r14 = com.google.android.material.carousel.C0052.f52
            int r14 = r14 + 2199
            int r12 = r12 % r14
            if (r12 < 0) goto L3fd
            androidx.constraintlayout.widget.C0019.m77()
            java.lang.String r12 = "ۣۢۦ"
            r14 = r4
            r16 = r27
        L3f3:
            int r4 = androidx.fragment.app.C0027.m110(r12)
            r70 = r4
            r27 = r16
            goto L7e
        L3fd:
            java.lang.String r12 = "ۣۥۨ"
            r14 = r4
            goto L15f
        L402:
            int r4 = androidx.versionedparcelable.C0041.f41
            int r12 = com.github.megatronking.stringfog.C0048.f48
            r12 = r12 ^ 95
            int r4 = r4 - r12
            if (r4 > 0) goto L419
            r4 = 16
            android.app.C0001.f1 = r4
            java.lang.String r4 = "ۣۧۢ"
        L411:
            int r4 = com.google.android.material.internal.C0061.m246(r4)
            r70 = r4
            goto L7e
        L419:
            java.lang.String r4 = "ۣۢ۟"
            goto L169
        L41d:
            int r4 = androidx.versionedparcelable.C0038.f38
            int r12 = com.google.android.material.floatingactionbutton.C0060.f60
            int r12 = r12 % (-438)
            r4 = r4 | r12
            if (r4 < 0) goto L434
            java.lang.String r4 = "۟ۨ"
            r12 = r28
        L42a:
            int r4 = androidx.savedstate.C0034.m138(r4)
            r28 = r12
            r70 = r4
            goto L7e
        L434:
            int r4 = com.google.android.material.theme.C0063.f63
            int r12 = androidx.appcompat.widget.C0014.f14
            int r4 = r4 * r12
            r12 = 1799256(0x1b7458, float:2.521295E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L441:
            nf r12 = defpackage.wg.b     // Catch: java.lang.Throwable -> L11a3
            y30 r4 = new y30     // Catch: java.lang.Throwable -> L11a3
            r16 = 0
            r0 = r55
            r1 = r16
            r4.<init>(r0, r15, r1)     // Catch: java.lang.Throwable -> L11a3
            int r16 = androidx.appcompat.app.C0012.f12
            if (r16 > 0) goto L463
            com.github.megatronking.stringfog.xor.C0046.m185()
        L455:
            java.lang.String r16 = "۠ۦ۠"
            int r16 = com.github.megatronking.stringfog.annotation.C0044.m176(r16)
            r29 = r4
            r30 = r12
            r70 = r16
            goto L7e
        L463:
            int r16 = androidx.activity.result.C0009.f9
            int r29 = androidx.constraintlayout.widget.C0018.f18
            int r16 = r16 - r29
            r29 = 1748009(0x1aac29, float:2.449482E-39)
            int r16 = r16 + r29
            r29 = r4
            r30 = r12
            r70 = r16
            goto L7e
        L476:
            int r4 = android.app.C0003.f3
            int r12 = androidx.savedstate.C0036.f36
            int r4 = r4 * r12
            r12 = 1173925(0x11e9a5, float:1.64502E-39)
            r4 = r4 ^ r12
            r70 = r4
            r71 = r72
            goto L7e
        L485:
            java.lang.String r4 = "wtIlnHk+6IfQ\n"
            java.lang.String r12 = "qbdcwxVLi+w=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r12)     // Catch: java.lang.Throwable -> L2c7
            java.lang.String r12 = "ۣۨۨ"
            int r12 = android.app.C0000.m2(r12)
            r64 = r4
            r70 = r12
            goto L7e
        L499:
            java.lang.String r4 = "53vj\n"
            java.lang.String r12 = "igiEy7e+YPk=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r12)     // Catch: java.lang.Throwable -> L11a3
            r0 = r57
            defpackage.ip.o(r4, r0)     // Catch: java.lang.Throwable -> L11a3
            int r4 = androidx.constraintlayout.widget.C0019.f19
            int r12 = androidx.constraintlayout.widget.C0018.f18
            r12 = r12 | 2129(0x851, float:2.983E-42)
            r4 = r4 | r12
            if (r4 > 0) goto L4b9
        L4af:
            java.lang.String r4 = "ۧ۠ۥ"
        L4b1:
            int r4 = kotlinx.coroutines.C0070.m281(r4)
            r70 = r4
            goto L7e
        L4b9:
            java.lang.String r4 = "ۣۦۨ"
            goto L4b1
        L4bc:
            java.lang.String r4 = "ۢۧۥ"
        L4be:
            int r4 = com.github.megatronking.stringfog.annotation.C0044.m176(r4)
            r70 = r4
            goto L7e
        L4c6:
            java.lang.String r4 = "ۡ۠ۥ"
            goto L411
        L4ca:
            int r4 = androidx.constraintlayout.widget.C0020.f20
            int r12 = com.github.megatronking.stringfog.xor.C0045.f45
            int r12 = r12 % (-6226)
            int r4 = r4 % r12
            if (r4 < 0) goto L4e0
            r4 = 2
            com.google.android.material.internal.C0061.f61 = r4
            java.lang.String r4 = "ۣۦۡ"
            int r4 = com.google.android.material.theme.C0062.m249(r4)
            r70 = r4
            goto L7e
        L4e0:
            int r4 = android.view.C0007.f7
            int r12 = androidx.versionedparcelable.C0038.f38
            r4 = r4 ^ r12
            r12 = 1749898(0x1ab38a, float:2.45213E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L4ed:
            int r4 = androidx.activity.C0011.f11
            if (r4 < 0) goto L4fe
            com.github.megatronking.stringfog.annotation.C0044.m178()
            java.lang.String r4 = "ۦۡۤ"
            int r4 = com.github.megatronking.stringfog.xor.C0046.m186(r4)
            r70 = r4
            goto L7e
        L4fe:
            java.lang.String r4 = "ۣۣۧ"
            int r4 = com.github.megatronking.stringfog.C0048.m193(r4)
            r70 = r4
            goto L7e
        L508:
            java.util.concurrent.ConcurrentHashMap r4 = defpackage.hs.b     // Catch: java.lang.Throwable -> L2c7
            java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2c7
            r0 = r63
            java.lang.Object r4 = r4.putIfAbsent(r0, r12)     // Catch: java.lang.Throwable -> L2c7
            if (r4 != 0) goto Lb6
            r0 = r75
            java.lang.Object r0 = r0.thisObject     // Catch: java.lang.Throwable -> L2c7
            r43 = r0
            int r4 = androidx.profileinstaller.C0031.f31
            if (r4 < 0) goto L52c
            r4 = 8
            androidx.activity.result.C0008.f8 = r4
            java.lang.String r4 = "ۡۦۣ"
            int r4 = androidx.versionedparcelable.C0038.m153(r4)
            r70 = r4
            goto L7e
        L52c:
            java.lang.String r4 = "ۨۢ۠"
            r12 = r4
            r16 = r42
            goto L26d
        L533:
            int r4 = androidx.core.content.C0023.f23
            int r12 = defpackage.C0071.f71
            int r4 = r4 % r12
            r12 = 55922(0xda72, float:7.8363E-41)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L540:
            int r4 = kotlinx.coroutines.C0070.m280()
            if (r4 < 0) goto L553
            androidx.constraintlayout.widget.C0019.m77()
            java.lang.String r4 = "ۣۨ"
            int r4 = com.github.megatronking.stringfog.annotation.C0044.m176(r4)
            r70 = r4
            goto L7e
        L553:
            java.lang.String r4 = "ۤ۟"
            r16 = r4
            goto Lcd
        L559:
            int r4 = com.google.android.material.floatingactionbutton.C0060.f60
            int r12 = androidx.core.content.C0023.f23
            r12 = r12 | 837(0x345, float:1.173E-42)
            int r4 = r4 - r12
            if (r4 > 0) goto L56f
            android.app.C0000.m0()
            java.lang.String r4 = "ۣۤۦ"
        L567:
            int r4 = com.google.android.material.chip.C0056.m226(r4)
            r70 = r4
            goto L7e
        L56f:
            java.lang.String r4 = "ۤۨۥ"
            goto L567
        L572:
            int r4 = androidx.fragment.app.C0027.m111()
            if (r4 > 0) goto L586
            r4 = 71
            com.google.android.material.datepicker.C0059.f59 = r4
            java.lang.String r4 = "ۡۥۣ"
        L57e:
            int r4 = com.google.android.material.carousel.C0052.m209(r4)
            r70 = r4
            goto L7e
        L586:
            int r4 = androidx.viewpager2.adapter.C0043.f43
            int r12 = androidx.recyclerview.widget.C0032.f32
            int r4 = r4 * r12
            r12 = 1883726(0x1cbe4e, float:2.639662E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L593:
            int r4 = com.google.android.material.behavior.C0050.m202()
            if (r4 < 0) goto L5ab
            r4 = 37
            com.google.android.material.internal.C0061.f61 = r4
            r16 = r34
        L59f:
            java.lang.String r4 = "ۣ۠۠"
            int r4 = com.google.android.material.internal.C0061.m246(r4)
            r35 = r16
            r70 = r4
            goto L7e
        L5ab:
            int r4 = com.google.android.material.appbar.C0049.f49
            int r12 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r4 = r4 / r12
            r12 = 56353(0xdc21, float:7.8967E-41)
            int r4 = r4 + r12
            r35 = r34
            r70 = r4
            goto L7e
        L5ba:
            int r4 = defpackage.C0072.f72
            int r12 = androidx.appcompat.widget.C0015.f15
            int r12 = r12 / (-7448)
            r4 = r4 | r12
            if (r4 < 0) goto L5cd
            java.lang.String r4 = "ۦۦۣ"
            int r4 = androidx.versionedparcelable.C0042.m170(r4)
            r70 = r4
            goto L7e
        L5cd:
            java.lang.String r4 = "ۨۤۤ"
            int r4 = androidx.appcompat.widget.C0013.m53(r4)
            r70 = r4
            goto L7e
        L5d7:
            r4 = move-exception
            int r4 = android.app.C0001.f1
            int r12 = android.app.C0001.f1
            int r4 = r4 * r12
            r12 = 1714419(0x1a28f3, float:2.402413E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L5e5:
            java.lang.String r4 = "ۣ۟ۦ"
            int r4 = com.ljx.wechatmod.ui.C0067.m271(r4)
            r70 = r4
            goto L7e
        L5ef:
            int r4 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r12 = androidx.versionedparcelable.C0042.f42
            int r4 = r4 + r12
            r12 = 1748387(0x1aada3, float:2.450012E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L5fc:
            r0 = r75
            java.lang.Object[] r4 = r0.args     // Catch: java.lang.Throwable -> L2c7
            r12 = 0
            r9 = r4[r12]     // Catch: java.lang.Throwable -> L2c7
            int r4 = androidx.startup.C0037.f37
            int r12 = androidx.constraintlayout.widget.C0018.f18
            int r12 = r12 % 6158
            int r4 = r4 % r12
            if (r4 < 0) goto L616
            java.lang.String r4 = "ۣۡۡ"
            int r4 = androidx.profileinstaller.C0030.m120(r4)
            r70 = r4
            goto L7e
        L616:
            java.lang.String r4 = "ۥۣۦ"
            int r4 = androidx.viewpager2.adapter.C0043.m173(r4)
            r70 = r4
            goto L7e
        L620:
            int r4 = androidx.constraintlayout.helper.widget.C0017.m71()
            if (r4 > 0) goto L634
            java.lang.String r4 = "ۣ۠۠"
            r12 = r36
        L62a:
            int r4 = androidx.profileinstaller.C0030.m120(r4)
            r70 = r4
            r36 = r12
            goto L7e
        L634:
            java.lang.String r4 = "ۢۦۡ"
            int r4 = androidx.versionedparcelable.C0041.m164(r4)
            r70 = r4
            goto L7e
        L63e:
            int r4 = defpackage.C0073.f73
            if (r4 > 0) goto L653
            r4 = 4
            com.google.android.material.behavior.C0050.f50 = r4
            java.lang.String r4 = "ۥۨ۠"
            r12 = r37
        L649:
            int r4 = android.support.v4.graphics.drawable.C0005.m23(r4)
            r37 = r12
            r70 = r4
            goto L7e
        L653:
            java.lang.String r4 = "ۣ۟ۨ"
            int r4 = androidx.lifecycle.C0029.m116(r4)
            r70 = r4
            goto L7e
        L65d:
            int r4 = android.support.v4.graphics.drawable.C0006.f6
            int r12 = com.github.megatronking.stringfog.xor.C0045.f45
            r4 = r4 ^ r12
            r12 = 1749847(0x1ab357, float:2.452058E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L66a:
            r61.getClass()     // Catch: java.lang.Throwable -> L2c7
            int r4 = androidx.constraintlayout.widget.C0019.f19
            if (r4 > 0) goto L67b
            java.lang.String r4 = "ۤ۟ۨ"
            int r4 = com.google.android.material.theme.C0062.m249(r4)
            r70 = r4
            goto L7e
        L67b:
            java.lang.String r4 = "ۦۦۤ"
        L67d:
            int r4 = androidx.savedstate.C0034.m138(r4)
            r70 = r4
            goto L7e
        L685:
            java.lang.String r4 = "ۤۥۡ"
            int r4 = androidx.activity.C0011.m45(r4)
            r70 = r4
            goto L7e
        L68f:
            r13 = 0
            java.lang.String r4 = "ۤۥ"
            r12 = r4
            goto L15f
        L695:
            if (r18 == 0) goto L65d
            int r25 = r18.intValue()     // Catch: java.lang.Throwable -> L2c7
            java.lang.String r12 = "ۢۡۨ"
            r4 = r15
            r16 = r17
        L6a0:
            int r12 = android.app.C0001.m5(r12)
            r15 = r4
            r17 = r16
            r70 = r12
            goto L7e
        L6ab:
            int r4 = android.app.C0001.f1
            int r12 = android.support.v4.graphics.drawable.C0005.f5
            r4 = r4 | r12
            r12 = -1748561(0xffffffffffe551af, float:NaN)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        L6b8:
            int r4 = com.ljx.wechatmod.auth.C0065.m260()
            if (r4 > 0) goto L6c5
            com.google.android.material.bottomsheet.C0051.m206()
            java.lang.String r4 = "۠۟"
            goto L18d
        L6c5:
            int r4 = androidx.profileinstaller.C0030.f30
            int r12 = androidx.constraintlayout.widget.C0018.f18
            int r4 = r4 * r12
            r12 = 1722096(0x1a46f0, float:2.41317E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L6d2:
            int r4 = androidx.activity.result.C0008.f8
            int r12 = com.google.android.material.internal.C0061.f61
            int r12 = r12 + (-9448)
            r4 = r4 | r12
            if (r4 < 0) goto L6ea
            androidx.appcompat.widget.C0013.m52()
            java.lang.String r4 = "ۢ۟ۤ"
            int r4 = com.ljx.wechatmod.auth.C0065.m263(r4)
            r66 = r19
            r70 = r4
            goto L7e
        L6ea:
            int r4 = androidx.constraintlayout.helper.widget.C0017.f17
            int r12 = com.github.megatronking.stringfog.xor.C0045.f45
            r4 = r4 ^ r12
            r12 = -1752667(0xffffffffffe541a5, float:NaN)
            r4 = r4 ^ r12
            r66 = r19
            r70 = r4
            goto L7e
        L6f9:
            java.lang.String r4 = defpackage.pb0.r1     // Catch: java.lang.Throwable -> L5d7
            r0 = r41
            java.lang.Object r5 = de.robv.android.xposed.XposedHelpers.getObjectField(r0, r4)     // Catch: java.lang.Throwable -> L5d7
            int r4 = android.app.C0000.f0
            int r12 = androidx.core.content.C0023.f23
            int r12 = r12 % 6576
            int r4 = r4 * r12
            if (r4 > 0) goto L718
            r4 = 22
            com.google.android.material.theme.C0062.f62 = r4
            java.lang.String r4 = "ۧۨۥ"
            int r4 = androidx.versionedparcelable.C0042.m170(r4)
            r70 = r4
            goto L7e
        L718:
            java.lang.String r4 = "ۣۨ۟"
        L71a:
            int r4 = androidx.savedstate.C0034.m138(r4)
            r70 = r4
            goto L7e
        L722:
            int r4 = com.google.android.material.floatingactionbutton.C0060.f60
            int r12 = androidx.constraintlayout.widget.C0018.f18
            int r12 = r12 % 5333
            int r4 = r4 - r12
            if (r4 > 0) goto L739
            androidx.activity.C0010.m40()
            java.lang.String r4 = "۟ۧۤ"
            r12 = r4
        L731:
            int r4 = com.google.android.material.carousel.C0054.m219(r12)
            r70 = r4
            goto L7e
        L739:
            java.lang.String r4 = "ۡۢ"
            int r4 = androidx.constraintlayout.widget.C0020.m80(r4)
            r70 = r4
            goto L7e
        L743:
            int r4 = com.google.android.material.theme.C0063.m253()
            if (r4 > 0) goto L756
            androidx.appcompat.widget.C0013.m52()
            java.lang.String r4 = "۟ۦۤ"
            int r4 = com.google.android.material.theme.C0064.m258(r4)
            r70 = r4
            goto L7e
        L756:
            int r4 = defpackage.C0073.f73
            int r12 = com.google.android.material.appbar.C0049.f49
            int r4 = r4 + r12
            r12 = 1751580(0x1aba1c, float:2.454486E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L763:
            java.lang.String r4 = "wQ7ctDQ=\n"
            java.lang.String r12 = "sW+u1Vm+ZQA=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r12)
            r0 = r75
            defpackage.ip.o(r4, r0)
            goto L1eb
        L772:
            r0 = r75
            java.lang.Object r4 = r0.thisObject     // Catch: java.lang.Throwable -> L10b0
            java.lang.String r12 = "hVqXReMGLw==\n"
            java.lang.String r16 = "4j/jEZp2Sj0=\n"
            r0 = r16
            java.lang.String r12 = defpackage.u40.a(r12, r0)     // Catch: java.lang.Throwable -> L10b0
            r16 = 0
            r0 = r16
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L10b0
            r16 = r0
            r0 = r16
            java.lang.Object r10 = de.robv.android.xposed.XposedHelpers.callMethod(r4, r12, r0)     // Catch: java.lang.Throwable -> L10b0
            int r4 = androidx.appcompat.widget.C0015.m61()
            if (r4 > 0) goto L7a1
            defpackage.C0072.m289()
            java.lang.String r4 = "ۣۢۡ"
        L799:
            int r4 = android.support.v4.graphics.drawable.C0005.m23(r4)
            r70 = r4
            goto L7e
        L7a1:
            java.lang.String r4 = "ۡۧ"
        L7a3:
            int r4 = android.support.v4.graphics.drawable.C0006.m26(r4)
            r70 = r4
            goto L7e
        L7ab:
            r34 = 0
            java.lang.String r4 = "ۢۨۢ"
            int r4 = com.ljx.wechatmod.auth.C0065.m263(r4)
            r70 = r4
            goto L7e
        L7b7:
            java.lang.String r4 = "ۦۤ۠"
            goto L57e
        L7bb:
            int r4 = android.support.v4.graphics.drawable.C0004.f4
            int r12 = com.github.megatronking.stringfog.C0048.f48
            r4 = r4 ^ r12
            r12 = -1746948(0xffffffffffe557fc, float:NaN)
            r4 = r4 ^ r12
            r37 = r52
            r70 = r4
            goto L7e
        L7ca:
            java.lang.String r4 = "ۤۦۤ"
            int r4 = androidx.appcompat.widget.C0015.m60(r4)
            r70 = r4
            goto L7e
        L7d4:
            super.afterHookedMethod(r75)
            int r4 = com.google.android.material.theme.C0063.f63
            int r12 = com.github.megatronking.stringfog.xor.C0046.f46
            int r12 = r12 / 8280
            int r4 = r4 - r12
            if (r4 > 0) goto L7ee
            r4 = 85
            androidx.emoji2.text.C0026.f26 = r4
            java.lang.String r4 = "ۣۤۨ"
            int r4 = com.google.android.material.chip.C0056.m226(r4)
            r70 = r4
            goto L7e
        L7ee:
            int r4 = io.fastkv.C0068.f68
            int r12 = androidx.appcompat.widget.C0013.f13
            int r4 = r4 + r12
            r12 = 1753866(0x1ac30a, float:2.45769E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L7fb:
            r44 = 0
            int r4 = android.support.v4.graphics.drawable.C0006.f6
            int r12 = com.ljx.wechatmod.ui.C0067.f67
            int r4 = r4 - r12
            r12 = 1748051(0x1aac53, float:2.449541E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L80a:
            java.lang.String r4 = "ۣۤ۠"
            r12 = r38
            goto L649
        L810:
            int r4 = androidx.appcompat.widget.C0015.m61()
            if (r4 > 0) goto L823
            defpackage.C0071.m284()
            java.lang.String r4 = "ۥۢ۟"
            int r4 = com.google.android.material.bottomsheet.C0051.m207(r4)
            r70 = r4
            goto L7e
        L823:
            int r4 = androidx.profileinstaller.C0031.f31
            int r12 = androidx.versionedparcelable.C0042.f42
            int r4 = r4 % r12
            r12 = 1755452(0x1ac93c, float:2.459912E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L830:
            java.lang.String r4 = "1Q==\n"
            java.lang.String r12 = "pc7Qv/tSck0=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r12)
            r0 = r75
            defpackage.ip.o(r4, r0)
            java.lang.String r4 = "nIDVYjGQVj2olsJOD5pHOJKRyQ==\n"
            java.lang.String r12 = "9+WsPVD+IlQ=\n"
            gn r16 = defpackage.gn.a
            r0 = r16
            boolean r12 = defpackage.z30.q(r4, r12, r0)
            java.lang.String r4 = "XXktxETiwcVpbzroevvcwVM=\n"
            java.lang.String r16 = "NhxUmyWXtao=\n"
            r0 = r16
            java.lang.String r4 = defpackage.u40.a(r4, r0)
            boolean r4 = defpackage.gn.e(r4)
            if (r12 != 0) goto L203
            if (r4 != 0) goto L203
            int r16 = android.support.v4.graphics.drawable.C0005.f5
            int r21 = androidx.versionedparcelable.C0038.f38
            r0 = r21
            int r0 = r0 + (-7351)
            r21 = r0
            r16 = r16 ^ r21
            if (r16 < 0) goto L87a
            com.github.megatronking.stringfog.xor.C0045.m181()
        L86c:
            java.lang.String r16 = "ۥۦۡ"
            int r16 = androidx.constraintlayout.widget.C0019.m79(r16)
            r21 = r4
            r24 = r12
            r70 = r16
            goto L7e
        L87a:
            r16 = r35
            r21 = r4
            r24 = r12
            goto L59f
        L882:
            int r4 = android.support.v4.graphics.drawable.C0004.f4
            int r12 = com.google.android.material.carousel.C0054.f54
            int r12 = r12 % (-9199)
            int r4 = r4 % r12
            if (r4 < 0) goto L893
            r4 = 82
            androidx.profileinstaller.C0031.f31 = r4
            java.lang.String r4 = "ۤۥۣ"
            goto L7a3
        L893:
            int r4 = com.google.android.material.carousel.C0053.f53
            int r12 = androidx.savedstate.C0035.f35
            r4 = r4 ^ r12
            r12 = 56932(0xde64, float:7.9779E-41)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        L8a0:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L110e
            r4 = r0
            int r4 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r12 = androidx.savedstate.C0035.f35
            r4 = r4 | r12
            r12 = 1754733(0x1ac66d, float:2.458905E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L8b1:
            int r4 = com.google.android.material.theme.C0063.f63
            int r12 = androidx.appcompat.widget.C0014.f14
            r12 = r12 ^ 3724(0xe8c, float:5.218E-42)
            int r4 = r4 / r12
            if (r4 == 0) goto L8c2
            r4 = 17
            com.github.megatronking.stringfog.C0048.f48 = r4
            java.lang.String r4 = "ۡۡۥ"
            goto L71a
        L8c2:
            java.lang.String r4 = "ۣۣۧ"
            r12 = r4
            goto L731
        L8c7:
            r4 = 212(0xd4, float:2.97E-43)
            r0 = r28
            if (r0 != r4) goto Lee6
            int r4 = com.google.android.material.theme.C0063.f63
            int r12 = androidx.coordinatorlayout.widget.C0022.f22
            r12 = r12 | 3147(0xc4b, float:4.41E-42)
            r4 = r4 ^ r12
            if (r4 < 0) goto L8e0
            java.lang.String r4 = "ۧ۟ۤ"
            int r4 = com.github.megatronking.stringfog.C0048.m193(r4)
            r70 = r4
            goto L7e
        L8e0:
            java.lang.String r4 = "ۡۦۧ"
            goto L1ed
        L8e4:
            int r4 = com.ljx.wechatmod.hook.C0066.f66
            int r12 = kotlinx.coroutines.C0069.f69
            int r4 = r4 - r12
            r12 = 1751504(0x1ab9d0, float:2.45438E-39)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        L8f1:
            java.lang.String r4 = "8KpS\n"
            java.lang.String r12 = "seYeakckjHs=\n"
            defpackage.u40.a(r4, r12)     // Catch: java.lang.Throwable -> L11a3
            int r4 = com.ljx.wechatmod.ui.C0067.f67
            if (r4 < 0) goto L909
            androidx.core.content.C0023.m92()
        L8ff:
            java.lang.String r4 = "ۡۢۡ"
            int r4 = com.ljx.wechatmod.auth.C0065.m263(r4)
            r70 = r4
            goto L7e
        L909:
            java.lang.String r4 = "ۥ۟ۧ"
        L90b:
            int r4 = android.view.C0007.m28(r4)
            r70 = r4
            goto L7e
        L913:
            r0 = r75
            java.lang.Object[] r4 = r0.args     // Catch: java.lang.Throwable -> L2c7
            r12 = 2
            r8 = r4[r12]     // Catch: java.lang.Throwable -> L2c7
            int r4 = com.github.megatronking.stringfog.C0048.f48
            int r12 = android.app.C0002.f2
            r4 = r4 | r12
            r12 = 1752550(0x1abde6, float:2.455846E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L927:
            r0 = r75
            java.lang.Object[] r4 = r0.args
            r12 = 4
            r4 = r4[r12]
            if (r4 != 0) goto Lec0
            int r12 = androidx.activity.C0010.f10
            int r16 = androidx.versionedparcelable.C0041.f41
            r0 = r16
            int r0 = r0 % 5346
            r16 = r0
            int r12 = r12 + r16
            if (r12 < 0) goto L94e
            java.lang.String r12 = "۠ۨۤ"
            r16 = r41
        L942:
            int r12 = com.google.android.material.datepicker.C0058.m234(r12)
            r40 = r4
            r41 = r16
            r70 = r12
            goto L7e
        L94e:
            int r12 = android.app.C0001.f1
            int r16 = androidx.profileinstaller.C0030.f30
            int r12 = r12 + r16
            r16 = -1754637(0xffffffffffe539f3, float:NaN)
            r12 = r12 ^ r16
            r40 = r4
            r70 = r12
            goto L7e
        L95f:
            if (r24 == 0) goto L10d1
            int r4 = kotlinx.coroutines.C0070.m280()
            if (r4 < 0) goto L96b
            java.lang.String r4 = "ۣۢۧ"
            goto L1f7
        L96b:
            java.lang.String r4 = "ۤۢۨ"
            int r4 = android.app.C0002.m8(r4)
            r70 = r4
            goto L7e
        L975:
            int r4 = androidx.versionedparcelable.C0042.f42
            int r12 = android.app.C0000.f0
            r12 = r12 | 4336(0x10f0, float:6.076E-42)
            int r4 = r4 - r12
            if (r4 < 0) goto L98b
            androidx.constraintlayout.widget.C0020.m82()
            java.lang.String r4 = "ۧۥۣ"
            int r4 = androidx.coordinatorlayout.widget.C0021.m86(r4)
            r70 = r4
            goto L7e
        L98b:
            java.lang.String r4 = "ۤ۟ۨ"
            goto L71a
        L98f:
            int r4 = com.google.android.material.floatingactionbutton.C0060.m240()
            if (r4 < 0) goto L99f
            java.lang.String r4 = "ۧۧ۠"
            int r4 = com.google.android.material.behavior.C0050.m203(r4)
            r70 = r4
            goto L7e
        L99f:
            int r4 = androidx.coordinatorlayout.widget.C0022.f22
            int r12 = androidx.constraintlayout.widget.C0019.f19
            r4 = r4 ^ r12
            r12 = 1747745(0x1aab21, float:2.449112E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L9ac:
            int r4 = kotlinx.coroutines.C0069.m276()
            if (r4 < 0) goto L9be
            java.lang.String r4 = "ۣۡ۟"
            int r4 = androidx.lifecycle.C0029.m116(r4)
            r35 = r39
            r70 = r4
            goto L7e
        L9be:
            java.lang.String r4 = "ۣۨ"
            r35 = r39
            goto L799
        L9c4:
            boolean r4 = r7 instanceof java.util.LinkedList     // Catch: java.lang.Throwable -> L334
            if (r4 == 0) goto L12d7
            int r4 = android.support.v4.graphics.drawable.C0006.f6
            if (r4 > 0) goto L9da
            r4 = 46
            androidx.versionedparcelable.C0038.f38 = r4
            java.lang.String r4 = "ۣۢ۟"
            int r4 = defpackage.C0073.m292(r4)
            r70 = r4
            goto L7e
        L9da:
            java.lang.String r4 = "ۣۢۡ"
            r16 = r4
            goto Lcd
        L9e0:
            int r4 = com.google.android.material.chip.C0056.f56
            if (r4 < 0) goto L9ee
            defpackage.C0073.m295()
            java.lang.String r4 = "ۨ۟۠"
            r12 = r4
            r16 = r42
            goto L26d
        L9ee:
            int r4 = com.google.android.material.chip.C0057.f57
            int r12 = com.github.megatronking.stringfog.C0048.f48
            int r4 = r4 + r12
            r12 = 1748963(0x1aafe3, float:2.450819E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L9fb:
            int r4 = com.google.android.material.datepicker.C0058.m232()
            if (r4 > 0) goto La0e
            androidx.coordinatorlayout.widget.C0022.m88()
            java.lang.String r4 = "ۤ۟ۧ"
            int r4 = android.support.v4.graphics.drawable.C0006.m26(r4)
            r70 = r4
            goto L7e
        La0e:
            int r4 = androidx.viewpager2.adapter.C0043.f43
            int r12 = androidx.appcompat.widget.C0016.f16
            r4 = r4 | r12
            r12 = 1753048(0x1abfd8, float:2.456543E-39)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        La1b:
            int r4 = android.app.C0002.f2
            int r12 = com.google.android.material.theme.C0063.f63
            r4 = r4 | r12
            r12 = 1748007(0x1aac27, float:2.44948E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        La28:
            java.lang.String r4 = "53vj\n"
            java.lang.String r12 = "igiEy7e+YPk=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r12)     // Catch: java.lang.Throwable -> L11a3
            r0 = r62
            defpackage.ip.o(r4, r0)     // Catch: java.lang.Throwable -> L11a3
            int r4 = com.google.android.material.carousel.C0054.m217()
            if (r4 < 0) goto La49
            r4 = 13
            androidx.activity.result.C0008.f8 = r4
            java.lang.String r4 = "ۥ۠ۦ"
            int r4 = androidx.versionedparcelable.C0042.m170(r4)
            r70 = r4
            goto L7e
        La49:
            r4 = r29
            r12 = r30
            goto L455
        La4f:
            int r4 = r42.length()     // Catch: java.lang.Throwable -> L2c7
            if (r4 != 0) goto Lc6f
            int r4 = androidx.legacy.content.C0028.f28
            if (r4 < 0) goto La63
            java.lang.String r4 = "ۣۢ۟"
            int r4 = androidx.recyclerview.widget.C0032.m130(r4)
            r70 = r4
            goto L7e
        La63:
            int r4 = androidx.legacy.content.C0028.f28
            int r12 = androidx.constraintlayout.widget.C0020.f20
            r4 = r4 ^ r12
            r12 = 55834(0xda1a, float:7.824E-41)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        La70:
            if (r65 == 0) goto Ld5b
            int r4 = androidx.profileinstaller.C0030.m121()
            if (r4 < 0) goto La85
            androidx.activity.result.C0009.m36()
            java.lang.String r4 = "ۣۢۥ"
            int r4 = androidx.appcompat.widget.C0013.m53(r4)
            r70 = r4
            goto L7e
        La85:
            int r4 = androidx.profileinstaller.C0030.f30
            int r12 = androidx.viewpager2.adapter.C0043.f43
            r4 = r4 | r12
            r12 = 1748175(0x1aaccf, float:2.449715E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        La92:
            gn r4 = defpackage.gn.a     // Catch: java.lang.Throwable -> L2c7
            int r12 = com.github.megatronking.stringfog.C0048.f48
            int r16 = com.github.megatronking.stringfog.C0048.f48
            int r12 = r12 % r16
            r16 = 1746905(0x1aa7d9, float:2.447935E-39)
            int r12 = r12 + r16
            r61 = r4
            r70 = r12
            goto L7e
        Laa5:
            r4 = move-exception
            gn r4 = defpackage.gn.a     // Catch: java.lang.Throwable -> Ld40
            java.lang.String r12 = "WTFaLjA76w1LC0cUMC/x\n"
            java.lang.String r16 = "MlQjcVxOiGY=\n"
            r0 = r16
            java.lang.String r12 = defpackage.u40.a(r12, r0)     // Catch: java.lang.Throwable -> Ld40
            java.lang.String r16 = "Qg==\n"
            java.lang.String r70 = "chrynql3WXk=\n"
            r0 = r16
            r1 = r70
            java.lang.String r16 = defpackage.u40.a(r0, r1)     // Catch: java.lang.Throwable -> Ld40
            r4.getClass()     // Catch: java.lang.Throwable -> Ld40
            r0 = r16
            java.lang.String r4 = defpackage.gn.d(r12, r0)     // Catch: java.lang.Throwable -> Ld40
            long r32 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> Ld40
            int r4 = com.github.megatronking.stringfog.xor.C0046.f46
            int r12 = androidx.versionedparcelable.C0041.f41
            r12 = r12 | (-2724(0xfffffffffffff55c, float:NaN))
            int r4 = r4 + r12
            if (r4 < 0) goto L4af
            r4 = 96
            androidx.versionedparcelable.C0040.f40 = r4
            java.lang.String r4 = "ۦۣۨ"
            int r4 = com.github.megatronking.stringfog.C0048.m193(r4)
            r70 = r4
            goto L7e
        Lae2:
            android.os.Handler r12 = defpackage.d9.b     // Catch: java.lang.Throwable -> L2c7
            fi r4 = new fi     // Catch: java.lang.Throwable -> L2c7
            r16 = 1
            r0 = r43
            r1 = r63
            r2 = r16
            r4.<init>(r15, r0, r1, r2)     // Catch: java.lang.Throwable -> L2c7
            int r16 = com.ljx.wechatmod.auth.C0065.f65
            int r58 = defpackage.C0071.f71
            int r16 = r16 * r58
            r58 = 1219448(0x129b78, float:1.70881E-39)
            int r16 = r16 + r58
            r58 = r4
            r59 = r12
            r70 = r16
            goto L7e
        Lb04:
            int r4 = androidx.emoji2.text.C0026.f26
            if (r4 > 0) goto Lb16
            r4 = 13
            androidx.savedstate.C0036.f36 = r4
            java.lang.String r4 = "ۤۢۨ"
            int r4 = androidx.activity.result.C0008.m35(r4)
            r70 = r4
            goto L7e
        Lb16:
            java.lang.String r4 = "۠ۨۤ"
            goto L67d
        Lb1a:
            java.lang.String r4 = "Z+wZLEm3tD111gQWSaOu\n"
            java.lang.String r12 = "DIlgcyXC11Y=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r12)     // Catch: java.lang.Throwable -> Laa5
            r12 = 0
            int r4 = defpackage.gn.b(r4, r12)     // Catch: java.lang.Throwable -> Laa5
            int r12 = androidx.coordinatorlayout.widget.C0022.f22
            int r16 = androidx.appcompat.widget.C0016.f16
            r0 = r16
            int r0 = r0 + (-1844)
            r16 = r0
            r12 = r12 ^ r16
            if (r12 > 0) goto Lb44
            com.github.megatronking.stringfog.xor.C0046.m185()
            java.lang.String r12 = "ۢۨ۠"
            int r12 = kotlinx.coroutines.C0069.m277(r12)
            r68 = r4
            r70 = r12
            goto L7e
        Lb44:
            int r12 = com.google.android.material.carousel.C0054.f54
            int r16 = androidx.profileinstaller.C0030.f30
            int r12 = r12 / r16
            r16 = 1749699(0x1ab2c3, float:2.45185E-39)
            r12 = r12 ^ r16
            r68 = r4
            r70 = r12
            goto L7e
        Lb55:
            int r4 = androidx.recyclerview.widget.C0033.f33
            int r12 = androidx.appcompat.widget.C0014.f14
            r12 = r12 | 5882(0x16fa, float:8.242E-42)
            r4 = r4 ^ r12
            if (r4 < 0) goto Lb6c
            r4 = 38
            com.ljx.wechatmod.ui.C0067.f67 = r4
            java.lang.String r4 = "ۦۣۧ"
            int r4 = androidx.lifecycle.C0029.m116(r4)
            r70 = r4
            goto L7e
        Lb6c:
            int r4 = androidx.savedstate.C0034.f34
            int r12 = com.github.megatronking.stringfog.C0047.f47
            int r4 = r4 % r12
            r12 = -1748614(0xffffffffffe5517a, float:NaN)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        Lb79:
            if (r19 != 0) goto L8b1
            java.lang.String r67 = ""
            int r4 = androidx.profileinstaller.C0030.f30
            if (r4 > 0) goto Lb8b
            java.lang.String r4 = "ۤ۠ۡ"
            int r4 = androidx.activity.result.C0008.m35(r4)
            r70 = r4
            goto L7e
        Lb8b:
            int r4 = com.google.android.material.carousel.C0054.f54
            int r12 = androidx.versionedparcelable.C0040.f40
            int r4 = r4 % r12
            r12 = 1748586(0x1aae6a, float:2.450291E-39)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        Lb98:
            r0 = r45
            r1 = r55
            r1.b = r0     // Catch: java.lang.Throwable -> L11a3
            int r4 = androidx.viewpager2.adapter.C0043.f43
            int r12 = androidx.core.content.C0023.f23
            int r12 = r12 + (-3871)
            int r4 = r4 / r12
            if (r4 == 0) goto Lbb1
        Lba7:
            java.lang.String r4 = "۟ۤۢ"
            int r4 = kotlinx.coroutines.C0070.m281(r4)
            r70 = r4
            goto L7e
        Lbb1:
            int r4 = androidx.appcompat.widget.C0013.f13
            int r12 = androidx.core.content.C0023.f23
            r4 = r4 | r12
            r12 = 1747312(0x1aa970, float:2.448506E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        Lbbe:
            defpackage.ip.l(r63)     // Catch: java.lang.Throwable -> L2c7
            int r4 = androidx.constraintlayout.widget.C0020.f20
            int r12 = androidx.coordinatorlayout.widget.C0022.f22
            int r12 = r12 + (-362)
            int r4 = r4 - r12
            if (r4 > 0) goto Lbd4
            java.lang.String r4 = "ۤۥۡ"
            int r4 = androidx.activity.result.C0009.m38(r4)
            r70 = r4
            goto L7e
        Lbd4:
            java.lang.String r4 = "۟۟ۧ"
            int r4 = androidx.appcompat.widget.C0015.m60(r4)
            r70 = r4
            goto L7e
        Lbde:
            boolean r4 = defpackage.gn.e(r64)     // Catch: java.lang.Throwable -> L2c7
            if (r4 == 0) goto Lb6
            int r4 = androidx.appcompat.widget.C0015.f15
            if (r4 < 0) goto Lbf5
            com.ljx.wechatmod.hook.C0066.m265()
            java.lang.String r4 = "۟ۡ۟"
        Lbed:
            int r4 = androidx.versionedparcelable.C0040.m160(r4)
            r70 = r4
            goto L7e
        Lbf5:
            java.lang.String r4 = "ۡۡۡ"
            goto Lbed
        Lbf8:
            java.lang.String r4 = "5UqNA5A5iv7fT5s=\n"
            java.lang.String r12 = "tiT+QuVN5bI=\n"
            java.lang.String r12 = defpackage.u40.a(r4, r12)     // Catch: java.lang.Throwable -> L11a3
            java.lang.StringBuilder r16 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11a3
            java.lang.String r4 = "💤 CGI "
            r0 = r16
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L11a3
            java.lang.String r4 = "ۣۨۨ"
        Lc0b:
            int r4 = androidx.activity.C0010.m43(r4)
            r48 = r12
            r49 = r16
            r70 = r4
            goto L7e
        Lc17:
            int r4 = com.google.android.material.appbar.C0049.m199()
            if (r4 < 0) goto Lc32
            androidx.recyclerview.widget.C0033.m135()
            r4 = r44
            r12 = r46
        Lc24:
            java.lang.String r16 = "۠ۡ۠"
            int r16 = com.google.android.material.datepicker.C0058.m234(r16)
            r45 = r4
            r46 = r12
            r70 = r16
            goto L7e
        Lc32:
            int r4 = androidx.coordinatorlayout.widget.C0022.f22
            int r12 = androidx.appcompat.widget.C0016.f16
            r4 = r4 | r12
            r12 = 1748281(0x1aad39, float:2.449863E-39)
            int r4 = r4 + r12
            r45 = r44
            r70 = r4
            goto L7e
        Lc41:
            java.lang.String r4 = "ۤۦ۠"
            goto L411
        Lc45:
            r0 = r59
            r1 = r58
            r2 = r22
            r0.postDelayed(r1, r2)     // Catch: java.lang.Throwable -> L2c7
            int r4 = androidx.constraintlayout.widget.C0019.f19
            if (r4 > 0) goto Lc5c
            java.lang.String r4 = "ۨۢ۠"
            int r4 = android.app.C0001.m5(r4)
            r70 = r4
            goto L7e
        Lc5c:
            java.lang.String r4 = "۟ۥۦ"
        Lc5e:
            int r4 = com.google.android.material.carousel.C0052.m209(r4)
            r70 = r4
            goto L7e
        Lc66:
            java.lang.String r12 = "ۥۧ۟"
            r4 = r15
            r16 = r17
            r19 = r17
            goto L17e
        Lc6f:
            java.lang.String r4 = "ۢ۟۠"
            goto L169
        Lc73:
            int r4 = androidx.fragment.app.C0027.f27
            int r12 = com.ljx.wechatmod.auth.C0065.f65
            int r4 = r4 + r12
            r12 = 1751149(0x1ab86d, float:2.453882E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        Lc80:
            java.lang.String r4 = defpackage.pb0.p1     // Catch: java.lang.Throwable -> L10b0
            r0 = r40
            java.lang.Object r4 = de.robv.android.xposed.XposedHelpers.getObjectField(r0, r4)     // Catch: java.lang.Throwable -> L10b0
            java.lang.String r12 = defpackage.pb0.q1     // Catch: java.lang.Throwable -> L10b0
            java.lang.Object r16 = de.robv.android.xposed.XposedHelpers.getObjectField(r4, r12)     // Catch: java.lang.Throwable -> L10b0
            java.lang.String r12 = "ۥۤۢ"
            r4 = r40
            goto L942
        Lc94:
            int r4 = androidx.fragment.app.C0027.f27
            int r12 = androidx.profileinstaller.C0030.f30
            int r12 = r12 % (-4255)
            r4 = r4 ^ r12
            if (r4 < 0) goto Lcab
            java.lang.String r4 = "ۥۢۤ"
            r12 = r47
        Lca1:
            int r4 = androidx.appcompat.widget.C0015.m60(r4)
            r47 = r12
            r70 = r4
            goto L7e
        Lcab:
            java.lang.String r4 = "ۣۡ۟"
            goto L9d
        Lcaf:
            r0 = r7
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Throwable -> L334
            r4 = r0
            int r12 = androidx.recyclerview.widget.C0032.f32
            int r16 = com.google.android.material.theme.C0064.f64
            r0 = r16
            r0 = r0 ^ (-276(0xfffffffffffffeec, float:NaN))
            r16 = r0
            int r12 = r12 + r16
            if (r12 < 0) goto Lccd
        Lcc1:
            java.lang.String r12 = "ۣۨ۠"
            int r12 = com.google.android.material.appbar.C0049.m197(r12)
            r39 = r4
            r70 = r12
            goto L7e
        Lccd:
            int r12 = androidx.constraintlayout.widget.C0020.f20
            int r16 = com.google.android.material.chip.C0056.f56
            int r12 = r12 * r16
            r16 = 119800(0x1d3f8, float:1.67876E-40)
            r12 = r12 ^ r16
            r39 = r4
            r70 = r12
            goto L7e
        Lcde:
            int r4 = androidx.appcompat.widget.C0015.f15
            if (r4 < 0) goto Lcf1
            defpackage.C0071.m284()
            java.lang.String r4 = "ۣ۟۟"
            int r4 = com.google.android.material.carousel.C0054.m219(r4)
            r70 = r4
            r71 = r53
            goto L7e
        Lcf1:
            java.lang.String r4 = "ۤ۟ۨ"
            int r4 = androidx.appcompat.widget.C0016.m65(r4)
            r70 = r4
            r71 = r53
            goto L7e
        Lcfd:
            int r4 = com.google.android.material.theme.C0064.m257()
            if (r4 < 0) goto Ld12
            androidx.appcompat.widget.C0014.m58()
            java.lang.String r4 = "ۢ۠ۧ"
            int r4 = android.support.v4.graphics.drawable.C0005.m23(r4)
            r18 = r50
            r70 = r4
            goto L7e
        Ld12:
            int r4 = androidx.startup.C0037.f37
            int r12 = androidx.viewpager2.adapter.C0043.f43
            int r4 = r4 / r12
            r12 = -1751532(0xffffffffffe54614, float:NaN)
            r4 = r4 ^ r12
            r18 = r50
            r70 = r4
            goto L7e
        Ld21:
            r0 = r75
            java.lang.Object r4 = r0.thisObject     // Catch: java.lang.Throwable -> L110e
            java.lang.String r12 = "43feBJDOCUblf88=\n"
            java.lang.String r16 = "hBKqUeOrewg=\n"
            r0 = r16
            java.lang.String r12 = defpackage.u40.a(r12, r0)     // Catch: java.lang.Throwable -> L110e
            r16 = 0
            r0 = r16
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L110e
            r16 = r0
            r0 = r16
            java.lang.Object r6 = de.robv.android.xposed.XposedHelpers.callMethod(r4, r12, r0)     // Catch: java.lang.Throwable -> L110e
            r4 = r39
            goto Lcc1
        Ld40:
            r4 = move-exception
            r22 = 0
            r4 = r21
            r12 = r24
            goto L86c
        Ld49:
            if (r42 == 0) goto L1158
            int r4 = androidx.constraintlayout.widget.C0020.m82()
            if (r4 > 0) goto Lba7
            java.lang.String r4 = "ۨۨۨ"
            int r4 = com.google.android.material.chip.C0057.m229(r4)
            r70 = r4
            goto L7e
        Ld5b:
            int r4 = androidx.appcompat.widget.C0015.f15
            int r12 = com.github.megatronking.stringfog.C0047.f47
            r12 = r12 ^ (-2401(0xfffffffffffff69f, float:NaN))
            int r4 = r4 + r12
            if (r4 > 0) goto Ld71
            r4 = 7
            androidx.versionedparcelable.C0039.f39 = r4
            java.lang.String r4 = "ۣۢۢ"
            int r4 = androidx.fragment.app.C0027.m110(r4)
            r70 = r4
            goto L7e
        Ld71:
            java.lang.String r4 = "ۤۢۤ"
        Ld73:
            int r4 = androidx.profileinstaller.C0030.m120(r4)
            r70 = r4
            goto L7e
        Ld7b:
            if (r37 != 0) goto L291
            int r4 = android.app.C0001.f1
            int r12 = androidx.core.widget.C0025.f25
            int r12 = r12 + (-5810)
            int r4 = r4 * r12
            if (r4 > 0) goto Ld90
            java.lang.String r4 = "ۥۣۥ"
            int r4 = androidx.versionedparcelable.C0039.m159(r4)
            r70 = r4
            goto L7e
        Ld90:
            java.lang.String r4 = "ۤ۠ۡ"
            goto L169
        Ld94:
            if (r36 == 0) goto Lb6
            int r4 = android.support.v4.graphics.drawable.C0004.f4
            if (r4 < 0) goto Lda2
            java.lang.String r4 = "ۣۨۡ"
            r12 = r48
            r16 = r49
            goto Lc0b
        Lda2:
            int r4 = com.google.android.material.carousel.C0054.f54
            int r12 = com.github.megatronking.stringfog.xor.C0045.f45
            r4 = r4 ^ r12
            r12 = -1750504(0xffffffffffe54a18, float:NaN)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        Ldaf:
            java.lang.String r4 = "iwX2iIxe3I6ZP+K4hE4=\n"
            java.lang.String r12 = "4GCP1+Arv+U=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r12)     // Catch: java.lang.Throwable -> L2c7
            r12 = 0
            int r4 = defpackage.gn.b(r4, r12)     // Catch: java.lang.Throwable -> L2c7
            r12 = 1
            if (r4 == r12) goto L4bc
            goto L1b3
        Ldc1:
            java.lang.String r4 = "xwGO\n"
            java.lang.String r12 = "s2Dpd1+FjZU=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r12)     // Catch: java.lang.Throwable -> L11a3
            r0 = r48
            defpackage.ip.o(r4, r0)     // Catch: java.lang.Throwable -> L11a3
            int r4 = com.google.android.material.appbar.C0049.m199()
            if (r4 < 0) goto Ldde
            java.lang.String r4 = "ۤۦۢ"
            int r4 = com.google.android.material.carousel.C0054.m219(r4)
            r70 = r4
            goto L7e
        Ldde:
            java.lang.String r4 = "ۧۤۦ"
            r12 = r36
            goto L62a
        Lde4:
            int r4 = com.google.android.material.behavior.C0050.f50
            if (r4 > 0) goto Ldf5
            kotlinx.coroutines.C0069.m276()
            java.lang.String r4 = "ۣۣ۠"
            int r4 = com.github.megatronking.stringfog.xor.C0045.m182(r4)
            r70 = r4
            goto L7e
        Ldf5:
            int r4 = com.google.android.material.carousel.C0055.f55
            int r12 = androidx.core.content.C0024.f24
            int r4 = r4 % r12
            r12 = -1755528(0xffffffffffe53678, float:NaN)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        Le02:
            r4 = 2
            r0 = r54
            r1 = r30
            r2 = r29
            defpackage.a80.r(r0, r1, r2, r4)     // Catch: java.lang.Throwable -> L11a3
            int r4 = androidx.savedstate.C0036.m147()
            if (r4 < 0) goto L8ff
            java.lang.String r4 = "۠ۤۧ"
            int r4 = androidx.recyclerview.widget.C0032.m130(r4)
            r70 = r4
            goto L7e
        Le1c:
            int r4 = com.google.android.material.internal.C0061.f61
            int r12 = android.app.C0003.f3
            int r12 = r12 * (-3183)
            int r4 = r4 + r12
            if (r4 < 0) goto Le32
            androidx.appcompat.app.C0012.m51()
            java.lang.String r4 = "۠۠۠"
            int r4 = androidx.savedstate.C0035.m140(r4)
            r70 = r4
            goto L7e
        Le32:
            int r4 = androidx.activity.C0010.f10
            int r12 = androidx.savedstate.C0034.f34
            int r4 = r4 * r12
            r12 = 1110530(0x10f202, float:1.556184E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        Le3f:
            int r4 = androidx.appcompat.widget.C0014.f14
            if (r4 < 0) goto Le4a
            android.app.C0001.m4()
            java.lang.String r4 = "ۣۧۢ"
            goto L4be
        Le4a:
            int r4 = com.github.megatronking.stringfog.xor.C0046.f46
            int r12 = androidx.savedstate.C0036.f36
            int r4 = r4 * r12
            r12 = 1425404(0x15bffc, float:1.997416E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        Le57:
            java.lang.String r4 = "lUAhgx2tCIuvRTc=\n"
            java.lang.String r12 = "xi5SwmjZZ8c=\n"
            java.lang.String r12 = defpackage.u40.a(r4, r12)     // Catch: java.lang.Throwable -> L11a3
            java.lang.String r4 = "ۨۡ۠"
            goto Lca1
        Le63:
            int r4 = androidx.recyclerview.widget.C0032.m128()
            if (r4 < 0) goto Le73
            java.lang.String r4 = "۟ۥۦ"
            int r4 = com.google.android.material.appbar.C0049.m197(r4)
            r70 = r4
            goto L7e
        Le73:
            int r4 = com.github.megatronking.stringfog.xor.C0045.f45
            int r12 = androidx.versionedparcelable.C0039.f39
            int r4 = r4 - r12
            r12 = 1750484(0x1ab5d4, float:2.45295E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        Le80:
            r4 = 211(0xd3, float:2.96E-43)
            r0 = r28
            if (r0 == r4) goto Lc73
            r4 = 212(0xd4, float:2.97E-43)
            r0 = r28
            if (r0 == r4) goto L41d
            int r4 = androidx.profileinstaller.C0031.m124()
            if (r4 > 0) goto Lea4
            androidx.viewpager2.adapter.C0043.m172()
            java.lang.String r4 = "ۣۢۧ"
            r12 = r4
            r16 = r50
        Le9a:
            int r4 = androidx.constraintlayout.widget.C0018.m73(r12)
            r50 = r16
            r70 = r4
            goto L7e
        Lea4:
            int r4 = com.google.android.material.carousel.C0053.f53
            int r12 = android.app.C0002.f2
            r4 = r4 ^ r12
            r12 = 1748991(0x1aafff, float:2.450858E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        Leb1:
            int r4 = androidx.activity.result.C0009.f9
            int r12 = androidx.profileinstaller.C0031.f31
            r4 = r4 | r12
            r12 = 1754699(0x1ac64b, float:2.458857E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        Lebe:
            r4 = r40
        Lec0:
            int r12 = androidx.versionedparcelable.C0041.m167()
            if (r12 > 0) goto Led5
            r12 = 0
            androidx.appcompat.widget.C0013.f13 = r12
            java.lang.String r12 = "ۤۦ۟"
            int r12 = androidx.appcompat.widget.C0016.m65(r12)
            r40 = r4
            r70 = r12
            goto L7e
        Led5:
            int r12 = android.support.v4.graphics.drawable.C0006.f6
            int r16 = com.google.android.material.carousel.C0053.f53
            int r12 = r12 - r16
            r16 = 1751029(0x1ab7f5, float:2.453714E-39)
            r12 = r12 ^ r16
            r40 = r4
            r70 = r12
            goto L7e
        Lee6:
            int r4 = com.ljx.wechatmod.ui.C0067.f67
            int r12 = androidx.recyclerview.widget.C0033.f33
            int r4 = r4 % r12
            r12 = 1748862(0x1aaf7e, float:2.450678E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        Lef3:
            int r4 = android.view.C0007.m31()
            if (r4 < 0) goto Lf08
            androidx.fragment.app.C0027.m111()
            java.lang.String r4 = "ۡ۟۟"
            int r4 = com.google.android.material.carousel.C0053.m213(r4)
            r66 = r67
            r70 = r4
            goto L7e
        Lf08:
            int r4 = androidx.versionedparcelable.C0040.f40
            int r12 = androidx.activity.result.C0009.f9
            int r4 = r4 % r12
            r12 = 1750155(0x1ab48b, float:2.45249E-39)
            int r4 = r4 + r12
            r66 = r67
            r70 = r4
            goto L7e
        Lf17:
            int r4 = com.google.android.material.datepicker.C0059.f59
            if (r4 < 0) goto Lf23
            r4 = 74
            com.github.megatronking.stringfog.xor.C0045.f45 = r4
            java.lang.String r4 = "ۣۥۢ"
            goto L169
        Lf23:
            java.lang.String r4 = "ۣۨۧ"
            goto L374
        Lf27:
            r0 = r55
            java.lang.Object r4 = r0.b     // Catch: java.lang.Throwable -> L11a3
            java.util.LinkedList r4 = (java.util.LinkedList) r4     // Catch: java.lang.Throwable -> L11a3
            int r12 = r4.size()     // Catch: java.lang.Throwable -> L11a3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11a3
            java.lang.String r16 = "🔍 捕获到 "
            r0 = r16
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L11a3
            int r16 = androidx.activity.result.C0008.f8
            if (r16 < 0) goto Lf4f
            com.google.android.material.datepicker.C0059.m236()
            java.lang.String r16 = "ۤۢ"
            int r16 = kotlinx.coroutines.C0069.m277(r16)
            r60 = r4
            r69 = r12
            r70 = r16
            goto L7e
        Lf4f:
            int r16 = com.google.android.material.chip.C0057.f57
            int r60 = androidx.appcompat.widget.C0014.f14
            r16 = r16 ^ r60
            r60 = 1750324(0x1ab534, float:2.452726E-39)
            r16 = r16 ^ r60
            r60 = r4
            r69 = r12
            r70 = r16
            goto L7e
        Lf62:
            int r4 = defpackage.C0073.f73
            int r12 = com.ljx.wechatmod.auth.C0065.f65
            r12 = r12 | 7934(0x1efe, float:1.1118E-41)
            r4 = r4 | r12
            if (r4 < 0) goto Lf73
            r4 = 57
            androidx.profileinstaller.C0031.f31 = r4
            r36 = r51
            goto L381
        Lf73:
            int r4 = com.google.android.material.carousel.C0053.f53
            int r12 = androidx.constraintlayout.widget.C0018.f18
            int r4 = r4 / r12
            r12 = 1747927(0x1aabd7, float:2.449367E-39)
            int r4 = r4 + r12
            r70 = r4
            r36 = r51
            goto L7e
        Lf82:
            if (r26 == 0) goto L12a1
            int r4 = androidx.activity.C0011.f11
            if (r4 < 0) goto Lf96
            r4 = 41
            io.fastkv.C0068.f68 = r4
            java.lang.String r4 = "ۡ۠۟"
            int r4 = android.app.C0000.m2(r4)
            r70 = r4
            goto L7e
        Lf96:
            java.lang.String r4 = "۠ۤ"
            goto L9d
        Lf9a:
            r0 = r74
            int r0 = r0.a
            r17 = r0
            r0 = r74
            java.lang.ClassLoader r4 = r0.b
            r15 = 0
            int r12 = com.google.android.material.carousel.C0053.f53
            int r16 = com.google.android.material.carousel.C0052.f52
            r0 = r16
            int r0 = r0 + 3994
            r16 = r0
            int r12 = r12 - r16
            if (r12 < 0) goto Lfbf
            r12 = 87
            com.google.android.material.internal.C0061.f61 = r12
            java.lang.String r12 = "ۣۤ۟"
            r16 = r15
            r20 = r17
            goto L6a0
        Lfbf:
            java.lang.String r12 = "ۤۥۨ"
            r16 = r15
            r20 = r17
            goto L17e
        Lfc7:
            int r4 = androidx.core.content.C0024.f24
            int r12 = androidx.versionedparcelable.C0041.f41
            r12 = r12 | 3452(0xd7c, float:4.837E-42)
            int r4 = r4 / r12
            if (r4 == 0) goto Lfdd
            androidx.legacy.content.C0028.m112()
            java.lang.String r4 = "ۢ۟ۡ"
            int r4 = android.view.C0007.m28(r4)
            r70 = r4
            goto L7e
        Lfdd:
            java.lang.String r4 = "ۣۨۢ"
        Lfdf:
            int r4 = com.github.megatronking.stringfog.C0047.m189(r4)
            r70 = r4
            goto L7e
        Lfe7:
            r0 = r60
            r1 = r69
            r0.append(r1)     // Catch: java.lang.Throwable -> L11a3
            int r4 = com.ljx.wechatmod.ui.C0067.f67
            if (r4 < 0) goto Lff6
            java.lang.String r4 = "ۨۢ"
            goto Lc5e
        Lff6:
            int r4 = androidx.constraintlayout.helper.widget.C0017.f17
            int r12 = com.ljx.wechatmod.ui.C0067.f67
            int r4 = r4 / r12
            r12 = 1750600(0x1ab648, float:2.453113E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L1003:
            java.lang.String r4 = "ۡ۟۟"
            r26 = r31
            goto L57e
        L1009:
            int r4 = androidx.profileinstaller.C0031.f31
            int r12 = com.github.megatronking.stringfog.C0048.f48
            int r12 = r12 * (-9255)
            int r4 = r4 / r12
            if (r4 == 0) goto L1016
            java.lang.String r4 = "ۧۦ"
            goto L67d
        L1016:
            java.lang.String r4 = "ۢۨۧ"
            int r4 = com.google.android.material.carousel.C0055.m220(r4)
            r70 = r4
            goto L7e
        L1020:
            int r4 = defpackage.C0073.f73
            int r12 = com.google.android.material.internal.C0061.f61
            int r12 = r12 * 3797
            r4 = r4 | r12
            if (r4 > 0) goto L1037
            r4 = 89
            androidx.savedstate.C0036.f36 = r4
            java.lang.String r4 = "ۦۢ۟"
            int r4 = defpackage.C0072.m288(r4)
            r70 = r4
            goto L7e
        L1037:
            java.lang.String r4 = "ۡ۠ۨ"
            goto L57e
        L103b:
            r51 = 0
            int r4 = com.google.android.material.chip.C0056.m224()
            if (r4 > 0) goto L1051
            r4 = 90
            com.google.android.material.floatingactionbutton.C0060.f60 = r4
        L1047:
            java.lang.String r4 = "ۢۦۣ"
            int r4 = kotlinx.coroutines.C0069.m277(r4)
            r70 = r4
            goto L7e
        L1051:
            int r4 = androidx.constraintlayout.helper.widget.C0017.f17
            int r12 = defpackage.C0072.f72
            r4 = r4 | r12
            r12 = 1750787(0x1ab703, float:2.453375E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L105e:
            boolean r4 = r5 instanceof java.util.LinkedList     // Catch: java.lang.Throwable -> L5d7
            if (r4 == 0) goto L8e
            int r4 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r12 = com.google.android.material.floatingactionbutton.C0060.f60
            int r12 = r12 + 5334
            r4 = r4 ^ r12
            if (r4 > 0) goto L1078
            com.github.megatronking.stringfog.xor.C0046.m185()
            java.lang.String r4 = "ۧۦۧ"
            int r4 = com.github.megatronking.stringfog.xor.C0046.m186(r4)
            r70 = r4
            goto L7e
        L1078:
            int r4 = androidx.recyclerview.widget.C0032.f32
            int r12 = androidx.savedstate.C0034.f34
            r4 = r4 | r12
            r12 = 1753032(0x1abfc8, float:2.456521E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L1085:
            boolean r4 = r8 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L2c7
            if (r4 == 0) goto L6b8
            r0 = r8
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L2c7
            r4 = r0
            int r12 = androidx.startup.C0037.f37
            int r16 = com.ljx.wechatmod.ui.C0067.f67
            r0 = r16
            int r0 = r0 % (-2721)
            r16 = r0
            r12 = r12 ^ r16
            if (r12 > 0) goto L10aa
            androidx.constraintlayout.widget.C0020.m82()
            java.lang.String r12 = "ۣۨۨ"
            int r12 = androidx.savedstate.C0036.m144(r12)
            r38 = r4
            r70 = r12
            goto L7e
        L10aa:
            java.lang.String r12 = "ۣۥۧ"
            r38 = r4
            goto L731
        L10b0:
            r4 = move-exception
            int r4 = com.google.android.material.theme.C0062.f62
            int r12 = com.google.android.material.carousel.C0055.f55
            int r12 = r12 % 5087
            int r4 = r4 % r12
            if (r4 < 0) goto L10c4
            java.lang.String r4 = "ۢۨۧ"
            int r4 = android.support.v4.graphics.drawable.C0005.m23(r4)
            r70 = r4
            goto L7e
        L10c4:
            int r4 = androidx.constraintlayout.widget.C0020.f20
            int r12 = android.app.C0000.f0
            r4 = r4 | r12
            r12 = 1753744(0x1ac290, float:2.457519E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L10d1:
            java.lang.String r4 = "ۡۢۤ"
            int r4 = androidx.constraintlayout.widget.C0018.m73(r4)
            r70 = r4
            goto L7e
        L10db:
            int r4 = r63.length()     // Catch: java.lang.Throwable -> L2c7
            if (r4 <= 0) goto L7ca
            r16 = 1
            int r4 = com.google.android.material.theme.C0062.f62
            if (r4 < 0) goto L10f7
            r4 = 68
            androidx.startup.C0037.f37 = r4
            java.lang.String r4 = "ۧۤۢ"
            int r4 = androidx.startup.C0037.m149(r4)
            r70 = r4
            r27 = r16
            goto L7e
        L10f7:
            java.lang.String r4 = "ۤ۟ۢ"
            r12 = r4
            goto L3f3
        L10fc:
            int r4 = com.google.android.material.carousel.C0053.m214()
            if (r4 > 0) goto L1108
            java.lang.String r4 = "ۣۡ۠"
            r36 = r27
            goto L90b
        L1108:
            java.lang.String r4 = "۟ۡ۟"
            r12 = r27
            goto L62a
        L110e:
            r4 = move-exception
            java.lang.String r4 = "Q4wS\n"
            java.lang.String r12 = "AsBeospW0AQ=\n"
            defpackage.u40.a(r4, r12)     // Catch: java.lang.Throwable -> L11a3
            int r4 = androidx.versionedparcelable.C0042.m169()
            if (r4 > 0) goto L1129
            androidx.constraintlayout.widget.C0018.m75()
            java.lang.String r4 = "۠ۢۦ"
            int r4 = com.google.android.material.carousel.C0052.m209(r4)
            r70 = r4
            goto L7e
        L1129:
            java.lang.String r4 = "ۨۢ"
            goto L567
        L112d:
            boolean r4 = r9 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L2c7
            if (r4 == 0) goto L620
            r0 = r9
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L2c7
            r4 = r0
            int r12 = com.google.android.material.behavior.C0050.f50
            int r16 = androidx.activity.C0010.f10
            r0 = r16
            r0 = r0 ^ (-5326(0xffffffffffffeb32, float:NaN))
            r16 = r0
            int r12 = r12 % r16
            if (r12 > 0) goto L1152
            com.google.android.material.datepicker.C0058.m232()
            java.lang.String r12 = "ۥۨۡ"
            int r12 = androidx.profileinstaller.C0031.m127(r12)
            r50 = r4
            r70 = r12
            goto L7e
        L1152:
            java.lang.String r12 = "ۡۦۣ"
            r16 = r4
            goto Le9a
        L1158:
            int r4 = androidx.core.content.C0024.f24
            int r12 = androidx.savedstate.C0034.f34
            r4 = r4 | r12
            r12 = -1746174(0xffffffffffe55b02, float:NaN)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        L1165:
            r0 = r49
            r1 = r28
            r0.append(r1)     // Catch: java.lang.Throwable -> L11a3
            int r4 = com.google.android.material.datepicker.C0059.m236()
            if (r4 > 0) goto L117f
            com.google.android.material.carousel.C0052.m210()
            java.lang.String r4 = "ۤۦۣ"
            int r4 = androidx.recyclerview.widget.C0033.m132(r4)
            r70 = r4
            goto L7e
        L117f:
            int r4 = androidx.versionedparcelable.C0040.f40
            int r12 = com.google.android.material.datepicker.C0059.f59
            int r4 = r4 * r12
            r12 = 2115285(0x2046d5, float:2.964146E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L118c:
            r52 = 0
            int r4 = com.google.android.material.floatingactionbutton.C0060.f60
            if (r4 > 0) goto L119c
            java.lang.String r4 = "۠ۧۦ"
            int r4 = androidx.versionedparcelable.C0039.m159(r4)
            r70 = r4
            goto L7e
        L119c:
            java.lang.String r12 = "ۡ۟ۢ"
            r4 = r15
            r16 = r17
            goto L6a0
        L11a3:
            r4 = move-exception
            java.lang.String r4 = "Nwje\n"
            java.lang.String r12 = "Q2m5jaPP2Zc=\n"
            java.lang.String r16 = "spCCAhWCphWTlbkjH52OM4+QlD41hKMVkw==\n"
            java.lang.String r70 = "4f7xTHD20Xo=\n"
            r0 = r16
            r1 = r70
            java.lang.String r16 = defpackage.u40.a(r0, r1)
            java.lang.String r70 = "Fg==\n"
            java.lang.String r73 = "c8HJlSTQVfc=\n"
            r0 = r16
            r1 = r70
            r2 = r73
            defpackage.z30.o(r4, r12, r0, r1, r2)
            int r4 = com.google.android.material.datepicker.C0058.f58
            if (r4 > 0) goto L1047
            com.google.android.material.carousel.C0055.m223()
            java.lang.String r4 = "ۢۥۧ"
            int r4 = com.ljx.wechatmod.ui.C0067.m271(r4)
            r70 = r4
            goto L7e
        L11d2:
            int r4 = androidx.appcompat.widget.C0016.f16
            if (r4 > 0) goto L11dd
            com.google.android.material.carousel.C0053.m214()
            java.lang.String r4 = "ۡۦۨ"
            goto Ld73
        L11dd:
            java.lang.String r4 = "۠۠۠"
            int r4 = androidx.savedstate.C0034.m138(r4)
            r70 = r4
            goto L7e
        L11e7:
            if (r21 == 0) goto Lee6
            int r4 = com.google.android.material.theme.C0062.f62
            int r12 = com.google.android.material.theme.C0062.f62
            int r4 = r4 % r12
            r12 = 1755528(0x1ac988, float:2.460019E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L11f6:
            int r4 = com.google.android.material.datepicker.C0059.f59
            int r12 = com.google.android.material.appbar.C0049.f49
            int r12 = r12 % 1887
            int r4 = r4 / r12
            if (r4 < 0) goto L1207
            r4 = 59
            androidx.core.widget.C0025.f25 = r4
            java.lang.String r4 = "۠ۨۨ"
            goto Lfdf
        L1207:
            java.lang.String r4 = "ۢۡۡ"
            goto L1bf
        L120b:
            java.lang.String r4 = defpackage.pb0.z     // Catch: java.lang.Throwable -> L2c7
            r0 = r43
            java.lang.Object r11 = de.robv.android.xposed.XposedHelpers.getObjectField(r0, r4)     // Catch: java.lang.Throwable -> L2c7
            int r4 = androidx.versionedparcelable.C0040.f40
            int r12 = com.google.android.material.datepicker.C0058.f58
            int r4 = r4 % r12
            r12 = 1747615(0x1aaa9f, float:2.44893E-39)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        L1220:
            java.lang.String r4 = "wP2t3iWpA0TA57WSZ69CSc/7tZJxpUJEwebs3HCmDgra8bHXJaENXsLhr5xMpBY=\n"
            java.lang.String r12 = "rojBsgXKYio=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r12)     // Catch: java.lang.Throwable -> L10b0
            defpackage.ip.m(r4, r10)     // Catch: java.lang.Throwable -> L10b0
            r0 = r10
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L10b0
            r4 = r0
            int r12 = r4.intValue()     // Catch: java.lang.Throwable -> L10b0
            int r4 = androidx.emoji2.text.C0026.f26
            int r16 = androidx.constraintlayout.helper.widget.C0017.f17
            r0 = r16
            r0 = r0 | 1258(0x4ea, float:1.763E-42)
            r16 = r0
            int r4 = r4 + r16
            if (r4 > 0) goto L1255
            r4 = 10
            androidx.constraintlayout.widget.C0020.f20 = r4
            r4 = r53
        L1247:
            java.lang.String r16 = "ۣۧ۟"
            int r16 = androidx.appcompat.widget.C0013.m53(r16)
            r28 = r12
            r70 = r16
            r53 = r4
            goto L7e
        L1255:
            java.lang.String r4 = "ۦۨ۟"
            goto L42a
        L1259:
            java.lang.String r4 = "۠ۡ۠"
            goto L4be
        L125d:
            gn r4 = defpackage.gn.a     // Catch: java.lang.Throwable -> L11a3
            r4.getClass()     // Catch: java.lang.Throwable -> L11a3
            id r12 = defpackage.gn.i     // Catch: java.lang.Throwable -> L11a3
            int r4 = androidx.appcompat.widget.C0013.f13
            int r16 = androidx.recyclerview.widget.C0033.f33
            r0 = r16
            r0 = r0 | 2677(0xa75, float:3.751E-42)
            r16 = r0
            int r4 = r4 + r16
            if (r4 > 0) goto L127a
            r4 = 61
            com.google.android.material.datepicker.C0058.f58 = r4
            java.lang.String r4 = "۟ۢۤ"
            goto L32a
        L127a:
            int r4 = com.ljx.wechatmod.hook.C0066.f66
            int r16 = com.google.android.material.bottomsheet.C0051.f51
            int r4 = r4 + r16
            r16 = 1748477(0x1aadfd, float:2.450138E-39)
            r4 = r4 ^ r16
            r54 = r12
            r70 = r4
            goto L7e
        L128b:
            boolean r4 = r11 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2c7
            if (r4 == 0) goto L743
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2c7
            r4 = r0
            java.lang.String r12 = "ۣۨۡ"
            r16 = r4
        L1297:
            int r4 = android.app.C0001.m5(r12)
            r56 = r16
            r70 = r4
            goto L7e
        L12a1:
            java.lang.String r4 = "ۣ۠ۢ"
            r12 = r26
            goto L199
        L12a7:
            int r4 = com.google.android.material.chip.C0057.f57
            int r12 = com.google.android.material.appbar.C0049.f49
            int r4 = r4 * r12
            r12 = 1771687(0x1b08a7, float:2.482662E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L12b4:
            r0 = r35
            r1 = r55
            r1.b = r0     // Catch: java.lang.Throwable -> L11a3
            int r4 = com.github.megatronking.stringfog.C0047.f47
            int r12 = com.github.megatronking.stringfog.C0048.f48
            r12 = r12 ^ (-7084(0xffffffffffffe454, float:NaN))
            int r4 = r4 % r12
            if (r4 < 0) goto L12cd
            java.lang.String r4 = "ۤۡ۠"
            int r4 = androidx.recyclerview.widget.C0033.m132(r4)
            r70 = r4
            goto L7e
        L12cd:
            java.lang.String r4 = "ۣ۟ۨ"
            int r4 = androidx.activity.C0010.m43(r4)
            r70 = r4
            goto L7e
        L12d7:
            int r4 = androidx.appcompat.widget.C0014.f14
            int r12 = com.google.android.material.datepicker.C0058.f58
            int r12 = r12 + (-7453)
            int r4 = r4 % r12
            if (r4 < 0) goto L12ed
            android.support.v4.graphics.drawable.C0006.m24()
            java.lang.String r4 = "ۡۦ"
            int r4 = android.app.C0002.m8(r4)
            r70 = r4
            goto L7e
        L12ed:
            int r4 = androidx.activity.result.C0009.f9
            int r12 = androidx.appcompat.widget.C0015.f15
            int r4 = r4 - r12
            r12 = 1750595(0x1ab643, float:2.453106E-39)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        L12fa:
            java.lang.String r4 = "fESSfZTqTLt8Xoox1uwNtnNCijHA5g27fV/Tf8HlQfVmSI50lOJCoX5YkD/n/V+8fFY=\n"
            java.lang.String r12 = "EjH+EbSJLdU=\n"
            java.lang.String r4 = defpackage.u40.a(r4, r12)     // Catch: java.lang.Throwable -> L110e
            defpackage.ip.m(r4, r6)     // Catch: java.lang.Throwable -> L110e
            int r4 = androidx.emoji2.text.C0026.f26
            int r12 = defpackage.C0071.f71
            int r12 = r12 % 6008
            int r4 = r4 / r12
            if (r4 < 0) goto L131c
            r4 = 57
            androidx.constraintlayout.helper.widget.C0017.f17 = r4
            java.lang.String r4 = "ۥۢۨ"
            int r4 = kotlinx.coroutines.C0069.m277(r4)
            r70 = r4
            goto L7e
        L131c:
            java.lang.String r4 = "ۡۡۧ"
            int r4 = androidx.activity.result.C0009.m38(r4)
            r70 = r4
            goto L7e
        L1326:
            r31 = 0
            int r4 = com.google.android.material.carousel.C0052.f52
            int r12 = com.google.android.material.carousel.C0055.f55
            int r12 = r12 + 193
            r4 = r4 ^ r12
            if (r4 < 0) goto L133e
            androidx.emoji2.text.C0026.m106()
            java.lang.String r4 = "ۡۨۥ"
            int r4 = androidx.savedstate.C0034.m138(r4)
            r70 = r4
            goto L7e
        L133e:
            java.lang.String r4 = "ۢۡۧ"
            int r4 = com.google.android.material.datepicker.C0059.m239(r4)
            r70 = r4
            goto L7e
        L1348:
            java.lang.String r4 = defpackage.pb0.V0     // Catch: java.lang.Throwable -> L2c7
            r0 = r37
            java.lang.String r4 = r0.optString(r4)     // Catch: java.lang.Throwable -> L2c7
            int r12 = defpackage.C0072.m289()
            if (r12 > 0) goto L1366
            r12 = 38
            android.support.v4.graphics.drawable.C0005.f5 = r12
            java.lang.String r12 = "ۡۦۧ"
            int r12 = androidx.activity.C0010.m43(r12)
            r63 = r4
            r70 = r12
            goto L7e
        L1366:
            java.lang.String r12 = "ۣ۟ۧ"
            int r12 = com.google.android.material.carousel.C0053.m213(r12)
            r63 = r4
            r70 = r12
            goto L7e
        L1372:
            int r4 = androidx.activity.result.C0009.f9
            int r12 = com.google.android.material.bottomsheet.C0051.f51
            int r12 = r12 + (-6334)
            int r4 = r4 % r12
            if (r4 < 0) goto L1389
            r4 = 18
            defpackage.C0071.f71 = r4
            java.lang.String r4 = "ۨۧۧ"
            int r4 = com.google.android.material.theme.C0064.m258(r4)
            r70 = r4
            goto L7e
        L1389:
            int r4 = com.google.android.material.datepicker.C0059.f59
            int r12 = androidx.activity.C0011.f11
            r4 = r4 ^ r12
            r12 = 1750213(0x1ab4c5, float:2.452571E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L1396:
            r4 = 1
            int r12 = androidx.core.content.C0023.f23
            int r16 = androidx.appcompat.app.C0012.f12
            r0 = r16
            int r0 = r0 / (-5282)
            r16 = r0
            r12 = r12 | r16
            if (r12 > 0) goto L13b1
            java.lang.String r12 = "ۣۨ۟"
            int r12 = com.google.android.material.carousel.C0054.m219(r12)
            r70 = r12
            r53 = r4
            goto L7e
        L13b1:
            r12 = r28
            goto L1247
        L13b5:
            r72 = 0
            int r4 = androidx.constraintlayout.widget.C0018.f18
            int r12 = androidx.startup.C0037.f37
            int r4 = r4 % r12
            r12 = 1747162(0x1aa8da, float:2.448295E-39)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        L13c4:
            boolean r12 = defpackage.hs.c(r42)     // Catch: java.lang.Throwable -> L2c7
            r4 = r45
            goto Lc24
        L13cc:
            java.lang.String r4 = " 条下发数据，执行点赞判定..."
            r0 = r60
            r0.append(r4)     // Catch: java.lang.Throwable -> L11a3
            java.lang.String r4 = r60.toString()     // Catch: java.lang.Throwable -> L11a3
            int r12 = com.google.android.material.floatingactionbutton.C0060.f60
            int r16 = android.app.C0001.f1
            r0 = r16
            r0 = r0 ^ (-5446(0xffffffffffffeaba, float:NaN))
            r16 = r0
            r12 = r12 | r16
            if (r12 > 0) goto L13f4
            com.google.android.material.behavior.C0050.m202()
            java.lang.String r12 = "ۧۦۡ"
            int r12 = io.fastkv.C0068.m272(r12)
            r62 = r4
            r70 = r12
            goto L7e
        L13f4:
            int r12 = com.ljx.wechatmod.ui.C0067.f67
            int r16 = androidx.core.content.C0023.f23
            int r12 = r12 % r16
            r16 = -1753472(0xffffffffffe53e80, float:NaN)
            r12 = r12 ^ r16
            r62 = r4
            r70 = r12
            goto L7e
        L1405:
            int r4 = com.google.android.material.theme.C0063.f63
            if (r4 > 0) goto L1413
            r4 = 72
            androidx.profileinstaller.C0030.f30 = r4
            java.lang.String r4 = "ۦ۠ۤ"
            r12 = r55
            goto L227
        L1413:
            int r4 = androidx.core.content.C0024.f24
            int r12 = com.github.megatronking.stringfog.xor.C0046.f46
            int r4 = r4 / r12
            r12 = 1748767(0x1aaf1f, float:2.450545E-39)
            int r4 = r4 + r12
            r70 = r4
            goto L7e
        L1420:
            int r4 = androidx.activity.result.C0009.f9
            int r12 = androidx.activity.result.C0009.f9
            int r4 = r4 / r12
            r12 = 1751648(0x1aba60, float:2.454582E-39)
            r4 = r4 ^ r12
            r19 = r56
            r70 = r4
            goto L7e
        L142f:
            int r4 = com.github.megatronking.stringfog.xor.C0046.f46
            int r12 = androidx.profileinstaller.C0030.f30
            int r12 = r12 * 4098
            r4 = r4 ^ r12
            if (r4 > 0) goto L143f
            java.lang.String r4 = "۠۟ۧ"
            r12 = r4
            r16 = r56
            goto L1297
        L143f:
            int r4 = androidx.profileinstaller.C0030.f30
            int r12 = androidx.constraintlayout.widget.C0020.f20
            int r4 = r4 * r12
            r12 = -1716446(0xffffffffffe5cf22, float:NaN)
            r4 = r4 ^ r12
            r70 = r4
            goto L7e
        L144c:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r14) {
            r13 = this;
            int r0 = r13.a
            switch(r0) {
                case 1: goto L3dc;
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r14)
        L8:
            return
        L9:
            java.lang.String r0 = "zw==\n"
            java.lang.String r1 = "v/tTD73Frj8=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r14)
            java.lang.Object[] r0 = r14.args
            r1 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r1 = 0
            r0 = r0[r1]
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L2df
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
        L25:
            if (r5 == 0) goto L8
            java.lang.String r0 = defpackage.pb0.C0
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L37
            java.lang.String r0 = defpackage.pb0.D0
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8
        L37:
            java.lang.String r0 = "WMFA2h+Lk9xs11f2IYGC2VbQXA==\n"
            java.lang.String r1 = "M6Q5hX7l57U=\n"
            gn r2 = defpackage.gn.a
            boolean r0 = defpackage.z30.q(r0, r1, r2)
            if (r0 == 0) goto L8
            java.lang.Object[] r2 = r14.args
            r0 = 1
            r0 = r2[r0]
            boolean r1 = r0 instanceof android.content.ContentValues
            if (r1 == 0) goto L2e3
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            r4 = r0
        L4f:
            if (r4 == 0) goto L8
            int r0 = r2.length
            r1 = 2
            if (r0 <= r1) goto L2e7
            r0 = 2
            r0 = r2[r0]
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L2e7
            java.lang.String r0 = (java.lang.String) r0
            r1 = r0
        L5f:
            int r0 = r2.length
            r3 = 3
            if (r0 <= r3) goto L2eb
            r0 = 3
            r0 = r2[r0]
            boolean r2 = r0 instanceof java.lang.String[]
            if (r2 == 0) goto L2eb
            java.lang.String[] r0 = (java.lang.String[]) r0
            r2 = r0
        L6d:
            java.lang.String r0 = defpackage.pb0.C0
            boolean r0 = r5.equals(r0)
            java.lang.ClassLoader r7 = r13.b
            if (r0 == 0) goto L395
            java.lang.String r0 = "MNS2mg==\n"
            java.lang.String r3 = "RK3G/wCF85Y=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r3)
            java.lang.Integer r0 = r4.getAsInteger(r0)
            if (r0 == 0) goto L2ef
            int r0 = r0.intValue()
        L89:
            java.lang.String r3 = "CuAlRsjmI04J6g==\n"
            java.lang.String r8 = "eY9QNKuDdzc=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r8)
            java.lang.Integer r3 = r4.getAsInteger(r3)
            java.lang.String r8 = "j5vMN+gzwa+E\n"
            java.lang.String r9 = "4/SvVoR1rc4=\n"
            java.lang.String r8 = defpackage.u40.a(r8, r9)
            java.lang.Integer r8 = r4.getAsInteger(r8)
            r9 = 4
            java.lang.Integer[] r9 = new java.lang.Integer[r9]
            r10 = 0
            r11 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r10] = r11
            r10 = 1
            r11 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r10] = r11
            r10 = 2
            r11 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r10] = r11
            r10 = 3
            r11 = 15
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r10] = r11
            java.util.List r9 = defpackage.bb.f0(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L2f2
            if (r3 == 0) goto L2f2
            int r0 = r3.intValue()
            r3 = r0 ^ (-3)
            r0 = r0 & r3
            if (r0 != 0) goto L2f2
            r0 = 1
        Ldf:
            if (r8 == 0) goto Le9
            int r3 = r8.intValue()
            r8 = 4
            if (r3 != r8) goto Le9
            r0 = 1
        Le9:
            if (r0 == 0) goto L1a8
            java.lang.String r0 = "l25aNJh1B0SUZA==\n"
            java.lang.String r3 = "5AEvRvsQUz0=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r3)
            r4.remove(r0)
            java.lang.String r0 = "KKGWvw==\n"
            java.lang.String r3 = "XNjm2q76NA0=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r3)
            r4.remove(r0)
            java.lang.String r0 = "m3zyiJUDfzKQ\n"
            java.lang.String r3 = "9xOR6flFE1M=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r3)
            r3 = 99
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.put(r0, r3)
            java.lang.String r0 = "4sdVP/GHYg==\n"
            java.lang.String r3 = "gag7S5TpFgw=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r3)
            byte[] r3 = r4.getAsByteArray(r0)
            if (r3 != 0) goto L703
            java.lang.Object r0 = r14.thisObject
            java.lang.String r8 = "Dqu0RCJmV7w=\n"
            java.lang.String r9 = "fMrDFVcDJcU=\n"
            java.lang.String r8 = defpackage.u40.a(r8, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "SELECT content FROM "
            r9.<init>(r10)
            r9.append(r5)
            java.lang.String r10 = " WHERE "
            r9.append(r10)
            r9.append(r1)
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r11 = 0
            java.lang.String r9 = r9.toString()
            r10[r11] = r9
            r9 = 1
            r10[r9] = r2
            java.lang.Object r8 = de.robv.android.xposed.XposedHelpers.callMethod(r0, r8, r10)
            if (r8 == 0) goto L703
            java.lang.String r0 = "y8rMDHfi5UnU1s4=\n"
            java.lang.String r9 = "pqW6aSONoyA=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r9)     // Catch: java.lang.Throwable -> L2f8
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L2f8
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r8, r0, r9)     // Catch: java.lang.Throwable -> L2f8
            java.lang.String r9 = "Wi+dxi1ay05aNYWKb1yKQ1UphYp5VopOWzTcxHhVxgBAI4HPLVLFVFgzn4RPVsVMUTuf\n"
            java.lang.String r10 = "NFrxqg05qiA=\n"
            java.lang.String r9 = defpackage.u40.a(r9, r10)     // Catch: java.lang.Throwable -> L2f8
            defpackage.ip.m(r9, r0)     // Catch: java.lang.Throwable -> L2f8
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2f8
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2f8
            if (r0 == 0) goto L700
            java.lang.String r0 = "bHiYN7K0ug==\n"
            java.lang.String r3 = "Cx3sdd7b2J8=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r3)     // Catch: java.lang.Throwable -> L2f8
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2f8
            r9 = 0
            r3[r9] = r6     // Catch: java.lang.Throwable -> L2f8
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r8, r0, r3)     // Catch: java.lang.Throwable -> L2f8
            boolean r3 = r0 instanceof byte[]     // Catch: java.lang.Throwable -> L2f8
            if (r3 == 0) goto L2f5
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L2f8
        L189:
            java.lang.String r3 = "fOdi49M=\n"
            java.lang.String r9 = "H4sNkLaoaPk=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r9)     // Catch: java.lang.Throwable -> L6fa
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L6fa
            de.robv.android.xposed.XposedHelpers.callMethod(r8, r3, r9)     // Catch: java.lang.Throwable -> L6fa
        L197:
            if (r0 == 0) goto L1a8
            java.lang.String r3 = "1CTppqm3Jw==\n"
            java.lang.String r8 = "t0uH0szZU74=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r8)
            byte[] r0 = defpackage.vh.k(r0, r7)
            r4.put(r3, r0)
        L1a8:
            java.lang.Object r0 = r14.thisObject
            java.lang.String r3 = "eK1akuB2AJdvsQ==\n"
            java.lang.String r8 = "DMUz4a8UavI=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r8)
            defpackage.ip.n(r3, r0)
            java.lang.String r3 = "BPHdU7eauA==\n"
            java.lang.String r8 = "ZYWpIfXv3hA=\n"
            java.lang.String r3 = defpackage.u40.a(r3, r8)
            byte[] r3 = r4.getAsByteArray(r3)
            if (r3 == 0) goto L8
            java.lang.String r8 = "AOvSeZGItb8=\n"
            java.lang.String r9 = "coqlKOTtx8Y=\n"
            java.lang.String r8 = defpackage.u40.a(r8, r9)     // Catch: java.lang.Throwable -> L31b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31b
            java.lang.String r10 = "SELECT attrBuf FROM "
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L31b
            r9.append(r5)     // Catch: java.lang.Throwable -> L31b
            java.lang.String r5 = " WHERE "
            r9.append(r5)     // Catch: java.lang.Throwable -> L31b
            r9.append(r1)     // Catch: java.lang.Throwable -> L31b
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L31b
            r5 = 0
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L31b
            r1[r5] = r9     // Catch: java.lang.Throwable -> L31b
            r5 = 1
            r1[r5] = r2     // Catch: java.lang.Throwable -> L31b
            java.lang.Object r1 = de.robv.android.xposed.XposedHelpers.callMethod(r0, r8, r1)     // Catch: java.lang.Throwable -> L31b
            if (r1 == 0) goto L331
            java.lang.String r0 = "xD42qsrJZkXbIjQ=\n"
            java.lang.String r2 = "qVFAz56mICw=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)     // Catch: java.lang.Throwable -> L30b
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L30b
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r2)     // Catch: java.lang.Throwable -> L30b
            java.lang.String r2 = "KZpva0VXCV8pgHcnB1FIUiacdycRW0hfKIEuaRBYBBEzlnNiRV8HRSuGbSknWwddIo5t\n"
            java.lang.String r5 = "R+8DB2U0aDE=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r5)     // Catch: java.lang.Throwable -> L30b
            defpackage.ip.m(r2, r0)     // Catch: java.lang.Throwable -> L30b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L30b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L30b
            if (r0 == 0) goto L308
            java.lang.String r0 = "lkWnBUvzqA==\n"
            java.lang.String r2 = "8SDTRyecymM=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)     // Catch: java.lang.Throwable -> L30b
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L30b
            r5 = 0
            r2[r5] = r6     // Catch: java.lang.Throwable -> L30b
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r2)     // Catch: java.lang.Throwable -> L30b
            boolean r2 = r0 instanceof byte[]     // Catch: java.lang.Throwable -> L30b
            if (r2 == 0) goto L308
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L30b
        L22a:
            java.lang.String r2 = "LEAGuxM=\n"
            java.lang.String r5 = "TyxpyHbeSvI=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r5)     // Catch: java.lang.Throwable -> L6f4
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L6f4
            de.robv.android.xposed.XposedHelpers.callMethod(r1, r2, r5)     // Catch: java.lang.Throwable -> L6f4
        L238:
            if (r0 == 0) goto L8
            java.lang.String r1 = defpackage.pb0.j1     // Catch: java.lang.Throwable -> L31b
            java.lang.Class r1 = de.robv.android.xposed.XposedHelpers.findClass(r1, r7)     // Catch: java.lang.Throwable -> L31b
            java.lang.Object r2 = r1.newInstance()     // Catch: java.lang.Throwable -> L31b
            java.lang.String r5 = defpackage.pb0.h1     // Catch: java.lang.Throwable -> L31b
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L31b
            r7 = 0
            r6[r7] = r0     // Catch: java.lang.Throwable -> L31b
            de.robv.android.xposed.XposedHelpers.callMethod(r2, r5, r6)     // Catch: java.lang.Throwable -> L31b
            java.lang.Object r5 = r1.newInstance()     // Catch: java.lang.Throwable -> L31b
            java.lang.String r0 = defpackage.pb0.h1     // Catch: java.lang.Throwable -> L31b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L31b
            r6 = 0
            r1[r6] = r3     // Catch: java.lang.Throwable -> L31b
            de.robv.android.xposed.XposedHelpers.callMethod(r5, r0, r1)     // Catch: java.lang.Throwable -> L31b
            java.lang.String r0 = defpackage.pb0.k1     // Catch: java.lang.Throwable -> L31b
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.getObjectField(r2, r0)     // Catch: java.lang.Throwable -> L31b
            boolean r1 = r0 instanceof java.util.LinkedList     // Catch: java.lang.Throwable -> L31b
            if (r1 == 0) goto L334
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Throwable -> L31b
            r2 = r0
        L26b:
            if (r2 == 0) goto L8
            java.lang.String r0 = defpackage.pb0.k1     // Catch: java.lang.Throwable -> L31b
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.getObjectField(r5, r0)     // Catch: java.lang.Throwable -> L31b
            boolean r1 = r0 instanceof java.util.LinkedList     // Catch: java.lang.Throwable -> L31b
            if (r1 == 0) goto L338
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Throwable -> L31b
            r1 = r0
        L27a:
            if (r1 == 0) goto L8
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L31b
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L31b
            if (r0 <= r3) goto L8
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L31b
            java.lang.String r0 = "rI7G45G5xR/t1I2/2Q==\n"
            java.lang.String r3 = "xfqjkfDNqm0=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r3)     // Catch: java.lang.Throwable -> L31b
            defpackage.ip.n(r0, r2)     // Catch: java.lang.Throwable -> L31b
        L295:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L31b
            if (r0 == 0) goto L372
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L31b
            java.lang.String r0 = "wxmFbt5MkryE\n"
            java.lang.String r6 = "rXz9GvZivJI=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r6)     // Catch: java.lang.Throwable -> L31b
            defpackage.ip.n(r0, r3)     // Catch: java.lang.Throwable -> L31b
            java.lang.String r0 = defpackage.pb0.m1     // Catch: java.lang.Throwable -> L31b
            int r0 = de.robv.android.xposed.XposedHelpers.getIntField(r3, r0)     // Catch: java.lang.Throwable -> L31b
            java.util.Iterator r6 = r1.iterator()     // Catch: java.lang.Throwable -> L31b
            java.lang.String r7 = "k0tleDXmoVjSES4kfQ==\n"
            java.lang.String r8 = "+j8AClSSzio=\n"
            java.lang.String r7 = defpackage.u40.a(r7, r8)     // Catch: java.lang.Throwable -> L31b
            defpackage.ip.n(r7, r6)     // Catch: java.lang.Throwable -> L31b
        L2bf:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L31b
            if (r7 == 0) goto L33c
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L31b
            java.lang.String r8 = "Y8e9ikmYq6Mk\n"
            java.lang.String r9 = "DaLF/mG2hY0=\n"
            java.lang.String r8 = defpackage.u40.a(r8, r9)     // Catch: java.lang.Throwable -> L31b
            defpackage.ip.n(r8, r7)     // Catch: java.lang.Throwable -> L31b
            java.lang.String r8 = defpackage.pb0.m1     // Catch: java.lang.Throwable -> L31b
            int r7 = de.robv.android.xposed.XposedHelpers.getIntField(r7, r8)     // Catch: java.lang.Throwable -> L31b
            if (r0 != r7) goto L2bf
            if (r0 == 0) goto L2bf
            goto L295
        L2df:
            r0 = 0
            r5 = r0
            goto L25
        L2e3:
            r0 = 0
            r4 = r0
            goto L4f
        L2e7:
            r0 = 0
            r1 = r0
            goto L5f
        L2eb:
            r0 = 0
            r2 = r0
            goto L6d
        L2ef:
            r0 = 0
            goto L89
        L2f2:
            r0 = 0
            goto Ldf
        L2f5:
            r0 = 0
            goto L189
        L2f8:
            r0 = move-exception
            java.lang.String r1 = "LU2wCwo=\n"
            java.lang.String r2 = "TiHfeG+ny74=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)     // Catch: java.lang.Throwable -> L6f7
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6f7
            de.robv.android.xposed.XposedHelpers.callMethod(r8, r1, r2)     // Catch: java.lang.Throwable -> L6f7
        L307:
            throw r0
        L308:
            r0 = 0
            goto L22a
        L30b:
            r0 = move-exception
            java.lang.String r2 = "Sm9VDMo=\n"
            java.lang.String r3 = "KQM6f683Uvs=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)     // Catch: java.lang.Throwable -> L6f1
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6f1
            de.robv.android.xposed.XposedHelpers.callMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L6f1
        L31a:
            throw r0     // Catch: java.lang.Throwable -> L31b
        L31b:
            r0 = move-exception
            java.lang.String r0 = "Nwje\n"
            java.lang.String r1 = "Q2m5jaPP2Zc=\n"
            java.lang.String r2 = "Lt/r/CusLKIU1/79KqUo\n"
            java.lang.String r3 = "fbGYtUXKQ+Y=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)
            java.lang.String r3 = "Fg==\n"
            java.lang.String r4 = "c8HJlSTQVfc=\n"
            defpackage.z30.o(r0, r1, r2, r3, r4)
            goto L8
        L331:
            r0 = 0
            goto L238
        L334:
            r0 = 0
            r2 = r0
            goto L26b
        L338:
            r0 = 0
            r1 = r0
            goto L27a
        L33c:
            java.lang.String r0 = defpackage.pb0.l1     // Catch: java.lang.Throwable -> L31b
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.getObjectField(r3, r0)     // Catch: java.lang.Throwable -> L31b
            boolean r6 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L31b
            if (r6 == 0) goto L370
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L31b
        L348:
            if (r0 != 0) goto L34c
            java.lang.String r0 = ""
        L34c:
            java.lang.String r6 = defpackage.pb0.e1     // Catch: java.lang.Throwable -> L31b
            r7 = 0
            boolean r6 = defpackage.b50.N(r0, r6, r7)     // Catch: java.lang.Throwable -> L31b
            if (r6 != 0) goto L36b
            java.lang.String r6 = defpackage.pb0.l1     // Catch: java.lang.Throwable -> L31b
            java.lang.String r7 = defpackage.pb0.e1     // Catch: java.lang.Throwable -> L31b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31b
            r8.<init>()     // Catch: java.lang.Throwable -> L31b
            r8.append(r7)     // Catch: java.lang.Throwable -> L31b
            r8.append(r0)     // Catch: java.lang.Throwable -> L31b
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L31b
            de.robv.android.xposed.XposedHelpers.setObjectField(r3, r6, r0)     // Catch: java.lang.Throwable -> L31b
        L36b:
            r1.add(r3)     // Catch: java.lang.Throwable -> L31b
            goto L295
        L370:
            r0 = 0
            goto L348
        L372:
            java.lang.String r0 = defpackage.pb0.i1     // Catch: java.lang.Throwable -> L31b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L31b
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r5, r0, r1)     // Catch: java.lang.Throwable -> L31b
            java.lang.String r1 = "2/rZIww+/d/b4MFvTji80tT8wW9YMrzf2uGYIVkx8JHB9sUqDDbzxdnm22FuJOjU9P3HLlU=\n"
            java.lang.String r2 = "tY+1TyxdnLE=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)     // Catch: java.lang.Throwable -> L31b
            defpackage.ip.m(r1, r0)     // Catch: java.lang.Throwable -> L31b
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L31b
            java.lang.String r1 = "3Fm6JO5lsg==\n"
            java.lang.String r2 = "vS3OVqwQ1Ps=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)     // Catch: java.lang.Throwable -> L31b
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L31b
            goto L8
        L395:
            java.lang.String r0 = defpackage.pb0.D0
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8
            java.lang.String r0 = "GsaEsC4oVAgVyI4=\n"
            java.lang.String r1 = "eanp3UtGIG4=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            java.lang.Integer r0 = r4.getAsInteger(r0)
            if (r0 == 0) goto L8
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L8
            java.lang.String r0 = "pjZGMj09crCpOEw=\n"
            java.lang.String r1 = "xVkrX1hTBtY=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            r4.put(r0, r6)
            java.lang.String r0 = "IO+/zmSjTF4t2Ljp\n"
            java.lang.String r1 = "Q5rNjwfXJTE=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            byte[] r0 = r4.getAsByteArray(r0)
            if (r0 == 0) goto L8
            java.lang.String r1 = "eHNexxlqzsV1RFng\n"
            java.lang.String r2 = "GwYshnoep6o=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            byte[] r0 = defpackage.vh.e(r0, r7)
            r4.put(r1, r0)
            goto L8
        L3dc:
            r0 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "7Q==\n"
            java.lang.String r1 = "nYJhS8SV1P0=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r14)
            java.lang.Object[] r0 = r14.args
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r1 = 0
            r0 = r0[r1]
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L552
            java.lang.String r0 = (java.lang.String) r0
            r2 = r0
        L3fd:
            if (r2 == 0) goto L8
            java.lang.String r0 = defpackage.pb0.C0
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L40f
            java.lang.String r0 = defpackage.pb0.D0
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L8
        L40f:
            java.lang.String r0 = "9C/uQ1Z5KiPAOflvaHM7Jvo+8g==\n"
            java.lang.String r1 = "n0qXHDcXXko=\n"
            gn r5 = defpackage.gn.a
            boolean r0 = defpackage.z30.q(r0, r1, r5)
            if (r0 == 0) goto L8
            java.lang.Object r5 = r14.thisObject
            java.lang.Object[] r6 = r14.args
            r0 = 1
            r0 = r6[r0]
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L556
            java.lang.String r0 = (java.lang.String) r0
        L428:
            if (r0 != 0) goto L6fd
            java.lang.String r0 = ""
            r1 = r0
        L42d:
            r0 = 2
            r0 = r6[r0]
            boolean r6 = r0 instanceof java.lang.String[]
            if (r6 == 0) goto L559
            java.lang.String[] r0 = (java.lang.String[]) r0
        L436:
            if (r0 == 0) goto L8
            java.lang.String r6 = defpackage.pb0.C0
            boolean r6 = r2.equals(r6)
            java.lang.ClassLoader r7 = r13.b
            if (r6 == 0) goto L59b
            java.lang.String r6 = "gnnAr1Ps/hg=\n"
            java.lang.String r8 = "8Bi3/iaJjGE=\n"
            java.lang.String r6 = defpackage.u40.a(r6, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "SELECT rowid, content FROM "
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r9 = " WHERE "
            r8.append(r9)
            r8.append(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r9 = 0
            java.lang.String r8 = r8.toString()
            r1[r9] = r8
            r8 = 1
            r1[r8] = r0
            java.lang.Object r1 = de.robv.android.xposed.XposedHelpers.callMethod(r5, r6, r1)
            if (r1 == 0) goto L54d
            java.lang.String r0 = "5qb4Yu4krD35uvo=\n"
            java.lang.String r6 = "i8mOB7pL6lQ=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r6)     // Catch: java.lang.Throwable -> L55f
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L55f
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r6)     // Catch: java.lang.Throwable -> L55f
            java.lang.String r6 = "c2AFH7H8gQhzeh1T8/rABXxmHVPl8MAIcntEHeTzjEZpbBkWsfSPEnF8B13T8I8KeHQH\n"
            java.lang.String r8 = "HRVpc5Gf4GY=\n"
            java.lang.String r6 = defpackage.u40.a(r6, r8)     // Catch: java.lang.Throwable -> L55f
            defpackage.ip.m(r6, r0)     // Catch: java.lang.Throwable -> L55f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L55f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L55f
            if (r0 == 0) goto L53f
        L491:
            java.lang.String r0 = "ONFxd1RJiQ==\n"
            java.lang.String r6 = "X7QFOzsn7gM=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r6)     // Catch: java.lang.Throwable -> L55f
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L55f
            r8 = 0
            r6[r8] = r4     // Catch: java.lang.Throwable -> L55f
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r6)     // Catch: java.lang.Throwable -> L55f
            java.lang.String r6 = "zY5tgUk4PEjNlHXNCz59RcKIdc0dNH1IzJUsgxw3MQbXgnGISTAyUs+Sb8MlNDNB\n"
            java.lang.String r8 = "o/sB7WlbXSY=\n"
            java.lang.String r6 = defpackage.u40.a(r6, r8)     // Catch: java.lang.Throwable -> L55f
            defpackage.ip.m(r6, r0)     // Catch: java.lang.Throwable -> L55f
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L55f
            long r8 = r0.longValue()     // Catch: java.lang.Throwable -> L55f
            java.lang.String r0 = "N+JiDCGq5A==\n"
            java.lang.String r6 = "UIcWTk3FhrI=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r6)     // Catch: java.lang.Throwable -> L55f
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L55f
            r10 = 0
            r6[r10] = r3     // Catch: java.lang.Throwable -> L55f
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r6)     // Catch: java.lang.Throwable -> L55f
            boolean r6 = r0 instanceof byte[]     // Catch: java.lang.Throwable -> L55f
            if (r6 == 0) goto L55c
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L55f
        L4cc:
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L55f
            r6.<init>()     // Catch: java.lang.Throwable -> L55f
            java.lang.String r10 = "whkEYwdRuA==\n"
            java.lang.String r11 = "oXZqF2I/zPk=\n"
            java.lang.String r10 = defpackage.u40.a(r10, r11)     // Catch: java.lang.Throwable -> L55f
            byte[] r0 = defpackage.vh.k(r0, r7)     // Catch: java.lang.Throwable -> L55f
            r6.put(r10, r0)     // Catch: java.lang.Throwable -> L55f
            java.lang.String r0 = "H+0AcwxWZn8U\n"
            java.lang.String r10 = "c4JjEmAQCh4=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r10)     // Catch: java.lang.Throwable -> L55f
            r10 = 99
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L55f
            r6.put(r0, r10)     // Catch: java.lang.Throwable -> L55f
            java.lang.String r0 = "ctsHIA1I\n"
            java.lang.String r10 = "B6tjQXktqDE=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r10)     // Catch: java.lang.Throwable -> L55f
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L55f
            r11 = 0
            r10[r11] = r2     // Catch: java.lang.Throwable -> L55f
            r11 = 1
            r10[r11] = r6     // Catch: java.lang.Throwable -> L55f
            r6 = 2
            java.lang.String r11 = "B8PCe96JyQ==\n"
            java.lang.String r12 = "day1Erq09iw=\n"
            java.lang.String r11 = defpackage.u40.a(r11, r12)     // Catch: java.lang.Throwable -> L55f
            r10[r6] = r11     // Catch: java.lang.Throwable -> L55f
            r6 = 3
            r11 = 1
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L55f
            r12 = 0
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L55f
            r11[r12] = r8     // Catch: java.lang.Throwable -> L55f
            r10[r6] = r11     // Catch: java.lang.Throwable -> L55f
            de.robv.android.xposed.XposedHelpers.callMethod(r5, r0, r10)     // Catch: java.lang.Throwable -> L55f
            java.lang.String r0 = "jpKaD7gdktqbiQ==\n"
            java.lang.String r6 = "4/3sauxy3L8=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r6)     // Catch: java.lang.Throwable -> L55f
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L55f
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r6)     // Catch: java.lang.Throwable -> L55f
            java.lang.String r6 = "oYB89ShAKtGhmmS5akZr3K6GZLl8TGvRoJs9931PJ5+7jGD8KEgky6OcfrdKTCTTqpR+\n"
            java.lang.String r8 = "z/UQmQgjS78=\n"
            java.lang.String r6 = defpackage.u40.a(r6, r8)     // Catch: java.lang.Throwable -> L55f
            defpackage.ip.m(r6, r0)     // Catch: java.lang.Throwable -> L55f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L55f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L55f
            if (r0 != 0) goto L491
        L53f:
            java.lang.String r0 = "ju+UZ8c=\n"
            java.lang.String r2 = "7YP7FKLC508=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)     // Catch: java.lang.Throwable -> L589
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L589
            de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r2)     // Catch: java.lang.Throwable -> L589
        L54d:
            r14.setResult(r3)
            goto L8
        L552:
            r0 = 0
            r2 = r0
            goto L3fd
        L556:
            r0 = 0
            goto L428
        L559:
            r0 = 0
            goto L436
        L55c:
            r0 = 0
            goto L4cc
        L55f:
            r0 = move-exception
            java.lang.String r0 = "M7W/+EKPefkFkqLaSKtz4gs=\n"
            java.lang.String r2 = "YNvMvCfjHI0=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)     // Catch: java.lang.Throwable -> L58b
            java.lang.String r2 = "Nwje\n"
            java.lang.String r4 = "Q2m5jaPP2Zc=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r4)     // Catch: java.lang.Throwable -> L58b
            defpackage.ip.o(r2, r0)     // Catch: java.lang.Throwable -> L58b
            java.lang.String r0 = "Fg==\n"
            java.lang.String r2 = "c8HJlSTQVfc=\n"
            defpackage.u40.a(r0, r2)     // Catch: java.lang.Throwable -> L58b
            java.lang.String r0 = "9C1L4gw=\n"
            java.lang.String r2 = "l0EkkWkia/s=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)     // Catch: java.lang.Throwable -> L589
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L589
            de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r2)     // Catch: java.lang.Throwable -> L589
            goto L54d
        L589:
            r0 = move-exception
            goto L54d
        L58b:
            r0 = move-exception
            java.lang.String r2 = "NqLllNQ=\n"
            java.lang.String r3 = "Vc6K57GC4FE=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)     // Catch: java.lang.Throwable -> L6ee
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6ee
            de.robv.android.xposed.XposedHelpers.callMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L6ee
        L59a:
            throw r0
        L59b:
            java.lang.String r6 = defpackage.pb0.D0
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L8
            java.lang.String r6 = "qtu0Sty0CTI=\n"
            java.lang.String r8 = "2LrDG6nRe0s=\n"
            java.lang.String r6 = defpackage.u40.a(r6, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "SELECT rowid, curActionBuf FROM "
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r9 = " WHERE "
            r8.append(r9)
            r8.append(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r9 = 0
            java.lang.String r8 = r8.toString()
            r1[r9] = r8
            r8 = 1
            r1[r8] = r0
            java.lang.Object r1 = de.robv.android.xposed.XposedHelpers.callMethod(r5, r6, r1)
            if (r1 == 0) goto L6a8
            java.lang.String r0 = "REj0Bu6Oca5bVPY=\n"
            java.lang.String r6 = "KSeCY7rhN8c=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r6)     // Catch: java.lang.Throwable -> L6b0
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L6b0
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r6)     // Catch: java.lang.Throwable -> L6b0
            java.lang.String r6 = "/goWt7ldP6L+EA77+1t+r/EMDvvtUX6i/xFXtexSMuzkBgq+uVUxuPwWFPXbUTGg9R4U\n"
            java.lang.String r8 = "kH9625k+Xsw=\n"
            java.lang.String r6 = defpackage.u40.a(r6, r8)     // Catch: java.lang.Throwable -> L6b0
            defpackage.ip.m(r6, r0)     // Catch: java.lang.Throwable -> L6b0
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6b0
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6b0
            if (r0 == 0) goto L69a
        L5f2:
            java.lang.String r0 = "Hp+XV8DY+w==\n"
            java.lang.String r6 = "efrjG6+2nDo=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r6)     // Catch: java.lang.Throwable -> L6b0
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L6b0
            r8 = 0
            r6[r8] = r4     // Catch: java.lang.Throwable -> L6b0
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r6)     // Catch: java.lang.Throwable -> L6b0
            java.lang.String r6 = "6qra9yz68XHqsMK7bvywfOWswrt49rBx67Gb9Xn1/D/wpsb+LPL/a+i22LVA9v54\n"
            java.lang.String r8 = "hN+2mwyZkB8=\n"
            java.lang.String r6 = defpackage.u40.a(r6, r8)     // Catch: java.lang.Throwable -> L6b0
            defpackage.ip.m(r6, r0)     // Catch: java.lang.Throwable -> L6b0
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L6b0
            long r8 = r0.longValue()     // Catch: java.lang.Throwable -> L6b0
            java.lang.String r0 = "cP0gDfgBYg==\n"
            java.lang.String r6 = "F5hUT5RuAKo=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r6)     // Catch: java.lang.Throwable -> L6b0
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L6b0
            r10 = 0
            r6[r10] = r3     // Catch: java.lang.Throwable -> L6b0
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r6)     // Catch: java.lang.Throwable -> L6b0
            boolean r6 = r0 instanceof byte[]     // Catch: java.lang.Throwable -> L6b0
            if (r6 == 0) goto L6ad
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L6b0
        L62d:
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6b0
            r6.<init>()     // Catch: java.lang.Throwable -> L6b0
            java.lang.String r10 = "QDip7IRa0ohND67L\n"
            java.lang.String r11 = "I03brecuu+c=\n"
            java.lang.String r10 = defpackage.u40.a(r10, r11)     // Catch: java.lang.Throwable -> L6b0
            byte[] r0 = defpackage.vh.e(r0, r7)     // Catch: java.lang.Throwable -> L6b0
            r6.put(r10, r0)     // Catch: java.lang.Throwable -> L6b0
            java.lang.String r0 = "a0TSixLuNttkStg=\n"
            java.lang.String r10 = "CCu/5neAQr0=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r10)     // Catch: java.lang.Throwable -> L6b0
            r6.put(r0, r4)     // Catch: java.lang.Throwable -> L6b0
            java.lang.String r0 = "xgaX8xSJ\n"
            java.lang.String r10 = "s3bzkmDsy7c=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r10)     // Catch: java.lang.Throwable -> L6b0
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L6b0
            r11 = 0
            r10[r11] = r2     // Catch: java.lang.Throwable -> L6b0
            r11 = 1
            r10[r11] = r6     // Catch: java.lang.Throwable -> L6b0
            r6 = 2
            java.lang.String r11 = "oG7x7PTtnQ==\n"
            java.lang.String r12 = "0gGGhZDQolE=\n"
            java.lang.String r11 = defpackage.u40.a(r11, r12)     // Catch: java.lang.Throwable -> L6b0
            r10[r6] = r11     // Catch: java.lang.Throwable -> L6b0
            r6 = 3
            r11 = 1
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L6b0
            r12 = 0
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L6b0
            r11[r12] = r8     // Catch: java.lang.Throwable -> L6b0
            r10[r6] = r11     // Catch: java.lang.Throwable -> L6b0
            de.robv.android.xposed.XposedHelpers.callMethod(r5, r0, r10)     // Catch: java.lang.Throwable -> L6b0
            java.lang.String r0 = "5o8eHzPH4dvzlA==\n"
            java.lang.String r6 = "i+Boemeor74=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r6)     // Catch: java.lang.Throwable -> L6b0
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L6b0
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r6)     // Catch: java.lang.Throwable -> L6b0
            java.lang.String r6 = "MSBmzRnuGiExOn6BW+hbLD4mfoFN4lshMDsnz0zhF28rLHrEGeYUOzM8ZI974hQjOjRk\n"
            java.lang.String r8 = "X1UKoTmNe08=\n"
            java.lang.String r6 = defpackage.u40.a(r6, r8)     // Catch: java.lang.Throwable -> L6b0
            defpackage.ip.m(r6, r0)     // Catch: java.lang.Throwable -> L6b0
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6b0
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6b0
            if (r0 != 0) goto L5f2
        L69a:
            java.lang.String r0 = "5kmjsFc=\n"
            java.lang.String r2 = "hSXMwzJkxhc=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)     // Catch: java.lang.Throwable -> L6da
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6da
            de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r2)     // Catch: java.lang.Throwable -> L6da
        L6a8:
            r14.setResult(r3)
            goto L8
        L6ad:
            r0 = 0
            goto L62d
        L6b0:
            r0 = move-exception
            java.lang.String r0 = "Dpp+B3GF+ug4t2IueYzx6BWbYig=\n"
            java.lang.String r2 = "XfQNQxTpn5w=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)     // Catch: java.lang.Throwable -> L6dc
            java.lang.String r2 = "Nwje\n"
            java.lang.String r4 = "Q2m5jaPP2Zc=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r4)     // Catch: java.lang.Throwable -> L6dc
            defpackage.ip.o(r2, r0)     // Catch: java.lang.Throwable -> L6dc
            java.lang.String r0 = "Fg==\n"
            java.lang.String r2 = "c8HJlSTQVfc=\n"
            defpackage.u40.a(r0, r2)     // Catch: java.lang.Throwable -> L6dc
            java.lang.String r0 = "UUh751c=\n"
            java.lang.String r2 = "MiQUlDJiWxE=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)     // Catch: java.lang.Throwable -> L6da
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6da
            de.robv.android.xposed.XposedHelpers.callMethod(r1, r0, r2)     // Catch: java.lang.Throwable -> L6da
            goto L6a8
        L6da:
            r0 = move-exception
            goto L6a8
        L6dc:
            r0 = move-exception
            java.lang.String r2 = "ehoov3c=\n"
            java.lang.String r3 = "GXZHzBJqRl8=\n"
            java.lang.String r2 = defpackage.u40.a(r2, r3)     // Catch: java.lang.Throwable -> L6ec
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6ec
            de.robv.android.xposed.XposedHelpers.callMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L6ec
        L6eb:
            throw r0
        L6ec:
            r1 = move-exception
            goto L6eb
        L6ee:
            r1 = move-exception
            goto L59a
        L6f1:
            r1 = move-exception
            goto L31a
        L6f4:
            r1 = move-exception
            goto L238
        L6f7:
            r1 = move-exception
            goto L307
        L6fa:
            r3 = move-exception
            goto L197
        L6fd:
            r1 = r0
            goto L42d
        L700:
            r0 = r3
            goto L189
        L703:
            r0 = r3
            goto L197
    }
}
