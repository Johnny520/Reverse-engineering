package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {450, 453}, m = "doSelectSuspend", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class SelectImplementation$doSelectSuspend$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5368 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$doSelectSuspend$1(C5368 c5368, InterfaceC4356<? super SelectImplementation$doSelectSuspend$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c5368;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C5368 c5368 = this.this$0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5368.f14964;
        return c5368.m10419(this);
    }
}
