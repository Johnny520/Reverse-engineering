package io.ktor.utils.io.jvm.javaio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel", f = "Reading.kt", l = {65}, m = "awaitContent")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class RawSourceChannel$awaitContent$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4222 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawSourceChannel$awaitContent$1(C4222 c4222, InterfaceC4357<? super RawSourceChannel$awaitContent$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c4222;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8642(0, this);
    }
}
