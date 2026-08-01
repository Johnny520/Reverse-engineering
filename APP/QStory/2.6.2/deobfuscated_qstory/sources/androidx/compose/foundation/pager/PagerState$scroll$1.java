package androidx.compose.foundation.pager;

import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {691, 696}, m = "scroll$suspendImpl", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class PagerState$scroll$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC0768 this$0;

    public PagerState$scroll$1(AbstractC0768 abstractC0768, InterfaceC4356<? super PagerState$scroll$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            throw null;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.L$0 != null) {
                throw new ClassCastException();
            }
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (this.L$0 != null) {
            throw new ClassCastException();
        }
        AbstractC5184.m10206(obj);
        throw null;
    }
}
