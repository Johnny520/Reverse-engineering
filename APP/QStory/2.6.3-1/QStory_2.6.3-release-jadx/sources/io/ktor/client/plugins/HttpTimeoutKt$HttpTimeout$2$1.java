package io.ktor.client.plugins;

import com.alibaba.fastjson2.C3775;
import io.ktor.client.call.C4700;
import io.ktor.client.engine.AbstractC4711;
import io.ktor.client.plugins.api.AbstractC4715;
import io.ktor.client.plugins.sse.C4736;
import io.ktor.client.plugins.websocket.C4742;
import java.util.Map;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p252.C8920;
import p257.C8969;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2$1", m556f = "HttpTimeout.kt", m557l = {144, 175}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpTimeoutKt$HttpTimeout$2$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ Long $connectTimeoutMillis;
    final /* synthetic */ Long $requestTimeoutMillis;
    final /* synthetic */ Long $socketTimeoutMillis;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeoutKt$HttpTimeout$2$1(Long l, Long l2, Long l3, InterfaceC5189<? super HttpTimeoutKt$HttpTimeout$2$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$requestTimeoutMillis = l;
        this.$connectTimeoutMillis = l2;
        this.$socketTimeoutMillis = l3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$1$lambda$0(InterfaceC6284 interfaceC6284, Throwable th) {
        interfaceC6284.mo10815(null);
        return C6008.f15084;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC4715 abstractC4715, C8969 c8969, InterfaceC5189<? super C4700> interfaceC5189) {
        HttpTimeoutKt$HttpTimeout$2$1 httpTimeoutKt$HttpTimeout$2$1 = new HttpTimeoutKt$HttpTimeout$2$1(this.$requestTimeoutMillis, this.$connectTimeoutMillis, this.$socketTimeoutMillis, interfaceC5189);
        httpTimeoutKt$HttpTimeout$2$1.L$0 = abstractC4715;
        httpTimeoutKt$HttpTimeout$2$1.L$1 = c8969;
        return httpTimeoutKt$HttpTimeout$2$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        if (this.L$0 != null) {
            C3775.m6954();
            return null;
        }
        C8969 c8969 = (C8969) this.L$1;
        C8920 c8920M14131 = c8969.f22805.m14131();
        c8920M14131.getClass();
        String str = c8920M14131.f22667;
        if (!str.equals("ws") && !str.equals("wss")) {
            Object obj2 = c8969.f22802;
            if (!(obj2 instanceof C4742) && !(obj2 instanceof C4736)) {
                Map map = (Map) c8969.f22800.m9146(AbstractC4711.f12438);
                C4758 c4758 = C4758.f12483;
                C4759 c4759 = (C4759) (map != null ? map.get(c4758) : null);
                if (c4759 == null) {
                    Long l = this.$requestTimeoutMillis;
                    Long l2 = this.$connectTimeoutMillis;
                    Long l3 = this.$socketTimeoutMillis;
                    InterfaceC9970 interfaceC9970 = AbstractC4748.f12469;
                    if (l != null || l2 != null || l3 != null) {
                        c4759 = new C4759();
                        c8969.m14153(c4758, c4759);
                    }
                }
                if (c4759 != null) {
                    Long l4 = this.$connectTimeoutMillis;
                    Long l5 = this.$socketTimeoutMillis;
                    Long l6 = this.$requestTimeoutMillis;
                    Long l7 = c4759.f12485;
                    if (l7 != null) {
                        l4 = l7;
                    }
                    C4759.m8847(l4);
                    c4759.f12485 = l4;
                    Long l8 = c4759.f12484;
                    if (l8 != null) {
                        l5 = l8;
                    }
                    C4759.m8847(l5);
                    c4759.f12484 = l5;
                    Long l9 = c4759.f12486;
                    if (l9 != null) {
                        l6 = l9;
                    }
                    C4759.m8847(l6);
                    c4759.f12486 = l6;
                    if (l6 != null && l6.longValue() != Long.MAX_VALUE) {
                        c8969.f22801.mo11118(new C4749(AbstractC6231.m11036(null, null, null, new HttpTimeoutKt$HttpTimeout$2$1$1$killer$1(l6, c8969, c8969.f22801, null), 3), 0));
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
