package io.ktor.network.sockets;

import io.ktor.network.selector.C4003;
import io.ktor.network.selector.SelectInterest;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", l = {136}, m = "sendSuspend")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DatagramSendChannel$sendSuspend$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4030 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatagramSendChannel$sendSuspend$1(C4030 c4030, InterfaceC4356<? super DatagramSendChannel$sendSuspend$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c4030;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4030 c4030 = this.this$0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4030.f12295;
        c4030.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new DatagramSendChannel$sendSuspend$1(c4030, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5184.m10206(obj2);
            C4003 c4003 = SelectInterest.Companion;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC4022 abstractC4022 = (AbstractC4022) this.L$2;
        C4030 c40302 = (C4030) this.L$0;
        AbstractC5184.m10206(obj2);
        c40302.getClass();
        abstractC4022.getClass();
        throw null;
    }
}
