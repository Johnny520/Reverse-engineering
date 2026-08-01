package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vn implements android.widget.SeekBar.OnSeekBarChangeListener {
    public final android.widget.TextView a;
    public final java.lang.String b;
    public final defpackage.sm c;
    public final android.widget.SeekBar d;

    public vn(android.widget.TextView r5, java.lang.String r6, defpackage.sm r7, android.widget.SeekBar r8) {
            r4 = this;
            r4.<init>()
            r0 = 0
            java.lang.String r2 = "۠۟۠"
            int r2 = com.github.megatronking.stringfog.xor.C0045.m182(r2)
        Lb:
            switch(r2) {
                case 56290: goto Lf;
                case 1746687: goto L21;
                case 1746843: goto La4;
                case 1747649: goto L8a;
                case 1747746: goto L2d;
                case 1747811: goto L4b;
                case 1750629: goto L80;
                case 1751679: goto Lca;
                case 1752555: goto L58;
                case 1753480: goto Lb7;
                default: goto Le;
            }
        Le:
            goto Lb
        Lf:
            r4.c = r7
            int r2 = com.ljx.wechatmod.hook.C0066.m265()
            if (r2 > 0) goto La0
            androidx.coordinatorlayout.widget.C0021.m84()
            java.lang.String r2 = "ۤۥ۠"
        L1c:
            int r2 = com.google.android.material.carousel.C0055.m220(r2)
            goto Lb
        L21:
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
            java.lang.String r2 = "ۤۥ۠"
            int r2 = com.google.android.material.appbar.C0049.m197(r2)
            goto Lb
        L2d:
            int r2 = androidx.activity.C0010.m40()
            if (r2 < 0) goto L80
            int r2 = androidx.recyclerview.widget.C0032.f32
            if (r2 < 0) goto L41
            androidx.versionedparcelable.C0040.m162()
        L3a:
            java.lang.String r2 = "۟ۡ"
            int r2 = androidx.emoji2.text.C0026.m105(r2)
            goto Lb
        L41:
            int r2 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r3 = com.google.android.material.theme.C0063.f63
            int r2 = r2 * r3
            r3 = 1726995(0x1a5a13, float:2.420035E-39)
            int r2 = r2 + r3
            goto Lb
        L4b:
            r4.b = r6
            int r2 = androidx.startup.C0037.f37
            if (r2 < 0) goto L3a
            java.lang.String r2 = "۟۟۟"
            int r2 = com.github.megatronking.stringfog.C0048.m193(r2)
            goto Lb
        L58:
            java.lang.String r0 = "xWy2t2y4BoXV7Bb2fSDpY"
            java.lang.String r0 = com.google.android.material.datepicker.C0059.m237(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            int r2 = androidx.versionedparcelable.C0038.f38
            int r3 = androidx.versionedparcelable.C0039.f39
            int r3 = r3 * (-6869)
            int r2 = r2 / r3
            if (r2 == 0) goto L76
            r2 = 77
            androidx.coordinatorlayout.widget.C0021.f21 = r2
        L6f:
            java.lang.String r2 = "۠ۢۤ"
            int r2 = androidx.appcompat.widget.C0015.m60(r2)
            goto Lb
        L76:
            int r2 = com.ljx.wechatmod.ui.C0067.f67
            int r3 = androidx.coordinatorlayout.widget.C0022.f22
            r2 = r2 ^ r3
            r3 = 1745780(0x1aa374, float:2.446359E-39)
            int r2 = r2 + r3
            goto Lb
        L80:
            int r2 = androidx.versionedparcelable.C0038.f38
            int r3 = com.google.android.material.internal.C0061.f61
            r2 = r2 ^ r3
            r3 = 1751856(0x1abb30, float:2.454873E-39)
            int r2 = r2 + r3
            goto Lb
        L8a:
            r4.a = r5
            int r2 = androidx.versionedparcelable.C0042.f42
            int r3 = com.ljx.wechatmod.ui.C0067.f67
            int r3 = r3 % 4654
            r2 = r2 ^ r3
            if (r2 > 0) goto L9d
            java.lang.String r2 = "۠ۤۧ"
        L97:
            int r2 = com.google.android.material.floatingactionbutton.C0060.m241(r2)
            goto Lb
        L9d:
            java.lang.String r2 = "۠ۤۧ"
            goto L97
        La0:
            java.lang.String r2 = "ۦۣۡ"
            goto L1c
        La4:
            int r2 = androidx.legacy.content.C0028.f28
            if (r2 < 0) goto Lb4
            r2 = 19
            androidx.startup.C0037.f37 = r2
            java.lang.String r2 = "ۨ۟ۨ"
        Lae:
            int r2 = com.google.android.material.theme.C0064.m258(r2)
            goto Lb
        Lb4:
            java.lang.String r2 = "۠۟۠"
            goto Lae
        Lb7:
            r4.d = r8
            int r2 = com.ljx.wechatmod.auth.C0065.f65
            int r3 = androidx.savedstate.C0034.f34
            int r3 = r3 * 3450
            r2 = r2 ^ r3
            if (r2 > 0) goto L6f
            java.lang.String r2 = "ۦۣۡ"
            int r2 = androidx.coordinatorlayout.widget.C0022.m90(r2)
            goto Lb
        Lca:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar r6, int r7, boolean r8) {
            r5 = this;
            r1 = 0
            r4 = 72
            java.lang.String r0 = "ۧۡ۠"
            int r3 = androidx.coordinatorlayout.widget.C0021.m86(r0)
            r0 = r1
            r2 = r1
        Lb:
            switch(r3) {
                case 1747747: goto Lf;
                case 1748705: goto L10d;
                case 1748893: goto L65;
                case 1750563: goto L8c;
                case 1750625: goto Lf7;
                case 1750633: goto L27;
                case 1750818: goto Lad;
                case 1752582: goto L1d;
                case 1754438: goto Le2;
                case 1754445: goto Lcf;
                case 1754504: goto L45;
                case 1754569: goto La1;
                case 1755405: goto L82;
                case 1755524: goto Lc3;
                default: goto Le;
            }
        Le:
            goto Lb
        Lf:
            int r1 = com.github.megatronking.stringfog.annotation.C0044.m178()
            if (r1 < 0) goto Lc3
        L15:
            java.lang.String r1 = "ۣۢ۠"
            int r1 = androidx.versionedparcelable.C0040.m160(r1)
            r3 = r1
            goto Lb
        L1d:
            if (r8 == 0) goto L82
            java.lang.String r1 = "ۣۢۨ"
        L21:
            int r1 = androidx.viewpager2.adapter.C0043.m173(r1)
            r3 = r1
            goto Lb
        L27:
            gn r1 = defpackage.gn.a
            r1.getClass()
            int r1 = androidx.recyclerview.widget.C0032.f32
            if (r1 < 0) goto L3c
            r1 = 57
            com.google.android.material.chip.C0056.f56 = r1
            java.lang.String r1 = "ۧۡۧ"
            int r1 = com.google.android.material.floatingactionbutton.C0060.m241(r1)
            r3 = r1
            goto Lb
        L3c:
            java.lang.String r3 = "ۣ۠۠"
            r1 = r2
        L3f:
            int r3 = androidx.appcompat.widget.C0013.m53(r3)
            r2 = r1
            goto Lb
        L45:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2.f(r1)
            int r1 = com.google.android.material.carousel.C0054.f54
            if (r1 > 0) goto L5a
            defpackage.C0071.f71 = r4
            java.lang.String r1 = "ۨۥۡ"
            int r1 = com.google.android.material.chip.C0056.m226(r1)
            r3 = r1
            goto Lb
        L5a:
            int r1 = androidx.constraintlayout.widget.C0020.f20
            int r3 = androidx.constraintlayout.widget.C0018.f18
            r1 = r1 ^ r3
            r3 = 1747796(0x1aab54, float:2.449184E-39)
            int r1 = r1 + r3
            r3 = r1
            goto Lb
        L65:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = com.google.android.material.chip.C0056.f56
            if (r1 < 0) goto L7a
            r1 = 64
            androidx.lifecycle.C0029.f29 = r1
            java.lang.String r1 = "ۡۨۤ"
            int r1 = com.google.android.material.floatingactionbutton.C0060.m241(r1)
            r3 = r1
            goto Lb
        L7a:
            java.lang.String r1 = "ۡۢۢ"
            int r1 = androidx.fragment.app.C0027.m110(r1)
            r3 = r1
            goto Lb
        L82:
            int r1 = com.google.android.material.theme.C0063.f63
            if (r1 > 0) goto L89
            java.lang.String r1 = "ۥۨ۠"
            goto L21
        L89:
            java.lang.String r1 = "۠ۢۥ"
            goto L21
        L8c:
            java.lang.String r1 = r5.b
            defpackage.gn.g(r1, r7)
            int r1 = androidx.appcompat.widget.C0015.f15
            if (r1 < 0) goto L9e
            java.lang.String r1 = "ۣۢۨ"
        L97:
            int r1 = com.google.android.material.theme.C0063.m254(r1)
            r3 = r1
            goto Lb
        L9e:
            java.lang.String r1 = "ۧۡۧ"
            goto L21
        La1:
            int r1 = com.google.android.material.bottomsheet.C0051.f51
            int r3 = kotlinx.coroutines.C0070.f70
            int r1 = r1 - r3
            r3 = 1755142(0x1ac806, float:2.459478E-39)
            int r1 = r1 + r3
            r3 = r1
            goto Lb
        Lad:
            if (r2 == 0) goto L82
            int r1 = com.google.android.material.carousel.C0055.m223()
            if (r1 < 0) goto Lc0
            com.ljx.wechatmod.ui.C0067.f67 = r4
            java.lang.String r1 = "ۣ۠۠"
            int r1 = android.app.C0002.m8(r1)
            r3 = r1
            goto Lb
        Lc0:
            java.lang.String r1 = "ۣۧۤ"
            goto L97
        Lc3:
            int r1 = com.github.megatronking.stringfog.annotation.C0044.f44
            int r3 = com.google.android.material.carousel.C0055.f55
            r1 = r1 | r3
            r3 = -1748214(0xffffffffffe5530a, float:NaN)
            r1 = r1 ^ r3
            r3 = r1
            goto Lb
        Lcf:
            sm r1 = r5.c
            int r2 = androidx.profileinstaller.C0031.f31
            int r3 = androidx.savedstate.C0036.f36
            int r3 = r3 / 3038
            r2 = r2 ^ r3
            if (r2 < 0) goto Ldd
            r2 = 4
            androidx.savedstate.C0035.f35 = r2
        Ldd:
            java.lang.String r2 = "ۣۨۧ"
            r3 = r2
            goto L3f
        Le2:
            android.widget.TextView r1 = r5.a
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r1.setText(r3)
            int r1 = com.google.android.material.chip.C0057.f57
            int r3 = androidx.legacy.content.C0028.f28
            int r1 = r1 - r3
            r3 = 1752714(0x1abe8a, float:2.456075E-39)
            r1 = r1 ^ r3
            r3 = r1
            goto Lb
        Lf7:
            java.lang.String r0 = "ZRSklD3hEHjgK9s"
            java.lang.String r0 = androidx.savedstate.C0035.m141(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = androidx.profileinstaller.C0031.f31
            int r3 = androidx.versionedparcelable.C0040.f40
            r3 = r3 | (-9468(0xffffffffffffdb04, float:NaN))
            int r1 = r1 % r3
            if (r1 >= 0) goto L15
            java.lang.String r1 = "ۡۨۤ"
            goto L97
        L10d:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar r2) {
            r1 = this;
            java.lang.String r0 = "ۣۥۧ"
            int r0 = androidx.activity.result.C0008.m35(r0)
        L6:
            switch(r0) {
                case 1750725: goto La;
                case 1753665: goto Lb;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            return
        Lb:
            int r0 = android.app.C0002.m10()
            if (r0 > 0) goto L1b
            defpackage.C0071.m284()
            java.lang.String r0 = "ۦۥۨ"
            int r0 = androidx.activity.C0011.m45(r0)
            goto L6
        L1b:
            java.lang.String r0 = "ۣۥۧ"
            int r0 = com.google.android.material.carousel.C0053.m213(r0)
            goto L6
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar r4) {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "ۥۧ۟"
            int r1 = defpackage.C0073.m292(r1)
        L7:
            switch(r1) {
                case 56475: goto Lb;
                case 1747871: goto L69;
                case 1750570: goto La6;
                case 1750781: goto L88;
                case 1751586: goto L23;
                case 1751683: goto L45;
                case 1752701: goto L3f;
                case 1754406: goto L7e;
                default: goto La;
            }
        La:
            goto L7
        Lb:
            android.widget.SeekBar r1 = r3.d
            int r2 = androidx.recyclerview.widget.C0033.f33
            r2 = r2 ^ 212(0xd4, float:2.97E-43)
            defpackage.gn.i(r1, r2)
            int r1 = androidx.activity.C0011.f11
            if (r1 < 0) goto L66
            r1 = 55
            androidx.constraintlayout.widget.C0020.f20 = r1
        L1c:
            java.lang.String r1 = "ۥ۠"
            int r1 = android.app.C0003.m13(r1)
            goto L7
        L23:
            int r1 = com.ljx.wechatmod.hook.C0066.m265()
            if (r1 > 0) goto L69
            int r1 = android.support.v4.graphics.drawable.C0005.f5
            if (r1 > 0) goto L38
            r1 = 65
            androidx.core.content.C0024.f24 = r1
            java.lang.String r1 = "ۥۧ۟"
            int r1 = androidx.activity.result.C0009.m38(r1)
            goto L7
        L38:
            java.lang.String r1 = "ۤۥۤ"
        L3a:
            int r1 = androidx.activity.result.C0009.m38(r1)
            goto L7
        L3f:
            gn r1 = defpackage.gn.a
            r1.getClass()
            goto L1c
        L45:
            java.lang.String r0 = "fp8LpRFx7CNgaIWDdw8JpLF0W"
            java.lang.String r0 = com.github.megatronking.stringfog.C0048.m195(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            int r1 = com.ljx.wechatmod.auth.C0065.m260()
            if (r1 > 0) goto L5f
            androidx.fragment.app.C0027.m111()
            java.lang.String r1 = "ۤۥۤ"
        L5a:
            int r1 = io.fastkv.C0068.m272(r1)
            goto L7
        L5f:
            java.lang.String r1 = "ۣۧۡ"
            int r1 = com.google.android.material.theme.C0063.m254(r1)
            goto L7
        L66:
            java.lang.String r1 = "ۤۢ۠"
            goto L5a
        L69:
            int r1 = com.ljx.wechatmod.auth.C0065.f65
            if (r1 < 0) goto L74
            r1 = 39
            io.fastkv.C0068.f68 = r1
            java.lang.String r1 = "ۢۧ"
            goto L3a
        L74:
            int r1 = androidx.constraintlayout.widget.C0018.f18
            int r2 = com.google.android.material.carousel.C0054.f54
            r1 = r1 ^ r2
            r2 = 1750017(0x1ab401, float:2.452296E-39)
            int r1 = r1 + r2
            goto L7
        L7e:
            int r1 = android.app.C0000.f0
            int r2 = com.google.android.material.floatingactionbutton.C0060.f60
            int r1 = r1 / r2
            r2 = 1752701(0x1abe7d, float:2.456057E-39)
            int r1 = r1 + r2
            goto L7
        L88:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = androidx.appcompat.widget.C0013.m52()
            if (r1 < 0) goto L9b
            java.lang.String r1 = "۠ۦۥ"
            int r1 = androidx.versionedparcelable.C0042.m170(r1)
            goto L7
        L9b:
            int r1 = com.google.android.material.chip.C0056.f56
            int r2 = androidx.activity.C0011.f11
            int r1 = r1 * r2
            r2 = 1685906(0x19b992, float:2.362457E-39)
            int r1 = r1 + r2
            goto L7
        La6:
            return
    }
}
