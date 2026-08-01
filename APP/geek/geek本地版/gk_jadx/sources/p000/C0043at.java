package p000;

import android.app.Activity;
import android.app.C0989;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.C0996;
import androidx.activity.result.C0995;
import androidx.appcompat.app.C0998;
import androidx.appcompat.widget.C0999;
import androidx.appcompat.widget.C1001;
import androidx.constraintlayout.widget.C1006;
import androidx.coordinatorlayout.widget.C1007;
import androidx.core.widget.C1011;
import androidx.profileinstaller.C1016;
import androidx.recyclerview.widget.C1018;
import com.github.megatronking.stringfog.C1033;
import com.github.megatronking.stringfog.xor.C1032;
import com.google.android.material.appbar.C1035;
import com.google.android.material.carousel.C1040;
import com.google.android.material.chip.C1042;
import com.google.android.material.chip.C1043;
import com.google.android.material.datepicker.C1044;
import com.ljx.wechatmod.hook.C1052;
import com.ljx.wechatmod.p001ui.C1053;
import kotlinx.coroutines.C1055;

/* JADX INFO: renamed from: at */
/* JADX INFO: loaded from: classes.dex */
public final class C0043at extends m50 implements InterfaceC0861wm {

    /* JADX INFO: renamed from: e */
    public int f672e;

    /* JADX INFO: renamed from: f */
    public final String f673f;

    /* JADX INFO: renamed from: g */
    public final TextView f674g;

    /* JADX INFO: renamed from: h */
    public final LinearLayout f675h;

    /* JADX INFO: renamed from: i */
    public final Activity f676i;

    /* JADX INFO: renamed from: j */
    public final C0565on f677j;

    /* JADX INFO: renamed from: k */
    public final WebView f678k;

    /* JADX INFO: renamed from: l */
    public final ScrollView f679l;

