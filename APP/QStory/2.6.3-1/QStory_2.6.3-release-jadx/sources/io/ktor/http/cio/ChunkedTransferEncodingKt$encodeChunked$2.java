package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.http.cio.ChunkedTransferEncodingKt", m556f = "ChunkedTransferEncoding.kt", m557l = {162, 122, 127, 133, 133}, m558m = "encodeChunked")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ChunkedTransferEncodingKt$encodeChunked$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    public ChunkedTransferEncodingKt$encodeChunked$2(InterfaceC5189<? super ChunkedTransferEncodingKt$encodeChunked$2> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4789.m8901(null, null, this);
    }
}
