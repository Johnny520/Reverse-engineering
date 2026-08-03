package p000;

import android.view.View;

/* JADX INFO: renamed from: LE */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0488LE implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
