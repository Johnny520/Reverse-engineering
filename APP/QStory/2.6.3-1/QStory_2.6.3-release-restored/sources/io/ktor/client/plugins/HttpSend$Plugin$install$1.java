package io.ktor.client.plugins;

import io.ktor.client.AbstractC4781;
import io.ktor.client.call.C4700;
import io.ktor.http.content.AbstractC4819;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.text.AbstractC5977;
import p050.AbstractC7176;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p257.C8969;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", m556f = "HttpSend.kt", m557l = {84, 85}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpSend$Plugin$install$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ AbstractC4761 $plugin;
    final /* synthetic */ AbstractC4781 $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public HttpSend$Plugin$install$1(AbstractC4761 abstractC4761, AbstractC4781 abstractC4781, InterfaceC5189<? super HttpSend$Plugin$install$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        HttpSend$Plugin$install$1 httpSend$Plugin$install$1 = new HttpSend$Plugin$install$1(null, null, interfaceC5189);
        httpSend$Plugin$install$1.L$0 = abstractC5026;
        httpSend$Plugin$install$1.L$1 = obj;
        return httpSend$Plugin$install$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                this.L$0 = null;
                this.label = 2;
                if (abstractC5026.mo9129((C4700) obj, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            return C6008.f15084;
        }
        AbstractC6017.m10769(obj);
        AbstractC5026 abstractC50262 = (AbstractC5026) this.L$0;
        Object obj2 = this.L$1;
        if (obj2 instanceof AbstractC4819) {
            C8969 c8969 = (C8969) abstractC50262.f13009;
            c8969.getClass();
            c8969.f22802 = obj2;
            c8969.m14154(null);
            int i2 = AbstractC4761.f12487;
            throw null;
        }
        C6755.m11871(AbstractC5977.m10736("\n|Fail to prepare request body for sending. \n|The body type is: " + AbstractC5228.f13320.mo9476(obj2.getClass()) + ", with Content-Type: " + AbstractC7176.m12468((C8969) abstractC50262.f13009) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."));
        return null;
    }
}
