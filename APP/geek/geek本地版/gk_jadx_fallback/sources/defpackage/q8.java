package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q8 implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ q8(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    private final void a(android.view.View r1) {
            r0 = this;
            return
    }

    private final void b(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r3) {
            r2 = this;
            int r3 = r2.a
            switch(r3) {
                case 0: goto L1f;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r3 = r2.b
            ej r3 = (defpackage.ej) r3
            android.view.accessibility.AccessibilityManager r0 = r3.t
            a0 r1 = r3.u
            if (r1 == 0) goto L1f
            if (r0 == 0) goto L1f
            java.util.WeakHashMap r1 = defpackage.ja0.a
            boolean r1 = defpackage.v90.b(r3)
            if (r1 == 0) goto L1f
            a0 r3 = r3.u
            defpackage.z.a(r0, r3)
        L1f:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L34;
                case 1: goto L24;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.b
            q40 r0 = (defpackage.q40) r0
            android.view.ViewTreeObserver r1 = r0.o
            if (r1 == 0) goto L20
            boolean r1 = r1.isAlive()
            if (r1 != 0) goto L19
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            r0.o = r1
        L19:
            android.view.ViewTreeObserver r1 = r0.o
            k4 r0 = r0.i
            r1.removeGlobalOnLayoutListener(r0)
        L20:
            r3.removeOnAttachStateChangeListener(r2)
            return
        L24:
            java.lang.Object r3 = r2.b
            ej r3 = (defpackage.ej) r3
            a0 r0 = r3.u
            if (r0 == 0) goto L33
            android.view.accessibility.AccessibilityManager r3 = r3.t
            if (r3 == 0) goto L33
            defpackage.z.b(r3, r0)
        L33:
            return
        L34:
            java.lang.Object r0 = r2.b
            t8 r0 = (defpackage.t8) r0
            android.view.ViewTreeObserver r1 = r0.x
            if (r1 == 0) goto L4f
            boolean r1 = r1.isAlive()
            if (r1 != 0) goto L48
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            r0.x = r1
        L48:
            android.view.ViewTreeObserver r1 = r0.x
            k4 r0 = r0.i
            r1.removeGlobalOnLayoutListener(r0)
        L4f:
            r3.removeOnAttachStateChangeListener(r2)
            return
    }
}
