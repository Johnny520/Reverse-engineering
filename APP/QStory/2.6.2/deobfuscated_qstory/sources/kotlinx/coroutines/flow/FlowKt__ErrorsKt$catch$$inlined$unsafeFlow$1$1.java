package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {112, 113}, m = "collect", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5245 this$0;

    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1(AbstractC5245 abstractC5245, InterfaceC4356 interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
