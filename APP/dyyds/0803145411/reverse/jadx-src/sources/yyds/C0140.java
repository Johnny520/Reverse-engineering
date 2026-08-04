package yyds;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᛱᛶᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0140 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final WeakReference f849;

    public C0140(View view) {
        this.f849 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m625(float f) {
        View view = (View) this.f849.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m626(float f) {
        View view = (View) this.f849.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m627() {
        View view = (View) this.f849.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m628(long j) {
        View view = (View) this.f849.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m629(InterfaceC1824 interfaceC1824) {
        View view = (View) this.f849.get();
        if (view != null) {
            if (interfaceC1824 != null) {
                view.animate().setListener(new C2116(interfaceC1824, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }
}
