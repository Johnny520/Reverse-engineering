package io.ktor.server.engine;

import io.ktor.http.content.AbstractC3988;
import io.ktor.http.content.C3987;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p236.C8109;
import p236.InterfaceC8093;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/http/content/飘花落叶言子楪哲兰苏世;", "part", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/http/content/飘花落叶言子楪哲兰苏世;)V"}, k = 3, mv = {2, 0, 0})
@InterfaceC6861(c = "io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$2$transformed$1$1", f = "DefaultTransform.kt", l = {}, m = "invokeSuspend")
public final class DefaultTransformKt$installDefaultTransformations$2$transformed$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC8093 $this_build;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformKt$installDefaultTransformations$2$transformed$1$1(InterfaceC8093 interfaceC8093, InterfaceC4356<? super DefaultTransformKt$installDefaultTransformations$2$transformed$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_build = interfaceC8093;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        DefaultTransformKt$installDefaultTransformations$2$transformed$1$1 defaultTransformKt$installDefaultTransformations$2$transformed$1$1 = new DefaultTransformKt$installDefaultTransformations$2$transformed$1$1(this.$this_build, interfaceC4356);
        defaultTransformKt$installDefaultTransformations$2$transformed$1$1.L$0 = obj;
        return defaultTransformKt$installDefaultTransformations$2$transformed$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(AbstractC3988 abstractC3988, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DefaultTransformKt$installDefaultTransformations$2$transformed$1$1) create(abstractC3988, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        AbstractC3988 abstractC3988 = (AbstractC3988) this.L$0;
        if (abstractC3988 instanceof C3987) {
            C8109 c8109 = (C8109) abstractC3988.f12238.getValue();
            String strM308 = c8109 != null ? c8109.m308("name") : null;
            if (strM308 != null) {
                this.$this_build.mo2413(strM308, ((C3987) abstractC3988).f12237);
            }
        }
        abstractC3988.f12240.invoke();
        return C5175.f14739;
    }
}
