package io.ktor.server.routing;

import io.ktor.server.application.C4069;
import io.ktor.server.application.InterfaceC4064;
import io.ktor.util.C4203;
import io.ktor.util.C4208;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.routing.IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1", f = "IgnoreTrailingSlash.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/server/application/飘花落叶言子楪苏兰哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "call", "<anonymous>", "(Lio/ktor/server/application/飘花落叶言子楪苏兰哲世;Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;)V"}, k = 3, mv = {2, 0, 0})
final class IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1 extends SuspendLambda implements InterfaceC6550 {
    /* synthetic */ Object L$0;
    int label;

    public IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1(InterfaceC4356<? super IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C4069 c4069, InterfaceC4064 interfaceC4064, InterfaceC4356<? super C5175> interfaceC4356) {
        IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1 ignoreTrailingSlashKt$IgnoreTrailingSlash$1$1 = new IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1(interfaceC4356);
        ignoreTrailingSlashKt$IgnoreTrailingSlash$1$1.L$0 = interfaceC4064;
        return ignoreTrailingSlashKt$IgnoreTrailingSlash$1$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC4064 interfaceC4064 = (InterfaceC4064) this.L$0;
        C4208 c4208 = AbstractC4150.f12572;
        C4203 attributes = interfaceC4064.getAttributes();
        C5175 c5175 = C5175.f14739;
        attributes.m8596(c4208, c5175);
        return c5175;
    }
}
