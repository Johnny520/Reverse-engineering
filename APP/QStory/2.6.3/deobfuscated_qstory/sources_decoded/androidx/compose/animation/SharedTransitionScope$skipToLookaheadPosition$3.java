package androidx.compose.animation;

import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.InterfaceC1695;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6543;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;", "Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;", "it", "", "invoke", "(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class SharedTransitionScope$skipToLookaheadPosition$3 extends Lambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6543 $enabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScope$skipToLookaheadPosition$3(InterfaceC6543 interfaceC6543) {
        super(2);
        this.$enabled = interfaceC6543;
    }

    @Override // p052.InterfaceC6554
    public final Boolean invoke(AbstractC1708 abstractC1708, InterfaceC1695 interfaceC1695) {
        return (Boolean) this.$enabled.invoke();
    }
}
