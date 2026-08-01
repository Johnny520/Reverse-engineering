package io.ktor.util.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.util.cio.FileChannelsKt", m556f = "FileChannels.kt", m557l = {142, 178}, m558m = "writeToScope")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class FileChannelsKt$writeToScope$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public FileChannelsKt$writeToScope$1(InterfaceC5189<? super FileChannelsKt$writeToScope$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC5017.m9109(null, null, 0L, 0L, this);
    }
}
