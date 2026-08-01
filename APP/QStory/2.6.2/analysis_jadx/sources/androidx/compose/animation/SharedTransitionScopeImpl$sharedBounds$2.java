package androidx.compose.animation;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;
import p052.InterfaceC6550;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "invoke", "(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class SharedTransitionScopeImpl$sharedBounds$2 extends Lambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC0411 $animatedVisibilityScope;
    final /* synthetic */ AbstractC0396 $enter;
    final /* synthetic */ AbstractC0394 $exit;
    final /* synthetic */ InterfaceC0444 $resizeMode;
    final /* synthetic */ AbstractC0428 $sharedContentState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$sharedBounds$2(InterfaceC0411 interfaceC0411, AbstractC0396 abstractC0396, AbstractC0394 abstractC0394, AbstractC0428 abstractC0428, InterfaceC0444 interfaceC0444) {
        super(3);
        this.$animatedVisibilityScope = interfaceC0411;
        this.$enter = abstractC0396;
        this.$exit = abstractC0394;
    }

    public final InterfaceC2129 invoke(InterfaceC2129 interfaceC2129, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2382(-233734437);
        this.$animatedVisibilityScope.mo1102();
        final AbstractC0428 abstractC0428 = null;
        boolean zM2368 = c1324.m2368(null);
        Object objM2335 = c1324.m2335();
        if (zM2368 || objM2335 == C1369.f3973) {
            objM2335 = new InterfaceC6542(abstractC0428) { // from class: androidx.compose.animation.SharedTransitionScopeImpl$sharedBounds$2$1$1
                final /* synthetic */ AbstractC0428 $sharedContentState;

                {
                    super(0);
                }

                @Override // p052.InterfaceC6542
                public final Boolean invoke() {
                    throw null;
                }
            };
            c1324.m2376(objM2335);
        }
        throw null;
    }

    @Override // p052.InterfaceC6550
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC2129) obj, (InterfaceC1373) obj2, ((Number) obj3).intValue());
    }
}
