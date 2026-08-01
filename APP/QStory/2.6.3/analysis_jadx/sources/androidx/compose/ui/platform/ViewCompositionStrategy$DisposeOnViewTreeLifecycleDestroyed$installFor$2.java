package androidx.compose.ui.platform;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6543;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2 extends Lambda implements InterfaceC6543 {
    final /* synthetic */ Ref$ObjectRef<InterfaceC6543> $disposer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2(Ref$ObjectRef<InterfaceC6543> ref$ObjectRef) {
        super(0);
        this.$disposer = ref$ObjectRef;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3444invoke() {
        this.$disposer.element.invoke();
    }

    @Override // p052.InterfaceC6543
    public /* bridge */ /* synthetic */ Object invoke() {
        m3444invoke();
        return C5176.f14739;
    }
}
