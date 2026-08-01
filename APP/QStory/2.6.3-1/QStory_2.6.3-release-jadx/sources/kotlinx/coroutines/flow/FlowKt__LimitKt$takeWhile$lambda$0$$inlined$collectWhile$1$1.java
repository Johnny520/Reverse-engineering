package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1", m556f = "Limit.kt", m557l = {142, 143}, m558m = "emit", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
public final class FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC6071 this$0;

    public FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1(AbstractC6071 abstractC6071, InterfaceC5189 interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
