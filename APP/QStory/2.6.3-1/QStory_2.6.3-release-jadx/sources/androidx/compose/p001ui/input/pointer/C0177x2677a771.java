package androidx.compose.p001ui.input.pointer;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", m556f = "SuspendingPointerInputFilter.kt", m557l = {860}, m558m = "withTimeoutOrNull", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class C0177x2677a771<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2456 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0177x2677a771(C2456 c2456, InterfaceC5189<? super C0177x2677a771> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c2456;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m3560(0L, null, this);
    }
}
