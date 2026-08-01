package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ex extends defpackage.ai {
    public final /* synthetic */ int d;

    public /* synthetic */ ex(defpackage.nz r1, int r2) {
            r0 = this;
            r0.d = r2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.ai
    public final int b(android.view.View r3) {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto L25;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            java.lang.Object r1 = r2.b
            nz r1 = (defpackage.nz) r1
            r1.getClass()
            int r1 = r3.getBottom()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.bottom
            int r1 = r1 + r3
            int r3 = r0.bottomMargin
        L23:
            int r1 = r1 + r3
            return r1
        L25:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            java.lang.Object r1 = r2.b
            nz r1 = (defpackage.nz) r1
            r1.getClass()
            int r1 = r3.getRight()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.right
            int r1 = r1 + r3
            int r3 = r0.rightMargin
            goto L23
    }

    @Override // defpackage.ai
    public final int c(android.view.View r4) {
            r3 = this;
            int r0 = r3.d
            switch(r0) {
                case 0: goto L2b;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            java.lang.Object r1 = r3.b
            nz r1 = (defpackage.nz) r1
            r1.getClass()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            oz r1 = (defpackage.oz) r1
            android.graphics.Rect r1 = r1.b
            int r4 = r4.getMeasuredHeight()
            int r2 = r1.top
            int r4 = r4 + r2
            int r1 = r1.bottom
            int r4 = r4 + r1
            int r1 = r0.topMargin
            int r4 = r4 + r1
            int r0 = r0.bottomMargin
        L29:
            int r4 = r4 + r0
            return r4
        L2b:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            java.lang.Object r1 = r3.b
            nz r1 = (defpackage.nz) r1
            r1.getClass()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            oz r1 = (defpackage.oz) r1
            android.graphics.Rect r1 = r1.b
            int r4 = r4.getMeasuredWidth()
            int r2 = r1.left
            int r4 = r4 + r2
            int r1 = r1.right
            int r4 = r4 + r1
            int r1 = r0.leftMargin
            int r4 = r4 + r1
            int r0 = r0.rightMargin
            goto L29
    }

    @Override // defpackage.ai
    public final int d(android.view.View r4) {
            r3 = this;
            int r0 = r3.d
            switch(r0) {
                case 0: goto L2b;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            java.lang.Object r1 = r3.b
            nz r1 = (defpackage.nz) r1
            r1.getClass()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            oz r1 = (defpackage.oz) r1
            android.graphics.Rect r1 = r1.b
            int r4 = r4.getMeasuredWidth()
            int r2 = r1.left
            int r4 = r4 + r2
            int r1 = r1.right
            int r4 = r4 + r1
            int r1 = r0.leftMargin
            int r4 = r4 + r1
            int r0 = r0.rightMargin
        L29:
            int r4 = r4 + r0
            return r4
        L2b:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            java.lang.Object r1 = r3.b
            nz r1 = (defpackage.nz) r1
            r1.getClass()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            oz r1 = (defpackage.oz) r1
            android.graphics.Rect r1 = r1.b
            int r4 = r4.getMeasuredHeight()
            int r2 = r1.top
            int r4 = r4 + r2
            int r1 = r1.bottom
            int r4 = r4 + r1
            int r1 = r0.topMargin
            int r4 = r4 + r1
            int r0 = r0.bottomMargin
            goto L29
    }

    @Override // defpackage.ai
    public final int e(android.view.View r3) {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto L25;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            java.lang.Object r1 = r2.b
            nz r1 = (defpackage.nz) r1
            r1.getClass()
            int r1 = r3.getTop()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.top
            int r1 = r1 - r3
            int r3 = r0.topMargin
        L23:
            int r1 = r1 - r3
            return r1
        L25:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            oz r0 = (defpackage.oz) r0
            java.lang.Object r1 = r2.b
            nz r1 = (defpackage.nz) r1
            r1.getClass()
            int r1 = r3.getLeft()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.left
            int r1 = r1 - r3
            int r3 = r0.leftMargin
            goto L23
    }

    @Override // defpackage.ai
    public final int f() {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.b
            nz r0 = (defpackage.nz) r0
            int r0 = r0.o
            return r0
        Lc:
            java.lang.Object r0 = r1.b
            nz r0 = (defpackage.nz) r0
            int r0 = r0.n
            return r0
    }

    @Override // defpackage.ai
    public final int g() {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.b
            nz r0 = (defpackage.nz) r0
            int r1 = r0.o
            int r0 = r0.B()
        Lf:
            int r1 = r1 - r0
            return r1
        L11:
            java.lang.Object r0 = r2.b
            nz r0 = (defpackage.nz) r0
            int r1 = r0.n
            int r0 = r0.D()
            goto Lf
    }

    @Override // defpackage.ai
    public final int h() {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.b
            nz r0 = (defpackage.nz) r0
            int r0 = r0.B()
            return r0
        Le:
            java.lang.Object r0 = r1.b
            nz r0 = (defpackage.nz) r0
            int r0 = r0.D()
            return r0
    }

    @Override // defpackage.ai
    public final int i() {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.b
            nz r0 = (defpackage.nz) r0
            int r0 = r0.m
            return r0
        Lc:
            java.lang.Object r0 = r1.b
            nz r0 = (defpackage.nz) r0
            int r0 = r0.l
            return r0
    }

    @Override // defpackage.ai
    public final int j() {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.b
            nz r0 = (defpackage.nz) r0
            int r0 = r0.l
            return r0
        Lc:
            java.lang.Object r0 = r1.b
            nz r0 = (defpackage.nz) r0
            int r0 = r0.m
            return r0
    }

    @Override // defpackage.ai
    public final int k() {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.b
            nz r0 = (defpackage.nz) r0
            int r0 = r0.E()
            return r0
        Le:
            java.lang.Object r0 = r1.b
            nz r0 = (defpackage.nz) r0
            int r0 = r0.C()
            return r0
    }

    @Override // defpackage.ai
    public final int l() {
            r3 = this;
            int r0 = r3.d
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.b
            nz r0 = (defpackage.nz) r0
            int r1 = r0.o
            int r2 = r0.E()
            int r1 = r1 - r2
            int r0 = r0.B()
        L14:
            int r1 = r1 - r0
            return r1
        L16:
            java.lang.Object r0 = r3.b
            nz r0 = (defpackage.nz) r0
            int r1 = r0.n
            int r2 = r0.C()
            int r1 = r1 - r2
            int r0 = r0.D()
            goto L14
    }

    @Override // defpackage.ai
    public final int m(android.view.View r3) {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.b
            nz r0 = (defpackage.nz) r0
            java.lang.Object r1 = r2.c
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r0.I(r3, r1)
            int r3 = r1.bottom
            return r3
        L13:
            java.lang.Object r0 = r2.b
            nz r0 = (defpackage.nz) r0
            java.lang.Object r1 = r2.c
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r0.I(r3, r1)
            int r3 = r1.right
            return r3
    }

    @Override // defpackage.ai
    public final int n(android.view.View r3) {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.b
            nz r0 = (defpackage.nz) r0
            java.lang.Object r1 = r2.c
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r0.I(r3, r1)
            int r3 = r1.top
            return r3
        L13:
            java.lang.Object r0 = r2.b
            nz r0 = (defpackage.nz) r0
            java.lang.Object r1 = r2.c
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r0.I(r3, r1)
            int r3 = r1.left
            return r3
    }

    @Override // defpackage.ai
    public final void o(int r2) {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.b
            nz r0 = (defpackage.nz) r0
            r0.N(r2)
            return
        Ld:
            java.lang.Object r0 = r1.b
            nz r0 = (defpackage.nz) r0
            r0.M(r2)
            return
    }
}
