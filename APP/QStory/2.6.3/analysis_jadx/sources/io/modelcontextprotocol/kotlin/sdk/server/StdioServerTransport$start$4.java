package io.modelcontextprotocol.kotlin.sdk.server;

import io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4311;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.C5191;
import kotlinx.coroutines.channels.InterfaceC5212;
import p052.InterfaceC6554;
import p056.InterfaceC6661;
import p063.InterfaceC6862;
import p088.AbstractC7159;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.server.StdioServerTransport$start$4", f = "StdioServerTransport.kt", l = {82}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class StdioServerTransport$start$4 extends SuspendLambda implements InterfaceC6554 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4297 this$0;

    public StdioServerTransport$start$4(AbstractC4297 abstractC4297, InterfaceC4357<? super StdioServerTransport$start$4> interfaceC4357) {
        super(2, interfaceC4357);
    }

    private static final Object invokeSuspend$lambda$0() {
        return "Error writing to stdout";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new StdioServerTransport$start$4(null, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((StdioServerTransport$start$4) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
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
        InterfaceC5212 interfaceC5212 = (InterfaceC5212) this.L$0;
        AbstractC5185.m10210(obj);
        if (!((Boolean) obj).booleanValue()) {
            return C5176.f14739;
        }
        InterfaceC6661 interfaceC6661 = (InterfaceC6661) ((C5191) interfaceC5212).m10262();
        interfaceC6661.getClass();
        AbstractC7159 abstractC7159M8743 = AbstractC4311.m8743();
        abstractC7159M8743.getClass();
        abstractC7159M8743.m12424(InterfaceC6661.Companion.serializer(), interfaceC6661).concat("\n");
        throw null;
    }
}
