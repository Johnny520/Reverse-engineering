package androidx.compose.ui.spatial;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6543;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class RectListDebugger_androidKt$RectListDebugger$1 extends Lambda implements InterfaceC6554 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2129 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectListDebugger_androidKt$RectListDebugger$1(InterfaceC2129 interfaceC2129, int i, int i2) {
        super(2);
        this.$modifier = interfaceC2129;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        InterfaceC2129 interfaceC2129 = this.$modifier;
        int iM2471 = AbstractC1367.m2471(this.$$changed | 1);
        int i3 = this.$$default;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(949081399);
        int i4 = i3 & 1;
        if (i4 != 0) {
            i2 = iM2471 | 6;
        } else if ((iM2471 & 6) == 0) {
            i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | iM2471;
        } else {
            i2 = iM2471;
        }
        if (c1324.m2343(i2 & 1, (i2 & 3) != 2)) {
            if (i4 != 0) {
                interfaceC2129 = C2125.f6276;
            }
            InterfaceC2129 interfaceC2129Mo3866 = interfaceC2129.mo3866(C1964.f5834);
            int iHashCode = Long.hashCode(c1324.f3837);
            InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129Mo3866);
            C1253 c1253M2381 = c1324.m2381();
            InterfaceC1784.f5222.getClass();
            InterfaceC6543 interfaceC6543 = C1765.f5185;
            c1324.m2396();
            if (c1324.f3838) {
                c1324.m2380(interfaceC6543);
            } else {
                c1324.m2390();
            }
            AbstractC1367.m2472(c1324, C1965.f5835, C1765.f5181);
            AbstractC1367.m2472(c1324, c1253M2381, C1765.f5182);
            AbstractC1367.m2481(c1324, C1765.f5187);
            AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
            AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode), C1765.f5188);
            c1324.m2377(true);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new RectListDebugger_androidKt$RectListDebugger$1(interfaceC2129, iM2471, i3);
        }
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5176.f14739;
    }
}
