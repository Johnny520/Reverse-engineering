package p000;

import android.app.Activity;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.window.C0988;
import android.window.C0989;
import android.window.C0991;
import androidx.activity.C0995;
import androidx.activity.C0996;
import androidx.activity.result.C0993;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0998;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1003;
import androidx.core.app.C1005;
import androidx.core.content.C1008;
import androidx.core.graphics.drawable.C1010;
import androidx.legacy.content.C1012;
import androidx.legacy.content.C1013;
import androidx.legacy.content.C1014;
import com.github.megatronking.stringfog.C1019;
import com.google.android.material.button.C1025;
import com.google.android.material.carousel.C1028;
import com.google.android.material.carousel.C1029;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1032;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.internal.C1038;
import com.google.android.material.theme.C1042;
import com.google.android.material.transformation.C1046;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.hook.C1048;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1051;
import io.fastkv.C1053;
import kotlinx.coroutines.C1056;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: ft */
/* JADX INFO: loaded from: classes.dex */
public final class C0236ft extends t50 implements InterfaceC0935ym {

    /* JADX INFO: renamed from: e */
    public final TextView f1828e;

    /* JADX INFO: renamed from: f */
    public final p00 f1829f;

    /* JADX INFO: renamed from: g */
    public final LinearLayout f1830g;

    /* JADX INFO: renamed from: h */
    public final Activity f1831h;

    /* JADX INFO: renamed from: i */
    public final p00 f1832i;

    /* JADX INFO: renamed from: j */
    public final C0713sn f1833j;

    /* JADX INFO: renamed from: k */
    public final WebView f1834k;

    /* JADX INFO: renamed from: l */
    public final ScrollView f1835l;

    /* JADX INFO: renamed from: m */
    public final EditText f1836m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0236ft(TextView textView, p00 p00Var, LinearLayout linearLayout, Activity activity, p00 p00Var2, C0713sn c0713sn, WebView webView, ScrollView scrollView, EditText editText, InterfaceC0814vd interfaceC0814vd) {
        super(interfaceC0814vd);
        this.f1828e = textView;
        this.f1829f = p00Var;
        this.f1830g = linearLayout;
        this.f1831h = activity;
        this.f1832i = p00Var2;
        this.f1833j = c0713sn;
        this.f1834k = webView;
        this.f1835l = scrollView;
        this.f1836m = editText;
        int iM3063 = C1038.m3063("ۦۨۧ");
        long j = 0;
        while (true) {
            switch (iM3063) {
                case 56448:
                    break;
                case 1746722:
                    System.out.println(j);
                    iM3063 = (C1012.f5659 / C1054.f5701) + 1750692;
                    continue;
                case 1749602:
                    long j2 = Long.parseLong(C1038.m3065("crixqB495BI7oR93og3tC"));
                    if (C1012.f5659 <= 0) {
                        C0998.f5645 = 17;
                        iM3063 = C0997.m2901("ۦۧۢ");
                        j = j2;
                    } else {
                        iM3063 = C0996.m2894("ۣ۟۠");
                        j = j2;
                        continue;
                    }
                    break;
                case 1750691:
                    return;
                case 1753665:
                    iM3063 = C1005.m2931(C1014.f5661 % (C1049.f5696 + (-5334)) <= 0 ? "ۥۤۢ" : "ۦۨۧ");
                    continue;
                case 1753701:
                    if (C0988.m2865() <= 0) {
                        if ((C0991.f5638 ^ (C0993.f5640 / 6893)) <= 0) {
                            C1054.m3124();
                            iM3063 = C1032.m3039("ۣ۟۠");
                        } else {
                            iM3063 = (C1047.f5694 * C1002.f5649) + 1359883;
                        }
                    }
                    break;
            }
            if (C1046.m3094() <= 0) {
                C1028.m3022();
                iM3063 = C1042.m3078("ۣۧۨ");
            } else {
                iM3063 = (C1048.f5695 * C1031.f5678) ^ (-1760013);
            }
        }
    }

    @Override // p000.t50
    /* JADX INFO: renamed from: a */
    public final InterfaceC0814vd mo35a(InterfaceC0814vd interfaceC0814vd) {
        String str;
        int iM3139 = C1057.m3139("ۦۤۥ");
        EditText editText = null;
        ScrollView scrollView = null;
        while (true) {
            switch (iM3139) {
                case 1747649:
                    if ((C1036.f5683 ^ (C1057.f5704 % (-48))) <= 0) {
                        C1008.f5655 = 71;
                        str = "ۤ۟ۢ";
                    } else {
                        str = "ۦۤۥ";
                    }
                    iM3139 = C1003.m2922(str);
                    break;
                case 1747899:
                    editText = this.f1836m;
                    if ((C1058.f5705 ^ (C1013.f5660 % 9099)) >= 0) {
                        C0995.f5642 = 36;
                    }
                    iM3139 = C1048.m3101("ۤۥۤ");
                    break;
                case 1751683:
                    return new C0236ft(this.f1828e, this.f1829f, this.f1830g, this.f1831h, this.f1832i, this.f1833j, this.f1834k, scrollView, editText, interfaceC0814vd);
                case 1753575:
                    scrollView = this.f1835l;
                    if (C1046.m3094() <= 0) {
                        C1037.m3060();
                    }
                    iM3139 = C1002.m2920("۠ۧۢ");
                    break;
            }
        }
    }

    @Override // p000.InterfaceC0935ym
    /* JADX INFO: renamed from: e */
    public final Object mo36e(Object obj, Object obj2) throws Throwable {
        String str;
        int iM3027 = C1029.m3027("ۦۧۨ");
        C0893xh c0893xh = null;
        C0236ft c0236ft = null;
        while (true) {
            switch (iM3027) {
                case 1746944:
                    c0236ft.mo37g(c0893xh);
                    iM3027 = (C0993.f5640 | C1057.f5704) ^ (-1748072);
                    continue;
                case 1748709:
                    return c0893xh;
                case 1750692:
                    if (C1057.f5704 - (C1047.f5694 * (-8198)) < 0) {
                        iM3027 = (C1053.f5700 ^ C1010.f5657) ^ 1753443;
                    } else {
                        str = "ۣۧۤ";
                    }
                    break;
                case 1753671:
                    str = "ۧۥ۟";
                    break;
                case 1754446:
                    C0893xh c0893xh2 = C0893xh.f5258n;
                    if (C1059.f5706 % (C1025.f5672 ^ (-9213)) >= 0) {
                        C1056.m3134();
                        iM3027 = C1042.m3078("ۡۢۦ");
                        c0893xh = c0893xh2;
                    } else {
                        iM3027 = C1019.m2989("۟ۧۨ");
                        c0893xh = c0893xh2;
                        continue;
                    }
                    break;
                case 1754561:
                    C0236ft c0236ft2 = (C0236ft) mo35a((InterfaceC0814vd) obj2);
                    if (C0994.f5641 / (C0989.f5636 * 6334) != 0) {
                        C1056.f5703 = 31;
                        iM3027 = C1051.m3113("ۣۤۥ");
                        c0236ft = c0236ft2;
                    } else {
                        iM3027 = C1013.m2965("ۧۡۨ");
                        c0236ft = c0236ft2;
                        continue;
                    }
                    break;
            }
            iM3027 = C0997.m2901(str);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0052. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x051a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x01af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0828 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x081a A[SYNTHETIC] */
    @Override // p000.t50
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo37g(java.lang.Object r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0236ft.mo37g(java.lang.Object):java.lang.Object");
    }
}
