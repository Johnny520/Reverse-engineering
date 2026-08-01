package p000;

import android.app.Activity;
import android.support.v4.graphics.drawable.C0987;
import android.view.ViewGroup;
import android.window.C0991;
import androidx.activity.C0995;
import androidx.activity.C0996;
import androidx.activity.result.C0994;
import androidx.appcompat.view.menu.C0998;
import androidx.core.app.C1005;
import androidx.core.content.C1008;
import androidx.core.graphics.drawable.C1010;
import androidx.legacy.content.C1013;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.carousel.C1028;
import com.google.android.material.carousel.C1029;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.theme.C1042;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.timepicker.C1044;
import com.google.android.material.transformation.C1045;
import com.google.android.material.transformation.C1046;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: jn */
/* JADX INFO: loaded from: classes.dex */
public final class C0380jn extends t50 implements InterfaceC0935ym {

    /* JADX INFO: renamed from: e */
    public final int f2732e;

    /* JADX INFO: renamed from: f */
    public int f2733f;

    /* JADX INFO: renamed from: g */
    public final Activity f2734g;

    /* JADX INFO: renamed from: h */
    public final p00 f2735h;

    /* JADX INFO: renamed from: i */
    public final ViewGroup f2736i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0380jn(Activity activity, p00 p00Var, ViewGroup viewGroup, InterfaceC0814vd interfaceC0814vd, int i) {
        String str;
        super(interfaceC0814vd);
        this.f2732e = i;
        this.f2734g = activity;
        this.f2735h = p00Var;
        this.f2736i = viewGroup;
        int iM2891 = C0995.m2891("۟ۡۡ");
        long j = 0;
        while (true) {
            switch (iM2891) {
                case 56297:
                    long j2 = Long.parseLong(C1044.m3087("xm"));
                    if ((C1013.f5660 ^ (C0991.f5638 / (-970))) <= 0) {
                        C1042.m3080();
                        iM2891 = C1028.m3025("ۡۢ");
                        j = j2;
                    } else {
                        iM2891 = (C1029.f5676 * C1010.f5657) + 1365233;
                        j = j2;
                        continue;
                    }
                    break;
                case 56353:
                    if (C0996.f5643 % (C1043.f5690 + 8582) <= 0) {
                        iM2891 = C1046.m3095("ۣ۠ۨ");
                    } else {
                        iM2891 = (C1005.f5652 ^ C1018.f5665) ^ (-1746416);
                        continue;
                    }
                    break;
                case 1746751:
                    if (C1031.m3037() <= 0) {
                        iM2891 = (C1034.f5681 % C1056.f5703) + 56467;
                    }
                    break;
                case 1750633:
                    return;
                case 1753540:
                    break;
                case 1753578:
                    System.out.println(j);
                    if (C1028.f5675 / (C0994.f5641 ^ 4907) != 0) {
                        C1045.f5692 = 4;
                        str = "ۦۣۡ";
                    } else {
                        str = "ۣۢۨ";
                    }
                    iM2891 = C0991.m2876(str);
                    continue;
            }
            if ((C0987.f5634 ^ (C1058.f5705 | (-4623))) >= 0) {
                C1008.f5655 = 79;
                iM2891 = C0998.m2905("ۨ۠ۨ");
            } else {
                iM2891 = (C1028.f5675 | C1023.f5670) + 1750938;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[SYNTHETIC] */
    @Override // p000.t50
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000.InterfaceC0814vd mo35a(p000.InterfaceC0814vd r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = "ۨ۟ۥ"
            int r1 = androidx.legacy.content.C1012.m2961(r1)
            r3 = r0
            r4 = r0
        L9:
            switch(r1) {
                case 1748734: goto Ld;
                case 1749726: goto L74;
                case 1750533: goto L1f;
                case 1751555: goto L33;
                case 1751588: goto L5d;
                case 1751772: goto L67;
                case 1752484: goto L3f;
                case 1755342: goto L1a;
                default: goto Lc;
            }
        Lc:
            goto L9
        Ld:
            android.view.ViewGroup r0 = r6.f2736i
            int r1 = androidx.activity.result.C0992.f5639
            int r2 = androidx.activity.result.C0994.f5641
            r1 = r1 ^ r2
            r2 = 1752425(0x1abd69, float:2.45567E-39)
            int r1 = r1 + r2
            r4 = r0
            goto L9
        L1a:
            int r0 = r6.f2732e
            switch(r0) {
                case 0: goto L74;
                default: goto L1f;
            }
        L1f:
            int r0 = kotlinx.coroutines.internal.C1054.f5701
            int r1 = com.google.android.material.timepicker.C1043.f5690
            int r1 = r1 + (-9104)
            int r0 = r0 - r1
            if (r0 > 0) goto L55
            p000.C1059.m3144()
            java.lang.String r0 = "ۧ۟ۤ"
            int r0 = androidx.appcompat.widget.C1000.m2911(r0)
            r1 = r0
            goto L9
        L33:
            jn r0 = new jn
            android.app.Activity r1 = r6.f2734g
            p00 r2 = r6.f2735h
            r5 = 0
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
        L3e:
            return r0
        L3f:
            android.view.ViewGroup r3 = r6.f2736i
            int r0 = com.github.megatronking.stringfog.xor.C1018.f5665
            if (r0 > 0) goto L4d
            java.lang.String r0 = "ۣۡ۠"
            int r0 = com.google.android.material.datepicker.C1032.m3039(r0)
            r1 = r0
            goto L9
        L4d:
            java.lang.String r0 = "ۤۡ۠"
            int r0 = androidx.activity.C0995.m2891(r0)
            r1 = r0
            goto L9
        L55:
            java.lang.String r0 = "ۣۡ۠"
        L57:
            int r0 = com.github.megatronking.stringfog.xor.C1018.m2984(r0)
            r1 = r0
            goto L9
        L5d:
            int r0 = com.google.android.material.transformation.C1046.f5693
            if (r0 < 0) goto L64
            java.lang.String r0 = "ۣۨۡ"
            goto L57
        L64:
            java.lang.String r0 = "ۨ۟ۥ"
            goto L57
        L67:
            jn r0 = new jn
            android.app.Activity r1 = r6.f2734g
            p00 r2 = r6.f2735h
            r5 = 1
            r3 = r4
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L3e
        L74:
            int r0 = android.window.C0991.f5638
            if (r0 > 0) goto L80
            java.lang.String r0 = "ۣۥ۟"
            int r0 = com.google.android.material.transformation.C1046.m3095(r0)
            r1 = r0
            goto L9
        L80:
            java.lang.String r0 = "ۥ۠۟"
            int r0 = p000.C1057.m3139(r0)
            r1 = r0
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0380jn.mo35a(vd):vd");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x004e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    @Override // p000.InterfaceC0935ym
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo36e(java.lang.Object r5, java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0380jn.mo36e(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x0161. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x016d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x039c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x038f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x064b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x063d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x030d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0529 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05d8 A[SYNTHETIC] */
    @Override // p000.t50
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo37g(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0380jn.mo37g(java.lang.Object):java.lang.Object");
    }
}
