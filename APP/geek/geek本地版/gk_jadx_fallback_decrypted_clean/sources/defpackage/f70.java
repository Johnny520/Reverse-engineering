package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f70 implements defpackage.dv {
    public defpackage.ku a;
    public defpackage.ou b;
    public final /* synthetic */ androidx.appcompat.widget.Toolbar c;

    public f70(androidx.appcompat.widget.Toolbar r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    @Override // defpackage.dv
    public final void a(defpackage.ku r1, boolean r2) {
            r0 = this;
            return
    }

    @Override // defpackage.dv
    public final boolean c() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.dv
    public final boolean d(defpackage.ou r7) {
            r6 = this;
            androidx.appcompat.widget.Toolbar r0 = r6.c
            android.view.View r1 = r0.i
            boolean r2 = r1 instanceof defpackage.ya
            if (r2 == 0) goto Ld
            ya r1 = (defpackage.ya) r1
            r1.onActionViewCollapsed()
        Ld:
            android.view.View r1 = r0.i
            r0.removeView(r1)
            y3 r1 = r0.h
            r0.removeView(r1)
            r1 = 0
            r0.i = r1
            java.util.ArrayList r2 = r0.E
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
        L22:
            if (r3 < 0) goto L30
            java.lang.Object r5 = r2.get(r3)
            android.view.View r5 = (android.view.View) r5
            r0.addView(r5)
            int r3 = r3 + (-1)
            goto L22
        L30:
            r2.clear()
            r6.b = r1
            r0.requestLayout()
            r1 = 0
            r7.C = r1
            ku r7 = r7.n
            r7.p(r1)
            r0.u()
            return r4
    }

    @Override // defpackage.dv
    public final boolean g(defpackage.ou r7) {
            r6 = this;
            androidx.appcompat.widget.Toolbar r0 = r6.c
            r0.c()
            y3 r1 = r0.h
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == r0) goto L1d
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L18
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            y3 r2 = r0.h
            r1.removeView(r2)
        L18:
            y3 r1 = r0.h
            r0.addView(r1)
        L1d:
            android.view.View r1 = r7.getActionView()
            r0.i = r1
            r6.b = r7
            android.view.ViewParent r1 = r1.getParent()
            r2 = 2
            if (r1 == r0) goto L51
            boolean r3 = r1 instanceof android.view.ViewGroup
            if (r3 == 0) goto L37
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r3 = r0.i
            r1.removeView(r3)
        L37:
            g70 r1 = androidx.appcompat.widget.Toolbar.h()
            int r3 = r0.n
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3 = r3 | r4
            r1.a = r3
            r1.b = r2
            android.view.View r3 = r0.i
            r3.setLayoutParams(r1)
            android.view.View r1 = r0.i
            r0.addView(r1)
        L51:
            int r1 = r0.getChildCount()
            r3 = 1
            int r1 = r1 - r3
        L57:
            if (r1 < 0) goto L76
            android.view.View r4 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            g70 r5 = (defpackage.g70) r5
            int r5 = r5.b
            if (r5 == r2) goto L73
            androidx.appcompat.widget.ActionMenuView r5 = r0.a
            if (r4 == r5) goto L73
            r0.removeViewAt(r1)
            java.util.ArrayList r5 = r0.E
            r5.add(r4)
        L73:
            int r1 = r1 + (-1)
            goto L57
        L76:
            r0.requestLayout()
            r7.C = r3
            ku r7 = r7.n
            r1 = 0
            r7.p(r1)
            android.view.View r7 = r0.i
            boolean r1 = r7 instanceof defpackage.ya
            if (r1 == 0) goto L8c
            ya r7 = (defpackage.ya) r7
            r7.onActionViewExpanded()
        L8c:
            r0.u()
            return r3
    }

    @Override // defpackage.dv
    public final void h() {
            r4 = this;
            ou r0 = r4.b
            if (r0 == 0) goto L24
            ku r0 = r4.a
            if (r0 == 0) goto L1f
            java.util.ArrayList r0 = r0.f
            int r0 = r0.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            ku r2 = r4.a
            android.view.MenuItem r2 = r2.getItem(r1)
            ou r3 = r4.b
            if (r2 != r3) goto L1c
            goto L24
        L1c:
            int r1 = r1 + 1
            goto Lf
        L1f:
            ou r0 = r4.b
            r4.d(r0)
        L24:
            return
    }

    @Override // defpackage.dv
    public final void i(android.content.Context r2, defpackage.ku r3) {
            r1 = this;
            ku r2 = r1.a
            if (r2 == 0) goto Lb
            ou r0 = r1.b
            if (r0 == 0) goto Lb
            r2.d(r0)
        Lb:
            r1.a = r3
            return
    }

    @Override // defpackage.dv
    public final boolean k(defpackage.c50 r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
