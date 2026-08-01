package androidx.compose.foundation.gestures;

import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {412}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;)V"}, k = 3, mv = {2, 1, 0})
final class AnchoredDraggableNode$drag$2 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6553 $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0519 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$drag$2(InterfaceC6553 interfaceC6553, AbstractC0519 abstractC0519, InterfaceC4356<? super AnchoredDraggableNode$drag$2> interfaceC4356) {
        super(3, interfaceC4356);
        this.$forEachDelta = interfaceC6553;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(AbstractC0519 abstractC0519, InterfaceC0523 interfaceC0523, C0480 c0480) {
        long j = c0480.f1446;
        throw null;
    }

    private static final C7328 invokeSuspend$lambda$0$0(AbstractC0519 abstractC0519, InterfaceC0523 interfaceC0523, C7328 c7328) {
        throw null;
    }

    @Override // p052.InterfaceC6550
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            C2941.m6336();
            return null;
        }
        if (obj2 == null) {
            return invoke((InterfaceC0523) null, (InterfaceC0461) null, (InterfaceC4356<? super C5175>) obj3);
        }
        C2941.m6336();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (this.L$0 != null) {
                C2941.m6336();
                return null;
            }
            InterfaceC6553 interfaceC6553 = this.$forEachDelta;
            C0520 c0520 = new C0520(0);
            this.label = 1;
            if (interfaceC6553.invoke(c0520, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }

    public final Object invoke(InterfaceC0523 interfaceC0523, InterfaceC0461 interfaceC0461, InterfaceC4356<? super C5175> interfaceC4356) {
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.$forEachDelta, null, interfaceC4356);
        anchoredDraggableNode$drag$2.L$0 = interfaceC0523;
        return anchoredDraggableNode$drag$2.invokeSuspend(C5175.f14739);
    }
}
