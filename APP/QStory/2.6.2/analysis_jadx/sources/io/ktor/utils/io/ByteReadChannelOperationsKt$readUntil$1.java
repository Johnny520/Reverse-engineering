package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {532, 535, 545, 555, 556}, m = "readUntil")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ByteReadChannelOperationsKt$readUntil$1 extends ContinuationImpl {
    byte B$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$readUntil$1(InterfaceC4356<? super ByteReadChannelOperationsKt$readUntil$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4243.m8672(null, null, null, 0L, false, this);
    }
}
