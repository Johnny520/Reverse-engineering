package io.ktor.client.engine.cio;

import io.ktor.client.network.sockets.ConnectTimeoutException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.Endpoint", m556f = "Endpoint.kt", m557l = {183}, m558m = "createPipeline")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class Endpoint$createPipeline$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4703 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$createPipeline$1(C4703 c4703, InterfaceC5189<? super Endpoint$createPipeline$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4703;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws FailToConnectException, ConnectTimeoutException {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4703 c4703 = this.this$0;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C4703.f12435;
        c4703.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new Endpoint$createPipeline$1(c4703, this);
        }
        Object objM8816 = this.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM8816);
            this.L$0 = c4703;
            this.label = 1;
            objM8816 = c4703.m8816(this);
            if (objM8816 == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4703 = (C4703) this.L$0;
            AbstractC6017.m10769(objM8816);
        }
        Pair pair = (Pair) objM8816;
        c4703.getClass();
        throw null;
    }
}
