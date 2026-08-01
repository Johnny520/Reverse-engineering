package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0343;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {231, 280}, m = "animate", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class SuspendAnimationKt$animate$4<T, V extends AbstractC0343> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public SuspendAnimationKt$animate$4(InterfaceC4357<? super SuspendAnimationKt$animate$4> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC0330.m1008(null, null, 0L, null, this);
    }
}
