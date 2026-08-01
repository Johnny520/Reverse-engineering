package kotlinx.coroutines.channels;

import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelIterator", f = "Channel.kt", l = {1136}, m = "next", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelIterator$next0$1<E> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterfaceC5212 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelIterator$next0$1(InterfaceC5212 interfaceC5212, InterfaceC4357<? super ChannelIterator$next0$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = interfaceC5212;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5212 interfaceC5212;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        InterfaceC5212 interfaceC52122 = this.this$0;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ChannelIterator$next0$1<>(interfaceC52122, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj2);
            this.L$0 = interfaceC52122;
            this.label = 1;
            C5191 c5191 = (C5191) interfaceC52122;
            Object objM10264 = c5191.m10264(this);
            if (objM10264 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = objM10264;
            interfaceC5212 = c5191;
        } else {
            if (i2 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5212 = (InterfaceC5212) this.L$0;
            AbstractC5185.m10210(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            return ((C5191) interfaceC5212).m10262();
        }
        throw new ClosedReceiveChannelException("Channel was closed");
    }
}
