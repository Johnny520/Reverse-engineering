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
@InterfaceC6862(c = "kotlinx.coroutines.channels.ReceiveChannel", f = "Channel.kt", l = {770}, m = "receiveOrNull$suspendImpl", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ReceiveChannel$receiveOrNull$1<E> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterfaceC5199 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveChannel$receiveOrNull$1(InterfaceC5199 interfaceC5199, InterfaceC4357<? super ReceiveChannel$receiveOrNull$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = interfaceC5199;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo10247;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        InterfaceC5199 interfaceC5199 = this.this$0;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC5185.m10210(obj);
            this.L$0 = null;
            this.label = 1;
            objMo10247 = interfaceC5199.mo10247(this);
            if (objMo10247 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            objMo10247 = ((C5202) obj).f14791;
        }
        return C5202.m10272(objMo10247);
    }
}
