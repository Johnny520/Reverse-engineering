package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.AbstractC1930;
import androidx.compose.foundation.InterfaceC1933;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6882 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC2962 m11972(InterfaceC2962 interfaceC2962, InterfaceC1421 interfaceC1421, InterfaceC1933 interfaceC1933) {
        InterfaceC2962 interfaceC2962Mo4426;
        interfaceC2962.getClass();
        if (interfaceC1933 != null) {
            interfaceC2962Mo4426 = new C6897(interfaceC1421, interfaceC1933);
        } else if (interfaceC1933 == null) {
            interfaceC2962Mo4426 = new C6897(interfaceC1421, null);
        } else {
            C2958 c2958 = C2958.f6621;
            interfaceC2962Mo4426 = interfaceC1421 != null ? AbstractC1930.m2564(c2958, interfaceC1421, interfaceC1933).mo4426(new C6897(interfaceC1421, null)) : AbstractC2953.m4423(c2958, new C6883(interfaceC1933));
        }
        return interfaceC2962.mo4426(interfaceC2962Mo4426);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static float m11973(float f, float f2) {
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
