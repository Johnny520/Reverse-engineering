package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ScrollingLogic2D", f = "Scrollable2D.kt", l = {439}, m = "doFlingAnimation-QWom1Mo", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ScrollingLogic2D$doFlingAnimation$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC0514 this$0;

    public ScrollingLogic2D$doFlingAnimation$1(AbstractC0514 abstractC0514, InterfaceC4357<? super ScrollingLogic2D$doFlingAnimation$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
