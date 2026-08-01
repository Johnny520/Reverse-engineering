package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt", m556f = "LazyLayoutScrollScope.kt", m557l = {177, 264}, m558m = "animateScrollToItem", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class LazyLayoutScrollScopeKt$animateScrollToItem$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public LazyLayoutScrollScopeKt$animateScrollToItem$1(InterfaceC5189<? super LazyLayoutScrollScopeKt$animateScrollToItem$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC1563.m2076(null, 0, 0, 0, null, this);
    }
}
