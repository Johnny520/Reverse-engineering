package androidx.compose.p001ui.draw;

import androidx.appcompat.app.C0955;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;
import p221.InterfaceC8725;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;)V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class CacheDrawScope$record$1$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC7387 $block;
    final /* synthetic */ InterfaceC8725 $density;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ InterfaceC8725 $prevDensity;
    final /* synthetic */ LayoutDirection $prevLayoutDirection;
    final /* synthetic */ InterfaceC2341 $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawScope$record$1$1(InterfaceC7387 interfaceC7387, InterfaceC2341 interfaceC2341, InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection, InterfaceC8725 interfaceC87252, LayoutDirection layoutDirection2) {
        super(1);
        this.$block = interfaceC7387;
        this.$scope = interfaceC2341;
        this.$density = interfaceC8725;
        this.$layoutDirection = layoutDirection;
        this.$prevDensity = interfaceC87252;
        this.$prevLayoutDirection = layoutDirection2;
    }

    public final void invoke(InterfaceC2339 interfaceC2339) {
        C0955 c0955Mo3266 = interfaceC2339.mo3266();
        InterfaceC8725 interfaceC8725 = this.$density;
        LayoutDirection layoutDirection = this.$layoutDirection;
        c0955Mo3266.m924(interfaceC8725);
        c0955Mo3266.m920(layoutDirection);
        try {
            this.$block.invoke(this.$scope);
        } finally {
            C0955 c0955Mo32662 = interfaceC2339.mo3266();
            InterfaceC8725 interfaceC87252 = this.$prevDensity;
            LayoutDirection layoutDirection2 = this.$prevLayoutDirection;
            c0955Mo32662.m924(interfaceC87252);
            c0955Mo32662.m920(layoutDirection2);
        }
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC2339) obj);
        return C6008.f15084;
    }
}
