package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {160}, m = "awaitCancellation", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class DelayKt$awaitCancellation$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;

    public DelayKt$awaitCancellation$1(InterfaceC4357<? super DelayKt$awaitCancellation$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC5399.m10504(this);
    }
}
