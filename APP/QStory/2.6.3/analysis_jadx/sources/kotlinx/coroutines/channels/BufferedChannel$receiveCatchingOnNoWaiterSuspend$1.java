package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3093}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5190 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(C5190 c5190, InterfaceC4357<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c5190;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C5190 c5190 = this.this$0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C5190.f14778;
        Object objM10231 = c5190.m10231(null, 0, 0L, this);
        return objM10231 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10231 : new C5202(objM10231);
    }
}
