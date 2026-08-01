package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl", f = "PlatformSelectionBehaviors.android.kt", l = {369, 380}, m = "classifyText-M8tDOmk", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class PlatformSelectionBehaviorsImpl$classifyText$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C0922 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$classifyText$1(C0922 c0922, InterfaceC4357<? super PlatformSelectionBehaviorsImpl$classifyText$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c0922;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C0922.m1859(this.this$0, null, 0L, null, this);
    }
}
