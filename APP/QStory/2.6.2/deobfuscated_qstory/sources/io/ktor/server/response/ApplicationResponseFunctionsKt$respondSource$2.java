package io.ktor.server.response;

import io.ktor.utils.io.AbstractC4243;
import io.ktor.utils.io.AbstractC4245;
import io.ktor.utils.io.C4244;
import io.ktor.utils.io.C4248;
import io.ktor.utils.io.InterfaceC4246;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.io.InterfaceC5473;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.response.ApplicationResponseFunctionsKt$respondSource$2", f = "ApplicationResponseFunctions.kt", l = {168}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;)V"}, k = 3, mv = {2, 0, 0})
final class ApplicationResponseFunctionsKt$respondSource$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5473 $source;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationResponseFunctionsKt$respondSource$2(InterfaceC5473 interfaceC5473, InterfaceC4356<? super ApplicationResponseFunctionsKt$respondSource$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$source = interfaceC5473;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ApplicationResponseFunctionsKt$respondSource$2 applicationResponseFunctionsKt$respondSource$2 = new ApplicationResponseFunctionsKt$respondSource$2(this.$source, interfaceC4356);
        applicationResponseFunctionsKt$respondSource$2.L$0 = obj;
        return applicationResponseFunctionsKt$respondSource$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC4246 interfaceC4246, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ApplicationResponseFunctionsKt$respondSource$2) create(interfaceC4246, interfaceC4356)).invokeSuspend(C5175.f14739);
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
        InterfaceC4246 interfaceC4246 = (InterfaceC4246) this.L$0;
        InterfaceC5473 interfaceC5473 = this.$source;
        this.label = 1;
        C4244 c4244 = AbstractC4245.f12750;
        C4248 c4248 = (C4248) interfaceC4246;
        c4248.m8712().m10609(interfaceC5473);
        Object objM8696 = AbstractC4243.m8696(c4248, this);
        if (objM8696 != coroutineSingletons) {
            objM8696 = c5175;
        }
        return objM8696 == coroutineSingletons ? coroutineSingletons : c5175;
    }
}
