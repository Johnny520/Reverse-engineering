package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {361, 364}, m = "runAnimations", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class SeekableTransitionState$runAnimations$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC0301 this$0;

    public SeekableTransitionState$runAnimations$1(AbstractC0301 abstractC0301, InterfaceC4357<? super SeekableTransitionState$runAnimations$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
