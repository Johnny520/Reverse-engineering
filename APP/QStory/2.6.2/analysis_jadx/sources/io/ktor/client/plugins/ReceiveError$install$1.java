package io.ktor.client.plugins;

import io.ktor.client.call.C3867;
import io.ktor.client.statement.C3944;
import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.ReceiveError$install$1", f = "HttpCallValidator.kt", l = {149, 151}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class ReceiveError$install$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6550 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveError$install$1(InterfaceC6550 interfaceC6550, InterfaceC4356<? super ReceiveError$install$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$handler = interfaceC6550;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, C3944 c3944, InterfaceC4356<? super C5175> interfaceC4356) {
        ReceiveError$install$1 receiveError$install$1 = new ReceiveError$install$1(this.$handler, interfaceC4356);
        receiveError$install$1.L$0 = abstractC4193;
        return receiveError$install$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC4193 abstractC4193;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC4193 abstractC41932 = (AbstractC4193) this.L$0;
            try {
                this.L$0 = abstractC41932;
                this.label = 1;
                if (abstractC41932.mo8576(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C5175.f14739;
            } catch (Throwable unused) {
                abstractC4193 = abstractC41932;
                ((C3867) abstractC4193.f12660).m8264();
                throw null;
            }
        }
        if (i == 1) {
            abstractC4193 = (AbstractC4193) this.L$0;
            try {
                AbstractC5184.m10206(obj);
            } catch (Throwable unused2) {
                ((C3867) abstractC4193.f12660).m8264();
                throw null;
            }
        } else {
            if (i != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            Throwable th = (Throwable) obj;
            if (th != null) {
                throw th;
            }
        }
        return C5175.f14739;
    }
}
