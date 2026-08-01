package io.ktor.client.engine;

import io.ktor.client.AbstractC3949;
import io.ktor.client.statement.AbstractC3946;
import io.ktor.http.content.AbstractC3987;
import io.ktor.http.content.C3992;
import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import p052.InterfaceC6551;
import p059.C6857;
import p063.InterfaceC6862;
import p241.C8140;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", l = {70, 82}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class HttpClientEngine$install$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ AbstractC3949 $client;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ InterfaceC3881 this$0;

    public HttpClientEngine$install$1(AbstractC3949 abstractC3949, InterfaceC3881 interfaceC3881, InterfaceC4357<? super HttpClientEngine$install$1> interfaceC4357) {
        super(3, interfaceC4357);
    }

    private static final C5176 invokeSuspend$lambda$2(AbstractC3949 abstractC3949, AbstractC3946 abstractC3946, Throwable th) {
        if (th == null) {
            return C5176.f14739;
        }
        throw null;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        HttpClientEngine$install$1 httpClientEngine$install$1 = new HttpClientEngine$install$1(null, null, interfaceC4357);
        httpClientEngine$install$1.L$0 = abstractC4194;
        httpClientEngine$install$1.L$1 = obj;
        return httpClientEngine$install$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5087 interfaceC5087M8912;
        InterfaceC5087 interfaceC5087M89122;
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
            AbstractC5185.m10210(obj);
            throw null;
        }
        AbstractC5185.m10210(obj);
        AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
        Object obj2 = this.L$1;
        C8140 c8140 = new C8140();
        C8140 c81402 = (C8140) abstractC4194.f12664;
        c81402.getClass();
        c8140.f22456 = c81402.f22456;
        c8140.m13593(c81402);
        if (obj2 == null) {
            c8140.f22457 = C3992.f12247;
            InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(Object.class);
            try {
                interfaceC5087M8912 = AbstractC4396.m8912(Object.class);
            } catch (Throwable unused) {
                interfaceC5087M8912 = null;
            }
            c8140.m13595(new C6857(interfaceC5093Mo8917, interfaceC5087M8912));
            throw null;
        }
        if (obj2 instanceof AbstractC3987) {
            c8140.f22457 = obj2;
            c8140.m13595(null);
            throw null;
        }
        c8140.f22457 = obj2;
        InterfaceC5093 interfaceC5093Mo89172 = AbstractC4396.f12975.mo8917(Object.class);
        try {
            interfaceC5087M89122 = AbstractC4396.m8912(Object.class);
        } catch (Throwable unused2) {
            interfaceC5087M89122 = null;
        }
        c8140.m13595(new C6857(interfaceC5093Mo89172, interfaceC5087M89122));
        throw null;
    }
}
