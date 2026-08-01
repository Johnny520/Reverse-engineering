package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends defpackage.jl {
    public final /* synthetic */ int j;
    public final /* synthetic */ android.view.View k;

    public d1(androidx.appcompat.view.menu.ActionMenuItemView r2) {
            r1 = this;
            r0 = 0
            r1.j = r0
            r1.k = r2
            r1.<init>(r2)
            return
    }

    public d1(defpackage.i1 r2, defpackage.i1 r3) {
            r1 = this;
            r0 = 1
            r1.j = r0
            r1.k = r2
            r1.<init>(r3)
            return
    }

    @Override // defpackage.jl
    public final defpackage.r30 b() {
            r1 = this;
            int r0 = r1.j
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            android.view.View r0 = r1.k
            i1 r0 = (defpackage.i1) r0
            j1 r0 = r0.d
            f1 r0 = r0.s
            if (r0 != 0) goto L11
            r0 = 0
            goto L15
        L11:
            tu r0 = r0.a()
        L15:
            return r0
        L16:
            android.view.View r0 = r1.k
            androidx.appcompat.view.menu.ActionMenuItemView r0 = (androidx.appcompat.view.menu.ActionMenuItemView) r0
            e1 r0 = r0.m
            if (r0 == 0) goto L2b
            g1 r0 = (defpackage.g1) r0
            j1 r0 = r0.a
            f1 r0 = r0.t
            if (r0 == 0) goto L2b
            tu r0 = r0.a()
            goto L2c
        L2b:
            r0 = 0
        L2c:
            return r0
    }

    @Override // defpackage.jl
    public final boolean c() {
            r2 = this;
            int r0 = r2.j
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            android.view.View r0 = r2.k
            i1 r0 = (defpackage.i1) r0
            j1 r0 = r0.d
            r0.l()
            r0 = 1
            return r0
        L10:
            android.view.View r0 = r2.k
            androidx.appcompat.view.menu.ActionMenuItemView r0 = (androidx.appcompat.view.menu.ActionMenuItemView) r0
            ju r1 = r0.k
            if (r1 == 0) goto L2e
            ou r0 = r0.h
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L2e
            r30 r0 = r2.b()
            if (r0 == 0) goto L2e
            boolean r0 = r0.b()
            if (r0 == 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
    }

    @Override // defpackage.jl
    public boolean d() {
            r2 = this;
            int r0 = r2.j
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r0 = super.d()
            return r0
        La:
            android.view.View r0 = r2.k
            i1 r0 = (defpackage.i1) r0
            j1 r0 = r0.d
            h1 r1 = r0.u
            if (r1 == 0) goto L16
            r0 = 0
            goto L1a
        L16:
            r0.f()
            r0 = 1
        L1a:
            return r0
    }
}
