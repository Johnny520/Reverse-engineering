package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = {102, 104, 105}, m = "fixedDelayTicker", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TickerChannelsKt$fixedDelayTicker$1(InterfaceC4357<? super TickerChannelsKt$fixedDelayTicker$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC5205.m10281(0L, 0L, null, this);
    }
}
