package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogic", f = "NonTouchScrollingLogic.kt", l = {55}, m = "userScroll$foundation", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class NonTouchScrollingLogic$userScroll$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC0556 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogic$userScroll$1(AbstractC0556 abstractC0556, InterfaceC4357<? super NonTouchScrollingLogic$userScroll$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = abstractC0556;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m1351(null, this);
    }
}
