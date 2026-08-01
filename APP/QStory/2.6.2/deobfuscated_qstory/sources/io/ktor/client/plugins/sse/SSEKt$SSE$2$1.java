package io.ktor.client.plugins.sse;

import io.ktor.http.content.AbstractC3986;
import io.ktor.util.C4203;
import io.ktor.util.C4208;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.time.C5156;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p236.AbstractC8114;
import p236.C8115;
import p236.C8124;
import p241.AbstractC8137;
import p241.C8139;
import p241.C8141;
import p400.InterfaceC9156;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$1", f = "SSE.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "content", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;)Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;"}, k = 3, mv = {2, 0, 0})
final class SSEKt$SSE$2$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ long $reconnectionTime;
    final /* synthetic */ boolean $showCommentEvents;
    final /* synthetic */ boolean $showRetryEvents;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSEKt$SSE$2$1(long j, boolean z, boolean z2, InterfaceC4356<? super SSEKt$SSE$2$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$reconnectionTime = j;
        this.$showCommentEvents = z;
        this.$showRetryEvents = z2;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C8139 c8139, AbstractC3986 abstractC3986, InterfaceC4356<? super AbstractC3986> interfaceC4356) {
        SSEKt$SSE$2$1 sSEKt$SSE$2$1 = new SSEKt$SSE$2$1(this.$reconnectionTime, this.$showCommentEvents, this.$showRetryEvents, interfaceC4356);
        sSEKt$SSE$2$1.L$0 = c8139;
        sSEKt$SSE$2$1.L$1 = abstractC3986;
        return sSEKt$SSE$2$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C8139 c8139 = (C8139) this.L$0;
        AbstractC3986 abstractC3986 = (AbstractC3986) this.L$1;
        C4208 c4208 = AbstractC3906.f12113;
        InterfaceC9156 interfaceC9156 = AbstractC3901.f12098;
        C4203 c4203 = c8139.f22457;
        if (!AbstractC4394.m8917(c4203.m8597(c4208), Boolean.TRUE)) {
            return abstractC3986;
        }
        AbstractC3901.f12098.trace("Sending SSE request " + c8139.f22462);
        c8139.m13565(C3904.f12104, C5175.f14739);
        C5156 c5156 = (C5156) c4203.m8597(AbstractC3906.f12112);
        Boolean bool = (Boolean) c4203.m8597(AbstractC3906.f12111);
        Boolean bool2 = (Boolean) c4203.m8597(AbstractC3906.f12110);
        c4203.m8596(AbstractC8137.f22450, new C8141());
        C8124 c8124Mo8293 = abstractC3986.mo8293();
        if (c8124Mo8293 != null) {
            C8115 c8115 = c8139.f22460;
            String[] strArr = AbstractC8114.f22415;
            String string = c8124Mo8293.toString();
            c8115.getClass();
            string.getClass();
            c8115.mo2402(string);
            List listM2404 = c8115.m2404("Content-Type");
            listM2404.clear();
            listM2404.add(string);
        }
        return new C3903(c5156 != null ? c5156.f14714 : this.$reconnectionTime, bool != null ? bool.booleanValue() : this.$showCommentEvents, bool2 != null ? bool2.booleanValue() : this.$showRetryEvents, abstractC3986);
    }
}
