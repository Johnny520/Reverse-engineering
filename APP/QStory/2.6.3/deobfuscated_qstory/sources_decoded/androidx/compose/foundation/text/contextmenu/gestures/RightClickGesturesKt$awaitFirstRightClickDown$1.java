package androidx.compose.foundation.text.contextmenu.gestures;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt", f = "RightClickGestures.kt", l = {45}, m = "awaitFirstRightClickDown", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class RightClickGesturesKt$awaitFirstRightClickDown$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public RightClickGesturesKt$awaitFirstRightClickDown$1(InterfaceC4357<? super RightClickGesturesKt$awaitFirstRightClickDown$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC0785.m1590(null, this);
    }
}
