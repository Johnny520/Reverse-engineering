package kotlinx.coroutines.flow;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt$groupByTo$4", f = "Collection.kt", l = {358, 360}, m = "emit", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
public final class FlowKt__CollectionKt$groupByTo$4$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5253 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectionKt$groupByTo$4$emit$1(AbstractC5253 abstractC5253, InterfaceC4357<? super FlowKt__CollectionKt$groupByTo$4$emit$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = abstractC5253;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.emit(null, this);
        return C5176.f14739;
    }
}
