package defpackage;

import android.app.C0000;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
import androidx.activity.C0010;
import androidx.activity.result.C0009;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0016;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0024;
import androidx.core.widget.C0025;
import androidx.emoji2.text.C0026;
import androidx.fragment.app.C0027;
import androidx.lifecycle.C0029;
import androidx.profileinstaller.C0031;
import androidx.recyclerview.widget.C0033;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0040;
import androidx.versionedparcelable.C0042;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.xor.C0045;
import com.google.android.material.bottomsheet.C0051;
import com.google.android.material.carousel.C0054;
import com.google.android.material.carousel.C0055;
import com.google.android.material.chip.C0056;
import com.google.android.material.chip.C0057;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C0069;

/* JADX INFO: loaded from: classes.dex */
public final class x30 extends XC_MethodHook {
    public final ConcurrentHashMap a;
    public final fs b;

    public x30(ConcurrentHashMap r4, fs r5) {
        this.a = r4;
        this.b = r5;
        Long r0 = null;
        int r1 = C0024.m98("۟ۢۦ");
    L3:
        switch(r1) {
            case 56539: goto L5;
            case 1746787: goto L11;
            case 1747686: goto L9;
            case 1747904: goto L14;
            case 1752491: goto L19;
            case 1754662: goto L15;
            default: goto L3;
        };
    L5:
        r0 = Long.decode(C0004.m19("tf81CQpXV68qsmP59"));
        if ((C0031.f31 * (C0056.f56 ^ (-3009))) < 0) goto L13;
        String r12 = "ۥ۠ۦ";
    L8:
        r1 = C0016.m65(r12);
        goto L3
    L13:
        r12 = "ۧۨۧ";
    L9:
        r1 = (C0033.f33 | C0007.f7) + 1751989;
        goto L3
    L11:
        if (C0025.m103() < 0) goto L9;
        r1 = C0055.m220("ۧۢ");
        goto L3
    L14:
        r1 = C0071.m286("۟ۢۦ");
        goto L3
    L15:
        System.out.println(r0);
        if (C0069.f69 < 0) goto L18;
        r1 = C0066.m264("۠ۧۧ");
        goto L3
    L18:
        r12 = "ۥ۠ۦ";
        goto L8
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam r6) {
        Class<?> r3 = null;
        String r1 = null;
        int r4 = C0027.m110("ۥۡۥ");
    L3:
        switch(r4) {
            case 56449: goto L6;
            case 1748616: goto L34;
            case 1748798: goto L10;
            case 1748831: goto L40;
            case 1748860: goto L46;
            case 1752454: goto L17;
            case 1752521: goto L22;
            case 1753448: goto L42;
            case 1753479: goto L38;
            case 1754565: goto L45;
            case 1755498: goto L6;
            default: goto L3;
        };
    L46:
        XposedBridge.hookAllMethods(r3, pb0.o1, this.b);     // Catch: Throwable -> L24
        if ((C0010.f10 ^ (C0069.f69 - 6951)) > 0) goto L33;
        C0048.f48 = 96;
    L33:
        r4 = C0022.m90("ۧۥۣ");
    L26:
        if ((C0026.f26 * (C0040.f40 | (-1119))) >= 0) goto L27;
        r4 = (C0064.f64 | C0038.f38) ^ (-1755145);
        goto L3
    L27:
        C0045.m181();
        r4 = C0013.m53("ۡ۟ۦ");
    L6:
        if ((C0010.f10 + (C0026.f26 - 2532)) < 0) goto L23;
        C0051.f51 = 36;
        String r0 = "۟ۧۥ";
    L8:
        r4 = C0006.m26(r0);
        goto L3
    L23:
        r0 = "ۧۥۣ";
        goto L8
    L10:
        if (this.a.putIfAbsent(r1, Boolean.TRUE) != null) goto L6;
        if (C0037.f37 >= 0) goto L13;
        String r02 = "ۦۡۢ";
    L16:
        r4 = C0057.m229(r02);
        goto L3
    L13:
        String r2 = "ۡۦۤ";
        String r03 = r1;
    L14:
        r1 = r03;
        r4 = C0056.m226(r2);
        goto L3
    L17:
        Class<?> r22 = r6.thisObject.getClass();
        if ((C0067.f67 / (C0048.f48 % 8633)) == 0) goto L21;
        C0009.m36();
        String r04 = "ۦۡۢ";
    L20:
        r3 = r22;
        r4 = C0043.m173(r04);
        goto L3
    L21:
        r04 = "ۡ۟ۦ";
        goto L20
    L22:
        ip.o(u40.a("QM+8FDM=\n", "MK7OdV709a4=\n"), r6);
        r4 = (C0042.f42 / C0040.f40) + 1752455;
        goto L3
    L34:
        r03 = r3.getName();
        if ((C0051.f51 / (C0067.f67 - 6172)) == 0) goto L37;
        C0000.f0 = 63;
        r1 = r03;
        r4 = C0067.m271("ۦ۠ۢ");
        goto L3
    L37:
        r2 = "ۡۥۢ";
        goto L14
    L38:
        String r05 = pb0.a;     // Catch: Throwable -> L24
        r4 = (C0022.f22 - C0012.f12) + 1749772;
        goto L3
    L40:
        r02 = "ۦۡۢ";
        goto L16
    L42:
        if ((C0025.f25 * (C0042.f42 | 6734)) <= 0) goto L43;
        r4 = (C0060.f60 % C0029.f29) + 1752289;
        goto L3
    L43:
        C0054.f54 = 99;
        r02 = "ۤۤ۠";
        goto L16
    }
}
