package androidx.compose.p001ui.platform;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class C0213x565475b extends Lambda implements InterfaceC7372 {
    final /* synthetic */ AbstractViewOnAttachStateChangeListenerC2695 $listener;
    final /* synthetic */ AbstractC2716 $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0213x565475b(AbstractC2716 abstractC2716, AbstractViewOnAttachStateChangeListenerC2695 abstractViewOnAttachStateChangeListenerC2695) {
        super(0);
        this.$view = abstractC2716;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m4003invoke() {
        this.$view.removeOnAttachStateChangeListener(null);
    }

    @Override // p068.InterfaceC7372
    public /* bridge */ /* synthetic */ Object invoke() {
        m4003invoke();
        return C6008.f15084;
    }
}
