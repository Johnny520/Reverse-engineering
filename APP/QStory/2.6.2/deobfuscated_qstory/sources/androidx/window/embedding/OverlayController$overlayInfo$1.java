package androidx.window.embedding;

import androidx.core.util.InterfaceC2188;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC5195;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.window.embedding.OverlayController$overlayInfo$1", f = "OverlayController.kt", l = {136}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroidx/window/embedding/飘花落叶言子楪世兰哲苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class OverlayController$overlayInfo$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ String $overlayTag;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC2572 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayController$overlayInfo$1(AbstractC2572 abstractC2572, String str, InterfaceC4356<? super OverlayController$overlayInfo$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$overlayTag = str;
    }

    private static final C5175 invokeSuspend$lambda$1(AbstractC2572 abstractC2572, InterfaceC2188 interfaceC2188) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        OverlayController$overlayInfo$1 overlayController$overlayInfo$1 = new OverlayController$overlayInfo$1(null, this.$overlayTag, interfaceC4356);
        overlayController$overlayInfo$1.L$0 = obj;
        return overlayController$overlayInfo$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5195 interfaceC5195, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((OverlayController$overlayInfo$1) create(interfaceC5195, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC5184.m10206(obj);
            return C5175.f14739;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
