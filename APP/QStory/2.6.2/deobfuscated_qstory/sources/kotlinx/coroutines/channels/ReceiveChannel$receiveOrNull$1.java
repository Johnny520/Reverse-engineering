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
@InterfaceC6861(c = "kotlinx.coroutines.channels.ReceiveChannel", f = "Channel.kt", l = {770}, m = "receiveOrNull$suspendImpl", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class ReceiveChannel$receiveOrNull$1<E> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterfaceC5198 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveChannel$receiveOrNull$1(InterfaceC5198 interfaceC5198, InterfaceC4356<? super ReceiveChannel$receiveOrNull$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = interfaceC5198;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo10242;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        InterfaceC5198 interfaceC5198 = this.this$0;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            AbstractC5184.m10206(obj);
            this.L$0 = null;
            this.label = 1;
            objMo10242 = interfaceC5198.mo10242(this);
            if (objMo10242 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            objMo10242 = ((C5201) obj).f14791;
        }
        return C5201.m10268(objMo10242);
    }
}
