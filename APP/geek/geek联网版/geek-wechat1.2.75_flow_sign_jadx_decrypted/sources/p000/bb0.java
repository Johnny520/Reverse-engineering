package p000;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class bb0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f708a;

    public bb0(View view) {
        this.f708a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m507a(float f) {
        View view = (View) this.f708a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m508b() {
        View view = (View) this.f708a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m509c(long j) {
        View view = (View) this.f708a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m510d(db0 db0Var) {
        View view = (View) this.f708a.get();
        if (view != null) {
            if (db0Var != null) {
                view.animate().setListener(new u70(db0Var, view, 1));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m511e(float f) {
        View view = (View) this.f708a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
