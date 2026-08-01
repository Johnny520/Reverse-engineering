package io.ktor.server.sse;

import io.ktor.utils.io.InterfaceC4247;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.sse.SSEServerContent$writeTo$2", f = "SSEServerContent.kt", l = {39}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class SSEServerContent$writeTo$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC4247 $channel;
    final /* synthetic */ Ref$ObjectRef<InterfaceC4172> $session;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C4173 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSEServerContent$writeTo$2(Ref$ObjectRef<InterfaceC4172> ref$ObjectRef, InterfaceC4247 interfaceC4247, C4173 c4173, InterfaceC4357<? super SSEServerContent$writeTo$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$session = ref$ObjectRef;
        this.$channel = interfaceC4247;
        this.this$0 = c4173;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SSEServerContent$writeTo$2 sSEServerContent$writeTo$2 = new SSEServerContent$writeTo$2(this.$session, this.$channel, this.this$0, interfaceC4357);
        sSEServerContent$writeTo$2.L$0 = obj;
        return sSEServerContent$writeTo$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SSEServerContent$writeTo$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, io.ktor.server.sse.飘花落叶言子楪世苏哲兰] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
            this.$session.element = new C4175(this.$channel, this.this$0.f12633, interfaceC5401.mo2430());
            C4175 c4175 = (C4175) this.$session.element;
            if (c4175 == null) {
                return null;
            }
            InterfaceC6554 interfaceC6554 = this.this$0.f12632;
            this.label = 1;
            if (interfaceC6554.invoke(c4175, this) == coroutineSingletons) {
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
