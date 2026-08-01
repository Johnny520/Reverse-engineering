package io.ktor.client.plugins.api;

import io.ktor.client.call.C3868;
import io.ktor.client.statement.C3945;
import io.ktor.http.content.C3992;
import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lin.xposed.hook.javaplugin.C5554;
import p052.InterfaceC6545;
import p052.InterfaceC6551;
import p059.C6857;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.api.TransformResponseBodyHook$install$1", f = "KtorCallContexts.kt", l = {104, 111}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class TransformResponseBodyHook$install$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6545 $handler;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformResponseBodyHook$install$1(InterfaceC6545 interfaceC6545, InterfaceC4357<? super TransformResponseBodyHook$install$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$handler = interfaceC6545;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, C3945 c3945, InterfaceC4357<? super C5176> interfaceC4357) {
        TransformResponseBodyHook$install$1 transformResponseBodyHook$install$1 = new TransformResponseBodyHook$install$1(this.$handler, interfaceC4357);
        transformResponseBodyHook$install$1.L$0 = abstractC4194;
        return transformResponseBodyHook$install$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
            C3945 c3945 = (C3945) abstractC4194.mo8567();
            C6857 c6857 = c3945.f12158;
            if (c3945.f12157 instanceof InterfaceC4252) {
                ((C3868) abstractC4194.f12664).m8250();
                throw null;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    AbstractC5185.m10210(obj);
                    return c5176;
                }
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C6857 c68572 = (C6857) this.L$1;
            AbstractC4194 abstractC41942 = (AbstractC4194) this.L$0;
            AbstractC5185.m10210(obj);
            if (obj != null) {
                if (!(obj instanceof C3992) && !c68572.f18298.isInstance(obj)) {
                    C5554.m10887("transformResponseBody returned ", obj, " but expected value of type ", c68572);
                    return null;
                }
                C3945 c39452 = new C3945(c68572, obj);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (abstractC41942.mo8570(c39452, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return c5176;
    }
}
