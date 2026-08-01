package androidx.compose.foundation.gestures;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {131, 142, 145, 148, 176, 194, 196, Opcodes.REM_DOUBLE_2ADDR}, m = "processTapGesture", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class TapGestureDetectorKt$processTapGesture$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;

    public TapGestureDetectorKt$processTapGesture$1(InterfaceC4357<? super TapGestureDetectorKt$processTapGesture$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC0503.m1280(null, null, null, null, null, null, null, this);
    }
}
