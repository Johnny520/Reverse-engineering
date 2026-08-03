package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class q extends androidx.recyclerview.widget.s {
    @Override // androidx.recyclerview.widget.s
    public final int b(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
            androidx.recyclerview.widget.RecyclerView$l r1 = r2.f1014a
            r1.getClass()
            int r1 = r3.getRight()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.right
            int r1 = r1 + r3
            int r3 = r0.rightMargin
            int r1 = r1 + r3
            return r1
    }

    @Override // androidx.recyclerview.widget.s
    public final int c(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
            androidx.recyclerview.widget.RecyclerView$l r1 = r2.f1014a
            r1.getClass()
            int r3 = androidx.recyclerview.widget.RecyclerView.l.A(r3)
            int r1 = r0.leftMargin
            int r3 = r3 + r1
            int r0 = r0.rightMargin
            int r3 = r3 + r0
            return r3
    }

    @Override // androidx.recyclerview.widget.s
    public final int d(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
            androidx.recyclerview.widget.RecyclerView$l r1 = r2.f1014a
            r1.getClass()
            int r3 = androidx.recyclerview.widget.RecyclerView.l.z(r3)
            int r1 = r0.topMargin
            int r3 = r3 + r1
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            return r3
    }

    @Override // androidx.recyclerview.widget.s
    public final int e(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r0 = (androidx.recyclerview.widget.RecyclerView.m) r0
            androidx.recyclerview.widget.RecyclerView$l r1 = r2.f1014a
            r1.getClass()
            int r1 = r3.getLeft()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.left
            int r1 = r1 - r3
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            return r1
    }

    @Override // androidx.recyclerview.widget.s
    public final int f() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.f1014a
            int r0 = r0.n
            return r0
    }

    @Override // androidx.recyclerview.widget.s
    public final int g() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.f1014a
            int r1 = r0.n
            int r0 = r0.F()
            int r1 = r1 - r0
            return r1
    }

    @Override // androidx.recyclerview.widget.s
    public final int h() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.f1014a
            int r0 = r0.F()
            return r0
    }

    @Override // androidx.recyclerview.widget.s
    public final int i() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.f1014a
            int r0 = r0.l
            return r0
    }

    @Override // androidx.recyclerview.widget.s
    public final int j() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.f1014a
            int r0 = r0.m
            return r0
    }

    @Override // androidx.recyclerview.widget.s
    public final int k() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.f1014a
            int r0 = r0.E()
            return r0
    }

    @Override // androidx.recyclerview.widget.s
    public final int l() {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r3.f1014a
            int r1 = r0.n
            int r2 = r0.E()
            int r1 = r1 - r2
            int r0 = r0.F()
            int r1 = r1 - r0
            return r1
    }

    @Override // androidx.recyclerview.widget.s
    public final int m(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.f1014a
            android.graphics.Rect r1 = r2.c
            r0.K(r3, r1)
            int r3 = r1.right
            return r3
    }

    @Override // androidx.recyclerview.widget.s
    public final int n(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r2.f1014a
            android.graphics.Rect r1 = r2.c
            r0.K(r3, r1)
            int r3 = r1.left
            return r3
    }

    @Override // androidx.recyclerview.widget.s
    public final void o(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r1.f1014a
            r0.O(r2)
            return
    }
}
