package kotlinx.coroutines.channels;

import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelIterator", m556f = "Channel.kt", m557l = {1136}, m558m = "next", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class ChannelIterator$next0$1<E> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterfaceC6044 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelIterator$next0$1(InterfaceC6044 interfaceC6044, InterfaceC5189<? super ChannelIterator$next0$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = interfaceC6044;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6044 interfaceC6044;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        InterfaceC6044 interfaceC60442 = this.this$0;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ChannelIterator$next0$1<>(interfaceC60442, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            this.L$0 = interfaceC60442;
            this.label = 1;
            C6023 c6023 = (C6023) interfaceC60442;
            Object objM10823 = c6023.m10823(this);
            if (objM10823 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = objM10823;
            interfaceC6044 = c6023;
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC6044 = (InterfaceC6044) this.L$0;
            AbstractC6017.m10769(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            return ((C6023) interfaceC6044).m10821();
        }
        throw new ClosedReceiveChannelException("Channel was closed");
    }
}
