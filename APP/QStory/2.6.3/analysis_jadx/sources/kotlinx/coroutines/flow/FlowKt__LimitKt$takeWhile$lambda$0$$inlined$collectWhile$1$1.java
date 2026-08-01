package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1", f = "Limit.kt", l = {142, 143}, m = "emit", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5239 this$0;

    public FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1(AbstractC5239 abstractC5239, InterfaceC4357 interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
