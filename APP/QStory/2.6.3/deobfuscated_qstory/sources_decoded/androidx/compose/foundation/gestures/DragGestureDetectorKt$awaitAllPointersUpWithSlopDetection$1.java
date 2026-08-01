package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {921}, m = "awaitAllPointersUpWithSlopDetection", v = 1)
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

    public DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1(InterfaceC4357<? super DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC0468.m1240(null, null, null, this);
    }
}
