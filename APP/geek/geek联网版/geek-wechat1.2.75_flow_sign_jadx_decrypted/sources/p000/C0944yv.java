package p000;

import android.app.C0986;
import android.support.v4.graphics.drawable.C0987;
import android.text.Editable;
import android.text.TextWatcher;
import android.window.C0991;
import androidx.activity.C0995;
import androidx.appcompat.view.menu.C0998;
import androidx.appcompat.view.menu.C0999;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.core.content.C1007;
import androidx.legacy.content.C1013;
import com.google.android.material.appbar.C1020;
import com.google.android.material.appbar.C1021;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.carousel.C1026;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.sidesheet.C1039;
import com.google.android.material.snackbar.C1040;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1050;
import java.util.ArrayList;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: yv */
/* JADX INFO: loaded from: classes.dex */
public final class C0944yv implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final p00 f5504a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5505b;

    /* JADX INFO: renamed from: c */
    public final n00 f5506c;

    /* JADX INFO: renamed from: d */
    public final p00 f5507d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0072 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0944yv(p000.n00 r4, p000.p00 r5, p000.p00 r6, java.util.ArrayList r7) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0944yv.<init>(n00, p00, p00, java.util.ArrayList):void");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int iM3015 = C1026.m3015("ۤۤۤ");
        p00 p00Var = null;
        String str = null;
        while (true) {
            switch (iM3015) {
                case 1746879:
                    iM3015 = (C0991.f5638 | (C1007.f5654 - 7039)) < 0 ? (C0991.f5638 - C1050.f5697) + 1751344 : C1001.m2914("ۢ۟۠");
                    break;
                case 1747868:
                    p00Var.f3560b = str;
                    if ((C1020.f5667 ^ (C1040.f5687 / (-2913))) < 0) {
                        iM3015 = (C0999.f5646 / C1049.f5696) ^ 1752516;
                    } else {
                        C0987.m2860();
                        iM3015 = C1039.m3067("ۤۤۤ");
                    }
                    break;
                case 1748829:
                    p00Var = this.f5504a;
                    if (C1023.f5670 < 0) {
                        iM3015 = C1036.m3057("۠ۦۢ");
                    } else {
                        C0998.f5645 = 5;
                        iM3015 = C0995.m2891("ۥۡ۠");
                    }
                    break;
                case 1751554:
                    return;
                case 1751652:
                    String strValueOf = String.valueOf(editable);
                    iM3015 = 1748185 ^ (C0986.f5633 % C1021.f5668);
                    str = strValueOf;
                    break;
                case 1752516:
                    AbstractC0083bw.m547g(this.f5506c, p00Var, this.f5507d, this.f5505b);
                    iM3015 = (C1001.f5648 / C1033.f5680) + 1751553;
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002c A[SYNTHETIC] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void beforeTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = "ۢ۠ۦ"
            int r1 = com.google.android.material.button.C1025.m3011(r1)
        L7:
            switch(r1) {
                case 1746688: goto Lb;
                case 1748674: goto L3d;
                case 1749608: goto L65;
                case 1750718: goto L72;
                case 1751714: goto L4d;
                case 1755336: goto L23;
                default: goto La;
            }
        La:
            goto L7
        Lb:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = p000.C1059.f5706
            int r2 = com.github.megatronking.stringfog.C1019.f5666
            int r2 = r2 + 2596
            int r1 = r1 / r2
            if (r1 == 0) goto L4a
            androidx.appcompat.app.C0997.m2900()
            java.lang.String r1 = "ۨ۟۟"
        L1e:
            int r1 = androidx.core.graphics.drawable.C1009.m2946(r1)
            goto L7
        L23:
            int r1 = androidx.coordinatorlayout.widget.C1004.f5651
            int r2 = androidx.coordinatorlayout.widget.C1004.f5651
            int r2 = r2 + 8281
            int r1 = r1 * r2
            if (r1 > 0) goto L36
            r1 = 1
            com.google.android.material.snackbar.C1040.f5687 = r1
            java.lang.String r1 = "۠ۤ"
        L31:
            int r1 = io.fastkv.C1052.m3118(r1)
            goto L7
        L36:
            java.lang.String r1 = "ۣۥ۠"
            int r1 = com.google.android.material.datepicker.C1032.m3039(r1)
            goto L7
        L3d:
            java.lang.String r0 = "xya1w59AKe5Thbf5KPi1ibrrTUiS"
            java.lang.String r0 = com.google.android.material.sidesheet.C1039.m3069(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.lang.String r1 = "۟۟۠"
            goto L1e
        L4a:
            java.lang.String r1 = "ۣۥ۠"
            goto L31
        L4d:
            int r1 = com.google.android.material.bottomappbar.C1023.f5670
            if (r1 < 0) goto L5b
            com.google.android.material.timepicker.C1044.m3086()
            java.lang.String r1 = "ۨۨۦ"
            int r1 = com.github.megatronking.stringfog.C1019.m2989(r1)
            goto L7
        L5b:
            int r1 = com.ljx.wechatmod.p001ui.C1051.f5698
            int r2 = kotlinx.coroutines.C1056.f5703
            r1 = r1 ^ r2
            r2 = 1749580(0x1ab24c, float:2.451684E-39)
            int r1 = r1 + r2
            goto L7
        L65:
            int r1 = p000.C1058.m3141()
            if (r1 > 0) goto L23
            java.lang.String r1 = "ۡۡۢ"
            int r1 = androidx.appcompat.app.C0997.m2901(r1)
            goto L7
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0944yv.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        int iM2965 = C1013.m2965("ۥ۟");
        while (true) {
            switch (iM2965) {
                case 56474:
                    return;
                case 56568:
                    if (C0995.f5642 <= 0) {
                        C1056.m3134();
                        str = "ۤۨۧ";
                    } else {
                        str = "ۥ۟";
                    }
                    iM2965 = C1058.m3140(str);
                    break;
            }
        }
    }
}
