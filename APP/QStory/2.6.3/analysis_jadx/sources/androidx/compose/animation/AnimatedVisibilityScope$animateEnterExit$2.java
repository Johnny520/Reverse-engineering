package androidx.compose.animation;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6551;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "invoke", "(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class AnimatedVisibilityScope$animateEnterExit$2 extends Lambda implements InterfaceC6551 {
    final /* synthetic */ AbstractC0396 $enter;
    final /* synthetic */ AbstractC0394 $exit;
    final /* synthetic */ String $label;
    final /* synthetic */ InterfaceC0411 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityScope$animateEnterExit$2(InterfaceC0411 interfaceC0411, AbstractC0396 abstractC0396, AbstractC0394 abstractC0394, String str) {
        super(3);
        this.this$0 = interfaceC0411;
        this.$enter = abstractC0396;
        this.$exit = abstractC0394;
        this.$label = str;
    }

    public final InterfaceC2129 invoke(InterfaceC2129 interfaceC2129, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2392(1840112047);
        InterfaceC2129 interfaceC2129Mo3866 = interfaceC2129.mo3866(AbstractC0387.m1085(this.this$0.mo1103(), this.$enter, this.$exit, this.$label, c1324, 0, 12));
        c1324.m2377(false);
        return interfaceC2129Mo3866;
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC2129) obj, (InterfaceC1373) obj2, ((Number) obj3).intValue());
    }
}
