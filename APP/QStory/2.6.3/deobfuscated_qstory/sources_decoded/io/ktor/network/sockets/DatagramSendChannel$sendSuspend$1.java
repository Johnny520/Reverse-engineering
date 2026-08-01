package io.ktor.network.sockets;

import io.ktor.network.selector.C4004;
import io.ktor.network.selector.SelectInterest;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", l = {136}, m = "sendSuspend")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DatagramSendChannel$sendSuspend$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4031 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatagramSendChannel$sendSuspend$1(C4031 c4031, InterfaceC4357<? super DatagramSendChannel$sendSuspend$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c4031;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4031 c4031 = this.this$0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4031.f12299;
        c4031.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new DatagramSendChannel$sendSuspend$1(c4031, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj2);
            C4004 c4004 = SelectInterest.Companion;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC4023 abstractC4023 = (AbstractC4023) this.L$2;
        C4031 c40312 = (C4031) this.L$0;
        AbstractC5185.m10210(obj2);
        c40312.getClass();
        abstractC4023.getClass();
        throw null;
    }
}
