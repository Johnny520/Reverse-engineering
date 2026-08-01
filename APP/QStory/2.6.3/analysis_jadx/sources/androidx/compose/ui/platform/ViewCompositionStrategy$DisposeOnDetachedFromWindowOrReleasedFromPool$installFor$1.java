package androidx.compose.ui.platform;

import com.bumptech.glide.AbstractC3057;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6543;
import p168.InterfaceC7716;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1 extends Lambda implements InterfaceC6543 {
    final /* synthetic */ ViewOnAttachStateChangeListenerC1859 $listener;
    final /* synthetic */ InterfaceC7716 $poolingContainerListener;
    final /* synthetic */ AbstractC1881 $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(AbstractC1881 abstractC1881, ViewOnAttachStateChangeListenerC1859 viewOnAttachStateChangeListenerC1859, InterfaceC7716 interfaceC7716) {
        super(0);
        this.$view = abstractC1881;
        this.$listener = viewOnAttachStateChangeListenerC1859;
        this.$poolingContainerListener = interfaceC7716;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3442invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        AbstractC1881 abstractC1881 = this.$view;
        InterfaceC7716 interfaceC7716 = this.$poolingContainerListener;
        abstractC1881.getClass();
        interfaceC7716.getClass();
        AbstractC3057.m6749(abstractC1881).f20929.remove(interfaceC7716);
    }

    @Override // p052.InterfaceC6543
    public /* bridge */ /* synthetic */ Object invoke() {
        m3442invoke();
        return C5176.f14739;
    }
}
