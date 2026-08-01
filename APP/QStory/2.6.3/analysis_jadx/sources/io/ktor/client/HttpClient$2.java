package io.ktor.client;

import androidx.activity.AbstractC0053;
import io.ktor.client.call.C3868;
import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5093;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", l = {1345, 1347}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "call", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class HttpClient$2 extends SuspendLambda implements InterfaceC6551 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AbstractC3949 this$0;

    public HttpClient$2(AbstractC3949 abstractC3949, InterfaceC4357<? super HttpClient$2> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        HttpClient$2 httpClient$2 = new HttpClient$2(null, interfaceC4357);
        httpClient$2.L$0 = abstractC4194;
        httpClient$2.L$1 = obj;
        return httpClient$2.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    AbstractC5185.m10210(obj);
                    return C5176.f14739;
                }
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = this.L$1;
            AbstractC5185.m10210(obj);
            AbstractC0053.m137(obj);
            ((C3868) obj2).getClass();
            throw null;
        }
        AbstractC5185.m10210(obj);
        Object obj3 = this.L$1;
        if (obj3 instanceof C3868) {
            throw null;
        }
        StringBuilder sb = new StringBuilder("Error: HttpClientCall expected, but found ");
        sb.append(obj3);
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(obj3.getClass());
        sb.append('(');
        sb.append(interfaceC5093Mo8917);
        sb.append(").");
        throw new IllegalStateException(sb.toString().toString());
    }
}
