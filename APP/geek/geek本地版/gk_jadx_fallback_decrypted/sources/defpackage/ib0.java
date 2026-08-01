package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ib0 extends defpackage.s70 {
    public final /* synthetic */ android.view.ViewGroup a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ defpackage.pj d;

    public ib0(defpackage.pj r1, android.view.ViewGroup r2, android.view.View r3, android.view.View r4) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            r0.a = r2
            r0.b = r3
            r0.c = r4
            return
    }

    @Override // defpackage.s70, defpackage.q70
    public final void c() {
            r2 = this;
            android.view.ViewGroup r0 = r2.a
            android.view.ViewGroupOverlay r0 = r0.getOverlay()
            android.view.View r1 = r2.b
            r0.remove(r1)
            return
    }

    @Override // defpackage.s70, defpackage.q70
    public final void d() {
            r4 = this;
            android.view.View r0 = r4.b
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L12
            android.view.ViewGroup r1 = r4.a
            android.view.ViewGroupOverlay r1 = r1.getOverlay()
            r1.add(r0)
            return
        L12:
            pj r0 = r4.d
            java.util.ArrayList r1 = r0.m
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L1c:
            if (r2 < 0) goto L2a
            java.lang.Object r3 = r1.get(r2)
            android.animation.Animator r3 = (android.animation.Animator) r3
            r3.cancel()
            int r2 = r2 + (-1)
            goto L1c
        L2a:
            java.util.ArrayList r1 = r0.q
            if (r1 == 0) goto L4f
            int r1 = r1.size()
            if (r1 <= 0) goto L4f
            java.util.ArrayList r0 = r0.q
            java.lang.Object r0 = r0.clone()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
        L41:
            if (r2 >= r1) goto L4f
            java.lang.Object r3 = r0.get(r2)
            q70 r3 = (defpackage.q70) r3
            r3.a()
            int r2 = r2 + 1
            goto L41
        L4f:
            return
    }

    @Override // defpackage.q70
    public final void e(defpackage.r70 r4) {
            r3 = this;
            r0 = 2131296586(0x7f09014a, float:1.8211093E38)
            r1 = 0
            android.view.View r2 = r3.c
            r2.setTag(r0, r1)
            android.view.ViewGroup r0 = r3.a
            android.view.ViewGroupOverlay r0 = r0.getOverlay()
            android.view.View r1 = r3.b
            r0.remove(r1)
            r4.u(r3)
            return
    }
}
