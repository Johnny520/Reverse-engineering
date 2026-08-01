package p000;

import android.app.Activity;
import android.app.C0987;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.C0997;
import androidx.activity.result.C0994;
import androidx.activity.result.C0995;
import androidx.appcompat.widget.C0999;
import androidx.appcompat.widget.C1002;
import androidx.constraintlayout.widget.C1005;
import androidx.constraintlayout.widget.C1006;
import androidx.coordinatorlayout.widget.C1007;
import androidx.profileinstaller.C1017;
import androidx.recyclerview.widget.C1018;
import androidx.recyclerview.widget.C1019;
import androidx.savedstate.C1020;
import androidx.savedstate.C1022;
import androidx.startup.C1023;
import androidx.viewpager2.adapter.C1029;
import com.github.megatronking.stringfog.C1034;
import com.github.megatronking.stringfog.xor.C1031;
import com.github.megatronking.stringfog.xor.C1032;
import com.google.android.material.appbar.C1035;
import com.google.android.material.carousel.C1038;
import com.google.android.material.carousel.C1041;
import com.google.android.material.chip.C1043;
import com.google.android.material.datepicker.C1044;
import com.google.android.material.theme.C1048;
import com.google.android.material.theme.C1049;
import com.google.android.material.theme.C1050;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: zs */
/* JADX INFO: loaded from: classes.dex */
public final class C0978zs extends m50 implements InterfaceC0861wm {

    /* JADX INFO: renamed from: e */
    public final TextView f5606e;

    /* JADX INFO: renamed from: f */
    public final i00 f5607f;

    /* JADX INFO: renamed from: g */
    public final LinearLayout f5608g;

    /* JADX INFO: renamed from: h */
    public final Activity f5609h;

    /* JADX INFO: renamed from: i */
    public final i00 f5610i;

    /* JADX INFO: renamed from: j */
    public final C0565on f5611j;

    /* JADX INFO: renamed from: k */
    public final WebView f5612k;

    /* JADX INFO: renamed from: l */
    public final ScrollView f5613l;

