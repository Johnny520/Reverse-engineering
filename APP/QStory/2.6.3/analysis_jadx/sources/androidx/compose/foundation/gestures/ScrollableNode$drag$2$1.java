package androidx.compose.foundation.gestures;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {370}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, k = 3, mv = {2, 1, 0})
final class ScrollableNode$drag$2$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $forEachDelta;
    final /* synthetic */ C0502 $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$drag$2$1(InterfaceC6554 interfaceC6554, C0502 c0502, InterfaceC4357<? super ScrollableNode$drag$2$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$forEachDelta = interfaceC6554;
        this.$this_with = c0502;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(InterfaceC0557 interfaceC0557, C0502 c0502, C0480 c0480) {
        float f = c0480.f1446 ? -1.0f : 1.0f;
        long j = c0480.f1447;
        ((C0515) interfaceC0557).m1289(1, C7329.m12532(f, c0502.f1489 == Orientation.Horizontal ? C7329.m12530(j, 0.0f, 1) : C7329.m12530(j, 0.0f, 2)));
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.$forEachDelta, this.$this_with, interfaceC4357);
        scrollableNode$drag$2$1.L$0 = obj;
        return scrollableNode$drag$2$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC0557 interfaceC0557, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ScrollableNode$drag$2$1) create(interfaceC0557, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC0557 interfaceC0557 = (InterfaceC0557) this.L$0;
            InterfaceC6554 interfaceC6554 = this.$forEachDelta;
            C0516 c0516 = new C0516(interfaceC0557, 0, this.$this_with);
            this.label = 1;
            if (interfaceC6554.invoke(c0516, this) == coroutineSingletons) {
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
}
