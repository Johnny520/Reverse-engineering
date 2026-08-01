package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p056.C6678;
import p056.InterfaceC6836;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$request$5", f = "Protocol.kt", l = {395}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class Protocol$request$5 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C6678 $message;
    final /* synthetic */ InterfaceC6836 $messageId;
    int label;
    final /* synthetic */ AbstractC4307 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$request$5(AbstractC4307 abstractC4307, C6678 c6678, InterfaceC6836 interfaceC6836, InterfaceC4357<? super Protocol$request$5> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = abstractC4307;
        this.$message = c6678;
        this.$messageId = interfaceC6836;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$lambda$0(InterfaceC6836 interfaceC6836) {
        return "Sending request message with id: " + interfaceC6836;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new Protocol$request$5(this.this$0, this.$message, this.$messageId, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((Protocol$request$5) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AbstractC4311.f12891.mo9047(new C4308(this.$messageId, 0));
            InterfaceC4309 interfaceC4309 = this.this$0.f12882;
            if (interfaceC4309 == null) {
                return null;
            }
            C6678 c6678 = this.$message;
            this.label = 1;
            if (((AbstractC4310) interfaceC4309).m8742(c6678, this) == coroutineSingletons) {
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
