package io.ktor.client.plugins;

import io.ktor.util.AbstractC4216;
import io.ktor.util.pipeline.AbstractC4193;
import java.io.IOException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p236.C8100;
import p236.C8115;
import p241.C8139;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.DefaultRequest$Plugin$install$1", f = "DefaultRequest.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultRequest$Plugin$install$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ AbstractC3921 $plugin;
    private /* synthetic */ Object L$0;
    int label;

    public DefaultRequest$Plugin$install$1(AbstractC3921 abstractC3921, InterfaceC4356<? super DefaultRequest$Plugin$install$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        DefaultRequest$Plugin$install$1 defaultRequest$Plugin$install$1 = new DefaultRequest$Plugin$install$1(null, interfaceC4356);
        defaultRequest$Plugin$install$1.L$0 = abstractC4193;
        return defaultRequest$Plugin$install$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5184.m10206(obj);
        AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
        ((C8139) abstractC4193.f12660).f22462.toString();
        C8115 c8115 = new C8115(2);
        new C8100();
        AbstractC4216.m8637(true);
        AbstractC4216.m8634(c8115, ((C8139) abstractC4193.f12660).f22460);
        c8115.m13556();
        int i = AbstractC3921.f12131;
        throw null;
    }
}
