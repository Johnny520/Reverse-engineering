package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.BufferedChannel", m556f = "BufferedChannel.kt", m557l = {3093}, m558m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6022 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(C6022 c6022, InterfaceC5189<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c6022;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C6022 c6022 = this.this$0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C6022.f15123;
        Object objM10790 = c6022.m10790(null, 0, 0L, this);
        return objM10790 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10790 : new C6034(objM10790);
    }
}
