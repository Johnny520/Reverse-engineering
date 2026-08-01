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
@InterfaceC6862(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", l = {121}, m = "withLock", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
final class MutexKt$withLock$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public MutexKt$withLock$1(InterfaceC4357<? super MutexKt$withLock$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new MutexKt$withLock$1<>(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = 0;
            this.label = 1;
            throw null;
        }
        if (i2 != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC6543 interfaceC6543 = (InterfaceC6543) this.L$2;
        Object obj3 = this.L$1;
        InterfaceC5383 interfaceC5383 = (InterfaceC5383) this.L$0;
        AbstractC5185.m10210(obj2);
        try {
            return interfaceC6543.invoke();
        } finally {
            ((C5380) interfaceC5383).m10432(obj3);
        }
    }
}
