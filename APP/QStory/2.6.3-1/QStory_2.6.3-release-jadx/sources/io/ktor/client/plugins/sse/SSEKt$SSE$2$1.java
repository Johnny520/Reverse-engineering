package io.ktor.client.plugins.sse;

import io.ktor.http.content.AbstractC4819;
import io.ktor.util.C5036;
import io.ktor.util.C5041;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.time.C5989;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p252.AbstractC8944;
import p252.C8945;
import p252.C8954;
import p257.AbstractC8967;
import p257.C8969;
import p257.C8971;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$1", m556f = "SSE.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "content", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;)Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;"}, m152k = 3, m153mv = {2, 0, 0})
final class SSEKt$SSE$2$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ long $reconnectionTime;
    final /* synthetic */ boolean $showCommentEvents;
    final /* synthetic */ boolean $showRetryEvents;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSEKt$SSE$2$1(long j, boolean z, boolean z2, InterfaceC5189<? super SSEKt$SSE$2$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$reconnectionTime = j;
        this.$showCommentEvents = z;
        this.$showRetryEvents = z2;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C8969 c8969, AbstractC4819 abstractC4819, InterfaceC5189<? super AbstractC4819> interfaceC5189) {
        SSEKt$SSE$2$1 sSEKt$SSE$2$1 = new SSEKt$SSE$2$1(this.$reconnectionTime, this.$showCommentEvents, this.$showRetryEvents, interfaceC5189);
        sSEKt$SSE$2$1.L$0 = c8969;
        sSEKt$SSE$2$1.L$1 = abstractC4819;
        return sSEKt$SSE$2$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C8969 c8969 = (C8969) this.L$0;
        AbstractC4819 abstractC4819 = (AbstractC4819) this.L$1;
        C5041 c5041 = AbstractC4739.f12463;
        InterfaceC9970 interfaceC9970 = AbstractC4734.f12448;
        C5036 c5036 = c8969.f22800;
        if (!AbstractC5227.m9466(c5036.m9146(c5041), Boolean.TRUE)) {
            return abstractC4819;
        }
        AbstractC4734.f12448.trace("Sending SSE request " + c8969.f22805);
        c8969.m14153(C4737.f12454, C6008.f15084);
        C5989 c5989 = (C5989) c5036.m9146(AbstractC4739.f12462);
        Boolean bool = (Boolean) c5036.m9146(AbstractC4739.f12461);
        Boolean bool2 = (Boolean) c5036.m9146(AbstractC4739.f12460);
        c5036.m9145(AbstractC8967.f22793, new C8971());
        C8954 c8954Mo8842 = abstractC4819.mo8842();
        if (c8954Mo8842 != null) {
            C8945 c8945 = c8969.f22803;
            String[] strArr = AbstractC8944.f22758;
            String string = c8954Mo8842.toString();
            c8945.getClass();
            string.getClass();
            c8945.mo2972(string);
            List listM2974 = c8945.m2974("Content-Type");
            listM2974.clear();
            listM2974.add(string);
        }
        return new C4736(c5989 != null ? c5989.f15059 : this.$reconnectionTime, bool != null ? bool.booleanValue() : this.$showCommentEvents, bool2 != null ? bool2.booleanValue() : this.$showRetryEvents, abstractC4819);
    }
}
