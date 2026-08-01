package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5438;
import kotlinx.coroutines.InterfaceC5441;
import p052.InterfaceC6554;
import p056.C6660;
import p056.C6704;
import p056.InterfaceC6836;
import p063.InterfaceC6862;
import p088.AbstractC7159;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$request$cancel$1", f = "Protocol.kt", l = {385}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "reason", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
final class Protocol$request$cancel$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6836 $messageId;
    final /* synthetic */ InterfaceC5441 $result;
    final /* synthetic */ InterfaceC4309 $transport;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC4307 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$request$cancel$1(AbstractC4307 abstractC4307, InterfaceC6836 interfaceC6836, InterfaceC4309 interfaceC4309, InterfaceC5441 interfaceC5441, InterfaceC4357<? super Protocol$request$cancel$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = abstractC4307;
        this.$messageId = interfaceC6836;
        this.$transport = interfaceC4309;
        this.$result = interfaceC5441;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        Protocol$request$cancel$1 protocol$request$cancel$1 = new Protocol$request$cancel$1(this.this$0, this.$messageId, this.$transport, this.$result, interfaceC4357);
        protocol$request$cancel$1.L$0 = obj;
        return protocol$request$cancel$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Throwable th, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((Protocol$request$cancel$1) create(th, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            Throwable th2 = (Throwable) this.L$0;
            this.this$0.f12879.remove(this.$messageId);
            this.this$0.f12878.remove(this.$messageId);
            InterfaceC6836 interfaceC6836 = this.$messageId;
            String message = th2.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            C6704 c6704 = new C6704(interfaceC6836, message);
            String value = c6704.f18116.getValue();
            AbstractC7159 abstractC7159M8743 = AbstractC4311.m8743();
            abstractC7159M8743.getClass();
            C6660 c6660 = new C6660(value, abstractC7159M8743.m12425(C6704.Companion.serializer(), c6704));
            InterfaceC4309 interfaceC4309 = this.$transport;
            this.L$0 = th2;
            this.label = 1;
            if (((AbstractC4310) interfaceC4309).m8742(c6660, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            th = th2;
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            th = (Throwable) this.L$0;
            AbstractC5185.m10210(obj);
        }
        ((C5438) this.$result).m10529(th);
        return C5176.f14739;
    }
}
