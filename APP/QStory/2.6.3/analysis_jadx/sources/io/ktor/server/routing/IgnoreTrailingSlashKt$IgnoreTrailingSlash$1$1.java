package io.ktor.server.routing;

import io.ktor.server.application.C4070;
import io.ktor.server.application.InterfaceC4065;
import io.ktor.util.C4204;
import io.ktor.util.C4209;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.routing.IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1", f = "IgnoreTrailingSlash.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/server/application/飘花落叶言子楪苏兰哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "call", "<anonymous>", "(Lio/ktor/server/application/飘花落叶言子楪苏兰哲世;Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;)V"}, k = 3, mv = {2, 0, 0})
final class IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1 extends SuspendLambda implements InterfaceC6551 {
    /* synthetic */ Object L$0;
    int label;

    public IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1(InterfaceC4357<? super IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C4070 c4070, InterfaceC4065 interfaceC4065, InterfaceC4357<? super C5176> interfaceC4357) {
        IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1 ignoreTrailingSlashKt$IgnoreTrailingSlash$1$1 = new IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1(interfaceC4357);
        ignoreTrailingSlashKt$IgnoreTrailingSlash$1$1.L$0 = interfaceC4065;
        return ignoreTrailingSlashKt$IgnoreTrailingSlash$1$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        InterfaceC4065 interfaceC4065 = (InterfaceC4065) this.L$0;
        C4209 c4209 = AbstractC4151.f12576;
        C4204 attributes = interfaceC4065.getAttributes();
        C5176 c5176 = C5176.f14739;
        attributes.m8586(c4209, c5176);
        return c5176;
    }
}
