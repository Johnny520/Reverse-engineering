package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.support.v4.graphics.drawable.C0987;
import android.window.C0990;
import android.window.C0991;
import androidx.activity.C0996;
import androidx.appcompat.view.menu.C0998;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.app.C1005;
import androidx.core.graphics.drawable.C1009;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.Base64;
import com.github.megatronking.stringfog.annotation.C1016;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.appbar.C1021;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1032;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.datepicker.C1035;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.snackbar.C1040;
import com.google.android.material.textfield.C1041;
import com.google.android.material.timepicker.C1043;
import com.ljx.wechatmod.auth.C1047;
import kotlinx.coroutines.C1056;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: ss */
/* JADX INFO: loaded from: classes.dex */
public final class C0718ss extends t50 implements InterfaceC0935ym {

    /* JADX INFO: renamed from: e */
    public final int f4362e;

    /* JADX INFO: renamed from: f */
    public final ContextWrapper f4363f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0718ss(ContextWrapper contextWrapper, InterfaceC0814vd interfaceC0814vd, int i) {
        super(interfaceC0814vd);
        this.f4362e = i;
        this.f4363f = contextWrapper;
        int i2 = 0;
        int iM2931 = C1005.m2931("۟۠ۡ");
        while (true) {
            switch (iM2931) {
                case 56294:
                    break;
                case 56446:
                    if (C1056.f5703 % (C1016.f5663 + 9510) <= 0) {
                        C0991.m2874();
                        iM2931 = C1033.m3042("ۦۡۤ");
                    } else {
                        iM2931 = (C0990.f5637 % C1009.f5656) + 1746638;
                        continue;
                    }
                    break;
                case 1746720:
                    if (C0990.m2872() <= 0) {
                        if (C0987.f5634 + (C1041.f5688 | 4226) <= 0) {
                            C1054.f5701 = 33;
                        }
                        iM2931 = C0991.m2876("ۧۥۥ");
                    }
                    break;
                case 1754441:
                    return;
                case 1754567:
                    i2 = Integer.parseInt(C0996.m2895("BU"));
                    if ((C1032.f5679 | (C1031.f5678 % (-2191))) >= 0) {
                        iM2931 = C1040.m3072("۟ۥ");
                    } else {
                        iM2931 = (C1018.f5665 | C1016.f5663) + 1755568;
                        continue;
                    }
                    break;
                case 1755469:
                    System.out.println(i2);
                    iM2931 = (C1036.f5683 % C1015.f5662) + 1754425;
                    continue;
            }
            iM2931 = (C1023.f5670 / C1043.f5690) ^ 1754441;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001f. Please report as an issue. */
    @Override // p000.t50
    /* JADX INFO: renamed from: a */
    public final InterfaceC0814vd mo35a(InterfaceC0814vd interfaceC0814vd) {
        String str;
        int iM2996 = C1021.m2996("ۥۣ");
        while (true) {
            switch (iM2996) {
                case 56415:
                    return new C0718ss((Application) this.f4363f, interfaceC0814vd, 0);
                case 56478:
                    switch (this.f4362e) {
                        case Base64.DEFAULT /* 0 */:
                            str = "ۣۢ";
                            iM2996 = C1004.m2927(str);
                            break;
                        default:
                            iM2996 = (C1035.f5682 / C1015.f5662) + 1754507;
                            break;
                    }
                    break;
                case 1753450:
                    if ((C1023.f5670 | (C0998.f5645 / 8122)) >= 0) {
                        C1047.f5694 = 83;
                        str = "ۣۡۨ";
                    } else {
                        str = "ۥۣ";
                    }
                    iM2996 = C1004.m2927(str);
                    break;
                case 1754413:
                    str = "ۣۢ";
                    iM2996 = C1004.m2927(str);
                    break;
                case 1754507:
                    return new C0718ss((Activity) this.f4363f, interfaceC0814vd, 1);
                case 1755373:
                    iM2996 = (C1035.f5682 / C1015.f5662) + 1754507;
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0056. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0131 A[SYNTHETIC] */
    @Override // p000.InterfaceC0935ym
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo36e(java.lang.Object r10, java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0718ss.mo36e(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x01b3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x012c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01bf A[SYNTHETIC] */
    @Override // p000.t50
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo37g(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0718ss.mo37g(java.lang.Object):java.lang.Object");
    }
}
