package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1367;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {32}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 1, 0}, xi = 48)
final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends SuspendLambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC6557 $onFrame;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(InterfaceC6557 interfaceC6557, InterfaceC4356<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2> interfaceC4356) {
        super(1, interfaceC4356);
        this.$onFrame = interfaceC6557;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.$onFrame, interfaceC4356);
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(InterfaceC4356<Object> interfaceC4356) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        InterfaceC6557 interfaceC6557 = this.$onFrame;
        this.label = 1;
        Object objMo2295 = AbstractC1367.m2482(getContext()).mo2295(interfaceC6557, this);
        return objMo2295 == coroutineSingletons ? coroutineSingletons : objMo2295;
    }
}
