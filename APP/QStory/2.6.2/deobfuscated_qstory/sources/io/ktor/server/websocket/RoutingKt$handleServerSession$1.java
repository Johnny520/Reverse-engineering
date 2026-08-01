package io.ktor.server.websocket;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.websocket.RoutingKt", f = "Routing.kt", l = {Opcodes.MUL_DOUBLE_2ADDR, Opcodes.DIV_DOUBLE_2ADDR}, m = "handleServerSession")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class RoutingKt$handleServerSession$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public RoutingKt$handleServerSession$1(InterfaceC4356<? super RoutingKt$handleServerSession$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4177.m8553(null, null, null, this);
    }
}
