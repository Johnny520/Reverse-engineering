package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {Opcodes.RSUB_INT_LIT8, Opcodes.RSUB_INT_LIT8}, m = "emit", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
public final class FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5332 this$0;

    public FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1(AbstractC5332 abstractC5332, InterfaceC4357 interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
