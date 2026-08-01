package p099y;

import android.view.View;
import java.lang.ref.WeakReference;
import p069i.C0665c;

/* JADX INFO: renamed from: y.S */
/* JADX INFO: loaded from: classes.dex */
public final class C1054S {

    /* JADX INFO: renamed from: a */
    public final WeakReference f3669a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1054S(View view) {
        this.f3669a = new WeakReference(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2303a(float f) {
        View view = (View) this.f3669a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2304b() {
        View view = (View) this.f3669a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2305c(long j2) {
        View view = (View) this.f3669a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2306d(InterfaceC1055T interfaceC1055T) {
        View view = (View) this.f3669a.get();
        if (view != null) {
            if (interfaceC1055T != null) {
                view.animate().setListener(new C0665c(interfaceC1055T, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2307e(float f) {
        View view = (View) this.f3669a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
