package io.ktor.client.plugins;

import androidx.activity.AbstractC0900;
import io.ktor.client.statement.AbstractC4778;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2", m556f = "BodyProgress.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "<anonymous>", "(Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;"}, m152k = 3, m153mv = {2, 0, 0})
final class BodyProgressKt$BodyProgress$1$2 extends SuspendLambda implements InterfaceC7383 {
    /* synthetic */ Object L$0;
    int label;

    public BodyProgressKt$BodyProgress$1$2(InterfaceC5189<? super BodyProgressKt$BodyProgress$1$2> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        BodyProgressKt$BodyProgress$1$2 bodyProgressKt$BodyProgress$1$2 = new BodyProgressKt$BodyProgress$1$2(interfaceC5189);
        bodyProgressKt$BodyProgress$1$2.L$0 = obj;
        return bodyProgressKt$BodyProgress$1$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC4778 abstractC4778, InterfaceC5189<? super AbstractC4778> interfaceC5189) {
        return ((BodyProgressKt$BodyProgress$1$2) create(abstractC4778, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        throw AbstractC0900.m719(this.L$0);
    }
}
