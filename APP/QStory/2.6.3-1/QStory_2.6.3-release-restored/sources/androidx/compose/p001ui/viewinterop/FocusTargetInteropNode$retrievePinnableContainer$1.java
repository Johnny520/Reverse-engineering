package androidx.compose.p001ui.viewinterop;

import androidx.compose.p001ui.layout.AbstractC2544;
import androidx.compose.p001ui.layout.InterfaceC2545;
import androidx.compose.p001ui.node.AbstractC2620;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class FocusTargetInteropNode$retrievePinnableContainer$1 extends Lambda implements InterfaceC7372 {
    final /* synthetic */ Ref$ObjectRef<InterfaceC2545> $container;
    final /* synthetic */ C2914 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTargetInteropNode$retrievePinnableContainer$1(Ref$ObjectRef<InterfaceC2545> ref$ObjectRef, C2914 c2914) {
        super(0);
        this.$container = ref$ObjectRef;
        this.this$0 = c2914;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m4372invoke() {
        this.$container.element = AbstractC2620.m3916(this.this$0, AbstractC2544.f5326);
    }

    @Override // p068.InterfaceC7372
    public /* bridge */ /* synthetic */ Object invoke() {
        m4372invoke();
        return C6008.f15084;
    }
}
