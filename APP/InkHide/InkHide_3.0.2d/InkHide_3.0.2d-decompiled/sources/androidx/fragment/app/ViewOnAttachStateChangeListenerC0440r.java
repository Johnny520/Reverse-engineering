package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.fragment.app.r */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0440r implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0415F f1408b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LayoutInflaterFactory2C0441s f1409c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnAttachStateChangeListenerC0440r(LayoutInflaterFactory2C0441s layoutInflaterFactory2C0441s, C0415F c0415f) {
        this.f1409c = layoutInflaterFactory2C0441s;
        this.f1408b = c0415f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0415F c0415f = this.f1408b;
        c0415f.m799k();
        C0431i.m832f((ViewGroup) c0415f.f1254c.f1353F.getParent(), this.f1409c.f1410b.m863C()).m837e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
