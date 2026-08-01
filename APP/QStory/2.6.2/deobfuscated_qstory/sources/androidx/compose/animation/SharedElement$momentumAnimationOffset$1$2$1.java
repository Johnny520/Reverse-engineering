package androidx.compose.animation;

import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.C0331;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
@InterfaceC6861(c = "androidx.compose.animation.SharedElement$momentumAnimationOffset$1$2$1", f = "SharedElement.kt", l = {119}, m = "invokeSuspend", v = 1)
public final class SharedElement$momentumAnimationOffset$1$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0299 $spring;
    int label;
    final /* synthetic */ AbstractC0442 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedElement$momentumAnimationOffset$1$2$1(AbstractC0442 abstractC0442, C0299 c0299, InterfaceC4356<? super SharedElement$momentumAnimationOffset$1$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = abstractC0442;
        this.$spring = c0299;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new SharedElement$momentumAnimationOffset$1$2$1(this.this$0, this.$spring, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SharedElement$momentumAnimationOffset$1$2$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
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
        this.this$0.getClass();
        C7328 c7328 = new C7328(0L);
        C0299 c0299 = this.$spring;
        this.label = 1;
        C0331.m1028(null, c7328, c0299, null, null, this, 12);
        throw null;
    }
}
