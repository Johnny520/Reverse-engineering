package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ScrollingLogic", m556f = "Scrollable.kt", m557l = {888}, m558m = "doFlingAnimation-QWom1Mo", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C1343 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(C1343 c1343, InterfaceC5189<? super ScrollingLogic$doFlingAnimation$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c1343;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m1827(0L, this);
    }
}
