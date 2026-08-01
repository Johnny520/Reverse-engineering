package androidx.compose.material3.pulltorefresh;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m556f = "PullToRefresh.kt", m557l = {298}, m558m = "onPreFling-QWom1Mo")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class PullToRefreshModifierNode$onPreFling$1 extends ContinuationImpl {
    float F$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC1972 this$0;

    public PullToRefreshModifierNode$onPreFling$1(AbstractC1972 abstractC1972, InterfaceC5189<? super PullToRefreshModifierNode$onPreFling$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
