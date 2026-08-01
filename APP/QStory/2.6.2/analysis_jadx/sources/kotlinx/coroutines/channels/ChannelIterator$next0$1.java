package kotlinx.coroutines.channels;

import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.channels.ChannelIterator", f = "Channel.kt", l = {1136}, m = "next", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelIterator$next0$1<E> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterfaceC5211 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelIterator$next0$1(InterfaceC5211 interfaceC5211, InterfaceC4356<? super ChannelIterator$next0$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = interfaceC5211;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5211 interfaceC5211;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        InterfaceC5211 interfaceC52112 = this.this$0;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ChannelIterator$next0$1<>(interfaceC52112, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5184.m10206(obj2);
            this.L$0 = interfaceC52112;
            this.label = 1;
            C5190 c5190 = (C5190) interfaceC52112;
            Object objM10260 = c5190.m10260(this);
            if (objM10260 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = objM10260;
            interfaceC5211 = c5190;
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5211 = (InterfaceC5211) this.L$0;
            AbstractC5184.m10206(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            return ((C5190) interfaceC5211).m10258();
        }
        throw new ClosedReceiveChannelException("Channel was closed");
    }
}
