package p000;

import android.app.C0986;
import android.support.v4.graphics.drawable.C0987;
import androidx.appcompat.app.C0997;
import androidx.appcompat.widget.C1000;
import androidx.coordinatorlayout.widget.C1002;
import com.github.megatronking.stringfog.annotation.C1017;
import com.google.android.material.carousel.C1027;
import com.google.android.material.carousel.C1030;
import com.google.android.material.datepicker.C1035;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.theme.C1042;
import com.google.android.material.timepicker.C1044;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.p001ui.C1050;
import kotlinx.coroutines.C1056;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: j8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0365j8 {

    /* JADX INFO: renamed from: a */
    public final String f2676a;

    /* JADX INFO: renamed from: b */
    public final String f2677b;

    /* JADX INFO: renamed from: c */
    public final String f2678c;

    /* JADX INFO: renamed from: d */
    public final String f2679d;

    /* JADX INFO: renamed from: e */
    public final String f2680e;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002d. Please report as an issue. */
    public C0365j8(String str, String str2, String str3, String str4, String str5) {
        String str6;
        g40.m1156s(str2, g40.m1148k("rgPa3Q==\n", "wGK3uKAS2zQ=\n", str, "DBN5vQ==\n", "aHIA7o5Mri0=\n"), "0mR8DQ==\n", "tgUFSApnXJg=\n", str3);
        AbstractC0493mp.m1857g(g40.m1148k("X40pf12w\n", "MeROFynjGVg=\n", str4, "ou2WDI/f\n", "zITxZPuaqCg=\n"), str5);
        int iM3078 = C1042.m3078("۠ۡۦ");
        String strM2899 = null;
        while (true) {
            switch (iM3078) {
                case 56354:
                    strM2899 = C0997.m2899("J9yb8gc057na2iX1Qku");
                    if (C0997.m2900() >= 0) {
                    }
                    iM3078 = C1036.m3057("ۨۨۡ");
                    break;
                case 56413:
                    str6 = C1002.m2921() >= 0 ? "ۣۡ" : "ۢۦۤ";
                    iM3078 = C0987.m2861(str6);
                    break;
                case 56511:
                    this.f2680e = str5;
                    str6 = "ۣ۠";
                    iM3078 = C0987.m2861(str6);
                    break;
                case 1746786:
                    this.f2679d = str4;
                    iM3078 = (C1017.f5664 | C1027.f5674) ^ (-57024);
                    break;
                case 1747717:
                    this.f2676a = str;
                    if (C1036.m3054() >= 0) {
                        C1056.f5703 = 57;
                        iM3078 = C0986.m2856("ۦۥ");
                    } else {
                        iM3078 = (C1057.f5704 + C1047.f5694) ^ (-1747682);
                    }
                    break;
                case 1747719:
                    this.f2677b = str2;
                    iM3078 = C1030.m3032(C1044.f5691 / (C1047.f5694 + 4845) != 0 ? "ۢۦۤ" : "ۧۡۤ");
                    break;
                case 1749792:
                    break;
                case 1750811:
                    if (C1035.f5682 >= 0) {
                        C1000.f5647 = 44;
                        str6 = "ۥۨۡ";
                    } else {
                        str6 = "۠ۡۦ";
                    }
                    iM3078 = C0987.m2861(str6);
                    break;
                case 1754442:
                    this.f2678c = str3;
                    str6 = "۟ۢۥ";
                    iM3078 = C0987.m2861(str6);
                    break;
                case 1754531:
                    iM3078 = C0987.m2861(str6);
                    break;
                case 1755617:
                    System.out.println(strM2899);
                    iM3078 = (C1050.f5697 / C1054.f5701) + 1749793;
                    break;
            }
            return;
        }
    }
}
