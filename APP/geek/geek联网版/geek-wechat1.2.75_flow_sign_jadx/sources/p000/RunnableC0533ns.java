package p000;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.window.C0989;
import android.window.C0991;
import androidx.activity.C0995;
import androidx.activity.result.C0994;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.app.C1005;
import androidx.core.content.C1007;
import androidx.core.content.C1008;
import com.github.megatronking.stringfog.C1019;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1027;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.textfield.C1041;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.timepicker.C1044;
import com.ljx.wechatmod.hook.C1049;
import io.fastkv.C1052;

/* JADX INFO: renamed from: ns */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0533ns implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f3337a = 0;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f3338b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f3339c;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    public /* synthetic */ RunnableC0533ns(ViewGroup viewGroup, LinearLayout linearLayout) {
        String str;
        String str2;
        float f = 0.0f;
        int iM3074 = C1041.m3074("۟ۡۢ");
        while (true) {
            switch (iM3074) {
                case 56288:
                    break;
                case 1746752:
                    this.f3339c = viewGroup;
                    if (C1033.m3045() >= 0) {
                        C1052.m3116();
                        iM3074 = C1005.m2931("ۥ۟۠");
                    } else {
                        iM3074 = (C1049.f5696 - C1026.f5673) ^ (-1746442);
                    }
                    break;
                case 1746755:
                    this.f3338b = linearLayout;
                    if (C0995.f5642 <= 0) {
                        C1044.f5691 = 65;
                        iM3074 = C1052.m3118("۟۟");
                    } else {
                        iM3074 = (C1019.f5666 / C0994.f5641) + 1751523;
                    }
                    break;
                case 1748704:
                    System.out.println(f);
                    if (C1033.f5680 - (C1043.f5690 % 3287) <= 0) {
                        C1019.f5666 = 30;
                        str2 = "۟ۡۢ";
                    } else {
                        str2 = "۟۟";
                    }
                    iM3074 = C0991.m2876(str2);
                    break;
                case 1751523:
                    str = C0989.m2869() <= 0 ? "ۤۥۥ" : "۟۟";
                    iM3074 = C1027.m3021(str);
                    break;
                case 1751684:
                    f = Float.parseFloat(C1043.m3083("cMKwUdoi5i"));
                    if (C0991.f5638 <= 0) {
                    }
                    iM3074 = C1043.m763("ۡۢۡ");
                    break;
                case 1752454:
                    if (C1008.f5655 - (C1004.f5651 ^ (-9567)) > 0) {
                        iM3074 = C1007.m2938("۟ۡۢ");
                    } else {
                        str = "ۨۨۤ";
                        iM3074 = C1027.m3021(str);
                    }
                    break;
                case 1752489:
                    iM3074 = C1027.m3021(str);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ RunnableC0533ns(android.widget.LinearLayout r4, android.view.ViewGroup r5) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC0533ns.<init>(android.widget.LinearLayout, android.view.ViewGroup):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x001a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC0533ns.run():void");
    }
}
