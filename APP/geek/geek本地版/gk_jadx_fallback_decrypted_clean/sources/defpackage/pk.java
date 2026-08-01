package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pk extends android.view.View {
    public final java.lang.String a;
    public boolean b;
    public final android.graphics.Paint c;
    public final defpackage.on d;

    public pk(defpackage.on r5, android.content.Context r6, java.lang.String r7) {
            r4 = this;
            java.lang.String r0 = "tq010jqorw==\n"
            java.lang.String r1 = "1cJbpl/Q2zY=\n"
            java.lang.String r0 = "context"
            defpackage.ip.o(r0, r6)
            java.lang.String r0 = "eTgDPoEvwqY=\n"
            java.lang.String r1 = "EV17fe5DrdQ=\n"
            java.lang.String r0 = "hexColor"
            defpackage.ip.o(r0, r7)
            r4.d = r5
            r4.<init>(r6)
            r2 = 0
            java.lang.String r0 = "ۤۦۦ"
            int r0 = androidx.versionedparcelable.C0040.m160(r0)
        L23:
            switch(r0) {
                case 56540: goto L27;
                case 1747653: goto L6c;
                case 1747865: goto L62;
                case 1747901: goto L93;
                case 1751559: goto L40;
                case 1751716: goto Lc3;
                case 1753476: goto Lab;
                case 1753509: goto Ld4;
                default: goto L26;
            }
        L26:
            goto L23
        L27:
            java.lang.String r0 = "NZHSPM5PiX6jcV79BILvWfupX"
            java.lang.String r0 = com.ljx.wechatmod.ui.C0067.m268(r0)
            double r2 = java.lang.Double.parseDouble(r0)
            int r0 = android.app.C0001.f1
            if (r0 < 0) goto L8c
            r0 = 33
            android.support.v4.graphics.drawable.C0004.f4 = r0
            java.lang.String r0 = "ۤۡۤ"
            int r0 = androidx.savedstate.C0035.m140(r0)
            goto L23
        L40:
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r4.c = r0
            int r0 = androidx.activity.C0011.f11
            int r1 = android.support.v4.graphics.drawable.C0006.f6
            int r1 = r1 + (-3450)
            int r0 = r0 % r1
            if (r0 < 0) goto L5b
            androidx.constraintlayout.helper.widget.C0017.m71()
            java.lang.String r0 = "ۤۦۦ"
            int r0 = androidx.lifecycle.C0029.m116(r0)
            goto L23
        L5b:
            java.lang.String r0 = "ۦۡ۟"
            int r0 = com.google.android.material.datepicker.C0058.m234(r0)
            goto L23
        L62:
            int r0 = androidx.profileinstaller.C0030.f30
            int r1 = com.google.android.material.behavior.C0050.f50
            r0 = r0 ^ r1
            r1 = 1751535(0x1ab9ef, float:2.454423E-39)
            int r0 = r0 + r1
            goto L23
        L6c:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r2)
            int r0 = kotlinx.coroutines.C0070.m280()
            if (r0 < 0) goto L82
            r0 = 36
            androidx.versionedparcelable.C0040.f40 = r0
        L7b:
            java.lang.String r0 = "ۣۧ"
            int r0 = defpackage.C0073.m292(r0)
            goto L23
        L82:
            int r0 = android.support.v4.graphics.drawable.C0005.f5
            int r1 = androidx.savedstate.C0035.f35
            int r0 = r0 * r1
            r1 = 1686411(0x19bb8b, float:2.363165E-39)
            int r0 = r0 + r1
            goto L23
        L8c:
            java.lang.String r0 = "۠۟ۤ"
            int r0 = com.google.android.material.behavior.C0050.m203(r0)
            goto L23
        L93:
            int r0 = kotlinx.coroutines.C0069.m276()
            if (r0 < 0) goto La0
            java.lang.String r0 = "ۥۣۨ"
            int r0 = androidx.viewpager2.adapter.C0043.m173(r0)
            goto L23
        La0:
            int r0 = com.google.android.material.theme.C0062.f62
            int r1 = androidx.activity.result.C0008.f8
            int r0 = r0 - r1
            r1 = 1753555(0x1ac1d3, float:2.457254E-39)
            int r0 = r0 + r1
            goto L23
        Lab:
            int r0 = androidx.versionedparcelable.C0039.m157()
            if (r0 < 0) goto L93
            int r0 = com.google.android.material.carousel.C0053.m214()
            if (r0 > 0) goto L7b
            r0 = 73
            com.google.android.material.theme.C0064.f64 = r0
            java.lang.String r0 = "۠ۦ۟"
            int r0 = com.google.android.material.bottomsheet.C0051.m207(r0)
            goto L23
        Lc3:
            r4.a = r7
            int r0 = com.google.android.material.carousel.C0052.f52
            if (r0 > 0) goto Ld1
            java.lang.String r0 = "ۦۡ۟"
        Lcb:
            int r0 = com.google.android.material.theme.C0064.m258(r0)
            goto L23
        Ld1:
            java.lang.String r0 = "ۤۡۤ"
            goto Lcb
        Ld4:
            return
    }

    public final java.lang.String getHexColor() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r37) {
            r36 = this;
            r34 = 0
            r35 = 0
            r6 = 0
            r13 = 0
            r17 = 0
            r12 = 0
            r27 = 0
            r24 = 0
            r23 = 0
            r10 = 0
            r25 = 0
            r22 = 0
            r26 = 0
            r15 = 0
            r19 = 0
            r21 = 0
            r28 = 0
            r9 = 0
            r18 = 0
            r8 = 0
            r11 = 0
            r20 = 0
            r5 = 0
            r14 = 0
            r16 = 0
            r7 = 0
            java.lang.String r29 = "ۣۡۤ"
            int r33 = kotlinx.coroutines.C0069.m277(r29)
            r29 = r7
            r30 = r15
            r31 = r16
            r32 = r26
        L37:
            switch(r33) {
                case 56297: goto L3b;
                case 56328: goto L227;
                case 56353: goto L16d;
                case 56389: goto L3bc;
                case 56421: goto L8c;
                case 56447: goto L4d;
                case 56452: goto L358;
                case 56508: goto L37b;
                case 56572: goto L154;
                case 1746688: goto L62c;
                case 1746691: goto L4c3;
                case 1746844: goto Lf7;
                case 1746845: goto L4fa;
                case 1746878: goto L2a0;
                case 1747648: goto L42a;
                case 1747685: goto L1d9;
                case 1747772: goto L317;
                case 1747842: goto L11a;
                case 1747873: goto L2a0;
                case 1747874: goto L679;
                case 1747899: goto L602;
                case 1747902: goto L267;
                case 1748641: goto L2ee;
                case 1748677: goto L5d5;
                case 1748678: goto L4b6;
                case 1748739: goto L540;
                case 1748768: goto Lbb;
                case 1748804: goto L628;
                case 1749634: goto L1dc;
                case 1749701: goto L398;
                case 1749726: goto L1dc;
                case 1749761: goto L3e0;
                case 1749794: goto L127;
                case 1750533: goto L524;
                case 1750625: goto L45b;
                case 1750687: goto L6c;
                case 1750725: goto L4c3;
                case 1750726: goto L55a;
                case 1750749: goto L41d;
                case 1750814: goto L3ff;
                case 1751774: goto L267;
                case 1752487: goto L45b;
                case 1752520: goto L1b8;
                case 1752549: goto L45f;
                case 1752609: goto L598;
                case 1752613: goto L68a;
                case 1752705: goto L18a;
                case 1753479: goto L20a;
                case 1753483: goto L244;
                case 1753665: goto L65b;
                case 1754381: goto L5bb;
                case 1754471: goto Led;
                case 1754533: goto L2bd;
                case 1754656: goto L42e;
                case 1755337: goto L43b;
                case 1755431: goto L27f;
                case 1755467: goto L477;
                case 1755584: goto L4d4;
                default: goto L3a;
            }
        L3a:
            goto L37
        L3b:
            int r7 = com.google.android.material.carousel.C0054.f54
            int r15 = com.google.android.material.datepicker.C0059.f59
            int r15 = r15 + 3950
            r7 = r7 ^ r15
            if (r7 > 0) goto L1fd
            java.lang.String r7 = "ۧ۠ۧ"
        L46:
            int r7 = android.support.v4.graphics.drawable.C0004.m16(r7)
            r33 = r7
            goto L37
        L4d:
            r5 = -1
            int r7 = androidx.legacy.content.C0028.f28
            int r15 = com.google.android.material.carousel.C0055.f55
            int r15 = r15 + (-1652)
            r7 = r7 ^ r15
            if (r7 > 0) goto L60
        L57:
            java.lang.String r7 = "ۣ۟ۡ"
            int r7 = androidx.coordinatorlayout.widget.C0021.m86(r7)
            r33 = r7
            goto L37
        L60:
            int r7 = androidx.activity.C0011.f11
            int r15 = defpackage.C0072.f72
            r7 = r7 ^ r15
            r15 = 1754923(0x1ac72b, float:2.459171E-39)
            int r7 = r7 + r15
            r33 = r7
            goto L37
        L6c:
            java.io.PrintStream r7 = java.lang.System.out
            r0 = r29
            r7.println(r0)
            int r7 = androidx.constraintlayout.widget.C0019.f19
            if (r7 > 0) goto L83
            com.google.android.material.carousel.C0054.m217()
            java.lang.String r7 = "ۨۢۡ"
            int r7 = androidx.appcompat.app.C0012.m50(r7)
            r33 = r7
            goto L37
        L83:
            java.lang.String r7 = "ۥۤۤ"
        L85:
            int r7 = androidx.startup.C0037.m149(r7)
            r33 = r7
            goto L37
        L8c:
            r7 = 1051931443(0x3eb33333, float:0.35)
            float r7 = r7 * r27
            r0 = r37
            r1 = r34
            r2 = r35
            r3 = r23
            r0.drawCircle(r1, r2, r7, r3)
            int r7 = androidx.core.content.C0024.f24
            int r15 = androidx.constraintlayout.helper.widget.C0017.f17
            int r15 = r15 + (-2070)
            int r7 = r7 / r15
            if (r7 == 0) goto Lae
            java.lang.String r7 = "ۡۢ"
            int r7 = androidx.appcompat.widget.C0015.m60(r7)
            r33 = r7
            goto L37
        Lae:
            int r7 = com.google.android.material.theme.C0062.f62
            int r15 = androidx.coordinatorlayout.widget.C0022.f22
            int r7 = r7 - r15
            r15 = 1755579(0x1ac9bb, float:2.46009E-39)
            int r7 = r7 + r15
            r33 = r7
            goto L37
        Lbb:
            java.lang.String r7 = "x5Xhvm9X\n"
            java.lang.String r15 = "pPSPyA4kCkw=\n"
            java.lang.String r7 = "canvas"
            r0 = r37
            defpackage.ip.o(r7, r0)
            int r7 = r36.getWidth()
            float r7 = (float) r7
            r15 = 1073741824(0x40000000, float:2.0)
            float r15 = r7 / r15
            int r7 = r36.getHeight()
            float r7 = (float) r7
            r16 = 1073741824(0x40000000, float:2.0)
            float r16 = r7 / r16
            int r7 = androidx.constraintlayout.widget.C0019.f19
            int r26 = com.google.android.material.floatingactionbutton.C0060.f60
            int r7 = r7 - r26
            r26 = 1750659(0x1ab683, float:2.453196E-39)
            int r7 = r7 + r26
            r33 = r7
            r34 = r15
            r35 = r16
            goto L37
        Led:
            java.lang.String r7 = "۠ۦۧ"
            int r7 = androidx.savedstate.C0036.m144(r7)
            r33 = r7
            goto L37
        Lf7:
            int r7 = com.google.android.material.behavior.C0050.f50
            int r15 = com.google.android.material.chip.C0057.f57
            r15 = r15 | (-8852(0xffffffffffffdd6c, float:NaN))
            r7 = r7 | r15
            if (r7 < 0) goto L10d
            defpackage.C0071.m284()
            java.lang.String r7 = "ۦۤۨ"
            int r7 = androidx.lifecycle.C0029.m116(r7)
            r33 = r7
            goto L37
        L10d:
            int r7 = androidx.constraintlayout.widget.C0018.f18
            int r15 = com.google.android.material.appbar.C0049.f49
            int r7 = r7 - r15
            r15 = 1748618(0x1aae8a, float:2.450336E-39)
            int r7 = r7 + r15
            r33 = r7
            goto L37
        L11a:
            int r7 = androidx.coordinatorlayout.widget.C0022.f22
            int r15 = com.google.android.material.appbar.C0049.f49
            r7 = r7 ^ r15
            r15 = -1747082(0xffffffffffe55776, float:NaN)
            r7 = r7 ^ r15
            r33 = r7
            goto L37
        L127:
            float r6 = java.lang.Math.min(r34, r35)
            r0 = r36
            boolean r7 = r0.b
            if (r7 == 0) goto L154
            r7 = 1082130432(0x40800000, float:4.0)
            float r13 = defpackage.ff.p(r7)
            int r7 = androidx.profileinstaller.C0030.f30
            int r15 = androidx.core.content.C0023.f23
            r15 = r15 | 1757(0x6dd, float:2.462E-42)
            int r7 = r7 + r15
            if (r7 > 0) goto L14a
            java.lang.String r7 = "ۦۡۦ"
            int r7 = com.google.android.material.bottomsheet.C0051.m207(r7)
            r33 = r7
            goto L37
        L14a:
            java.lang.String r7 = "ۦۡۢ"
            int r7 = androidx.activity.result.C0008.m35(r7)
            r33 = r7
            goto L37
        L154:
            int r7 = androidx.savedstate.C0035.f35
            int r15 = com.google.android.material.theme.C0062.f62
            int r15 = r15 + 8459
            int r7 = r7 + r15
            if (r7 > 0) goto L16a
            com.google.android.material.bottomsheet.C0051.m206()
            java.lang.String r7 = "۟ۨ۠"
        L162:
            int r7 = androidx.savedstate.C0035.m140(r7)
            r33 = r7
            goto L37
        L16a:
            java.lang.String r7 = "۠ۧۢ"
            goto L162
        L16d:
            int r7 = androidx.emoji2.text.C0026.f26
            int r15 = androidx.emoji2.text.C0026.f26
            int r15 = r15 / (-1845)
            r7 = r7 ^ r15
            if (r7 > 0) goto L180
            java.lang.String r7 = "ۣۧۤ"
        L178:
            int r7 = androidx.legacy.content.C0028.m114(r7)
            r33 = r7
            goto L37
        L180:
            java.lang.String r7 = "ۣ۟ۡ"
        L182:
            int r7 = androidx.appcompat.widget.C0015.m60(r7)
            r33 = r7
            goto L37
        L18a:
            int r7 = android.graphics.Color.parseColor(r20)
            r0 = r23
            r0.setColor(r7)
            r7 = 0
            r15 = 0
            r16 = 1077936128(0x40400000, float:3.0)
            float r16 = defpackage.ff.p(r16)
            float r15 = r15 - r16
            float r15 = r15 - r27
            float r7 = r7 - r15
            r0 = r37
            r1 = r34
            r2 = r35
            r3 = r23
            r0.drawCircle(r1, r2, r7, r3)
            r23.setStyle(r24)
            java.lang.String r7 = "ۥۤ۠"
        L1b0:
            int r7 = androidx.activity.C0011.m45(r7)
            r33 = r7
            goto L37
        L1b8:
            r23.setStyle(r24)
            r0 = r36
            java.lang.String r7 = r0.a
            int r10 = android.graphics.Color.parseColor(r7)
            r0 = r23
            r0.setColor(r10)
            int r10 = androidx.appcompat.widget.C0013.m52()
            if (r10 < 0) goto L610
        L1ce:
            java.lang.String r10 = "ۡ۠۠"
            int r15 = androidx.coordinatorlayout.widget.C0021.m86(r10)
            r10 = r7
            r33 = r15
            goto L37
        L1d9:
            java.lang.String r7 = "ۣۨ"
            goto L178
        L1dc:
            int r7 = androidx.core.content.C0024.f24
            int r15 = androidx.legacy.content.C0028.f28
            int r15 = r15 + (-4053)
            r7 = r7 ^ r15
            if (r7 < 0) goto L1f3
            r7 = 26
            androidx.activity.C0010.f10 = r7
            java.lang.String r7 = "ۦۤۤ"
        L1eb:
            int r7 = androidx.savedstate.C0035.m140(r7)
            r33 = r7
            goto L37
        L1f3:
            java.lang.String r7 = "ۥۣۧ"
            int r7 = com.github.megatronking.stringfog.xor.C0046.m186(r7)
            r33 = r7
            goto L37
        L1fd:
            int r7 = androidx.coordinatorlayout.widget.C0022.f22
            int r15 = com.google.android.material.chip.C0057.f57
            int r7 = r7 % r15
            r15 = 1752978(0x1abf92, float:2.456445E-39)
            int r7 = r7 + r15
            r33 = r7
            goto L37
        L20a:
            int r7 = android.app.C0003.f3
            if (r7 > 0) goto L222
            com.google.android.material.datepicker.C0059.m236()
            r7 = r14
            r12 = r13
        L213:
            java.lang.String r14 = "ۧۨۡ"
            r15 = r14
            r16 = r7
        L218:
            int r7 = android.app.C0000.m2(r15)
            r33 = r7
            r14 = r16
            goto L37
        L222:
            java.lang.String r7 = "ۦۧۢ"
            r12 = r13
            goto L46
        L227:
            int r7 = android.app.C0003.f3
            int r8 = com.github.megatronking.stringfog.annotation.C0044.f44
            r8 = r8 | (-2867(0xfffffffffffff4cd, float:NaN))
            int r7 = r7 - r8
            if (r7 > 0) goto L23f
            r7 = 72
            androidx.versionedparcelable.C0038.f38 = r7
            java.lang.String r7 = "ۦۢ"
            int r7 = androidx.versionedparcelable.C0042.m170(r7)
            r8 = r9
            r33 = r7
            goto L37
        L23f:
            java.lang.String r7 = "ۧۢۢ"
            r8 = r9
            goto L178
        L244:
            int r7 = android.graphics.Color.parseColor(r28)
            r0 = r23
            r0.setColor(r7)
            int r7 = android.support.v4.graphics.drawable.C0006.f6
            int r15 = com.google.android.material.bottomsheet.C0051.f51
            int r15 = r15 + (-734)
            int r7 = r7 / r15
            if (r7 == 0) goto L264
            r7 = 53
            com.github.megatronking.stringfog.C0048.f48 = r7
            java.lang.String r7 = "۟ۤۡ"
            int r7 = androidx.recyclerview.widget.C0033.m132(r7)
            r33 = r7
            goto L37
        L264:
            java.lang.String r7 = "ۨ۟۠"
            goto L1eb
        L267:
            int r7 = com.google.android.material.internal.C0061.f61
            if (r7 > 0) goto L275
            java.lang.String r7 = "ۦۦۦ"
            int r7 = androidx.versionedparcelable.C0039.m159(r7)
            r33 = r7
            goto L37
        L275:
            java.lang.String r7 = "ۣ۠۟"
            int r7 = com.ljx.wechatmod.auth.C0065.m263(r7)
            r33 = r7
            goto L37
        L27f:
            int r7 = com.google.android.material.datepicker.C0058.m232()
            if (r7 > 0) goto L3b
            java.lang.String r7 = "vqkHT1wKRdx9SHAqyjdSIAjX"
            java.lang.String r7 = androidx.versionedparcelable.C0041.m165(r7)
            java.lang.Integer r7 = java.lang.Integer.decode(r7)
            int r15 = android.support.v4.graphics.drawable.C0006.f6
            int r16 = androidx.versionedparcelable.C0042.f42
            int r15 = r15 + r16
            r16 = 1751088(0x1ab830, float:2.453797E-39)
            int r15 = r15 + r16
            r29 = r7
            r33 = r15
            goto L37
        L2a0:
            int r7 = androidx.emoji2.text.C0026.m106()
            if (r7 > 0) goto L2b0
            java.lang.String r7 = "ۧ۠ۥ"
            int r7 = com.google.android.material.carousel.C0052.m209(r7)
            r33 = r7
            goto L37
        L2b0:
            int r7 = com.github.megatronking.stringfog.C0047.f47
            int r15 = androidx.core.content.C0023.f23
            int r7 = r7 + r15
            r15 = 1746240(0x1aa540, float:2.447003E-39)
            int r7 = r7 + r15
            r33 = r7
            goto L37
        L2bd:
            r0 = r30
            boolean r7 = r0.p
            if (r7 != 0) goto L4b6
            java.lang.String r7 = "WerCYwWyyw==\n"
            java.lang.String r15 = "etryUzWC+9Y=\n"
            java.lang.String r20 = "#000000"
            int r7 = androidx.constraintlayout.helper.widget.C0017.f17
            int r15 = androidx.core.widget.C0025.f25
            r15 = r15 ^ 7021(0x1b6d, float:9.839E-42)
            int r7 = r7 % r15
            if (r7 > 0) goto L2e1
            com.github.megatronking.stringfog.C0047.m191()
            java.lang.String r7 = "ۣۡۤ"
            int r7 = com.ljx.wechatmod.hook.C0066.m264(r7)
            r33 = r7
            goto L37
        L2e1:
            int r7 = androidx.constraintlayout.widget.C0019.f19
            int r15 = android.app.C0003.f3
            int r7 = r7 * r15
            r15 = 126031(0x1ec4f, float:1.76607E-40)
            r7 = r7 ^ r15
            r33 = r7
            goto L37
        L2ee:
            int r7 = androidx.constraintlayout.widget.C0019.f19
            if (r7 > 0) goto L308
            r7 = 82
            androidx.profileinstaller.C0031.f31 = r7
            java.lang.String r7 = "ۡۥۨ"
            r15 = r18
            r16 = r11
        L2fc:
            int r7 = androidx.recyclerview.widget.C0032.m130(r7)
            r18 = r15
            r20 = r16
            r33 = r7
            goto L37
        L308:
            int r7 = com.google.android.material.internal.C0061.f61
            int r15 = androidx.legacy.content.C0028.f28
            int r7 = r7 + r15
            r15 = -1752797(0xffffffffffe54123, float:NaN)
            r7 = r7 ^ r15
            r20 = r11
            r33 = r7
            goto L37
        L317:
            r0 = r23
            r0.setColor(r14)
            r0 = r25
            java.lang.String r7 = r10.toUpperCase(r0)
            java.lang.String r15 = "hoFSytkJ0QiTnWKSh0KNYg==\n"
            java.lang.String r16 = "8u4Huqlso0s=\n"
            java.lang.String r15 = "toUpperCase(...)"
            defpackage.ip.n(r15, r7)
            int r15 = android.support.v4.graphics.drawable.C0005.f5
            int r16 = android.app.C0002.f2
            r0 = r16
            int r0 = r0 / 3168
            r16 = r0
            int r15 = r15 * r16
            if (r15 == 0) goto L347
            java.lang.String r15 = "ۢۤ۠"
            int r15 = com.github.megatronking.stringfog.xor.C0046.m186(r15)
            r31 = r7
            r33 = r15
            goto L37
        L347:
            int r15 = androidx.appcompat.widget.C0016.f16
            int r16 = androidx.core.content.C0023.f23
            int r15 = r15 + r16
            r16 = 1753277(0x1ac0bd, float:2.456864E-39)
            int r15 = r15 + r16
            r31 = r7
            r33 = r15
            goto L37
        L358:
            int r7 = androidx.activity.C0011.f11
            int r15 = com.github.megatronking.stringfog.C0047.f47
            r15 = r15 ^ (-3698(0xfffffffffffff18e, float:NaN))
            int r7 = r7 * r15
            if (r7 < 0) goto L36e
            android.view.C0007.m31()
        L364:
            java.lang.String r7 = "ۣۣۨ"
        L366:
            int r7 = com.google.android.material.carousel.C0052.m209(r7)
            r33 = r7
            goto L37
        L36e:
            int r7 = kotlinx.coroutines.C0069.f69
            int r15 = androidx.appcompat.widget.C0014.f14
            int r7 = r7 / r15
            r15 = 1749634(0x1ab282, float:2.45176E-39)
            int r7 = r7 + r15
            r33 = r7
            goto L37
        L37b:
            r0 = r30
            boolean r7 = r0.p
            if (r7 == 0) goto L11a
            java.lang.String r19 = "l4ksyvHOl4jy\n"
            java.lang.String r21 = "tLofjLeI0c4=\n"
            int r7 = kotlinx.coroutines.C0069.f69
            int r15 = androidx.activity.result.C0009.f9
            int r15 = r15 / 9771
            int r7 = r7 - r15
            if (r7 < 0) goto L668
            java.lang.String r7 = "ۨۧ۟"
            int r7 = android.support.v4.graphics.drawable.C0005.m23(r7)
            r33 = r7
            goto L37
        L398:
            int r7 = android.app.C0003.f3
            int r15 = com.github.megatronking.stringfog.C0047.f47
            r15 = r15 | 8301(0x206d, float:1.1632E-41)
            r7 = r7 ^ r15
            if (r7 < 0) goto L3af
            r7 = 91
            androidx.viewpager2.adapter.C0043.f43 = r7
            java.lang.String r7 = "۟۟۠"
            int r7 = androidx.coordinatorlayout.widget.C0022.m90(r7)
            r33 = r7
            goto L37
        L3af:
            int r7 = com.ljx.wechatmod.auth.C0065.f65
            int r15 = android.support.v4.graphics.drawable.C0005.f5
            int r7 = r7 % r15
            r15 = 1750733(0x1ab6cd, float:2.4533E-39)
            int r7 = r7 + r15
            r33 = r7
            goto L37
        L3bc:
            r7 = 1094713344(0x41400000, float:12.0)
            float r7 = r7 + r6
            float r7 = r7 - r12
            r15 = 1094713344(0x41400000, float:12.0)
            float r24 = r7 - r15
            android.graphics.Paint$Style r16 = android.graphics.Paint.Style.FILL
            r0 = r36
            android.graphics.Paint r15 = r0.c
            java.lang.String r23 = "ۥۡۤ"
            r7 = r22
            r26 = r23
            r27 = r24
        L3d2:
            int r26 = androidx.profileinstaller.C0031.m127(r26)
            r22 = r7
            r23 = r15
            r24 = r16
            r33 = r26
            goto L37
        L3e0:
            int r7 = com.google.android.material.datepicker.C0059.m236()
            if (r7 > 0) goto L3f6
            r7 = 25
            androidx.activity.C0010.f10 = r7
            java.lang.String r7 = "ۧۢۢ"
            int r7 = com.google.android.material.chip.C0057.m229(r7)
            r33 = r7
            r12 = r17
            goto L37
        L3f6:
            java.lang.String r7 = "ۢۧ"
            r15 = r7
            r16 = r14
            r12 = r17
            goto L218
        L3ff:
            int r7 = androidx.appcompat.widget.C0016.m66()
            if (r7 > 0) goto L415
            r7 = 97
            androidx.versionedparcelable.C0039.f39 = r7
            java.lang.String r7 = "ۣۨ"
            r18 = r19
        L40d:
            int r7 = androidx.recyclerview.widget.C0032.m130(r7)
            r33 = r7
            goto L37
        L415:
            java.lang.String r7 = "۟ۤۢ"
            r15 = r19
            r16 = r20
            goto L2fc
        L41d:
            int r7 = androidx.savedstate.C0034.f34
            int r15 = com.github.megatronking.stringfog.C0047.f47
            int r7 = r7 * r15
            r15 = 47197(0xb85d, float:6.6137E-41)
            int r7 = r7 + r15
            r33 = r7
            goto L37
        L42a:
            r8 = r21
            goto L364
        L42e:
            int r7 = androidx.savedstate.C0034.f34
            int r15 = androidx.activity.result.C0008.f8
            int r7 = r7 * r15
            r15 = 1444489(0x160a89, float:2.02416E-39)
            r7 = r7 ^ r15
            r33 = r7
            goto L37
        L43b:
            r0 = r37
            r1 = r34
            r2 = r35
            r3 = r27
            r4 = r23
            r0.drawCircle(r1, r2, r3, r4)
            int r7 = androidx.profileinstaller.C0031.f31
            int r15 = androidx.appcompat.widget.C0015.f15
            int r15 = r15 * (-6124)
            r7 = r7 | r15
            if (r7 < 0) goto L57
            java.lang.String r7 = "ۣۨۦ"
            int r7 = androidx.startup.C0037.m149(r7)
            r33 = r7
            goto L37
        L45b:
            java.lang.String r7 = "ۢۧ"
            goto L162
        L45f:
            r7 = 16776785(0xfffe51, float:2.3509283E-38)
            int r15 = androidx.coordinatorlayout.widget.C0021.f21
            r7 = r7 ^ r15
            r0 = r23
            r0.setColor(r7)
            int r7 = androidx.appcompat.widget.C0013.f13
            int r15 = androidx.versionedparcelable.C0042.f42
            int r7 = r7 + r15
            r15 = -55678(0xffffffffffff2682, float:NaN)
            r7 = r7 ^ r15
            r33 = r7
            goto L37
        L477:
            r0 = r25
            java.lang.String r7 = r10.toUpperCase(r0)
            java.lang.String r15 = "JCS9L8pVDY0xOI13lB5R5w==\n"
            java.lang.String r16 = "UEvoX7owf84=\n"
            java.lang.String r15 = "toUpperCase(...)"
            defpackage.ip.n(r15, r7)
            java.lang.String r15 = "r1aVMzg6tg==\n"
            java.lang.String r16 = "jBDTdX588KI=\n"
            java.lang.String r15 = "#FFFFFF"
            boolean r7 = r7.equals(r15)
            if (r7 == 0) goto L4b6
            int r7 = kotlinx.coroutines.C0070.f70
            int r15 = androidx.appcompat.widget.C0015.f15
            int r15 = r15 / (-4000)
            r7 = r7 | r15
            if (r7 > 0) goto L4ac
            androidx.profileinstaller.C0030.m121()
            java.lang.String r7 = "ۢۧ"
            int r7 = androidx.emoji2.text.C0026.m105(r7)
            r33 = r7
            goto L37
        L4ac:
            java.lang.String r7 = "ۧۤۢ"
        L4ae:
            int r7 = androidx.versionedparcelable.C0041.m164(r7)
            r33 = r7
            goto L37
        L4b6:
            int r7 = androidx.fragment.app.C0027.f27
            int r15 = com.google.android.material.internal.C0061.f61
            r7 = r7 | r15
            r15 = 1748837(0x1aaf65, float:2.450643E-39)
            int r7 = r7 + r15
            r33 = r7
            goto L37
        L4c3:
            int r7 = androidx.constraintlayout.widget.C0019.f19
            int r15 = androidx.activity.result.C0008.f8
            int r15 = r15 + (-2371)
            int r7 = r7 + r15
            if (r7 < 0) goto L4d0
            java.lang.String r7 = "ۢۦۥ"
            goto L182
        L4d0:
            java.lang.String r7 = "ۦۡۦ"
            goto L162
        L4d4:
            int r7 = androidx.savedstate.C0034.f34
            int r14 = com.google.android.material.internal.C0061.f61
            int r14 = r14 + 9377
            r7 = r7 | r14
            if (r7 < 0) goto L4ec
            r7 = 66
            com.github.megatronking.stringfog.C0048.f48 = r7
            java.lang.String r7 = "ۣۤ۠"
            int r7 = androidx.savedstate.C0036.m144(r7)
            r33 = r7
            r14 = r5
            goto L37
        L4ec:
            int r7 = android.app.C0002.f2
            int r14 = android.support.v4.graphics.drawable.C0005.f5
            int r7 = r7 / r14
            r14 = 1747765(0x1aab35, float:2.44914E-39)
            int r7 = r7 + r14
            r33 = r7
            r14 = r5
            goto L37
        L4fa:
            r0 = r18
            java.lang.String r7 = defpackage.u40.a(r0, r8)
            int r15 = androidx.activity.result.C0008.f8
            int r16 = androidx.profileinstaller.C0031.f31
            r0 = r16
            int r0 = r0 % 6557
            r16 = r0
            int r15 = r15 / r16
            if (r15 > 0) goto L51d
            androidx.constraintlayout.helper.widget.C0017.m71()
            java.lang.String r15 = "۠ۧۥ"
            int r15 = com.google.android.material.datepicker.C0059.m239(r15)
            r28 = r7
            r33 = r15
            goto L37
        L51d:
            r15 = r7
        L51e:
            java.lang.String r7 = "ۣۢۦ"
            r28 = r15
            goto L85
        L524:
            r0 = r36
            boolean r7 = r0.b
            if (r7 == 0) goto L540
            android.graphics.Paint$Style r7 = android.graphics.Paint.Style.STROKE
            r0 = r23
            r0.setStyle(r7)
            r7 = 1073741824(0x40000000, float:2.0)
            float r7 = defpackage.ff.p(r7)
            r0 = r23
            r0.setStrokeWidth(r7)
            java.lang.String r7 = "ۣۨۦ"
            goto L162
        L540:
            int r7 = com.google.android.material.chip.C0056.f56
            int r15 = androidx.savedstate.C0034.f34
            int r15 = r15 * 3182
            r7 = r7 ^ r15
            if (r7 > 0) goto L54d
            java.lang.String r7 = "ۡۤۦ"
            goto L4ae
        L54d:
            int r7 = androidx.appcompat.widget.C0014.f14
            int r15 = io.fastkv.C0068.f68
            int r7 = r7 * r15
            r15 = 1178268(0x11fa9c, float:1.651105E-39)
            int r7 = r7 + r15
            r33 = r7
            goto L37
        L55a:
            r0 = r37
            r1 = r34
            r2 = r35
            r3 = r27
            r4 = r23
            r0.drawCircle(r1, r2, r3, r4)
            java.util.Locale r25 = java.util.Locale.ROOT
            r0 = r25
            java.lang.String r7 = r10.toUpperCase(r0)
            int r15 = com.google.android.material.theme.C0064.f64
            int r16 = androidx.appcompat.widget.C0016.f16
            r0 = r16
            int r0 = r0 + (-1673)
            r16 = r0
            r15 = r15 ^ r16
            if (r15 < 0) goto L587
            java.lang.String r22 = "ۣۦ۠"
            r15 = r23
            r16 = r24
            r26 = r22
            goto L3d2
        L587:
            int r15 = androidx.coordinatorlayout.widget.C0021.f21
            int r16 = androidx.core.widget.C0025.f25
            int r15 = r15 % r16
            r16 = 1749108(0x1ab074, float:2.451022E-39)
            int r15 = r15 + r16
            r22 = r7
            r33 = r15
            goto L37
        L598:
            r0 = r30
            boolean r7 = r0.p
            if (r7 == 0) goto L41d
            java.lang.String r7 = "8Bs0SR+VjWCV\n"
            java.lang.String r14 = "014CD1nTyyY=\n"
            java.lang.String r7 = "#E6FFFFFF"
            int r7 = android.graphics.Color.parseColor(r7)
            int r14 = androidx.versionedparcelable.C0042.f42
            int r15 = com.google.android.material.carousel.C0053.f53
            int r15 = r15 + 9602
            int r14 = r14 / r15
            if (r14 == 0) goto L213
            r14 = 1
            androidx.versionedparcelable.C0038.f38 = r14
            r15 = r28
            r14 = r7
            goto L51e
        L5bb:
            java.lang.String r7 = "0clzftZcxg==\n"
            java.lang.String r15 = "8o81OJAagIY=\n"
            java.lang.String r7 = "#FFFFFF"
            r0 = r31
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L1d9
            r0 = r30
            boolean r7 = r0.p
            if (r7 != 0) goto L1d9
            java.lang.String r7 = "ۥۢۢ"
            goto L40d
        L5d5:
            java.lang.String r7 = "IwAYhLKgz7E2HCjc7OuT2w==\n"
            java.lang.String r15 = "V29N9MLFvfI=\n"
            java.lang.String r7 = "toUpperCase(...)"
            r0 = r22
            defpackage.ip.n(r7, r0)
            java.lang.String r7 = "WCR4/J4pJg==\n"
            java.lang.String r15 = "e2I+uthvYPE=\n"
            java.lang.String r7 = "#FFFFFF"
            r0 = r22
            boolean r15 = r0.equals(r7)
            r0 = r36
            on r7 = r0.d
            java.lang.String r16 = "۟۟۠"
            int r16 = com.google.android.material.datepicker.C0058.m234(r16)
            r30 = r7
            r32 = r15
            r33 = r16
            goto L37
        L602:
            r7 = 1073741824(0x40000000, float:2.0)
            float r17 = defpackage.ff.p(r7)
            int r7 = com.google.android.material.internal.C0061.f61
            if (r7 > 0) goto L61b
            com.google.android.material.appbar.C0049.m199()
            r7 = r10
        L610:
            java.lang.String r10 = "ۣۥۨ"
            int r15 = com.github.megatronking.stringfog.xor.C0045.m182(r10)
            r10 = r7
            r33 = r15
            goto L37
        L61b:
            int r7 = defpackage.C0071.f71
            int r15 = androidx.coordinatorlayout.widget.C0021.f21
            r7 = r7 | r15
            r15 = 1749808(0x1ab330, float:2.452003E-39)
            int r7 = r7 + r15
            r33 = r7
            goto L37
        L628:
            r7 = r10
            r11 = r10
            goto L1ce
        L62c:
            if (r32 == 0) goto L16d
            android.graphics.Paint$Style r7 = android.graphics.Paint.Style.STROKE
            r0 = r23
            r0.setStyle(r7)
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = defpackage.ff.p(r7)
            r0 = r23
            r0.setStrokeWidth(r7)
            int r7 = androidx.activity.result.C0009.f9
            int r15 = androidx.fragment.app.C0027.f27
            r15 = r15 | 1026(0x402, float:1.438E-42)
            int r7 = r7 * r15
            if (r7 > 0) goto L657
            r7 = 61
            androidx.versionedparcelable.C0039.f39 = r7
            java.lang.String r7 = "ۣۡۥ"
            int r7 = com.google.android.material.carousel.C0054.m219(r7)
            r33 = r7
            goto L37
        L657:
            java.lang.String r7 = "ۦۢ"
            goto L366
        L65b:
            int r7 = androidx.versionedparcelable.C0040.f40
            int r15 = androidx.constraintlayout.widget.C0020.f20
            int r15 = r15 * 4847
            r7 = r7 ^ r15
            if (r7 < 0) goto L66c
            r7 = 46
            androidx.recyclerview.widget.C0032.f32 = r7
        L668:
            java.lang.String r7 = "۠۟۟"
            goto L1b0
        L66c:
            int r7 = androidx.savedstate.C0036.f36
            int r15 = androidx.core.content.C0023.f23
            int r7 = r7 % r15
            r15 = 1752233(0x1abca9, float:2.455401E-39)
            int r7 = r7 + r15
            r33 = r7
            goto L37
        L679:
            java.lang.String r18 = "iWXNQb7JPQ==\n"
            java.lang.String r9 = "qiD9BI6MDfc=\n"
            int r7 = androidx.versionedparcelable.C0042.f42
            int r15 = com.github.megatronking.stringfog.xor.C0045.f45
            int r7 = r7 * r15
            r15 = 192016(0x2ee10, float:2.69072E-40)
            int r7 = r7 - r15
            r33 = r7
            goto L37
        L68a:
            return
    }

    public final void setSelectedTheme(boolean r3) {
            r2 = this;
            java.lang.String r0 = "۠۟ۢ"
            int r0 = com.google.android.material.bottomsheet.C0051.m207(r0)
        L6:
            switch(r0) {
                case 56474: goto La;
                case 1747651: goto L24;
                case 1754501: goto L29;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = androidx.core.widget.C0025.m103()
            if (r0 < 0) goto L1a
            com.github.megatronking.stringfog.annotation.C0044.m178()
            java.lang.String r0 = "۟۟ۧ"
        L15:
            int r0 = androidx.constraintlayout.widget.C0020.m80(r0)
            goto L6
        L1a:
            int r0 = androidx.activity.C0011.f11
            int r1 = androidx.appcompat.widget.C0013.f13
            int r0 = r0 - r1
            r1 = 1747421(0x1aa9dd, float:2.448658E-39)
            int r0 = r0 + r1
            goto L6
        L24:
            r2.b = r3
            java.lang.String r0 = "ۣۧۡ"
            goto L15
        L29:
            return
    }
}
