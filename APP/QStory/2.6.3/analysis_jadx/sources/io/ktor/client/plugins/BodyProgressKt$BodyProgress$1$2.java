package io.ktor.client.plugins;

import androidx.activity.AbstractC0053;
import io.ktor.client.statement.AbstractC3946;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2", f = "BodyProgress.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "<anonymous>", "(Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;"}, k = 3, mv = {2, 0, 0})
final class BodyProgressKt$BodyProgress$1$2 extends SuspendLambda implements InterfaceC6554 {
    /* synthetic */ Object L$0;
    int label;

    public BodyProgressKt$BodyProgress$1$2(InterfaceC4357<? super BodyProgressKt$BodyProgress$1$2> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        BodyProgressKt$BodyProgress$1$2 bodyProgressKt$BodyProgress$1$2 = new BodyProgressKt$BodyProgress$1$2(interfaceC4357);
        bodyProgressKt$BodyProgress$1$2.L$0 = obj;
        return bodyProgressKt$BodyProgress$1$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC3946 abstractC3946, InterfaceC4357<? super AbstractC3946> interfaceC4357) {
        return ((BodyProgressKt$BodyProgress$1$2) create(abstractC3946, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5185.m10210(obj);
        throw AbstractC0053.m159(this.L$0);
    }
}
