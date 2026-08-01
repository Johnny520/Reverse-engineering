package io.modelcontextprotocol.kotlin.sdk.client;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.p010io.InterfaceC6316;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.client.StdioClientTransport$start$3", m556f = "StdioClientTransport.kt", m557l = {88, 89}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class StdioClientTransport$start$3 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6316 $outputStream;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC5116 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StdioClientTransport$start$3(AbstractC5116 abstractC5116, InterfaceC6316 interfaceC6316, InterfaceC5189<? super StdioClientTransport$start$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.$outputStream = interfaceC6316;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        StdioClientTransport$start$3 stdioClientTransport$start$3 = new StdioClientTransport$start$3(null, this.$outputStream, interfaceC5189);
        stdioClientTransport$start$3.L$0 = obj;
        return stdioClientTransport$start$3;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((StdioClientTransport$start$3) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6284 interfaceC6284;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            C6249 c6249M11036 = AbstractC6231.m11036(interfaceC6233, null, null, new StdioClientTransport$start$3$readJob$1(null, null), 3);
            C6249 c6249M110362 = AbstractC6231.m11036(interfaceC6233, null, null, new StdioClientTransport$start$3$writeJob$1(null, this.$outputStream, null), 3);
            this.L$0 = c6249M110362;
            this.label = 1;
            if (c6249M11036.mo11123(this) != coroutineSingletons) {
                interfaceC6284 = c6249M110362;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            throw null;
        }
        interfaceC6284 = (InterfaceC6284) this.L$0;
        AbstractC6017.m10769(obj);
        this.L$0 = null;
        this.label = 2;
        if (AbstractC6231.m11065(interfaceC6284, this) != coroutineSingletons) {
            throw null;
        }
        return coroutineSingletons;
    }
}
