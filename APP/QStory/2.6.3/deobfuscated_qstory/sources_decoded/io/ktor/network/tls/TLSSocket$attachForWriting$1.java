package io.ktor.network.tls;

import io.ktor.utils.io.C4229;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.tls.TLSSocket$attachForWriting$1", f = "TLSClientSessionJvm.kt", l = {47}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class TLSSocket$attachForWriting$1 extends SuspendLambda implements InterfaceC6554 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C4038 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSSocket$attachForWriting$1(C4038 c4038, InterfaceC4357<? super TLSSocket$attachForWriting$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c4038;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TLSSocket$attachForWriting$1 tLSSocket$attachForWriting$1 = new TLSSocket$attachForWriting$1(this.this$0, interfaceC4357);
        tLSSocket$attachForWriting$1.L$0 = obj;
        return tLSSocket$attachForWriting$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4229 c4229, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TLSSocket$attachForWriting$1) create(c4229, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C4229 c4229 = (C4229) this.L$0;
            C4038 c4038 = this.this$0;
            InterfaceC4252 interfaceC4252 = c4229.f12731;
            this.label = 1;
            if (C4038.m8442(c4038, interfaceC4252, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
