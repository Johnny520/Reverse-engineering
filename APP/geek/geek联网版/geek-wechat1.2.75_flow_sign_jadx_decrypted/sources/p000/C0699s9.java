package p000;

import android.window.C0990;
import androidx.activity.C0996;
import androidx.activity.result.C0992;
import androidx.appcompat.widget.C1000;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.theme.C1042;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: renamed from: s9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0699s9 extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final int f4219a;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C0699s9(int r4) {
        /*
            r3 = this;
            r3.f4219a = r4
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "ۧ۟ۤ"
            int r2 = com.google.android.material.datepicker.C1033.m3042(r1)
            r1 = r0
        Ld:
            switch(r2) {
                case 1747775: goto L11;
                case 1749577: goto L3b;
                case 1750786: goto L9b;
                case 1752458: goto L26;
                case 1752516: goto L86;
                case 1754380: goto L60;
                default: goto L10;
            }
        L10:
            goto Ld
        L11:
            int r0 = com.ljx.wechatmod.p001ui.C1050.f5697
            int r2 = androidx.startup.C1015.f5662
            int r2 = r2 + (-4954)
            int r0 = r0 / r2
            if (r0 == 0) goto L7b
            r0 = 26
            com.google.android.material.datepicker.C1034.f5681 = r0
            java.lang.String r0 = "۟ۢۡ"
        L20:
            int r0 = com.google.android.material.timepicker.C1043.m763(r0)
            r2 = r0
            goto Ld
        L26:
            java.lang.String r0 = "HodPhgo4A"
            java.lang.String r0 = android.window.C0988.m2862(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            int r1 = androidx.core.content.C1007.f5654
            int r2 = androidx.coordinatorlayout.widget.C1004.f5651
            r1 = r1 | r2
            r2 = 1748556(0x1aae4c, float:2.450249E-39)
            int r2 = r2 + r1
            r1 = r0
            goto Ld
        L3b:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = com.google.android.material.datepicker.C1035.f5682
            int r2 = com.ljx.wechatmod.hook.C1049.f5696
            int r2 = r2 * 4350
            r0 = r0 | r2
            if (r0 < 0) goto L55
            r0 = 45
            android.app.C0986.f5633 = r0
        L4d:
            java.lang.String r0 = "ۥ۟ۤ"
            int r0 = com.google.android.material.sidesheet.C1039.m3067(r0)
            r2 = r0
            goto Ld
        L55:
            int r0 = androidx.coordinatorlayout.widget.C1004.f5651
            int r2 = androidx.legacy.content.C1014.f5661
            int r0 = r0 + r2
            r2 = 1750479(0x1ab5cf, float:2.452944E-39)
            int r0 = r0 + r2
            r2 = r0
            goto Ld
        L60:
            int r0 = androidx.core.widget.C1011.m2956()
            if (r0 < 0) goto L86
            int r0 = com.google.android.material.sidesheet.C1039.f5686
            int r2 = com.google.android.material.transformation.C1045.f5692
            r2 = r2 | (-5038(0xffffffffffffec52, float:NaN))
            int r0 = r0 * r2
            if (r0 > 0) goto L4d
            r0 = 57
            androidx.appcompat.view.menu.C0999.f5646 = r0
            java.lang.String r0 = "ۧ۟ۤ"
            int r0 = com.google.android.material.carousel.C1030.m3032(r0)
            r2 = r0
            goto Ld
        L7b:
            int r0 = com.ljx.wechatmod.hook.C1049.f5696
            int r2 = androidx.legacy.content.C1014.f5661
            int r0 = r0 - r2
            r2 = -1755085(0xffffffffffe53833, float:NaN)
            r0 = r0 ^ r2
            r2 = r0
            goto Ld
        L86:
            int r0 = kotlinx.coroutines.C1056.f5703
            int r2 = android.window.C0989.f5636
            r2 = r2 | (-2500(0xfffffffffffff63c, float:NaN))
            int r0 = r0 % r2
            if (r0 > 0) goto L98
            java.lang.String r0 = "ۣۦۤ"
            int r0 = androidx.core.content.C1007.m2938(r0)
            r2 = r0
            goto Ld
        L98:
            java.lang.String r0 = "ۣۧۦ"
            goto L20
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0699s9.<init>(int):void");
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        String str;
        int iM2894 = C0996.m2894("ۦ۟ۧ");
        while (true) {
            switch (iM2894) {
                case 56291:
                    return new Random();
                case 1749757:
                    str = "ۥ۟ۤ";
                    iM2894 = C0992.m2881(str);
                    break;
                case 1751560:
                    if (C0990.f5637 > 0) {
                        iM2894 = (C1042.f5689 | C1000.f5647) + 1752477;
                    } else {
                        str = "۟ۤۤ";
                        iM2894 = C0992.m2881(str);
                    }
                    break;
                case 1752458:
                    return new SimpleDateFormat("HH:mm:ss", Locale.CHINA);
                case 1753422:
                    switch (this.f4219a) {
                        case Base64.DEFAULT /* 0 */:
                            str = "ۥ۟ۤ";
                            break;
                        default:
                            str = "۟ۢ";
                            break;
                    }
                    iM2894 = C0992.m2881(str);
                    break;
                case 1755493:
                    str = "۟ۢ";
                    iM2894 = C0992.m2881(str);
                    break;
            }
        }
    }
}
