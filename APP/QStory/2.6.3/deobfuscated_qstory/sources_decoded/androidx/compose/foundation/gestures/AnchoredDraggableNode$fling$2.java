package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", l = {473}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;)V"}, k = 3, mv = {2, 1, 0})
final class AnchoredDraggableNode$fling$2 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ Ref$FloatRef $leftoverVelocity;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0519 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$2(AbstractC0519 abstractC0519, Ref$FloatRef ref$FloatRef, float f, InterfaceC4357<? super AnchoredDraggableNode$fling$2> interfaceC4357) {
        super(3, interfaceC4357);
        this.$leftoverVelocity = ref$FloatRef;
        this.$velocity = f;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            C2942.m6394();
            return null;
        }
        if (obj2 == null) {
            return invoke((InterfaceC0523) null, (InterfaceC0461) null, (InterfaceC4357<? super C5176>) obj3);
        }
        C2942.m6394();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw AbstractC0053.m159(this.L$0);
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.L$0;
        AbstractC5185.m10210(obj);
        ref$FloatRef.element = ((Number) obj).floatValue();
        return C5176.f14739;
    }

    public final Object invoke(InterfaceC0523 interfaceC0523, InterfaceC0461 interfaceC0461, InterfaceC4357<? super C5176> interfaceC4357) {
        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(null, this.$leftoverVelocity, this.$velocity, interfaceC4357);
        anchoredDraggableNode$fling$2.L$0 = interfaceC0523;
        return anchoredDraggableNode$fling$2.invokeSuspend(C5176.f14739);
    }
}
