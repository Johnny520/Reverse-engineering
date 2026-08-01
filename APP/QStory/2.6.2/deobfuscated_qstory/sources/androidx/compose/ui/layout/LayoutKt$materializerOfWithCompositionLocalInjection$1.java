package androidx.compose.ui.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2125;
import androidx.compose.ui.C2135;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6550;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Landroidx/compose/ui/node/飘花落叶言子楪苏世哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke-Deg8D_g", "(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class LayoutKt$materializerOfWithCompositionLocalInjection$1 extends Lambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC2129 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$materializerOfWithCompositionLocalInjection$1(InterfaceC2129 interfaceC2129) {
        super(3);
        this.$modifier = interfaceC2129;
    }

    @Override // p052.InterfaceC6550
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        throw AbstractC0053.m158(obj);
    }

    /* JADX INFO: renamed from: invoke-Deg8D_g, reason: not valid java name */
    public final void m3038invokeDeg8D_g(InterfaceC1373 interfaceC1373, InterfaceC1373 interfaceC13732, int i) {
        int iHashCode = Integer.hashCode(AbstractC1367.m2479(interfaceC13732));
        InterfaceC2129 interfaceC2129M3851 = this.$modifier;
        if (interfaceC2129M3851 != C2125.f6275) {
            interfaceC2129M3851 = AbstractC2120.m3851(interfaceC13732, new C2135(((C1324) interfaceC13732).m2371()).mo3856(interfaceC2129M3851));
        }
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2332(509942095, 0, null, null);
        InterfaceC1784.f5221.getClass();
        AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
        AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
        c1324.m2367(false);
    }
}
