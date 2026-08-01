package kotlinx.coroutines.flow;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt$associateTo$2", f = "Collection.kt", l = {196}, m = "emit", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
public final class FlowKt__CollectionKt$associateTo$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5308 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectionKt$associateTo$2$emit$1(AbstractC5308 abstractC5308, InterfaceC4356<? super FlowKt__CollectionKt$associateTo$2$emit$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = abstractC5308;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.emit(null, this);
        return C5175.f14739;
    }
}
