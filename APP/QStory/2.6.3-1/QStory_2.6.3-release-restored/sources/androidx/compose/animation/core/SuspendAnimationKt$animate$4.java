package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1189;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.animation.core.SuspendAnimationKt", m556f = "SuspendAnimation.kt", m557l = {231, 280}, m558m = "animate", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class SuspendAnimationKt$animate$4<T, V extends AbstractC1189> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public SuspendAnimationKt$animate$4(InterfaceC5189<? super SuspendAnimationKt$animate$4> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC1176.m1568(null, null, 0L, null, this);
    }
}
