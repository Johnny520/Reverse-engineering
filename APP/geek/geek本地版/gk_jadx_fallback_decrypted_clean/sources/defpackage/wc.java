package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wc extends android.widget.BaseAdapter {
    public final java.util.ArrayList a;
    public final android.app.Activity b;
    public final defpackage.on c;

    public wc(java.util.ArrayList r4, android.app.Activity r5, defpackage.on r6) {
            r3 = this;
            r3.a = r4
            r3.b = r5
            r3.c = r6
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "ۧۡۡ"
            int r1 = androidx.constraintlayout.widget.C0019.m79(r1)
        L10:
            switch(r1) {
                case 1746908: goto L14;
                case 1748617: goto L31;
                case 1749669: goto L4a;
                case 1750537: goto L40;
                case 1752520: goto L6e;
                case 1754439: goto L67;
                default: goto L13;
            }
        L13:
            goto L10
        L14:
            int r1 = android.app.C0001.f1
            int r2 = androidx.activity.C0011.f11
            int r2 = r2 * (-5840)
            r1 = r1 ^ r2
            if (r1 < 0) goto L27
            com.ljx.wechatmod.auth.C0065.m260()
            java.lang.String r1 = "ۢۡۨ"
        L22:
            int r1 = com.google.android.material.carousel.C0055.m220(r1)
            goto L10
        L27:
            int r1 = androidx.viewpager2.adapter.C0043.f43
            int r2 = androidx.versionedparcelable.C0041.f41
            int r1 = r1 % r2
            r2 = 1754093(0x1ac3ed, float:2.458008E-39)
            int r1 = r1 + r2
            goto L10
        L31:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = kotlinx.coroutines.C0070.f70
            int r2 = com.ljx.wechatmod.hook.C0066.f66
            int r1 = r1 + r2
            r2 = 1751127(0x1ab857, float:2.453852E-39)
            r1 = r1 ^ r2
            goto L10
        L40:
            int r1 = android.app.C0002.f2
            int r2 = com.google.android.material.floatingactionbutton.C0060.f60
            r1 = r1 ^ r2
            r2 = 1752202(0x1abc8a, float:2.455358E-39)
            r1 = r1 ^ r2
            goto L10
        L4a:
            java.lang.String r0 = "IQf2pvPcQP9MTyQgyvBza0xK1"
            java.lang.String r0 = androidx.versionedparcelable.C0041.m165(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            int r1 = android.app.C0003.f3
            int r2 = androidx.constraintlayout.helper.widget.C0017.f17
            r2 = r2 | 3323(0xcfb, float:4.657E-42)
            int r1 = r1 / r2
            if (r1 == 0) goto L64
        L5d:
            java.lang.String r1 = "ۢۢۥ"
            int r1 = androidx.versionedparcelable.C0038.m153(r1)
            goto L10
        L64:
            java.lang.String r1 = "ۡ۟ۧ"
            goto L22
        L67:
            int r1 = com.github.megatronking.stringfog.annotation.C0044.m178()
            if (r1 < 0) goto L40
            goto L5d
        L6e:
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            java.util.ArrayList r0 = r1.a
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r4) {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "۟ۥۡ"
            int r2 = androidx.constraintlayout.widget.C0020.m80(r1)
            r1 = r0
        L8:
            switch(r2) {
                case 56382: goto Lc;
                case 1746875: goto L40;
                case 1750629: goto L5d;
                case 1750783: goto L20;
                default: goto Lb;
            }
        Lb:
            goto L8
        Lc:
            int r0 = androidx.fragment.app.C0027.f27
            int r2 = com.ljx.wechatmod.auth.C0065.f65
            int r2 = r2 * (-8454)
            int r0 = r0 / r2
            if (r0 == 0) goto L3d
            androidx.versionedparcelable.C0042.m169()
            java.lang.String r0 = "ۧۨۥ"
        L1a:
            int r0 = com.google.android.material.chip.C0056.m226(r0)
            r2 = r0
            goto L8
        L20:
            java.lang.String r0 = "hB2S/qDSYcc=\n"
            java.lang.String r2 = "43jm1o78T+4=\n"
            java.lang.String r0 = "get(...)"
            defpackage.ip.n(r0, r1)
            int r0 = android.support.v4.graphics.drawable.C0006.f6
            if (r0 > 0) goto L3a
            androidx.viewpager2.adapter.C0043.m172()
            java.lang.String r0 = "۟ۥۡ"
            int r0 = com.google.android.material.floatingactionbutton.C0060.m241(r0)
            r2 = r0
            goto L8
        L3a:
            java.lang.String r0 = "ۣۢۤ"
            goto L1a
        L3d:
            java.lang.String r0 = "۟ۥۡ"
            goto L1a
        L40:
            java.util.ArrayList r0 = r3.a
            java.lang.Object r1 = r0.get(r4)
            int r0 = com.google.android.material.theme.C0062.f62
            int r2 = androidx.coordinatorlayout.widget.C0022.f22
            int r2 = r2 / 2871
            r0 = r0 ^ r2
            if (r0 < 0) goto L5a
            androidx.recyclerview.widget.C0033.m135()
            java.lang.String r0 = "ۣۣۧ"
        L54:
            int r0 = com.google.android.material.chip.C0057.m229(r0)
            r2 = r0
            goto L8
        L5a:
            java.lang.String r0 = "ۣۣۧ"
            goto L54
        L5d:
            return r1
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
            r2 = this;
            java.lang.String r0 = "۠۟۠"
            int r0 = androidx.savedstate.C0034.m138(r0)
        L6:
            switch(r0) {
                case 1747649: goto La;
                case 1754663: goto Lc;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            long r0 = (long) r3
            return r0
        Lc:
            int r0 = com.google.android.material.appbar.C0049.f49
            int r1 = androidx.constraintlayout.widget.C0020.f20
            r0 = r0 ^ r1
            r1 = 1747852(0x1aab8c, float:2.449262E-39)
            int r0 = r0 + r1
            goto L6
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r33, android.view.View r34, android.view.ViewGroup r35) {
            r32 = this;
            r2 = 0
            r29 = 0
            r23 = 0
            r14 = 0
            r21 = 0
            r5 = 0
            r19 = 0
            r22 = 0
            r12 = 0
            r13 = 0
            r9 = 0
            r20 = 0
            r28 = 0
            r30 = 0
            r8 = 0
            r11 = 0
            r10 = 0
            r7 = 0
            r17 = 0
            r3 = 0
            r27 = 0
            r4 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r6 = 0
            java.lang.String r24 = "۟ۨ۟"
            int r31 = kotlinx.coroutines.C0069.m277(r24)
            r24 = r2
            r25 = r8
            r26 = r9
        L32:
            switch(r31) {
                case 56351: goto L36;
                case 56357: goto L5c9;
                case 56384: goto L3b4;
                case 56388: goto L1ad;
                case 56540: goto L324;
                case 1746689: goto L3b4;
                case 1746726: goto L122;
                case 1746752: goto L189;
                case 1746843: goto L599;
                case 1746944: goto L3cd;
                case 1746966: goto L4ff;
                case 1747651: goto L67c;
                case 1747683: goto L268;
                case 1747714: goto L40b;
                case 1747781: goto L3ef;
                case 1747872: goto L2e3;
                case 1748673: goto L290;
                case 1748676: goto L628;
                case 1748800: goto L273;
                case 1749635: goto Lfe;
                case 1749663: goto L3d7;
                case 1749765: goto L428;
                case 1749822: goto L2e9;
                case 1750689: goto L359;
                case 1750723: goto L56a;
                case 1750813: goto L642;
                case 1751494: goto L5bd;
                case 1751526: goto L65c;
                case 1751529: goto L4a0;
                case 1751589: goto L69;
                case 1751618: goto L2ba;
                case 1751679: goto L5ea;
                case 1751687: goto L53d;
                case 1751713: goto L9b;
                case 1751742: goto L30e;
                case 1751773: goto L67b;
                case 1752580: goto L379;
                case 1752639: goto L4c9;
                case 1752645: goto L268;
                case 1752646: goto L20a;
                case 1753447: goto L1cf;
                case 1753454: goto L67f;
                case 1753600: goto L457;
                case 1753671: goto L1f0;
                case 1754377: goto L14a;
                case 1755496: goto L642;
                case 1755562: goto L238;
                default: goto L35;
            }
        L35:
            goto L32
        L36:
            r2 = 0
            r8 = 1
            r0 = r27
            r0.setTypeface(r2, r8)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r8 = 0
            int r9 = androidx.versionedparcelable.C0042.f42
            r9 = r9 ^ 839(0x347, float:1.176E-42)
            r31 = 1065353216(0x3f800000, float:1.0)
            r0 = r31
            r2.<init>(r8, r9, r0)
            r0 = r27
            r0.setLayoutParams(r2)
            r2 = 1
            r0 = r27
            r0.setMaxLines(r2)
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r0 = r27
            r0.setEllipsize(r2)
            int r2 = androidx.savedstate.C0035.f35
            int r8 = com.google.android.material.internal.C0061.f61
            r2 = r2 ^ r8
            r8 = 1751645(0x1aba5d, float:2.454577E-39)
            int r2 = r2 + r8
            r31 = r2
            goto L32
        L69:
            if (r21 != 0) goto L359
            android.widget.LinearLayout r12 = new android.widget.LinearLayout
            r0 = r19
            r12.<init>(r0)
            r2 = 0
            r12.setOrientation(r2)
            int r2 = androidx.constraintlayout.helper.widget.C0017.f17
            r2 = r2 ^ 715(0x2cb, float:1.002E-42)
            r12.setGravity(r2)
            int r2 = androidx.viewpager2.adapter.C0043.f43
            int r8 = com.github.megatronking.stringfog.xor.C0046.f46
            r8 = r8 ^ (-950(0xfffffffffffffc4a, float:NaN))
            int r2 = r2 % r8
            if (r2 > 0) goto L8f
            java.lang.String r2 = "ۦ۠ۨ"
            int r2 = kotlinx.coroutines.C0070.m281(r2)
            r31 = r2
            goto L32
        L8f:
            int r2 = android.app.C0001.f1
            int r8 = com.google.android.material.theme.C0062.f62
            int r2 = r2 / r8
            r8 = 1754377(0x1ac509, float:2.458406E-39)
            int r2 = r2 + r8
            r31 = r2
            goto L32
        L9b:
            r0 = r27
            r1 = r23
            r0.setText(r1)
            r2 = 1097859072(0x41700000, float:15.0)
            r0 = r27
            r0.setTextSize(r2)
            r0 = r32
            on r4 = r0.c
            int r2 = r4.e
            r0 = r27
            r0.setTextColor(r2)
            int r2 = androidx.lifecycle.C0029.m118()
            if (r2 > 0) goto Lc9
            androidx.constraintlayout.widget.C0018.m75()
            r2 = r3
        Lbe:
            java.lang.String r3 = "ۥۥ۟"
            int r8 = android.support.v4.graphics.drawable.C0004.m16(r3)
            r3 = r2
            r31 = r8
            goto L32
        Lc9:
            int r2 = androidx.activity.result.C0009.f9
            int r8 = androidx.activity.C0011.f11
            int r2 = r2 * r8
            r8 = 148261(0x24325, float:2.07758E-40)
            int r2 = r2 - r8
            r31 = r2
            goto L32
        Ld6:
            r2 = r5
        Ld7:
            int r6 = com.google.android.material.carousel.C0052.f52
            int r8 = androidx.versionedparcelable.C0039.f39
            int r8 = r8 / 1675
            r6 = r6 ^ r8
            if (r6 > 0) goto Lf1
            r6 = 92
            com.github.megatronking.stringfog.C0048.f48 = r6
            java.lang.String r6 = "۠۟ۥ"
            r8 = r6
            r9 = r2
        Le8:
            int r2 = androidx.constraintlayout.widget.C0018.m73(r8)
            r31 = r2
            r6 = r9
            goto L32
        Lf1:
            java.lang.String r6 = "ۨۦۨ"
            r8 = r6
            r9 = r2
        Lf5:
            int r2 = androidx.constraintlayout.widget.C0020.m80(r8)
            r31 = r2
            r6 = r9
            goto L32
        Lfe:
            int r2 = com.github.megatronking.stringfog.xor.C0045.f45
            int r8 = androidx.legacy.content.C0028.f28
            int r8 = r8 * (-6067)
            r2 = r2 ^ r8
            if (r2 < 0) goto L115
            r2 = 76
            androidx.versionedparcelable.C0039.f39 = r2
        L10b:
            java.lang.String r2 = "ۤۧۡ"
            int r2 = com.google.android.material.appbar.C0049.m197(r2)
            r31 = r2
            goto L32
        L115:
            int r2 = defpackage.C0071.f71
            int r8 = com.ljx.wechatmod.hook.C0066.f66
            int r2 = r2 - r8
            r8 = -55743(0xffffffffffff2641, float:NaN)
            r2 = r2 ^ r8
            r31 = r2
            goto L32
        L122:
            r0 = r25
            r0.setText(r10)
            if (r29 == 0) goto L65c
            android.graphics.Typeface r2 = defpackage.xn.a
            if (r2 == 0) goto L65b
            int r7 = com.google.android.material.appbar.C0049.f49
            int r8 = androidx.core.content.C0024.f24
            int r8 = r8 / (-5200)
            int r7 = r7 - r8
            if (r7 > 0) goto L145
            r7 = 81
            defpackage.C0071.f71 = r7
            java.lang.String r7 = "۟ۨ۟"
            int r8 = androidx.appcompat.widget.C0016.m65(r7)
            r7 = r2
            r31 = r8
            goto L32
        L145:
            java.lang.String r8 = "ۣ۠ۨ"
            r7 = r2
            r9 = r6
            goto Le8
        L14a:
            int r2 = defpackage.ff.q(r22)
            int r8 = defpackage.ff.q(r22)
            int r9 = defpackage.ff.q(r22)
            int r31 = defpackage.ff.q(r22)
            r0 = r31
            r12.setPadding(r2, r8, r9, r0)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r8 = 1098907648(0x41800000, float:16.0)
            float r8 = defpackage.ff.p(r8)
            r2.setCornerRadius(r8)
            r12.setBackground(r2)
            int r2 = com.google.android.material.theme.C0063.f63
            if (r2 > 0) goto L17e
            java.lang.String r2 = "۟۟ۡ"
            int r2 = com.google.android.material.internal.C0061.m246(r2)
            r31 = r2
            goto L32
        L17e:
            java.lang.String r2 = "ۦ۠ۡ"
            r8 = r2
        L181:
            int r2 = com.github.megatronking.stringfog.annotation.C0044.m176(r8)
            r31 = r2
            goto L32
        L189:
            r15.setTypeface(r16)
            int r2 = androidx.coordinatorlayout.widget.C0022.m88()
            if (r2 > 0) goto L1a0
            r2 = 14
            com.google.android.material.carousel.C0054.f54 = r2
            java.lang.String r2 = "ۨۦۨ"
            int r2 = com.google.android.material.chip.C0057.m229(r2)
            r31 = r2
            goto L32
        L1a0:
            int r2 = com.github.megatronking.stringfog.xor.C0045.f45
            int r8 = androidx.savedstate.C0035.f35
            r2 = r2 ^ r8
            r8 = -1750430(0xffffffffffe54a62, float:NaN)
            r2 = r2 ^ r8
            r31 = r2
            goto L32
        L1ad:
            int r2 = com.google.android.material.bottomsheet.C0051.f51
            r2 = r2 ^ 176(0xb0, float:2.47E-43)
            r0 = r25
            r0.setTextColor(r2)
            r2 = 1098907648(0x41800000, float:16.0)
            r0 = r25
            r0.setTextSize(r2)
            int r2 = com.github.megatronking.stringfog.xor.C0046.f46
            r2 = r2 ^ 365(0x16d, float:5.11E-43)
            r0 = r25
            r0.setGravity(r2)
            int r2 = com.google.android.material.carousel.C0055.f55
            r2 = r2 ^ (-607(0xfffffffffffffda1, float:NaN))
        L1ca:
            java.lang.String r8 = "ۤۥ۠"
            r17 = r2
            goto L181
        L1cf:
            int r2 = com.google.android.material.datepicker.C0059.f59
            if (r2 < 0) goto L1e5
            r2 = 67
            androidx.constraintlayout.widget.C0018.f18 = r2
            r2 = r10
            r8 = r12
        L1d9:
            java.lang.String r9 = "۟۠ۧ"
            int r9 = androidx.constraintlayout.helper.widget.C0017.m70(r9)
            r10 = r2
            r13 = r8
            r31 = r9
            goto L32
        L1e5:
            r13 = r12
        L1e6:
            java.lang.String r2 = "ۤ۠ۥ"
            int r2 = com.google.android.material.carousel.C0055.m220(r2)
            r31 = r2
            goto L32
        L1f0:
            int r2 = androidx.recyclerview.widget.C0032.f32
            int r8 = androidx.core.content.C0023.f23
            int r8 = r8 + 1562
            r2 = r2 | r8
            if (r2 < 0) goto L207
            com.google.android.material.theme.C0062.m248()
            java.lang.String r2 = "ۥۥۥ"
            int r2 = com.google.android.material.appbar.C0049.m197(r2)
            r10 = r11
            r31 = r2
            goto L32
        L207:
            r2 = r11
            r8 = r13
            goto L1d9
        L20a:
            java.lang.String r2 = "9Q==\n"
            java.lang.String r8 = "yvLk+BDKWx8=\n"
            java.lang.String r8 = "?"
            int r2 = androidx.savedstate.C0034.f34
            if (r2 < 0) goto L226
            r2 = 40
            androidx.core.widget.C0025.f25 = r2
            java.lang.String r2 = "۠۟ۢ"
            int r2 = androidx.lifecycle.C0029.m116(r2)
            r20 = r8
            r31 = r2
            goto L32
        L226:
            r2 = r19
            r9 = r22
        L22a:
            java.lang.String r19 = "ۤ۟ۡ"
            int r31 = io.fastkv.C0068.m272(r19)
            r19 = r2
            r20 = r8
            r22 = r9
            goto L32
        L238:
            r15.setTextColor(r6)
            r0 = r25
            r13.addView(r0)
            r0 = r27
            r13.addView(r0)
            r13.addView(r15)
            int r2 = com.google.android.material.theme.C0063.f63
            if (r2 > 0) goto L25b
            com.google.android.material.datepicker.C0059.m236()
            r2 = r14
        L250:
            java.lang.String r8 = "ۣۢۧ"
            int r8 = androidx.emoji2.text.C0026.m105(r8)
            r14 = r2
            r31 = r8
            goto L32
        L25b:
            int r2 = com.github.megatronking.stringfog.xor.C0045.f45
            int r8 = androidx.versionedparcelable.C0040.f40
            int r2 = r2 / r8
            r8 = 1748676(0x1aaec4, float:2.450417E-39)
            int r2 = r2 + r8
            r31 = r2
            goto L32
        L268:
            java.lang.String r2 = "ۢۥۨ"
            r8 = r2
        L26b:
            int r2 = com.google.android.material.carousel.C0052.m209(r8)
            r31 = r2
            goto L32
        L273:
            int r2 = androidx.activity.result.C0009.m36()
            if (r2 < 0) goto L283
            java.lang.String r2 = "ۦۥ۟"
            int r2 = com.github.megatronking.stringfog.C0048.m193(r2)
            r31 = r2
            goto L32
        L283:
            int r2 = androidx.versionedparcelable.C0038.f38
            int r8 = androidx.constraintlayout.helper.widget.C0017.f17
            int r2 = r2 + r8
            r8 = 1752873(0x1abf29, float:2.456298E-39)
            r2 = r2 ^ r8
            r31 = r2
            goto L32
        L290:
            r2 = 0
            r8 = 1
            r0 = r25
            r0.setTypeface(r2, r8)
            int r2 = androidx.coordinatorlayout.widget.C0021.f21
            int r8 = android.view.C0007.f7
            int r8 = r8 / (-2263)
            r2 = r2 | r8
            if (r2 < 0) goto L2ad
            androidx.core.widget.C0025.m103()
            java.lang.String r2 = "ۣۤۡ"
            int r2 = com.github.megatronking.stringfog.C0047.m189(r2)
            r31 = r2
            goto L32
        L2ad:
            int r2 = kotlinx.coroutines.C0070.f70
            int r8 = androidx.constraintlayout.widget.C0020.f20
            r2 = r2 ^ r8
            r8 = -57015(0xffffffffffff2149, float:NaN)
            r2 = r2 ^ r8
            r31 = r2
            goto L32
        L2ba:
            int r2 = android.app.C0001.f1
            int r8 = defpackage.C0073.f73
            int r8 = r8 + (-3938)
            int r2 = r2 + r8
            if (r2 < 0) goto L2d6
            androidx.savedstate.C0036.m147()
            java.lang.String r9 = "ۣ۠ۤ"
            r2 = r15
            r8 = r16
        L2cb:
            int r9 = com.google.android.material.carousel.C0054.m219(r9)
            r15 = r2
            r16 = r8
            r31 = r9
            goto L32
        L2d6:
            int r2 = androidx.savedstate.C0034.f34
            int r8 = androidx.constraintlayout.helper.widget.C0017.f17
            int r2 = r2 * r8
            r8 = 2422901(0x24f875, float:3.395207E-39)
            int r2 = r2 + r8
            r31 = r2
            goto L32
        L2e3:
            r2 = r15
            r8 = r16
        L2e6:
            java.lang.String r9 = "ۣۥۥ"
            goto L2cb
        L2e9:
            int r2 = androidx.constraintlayout.widget.C0019.f19
            int r8 = androidx.versionedparcelable.C0040.f40
            int r8 = r8 * (-9696)
            r2 = r2 ^ r8
            if (r2 < 0) goto L302
            r2 = 93
            androidx.versionedparcelable.C0041.f41 = r2
            java.lang.String r2 = "۠ۦۦ"
            int r2 = androidx.appcompat.widget.C0015.m60(r2)
            r31 = r2
            r21 = r14
            goto L32
        L302:
            java.lang.String r2 = "ۢۥۨ"
            int r2 = android.app.C0002.m8(r2)
            r31 = r2
            r21 = r14
            goto L32
        L30e:
            int r2 = androidx.versionedparcelable.C0042.f42
            if (r2 < 0) goto L317
            io.fastkv.C0068.m273()
            goto L1e6
        L317:
            int r2 = io.fastkv.C0068.f68
            int r8 = androidx.viewpager2.adapter.C0043.f43
            int r2 = r2 % r8
            r8 = 1755625(0x1ac9e9, float:2.460155E-39)
            int r2 = r2 + r8
            r31 = r2
            goto L32
        L324:
            java.util.Locale r2 = java.util.Locale.ROOT
            r0 = r26
            java.lang.String r28 = r0.toUpperCase(r2)
            java.lang.String r2 = "sd0nks66Hn2kwRfKkPFCFw==\n"
            java.lang.String r8 = "xbJy4r7fbD4=\n"
            java.lang.String r2 = "toUpperCase(...)"
            r0 = r28
            defpackage.ip.n(r2, r0)
            int r2 = defpackage.C0071.m284()
            if (r2 < 0) goto L34c
            androidx.legacy.content.C0028.m112()
            java.lang.String r2 = "ۤۥۨ"
            int r2 = com.ljx.wechatmod.ui.C0067.m271(r2)
            r31 = r2
            goto L32
        L34c:
            int r2 = com.google.android.material.carousel.C0055.f55
            int r8 = kotlinx.coroutines.C0070.f70
            int r2 = r2 % r8
            r8 = -1749735(0xffffffffffe54d19, float:NaN)
            r2 = r2 ^ r8
            r31 = r2
            goto L32
        L359:
            int r2 = android.app.C0003.f3
            int r8 = com.ljx.wechatmod.auth.C0065.f65
            int r8 = r8 % 67
            int r2 = r2 - r8
            if (r2 > 0) goto L36c
            java.lang.String r2 = "ۢۢۢ"
        L364:
            int r2 = android.app.C0003.m13(r2)
            r31 = r2
            goto L32
        L36c:
            int r2 = androidx.appcompat.widget.C0014.f14
            int r8 = androidx.constraintlayout.widget.C0018.f18
            r2 = r2 | r8
            r8 = 1752092(0x1abc1c, float:2.455204E-39)
            int r2 = r2 + r8
            r31 = r2
            goto L32
        L379:
            android.widget.TextView r2 = new android.widget.TextView
            r0 = r19
            r2.<init>(r0)
            java.lang.String r8 = "uWaU\n"
            java.lang.String r9 = "V8svz9LjGvo=\n"
            java.lang.String r8 = "\ueb7b"
            r2.setText(r8)
            android.graphics.Typeface r8 = defpackage.xn.a
            if (r8 == 0) goto L2e6
            int r9 = kotlinx.coroutines.C0069.f69
            if (r9 < 0) goto L3a4
            r9 = 47
            androidx.appcompat.widget.C0016.f16 = r9
            java.lang.String r9 = "ۡۥۤ"
            int r9 = com.github.megatronking.stringfog.C0048.m193(r9)
            r15 = r2
            r16 = r8
            r31 = r9
            goto L32
        L3a4:
            int r9 = com.google.android.material.datepicker.C0058.f58
            int r15 = defpackage.C0073.f73
            r9 = r9 ^ r15
            r15 = 1745895(0x1aa3e7, float:2.44652E-39)
            int r9 = r9 + r15
            r15 = r2
            r16 = r8
            r31 = r9
            goto L32
        L3b4:
            int r2 = androidx.appcompat.app.C0012.f12
            int r8 = androidx.savedstate.C0036.f36
            int r8 = r8 % 5928
            int r2 = r2 / r8
            if (r2 == 0) goto L3ca
            com.google.android.material.floatingactionbutton.C0060.m240()
            java.lang.String r2 = "ۥۨ"
            int r2 = androidx.constraintlayout.widget.C0019.m79(r2)
            r31 = r2
            goto L32
        L3ca:
            java.lang.String r2 = "ۦۥ۟"
            goto L364
        L3cd:
            java.lang.String r2 = "۟ۨ۟"
            int r2 = defpackage.C0073.m292(r2)
            r31 = r2
            goto L32
        L3d7:
            r2 = 0
            int r8 = com.google.android.material.internal.C0061.f61
            int r9 = androidx.activity.result.C0008.f8
            int r9 = r9 % 2030
            r8 = r8 | r9
            if (r8 < 0) goto L250
            com.ljx.wechatmod.ui.C0067.m269()
            java.lang.String r8 = "ۢۦ"
            int r8 = androidx.savedstate.C0034.m138(r8)
            r14 = r2
            r31 = r8
            goto L32
        L3ef:
            r0 = r25
            r0.setTypeface(r7)
            int r2 = androidx.lifecycle.C0029.f29
            int r8 = com.google.android.material.internal.C0061.f61
            int r8 = r8 * 9444
            int r2 = r2 % r8
            if (r2 < 0) goto L10b
            r2 = 11
            androidx.versionedparcelable.C0042.f42 = r2
            java.lang.String r2 = "ۦۧۨ"
            int r2 = android.support.v4.graphics.drawable.C0004.m16(r2)
            r31 = r2
            goto L32
        L40b:
            int r2 = android.support.v4.graphics.drawable.C0005.f5
            if (r2 > 0) goto L419
            r2 = 42
            defpackage.C0072.f72 = r2
            r2 = r17
            r6 = r18
            goto L1ca
        L419:
            int r2 = com.google.android.material.bottomsheet.C0051.f51
            int r6 = com.google.android.material.theme.C0062.f62
            r2 = r2 | r6
            r6 = -1755419(0xffffffffffe536e5, float:NaN)
            r2 = r2 ^ r6
            r31 = r2
            r6 = r18
            goto L32
        L428:
            r5 = 0
            r0 = r32
            android.app.Activity r2 = r0.b
            int r8 = defpackage.C0072.f72
            r9 = r8 ^ (-627(0xfffffffffffffd8d, float:NaN))
            int r8 = androidx.fragment.app.C0027.f27
            int r13 = androidx.recyclerview.widget.C0032.f32
            int r13 = r13 + 4783
            r8 = r8 ^ r13
            if (r8 < 0) goto L444
            r8 = 24
            androidx.savedstate.C0034.f34 = r8
            r8 = r20
            r13 = r21
            goto L22a
        L444:
            int r8 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r13 = androidx.fragment.app.C0027.f27
            r8 = r8 ^ r13
            r13 = 1751807(0x1abaff, float:2.454804E-39)
            int r8 = r8 + r13
            r19 = r2
            r13 = r21
            r22 = r9
            r31 = r8
            goto L32
        L457:
            int[] r2 = defpackage.xc.a
            r0 = r24
            java.lang.String r8 = r0.a
            int r8 = r8.hashCode()
            int r8 = java.lang.Math.abs(r8)
            int r9 = r2.length
            int r8 = r8 % r9
            r8 = r2[r8]
            android.widget.TextView r2 = new android.widget.TextView
            r0 = r19
            r2.<init>(r0)
            int r9 = androidx.recyclerview.widget.C0033.f33
            int r10 = com.ljx.wechatmod.ui.C0067.f67
            int r10 = r10 + (-4998)
            int r9 = r9 % r10
            if (r9 > 0) goto L48d
            r9 = 27
            com.google.android.material.internal.C0061.f61 = r9
            java.lang.String r9 = "ۣۨۢ"
            int r9 = androidx.versionedparcelable.C0040.m160(r9)
            r25 = r2
            r10 = r28
            r30 = r8
            r31 = r9
            goto L32
        L48d:
            int r9 = com.google.android.material.bottomsheet.C0051.f51
            int r10 = com.github.megatronking.stringfog.xor.C0046.f46
            int r9 = r9 % r10
            r10 = 1751864(0x1abb38, float:2.454884E-39)
            int r9 = r9 + r10
            r25 = r2
            r10 = r28
            r30 = r8
            r31 = r9
            goto L32
        L4a0:
            r13.removeAllViews()
            int r2 = r23.length()
            if (r2 <= 0) goto L599
            r2 = 0
            r8 = 1
            r0 = r23
            java.lang.String r2 = r0.substring(r2, r8)
            java.lang.String r8 = "Vi2xWdIHrP1CcP0EiFw=\n"
            java.lang.String r9 = "JVjTKqZ1xZM=\n"
            java.lang.String r8 = "substring(...)"
            defpackage.ip.n(r8, r2)
            int r8 = androidx.constraintlayout.widget.C0019.f19
            int r9 = kotlinx.coroutines.C0070.f70
            int r8 = r8 * r9
            r8 = r8 ^ 25519(0x63af, float:3.576E-41)
            r26 = r2
            r31 = r8
            goto L32
        L4c9:
            r0 = r30
            r3.setColor(r0)
            r2 = 1
            r3.setShape(r2)
            r0 = r25
            r0.setBackground(r3)
            android.widget.TextView r2 = new android.widget.TextView
            r0 = r19
            r2.<init>(r0)
            int r8 = com.ljx.wechatmod.ui.C0067.m269()
            if (r8 > 0) goto L4f3
            androidx.appcompat.widget.C0016.m66()
            java.lang.String r8 = "ۣۤۢ"
            int r8 = com.google.android.material.chip.C0057.m229(r8)
            r27 = r2
            r31 = r8
            goto L32
        L4f3:
            java.lang.String r8 = "ۤۦۣ"
            int r8 = androidx.appcompat.widget.C0015.m60(r8)
            r27 = r2
            r31 = r8
            goto L32
        L4ff:
            r0 = r32
            java.util.ArrayList r2 = r0.a
            r0 = r33
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r8 = "c+pRmlbfliM=\n"
            java.lang.String r9 = "FI8lsnjxuAo=\n"
            java.lang.String r8 = "get(...)"
            defpackage.ip.n(r8, r2)
            uc r2 = (defpackage.uc) r2
            boolean r8 = r2.c
            int r9 = androidx.savedstate.C0034.f34
            if (r9 < 0) goto L52a
            java.lang.String r9 = "ۢۡۢ"
            int r9 = android.app.C0000.m2(r9)
            r24 = r2
            r29 = r8
            r31 = r9
            goto L32
        L52a:
            int r9 = android.app.C0000.f0
            int r24 = android.support.v4.graphics.drawable.C0004.f4
            r9 = r9 | r24
            r24 = 56487(0xdca7, float:7.9155E-41)
            int r9 = r9 + r24
            r24 = r2
            r29 = r8
            r31 = r9
            goto L32
        L53d:
            if (r29 == 0) goto L2ba
            java.lang.String r2 = "m9/k\n"
            java.lang.String r8 = "dFxXrxjforA=\n"
            java.lang.String r11 = "\uf0f3"
            int r2 = androidx.appcompat.widget.C0014.f14
            int r8 = com.google.android.material.chip.C0056.f56
            int r8 = r8 / 593
            r2 = r2 | r8
            if (r2 < 0) goto L55d
            r2 = 3
            com.github.megatronking.stringfog.xor.C0046.f46 = r2
            java.lang.String r2 = "ۤۨۡ"
            int r2 = androidx.versionedparcelable.C0038.m153(r2)
            r31 = r2
            goto L32
        L55d:
            int r2 = android.app.C0003.f3
            int r8 = androidx.versionedparcelable.C0042.f42
            int r2 = r2 + r8
            r8 = 1753671(0x1ac247, float:2.457416E-39)
            int r2 = r2 + r8
            r31 = r2
            goto L32
        L56a:
            r2 = 1102053376(0x41b00000, float:22.0)
            r15.setTextSize(r2)
            r0 = r24
            boolean r2 = r0.d
            if (r2 == 0) goto Ld6
            int r0 = r4.g
            r18 = r0
            int r2 = com.github.megatronking.stringfog.annotation.C0044.f44
            if (r2 > 0) goto L58b
            com.google.android.material.carousel.C0053.m214()
            java.lang.String r2 = "ۥۥۦ"
            int r2 = com.google.android.material.theme.C0064.m258(r2)
            r31 = r2
            r6 = r5
            goto L32
        L58b:
            int r2 = androidx.constraintlayout.helper.widget.C0017.f17
            int r6 = com.google.android.material.chip.C0056.f56
            int r2 = r2 % r6
            r6 = 1747893(0x1aabb5, float:2.44932E-39)
            r2 = r2 ^ r6
            r31 = r2
            r6 = r5
            goto L32
        L599:
            int r2 = androidx.core.content.C0023.f23
            int r8 = androidx.emoji2.text.C0026.f26
            int r8 = r8 + (-7199)
            int r2 = r2 + r8
            if (r2 < 0) goto L5b0
            r2 = 43
            android.support.v4.graphics.drawable.C0005.f5 = r2
            java.lang.String r2 = "ۢۡۥ"
            int r2 = androidx.appcompat.widget.C0015.m60(r2)
            r31 = r2
            goto L32
        L5b0:
            int r2 = android.support.v4.graphics.drawable.C0005.f5
            int r8 = com.google.android.material.carousel.C0053.f53
            r2 = r2 ^ r8
            r8 = 1752563(0x1abdf3, float:2.455864E-39)
            int r2 = r2 + r8
            r31 = r2
            goto L32
        L5bd:
            java.lang.String r2 = "ۦۥ۟"
            int r2 = androidx.viewpager2.adapter.C0043.m173(r2)
            r28 = r20
            r31 = r2
            goto L32
        L5c9:
            r0 = r24
            java.lang.String r8 = r0.b
            r0 = r34
            boolean r2 = r0 instanceof android.widget.LinearLayout
            if (r2 == 0) goto L609
            r2 = r34
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            int r9 = androidx.constraintlayout.widget.C0019.f19
            int r21 = androidx.appcompat.widget.C0016.f16
            int r9 = r9 * r21
            r21 = 1703323(0x19fd9b, float:2.386864E-39)
            int r9 = r9 + r21
            r23 = r8
            r31 = r9
            r21 = r2
            goto L32
        L5ea:
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            int r3 = defpackage.ff.q(r17)
            int r8 = defpackage.ff.q(r17)
            r2.<init>(r3, r8)
            int r3 = defpackage.ff.q(r22)
            r2.rightMargin = r3
            r0 = r25
            r0.setLayoutParams(r2)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            goto Lbe
        L609:
            r2 = r8
        L60a:
            int r8 = com.github.megatronking.stringfog.xor.C0045.f45
            int r9 = com.google.android.material.carousel.C0054.f54
            int r9 = r9 * (-1885)
            int r8 = r8 + r9
            if (r8 < 0) goto L619
            java.lang.String r8 = "ۣۢۤ"
            r23 = r2
            goto L26b
        L619:
            int r8 = androidx.versionedparcelable.C0041.f41
            int r9 = androidx.versionedparcelable.C0039.f39
            int r8 = r8 + r9
            r9 = 1749721(0x1ab2d9, float:2.451881E-39)
            int r8 = r8 + r9
            r23 = r2
            r31 = r8
            goto L32
        L628:
            y5 r2 = new y5
            int r8 = androidx.core.content.C0024.f24
            r8 = r8 ^ 1
            r0 = r24
            r1 = r32
            r2.<init>(r0, r8, r1)
            r13.setOnClickListener(r2)
            java.lang.String r2 = "ۤۨۡ"
            int r2 = defpackage.C0073.m292(r2)
            r31 = r2
            goto L32
        L642:
            int r2 = androidx.legacy.content.C0028.f28
            if (r2 < 0) goto L654
            r2 = 68
            android.view.C0007.f7 = r2
            java.lang.String r2 = "ۡۥ۟"
            int r2 = androidx.core.widget.C0025.m102(r2)
            r31 = r2
            goto L32
        L654:
            java.lang.String r9 = "ۢۦ"
            r2 = r15
            r8 = r16
            goto L2cb
        L65b:
            r7 = r2
        L65c:
            int r2 = androidx.constraintlayout.widget.C0020.f20
            int r8 = androidx.savedstate.C0036.f36
            int r8 = r8 / 7018
            r2 = r2 | r8
            if (r2 < 0) goto L66e
            androidx.appcompat.widget.C0015.m61()
            java.lang.String r2 = "ۢ۠ۡ"
            r8 = r2
            r9 = r6
            goto Lf5
        L66e:
            int r2 = androidx.versionedparcelable.C0038.f38
            int r8 = kotlinx.coroutines.C0069.f69
            int r2 = r2 * r8
            r8 = 1735828(0x1a7c94, float:2.432413E-39)
            int r2 = r2 + r8
            r31 = r2
            goto L32
        L67b:
            return r13
        L67c:
            r2 = r6
            goto Ld7
        L67f:
            r2 = r23
            goto L60a
    }
}
