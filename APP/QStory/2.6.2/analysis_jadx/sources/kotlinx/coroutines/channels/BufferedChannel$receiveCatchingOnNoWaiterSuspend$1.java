package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3093}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5189 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(C5189 c5189, InterfaceC4356<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c5189;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C5189 c5189 = this.this$0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C5189.f14778;
        Object objM10227 = c5189.m10227(null, 0, 0L, this);
        return objM10227 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10227 : new C5201(objM10227);
    }
}
