package io.ktor.client.plugins.cookies;

import io.ktor.client.statement.AbstractC4778;
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
@InterfaceC7691(m555c = "io.ktor.client.plugins.cookies.HttpCookies$Companion$install$3", m556f = "HttpCookies.kt", m557l = {124}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpCookies$Companion$install$3 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ AbstractC4728 $plugin;
    /* synthetic */ Object L$0;
    int label;

    public HttpCookies$Companion$install$3(AbstractC4728 abstractC4728, InterfaceC5189<? super HttpCookies$Companion$install$3> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, AbstractC4778 abstractC4778, InterfaceC5189<? super C6008> interfaceC5189) {
        HttpCookies$Companion$install$3 httpCookies$Companion$install$3 = new HttpCookies$Companion$install$3(null, interfaceC5189);
        httpCookies$Companion$install$3.L$0 = abstractC4778;
        return httpCookies$Companion$install$3.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
