package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0053;
import androidx.compose.animation.core.InterfaceC0349;
import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", l = {1378}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;", "anchors", "latestTarget", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class AnchoredDraggableKt$animateTo$4 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC0349 $animationSpec;
    final /* synthetic */ AbstractC0537 $this_animateTo;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$4(AbstractC0537 abstractC0537, InterfaceC0349 interfaceC0349, InterfaceC4356<? super AnchoredDraggableKt$animateTo$4> interfaceC4356) {
        super(4, interfaceC4356);
        this.$animationSpec = interfaceC0349;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj != null) {
            C2941.m6336();
            return null;
        }
        if (obj2 == null) {
            return invoke((InterfaceC0523) null, (InterfaceC0461) null, obj3, (InterfaceC4356<? super C5175>) obj4);
        }
        C2941.m6336();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return C5175.f14739;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        if (this.L$0 == null) {
            throw AbstractC0053.m158(this.L$1);
        }
        C2941.m6336();
        return null;
    }

    public final Object invoke(InterfaceC0523 interfaceC0523, InterfaceC0461 interfaceC0461, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        AnchoredDraggableKt$animateTo$4 anchoredDraggableKt$animateTo$4 = new AnchoredDraggableKt$animateTo$4(null, this.$animationSpec, interfaceC4356);
        anchoredDraggableKt$animateTo$4.L$0 = interfaceC0523;
        anchoredDraggableKt$animateTo$4.L$1 = interfaceC0461;
        anchoredDraggableKt$animateTo$4.L$2 = obj;
        return anchoredDraggableKt$animateTo$4.invokeSuspend(C5175.f14739);
    }
}
