package io.ktor.server.cio;

import io.ktor.server.engine.InterfaceC4093;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.cio.CIOApplicationEngine$start$1", f = "CIOApplicationEngine.kt", l = {79}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lio/ktor/server/engine/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lio/ktor/server/engine/飘花落叶言子楪世苏哲兰;"}, k = 3, mv = {2, 0, 0})
final class CIOApplicationEngine$start$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ boolean $wait;
    int label;
    final /* synthetic */ C4080 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$start$1(C4080 c4080, boolean z, InterfaceC4356<? super CIOApplicationEngine$start$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c4080;
        this.$wait = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new CIOApplicationEngine$start$1(this.this$0, this.$wait, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super InterfaceC4093> interfaceC4356) {
        return ((CIOApplicationEngine$start$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return obj;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C4080 c4080 = this.this$0;
        boolean z = this.$wait;
        this.label = 1;
        Object objM8491 = c4080.m8491(z, this);
        return objM8491 == coroutineSingletons ? coroutineSingletons : objM8491;
    }
}
