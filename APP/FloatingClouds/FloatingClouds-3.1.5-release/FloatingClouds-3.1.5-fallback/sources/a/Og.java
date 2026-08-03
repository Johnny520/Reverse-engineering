package a;

/* JADX INFO: loaded from: classes.dex */
public final class Og implements android.view.View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r2) {
            r1 = this;
            r2.removeOnAttachStateChangeListener(r1)
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            a.C0414ug.c.c(r2)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            return
    }
}
