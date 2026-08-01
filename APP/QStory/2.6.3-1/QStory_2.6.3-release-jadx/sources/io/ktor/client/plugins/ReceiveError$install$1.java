package io.ktor.client.plugins;

import io.ktor.client.call.C4700;
import io.ktor.client.statement.C4777;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.ReceiveError$install$1", m556f = "HttpCallValidator.kt", m557l = {149, 151}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ReceiveError$install$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7380 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveError$install$1(InterfaceC7380 interfaceC7380, InterfaceC5189<? super ReceiveError$install$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$handler = interfaceC7380;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, C4777 c4777, InterfaceC5189<? super C6008> interfaceC5189) {
        ReceiveError$install$1 receiveError$install$1 = new ReceiveError$install$1(this.$handler, interfaceC5189);
        receiveError$install$1.L$0 = abstractC5026;
        return receiveError$install$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC5026 abstractC5026;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5026 abstractC50262 = (AbstractC5026) this.L$0;
            try {
                this.L$0 = abstractC50262;
                this.label = 1;
                if (abstractC50262.mo9125(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C6008.f15084;
            } catch (Throwable unused) {
                abstractC5026 = abstractC50262;
                ((C4700) abstractC5026.f13009).m8810();
                throw null;
            }
        }
        if (i == 1) {
            abstractC5026 = (AbstractC5026) this.L$0;
            try {
                AbstractC6017.m10769(obj);
            } catch (Throwable unused2) {
                ((C4700) abstractC5026.f13009).m8810();
                throw null;
            }
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            Throwable th = (Throwable) obj;
            if (th != null) {
                throw th;
            }
        }
        return C6008.f15084;
    }
}
