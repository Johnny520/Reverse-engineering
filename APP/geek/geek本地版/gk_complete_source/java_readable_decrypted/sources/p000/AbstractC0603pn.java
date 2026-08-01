package p000;

import android.app.C0988;
import android.support.v4.graphics.drawable.C0992;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0998;
import androidx.appcompat.widget.C1000;
import androidx.appcompat.widget.C1002;
import androidx.core.widget.C1011;
import androidx.profileinstaller.C1016;
import androidx.profileinstaller.C1017;
import androidx.recyclerview.widget.C1018;
import androidx.savedstate.C1021;
import androidx.savedstate.C1022;
import androidx.versionedparcelable.C1028;
import com.github.megatronking.stringfog.xor.C1032;
import com.google.android.material.behavior.C1036;
import com.google.android.material.carousel.C1040;
import com.google.android.material.chip.C1043;
import com.google.android.material.datepicker.C1044;
import com.google.android.material.theme.C1048;
import com.google.android.material.theme.C1049;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: pn */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0603pn {

    /* JADX INFO: renamed from: a */
    public static final String[] f3917a;

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f3918b;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    static {
        String str;
        String str2;
        int iM3016 = C1028.m3016("۟۠۠");
        String str3 = null;
        String str4 = null;
        String[] strArr = null;
        while (true) {
            switch (iM3016) {
                case 1746719:
                    String strM2419a = "MIUIX \u7075\u52a8";
                    iM3016 = 1754077 + (C1016.f5660 - C1056.f5700);
                    str3 = strM2419a;
                    break;
                case 1749818:
                    f3917a = strArr;
                    if (C0994.m2879() <= 0) {
                        C1021.m2989();
                        str2 = "ۥ۠ۤ";
                    } else {
                        str2 = "ۣۧۡ";
                    }
                    iM3016 = C1011.m2948(str2);
                    break;
                case 1752489:
                    strArr[C1044.f5688 ^ 855] = str3;
                    if (C1040.f5684 + (C1017.f5661 * (-7605)) > 0) {
                        iM3016 = C1002.m2911("ۣۧ۠");
                    } else {
                        C1022.f5666 = 88;
                        iM3016 = C0988.m2854("ۢۧ۟");
                    }
                    break;
                case 1753483:
                    strArr = new String[2];
                    str = "ۥ۠ۤ";
                    iM3016 = C1000.m2903(str);
                    break;
                case 1753694:
                    String strM2419a2 = "Materia";
                    iM3016 = 1753101 + (C1032.f5676 | C1059.f5703);
                    str4 = strM2419a2;
                    break;
                case 1754410:
                    strArr[C1049.f5693 ^ 73] = str4;
                    if ((C1018.f5662 | (C1043.f5687 - 1178)) < 0) {
                        iM3016 = C0988.m2854("ۢۧ۟");
                    } else {
                        C0992.f5636 = 67;
                        iM3016 = C1048.m3094("ۣۧۡ");
                    }
                    break;
                case 1754501:
                    f3918b = new ConcurrentHashMap();
                    iM3016 = (C1036.f5680 * C1002.f5646) ^ 1736874;
                    break;
                case 1754631:
                    break;
                case 1755494:
                    if (C0998.m2897() > 0) {
                        iM3016 = (C1059.f5703 * C1059.f5703) + 1746523;
                    } else {
                        str = "ۣۨۥ";
                        iM3016 = C1000.m2903(str);
                    }
                    break;
            }
            return;
        }
    }
}
