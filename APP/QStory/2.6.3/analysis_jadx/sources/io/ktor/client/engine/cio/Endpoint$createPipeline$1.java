package io.ktor.client.engine.cio;

import io.ktor.client.network.sockets.ConnectTimeoutException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", l = {183}, m = "createPipeline")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Endpoint$createPipeline$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3871 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$createPipeline$1(C3871 c3871, InterfaceC4357<? super Endpoint$createPipeline$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c3871;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws FailToConnectException, ConnectTimeoutException {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C3871 c3871 = this.this$0;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3871.f12090;
        c3871.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new Endpoint$createPipeline$1(c3871, this);
        }
        Object objM8257 = this.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(objM8257);
            this.L$0 = c3871;
            this.label = 1;
            objM8257 = c3871.m8257(this);
            if (objM8257 == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3871 = (C3871) this.L$0;
            AbstractC5185.m10210(objM8257);
        }
        Pair pair = (Pair) objM8257;
        c3871.getClass();
        throw null;
    }
}
