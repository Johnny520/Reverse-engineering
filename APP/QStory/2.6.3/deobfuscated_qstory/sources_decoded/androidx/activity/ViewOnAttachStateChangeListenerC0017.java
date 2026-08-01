package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import kotlinx.coroutines.channels.AbstractC5211;
import kotlinx.coroutines.channels.InterfaceC5196;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0017 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC0019 f39;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f40;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnScrollChangedListenerC0015 f41;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5196 f42;

    public ViewOnAttachStateChangeListenerC0017(InterfaceC5196 interfaceC5196, View view, ViewTreeObserverOnScrollChangedListenerC0015 viewTreeObserverOnScrollChangedListenerC0015, ViewOnLayoutChangeListenerC0019 viewOnLayoutChangeListenerC0019) {
        this.f42 = interfaceC5196;
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
        ((AbstractC5211) this.f42).mo8436(rect);
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
