package com.ljx.wechatmod.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.window.C0988;
import android.window.C0989;
import android.window.C0990;
import android.window.C0991;
import androidx.activity.C0995;
import androidx.activity.C0996;
import androidx.activity.result.C0992;
import androidx.activity.result.C0993;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0998;
import androidx.appcompat.widget.C1000;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.app.C1005;
import androidx.core.content.C1007;
import androidx.core.content.C1008;
import androidx.core.graphics.drawable.C1010;
import androidx.legacy.content.C1012;
import androidx.legacy.content.C1014;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.annotation.C1017;
import com.google.android.material.appbar.C1020;
import com.google.android.material.appbar.C1021;
import com.google.android.material.behavior.C1022;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.button.C1025;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1027;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.internal.C1038;
import com.google.android.material.sidesheet.C1039;
import com.google.android.material.snackbar.C1040;
import com.google.android.material.textfield.C1041;
import com.ljx.wechatmod.hook.C1049;
import io.fastkv.C1052;
import io.fastkv.C1053;
import kotlinx.coroutines.C1055;
import kotlinx.coroutines.C1056;
import kotlinx.coroutines.internal.C1054;
import p000.AbstractC0369jc;
import p000.AbstractC0465ly;
import p000.C1059;
import p000.RunnableC0267gn;
import p000.b50;
import p000.g40;

/* JADX INFO: loaded from: classes.dex */
public final class GeekConfig$registerUpdateReceiver$receiver$1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final int f1234a = 0;

    public GeekConfig$registerUpdateReceiver$receiver$1() {
        int iM2885 = C0993.m2885("ۦۧۡ");
        Float f = null;
        while (true) {
            switch (iM2885) {
                case 1746843:
                    Float fValueOf = Float.valueOf(C1017.m2978("Q33T"));
                    if (C1010.f5657 + C1008.f5655 + 7290 <= 0) {
                        C0998.m2903();
                        iM2885 = C1007.m2938("ۦۧۡ");
                        f = fValueOf;
                    } else {
                        iM2885 = 1754757 + C1015.f5662 + C0998.f5645;
                        f = fValueOf;
                        continue;
                    }
                    break;
                case 1747687:
                    return;
                case 1753664:
                    if (C0996.m2896() <= 0) {
                        iM2885 = (C1005.f5652 * C1000.f5647) ^ (-1220535);
                    }
                    break;
                case 1755528:
                    System.out.println(f);
                    if (C0992.f5639 >= 0) {
                    }
                    iM2885 = C1020.m2993("۠۠ۧ");
                    continue;
                case 1755560:
                    if ((C1014.f5661 ^ (C1053.f5700 + 154)) <= 0) {
                        C1000.m2913();
                        iM2885 = C1017.m2981("ۢۤۦ");
                    } else {
                        iM2885 = (C1025.f5672 * C0997.f5644) ^ 1798329;
                        continue;
                    }
                    break;
                case 1755620:
                    break;
            }
            iM2885 = C1007.m2938("۠۠ۧ");
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        int iM2873 = C0990.m2873("ۥۡ۠");
        while (true) {
            switch (iM2873) {
                case 1746904:
                case 1755338:
                    str = "۠ۡۡ";
                    iM2873 = C1019.m2989(str);
                    break;
                case 1747712:
                    new Handler(Looper.getMainLooper()).post(new RunnableC0267gn(1));
                    iM2873 = C1059.m3145("۠ۡۧ");
                    break;
                case 1747718:
                    break;
                case 1747778:
                    AbstractC0465ly.f3052f = -1.0f;
                    iM2873 = (C1040.f5687 - C0994.f5641) ^ (-1752486);
                    break;
                case 1747900:
                    try {
                        AbstractC0465ly.f3049c.clear();
                    } catch (Throwable th) {
                        g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", b50.m492a("zcuXKO+xq3njya0T3rezfunXuizDtQ==\n", "iq7yQ6zexR8=\n"), "tw==\n", "0vI8ySRxU5w=\n");
                        if (C1055.f5702 / (C1020.f5667 * 3291) != 0) {
                            iM2873 = C1017.m2981("ۧۨۢ");
                        } else {
                            str = "۟ۦ۟";
                        }
                    }
                    if (C1041.f5688 > 0) {
                        str = "ۧۨۢ";
                        iM2873 = C1019.m2989(str);
                    } else {
                        iM2873 = C1022.m3001("۠ۡۡ");
                    }
                    break;
                case 1748889:
                    if (C1038.f5685 >= 0) {
                        C1026.f5673 = 31;
                        iM2873 = C1052.m3118("۟ۢۡ");
                    } else {
                        iM2873 = (C1020.f5667 ^ C0998.f5645) ^ (-1753391);
                    }
                    break;
                case 1749796:
                    if (C0991.f5638 > 0) {
                        iM2873 = (C1026.f5673 % C1012.f5659) + 1752708;
                    } else {
                        C1021.f5668 = 18;
                        str = "۠ۨۦ";
                        iM2873 = C1019.m2989(str);
                    }
                    break;
                case 1752516:
                    AbstractC0369jc.m1597a();
                    if ((C1056.f5703 | (C1037.f5684 ^ (-2397))) >= 0) {
                        C0989.m2869();
                        iM2873 = C1034.m3046("ۥۣۢ");
                    } else {
                        iM2873 = C0990.m2873("ۦۡ۠");
                    }
                    break;
                case 1752580:
                    AbstractC0465ly.f3048b.clear();
                    if (C0995.m2892() >= 0) {
                        C1049.m3105();
                        iM2873 = C1023.m3002("۟ۦ۟");
                    }
                    break;
                case 1752615:
                    AbstractC0465ly.f3047a.clear();
                    if (C1037.f5684 % (C1017.f5664 + 4866) > 0) {
                        iM2873 = (C1054.f5701 | C1039.f5686) ^ (-1752594);
                    } else {
                        C1015.f5662 = 99;
                        iM2873 = C1059.m3145("۠ۡۧ");
                    }
                    break;
                case 1753477:
                    AbstractC0465ly.f3050d = -1;
                    iM2873 = C0988.f5635 + C1002.f5649 + 1749520;
                    break;
                case 1754406:
                    if (C1037.m3060() < 0) {
                        str = "ۧۨۢ";
                        iM2873 = C1019.m2989(str);
                    } else {
                        C1005.m2933();
                        iM2873 = C1054.m3127("ۢ۟ۤ");
                    }
                    break;
                case 1754657:
                    iM2873 = C0988.f5635 * (C1027.f5674 / 5117) == 0 ? (C1053.f5700 / C1004.f5651) + 1755338 : C1012.m2961("ۣ۠ۧ");
                    break;
            }
            return;
        }
    }
}
