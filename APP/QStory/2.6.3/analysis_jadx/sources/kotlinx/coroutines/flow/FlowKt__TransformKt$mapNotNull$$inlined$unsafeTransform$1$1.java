package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
public final class FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5291 this$0;

    public FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$1(AbstractC5291 abstractC5291, InterfaceC4357 interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
