package io.ktor.client.engine.cio;

import io.ktor.client.network.sockets.ConnectTimeoutException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", l = {183}, m = "createPipeline")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Endpoint$createPipeline$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3870 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$createPipeline$1(C3870 c3870, InterfaceC4356<? super Endpoint$createPipeline$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c3870;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws FailToConnectException, ConnectTimeoutException {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C3870 c3870 = this.this$0;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3870.f12085;
        c3870.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new Endpoint$createPipeline$1(c3870, this);
        }
        Object objM8270 = this.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5184.m10206(objM8270);
            this.L$0 = c3870;
            this.label = 1;
            objM8270 = c3870.m8270(this);
            if (objM8270 == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3870 = (C3870) this.L$0;
            AbstractC5184.m10206(objM8270);
        }
        Pair pair = (Pair) objM8270;
        c3870.getClass();
        throw null;
    }
}
