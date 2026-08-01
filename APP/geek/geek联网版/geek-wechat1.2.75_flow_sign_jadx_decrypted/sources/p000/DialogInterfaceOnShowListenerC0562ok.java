package p000;

import android.content.DialogInterface;
import android.support.v4.graphics.drawable.C0987;
import android.widget.LinearLayout;
import androidx.activity.C0995;
import androidx.activity.result.C0993;
import androidx.appcompat.view.menu.C0998;
import androidx.coordinatorlayout.widget.C1002;
import androidx.core.content.C1008;
import androidx.legacy.content.C1013;
import com.github.megatronking.stringfog.C1019;
import com.google.android.material.appbar.C1020;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.textfield.C1041;
import com.google.android.material.theme.C1042;
import com.ljx.wechatmod.auth.C1047;
import io.fastkv.C1053;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: ok */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC0562ok implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a */
    public final int f3466a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f3467b;

    /* JADX INFO: renamed from: c */
    public final int f3468c;

    public /* synthetic */ DialogInterfaceOnShowListenerC0562ok(LinearLayout linearLayout, int i, int i2) {
        this.f3466a = i2;
        this.f3467b = linearLayout;
        this.f3468c = i;
        int iM3122 = C1053.m3122("ۣۡۧ");
        int i3 = 0;
        while (true) {
            switch (iM3122) {
                case 56512:
                    return;
                case 1750563:
                    break;
                case 1750601:
                    if (C0998.m2903() <= 0) {
                        iM3122 = (C1042.f5689 | C1056.f5703) + 1751920;
                    }
                    break;
                case 1751711:
                    iM3122 = C1008.m2944(C0995.m2892() >= 0 ? "ۤ۠ۢ" : "ۣۡۧ");
                    continue;
                case 1752672:
                    int i4 = Integer.parseInt(C1019.m2986("gm0eDaPLno22zedMWU4o3eq"));
                    if (C1002.f5649 >= 0) {
                        iM3122 = C1013.m2965("ۤۦۡ");
                        i3 = i4;
                    } else {
                        iM3122 = 1755929 + (C1047.f5694 % C0993.f5640);
                        i3 = i4;
                        continue;
                    }
                    break;
                case 1755430:
                    System.out.println(i3);
                    iM3122 = C1041.m3074("ۦۦ");
                    continue;
            }
            if (C0998.f5645 / (C1020.f5667 * (-3535)) != 0) {
                C0987.m2860();
                iM3122 = C1024.m3009("ۤۡۨ");
            } else {
                iM3122 = (C1023.f5670 ^ C1057.f5704) + 56822;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x008d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d1 A[SYNTHETIC] */
    @Override // android.content.DialogInterface.OnShowListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onShow(android.content.DialogInterface r14) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.DialogInterfaceOnShowListenerC0562ok.onShow(android.content.DialogInterface):void");
    }
}
