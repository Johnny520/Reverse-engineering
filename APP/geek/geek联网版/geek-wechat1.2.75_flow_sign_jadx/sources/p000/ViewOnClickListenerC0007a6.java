package p000;

import android.app.C0986;
import android.app.Dialog;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.window.C0991;
import androidx.activity.C0995;
import androidx.activity.C0996;
import androidx.activity.result.C0992;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0998;
import androidx.appcompat.widget.C1000;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.coordinatorlayout.widget.C1003;
import androidx.core.content.C1007;
import androidx.legacy.content.C1012;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.annotation.C1016;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.appbar.C1021;
import com.google.android.material.button.C1025;
import com.google.android.material.carousel.C1028;
import com.google.android.material.datepicker.C1035;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.transformation.C1045;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.p001ui.C1051;
import io.fastkv.C1053;
import java.io.Serializable;
import kotlinx.coroutines.C1055;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0007a6 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final int f38a = 2;

    /* JADX INFO: renamed from: b */
    public final Object f39b;

    /* JADX INFO: renamed from: c */
    public final KeyEvent.Callback f40c;

    /* JADX INFO: renamed from: d */
    public final Serializable f41d;

    /* JADX INFO: renamed from: e */
    public final Object f42e;

    /* JADX INFO: renamed from: f */
    public final Object f43f;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ViewOnClickListenerC0007a6(android.app.Activity r5, java.lang.String r6, java.lang.String r7, android.widget.FrameLayout r8, android.widget.LinearLayout r9) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnClickListenerC0007a6.<init>(android.app.Activity, java.lang.String, java.lang.String, android.widget.FrameLayout, android.widget.LinearLayout):void");
    }

    public /* synthetic */ ViewOnClickListenerC0007a6(TextView textView, String str, l00 l00Var, Dialog dialog, C0636qk c0636qk) {
        String str2;
        String str3;
        int iM3011 = C1025.m3011("ۧۨ۟");
        long j = 0;
        while (true) {
            switch (iM3011) {
                case 1747749:
                    this.f40c = dialog;
                    iM3011 = (C0986.f5633 - C1025.f5672) ^ 1752098;
                    continue;
                case 1748706:
                    if (C1043.m3082() <= 0) {
                        C1053.f5700 = 20;
                        str3 = "ۣۤۦ";
                    } else {
                        str3 = "ۧۨ۟";
                    }
                    iM3011 = C1045.m3088(str3);
                    continue;
                case 1748765:
                    return;
                case 1751529:
                    this.f43f = c0636qk;
                    iM3011 = (C1043.f5690 - C0991.f5638) + 1757102;
                    continue;
                case 1751557:
                    this.f42e = l00Var;
                    if (C1055.f5702 - (C1001.f5648 * 7814) >= 0) {
                    }
                    iM3011 = C1051.m3113("۠ۢۧ");
                    continue;
                case 1752520:
                    System.out.println(j);
                    iM3011 = (C1056.f5703 % C0997.f5644) + 1748714;
                    continue;
                case 1754383:
                    break;
                case 1754654:
                    this.f39b = textView;
                    if ((C1003.f5650 | (C1021.f5668 - 2293)) >= 0) {
                        C0995.f5642 = 31;
                        iM3011 = C1012.m2961("ۣۡۢ");
                    } else {
                        iM3011 = C1018.f5665 + C1018.f5665 + 1755309;
                        continue;
                    }
                    break;
                case 1755593:
                    if (C1021.m2995() >= 0) {
                        if (C1019.m2988() <= 0) {
                            C1035.m3053();
                            iM3011 = C1007.m2938("ۧ۟ۧ");
                        } else {
                            iM3011 = (C1047.f5694 + C0996.f5643) ^ (-1755187);
                        }
                    }
                    break;
                case 1755620:
                    j = Long.parseLong(C1036.m3055("sTgvxvuof8s"));
                    if (C0992.f5639 * (C1000.f5647 | 7778) >= 0) {
                        C0996.f5643 = 32;
                        str2 = "ۤ۠ۥ";
                    } else {
                        str2 = "ۥۡۤ";
                    }
                    iM3011 = C1028.m3025(str2);
                    continue;
                case 1755623:
                    this.f41d = str;
                    iM3011 = C0998.m2905("ۤۡۢ");
                    continue;
            }
            iM3011 = (C0992.f5639 | (C1016.f5663 % (-2661))) >= 0 ? C1015.m2970("ۥۣۡ") : C1016.f5663 + C1036.f5683 + 1748865;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ViewOnClickListenerC0007a6(android.widget.TextView r4, p000.p00 r5, android.app.Dialog r6, android.app.Dialog r7, android.app.Activity r8) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnClickListenerC0007a6.<init>(android.widget.TextView, p00, android.app.Dialog, android.app.Dialog, android.app.Activity):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:117:0x0400. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0038. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0419 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x040c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x059c A[SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r36) {
        /*
            Method dump skipped, instruction units count: 1710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnClickListenerC0007a6.onClick(android.view.View):void");
    }
}
