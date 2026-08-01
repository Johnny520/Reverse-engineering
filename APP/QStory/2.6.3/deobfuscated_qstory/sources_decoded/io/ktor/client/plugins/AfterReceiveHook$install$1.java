package io.ktor.client.plugins;

import androidx.activity.AbstractC0053;
import io.ktor.client.statement.AbstractC3946;
import io.ktor.util.pipeline.AbstractC4194;
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
@InterfaceC6862(c = "io.ktor.client.plugins.AfterReceiveHook$install$1", f = "BodyProgress.kt", l = {48, 49}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)V"}, k = 3, mv = {2, 0, 0})
final class AfterReceiveHook$install$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6554 $handler;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterReceiveHook$install$1(InterfaceC6554 interfaceC6554, InterfaceC4357<? super AfterReceiveHook$install$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$handler = interfaceC6554;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, AbstractC3946 abstractC3946, InterfaceC4357<? super C5176> interfaceC4357) {
        AfterReceiveHook$install$1 afterReceiveHook$install$1 = new AfterReceiveHook$install$1(this.$handler, interfaceC4357);
        afterReceiveHook$install$1.L$0 = abstractC4194;
        afterReceiveHook$install$1.L$1 = abstractC3946;
        return afterReceiveHook$install$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
            AbstractC0053.m137(this.L$1);
            InterfaceC6554 interfaceC6554 = this.$handler;
            this.L$0 = abstractC4194;
            this.label = 1;
            obj = interfaceC6554.invoke(null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    AbstractC5185.m10210(obj);
                    return C5176.f14739;
                }
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        AbstractC0053.m137(obj);
        return C5176.f14739;
    }
}
