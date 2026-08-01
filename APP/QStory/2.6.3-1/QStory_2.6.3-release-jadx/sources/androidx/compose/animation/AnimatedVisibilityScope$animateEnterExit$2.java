package androidx.compose.animation;

import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7380;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "invoke", "(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class AnimatedVisibilityScope$animateEnterExit$2 extends Lambda implements InterfaceC7380 {
    final /* synthetic */ AbstractC1242 $enter;
    final /* synthetic */ AbstractC1240 $exit;
    final /* synthetic */ String $label;
    final /* synthetic */ InterfaceC1257 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityScope$animateEnterExit$2(InterfaceC1257 interfaceC1257, AbstractC1242 abstractC1242, AbstractC1240 abstractC1240, String str) {
        super(3);
        this.this$0 = interfaceC1257;
        this.$enter = abstractC1242;
        this.$exit = abstractC1240;
        this.$label = str;
    }

    public final InterfaceC2962 invoke(InterfaceC2962 interfaceC2962, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2952(1840112047);
        InterfaceC2962 interfaceC2962Mo4426 = interfaceC2962.mo4426(AbstractC1233.m1645(this.this$0.mo1663(), this.$enter, this.$exit, this.$label, c2159, 0, 12));
        c2159.m2937(false);
        return interfaceC2962Mo4426;
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC2962) obj, (InterfaceC2208) obj2, ((Number) obj3).intValue());
    }
}
