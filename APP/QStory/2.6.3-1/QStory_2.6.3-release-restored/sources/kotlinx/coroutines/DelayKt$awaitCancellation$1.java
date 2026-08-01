package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.DelayKt", m556f = "Delay.kt", m557l = {160}, m558m = "awaitCancellation", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class DelayKt$awaitCancellation$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;

    public DelayKt$awaitCancellation$1(InterfaceC5189<? super DelayKt$awaitCancellation$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC6231.m11063(this);
    }
}
