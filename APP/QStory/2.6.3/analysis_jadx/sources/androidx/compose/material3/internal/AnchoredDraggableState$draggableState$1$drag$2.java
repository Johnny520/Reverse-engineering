package androidx.compose.material3.internal;

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
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {277}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/material3/internal/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/material3/internal/飘花落叶言子楪哲世兰苏;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/material3/internal/飘花落叶言子楪世苏哲兰;Landroidx/compose/material3/internal/飘花落叶言子楪哲世兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class AnchoredDraggableState$draggableState$1$drag$2 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6554 $block;
    int label;
    final /* synthetic */ AbstractC1118 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$draggableState$1$drag$2(AbstractC1118 abstractC1118, InterfaceC6554 interfaceC6554, InterfaceC4357<? super AnchoredDraggableState$draggableState$1$drag$2> interfaceC4357) {
        super(3, interfaceC4357);
        this.$block = interfaceC6554;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            C2942.m6394();
            return null;
        }
        if (obj2 == null) {
            return invoke((InterfaceC1122) null, (InterfaceC1125) null, (InterfaceC4357<? super C5176>) obj3);
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
            throw null;
        }
        if (i == 1) {
            AbstractC5185.m10210(obj);
            return C5176.f14739;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final Object invoke(InterfaceC1122 interfaceC1122, InterfaceC1125 interfaceC1125, InterfaceC4357<? super C5176> interfaceC4357) {
        return new AnchoredDraggableState$draggableState$1$drag$2(null, this.$block, interfaceC4357).invokeSuspend(C5176.f14739);
    }
}
