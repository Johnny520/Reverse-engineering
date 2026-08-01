package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {739}, m = "snapElevation")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class FloatingActionButtonElevationAnimatable$snapElevation$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC1155 this$0;

    public FloatingActionButtonElevationAnimatable$snapElevation$1(AbstractC1155 abstractC1155, InterfaceC4357<? super FloatingActionButtonElevationAnimatable$snapElevation$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
