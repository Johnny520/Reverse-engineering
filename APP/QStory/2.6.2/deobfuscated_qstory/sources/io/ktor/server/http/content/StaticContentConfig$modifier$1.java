package io.ktor.server.http.content;

import io.ktor.server.application.InterfaceC4056;
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
@InterfaceC6861(c = "io.ktor.server.http.content.StaticContentConfig$modifier$1", f = "StaticContent.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"", "Resource", "<unused var>", "Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class StaticContentConfig$modifier$1 extends SuspendLambda implements InterfaceC6550 {
    int label;

    public StaticContentConfig$modifier$1(InterfaceC4356<? super StaticContentConfig$modifier$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(Object obj, InterfaceC4056 interfaceC4056, InterfaceC4356<? super C5175> interfaceC4356) {
        return new StaticContentConfig$modifier$1(interfaceC4356).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC5184.m10206(obj);
            return C5175.f14739;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
