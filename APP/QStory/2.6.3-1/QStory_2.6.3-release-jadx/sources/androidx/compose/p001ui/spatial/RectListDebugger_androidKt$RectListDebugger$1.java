package androidx.compose.p001ui.spatial;

import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2088;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;
import p068.InterfaceC7383;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class RectListDebugger_androidKt$RectListDebugger$1 extends Lambda implements InterfaceC7383 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2962 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectListDebugger_androidKt$RectListDebugger$1(InterfaceC2962 interfaceC2962, int i, int i2) {
        super(2);
        this.$modifier = interfaceC2962;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
        int i2;
        InterfaceC2962 interfaceC2962 = this.$modifier;
        int iM3031 = AbstractC2202.m3031(this.$$changed | 1);
        int i3 = this.$$default;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(949081399);
        int i4 = i3 & 1;
        if (i4 != 0) {
            i2 = iM3031 | 6;
        } else if ((iM3031 & 6) == 0) {
            i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | iM3031;
        } else {
            i2 = iM3031;
        }
        if (c2159.m2903(i2 & 1, (i2 & 3) != 2)) {
            if (i4 != 0) {
                interfaceC2962 = C2958.f6621;
            }
            InterfaceC2962 interfaceC2962Mo4426 = interfaceC2962.mo4426(C2799.f6179);
            int iHashCode = Long.hashCode(c2159.f4182);
            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962Mo4426);
            C2088 c2088M2941 = c2159.m2941();
            InterfaceC2619.f5567.getClass();
            InterfaceC7372 interfaceC7372 = C2600.f5530;
            c2159.m2956();
            if (c2159.f4183) {
                c2159.m2940(interfaceC7372);
            } else {
                c2159.m2950();
            }
            AbstractC2202.m3032(c2159, C2800.f6180, C2600.f5526);
            AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
            AbstractC2202.m3041(c2159, C2600.f5532);
            AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
            AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
            c2159.m2937(true);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new RectListDebugger_androidKt$RectListDebugger$1(interfaceC2962, iM3031, i3);
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
        return C6008.f15084;
    }
}
