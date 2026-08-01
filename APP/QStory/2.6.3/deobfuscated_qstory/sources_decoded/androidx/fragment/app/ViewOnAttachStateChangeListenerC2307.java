package androidx.fragment.app;

import android.view.View;
import androidx.core.view.AbstractC2270;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2307 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ View f6764;

    public ViewOnAttachStateChangeListenerC2307(View view) {
        this.f6764 = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f6764;
        view2.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        view2.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
