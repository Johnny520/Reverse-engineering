package androidx.compose.ui.platform;

import androidx.compose.runtime.AbstractC1367;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {66}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 1, 0}, xi = 48)
final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends SuspendLambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC6558 $onFrame;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(InterfaceC6558 interfaceC6558, InterfaceC4357<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2> interfaceC4357) {
        super(1, interfaceC4357);
        this.$onFrame = interfaceC6558;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.$onFrame, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<Object> interfaceC4357) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return obj;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        InterfaceC6558 interfaceC6558 = this.$onFrame;
        this.label = 1;
        Object objMo2305 = AbstractC1367.m2492(getContext()).mo2305(interfaceC6558, this);
        return objMo2305 == coroutineSingletons ? coroutineSingletons : objMo2305;
    }
}
