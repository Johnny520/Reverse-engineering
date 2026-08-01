package io.ktor.utils.p007io;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.utils.io.ByteReadChannelOperationsKt", m556f = "ByteReadChannelOperations.kt", m557l = {532, 535, 545, 555, 556}, m558m = "readUntil")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
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

    public ByteReadChannelOperationsKt$readUntil$1(InterfaceC5189<? super ByteReadChannelOperationsKt$readUntil$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC5076.m9221(null, null, null, 0L, false, this);
    }
}
