package p000;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: GE */
/* JADX INFO: loaded from: classes.dex */
public final class C0273GE {

    /* JADX INFO: renamed from: a */
    public final WeakReference f890a;

    public C0273GE(View r2) {
        this.f890a = new WeakReference(r2);
    }

    /* JADX INFO: renamed from: a */
    public final void m553a(float r2) {
        View r0 = (View) this.f890a.get();
        if (r0 == null) goto L6;
        r0.animate().alpha(r2);
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m554b() {
        View r0 = (View) this.f890a.get();
        if (r0 == null) goto L6;
        r0.animate().cancel();
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m555c(long r2) {
        View r0 = (View) this.f890a.get();
        if (r0 == null) goto L6;
        r0.animate().setDuration(r2);
        return;
    }

    /* JADX INFO: renamed from: d */
    public final void m556d(InterfaceC0359IE r4) {
        View r0 = (View) this.f890a.get();
        if (r0 == null) goto L9;
        if (r4 == null) goto L7;
        r0.animate().setListener(new C2437r0(r4, r0));
        return;
    L7:
        r0.animate().setListener(null);
        return;
    }

    /* JADX INFO: renamed from: e */
    public final void m557e(float r2) {
        View r0 = (View) this.f890a.get();
        if (r0 == null) goto L6;
        r0.animate().translationY(r2);
        return;
    }
}
