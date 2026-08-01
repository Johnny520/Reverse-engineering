package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {736}, m = "receiveCatching-JP2dKIU$suspendImpl", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5190 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(C5190 c5190, InterfaceC4357<? super BufferedChannel$receiveCatching$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c5190;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM10220 = C5190.m10220(this.this$0, this);
        return objM10220 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10220 : new C5202(objM10220);
    }
}
