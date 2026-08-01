package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", l = {3434, 3436}, m = "onPostFling-RZ2iAVY")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC1185 this$0;

    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1(AbstractC1185 abstractC1185, InterfaceC4357<? super ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
