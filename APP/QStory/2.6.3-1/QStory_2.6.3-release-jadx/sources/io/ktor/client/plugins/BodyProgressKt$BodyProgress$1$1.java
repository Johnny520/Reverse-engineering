package io.ktor.client.plugins;

import com.alibaba.fastjson2.C3775;
import io.ktor.http.content.AbstractC4819;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p257.C8969;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1", m556f = "BodyProgress.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "content", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;)Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;"}, m152k = 3, m153mv = {2, 0, 0})
final class BodyProgressKt$BodyProgress$1$1 extends SuspendLambda implements InterfaceC7380 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public BodyProgressKt$BodyProgress$1$1(InterfaceC5189<? super BodyProgressKt$BodyProgress$1$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C8969 c8969, AbstractC4819 abstractC4819, InterfaceC5189<? super AbstractC4819> interfaceC5189) {
        BodyProgressKt$BodyProgress$1$1 bodyProgressKt$BodyProgress$1$1 = new BodyProgressKt$BodyProgress$1$1(interfaceC5189);
        bodyProgressKt$BodyProgress$1$1.L$0 = c8969;
        bodyProgressKt$BodyProgress$1$1.L$1 = abstractC4819;
        return bodyProgressKt$BodyProgress$1$1.invokeSuspend(C6008.f15084);
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
        if (c8969.f22800.m9146(AbstractC4755.f12482) == null) {
            return null;
        }
        C3775.m6954();
        return null;
    }
}
