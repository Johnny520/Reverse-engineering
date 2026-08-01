package androidx.compose.ui.draw;

import androidx.appcompat.app.C0108;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6558;
import p205.InterfaceC7896;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class CacheDrawScope$record$1$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC6558 $block;
    final /* synthetic */ InterfaceC7896 $density;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ InterfaceC7896 $prevDensity;
    final /* synthetic */ LayoutDirection $prevLayoutDirection;
    final /* synthetic */ InterfaceC1506 $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawScope$record$1$1(InterfaceC6558 interfaceC6558, InterfaceC1506 interfaceC1506, InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection, InterfaceC7896 interfaceC78962, LayoutDirection layoutDirection2) {
        super(1);
        this.$block = interfaceC6558;
        this.$scope = interfaceC1506;
        this.$density = interfaceC7896;
        this.$layoutDirection = layoutDirection;
        this.$prevDensity = interfaceC78962;
        this.$prevLayoutDirection = layoutDirection2;
    }

    public final void invoke(InterfaceC1504 interfaceC1504) {
        C0108 c0108Mo2706 = interfaceC1504.mo2706();
        InterfaceC7896 interfaceC7896 = this.$density;
        LayoutDirection layoutDirection = this.$layoutDirection;
        c0108Mo2706.m364(interfaceC7896);
        c0108Mo2706.m360(layoutDirection);
        try {
            this.$block.invoke(this.$scope);
        } finally {
            C0108 c0108Mo27062 = interfaceC1504.mo2706();
            InterfaceC7896 interfaceC78962 = this.$prevDensity;
            LayoutDirection layoutDirection2 = this.$prevLayoutDirection;
            c0108Mo27062.m364(interfaceC78962);
            c0108Mo27062.m360(layoutDirection2);
        }
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1504) obj);
        return C5176.f14739;
    }
}
