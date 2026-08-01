package kotlinx.coroutines.sync;

import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p052.InterfaceC6542;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", l = {81}, m = "withPermit", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
final class SemaphoreKt$withPermit$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public SemaphoreKt$withPermit$1(InterfaceC4356<? super SemaphoreKt$withPermit$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = AbstractC5383.f15003;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new SemaphoreKt$withPermit$1<>(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC5184.m10206(obj2);
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = 0;
            this.label = 1;
            throw null;
        }
        if (i3 != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC6542 interfaceC6542 = (InterfaceC6542) this.L$1;
        Object obj3 = (InterfaceC5377) this.L$0;
        AbstractC5184.m10206(obj2);
        try {
            return interfaceC6542.invoke();
        } finally {
            ((C5384) obj3).m10434();
        }
    }
}
