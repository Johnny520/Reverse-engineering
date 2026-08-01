package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {450, 453}, m = "doSelectSuspend", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class SelectImplementation$doSelectSuspend$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5369 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$doSelectSuspend$1(C5369 c5369, InterfaceC4357<? super SelectImplementation$doSelectSuspend$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c5369;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C5369 c5369 = this.this$0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5369.f14964;
        return c5369.m10423(this);
    }
}
