package io.ktor.server.routing;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.routing.RoutingResolveContext", f = "RoutingResolveContext.kt", l = {98, 158}, m = "handleRoute")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class RoutingResolveContext$handleRoute$1 extends ContinuationImpl {
    double D$0;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4141 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingResolveContext$handleRoute$1(C4141 c4141, InterfaceC4356<? super RoutingResolveContext$handleRoute$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c4141;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m8541(null, 0, null, 0.0d, this);
    }
}
