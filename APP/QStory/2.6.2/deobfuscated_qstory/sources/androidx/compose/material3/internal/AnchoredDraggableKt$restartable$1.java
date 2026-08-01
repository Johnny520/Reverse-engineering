package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {706}, m = "restartable")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AnchoredDraggableKt$restartable$1<I> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public AnchoredDraggableKt$restartable$1(InterfaceC4356<? super AnchoredDraggableKt$restartable$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC1120.m2004(null, null, this);
    }
}
