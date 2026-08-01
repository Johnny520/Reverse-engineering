package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5437;
import kotlinx.coroutines.InterfaceC5440;
import p052.InterfaceC6553;
import p056.C6659;
import p056.C6703;
import p056.InterfaceC6835;
import p063.InterfaceC6861;
import p088.AbstractC7158;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$request$cancel$1", f = "Protocol.kt", l = {385}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "reason", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
final class Protocol$request$cancel$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6835 $messageId;
    final /* synthetic */ InterfaceC5440 $result;
    final /* synthetic */ InterfaceC4308 $transport;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC4306 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$request$cancel$1(AbstractC4306 abstractC4306, InterfaceC6835 interfaceC6835, InterfaceC4308 interfaceC4308, InterfaceC5440 interfaceC5440, InterfaceC4356<? super Protocol$request$cancel$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = abstractC4306;
        this.$messageId = interfaceC6835;
        this.$transport = interfaceC4308;
        this.$result = interfaceC5440;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        Protocol$request$cancel$1 protocol$request$cancel$1 = new Protocol$request$cancel$1(this.this$0, this.$messageId, this.$transport, this.$result, interfaceC4356);
        protocol$request$cancel$1.L$0 = obj;
        return protocol$request$cancel$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Throwable th, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((Protocol$request$cancel$1) create(th, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            Throwable th2 = (Throwable) this.L$0;
            this.this$0.f12875.remove(this.$messageId);
            this.this$0.f12874.remove(this.$messageId);
            InterfaceC6835 interfaceC6835 = this.$messageId;
            String message = th2.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            C6703 c6703 = new C6703(interfaceC6835, message);
            String value = c6703.f18121.getValue();
            AbstractC7158 abstractC7158M8753 = AbstractC4310.m8753();
            abstractC7158M8753.getClass();
            C6659 c6659 = new C6659(value, abstractC7158M8753.m12398(C6703.Companion.serializer(), c6703));
            InterfaceC4308 interfaceC4308 = this.$transport;
            this.L$0 = th2;
            this.label = 1;
            if (((AbstractC4309) interfaceC4308).m8752(c6659, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            th = th2;
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            th = (Throwable) this.L$0;
            AbstractC5184.m10206(obj);
        }
        ((C5437) this.$result).m10525(th);
        return C5175.f14739;
    }
}
