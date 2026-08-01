package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.internal.AnchoredDraggableKt", m556f = "AnchoredDraggable.kt", m557l = {706}, m558m = "restartable")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class AnchoredDraggableKt$restartable$1<I> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public AnchoredDraggableKt$restartable$1(InterfaceC5189<? super AnchoredDraggableKt$restartable$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC1955.m2574(null, null, this);
    }
}
