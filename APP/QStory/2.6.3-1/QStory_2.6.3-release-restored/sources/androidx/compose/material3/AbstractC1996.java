package androidx.compose.material3;

import androidx.activity.compose.C0858;
import androidx.appcompat.widget.C1041;
import androidx.compose.foundation.AbstractC1930;
import androidx.compose.foundation.layout.C1432;
import androidx.compose.foundation.text.contextmenu.provider.C1669;
import androidx.compose.foundation.text.selection.AbstractC1767;
import androidx.compose.foundation.text.selection.C1768;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2077;
import kotlin.AbstractC6019;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1996 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2169 f3666;

    static {
        AbstractC6019.m10773(new C0858(15));
        f3666 = new C2169(new C0858(16));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2583(C2027 c2027, C2054 c2054, C2001 c2001, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        C2027 c20272;
        C2077 c20772;
        C2001 c20012;
        C2054 c20542;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-449719819);
        int i2 = (c2159.m2920(c2027) ? 4 : 2) | i | 144;
        if (c2159.m2903(i2 & 1, (i2 & 1171) != 1170)) {
            c2159.m2901();
            if ((i & 1) == 0 || c2159.m2913()) {
                c2054 = (C2054) c2159.m2943(AbstractC2037.f3799);
                c2001 = (C2001) c2159.m2943(AbstractC1997.f3667);
            } else {
                c2159.m2899();
            }
            int i3 = i2 & (-1009);
            C2054 c20543 = c2054;
            C2001 c20013 = c2001;
            c2159.m2934();
            c20272 = c2027;
            m2584(c20272, (C1982) c2159.m2943(f3666), c20543, c20013, c2077, c2159, (i3 & 14) | 24576);
            c20772 = c2077;
            c20542 = c20543;
            c20012 = c20013;
        } else {
            c20272 = c2027;
            c20772 = c2077;
            c2159.m2899();
            c20012 = c2001;
            c20542 = c2054;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1669(c20272, c20542, c20012, c20772, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2584(C2027 c2027, C1982 c1982, C2054 c2054, C2001 c2001, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(904511636);
        if ((i & 6) == 0) {
            i2 = (c2159.m2920(c2027) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2920(c1982) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2920(c2054) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c2159.m2920(c2001) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c2159.m2938(c2077) ? 16384 : 8192;
        }
        if (c2159.m2903(i2 & 1, (i2 & 9363) != 9362)) {
            c2159.m2901();
            if ((i & 1) != 0 && !c2159.m2913()) {
                c2159.m2899();
            }
            c2159.m2934();
            C1973 c1973M2578 = AbstractC1977.m2578(0.0f, 7);
            long j = c2027.f3774;
            boolean zM2921 = c2159.m2921(j);
            Object objM2905 = c2159.m2905();
            if (zM2921 || objM2905 == C2204.f4319) {
                objM2905 = new C1768(j, C2434.m3510(0.4f, j));
                c2159.m2946(objM2905);
            }
            AbstractC2202.m3046(new C1041[]{AbstractC2032.f3797.mo2988(c2027), f3666.mo2988(c1982), AbstractC1930.f3566.mo2988(c1973M2578), AbstractC2037.f3799.mo2988(c2054), AbstractC1767.f2983.mo2988((C1768) objM2905), AbstractC1997.f3667.mo2988(c2001)}, AbstractC2089.m2749(-1750539308, new C1985(c2001, c2077), c2159), c2159, 56);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1432(c2027, c1982, c2054, c2001, c2077, i, 1);
        }
    }
}
