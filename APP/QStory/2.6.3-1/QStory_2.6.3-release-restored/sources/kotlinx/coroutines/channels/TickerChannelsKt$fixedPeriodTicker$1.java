package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.TickerChannelsKt", m556f = "TickerChannels.kt", m557l = {80, 84, 90, 92}, m558m = "fixedPeriodTicker", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class TickerChannelsKt$fixedPeriodTicker$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    long J$4;
    long J$5;
    long J$6;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TickerChannelsKt$fixedPeriodTicker$1(InterfaceC5189<? super TickerChannelsKt$fixedPeriodTicker$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC6037.m10839(0L, 0L, null, this);
    }
}
