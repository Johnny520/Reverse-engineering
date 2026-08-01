package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p072.C7507;
import p072.InterfaceC7665;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$request$5", m556f = "Protocol.kt", m557l = {395}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class Protocol$request$5 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C7507 $message;
    final /* synthetic */ InterfaceC7665 $messageId;
    int label;
    final /* synthetic */ AbstractC5139 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$request$5(AbstractC5139 abstractC5139, C7507 c7507, InterfaceC7665 interfaceC7665, InterfaceC5189<? super Protocol$request$5> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC5139;
        this.$message = c7507;
        this.$messageId = interfaceC7665;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$lambda$0(InterfaceC7665 interfaceC7665) {
        return "Sending request message with id: " + interfaceC7665;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new Protocol$request$5(this.this$0, this.$message, this.$messageId, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((Protocol$request$5) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5143.f13236.mo9606(new C5140(this.$messageId, 0));
            InterfaceC5141 interfaceC5141 = this.this$0.f13227;
            if (interfaceC5141 == null) {
                return null;
            }
            C7507 c7507 = this.$message;
            this.label = 1;
            if (((AbstractC5142) interfaceC5141).m9301(c7507, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
