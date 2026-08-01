package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import kotlinx.coroutines.channels.AbstractC6043;
import kotlinx.coroutines.channels.InterfaceC6028;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0864 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC0866 f384;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f385;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnScrollChangedListenerC0862 f386;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6028 f387;

    public ViewOnAttachStateChangeListenerC0864(InterfaceC6028 interfaceC6028, View view, ViewTreeObserverOnScrollChangedListenerC0862 viewTreeObserverOnScrollChangedListenerC0862, ViewOnLayoutChangeListenerC0866 viewOnLayoutChangeListenerC0866) {
        this.f387 = interfaceC6028;
        this.f385 = view;
        this.f386 = viewTreeObserverOnScrollChangedListenerC0862;
        this.f384 = viewOnLayoutChangeListenerC0866;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        Rect rect = new Rect();
        View view2 = this.f385;
        view2.getGlobalVisibleRect(rect);
        ((AbstractC6043) this.f387).mo8995(rect);
        view2.getViewTreeObserver().addOnScrollChangedListener(this.f386);
        view2.addOnLayoutChangeListener(this.f384);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        view.getViewTreeObserver().removeOnScrollChangedListener(this.f386);
        view.removeOnLayoutChangeListener(this.f384);
    }
}
