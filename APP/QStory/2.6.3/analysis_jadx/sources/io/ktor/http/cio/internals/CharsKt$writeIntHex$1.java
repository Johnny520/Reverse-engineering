package io.ktor.http.cio.internals;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.http.cio.internals.CharsKt", f = "Chars.kt", l = {108, 116}, m = "writeIntHex")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CharsKt$writeIntHex$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public CharsKt$writeIntHex$1(InterfaceC4357<? super CharsKt$writeIntHex$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC3950.m8328(null, 0, this);
    }
}
