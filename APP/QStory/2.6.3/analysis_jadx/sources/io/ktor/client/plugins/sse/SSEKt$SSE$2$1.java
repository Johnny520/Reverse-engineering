package io.ktor.client.plugins.sse;

import io.ktor.http.content.AbstractC3987;
import io.ktor.util.C4204;
import io.ktor.util.C4209;
import java.util.List;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.time.C5157;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p236.AbstractC8115;
import p236.C8116;
import p236.C8125;
import p241.AbstractC8138;
import p241.C8140;
import p241.C8142;
import p398.InterfaceC9141;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$1", f = "SSE.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "content", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;)Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;"}, k = 3, mv = {2, 0, 0})
final class SSEKt$SSE$2$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ long $reconnectionTime;
    final /* synthetic */ boolean $showCommentEvents;
    final /* synthetic */ boolean $showRetryEvents;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSEKt$SSE$2$1(long j, boolean z, boolean z2, InterfaceC4357<? super SSEKt$SSE$2$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$reconnectionTime = j;
        this.$showCommentEvents = z;
        this.$showRetryEvents = z2;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C8140 c8140, AbstractC3987 abstractC3987, InterfaceC4357<? super AbstractC3987> interfaceC4357) {
        SSEKt$SSE$2$1 sSEKt$SSE$2$1 = new SSEKt$SSE$2$1(this.$reconnectionTime, this.$showCommentEvents, this.$showRetryEvents, interfaceC4357);
        sSEKt$SSE$2$1.L$0 = c8140;
        sSEKt$SSE$2$1.L$1 = abstractC3987;
        return sSEKt$SSE$2$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C8140 c8140 = (C8140) this.L$0;
        AbstractC3987 abstractC3987 = (AbstractC3987) this.L$1;
        C4209 c4209 = AbstractC3907.f12118;
        InterfaceC9141 interfaceC9141 = AbstractC3902.f12103;
        C4204 c4204 = c8140.f22455;
        if (!AbstractC4395.m8907(c4204.m8587(c4209), Boolean.TRUE)) {
            return abstractC3987;
        }
        AbstractC3902.f12103.trace("Sending SSE request " + c8140.f22460);
        c8140.m13594(C3905.f12109, C5176.f14739);
        C5157 c5157 = (C5157) c4204.m8587(AbstractC3907.f12117);
        Boolean bool = (Boolean) c4204.m8587(AbstractC3907.f12116);
        Boolean bool2 = (Boolean) c4204.m8587(AbstractC3907.f12115);
        c4204.m8586(AbstractC8138.f22448, new C8142());
        C8125 c8125Mo8283 = abstractC3987.mo8283();
        if (c8125Mo8283 != null) {
            C8116 c8116 = c8140.f22458;
            String[] strArr = AbstractC8115.f22413;
            String string = c8125Mo8283.toString();
            c8116.getClass();
            string.getClass();
            c8116.mo2412(string);
            List listM2414 = c8116.m2414("Content-Type");
            listM2414.clear();
            listM2414.add(string);
        }
        return new C3904(c5157 != null ? c5157.f14714 : this.$reconnectionTime, bool != null ? bool.booleanValue() : this.$showCommentEvents, bool2 != null ? bool2.booleanValue() : this.$showRetryEvents, abstractC3987);
    }
}
