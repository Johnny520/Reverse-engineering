package p000;

import android.app.Activity;
import android.app.Application;
import android.app.C0986;
import android.os.Bundle;
import android.window.C0988;
import android.window.C0989;
import androidx.activity.C0995;
import androidx.activity.C0996;
import androidx.activity.result.C0992;
import androidx.activity.result.C0993;
import androidx.appcompat.widget.C1000;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1003;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.app.C1005;
import androidx.core.content.C1006;
import androidx.core.content.C1007;
import androidx.core.content.C1008;
import androidx.core.widget.C1011;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.annotation.C1016;
import com.github.megatronking.stringfog.annotation.C1017;
import com.google.android.material.appbar.C1020;
import com.google.android.material.behavior.C1022;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.carousel.C1029;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.internal.C1038;
import com.google.android.material.textfield.C1041;
import com.google.android.material.timepicker.C1044;
import com.google.android.material.transformation.C1045;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1050;
import io.fastkv.C1052;
import io.fastkv.C1053;
import kotlinx.coroutines.C1055;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: hn */
/* JADX INFO: loaded from: classes.dex */
public final class C0304hn implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        int iM2975 = C1016.m2975("ۡۤ۠");
        while (true) {
            switch (iM2975) {
                case 1748765:
                    AbstractC0493mp.m1857g("act", activity);
                    iM2975 = (C1007.f5654 ^ C1033.f5680) + 1754162;
                    break;
                case 1751623:
                    if (C1004.f5651 % (C1015.f5662 * 3654) <= 0) {
                        C0992.m2879();
                        str = "ۣۥ۠";
                    } else {
                        str = "ۡۤ۠";
                    }
                    iM2975 = C0989.m2867(str);
                    break;
                case 1754502:
                    return;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        String str;
        int iM3057 = C1036.m3057("ۣ۟ۡ");
        while (true) {
            switch (iM3057) {
                case 1746813:
                    AbstractC0493mp.m1857g("act", activity);
                    if ((C1058.f5705 ^ (C1045.f5692 / (-2284))) < 0) {
                        iM3057 = (C1005.f5652 ^ C1049.f5696) + 1752668;
                    } else {
                        C1004.f5651 = 17;
                        iM3057 = C1005.m2931("ۥۣۡ");
                    }
                    break;
                case 1752579:
                    if ((C1003.f5650 ^ (C1006.f5653 - 8189)) <= 0) {
                        C1031.m3037();
                        str = "۠ۦۤ";
                    } else {
                        str = "ۣ۟ۡ";
                    }
                    iM3057 = C0996.m2894(str);
                    break;
                case 1752739:
                    return;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int iM2981 = C1017.m2981("۟ۢ۠");
        while (true) {
            switch (iM2981) {
                case 1746781:
                    AbstractC0493mp.m1857g("act", activity);
                    if (C1037.f5684 > 0) {
                        iM2981 = (C1011.f5658 ^ C1058.f5705) + 1753860;
                    } else {
                        C1003.f5650 = 13;
                        iM2981 = C1045.m3088("۟ۢ۠");
                    }
                    break;
                case 1747901:
                    if (C0992.f5639 < 0) {
                        iM2981 = C1038.m3063("۟ۢ۠");
                    } else {
                        C1041.m3076();
                        iM2981 = C1045.m3088("ۦۣۤ");
                    }
                    break;
                case 1754600:
                    return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0082 A[SYNTHETIC] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResumed(android.app.Activity r8) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0304hn.onActivityResumed(android.app.Activity):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[SYNTHETIC] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivitySaveInstanceState(android.app.Activity r4, android.os.Bundle r5) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0304hn.onActivitySaveInstanceState(android.app.Activity, android.os.Bundle):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        String str;
        int iM2993 = C1020.m2993("ۤۤۥ");
        while (true) {
            switch (iM2993) {
                case 1751653:
                    AbstractC0493mp.m1857g("act", activity);
                    str = "ۦۢۢ";
                    iM2993 = C1053.m3122(str);
                    break;
                case 1753510:
                    break;
                case 1753606:
                    if (C1017.f5664 + (C1019.f5666 ^ (-912)) > 0) {
                        iM2993 = C1017.f5664 + C1008.f5655 + 1752748;
                    } else {
                        C0988.f5635 = 54;
                        str = "ۡۢۧ";
                        iM2993 = C1053.m3122(str);
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        String str;
        Float fValueOf = null;
        int iM2856 = C0986.m2856("ۥ۠۠");
        while (true) {
            switch (iM2856) {
                case 1746875:
                    iM2856 = (C1007.f5654 - C0995.f5642) + 1749102;
                    break;
                case 1748707:
                    System.out.println(fValueOf);
                    if (C1029.f5676 % (C1055.f5702 | 8215) < 0) {
                        str = "ۣۢ۠";
                        iM2856 = C0996.m2894(str);
                    } else {
                        C1044.m3086();
                        iM2856 = C0988.m2863("ۣۢ۠");
                    }
                    break;
                case 1749605:
                    break;
                case 1749853:
                    fValueOf = Float.valueOf(C1023.m3004("xWkyCoU32xDk"));
                    if (C1005.m2933() < 0) {
                        iM2856 = (C1059.f5706 * C1022.f5669) + 1725739;
                    } else {
                        C1017.m2979();
                        str = "۟ۥۡ";
                        iM2856 = C0996.m2894(str);
                    }
                    break;
                case 1751617:
                    if (C0993.m2882() > 0) {
                        iM2856 = (C1007.f5654 - C0995.f5642) + 1749102;
                    } else if (C1057.f5704 + (C1000.f5647 / (-177)) > 0) {
                        iM2856 = C1020.m2993("ۣۢۨ");
                    } else {
                        C1045.m3091();
                        iM2856 = C1044.m3085("ۣۤ۠");
                    }
                    break;
                case 1751713:
                    if (C1002.f5649 / (C0992.f5639 + 3088) != 0) {
                        C1000.f5647 = 62;
                        iM2856 = C0989.m2867("ۨۤۧ");
                    } else {
                        iM2856 = (C1044.f5691 - C1037.f5684) + 1753027;
                    }
                    break;
                case 1752485:
                    AbstractC0493mp.m1857g("act", activity);
                    if (C1054.m3124() < 0) {
                        iM2856 = (C1052.f5699 % C1050.f5697) + 1751416;
                    } else {
                        C1058.m3141();
                        iM2856 = C1020.m2993("ۣۢۨ");
                    }
                    break;
            }
            return;
        }
    }
}
