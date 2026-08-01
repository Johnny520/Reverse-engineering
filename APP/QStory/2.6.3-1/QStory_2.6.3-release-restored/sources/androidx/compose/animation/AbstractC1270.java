package androidx.compose.animation;

import androidx.collection.C1083;
import androidx.compose.animation.core.AbstractC1166;
import androidx.compose.p001ui.layout.AbstractC2491;
import androidx.compose.p001ui.layout.InterfaceC2494;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.AbstractC2089;
import java.util.Map;
import kotlin.C6008;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p068.InterfaceC7381;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1270 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f1727 = 0;

    static {
        Map map = AbstractC1166.f1431;
        new C1083();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1680(final InterfaceC7381 interfaceC7381, InterfaceC2208 interfaceC2208, final int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1908320054);
        if ((i & 6) == 0) {
            i2 = (c2159.m2938(interfaceC7381) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c2159.m2903(i2 & 1, (i2 & 3) != 2)) {
            AbstractC2491.m3620(AbstractC2089.m2749(2062852661, new InterfaceC7380() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1
                {
                    super(3);
                }

                public final void invoke(InterfaceC2494 interfaceC2494, InterfaceC2208 interfaceC22082, int i3) {
                    C2159 c21592 = (C2159) interfaceC22082;
                    Object objM2905 = c21592.m2905();
                    C2188 c2188 = C2204.f4319;
                    if (objM2905 == c2188) {
                        objM2905 = AbstractC2202.m3058(EmptyCoroutineContext.INSTANCE, c21592);
                        c21592.m2946(objM2905);
                    }
                    InterfaceC6233 interfaceC6233 = (InterfaceC6233) objM2905;
                    Object objM29052 = c21592.m2905();
                    if (objM29052 == c2188) {
                        objM29052 = new C1271(interfaceC2494, interfaceC6233);
                        c21592.m2946(objM29052);
                    }
                    C1271 c1271 = (C1271) objM29052;
                    interfaceC7381.invoke(c1271, new C1269(c1271), c21592, 6);
                }

                @Override // p068.InterfaceC7380
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((InterfaceC2494) obj, (InterfaceC2208) obj2, ((Number) obj3).intValue());
                    return C6008.f15084;
                }
            }, c2159), c2159, 6);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                    return C6008.f15084;
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i3) {
                    AbstractC1270.m1680(interfaceC7381, interfaceC22082, AbstractC2202.m3031(i | 1));
                }
            };
        }
    }
}
