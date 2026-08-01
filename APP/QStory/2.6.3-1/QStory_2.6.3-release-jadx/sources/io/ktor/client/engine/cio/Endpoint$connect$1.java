package io.ktor.client.engine.cio;

import com.android.p002dx.p005io.Opcodes;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.Endpoint", m556f = "Endpoint.kt", m557l = {Opcodes.ADD_INT_LIT8, Opcodes.MUL_INT_LIT8, 232, 238}, m558m = "connect")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
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
    final /* synthetic */ C4703 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$connect$1(C4703 c4703, InterfaceC5189<? super Endpoint$connect$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4703;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4703 c4703 = this.this$0;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C4703.f12435;
        return c4703.m8816(this);
    }
}
