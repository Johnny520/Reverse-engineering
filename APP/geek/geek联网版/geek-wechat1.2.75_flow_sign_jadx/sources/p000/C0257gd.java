package p000;

import android.app.Activity;
import android.support.v4.graphics.drawable.C0987;
import android.widget.BaseAdapter;
import androidx.activity.C0995;
import androidx.activity.result.C0992;
import androidx.activity.result.C0993;
import androidx.appcompat.app.C0997;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.C1019;
import com.google.android.material.textfield.C1041;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.transformation.C1045;
import com.ljx.wechatmod.p001ui.C1051;
import java.util.ArrayList;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: gd */
/* JADX INFO: loaded from: classes.dex */
public final class C0257gd extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1953a;

    /* JADX INFO: renamed from: b */
    public final Activity f1954b;

    /* JADX INFO: renamed from: c */
    public final C0713sn f1955c;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0257gd(java.util.ArrayList r4, android.app.Activity r5, p000.C0713sn r6) {
        /*
            r3 = this;
            r3.f1953a = r4
            r3.f1954b = r5
            r3.f1955c = r6
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "۠ۧ"
            int r1 = androidx.legacy.content.C1013.m2965(r1)
        L10:
            switch(r1) {
                case 56288: goto L14;
                case 56327: goto L75;
                case 1749759: goto L89;
                case 1750624: goto L3c;
                case 1752524: goto L59;
                case 1754632: goto L26;
                default: goto L13;
            }
        L13:
            goto L10
        L14:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = androidx.activity.result.C0993.m2882()
            if (r1 > 0) goto L82
            java.lang.String r1 = "ۧۧۨ"
            int r1 = androidx.core.content.C1007.m2938(r1)
            goto L10
        L26:
            int r1 = com.google.android.material.datepicker.C1035.f5682
            int r2 = com.google.android.material.snackbar.C1040.f5687
            int r2 = r2 / 251
            int r1 = r1 + r2
            if (r1 < 0) goto L39
            androidx.activity.C0996.m2896()
            java.lang.String r1 = "ۣۤۥ"
        L34:
            int r1 = com.ljx.wechatmod.hook.C1048.m3101(r1)
            goto L10
        L39:
            java.lang.String r1 = "۠ۧ"
            goto L34
        L3c:
            int r1 = android.support.v4.graphics.drawable.C0987.f5634
            int r2 = com.google.android.material.snackbar.C1040.f5687
            r2 = r2 ^ 3629(0xe2d, float:5.085E-42)
            int r1 = r1 * r2
            if (r1 < 0) goto L4f
            android.app.C0986.m2857()
            java.lang.String r1 = "ۥۢۨ"
            int r1 = com.google.android.material.carousel.C1026.m3015(r1)
            goto L10
        L4f:
            int r1 = com.github.megatronking.stringfog.C1019.f5666
            int r2 = io.fastkv.C1052.f5699
            r1 = r1 | r2
            r2 = -1749980(0xffffffffffe54c24, float:NaN)
            r1 = r1 ^ r2
            goto L10
        L59:
            java.lang.String r0 = "g5yqb3LHKQzjrn2Dr2cR"
            java.lang.String r0 = com.google.android.material.snackbar.C1040.m3073(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            int r1 = androidx.coordinatorlayout.widget.C1002.f5649
            if (r1 < 0) goto L72
            r1 = 54
            com.google.android.material.behavior.C1022.f5669 = r1
            java.lang.String r1 = "ۢۥۢ"
            int r1 = com.google.android.material.datepicker.C1031.m3036(r1)
            goto L10
        L72:
            java.lang.String r1 = "۟۟"
            goto L34
        L75:
            int r1 = p000.C1057.m3136()
            if (r1 < 0) goto L3c
            java.lang.String r1 = "ۥۡۨ"
            int r1 = androidx.activity.C0995.m2891(r1)
            goto L10
        L82:
            java.lang.String r1 = "ۢۥۢ"
            int r1 = androidx.constraintlayout.helper.widget.C1001.m2914(r1)
            goto L10
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0257gd.<init>(java.util.ArrayList, android.app.Activity, sn):void");
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1953a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Object obj = null;
        int iM2885 = C0993.m2885("ۡۥۡ");
        while (true) {
            switch (iM2885) {
                case 1746967:
                    AbstractC0493mp.m1856f(b50.m492a("0rXMoNLFMPw=\n", "tdC4iPzrHtU=\n"), obj);
                    if (C1045.m3091() <= 0) {
                        C0995.m2892();
                        iM2885 = C1019.m2989("ۡۥۡ");
                    }
                    break;
                case 1747648:
                    return obj;
                case 1748797:
                    obj = this.f1953a.get(i);
                    if (C0987.m2860() < 0) {
                        iM2885 = (C1051.f5698 * C1041.f5688) ^ 1976519;
                    } else {
                        C1054.f5701 = 40;
                    }
                    break;
                case 1754384:
                    iM2885 = (C1015.f5662 - C0997.f5644) + 1747836;
                    continue;
            }
            iM2885 = C1059.m3145("۠۟۟");
        }
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        int iM763 = C1043.m763("ۧۥۧ");
        while (true) {
            switch (iM763) {
                case 1752582:
                    iM763 = (C1045.f5692 % C0992.f5639) + 1754732;
                    break;
                case 1754569:
                    return i;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0033. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01ca A[SYNTHETIC] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r34, android.view.View r35, android.view.ViewGroup r36) {
        /*
            Method dump skipped, instruction units count: 1704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0257gd.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
