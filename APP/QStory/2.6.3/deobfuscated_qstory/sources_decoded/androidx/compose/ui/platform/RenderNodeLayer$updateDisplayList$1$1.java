package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.InterfaceC1601;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class RenderNodeLayer$updateDisplayList$1$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC6554 $drawBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderNodeLayer$updateDisplayList$1$1(InterfaceC6554 interfaceC6554) {
        super(1);
        this.$drawBlock = interfaceC6554;
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1601) obj);
        return C5176.f14739;
    }

    public final void invoke(InterfaceC1601 interfaceC1601) {
        this.$drawBlock.invoke(interfaceC1601, null);
    }
}
