package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", l = {301, 327, 352}, m = "fling-huYlsQE", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {
    float F$0;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractWindowInsetsAnimationControlListenerC0624 this$0;

    public WindowInsetsNestedScrollConnection$fling$1(AbstractWindowInsetsAnimationControlListenerC0624 abstractWindowInsetsAnimationControlListenerC0624, InterfaceC4357<? super WindowInsetsNestedScrollConnection$fling$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
