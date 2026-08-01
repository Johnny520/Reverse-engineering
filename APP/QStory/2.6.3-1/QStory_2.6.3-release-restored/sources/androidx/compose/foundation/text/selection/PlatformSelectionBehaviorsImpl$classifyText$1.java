package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl", m556f = "PlatformSelectionBehaviors.android.kt", m557l = {369, 380}, m558m = "classifyText-M8tDOmk", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class PlatformSelectionBehaviorsImpl$classifyText$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C1760 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$classifyText$1(C1760 c1760, InterfaceC5189<? super PlatformSelectionBehaviorsImpl$classifyText$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c1760;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C1760.m2419(this.this$0, null, 0L, null, this);
    }
}
