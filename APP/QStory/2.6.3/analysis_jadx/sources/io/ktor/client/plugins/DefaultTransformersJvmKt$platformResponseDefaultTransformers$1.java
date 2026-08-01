package io.ktor.client.plugins;

import io.ktor.client.call.C3868;
import io.ktor.client.statement.C3945;
import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.utils.io.InterfaceC4252;
import java.io.InputStream;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import p052.InterfaceC6551;
import p059.C6857;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", l = {34}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<destruct>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 extends SuspendLambda implements InterfaceC6551 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(InterfaceC4357<? super DefaultTransformersJvmKt$platformResponseDefaultTransformers$1> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, C3945 c3945, InterfaceC4357<? super C5176> interfaceC4357) {
        DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 defaultTransformersJvmKt$platformResponseDefaultTransformers$1 = new DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(interfaceC4357);
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.L$0 = abstractC4194;
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.L$1 = c3945;
        return defaultTransformersJvmKt$platformResponseDefaultTransformers$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
        C3945 c3945 = (C3945) this.L$1;
        C6857 c6857 = c3945.f12158;
        if (!(c3945.f12157 instanceof InterfaceC4252) || !AbstractC4395.m8907(c6857.f18298, AbstractC4396.f12975.mo8917(InputStream.class))) {
            return c5176;
        }
        ((C3868) abstractC4194.f12664).m8250();
        throw null;
    }
}
