package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x30 extends de.robv.android.xposed.XC_MethodHook {
    public final java.util.concurrent.ConcurrentHashMap a;
    public final defpackage.fs b;

    public x30(java.util.concurrent.ConcurrentHashMap r4, defpackage.fs r5) {
            r3 = this;
            r3.a = r4
            r3.b = r5
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "۟ۢۦ"
            int r1 = androidx.core.content.C0024.m98(r1)
        Le:
            switch(r1) {
                case 56539: goto L12;
                case 1746787: goto L36;
                case 1747686: goto L2c;
                case 1747904: goto L46;
                case 1752491: goto L60;
                case 1754662: goto L4d;
                default: goto L11;
            }
        L11:
            goto Le
        L12:
            java.lang.String r0 = "tf81CQpXV68qsmP59"
            java.lang.String r0 = android.support.v4.graphics.drawable.C0004.m19(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            int r1 = androidx.profileinstaller.C0031.f31
            int r2 = com.google.android.material.chip.C0056.f56
            r2 = r2 ^ (-3009(0xfffffffffffff43f, float:NaN))
            int r1 = r1 * r2
            if (r1 < 0) goto L43
            java.lang.String r1 = "ۥ۠ۦ"
        L27:
            int r1 = androidx.appcompat.widget.C0016.m65(r1)
            goto Le
        L2c:
            int r1 = androidx.recyclerview.widget.C0033.f33
            int r2 = android.view.C0007.f7
            r1 = r1 | r2
            r2 = 1751989(0x1abbb5, float:2.45506E-39)
            int r1 = r1 + r2
            goto Le
        L36:
            int r1 = androidx.core.widget.C0025.m103()
            if (r1 < 0) goto L2c
            java.lang.String r1 = "ۧۢ"
            int r1 = com.google.android.material.carousel.C0055.m220(r1)
            goto Le
        L43:
            java.lang.String r1 = "ۧۨۧ"
            goto L27
        L46:
            java.lang.String r1 = "۟ۢۦ"
            int r1 = defpackage.C0071.m286(r1)
            goto Le
        L4d:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = kotlinx.coroutines.C0069.f69
            if (r1 < 0) goto L5d
            java.lang.String r1 = "۠ۧۧ"
            int r1 = com.ljx.wechatmod.hook.C0066.m264(r1)
            goto Le
        L5d:
            java.lang.String r1 = "ۥ۠ۦ"
            goto L27
        L60:
            return
    }

    public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r6) {
            r5 = this;
            r0 = 0
            java.lang.String r1 = "ۥۡۥ"
            int r2 = androidx.fragment.app.C0027.m110(r1)
            r3 = r0
            r1 = r0
            r4 = r2
        La:
            switch(r4) {
                case 56449: goto Le;
                case 1748616: goto Lb9;
                case 1748798: goto L23;
                case 1748831: goto Le7;
                case 1748860: goto L9c;
                case 1752454: goto L43;
                case 1752521: goto L61;
                case 1753448: goto Leb;
                case 1753479: goto Ld9;
                case 1754565: goto L108;
                case 1755498: goto Le;
                default: goto Ld;
            }
        Ld:
            goto La
        Le:
            int r0 = androidx.activity.C0010.f10
            int r2 = androidx.emoji2.text.C0026.f26
            int r2 = r2 + (-2532)
            int r0 = r0 + r2
            if (r0 < 0) goto L77
            r0 = 36
            com.google.android.material.bottomsheet.C0051.f51 = r0
            java.lang.String r0 = "۟ۧۥ"
        L1d:
            int r0 = android.support.v4.graphics.drawable.C0006.m26(r0)
            r4 = r0
            goto La
        L23:
            java.util.concurrent.ConcurrentHashMap r0 = r5.a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            if (r0 != 0) goto Le
            int r0 = androidx.startup.C0037.f37
            if (r0 < 0) goto L3b
            java.lang.String r2 = "ۡۦۤ"
            r0 = r1
        L34:
            int r2 = com.google.android.material.chip.C0056.m226(r2)
            r1 = r0
            r4 = r2
            goto La
        L3b:
            java.lang.String r0 = "ۦۡۢ"
        L3d:
            int r0 = com.google.android.material.chip.C0057.m229(r0)
            r4 = r0
            goto La
        L43:
            java.lang.Object r0 = r6.thisObject
            java.lang.Class r2 = r0.getClass()
            int r0 = com.ljx.wechatmod.ui.C0067.f67
            int r3 = com.github.megatronking.stringfog.C0048.f48
            int r3 = r3 % 8633
            int r0 = r0 / r3
            if (r0 == 0) goto L5e
            androidx.activity.result.C0009.m36()
            java.lang.String r0 = "ۦۡۢ"
        L57:
            int r0 = androidx.viewpager2.adapter.C0043.m173(r0)
            r3 = r2
            r4 = r0
            goto La
        L5e:
            java.lang.String r0 = "ۡ۟ۦ"
            goto L57
        L61:
            java.lang.String r0 = "QM+8FDM=\n"
            java.lang.String r2 = "MK7OdV709a4=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r2)
            defpackage.ip.o(r0, r6)
            int r0 = androidx.versionedparcelable.C0042.f42
            int r2 = androidx.versionedparcelable.C0040.f40
            int r0 = r0 / r2
            r2 = 1752455(0x1abd87, float:2.455713E-39)
            int r0 = r0 + r2
            r4 = r0
            goto La
        L77:
            java.lang.String r0 = "ۧۥۣ"
            goto L1d
        L7a:
            r0 = move-exception
            int r0 = androidx.emoji2.text.C0026.f26
            int r2 = androidx.versionedparcelable.C0040.f40
            r2 = r2 | (-1119(0xfffffffffffffba1, float:NaN))
            int r0 = r0 * r2
            if (r0 < 0) goto L90
            com.github.megatronking.stringfog.xor.C0045.m181()
            java.lang.String r0 = "ۡ۟ۦ"
            int r0 = androidx.appcompat.widget.C0013.m53(r0)
            r4 = r0
            goto La
        L90:
            int r0 = com.google.android.material.theme.C0064.f64
            int r2 = androidx.versionedparcelable.C0038.f38
            r0 = r0 | r2
            r2 = -1755145(0xffffffffffe537f7, float:NaN)
            r0 = r0 ^ r2
            r4 = r0
            goto La
        L9c:
            java.lang.String r0 = defpackage.pb0.o1     // Catch: java.lang.Throwable -> L7a
            fs r2 = r5.b     // Catch: java.lang.Throwable -> L7a
            de.robv.android.xposed.XposedBridge.hookAllMethods(r3, r0, r2)     // Catch: java.lang.Throwable -> L7a
            int r0 = androidx.activity.C0010.f10
            int r2 = kotlinx.coroutines.C0069.f69
            int r2 = r2 + (-6951)
            r0 = r0 ^ r2
            if (r0 > 0) goto Lb0
            r0 = 96
            com.github.megatronking.stringfog.C0048.f48 = r0
        Lb0:
            java.lang.String r0 = "ۧۥۣ"
            int r0 = androidx.coordinatorlayout.widget.C0022.m90(r0)
            r4 = r0
            goto La
        Lb9:
            java.lang.String r0 = r3.getName()
            int r1 = com.google.android.material.bottomsheet.C0051.f51
            int r2 = com.ljx.wechatmod.ui.C0067.f67
            int r2 = r2 + (-6172)
            int r1 = r1 / r2
            if (r1 == 0) goto Ld4
            r1 = 63
            android.app.C0000.f0 = r1
            java.lang.String r1 = "ۦ۠ۢ"
            int r2 = com.ljx.wechatmod.ui.C0067.m271(r1)
            r1 = r0
            r4 = r2
            goto La
        Ld4:
            java.lang.String r1 = "ۡۥۢ"
            r2 = r1
            goto L34
        Ld9:
            java.lang.String r0 = defpackage.pb0.a     // Catch: java.lang.Throwable -> L7a
            int r0 = androidx.coordinatorlayout.widget.C0022.f22
            int r2 = androidx.appcompat.app.C0012.f12
            int r0 = r0 - r2
            r2 = 1749772(0x1ab30c, float:2.451953E-39)
            int r0 = r0 + r2
            r4 = r0
            goto La
        Le7:
            java.lang.String r0 = "ۦۡۢ"
            goto L3d
        Leb:
            int r0 = androidx.core.widget.C0025.f25
            int r2 = androidx.versionedparcelable.C0042.f42
            r2 = r2 | 6734(0x1a4e, float:9.436E-42)
            int r0 = r0 * r2
            if (r0 > 0) goto Lfc
            r0 = 99
            com.google.android.material.carousel.C0054.f54 = r0
            java.lang.String r0 = "ۤۤ۠"
            goto L3d
        Lfc:
            int r0 = com.google.android.material.floatingactionbutton.C0060.f60
            int r2 = androidx.lifecycle.C0029.f29
            int r0 = r0 % r2
            r2 = 1752289(0x1abce1, float:2.45548E-39)
            int r0 = r0 + r2
            r4 = r0
            goto La
        L108:
            return
    }
}
