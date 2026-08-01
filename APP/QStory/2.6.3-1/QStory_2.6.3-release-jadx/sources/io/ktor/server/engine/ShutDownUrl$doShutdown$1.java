package io.ktor.server.engine;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.ShutDownUrl", m556f = "ShutDownUrl.kt", m557l = {107}, m558m = "doShutdown")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ShutDownUrl$doShutdown$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4929 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShutDownUrl$doShutdown$1(C4929 c4929, InterfaceC5189<? super ShutDownUrl$doShutdown$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4929;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m9058(null, this);
    }
}
