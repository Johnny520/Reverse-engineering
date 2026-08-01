package androidx.lifecycle;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {Opcodes.AND_INT_LIT8, Opcodes.OR_INT_LIT8}, m = "emitSource$lifecycle_livedata", v = 1)
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CoroutineLiveData$emitSource$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC2410 this$0;

    public CoroutineLiveData$emitSource$1(AbstractC2410 abstractC2410, InterfaceC4356<? super CoroutineLiveData$emitSource$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
