package p000;

import android.app.C0986;
import android.content.Context;
import android.widget.FrameLayout;
import android.window.C0990;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0998;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.widget.C1011;
import com.github.megatronking.stringfog.annotation.C1016;
import com.google.android.material.button.C1025;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.snackbar.C1040;
import com.google.android.material.textfield.C1041;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.transformation.C1045;
import com.ljx.wechatmod.p001ui.C1050;
import io.fastkv.C1052;
import io.fastkv.C1053;

/* JADX INFO: renamed from: ha */
/* JADX INFO: loaded from: classes.dex */
public final class C0291ha extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final int f2155a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    public C0291ha(Context context, int i) {
        String str;
        super(context);
        this.f2155a = i;
        int iM763 = C1043.m763("ۥۧۢ");
        Float f = null;
        while (true) {
            switch (iM763) {
                case 1746848:
                    Float fValueOf = Float.valueOf(C0997.m2899("XcXKtMRxdA0o3kDSi"));
                    if ((C1058.f5705 ^ (C1025.f5672 | 1149)) <= 0) {
                        iM763 = C1059.m3145("ۡۨۧ");
                        f = fValueOf;
                    } else {
                        iM763 = 1751586 ^ (C1041.f5688 / C1011.f5658);
                        f = fValueOf;
                    }
                    break;
                case 1748896:
                    break;
                case 1749854:
                    iM763 = C1045.f5692 + C1052.f5699 + 1749646;
                    break;
                case 1751586:
                    System.out.println(f);
                    str = "ۡۨۧ";
                    iM763 = C1050.m3111(str);
                    break;
                case 1752704:
                    if (C1016.m2974() > 0) {
                        iM763 = C1045.f5692 + C1052.f5699 + 1749646;
                    } else if (C0994.f5641 % (C1040.f5687 | (-9664)) <= 0) {
                        C1031.f5678 = 77;
                        iM763 = C1045.m3088("ۤۢ۠");
                    } else {
                        iM763 = C1053.f5700 + C0986.f5633 + 1745985;
                    }
                    break;
                case 1755557:
                    if ((C0990.f5637 | (C1004.f5651 ^ (-7385))) < 0) {
                        iM763 = (C0986.f5633 ^ C1041.f5688) + 1752104;
                    } else {
                        C0998.f5645 = 57;
                        str = "ۣۡۨ";
                        iM763 = C1050.m3111(str);
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3 A[SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0291ha.onMeasure(int, int):void");
    }
}
