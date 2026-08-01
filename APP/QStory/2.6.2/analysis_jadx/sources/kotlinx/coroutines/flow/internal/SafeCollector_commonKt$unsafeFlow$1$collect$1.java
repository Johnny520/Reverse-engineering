package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
public final class SafeCollector_commonKt$unsafeFlow$1$collect$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5221 this$0;

    public SafeCollector_commonKt$unsafeFlow$1$collect$1(AbstractC5221 abstractC5221, InterfaceC4356<? super SafeCollector_commonKt$unsafeFlow$1$collect$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
