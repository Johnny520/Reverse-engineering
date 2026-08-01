package io.modelcontextprotocol.kotlin.sdk.server;

import io.ktor.server.routing.C4155;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p242.AbstractC8144;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcp$3", f = "KtorServer.kt", l = {33}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 1, 0})
final class KtorServerKt$mcp$3 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC8144 $transports;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtorServerKt$mcp$3(AbstractC8144 abstractC8144, InterfaceC4357<? super KtorServerKt$mcp$3> interfaceC4357) {
        super(2, interfaceC4357);
        this.$transports = abstractC8144;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        KtorServerKt$mcp$3 ktorServerKt$mcp$3 = new KtorServerKt$mcp$3(this.$transports, interfaceC4357);
        ktorServerKt$mcp$3.L$0 = obj;
        return ktorServerKt$mcp$3;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4155 c4155, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((KtorServerKt$mcp$3) create(c4155, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C4155 c4155 = (C4155) this.L$0;
            this.label = 1;
            if (AbstractC4292.m8730(c4155, this) == coroutineSingletons) {
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
