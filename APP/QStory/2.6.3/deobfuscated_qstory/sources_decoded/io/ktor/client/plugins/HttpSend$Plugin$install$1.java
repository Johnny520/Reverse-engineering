package io.ktor.client.plugins;

import io.ktor.client.AbstractC3949;
import io.ktor.client.call.C3868;
import io.ktor.http.content.AbstractC3987;
import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.text.AbstractC5145;
import p034.AbstractC6347;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p241.C8140;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", l = {84, 85}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class HttpSend$Plugin$install$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ AbstractC3929 $plugin;
    final /* synthetic */ AbstractC3949 $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public HttpSend$Plugin$install$1(AbstractC3929 abstractC3929, AbstractC3949 abstractC3949, InterfaceC4357<? super HttpSend$Plugin$install$1> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        HttpSend$Plugin$install$1 httpSend$Plugin$install$1 = new HttpSend$Plugin$install$1(null, null, interfaceC4357);
        httpSend$Plugin$install$1.L$0 = abstractC4194;
        httpSend$Plugin$install$1.L$1 = obj;
        return httpSend$Plugin$install$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
                AbstractC5185.m10210(obj);
                this.L$0 = null;
                this.label = 2;
                if (abstractC4194.mo8570((C3868) obj, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 2) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            return C5176.f14739;
        }
        AbstractC5185.m10210(obj);
        AbstractC4194 abstractC41942 = (AbstractC4194) this.L$0;
        Object obj2 = this.L$1;
        if (obj2 instanceof AbstractC3987) {
            C8140 c8140 = (C8140) abstractC41942.f12664;
            c8140.getClass();
            c8140.f22457 = obj2;
            c8140.m13595(null);
            int i2 = AbstractC3929.f12142;
            throw null;
        }
        C5925.m11312(AbstractC5145.m10177("\n|Fail to prepare request body for sending. \n|The body type is: " + AbstractC4396.f12975.mo8917(obj2.getClass()) + ", with Content-Type: " + AbstractC6347.m11909((C8140) abstractC41942.f12664) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."));
        return null;
    }
}
