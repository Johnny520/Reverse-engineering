package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {736}, m = "receiveCatching-JP2dKIU$suspendImpl", v = 1)
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
    final /* synthetic */ C5189 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(C5189 c5189, InterfaceC4356<? super BufferedChannel$receiveCatching$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c5189;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM10216 = C5189.m10216(this.this$0, this);
        return objM10216 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10216 : new C5201(objM10216);
    }
}
