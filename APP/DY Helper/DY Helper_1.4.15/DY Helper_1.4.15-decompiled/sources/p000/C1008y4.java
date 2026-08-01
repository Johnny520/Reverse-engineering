package p000;

/* JADX INFO: renamed from: y4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1008y4 extends p000.i91 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f12443;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f12444;

    public /* synthetic */ C1008y4(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f12443 = r1
            r0.f12444 = r2
            r0.<init>()
            return
    }

    @Override // p000.z92
    /* JADX INFO: renamed from: α */
    public final void mo38() {
            r3 = this;
            int r0 = r3.f12443
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Object r3 = r3.f12444
            r2 = 0
            switch(r0) {
                case 0: goto L59;
                case 1: goto L4a;
                default: goto La;
            }
        La:
            n5 r3 = (p000.C0574n5) r3
            java.lang.Object r3 = r3.f7388
            androidx.appcompat.app.β r3 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r3
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f374
            r1 = 8
            r0.setVisibility(r1)
            android.widget.PopupWindow r0 = r3.f375
            if (r0 == 0) goto L1f
            r0.dismiss()
            goto L36
        L1f:
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f374
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L36
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f374
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            java.util.WeakHashMap r1 = p000.b92.f1572
            p000.s82.m5376(r0)
        L36:
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f374
            r0.m246()
            x92 r0 = r3.f377
            r0.m6543(r2)
            r3.f377 = r2
            android.view.ViewGroup r3 = r3.f379
            java.util.WeakHashMap r0 = p000.b92.f1572
            p000.s82.m5376(r3)
            return
        L4a:
            androidx.appcompat.app.β r3 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r3
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f374
            r0.setAlpha(r1)
            x92 r0 = r3.f377
            r0.m6543(r2)
            r3.f377 = r2
            return
        L59:
            w4 r3 = (p000.RunnableC0934w4) r3
            androidx.appcompat.app.β r3 = r3.f11560
            androidx.appcompat.widget.ActionBarContextView r0 = r3.f374
            r0.setAlpha(r1)
            x92 r0 = r3.f377
            r0.m6543(r2)
            r3.f377 = r2
            return
    }

    @Override // p000.i91, p000.z92
    /* JADX INFO: renamed from: γ */
    public void mo40() {
            r2 = this;
            int r0 = r2.f12443
            r1 = 0
            java.lang.Object r2 = r2.f12444
            switch(r0) {
                case 0: goto L28;
                case 1: goto L9;
                default: goto L8;
            }
        L8:
            return
        L9:
            androidx.appcompat.app.β r2 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r2
            androidx.appcompat.widget.ActionBarContextView r0 = r2.f374
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r2.f374
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L27
            androidx.appcompat.widget.ActionBarContextView r2 = r2.f374
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            java.util.WeakHashMap r0 = p000.b92.f1572
            p000.s82.m5376(r2)
        L27:
            return
        L28:
            w4 r2 = (p000.RunnableC0934w4) r2
            androidx.appcompat.app.β r2 = r2.f11560
            androidx.appcompat.widget.ActionBarContextView r2 = r2.f374
            r2.setVisibility(r1)
            return
    }
}
