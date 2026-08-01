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
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class RectListDebugger_androidKt$RectListDebugger$1 extends Lambda implements InterfaceC6553 {
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
        int iM2460 = AbstractC1367.m2460(this.$$changed | 1);
        int i3 = this.$$default;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(949081399);
        int i4 = i3 & 1;
        if (i4 != 0) {
            i2 = iM2460 | 6;
        } else if ((iM2460 & 6) == 0) {
            i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | iM2460;
        } else {
            i2 = iM2460;
        }
        if (c1324.m2333(i2 & 1, (i2 & 3) != 2)) {
            if (i4 != 0) {
                interfaceC2129 = C2125.f6275;
            }
            InterfaceC2129 interfaceC2129Mo3856 = interfaceC2129.mo3856(C1964.f5833);
            int iHashCode = Long.hashCode(c1324.f3836);
            InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129Mo3856);
            C1253 c1253M2371 = c1324.m2371();
            InterfaceC1784.f5221.getClass();
            InterfaceC6542 interfaceC6542 = C1765.f5184;
            c1324.m2386();
            if (c1324.f3837) {
                c1324.m2370(interfaceC6542);
            } else {
                c1324.m2380();
            }
            AbstractC1367.m2464(c1324, C1965.f5834, C1765.f5180);
            AbstractC1367.m2464(c1324, c1253M2371, C1765.f5181);
            AbstractC1367.m2472(c1324, C1765.f5186);
            AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
            AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
            c1324.m2367(true);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new RectListDebugger_androidKt$RectListDebugger$1(interfaceC2129, iM2460, i3);
        }
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5175.f14739;
    }
}
