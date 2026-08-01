package io.ktor.server.http.content;

import androidx.compose.runtime.internal.C1245;
import io.ktor.http.content.AbstractC3987;
import io.ktor.http.content.AbstractC3994;
import io.ktor.server.application.InterfaceC4057;
import io.ktor.server.application.hooks.C4051;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6552;
import p063.InterfaceC6862;
import p236.C8099;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.http.content.StaticContentKt$StaticContentAutoHead$1$1", f = "StaticContent.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/server/application/hooks/飘花落叶言子楪世苏兰哲;", "Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;", "call", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/application/hooks/飘花落叶言子楪世苏兰哲;Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;)V"}, k = 3, mv = {2, 0, 0})
final class StaticContentKt$StaticContentAutoHead$1$1 extends SuspendLambda implements InterfaceC6552 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    public StaticContentKt$StaticContentAutoHead$1$1(InterfaceC4357<? super StaticContentKt$StaticContentAutoHead$1$1> interfaceC4357) {
        super(4, interfaceC4357);
    }

    @Override // p052.InterfaceC6552
    public final Object invoke(C4051 c4051, InterfaceC4057 interfaceC4057, AbstractC3987 abstractC3987, InterfaceC4357<? super C5176> interfaceC4357) {
        StaticContentKt$StaticContentAutoHead$1$1 staticContentKt$StaticContentAutoHead$1$1 = new StaticContentKt$StaticContentAutoHead$1$1(interfaceC4357);
        staticContentKt$StaticContentAutoHead$1$1.L$0 = c4051;
        staticContentKt$StaticContentAutoHead$1$1.L$1 = interfaceC4057;
        staticContentKt$StaticContentAutoHead$1$1.L$2 = abstractC3987;
        return staticContentKt$StaticContentAutoHead$1$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C4051 c4051 = (C4051) this.L$0;
        InterfaceC4057 interfaceC4057 = (InterfaceC4057) this.L$1;
        AbstractC3987 abstractC3987 = (AbstractC3987) this.L$2;
        if (!((C8099) ((C1245) interfaceC4057.mo8459().mo378()).f3619).equals(C8099.f22372)) {
            C5925.m11311("Check failed.");
            return null;
        }
        if (abstractC3987 instanceof AbstractC3994) {
            ((AbstractC3994) abstractC3987).mo8286().mo8645(null);
        }
        C4115 c4115 = new C4115(abstractC3987);
        c4051.getClass();
        c4051.f12331.mo8571(c4115);
        return C5176.f14739;
    }
}
