package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pl implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public pl(defpackage.i00 r2, android.view.View r3) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.b = r2
            r1.c = r3
            return
    }

    public pl(defpackage.ql r2, androidx.fragment.app.a r3) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.c = r2
            r1.b = r3
            return
    }

    private final void a(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "ZA==\n"
            java.lang.String r1 = "ElH1bmmP0/k=\n"
            java.lang.String r0 = "v"
            defpackage.ip.o(r0, r3)
            return
        L11:
            java.lang.Object r3 = r2.b
            androidx.fragment.app.a r3 = (androidx.fragment.app.a) r3
            ml r0 = r3.c
            r3.k()
            android.view.View r3 = r0.E
            android.view.ViewParent r3 = r3.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r0 = r2.c
            ql r0 = (defpackage.ql) r0
            yl r0 = r0.a
            vh r0 = r0.y()
            cg r3 = defpackage.cg.f(r3, r0)
            r3.e()
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L35;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "3w==\n"
            java.lang.String r1 = "qZwR1n1Fv/g=\n"
            java.lang.String r0 = "v"
            defpackage.ip.o(r0, r3)
            java.lang.Object r3 = r2.b
            i00 r3 = (defpackage.i00) r3
            java.lang.Object r3 = r3.b
            android.animation.ValueAnimator r3 = (android.animation.ValueAnimator) r3
            if (r3 == 0) goto L1d
            r3.cancel()
        L1d:
            java.lang.Object r3 = r2.c
            android.view.View r3 = (android.view.View) r3
            r0 = 2114519045(0x7e090005, float:4.5526084E37)
            java.lang.Object r3 = r3.getTag(r0)
            boolean r0 = r3 instanceof defpackage.h40
            if (r0 == 0) goto L2f
            h40 r3 = (defpackage.h40) r3
            goto L30
        L2f:
            r3 = 0
        L30:
            if (r3 == 0) goto L35
            r3.c()
        L35:
            return
    }
}
