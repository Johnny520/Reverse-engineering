package p000;

import android.window.C0988;
import android.window.C0991;
import androidx.activity.result.C0993;
import androidx.appcompat.widget.C1000;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1003;
import androidx.core.graphics.drawable.C1010;
import androidx.legacy.content.C1014;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.behavior.C1022;
import com.google.android.material.carousel.C1029;
import com.google.android.material.datepicker.C1036;
import com.ljx.wechatmod.p001ui.C1050;

/* JADX INFO: renamed from: w9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0848w9 {

    /* JADX INFO: renamed from: a */
    public final int f5073a;

    /* JADX INFO: renamed from: b */
    public final Object f5074b;

    public /* synthetic */ C0848w9(int i, Object obj) {
        String str;
        this.f5073a = i;
        this.f5074b = obj;
        int iM3057 = C1036.m3057("ۦۥۢ");
        float f = 0.0f;
        while (true) {
            switch (iM3057) {
                case 1746847:
                    if (C0993.f5640 >= 0) {
                        C1015.m2972();
                        str = "ۡۧۨ";
                    } else {
                        str = "ۦۥۢ";
                    }
                    iM3057 = C1022.m3001(str);
                    continue;
                case 1750659:
                    return;
                case 1751558:
                    System.out.println(f);
                    if (C1002.m2921() >= 0) {
                        iM3057 = C1010.m2952("۟ۤۤ");
                    } else {
                        iM3057 = C1010.m2952("ۣۣۣ");
                        continue;
                    }
                    break;
                case 1752679:
                    break;
                case 1753542:
                    float f2 = Float.parseFloat(C1029.m3026("OmDtdPzeJsVq3VdyhL"));
                    iM3057 = 1787982 + (C1018.f5665 * C1059.f5706);
                    f = f2;
                    continue;
                case 1753603:
                    if (C0991.m2874() <= 0) {
                        iM3057 = C1003.m2922("ۦۣۣ");
                    }
                    break;
            }
            if ((C1000.f5647 | C1050.f5697 | (-1357)) >= 0) {
                C1059.m3144();
                iM3057 = C1014.m2969("ۣۥ۠");
            } else {
                iM3057 = C0988.m2863("ۣۣۣ");
            }
        }
    }
}
