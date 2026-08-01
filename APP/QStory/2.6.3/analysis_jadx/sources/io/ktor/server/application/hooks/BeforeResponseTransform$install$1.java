package io.ktor.server.application.hooks;

import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.application.hooks.BeforeResponseTransform$install$1", f = "CommonHooks.kt", l = {154}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class BeforeResponseTransform$install$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6551 $handler;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AbstractC4052 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeforeResponseTransform$install$1(AbstractC4052 abstractC4052, InterfaceC6551 interfaceC6551, InterfaceC4357<? super BeforeResponseTransform$install$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$handler = interfaceC6551;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        BeforeResponseTransform$install$1 beforeResponseTransform$install$1 = new BeforeResponseTransform$install$1(null, this.$handler, interfaceC4357);
        beforeResponseTransform$install$1.L$0 = abstractC4194;
        beforeResponseTransform$install$1.L$1 = obj;
        return beforeResponseTransform$install$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
        AbstractC5185.m10210(obj);
        abstractC4194.mo8571(obj);
        return C5176.f14739;
    }
}
