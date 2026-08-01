package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vc implements android.text.TextWatcher {
    public final defpackage.i00 a;
    public final java.util.ArrayList b;
    public final int c;
    public final java.util.ArrayList d;
    public final defpackage.wc e;
    public final defpackage.e00 f;

    public vc(int r4, defpackage.wc r5, defpackage.e00 r6, defpackage.i00 r7, java.util.ArrayList r8, java.util.ArrayList r9) {
            r3 = this;
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "ۡۤۧ"
            int r2 = com.github.megatronking.stringfog.xor.C0045.m182(r1)
            r1 = r0
        Lb:
            switch(r2) {
                case 56355: goto Lf;
                case 56506: goto Lac;
                case 1746820: goto L10;
                case 1746851: goto Lca;
                case 1746906: goto L1e;
                case 1748768: goto L40;
                case 1748772: goto L5b;
                case 1750598: goto L60;
                case 1750717: goto L8e;
                case 1750819: goto L82;
                case 1754598: goto L2e;
                case 1755560: goto L91;
                default: goto Le;
            }
        Le:
            goto Lb
        Lf:
            return
        L10:
            r3.e = r5
            int r0 = androidx.fragment.app.C0027.f27
            if (r0 < 0) goto La0
            java.lang.String r0 = "۟ۦۡ"
            int r0 = androidx.activity.C0010.m43(r0)
            r2 = r0
            goto Lb
        L1e:
            r3.d = r9
            int r0 = com.github.megatronking.stringfog.xor.C0045.m181()
            if (r0 > 0) goto L26
        L26:
            java.lang.String r0 = "ۣ۟ۨ"
        L28:
            int r0 = defpackage.C0072.m288(r0)
            r2 = r0
            goto Lb
        L2e:
            java.lang.String r0 = "oAW"
            java.lang.String r0 = androidx.activity.result.C0009.m37(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.String r1 = "ۣۡۤ"
            int r2 = androidx.recyclerview.widget.C0033.m132(r1)
            r1 = r0
            goto Lb
        L40:
            int r0 = androidx.constraintlayout.widget.C0019.f19
            if (r0 > 0) goto L50
            r0 = 28
            androidx.activity.result.C0008.f8 = r0
            java.lang.String r0 = "ۨۢۥ"
            int r0 = androidx.legacy.content.C0028.m114(r0)
            r2 = r0
            goto Lb
        L50:
            int r0 = com.google.android.material.datepicker.C0059.f59
            int r2 = androidx.activity.C0010.f10
            int r0 = r0 / r2
            r2 = 56354(0xdc22, float:7.8969E-41)
            r0 = r0 ^ r2
            r2 = r0
            goto Lb
        L5b:
            r3.a = r7
            java.lang.String r0 = "ۣۥ۟"
            goto L28
        L60:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = defpackage.C0071.f71
            int r2 = com.google.android.material.appbar.C0049.f49
            int r2 = r2 + (-776)
            r0 = r0 ^ r2
            if (r0 > 0) goto L7a
            r0 = 38
            androidx.recyclerview.widget.C0032.f32 = r0
            java.lang.String r0 = "۟ۤۨ"
            int r0 = androidx.activity.result.C0008.m35(r0)
            r2 = r0
            goto Lb
        L7a:
            java.lang.String r0 = "ۡۤ"
        L7c:
            int r0 = androidx.versionedparcelable.C0039.m159(r0)
            r2 = r0
            goto Lb
        L82:
            r3.f = r6
            int r0 = androidx.versionedparcelable.C0040.f40
            if (r0 > 0) goto L8b
        L88:
            java.lang.String r0 = "ۦ۠"
            goto L7c
        L8b:
            java.lang.String r0 = "ۨۦۦ"
            goto L28
        L8e:
            r3.b = r8
            goto L88
        L91:
            int r0 = android.support.v4.graphics.drawable.C0006.m24()
            if (r0 > 0) goto L40
            int r0 = com.github.megatronking.stringfog.C0048.m194()
            if (r0 > 0) goto La9
            com.google.android.material.carousel.C0052.m210()
        La0:
            java.lang.String r0 = "ۣۨۨ"
        La2:
            int r0 = com.google.android.material.carousel.C0054.m219(r0)
            r2 = r0
            goto Lb
        La9:
            java.lang.String r0 = "ۧۦۥ"
            goto La2
        Lac:
            r3.c = r4
            int r0 = androidx.savedstate.C0035.m143()
            if (r0 > 0) goto Lc1
            r0 = 97
            com.github.megatronking.stringfog.C0047.f47 = r0
            java.lang.String r0 = "ۡۤۧ"
            int r0 = com.github.megatronking.stringfog.xor.C0045.m182(r0)
            r2 = r0
            goto Lb
        Lc1:
            java.lang.String r0 = "۟ۦۡ"
            int r0 = com.github.megatronking.stringfog.xor.C0045.m182(r0)
            r2 = r0
            goto Lb
        Lca:
            int r0 = androidx.appcompat.widget.C0013.f13
            int r2 = androidx.constraintlayout.widget.C0020.f20
            r0 = r0 | r2
            r2 = -1748982(0xffffffffffe5500a, float:NaN)
            r0 = r0 ^ r2
            r2 = r0
            goto Lb
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r11) {
            r10 = this;
            r0 = 0
            java.lang.String r1 = "۠ۦۤ"
            int r4 = kotlinx.coroutines.C0069.m277(r1)
            r2 = r0
            r1 = r0
            r3 = r0
            r9 = r0
            r6 = r0
            r8 = r0
            r7 = r0
            r5 = r4
        Lf:
            switch(r5) {
                case 56413: goto L13;
                case 56542: goto L85;
                case 1746723: goto L67;
                case 1746785: goto L9c;
                case 1746939: goto L1d;
                case 1747744: goto Ld6;
                case 1747870: goto L56;
                case 1747873: goto L123;
                case 1748733: goto Ldf;
                case 1750562: goto L160;
                case 1750687: goto Lfc;
                case 1751501: goto L13b;
                case 1751525: goto L190;
                case 1751556: goto L171;
                case 1752673: goto L37;
                case 1753605: goto Lba;
                case 1754438: goto Lf8;
                case 1754439: goto Lba;
                case 1755398: goto L64;
                default: goto L12;
            }
        L12:
            goto Lf
        L13:
            if (r9 == 0) goto L171
            java.lang.String r0 = "ۥۦۢ"
        L17:
            int r0 = com.google.android.material.chip.C0057.m229(r0)
            r5 = r0
            goto Lf
        L1d:
            r3.b = r7
            int r0 = com.github.megatronking.stringfog.xor.C0046.f46
            if (r0 > 0) goto L2f
            r0 = 93
            androidx.activity.result.C0008.f8 = r0
            java.lang.String r0 = "۠ۦۧ"
            int r0 = com.google.android.material.carousel.C0052.m209(r0)
            r5 = r0
            goto Lf
        L2f:
            java.lang.String r0 = "ۧۥ"
        L31:
            int r0 = androidx.savedstate.C0034.m138(r0)
            r5 = r0
            goto Lf
        L37:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r9.toLowerCase(r0)
            int r4 = androidx.core.content.C0023.m92()
            if (r4 < 0) goto L4d
            r4 = r7
        L44:
            java.lang.String r5 = "ۣ۠۟"
            int r5 = com.github.megatronking.stringfog.annotation.C0044.m176(r5)
            r6 = r0
            r7 = r4
            goto Lf
        L4d:
            java.lang.String r4 = "۠ۦۧ"
            r6 = r0
        L50:
            int r0 = com.google.android.material.behavior.C0050.m203(r4)
            r5 = r0
            goto Lf
        L56:
            if (r11 == 0) goto L171
            int r0 = com.google.android.material.bottomsheet.C0051.f51
            if (r0 < 0) goto L75
        L5c:
            java.lang.String r0 = "ۤ۟ۨ"
            int r0 = com.google.android.material.chip.C0057.m229(r0)
            r5 = r0
            goto Lf
        L64:
            r0 = r6
            r4 = r8
            goto L44
        L67:
            int r0 = androidx.fragment.app.C0027.f27
            int r4 = androidx.savedstate.C0036.f36
            r4 = r4 ^ 254(0xfe, float:3.56E-43)
            int r0 = r0 / r4
            if (r0 == 0) goto L79
            r0 = 76
            com.google.android.material.carousel.C0052.f52 = r0
            r7 = r6
        L75:
            java.lang.String r0 = "ۣۤ۠"
            r4 = r0
            goto L50
        L79:
            int r0 = androidx.savedstate.C0034.f34
            int r4 = androidx.profileinstaller.C0030.f30
            r0 = r0 ^ r4
            r4 = 1748525(0x1aae2d, float:2.450205E-39)
            int r0 = r0 + r4
            r7 = r6
            r5 = r0
            goto Lf
        L85:
            wc r1 = r10.e
            int r0 = androidx.profileinstaller.C0030.f30
            int r4 = com.google.android.material.datepicker.C0058.f58
            r4 = r4 ^ (-1886(0xfffffffffffff8a2, float:NaN))
            int r0 = r0 * r4
            if (r0 < 0) goto L93
            androidx.fragment.app.C0027.m111()
        L93:
            java.lang.String r0 = "ۧۡ۠"
            int r0 = com.github.megatronking.stringfog.xor.C0045.m182(r0)
            r5 = r0
            goto Lf
        L9c:
            java.lang.String r8 = ""
            int r0 = com.google.android.material.chip.C0056.f56
            if (r0 < 0) goto Lae
            androidx.constraintlayout.helper.widget.C0017.m71()
        La5:
            java.lang.String r0 = "ۣ۟ۧ"
            int r0 = com.google.android.material.floatingactionbutton.C0060.m241(r0)
            r5 = r0
            goto Lf
        Lae:
            int r0 = androidx.core.content.C0023.f23
            int r4 = com.google.android.material.theme.C0063.f63
            int r0 = r0 / r4
            r4 = 1755390(0x1ac8fe, float:2.459825E-39)
            int r0 = r0 + r4
            r5 = r0
            goto Lf
        Lba:
            int r0 = kotlinx.coroutines.C0070.f70
            int r4 = com.google.android.material.internal.C0061.f61
            r4 = r4 | (-4716(0xffffffffffffed94, float:NaN))
            r0 = r0 ^ r4
            if (r0 < 0) goto Lca
            android.support.v4.graphics.drawable.C0004.m18()
            java.lang.String r0 = "ۥۣۨ"
            goto L17
        Lca:
            int r0 = com.ljx.wechatmod.hook.C0066.f66
            int r4 = androidx.appcompat.widget.C0015.f15
            int r0 = r0 * r4
            r4 = 2550386(0x26ea72, float:3.573852E-39)
            int r0 = r0 + r4
            r5 = r0
            goto Lf
        Ld6:
            java.lang.String r0 = "ۦۥۤ"
            int r0 = androidx.versionedparcelable.C0039.m159(r0)
            r5 = r0
            goto Lf
        Ldf:
            int r0 = androidx.versionedparcelable.C0039.f39
            int r4 = androidx.versionedparcelable.C0042.f42
            int r4 = r4 / 1681
            int r0 = r0 - r4
            if (r0 < 0) goto Lf5
            r0 = 29
            androidx.versionedparcelable.C0042.f42 = r0
            java.lang.String r0 = "۟ۨۤ"
        Lee:
            int r0 = androidx.viewpager2.adapter.C0043.m173(r0)
            r5 = r0
            goto Lf
        Lf5:
            java.lang.String r0 = "۠ۦۤ"
            goto Lee
        Lf8:
            e00 r2 = r10.f
            goto L5c
        Lfc:
            java.lang.String r0 = r11.toString()
            int r4 = android.support.v4.graphics.drawable.C0005.f5
            int r5 = androidx.constraintlayout.widget.C0019.f19
            int r5 = r5 / 5460
            r4 = r4 | r5
            if (r4 > 0) goto L116
            androidx.constraintlayout.widget.C0020.m82()
            java.lang.String r4 = "۠ۦۤ"
            int r4 = androidx.activity.C0011.m45(r4)
            r9 = r0
            r5 = r4
            goto Lf
        L116:
            int r4 = androidx.coordinatorlayout.widget.C0021.f21
            int r5 = android.support.v4.graphics.drawable.C0005.f5
            int r4 = r4 / r5
            r5 = 56417(0xdc61, float:7.9057E-41)
            int r4 = r4 + r5
            r9 = r0
            r5 = r4
            goto Lf
        L123:
            java.lang.String r0 = "rxGh7yrenty6DYioc5XCtg==\n"
            java.lang.String r4 = "237tgF277J8=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r4)
            defpackage.ip.n(r0, r6)
            int r0 = androidx.appcompat.app.C0012.m51()
            if (r0 > 0) goto L138
            java.lang.String r0 = "ۧۥ"
            goto L31
        L138:
            java.lang.String r0 = "۟۠ۤ"
            goto Lee
        L13b:
            int r0 = r10.c
            java.util.ArrayList r4 = r10.b
            java.util.ArrayList r5 = r10.d
            defpackage.xc.c(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.floatingactionbutton.C0060.f60
            if (r0 > 0) goto L154
            com.google.android.material.behavior.C0050.m202()
            java.lang.String r0 = "۠ۢۢ"
            int r0 = kotlinx.coroutines.C0069.m277(r0)
            r5 = r0
            goto Lf
        L154:
            int r0 = androidx.appcompat.widget.C0016.f16
            int r4 = androidx.profileinstaller.C0030.f30
            int r0 = r0 - r4
            r4 = 1751180(0x1ab88c, float:2.453926E-39)
            int r0 = r0 + r4
            r5 = r0
            goto Lf
        L160:
            i00 r3 = r10.a
            int r0 = androidx.versionedparcelable.C0038.m155()
            if (r0 > 0) goto La5
            java.lang.String r0 = "ۣۡ۟"
            int r0 = kotlinx.coroutines.C0070.m281(r0)
            r5 = r0
            goto Lf
        L171:
            int r0 = androidx.versionedparcelable.C0039.m157()
            if (r0 < 0) goto L184
            r0 = 98
            androidx.profileinstaller.C0031.f31 = r0
            java.lang.String r0 = "ۥۦۥ"
            int r0 = android.app.C0003.m13(r0)
            r5 = r0
            goto Lf
        L184:
            int r0 = androidx.appcompat.widget.C0013.f13
            int r4 = com.github.megatronking.stringfog.C0047.f47
            int r0 = r0 / r4
            r4 = 1746739(0x1aa733, float:2.447703E-39)
            int r0 = r0 + r4
            r5 = r0
            goto Lf
        L190:
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
            r2 = this;
            java.lang.String r0 = "ۨ۠ۦ"
            int r0 = androidx.versionedparcelable.C0039.m159(r0)
        L6:
            switch(r0) {
                case 1751623: goto La;
                case 1755374: goto L14;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = com.ljx.wechatmod.hook.C0066.f66
            int r1 = com.google.android.material.floatingactionbutton.C0060.f60
            int r0 = r0 / r1
            r1 = 1755374(0x1ac8ee, float:2.459803E-39)
            r0 = r0 ^ r1
            goto L6
        L14:
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
            r2 = this;
            java.lang.String r0 = "ۦۤ۠"
            int r0 = androidx.activity.C0011.m45(r0)
        L6:
            switch(r0) {
                case 1747717: goto La;
                case 1753570: goto L27;
                default: goto L9;
            }
        L9:
            goto L6
        La:
            int r0 = android.app.C0003.f3
            int r1 = kotlinx.coroutines.C0069.f69
            int r1 = r1 % 7936
            int r0 = r0 / r1
            if (r0 < 0) goto L1d
            android.app.C0001.m4()
            java.lang.String r0 = "ۣۧ۟"
            int r0 = androidx.versionedparcelable.C0039.m159(r0)
            goto L6
        L1d:
            int r0 = androidx.recyclerview.widget.C0033.f33
            int r1 = android.app.C0002.f2
            int r0 = r0 * r1
            r1 = 1621834(0x18bf4a, float:2.272673E-39)
            r0 = r0 ^ r1
            goto L6
        L27:
            return
    }
}
