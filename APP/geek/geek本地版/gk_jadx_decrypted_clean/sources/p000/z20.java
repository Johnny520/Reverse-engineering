package p000;

import android.app.Activity;
import android.app.C0987;
import android.app.C0989;
import android.app.Dialog;
import androidx.activity.C0997;
import androidx.appcompat.app.C0998;
import androidx.appcompat.widget.C1000;
import androidx.appcompat.widget.C1001;
import androidx.core.widget.C1011;
import androidx.fragment.app.C1013;
import androidx.lifecycle.C1015;
import com.github.megatronking.stringfog.C1033;
import com.google.android.material.carousel.C1039;
import com.google.android.material.carousel.C1041;
import com.google.android.material.chip.C1042;
import com.google.android.material.chip.C1043;
import com.google.android.material.theme.C1048;
import io.fastkv.C1054;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z20 implements InterfaceC0303hm {

    /* JADX INFO: renamed from: a */
    public final int f5442a;

    /* JADX INFO: renamed from: b */
    public final Activity f5443b;

    /* JADX INFO: renamed from: c */
    public final Dialog f5444c;

    /* JADX INFO: renamed from: d */
    public final C0565on f5445d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    public /* synthetic */ z20(Activity activity, Dialog dialog, C0565on c0565on, int i) {
        String str;
        String str2;
        this.f5442a = i;
        this.f5443b = activity;
        this.f5444c = dialog;
        this.f5445d = c0565on;
        Float fValueOf = null;
        int iM2956 = C1013.m2956("ۣۡ۠");
        while (true) {
            switch (iM2956) {
                case 56319:
                    System.out.println(fValueOf);
                    if (C1000.f5644 + (C0997.f5641 % 6557) < 0) {
                        str = "ۨۧۥ";
                        iM2956 = C1001.m2906(str);
                    } else {
                        iM2956 = C1048.m3094("ۣۣ۠");
                    }
                    break;
                case 56545:
                    if (C1033.f5677 >= 0) {
                        C1054.m3118();
                        str2 = "ۤۡۤ";
                    } else {
                        str2 = "ۣۡ۠";
                    }
                    iM2956 = C1015.m2962(str2);
                    break;
                case 1747649:
                    iM2956 = (C0998.f5642 % C1039.f5683) + 1755589;
                    break;
                case 1748734:
                    if (C0989.m2860() < 0) {
                        iM2956 = (C0998.f5642 % C1039.f5683) + 1755589;
                    } else {
                        str2 = "ۣۣ۠";
                        iM2956 = C1015.m2962(str2);
                    }
                    break;
                case 1750566:
                    fValueOf = Float.valueOf(C1043.m3076("kh23SrcYBllfKZfawXsIyq"));
                    if ((C0987.f5631 | (C1042.f5686 - 4651)) < 0) {
                        iM2956 = (C1011.f5655 - C1041.f5685) + 56509;
                    } else {
                        str = "۠۟۠";
                        iM2956 = C1001.m2906(str);
                    }
                    break;
                case 1755590:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ z20(android.app.Activity r4, p000.C0565on r5, android.app.Dialog r6, int r7) {
        /*
            r3 = this;
            r3.f5442a = r7
            r3.f5443b = r4
            r3.f5445d = r5
            r3.f5444c = r6
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "ۣۢۥ"
            int r1 = p000.C1057.m3131(r1)
        L12:
            switch(r1) {
                case 1749636: goto L16;
                case 1749858: goto L17;
                case 1750630: goto L78;
                case 1751682: goto L62;
                case 1753448: goto L45;
                case 1754407: goto L23;
                default: goto L15;
            }
        L15:
            goto L12
        L16:
            return
        L17:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            java.lang.String r1 = "ۣۢۡ"
        L1e:
            int r1 = androidx.savedstate.C1021.m2986(r1)
            goto L12
        L23:
            java.lang.String r0 = "EOTIlpPHR3k8pKsbNR"
            java.lang.String r0 = androidx.versionedparcelable.C1025.m3004(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            int r1 = android.support.v4.graphics.drawable.C0991.f5635
            if (r1 > 0) goto L3b
            android.app.C0988.m2856()
        L34:
            java.lang.String r1 = "ۧ۠۠"
            int r1 = androidx.activity.result.C0994.m2881(r1)
            goto L12
        L3b:
            int r1 = androidx.constraintlayout.widget.C1004.f5648
            int r2 = com.google.android.material.internal.C1047.f5691
            int r1 = r1 / r2
            r2 = 1749858(0x1ab362, float:2.452073E-39)
            int r1 = r1 + r2
            goto L12
        L45:
            int r1 = androidx.profileinstaller.C1016.f5660
            int r2 = androidx.versionedparcelable.C1025.f5669
            int r2 = r2 * (-6777)
            int r1 = r1 / r2
            if (r1 == 0) goto L58
            androidx.coordinatorlayout.widget.C1008.m2934()
            java.lang.String r1 = "ۦۣ۠"
            int r1 = androidx.constraintlayout.helper.widget.C1003.m2916(r1)
            goto L12
        L58:
            int r1 = com.github.megatronking.stringfog.annotation.C1030.f5674
            int r2 = android.app.C0988.f5632
            int r1 = r1 * r2
            r2 = 1479410(0x1692f2, float:2.073095E-39)
            int r1 = r1 + r2
            goto L12
        L62:
            int r1 = androidx.fragment.app.C1013.m2957()
            if (r1 > 0) goto L6e
            androidx.viewpager2.adapter.C1029.m3018()
            java.lang.String r1 = "ۡۤۤ"
            goto L1e
        L6e:
            int r1 = androidx.activity.C0997.f5641
            int r2 = androidx.activity.C0996.f5640
            int r1 = r1 + r2
            r2 = 1750565(0x1ab625, float:2.453064E-39)
            int r1 = r1 + r2
            goto L12
        L78:
            int r1 = com.github.megatronking.stringfog.xor.C1032.m3030()
            if (r1 > 0) goto L62
            int r1 = androidx.versionedparcelable.C1026.f5670
            int r2 = androidx.constraintlayout.widget.C1006.f5650
            r2 = r2 ^ 6070(0x17b6, float:8.506E-42)
            int r1 = r1 / r2
            if (r1 == 0) goto L34
            java.lang.String r1 = "ۢۨۨ"
            int r1 = p000.C1057.m3131(r1)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z20.<init>(android.app.Activity, on, android.app.Dialog, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:289:0x15ed. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:444:0x017a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x069e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x068d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x06f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x06e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x15fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x17b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x17a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0e1f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0e1b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0e48 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0e5d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0e32 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0e70 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:570:0x13de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:571:0x13d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:581:0x15e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:582:0x15d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:583:0x15f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:584:0x18c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:585:0x18be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:587:0x166e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:588:0x1661 A[SYNTHETIC] */
    @Override // p000.InterfaceC0303hm
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo10a() {
        /*
            Method dump skipped, instruction units count: 6826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z20.mo10a():java.lang.Object");
    }
}
