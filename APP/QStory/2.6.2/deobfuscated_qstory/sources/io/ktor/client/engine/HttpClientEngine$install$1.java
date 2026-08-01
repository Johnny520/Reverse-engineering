package io.ktor.client.engine;

import io.ktor.client.AbstractC3948;
import io.ktor.client.statement.AbstractC3945;
import io.ktor.http.content.AbstractC3986;
import io.ktor.http.content.C3991;
import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import p052.InterfaceC6550;
import p059.C6856;
import p063.InterfaceC6861;
import p241.C8139;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", l = {70, 82}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class HttpClientEngine$install$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ AbstractC3948 $client;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ InterfaceC3880 this$0;

    public HttpClientEngine$install$1(AbstractC3948 abstractC3948, InterfaceC3880 interfaceC3880, InterfaceC4356<? super HttpClientEngine$install$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    private static final C5175 invokeSuspend$lambda$2(AbstractC3948 abstractC3948, AbstractC3945 abstractC3945, Throwable th) {
        if (th == null) {
            return C5175.f14739;
        }
        throw null;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        HttpClientEngine$install$1 httpClientEngine$install$1 = new HttpClientEngine$install$1(null, null, interfaceC4356);
        httpClientEngine$install$1.L$0 = abstractC4193;
        httpClientEngine$install$1.L$1 = obj;
        return httpClientEngine$install$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5086 interfaceC5086M8922;
        InterfaceC5086 interfaceC5086M89222;
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
            AbstractC5184.m10206(obj);
            throw null;
        }
        AbstractC5184.m10206(obj);
        AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
        Object obj2 = this.L$1;
        C8139 c8139 = new C8139();
        C8139 c81392 = (C8139) abstractC4193.f12660;
        c81392.getClass();
        c8139.f22458 = c81392.f22458;
        c8139.m13564(c81392);
        if (obj2 == null) {
            c8139.f22459 = C3991.f12243;
            InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(Object.class);
            try {
                interfaceC5086M8922 = AbstractC4395.m8922(Object.class);
            } catch (Throwable unused) {
                interfaceC5086M8922 = null;
            }
            c8139.m13566(new C6856(interfaceC5092Mo8927, interfaceC5086M8922));
            throw null;
        }
        if (obj2 instanceof AbstractC3986) {
            c8139.f22459 = obj2;
            c8139.m13566(null);
            throw null;
        }
        c8139.f22459 = obj2;
        InterfaceC5092 interfaceC5092Mo89272 = AbstractC4395.f12971.mo8927(Object.class);
        try {
            interfaceC5086M89222 = AbstractC4395.m8922(Object.class);
        } catch (Throwable unused2) {
            interfaceC5086M89222 = null;
        }
        c8139.m13566(new C6856(interfaceC5092Mo89272, interfaceC5086M89222));
        throw null;
    }
}
