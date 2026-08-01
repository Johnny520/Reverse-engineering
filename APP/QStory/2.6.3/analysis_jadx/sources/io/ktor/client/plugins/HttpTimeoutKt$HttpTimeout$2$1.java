package io.ktor.client.plugins;

import com.alibaba.fastjson2.C2942;
import io.ktor.client.call.C3868;
import io.ktor.client.engine.AbstractC3879;
import io.ktor.client.plugins.api.AbstractC3883;
import io.ktor.client.plugins.sse.C3904;
import io.ktor.client.plugins.websocket.C3910;
import java.util.Map;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p236.C8091;
import p241.C8140;
import p398.InterfaceC9141;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2$1", f = "HttpTimeout.kt", l = {144, 175}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, k = 3, mv = {2, 0, 0})
final class HttpTimeoutKt$HttpTimeout$2$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ Long $connectTimeoutMillis;
    final /* synthetic */ Long $requestTimeoutMillis;
    final /* synthetic */ Long $socketTimeoutMillis;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeoutKt$HttpTimeout$2$1(Long l, Long l2, Long l3, InterfaceC4357<? super HttpTimeoutKt$HttpTimeout$2$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$requestTimeoutMillis = l;
        this.$connectTimeoutMillis = l2;
        this.$socketTimeoutMillis = l3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$1$lambda$0(InterfaceC5452 interfaceC5452, Throwable th) {
        interfaceC5452.mo10256(null);
        return C5176.f14739;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC3883 abstractC3883, C8140 c8140, InterfaceC4357<? super C3868> interfaceC4357) {
        HttpTimeoutKt$HttpTimeout$2$1 httpTimeoutKt$HttpTimeout$2$1 = new HttpTimeoutKt$HttpTimeout$2$1(this.$requestTimeoutMillis, this.$connectTimeoutMillis, this.$socketTimeoutMillis, interfaceC4357);
        httpTimeoutKt$HttpTimeout$2$1.L$0 = abstractC3883;
        httpTimeoutKt$HttpTimeout$2$1.L$1 = c8140;
        return httpTimeoutKt$HttpTimeout$2$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return obj;
            }
            if (i == 2) {
                AbstractC5185.m10210(obj);
                return obj;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        if (this.L$0 != null) {
            C2942.m6394();
            return null;
        }
        C8140 c8140 = (C8140) this.L$1;
        C8091 c8091M13572 = c8140.f22460.m13572();
        c8091M13572.getClass();
        String str = c8091M13572.f22322;
        if (!str.equals("ws") && !str.equals("wss")) {
            Object obj2 = c8140.f22457;
            if (!(obj2 instanceof C3910) && !(obj2 instanceof C3904)) {
                Map map = (Map) c8140.f22455.m8587(AbstractC3879.f12093);
                C3926 c3926 = C3926.f12138;
                C3927 c3927 = (C3927) (map != null ? map.get(c3926) : null);
                if (c3927 == null) {
                    Long l = this.$requestTimeoutMillis;
                    Long l2 = this.$connectTimeoutMillis;
                    Long l3 = this.$socketTimeoutMillis;
                    InterfaceC9141 interfaceC9141 = AbstractC3916.f12124;
                    if (l != null || l2 != null || l3 != null) {
                        c3927 = new C3927();
                        c8140.m13594(c3926, c3927);
                    }
                }
                if (c3927 != null) {
                    Long l4 = this.$connectTimeoutMillis;
                    Long l5 = this.$socketTimeoutMillis;
                    Long l6 = this.$requestTimeoutMillis;
                    Long l7 = c3927.f12140;
                    if (l7 != null) {
                        l4 = l7;
                    }
                    C3927.m8288(l4);
                    c3927.f12140 = l4;
                    Long l8 = c3927.f12139;
                    if (l8 != null) {
                        l5 = l8;
                    }
                    C3927.m8288(l5);
                    c3927.f12139 = l5;
                    Long l9 = c3927.f12141;
                    if (l9 != null) {
                        l6 = l9;
                    }
                    C3927.m8288(l6);
                    c3927.f12141 = l6;
                    if (l6 != null && l6.longValue() != Long.MAX_VALUE) {
                        c8140.f22456.mo10559(new C3917(AbstractC5399.m10477(null, null, null, new HttpTimeoutKt$HttpTimeout$2$1$1$killer$1(l6, c8140, c8140.f22456, null), 3), 0));
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
