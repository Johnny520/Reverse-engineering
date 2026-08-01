package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h3 extends defpackage.ct {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ h3(int r1, java.lang.Object r2) {
            r0 = this;
            r0.d = r1
            r0.e = r2
            r0.<init>()
            return
    }

    @Override // defpackage.ya0
    public final void a() {
            r4 = this;
            int r0 = r4.d
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Object r2 = r4.e
            r3 = 0
            switch(r0) {
                case 0: goto L59;
                case 1: goto L4a;
                default: goto La;
            }
        La:
            d4 r2 = (defpackage.d4) r2
            java.lang.Object r0 = r2.c
            r3 r0 = (defpackage.r3) r0
            androidx.appcompat.widget.ActionBarContextView r1 = r0.v
            r2 = 8
            r1.setVisibility(r2)
            android.widget.PopupWindow r1 = r0.w
            if (r1 == 0) goto L1f
            r1.dismiss()
            goto L36
        L1f:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.v
            android.view.ViewParent r1 = r1.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L36
            androidx.appcompat.widget.ActionBarContextView r1 = r0.v
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            java.util.WeakHashMap r2 = defpackage.ja0.a
            defpackage.w90.c(r1)
        L36:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.v
            r1.e()
            wa0 r1 = r0.y
            r1.d(r3)
            r0.y = r3
            android.view.ViewGroup r0 = r0.A
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.w90.c(r0)
            return
        L4a:
            r3 r2 = (defpackage.r3) r2
            androidx.appcompat.widget.ActionBarContextView r0 = r2.v
            r0.setAlpha(r1)
            wa0 r0 = r2.y
            r0.d(r3)
            r2.y = r3
            return
        L59:
            f3 r2 = (defpackage.f3) r2
            r3 r0 = r2.b
            androidx.appcompat.widget.ActionBarContextView r2 = r0.v
            r2.setAlpha(r1)
            wa0 r1 = r0.y
            r1.d(r3)
            r0.y = r3
            return
    }

    @Override // defpackage.ct, defpackage.ya0
    public void c() {
            r3 = this;
            int r0 = r3.d
            r1 = 0
            java.lang.Object r2 = r3.e
            switch(r0) {
                case 0: goto L28;
                case 1: goto L9;
                default: goto L8;
            }
        L8:
            return
        L9:
            r3 r2 = (defpackage.r3) r2
            androidx.appcompat.widget.ActionBarContextView r0 = r2.v
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r2.v
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L27
            androidx.appcompat.widget.ActionBarContextView r0 = r2.v
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.w90.c(r0)
        L27:
            return
        L28:
            f3 r2 = (defpackage.f3) r2
            r3 r0 = r2.b
            androidx.appcompat.widget.ActionBarContextView r0 = r0.v
            r0.setVisibility(r1)
            return
    }
}
