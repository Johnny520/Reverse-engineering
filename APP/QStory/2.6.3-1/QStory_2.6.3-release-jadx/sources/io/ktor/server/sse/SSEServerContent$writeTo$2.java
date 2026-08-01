package io.ktor.server.sse;

import io.ktor.utils.p007io.InterfaceC5079;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.sse.SSEServerContent$writeTo$2", m556f = "SSEServerContent.kt", m557l = {39}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class SSEServerContent$writeTo$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC5079 $channel;
    final /* synthetic */ Ref$ObjectRef<InterfaceC5004> $session;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5005 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSEServerContent$writeTo$2(Ref$ObjectRef<InterfaceC5004> ref$ObjectRef, InterfaceC5079 interfaceC5079, C5005 c5005, InterfaceC5189<? super SSEServerContent$writeTo$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$session = ref$ObjectRef;
        this.$channel = interfaceC5079;
        this.this$0 = c5005;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SSEServerContent$writeTo$2 sSEServerContent$writeTo$2 = new SSEServerContent$writeTo$2(this.$session, this.$channel, this.this$0, interfaceC5189);
        sSEServerContent$writeTo$2.L$0 = obj;
        return sSEServerContent$writeTo$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SSEServerContent$writeTo$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, io.ktor.server.sse.飘花落叶言子楪世苏哲兰] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            this.$session.element = new C5007(this.$channel, this.this$0.f12978, interfaceC6233.mo2990());
            C5007 c5007 = (C5007) this.$session.element;
            if (c5007 == null) {
                return null;
            }
            InterfaceC7383 interfaceC7383 = this.this$0.f12977;
            this.label = 1;
            if (interfaceC7383.invoke(c5007, this) == coroutineSingletons) {
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
