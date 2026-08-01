package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C6270;
import p068.InterfaceC7383;
import p072.InterfaceC7490;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.shared.AbstractTransport$_onMessage$1", m556f = "Transport.kt", m557l = {65, 66}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世楪兰苏;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世楪兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class AbstractTransport$_onMessage$1 extends SuspendLambda implements InterfaceC7383 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC5138 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTransport$_onMessage$1(AbstractC5138 abstractC5138, InterfaceC5189<? super AbstractTransport$_onMessage$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC5138;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        AbstractTransport$_onMessage$1 abstractTransport$_onMessage$1 = new AbstractTransport$_onMessage$1(this.this$0, interfaceC5189);
        abstractTransport$_onMessage$1.L$0 = obj;
        return abstractTransport$_onMessage$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC7490 interfaceC7490, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AbstractTransport$_onMessage$1) create(interfaceC7490, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r6.invoke(r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC7490 interfaceC7490;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC7490 = (InterfaceC7490) this.L$0;
            C6270 c6270 = this.this$0.f13220;
            this.L$0 = interfaceC7490;
            this.label = 1;
            if (c6270.m11132(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC7490 = (InterfaceC7490) this.L$0;
        AbstractC6017.m10769(obj);
        InterfaceC7383 interfaceC7383 = this.this$0.f13219;
        this.L$0 = null;
        this.label = 2;
    }
}
