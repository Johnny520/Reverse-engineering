package p000a;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: a.Jg */
/* JADX INFO: loaded from: classes.dex */
public final class C0181Jg {

    /* JADX INFO: renamed from: a */
    public final WeakReference<View> f628a;

    public C0181Jg(View view) {
        this.f628a = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m488a(float f) {
        View view = this.f628a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m489b() {
        View view = this.f628a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m490c(long j) {
        View view = this.f628a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m491d(InterfaceC0217Lg interfaceC0217Lg) {
        View view = this.f628a.get();
        if (view != null) {
            if (interfaceC0217Lg != null) {
                view.animate().setListener(new C0869v0(interfaceC0217Lg, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m492e(float f) {
        View view = this.f628a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
