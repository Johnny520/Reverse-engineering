package io.ktor.client.engine;

import io.ktor.client.AbstractC4781;
import io.ktor.client.statement.AbstractC4778;
import io.ktor.http.content.AbstractC4819;
import io.ktor.http.content.C4824;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7380;
import p075.C7686;
import p079.InterfaceC7691;
import p257.C8969;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.HttpClientEngine$install$1", m556f = "HttpClientEngine.kt", m557l = {70, 82}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpClientEngine$install$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ AbstractC4781 $client;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ InterfaceC4713 this$0;

    public HttpClientEngine$install$1(AbstractC4781 abstractC4781, InterfaceC4713 interfaceC4713, InterfaceC5189<? super HttpClientEngine$install$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    private static final C6008 invokeSuspend$lambda$2(AbstractC4781 abstractC4781, AbstractC4778 abstractC4778, Throwable th) {
        if (th == null) {
            return C6008.f15084;
        }
        throw null;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        HttpClientEngine$install$1 httpClientEngine$install$1 = new HttpClientEngine$install$1(null, null, interfaceC5189);
        httpClientEngine$install$1.L$0 = abstractC5026;
        httpClientEngine$install$1.L$1 = obj;
        return httpClientEngine$install$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5919 interfaceC5919M94712;
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
            AbstractC6017.m10769(obj);
            throw null;
        }
        AbstractC6017.m10769(obj);
        AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
        Object obj2 = this.L$1;
        C8969 c8969 = new C8969();
        C8969 c89692 = (C8969) abstractC5026.f13009;
        c89692.getClass();
        c8969.f22801 = c89692.f22801;
        c8969.m14152(c89692);
        if (obj2 == null) {
            c8969.f22802 = C4824.f12592;
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(Object.class);
            try {
                interfaceC5919M9471 = AbstractC5228.m9471(Object.class);
            } catch (Throwable unused) {
                interfaceC5919M9471 = null;
            }
            c8969.m14154(new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
            throw null;
        }
        if (obj2 instanceof AbstractC4819) {
            c8969.f22802 = obj2;
            c8969.m14154(null);
            throw null;
        }
        c8969.f22802 = obj2;
        InterfaceC5925 interfaceC5925Mo94762 = AbstractC5228.f13320.mo9476(Object.class);
        try {
            interfaceC5919M94712 = AbstractC5228.m9471(Object.class);
        } catch (Throwable unused2) {
            interfaceC5919M94712 = null;
        }
        c8969.m14154(new C7686(interfaceC5925Mo94762, interfaceC5919M94712));
        throw null;
    }
}
