package io.ktor.client.engine.cio;

import com.android.dx.io.Opcodes;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", l = {Opcodes.ADD_INT_LIT8, Opcodes.MUL_INT_LIT8, 232, 238}, m = "connect")
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
    final /* synthetic */ C3870 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$connect$1(C3870 c3870, InterfaceC4356<? super Endpoint$connect$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c3870;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C3870 c3870 = this.this$0;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3870.f12085;
        return c3870.m8270(this);
    }
}
