package defpackage;

import android.app.C0002;
import android.app.C0003;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0015;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0019;
import androidx.emoji2.text.C0026;
import androidx.fragment.app.C0027;
import androidx.legacy.content.C0028;
import androidx.profileinstaller.C0031;
import androidx.savedstate.C0034;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0041;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.C0048;
import com.google.android.material.chip.C0056;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0062;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class v7 extends LinkedHashMap {
    public final int a;

    public v7(int r4) {
        super(C0016.f16 ^ 505, 0.75f, true);
        int r2 = C0002.m8("ۣۨۢ");
        Long r1 = null;
    L3:
        switch(r2) {
            case 56295: goto L6;
            case 1747774: goto L9;
            case 1749820: goto L29;
            case 1751685: goto L24;
            case 1753635: goto L14;
            case 1754407: goto L13;
            case 1755433: goto L17;
            default: goto L3;
        };
    L6:
        if ((C0056.f56 - (C0062.f62 ^ (-6460))) >= 0) goto L7;
        r2 = (C0073.f73 ^ C0059.f59) + 1756143;
        goto L3
    L7:
        C0003.f3 = 9;
        String r0 = "ۢۢۦ";
    L8:
        r2 = C0056.m226(r0);
        goto L3
    L9:
        Long r02 = Long.valueOf(C0019.m76("vyx705n4DPuRY"));
        if (C0027.m111() <= 0) goto L11;
        r2 = 1754181 + (C0061.f61 | C0037.f37);
        r1 = r02;
        goto L3
    L11:
        r2 = C0072.m288("ۧ۠۠");
        r1 = r02;
    L13:
        r2 = (C0002.f2 + C0067.f67) + 1749208;
        goto L3
    L14:
        System.out.println(r1);
        if ((C0015.f15 * (C0064.f64 * 9136)) >= 0) goto L16;
    L16:
        r2 = C0034.m138("ۢۧۡ");
        goto L3
    L17:
        this.a = r4;
        if ((C0041.f41 / (C0038.f38 + 4043)) == 0) goto L21;
        String r03 = "۟ۦ";
    L20:
        r2 = C0002.m8(r03);
        goto L3
    L21:
        r03 = "ۤۥۦ";
        goto L20
    L24:
        if (C0026.m106() > 0) goto L13;
        if ((C0015.f15 % (C0017.f17 - 1657)) < 0) goto L28;
        C0073.f73 = 97;
        r2 = C0059.m239("ۤۥۦ");
        goto L3
    L28:
        r0 = "ۣ۠ۡ";
        goto L8
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry r3) {
        int r0 = C0028.m114("۠ۧۡ");
    L3:
        switch(r0) {
            case 1746718: goto L5;
            case 1747898: goto L12;
            case 1748796: goto L8;
            case 1749758: goto L16;
            case 1751746: goto L14;
            default: goto L3;
        };
    L5:
        return false;
    L8:
        if ((C0043.f43 - (C0067.f67 ^ 8708)) <= 0) goto L9;
        r0 = (C0048.f48 / C0062.f62) ^ 1746718;
        goto L3
    L9:
        r0 = C0070.m281("ۦۧ۟");
        goto L3
    L12:
        if (super.size() <= this.a) goto L8;
        r0 = (C0066.f66 + C0058.f58) ^ 1752101;
        goto L3
    L14:
        return true;
    L16:
        if ((C0047.f47 + (C0058.f58 % 7665)) <= 0) goto L17;
        r0 = (C0061.f61 | C0031.f31) + 1747931;
        goto L3
    L17:
        r0 = C0013.m53("ۣ۟۠");
        goto L3
    }
}
