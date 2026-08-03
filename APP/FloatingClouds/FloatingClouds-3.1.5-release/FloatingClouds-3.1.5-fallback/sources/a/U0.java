package a;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends a.C0282n9 {
    public final /* synthetic */ a.Q0 b;

    public U0(a.Q0 r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    @Override // a.Lg
    public final void a() {
            r3 = this;
            a.Q0 r0 = r3.b
            androidx.appcompat.widget.ActionBarContextView r1 = r0.v
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
            a.Jg r1 = r0.y
            r2 = 0
            r1.d(r2)
            r0.y = r2
            return
    }

    @Override // a.C0282n9, a.Lg
    public final void c() {
            r3 = this;
            a.Q0 r0 = r3.b
            androidx.appcompat.widget.ActionBarContextView r1 = r0.v
            r2 = 0
            r1.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.v
            android.view.ViewParent r1 = r1.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L1f
            androidx.appcompat.widget.ActionBarContextView r0 = r0.v
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            a.C0414ug.c.c(r0)
        L1f:
            return
    }
}
