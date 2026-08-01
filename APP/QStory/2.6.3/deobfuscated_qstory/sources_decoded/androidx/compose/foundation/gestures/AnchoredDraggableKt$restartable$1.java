package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {1578}, m = "restartable", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AnchoredDraggableKt$restartable$1<I> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public AnchoredDraggableKt$restartable$1(InterfaceC4357<? super AnchoredDraggableKt$restartable$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC0521.m1310(null, null, this);
    }
}
