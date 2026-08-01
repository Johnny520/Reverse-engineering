package io.modelcontextprotocol.kotlin.sdk.server;

import io.modelcontextprotocol.kotlin.sdk.shared.AbstractC5143;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.InterfaceC6044;
import p068.InterfaceC7383;
import p072.InterfaceC7490;
import p079.InterfaceC7691;
import p104.AbstractC7988;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.server.StdioServerTransport$start$4", m556f = "StdioServerTransport.kt", m557l = {82}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class StdioServerTransport$start$4 extends SuspendLambda implements InterfaceC7383 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC5129 this$0;

    public StdioServerTransport$start$4(AbstractC5129 abstractC5129, InterfaceC5189<? super StdioServerTransport$start$4> interfaceC5189) {
        super(2, interfaceC5189);
    }

    private static final Object invokeSuspend$lambda$0() {
        return "Error writing to stdout";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new StdioServerTransport$start$4(null, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((StdioServerTransport$start$4) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC6044 interfaceC6044 = (InterfaceC6044) this.L$0;
        AbstractC6017.m10769(obj);
        if (!((Boolean) obj).booleanValue()) {
            return C6008.f15084;
        }
        InterfaceC7490 interfaceC7490 = (InterfaceC7490) ((C6023) interfaceC6044).m10821();
        interfaceC7490.getClass();
        AbstractC7988 abstractC7988M9302 = AbstractC5143.m9302();
        abstractC7988M9302.getClass();
        abstractC7988M9302.m12983(InterfaceC7490.Companion.serializer(), interfaceC7490).concat("\n");
        throw null;
    }
}
