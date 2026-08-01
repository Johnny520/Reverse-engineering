package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", m556f = "WindowInsetsConnection.android.kt", m557l = {301, 327, 352}, m558m = "fling-huYlsQE", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {
    float F$0;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractWindowInsetsAnimationControlListenerC1465 this$0;

    public WindowInsetsNestedScrollConnection$fling$1(AbstractWindowInsetsAnimationControlListenerC1465 abstractWindowInsetsAnimationControlListenerC1465, InterfaceC5189<? super WindowInsetsNestedScrollConnection$fling$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
