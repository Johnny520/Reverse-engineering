package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.http.cio.ChunkedTransferEncodingKt", f = "ChunkedTransferEncoding.kt", l = {151, 152, 154, 155, 156}, m = "writeChunk")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ChunkedTransferEncodingKt$writeChunk$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ChunkedTransferEncodingKt$writeChunk$1(InterfaceC4357<? super ChunkedTransferEncodingKt$writeChunk$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC3957.m8345(null, null, 0, 0, this);
    }
}
