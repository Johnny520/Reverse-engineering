package kotlin.reflect.full;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5109;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final class KCallables$callSuspendBy$1<R> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public KCallables$callSuspendBy$1(InterfaceC4356<? super KCallables$callSuspendBy$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC5093 interfaceC5093 = (InterfaceC5093) this.L$0;
        AbstractC5184.m10206(obj);
        InterfaceC5109 interfaceC5109 = (InterfaceC5109) interfaceC5093;
        return (!AbstractC4394.m8917(interfaceC5109.getReturnType().mo8909(), AbstractC4395.f12971.mo8927(C5175.class)) || interfaceC5109.getReturnType().mo8906()) ? obj : C5175.f14739;
    }
}
