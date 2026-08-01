package io.ktor.client;

import androidx.activity.AbstractC0900;
import io.ktor.client.call.C4700;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.HttpClient$2", m556f = "HttpClient.kt", m557l = {1345, 1347}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "call", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpClient$2 extends SuspendLambda implements InterfaceC7380 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AbstractC4781 this$0;

    public HttpClient$2(AbstractC4781 abstractC4781, InterfaceC5189<? super HttpClient$2> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        HttpClient$2 httpClient$2 = new HttpClient$2(null, interfaceC5189);
        httpClient$2.L$0 = abstractC5026;
        httpClient$2.L$1 = obj;
        return httpClient$2.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = this.L$1;
            AbstractC6017.m10769(obj);
            AbstractC0900.m697(obj);
            ((C4700) obj2).getClass();
            throw null;
        }
        AbstractC6017.m10769(obj);
        Object obj3 = this.L$1;
        if (obj3 instanceof C4700) {
            throw null;
        }
        StringBuilder sb = new StringBuilder("Error: HttpClientCall expected, but found ");
        sb.append(obj3);
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(obj3.getClass());
        sb.append('(');
        sb.append(interfaceC5925Mo9476);
        sb.append(").");
        throw new IllegalStateException(sb.toString().toString());
    }
}
