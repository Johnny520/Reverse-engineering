package io.ktor.client.plugins;

import io.ktor.http.content.AbstractC3986;
import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.AfterRenderHook$install$1", f = "BodyProgress.kt", l = {63, 64}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class AfterRenderHook$install$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6550 $handler;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterRenderHook$install$1(InterfaceC6550 interfaceC6550, InterfaceC4356<? super AfterRenderHook$install$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$handler = interfaceC6550;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        AfterRenderHook$install$1 afterRenderHook$install$1 = new AfterRenderHook$install$1(this.$handler, interfaceC4356);
        afterRenderHook$install$1.L$0 = abstractC4193;
        afterRenderHook$install$1.L$1 = obj;
        return afterRenderHook$install$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC4193 abstractC4193;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            abstractC4193 = (AbstractC4193) this.L$0;
            Object obj2 = this.L$1;
            if (obj2 instanceof AbstractC3986) {
                InterfaceC6550 interfaceC6550 = this.$handler;
                Object obj3 = abstractC4193.f12660;
                this.L$0 = abstractC4193;
                this.label = 1;
                obj = interfaceC6550.invoke(obj3, obj2, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return c5175;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        abstractC4193 = (AbstractC4193) this.L$0;
        AbstractC5184.m10206(obj);
        AbstractC3986 abstractC3986 = (AbstractC3986) obj;
        if (abstractC3986 != null) {
            this.L$0 = null;
            this.label = 2;
            if (abstractC4193.mo8580(abstractC3986, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c5175;
    }
}
