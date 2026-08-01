package io.ktor.http.content;

import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.C5058;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p064.AbstractC7347;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1", m556f = "OutgoingContent.kt", m557l = {93, 95}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class OutgoingContent$ReadChannelContent$readFrom$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC7347 $range;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC4826 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutgoingContent$ReadChannelContent$readFrom$1(AbstractC4826 abstractC4826, AbstractC7347 abstractC7347, InterfaceC5189<? super OutgoingContent$ReadChannelContent$readFrom$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC4826;
        this.$range = abstractC7347;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        OutgoingContent$ReadChannelContent$readFrom$1 outgoingContent$ReadChannelContent$readFrom$1 = new OutgoingContent$ReadChannelContent$readFrom$1(this.this$0, this.$range, interfaceC5189);
        outgoingContent$ReadChannelContent$readFrom$1.L$0 = obj;
        return outgoingContent$ReadChannelContent$readFrom$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5058 c5058, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((OutgoingContent$ReadChannelContent$readFrom$1) create(c5058, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (io.ktor.utils.p007io.AbstractC5076.m9222(r1, r10, (0 - 0) + 1, r9) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC5084 interfaceC5084Mo8845;
        C5058 c5058;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C5058 c50582 = (C5058) this.L$0;
            interfaceC5084Mo8845 = this.this$0.mo8845();
            this.$range.getClass();
            this.L$0 = c50582;
            this.L$1 = interfaceC5084Mo8845;
            this.label = 1;
            if (AbstractC5076.m9240(interfaceC5084Mo8845, 0L, this) != coroutineSingletons) {
                c5058 = c50582;
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
        interfaceC5084Mo8845 = (InterfaceC5084) this.L$1;
        c5058 = (C5058) this.L$0;
        AbstractC6017.m10769(obj);
        this.$range.getClass();
        InterfaceC5079 interfaceC5079 = c5058.f13071;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
