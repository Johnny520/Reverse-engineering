package io.ktor.server.routing;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.routing.RoutingResolveContext", m556f = "RoutingResolveContext.kt", m557l = {98, 158}, m558m = "handleRoute")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
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
    final /* synthetic */ C4974 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingResolveContext$handleRoute$1(C4974 c4974, InterfaceC5189<? super RoutingResolveContext$handleRoute$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4974;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m9090(null, 0, null, 0.0d, this);
    }
}
