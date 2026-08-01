package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {410}, m = "waitForLongPress", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class TapGestureDetectorKt$waitForLongPress$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public TapGestureDetectorKt$waitForLongPress$1(InterfaceC4356<? super TapGestureDetectorKt$waitForLongPress$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC0503.m1271(null, null, this);
    }
}