    /* JADX INFO: renamed from: m */
    public final EditText f680m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0043at(java.lang.String r4, android.widget.TextView r5, android.widget.LinearLayout r6, android.app.Activity r7, p000.C0565on r8, android.webkit.WebView r9, android.widget.ScrollView r10, android.widget.EditText r11, p000.InterfaceC0444ld r12) {
        /*
            r3 = this;
            r3.f673f = r4
            r3.f674g = r5
            r3.f675h = r6
            r3.f676i = r7
            r3.f677j = r8
            r3.f678k = r9
            r3.f679l = r10
            r3.f680m = r11
            r3.<init>(r12)
            r1 = 0
            java.lang.String r0 = "ۨ۟۠"
            int r0 = android.app.C0988.m2854(r0)
        L1a:
            switch(r0) {
                case 56327: goto L1e;
                case 1746815: goto L5f;
                case 1751710: goto L92;
                case 1751774: goto L3f;
                case 1754443: goto L69;
                case 1755337: goto L82;
                default: goto L1d;
            }
        L1d:
            goto L1a
        L1e:
            java.lang.String r0 = "d3493kWcNQdgT56jpISFJT"
            java.lang.String r0 = kotlinx.coroutines.C1056.m3127(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = com.google.android.material.theme.C1050.m3102()
            if (r0 < 0) goto L35
            java.lang.String r0 = "ۨ۟۠"
            int r0 = com.github.megatronking.stringfog.C1034.m3038(r0)
            goto L1a
        L35:
            int r0 = androidx.appcompat.widget.C1002.f5646
            int r2 = com.github.megatronking.stringfog.C1033.f5677
            int r0 = r0 * r2
            r2 = 1756664(0x1acdf8, float:2.46161E-39)
            int r0 = r0 + r2
            goto L1a
        L3f:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = com.google.android.material.theme.C1049.f5693
            int r2 = com.google.android.material.appbar.C1035.f5679
            int r2 = r2 + 7801
            int r0 = r0 / r2
            if (r0 == 0) goto L58
            r0 = 70
            android.support.v4.graphics.drawable.C0990.f5634 = r0
            java.lang.String r0 = "ۣۣ۟"
            int r0 = androidx.appcompat.app.C0998.m2896(r0)
            goto L1a
        L58:
            java.lang.String r0 = "ۤۦ۠"
        L5a:
            int r0 = androidx.recyclerview.widget.C1019.m2978(r0)
            goto L1a
        L5f:
            int r0 = android.app.C0989.f5633
            int r2 = androidx.constraintlayout.widget.C1004.f5648
            int r0 = r0 + r2
            r2 = 1754293(0x1ac4b5, float:2.458288E-39)
            int r0 = r0 + r2
            goto L1a
        L69:
            int r0 = androidx.constraintlayout.widget.C1004.f5648
            int r2 = androidx.lifecycle.C1015.f5659
            r2 = r2 ^ 9410(0x24c2, float:1.3186E-41)
            int r0 = r0 + r2
            if (r0 < 0) goto L78
            com.google.android.material.theme.C1048.m3093()
            java.lang.String r0 = "ۢۥ۠"
            goto L5a
        L78:
            int r0 = androidx.lifecycle.C1015.f5659
            int r2 = androidx.core.content.C1010.f5654
            int r0 = r0 * r2
            r2 = 1752436(0x1abd74, float:2.455686E-39)
            int r0 = r0 + r2
            goto L1a
        L82:
            int r0 = androidx.appcompat.app.C0998.m2897()
            if (r0 > 0) goto L69
            int r0 = androidx.activity.C0996.f5640
            int r2 = androidx.activity.C0996.f5640
            int r0 = r0 - r2
            r2 = 56327(0xdc07, float:7.8931E-41)
            int r0 = r0 + r2
            goto L1a
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0043at.<init>(java.lang.String, android.widget.TextView, android.widget.LinearLayout, android.app.Activity, on, android.webkit.WebView, android.widget.ScrollView, android.widget.EditText, ld):void");
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    public final InterfaceC0444ld mo471a(InterfaceC0444ld interfaceC0444ld) {
        String str;
        int iM3042 = C1035.m3042("ۧۡ۠");
        ScrollView scrollView = null;
        EditText editText = null;
        while (true) {
            switch (iM3042) {
                case 1747935:
                    return new C0043at(this.f673f, this.f674g, this.f675h, this.f676i, this.f677j, this.f678k, scrollView, editText, interfaceC0444ld);
                case 1750563:
                    editText = this.f680m;
                    if (C1006.f5650 % (C1007.f5651 | (-4397)) >= 0) {
                        C1043.m3075();
                    }
                    iM3042 = C1006.m2926("۠ۨۧ");
                    continue;
                case 1750781:
                    if (C1033.f5677 < 0) {
                        iM3042 = (C1011.f5655 - C1055.f5699) ^ (-1754698);
                    } else {
                        C0989.m2860();
                        str = "ۨ۟";
                    }
                    break;
                case 1754438:
                    scrollView = this.f679l;
                    if (C1018.f5662 - (C0999.f5643 * (-8404)) < 0) {
                        str = "ۣ۠۠";
                    } else {
                        C1033.f5677 = 88;
                        iM3042 = C1001.m2906("ۧۡ۠");
                    }
                    break;
            }
            iM3042 = C1059.m3137(str);
        }
    }

    @Override // p000.InterfaceC0861wm
    /* JADX INFO: renamed from: e */
    public final Object mo472e(Object obj, Object obj2) {
        String str;
        int iM2896 = C0998.m2896("ۣ۠ۥ");
        while (true) {
            switch (iM2896) {
                case 1747778:
                    if (C1044.f5688 * C1016.f5660 * (-2293) < 0) {
                        iM2896 = (C0995.f5639 % C1042.f5686) + 1755514;
                    } else {
                        C1040.f5684 = 72;
                        iM2896 = C1032.m3031("ۧۡۨ");
                    }
                    break;
                case 1754446:
                    if (C0996.m2886() >= 0) {
                        C1053.f5697 = 12;
                        str = "ۡۨۨ";
                    } else {
                        str = "ۣ۠ۥ";
                    }
                    iM2896 = C1052.m3109(str);
                    break;
                case 1755469:
                    return ((C0043at) mo471a((InterfaceC0444ld) obj2)).mo473g(C0819vh.f4855n);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x031c A[SYNTHETIC] */
    @Override // p000.m50
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo473g(java.lang.Object r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0043at.mo473g(java.lang.Object):java.lang.Object");
    }
}
