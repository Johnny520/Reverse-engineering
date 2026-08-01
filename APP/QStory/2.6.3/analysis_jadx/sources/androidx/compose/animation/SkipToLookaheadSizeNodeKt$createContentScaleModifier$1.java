package androidx.compose.animation;

import androidx.compose.ui.graphics.C1573;
import androidx.compose.ui.graphics.InterfaceC1580;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6543;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class SkipToLookaheadSizeNodeKt$createContentScaleModifier$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC6543 $isEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkipToLookaheadSizeNodeKt$createContentScaleModifier$1(InterfaceC6543 interfaceC6543) {
        super(1);
        this.$isEnabled = interfaceC6543;
    }

    public final void invoke(InterfaceC1580 interfaceC1580) {
        ((C1573) interfaceC1580).m2852(((Boolean) this.$isEnabled.invoke()).booleanValue());
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1580) obj);
        return C5176.f14739;
    }
}
