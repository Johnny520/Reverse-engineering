package io.ktor.client.plugins;

import androidx.activity.AbstractC0053;
import io.ktor.client.statement.AbstractC3945;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2", f = "BodyProgress.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "<anonymous>", "(Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;"}, k = 3, mv = {2, 0, 0})
final class BodyProgressKt$BodyProgress$1$2 extends SuspendLambda implements InterfaceC6553 {
    /* synthetic */ Object L$0;
    int label;

    public BodyProgressKt$BodyProgress$1$2(InterfaceC4356<? super BodyProgressKt$BodyProgress$1$2> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        BodyProgressKt$BodyProgress$1$2 bodyProgressKt$BodyProgress$1$2 = new BodyProgressKt$BodyProgress$1$2(interfaceC4356);
        bodyProgressKt$BodyProgress$1$2.L$0 = obj;
        return bodyProgressKt$BodyProgress$1$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(AbstractC3945 abstractC3945, InterfaceC4356<? super AbstractC3945> interfaceC4356) {
        return ((BodyProgressKt$BodyProgress$1$2) create(abstractC3945, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5184.m10206(obj);
        throw AbstractC0053.m158(this.L$0);
    }
}
