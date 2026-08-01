package androidx.compose.p001ui.platform;

import androidx.compose.p001ui.graphics.InterfaceC2436;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;)V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class RenderNodeLayer$updateDisplayList$1$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC7383 $drawBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderNodeLayer$updateDisplayList$1$1(InterfaceC7383 interfaceC7383) {
        super(1);
        this.$drawBlock = interfaceC7383;
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC2436) obj);
        return C6008.f15084;
    }

    public final void invoke(InterfaceC2436 interfaceC2436) {
        this.$drawBlock.invoke(interfaceC2436, null);
    }
}
