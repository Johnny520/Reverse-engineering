package io.ktor.server.http.content;

import androidx.compose.runtime.internal.C1245;
import io.ktor.http.content.AbstractC3986;
import io.ktor.http.content.AbstractC3993;
import io.ktor.server.application.InterfaceC4056;
import io.ktor.server.application.hooks.C4050;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6861;
import p236.C8098;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.http.content.StaticContentKt$StaticContentAutoHead$1$1", f = "StaticContent.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/server/application/hooks/飘花落叶言子楪世苏兰哲;", "Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;", "call", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/application/hooks/飘花落叶言子楪世苏兰哲;Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;)V"}, k = 3, mv = {2, 0, 0})
final class StaticContentKt$StaticContentAutoHead$1$1 extends SuspendLambda implements InterfaceC6551 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    public StaticContentKt$StaticContentAutoHead$1$1(InterfaceC4356<? super StaticContentKt$StaticContentAutoHead$1$1> interfaceC4356) {
        super(4, interfaceC4356);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C4050 c4050, InterfaceC4056 interfaceC4056, AbstractC3986 abstractC3986, InterfaceC4356<? super C5175> interfaceC4356) {
        StaticContentKt$StaticContentAutoHead$1$1 staticContentKt$StaticContentAutoHead$1$1 = new StaticContentKt$StaticContentAutoHead$1$1(interfaceC4356);
        staticContentKt$StaticContentAutoHead$1$1.L$0 = c4050;
        staticContentKt$StaticContentAutoHead$1$1.L$1 = interfaceC4056;
        staticContentKt$StaticContentAutoHead$1$1.L$2 = abstractC3986;
        return staticContentKt$StaticContentAutoHead$1$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C4050 c4050 = (C4050) this.L$0;
        InterfaceC4056 interfaceC4056 = (InterfaceC4056) this.L$1;
        AbstractC3986 abstractC3986 = (AbstractC3986) this.L$2;
        if (!((C8098) ((C1245) interfaceC4056.mo8469().mo377()).f3618).equals(C8098.f22374)) {
            C5919.m11250("Check failed.");
            return null;
        }
        if (abstractC3986 instanceof AbstractC3993) {
            ((AbstractC3993) abstractC3986).mo8296().mo8655(null);
        }
        C4114 c4114 = new C4114(abstractC3986);
        c4050.getClass();
        c4050.f12327.mo8581(c4114);
        return C5175.f14739;
    }
}
