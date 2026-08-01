package p000;

import android.app.C0988;
import android.app.C0989;
import androidx.appcompat.widget.C0999;
import androidx.appcompat.widget.C1001;
import androidx.appcompat.widget.C1002;
import androidx.constraintlayout.helper.widget.C1003;
import androidx.constraintlayout.widget.C1005;
import androidx.emoji2.text.C1012;
import androidx.fragment.app.C1013;
import androidx.legacy.content.C1014;
import androidx.profileinstaller.C1017;
import androidx.savedstate.C1020;
import androidx.startup.C1023;
import androidx.versionedparcelable.C1024;
import androidx.versionedparcelable.C1027;
import androidx.viewpager2.adapter.C1029;
import com.github.megatronking.stringfog.C1033;
import com.github.megatronking.stringfog.C1034;
import com.google.android.material.chip.C1042;
import com.google.android.material.datepicker.C1044;
import com.google.android.material.datepicker.C1045;
import com.google.android.material.internal.C1047;
import com.google.android.material.theme.C1048;
import com.google.android.material.theme.C1050;
import com.ljx.wechatmod.hook.C1052;
import com.ljx.wechatmod.p001ui.C1053;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: v7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0809v7 extends LinkedHashMap {

    /* JADX INFO: renamed from: a */
    public final int f4813a;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    public C0809v7(int i) {
        String str;
        super(C1002.f5646 ^ 505, 0.75f, true);
        int iM2854 = C0988.m2854("ۣۨۢ");
        Long l = null;
        while (true) {
            switch (iM2854) {
                case 56295:
                    if (C1042.f5686 - (C1048.f5692 ^ (-6460)) < 0) {
                        iM2854 = (C1059.f5703 ^ C1045.f5689) + 1756143;
                    } else {
                        C0989.f5633 = 9;
                        str = "ۢۢۦ";
                        iM2854 = C1042.m3071(str);
                    }
                    break;
                case 1747774:
                    Long lValueOf = Long.valueOf(C1005.m2922("vyx705n4DPuRY"));
                    if (C1013.m2957() <= 0) {
                        iM2854 = C1058.m3133("ۧ۠۠");
                        l = lValueOf;
                    } else {
                        iM2854 = 1754181 + (C1047.f5691 | C1023.f5667);
                        l = lValueOf;
                    }
                    break;
                case 1749820:
                    break;
                case 1751685:
                    if (C1012.m2952() > 0) {
                        iM2854 = C0988.f5632 + C1053.f5697 + 1749208;
                    } else if (C1001.f5645 % (C1003.f5647 - 1657) < 0) {
                        str = "ۣ۠ۡ";
                        iM2854 = C1042.m3071(str);
                    } else {
                        C1059.f5703 = 97;
                        iM2854 = C1045.m3084("ۤۥۦ");
                    }
                    break;
                case 1753635:
                    System.out.println(l);
                    if (C1001.f5645 * C1050.f5694 * 9136 >= 0) {
                    }
                    iM2854 = C1020.m2984("ۢۧۡ");
                    break;
                case 1754407:
                    iM2854 = C0988.f5632 + C1053.f5697 + 1749208;
                    break;
                case 1755433:
                    this.f4813a = i;
                    iM2854 = C0988.m2854(C1027.f5671 / (C1024.f5668 + 4043) != 0 ? "۟ۦ" : "ۤۥۦ");
                    break;
            }
            return;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        int iM2960 = C1014.m2960("۠ۧۡ");
        while (true) {
            switch (iM2960) {
                case 1746718:
                    return false;
                case 1747898:
                    if (super.size() > this.f4813a) {
                        iM2960 = (C1052.f5696 + C1044.f5688) ^ 1752101;
                    }
                    break;
                case 1748796:
                    break;
                case 1749758:
                    if (C1033.f5677 + (C1044.f5688 % 7665) <= 0) {
                        iM2960 = C0999.m2899("ۣ۟۠");
                    } else {
                        iM2960 = (C1047.f5691 | C1017.f5661) + 1747931;
                        continue;
                    }
                    break;
                case 1751746:
                    return true;
            }
            iM2960 = C1029.f5673 - (C1053.f5697 ^ 8708) <= 0 ? C1056.m3126("ۦۧ۟") : (C1034.f5678 / C1048.f5692) ^ 1746718;
        }
    }
}
