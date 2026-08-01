package io.ktor.client.plugins.websocket;

import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p236.C8090;
import p241.C8139;
import p316.C8675;
import p400.InterfaceC9156;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1", f = "WebSockets.kt", l = {164}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class WebSockets$Plugin$install$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ boolean $extensionsSupported;
    final /* synthetic */ AbstractC3908 $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSockets$Plugin$install$1(boolean z, AbstractC3908 abstractC3908, InterfaceC4356<? super WebSockets$Plugin$install$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$extensionsSupported = z;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        WebSockets$Plugin$install$1 webSockets$Plugin$install$1 = new WebSockets$Plugin$install$1(this.$extensionsSupported, null, interfaceC4356);
        webSockets$Plugin$install$1.L$0 = abstractC4193;
        return webSockets$Plugin$install$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
        Object obj2 = abstractC4193.f12660;
        C8090 c8090M13543 = ((C8139) obj2).f22462.m13543();
        c8090M13543.getClass();
        String str = c8090M13543.f22324;
        if (str.equals("ws") || str.equals("wss")) {
            InterfaceC9156 interfaceC9156 = AbstractC3907.f12114;
            if (C8675.m14359(interfaceC9156)) {
                interfaceC9156.trace("Sending WebSocket request " + ((C8139) obj2).f22462);
            }
            ((C8139) obj2).m13565(C3910.f12117, c5175);
            if (this.$extensionsSupported) {
                int i2 = AbstractC3908.f12115;
                throw null;
            }
            C3909 c3909 = new C3909();
            this.label = 1;
            if (abstractC4193.mo8580(c3909, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            InterfaceC9156 interfaceC91562 = AbstractC3907.f12114;
            if (C8675.m14359(interfaceC91562)) {
                interfaceC91562.trace("Skipping WebSocket plugin for non-websocket request: " + ((C8139) obj2).f22462);
                return c5175;
            }
        }
        return c5175;
    }
}
