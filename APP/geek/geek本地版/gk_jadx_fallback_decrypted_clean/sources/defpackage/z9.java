package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z9 extends android.widget.FrameLayout {
    public final int a;

    public z9(android.content.Context r5, int r6) {
            r4 = this;
            r4.a = r6
            r4.<init>(r5)
            r0 = 0
            java.lang.String r2 = "ۦ۠۟"
            int r2 = androidx.profileinstaller.C0030.m120(r2)
        Ld:
            switch(r2) {
                case 1746939: goto L11;
                case 1746967: goto L50;
                case 1748764: goto L67;
                case 1749852: goto L7e;
                case 1753445: goto L2e;
                case 1754411: goto L41;
                default: goto L10;
            }
        L10:
            goto Ld
        L11:
            java.lang.String r0 = "fZlGY8iQhu0CGt9FnXlz3R"
            java.lang.String r0 = com.google.android.material.datepicker.C0059.m237(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            int r2 = androidx.versionedparcelable.C0041.f41
            int r3 = androidx.appcompat.widget.C0015.f15
            int r3 = r3 % 5018
            int r2 = r2 / r3
            if (r2 == 0) goto L4d
            androidx.versionedparcelable.C0042.m169()
        L27:
            java.lang.String r2 = "ۣ۟ۧ"
        L29:
            int r2 = androidx.coordinatorlayout.widget.C0021.m86(r2)
            goto Ld
        L2e:
            int r2 = com.google.android.material.carousel.C0053.m214()
            if (r2 > 0) goto L67
            int r2 = androidx.activity.result.C0009.m36()
            if (r2 < 0) goto L27
            java.lang.String r2 = "ۡۤ۟"
            int r2 = androidx.lifecycle.C0029.m116(r2)
            goto Ld
        L41:
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
            java.lang.String r2 = "ۢۨۢ"
        L48:
            int r2 = com.google.android.material.chip.C0057.m229(r2)
            goto Ld
        L4d:
            java.lang.String r2 = "ۧ۠ۤ"
            goto L29
        L50:
            int r2 = androidx.recyclerview.widget.C0033.f33
            int r3 = androidx.profileinstaller.C0031.f31
            int r3 = r3 + (-7589)
            int r2 = r2 * r3
            if (r2 < 0) goto L64
            r2 = 50
            androidx.recyclerview.widget.C0033.f33 = r2
            java.lang.String r2 = "ۥ۠"
        L5f:
            int r2 = androidx.profileinstaller.C0031.m127(r2)
            goto Ld
        L64:
            java.lang.String r2 = "ۦ۠۟"
            goto L5f
        L67:
            int r2 = com.google.android.material.chip.C0057.m230()
            if (r2 < 0) goto L74
            r2 = 94
            androidx.versionedparcelable.C0041.f41 = r2
            java.lang.String r2 = "ۣۨۨ"
            goto L48
        L74:
            int r2 = androidx.savedstate.C0035.f35
            int r3 = com.google.android.material.theme.C0063.f63
            int r2 = r2 % r3
            r3 = 1749795(0x1ab323, float:2.451985E-39)
            int r2 = r2 + r3
            goto Ld
        L7e:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r8, int r9) {
            r7 = this;
            r0 = 0
            java.lang.String r1 = "ۥۤۦ"
            int r6 = androidx.appcompat.widget.C0014.m57(r1)
            r2 = r0
            r5 = r0
            r1 = r0
            r3 = r0
            r4 = r0
        Lc:
            switch(r6) {
                case 56537: goto L10;
                case 1748610: goto L43;
                case 1748835: goto L8f;
                case 1748896: goto L24;
                case 1749603: goto L101;
                case 1752550: goto L8c;
                case 1752554: goto L69;
                case 1752615: goto Le5;
                case 1754562: goto Laa;
                case 1755404: goto L52;
                case 1755461: goto Lc7;
                default: goto Lf;
            }
        Lf:
            goto Lc
        L10:
            int r0 = com.ljx.wechatmod.ui.C0067.f67
            int r6 = androidx.activity.C0011.f11
            int r6 = r6 + 9952
            int r0 = r0 * r6
            if (r0 < 0) goto L4f
            android.app.C0002.m10()
            java.lang.String r0 = "ۧ۟ۥ"
        L1e:
            int r0 = androidx.versionedparcelable.C0038.m153(r0)
            r6 = r0
            goto Lc
        L24:
            int r0 = androidx.savedstate.C0036.f36
            int r3 = com.github.megatronking.stringfog.C0047.f47
            r3 = r3 | 2254(0x8ce, float:3.159E-42)
            int r0 = r0 + r3
            if (r0 > 0) goto L3a
            r0 = 31
            io.fastkv.C0068.f68 = r0
            java.lang.String r0 = "ۧ۠"
            r3 = r1
        L34:
            int r0 = io.fastkv.C0068.m272(r0)
            r6 = r0
            goto Lc
        L3a:
            java.lang.String r0 = "ۣۨ۠"
            int r0 = com.google.android.material.internal.C0061.m246(r0)
            r6 = r0
            r3 = r1
            goto Lc
        L43:
            int r0 = android.view.View.MeasureSpec.getSize(r4)
            java.lang.String r5 = "ۥۣۢ"
            int r6 = com.google.android.material.carousel.C0054.m219(r5)
            r5 = r0
            goto Lc
        L4f:
            java.lang.String r0 = "ۣۨ۠"
            goto L1e
        L52:
            int r0 = androidx.versionedparcelable.C0042.f42
            int r6 = com.ljx.wechatmod.hook.C0066.f66
            int r6 = r6 + 1849
            int r0 = r0 * r6
            if (r0 < 0) goto L66
            com.google.android.material.carousel.C0054.m217()
            java.lang.String r0 = "۠۟۟"
        L60:
            int r0 = androidx.constraintlayout.helper.widget.C0017.m70(r0)
            r6 = r0
            goto Lc
        L66:
            java.lang.String r0 = "ۥۤۦ"
            goto L60
        L69:
            r0 = 2147483374(0x7ffffeee, float:NaN)
            int r1 = com.google.android.material.chip.C0056.f56
            r0 = r0 ^ r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            int r0 = androidx.constraintlayout.widget.C0019.f19
            int r6 = com.github.megatronking.stringfog.C0048.f48
            r6 = r6 | 8122(0x1fba, float:1.1381E-41)
            int r0 = r0 + r6
            if (r0 > 0) goto L89
            r0 = 19
            defpackage.C0071.f71 = r0
            r0 = r2
        L81:
            java.lang.String r2 = "ۡۦۨ"
            int r6 = androidx.savedstate.C0036.m144(r2)
            r2 = r0
            goto Lc
        L89:
            java.lang.String r0 = "ۡۨۧ"
            goto L60
        L8c:
            int r0 = r7.a
            goto L81
        L8f:
            int r0 = androidx.core.content.C0023.f23
            if (r0 > 0) goto La0
            androidx.activity.C0011.m44()
            java.lang.String r0 = "ۧۥ۠"
            int r0 = androidx.activity.C0010.m43(r0)
            r6 = r0
            r3 = r4
            goto Lc
        La0:
            java.lang.String r0 = "ۧۥ۠"
            r3 = r4
        La3:
            int r0 = androidx.appcompat.widget.C0015.m60(r0)
            r6 = r0
            goto Lc
        Laa:
            if (r5 <= r2) goto L10
            int r0 = androidx.savedstate.C0036.f36
            int r6 = androidx.lifecycle.C0029.f29
            int r6 = r6 % (-6062)
            int r0 = r0 % r6
            if (r0 > 0) goto Lbb
            androidx.savedstate.C0035.m143()
            java.lang.String r0 = "ۡ۟۠"
            goto La3
        Lbb:
            int r0 = android.view.C0007.f7
            int r6 = androidx.coordinatorlayout.widget.C0021.f21
            r0 = r0 ^ r6
            r6 = -1752487(0xffffffffffe54259, float:NaN)
            r0 = r0 ^ r6
            r6 = r0
            goto Lc
        Lc7:
            super.onMeasure(r8, r3)
            int r0 = androidx.lifecycle.C0029.m118()
            if (r0 > 0) goto Ld9
            java.lang.String r0 = "ۣۨ۠"
            int r0 = androidx.coordinatorlayout.widget.C0021.m86(r0)
            r6 = r0
            goto Lc
        Ld9:
            int r0 = androidx.appcompat.widget.C0014.f14
            int r6 = androidx.core.widget.C0025.f25
            int r0 = r0 * r6
            r6 = 1211246(0x127b6e, float:1.697317E-39)
            r0 = r0 ^ r6
            r6 = r0
            goto Lc
        Le5:
            int r0 = androidx.activity.result.C0008.f8
            int r4 = androidx.activity.result.C0009.f9
            int r4 = r4 + 7242
            int r0 = r0 / r4
            if (r0 == 0) goto Lfc
            r0 = 81
            com.google.android.material.datepicker.C0059.f59 = r0
            java.lang.String r0 = "ۥۢۧ"
            int r0 = androidx.appcompat.widget.C0015.m60(r0)
            r6 = r0
            r4 = r9
            goto Lc
        Lfc:
            java.lang.String r0 = "ۡ۟۠"
            r4 = r9
            goto L34
        L101:
            return
    }
}
