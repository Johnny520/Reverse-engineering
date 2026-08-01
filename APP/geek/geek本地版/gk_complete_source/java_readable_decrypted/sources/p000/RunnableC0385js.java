package p000;

import android.app.C0987;
import android.app.C0988;
import android.app.C0989;
import android.support.v4.graphics.drawable.C0990;
import android.support.v4.graphics.drawable.C0991;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.result.C0995;
import androidx.core.content.C1009;
import androidx.core.content.C1010;
import androidx.recyclerview.widget.C1019;
import androidx.startup.C1023;
import androidx.versionedparcelable.C1027;
import com.github.megatronking.stringfog.C1034;
import com.github.megatronking.stringfog.annotation.C1030;
import com.google.android.material.behavior.C1036;
import com.google.android.material.carousel.C1039;
import com.google.android.material.carousel.C1041;
import com.google.android.material.chip.C1042;
import com.google.android.material.floatingactionbutton.C1046;
import com.google.android.material.theme.C1049;
import com.ljx.wechatmod.p001ui.C1053;

/* JADX INFO: renamed from: js */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0385js implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f2664a = 0;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f2665b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f2666c;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ RunnableC0385js(android.view.ViewGroup r4, android.widget.LinearLayout r5) {
        /*
            r3 = this;
            r0 = 0
            r3.f2664a = r0
            r3.<init>()
            java.lang.String r1 = "ۨۤۥ"
            int r2 = com.google.android.material.datepicker.C1045.m3084(r1)
            r1 = r0
        Ld:
            switch(r2) {
                case 56320: goto L11;
                case 56419: goto La2;
                case 1746907: goto L67;
                case 1750752: goto L42;
                case 1752459: goto L2d;
                case 1753485: goto L90;
                case 1754564: goto L22;
                case 1755497: goto L71;
                default: goto L10;
            }
        L10:
            goto Ld
        L11:
            int r0 = androidx.savedstate.C1020.m2983()
            if (r0 > 0) goto L84
            androidx.appcompat.app.C0998.m2897()
            java.lang.String r0 = "۠۠ۢ"
            int r0 = android.view.C0993.m2874(r0)
            r2 = r0
            goto Ld
        L22:
            int r0 = android.app.C0987.f5631
            int r2 = androidx.versionedparcelable.C1027.f5671
            int r0 = r0 * r2
            r2 = 1838562(0x1c0de2, float:2.576374E-39)
            int r0 = r0 + r2
            r2 = r0
            goto Ld
        L2d:
            java.lang.String r0 = "lE0vc2aZ0V2kY48wxMNeNQ4x"
            java.lang.String r0 = io.fastkv.C1054.m3120(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            int r1 = com.ljx.wechatmod.hook.C1052.f5696
            int r2 = android.support.v4.graphics.drawable.C0992.f5636
            int r1 = r1 - r2
            r2 = 1750278(0x1ab506, float:2.452662E-39)
            int r2 = r2 + r1
            r1 = r0
            goto Ld
        L42:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = com.google.android.material.theme.C1048.f5692
            int r2 = com.google.android.material.chip.C1042.f5686
            int r2 = r2 / 2768
            int r0 = r0 + r2
            if (r0 < 0) goto L5c
            r0 = 17
            androidx.emoji2.text.C1012.f5656 = r0
            java.lang.String r0 = "۠۠"
        L56:
            int r0 = com.google.android.material.carousel.C1041.m3065(r0)
            r2 = r0
            goto Ld
        L5c:
            int r0 = android.app.C0988.f5632
            int r2 = androidx.activity.C0996.f5640
            int r0 = r0 + r2
            r2 = 56348(0xdc1c, float:7.896E-41)
            int r0 = r0 + r2
            r2 = r0
            goto Ld
        L67:
            r3.f2665b = r5
            java.lang.String r0 = "ۦۡۨ"
            int r0 = androidx.constraintlayout.widget.C1006.m2926(r0)
            r2 = r0
            goto Ld
        L71:
            r3.f2666c = r4
            int r0 = androidx.activity.result.C0994.m2879()
            if (r0 > 0) goto L81
            java.lang.String r0 = "ۨۤۥ"
            int r0 = android.support.v4.graphics.drawable.C0992.m2872(r0)
            r2 = r0
            goto Ld
        L81:
            java.lang.String r0 = "۟ۦۢ"
            goto L56
        L84:
            int r0 = com.ljx.wechatmod.p001ui.C1053.f5697
            int r2 = com.google.android.material.datepicker.C1044.f5688
            int r0 = r0 % r2
            r2 = 56571(0xdcfb, float:7.9273E-41)
            int r0 = r0 + r2
            r2 = r0
            goto Ld
        L90:
            int r0 = androidx.constraintlayout.widget.C1005.m2923()
            if (r0 > 0) goto L11
            int r0 = android.view.C0993.f5637
            int r2 = androidx.versionedparcelable.C1028.f5672
            r0 = r0 ^ r2
            r2 = 1753136(0x1ac030, float:2.456667E-39)
            int r0 = r0 + r2
            r2 = r0
            goto Ld
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC0385js.<init>(android.view.ViewGroup, android.widget.LinearLayout):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    public /* synthetic */ RunnableC0385js(LinearLayout linearLayout, ViewGroup viewGroup) {
        String str;
        Long lValueOf;
        Long l = null;
        int iM3010 = C1027.m3010("ۣۣ۟");
        while (true) {
            switch (iM3010) {
                case 1746815:
                    this.f2665b = linearLayout;
                    iM3010 = C1041.m3065(C0987.m2850() <= 0 ? "ۢۦۥ" : "ۦۣ۠");
                    break;
                case 1747932:
                    iM3010 = C1034.f5678 + C0990.f5634 + 1755730;
                    break;
                case 1749793:
                    if (C1042.m3069() > 0) {
                        iM3010 = C1034.f5678 + C0990.f5634 + 1755730;
                    } else {
                        str = "ۦ۟۟";
                        iM3010 = C0989.m2859(str);
                    }
                    break;
                case 1753414:
                    lValueOf = Long.valueOf(C0991.m2868("bhInrDHGkqsqJNIoFXMa5p1p5X"));
                    if (C1019.f5663 + (C0995.f5639 ^ (-1425)) > 0) {
                        iM3010 = C1049.m3099("ۨ۠ۤ");
                        l = lValueOf;
                    } else {
                        C1046.f5690 = 69;
                        iM3010 = C1030.m3021("ۦۣ۠");
                        l = lValueOf;
                    }
                    break;
                case 1753449:
                    this.f2666c = viewGroup;
                    str = "ۢۦۥ";
                    iM3010 = C0989.m2859(str);
                    break;
                case 1755372:
                    System.out.println(l);
                    if (C1009.f5653 > 0) {
                        iM3010 = (C1053.f5697 / C1039.f5683) + 1755375;
                    } else {
                        C1010.f5654 = 75;
                        lValueOf = l;
                        iM3010 = C1049.m3099("ۨ۠ۤ");
                        l = lValueOf;
                    }
                    break;
                case 1755373:
                    break;
                case 1755402:
                    if (C1023.f5667 < 0) {
                        iM3010 = (C0988.f5632 - C1036.f5680) + 1746088;
                    } else {
                        str = "ۣۦۧ";
                        iM3010 = C0989.m2859(str);
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003e A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = "ۦۣۧ"
            int r1 = androidx.versionedparcelable.C1027.m3010(r1)
        L7:
            switch(r1) {
                case 56446: goto Lb;
                case 1747743: goto L5d;
                case 1747774: goto L38;
                case 1747808: goto L75;
                case 1749792: goto L8a;
                case 1749825: goto L53;
                case 1750722: goto L8a;
                case 1751649: goto L29;
                case 1753546: goto L33;
                default: goto La;
            }
        La:
            goto L7
        Lb:
            android.view.ViewGroup r1 = r3.f2666c
            android.widget.LinearLayout r2 = r3.f2665b
            com.ljx.wechatmod.p001ui.MainActivity.m803b(r1, r2)
            int r1 = android.support.v4.graphics.drawable.C0992.f5636
            int r2 = androidx.recyclerview.widget.C1018.f5662
            int r2 = r2 * 1119
            int r1 = r1 - r2
            if (r1 > 0) goto L22
            java.lang.String r1 = "ۤۢ"
            int r1 = androidx.recyclerview.widget.C1019.m2978(r1)
            goto L7
        L22:
            java.lang.String r1 = "ۢۦۤ"
            int r1 = com.ljx.wechatmod.hook.C1052.m3109(r1)
            goto L7
        L29:
            int r1 = com.google.android.material.bottomsheet.C1037.f5681
            int r2 = androidx.activity.result.C0994.f5638
            int r1 = r1 / r2
            r2 = 56446(0xdc7e, float:7.9098E-41)
            r1 = r1 ^ r2
            goto L7
        L33:
            int r1 = r3.f2664a
            switch(r1) {
                case 0: goto L29;
                default: goto L38;
            }
        L38:
            int r1 = com.google.android.material.internal.C1047.m3089()
            if (r1 > 0) goto L49
            r1 = 88
            androidx.core.content.C1009.f5653 = r1
            java.lang.String r1 = "ۡۦ۟"
            int r1 = androidx.viewpager2.adapter.C1029.m3019(r1)
            goto L7
        L49:
            int r1 = androidx.viewpager2.adapter.C1029.f5673
            int r2 = androidx.fragment.app.C1013.f5657
            int r1 = r1 % r2
            r2 = 1747462(0x1aaa06, float:2.448716E-39)
            int r1 = r1 + r2
            goto L7
        L53:
            int r1 = androidx.savedstate.C1022.f5666
            int r2 = android.app.C0987.f5631
            int r1 = r1 - r2
            r2 = 1754580(0x1ac5d4, float:2.45869E-39)
            r1 = r1 ^ r2
            goto L7
        L5d:
            android.view.ViewGroup r1 = r3.f2666c
            com.ljx.wechatmod.p001ui.MainActivity.m806e(r1, r0)
            int r1 = android.app.C0987.f5631
            int r2 = androidx.recyclerview.widget.C1019.f5663
            int r2 = r2 % (-8197)
            int r1 = r1 / r2
            if (r1 == 0) goto L72
            java.lang.String r1 = "۠ۤۤ"
        L6d:
            int r1 = androidx.legacy.content.C1014.m2960(r1)
            goto L7
        L72:
            java.lang.String r1 = "ۣۥۤ"
            goto L6d
        L75:
            android.widget.LinearLayout r0 = r3.f2665b
            int r1 = com.ljx.wechatmod.p001ui.C1053.m3114()
            if (r1 > 0) goto L87
            com.github.megatronking.stringfog.C1033.m3036()
            java.lang.String r1 = "ۣۥۤ"
            int r1 = io.fastkv.C1054.m3117(r1)
            goto L7
        L87:
            java.lang.String r1 = "۠ۢۡ"
            goto L6d
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC0385js.run():void");
    }
}
