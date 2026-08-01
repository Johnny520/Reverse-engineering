package io.modelcontextprotocol.kotlin.sdk.server;

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
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.server.StdioServerTransport$start$3", f = "StdioServerTransport.kt", l = {70, 72}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class StdioServerTransport$start$3 extends SuspendLambda implements InterfaceC6554 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4297 this$0;

    public StdioServerTransport$start$3(AbstractC4297 abstractC4297, InterfaceC4357<? super StdioServerTransport$start$3> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new StdioServerTransport$start$3(null, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((StdioServerTransport$start$3) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i == 1) {
            InterfaceC5212 interfaceC5212 = (InterfaceC5212) this.L$0;
            AbstractC5185.m10210(obj);
            obj2 = interfaceC5212;
        } else {
            if (i != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC5212 interfaceC52122 = (InterfaceC5212) this.L$0;
            AbstractC5185.m10210(obj);
            this.L$0 = interfaceC52122;
            this.label = 1;
            C5191 c5191 = (C5191) interfaceC52122;
            obj = c5191.m10264(this);
            obj2 = c5191;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            return C5176.f14739;
        }
        throw null;
    }
}
