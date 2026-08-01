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
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ReceiveChannel", m556f = "Channel.kt", m557l = {770}, m558m = "receiveOrNull$suspendImpl", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class ReceiveChannel$receiveOrNull$1<E> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterfaceC6031 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveChannel$receiveOrNull$1(InterfaceC6031 interfaceC6031, InterfaceC5189<? super ReceiveChannel$receiveOrNull$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = interfaceC6031;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo10806;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        InterfaceC6031 interfaceC6031 = this.this$0;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            this.L$0 = null;
            this.label = 1;
            objMo10806 = interfaceC6031.mo10806(this);
            if (objMo10806 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            objMo10806 = ((C6034) obj).f15136;
        }
        return C6034.m10831(objMo10806);
    }
}
