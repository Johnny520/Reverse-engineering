package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m556f = "Channels.kt", m557l = {32, 33}, m558m = "emitAllImpl$FlowKt__ChannelsKt", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public FlowKt__ChannelsKt$emitAllImpl$1(InterfaceC5189<? super FlowKt__ChannelsKt$emitAllImpl$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC6154.m10897(null, null, false, this);
    }
}
