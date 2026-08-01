package io.ktor.server.websocket;

import com.android.p002dx.p005io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.websocket.RoutingKt", m556f = "Routing.kt", m557l = {Opcodes.MUL_DOUBLE_2ADDR, Opcodes.DIV_DOUBLE_2ADDR}, m558m = "handleServerSession")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class RoutingKt$handleServerSession$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public RoutingKt$handleServerSession$1(InterfaceC5189<? super RoutingKt$handleServerSession$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC5010.m9102(null, null, null, this);
    }
}
