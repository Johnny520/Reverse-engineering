package io.ktor.client.plugins.websocket;

import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p252.C8920;
import p257.C8969;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1", m556f = "WebSockets.kt", m557l = {164}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class WebSockets$Plugin$install$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ boolean $extensionsSupported;
    final /* synthetic */ AbstractC4741 $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSockets$Plugin$install$1(boolean z, AbstractC4741 abstractC4741, InterfaceC5189<? super WebSockets$Plugin$install$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$extensionsSupported = z;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        WebSockets$Plugin$install$1 webSockets$Plugin$install$1 = new WebSockets$Plugin$install$1(this.$extensionsSupported, null, interfaceC5189);
        webSockets$Plugin$install$1.L$0 = abstractC5026;
        return webSockets$Plugin$install$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
        Object obj2 = abstractC5026.f13009;
        C8920 c8920M14131 = ((C8969) obj2).f22805.m14131();
        c8920M14131.getClass();
        String str = c8920M14131.f22667;
        if (str.equals("ws") || str.equals("wss")) {
            InterfaceC9970 interfaceC9970 = AbstractC4740.f12464;
            if (AbstractC3738.m6854(interfaceC9970)) {
                interfaceC9970.trace("Sending WebSocket request " + ((C8969) obj2).f22805);
            }
            ((C8969) obj2).m14153(C4743.f12467, c6008);
            if (this.$extensionsSupported) {
                int i2 = AbstractC4741.f12465;
                throw null;
            }
            C4742 c4742 = new C4742();
            this.label = 1;
            if (abstractC5026.mo9129(c4742, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            InterfaceC9970 interfaceC99702 = AbstractC4740.f12464;
            if (AbstractC3738.m6854(interfaceC99702)) {
                interfaceC99702.trace("Skipping WebSocket plugin for non-websocket request: " + ((C8969) obj2).f22805);
                return c6008;
            }
        }
        return c6008;
    }
}
