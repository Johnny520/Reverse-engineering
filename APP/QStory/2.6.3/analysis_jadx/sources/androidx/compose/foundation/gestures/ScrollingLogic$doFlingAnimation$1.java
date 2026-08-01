package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {888}, m = "doFlingAnimation-QWom1Mo", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C0502 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(C0502 c0502, InterfaceC4357<? super ScrollingLogic$doFlingAnimation$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c0502;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m1267(0L, this);
    }
}
