package p000;

import androidx.lifecycle.C1015;
import com.github.megatronking.stringfog.annotation.C1030;
import com.google.android.material.appbar.C1035;
import com.google.android.material.chip.C1043;
import com.google.android.material.floatingactionbutton.C1046;
import com.google.android.material.theme.C1049;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;

/* JADX INFO: renamed from: ms */
/* JADX INFO: loaded from: classes.dex */
public final class C0496ms extends XC_MethodReplacement {
    public final Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        String str;
        int iM2962 = C1015.m2962("ۣۣۤ");
        while (true) {
            switch (iM2962) {
                case 1746690:
                    return Boolean.TRUE;
                case 1746783:
                    if (C1043.m3075() >= 0) {
                        C1046.m3085();
                        str = "ۣۢۥ";
                    } else {
                        str = "ۣۣۤ";
                    }
                    iM2962 = C1049.m3099(str);
                    break;
                case 1750660:
                    AbstractC0346ip.m1503o(u40.m2419a("bo6pen4=\n", "Hu/bGxNLmIw=\n"), methodHookParam);
                    iM2962 = (C1030.f5674 | C1035.f5679) + 1746315;
                    break;
            }
        }
    }
}
