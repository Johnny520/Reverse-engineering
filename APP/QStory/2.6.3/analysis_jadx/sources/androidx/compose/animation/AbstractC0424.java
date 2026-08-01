package androidx.compose.animation;

import androidx.collection.C0236;
import androidx.compose.animation.core.AbstractC0320;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.ui.layout.AbstractC1656;
import androidx.compose.ui.layout.InterfaceC1659;
import java.util.Map;
import kotlin.C5176;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p052.InterfaceC6552;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0424 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f1382 = 0;

    static {
        Map map = AbstractC0320.f1086;
        new C0236();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1120(final InterfaceC6552 interfaceC6552, InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1908320054);
        if ((i & 6) == 0) {
            i2 = (c1324.m2378(interfaceC6552) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c1324.m2343(i2 & 1, (i2 & 3) != 2)) {
            AbstractC1656.m3060(AbstractC1254.m2189(2062852661, new InterfaceC6551() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1
                {
                    super(3);
                }

                public final void invoke(InterfaceC1659 interfaceC1659, InterfaceC1373 interfaceC13732, int i3) {
                    C1324 c13242 = (C1324) interfaceC13732;
                    Object objM2345 = c13242.m2345();
                    C1353 c1353 = C1369.f3974;
                    if (objM2345 == c1353) {
                        objM2345 = AbstractC1367.m2498(EmptyCoroutineContext.INSTANCE, c13242);
                        c13242.m2386(objM2345);
                    }
                    InterfaceC5401 interfaceC5401 = (InterfaceC5401) objM2345;
                    Object objM23452 = c13242.m2345();
                    if (objM23452 == c1353) {
                        objM23452 = new C0425(interfaceC1659, interfaceC5401);
                        c13242.m2386(objM23452);
                    }
                    C0425 c0425 = (C0425) objM23452;
                    interfaceC6552.invoke(c0425, new C0423(c0425), c13242, 6);
                }

                @Override // p052.InterfaceC6551
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((InterfaceC1659) obj, (InterfaceC1373) obj2, ((Number) obj3).intValue());
                    return C5176.f14739;
                }
            }, c1324), c1324, 6);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5176.f14739;
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i3) {
                    AbstractC0424.m1120(interfaceC6552, interfaceC13732, AbstractC1367.m2471(i | 1));
                }
            };
        }
    }
}
