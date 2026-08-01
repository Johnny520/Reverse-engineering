package androidx.compose.animation;

import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2088;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7381;
import p068.InterfaceC7383;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class SharedTransitionScopeKt$SharedTransitionLayout$2 extends Lambda implements InterfaceC7383 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC7380 $content;
    final /* synthetic */ InterfaceC2962 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionLayout$2(InterfaceC2962 interfaceC2962, InterfaceC7380 interfaceC7380, int i, int i2) {
        super(2);
        this.$modifier = interfaceC2962;
        this.$content = interfaceC7380;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
        int i2;
        final InterfaceC2962 interfaceC2962 = this.$modifier;
        final InterfaceC7380 interfaceC7380 = this.$content;
        int iM3031 = AbstractC2202.m3031(this.$$changed | 1);
        int i3 = this.$$default;
        int i4 = AbstractC1270.f1727;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(646379026);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i2 = iM3031 | 6;
        } else if ((iM3031 & 6) == 0) {
            i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | iM3031;
        } else {
            i2 = iM3031;
        }
        if ((iM3031 & 48) == 0) {
            i2 |= c2159.m2938(interfaceC7380) ? 32 : 16;
        }
        if (c2159.m2903(1 & i2, (i2 & 19) != 18)) {
            if (i5 != 0) {
                interfaceC2962 = C2958.f6621;
            }
            AbstractC1270.m1680(AbstractC2089.m2749(1948801580, new InterfaceC7381() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                public final void invoke(InterfaceC1273 interfaceC1273, InterfaceC2962 interfaceC29622, InterfaceC2208 interfaceC22082, int i6) {
                    int i7;
                    if ((i6 & 6) == 0) {
                        i7 = (((C2159) interfaceC22082).m2920(interfaceC1273) ? 4 : 2) | i6;
                    } else {
                        i7 = i6;
                    }
                    if ((i6 & 48) == 0) {
                        i7 |= ((C2159) interfaceC22082).m2920(interfaceC29622) ? 32 : 16;
                    }
                    C2159 c21592 = (C2159) interfaceC22082;
                    if (!c21592.m2903(i7 & 1, (i7 & 147) != 146)) {
                        c21592.m2899();
                        return;
                    }
                    InterfaceC2962 interfaceC2962Mo4426 = interfaceC2962.mo4426(interfaceC29622);
                    InterfaceC7380 interfaceC73802 = interfaceC7380;
                    InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, false);
                    int iHashCode = Long.hashCode(c21592.f4182);
                    C2088 c2088M2941 = c21592.m2941();
                    InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c21592, interfaceC2962Mo4426);
                    InterfaceC2619.f5567.getClass();
                    InterfaceC7372 interfaceC7372 = C2600.f5530;
                    c21592.m2956();
                    if (c21592.f4183) {
                        c21592.m2940(interfaceC7372);
                    } else {
                        c21592.m2950();
                    }
                    AbstractC2202.m3032(c21592, interfaceC2493M2011, C2600.f5526);
                    AbstractC2202.m3032(c21592, c2088M2941, C2600.f5527);
                    AbstractC2202.m3053(c21592, Integer.valueOf(iHashCode), C2600.f5533);
                    AbstractC2202.m3041(c21592, C2600.f5532);
                    AbstractC2202.m3032(c21592, interfaceC2962M4421, C2600.f5528);
                    interfaceC73802.invoke(interfaceC1273, c21592, Integer.valueOf(i7 & 14));
                    c21592.m2937(true);
                }

                @Override // p068.InterfaceC7381
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((InterfaceC1273) obj, (InterfaceC2962) obj2, (InterfaceC2208) obj3, ((Number) obj4).intValue());
                    return C6008.f15084;
                }
            }, c2159), c2159, 6);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new SharedTransitionScopeKt$SharedTransitionLayout$2(interfaceC2962, interfaceC7380, iM3031, i3);
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
        return C6008.f15084;
    }
}
