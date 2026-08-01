package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 176)
public final class FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC6121 this$0;

    public FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$1(AbstractC6121 abstractC6121, InterfaceC5189 interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
