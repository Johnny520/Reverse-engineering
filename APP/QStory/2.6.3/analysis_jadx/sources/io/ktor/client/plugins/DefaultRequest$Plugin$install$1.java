package io.ktor.client.plugins;

import io.ktor.util.AbstractC4217;
import io.ktor.util.pipeline.AbstractC4194;
import java.io.IOException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p236.C8101;
import p236.C8116;
import p241.C8140;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.DefaultRequest$Plugin$install$1", f = "DefaultRequest.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultRequest$Plugin$install$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ AbstractC3922 $plugin;
    private /* synthetic */ Object L$0;
    int label;

    public DefaultRequest$Plugin$install$1(AbstractC3922 abstractC3922, InterfaceC4357<? super DefaultRequest$Plugin$install$1> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        DefaultRequest$Plugin$install$1 defaultRequest$Plugin$install$1 = new DefaultRequest$Plugin$install$1(null, interfaceC4357);
        defaultRequest$Plugin$install$1.L$0 = abstractC4194;
        return defaultRequest$Plugin$install$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5185.m10210(obj);
        AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
        ((C8140) abstractC4194.f12664).f22460.toString();
        C8116 c8116 = new C8116(2);
        new C8101();
        AbstractC4217.m8627(true);
        AbstractC4217.m8624(c8116, ((C8140) abstractC4194.f12664).f22458);
        c8116.m13585();
        int i = AbstractC3922.f12136;
        throw null;
    }
}
