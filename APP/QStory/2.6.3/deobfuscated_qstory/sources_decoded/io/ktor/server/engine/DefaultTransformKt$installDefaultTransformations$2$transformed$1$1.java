package io.ktor.server.engine;

import io.ktor.http.content.AbstractC3989;
import io.ktor.http.content.C3988;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p236.C8110;
import p236.InterfaceC8094;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/http/content/飘花落叶言子楪哲兰苏世;", "part", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/http/content/飘花落叶言子楪哲兰苏世;)V"}, k = 3, mv = {2, 0, 0})
@InterfaceC6862(c = "io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$2$transformed$1$1", f = "DefaultTransform.kt", l = {}, m = "invokeSuspend")
public final class DefaultTransformKt$installDefaultTransformations$2$transformed$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC8094 $this_build;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformKt$installDefaultTransformations$2$transformed$1$1(InterfaceC8094 interfaceC8094, InterfaceC4357<? super DefaultTransformKt$installDefaultTransformations$2$transformed$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_build = interfaceC8094;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        DefaultTransformKt$installDefaultTransformations$2$transformed$1$1 defaultTransformKt$installDefaultTransformations$2$transformed$1$1 = new DefaultTransformKt$installDefaultTransformations$2$transformed$1$1(this.$this_build, interfaceC4357);
        defaultTransformKt$installDefaultTransformations$2$transformed$1$1.L$0 = obj;
        return defaultTransformKt$installDefaultTransformations$2$transformed$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC3989 abstractC3989, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DefaultTransformKt$installDefaultTransformations$2$transformed$1$1) create(abstractC3989, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        AbstractC3989 abstractC3989 = (AbstractC3989) this.L$0;
        if (abstractC3989 instanceof C3988) {
            C8110 c8110 = (C8110) abstractC3989.f12242.getValue();
            String strM309 = c8110 != null ? c8110.m309("name") : null;
            if (strM309 != null) {
                this.$this_build.mo2423(strM309, ((C3988) abstractC3989).f12241);
            }
        }
        abstractC3989.f12244.invoke();
        return C5176.f14739;
    }
}
