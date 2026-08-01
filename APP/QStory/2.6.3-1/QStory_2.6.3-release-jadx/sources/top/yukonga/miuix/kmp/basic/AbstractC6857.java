package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.text.C1808;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.painter.AbstractC2363;
import androidx.compose.p001ui.layout.C2539;
import androidx.compose.p001ui.platform.AbstractC2744;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import p128.C8155;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6857 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2962 f16803 = AbstractC1460.m1939(C2958.f6621, 24.0f);

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11941(AbstractC2363 abstractC2363, InterfaceC2962 interfaceC2962, long j, InterfaceC2208 interfaceC2208, int i) {
        InterfaceC2962 interfaceC29622;
        abstractC2363.getClass();
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(2111911869);
        int i2 = i | (c2159.m2938(abstractC2363) ? 4 : 2);
        if (c2159.m2903(i2 & 1, (i2 & 1171) != 1170)) {
            c2159.m2901();
            if ((i & 1) != 0 && !c2159.m2913()) {
                c2159.m2899();
            }
            c2159.m2934();
            Object objM2905 = c2159.m2905();
            if (objM2905 == C2204.f4319) {
                objM2905 = C2434.m3509(j, C2434.f5042) ? null : new C2442(j, 5);
                c2159.m2946(objM2905);
            }
            C2442 c2442 = (C2442) objM2905;
            c2159.m2952(-1008946619);
            c2159.m2937(false);
            int i3 = AbstractC2744.f5973;
            boolean zM13074 = C8155.m13074(abstractC2363.mo3368(), 9205357640488583168L);
            C2958 c2958 = C2958.f6621;
            if (!zM13074) {
                long jMo3368 = abstractC2363.mo3368();
                InterfaceC2962 interfaceC29623 = (Float.isInfinite(Float.intBitsToFloat((int) (jMo3368 >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jMo3368 & 4294967295L)))) ? f16803 : c2958;
                interfaceC29622 = interfaceC2962;
                AbstractC1484.m2014(AbstractC2280.m3142(interfaceC29622.mo4426(interfaceC29623), abstractC2363, null, C2539.f5320, 0.0f, c2442, 22).mo4426(c2958), c2159, 0);
            }
        } else {
            interfaceC29622 = interfaceC2962;
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1808(abstractC2363, interfaceC29622, j, i, 1);
        }
    }
}
