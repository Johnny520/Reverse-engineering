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
import kotlin.C5175;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6550;
import p052.InterfaceC6551;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0424 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f1382 = 0;

    static {
        Map map = AbstractC0320.f1086;
        new C0236();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1119(final InterfaceC6551 interfaceC6551, InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(1908320054);
        if ((i & 6) == 0) {
            i2 = (c1324.m2368(interfaceC6551) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c1324.m2333(i2 & 1, (i2 & 3) != 2)) {
            AbstractC1656.m3050(AbstractC1254.m2179(2062852661, new InterfaceC6550() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1
                {
                    super(3);
                }

                public final void invoke(InterfaceC1659 interfaceC1659, InterfaceC1373 interfaceC13732, int i3) {
                    C1324 c13242 = (C1324) interfaceC13732;
                    Object objM2335 = c13242.m2335();
                    C1353 c1353 = C1369.f3973;
                    if (objM2335 == c1353) {
                        objM2335 = AbstractC1367.m2488(EmptyCoroutineContext.INSTANCE, c13242);
                        c13242.m2376(objM2335);
                    }
                    InterfaceC5400 interfaceC5400 = (InterfaceC5400) objM2335;
                    Object objM23352 = c13242.m2335();
                    if (objM23352 == c1353) {
                        objM23352 = new C0425(interfaceC1659, interfaceC5400);
                        c13242.m2376(objM23352);
                    }
                    C0425 c0425 = (C0425) objM23352;
                    interfaceC6551.invoke(c0425, new C0423(c0425), c13242, 6);
                }

                @Override // p052.InterfaceC6550
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((InterfaceC1659) obj, (InterfaceC1373) obj2, ((Number) obj3).intValue());
                    return C5175.f14739;
                }
            }, c1324), c1324, 6);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p052.InterfaceC6553
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5175.f14739;
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i3) {
                    AbstractC0424.m1119(interfaceC6551, interfaceC13732, AbstractC1367.m2460(i | 1));
                }
            };
        }
    }
}
