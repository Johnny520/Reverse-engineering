package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class wa0 {
    public final WeakReference a;

    public wa0(View r2) {
        this.a = new WeakReference(r2);
    }

    public final void a(float r2) {
        View r0 = (View) this.a.get();
        if (r0 == null) goto L6;
        r0.animate().alpha(r2);
        return;
    }

    public final void b() {
        View r0 = (View) this.a.get();
        if (r0 == null) goto L6;
        r0.animate().cancel();
        return;
    }

    public final void c(long r2) {
        View r0 = (View) this.a.get();
        if (r0 == null) goto L6;
        r0.animate().setDuration(r2);
        return;
    }

    public final void d(ya0 r5) {
        View r0 = (View) this.a.get();
        if (r0 == null) goto L9;
        if (r5 == null) goto L7;
        r0.animate().setListener(new o70(r5, r0, 1));
        return;
    L7:
        r0.animate().setListener(null);
        return;
    }

    public final void e(float r2) {
        View r0 = (View) this.a.get();
        if (r0 == null) goto L6;
        r0.animate().translationY(r2);
        return;
    }
}
