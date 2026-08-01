package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC1174;
import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.C1208;
import androidx.compose.animation.core.InterfaceC1195;
import androidx.compose.animation.core.InterfaceC1204;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2208;
import net.bytebuddy.jar.asm.Opcodes;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1286 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1145 f1747 = AbstractC1176.m1574(0.0f, 0.0f, null, 7);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2168 m1689(long j, C1208 c1208, String str, InterfaceC2208 interfaceC2208, int i, int i2) {
        InterfaceC1195 interfaceC1195 = c1208;
        if ((i2 & 2) != 0) {
            interfaceC1195 = f1747;
        }
        InterfaceC1195 interfaceC11952 = interfaceC1195;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        C2159 c2159 = (C2159) interfaceC2208;
        boolean zM2920 = c2159.m2920(C2434.m3506(j));
        Object objM2905 = c2159.m2905();
        if (zM2920 || objM2905 == C2204.f4319) {
            objM2905 = (InterfaceC1204) AbstractC1255.f1702.invoke(C2434.m3506(j));
            c2159.m2946(objM2905);
        }
        int i3 = i << 6;
        return AbstractC1174.m1566(new C2434(j), (InterfaceC1204) objM2905, interfaceC11952, str2, c2159, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & Opcodes.ASM7));
    }
}
