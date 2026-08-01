package androidx.compose.foundation.gestures;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.C5189;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", f = "MouseWheelScrollingLogic.kt", l = {201}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Landroidx/compose/foundation/gestures/飘花落叶言子苏哲楪兰世;"}, k = 3, mv = {2, 1, 0})
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 extends SuspendLambda implements InterfaceC6553 {
    int label;
    final /* synthetic */ C0554 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(C0554 c0554, InterfaceC4356<? super MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C0559> interfaceC4356) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return obj;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C5189 c5189 = this.this$0.f1594;
        this.label = 1;
        Object objM10503 = AbstractC5398.m10503(new NonTouchScrollingLogicKt$busyReceive$2(c5189, null), this);
        return objM10503 == coroutineSingletons ? coroutineSingletons : objM10503;
    }
}
