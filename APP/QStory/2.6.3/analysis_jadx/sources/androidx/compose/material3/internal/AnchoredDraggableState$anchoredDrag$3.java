package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {564}, m = "anchoredDrag")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AnchoredDraggableState$anchoredDrag$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC1117 this$0;

    public AnchoredDraggableState$anchoredDrag$3(AbstractC1117 abstractC1117, InterfaceC4357<? super AnchoredDraggableState$anchoredDrag$3> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
