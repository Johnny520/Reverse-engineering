package p000;

import android.app.C0986;
import android.app.C0987;
import android.view.ViewOutlineProvider;
import androidx.core.widget.C1011;
import androidx.recyclerview.widget.C1019;
import androidx.savedstate.C1022;
import androidx.versionedparcelable.C1027;
import androidx.versionedparcelable.C1028;
import androidx.viewpager2.adapter.C1029;
import com.github.megatronking.stringfog.C1033;
import com.github.megatronking.stringfog.C1034;
import com.google.android.material.behavior.C1036;
import com.google.android.material.carousel.C1041;
import com.google.android.material.chip.C1043;
import com.google.android.material.theme.C1049;
import io.fastkv.C1054;

/* JADX INFO: renamed from: rs */
/* JADX INFO: loaded from: classes.dex */
public final class C0682rs extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final float f4342a;

    public C0682rs(float f) {
        String str;
        this.f4342a = f;
        double d = 0.0d;
        int iM3065 = C1041.m3065("ۧۡۢ");
        while (true) {
            switch (iM3065) {
                case 1751718:
                    return;
                case 1754440:
                    if (C1034.m3039() <= 0) {
                        iM3065 = (C0987.f5631 + C1028.f5672) ^ (-1754804);
                    }
                    break;
                case 1754442:
                    iM3065 = (C0986.f5630 | C1036.f5680) + 1753865;
                    continue;
                case 1754444:
                    d = Double.parseDouble(C1033.m3033("dVsuwM"));
                    if (C1019.f5663 / (C1057.f5701 ^ (-4020)) != 0) {
                        C1043.f5687 = 26;
                        iM3065 = C1049.m3099("ۧۡۢ");
                    } else {
                        iM3065 = (C0987.f5631 / C1027.f5671) + 1755430;
                        continue;
                    }
                    break;
                case 1755400:
                    break;
                case 1755430:
                    System.out.println(d);
                    iM3065 = C1011.m2948("ۤۦۨ");
                    continue;
            }
            if (C1022.f5666 <= 0) {
                C1054.f5698 = 95;
                str = "ۣۨۡ";
            } else {
                str = "ۤۦۨ";
            }
            iM3065 = C1029.m3019(str);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x016c A[SYNTHETIC] */
    @Override // android.view.ViewOutlineProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getOutline(android.view.View r12, android.graphics.Outline r13) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0682rs.getOutline(android.view.View, android.graphics.Outline):void");
    }
}
