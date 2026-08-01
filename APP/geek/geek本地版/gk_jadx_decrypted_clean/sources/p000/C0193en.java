package p000;

import android.app.Activity;
import android.app.Application;
import android.app.C0989;
import android.os.Bundle;
import android.view.C0993;
import androidx.activity.result.C0994;
import androidx.appcompat.widget.C0999;
import androidx.constraintlayout.widget.C1004;
import androidx.constraintlayout.widget.C1006;
import androidx.coordinatorlayout.widget.C1007;
import androidx.coordinatorlayout.widget.C1008;
import androidx.core.content.C1010;
import androidx.emoji2.text.C1012;
import androidx.fragment.app.C1013;
import androidx.profileinstaller.C1016;
import androidx.recyclerview.widget.C1018;
import androidx.recyclerview.widget.C1019;
import androidx.savedstate.C1020;
import androidx.savedstate.C1022;
import androidx.startup.C1023;
import androidx.versionedparcelable.C1025;
import androidx.versionedparcelable.C1028;
import androidx.viewpager2.adapter.C1029;
import com.github.megatronking.stringfog.C1033;
import com.github.megatronking.stringfog.C1034;
import com.github.megatronking.stringfog.xor.C1031;
import com.github.megatronking.stringfog.xor.C1032;
import com.google.android.material.behavior.C1036;
import com.google.android.material.bottomsheet.C1037;
import com.google.android.material.carousel.C1038;
import com.google.android.material.carousel.C1040;
import com.google.android.material.carousel.C1041;
import com.google.android.material.chip.C1042;
import com.google.android.material.datepicker.C1044;
import com.google.android.material.internal.C1047;
import com.google.android.material.theme.C1048;
import com.ljx.wechatmod.auth.C1051;
import io.fastkv.C1054;
import kotlinx.coroutines.C1055;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: en */
/* JADX INFO: loaded from: classes.dex */
public final class C0193en implements Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.app.Activity r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r2 = "ۨ۠ۨ"
            int r2 = androidx.core.content.C1009.m2941(r2)
        L8:
            switch(r2) {
                case 1746912: goto Lc;
                case 1746944: goto L16;
                case 1747716: goto L59;
                case 1751771: goto L2d;
                case 1753669: goto L49;
                case 1754570: goto L9c;
                case 1755376: goto L79;
                default: goto Lb;
            }
        Lb:
            goto L8
        Lc:
            int r2 = p000.C1058.f5702
            int r3 = androidx.profileinstaller.C1016.f5660
            int r2 = r2 % r3
            r3 = 1755439(0x1ac92f, float:2.459894E-39)
            int r2 = r2 + r3
            goto L8
        L16:
            int r2 = com.google.android.material.theme.C1050.f5694
            int r3 = androidx.emoji2.text.C1012.f5656
            int r3 = r3 * 9886
            int r2 = r2 / r3
            if (r2 == 0) goto L2a
            r2 = 53
            io.fastkv.C1054.f5698 = r2
            java.lang.String r2 = "ۤۦۨ"
        L25:
            int r2 = android.support.v4.graphics.drawable.C0990.m2862(r2)
            goto L8
        L2a:
            java.lang.String r2 = "ۧۥۨ"
            goto L25
        L2d:
            java.lang.String r0 = "Ad5fd62yzZxEps2ic2EpxpkN"
            java.lang.String r0 = androidx.activity.C0996.m2887(r0)
            long r0 = java.lang.Long.parseLong(r0)
            int r2 = androidx.savedstate.C1022.f5666
            if (r2 > 0) goto L46
            r2 = 74
            androidx.fragment.app.C1013.f5657 = r2
            java.lang.String r2 = "ۦۧۦ"
            int r2 = androidx.coordinatorlayout.widget.C1008.m2936(r2)
            goto L8
        L46:
            java.lang.String r2 = "ۦۧۦ"
            goto L25
        L49:
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
            int r2 = com.google.android.material.bottomsheet.C1037.f5681
            if (r2 < 0) goto L52
        L52:
            java.lang.String r2 = "ۧۥۨ"
            int r2 = androidx.constraintlayout.widget.C1004.m2919(r2)
            goto L8
        L59:
            int r2 = androidx.lifecycle.C1015.m2964()
            if (r2 > 0) goto L16
            int r2 = com.google.android.material.chip.C1043.f5687
            int r3 = com.github.megatronking.stringfog.xor.C1032.f5676
            int r3 = r3 + (-3831)
            int r2 = r2 * r3
            if (r2 > 0) goto L6f
            java.lang.String r2 = "۟ۦۧ"
            int r2 = android.support.v4.graphics.drawable.C0990.m2862(r2)
            goto L8
        L6f:
            int r2 = com.google.android.material.theme.C1049.f5693
            int r3 = androidx.lifecycle.C1015.f5659
            int r2 = r2 * r3
            r3 = -1769173(0xffffffffffe5012b, float:NaN)
            r2 = r2 ^ r3
            goto L8
        L79:
            java.lang.String r2 = "pl2E\n"
            java.lang.String r3 = "xz7w2PqCZGw=\n"
            java.lang.String r2 = "act"
            p000.AbstractC0346ip.m1503o(r2, r5)
            int r2 = androidx.fragment.app.C1013.f5657
            int r3 = androidx.viewpager2.adapter.C1029.f5673
            r3 = r3 | (-343(0xfffffffffffffea9, float:NaN))
            int r2 = r2 / r3
            if (r2 > 0) goto L99
            r2 = 70
            androidx.coordinatorlayout.widget.C1008.f5652 = r2
            java.lang.String r2 = "۠ۡۥ"
            int r2 = com.google.android.material.chip.C1043.m3074(r2)
            goto L8
        L99:
            java.lang.String r2 = "۠ۡۥ"
            goto L25
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0193en.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c A[SYNTHETIC] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityDestroyed(android.app.Activity r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = "ۨۧۢ"
            int r1 = androidx.coordinatorlayout.widget.C1008.m2936(r1)
        L7:
            switch(r1) {
                case 56449: goto Lb;
                case 1747656: goto La8;
                case 1747902: goto L87;
                case 1748704: goto L7d;
                case 1752676: goto L40;
                case 1755367: goto L63;
                case 1755587: goto L26;
                default: goto La;
            }
        La:
            goto L7
        Lb:
            int r1 = androidx.fragment.app.C1013.m2957()
            if (r1 > 0) goto L63
            int r1 = androidx.coordinatorlayout.widget.C1008.f5652
            if (r1 < 0) goto L1c
            java.lang.String r1 = "۠۟ۧ"
            int r1 = com.github.megatronking.stringfog.C1033.m3034(r1)
            goto L7
        L1c:
            int r1 = p000.C1057.f5701
            int r2 = androidx.viewpager2.adapter.C1029.f5673
            int r1 = r1 * r2
            r2 = 1963460(0x1df5c4, float:2.751393E-39)
            int r1 = r1 + r2
            goto L7
        L26:
            java.lang.String r1 = "rs+T\n"
            java.lang.String r2 = "z6zn5nClTAQ=\n"
            java.lang.String r1 = "act"
            p000.AbstractC0346ip.m1503o(r1, r4)
            int r1 = com.google.android.material.floatingactionbutton.C1046.f5690
            if (r1 > 0) goto L39
            r1 = 11
            com.google.android.material.behavior.C1036.f5680 = r1
        L39:
            java.lang.String r1 = "ۤۥ"
        L3b:
            int r1 = androidx.viewpager2.adapter.C1029.m3019(r1)
            goto L7
        L40:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = androidx.versionedparcelable.C1027.f5671
            int r2 = androidx.constraintlayout.widget.C1006.f5650
            r2 = r2 | 7868(0x1ebc, float:1.1025E-41)
            r1 = r1 ^ r2
            if (r1 < 0) goto L59
            r1 = 87
            com.google.android.material.chip.C1042.f5686 = r1
            java.lang.String r1 = "ۨۧۢ"
            int r1 = com.google.android.material.chip.C1042.m3071(r1)
            goto L7
        L59:
            int r1 = com.google.android.material.internal.C1047.f5691
            int r2 = kotlinx.coroutines.C1055.f5699
            int r1 = r1 / r2
            r2 = 1747669(0x1aaad5, float:2.449006E-39)
            int r1 = r1 + r2
            goto L7
        L63:
            int r1 = com.google.android.material.behavior.C1036.f5680
            int r2 = androidx.appcompat.widget.C0999.f5643
            int r2 = r2 + (-8874)
            int r1 = r1 % r2
            if (r1 > 0) goto L73
            java.lang.String r1 = "ۣۧۤ"
            int r1 = com.google.android.material.carousel.C1040.m3064(r1)
            goto L7
        L73:
            int r1 = androidx.appcompat.widget.C1002.f5646
            int r2 = com.google.android.material.chip.C1042.f5686
            int r1 = r1 / r2
            r2 = 1747657(0x1aaac9, float:2.448989E-39)
            int r1 = r1 + r2
            goto L7
        L7d:
            int r1 = androidx.fragment.app.C1013.f5657
            int r2 = com.github.megatronking.stringfog.xor.C1031.f5675
            int r1 = r1 + r2
            r2 = 1756326(0x1acca6, float:2.461137E-39)
            int r1 = r1 + r2
            goto L7
        L87:
            java.lang.String r0 = "soiXpb"
            java.lang.String r0 = androidx.coordinatorlayout.widget.C1007.m2931(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            int r1 = kotlinx.coroutines.C1055.f5699
            int r2 = com.github.megatronking.stringfog.C1033.f5677
            int r2 = r2 + (-7189)
            r1 = r1 ^ r2
            if (r1 > 0) goto La5
            r1 = 1
            com.google.android.material.carousel.C1039.f5683 = r1
            java.lang.String r1 = "ۨ۠۟"
            int r1 = androidx.recyclerview.widget.C1018.m2976(r1)
            goto L7
        La5:
            java.lang.String r1 = "ۥۦۥ"
            goto L3b
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0193en.onActivityDestroyed(android.app.Activity):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String str;
        int iM2859 = C0989.m2859("ۨۤۥ");
        Float f = null;
        while (true) {
            switch (iM2859) {
                case 1746718:
                    if (C1058.f5702 * C1007.f5651 * (-6732) >= 0) {
                        C1057.m3129();
                        str = "ۢۡ۠";
                    } else {
                        str = "ۨۤۥ";
                    }
                    iM2859 = C1055.m3122(str);
                    break;
                case 1750724:
                    break;
                case 1750726:
                    iM2859 = C1025.m3003() < 0 ? (C1012.f5656 | C1059.f5703) + 1749910 : (C1047.f5691 | C1054.f5698) ^ (-1755851);
                    break;
                case 1750753:
                    break;
                case 1752675:
                    System.out.println(f);
                    if (C1036.m3047() < 0) {
                        iM2859 = (C1038.f5682 * C1034.f5678) + 1592861;
                    } else {
                        C1040.f5684 = 6;
                        iM2859 = C1008.m2936("ۣۥۨ");
                    }
                    break;
                case 1755370:
                    Float fValueOf = Float.valueOf(C1033.m3033("05FqpLRgsOKS3mcv8VG3U"));
                    iM2859 = 1753515 + (C1051.f5695 | C1016.f5660);
                    f = fValueOf;
                    break;
                case 1755497:
                    AbstractC0346ip.m1503o("act", activity);
                    if (C0999.f5643 % (C1018.f5662 ^ 3745) < 0) {
                        iM2859 = C1008.m2936("ۣۥۨ");
                    } else {
                        C1033.m3036();
                        iM2859 = C1041.m3065("ۣۥۦ");
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f5 A[SYNTHETIC] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResumed(android.app.Activity r7) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0193en.onActivityResumed(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int iM2978 = C1019.m2978("ۤۥ۠");
        while (true) {
            switch (iM2978) {
                case 1746941:
                    if (C1010.f5654 > 0) {
                        iM2978 = (C1029.f5673 / C0994.f5638) + 1751679;
                    } else {
                        C0993.m2877();
                        iM2978 = C1051.m3108("ۣۧۡ");
                    }
                    break;
                case 1747804:
                    AbstractC0346ip.m1503o("outState", bundle);
                    iM2978 = C1034.m3038("ۣۤۥ");
                    break;
                case 1750692:
                    return;
                case 1751679:
                    AbstractC0346ip.m1503o("act", activity);
                    if (C0994.m2879() <= 0) {
                    }
                    iM2978 = C1004.m2919("۠ۤ۠");
                    break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int iM3126 = C1056.m3126("ۢۦ۠");
        while (true) {
            switch (iM3126) {
                case 1746723:
                    iM3126 = (C1042.f5686 | C1032.f5676) ^ (-1749790);
                    break;
                case 1749788:
                    AbstractC0346ip.m1503o("act", activity);
                    if (C1004.f5648 * (C1006.f5650 / 4875) == 0) {
                        iM3126 = (C1022.f5666 + C1044.f5688) ^ 1757072;
                    } else {
                        C1044.f5688 = 95;
                        iM3126 = C1023.m2995("۟۠ۤ");
                    }
                    break;
                case 1755436:
                    return;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        String str;
        int iM3108 = C1051.m3108("ۥۣۡ");
        while (true) {
            switch (iM3108) {
                case 1747871:
                    if (C1025.m3003() >= 0) {
                        C1047.f5691 = 38;
                        str = "ۣ۟۠";
                    } else {
                        str = "ۥۣۡ";
                    }
                    iM3108 = C1048.m3094(str);
                    break;
                case 1752519:
                    AbstractC0346ip.m1503o("act", activity);
                    if (C1031.f5675 + (C1020.f5664 / 9714) < 0) {
                        iM3108 = C1037.m3052("ۣۧۢ");
                    } else {
                        C1013.f5657 = 60;
                        iM3108 = C1028.m3016("ۥۣۡ");
                    }
                    break;
                case 1754502:
                    return;
            }
        }
    }
}
