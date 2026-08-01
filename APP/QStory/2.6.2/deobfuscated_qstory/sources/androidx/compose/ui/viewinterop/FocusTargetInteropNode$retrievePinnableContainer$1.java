package androidx.compose.ui.viewinterop;

import androidx.compose.ui.layout.AbstractC1709;
import androidx.compose.ui.layout.InterfaceC1710;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class FocusTargetInteropNode$retrievePinnableContainer$1 extends Lambda implements InterfaceC6542 {
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
    public final void m3802invoke() {
        this.$container.element = AbstractC1785.m3346(this.this$0, AbstractC1709.f4980);
    }

    @Override // p052.InterfaceC6542
    public /* bridge */ /* synthetic */ Object invoke() {
        m3802invoke();
        return C5175.f14739;
    }
}
