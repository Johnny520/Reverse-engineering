package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class cx implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View a;
    public ViewTreeObserver b;
    public final Runnable c;

    public cx(View r1, Runnable r2) {
        this.a = r1;
        this.b = r1.getViewTreeObserver();
        this.c = r2;
    }

    public static void a(View r1, Runnable r2) {
        if (r1 == null) goto L6;
        cx r0 = new cx(r1, r2);
        r1.getViewTreeObserver().addOnPreDrawListener(r0);
        r1.addOnAttachStateChangeListener(r0);
        return;
    L6:
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean r0 = this.b.isAlive();
        View r1 = this.a;
        if (r0 == false) goto L5;
        this.b.removeOnPreDrawListener(this);
    L6:
        r1.removeOnAttachStateChangeListener(this);
        this.c.run();
        return true;
    L5:
        r1.getViewTreeObserver().removeOnPreDrawListener(this);
        goto L6
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
        this.b = r1.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r2) {
        boolean r22 = this.b.isAlive();
        View r0 = this.a;
        if (r22 == false) goto L5;
        this.b.removeOnPreDrawListener(this);
    L6:
        r0.removeOnAttachStateChangeListener(this);
        return;
    L5:
        r0.getViewTreeObserver().removeOnPreDrawListener(this);
        goto L6
    }
}
