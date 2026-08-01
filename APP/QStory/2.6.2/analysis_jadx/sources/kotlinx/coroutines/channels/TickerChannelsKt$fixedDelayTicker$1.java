package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = {102, 104, 105}, m = "fixedDelayTicker", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TickerChannelsKt$fixedDelayTicker$1(InterfaceC4356<? super TickerChannelsKt$fixedDelayTicker$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC5204.m10277(0L, 0L, null, this);
    }
}
