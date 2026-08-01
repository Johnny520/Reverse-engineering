package kotlinx.coroutines.flow;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__CollectionKt$groupByTo$2", m556f = "Collection.kt", m557l = {328}, m558m = "emit", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 176)
public final class FlowKt__CollectionKt$groupByTo$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC6086 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectionKt$groupByTo$2$emit$1(AbstractC6086 abstractC6086, InterfaceC5189<? super FlowKt__CollectionKt$groupByTo$2$emit$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = abstractC6086;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.emit(null, this);
        return C6008.f15084;
    }
}
