package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.lifecycle.CoroutineLiveData", m556f = "CoroutineLiveData.kt", m557l = {228}, m558m = "clearSource$lifecycle_livedata", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class CoroutineLiveData$clearSource$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC3243 this$0;

    public CoroutineLiveData$clearSource$1(AbstractC3243 abstractC3243, InterfaceC5189<? super CoroutineLiveData$clearSource$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
