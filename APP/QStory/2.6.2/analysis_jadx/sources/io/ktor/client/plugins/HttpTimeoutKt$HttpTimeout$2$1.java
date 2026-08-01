package io.ktor.client.plugins;

import com.alibaba.fastjson2.C2941;
import io.ktor.client.call.C3867;
import io.ktor.client.engine.AbstractC3878;
import io.ktor.client.plugins.api.AbstractC3882;
import io.ktor.client.plugins.sse.C3903;
import io.ktor.client.plugins.websocket.C3909;
import java.util.Map;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p236.C8090;
import p241.C8139;
import p400.InterfaceC9156;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2$1", f = "HttpTimeout.kt", l = {144, 175}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, k = 3, mv = {2, 0, 0})
final class HttpTimeoutKt$HttpTimeout$2$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ Long $connectTimeoutMillis;
    final /* synthetic */ Long $requestTimeoutMillis;
    final /* synthetic */ Long $socketTimeoutMillis;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeoutKt$HttpTimeout$2$1(Long l, Long l2, Long l3, InterfaceC4356<? super HttpTimeoutKt$HttpTimeout$2$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$requestTimeoutMillis = l;
        this.$connectTimeoutMillis = l2;
        this.$socketTimeoutMillis = l3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$1$lambda$0(InterfaceC5451 interfaceC5451, Throwable th) {
        interfaceC5451.mo10252(null);
        return C5175.f14739;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC3882 abstractC3882, C8139 c8139, InterfaceC4356<? super C3867> interfaceC4356) {
        HttpTimeoutKt$HttpTimeout$2$1 httpTimeoutKt$HttpTimeout$2$1 = new HttpTimeoutKt$HttpTimeout$2$1(this.$requestTimeoutMillis, this.$connectTimeoutMillis, this.$socketTimeoutMillis, interfaceC4356);
        httpTimeoutKt$HttpTimeout$2$1.L$0 = abstractC3882;
        httpTimeoutKt$HttpTimeout$2$1.L$1 = c8139;
        return httpTimeoutKt$HttpTimeout$2$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return obj;
            }
            if (i == 2) {
                AbstractC5184.m10206(obj);
                return obj;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        if (this.L$0 != null) {
            C2941.m6336();
            return null;
        }
        C8139 c8139 = (C8139) this.L$1;
        C8090 c8090M13543 = c8139.f22462.m13543();
        c8090M13543.getClass();
        String str = c8090M13543.f22324;
        if (!str.equals("ws") && !str.equals("wss")) {
            Object obj2 = c8139.f22459;
            if (!(obj2 instanceof C3909) && !(obj2 instanceof C3903)) {
                Map map = (Map) c8139.f22457.m8597(AbstractC3878.f12088);
                C3925 c3925 = C3925.f12133;
                C3926 c3926 = (C3926) (map != null ? map.get(c3925) : null);
                if (c3926 == null) {
                    Long l = this.$requestTimeoutMillis;
                    Long l2 = this.$connectTimeoutMillis;
                    Long l3 = this.$socketTimeoutMillis;
                    InterfaceC9156 interfaceC9156 = AbstractC3915.f12119;
                    if (l != null || l2 != null || l3 != null) {
                        c3926 = new C3926();
                        c8139.m13565(c3925, c3926);
                    }
                }
                if (c3926 != null) {
                    Long l4 = this.$connectTimeoutMillis;
                    Long l5 = this.$socketTimeoutMillis;
                    Long l6 = this.$requestTimeoutMillis;
                    Long l7 = c3926.f12135;
                    if (l7 != null) {
                        l4 = l7;
                    }
                    C3926.m8298(l4);
                    c3926.f12135 = l4;
                    Long l8 = c3926.f12134;
                    if (l8 != null) {
                        l5 = l8;
                    }
                    C3926.m8298(l5);
                    c3926.f12134 = l5;
                    Long l9 = c3926.f12136;
                    if (l9 != null) {
                        l6 = l9;
                    }
                    C3926.m8298(l6);
                    c3926.f12136 = l6;
                    if (l6 != null && l6.longValue() != Long.MAX_VALUE) {
                        c8139.f22458.mo10554(new C3916(AbstractC5398.m10473(null, null, null, new HttpTimeoutKt$HttpTimeout$2$1$1$killer$1(l6, c8139, c8139.f22458, null), 3), 0));
                    }
                }
                this.L$0 = null;
                this.label = 2;
                throw null;
            }
        }
        this.L$0 = null;
        this.label = 1;
        throw null;
    }
}
