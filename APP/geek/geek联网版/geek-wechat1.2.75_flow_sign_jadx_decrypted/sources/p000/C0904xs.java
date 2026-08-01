package p000;

import android.app.C0986;
import android.view.ViewOutlineProvider;
import android.window.C0989;
import android.window.C0991;
import androidx.activity.result.C0993;
import androidx.appcompat.view.menu.C0998;
import androidx.appcompat.view.menu.C0999;
import androidx.core.content.C1007;
import androidx.core.graphics.drawable.C1010;
import com.google.android.material.appbar.C1021;
import com.google.android.material.carousel.C1029;
import com.google.android.material.carousel.C1030;
import com.google.android.material.datepicker.C1032;
import com.google.android.material.datepicker.C1035;
import com.google.android.material.transformation.C1045;
import com.ljx.wechatmod.p001ui.C1051;
import io.fastkv.C1052;
import io.fastkv.C1053;

/* JADX INFO: renamed from: xs */
/* JADX INFO: loaded from: classes.dex */
public final class C0904xs extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final float f5305a;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    public C0904xs(float f) {
        String str;
        this.f5305a = f;
        long j = 0;
        int iM3113 = C1051.m3113("ۦۣۨ");
        while (true) {
            switch (iM3113) {
                case 1748769:
                    iM3113 = (C1052.f5699 * C1032.f5679) ^ (-1630299);
                    break;
                case 1748834:
                    break;
                case 1749665:
                    System.out.println(j);
                    iM3113 = C0986.f5633 % (C0989.f5636 * 1972) <= 0 ? C1053.m3122("ۦۣۨ") : (C1058.f5705 / C1007.f5654) ^ 1748834;
                    break;
                case 1750631:
                    if ((C0999.f5646 | (C1035.f5682 / 7612)) < 0) {
                        iM3113 = (C0993.f5640 | C1051.f5698) + 1753828;
                    } else {
                        C1010.m2950();
                        str = "ۣ۟ۡ";
                        iM3113 = C1029.m3027(str);
                    }
                    break;
                case 1751744:
                    j = Long.parseLong(C1021.m2997("p5UaNM"));
                    str = "ۢۢۡ";
                    iM3113 = C1029.m3027(str);
                    break;
                case 1753697:
                    if (C0998.m2903() > 0) {
                        iM3113 = (C1052.f5699 * C1032.f5679) ^ (-1630299);
                    } else if (C1030.f5677 + (C0989.f5636 % (-3141)) <= 0) {
                        C1045.f5692 = 33;
                        iM3113 = C0991.m2876("ۡۤۤ");
                    } else {
                        iM3113 = (C1032.f5679 + C1021.f5668) ^ 1751580;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008f A[SYNTHETIC] */
    @Override // android.view.ViewOutlineProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getOutline(android.view.View r12, android.graphics.Outline r13) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0904xs.getOutline(android.view.View, android.graphics.Outline):void");
    }
}
