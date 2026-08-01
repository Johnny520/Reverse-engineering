package io.ktor.utils.io;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ByteWriteChannelOperationsKt$close$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public ByteWriteChannelOperationsKt$close$1(Object obj) {
        super(1, obj, InterfaceC4247.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<? super C5176> interfaceC4357) {
        return ((C4249) ((InterfaceC4247) this.receiver)).m8704(interfaceC4357);
    }
}
