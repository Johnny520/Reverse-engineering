package p000;

import androidx.coordinatorlayout.widget.C1003;
import androidx.legacy.content.C1014;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.appbar.C1021;
import com.google.android.material.button.C1025;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.transformation.C1045;
import com.ljx.wechatmod.hook.C1049;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: qs */
/* JADX INFO: loaded from: classes.dex */
public final class C0644qs extends XC_MethodReplacement {
    public final Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int iM2969 = C1014.m2969("ۣ۠ۧ");
        while (true) {
            switch (iM2969) {
                case 1747900:
                    AbstractC0493mp.m1857g(b50.m492a("8Bcfguk=\n", "gHZt44SbvCc=\n"), methodHookParam);
                    if (C1019.f5666 % (C1021.f5668 - 2417) >= 0) {
                        C1003.m2923();
                    }
                    iM2969 = C1018.m2984("ۨ۠ۥ");
                    break;
                case 1748647:
                    if (C1045.m3091() > 0) {
                        iM2969 = (C1054.f5701 % C1049.f5696) ^ (-1747620);
                    } else {
                        C1034.f5681 = 38;
                        iM2969 = C1025.m3011("۠ۨۧ");
                    }
                    break;
                case 1755373:
                    return Boolean.TRUE;
            }
        }
    }
}
