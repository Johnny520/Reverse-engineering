package io.ktor.client.plugins;

import io.ktor.client.AbstractC3948;
import io.ktor.client.call.C3867;
import io.ktor.http.content.AbstractC3986;
import io.ktor.util.pipeline.AbstractC4193;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import p000.AbstractC6087;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p241.C8139;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", l = {84, 85}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class HttpSend$Plugin$install$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ AbstractC3928 $plugin;
    final /* synthetic */ AbstractC3948 $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public HttpSend$Plugin$install$1(AbstractC3928 abstractC3928, AbstractC3948 abstractC3948, InterfaceC4356<? super HttpSend$Plugin$install$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        HttpSend$Plugin$install$1 httpSend$Plugin$install$1 = new HttpSend$Plugin$install$1(null, null, interfaceC4356);
        httpSend$Plugin$install$1.L$0 = abstractC4193;
        httpSend$Plugin$install$1.L$1 = obj;
        return httpSend$Plugin$install$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
                AbstractC5184.m10206(obj);
                this.L$0 = null;
                this.label = 2;
                if (abstractC4193.mo8580((C3867) obj, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 2) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
            }
            return C5175.f14739;
        }
        AbstractC5184.m10206(obj);
        AbstractC4193 abstractC41932 = (AbstractC4193) this.L$0;
        Object obj2 = this.L$1;
        if (obj2 instanceof AbstractC3986) {
            C8139 c8139 = (C8139) abstractC41932.f12660;
            c8139.getClass();
            c8139.f22459 = obj2;
            c8139.m13566(null);
            int i2 = AbstractC3928.f12137;
            throw null;
        }
        C5919.m11251(AbstractC5144.m10173("\n|Fail to prepare request body for sending. \n|The body type is: " + AbstractC4395.f12971.mo8927(obj2.getClass()) + ", with Content-Type: " + AbstractC6087.m11413((C8139) abstractC41932.f12660) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."));
        return null;
    }
}
