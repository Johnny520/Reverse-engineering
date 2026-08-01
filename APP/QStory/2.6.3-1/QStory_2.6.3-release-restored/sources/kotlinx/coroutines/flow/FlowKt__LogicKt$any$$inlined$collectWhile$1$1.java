package kotlinx.coroutines.flow;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1", m556f = "Logic.kt", m557l = {142}, m558m = "emit", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
public final class FlowKt__LogicKt$any$$inlined$collectWhile$1$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6178 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LogicKt$any$$inlined$collectWhile$1$1(C6178 c6178, InterfaceC5189 interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c6178;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.emit(null, this);
        return C6008.f15084;
    }
}
