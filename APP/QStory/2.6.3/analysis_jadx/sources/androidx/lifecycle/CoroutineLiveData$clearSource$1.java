package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {228}, m = "clearSource$lifecycle_livedata", v = 1)
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CoroutineLiveData$clearSource$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC2410 this$0;

    public CoroutineLiveData$clearSource$1(AbstractC2410 abstractC2410, InterfaceC4357<? super CoroutineLiveData$clearSource$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
