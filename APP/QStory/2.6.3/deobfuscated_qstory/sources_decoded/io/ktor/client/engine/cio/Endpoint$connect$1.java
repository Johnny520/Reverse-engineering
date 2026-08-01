package io.ktor.client.engine.cio;

import com.android.dx.io.Opcodes;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", l = {Opcodes.ADD_INT_LIT8, Opcodes.MUL_INT_LIT8, 232, 238}, m = "connect")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Endpoint$connect$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3871 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$connect$1(C3871 c3871, InterfaceC4357<? super Endpoint$connect$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c3871;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C3871 c3871 = this.this$0;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3871.f12090;
        return c3871.m8257(this);
    }
}
