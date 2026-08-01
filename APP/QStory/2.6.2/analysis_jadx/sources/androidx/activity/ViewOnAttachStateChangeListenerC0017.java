package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import kotlinx.coroutines.channels.AbstractC5210;
import kotlinx.coroutines.channels.InterfaceC5195;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0017 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC0019 f39;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f40;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnScrollChangedListenerC0015 f41;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5195 f42;

    public ViewOnAttachStateChangeListenerC0017(InterfaceC5195 interfaceC5195, View view, ViewTreeObserverOnScrollChangedListenerC0015 viewTreeObserverOnScrollChangedListenerC0015, ViewOnLayoutChangeListenerC0019 viewOnLayoutChangeListenerC0019) {
        this.f42 = interfaceC5195;
        this.f40 = view;
        this.f41 = viewTreeObserverOnScrollChangedListenerC0015;
        this.f39 = viewOnLayoutChangeListenerC0019;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        Rect rect = new Rect();
        View view2 = this.f40;
        view2.getGlobalVisibleRect(rect);
        ((AbstractC5210) this.f42).mo8445(rect);
        view2.getViewTreeObserver().addOnScrollChangedListener(this.f41);
        view2.addOnLayoutChangeListener(this.f39);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        view.getViewTreeObserver().removeOnScrollChangedListener(this.f41);
        view.removeOnLayoutChangeListener(this.f39);
    }
}
