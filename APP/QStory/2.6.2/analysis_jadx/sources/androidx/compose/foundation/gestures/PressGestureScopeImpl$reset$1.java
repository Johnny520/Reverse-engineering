package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {502}, m = "reset", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class PressGestureScopeImpl$reset$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C0553 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$reset$1(C0553 c0553, InterfaceC4356<? super PressGestureScopeImpl$reset$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c0553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m1326(this);
    }
}
