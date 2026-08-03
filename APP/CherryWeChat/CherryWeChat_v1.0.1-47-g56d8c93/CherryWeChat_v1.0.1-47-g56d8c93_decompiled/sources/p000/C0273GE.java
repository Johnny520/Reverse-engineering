package p000;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: GE */
/* JADX INFO: loaded from: classes.dex */
public final class C0273GE {

    /* JADX INFO: renamed from: a */
    public final WeakReference f890a;

    public C0273GE(View view) {
        this.f890a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m553a(float f) {
        View view = (View) this.f890a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m554b() {
        View view = (View) this.f890a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m555c(long j) {
        View view = (View) this.f890a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m556d(InterfaceC0359IE interfaceC0359IE) {
        View view = (View) this.f890a.get();
        if (view != null) {
            if (interfaceC0359IE != null) {
                view.animate().setListener(new C2437r0(interfaceC0359IE, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m557e(float f) {
        View view = (View) this.f890a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
