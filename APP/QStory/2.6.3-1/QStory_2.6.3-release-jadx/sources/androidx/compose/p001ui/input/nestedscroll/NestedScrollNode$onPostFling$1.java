package androidx.compose.p001ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m556f = "NestedScrollNode.kt", m557l = {113, 118}, m558m = "onPostFling-RZ2iAVY", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class NestedScrollNode$onPostFling$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2451 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPostFling$1(C2451 c2451, InterfaceC5189<? super NestedScrollNode$onPostFling$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c2451;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo1815(0L, 0L, this);
    }
}
