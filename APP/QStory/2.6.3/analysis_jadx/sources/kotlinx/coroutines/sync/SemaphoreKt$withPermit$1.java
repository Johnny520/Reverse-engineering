package kotlinx.coroutines.sync;

import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p052.InterfaceC6543;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", l = {81}, m = "withPermit", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
final class SemaphoreKt$withPermit$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public SemaphoreKt$withPermit$1(InterfaceC4357<? super SemaphoreKt$withPermit$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = AbstractC5384.f15003;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new SemaphoreKt$withPermit$1<>(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC5185.m10210(obj2);
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = 0;
            this.label = 1;
            throw null;
        }
        if (i3 != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC6543 interfaceC6543 = (InterfaceC6543) this.L$1;
        Object obj3 = (InterfaceC5378) this.L$0;
        AbstractC5185.m10210(obj2);
        try {
            return interfaceC6543.invoke();
        } finally {
            ((C5385) obj3).m10438();
        }
    }
}
