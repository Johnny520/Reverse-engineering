package p000;

import android.app.C0986;
import android.window.C0988;
import android.window.C0989;
import androidx.activity.C0996;
import androidx.appcompat.app.C0997;
import androidx.appcompat.widget.C1000;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1003;
import androidx.core.app.C1005;
import androidx.core.content.C1006;
import androidx.core.content.C1007;
import androidx.legacy.content.C1012;
import com.google.android.material.appbar.C1020;
import com.google.android.material.behavior.C1022;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.internal.C1038;
import com.google.android.material.theme.C1042;
import com.google.android.material.timepicker.C1044;
import com.ljx.wechatmod.hook.C1048;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1050;
import io.fastkv.C1053;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C1055;

/* JADX INFO: renamed from: t9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0736t9 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f4421a;

    /* JADX INFO: renamed from: b */
    public static final Map f4422b;

    /* JADX INFO: renamed from: c */
    public static Object f4423c;

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f4424d;

    /* JADX INFO: renamed from: e */
    public static final Map f4425e;

    /* JADX INFO: renamed from: f */
    public static final Map f4426f;

    /* JADX INFO: renamed from: g */
    public static int f4427g;

    /* JADX INFO: renamed from: h */
    public static final C0699s9 f4428h;

    /* JADX INFO: renamed from: i */
    public static final Date f4429i;

    /* JADX INFO: renamed from: j */
    public static final p00 f4430j;

    /* JADX INFO: renamed from: k */
    public static final p00 f4431k;

    /* JADX INFO: renamed from: l */
    public static final p00 f4432l;

    static {
        String str;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int iM2931 = C1005.m2931("ۨۦۣ");
        while (true) {
            switch (iM2931) {
                case 1746689:
                    Collections.synchronizedMap(new C0215f8(i2));
                    iM2931 = (C1001.f5648 ^ C1038.f5685) + 1748475;
                    continue;
                case 1746696:
                    f4425e = Collections.synchronizedMap(new C0215f8(i3));
                    str = "ۨۥۤ";
                    break;
                case 1746877:
                    if (C0996.m2896() > 0) {
                        iM2931 = (C1034.f5681 / C1038.f5685) ^ 1755559;
                    } else {
                        C1059.m3144();
                        str = "ۣۤۥ";
                    }
                    break;
                case 1747681:
                    f4428h = new C0699s9(i);
                    str = "ۥۧۡ";
                    break;
                case 1747684:
                    return;
                case 1747711:
                    f4422b = Collections.synchronizedMap(new C0215f8(i2));
                    if (C1049.f5696 * C1042.f5689 * 116 >= 0) {
                        iM2931 = C1001.m2914("ۧۦ۠");
                    } else {
                        iM2931 = (C0996.f5643 ^ C1000.f5647) ^ 1749482;
                        continue;
                    }
                    break;
                case 1747929:
                    int i4 = C0989.f5636 ^ 1096;
                    iM2931 = C1034.m3046("۠ۡ۠");
                    i2 = i4;
                    continue;
                case 1749607:
                    f4424d = new ConcurrentHashMap();
                    iM2931 = (C1007.f5654 ^ C0997.f5644) ^ (-1756077);
                    continue;
                case 1749761:
                    f4430j = new p00("@[^\\s\u2005]+[\u2005\\s]?");
                    if (C1034.f5681 - (C1012.f5659 * 8705) >= 0) {
                        C1055.m3130();
                        iM2931 = C1034.m3046("۟ۥۣ");
                    } else {
                        iM2931 = (C1044.f5691 % C1022.f5669) + 1751559;
                        continue;
                    }
                    break;
                case 1751652:
                    f4431k = new p00("md5=\"([a-fA-F0-9]{32})\"");
                    iM2931 = (C1036.f5683 * C0986.f5633) + 1740193;
                    continue;
                case 1752703:
                    f4429i = new Date();
                    str = "ۢۥۤ";
                    break;
                case 1754593:
                    f4432l = new p00("[a-fA-F0-9]{32}");
                    iM2931 = (C1012.f5659 | C1020.f5667) + 1747847;
                    continue;
                case 1755339:
                    int i5 = C1000.f5647 ^ 121;
                    if ((C1050.f5697 ^ (C1058.f5705 / 7494)) <= 0) {
                        C1002.m2921();
                        iM2931 = C1053.m3122("۟۟ۡ");
                        i3 = i5;
                    } else {
                        iM2931 = 1746692 ^ (C0988.f5635 / C1006.f5653);
                        i3 = i5;
                        continue;
                    }
                    break;
                case 1755527:
                    f4426f = Collections.synchronizedMap(new C0215f8(i3));
                    iM2931 = C1048.m3101(C1036.f5683 / (C1003.f5650 % (-4583)) != 0 ? "ۨ۟ۢ" : "۟۟ۡ");
                    continue;
                case 1755557:
                    f4421a = new ConcurrentHashMap();
                    iM2931 = (C1003.f5650 / C1058.f5705) + 1747925;
                    continue;
            }
            iM2931 = C1033.m3042(str);
        }
    }
}
