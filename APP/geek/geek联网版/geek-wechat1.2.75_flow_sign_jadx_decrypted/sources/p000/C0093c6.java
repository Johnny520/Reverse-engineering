package p000;

import android.view.KeyEvent;
import android.window.C0990;
import androidx.activity.result.C0993;
import androidx.activity.result.C0994;
import androidx.appcompat.view.menu.C0999;
import androidx.core.app.C1005;
import androidx.core.content.C1008;
import androidx.core.graphics.drawable.C1009;
import androidx.legacy.content.C1013;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.carousel.C1027;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.sidesheet.C1039;
import com.ljx.wechatmod.auth.C1047;
import kotlinx.coroutines.C1055;

/* JADX INFO: renamed from: c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0093c6 implements InterfaceC0781uh {

    /* JADX INFO: renamed from: a */
    public final int f819a;

    /* JADX INFO: renamed from: b */
    public final KeyEvent.Callback f820b;

    public /* synthetic */ C0093c6(KeyEvent.Callback callback, int i) {
        String str;
        this.f819a = i;
        this.f820b = callback;
        int iM2889 = C0994.m2889("۟ۥۥ");
        Double d = null;
        while (true) {
            switch (iM2889) {
                case 56417:
                    System.out.println(d);
                    if (C0999.m2907() >= 0) {
                        C1037.m3060();
                    }
                    iM2889 = C1037.m3059("ۧۥۥ");
                    continue;
                case 1746879:
                    if (C1047.m3099() >= 0) {
                        if (C1031.f5678 / (C1024.f5671 ^ (-630)) >= 0) {
                            C1055.f5702 = 96;
                            str = "ۢۨ۠";
                        } else {
                            str = "ۣۡۧ";
                        }
                        iM2889 = C1036.m3057(str);
                    }
                    break;
                case 1748741:
                    Double dDecode = Double.decode(C1009.m2947("IIz9pGd3qFaD5zePb7WL0a"));
                    iM2889 = 55914 + (C1027.f5674 % C1005.f5652);
                    d = dDecode;
                    continue;
                case 1749850:
                    break;
                case 1752704:
                    iM2889 = C1009.m2946("۟ۥۥ");
                    continue;
                case 1754567:
                    return;
            }
            if (C1013.f5660 <= 0) {
                C1008.f5655 = 47;
                iM2889 = C0993.m2885("ۤۥۨ");
            } else {
                iM2889 = (C1039.f5686 % C0990.f5637) + 1755133;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0099. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c A[SYNTHETIC] */
    @Override // p000.InterfaceC0781uh
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo587a() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0093c6.mo587a():void");
    }
}
