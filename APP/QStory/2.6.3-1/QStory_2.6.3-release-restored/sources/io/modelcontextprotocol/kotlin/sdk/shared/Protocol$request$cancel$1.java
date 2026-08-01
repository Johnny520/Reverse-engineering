package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.InterfaceC6273;
import p068.InterfaceC7383;
import p072.C7489;
import p072.C7533;
import p072.InterfaceC7665;
import p079.InterfaceC7691;
import p104.AbstractC7988;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$request$cancel$1", m556f = "Protocol.kt", m557l = {385}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"", "reason", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class Protocol$request$cancel$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7665 $messageId;
    final /* synthetic */ InterfaceC6273 $result;
    final /* synthetic */ InterfaceC5141 $transport;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC5139 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$request$cancel$1(AbstractC5139 abstractC5139, InterfaceC7665 interfaceC7665, InterfaceC5141 interfaceC5141, InterfaceC6273 interfaceC6273, InterfaceC5189<? super Protocol$request$cancel$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC5139;
        this.$messageId = interfaceC7665;
        this.$transport = interfaceC5141;
        this.$result = interfaceC6273;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        Protocol$request$cancel$1 protocol$request$cancel$1 = new Protocol$request$cancel$1(this.this$0, this.$messageId, this.$transport, this.$result, interfaceC5189);
        protocol$request$cancel$1.L$0 = obj;
        return protocol$request$cancel$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Throwable th, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((Protocol$request$cancel$1) create(th, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            Throwable th2 = (Throwable) this.L$0;
            this.this$0.f13224.remove(this.$messageId);
            this.this$0.f13223.remove(this.$messageId);
            InterfaceC7665 interfaceC7665 = this.$messageId;
            String message = th2.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            C7533 c7533 = new C7533(interfaceC7665, message);
            String value = c7533.f18461.getValue();
            AbstractC7988 abstractC7988M9302 = AbstractC5143.m9302();
            abstractC7988M9302.getClass();
            C7489 c7489 = new C7489(value, abstractC7988M9302.m12984(C7533.Companion.serializer(), c7533));
            InterfaceC5141 interfaceC5141 = this.$transport;
            this.L$0 = th2;
            this.label = 1;
            if (((AbstractC5142) interfaceC5141).m9301(c7489, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            th = th2;
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            th = (Throwable) this.L$0;
            AbstractC6017.m10769(obj);
        }
        ((C6270) this.$result).m11088(th);
        return C6008.f15084;
    }
}
