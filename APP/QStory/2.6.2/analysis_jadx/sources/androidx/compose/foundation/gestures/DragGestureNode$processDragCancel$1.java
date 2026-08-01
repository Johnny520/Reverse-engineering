package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {634}, m = "processDragCancel", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class DragGestureNode$processDragCancel$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC0463 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragCancel$1(AbstractC0463 abstractC0463, InterfaceC4356<? super DragGestureNode$processDragCancel$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = abstractC0463;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC0463.m1209(this.this$0, this);
    }
}
