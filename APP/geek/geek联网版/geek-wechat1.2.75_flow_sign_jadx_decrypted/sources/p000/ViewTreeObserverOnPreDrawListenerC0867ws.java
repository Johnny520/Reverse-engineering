package p000;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.result.C0992;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0997;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.app.C1005;
import androidx.core.content.C1006;
import androidx.core.content.C1008;
import androidx.legacy.content.C1012;
import androidx.legacy.content.C1013;
import com.github.megatronking.stringfog.annotation.C1016;
import com.google.android.material.appbar.C1020;
import com.google.android.material.behavior.C1022;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.datepicker.C1035;
import com.google.android.material.internal.C1038;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.transformation.C1046;
import com.ljx.wechatmod.hook.C1048;
import io.fastkv.C1052;
import io.fastkv.C1053;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: ws */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0867ws implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public int f5105a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f5106b;

    /* JADX INFO: renamed from: c */
    public final C0810v9 f5107c;

    /* JADX INFO: renamed from: d */
    public final Activity f5108d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    public ViewTreeObserverOnPreDrawListenerC0867ws(ViewGroup viewGroup, C0810v9 c0810v9, Activity activity) {
        String str;
        Long lValueOf;
        String str2;
        Long l = null;
        int iM3118 = C1052.m3118("۠ۥۨ");
        while (true) {
            switch (iM3118) {
                case 1746725:
                    this.f5107c = c0810v9;
                    if (C1005.f5652 / (C1035.f5682 ^ (-1815)) != 0) {
                        C1053.f5700 = 74;
                        iM3118 = C1020.m2993("۟۠ۦ");
                    } else {
                        iM3118 = C1052.m3118("ۨۦۨ");
                    }
                    break;
                case 1747742:
                    break;
                case 1747773:
                    lValueOf = Long.valueOf(C1012.m2960("ir9r0G"));
                    if (C1005.f5652 * (C1013.f5660 - 117) < 0) {
                        str = "ۦۧۥ";
                        iM3118 = C1004.m2927(str);
                        l = lValueOf;
                    } else {
                        iM3118 = C1046.m3095("ۦۧۥ");
                        l = lValueOf;
                    }
                    break;
                case 1747843:
                    this.f5106b = viewGroup;
                    iM3118 = C1006.m2936(C0994.f5641 - (C1048.f5695 / (-3176)) <= 0 ? "ۣۧۨ" : "۟۠ۦ");
                    break;
                case 1751749:
                    iM3118 = (C1002.f5649 ^ C0997.f5644) ^ 1746993;
                    break;
                case 1752460:
                    iM3118 = C1034.m3049() < 0 ? C0992.m2881("ۣۧۨ") : (C1016.f5663 + C1043.f5690) ^ (-1747165);
                    break;
                case 1753668:
                    System.out.println(l);
                    if (C1057.f5704 <= 0) {
                        C1024.f5671 = 25;
                        str2 = "۠ۢ۠";
                    } else {
                        str2 = "ۣۧۨ";
                    }
                    iM3118 = C1022.m3001(str2);
                    break;
                case 1754508:
                    break;
                case 1755562:
                    this.f5108d = activity;
                    if (C1052.f5699 / (C1008.f5655 % 8400) == 0) {
                        iM3118 = (C1038.f5685 / C1002.f5649) ^ 1752460;
                    } else {
                        C1056.f5703 = 72;
                        str = "ۤۧۨ";
                        lValueOf = l;
                        iM3118 = C1004.m2927(str);
                        l = lValueOf;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:131:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x04ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instruction units count: 2070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewTreeObserverOnPreDrawListenerC0867ws.onPreDraw():boolean");
    }
}
