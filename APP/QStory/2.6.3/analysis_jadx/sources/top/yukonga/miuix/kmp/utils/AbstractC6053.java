package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.AbstractC1092;
import androidx.compose.foundation.InterfaceC1095;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6053 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC2129 m11413(InterfaceC2129 interfaceC2129, InterfaceC0580 interfaceC0580, InterfaceC1095 interfaceC1095) {
        InterfaceC2129 interfaceC2129Mo3866;
        interfaceC2129.getClass();
        if (interfaceC1095 != null) {
            interfaceC2129Mo3866 = new C6068(interfaceC0580, interfaceC1095);
        } else if (interfaceC1095 == null) {
            interfaceC2129Mo3866 = new C6068(interfaceC0580, null);
        } else {
            C2125 c2125 = C2125.f6276;
            interfaceC2129Mo3866 = interfaceC0580 != null ? AbstractC1092.m2004(c2125, interfaceC0580, interfaceC1095).mo3866(new C6068(interfaceC0580, null)) : AbstractC2120.m3863(c2125, new C6054(interfaceC1095));
        }
        return interfaceC2129.mo3866(interfaceC2129Mo3866);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static float m11414(float f, float f2) {
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
