package io.ktor.server.routing;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.routing.OrRouteSelector", m556f = "RouteSelector.kt", m557l = {460, 464}, m558m = "evaluate")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class OrRouteSelector$evaluate$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4982 this$0;

    public OrRouteSelector$evaluate$1(AbstractC4982 abstractC4982, InterfaceC5189<? super OrRouteSelector$evaluate$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
