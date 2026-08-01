package io.ktor.client;

import androidx.activity.AbstractC0053;
import io.ktor.client.call.C3867;
import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5092;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", l = {1345, 1347}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "call", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class HttpClient$2 extends SuspendLambda implements InterfaceC6550 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AbstractC3948 this$0;

    public HttpClient$2(AbstractC3948 abstractC3948, InterfaceC4356<? super HttpClient$2> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        HttpClient$2 httpClient$2 = new HttpClient$2(null, interfaceC4356);
        httpClient$2.L$0 = abstractC4193;
        httpClient$2.L$1 = obj;
        return httpClient$2.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    AbstractC5184.m10206(obj);
                    return C5175.f14739;
                }
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = this.L$1;
            AbstractC5184.m10206(obj);
            AbstractC0053.m137(obj);
            ((C3867) obj2).getClass();
            throw null;
        }
        AbstractC5184.m10206(obj);
        Object obj3 = this.L$1;
        if (obj3 instanceof C3867) {
            throw null;
        }
        StringBuilder sb = new StringBuilder("Error: HttpClientCall expected, but found ");
        sb.append(obj3);
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(obj3.getClass());
        sb.append('(');
        sb.append(interfaceC5092Mo8927);
        sb.append(").");
        throw new IllegalStateException(sb.toString().toString());
    }
}
