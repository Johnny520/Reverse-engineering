package io.ktor.server.websocket;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.websocket.RoutingKt", f = "Routing.kt", l = {Opcodes.MUL_DOUBLE_2ADDR, Opcodes.DIV_DOUBLE_2ADDR}, m = "handleServerSession")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class RoutingKt$handleServerSession$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public RoutingKt$handleServerSession$1(InterfaceC4357<? super RoutingKt$handleServerSession$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4178.m8543(null, null, null, this);
    }
}
