package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ScrollingLogic2D", m556f = "Scrollable2D.kt", m557l = {439}, m558m = "doFlingAnimation-QWom1Mo", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class ScrollingLogic2D$doFlingAnimation$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC1355 this$0;

    public ScrollingLogic2D$doFlingAnimation$1(AbstractC1355 abstractC1355, InterfaceC5189<? super ScrollingLogic2D$doFlingAnimation$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
