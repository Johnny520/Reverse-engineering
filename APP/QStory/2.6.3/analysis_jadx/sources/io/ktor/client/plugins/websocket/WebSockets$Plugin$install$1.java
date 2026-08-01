package io.ktor.client.plugins.websocket;

import com.alibaba.fastjson2.AbstractC2905;
import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p236.C8091;
import p241.C8140;
import p398.InterfaceC9141;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1", f = "WebSockets.kt", l = {164}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class WebSockets$Plugin$install$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ boolean $extensionsSupported;
    final /* synthetic */ AbstractC3909 $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSockets$Plugin$install$1(boolean z, AbstractC3909 abstractC3909, InterfaceC4357<? super WebSockets$Plugin$install$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$extensionsSupported = z;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        WebSockets$Plugin$install$1 webSockets$Plugin$install$1 = new WebSockets$Plugin$install$1(this.$extensionsSupported, null, interfaceC4357);
        webSockets$Plugin$install$1.L$0 = abstractC4194;
        return webSockets$Plugin$install$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
        Object obj2 = abstractC4194.f12664;
        C8091 c8091M13572 = ((C8140) obj2).f22460.m13572();
        c8091M13572.getClass();
        String str = c8091M13572.f22322;
        if (str.equals("ws") || str.equals("wss")) {
            InterfaceC9141 interfaceC9141 = AbstractC3908.f12119;
            if (AbstractC2905.m6294(interfaceC9141)) {
                interfaceC9141.trace("Sending WebSocket request " + ((C8140) obj2).f22460);
            }
            ((C8140) obj2).m13594(C3911.f12122, c5176);
            if (this.$extensionsSupported) {
                int i2 = AbstractC3909.f12120;
                throw null;
            }
            C3910 c3910 = new C3910();
            this.label = 1;
            if (abstractC4194.mo8570(c3910, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            InterfaceC9141 interfaceC91412 = AbstractC3908.f12119;
            if (AbstractC2905.m6294(interfaceC91412)) {
                interfaceC91412.trace("Skipping WebSocket plugin for non-websocket request: " + ((C8140) obj2).f22460);
                return c5176;
            }
        }
        return c5176;
    }
}
