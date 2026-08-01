package io.ktor.network.tls;

import io.ktor.utils.p007io.C5058;
import io.ktor.utils.p007io.InterfaceC5079;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.tls.TLSSocket$attachForReading$1", m556f = "TLSClientSessionJvm.kt", m557l = {42}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class TLSSocket$attachForReading$1 extends SuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C4870 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSSocket$attachForReading$1(C4870 c4870, InterfaceC5189<? super TLSSocket$attachForReading$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c4870;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TLSSocket$attachForReading$1 tLSSocket$attachForReading$1 = new TLSSocket$attachForReading$1(this.this$0, interfaceC5189);
        tLSSocket$attachForReading$1.L$0 = obj;
        return tLSSocket$attachForReading$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5058 c5058, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TLSSocket$attachForReading$1) create(c5058, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C5058 c5058 = (C5058) this.L$0;
            C4870 c4870 = this.this$0;
            InterfaceC5079 interfaceC5079 = c5058.f13071;
            this.label = 1;
            if (C4870.m9002(c4870, interfaceC5079, this) == coroutineSingletons) {
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
