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
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6551;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class SharedTransitionScopeKt$SharedTransitionLayout$2 extends Lambda implements InterfaceC6553 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6550 $content;
    final /* synthetic */ InterfaceC2129 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionLayout$2(InterfaceC2129 interfaceC2129, InterfaceC6550 interfaceC6550, int i, int i2) {
        super(2);
        this.$modifier = interfaceC2129;
        this.$content = interfaceC6550;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        final InterfaceC2129 interfaceC2129 = this.$modifier;
        final InterfaceC6550 interfaceC6550 = this.$content;
        int iM2460 = AbstractC1367.m2460(this.$$changed | 1);
        int i3 = this.$$default;
        int i4 = AbstractC0424.f1382;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(646379026);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i2 = iM2460 | 6;
        } else if ((iM2460 & 6) == 0) {
            i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | iM2460;
        } else {
            i2 = iM2460;
        }
        if ((iM2460 & 48) == 0) {
            i2 |= c1324.m2368(interfaceC6550) ? 32 : 16;
        }
        if (c1324.m2333(1 & i2, (i2 & 19) != 18)) {
            if (i5 != 0) {
                interfaceC2129 = C2125.f6275;
            }
            AbstractC0424.m1119(AbstractC1254.m2179(1948801580, new InterfaceC6551() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                public final void invoke(InterfaceC0427 interfaceC0427, InterfaceC2129 interfaceC21292, InterfaceC1373 interfaceC13732, int i6) {
                    int i7;
                    if ((i6 & 6) == 0) {
                        i7 = (((C1324) interfaceC13732).m2350(interfaceC0427) ? 4 : 2) | i6;
                    } else {
                        i7 = i6;
                    }
                    if ((i6 & 48) == 0) {
                        i7 |= ((C1324) interfaceC13732).m2350(interfaceC21292) ? 32 : 16;
                    }
                    C1324 c13242 = (C1324) interfaceC13732;
                    if (!c13242.m2333(i7 & 1, (i7 & 147) != 146)) {
                        c13242.m2329();
                        return;
                    }
                    InterfaceC2129 interfaceC2129Mo3856 = interfaceC2129.mo3856(interfaceC21292);
                    InterfaceC6550 interfaceC65502 = interfaceC6550;
                    InterfaceC1658 interfaceC1658M1441 = AbstractC0643.m1441(C2119.f6271, false);
                    int iHashCode = Long.hashCode(c13242.f3836);
                    C1253 c1253M2371 = c13242.m2371();
                    InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c13242, interfaceC2129Mo3856);
                    InterfaceC1784.f5221.getClass();
                    InterfaceC6542 interfaceC6542 = C1765.f5184;
                    c13242.m2386();
                    if (c13242.f3837) {
                        c13242.m2370(interfaceC6542);
                    } else {
                        c13242.m2380();
                    }
                    AbstractC1367.m2464(c13242, interfaceC1658M1441, C1765.f5180);
                    AbstractC1367.m2464(c13242, c1253M2371, C1765.f5181);
                    AbstractC1367.m2483(c13242, Integer.valueOf(iHashCode), C1765.f5187);
                    AbstractC1367.m2472(c13242, C1765.f5186);
                    AbstractC1367.m2464(c13242, interfaceC2129M3851, C1765.f5182);
                    interfaceC65502.invoke(interfaceC0427, c13242, Integer.valueOf(i7 & 14));
                    c13242.m2367(true);
                }

                @Override // p052.InterfaceC6551
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((InterfaceC0427) obj, (InterfaceC2129) obj2, (InterfaceC1373) obj3, ((Number) obj4).intValue());
                    return C5175.f14739;
                }
            }, c1324), c1324, 6);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new SharedTransitionScopeKt$SharedTransitionLayout$2(interfaceC2129, interfaceC6550, iM2460, i3);
        }
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5175.f14739;
    }
}
