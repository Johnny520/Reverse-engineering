package io.ktor.util.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.util.cio.FileChannelsKt", f = "FileChannels.kt", l = {142, 178}, m = "writeToScope")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FileChannelsKt$writeToScope$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public FileChannelsKt$writeToScope$1(InterfaceC4357<? super FileChannelsKt$writeToScope$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4185.m8550(null, null, 0L, 0L, this);
    }
}
