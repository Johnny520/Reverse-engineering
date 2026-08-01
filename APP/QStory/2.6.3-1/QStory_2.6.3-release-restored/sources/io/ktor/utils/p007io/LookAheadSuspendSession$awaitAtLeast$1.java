package io.ktor.utils.p007io;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.LookAheadSuspendSession", m556f = "LookAheadSession.kt", m557l = {39}, m558m = "awaitAtLeast")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class LookAheadSuspendSession$awaitAtLeast$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5072 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookAheadSuspendSession$awaitAtLeast$1(C5072 c5072, InterfaceC5189<? super LookAheadSuspendSession$awaitAtLeast$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c5072;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m9213(0, this);
    }
}
