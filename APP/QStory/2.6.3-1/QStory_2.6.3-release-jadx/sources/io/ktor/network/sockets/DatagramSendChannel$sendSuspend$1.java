package io.ktor.network.sockets;

import io.ktor.network.selector.C4836;
import io.ktor.network.selector.SelectInterest;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.sockets.DatagramSendChannel", m556f = "DatagramSendChannel.kt", m557l = {136}, m558m = "sendSuspend")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class DatagramSendChannel$sendSuspend$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4863 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatagramSendChannel$sendSuspend$1(C4863 c4863, InterfaceC5189<? super DatagramSendChannel$sendSuspend$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4863;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4863 c4863 = this.this$0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4863.f12644;
        c4863.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new DatagramSendChannel$sendSuspend$1(c4863, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            C4836 c4836 = SelectInterest.Companion;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC4855 abstractC4855 = (AbstractC4855) this.L$2;
        C4863 c48632 = (C4863) this.L$0;
        AbstractC6017.m10769(obj2);
        c48632.getClass();
        abstractC4855.getClass();
        throw null;
    }
}
