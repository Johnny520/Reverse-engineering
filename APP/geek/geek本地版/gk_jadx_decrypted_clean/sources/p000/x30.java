package p000;

import android.support.v4.graphics.drawable.C0990;
import android.view.C0993;
import androidx.appcompat.widget.C1002;
import androidx.core.content.C1010;
import androidx.core.widget.C1011;
import androidx.profileinstaller.C1017;
import androidx.recyclerview.widget.C1019;
import com.google.android.material.carousel.C1041;
import com.google.android.material.chip.C1042;
import com.ljx.wechatmod.hook.C1052;
import de.robv.android.xposed.XC_MethodHook;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C1055;

/* JADX INFO: loaded from: classes.dex */
public final class x30 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f5090a;

    /* JADX INFO: renamed from: b */
    public final C0235fs f5091b;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    public x30(ConcurrentHashMap concurrentHashMap, C0235fs c0235fs) {
        String str;
        this.f5090a = concurrentHashMap;
        this.f5091b = c0235fs;
        Long lDecode = null;
        int iM2944 = C1010.m2944("۟ۢۦ");
        while (true) {
            switch (iM2944) {
                case 56539:
                    lDecode = Long.decode(C0990.m2865("tf81CQpXV68qsmP59"));
                    str = C1017.f5661 * (C1042.f5686 ^ (-3009)) >= 0 ? "ۥ۠ۦ" : "ۧۨۧ";
                    iM2944 = C1002.m2911(str);
                    break;
                case 1746787:
                    iM2944 = C1011.m2949() < 0 ? (C1019.f5663 | C0993.f5637) + 1751989 : C1041.m3065("ۧۢ");
                    break;
                case 1747686:
                    break;
                case 1747904:
                    iM2944 = C1057.m3131("۟ۢۦ");
                    break;
                case 1752491:
                    break;
                case 1754662:
                    System.out.println(lDecode);
                    if (C1055.f5699 < 0) {
                        str = "ۥ۠ۦ";
                        iM2944 = C1002.m2911(str);
                    } else {
                        iM2944 = C1052.m3109("۠ۧۧ");
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r6) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x30.afterHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
    }
}
