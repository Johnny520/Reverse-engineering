package io.ktor.server.routing;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.routing.RoutingRoot", f = "RoutingRoot.kt", l = {191}, m = "executeResult")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class RoutingRoot$executeResult$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4144 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingRoot$executeResult$1(C4144 c4144, InterfaceC4356<? super RoutingRoot$executeResult$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c4144;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4144 c4144 = this.this$0;
        C4145 c4145 = C4144.f12560;
        return c4144.m8544(null, null, null, this);
    }
}