    /* JADX INFO: renamed from: m */
    public final EditText f5614m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001c. Please report as an issue. */
    public C0978zs(TextView textView, i00 i00Var, LinearLayout linearLayout, Activity activity, i00 i00Var2, C0565on c0565on, WebView webView, ScrollView scrollView, EditText editText, InterfaceC0444ld interfaceC0444ld) {
        String str;
        super(interfaceC0444ld);
        this.f5606e = textView;
        this.f5607f = i00Var;
        this.f5608g = linearLayout;
        this.f5609h = activity;
        this.f5610i = i00Var2;
        this.f5611j = c0565on;
        this.f5612k = webView;
        this.f5613l = scrollView;
        this.f5614m = editText;
        String strM2922 = null;
        int iM2932 = C1007.m2932("ۨۡ");
        while (true) {
            switch (iM2932) {
                case 56569:
                    if (C1044.m3077() > 0) {
                        str = "ۤۧۨ";
                        iM2932 = C1032.m3031(str);
                    } else {
                        iM2932 = (C1032.f5676 * C1018.f5662) + 1900095;
                    }
                    break;
                case 1750755:
                    strM2922 = C1005.m2922("C2qJ3lnD");
                    if (C1017.f5661 - (C1019.f5663 ^ 7135) >= 0) {
                        C1002.m2912();
                        iM2932 = C1022.m2990("ۨۨۨ");
                    } else {
                        iM2932 = (C0994.f5638 - C0999.f5643) + 1752022;
                    }
                    break;
                case 1751589:
                    System.out.println(strM2922);
                    str = "ۤۧۨ";
                    iM2932 = C1032.m3031(str);
                    break;
                case 1751749:
                    break;
                case 1753451:
                    str = "ۤۧۨ";
                    iM2932 = C1032.m3031(str);
                    break;
                case 1755624:
                    if (C0994.f5638 * (C1023.f5667 - 6245) > 0) {
                        iM2932 = (C1020.f5664 - C1049.f5693) ^ (-57118);
                    } else {
                        C0995.f5639 = 61;
                        str = "ۧ۟ۤ";
                        iM2932 = C1032.m3031(str);
                    }
                    break;
            }
            return;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    public final InterfaceC0444ld mo471a(InterfaceC0444ld interfaceC0444ld) {
        String str;
        int iM2911 = C1002.m2911("ۣ۠ۡ");
        EditText editText = null;
        ScrollView scrollView = null;
        while (true) {
            switch (iM2911) {
                case 56325:
                    iM2911 = C1034.f5678 + C0987.f5631 + 1747656;
                    continue;
                case 1746969:
                    editText = this.f5614m;
                    str = "ۨ۟ۥ";
                    break;
                case 1747774:
                    scrollView = this.f5613l;
                    if (C1050.f5694 / (C0997.f5641 + 9675) == 0) {
                        iM2911 = (C1029.f5673 - C0995.f5639) + 1745756;
                    } else {
                        C1006.m2928();
                        str = "ۣ۠ۡ";
                    }
                    break;
                case 1755342:
                    return new C0978zs(this.f5606e, this.f5607f, this.f5608g, this.f5609h, this.f5610i, this.f5611j, this.f5612k, scrollView, editText, interfaceC0444ld);
            }
            iM2911 = C1007.m2932(str);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    @Override // p000.InterfaceC0861wm
    /* JADX INFO: renamed from: e */
    public final Object mo472e(Object obj, Object obj2) throws Throwable {
        String str;
        C0819vh c0819vh;
        String str2;
        int iM2926 = C1006.m2926("ۥۢۧ");
        C0819vh c0819vh2 = null;
        C0978zs c0978zs = null;
        while (true) {
            switch (iM2926) {
                case 1746875:
                    c0978zs.mo473g(c0819vh2);
                    if (C1018.m2974() >= 0) {
                        C1032.m3030();
                        str2 = "ۣۣۢ";
                    } else {
                        str2 = "ۦۨۧ";
                    }
                    iM2926 = C1035.m3042(str2);
                    break;
                case 1747743:
                    C0978zs c0978zs2 = (C0978zs) mo471a((InterfaceC0444ld) obj2);
                    iM2926 = (C1043.f5687 % C1048.f5692) ^ (-1753285);
                    c0978zs = c0978zs2;
                    break;
                case 1749698:
                    if (C1057.m3129() >= 0) {
                        C1019.m2981();
                        str = "۠ۥۧ";
                    } else {
                        str = "ۥۢۧ";
                    }
                    iM2926 = C1041.m3065(str);
                    break;
                case 1752554:
                    if (C1017.m2970() > 0) {
                        c0819vh = c0819vh2;
                        iM2926 = C1031.m3027("۠ۢۡ");
                        c0819vh2 = c0819vh;
                    } else {
                        C0995.m2882();
                        iM2926 = C1031.m3027("ۥۢۧ");
                    }
                    break;
                case 1753451:
                    c0819vh = C0819vh.f4855n;
                    if ((C1032.f5676 ^ (C1038.f5682 * (-1491))) < 0) {
                        str = "۟ۥۡ";
                        c0819vh2 = c0819vh;
                        iM2926 = C1041.m3065(str);
                    } else {
                        C1056.f5700 = 35;
                        iM2926 = C1031.m3027("۠ۢۡ");
                        c0819vh2 = c0819vh;
                    }
                    break;
                case 1753701:
                    break;
            }
            return c0819vh2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0056. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x07b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x071b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0718 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0582 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0574 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0561 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0555 A[SYNTHETIC] */
    @Override // p000.m50
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo473g(java.lang.Object r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0978zs.mo473g(java.lang.Object):java.lang.Object");
    }
}
