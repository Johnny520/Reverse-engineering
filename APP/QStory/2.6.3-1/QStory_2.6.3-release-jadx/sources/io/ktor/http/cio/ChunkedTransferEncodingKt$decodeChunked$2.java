package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.http.cio.ChunkedTransferEncodingKt", m556f = "ChunkedTransferEncoding.kt", m557l = {64, 74, 75, 80, 94, 94}, m558m = "decodeChunked")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ChunkedTransferEncodingKt$decodeChunked$2 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ChunkedTransferEncodingKt$decodeChunked$2(InterfaceC5189<? super ChunkedTransferEncodingKt$decodeChunked$2> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4789.m8903(null, null, this);
    }
}
