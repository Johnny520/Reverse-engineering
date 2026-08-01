package p000;

import android.app.C0986;
import android.text.TextWatcher;
import android.window.C0988;
import com.google.android.material.datepicker.C1033;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.hook.C1049;
import io.fastkv.C1053;
import java.util.ArrayList;

/* JADX INFO: renamed from: ga */
/* JADX INFO: loaded from: classes.dex */
public final class C0254ga implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final n00 f1946a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1947b;

    /* JADX INFO: renamed from: c */
    public final n00 f1948c;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0254ga(p000.n00 r4, java.util.ArrayList r5, p000.n00 r6) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0254ga.<init>(n00, java.util.ArrayList, n00):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0018. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0259 A[SYNTHETIC] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r19) {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0254ga.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int iM2863 = C0988.m2863("ۤۥۧ");
        while (true) {
            switch (iM2863) {
                case 1746971:
                    if (C1053.f5700 < 0) {
                        iM2863 = (C1033.f5680 % C0986.f5633) + 1751033;
                    } else {
                        C1047.f5694 = 46;
                        iM2863 = C1049.m3104("۟۟ۧ");
                    }
                    break;
                case 1751686:
                    return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = "ۥۢۧ"
            int r2 = com.github.megatronking.stringfog.annotation.C1016.m2975(r1)
            r1 = r0
        L8:
            switch(r2) {
                case 56352: goto Lc;
                case 1746720: goto L43;
                case 1747685: goto L91;
                case 1748865: goto L24;
                case 1751656: goto L70;
                case 1752554: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L8
        Lc:
            int r0 = com.google.android.material.bottomappbar.C1024.f5671
            if (r0 > 0) goto L6d
            androidx.legacy.content.C1013.m2964()
            java.lang.String r0 = "ۡۦۤ"
        L15:
            int r0 = android.app.C0986.m2856(r0)
            r2 = r0
            goto L8
        L1b:
            int r0 = com.google.android.material.appbar.C1021.m2995()
            if (r0 < 0) goto Lc
            java.lang.String r0 = "۟۠ۡ"
            goto L15
        L24:
            int r0 = com.google.android.material.datepicker.C1034.f5681
            int r2 = com.ljx.wechatmod.auth.C1047.f5694
            r2 = r2 ^ (-4161(0xffffffffffffefbf, float:NaN))
            r0 = r0 ^ r2
            if (r0 < 0) goto L38
            androidx.startup.C1015.m2972()
            java.lang.String r0 = "ۡۢۤ"
            int r0 = kotlinx.coroutines.C1056.m3133(r0)
            r2 = r0
            goto L8
        L38:
            int r0 = androidx.core.content.C1008.f5655
            int r2 = kotlinx.coroutines.C1055.f5702
            int r0 = r0 - r2
            r2 = -1752717(0xffffffffffe54173, float:NaN)
            r0 = r0 ^ r2
            r2 = r0
            goto L8
        L43:
            java.lang.String r0 = "8VcN0qY3SlUBQfXLyc1NQ9UXsgYGL"
            java.lang.String r0 = com.google.android.material.floatingactionbutton.C1037.m3058(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            int r1 = com.ljx.wechatmod.p001ui.C1051.f5698
            int r2 = com.google.android.material.carousel.C1030.f5677
            r2 = r2 ^ (-8649(0xffffffffffffde37, float:NaN))
            r1 = r1 | r2
            if (r1 < 0) goto L62
            r1 = 47
            com.google.android.material.bottomappbar.C1024.f5671 = r1
            java.lang.String r1 = "ۥۢۧ"
            int r2 = androidx.legacy.content.C1014.m2969(r1)
            r1 = r0
            goto L8
        L62:
            int r1 = com.google.android.material.carousel.C1026.f5673
            int r2 = androidx.constraintlayout.helper.widget.C1001.f5648
            int r1 = r1 * r2
            r2 = 1880488(0x1cb1a8, float:2.635125E-39)
            int r2 = r2 + r1
            r1 = r0
            goto L8
        L6d:
            java.lang.String r0 = "۠۠ۥ"
            goto L15
        L70:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = com.google.android.material.datepicker.C1031.f5678
            if (r0 > 0) goto L85
            r0 = 54
            androidx.activity.C0996.f5643 = r0
            java.lang.String r0 = "ۤۤۨ"
            int r0 = p000.C1058.m3140(r0)
            r2 = r0
            goto L8
        L85:
            int r0 = com.google.android.material.datepicker.C1033.f5680
            int r2 = kotlinx.coroutines.C1056.f5703
            r0 = r0 ^ r2
            r2 = 1747432(0x1aa9e8, float:2.448674E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0254ga.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
