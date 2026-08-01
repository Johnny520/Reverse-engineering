package io.ktor.server.http.content;

import androidx.compose.runtime.internal.C2080;
import io.ktor.http.content.AbstractC4819;
import io.ktor.http.content.AbstractC4826;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.server.application.hooks.C4883;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7381;
import p079.InterfaceC7691;
import p252.C8928;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.http.content.StaticContentKt$StaticContentAutoHead$1$1", m556f = "StaticContent.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m151d2 = {"Lio/ktor/server/application/hooks/飘花落叶言子楪世苏兰哲;", "Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;", "call", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/application/hooks/飘花落叶言子楪世苏兰哲;Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class StaticContentKt$StaticContentAutoHead$1$1 extends SuspendLambda implements InterfaceC7381 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    public StaticContentKt$StaticContentAutoHead$1$1(InterfaceC5189<? super StaticContentKt$StaticContentAutoHead$1$1> interfaceC5189) {
        super(4, interfaceC5189);
    }

    @Override // p068.InterfaceC7381
    public final Object invoke(C4883 c4883, InterfaceC4889 interfaceC4889, AbstractC4819 abstractC4819, InterfaceC5189<? super C6008> interfaceC5189) {
        StaticContentKt$StaticContentAutoHead$1$1 staticContentKt$StaticContentAutoHead$1$1 = new StaticContentKt$StaticContentAutoHead$1$1(interfaceC5189);
        staticContentKt$StaticContentAutoHead$1$1.L$0 = c4883;
        staticContentKt$StaticContentAutoHead$1$1.L$1 = interfaceC4889;
        staticContentKt$StaticContentAutoHead$1$1.L$2 = abstractC4819;
        return staticContentKt$StaticContentAutoHead$1$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C4883 c4883 = (C4883) this.L$0;
        InterfaceC4889 interfaceC4889 = (InterfaceC4889) this.L$1;
        AbstractC4819 abstractC4819 = (AbstractC4819) this.L$2;
        if (!((C8928) ((C2080) interfaceC4889.mo9018().mo938()).f3964).equals(C8928.f22717)) {
            C6755.m11870("Check failed.");
            return null;
        }
        if (abstractC4819 instanceof AbstractC4826) {
            ((AbstractC4826) abstractC4819).mo8845().mo9204(null);
        }
        C4947 c4947 = new C4947(abstractC4819);
        c4883.getClass();
        c4883.f12676.mo9130(c4947);
        return C6008.f15084;
    }
}
