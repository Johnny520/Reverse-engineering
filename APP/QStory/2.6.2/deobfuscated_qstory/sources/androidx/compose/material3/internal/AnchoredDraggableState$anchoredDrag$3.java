package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {564}, m = "anchoredDrag")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AnchoredDraggableState$anchoredDrag$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC1117 this$0;

    public AnchoredDraggableState$anchoredDrag$3(AbstractC1117 abstractC1117, InterfaceC4356<? super AnchoredDraggableState$anchoredDrag$3> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
