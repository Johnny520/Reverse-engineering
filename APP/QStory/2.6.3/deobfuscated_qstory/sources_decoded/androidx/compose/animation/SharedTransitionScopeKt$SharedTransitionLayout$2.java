package androidx.compose.animation;

import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6552;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class SharedTransitionScopeKt$SharedTransitionLayout$2 extends Lambda implements InterfaceC6554 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6551 $content;
    final /* synthetic */ InterfaceC2129 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionLayout$2(InterfaceC2129 interfaceC2129, InterfaceC6551 interfaceC6551, int i, int i2) {
        super(2);
        this.$modifier = interfaceC2129;
        this.$content = interfaceC6551;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        final InterfaceC2129 interfaceC2129 = this.$modifier;
        final InterfaceC6551 interfaceC6551 = this.$content;
        int iM2471 = AbstractC1367.m2471(this.$$changed | 1);
        int i3 = this.$$default;
        int i4 = AbstractC0424.f1382;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(646379026);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i2 = iM2471 | 6;
        } else if ((iM2471 & 6) == 0) {
            i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | iM2471;
        } else {
            i2 = iM2471;
        }
        if ((iM2471 & 48) == 0) {
            i2 |= c1324.m2378(interfaceC6551) ? 32 : 16;
        }
        if (c1324.m2343(1 & i2, (i2 & 19) != 18)) {
            if (i5 != 0) {
                interfaceC2129 = C2125.f6276;
            }
            AbstractC0424.m1120(AbstractC1254.m2189(1948801580, new InterfaceC6552() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                public final void invoke(InterfaceC0427 interfaceC0427, InterfaceC2129 interfaceC21292, InterfaceC1373 interfaceC13732, int i6) {
                    int i7;
                    if ((i6 & 6) == 0) {
                        i7 = (((C1324) interfaceC13732).m2360(interfaceC0427) ? 4 : 2) | i6;
                    } else {
                        i7 = i6;
                    }
                    if ((i6 & 48) == 0) {
                        i7 |= ((C1324) interfaceC13732).m2360(interfaceC21292) ? 32 : 16;
                    }
                    C1324 c13242 = (C1324) interfaceC13732;
                    if (!c13242.m2343(i7 & 1, (i7 & 147) != 146)) {
                        c13242.m2339();
                        return;
                    }
                    InterfaceC2129 interfaceC2129Mo3866 = interfaceC2129.mo3866(interfaceC21292);
                    InterfaceC6551 interfaceC65512 = interfaceC6551;
                    InterfaceC1658 interfaceC1658M1451 = AbstractC0643.m1451(C2119.f6272, false);
                    int iHashCode = Long.hashCode(c13242.f3837);
                    C1253 c1253M2381 = c13242.m2381();
                    InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c13242, interfaceC2129Mo3866);
                    InterfaceC1784.f5222.getClass();
                    InterfaceC6543 interfaceC6543 = C1765.f5185;
                    c13242.m2396();
                    if (c13242.f3838) {
                        c13242.m2380(interfaceC6543);
                    } else {
                        c13242.m2390();
                    }
                    AbstractC1367.m2472(c13242, interfaceC1658M1451, C1765.f5181);
                    AbstractC1367.m2472(c13242, c1253M2381, C1765.f5182);
                    AbstractC1367.m2493(c13242, Integer.valueOf(iHashCode), C1765.f5188);
                    AbstractC1367.m2481(c13242, C1765.f5187);
                    AbstractC1367.m2472(c13242, interfaceC2129M3861, C1765.f5183);
                    interfaceC65512.invoke(interfaceC0427, c13242, Integer.valueOf(i7 & 14));
                    c13242.m2377(true);
                }

                @Override // p052.InterfaceC6552
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((InterfaceC0427) obj, (InterfaceC2129) obj2, (InterfaceC1373) obj3, ((Number) obj4).intValue());
                    return C5176.f14739;
                }
            }, c1324), c1324, 6);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new SharedTransitionScopeKt$SharedTransitionLayout$2(interfaceC2129, interfaceC6551, iM2471, i3);
        }
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5176.f14739;
    }
}
