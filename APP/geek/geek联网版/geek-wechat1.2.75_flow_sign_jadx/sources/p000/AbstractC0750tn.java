package p000;

import android.support.v4.graphics.drawable.C0987;
import android.window.C0989;
import androidx.appcompat.widget.C1000;
import androidx.coordinatorlayout.widget.C1003;
import androidx.core.graphics.drawable.C1010;
import androidx.core.widget.C1011;
import androidx.legacy.content.C1012;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.annotation.C1017;
import com.google.android.material.appbar.C1020;
import com.google.android.material.appbar.C1021;
import com.google.android.material.button.C1025;
import com.google.android.material.carousel.C1030;
import com.google.android.material.datepicker.C1032;
import com.google.android.material.datepicker.C1035;
import com.google.android.material.internal.C1038;
import com.google.android.material.textfield.C1041;
import com.google.android.material.theme.C1042;
import com.google.android.material.timepicker.C1044;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1050;
import io.fastkv.C1052;
import io.fastkv.C1053;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: tn */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0750tn {

    /* JADX INFO: renamed from: a */
    public static final String[] f4567a;

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f4568b;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    static {
        String str;
        String strM492a;
        int iM3052 = C1035.m3052("۟ۤۢ");
        String[] strArr = null;
        String str2 = null;
        String strM492a2 = null;
        while (true) {
            switch (iM3052) {
                case 56291:
                    strArr[C1044.f5691 ^ 93] = strM492a2;
                    if (C1038.f5685 + (C1012.f5659 % 3121) >= 0) {
                        C1012.m2958();
                        iM3052 = C1011.m2955("۟ۨۧ");
                    } else {
                        iM3052 = (C1042.f5689 % C0987.f5634) + 1751476;
                    }
                    break;
                case 1746845:
                    strM492a2 = b50.m492a("wYN2FEkW3Rk5L6n1\n", "jMojXRE2Opg=\n");
                    str = "ۣۨۥ";
                    iM3052 = C1049.m3104(str);
                    break;
                case 1746974:
                    f4567a = strArr;
                    if ((C0989.f5636 ^ (C1011.f5658 ^ (-3345))) > 0) {
                        str = "ۥۣ۟";
                        iM3052 = C1049.m3104(str);
                    } else {
                        iM3052 = C1020.m2993("۟ۤۢ");
                    }
                    break;
                case 1747838:
                    if (C1035.m3053() > 0) {
                        iM3052 = (C1021.f5668 | C1054.f5701) + 1746864;
                    } else {
                        C1032.m3040();
                        str = "ۤ۠ۧ";
                        iM3052 = C1049.m3104(str);
                    }
                    break;
                case 1748835:
                    break;
                case 1750567:
                    strArr = new String[2];
                    str = "۟ۢ";
                    iM3052 = C1049.m3104(str);
                    break;
                case 1751652:
                    strArr[C1025.f5672 ^ (-584)] = str2;
                    if (C1017.f5664 % (C1041.f5688 | 9033) < 0) {
                        iM3052 = (C1000.f5647 | C1017.f5664) + 1746975;
                    } else {
                        C1052.m3116();
                        strM492a = str2;
                        iM3052 = C1053.m3122("ۣ۠ۤ");
                        str2 = strM492a;
                    }
                    break;
                case 1752457:
                    f4568b = new ConcurrentHashMap();
                    if (C1025.m3010() >= 0) {
                        C1030.f5677 = 18;
                        iM3052 = C1038.m3063("۠ۥۣ");
                    } else {
                        iM3052 = (C1010.f5657 - C1050.f5697) ^ (-1747745);
                    }
                    break;
                case 1755466:
                    strM492a = b50.m492a("EjX0eZ528Q==\n", "X1SAHOwfkMQ=\n");
                    if (C1015.f5662 / (C1000.f5647 | 8849) == 0) {
                        iM3052 = C1053.m3122("ۣ۠ۤ");
                        str2 = strM492a;
                    } else {
                        C1050.m3108();
                        iM3052 = C1003.m2922("۟ۢ");
                        str2 = strM492a;
                    }
                    break;
            }
            return;
        }
    }
}
