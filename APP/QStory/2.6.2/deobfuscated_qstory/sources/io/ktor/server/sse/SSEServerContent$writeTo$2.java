package io.ktor.server.sse;

import io.ktor.utils.io.InterfaceC4246;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.sse.SSEServerContent$writeTo$2", f = "SSEServerContent.kt", l = {39}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class SSEServerContent$writeTo$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC4246 $channel;
    final /* synthetic */ Ref$ObjectRef<InterfaceC4171> $session;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C4172 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSEServerContent$writeTo$2(Ref$ObjectRef<InterfaceC4171> ref$ObjectRef, InterfaceC4246 interfaceC4246, C4172 c4172, InterfaceC4356<? super SSEServerContent$writeTo$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$session = ref$ObjectRef;
        this.$channel = interfaceC4246;
        this.this$0 = c4172;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        SSEServerContent$writeTo$2 sSEServerContent$writeTo$2 = new SSEServerContent$writeTo$2(this.$session, this.$channel, this.this$0, interfaceC4356);
        sSEServerContent$writeTo$2.L$0 = obj;
        return sSEServerContent$writeTo$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SSEServerContent$writeTo$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, io.ktor.server.sse.飘花落叶言子楪世苏哲兰] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
            this.$session.element = new C4174(this.$channel, this.this$0.f12629, interfaceC5400.mo2420());
            C4174 c4174 = (C4174) this.$session.element;
            if (c4174 == null) {
                return null;
            }
            InterfaceC6553 interfaceC6553 = this.this$0.f12628;
            this.label = 1;
            if (interfaceC6553.invoke(c4174, this) == coroutineSingletons) {
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
