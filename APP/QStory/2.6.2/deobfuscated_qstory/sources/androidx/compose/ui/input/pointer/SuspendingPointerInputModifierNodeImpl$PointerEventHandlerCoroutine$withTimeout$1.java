package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {890}, m = "withTimeout", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C1621 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(C1621 c1621, InterfaceC4356<? super SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c1621;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m2991(0L, null, this);
    }
}
