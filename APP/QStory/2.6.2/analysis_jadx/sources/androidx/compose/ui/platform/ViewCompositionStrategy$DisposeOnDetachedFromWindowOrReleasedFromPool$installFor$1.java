package androidx.compose.ui.platform;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;
import p168.InterfaceC7715;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1 extends Lambda implements InterfaceC6542 {
    final /* synthetic */ ViewOnAttachStateChangeListenerC1859 $listener;
    final /* synthetic */ InterfaceC7715 $poolingContainerListener;
    final /* synthetic */ AbstractC1881 $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(AbstractC1881 abstractC1881, ViewOnAttachStateChangeListenerC1859 viewOnAttachStateChangeListenerC1859, InterfaceC7715 interfaceC7715) {
        super(0);
        this.$view = abstractC1881;
        this.$listener = viewOnAttachStateChangeListenerC1859;
        this.$poolingContainerListener = interfaceC7715;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3432invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        AbstractC1881 abstractC1881 = this.$view;
        InterfaceC7715 interfaceC7715 = this.$poolingContainerListener;
        abstractC1881.getClass();
        interfaceC7715.getClass();
        AbstractC0455.m1163(abstractC1881).f20934.remove(interfaceC7715);
    }

    @Override // p052.InterfaceC6542
    public /* bridge */ /* synthetic */ Object invoke() {
        m3432invoke();
        return C5175.f14739;
    }
}
