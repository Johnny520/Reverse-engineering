package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {921}, m = "awaitAllPointersUpWithSlopDetection", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 extends ContinuationImpl {
    float F$0;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1(InterfaceC4356<? super DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC0468.m1230(null, null, null, this);
    }
}
