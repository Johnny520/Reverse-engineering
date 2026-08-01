package io.modelcontextprotocol.kotlin.sdk.shared;

import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p072.C7489;
import p072.C7503;
import p072.C7507;
import p072.C7508;
import p072.InterfaceC7490;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$connect$4", m556f = "Protocol.kt", m557l = {166, 167}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世楪兰苏;", "message", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世楪兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class Protocol$connect$4 extends SuspendLambda implements InterfaceC7383 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC5139 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$connect$4(AbstractC5139 abstractC5139, InterfaceC5189<? super Protocol$connect$4> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC5139;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        Protocol$connect$4 protocol$connect$4 = new Protocol$connect$4(this.this$0, interfaceC5189);
        protocol$connect$4.L$0 = obj;
        return protocol$connect$4;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC7490 interfaceC7490, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((Protocol$connect$4) create(interfaceC7490, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (io.modelcontextprotocol.kotlin.sdk.shared.AbstractC5139.m9294(r5.this$0, (p072.C7507) r6, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (io.modelcontextprotocol.kotlin.sdk.shared.AbstractC5139.m9295(r5.this$0, (p072.C7489) r6, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC7490 interfaceC7490 = (InterfaceC7490) this.L$0;
            if (interfaceC7490 instanceof C7508) {
                AbstractC5139.m9293(this.this$0, (C7508) interfaceC7490, null);
            } else if (interfaceC7490 instanceof C7507) {
                this.label = 1;
            } else if (interfaceC7490 instanceof C7489) {
                this.label = 2;
            } else {
                if (!(interfaceC7490 instanceof C7503)) {
                    C5043.m9170();
                    return null;
                }
                AbstractC5139.m9293(this.this$0, null, (C7503) interfaceC7490);
            }
        } else {
            if (i != 1 && i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
