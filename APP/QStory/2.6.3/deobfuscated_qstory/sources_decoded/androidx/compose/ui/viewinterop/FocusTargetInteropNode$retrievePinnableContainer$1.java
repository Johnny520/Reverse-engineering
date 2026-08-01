package androidx.compose.ui.viewinterop;

import androidx.compose.ui.layout.AbstractC1709;
import androidx.compose.ui.layout.InterfaceC1710;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6543;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class FocusTargetInteropNode$retrievePinnableContainer$1 extends Lambda implements InterfaceC6543 {
    final /* synthetic */ Ref$ObjectRef<InterfaceC1710> $container;
    final /* synthetic */ C2081 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTargetInteropNode$retrievePinnableContainer$1(Ref$ObjectRef<InterfaceC1710> ref$ObjectRef, C2081 c2081) {
        super(0);
        this.$container = ref$ObjectRef;
        this.this$0 = c2081;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3812invoke() {
        this.$container.element = AbstractC1785.m3356(this.this$0, AbstractC1709.f4981);
    }

    @Override // p052.InterfaceC6543
    public /* bridge */ /* synthetic */ Object invoke() {
        m3812invoke();
        return C5176.f14739;
    }
}
