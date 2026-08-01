package io.modelcontextprotocol.kotlin.sdk.server;

import io.ktor.server.sse.InterfaceC4171;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p242.AbstractC8143;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcp$2", f = "KtorServer.kt", l = {29}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/sse/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/sse/飘花落叶言子楪世哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class KtorServerKt$mcp$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6542 $block;
    final /* synthetic */ AbstractC8143 $transports;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtorServerKt$mcp$2(AbstractC8143 abstractC8143, InterfaceC6542 interfaceC6542, InterfaceC4356<? super KtorServerKt$mcp$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$transports = abstractC8143;
        this.$block = interfaceC6542;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        KtorServerKt$mcp$2 ktorServerKt$mcp$2 = new KtorServerKt$mcp$2(this.$transports, this.$block, interfaceC4356);
        ktorServerKt$mcp$2.L$0 = obj;
        return ktorServerKt$mcp$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC4171 interfaceC4171, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((KtorServerKt$mcp$2) create(interfaceC4171, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC4171 interfaceC4171 = (InterfaceC4171) this.L$0;
        this.label = 1;
        AbstractC4291.m8741(interfaceC4171, "", this);
        return c5175 == coroutineSingletons ? coroutineSingletons : c5175;
    }
}
