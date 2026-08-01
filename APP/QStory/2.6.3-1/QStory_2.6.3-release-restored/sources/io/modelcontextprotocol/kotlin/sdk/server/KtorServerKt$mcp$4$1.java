package io.modelcontextprotocol.kotlin.sdk.server;

import io.ktor.server.sse.InterfaceC5004;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p258.AbstractC8973;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.server.KtorServerKt$mcp$4$1", m556f = "KtorServer.kt", m557l = {51}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/server/sse/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/sse/飘花落叶言子楪世哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class KtorServerKt$mcp$4$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7372 $block;
    final /* synthetic */ AbstractC8973 $transports;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtorServerKt$mcp$4$1(AbstractC8973 abstractC8973, InterfaceC7372 interfaceC7372, InterfaceC5189<? super KtorServerKt$mcp$4$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$transports = abstractC8973;
        this.$block = interfaceC7372;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        KtorServerKt$mcp$4$1 ktorServerKt$mcp$4$1 = new KtorServerKt$mcp$4$1(this.$transports, this.$block, interfaceC5189);
        ktorServerKt$mcp$4$1.L$0 = obj;
        return ktorServerKt$mcp$4$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC5004 interfaceC5004, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((KtorServerKt$mcp$4$1) create(interfaceC5004, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC5004 interfaceC5004 = (InterfaceC5004) this.L$0;
        this.label = 1;
        AbstractC5124.m9290(interfaceC5004, "/message", this);
        return c6008 == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
