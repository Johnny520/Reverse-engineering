package io.ktor.network.sockets;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.sockets.ServerSocketImpl", m556f = "ServerSocketImpl.kt", m557l = {41}, m558m = "acceptSuspend")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ServerSocketImpl$acceptSuspend$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4857 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerSocketImpl$acceptSuspend$1(C4857 c4857, InterfaceC5189<? super ServerSocketImpl$acceptSuspend$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4857;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m8990(this);
    }
}
