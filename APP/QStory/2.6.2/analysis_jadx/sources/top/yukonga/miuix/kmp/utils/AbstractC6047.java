package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.AbstractC1092;
import androidx.compose.foundation.InterfaceC1095;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6047 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC2129 m11353(InterfaceC2129 interfaceC2129, InterfaceC0580 interfaceC0580, InterfaceC1095 interfaceC1095) {
        InterfaceC2129 interfaceC2129Mo3856;
        interfaceC2129.getClass();
        if (interfaceC1095 != null) {
            interfaceC2129Mo3856 = new C6062(interfaceC0580, interfaceC1095);
        } else if (interfaceC1095 == null) {
            interfaceC2129Mo3856 = new C6062(interfaceC0580, null);
        } else {
            C2125 c2125 = C2125.f6275;
            interfaceC2129Mo3856 = interfaceC0580 != null ? AbstractC1092.m1994(c2125, interfaceC0580, interfaceC1095).mo3856(new C6062(interfaceC0580, null)) : AbstractC2120.m3853(c2125, new C6048(interfaceC1095));
        }
        return interfaceC2129.mo3856(interfaceC2129Mo3856);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static float m11354(float f, float f2) {
        float fAbs = Math.abs(f);
        double dMax = Math.max(0.0f, Math.min(1.0f, 1.0f));
        double d = f2;
        float fAbs2 = Math.abs((float) (((Math.pow(dMax, 3.0d) / 3.0d) + (dMax - Math.pow(dMax, 2.0d))) * d));
        if (fAbs <= 0.0f) {
            return 0.0f;
        }
        if (fAbs >= fAbs2) {
            fAbs = fAbs2;
        }
        double d2 = d - (((double) fAbs) * 3.0d);
        return (float) (d - (Math.pow(Math.abs(d2), 0.3333333333333333d) * (Math.signum(d2) * Math.pow(d, 0.6666666666666666d))));
    }
}
