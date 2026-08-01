package p000;

import android.app.Activity;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.window.C0991;
import androidx.activity.C0995;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0999;
import androidx.appcompat.widget.C1000;
import androidx.coordinatorlayout.widget.C1003;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.app.C1005;
import androidx.core.content.C1007;
import androidx.core.graphics.drawable.C1009;
import androidx.legacy.content.C1013;
import androidx.legacy.content.C1014;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.annotation.C1017;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.appbar.C1021;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.button.C1025;
import com.google.android.material.datepicker.C1032;
import com.google.android.material.datepicker.C1035;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.sidesheet.C1039;
import com.google.android.material.textfield.C1041;
import com.google.android.material.theme.C1042;
import com.google.android.material.timepicker.C1043;
import com.ljx.wechatmod.p001ui.C1051;
import io.fastkv.C1052;
import kotlinx.coroutines.C1055;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: gt */
/* JADX INFO: loaded from: classes.dex */
public final class C0273gt extends t50 implements InterfaceC0935ym {

    /* JADX INFO: renamed from: e */
    public int f2046e;

    /* JADX INFO: renamed from: f */
    public final String f2047f;

    /* JADX INFO: renamed from: g */
    public final TextView f2048g;

    /* JADX INFO: renamed from: h */
    public final LinearLayout f2049h;

    /* JADX INFO: renamed from: i */
    public final Activity f2050i;

    /* JADX INFO: renamed from: j */
    public final C0713sn f2051j;

    /* JADX INFO: renamed from: k */
    public final WebView f2052k;

    /* JADX INFO: renamed from: l */
    public final ScrollView f2053l;

    /* JADX INFO: renamed from: m */
    public final EditText f2054m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001a. Please report as an issue. */
    public C0273gt(String str, TextView textView, LinearLayout linearLayout, Activity activity, C0713sn c0713sn, WebView webView, ScrollView scrollView, EditText editText, InterfaceC0814vd interfaceC0814vd) {
        String str2;
        super(interfaceC0814vd);
        this.f2047f = str;
        this.f2048g = textView;
        this.f2049h = linearLayout;
        this.f2050i = activity;
        this.f2051j = c0713sn;
        this.f2052k = webView;
        this.f2053l = scrollView;
        this.f2054m = editText;
        Long lValueOf = null;
        int iM2946 = C1009.m2946("۟ۡۨ");
        while (true) {
            switch (iM2946) {
                case 1746758:
                    if (C1042.m3080() > 0) {
                        iM2946 = (C1023.f5670 - C1000.f5647) ^ (-1747500);
                    } else if (C1052.f5699 > 0) {
                        str2 = "۟ۤۥ";
                        iM2946 = C1051.m3113(str2);
                    } else {
                        iM2946 = C1025.m3011("ۤۦۦ");
                    }
                    break;
                case 1746848:
                    lValueOf = Long.valueOf(C1005.m2930("AcPml8r"));
                    if (C1017.f5664 >= 0) {
                        C1015.m2972();
                    }
                    iM2946 = C1004.m2927("۠ۦۥ");
                    break;
                case 1747871:
                    System.out.println(lValueOf);
                    if (C1003.f5650 + (C1009.f5656 * (-9527)) <= 0) {
                        C1032.m3040();
                    }
                    str2 = "ۡۢۢ";
                    iM2946 = C1051.m3113(str2);
                    break;
                case 1748705:
                    break;
                case 1751716:
                    iM2946 = (C1023.f5670 - C1000.f5647) ^ (-1747500);
                    break;
                case 1752740:
                    iM2946 = (C1041.f5688 / C0995.f5642) ^ 1746758;
                    break;
            }
            return;
        }
    }

    @Override // p000.t50
    /* JADX INFO: renamed from: a */
    public final InterfaceC0814vd mo35a(InterfaceC0814vd interfaceC0814vd) {
        String str;
        int iM3078 = C1042.m3078("ۤۡۦ");
        EditText editText = null;
        ScrollView scrollView = null;
        while (true) {
            switch (iM3078) {
                case 1749698:
                    return new C0273gt(this.f2047f, this.f2048g, this.f2049h, this.f2050i, this.f2051j, this.f2052k, scrollView, editText, interfaceC0814vd);
                case 1751561:
                    scrollView = this.f2053l;
                    if (C0999.f5646 + (C1009.f5656 / 5475) >= 0) {
                        C1021.f5668 = 16;
                        iM3078 = C1035.m3052("ۤۡۦ");
                    } else {
                        iM3078 = (C1023.f5670 + C1007.f5654) ^ 1754097;
                        continue;
                    }
                    break;
                case 1751746:
                    if ((C0991.f5638 ^ (C1014.f5661 * (-598))) < 0) {
                        iM3078 = (C1054.f5701 * C1039.f5686) ^ 1623753;
                    } else {
                        str = "ۦۥ";
                    }
                    break;
                case 1753454:
                    editText = this.f2054m;
                    if (C1043.f5690 < 0) {
                        str = "ۣۣۢ";
                    } else {
                        C0997.f5644 = 50;
                        iM3078 = C1054.m3127("ۤۧۥ");
                    }
                    break;
            }
            iM3078 = C1004.m2927(str);
        }
    }

    @Override // p000.InterfaceC0935ym
    /* JADX INFO: renamed from: e */
    public final Object mo36e(Object obj, Object obj2) {
        int iM3131 = C1055.m3131("۠ۦ۠");
        while (true) {
            switch (iM3131) {
                case 1746726:
                    return ((C0273gt) mo35a((InterfaceC0814vd) obj2)).mo37g(C0893xh.f5258n);
                case 1747866:
                    if (C1013.f5660 + (C1013.f5660 - 831) < 0) {
                        iM3131 = (C1017.f5664 * C0999.f5646) + 1554768;
                    } else {
                        C1018.m2982();
                        iM3131 = C1005.m2931("ۢۡ۠");
                    }
                    break;
                case 1749633:
                    iM3131 = (C0999.f5646 ^ C1036.f5683) + 1748181;
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:305:0x028e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0288 A[SYNTHETIC] */
    @Override // p000.t50
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo37g(java.lang.Object r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0273gt.mo37g(java.lang.Object):java.lang.Object");
    }
}
