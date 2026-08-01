package p000;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class wa0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f4948a;

    public wa0(View view) {
        this.f4948a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m2553a(float f) {
        View view = (View) this.f4948a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2554b() {
        View view = (View) this.f4948a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2555c(long j) {
        View view = (View) this.f4948a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2556d(ya0 ya0Var) {
        View view = (View) this.f4948a.get();
        if (view != null) {
            if (ya0Var != null) {
                view.animate().setListener(new o70(ya0Var, view, 1));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2557e(float f) {
        View view = (View) this.f4948a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
