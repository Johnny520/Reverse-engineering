package io.modelcontextprotocol.kotlin.sdk.client;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.io.InterfaceC5484;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.client.StdioClientTransport$start$3", f = "StdioClientTransport.kt", l = {88, 89}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class StdioClientTransport$start$3 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5484 $outputStream;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC4284 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StdioClientTransport$start$3(AbstractC4284 abstractC4284, InterfaceC5484 interfaceC5484, InterfaceC4357<? super StdioClientTransport$start$3> interfaceC4357) {
        super(2, interfaceC4357);
        this.$outputStream = interfaceC5484;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        StdioClientTransport$start$3 stdioClientTransport$start$3 = new StdioClientTransport$start$3(null, this.$outputStream, interfaceC4357);
        stdioClientTransport$start$3.L$0 = obj;
        return stdioClientTransport$start$3;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((StdioClientTransport$start$3) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5452 interfaceC5452;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
            C5417 c5417M10477 = AbstractC5399.m10477(interfaceC5401, null, null, new StdioClientTransport$start$3$readJob$1(null, null), 3);
            C5417 c5417M104772 = AbstractC5399.m10477(interfaceC5401, null, null, new StdioClientTransport$start$3$writeJob$1(null, this.$outputStream, null), 3);
            this.L$0 = c5417M104772;
            this.label = 1;
            if (c5417M10477.mo10564(this) != coroutineSingletons) {
                interfaceC5452 = c5417M104772;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            throw null;
        }
        interfaceC5452 = (InterfaceC5452) this.L$0;
        AbstractC5185.m10210(obj);
        this.L$0 = null;
        this.label = 2;
        if (AbstractC5399.m10506(interfaceC5452, this) != coroutineSingletons) {
            throw null;
        }
        return coroutineSingletons;
    }
}
