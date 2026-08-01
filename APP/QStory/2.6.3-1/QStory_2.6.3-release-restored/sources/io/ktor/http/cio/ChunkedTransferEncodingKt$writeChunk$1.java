package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.http.cio.ChunkedTransferEncodingKt", m556f = "ChunkedTransferEncoding.kt", m557l = {151, 152, 154, 155, 156}, m558m = "writeChunk")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ChunkedTransferEncodingKt$writeChunk$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ChunkedTransferEncodingKt$writeChunk$1(InterfaceC5189<? super ChunkedTransferEncodingKt$writeChunk$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4789.m8904(null, null, 0, 0, this);
    }
}
