package io.ktor.client.plugins;

import io.ktor.client.call.C3867;
import io.ktor.client.statement.C3944;
import io.ktor.util.pipeline.AbstractC4193;
import io.ktor.utils.io.InterfaceC4251;
import java.io.InputStream;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6550;
import p059.C6856;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", l = {34}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<destruct>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 extends SuspendLambda implements InterfaceC6550 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(InterfaceC4356<? super DefaultTransformersJvmKt$platformResponseDefaultTransformers$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, C3944 c3944, InterfaceC4356<? super C5175> interfaceC4356) {
        DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 defaultTransformersJvmKt$platformResponseDefaultTransformers$1 = new DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(interfaceC4356);
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.L$0 = abstractC4193;
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.L$1 = c3944;
        return defaultTransformersJvmKt$platformResponseDefaultTransformers$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
        C3944 c3944 = (C3944) this.L$1;
        C6856 c6856 = c3944.f12154;
        if (!(c3944.f12153 instanceof InterfaceC4251) || !AbstractC4394.m8917(c6856.f18303, AbstractC4395.f12971.mo8927(InputStream.class))) {
            return c5175;
        }
        ((C3867) abstractC4193.f12660).m8263();
        throw null;
    }
}
