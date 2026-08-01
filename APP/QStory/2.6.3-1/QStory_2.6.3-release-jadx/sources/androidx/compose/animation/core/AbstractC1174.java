package androidx.compose.animation.core;

import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import java.util.Map;
import kotlin.C6008;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7372;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f1448 = 0;

    static {
        Map map = AbstractC1166.f1431;
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Map map2 = AbstractC1166.f1431;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2168 m1566(final C2434 c2434, InterfaceC1204 interfaceC1204, InterfaceC1195 interfaceC1195, String str, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        Object objM2905 = c2159.m2905();
        C2188 c2188 = C2204.f4319;
        if (objM2905 == c2188) {
            objM2905 = AbstractC2202.m3034(null);
            c2159.m2946(objM2905);
        }
        InterfaceC2230 interfaceC2230 = (InterfaceC2230) objM2905;
        Object objM29052 = c2159.m2905();
        if (objM29052 == c2188) {
            objM29052 = new C1177(interfaceC1204, c2434, null);
            c2159.m2946(objM29052);
        }
        C1177 c1177 = (C1177) objM29052;
        InterfaceC2230 interfaceC2230M3039 = AbstractC2202.m3039(null, c2159);
        InterfaceC2230 interfaceC2230M30392 = AbstractC2202.m3039(interfaceC1195, c2159);
        Object objM29053 = c2159.m2905();
        if (objM29053 == c2188) {
            objM29053 = AbstractC6037.m10841(-1, 6, null);
            c2159.m2946(objM29053);
        }
        final InterfaceC6039 interfaceC6039 = (InterfaceC6039) objM29053;
        boolean zM2938 = c2159.m2938(interfaceC6039) | ((((i & 14) ^ 6) > 4 && c2159.m2938(c2434)) || (6 & i) == 4);
        Object objM29054 = c2159.m2905();
        if (zM2938 || objM29054 == c2188) {
            objM29054 = new InterfaceC7372() { // from class: androidx.compose.animation.core.飘花落叶言子楪世哲兰苏
                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    interfaceC6039.mo8995(c2434);
                    return C6008.f15084;
                }
            };
            c2159.m2946(objM29054);
        }
        AbstractC2202.m3062((InterfaceC7372) objM29054, c2159);
        boolean zM29382 = c2159.m2938(interfaceC6039) | c2159.m2938(c1177) | c2159.m2920(interfaceC2230M30392) | c2159.m2920(interfaceC2230M3039);
        Object objM29055 = c2159.m2905();
        if (zM29382 || objM29055 == c2188) {
            AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(interfaceC6039, c1177, interfaceC2230M30392, interfaceC2230M3039, null);
            c2159.m2946(animateAsStateKt$animateValueAsState$3$1);
            objM29055 = animateAsStateKt$animateValueAsState$3$1;
        }
        AbstractC2202.m3060(c2159, interfaceC6039, (InterfaceC7383) objM29055);
        InterfaceC2168 interfaceC2168 = (InterfaceC2168) interfaceC2230.getValue();
        return interfaceC2168 == null ? c1177.f1472 : interfaceC2168;
    }
}
