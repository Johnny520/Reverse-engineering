package p000a;

import android.view.View;
import java.util.WeakHashMap;
import p000a.C0866ug;

/* JADX INFO: renamed from: a.Og */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0271Og implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        C0866ug.c.m2008c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
