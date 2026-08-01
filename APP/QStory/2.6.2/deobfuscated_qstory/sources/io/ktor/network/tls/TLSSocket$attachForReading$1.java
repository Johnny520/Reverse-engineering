package io.ktor.network.tls;

import io.ktor.utils.io.C4225;
import io.ktor.utils.io.InterfaceC4246;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.network.tls.TLSSocket$attachForReading$1", f = "TLSClientSessionJvm.kt", l = {42}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class TLSSocket$attachForReading$1 extends SuspendLambda implements InterfaceC6553 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C4037 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSSocket$attachForReading$1(C4037 c4037, InterfaceC4356<? super TLSSocket$attachForReading$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c4037;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        TLSSocket$attachForReading$1 tLSSocket$attachForReading$1 = new TLSSocket$attachForReading$1(this.this$0, interfaceC4356);
        tLSSocket$attachForReading$1.L$0 = obj;
        return tLSSocket$attachForReading$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4225 c4225, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TLSSocket$attachForReading$1) create(c4225, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C4225 c4225 = (C4225) this.L$0;
            C4037 c4037 = this.this$0;
            InterfaceC4246 interfaceC4246 = c4225.f12722;
            this.label = 1;
            if (C4037.m8452(c4037, interfaceC4246, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
