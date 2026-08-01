package io.modelcontextprotocol.kotlin.sdk.server;

import io.ktor.server.sse.InterfaceC4172;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p242.AbstractC8144;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcp$2", f = "KtorServer.kt", l = {29}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/sse/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/sse/飘花落叶言子楪世哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class KtorServerKt$mcp$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6543 $block;
    final /* synthetic */ AbstractC8144 $transports;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtorServerKt$mcp$2(AbstractC8144 abstractC8144, InterfaceC6543 interfaceC6543, InterfaceC4357<? super KtorServerKt$mcp$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$transports = abstractC8144;
        this.$block = interfaceC6543;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        KtorServerKt$mcp$2 ktorServerKt$mcp$2 = new KtorServerKt$mcp$2(this.$transports, this.$block, interfaceC4357);
        ktorServerKt$mcp$2.L$0 = obj;
        return ktorServerKt$mcp$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC4172 interfaceC4172, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((KtorServerKt$mcp$2) create(interfaceC4172, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        InterfaceC4172 interfaceC4172 = (InterfaceC4172) this.L$0;
        this.label = 1;
        AbstractC4292.m8731(interfaceC4172, "", this);
        return c5176 == coroutineSingletons ? coroutineSingletons : c5176;
    }
}
