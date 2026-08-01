package androidx.compose.ui.draw;

import androidx.appcompat.app.C0108;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;
import p205.InterfaceC7895;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class CacheDrawScope$record$1$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC6557 $block;
    final /* synthetic */ InterfaceC7895 $density;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ InterfaceC7895 $prevDensity;
    final /* synthetic */ LayoutDirection $prevLayoutDirection;
    final /* synthetic */ InterfaceC1506 $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawScope$record$1$1(InterfaceC6557 interfaceC6557, InterfaceC1506 interfaceC1506, InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection, InterfaceC7895 interfaceC78952, LayoutDirection layoutDirection2) {
        super(1);
        this.$block = interfaceC6557;
        this.$scope = interfaceC1506;
        this.$density = interfaceC7895;
        this.$layoutDirection = layoutDirection;
        this.$prevDensity = interfaceC78952;
        this.$prevLayoutDirection = layoutDirection2;
    }

    public final void invoke(InterfaceC1504 interfaceC1504) {
        C0108 c0108Mo2696 = interfaceC1504.mo2696();
        InterfaceC7895 interfaceC7895 = this.$density;
        LayoutDirection layoutDirection = this.$layoutDirection;
        c0108Mo2696.m363(interfaceC7895);
        c0108Mo2696.m359(layoutDirection);
        try {
            this.$block.invoke(this.$scope);
        } finally {
            C0108 c0108Mo26962 = interfaceC1504.mo2696();
            InterfaceC7895 interfaceC78952 = this.$prevDensity;
            LayoutDirection layoutDirection2 = this.$prevLayoutDirection;
            c0108Mo26962.m363(interfaceC78952);
            c0108Mo26962.m359(layoutDirection2);
        }
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1504) obj);
        return C5175.f14739;
    }
}
