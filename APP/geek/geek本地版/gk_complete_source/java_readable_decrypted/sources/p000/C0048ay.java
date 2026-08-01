package p000;

import android.app.C0987;
import android.view.ViewOutlineProvider;
import androidx.activity.result.C0994;
import androidx.appcompat.widget.C1000;
import androidx.appcompat.widget.C1001;
import androidx.appcompat.widget.C1002;
import androidx.constraintlayout.widget.C1006;
import androidx.core.content.C1010;
import androidx.core.widget.C1011;
import androidx.emoji2.text.C1012;
import androidx.recyclerview.widget.C1018;
import androidx.recyclerview.widget.C1019;
import androidx.savedstate.C1020;
import androidx.versionedparcelable.C1025;
import com.github.megatronking.stringfog.C1033;
import com.google.android.material.bottomsheet.C1037;
import com.google.android.material.carousel.C1041;
import com.google.android.material.chip.C1043;
import com.google.android.material.datepicker.C1045;
import com.google.android.material.theme.C1048;
import com.ljx.wechatmod.hook.C1052;
import com.ljx.wechatmod.p001ui.C1053;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: ay */
/* JADX INFO: loaded from: classes.dex */
public final class C0048ay extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final int f693a;

    public /* synthetic */ C0048ay(int i) {
        String str;
        this.f693a = i;
        int iM2851 = C0987.m2851("ۨۨۧ");
        Double d = null;
        while (true) {
            switch (iM2851) {
                case 1746972:
                    break;
                case 1747898:
                    Double dValueOf = Double.valueOf(C1052.m3112("VkvfPYfq73TsCb6Lsaou7j1ehsIw"));
                    if (C1000.m2904() <= 0) {
                        C1033.m3036();
                    }
                    iM2851 = C1037.m3052("ۦ۟ۦ");
                    d = dValueOf;
                    continue;
                case 1751528:
                    if (C1019.m2981() >= 0) {
                        iM2851 = C1048.m3094("ۢۥ۟");
                    } else {
                        iM2851 = (C1006.f5650 / C1045.f5689) ^ 1755623;
                        continue;
                    }
                    break;
                case 1753421:
                    System.out.println(d);
                    if (C1012.m2952() <= 0) {
                        C1002.m2912();
                        iM2851 = C1025.m3005("ۨۨۧ");
                    } else {
                        iM2851 = (C0994.f5638 ^ C1058.f5702) + 1753901;
                        continue;
                    }
                    break;
                case 1754409:
                    return;
                case 1755623:
                    if (C1001.m2907() <= 0) {
                        iM2851 = C1010.f5654 * (C1053.f5697 ^ 8352) >= 0 ? C1011.m2948("ۤ۠ۤ") : (C1041.f5685 - C1020.f5664) + 1747602;
                    }
                    break;
            }
            if ((C1043.f5687 ^ (C1056.f5700 % 6970)) >= 0) {
                C1059.f5703 = 56;
                str = "۠ۤۡ";
            } else {
                str = "ۧ۠ۢ";
            }
            iM2851 = C1018.m2976(str);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:122:0x0352. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0031. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x033e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0449 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x034a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x053c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x035b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x03db A[SYNTHETIC] */
    @Override // android.view.ViewOutlineProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getOutline(android.view.View r37, android.graphics.Outline r38) {
        /*
            Method dump skipped, instruction units count: 1778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0048ay.getOutline(android.view.View, android.graphics.Outline):void");
    }
}
