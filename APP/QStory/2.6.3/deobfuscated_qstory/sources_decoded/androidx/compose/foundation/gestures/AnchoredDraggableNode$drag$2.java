package androidx.compose.foundation.gestures;

import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {412}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;)V"}, k = 3, mv = {2, 1, 0})
final class AnchoredDraggableNode$drag$2 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6554 $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0519 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$drag$2(InterfaceC6554 interfaceC6554, AbstractC0519 abstractC0519, InterfaceC4357<? super AnchoredDraggableNode$drag$2> interfaceC4357) {
        super(3, interfaceC4357);
        this.$forEachDelta = interfaceC6554;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(AbstractC0519 abstractC0519, InterfaceC0523 interfaceC0523, C0480 c0480) {
        long j = c0480.f1447;
        throw null;
    }

    private static final C7329 invokeSuspend$lambda$0$0(AbstractC0519 abstractC0519, InterfaceC0523 interfaceC0523, C7329 c7329) {
        throw null;
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
            if (this.L$0 != null) {
                C2942.m6394();
                return null;
            }
            InterfaceC6554 interfaceC6554 = this.$forEachDelta;
            C0520 c0520 = new C0520(0);
            this.label = 1;
            if (interfaceC6554.invoke(c0520, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }

    public final Object invoke(InterfaceC0523 interfaceC0523, InterfaceC0461 interfaceC0461, InterfaceC4357<? super C5176> interfaceC4357) {
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.$forEachDelta, null, interfaceC4357);
        anchoredDraggableNode$drag$2.L$0 = interfaceC0523;
        return anchoredDraggableNode$drag$2.invokeSuspend(C5176.f14739);
    }
}
